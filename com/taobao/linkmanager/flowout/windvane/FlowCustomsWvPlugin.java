package com.taobao.linkmanager.flowout.windvane;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.flowout.c;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import java.net.URLEncoder;
import java.util.HashMap;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class FlowCustomsWvPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_OPEN_URL = "openURL";
    public static final String PLUGIN_NAME = "TBWVOpenHandler";

    static {
        kge.a(1900514239);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || !str.equals(ACTION_OPEN_URL)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("id");
            String optString2 = jSONObject.optString("failMode");
            String optString3 = jSONObject.optString("url");
            String optString4 = jSONObject.optString(c.DEGTAGE_H5URL);
            if (StringUtils.isEmpty(optString)) {
                optString = jSONObject.optString(c.VISA);
            }
            HashMap hashMap = new HashMap(16);
            hashMap.put("id", optString);
            hashMap.put("failMode", optString2);
            hashMap.put("url", URLEncoder.encode(optString3, "UTF-8"));
            hashMap.put(c.DEGTAGE_H5URL, URLEncoder.encode(optString4, "UTF-8"));
            boolean a2 = com.taobao.linkmanager.flowout.e.a(TbFcLinkInit.instance().mApplication, Uri.parse(TFCCommonUtils.a("tbout://m.taobao.com/out.htm?", hashMap)));
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowCustomsWvPlugin === execute === 跳转是否成功==" + a2);
            if (wVCallBackContext != null) {
                if (a2) {
                    wVCallBackContext.success();
                } else {
                    wVCallBackContext.error();
                }
            }
        } catch (Exception e) {
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "FlowCustomsWvPlugin === execute === 跳转异常=" + e);
        }
        return true;
    }
}
