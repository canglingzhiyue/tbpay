package com.taobao.android.revisionswitch.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.f;
import com.taobao.desktop.ditto.anim.AnimConstance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.ilw;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a294a930", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        f fVar = new f();
        c<String> cVar = new c<>();
        fVar.a(cVar);
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("switch");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    cVar.a((c<String>) next, Boolean.valueOf(optJSONObject.optBoolean(next)));
                }
            }
            return fVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.taobao.android.revisionswitch.core.a a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.revisionswitch.core.a) ipChange.ipc$dispatch("fc7f8de5", new Object[]{str, new Boolean(z)});
        }
        if (str == null) {
            return null;
        }
        com.taobao.android.revisionswitch.core.a aVar = new com.taobao.android.revisionswitch.core.a();
        c<String> cVar = new c<>();
        aVar.a(cVar);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("switch");
            if (optJSONObject != null) {
                aVar.a(jSONObject.optString("bucket"));
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    cVar.a((c<String>) next, optJSONObject.optBoolean(next));
                }
                a(cVar, z);
            }
            return aVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void a(c<String> cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dead4b3", new Object[]{cVar, new Boolean(z)});
            return;
        }
        if (!cVar.b(ilw.KEY_NEW_CONTENT_ENABLE)) {
            cVar.a((c<String>) ilw.KEY_NEW_CONTENT_ENABLE, z);
        }
        if (cVar.b(ilw.KEY_NEW_FACE_ENABLE)) {
            return;
        }
        cVar.a((c<String>) ilw.KEY_NEW_FACE_ENABLE, z);
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (Throwable unused) {
            return new HashMap();
        }
    }

    public static List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(AnimConstance.VIEW_ANIM_KEY_URLS);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.taobao.android.revisionswitch.core.a a(JSONObject jSONObject, com.taobao.android.revisionswitch.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.revisionswitch.core.a) ipChange.ipc$dispatch("c42710a0", new Object[]{jSONObject, aVar});
        }
        if (jSONObject != null && aVar != null) {
            aVar.a(jSONObject.optString("bucket"));
            c<String> c = aVar.c();
            Set<String> b = c.b();
            JSONObject optJSONObject = jSONObject.optJSONObject("switch");
            if (optJSONObject != null) {
                for (String str : b) {
                    if (optJSONObject.has(str)) {
                        c.a((c<String>) str, optJSONObject.optBoolean(str));
                    }
                }
            }
        }
        return aVar;
    }
}
