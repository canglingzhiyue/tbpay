package com.taobao.tao.recommend3;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import tb.kge;
import tb.ktt;
import tb.lap;
import tb.ldf;
import tb.noa;
import tb.opr;
import tb.orc;
import tb.oth;

/* loaded from: classes8.dex */
public class TradeInfoFlowWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONTAINER_ID = "containerID";
    private static final String GET_FEEDS_PARAMS = "getFeedsParams";
    private static final String GET_FEEDS_STICK_STATUS = "getFeedsStickStatus";
    private static final String IS_AFTER_BUY_STICK_END = "isAfterBuyStickEnd";
    private static final String PRE_TRIGGER_INFO_FLOW_REQUEST = "preTriggerInfoflowRequest";
    private static final String TAG = "TradeInfoflowWVPlugin";
    private com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess.a mPrefetchReceiver;

    static {
        kge.a(-1243008070);
    }

    public static /* synthetic */ Object ipc$super(TradeInfoFlowWVPlugin tradeInfoFlowWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (PRE_TRIGGER_INFO_FLOW_REQUEST.equals(str)) {
            preTriggerInfoflowRequest(str2, wVCallBackContext);
        }
        if (GET_FEEDS_STICK_STATUS.equals(str)) {
            feedsStickStatusCallBack(str2, wVCallBackContext);
        }
        if (GET_FEEDS_PARAMS.equals(str)) {
            getFeedsParams(str2, wVCallBackContext);
        }
        return true;
    }

    private void feedsStickStatusCallBack(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db98320", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception unused) {
            lap.a("Bridge", "FeedsStickStatusCallBack", "params parse exception");
            wVCallBackContext.error();
        }
        if (jSONObject == null) {
            lap.a("Bridge", "FeedsStickStatusCallBack", "popParams == null");
            wVCallBackContext.error();
            return;
        }
        rVar.a(IS_AFTER_BUY_STICK_END, Boolean.valueOf(oth.NOT_REACH_TOP.equals(oth.a(jSONObject.getString(CONTAINER_ID)))));
        wVCallBackContext.success(rVar);
    }

    private void preTriggerInfoflowRequest(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914d4f8c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        if (this.mPrefetchReceiver == null) {
            this.mPrefetchReceiver = new com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess.a();
        }
        String pageUrl = getPageUrl(str);
        opr.b("newbuy");
        this.mPrefetchReceiver.a(pageUrl);
        wVCallBackContext.success(rVar);
    }

    private String getPageUrl(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2107aac5", new Object[]{this, str});
        }
        try {
            jSONObject = JSONObject.parseObject(str);
        } catch (Exception unused) {
            ldf.d(TAG, "解析参数出现异常");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("paySuccessURL");
    }

    private void getFeedsParams(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad51e853", new Object[]{this, str, wVCallBackContext});
            return;
        }
        TLog.logd("tb_homepage", TAG, "RecommendJSUtil getFeedsParams， params = " + str);
        r rVar = new r();
        TBLocationDTO b = com.taobao.tao.homepage.a.a() ? TBLocationClient.b() : null;
        String str2 = b != null ? b.provinceCode : "";
        String a2 = orc.a();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        ktt.a(jSONObject);
        if (jSONObject.containsKey("tb_homepage_clientCache_lbs")) {
            jSONObject2 = jSONObject.getJSONObject("tb_homepage_clientCache_lbs");
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put(noa.KEY_GLOBAL_LBS, a2);
            jSONObject3.put("provinceCode", str2);
            jSONObject3.put("tb_homepage_clientCache_lbs", jSONObject2.toJSONString());
        } catch (JSONException e) {
            TLog.loge("tb_homepage", TAG, "json parser failed" + e.toString());
        }
        rVar.a("data", jSONObject3);
        wVCallBackContext.success(rVar);
    }
}
