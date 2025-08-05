package com.taobao.phenix.loader.network;

import tb.kge;

/* loaded from: classes7.dex */
public class IncompleteResponseException extends NetworkResponseException {
    static {
        kge.a(499988191);
    }

    public IncompleteResponseException() {
        super(200, "Incomplete Response");
    }
}
