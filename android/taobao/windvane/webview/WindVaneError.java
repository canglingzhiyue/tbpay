package android.taobao.windvane.webview;

import tb.kge;

/* loaded from: classes2.dex */
public class WindVaneError extends Error {
    private static final long serialVersionUID = 8736004749630607428L;

    static {
        kge.a(923014500);
    }

    public WindVaneError() {
    }

    public WindVaneError(String str) {
        super(str);
    }

    public WindVaneError(String str, Throwable th) {
        super(str, th);
    }

    public WindVaneError(Throwable th) {
        super(th);
    }
}
