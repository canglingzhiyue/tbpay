package com.taobao.android.detail.ttdetail.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;
import tb.nfc;

/* loaded from: classes5.dex */
public class aw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1806544441);
    }

    private static boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{jSONObject})).booleanValue();
        }
        if (d(jSONObject) || d(g.d(jSONObject))) {
            return true;
        }
        JSONObject a2 = g.a(jSONObject);
        return a2 != null && d(a2.getJSONObject("meta"));
    }

    private static boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
        return jSONObject2 != null && jSONObject2.getBooleanValue("headerPicFlow");
    }

    private static int a(boolean z, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7197a29", new Object[]{new Boolean(z), str})).intValue() : (!z || TextUtils.isEmpty(str) || (split = str.split(":")) == null || split.length < 2 || TextUtils.equals(split[0], split[1])) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[Catch: Throwable -> 0x00e2, TryCatch #0 {Throwable -> 0x00e2, blocks: (B:7:0x0016, B:10:0x0023, B:13:0x002c, B:16:0x0035, B:18:0x003d, B:21:0x0045, B:23:0x004b, B:28:0x005f, B:30:0x006d, B:32:0x007f, B:35:0x00a0, B:36:0x00a4, B:38:0x00ac, B:42:0x00d2, B:39:0x00bb, B:41:0x00c4), top: B:52:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> a(com.alibaba.fastjson.JSONObject r13) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.ttdetail.utils.aw.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r13
            java.lang.String r13 = "3f6755bf"
            java.lang.Object r13 = r0.ipc$dispatch(r13, r1)
            java.util.List r13 = (java.util.List) r13
            return r13
        L15:
            r0 = 0
            java.lang.String r1 = "data"
            com.alibaba.fastjson.JSONObject r13 = r13.getJSONObject(r1)     // Catch: java.lang.Throwable -> Le2
            com.alibaba.fastjson.JSONObject r1 = com.taobao.android.detail.ttdetail.utils.g.a(r13)     // Catch: java.lang.Throwable -> Le2
            if (r1 != 0) goto L23
            return r0
        L23:
            java.lang.String r4 = "model"
            com.alibaba.fastjson.JSONObject r1 = r1.getJSONObject(r4)     // Catch: java.lang.Throwable -> Le2
            if (r1 != 0) goto L2c
            return r0
        L2c:
            java.lang.String r4 = "headerPic"
            com.alibaba.fastjson.JSONObject r1 = r1.getJSONObject(r4)     // Catch: java.lang.Throwable -> Le2
            if (r1 != 0) goto L35
            return r0
        L35:
            java.lang.String r4 = "groups"
            com.alibaba.fastjson.JSONArray r1 = r1.getJSONArray(r4)     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Le1
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le2
            if (r4 == 0) goto L45
            goto Le1
        L45:
            boolean r13 = c(r13)     // Catch: java.lang.Throwable -> Le2
            if (r13 != 0) goto L5e
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Le2
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = com.taobao.android.detail.ttdetail.feature.a.mFeature     // Catch: java.lang.Throwable -> Le2
            java.lang.String r5 = "headerFlingMode"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> Le2
            boolean r13 = r13.equals(r4)     // Catch: java.lang.Throwable -> Le2
            if (r13 == 0) goto L5c
            goto L5e
        L5c:
            r13 = 0
            goto L5f
        L5e:
            r13 = 1
        L5f:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le2
            r5 = 2
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Le2
            int r5 = r1.size()     // Catch: java.lang.Throwable -> Le2
            r3 = 0
            r6 = 1
        L6b:
            if (r3 >= r5) goto Le0
            com.alibaba.fastjson.JSONObject r7 = r1.getJSONObject(r3)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r8 = "items"
            com.alibaba.fastjson.JSONArray r7 = r7.getJSONArray(r8)     // Catch: java.lang.Throwable -> Le2
            int r8 = r7.size()     // Catch: java.lang.Throwable -> Le2
            r9 = r6
            r6 = 0
        L7d:
            if (r6 >= r8) goto Ldc
            com.alibaba.fastjson.JSONObject r10 = r7.getJSONObject(r6)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r11 = "dimension"
            java.lang.String r11 = r10.getString(r11)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r12 = "content"
            com.alibaba.fastjson.JSONObject r10 = r10.getJSONObject(r12)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r12 = "fields"
            com.alibaba.fastjson.JSONObject r10 = r10.getJSONObject(r12)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r12 = "type"
            java.lang.String r12 = r10.getString(r12)     // Catch: java.lang.Throwable -> Le2
            if (r3 != 0) goto La4
            if (r6 != 0) goto La4
            int r9 = a(r13, r11)     // Catch: java.lang.Throwable -> Le2
        La4:
            java.lang.String r11 = "image"
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> Le2
            if (r11 == 0) goto Lbb
            java.lang.String r11 = "url"
            java.lang.String r10 = r10.getString(r11)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r10 = com.taobao.android.detail.ttdetail.utils.l.a(r10)     // Catch: java.lang.Throwable -> Le2
            r4.add(r10)     // Catch: java.lang.Throwable -> Le2
            goto Ld2
        Lbb:
            java.lang.String r11 = "video"
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> Le2
            if (r11 == 0) goto Ld2
            java.lang.String r11 = "thumbnailUrl"
            java.lang.String r10 = r10.getString(r11)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r10 = com.taobao.android.detail.ttdetail.utils.l.a(r10)     // Catch: java.lang.Throwable -> Le2
            r4.add(r10)     // Catch: java.lang.Throwable -> Le2
        Ld2:
            int r10 = r4.size()     // Catch: java.lang.Throwable -> Le2
            if (r10 < r9) goto Ld9
            return r4
        Ld9:
            int r6 = r6 + 1
            goto L7d
        Ldc:
            int r3 = r3 + 1
            r6 = r9
            goto L6b
        Le0:
            return r4
        Le1:
            return r0
        Le2:
            r13 = move-exception
            java.lang.String r1 = "PreloadUtils"
            java.lang.String r2 = "getMainPicUrl error"
            com.taobao.android.detail.ttdetail.utils.i.a(r1, r2, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.ttdetail.utils.aw.a(com.alibaba.fastjson.JSONObject):java.util.List");
    }

    public static String b(JSONObject jSONObject) {
        JSONObject a2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject});
        }
        try {
            a2 = g.a(jSONObject.getJSONObject("data"));
        } catch (Throwable th) {
            i.a("PreloadUtils", "getSmallWindowPicUrl error", th);
        }
        if (a2 != null && (jSONObject2 = a2.getJSONObject("model")) != null && (jSONObject3 = jSONObject2.getJSONObject("headerPic")) != null && (jSONArray = jSONObject3.getJSONArray("smallWindow")) != null && !jSONArray.isEmpty()) {
            for (int i = 0; i <= jSONArray.size(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                    String string = jSONObject4.getString("type");
                    if (!TextUtils.isEmpty(string) && TextUtils.equals("detailVideo", string)) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("data").getJSONObject("content").getJSONObject("fields");
                        if (jSONObject5 != null) {
                            return l.a(jSONObject5.getString("thumbnailUrl"));
                        }
                        return null;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("sourceFrom", str2);
        hashMap.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, str3);
        ae.a("preloadCache", hashMap);
    }
}
