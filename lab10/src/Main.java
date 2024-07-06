public class Main {
    public static void main(String[] args) {
        ToshibaBattery tBattery1 = new ToshibaBattery(1.5, 0.2, 3000, 500);
        ToshibaBattery tBattery2 = new ToshibaBattery(1.5, 0.3, 3500, 400);
        ToshibaBattery tBattery3 = new ToshibaBattery(1.5, 0.25, 3200, 450);
        ToshibaBattery tBattery4 = new ToshibaBattery(1.5, 0.22, 3100, 480);
        ToshibaBattery tBattery5 = new ToshibaBattery(1.5, 0.27, 3300, 470);

        DuracellBattery dBattery1 = new DuracellBattery(1.5, 0.2, 3000, 1.4);
        DuracellBattery dBattery2 = new DuracellBattery(1.5, 0.3, 3500, 1.4);
        DuracellBattery dBattery3 = new DuracellBattery(1.5, 0.25, 3200, 1.4);
        DuracellBattery dBattery4 = new DuracellBattery(1.5, 0.22, 3100, 1.4);
        DuracellBattery dBattery5 = new DuracellBattery(1.5, 0.27, 3300, 1.4);

        FlashLight flashLight1 = new FlashLight(new Battery[]{tBattery1, dBattery1});
        FlashLight flashLight2 = new FlashLight(new Battery[]{tBattery2, dBattery2});
        FlashLight flashLight3 = new FlashLight(new Battery[]{tBattery3, dBattery3});
        FlashLight flashLight4 = new FlashLight(new Battery[]{tBattery4, dBattery4});
        FlashLight flashLight5 = new FlashLight(new Battery[]{tBattery5, dBattery5});

        FlashLight[] flashLights = {flashLight1, flashLight2, flashLight3, flashLight4, flashLight5};

        double maxLifeTime = 0;
        FlashLight maxLifeFlashLight = null;

        for (FlashLight flashLight : flashLights) {
            double lifeTime = flashLight.getTotalLifeTime();
            System.out.println("Flashlight lifetime: " + lifeTime + " seconds");
            if (lifeTime > maxLifeTime) {
                maxLifeTime = lifeTime;
                maxLifeFlashLight = flashLight;
            }
        }

        if (maxLifeFlashLight != null) {
            System.out.println("Flashlight with the maximum lifetime:");
            System.out.println("Total Power: " + maxLifeFlashLight.getTotalPower());
            System.out.println("Total Energy: " + maxLifeFlashLight.getTotalEnergy());
            System.out.println("Total Lifetime: " + maxLifeFlashLight.getTotalLifeTime() + " seconds");
        }
    }
}
