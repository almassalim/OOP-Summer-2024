 public class DuracellBattery extends Battery {
        double voltage;
        double currency;
        double energy;
        double internalVoltage;

        public DuracellBattery(double voltage, double currency, double energy, double internalVoltage) {
            this.voltage = voltage;
            this.currency = currency;
            this.energy = energy;
            this.internalVoltage = internalVoltage;
        }

        @Override
        public double getPower() {
            return voltage * currency;
        }

        @Override
        public double getLifeTime() {
            return energy / getPower();
        }
        public double getVoltage() { return voltage; }
        public void setVoltage(double voltage) { this.voltage = voltage; }
        public double getCurrency() { return currency; }
        public void setCurrency(double currency) { this.currency = currency; }
        public double getEnergy() { return energy; }
        public void setEnergy(double energy) { this.energy = energy; }
        public double getInternalVoltage() { return internalVoltage; }
        public void setInternalVoltage(double internalVoltage) { this.internalVoltage = internalVoltage; }

}
