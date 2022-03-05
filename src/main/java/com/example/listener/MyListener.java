package com.example.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent e) {
        System.out.println("Request destruida");
    }

    @Override
    public void requestInitialized(ServletRequestEvent e) {
       // toda vez que uma request for iniciada será inserido um atributo nela
        // assim todo o JSP ou servletque tiverem acesso a esta request poderão acessar este atributo
        ServletRequest request = e.getServletRequest(); // request sendo criada
        // inserindo atributo na request
        request.setAttribute("user", "1234");
        System.out.println("Request inicializada");
    }
}
