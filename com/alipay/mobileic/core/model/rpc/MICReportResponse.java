package com.alipay.mobileic.core.model.rpc;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public class MICReportResponse implements Serializable {
    public Map<String, String> config;
    public String errCode;
    public String errMsg;
    public boolean success = false;
}
