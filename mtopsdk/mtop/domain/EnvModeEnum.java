package mtopsdk.mtop.domain;

/* loaded from: classes.dex */
public enum EnvModeEnum {
    ONLINE(0),
    PREPARE(1),
    TEST(2),
    TEST_SANDBOX(3);
    
    private int envMode;

    EnvModeEnum(int i) {
        this.envMode = i;
    }

    public int getEnvMode() {
        return this.envMode;
    }
}
