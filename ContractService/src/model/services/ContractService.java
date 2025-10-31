package model.services;
import model.entities.Contract;

public class ContractService {
    private Contract contract;
    private Integer months;

    public ContractService() {
    }

    public ContractService(Contract contract, Integer months) {
        this.contract = contract;
        this.months = months;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }
}
