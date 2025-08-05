package com.taobao.browser.nav;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.taobao.impl.TMS;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(671184452);
    }

    public static boolean a(String str) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            JSONArray jSONArray = null;
            String customConfig = OrangeConfig.getInstance().getCustomConfig("themis_url_white_list", null);
            if (customConfig != null && !customConfig.isEmpty()) {
                try {
                    jSONArray = JSONArray.parseArray(customConfig);
                } catch (Exception e) {
                    TMSLogger.d("TMSUrlSwitcher", "parse json error: " + e.getMessage());
                }
                if (jSONArray == null || (application = Globals.getApplication()) == null) {
                    return false;
                }
                String a2 = a(jSONArray, str);
                if (TextUtils.isEmpty(a2)) {
                    return false;
                }
                return ABGlobal.isFeatureOpened(application, "TMS_H5_SWITCH_" + a2);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static String a(JSONArray jSONArray, String str) {
        Uri uri;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1ef4886", new Object[]{jSONArray, str});
        }
        if (jSONArray != null && str != null && !str.isEmpty()) {
            try {
                uri = Uri.parse(str);
            } catch (Exception unused) {
                uri = null;
            }
            if (uri == null) {
                return null;
            }
            String host = uri.getHost();
            String path = uri.getPath();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("condition")) != null) {
                    String string = jSONObject.getString("host");
                    String string2 = jSONObject.getString("path");
                    if (TextUtils.equals(host, string) && TextUtils.equals(path, string2)) {
                        return jSONObject2.getString("name");
                    }
                }
            }
        }
        return null;
    }

    public static boolean a(Intent intent, com.taobao.android.nav.d dVar, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d60efc", new Object[]{intent, dVar, uri})).booleanValue();
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        if (!t.a(dVar.a(), clearQuery.build().toString())) {
            return false;
        }
        for (String str : uri.getQueryParameterNames()) {
            if (!"pha_manifest".equals(str) && (!com.taobao.android.tschedule.protocol.b.PROTOCOL_BIZ_CODE_PHA.equals(str) || !"true".equals(uri.getQueryParameter(str)))) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        intent.setData(clearQuery.build());
        TMS.startApp(intent, dVar, TMSSolutionType.WEB_SINGLE_PAGE);
        return true;
    }
}
