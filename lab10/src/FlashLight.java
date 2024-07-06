 public class FlashLight {
        Battery[] batteries;

        public FlashLight() {
            this.batteries = new Battery[0];
        }

        public FlashLight(Battery[] batteries) {
            this.batteries = batteries;
        }

        public double getTotalPower() {
            double totalPower = 0;
            for (Battery battery : batteries) {
                totalPower += battery.getPower();
            }
            return totalPower;
        }

        public double getTotalEnergy() {
            double totalEnergy = 0;
            for (Battery battery : batteries) {
                if (battery instanceof ToshibaBattery) {
                    ToshibaBattery tb = (ToshibaBattery) battery;
                    totalEnergy += tb.getEnergy() + tb.getExtraEnergy();
                } else if (battery instanceof DuracellBattery) {
                    DuracellBattery db = (DuracellBattery) battery;
                    totalEnergy += db.getEnergy();
                }
            }
            return totalEnergy;
        }

        public double getTotalLifeTime() {
            return getTotalEnergy() / getTotalPower();
        }

        // Getters and Setters
        public Battery[] getBatteries() { return batteries; }
        public void setBatteries(Battery[] batteries) { this.batteries = batteries; }

}
