package com.taobao.android.artry.dycontainer;

import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.common.EffectType;
import com.taobao.android.artry.constants.ARType;
import com.taobao.android.artry.utils.d;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f9053a;

    /* renamed from: com.taobao.android.artry.dycontainer.c$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9054a = new int[ARType.values().length];

        static {
            try {
                f9054a[ARType.MAKEUP_WANMEI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        kge.a(407547385);
        f9053a = c.class.getSimpleName();
    }

    private c() {
    }

    public static JSONObject a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e7032024", new Object[]{new Boolean(z), jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("queryCodes");
            if (!d.a(jSONArray)) {
                JSONArray jSONArray2 = new JSONArray(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null && (next instanceof JSONObject)) {
                        JSONObject jSONObject3 = (JSONObject) next;
                        String valueOf = String.valueOf(jSONObject3.get("queryCode"));
                        int i = -1;
                        try {
                            i = Integer.parseInt(valueOf);
                        } catch (Throwable unused) {
                            String str = f9053a;
                            Log.e(str, "could not parse the queryCode[" + valueOf + "]...");
                        }
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("inExtraData");
                        JSONObject jSONObject5 = null;
                        if (i > 0) {
                            try {
                                jSONObject5 = a(z, i, jSONObject4);
                            } catch (Throwable unused2) {
                                Log.e(f9053a, "some exceptions happened, when invoking isSupport method...");
                            }
                        }
                        if (jSONObject5 == null) {
                            jSONObject5 = new JSONObject();
                        }
                        if (!jSONObject5.containsKey("queryCode")) {
                            jSONObject5.put("queryCode", (Object) valueOf);
                        }
                        if (!jSONObject5.containsKey("isSupport")) {
                            jSONObject5.put("isSupport", (Object) false);
                        }
                        if (!jSONObject5.getBooleanValue("isSupport")) {
                            z2 = false;
                        }
                        jSONArray2.add(jSONObject5);
                    }
                }
                jSONObject2.put("isAllSupport", Boolean.valueOf(z2));
                jSONObject2.put("supportResults", (Object) jSONArray2);
                return jSONObject2;
            }
        }
        jSONObject2.put("isAllSupport", (Object) true);
        return jSONObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.alibaba.fastjson.JSONObject a(boolean r6, int r7, com.alibaba.fastjson.JSONObject r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.artry.dycontainer.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L25
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r6)
            r1[r2] = r4
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r1[r3] = r6
            r6 = 2
            r1[r6] = r8
            java.lang.String r6 = "6cfaf3d9"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            com.alibaba.fastjson.JSONObject r6 = (com.alibaba.fastjson.JSONObject) r6
            return r6
        L25:
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r4 = "queryCode"
            r0.put(r4, r1)
            r1 = 0
            r4 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r5 = "isSupport"
            if (r7 == r4) goto L96
            r4 = 3001(0xbb9, float:4.205E-42)
            if (r7 == r4) goto L8d
            r4 = 4000(0xfa0, float:5.605E-42)
            if (r7 == r4) goto L84
            switch(r7) {
                case 1000: goto L96;
                case 1001: goto L96;
                case 1002: goto L96;
                case 1003: goto L7c;
                case 1004: goto L73;
                default: goto L45;
            }
        L45:
            switch(r7) {
                case 2000: goto L59;
                case 2001: goto L59;
                case 2002: goto L50;
                default: goto L48;
            }
        L48:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r0.put(r5, r6)
            goto L9d
        L50:
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.put(r5, r6)
            goto L9d
        L59:
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            r6 = 2000(0x7d0, float:2.803E-42)
            if (r7 != r6) goto L67
            boolean r6 = a(r8, r1)
            goto L6b
        L67:
            boolean r6 = b(r8, r1)
        L6b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.put(r5, r6)
            goto L9d
        L73:
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.put(r5, r6)
            goto L9d
        L7c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.put(r5, r6)
            goto L9d
        L84:
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.put(r5, r6)
            goto L9d
        L8d:
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.put(r5, r6)
            goto L9d
        L96:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r0.put(r5, r6)
        L9d:
            if (r1 == 0) goto La4
            java.lang.String r6 = "outExtraData"
            r0.put(r6, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.artry.dycontainer.c.a(boolean, int, com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }

    private static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        ARType aRType;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        EffectType effectType = null;
        String string = jSONObject == null ? null : jSONObject.getString("engine_type");
        String string2 = jSONObject == null ? null : jSONObject.getString("effect_type");
        try {
            aRType = ARType.valueOf(string);
        } catch (Throwable unused) {
            aRType = null;
        }
        boolean z2 = aRType != null;
        if (z2 && AnonymousClass1.f9054a[aRType.ordinal()] == 1) {
            try {
                effectType = EffectType.valueOf(string2);
            } catch (Throwable unused2) {
            }
            z2 &= effectType != null;
        }
        boolean z3 = jSONObject != null;
        if (z3) {
            if (jSONObject.containsKey("effect_type") || jSONObject.containsKey("engine_type")) {
                z = true;
            }
            z3 &= z;
        }
        if (z3) {
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("effect_type", (Object) jSONObject.getString("effect_type"));
            jSONObject2.put("engine_type", (Object) jSONObject.getString("engine_type"));
        }
        return z2;
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("525e83ad", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        ARType aRType = null;
        String string = jSONObject == null ? null : jSONObject.getString("engine_type");
        boolean booleanValue = jSONObject == null ? false : jSONObject.getBooleanValue("return_support_effect_list");
        try {
            aRType = ARType.valueOf(string);
        } catch (Throwable unused) {
        }
        if (aRType == null) {
            z = false;
        }
        if (aRType == ARType.MAKEUP_WANMEI && booleanValue) {
            jSONObject2.put("support_effect_list", (Object) a(aRType));
        }
        return z;
    }

    private static JSONArray a(ARType aRType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("81b38928", new Object[]{aRType});
        }
        JSONArray jSONArray = new JSONArray();
        if (aRType != null && AnonymousClass1.f9054a[aRType.ordinal()] == 1) {
            for (EffectType effectType : EffectType.values()) {
                jSONArray.add(effectType.name());
            }
        }
        return jSONArray;
    }
}
