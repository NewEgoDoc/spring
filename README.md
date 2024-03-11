# spring
spring projects

SPRING BOOT - 
SPRING MVC - 
JPA -

## JPA (Java Persistence API)
JPA는 자바 ORM(Object-Relational Mapping) 기술에 대한 표준 명세입니다. 데이터베이스와 자바 객체 간의 매핑을 쉽게 해주어, 개발자가 데이터 중심의 로직보다는 객체 중심의 로직에 집중할 수 있도록 돕습니다. JPA는 애플리케이션과 데이터베이스 사이의 상호작용을 추상화하여, 개발자가 직접 SQL을 작성하지 않아도 데이터베이스 연산을 수행할 수 있게 해줍니다.

Spring Data JPA
Spring Data JPA는 Spring 프레임워크의 일부로, JPA를 더 쉽게 사용할 수 있도록 하는 라이브러리입니다. 리포지토리 추상화를 통해 DAO(Data Access Object) 계층을 더욱 단순화하며, 적은 양의 코드로 데이터 액세스 계층을 빠르게 개발할 수 있도록 돕습니다. Spring Data JPA를 사용하면, 복잡한 데이터 접근 로직 없이 인터페이스를 통해 선언적으로 데이터 액세스 메소드를 정의할 수 있습니다.

Spring JPA는 자바 기반의 엔터프라이즈 애플리케이션 개발에서 널리 사용되며, 개발자가 더 효율적으로 데이터 중심의 애플리케이션을 구축할 수 있도록 지원합니다.


## SPRING CLOUD(Eureka) 
**분산 설정(Distributed Configuration)**: 분산 설정은 마이크로서비스에서 필요한 설정 정보를 중앙에서 관리하고, 변경사항을 런타임 중에 적용할 수 있는 기능입니다. 스프링 클라우드는 분산 환경에서의 설정 관리를 위한 Spring Cloud Config를 제공합니다.

**분산 추적(Distributed Tracing)**: 분산 추적은 분산 시스템에서의 트랜잭션 추적을 위한 기능입니다. 스프링 클라우드는 분산 추적을 위한 Spring Cloud Sleuth와 Zipkin을 제공합니다.

**로드 밸런싱(Load Balancing)**: 로드 밸런싱은 여러 개의 인스턴스에서 제공되는 서비스를 균등하게 분산시켜 주는 기능입니다. 스프링 클라우드는 Ribbon을 사용한 로드 밸런싱을 제공합니다.

**회로 차단기(Circuit Breaker)**: 회로 차단기는 마이크로서비스에서 일시적으로 문제가 발생하여 서비스가 다운될 때, 다운된 서비스에 대한 요청을 차단하고 다른 대체 서비스를 호출하는 기능입니다. 스프링 클라우드는 Netflix OSS의 Hystrix를 사용한 회로 차단기를 제공합니다.

위와 같은 기능을 제공하는 스프링 클라우드는 마이크로서비스 아키텍처에서 필수적 Spring Cloud는 분산 시스템을 구축하고 운영하기 위한 일련의 프레임워크와 라이브러리를 제공하는 오픈 소스 프로젝트
SPRING BATCH - 
SPRING JDBC -
