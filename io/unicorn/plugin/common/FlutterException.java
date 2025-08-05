package io.unicorn.plugin.common;

import tb.kge;

/* loaded from: classes9.dex */
public class FlutterException extends RuntimeException {
    private static final String TAG = "FlutterException#";
    public final String code;
    public final Object details;

    static {
        kge.a(2041435611);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterException(String str, String str2, Object obj) {
        super(str2);
        this.code = str;
        this.details = obj;
    }
}
