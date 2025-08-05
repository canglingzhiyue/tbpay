package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"querySupportAuth"})
/* loaded from: classes3.dex */
public class b extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        try {
            JSONObject a2 = com.alibaba.wireless.aliprivacyext.f.a(str2);
            if (a2 == null) {
                b(bVar, "参数异常", null);
                return true;
            }
            JSONArray jSONArray = a2.getJSONArray("authList");
            if (jSONArray != null && jSONArray.size() != 0) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("authKey");
                    int intValue = jSONObject.getInteger("miniOSVersion").intValue();
                    Integer integer = jSONObject.containsKey("lessMaxOSVersion") ? jSONObject.getInteger("lessMaxOSVersion") : null;
                    if (Build.VERSION.SDK_INT >= intValue && ((integer == null || Build.VERSION.SDK_INT <= integer.intValue()) && com.alibaba.wireless.aliprivacy.b.a(context, string))) {
                        AuthStatus a3 = com.alibaba.wireless.aliprivacyext.c.a().a((Activity) context, string);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("authKey", string);
                        jSONObject2.put("authStatus", com.alibaba.wireless.aliprivacyext.f.a(a3));
                        jSONArray2.put(jSONObject2);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("resultList", jSONArray2);
                com.alibaba.wireless.aliprivacy.c.a("GetAuthStatusApi", com.alibaba.wireless.aliprivacyext.f.a(hashMap));
                a(bVar, "调用成功", hashMap);
                a(str2, true, com.alibaba.wireless.aliprivacyext.f.a(hashMap));
                return true;
            }
            b(bVar, "参数异常", null);
            return true;
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b("GetAuthStatusApi", "", th);
            b(bVar, com.alibaba.wireless.aliprivacyext.jsbridge.a.d, null);
            a(str2, false, th.getMessage());
            return true;
        }
    }

    private void a(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z), str2});
        } else {
            TrackLog.trackQuerySupportLog(str, z, str2);
        }
    }
}
