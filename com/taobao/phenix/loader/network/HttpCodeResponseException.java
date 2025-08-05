package com.taobao.phenix.loader.network;

import tb.kge;

/* loaded from: classes7.dex */
public class HttpCodeResponseException extends NetworkResponseException {
    static {
        kge.a(1848026696);
    }

    public HttpCodeResponseException(int i) {
        super(i, "Failed Http Code");
    }
}
