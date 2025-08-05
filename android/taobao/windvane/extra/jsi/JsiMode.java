package android.taobao.windvane.extra.jsi;

/* loaded from: classes2.dex */
public enum JsiMode {
    V8(true, false),
    QJS(false, true),
    V8_QJS(true, true);
    
    private final boolean enableQjs;
    private final boolean enableV8;

    JsiMode(boolean z, boolean z2) {
        this.enableV8 = z;
        this.enableQjs = z2;
    }

    public boolean isQjsEnable() {
        return this.enableQjs;
    }

    public boolean isV8Enable() {
        return this.enableV8;
    }
}
