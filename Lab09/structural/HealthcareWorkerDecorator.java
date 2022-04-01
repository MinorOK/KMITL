package edu.parinya.softarchdesign.structural;

public class HealthcareWorkerDecorator extends HealthcareWorker{
    private HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker){
        super(worker.getName(), worker.getPrice());
        this.worker = worker;
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }

    @Override
    public void service() {
        worker.service();
    }
    
}
