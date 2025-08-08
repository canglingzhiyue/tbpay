package com.taobao.browser.jsbridge;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.taobao.util.g;
import android.taobao.windvane.config.a;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.calendar.aidl.jsbridge.calendarJsApi;
import com.taobao.statistic.CT;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class TBUrlCacheAndDevice extends calendarJsApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TOAST_MSG_KEY = "serviceMsg";
    private final String SUB_SEVICE_KEY = "serviceCardId";
    private final String SUB_SEVICE_ERROR_MSG = "serviceCardSubMsg";
    private final String SUB_SEVICE_SHOW_MSG = "isShowMsgAfterSubService";

    static {
        kge.a(483634921);
    }

    public static /* synthetic */ Object ipc$super(TBUrlCacheAndDevice tBUrlCacheAndDevice, String str, Object... objArr) {
        if (str.hashCode() == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.calendar.aidl.jsbridge.calendarJsApi, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        BrowserUtil.a("TBUrlCacheAndDevice", BrowserUtil.f16842a, str, this.mWebView != null ? this.mWebView.getUrl() : null, null);
        if ("clean".equals(str)) {
            clean(wVCallBackContext, str2);
        } else if ("getInfo".equals(str)) {
            getInfo(wVCallBackContext, str2);
        } else if ("location".equals(str)) {
            location(wVCallBackContext, str2);
        } else if ("getUtdid".equals(str)) {
            getUtdid(wVCallBackContext, str2);
        } else if ("showServiceMsg".equals(str)) {
            showServiceMsg(wVCallBackContext, str2);
        } else if ("getModelInfo".equals(str)) {
            getModelInfo(wVCallBackContext, str2);
        } else {
            return super.execute(str, str2, wVCallBackContext);
        }
        return true;
    }

    @WindVaneInterface
    public final void clean(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf248e17", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (this.mWebView != null) {
            this.mWebView.clearCache();
        }
        wVCallBackContext.success();
    }

    @WindVaneInterface
    public final void getInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34eab732", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            String ttid = TaoHelper.getTTID();
            String c = g.c(this.mContext);
            HashMap hashMap = new HashMap();
            hashMap.put("deviceID", a.a().e());
            hashMap.put("ttid", ttid);
            hashMap.put("network", c);
            hashMap.put("sdkversion", "" + Build.VERSION.SDK_INT);
            wVCallBackContext.success(JSON.toJSONString(hashMap));
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void location(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f14083", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Bundle bundle = new Bundle();
        if (StringUtils.isEmpty(str)) {
            Nav.from(this.mContext).toUri("http://m.taobao.com/index.htm");
            wVCallBackContext.success();
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        if (StringUtils.isEmpty(parseObject.getString("data"))) {
            bundle.putString("serviceCardSubMsg", parseObject.getString("serviceMsg"));
        } else {
            bundle.putString("serviceCardId", parseObject.getString("serviceCardId"));
            bundle.putString("isShowMsgAfterSubService", "Y");
        }
        Nav.from(this.mContext).withExtras(bundle).toUri("http://m.taobao.com/index.htm");
        wVCallBackContext.success();
    }

    @WindVaneInterface
    public void getUtdid(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199ac658", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String utdid = UTDevice.getUtdid(this.mContext);
        HashMap hashMap = new HashMap();
        hashMap.put("utdid", utdid);
        wVCallBackContext.success(JSON.toJSONString(hashMap));
    }

    @WindVaneInterface
    public void showServiceMsg(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a6bf37", new Object[]{this, wVCallBackContext, str});
        } else if (!StringUtils.isEmpty(str)) {
            Constants.showToast((Context) null, JSONObject.parseObject(str).getString("serviceMsg"));
            wVCallBackContext.success();
        } else {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    public void getModelInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d44ea8f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("model", Build.MODEL);
        wVCallBackContext.success(JSON.toJSONString(hashMap));
    }

    private void doTrack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b5ae11", new Object[]{this, str});
        } else if (str == null) {
        } else {
            TrackBuried.bdid = TaoHelper.getTTID();
            HashMap hashMap = new HashMap();
            hashMap.put("object_type", "url");
            hashMap.put("action", "alarm_set");
            hashMap.put("object_id", str);
            TrackBuried.effectCtrlClick(CT.Button, "Alarm", hashMap);
        }
    }
}
