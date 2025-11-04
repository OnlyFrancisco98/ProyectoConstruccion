/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoConstruccion.sistema_ventas_login.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.proyectoConstruccion.sistema_ventas_login.model.ControladorSesionDeUsuario;
/**
 *
 * @author 52155
 */
@Controller  // ← ESTA ANOTACIÓN ES CRÍTICA
public class LoginController {
    private ControladorSesionDeUsuario controladorLogin;
    
    public LoginController() {
        this.controladorLogin = new ControladorSesionDeUsuario();
    }
    
    @GetMapping("/login")
    public String mostrarLogin(Model model, 
                             @RequestParam(required = false) String error) {
        if (error != null) {
            model.addAttribute("mensajeError", "Clave de acceso incorrecta");
        }
        return "login";
    }
    
    @PostMapping("/procesar-login")
    public String procesarLogin(@RequestParam("claveAccess") int claveAccess) {
        boolean exito = controladorLogin.iniciarSession(claveAccess);
        
        if (exito) {
            return "redirect:/dashboard?exito=true";
        } else {
            return "redirect:/login?error=true";
        }
    }
    
    @GetMapping("/dashboard")
    public String mostrarDashboard(Model model,
                                 @RequestParam(required = false) String exito) {
        if (exito != null) {
            model.addAttribute("mensajeExito", "¡Login exitoso!");
        }
        return "dashboard";
    }
    
    @GetMapping("/logout")
    public String cerrarSession() {
        controladorLogin.cerrarSession();
        return "redirect:/login?logout=true";
    }
}
