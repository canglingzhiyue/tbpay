package com.taobao.phenix.loader.file;

import tb.kge;

/* loaded from: classes7.dex */
public class UnSupportedSchemeException extends Exception {
    static {
        kge.a(515815928);
    }

    public UnSupportedSchemeException(int i) {
        super("SchemeType(" + i + ") cannot be supported now");
    }
}
