package br.com.E1;

public class DistribuicaoA extends Projeto {
  private String descAlimento;
  private float qtde;

  public DistribuicaoA(String nome, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
    super(nome, descricao, endereco, dataInicio, dataFim);
    this.descAlimento = descAlimento;
    this.qtde = qtde;
  }

  public String getDescAlimento() {
    return descAlimento;
  }

  public void setDescAlimento(String descAlimento) {
    this.descAlimento = descAlimento;
  }

  public float getQtde() {
    return qtde;
  }

  public void setQtde(float qtde) {
    this.qtde = qtde;
  }

  @Override
  public boolean validaProjeto() {
    if (getDataFim() == "") {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String imprimeProjeto() {
    return "Projeto: " + getNome() + "\nDescrição: " + getDescricao() + "\nData de Inicio: " + getDataInicio() + "\nData Fim: " + getDataFim() + "\nDescrição do Alimento: " + this.descAlimento + "\nQuantidade: " + this.qtde;
  }

}

