package com.taobao.tao.flexbox.layoutmanager.jsonpatch;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import tb.fxb;
import tb.kge;
import tb.oec;

/* loaded from: classes8.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.jsonpatch.c$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20415a = new int[Operation.values().length];

        static {
            try {
                f20415a[Operation.REMOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20415a[Operation.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20415a[Operation.REPLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20415a[Operation.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20415a[Operation.COPY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(939307336);
    }

    private static Object a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("805a9220", new Object[]{jSONObject, str}) : jSONObject.get(str);
    }

    private static Object a(JSONObject jSONObject, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d2d3644", new Object[]{jSONObject, str, obj});
        }
        Object obj2 = jSONObject.get(str);
        return obj2 == null ? obj : obj2;
    }

    private static boolean a(JSONArray jSONArray, d dVar, EnumSet<CompatibilityFlags> enumSet) throws InvalidJsonPatchException {
        boolean a2;
        Object a3;
        Object a4;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e9f1451", new Object[]{jSONArray, dVar, enumSet})).booleanValue();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            Operation fromRfcName = Operation.fromRfcName(a(jSONObject, a.f20413a).toString().replaceAll("\"", ""));
            List<String> a5 = a(a(jSONObject, a.c));
            int i = AnonymousClass1.f20415a[fromRfcName.ordinal()];
            if (i == 1) {
                a2 = dVar.a(a5);
            } else if (i == 2) {
                if (!enumSet.contains(CompatibilityFlags.MISSING_VALUES_AS_NULLS)) {
                    a3 = a(jSONObject, a.b);
                } else {
                    a3 = a(jSONObject, a.b, (Object) null);
                }
                a2 = dVar.a(a5, a3);
            } else if (i == 3) {
                if (!enumSet.contains(CompatibilityFlags.MISSING_VALUES_AS_NULLS)) {
                    a4 = a(jSONObject, a.b);
                } else {
                    a4 = a(jSONObject, a.b, (Object) null);
                }
                a2 = dVar.b(a5, a4);
            } else if (i == 4) {
                a2 = dVar.a(a(a(jSONObject, a.d)), a5);
            } else if (i == 5) {
                z = dVar.b(a(a(jSONObject, a.d)), a5) | z;
            }
            z |= a2;
        }
        return z;
    }

    public static boolean a(JSONArray jSONArray, JSON json) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63cb1463", new Object[]{jSONArray, json})).booleanValue() : a(jSONArray, json, CompatibilityFlags.defaults());
    }

    public static boolean a(JSONArray jSONArray, JSON json, EnumSet<CompatibilityFlags> enumSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ba19fe5", new Object[]{jSONArray, json, enumSet})).booleanValue() : a(jSONArray, new b(json, enumSet), enumSet);
    }

    private static List<String> a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("18196f83", new Object[]{obj}) : oec.b(obj.toString(), (char) fxb.DIR);
    }
}
