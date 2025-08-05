package com.alipay.android.app.template;

/* loaded from: classes3.dex */
public interface FBResourceClient {

    /* loaded from: classes3.dex */
    public enum Type {
        STRING,
        DRAWABLE,
        MAIN_FRAME,
        INNER_FRAME
    }

    Object shouldInterceptResource(String str, Type type);
}
