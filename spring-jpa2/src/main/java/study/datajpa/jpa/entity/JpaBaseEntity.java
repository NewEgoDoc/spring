package study.datajpa.jpa.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@MappedSuperclass // 속성들만 상속받게함
public class JpaBaseEntity {

	@Column(updatable = false)
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;

	@PrePersist
	public void prePersist() {
		LocalDateTime now = LocalDateTime.now();
		createdDate = now;
		updatedDate = now;
	}

	@PreUpdate
	public void preUpdate() {
		updatedDate = LocalDateTime.now();
	}
}
