package tcp.microservices.atomikos.service1.service;

import java.util.Optional;

public interface IService1 {  
	String doSomething(Optional<String> param) throws Exception;  
} 