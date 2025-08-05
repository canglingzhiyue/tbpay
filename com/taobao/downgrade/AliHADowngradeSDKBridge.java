package com.taobao.downgrade;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.json.JSONObject;
import tb.kkr;

/* loaded from: classes7.dex */
public class AliHADowngradeSDKBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_ID = "BizID";
    private static final String GET_DOWNGRADE_INFO = "getDowngradeInfo";
    private static final String IS_TEST = "IsTest";
    public static final String JS_BRIDGE_SDK_NAME = "AliHADowngradeSDKBridge";

    public static /* synthetic */ Object ipc$super(AliHADowngradeSDKBridge aliHADowngradeSDKBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!GET_DOWNGRADE_INFO.equals(str)) {
            return false;
        }
        return getDowngradeInfo(str2, wVCallBackContext);
    }

    private boolean getDowngradeInfo(String str, WVCallBackContext wVCallBackContext) {
        Map<String, String> traceMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("324d1a1f", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        r rVar = new r();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(BIZ_ID);
            Downgrade.isTest = jSONObject.optBoolean(IS_TEST);
            DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy(string);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(kkr.TACTICS_FUNCTION, downgradeStrategy.getTacticsFunction());
            jSONObject2.put(kkr.TACTICS_PERFORMANCE, downgradeStrategy.getTacticsPerformance());
            com.alibaba.fastjson.JSONObject param = downgradeStrategy.getParam();
            if (param != null && param.size() > 0) {
                jSONObject2.put("param", new JSONObject(param));
            }
            rVar.a("result", jSONObject2);
            if (Downgrade.isTest && (traceMap = downgradeStrategy.getTraceMap()) != null) {
                rVar.a("extraInfo", new JSONObject(traceMap));
            }
            String str2 = "AliHADowngradeSDKBridge: " + rVar.d();
            f.a(System.currentTimeMillis() - currentTimeMillis);
            wVCallBackContext.success(rVar);
            return true;
        } catch (Throwable th) {
            rVar.a("errMsg", th.getMessage());
            wVCallBackContext.error(rVar);
            return false;
        }
    }
}
