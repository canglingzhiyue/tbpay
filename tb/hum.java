package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* loaded from: classes6.dex */
public class hum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98cb8082", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9});
        } else {
            a(str, str2, str3, str4, str5, str6, str7, str8, str9, null);
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2906c3", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, map});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "null";
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "null";
        }
        if (StringUtils.isEmpty(str3)) {
            str3 = "null";
        }
        if (StringUtils.isEmpty(str5)) {
            str5 = "null";
        }
        if (StringUtils.isEmpty(str6)) {
            str6 = "null";
        }
        if (StringUtils.isEmpty(str7)) {
            str7 = "null";
        }
        if (StringUtils.isEmpty(str8)) {
            str8 = "null";
        }
        if (StringUtils.isEmpty(str9)) {
            str9 = "2.0";
        }
        double a3 = a(str2, str3, str8, 0.05000000074505806d);
        if (Math.random() >= a3) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("serviceId", (Object) str2);
        jSONObject.put("version", (Object) str3);
        jSONObject.put("samplingRate", (Object) Double.valueOf(a3));
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("invokeClass", (Object) str5);
        jSONObject.put("invokePage", (Object) str6);
        jSONObject.put("invokePageUrl", (Object) str7);
        jSONObject.put(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, (Object) str8);
        jSONObject.put("msoaVersion", (Object) str9);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                    jSONObject.put(key, (Object) value);
                }
            }
        }
        if (a() && (a2 = a(str2, str3, str8)) != null) {
            try {
                String str10 = (String) a2.get("type");
                if (Math.random() < Double.parseDouble((String) a2.get("failRate"))) {
                    if ("1".equals(str10)) {
                        jSONObject.put("errorCode", (Object) "61001");
                        jSONObject.put("errorMsg", (Object) "FAIL_SYS_REHEARSE");
                        hul.a(hul.ALARM_POINT, jSONObject.toJSONString(), "61001", "FAIL_SYS_REHEARSE");
                        return;
                    }
                    "2".equals(str10);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        hul.a(hul.ALARM_POINT, jSONObject.toJSONString());
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a81c96", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11});
        } else {
            a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, null);
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee66402f", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, map});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "null";
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "null";
        }
        if (StringUtils.isEmpty(str3)) {
            str3 = "null";
        }
        if (StringUtils.isEmpty(str4)) {
            str4 = "null";
        }
        if (StringUtils.isEmpty(str5)) {
            str5 = "null";
        }
        if (StringUtils.isEmpty(str7)) {
            str7 = "null";
        }
        if (StringUtils.isEmpty(str8)) {
            str8 = "null";
        }
        if (StringUtils.isEmpty(str9)) {
            str9 = "null";
        }
        if (StringUtils.isEmpty(str10)) {
            str10 = "null";
        }
        if (StringUtils.isEmpty(str11)) {
            str11 = "2.0";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("serviceId", (Object) str2);
        jSONObject.put("version", (Object) str3);
        jSONObject.put("samplingRate", (Object) "1.0");
        jSONObject.put("errorCode", (Object) str4);
        jSONObject.put("errorMsg", (Object) str5);
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("invokeClass", (Object) str7);
        jSONObject.put("invokePage", (Object) str8);
        jSONObject.put("invokePageUrl", (Object) str9);
        jSONObject.put(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, (Object) str10);
        jSONObject.put("msoaVersion", (Object) str11);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                    jSONObject.put(key, (Object) value);
                }
            }
        }
        hul.a(hul.ALARM_POINT, jSONObject.toJSONString(), str4, str5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        r8 = ((com.alibaba.fastjson.JSONArray) ((com.alibaba.fastjson.JSONObject) r4).get("samplingData")).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
        if (r8.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r9 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
        if (r10.trim().equals((java.lang.String) ((com.alibaba.fastjson.JSONObject) r9).get(com.taobao.avplayer.TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
        return java.lang.Double.parseDouble((java.lang.String) ((com.alibaba.fastjson.JSONObject) r9).get("samplingRate"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double a(java.lang.String r8, java.lang.String r9, java.lang.String r10, double r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.hum.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L27
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r8
            r8 = 1
            r1[r8] = r9
            r8 = 2
            r1[r8] = r10
            r8 = 3
            java.lang.Double r9 = new java.lang.Double
            r9.<init>(r11)
            r1[r8] = r9
            java.lang.String r8 = "c0bf98a6"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Number r8 = (java.lang.Number) r8
            double r8 = r8.doubleValue()
            return r8
        L27:
            boolean r0 = android.text.StringUtils.isEmpty(r8)
            if (r0 != 0) goto Lde
            boolean r0 = android.text.StringUtils.isEmpty(r9)
            if (r0 != 0) goto Lde
            boolean r0 = android.text.StringUtils.isEmpty(r10)
            if (r0 == 0) goto L3b
            goto Lde
        L3b:
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r1 = "samplingRate"
            java.lang.String r2 = "umbrella_switch"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getConfig(r2, r1, r3)
            boolean r2 = android.text.StringUtils.isEmpty(r0)
            if (r2 == 0) goto L51
            return r11
        L51:
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: java.lang.Exception -> Lde
            java.lang.String r2 = "defaultSamplingRate"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> Lde
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Lde
            double r2 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.Exception -> Lde
            java.lang.String r4 = "data"
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Exception -> Lde
            com.alibaba.fastjson.JSONArray r0 = (com.alibaba.fastjson.JSONArray) r0     // Catch: java.lang.Exception -> Lde
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lde
        L6d:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Exception -> Lde
            if (r4 == 0) goto Ld7
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Exception -> Lde
            boolean r5 = r4 instanceof com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> Lde
            if (r5 == 0) goto L6d
            r5 = r4
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5     // Catch: java.lang.Exception -> Lde
            java.lang.String r6 = "serviceId"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> Lde
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lde
            r6 = r4
            com.alibaba.fastjson.JSONObject r6 = (com.alibaba.fastjson.JSONObject) r6     // Catch: java.lang.Exception -> Lde
            java.lang.String r7 = "serviceVersion"
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Exception -> Lde
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lde
            boolean r5 = r8.equals(r5)     // Catch: java.lang.Exception -> Lde
            if (r5 == 0) goto L6d
            boolean r5 = r9.equals(r6)     // Catch: java.lang.Exception -> Lde
            if (r5 == 0) goto L6d
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4     // Catch: java.lang.Exception -> Lde
            java.lang.String r8 = "samplingData"
            java.lang.Object r8 = r4.get(r8)     // Catch: java.lang.Exception -> Lde
            com.alibaba.fastjson.JSONArray r8 = (com.alibaba.fastjson.JSONArray) r8     // Catch: java.lang.Exception -> Lde
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> Lde
        Lab:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Exception -> Lde
            if (r9 == 0) goto Ld7
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Exception -> Lde
            r0 = r9
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0     // Catch: java.lang.Exception -> Lde
            java.lang.String r4 = "sceneName"
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Exception -> Lde
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lde
            java.lang.String r4 = r10.trim()     // Catch: java.lang.Exception -> Lde
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> Lde
            if (r0 == 0) goto Lab
            com.alibaba.fastjson.JSONObject r9 = (com.alibaba.fastjson.JSONObject) r9     // Catch: java.lang.Exception -> Lde
            java.lang.Object r8 = r9.get(r1)     // Catch: java.lang.Exception -> Lde
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> Lde
            double r8 = java.lang.Double.parseDouble(r8)     // Catch: java.lang.Exception -> Lde
            return r8
        Ld7:
            r8 = 0
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 < 0) goto Lde
            return r2
        Lde:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hum.a(java.lang.String, java.lang.String, java.lang.String, double):double");
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("umbrella_switch", "rehearseEnable", "false"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
        r7 = ((com.alibaba.fastjson.JSONArray) ((com.alibaba.fastjson.JSONObject) r3).get("failRate")).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r7.hasNext() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        r8 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
        if (r9.trim().equals((java.lang.String) ((com.alibaba.fastjson.JSONObject) r8).get(com.taobao.avplayer.TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
        return (com.alibaba.fastjson.JSONObject) r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.alibaba.fastjson.JSONObject a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.hum.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            r7 = 1
            r1[r7] = r8
            r7 = 2
            r1[r7] = r9
            java.lang.String r7 = "5496e366"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            com.alibaba.fastjson.JSONObject r7 = (com.alibaba.fastjson.JSONObject) r7
            return r7
        L1b:
            boolean r0 = android.text.StringUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto Lb4
            boolean r0 = android.text.StringUtils.isEmpty(r8)
            if (r0 != 0) goto Lb4
            boolean r0 = android.text.StringUtils.isEmpty(r9)
            if (r0 == 0) goto L30
            goto Lb4
        L30:
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r2 = "failRate"
            java.lang.String r3 = "umbrella_switch"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.getConfig(r3, r2, r4)
            boolean r3 = android.text.StringUtils.isEmpty(r0)
            if (r3 == 0) goto L46
            return r1
        L46:
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r3 = "data"
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> Lb4
            com.alibaba.fastjson.JSONArray r0 = (com.alibaba.fastjson.JSONArray) r0     // Catch: java.lang.Exception -> Lb4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Lb4
        L56:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Exception -> Lb4
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Exception -> Lb4
            boolean r4 = r3 instanceof com.alibaba.fastjson.JSONObject     // Catch: java.lang.Exception -> Lb4
            if (r4 == 0) goto L56
            r4 = r3
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4     // Catch: java.lang.Exception -> Lb4
            java.lang.String r5 = "serviceId"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lb4
            r5 = r3
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5     // Catch: java.lang.Exception -> Lb4
            java.lang.String r6 = "serviceVersion"
            java.lang.Object r5 = r5.get(r6)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lb4
            boolean r4 = r7.equals(r4)     // Catch: java.lang.Exception -> Lb4
            if (r4 == 0) goto L56
            boolean r4 = r8.equals(r5)     // Catch: java.lang.Exception -> Lb4
            if (r4 == 0) goto L56
            com.alibaba.fastjson.JSONObject r3 = (com.alibaba.fastjson.JSONObject) r3     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r7 = r3.get(r2)     // Catch: java.lang.Exception -> Lb4
            com.alibaba.fastjson.JSONArray r7 = (com.alibaba.fastjson.JSONArray) r7     // Catch: java.lang.Exception -> Lb4
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> Lb4
        L92:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> Lb4
            if (r8 == 0) goto Lb4
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> Lb4
            r0 = r8
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = "sceneName"
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb4
            java.lang.String r2 = r9.trim()     // Catch: java.lang.Exception -> Lb4
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Exception -> Lb4
            if (r0 == 0) goto L92
            com.alibaba.fastjson.JSONObject r8 = (com.alibaba.fastjson.JSONObject) r8     // Catch: java.lang.Exception -> Lb4
            return r8
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hum.a(java.lang.String, java.lang.String, java.lang.String):com.alibaba.fastjson.JSONObject");
    }
}
