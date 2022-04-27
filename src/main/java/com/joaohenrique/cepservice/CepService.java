package com.joaohenrique.cepservice;

import com.joaohenrique.model.Endereco;

public interface CepService {
    Endereco buscaEndereco(String cep);
}
