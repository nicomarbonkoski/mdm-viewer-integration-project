package com.catolicasc;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class MdmViewerIntegrationApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(MdmViewerIntegrationApplication.class, args);
        System.out.println("Sistema inicializado com sucesso.");
    }
 
}



/*
String sql = "INSERT INTO cliente( cpf, senha, nome, inadimplente, tipoConsumidor) VALUES (?,?,?,?,?)";
int result = jdbcTemplate.update(sql, "99988877766", "senha", "Nome Sobrenome", 1, "VIP");

if (result > 0) {
	System.out.println("A new row has been inserted.");
}*/