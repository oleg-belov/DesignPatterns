/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.ipp.structuraldesignpatterns.bridge_facade;

import com.isa.ipp.structuraldesignpatterns.bridge.*;

/**
 *
 * @author Faust
 */
public class Windows extends Platform {

    @Override
    public void play() {
        System.out.println("com.isa.ipp.structuraldesignpatterns.bridge_facade.Windows.play()");
    }

}
