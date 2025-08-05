package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import android.os.Build;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacy.PrivacyAuthGetParam;
import com.alibaba.wireless.aliprivacy.PrivacyAuthResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"getAuthStatusByScenes"})
/* loaded from: classes3.dex */
public class c extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "c";

    private PrivacyAuthGetParam b(List<com.alibaba.wireless.aliprivacyext.model.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrivacyAuthGetParam) ipChange.ipc$dispatch("e5fb0639", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        PrivacyAuthGetParam.b bVar = new PrivacyAuthGetParam.b();
        for (com.alibaba.wireless.aliprivacyext.model.b bVar2 : list) {
            bVar.a(bVar2.getSceneCode(), bVar2.getPermissions());
        }
        return bVar.a();
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
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
            List<com.alibaba.wireless.aliprivacyext.model.b> parseArray = JSONObject.parseArray(a2.getJSONArray("authGetParams").toJSONString(), com.alibaba.wireless.aliprivacyext.model.b.class);
            if (parseArray != null && !parseArray.isEmpty()) {
                List<PrivacyAuthResult> a3 = com.alibaba.wireless.aliprivacy.b.a(context, b(parseArray), "h5");
                HashMap hashMap = new HashMap(1);
                hashMap.put("jsAuthOfSceneResult", com.alibaba.wireless.aliprivacyext.f.a(a(a3)));
                hashMap.put("buildTargetVersion", Integer.valueOf(Build.VERSION.SDK_INT));
                a(bVar, "调用成功", hashMap);
                return true;
            }
            b(bVar, "参数异常", null);
            return true;
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b(e, "", th);
            b(bVar, com.alibaba.wireless.aliprivacyext.jsbridge.a.d, null);
            return true;
        }
    }

    private Map<String, Map<String, AuthStatus>> a(List<PrivacyAuthResult> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{this, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (PrivacyAuthResult privacyAuthResult : list) {
            hashMap.put(privacyAuthResult.getSceneCode(), privacyAuthResult.getPermissions());
        }
        return hashMap;
    }
}
