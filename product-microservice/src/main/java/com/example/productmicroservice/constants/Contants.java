package com.example.productmicroservice.constants;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application-${spring.profiles.active}.properties")
@Getter
@Setter
//cuando hacemos una llamada a actuetor refres  actualiza todo con @value
//visitamos el siguiente enpoint de tipo post para actualizar las properties
//localhost:49302/actuator/refresh
//si lo hacemos con un bus es la siguiente url localhost:65288/actuator/busrefresh
@RefreshScope
public class Contants {
    @Value("${product.property}")
    private String propertirRemota;
}
