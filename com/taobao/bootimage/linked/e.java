package com.taobao.bootimage.linked;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.tao.util.StringUtil;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.List;
import tb.keo;
import tb.kge;
import tb.tiq;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-979899450);
    }

    public a a(JSONObject jSONObject) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5407ca94", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return new a(null, null);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        d dVar = new d(jSONObject2);
        JSONArray jSONArray = jSONObject.getJSONArray("sections");
        if (jSONArray == null || jSONArray.isEmpty()) {
            return new a(null, dVar);
        }
        List<LinkedSplashData> a2 = a(jSONArray, jSONObject2);
        if (a2.size() == 0) {
            throw new RuntimeException("noAvailableSections");
        }
        return new a(a2, dVar);
    }

    private List<LinkedSplashData> a(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c639ee7", new Object[]{this, jSONArray, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        String string = jSONObject.getString("traceId");
        for (int i = 0; i < jSONArray.size(); i++) {
            try {
                LinkedSplashData a2 = a(jSONArray.getJSONObject(i), string);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    private static LinkedSplashData a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedSplashData) ipChange.ipc$dispatch("1553460c", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || jSONObject.isEmpty() || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null || jSONObject2.isEmpty() || (jSONObject3 = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) == null || jSONObject3.isEmpty()) {
            return null;
        }
        if (StringUtil.isEmpty(str)) {
            str = b(jSONObject3);
        }
        for (String str2 : jSONObject2.keySet()) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject(str2);
            if (jSONObject4 != null) {
                jSONObject4.put("traceId", (Object) str);
            }
        }
        BootImageData a2 = keo.a(jSONObject3, jSONObject2.containsKey(com.taobao.mmad.data.b.TYPE_BANNER) ? "TopView" : tiq.BIZ_CODE);
        if (a2 != null && a2.result != null && a2.result.size() > 0) {
            return new LinkedSplashData(jSONObject2, str, a2);
        }
        return null;
    }

    private static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject});
        }
        String str = "topview_trace_" + SystemClock.uptimeMillis() + "_" + UTDevice.getUtdid(com.taobao.bootimage.f.b());
        String c = c(jSONObject);
        if (StringUtils.isEmpty(c)) {
            return str;
        }
        return str + "_" + c;
    }

    private static String c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{jSONObject});
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("item");
        if (jSONObject4 != null && (jSONObject2 = jSONObject4.getJSONObject("0")) != null && (jSONObject3 = jSONObject2.getJSONObject("content")) != null) {
            return jSONObject3.getString("itemId");
        }
        return null;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<LinkedSplashData> f16707a;
        public final d b;

        static {
            kge.a(685119666);
        }

        public a(List<LinkedSplashData> list, d dVar) {
            this.f16707a = list;
            this.b = dVar;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f16707a == null && this.b == null;
        }
    }
}
