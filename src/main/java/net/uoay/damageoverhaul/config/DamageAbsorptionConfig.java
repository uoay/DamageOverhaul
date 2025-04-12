package net.uoay.damageoverhaul.config;

public class DamageAbsorptionConfig {
    public float slash = 0.0F;
    public float strike = 0.0F;
    public float thrust = 0.0F;

    // Do not remove this empty constructor. It is useful for cloth config.
    DamageAbsorptionConfig() {}

    DamageAbsorptionConfig(float slash, float strike, float thrust) {
        this.slash = slash;
        this.strike = strike;
        this.thrust = thrust;
    }
}
