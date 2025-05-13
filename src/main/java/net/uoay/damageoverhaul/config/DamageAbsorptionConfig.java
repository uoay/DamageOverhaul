package net.uoay.damageoverhaul.config;

public class DamageAbsorptionConfig {
    public float slash = 0.0F;
    public float strike = 0.0F;
    public float thrust = 0.0F;
    public float fire = 0.0F;
    public float lightning = 0.0F;

    // Do not remove this empty constructor. It is useful for cloth config.
    DamageAbsorptionConfig() {}

    DamageAbsorptionConfig(float slash, float strike, float thrust, float fire, float lightning) {
        this.slash = slash;
        this.strike = strike;
        this.thrust = thrust;
        this.fire = fire;
        this.lightning = lightning;
    }
}
