package android.taobao.util;

import tb.kge;

/* loaded from: classes2.dex */
public class CalledFromWrongThreadException extends RuntimeException {
    static {
        kge.a(-1120441749);
    }

    public CalledFromWrongThreadException() {
        super("Only the original thread that created a view hierarchy can touch its views.");
    }
}
