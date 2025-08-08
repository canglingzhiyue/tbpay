package com.alipay.android.msp.configservice;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.plugin.engine.IBizEngine;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public class ConfigFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f4476a;

    public ConfigFetcher(Context context) {
        this.f4476a = context;
    }

    public JSONObject buildParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e06e8c45", new Object[]{this, str});
        }
        JSONObject rpcParams = RPCParams.getRpcParams(this.f4476a);
        if (!StringUtils.isEmpty(str)) {
            rpcParams.put("lastResponseTime", (Object) str);
        } else {
            try {
                rpcParams.remove("lastResponseTime");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return rpcParams;
    }

    public JSONObject fetch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5635d8eb", new Object[]{this, str});
        }
        JSONObject buildParams = buildParams(str);
        IBizEngine mspUtils = PhoneCashierMspEngine.getMspUtils();
        return mspUtils.executeRpc(false, "alipay.client.switches.all.get.outside", riy.ARRAY_START_STR + buildParams.toString() + riy.ARRAY_END_STR, -1, null);
    }
}
