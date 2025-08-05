package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.C1238p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.mediaplay.d;
import com.taobao.mediaplay.g;
import com.taobao.mediaplay.l;
import com.taobao.mediaplay.m;
import com.taobao.mediaplay.model.c;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.i;
import com.taobao.taobaoavsdk.util.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* loaded from: classes8.dex */
public class oyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_ENABLE_PRELOAD = "enablePreload";
    public static final String ORANGE_ENABLE_PRELOAD_MIN_SIZE = "enablePreloadMinSize";
    public static final String ORANGE_ENABLE_PRELOAD_OPT = "enablePreloadOpt";

    /* renamed from: a  reason: collision with root package name */
    private static oyv f32501a;

    static {
        kge.a(-1731885830);
    }

    private static oyv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oyv) ipChange.ipc$dispatch("f08eed2", new Object[0]);
        }
        oyv oyvVar = f32501a;
        if (oyvVar != null) {
            return oyvVar;
        }
        oyv oyvVar2 = new oyv();
        f32501a = oyvVar2;
        return oyvVar2;
    }

    public static String a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8213d302", new Object[]{context, jSONObject}) : a(context, jSONObject, (d) null, (HashMap<String, String>) null);
    }

    private static String a(Context context, JSONObject jSONObject, d dVar, HashMap<String, String> hashMap) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3cdbb80", new Object[]{context, jSONObject, dVar, hashMap});
        }
        if (context != null && jSONObject != null) {
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Object opt = jSONObject.opt("bytes");
            int parseInt = (opt == null || !TextUtils.isDigitsOnly(opt.toString())) ? 0 : Integer.parseInt(opt.toString());
            Object opt2 = jSONObject.opt("videoInfoList");
            if (opt2 != null && (opt2 instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) opt2;
                if (jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            Object opt3 = optJSONObject.opt("encodeType");
                            String obj = opt3 == null ? null : opt3.toString();
                            Object opt4 = optJSONObject.opt("url");
                            String obj2 = opt4 == null ? null : opt4.toString();
                            if (obj != null && !TextUtils.isEmpty(obj) && obj2 != null && !TextUtils.isEmpty(obj2)) {
                                hashMap2.put(obj, obj2);
                            }
                            Object opt5 = optJSONObject.opt("cacheKey");
                            String obj3 = opt5 == null ? null : opt5.toString();
                            if (obj != null && !TextUtils.isEmpty(obj) && obj3 != null && !TextUtils.isEmpty(obj3)) {
                                hashMap3.put(obj, obj3);
                            }
                        }
                    }
                }
            }
            if (hashMap2.containsKey("h265")) {
                str2 = (String) hashMap2.get("h265");
                str = (String) hashMap3.get("h265");
            } else {
                str = null;
                str2 = null;
            }
            if (str2 == null || TextUtils.isEmpty(str2)) {
                str2 = (String) hashMap2.get("h264");
                str = (String) hashMap3.get("h264");
            }
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                if (parseInt < 1048576) {
                    parseInt = 1048576;
                }
                if (str2.startsWith(ado.URL_SEPARATOR)) {
                    str2 = "http:" + str2;
                }
                if (str2.contains(".m3u8")) {
                    return null;
                }
                StringBuilder sb = new StringBuilder(100);
                if (str != null && !TextUtils.isEmpty(str)) {
                    sb.append("videoCacheId=" + str);
                }
                String a2 = b.a(str2, sb);
                if (!TextUtils.isEmpty(oyw.a(context, a2))) {
                    if (dVar != null) {
                        try {
                            dVar.a(str2);
                            dVar.a(1048576);
                        } catch (Throwable unused) {
                        }
                    }
                    return str2;
                }
                i a3 = oyw.a(context);
                if (!a3.a()) {
                    return null;
                }
                if (a3.d(a2)) {
                    if (dVar != null) {
                        try {
                            dVar.a(str2);
                            dVar.a(1048576);
                        } catch (Throwable unused2) {
                        }
                    }
                    return str2;
                }
                sb.append("&");
                sb.append("preLoad=true");
                String optString = jSONObject.optString("videoId");
                if (!TextUtils.isEmpty(optString)) {
                    sb.append("&");
                    sb.append("videoId=" + optString);
                }
                if (hashMap != null) {
                    String str3 = hashMap.get("from");
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append("&");
                        sb.append("bizCode=" + str3);
                    }
                    String str4 = hashMap.get(oyw.VIDEO_PLAY_SCENES);
                    if (!TextUtils.isEmpty(str4)) {
                        sb.append("&");
                        sb.append("videoPlayScenes=" + str4);
                    }
                }
                a().a(a3.c(b.a(str2, sb)), b.b(context), parseInt);
                m.a().a(str, str2, dVar);
                if (dVar != null) {
                    try {
                        dVar.a(str2);
                    } catch (Throwable unused3) {
                    }
                }
                return str2;
            }
        }
        return null;
    }

    private static boolean a(Context context, JSONObject jSONObject, int i, MediaPlayControlContext mediaPlayControlContext) {
        Map<String, com.taobao.mediaplay.model.b> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6056c618", new Object[]{context, jSONObject, new Integer(i), mediaPlayControlContext})).booleanValue();
        }
        if (context == null || jSONObject == null || i < -1 || !b.a(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_ENABLE_PRELOAD, "true"))) {
            return false;
        }
        c cVar = new c(jSONObject);
        mediaPlayControlContext.mVideoId = cVar.l();
        return (TextUtils.isEmpty(mediaPlayControlContext.mVideoId) || (a2 = cVar.a()) == null || a2.size() == 0) ? false : true;
    }

    private static MediaPlayControlContext a(Context context, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaPlayControlContext) ipChange.ipc$dispatch("4b2cd1c0", new Object[]{context, jSONObject, new Integer(i)});
        }
        MediaPlayControlContext mediaPlayControlContext = new MediaPlayControlContext(context);
        mediaPlayControlContext.mIsForPreDownload = true;
        if (!a(context, jSONObject, i, mediaPlayControlContext)) {
            return null;
        }
        mediaPlayControlContext.setH265(TaobaoMediaPlayer.isDecoderLoaded());
        mediaPlayControlContext.mConfigGroup = "DWInteractive";
        mediaPlayControlContext.setPlayerType(3);
        mediaPlayControlContext.setMediaInfoParams(jSONObject);
        mediaPlayControlContext.mVideoSource = "TBVideo";
        try {
            new g(mediaPlayControlContext).a(new com.taobao.mediaplay.c() { // from class: tb.oyx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.mediaplay.c
                public void a(boolean z, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                    }
                }
            });
            return mediaPlayControlContext;
        } catch (Exception unused) {
            return null;
        }
    }

    private static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i4 = C1238p.b;
        int b = b.b(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_ENABLE_PRELOAD_MIN_SIZE, "102400"));
        if (b > 0) {
            i4 = b;
        }
        return (i == -1 || i > i3) ? i3 : (i != 0 || i2 <= 262144) ? i < i4 ? i4 : i : i2;
    }

    public static String a(Context context, JSONObject jSONObject, int i, d dVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0702b07", new Object[]{context, jSONObject, new Integer(i), dVar, hashMap}) : b(context, jSONObject, i, dVar, hashMap);
    }

    public static String a(Context context, JSONObject jSONObject, int i, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e36a5f26", new Object[]{context, jSONObject, new Integer(i), dVar}) : b(context, jSONObject, i, dVar, null);
    }

    public static String b(Context context, JSONObject jSONObject, int i, d dVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de7c54e6", new Object[]{context, jSONObject, new Integer(i), dVar, hashMap});
        }
        MediaPlayControlContext a2 = a(context, jSONObject, i);
        if (a2 == null) {
            return null;
        }
        String videoUrl = a2.getVideoUrl();
        String str = a2.mVideoId;
        if (TextUtils.isEmpty(videoUrl) || TextUtils.isEmpty(str)) {
            return null;
        }
        String cacheKey = a2.getCacheKey();
        int videoLength = a2.getVideoLength();
        int a3 = a(i, a2.getPlayableBytes(), videoLength);
        if (videoUrl.startsWith(ado.URL_SEPARATOR)) {
            videoUrl = "http:" + videoUrl;
        }
        StringBuilder sb = new StringBuilder(256);
        if (cacheKey != null && !TextUtils.isEmpty(cacheKey)) {
            sb.append("videoCacheId=" + cacheKey);
        }
        String a4 = b.a(videoUrl, sb);
        if (!TextUtils.isEmpty(oyw.a(context, a4))) {
            try {
                dVar.a(videoUrl);
                dVar.a(a3);
            } catch (Throwable unused) {
            }
            return videoUrl;
        }
        i a5 = oyw.a(context);
        if (!a5.a()) {
            return null;
        }
        if (!b.a(OrangeConfig.getInstance().getConfig("DWInteractive", ORANGE_ENABLE_PRELOAD_OPT, "true")) && a5.d(a4)) {
            try {
                dVar.a(videoUrl);
                dVar.a(a3);
            } catch (Throwable unused2) {
            }
            return videoUrl;
        }
        sb.append("&");
        sb.append("preLoad=true");
        sb.append("&");
        sb.append("videoId=" + str);
        if (videoLength > 0) {
            sb.append("&");
            sb.append("videoLength=" + videoLength);
        }
        if (hashMap != null) {
            String str2 = hashMap.get("from");
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&");
                sb.append("bizCode=" + str2);
            }
            String str3 = hashMap.get(oyw.VIDEO_PLAY_SCENES);
            if (!TextUtils.isEmpty(str3)) {
                sb.append("&");
                sb.append("videoPlayScenes=" + str3);
            }
        }
        oyu.a(MediaConstant.ABTEST_TAG_BUFFERED_SIZE);
        if (oyu.w && oyu.u != null && hashMap != null && hashMap.get("from") != null && oyu.u.contains(hashMap.get("from")) && oyu.x) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append("&");
            }
            sb.append("preloadNetCutSize=" + oyu.t);
        }
        a().a(a5.c(b.a(videoUrl, sb)), b.b(context), a3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", videoUrl);
        hashMap2.put("bitrate", "" + a2.getCurrentBitRate());
        hashMap2.put(a.ATOM_length, "" + videoLength);
        hashMap2.put("cacheKey", cacheKey);
        hashMap2.put("videoDefinition", a2.getVideoDefinition());
        hashMap2.put("bitRateMap", a2.mBitRateMapStr);
        hashMap2.put("selectReason", String.valueOf(a2.mSelectReasonForPreDownload));
        hashMap2.put("calNetSpeed", String.valueOf(a2.mNetSpeedForPreDownload));
        hashMap2.put("calNetSpeedByRobust", String.valueOf(a2.mNetSpeedByRobustAtPreDL));
        hashMap2.put("calNetSpeedReason", String.valueOf(a2.mNetSpeedCalReasonForPreDL));
        hashMap2.put("useRecDataTime", String.valueOf(a2.mUseRecDataTime ? 1 : 0));
        hashMap2.put("defDegradeReason", String.valueOf(a2.mDefDegradeReason));
        hashMap2.put("ud265BitRate", String.valueOf(a2.mUD265BitRate));
        hashMap2.put("hd265BitRate", String.valueOf(a2.mHD265BitRate));
        hashMap2.put("ud266BitRate", String.valueOf(a2.mUD266BitRate));
        hashMap2.put("hd266BitRate", String.valueOf(a2.mHD266BitRate));
        hashMap2.put("hd264BitRate", String.valueOf(a2.mHD264BitRate));
        hashMap2.put("hasChooseS266", String.valueOf(a2.mHasChooseS266));
        l.a().a(str, hashMap2);
        m.a().a(cacheKey, videoUrl, dVar);
        if (dVar != null) {
            try {
                dVar.a(videoUrl);
            } catch (Throwable unused3) {
            }
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "preLoadWithVideoInfoInner final pickUrl=" + videoUrl);
        return videoUrl;
    }

    public static boolean b(Context context, JSONObject jSONObject) {
        Map<String, String> o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83fd6723", new Object[]{context, jSONObject})).booleanValue();
        }
        if (context != null && jSONObject != null && (o = new c(jSONObject).o()) != null) {
            for (Map.Entry<String, String> entry : o.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (oyu.a(context, key, value) > 0) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "isHitCacheWithMediaInfo: cacheKey=" + key + ",url=" + value + " is hitCache.");
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(Context context, String str) {
        i a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context == null || TextUtils.isEmpty(str) || (a2 = oyw.a(context)) == null) {
        } else {
            boolean startsWith = str.startsWith("http");
            String a3 = startsWith ? m.a().a(str) : str;
            if (!TextUtils.isEmpty(a3)) {
                a2.b(a3);
            }
            if (startsWith) {
                m.a().b(str);
            } else {
                m.a().c(str);
            }
        }
    }
}
