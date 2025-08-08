package com.taobao.browser.jsbridge;

import android.content.Context;
import android.taobao.windvane.extra.WVSchemeProcessor;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.j;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.config.NetworkConfigCenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.spdu.httpdns.HttpDns;
import com.spdu.httpdns.HttpDnsOrigin;
import com.taobao.browser.nav.BrowserActivityProcessor;
import com.taobao.browser.utils.n;
import com.taobao.orange.ConfigCenter;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class DevelopTool extends WVDevelopTool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isHttpsOn;
    private String TAG = "DevelopTool";

    public static /* synthetic */ Object ipc$super(DevelopTool developTool, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode != -1126948911) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        }
    }

    static {
        kge.a(1594686770);
        isHttpsOn = true;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }

    @Override // android.taobao.windvane.jsbridge.api.WVDevelopTool, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("isSPDYDemote".equals(str)) {
            isDemoteSPDY(wVCallBackContext, str2);
        } else if ("setSPDYDemote".equals(str)) {
            demoteSPDY(wVCallBackContext, str2);
        }
        if ("isACCSEnabled".equals(str)) {
            isDemoteACCS(wVCallBackContext, str2);
        } else if ("setACCSEnabled".equals(str)) {
            demoteACCS(wVCallBackContext, str2);
        } else if ("setHostIP".equals(str)) {
            setHostIP(wVCallBackContext, str2);
        } else if ("isHTTPSEnabled".equals(str)) {
            isHTTPSEnabled(str2, wVCallBackContext);
        } else if ("setHTTPSEnabled".equals(str)) {
            setHTTPSEnabled(str2, wVCallBackContext);
        } else if ("configCenterData".equals(str)) {
            configCenterData(str2, wVCallBackContext);
        } else if ("setTMSWhiteList".equals(str)) {
            setTMSWhiteList(str2, wVCallBackContext);
        } else {
            return super.execute(str, str2, wVCallBackContext);
        }
        return true;
    }

    private void isDemoteSPDY(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf7751e", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.a("demote", String.valueOf(!NetworkConfigCenter.isSpdyEnabled()));
        wVCallBackContext.success(rVar);
    }

    private void setHostIP(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5badd99f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str3 = null;
        try {
            jSONObject = new JSONObject(str);
            str2 = jSONObject.getString("host");
        } catch (Exception unused) {
            str2 = null;
        }
        try {
            str3 = jSONObject.getString(c.IP);
            i = jSONObject.getInt("port");
        } catch (Exception unused2) {
            wVCallBackContext.error("HY_PARAM_ERR");
            HttpDns.getInstance().setTestOrigin(str2, new HttpDnsOrigin(str3, i, (System.currentTimeMillis() / 1000) + 86400));
            wVCallBackContext.success();
        }
        HttpDns.getInstance().setTestOrigin(str2, new HttpDnsOrigin(str3, i, (System.currentTimeMillis() / 1000) + 86400));
        wVCallBackContext.success();
    }

    private void demoteSPDY(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d89bcd4", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            String string = new JSONObject(str).getString("demote");
            if ("true".equals(string)) {
                NetworkConfigCenter.setSpdyEnabled(false);
            } else if ("false".equals(string)) {
                NetworkConfigCenter.setSpdyEnabled(true);
            }
            wVCallBackContext.success();
        } catch (JSONException unused) {
            String str2 = this.TAG;
            m.e(str2, "demoteSPDY: param parse to JSON error, param=" + str);
            wVCallBackContext.error();
        }
    }

    private void isDemoteACCS(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77371d7e", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        rVar.a("msg", "can't use isDemoteACCS know");
        wVCallBackContext.error(rVar);
    }

    private void demoteACCS(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c96534", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = this.TAG;
        m.e(str2, "demoteACCS can't use" + str);
        r rVar = new r();
        rVar.a("msg", "can't use demoteACCS now");
        wVCallBackContext.error(rVar);
    }

    public final void setHTTPSEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e87ea6", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            boolean optBoolean = new JSONObject(str).optBoolean("enable", true);
            isHttpsOn = optBoolean;
            if (!optBoolean) {
                NetworkConfigCenter.setSSLEnabled(false);
                j.a(new n());
            } else {
                NetworkConfigCenter.setSSLEnabled(true);
                j.a(new WVSchemeProcessor());
            }
            wVCallBackContext.success();
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    public final void isHTTPSEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350496e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        if (!isHttpsOn) {
            rVar.a("enabled", "false");
        } else {
            rVar.a("enabled", "true");
        }
        wVCallBackContext.success(rVar);
    }

    public final void configCenterData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b7e88f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a(ConfigCenter.getInstance().getIndexAndConfigs());
        wVCallBackContext.success(rVar);
    }

    private void setTMSWhiteList(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f8967d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(str);
            if (parseObject != null) {
                String string = parseObject.getString("urlList");
                if (!StringUtils.isEmpty(string)) {
                    BrowserActivityProcessor.TMS_WHITE_LIST = string;
                    wVCallBackContext.success();
                    return;
                }
            }
        } catch (Exception unused) {
        }
        wVCallBackContext.error();
    }
}
