package com.alipay.android.msp.plugin;

import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IPbChannel {
    ResData<Map<String, String>> requestByPbv1(ReqData<Map<String, String>> reqData, RequestConfig requestConfig) throws Exception;

    ResData<Map<String, String>> requestByPbv2(ReqData<Map<String, String>> reqData, RequestConfig requestConfig) throws Exception;

    ResData<Map<String, String>> requestByPbv3(ReqData<Map<String, String>> reqData, RequestConfig requestConfig) throws Exception;
}
