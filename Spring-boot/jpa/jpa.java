---------------------
jpa					 |
---------------------
	# 参考
		https://ityouknow.gitbooks.io/spring-data-jpa-reference-documentation/content/
		https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#reference
	
	# Maven
		<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
	
	# 使用
		1,自定义接口继承:Repository

			public interface UserRepository extends JpaRepository<UserDTO,Integer> {}

		2,配置扫描Repository和Entity
			@EnableJpaRepositories(basePackages = {"io.springboot.jpa.repository"})
			@EntityScan(basePackages = {"io.springboot.jpa.dto"})

		4,Entit添加注解
			@Entity
			@Table(name = "user")
			@Id
			@Column

		5,在需要的地方注入
			@Autowired
			private UserRepository userRepository;
			
		
	# 核心的 Repository
		Repository
			|-CrudRepository
				|PagingAndSortingRepository
			|-QueryByExampleExecutor
					|-JpaRepository

