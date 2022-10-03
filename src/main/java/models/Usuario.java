/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author xande
 */
public abstract class Usuario {
    public String email;
    public String senha;
    
    public abstract void login();
}
