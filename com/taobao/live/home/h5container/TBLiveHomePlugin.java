package com.taobao.live.home.h5container;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taolivecontainer.TBLiveWebView;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mfg;
import tb.prc;

/* loaded from: classes7.dex */
public class TBLiveHomePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String entryPageUrl;

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        DinamicXEngine c;
        DinamicXEngine c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getBottomTabBarHeight".equals(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("height", (int) ((prc.a(this.mContext, 49.0f) / prc.f(this.mContext)) * 750.0f));
                jSONObject.put("markingTabHeight", (int) ((prc.a(this.mContext, 64.0f) / prc.f(this.mContext)) * 750.0f));
                wVCallBackContext.success(jSONObject.toString());
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
                wVCallBackContext.error();
                return false;
            }
        } else if ("fetchBottomRightEntryLocation".equals(str)) {
            r rVar = new r();
            if ((this.mContext instanceof a) && (c2 = ((a) this.mContext).c()) != null && c2.g() != null && c2.g().d() != null && c2.g().d().c() != null) {
                com.alibaba.fastjson.JSONObject c3 = c2.g().d().c();
                rVar.a("bottomRightEntryX", c3.get("bottomRightEntryX"));
                rVar.a("bottomRightEntryY", c3.get("bottomRightEntryY"));
            }
            wVCallBackContext.success(rVar);
            return true;
        } else if ("getPageInfo".equals(str)) {
            r rVar2 = new r();
            rVar2.a("pageUrl", entryPageUrl);
            wVCallBackContext.success(rVar2);
            return true;
        } else if ("fetchInvokedTabInfo".equals(str)) {
            r rVar3 = new r();
            if (this.mWebView instanceof TBLiveWebView) {
                Object webViewToken = ((TBLiveWebView) this.mWebView).getWebViewToken();
                if (webViewToken instanceof b) {
                    HashMap hashMap = (HashMap) ((b) webViewToken).getTabData();
                    if ("Native".equals((String) hashMap.get("h5ContainerRenderType"))) {
                        rVar3.a("tabData", hashMap.get("tabBottom"));
                        rVar3.a("appear", hashMap.get("appear"));
                    }
                }
            }
            wVCallBackContext.success(rVar3);
            return true;
        } else if ("fetchDXEngineInfo".equals(str)) {
            r rVar4 = new r();
            JSONArray jSONArray = null;
            try {
                jSONArray = com.alibaba.fastjson.JSONObject.parseArray(str2);
            } catch (Exception unused) {
            }
            if ((this.mContext instanceof a) && jSONArray != null && jSONArray.size() > 0 && (c = ((a) this.mContext).c()) != null && c.g() != null && c.g().d() != null && c.g().d().c() != null) {
                com.alibaba.fastjson.JSONObject c4 = c.g().d().c();
                for (int i = 0; i < jSONArray.size(); i++) {
                    rVar4.a(jSONArray.getString(i), c4.get(jSONArray.getString(i)));
                }
            }
            wVCallBackContext.success(rVar4);
            return true;
        } else if ("goToHome".equals(str)) {
            mfg.a().a("com.taobao.taolive.home.go.to.home", str2);
            wVCallBackContext.success();
            return true;
        } else if ("back".equals(str)) {
            mfg.a().a("com.taobao.taolive.home.back", str2);
            wVCallBackContext.success();
            return true;
        } else if ("getSafeArea".equals(str)) {
            r rVar5 = new r();
            if (this.mWebView instanceof TBLiveWebView) {
                Object webViewToken2 = ((TBLiveWebView) this.mWebView).getWebViewToken();
                if (webViewToken2 instanceof b) {
                    HashMap hashMap2 = (HashMap) ((b) webViewToken2).getTabData();
                    if ("Native".equals((String) hashMap2.get("h5ContainerRenderType"))) {
                        rVar5.a("statusBarHeight", hashMap2.get("statusBarHeight"));
                        rVar5.a("navBarHeight", hashMap2.get("navBarHeight"));
                        rVar5.a("bottomBarHeight", hashMap2.get("bottomBarHeight"));
                    }
                }
            }
            wVCallBackContext.success(rVar5);
            return true;
        } else if (!"fetchSearchHistory".equals(str)) {
            return false;
        } else {
            String stringArray = getStringArray(this.mContext);
            r rVar6 = new r();
            if (stringArray != null) {
                rVar6.a("historySource", stringArray);
            }
            wVCallBackContext.success(rVar6);
            return true;
        }
    }

    public static String getStringArray(Context context) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca4b9b1", new Object[]{context});
        }
        if (context == null || (split = context.getApplicationContext().getSharedPreferences("tblivesearch", 0).getString("tblivesearch-history", "").split(",")) == null || split.length <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                jSONArray.add(split[i]);
            }
        }
        return jSONArray.toJSONString();
    }
}
