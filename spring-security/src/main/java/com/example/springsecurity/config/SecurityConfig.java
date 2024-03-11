package com.example.springsecurity.config;

import org.springframework.boot.autoconfigure.security.reactive.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig {//즉, Lambda DSL 방식을 통한 설정으로 전체적인 코드를 바꿨다

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http
			.csrf(Customizer.withDefaults())
			.formLogin(Customizer.withDefaults())
			.authorizeHttpRequests(authorizeRequest ->
				authorizeRequest
					.requestMatchers(
						AntPathRequestMatcher.antMatcher("/auth/**")
					).authenticated()
					.requestMatchers(
						AntPathRequestMatcher.antMatcher("/h2-console/**")
					).permitAll()
			)
			.headers(
				headersConfigurer ->
					headersConfigurer
						.frameOptions(
							HeadersConfigurer.FrameOptionsConfig::sameOrigin
						)
				//위처럼 설정을 해주시면 우선은 문제없이 h2 를 접근할 수 있지만,
				// 특정 리소스에 대한 접근권한 설정이 이루어지면 추가 설정이 필요
			);

		return http.build();
	}

	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
		// 정적 리소스 spring security 대상에서 제외
		return (web) ->
			web
				.ignoring()
				.requestMatchers(
					String.valueOf(PathRequest.toStaticResources().atCommonLocations())
				);
	}
}
