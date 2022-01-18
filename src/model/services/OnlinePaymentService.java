package model.services;

public interface OnlinePaymentService {

	double paymentFee(Double Amount);
	double interest(double amount, int months);

}
