package com.alipay.mobileic.core.model.rpc;

import com.alipay.mobileic.common.service.model.MICRpcResult;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public class MICRpcResponse extends MICRpcResult implements Serializable {
    public String bizResponseData;
    public String channelError;
    public Map<String, String> config;
    public String data;
    public String envType;
    public int expireTime;
    public boolean finish;
    public String finishCode;
    public String finishMessage;
    public String finishParams;
    public String nextStep;
    public String pbData;
    public String token;
    public String useBird;
    public String verifyCode;
    public String verifyId;
    public String verifyMessage;
    public boolean verifySuccess;
}
