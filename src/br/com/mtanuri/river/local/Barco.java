package br.com.mtanuri.river.local;

import br.com.mtanuri.river.item.Humano;
import br.com.mtanuri.river.item.Item;

public class Barco extends Local {

    public static final int MAXIMO_DE_ITENS_PERMITIDOS = 2;

    public Barco(Item... itens) throws Exception {
        this.addItem(itens);
        this.validar();
    }

    @Override
    public void validar() throws Exception {
        if (!this.hasAny(Humano.class)) {
            throw new HumanoParaConducaoNaoEncontradoException("Configuração do barco não é válida, nenhum humano foi encontrado para conduzi-lo");
        }
        if (this.getItens().size() > MAXIMO_DE_ITENS_PERMITIDOS) {
            throw new CapacidadeDoBarcoException("Quantidade máxima de itens permitida no barco foi excedida.");
        }
    }
}
