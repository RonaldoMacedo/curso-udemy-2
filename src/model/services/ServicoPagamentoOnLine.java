package model.services;

public interface ServicoPagamentoOnLine {
	
	double taxaPagamento(double quantia);
	double juro(double quantia, int meses);

}
