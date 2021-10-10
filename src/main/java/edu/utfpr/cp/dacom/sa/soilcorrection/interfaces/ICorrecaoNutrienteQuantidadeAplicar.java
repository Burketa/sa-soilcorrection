package edu.utfpr.cp.dacom.sa.soilcorrection.interfaces;

public interface ICorrecaoNutrienteQuantidadeAplicar<T extends IFonteNutriente> {
     default double calculaQuantidadeAplicar(
            double necessidade,
            T fonteNutriente) {

        if (necessidade <= 0) {
            throw new IllegalArgumentException();
        }

        return necessidade / fonteNutriente.getTeorFonte();
    }
}
