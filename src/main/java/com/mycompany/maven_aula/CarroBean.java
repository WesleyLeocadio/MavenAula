/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven_aula;

import br.com.primeiro_projeto.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Aluno
 */

@ManagedBean
@SessionScoped
public class CarroBean {
    private Carro carro =  new Carro();
    private List<Carro> carros =   new ArrayList<Carro>();

    
    public void adicionar(){
        carros.add(carro);
        carro=new Carro();
        
    
    }
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
    
    
}
