package top.sweetheart

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@MapperScan(value = "top.sweetheart.dao")
class SpringBootKotlinMybatisLoginApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootKotlinMybatisLoginApplication::class.java, *args)
}
