package com.etao.feimagesearch.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public class IrpPageConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "IrpPageConfig";
    public HashMap<String, String> args;
    public boolean degrade;
    public String h5Url;
    public String weexUrl;

    static {
        kge.a(-89596957);
        kge.a(1028243835);
    }

    public static IrpPageConfig createFromJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpPageConfig) ipChange.ipc$dispatch("7ab4e4c3", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            IrpPageConfig irpPageConfig = new IrpPageConfig();
            irpPageConfig.weexUrl = jSONObject.optString("weexUrl");
            irpPageConfig.h5Url = jSONObject.optString("h5Url");
            irpPageConfig.degrade = jSONObject.optBoolean("degrade", false);
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            if (optJSONObject != null) {
                irpPageConfig.args = new HashMap<>();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    irpPageConfig.args.put(next, optJSONObject.getString(next));
                }
            }
            return irpPageConfig;
        } catch (Exception e) {
            cot.a(LOG_TAG, "Error Json for IrpPageConfig", e);
            return null;
        }
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!StringUtils.isEmpty(this.weexUrl)) {
                jSONObject.put("weexUrl", this.weexUrl);
            }
            if (!StringUtils.isEmpty(this.h5Url)) {
                jSONObject.put("h5Url", this.h5Url);
            }
            jSONObject.put("degrade", this.degrade);
            if (this.args != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : this.args.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("args", jSONObject2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }
}
