/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lohran
 */
public class Aluno {
	private String matricula, nome, telefone, CPF;
	private String idade;
	private Date dataNascimento;
	static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
	private String str;
        
	public void setNome(String nome){
	 this.nome = nome;
	}
	public String getNome(){
	 return this.nome;
	}
	    
	public void setIdade(String idade){
	  this.idade = idade;
	}
	public String getIdade(){
	  return this.idade;
	}	
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCPF() {
		return this.CPF;
	}
	
	public void setData(String s) throws ParseException{
        this.dataNascimento = formato.parse(s);
        }
        
        public Date getData(){
        return this.dataNascimento;
        }
	
	public void setString(String str) {
		this.str = str;
	}
	public String getString() {
		return this.str;
	}
	
}
