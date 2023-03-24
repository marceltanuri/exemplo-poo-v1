package br.com.mtanuri.river.item;

import br.com.mtanuri.river.local.Local;

import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;

public class Animal extends Item {

    private Collection<ItemDeAlimentacao> itensDeAlimentacao;

    public Animal(String nome, Collection<ItemDeAlimentacao> itensDeAlimentacao) {
        super(nome);
        this.itensDeAlimentacao = itensDeAlimentacao;
    }

    public void tentaComer(Local local) throws AnimalSemSupervisaoException {
        if (!local.hasAny(Humano.class)) {

            for (ItemDeAlimentacao itemDeAlimentacao : itensDeAlimentacao) {
                boolean localContemItensDeAlimentacaoDesteAnimal = local.hasAny(item -> itemDeAlimentacao.equals(item));
                if (localContemItensDeAlimentacaoDesteAnimal) {
                    throw new AnimalSemSupervisaoException(
                            String.format("Local '%s' sem supervisão humana permitiu o " +
                                            "animal %s comer o(a) %s",
                                    local.getClass().getSimpleName() + ":" + local.getNome(),
                                    this.getNome(),
                                    itemDeAlimentacao.getType().getSimpleName() + ":" + itemDeAlimentacao.getNome()
                            ));
                }
            }

        }

    }

}
