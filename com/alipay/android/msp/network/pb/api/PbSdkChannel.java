package com.alipay.android.msp.network.pb.api;

import android.content.Context;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.network.APNetSwitchUtil;
import com.alipay.android.msp.network.model.ReqData;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.network.pb.Pbv3SDKHttpRequest;
import com.alipay.android.msp.network.pb.Pbv3SDKRpcRequest;
import com.alipay.android.msp.plugin.IPbChannel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class PbSdkChannel implements IPbChannel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.IPbChannel
    public ResData<Map<String, String>> requestByPbv1(ReqData<Map<String, String>> reqData, RequestConfig requestConfig) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("75a71719", new Object[]{this, reqData, requestConfig});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.IPbChannel
    public ResData<Map<String, String>> requestByPbv2(ReqData<Map<String, String>> reqData, RequestConfig requestConfig) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("6dc3fd78", new Object[]{this, reqData, requestConfig});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.IPbChannel
    public ResData<Map<String, String>> requestByPbv3(ReqData<Map<String, String>> reqData, RequestConfig requestConfig) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("65e0e3d7", new Object[]{this, reqData, requestConfig});
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (context != null && APNetSwitchUtil.shouldIUseAPNetwork(context) && DrmKey.sRpcExCount < 3) {
            return new Pbv3SDKRpcRequest().requestData(reqData, requestConfig);
        }
        return new Pbv3SDKHttpRequest().requestData(reqData, requestConfig);
    }
}
