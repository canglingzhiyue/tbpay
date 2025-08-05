package com.taobao.mtop.api;

import java.io.Serializable;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ApiResponse implements Serializable {
    public String actionText;
    public String actionUrl;
    public String btnColor;
    public boolean btnDisable;
    public String btnText;
    public String errorMessage;
    public boolean isSuccess;
    public Map<String, String> params;

    static {
        kge.a(-1382706094);
        kge.a(1028243835);
    }
}
