package com.taobao.android.detail2.core.framework.base.media.videodecide;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import tb.akt;
import tb.fjt;
import tb.fkd;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARRAY_KEY_CACHES = "caches";
    public static final String ARRAY_KEY_DEFINITIONPRIORITY = "definitionPriority";
    public static final String ARRAY_KEY_RESOURCES = "resources";
    public static final int HD_AB_STRATEGY1 = 1;
    public static final int HD_AB_STRATEGY2 = 2;
    public static final String KEY_BITRATE = "bitrate";
    public static final String KEY_CACHEKEY = "cacheKey";
    public static final String KEY_DEFINITION = "definition";
    public static final String KEY_ID = "id";
    public static final String TAG = "VideoControllerManager";
    public static final long UPDATE_CONFIG_INTERNAL = 5000;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f11476a;
    public static com.taobao.android.detail2.core.framework.base.media.videodecide.a b;
    public static Map<String, a> c;
    public static long d;
    private static final C0455b e;
    private static float f;

    static {
        kge.a(347908779);
        d = 0L;
        e = new C0455b(null);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (str == null) {
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                f11476a = new HashMap();
                if (parseObject.getString("enable") == null) {
                    return;
                }
                f11476a.put("enable", parseObject.getString("enable"));
                f11476a.put("p_t", parseObject.getString("p_t"));
                f11476a.put("nb_t", parseObject.getString("nb_t"));
                f11476a.put("nspeed_t", parseObject.getString("nspeed_t"));
                f11476a.put("pr_e", parseObject.getString("pr_e"));
                f11476a.put("prt_e", parseObject.getString("prt_e"));
                f11476a.put("limitDeviceScore", parseObject.getString("limitDeviceScore"));
                a(true);
            } catch (Throwable th) {
                fjt.a("VideoControllerManager", "updateBitrateConfig failed: " + th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[Catch: Throwable -> 0x0130, TRY_LEAVE, TryCatch #2 {Throwable -> 0x0130, blocks: (B:59:0x0127, B:73:0x014f, B:76:0x0156, B:78:0x0182, B:80:0x018b, B:83:0x0195, B:85:0x019e, B:87:0x01c6, B:89:0x01cc, B:94:0x01d4, B:95:0x01d6, B:97:0x01e6, B:99:0x01eb, B:101:0x020d, B:102:0x020f, B:55:0x011b, B:66:0x0139), top: B:110:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139 A[Catch: Throwable -> 0x0140, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Throwable -> 0x0130, blocks: (B:59:0x0127, B:73:0x014f, B:76:0x0156, B:78:0x0182, B:80:0x018b, B:83:0x0195, B:85:0x019e, B:87:0x01c6, B:89:0x01cc, B:94:0x01d4, B:95:0x01d6, B:97:0x01e6, B:99:0x01eb, B:101:0x020d, B:102:0x020f, B:55:0x011b, B:66:0x0139), top: B:110:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156 A[Catch: Throwable -> 0x0130, TryCatch #2 {Throwable -> 0x0130, blocks: (B:59:0x0127, B:73:0x014f, B:76:0x0156, B:78:0x0182, B:80:0x018b, B:83:0x0195, B:85:0x019e, B:87:0x01c6, B:89:0x01cc, B:94:0x01d4, B:95:0x01d6, B:97:0x01e6, B:99:0x01eb, B:101:0x020d, B:102:0x020f, B:55:0x011b, B:66:0x0139), top: B:110:0x011b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject a(org.json.JSONObject r24, com.taobao.android.detail2.core.framework.base.media.videodecide.a r25, boolean r26, boolean r27, com.taobao.android.detail2.core.framework.data.model.d r28) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.base.media.videodecide.b.a(org.json.JSONObject, com.taobao.android.detail2.core.framework.base.media.videodecide.a, boolean, boolean, com.taobao.android.detail2.core.framework.data.model.d):org.json.JSONObject");
    }

    public static void a(org.json.JSONObject jSONObject, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9687907", new Object[]{jSONObject, new Integer(i), new Boolean(z)});
        } else if (!a((com.taobao.android.detail2.core.framework.base.media.videodecide.a) null) || jSONObject == null) {
        } else {
            try {
                String string = jSONObject.getString("id");
                JSONArray jSONArray = jSONObject.getJSONArray("resources");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    return;
                }
                String string2 = jSONArray.getJSONObject(0).getString("cacheKey");
                a a2 = a(string, (com.taobao.android.detail2.core.framework.base.media.videodecide.a) null, false);
                if (a2 == null || !TextUtils.equals(a2.b, string2)) {
                    return;
                }
                a2.e = i;
                a2.f = z;
            } catch (Throwable th) {
                fjt.a("VideoControllerManager", th.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r5.C() == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.taobao.android.detail2.core.framework.data.model.d r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail2.core.framework.base.media.videodecide.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "a363f7be"
            r0.ipc$dispatch(r5, r1)
            return
        L12:
            java.lang.String r0 = "VideoControllerManager"
            if (r5 == 0) goto L1c
            tb.fkr r1 = r5.C()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L38
        L1c:
            boolean r1 = tb.fkt.au()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r1.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "when buildDefaultAbrModel is called.the itemNode is null . abort and return. itemNode = "
            r1.append(r2)     // Catch: java.lang.Throwable -> L8f
            r1.append(r5)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L8f
            tb.fjt.a(r0, r5)     // Catch: java.lang.Throwable -> L8f
            return
        L38:
            com.taobao.android.detail2.core.framework.base.media.videodecide.a r1 = com.taobao.android.detail2.core.framework.base.media.videodecide.b.b     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8e
            com.taobao.android.detail2.core.framework.base.media.videodecide.a r1 = new com.taobao.android.detail2.core.framework.base.media.videodecide.a     // Catch: java.lang.Throwable -> L8f
            r1.<init>()     // Catch: java.lang.Throwable -> L8f
            com.taobao.android.detail2.core.framework.base.media.videodecide.b.b = r1     // Catch: java.lang.Throwable -> L8f
            r1.b = r3     // Catch: java.lang.Throwable -> L8f
            com.alibaba.fastjson.JSONObject r5 = r5.H()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "videoStreamSelectConfig"
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r1)     // Catch: java.lang.Throwable -> L8f
            com.taobao.android.detail2.core.framework.base.media.videodecide.a r1 = com.taobao.android.detail2.core.framework.base.media.videodecide.b.b     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "preLoadTime"
            java.lang.Object r3 = r5.get(r3)     // Catch: java.lang.Throwable -> L8f
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = tb.fkd.a(r3, r4)     // Catch: java.lang.Throwable -> L8f
            r1.c = r3     // Catch: java.lang.Throwable -> L8f
            com.taobao.android.detail2.core.framework.base.media.videodecide.a r1 = com.taobao.android.detail2.core.framework.base.media.videodecide.b.b     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "ratio"
            java.lang.Object r3 = r5.get(r3)     // Catch: java.lang.Throwable -> L8f
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = tb.fkd.a(r3, r4)     // Catch: java.lang.Throwable -> L8f
            r1.d = r3     // Catch: java.lang.Throwable -> L8f
            com.taobao.android.detail2.core.framework.base.media.videodecide.a r1 = com.taobao.android.detail2.core.framework.base.media.videodecide.b.b     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "netSpeedType"
            java.lang.Object r3 = r5.get(r3)     // Catch: java.lang.Throwable -> L8f
            int r2 = tb.fkd.a(r3, r2)     // Catch: java.lang.Throwable -> L8f
            r1.e = r2     // Catch: java.lang.Throwable -> L8f
            com.taobao.android.detail2.core.framework.base.media.videodecide.a r1 = com.taobao.android.detail2.core.framework.base.media.videodecide.b.b     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "limitDeviceScore"
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Throwable -> L8f
            r2 = -1
            int r5 = tb.fkd.a(r5, r2)     // Catch: java.lang.Throwable -> L8f
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L8f
            r1.f = r5     // Catch: java.lang.Throwable -> L8f
        L8e:
            return
        L8f:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            tb.fjt.a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.base.media.videodecide.b.a(com.taobao.android.detail2.core.framework.data.model.d):void");
    }

    private static com.taobao.android.detail2.core.framework.base.media.videodecide.a a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.base.media.videodecide.a) ipChange.ipc$dispatch("b2f8a32d", new Object[]{new Boolean(z)});
        }
        try {
            if (b == null || z) {
                b = new com.taobao.android.detail2.core.framework.base.media.videodecide.a();
                if (f11476a != null) {
                    b.b = fkd.a((Object) f11476a.get("enable"), false);
                    b.c = fkd.a((Object) f11476a.get("p_t"), 0.5f);
                    b.d = fkd.a((Object) f11476a.get("nb_t"), 3.0f);
                    b.e = fkd.a((Object) f11476a.get("nspeed_t"), 0);
                    b.f = fkd.a((Object) f11476a.get("limitDeviceScore"), -1);
                }
            }
            return b;
        } catch (Throwable th) {
            fjt.a("VideoControllerManager", th.getMessage());
            return null;
        }
    }

    private static a a(String str, org.json.JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fb242753", new Object[]{str, jSONObject, new Boolean(z)});
        }
        if (jSONObject == null) {
            return null;
        }
        if (c == null) {
            c = new HashMap();
        }
        String a2 = a(str, z);
        a aVar = c.get(a2);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.a(jSONObject);
        if (!z) {
            c.put(a2, aVar);
        }
        return aVar;
    }

    private static a a(String str, com.taobao.android.detail2.core.framework.base.media.videodecide.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ed525ebc", new Object[]{str, aVar, new Boolean(z)});
        }
        if (!a(aVar)) {
            return null;
        }
        try {
            if (c == null) {
                c = new HashMap();
            }
            return c.get(a(str, z));
        } catch (Throwable th) {
            fjt.a("VideoControllerManager", th.getMessage());
            return null;
        }
    }

    private static String a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7b527fe", new Object[]{str, new Boolean(z)});
        }
        if (!z) {
            return str;
        }
        return "newDetail" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[Catch: Throwable -> 0x0132, TryCatch #0 {Throwable -> 0x0132, blocks: (B:11:0x0057, B:13:0x005e, B:15:0x0064, B:19:0x006e, B:27:0x007b, B:30:0x0081, B:33:0x0087, B:37:0x0090, B:57:0x00f2, B:60:0x00f9, B:62:0x0108, B:64:0x010e, B:66:0x0117, B:39:0x00a7, B:41:0x00ab, B:45:0x00b6, B:49:0x00c6, B:51:0x00cc, B:53:0x00ea, B:68:0x012b), top: B:74:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(org.json.JSONObject r16, float r17, com.taobao.android.detail2.core.framework.base.media.videodecide.b.a r18, float r19, float r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.base.media.videodecide.b.a(org.json.JSONObject, float, com.taobao.android.detail2.core.framework.base.media.videodecide.b$a, float, float, boolean):int");
    }

    private static String a(org.json.JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71c53d76", new Object[]{jSONObject, str, str2});
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray == null || jSONArray.length() <= 2) {
                return "";
            }
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(1);
            org.json.JSONObject jSONObject3 = null;
            int i = 0;
            while (true) {
                if (i < jSONArray.length()) {
                    org.json.JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                    String string = jSONObject4.getString("cacheKey");
                    if (string != null && string.equalsIgnoreCase(str2)) {
                        jSONObject3 = jSONObject4;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (jSONObject3 == null) {
                return "";
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(0, jSONObject3);
            jSONArray2.put(1, jSONObject2);
            jSONObject.put(str, jSONArray2);
            return jSONObject3.getString("definition");
        } catch (Throwable th) {
            fjt.a("VideoControllerManager", th.getMessage());
            return "";
        }
    }

    private static boolean a(org.json.JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6e96a4", new Object[]{jSONObject, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("caches");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getJSONObject(i).getString("cacheKey");
                if (string != null && string.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean a(com.taobao.android.detail2.core.framework.base.media.videodecide.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bb5402f", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null) {
            aVar = a(false);
        }
        return aVar != null && aVar.a();
    }

    private static String a(float f2, float f3, JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bd821de", new Object[]{new Float(f2), new Float(f3), jSONArray});
        }
        if (jSONArray == null) {
            return null;
        }
        fjt.a("VideoControllerManager", "cflog 开始网速码率匹配，netSpeed=" + f2 + " abRatio=" + f3);
        org.json.JSONObject jSONObject = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (i2 < jSONArray.length()) {
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            int i4 = jSONObject2.getInt("bitrate");
            String string = jSONObject2.getString("definition");
            if (i2 != i) {
                float f4 = i4 > 0 ? f2 / i4 : 0.0f;
                fjt.a("VideoControllerManager", "cflog --》i " + i2 + " ratio=" + f4 + " definition = " + string);
                if (i2 == 0) {
                    z = f4 >= f3;
                } else if (f4 >= f3) {
                    if (!z || i4 > i3) {
                        jSONObject = jSONObject2;
                        i3 = i4;
                    }
                    z = true;
                } else if (!z) {
                    if (i4 >= i3) {
                    }
                }
                jSONObject = jSONObject2;
                i3 = i4;
            }
            i2++;
            i = 1;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("cacheKey");
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11477a;
        public String b;
        public String c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public a j;
        public String k;

        static {
            kge.a(-2122132511);
        }

        public void a(org.json.JSONObject jSONObject) {
            String str;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
            } else {
                try {
                    String string = jSONObject.getString("id");
                    JSONArray jSONArray = jSONObject.getJSONArray("resources");
                    String str2 = "";
                    if (jSONArray == null || jSONArray.length() <= 0) {
                        str = str2;
                    } else {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        i = jSONObject2.getInt("bitrate");
                        str2 = jSONObject2.getString("cacheKey");
                        str = jSONObject2.getString("definition");
                    }
                    this.b = str2;
                    this.d = i;
                    this.c = str;
                    this.f11477a = string;
                } catch (Throwable th) {
                    fjt.a("VideoControllerManager", th.getMessage());
                }
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DecidedVideoResModel{videoId='" + this.f11477a + "', downCacheKey='" + this.b + "', definition='" + this.c + "', downBitrate=" + this.d + ", downSize=" + this.e + '}';
        }
    }

    /* renamed from: com.taobao.android.detail2.core.framework.base.media.videodecide.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0455b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f11478a;

        static {
            kge.a(-176751760);
        }

        private C0455b() {
            this.f11478a = "";
        }

        public /* synthetic */ C0455b(VideoControllerManager$1 videoControllerManager$1) {
            this();
        }

        public C0455b a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0455b) ipChange.ipc$dispatch("c7a145fe", new Object[]{this, str, str2});
            }
            this.f11478a += str + ":" + str2 + ",";
            return this;
        }

        public C0455b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0455b) ipChange.ipc$dispatch("be903a92", new Object[]{this});
            }
            this.f11478a = "";
            return this;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f11478a;
        }

        public C0455b a(String str, org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0455b) ipChange.ipc$dispatch("6d230cae", new Object[]{this, str, jSONObject});
            }
            String str2 = "";
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("resources");
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        int i2 = jSONObject2.getInt("bitrate");
                        str2 = str2 + jSONObject2.getString("definition") + "@" + i2 + "|";
                    }
                }
            } catch (Throwable unused) {
            }
            a(str, str2);
            return this;
        }
    }

    public static float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[0])).floatValue();
        }
        if (f <= 0.0f) {
            f = akt.b();
        }
        return f;
    }
}
