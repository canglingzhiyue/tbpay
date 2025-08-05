package com.alipay.mobileic.core.model.rpc;

import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobileic.common.service.model.ToString;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class MICRpcRequest extends ToString implements Serializable {
    public String action;
    public String bizRequestData;
    public String data;
    public String envData;
    public String module;
    public String pbData;
    public String token;
    public String verifyId;
    public String version = CommonConstant.VI_SDK_VERSION;
    public boolean canNotUseRpcChannel = false;
}
