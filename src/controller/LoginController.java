/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Admin;
import view.Login;

/**
 *
 * @author A
 */
public class LoginController {
   private Login loginView;

    public LoginController(Login loginView) {
        this.loginView = loginView;
        initView();
    }

    private void initView() {
        loginView.setVisible(true);
    }
}
