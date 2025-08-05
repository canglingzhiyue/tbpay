package com.ta.utdid2.device;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.audid.upload.UtdidKeyFile;
import com.ta.audid.utils.UtdidLogger;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f8151a = -1;

    static {
        kge.a(-262859964);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i >= 0 && i != 10012;
    }

    public static a a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5b708be2", new Object[]{str});
        }
        a aVar = new a();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("code")) {
                aVar.f8151a = jSONObject2.getInt("code");
            }
            if (jSONObject2.has("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null) {
                if (jSONObject.has(com.alibaba.analytics.core.config.a.KEY)) {
                    String string = jSONObject.getString(com.alibaba.analytics.core.config.a.KEY);
                    if (!TextUtils.isEmpty(string)) {
                        UtdidKeyFile.writeAudidFile(string);
                    }
                }
                if (jSONObject.has("utdid")) {
                    String string2 = jSONObject.getString("utdid");
                    if (UTUtdid.isValidUtdid(string2)) {
                        Context context = Variables.getInstance().getContext();
                        UtdidKeyFile.writeAppUtdidFile(string2);
                        UtdidKeyFile.writeUtdidToSettings(context, string2);
                        UtdidKeyFile.writeSdcardUtdidFile(string2);
                    }
                }
            }
            UtdidLogger.d("BizResponse", "content", str);
        } catch (JSONException e) {
            UtdidLogger.d("", e.toString());
        }
        return aVar;
    }
}
