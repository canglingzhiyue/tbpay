package com.taobao.zcachecorewrapper.model;

import java.io.Serializable;
import tb.kge;

@Deprecated
/* loaded from: classes9.dex */
public class Error implements Serializable {
    public int errCode;
    public String errMsg;

    static {
        kge.a(-1308617620);
        kge.a(1028243835);
    }

    public Error(com.taobao.zcache.Error error) {
        String message;
        if (error == null) {
            this.errCode = 0;
            message = null;
        } else {
            this.errCode = error.getCode();
            message = error.getMessage();
        }
        this.errMsg = message;
    }
}
