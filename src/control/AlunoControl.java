/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoControl {
    private ArrayList<Aluno> listaAl;

    public AlunoControl() {
        listaAl = new ArrayList<>();
    }
    
    public void cadastrar(String nome, int idade){
        Aluno al = new Aluno(nome, idade);
        listaAl.add(al);
    }
    
}
