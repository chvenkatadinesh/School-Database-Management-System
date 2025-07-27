package pro.schoolDatabaseManagementSystem.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .authorizeHttpRequests(
//                        authorizationManagerRequestMatcherRegistry -> authorizationManagerRequestMatcherRegistry
//                                .requestMatchers(WHITELIST_URLS)
//                                .permitAll()
//                                .anyRequest()
//                                .authenticated())
//                .httpBasic(Customizer.withDefaults())
//                .exceptionHandling(httpSecurityExceptionHandlingConfigurer ->
//                        httpSecurityExceptionHandlingConfigurer.authenticationEntryPoint(authenticationEntryPoint))
//                .sessionManagement(httpSecuritySessionManagementConfigurer ->
//                        httpSecuritySessionManagementConfigurer.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//        httpSecurity.csrf(AbstractHttpConfigurer::disable);
//        httpSecurity.addFilterBefore(requestFilter, UsernamePasswordAuthenticationFilter.class);
//
//        return httpSecurity.build();
//    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(customizer -> customizer.disable());

        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());

//        http.formLogin(Customizer.withDefaults());// this is used to get (or) see the output from the browser

        http.httpBasic(Customizer.withDefaults());//this is used to get (or) see the output from the PostMan

        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//
//
//
//
//
////        Customizer<CsrfConfigurer<HttpSecurity>> csrfConf= new Customizer<CsrfConfigurer<HttpSecurity>>() {
////            @Override
////            public void customize(CsrfConfigurer<HttpSecurity> customizer) {
////                customizer.disable();
////            }
////        };
////        Customizer<AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry> amrr=new Customizer<AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry>() {
////            @Override
////            public void customize(AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry amrr) {
////
////            }
////        };
//
        return http.build();
    }
}
//    }


