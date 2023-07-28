/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControleAlunos;

import Dados.Aluno;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Lohran
 */
public class ControleAlunos {
    
    

    private ArrayList<Aluno> a = new ArrayList<>();
    private String busca;
    private int novo, menor, velho, maior;
    
    public boolean salvar(Aluno al){
        if (al != null){
            a.add(al);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean salvarTer(Aluno al){
        if(al != null){
            a.add(0, null);
            a.add(1, null);
            a.add(2, al);
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public int quantidadeAlunos(){
        return a.size();
    }
    
    public void setBusca(String b){
        this.busca = b;
    }
    
    public String getBusca(){
        return this.busca;
    }
    
    
    public ArrayList<Aluno> retornarTodos (){
        return a;
    }
    
    public int maisNovo(){
       menor = Integer.parseInt(a.get(0).getIdade());
        
        for (int i = 0; i < a.size() && a.get(i) != null; i++){
            int idade = Integer.parseInt(a.get(i).getIdade());
            if (idade < menor){
                menor = idade;
                novo = i;
            }
        
        }
        
        return novo;
        
    }
    
    public int maisVelho(int inteiro){
       maior = Integer.parseInt(a.get(0).getIdade());
        for (int i = 0; i < a.size() && a.get(i) != null; i++){
            int idade = Integer.parseInt(a.get(i).getIdade());
            if (idade > maior){
                maior = idade;
                velho = i;
            }
        }
        
        return velho;
        
    }
    
    public boolean MatriculaD(String x, ControleAlunos ca){
        ArrayList<Aluno> aln = ca.retornarTodos();
        boolean c = false;
        int pos = (aln.size() - 1);
        
        for(int i = pos; c != true && aln.get(i) != null && i > 0; i--){
            c = x.contains(aln.get(i).getMatricula());
        }
        
        if(c == false){
            return false;
        }
        else{
            return true;
        }
    }
}
