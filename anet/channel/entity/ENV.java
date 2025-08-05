package anet.channel.entity;

/* loaded from: classes.dex */
public enum ENV {
    ONLINE(0),
    PREPARE(1),
    TEST(2);
    
    private int envMode;

    ENV(int i) {
        this.envMode = i;
    }

    public static ENV valueOf(int i) {
        return i != 1 ? i != 2 ? ONLINE : TEST : PREPARE;
    }

    public int getEnvMode() {
        return this.envMode;
    }

    public void setEnvMode(int i) {
        this.envMode = i;
    }
}
