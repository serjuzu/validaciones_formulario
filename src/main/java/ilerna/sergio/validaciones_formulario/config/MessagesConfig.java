package ilerna.sergio.validaciones_formulario.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Autor:sjulvez
 * Fecha:30/06/2023
 */

@Configuration
public class MessagesConfig {



    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages"); // Nombre base del archivo properties sin extensión
        messageSource.setDefaultEncoding("UTF-8"); // Codificación del archivo properties
        return messageSource;
    }

    // Otros métodos de configuración...

}
