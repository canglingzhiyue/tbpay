package com.taobao.tao.flexbox.layoutmanager.player.videodecide;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.model.MediaVideoInfoRequestV2;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobaoavsdk.util.f;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONException;
import tb.akt;
import tb.kge;
import tb.oec;
import tb.ogg;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARRAY_KEY_CACHES = "caches";
    public static final String ARRAY_KEY_CONFIGURATION = "configuration";
    public static final String ARRAY_KEY_DEFINITIONPRIORITY = "definitionPriority";
    public static final String ARRAY_KEY_ENABLEVODABR = "enableVodAbr";
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
    public static Map<String, String> f20479a;
    public static com.taobao.tao.flexbox.layoutmanager.player.videodecide.a b;
    public static Map<String, a> c;
    public static long d;
    private static final b e;
    private static float f;

    static {
        kge.a(-1025653753);
        d = 0L;
        e = new b();
    }

    public static boolean a(TBVideoComponent.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c70ba33", new Object[]{cVar})).booleanValue() : b(cVar) || c(cVar);
    }

    public static boolean b(TBVideoComponent.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ebb6f12", new Object[]{cVar})).booleanValue() : cVar.K == 1;
    }

    public static boolean c(TBVideoComponent.c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("110623f1", new Object[]{cVar})).booleanValue() : cVar.K == 2;
    }

    public static void a(final IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{iRemoteBaseListener});
            return;
        }
        MediaVideoInfoRequestV2 mediaVideoInfoRequestV2 = new MediaVideoInfoRequestV2();
        mediaVideoInfoRequestV2.videoId = 0L;
        mediaVideoInfoRequestV2.source = "guangguang";
        mediaVideoInfoRequestV2.type = "prefetch_bitopti";
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put(com.taobao.android.fluid.framework.data.remote.c.KEY_NETWORK_SPEED, Integer.valueOf(f.a()));
            hashMap.put(com.taobao.android.fluid.framework.data.remote.c.KEY_ENABLE_SERVER_ABR, "true");
            mediaVideoInfoRequestV2.extendParameters = JSON.toJSONString(hashMap);
        } catch (Exception unused) {
        }
        ogg.d("VideoControllerManager", "开始请求");
        MtopModule.requestWithParser(new g.c(null, mediaVideoInfoRequestV2.toJsonObject(), null), new IRemoteBaseListener() { // from class: com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = IRemoteBaseListener.this;
                if (iRemoteBaseListener2 == null) {
                    return;
                }
                iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    c.a(oec.a(JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data").getJSONObject("config").get("bitrateOptiConfig"), (String) null));
                    if (IRemoteBaseListener.this == null) {
                        return;
                    }
                    IRemoteBaseListener.this.onSuccess(i, mtopResponse, baseOutDo, obj);
                } catch (Throwable th) {
                    ogg.a("VideoControllerManager", "requestVideoInfo failed: " + th);
                }
            }
        }, null);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (str == null) {
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                f20479a = new HashMap();
                if (parseObject.getString("enable") == null) {
                    return;
                }
                f20479a.put("enable", parseObject.getString("enable"));
                f20479a.put("p_t", parseObject.getString("p_t"));
                f20479a.put("nb_t", parseObject.getString("nb_t"));
                f20479a.put("nspeed_t", parseObject.getString("nspeed_t"));
                f20479a.put("pr_e", parseObject.getString("pr_e"));
                f20479a.put("prt_e", parseObject.getString("prt_e"));
                f20479a.put("limitDeviceScore", parseObject.getString("limitDeviceScore"));
                a(true);
            } catch (Throwable th) {
                ogg.a("VideoControllerManager", "updateBitrateConfig failed: " + th);
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a((com.taobao.tao.flexbox.layoutmanager.player.videodecide.a) null);
    }

    public static org.json.JSONObject a(org.json.JSONObject jSONObject, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (org.json.JSONObject) ipChange.ipc$dispatch("1edf37f5", new Object[]{jSONObject, new Boolean(z), map}) : a(jSONObject, null, z, false, map);
    }

    public static org.json.JSONObject a(org.json.JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (org.json.JSONObject) ipChange.ipc$dispatch("e17fcd2c", new Object[]{jSONObject, new Boolean(z)}) : !a((com.taobao.tao.flexbox.layoutmanager.player.videodecide.a) null) ? jSONObject : a(jSONObject, null, z, false);
    }

    public static org.json.JSONObject a(org.json.JSONObject jSONObject, com.taobao.tao.flexbox.layoutmanager.player.videodecide.a aVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (org.json.JSONObject) ipChange.ipc$dispatch("fb4e6089", new Object[]{jSONObject, aVar, new Boolean(z), new Boolean(z2)}) : a(jSONObject, aVar, z, z2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133 A[Catch: Throwable -> 0x024d, TRY_LEAVE, TryCatch #5 {Throwable -> 0x024d, blocks: (B:16:0x004d, B:19:0x0054, B:63:0x0133, B:73:0x014f, B:76:0x0156, B:78:0x0184, B:80:0x018d, B:83:0x0198, B:85:0x01a0, B:87:0x01cb, B:89:0x01d1, B:94:0x01d9, B:95:0x01db, B:97:0x01ed, B:98:0x01ef, B:100:0x0211, B:101:0x0213, B:104:0x021c, B:106:0x023f, B:59:0x0126, B:9:0x003c, B:12:0x0042, B:13:0x0047, B:67:0x0140), top: B:117:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140 A[Catch: Throwable -> 0x0145, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Throwable -> 0x024d, blocks: (B:16:0x004d, B:19:0x0054, B:63:0x0133, B:73:0x014f, B:76:0x0156, B:78:0x0184, B:80:0x018d, B:83:0x0198, B:85:0x01a0, B:87:0x01cb, B:89:0x01d1, B:94:0x01d9, B:95:0x01db, B:97:0x01ed, B:98:0x01ef, B:100:0x0211, B:101:0x0213, B:104:0x021c, B:106:0x023f, B:59:0x0126, B:9:0x003c, B:12:0x0042, B:13:0x0047, B:67:0x0140), top: B:117:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156 A[Catch: Throwable -> 0x024d, TryCatch #5 {Throwable -> 0x024d, blocks: (B:16:0x004d, B:19:0x0054, B:63:0x0133, B:73:0x014f, B:76:0x0156, B:78:0x0184, B:80:0x018d, B:83:0x0198, B:85:0x01a0, B:87:0x01cb, B:89:0x01d1, B:94:0x01d9, B:95:0x01db, B:97:0x01ed, B:98:0x01ef, B:100:0x0211, B:101:0x0213, B:104:0x021c, B:106:0x023f, B:59:0x0126, B:9:0x003c, B:12:0x0042, B:13:0x0047, B:67:0x0140), top: B:117:0x003c }] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17, types: [double] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONObject a(org.json.JSONObject r24, com.taobao.tao.flexbox.layoutmanager.player.videodecide.a r25, boolean r26, boolean r27, java.util.Map<java.lang.String, java.lang.String> r28) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.a(org.json.JSONObject, com.taobao.tao.flexbox.layoutmanager.player.videodecide.a, boolean, boolean, java.util.Map):org.json.JSONObject");
    }

    public static void a(org.json.JSONObject jSONObject, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9687907", new Object[]{jSONObject, new Integer(i), new Boolean(z)});
        } else if (!a((com.taobao.tao.flexbox.layoutmanager.player.videodecide.a) null) || jSONObject == null) {
        } else {
            try {
                String string = jSONObject.getString("id");
                JSONArray jSONArray = jSONObject.getJSONArray("resources");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    return;
                }
                String string2 = jSONArray.getJSONObject(0).getString("cacheKey");
                a a2 = a(string, (com.taobao.tao.flexbox.layoutmanager.player.videodecide.a) null, false);
                if (a2 == null || !StringUtils.equals(a2.b, string2)) {
                    return;
                }
                a2.e = i;
                a2.f = z;
            } catch (Throwable th) {
                ogg.a("VideoControllerManager", th.getMessage());
            }
        }
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
        } else if (!a((com.taobao.tao.flexbox.layoutmanager.player.videodecide.a) null)) {
        } else {
            a(str, z, false);
        }
    }

    public static a b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7e7352b5", new Object[]{str}) : a(str, (com.taobao.tao.flexbox.layoutmanager.player.videodecide.a) null, false);
    }

    private static com.taobao.tao.flexbox.layoutmanager.player.videodecide.a a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.player.videodecide.a) ipChange.ipc$dispatch("ae78e0d", new Object[]{new Boolean(z)});
        }
        try {
            if (b == null || z) {
                b = new com.taobao.tao.flexbox.layoutmanager.player.videodecide.a();
                if (f20479a != null) {
                    b.b = oec.a((Object) f20479a.get("enable"), false);
                    b.c = oec.a((Object) f20479a.get("p_t"), 0.5f);
                    b.d = oec.b(f20479a.get("nb_t"), 3);
                    b.e = oec.a((Object) f20479a.get("nspeed_t"), 0);
                    b.f = oec.a((Object) f20479a.get("limitDeviceScore"), -1);
                }
            }
            return b;
        } catch (Throwable th) {
            ogg.a("VideoControllerManager", th.getMessage());
            return null;
        }
    }

    private static a a(String str, org.json.JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c6e18b4a", new Object[]{str, jSONObject, new Boolean(z)});
        }
        if (jSONObject == null) {
            return null;
        }
        if (c == null) {
            c = new HashMap();
        }
        String b2 = b(str, z);
        a aVar = c.get(b2);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.a(jSONObject);
        if (!z) {
            c.put(b2, aVar);
        }
        return aVar;
    }

    private static a a(String str, com.taobao.tao.flexbox.layoutmanager.player.videodecide.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a2e174f7", new Object[]{str, aVar, new Boolean(z)});
        }
        if (!a(aVar)) {
            return null;
        }
        try {
            if (c == null) {
                c = new HashMap();
            }
            return c.get(b(str, z));
        } catch (Throwable th) {
            ogg.a("VideoControllerManager", th.getMessage());
            return null;
        }
    }

    private static void a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a6232", new Object[]{str, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            if (c == null) {
                c = new HashMap();
            }
            String b2 = b(str, z2);
            a aVar = c.get(b2);
            if (aVar == null) {
                aVar = new a();
            }
            aVar.h = z;
            c.put(b2, aVar);
        } catch (Throwable th) {
            ogg.a("VideoControllerManager", th.getMessage());
        }
    }

    private static String b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("645552ff", new Object[]{str, new Boolean(z)});
        }
        if (!z) {
            return str;
        }
        return "newDetail" + str;
    }

    private static int a(org.json.JSONObject jSONObject, float f2, a aVar, float f3, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf51351f", new Object[]{jSONObject, new Float(f2), aVar, new Float(f3), new Float(f4), new Boolean(z)})).intValue();
        }
        if (jSONObject == null) {
            return -2;
        }
        try {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(ARRAY_KEY_CONFIGURATION);
            if (optJSONObject != null && optJSONObject.optBoolean(ARRAY_KEY_ENABLEVODABR)) {
                ogg.a("VideoControllerManager", " 决策 enableVodAbr=true，不决策，直接透传给播放器");
                return -9;
            } else if (f2 == 0.0f) {
                ogg.a("VideoControllerManager", "cflog 决策 网速0，不决策");
                return -1;
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("resources");
                if (optJSONArray != null && optJSONArray.length() > 2) {
                    if (aVar != null && aVar.h) {
                        return -7;
                    }
                    int i = aVar != null ? aVar.d : 0;
                    int i2 = aVar != null ? aVar.e : 0;
                    String str = aVar != null ? aVar.b : "";
                    if (z && i2 > 0) {
                        ogg.a("VideoControllerManager", "cflog 决策。 预下载逻辑。 非首次下载，则不再决策，直接使用当前下载的策略。bestCacheKey=" + str);
                    } else if (aVar == null || !aVar.g || !a(jSONObject, aVar.b)) {
                        float f5 = i > 0 ? (i2 * 8.0f) / (i * 1000) : 0.0f;
                        if (f5 >= f4 && a(jSONObject, str)) {
                            ogg.a("VideoControllerManager", "cflog 决策。 当前码率已经下载足够了，则不再重新决策。downTime=" + f5 + " bestCacheKey=" + str);
                        } else {
                            str = a(f2, f3, optJSONArray);
                        }
                    }
                    if (StringUtils.isEmpty(str)) {
                        return -2;
                    }
                    String a2 = a(jSONObject, "caches", str);
                    a(jSONObject, "resources", str);
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("definitionPriority");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 2 || !(optJSONArray2.get(0) instanceof String)) {
                        return 1;
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(0, a2);
                    jSONArray.put(1, optJSONArray2.getString(1));
                    jSONObject.put("definitionPriority", jSONArray);
                    return 1;
                }
                ogg.a("VideoControllerManager", "cflog 决策 单流码率，走老逻辑，不决策");
                return -4;
            }
        } catch (Throwable th) {
            ogg.a("VideoControllerManager", th.getMessage());
            return -2;
        }
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
            ogg.a("VideoControllerManager", th.getMessage());
            return "";
        }
    }

    private static boolean a(org.json.JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6e96a4", new Object[]{jSONObject, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
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

    private static boolean a(com.taobao.tao.flexbox.layoutmanager.player.videodecide.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d82d20d", new Object[]{aVar})).booleanValue();
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
        ogg.a("VideoControllerManager", "cflog 开始网速码率匹配，netSpeed=" + f2 + " abRatio=" + f3);
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
                ogg.a("VideoControllerManager", "cflog --》i " + i2 + " ratio=" + f4 + " definition = " + string);
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

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20480a;
        public String b;
        public String c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public a j;
        public String k = "";
        public String l;

        static {
            kge.a(155872261);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.l;
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
                    JSONArray optJSONArray = jSONObject.optJSONArray("resources");
                    String str2 = "";
                    if (optJSONArray != null) {
                        String str3 = str2;
                        int i2 = 0;
                        while (i < optJSONArray.length()) {
                            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("definition");
                            this.k += optString;
                            if (i < optJSONArray.length() - 1) {
                                this.k += "#";
                            }
                            if (i == 0) {
                                i2 = jSONObject2.getInt("bitrate");
                                str3 = jSONObject2.getString("cacheKey");
                                str2 = optString;
                            }
                            i++;
                        }
                        str = str2;
                        str2 = str3;
                        i = i2;
                    } else {
                        str = str2;
                    }
                    this.b = str2;
                    this.d = i;
                    this.c = str;
                    this.f20480a = string;
                } catch (Throwable th) {
                    ogg.a("VideoControllerManager", th.getMessage());
                }
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DecidedVideoResModel{videoId='" + this.f20480a + "', downCacheKey='" + this.b + "', definition='" + this.c + "', downBitrate=" + this.d + ", downSize=" + this.e + '}';
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20481a;

        static {
            kge.a(-172773228);
        }

        private b() {
            this.f20481a = "";
        }

        public b a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e8c99f5d", new Object[]{this, str, str2});
            }
            this.f20481a += str + ":" + str2 + ",";
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("949d7449", new Object[]{this});
            }
            this.f20481a = "";
            return this;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f20481a;
        }

        public b a(String str, org.json.JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c4dc92ad", new Object[]{this, str, jSONObject});
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

    public static float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[0])).floatValue();
        }
        if (f <= 0.0f) {
            f = akt.b();
        }
        return f;
    }
}
