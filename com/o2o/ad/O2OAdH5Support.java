package com.o2o.ad;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.click.cpa.b;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import tb.dbf;
import tb.kge;

/* loaded from: classes4.dex */
public class O2OAdH5Support extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ID = "o2oactionid";
    private static final String CLICK_ID = "o2oclickid";
    private static final String MESSAGE = "message";

    static {
        kge.a(-563973106);
    }

    public static /* synthetic */ Object ipc$super(O2OAdH5Support o2OAdH5Support, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str4 = null;
        if ("commitO2OExpoEvent".equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            try {
                str3 = parseObject.getString("expo");
                try {
                    str4 = parseObject.getString("namespace");
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str3 = null;
            }
            if (!StringUtils.isEmpty(str3)) {
                commitO2OExpoEvent(str3, str4, wVCallBackContext);
            } else {
                TaoLog.Logd("AlimamaSdk", String.format("error executing js, action = %s, params = %s", str, str2));
                notifyError("Param ifs is needed", wVCallBackContext);
            }
            return true;
        } else if ("genO2OClickIdBy".equals(str) || "commitO2OClickEvent".equals(str)) {
            try {
                str4 = JSON.parseObject(str2).getString("url");
            } catch (Exception unused3) {
            }
            if (!StringUtils.isEmpty(str4)) {
                commitO2OClickEvent(str4, wVCallBackContext);
            } else {
                TaoLog.Logd("AlimamaSdk", String.format("error executing js, action = %s, params = %s", str, str2));
                notifyError("Param url and isOpenPage are needed", wVCallBackContext);
            }
            return true;
        } else if ("actionAdCommitter".equals(str)) {
            try {
                JSONObject jSONObject = JSON.parseObject(str2).getJSONObject("params");
                String string = jSONObject.getString("url");
                String string2 = jSONObject.getString("namespace");
                if (string2 == null) {
                    string2 = jSONObject.getString(DxContainerActivity.PARAMS_NAMESPACE);
                }
                String string3 = jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
                String string4 = jSONObject.getString("type");
                String string5 = jSONObject.getString("args");
                str4 = new b(string, string4).b(string2).a(string3).a(StringUtils.isEmpty(string5) ? null : dbf.a(string5));
            } catch (Exception unused4) {
                TaoLog.Logd("AlimamaSdk", String.format("error executing js, action = %s, params = %s", str, str2));
                notifyError("o2o cpa click params parse error", wVCallBackContext);
            }
            if (wVCallBackContext != null) {
                r rVar = new r();
                rVar.b();
                if (str4 == null) {
                    str4 = "";
                }
                rVar.a(ACTION_ID, str4);
                wVCallBackContext.success(rVar);
            }
            return true;
        } else if (!"commitCPSEvent".equals(str)) {
            return false;
        } else {
            try {
                new com.o2o.ad.click.cps.b().a(dbf.a(JSON.parseObject(str2).getJSONObject("params").getJSONObject("eventData")));
            } catch (Exception unused5) {
                TaoLog.Logd("AlimamaSdk", String.format("error executing js, action = %s, params = %s", str, str2));
                notifyError("o2o cps click params parse error", wVCallBackContext);
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success(r.RET_SUCCESS);
            }
            return true;
        }
    }

    private void notifyError(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48320cd", new Object[]{this, str, wVCallBackContext});
        } else if (wVCallBackContext == null) {
        } else {
            r rVar = new r("HY_FAILED");
            rVar.a("message", str);
            wVCallBackContext.error(rVar);
        }
    }

    public void commitO2OExpoEvent(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628c684b", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        O2OAdvertising.instance().buildIfsExposure(str).a(str2).a();
        if (wVCallBackContext == null) {
            return;
        }
        wVCallBackContext.success(r.RET_SUCCESS);
    }

    public void commitO2OClickEvent(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7b3cb5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Uri parse = Uri.parse(str);
        String a2 = new com.o2o.ad.click.common.a().a(str, parse.isHierarchical() ? parse.getQueryParameter("etype") : "");
        if (wVCallBackContext == null) {
            return;
        }
        r rVar = new r();
        rVar.b();
        if (a2 == null) {
            a2 = "";
        }
        rVar.a(CLICK_ID, a2);
        wVCallBackContext.success(rVar);
    }
}
