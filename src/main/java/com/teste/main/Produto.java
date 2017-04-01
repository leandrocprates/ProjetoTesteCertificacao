/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

import lombok.Data;

/**
 *
 * @author lprates
 */


@Data
public class Produto {
    int idProduto;
    String nomeProduto;

    public Produto(int idProduto, String nomeProduto) {
        super();
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
    }

    @Override
    public int hashCode() {
        //deve ser o mesmo resultado para um mesmo objeto, não pode ser aleatório
        return this.idProduto;
    }

    @Override
    public boolean equals(Object obj) {
        //se nao forem objetos da mesma classe sao objetos diferentes
        if(!(obj instanceof Produto)) return false; 

        //se forem o mesmo objeto, retorna true
        if(obj == this) return true;

        // aqui o cast é seguro por causa do teste feito acima
        Produto produto = (Produto) obj; 

        //aqui você compara a seu gosto, o ideal é comparar atributo por atributo
        return this.idProduto == produto.getIdProduto() &&
                this.nomeProduto.equals(produto.getNomeProduto());
    }   
}