package cn.xuqplus.sbcconfigserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//!!!需要改的地方
@EnableConfigServer
@SpringBootApplication
public class SbcConfigServerDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SbcConfigServerDemoApplication.class, args);
  }
}
