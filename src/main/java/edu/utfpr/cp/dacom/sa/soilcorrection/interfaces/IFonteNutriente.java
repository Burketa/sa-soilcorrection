package edu.utfpr.cp.dacom.sa.soilcorrection.interfaces;

import edu.utfpr.cp.dacom.sa.soilcorrection.NutrienteAdicional;

import java.util.Set;

public interface IFonteNutriente {
    double getTeorFonte();

    Set<NutrienteAdicional> getNutrientesAdicionais();
}
