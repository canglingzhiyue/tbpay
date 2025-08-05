package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes5.dex */
public class soo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIDEO_INTERNAL_BG_SAVE_EXPOSED = "VIDEO_INTERNAL_BG_SAVE_EXPOSED";
    public static final String VIDEO_INTERNAL_BG_SAVE_UNEXPOSED_OR_EXPOSED = "VIDEO_INTERNAL_BG_SAVE_UNEXPOSED_OR_EXPOSED";

    /* renamed from: a  reason: collision with root package name */
    public boolean f33774a;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean p;
    private boolean u;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public long[] o = null;

    static {
        kge.a(-1693256690);
    }

    public soo(JSONObject jSONObject) {
        a(jSONObject);
        this.p = true;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = null;
        try {
            if (!ogv.a(jSONObject)) {
                Object obj = jSONObject.get("prefetchConfig");
                if ((obj instanceof Map) && !ogv.a((Map) obj)) {
                    jSONObject2 = (JSONObject) obj;
                    spz.c("PickPreloadController_PreloadABConfig_PreloadVideoModule", "PickPreloadControllerNew,initABConfig,优先从preloadArgs读取");
                }
            }
            if (ogv.a(jSONObject2)) {
                jSONObject2 = (JSONObject) ohh.b("TBVIDESDK_RED_POINT_PRELOAD_CONFIG");
            }
            if (ogv.a(jSONObject2)) {
                return;
            }
            b(jSONObject2);
            c(jSONObject2);
        } catch (Throwable th) {
            spz.a("PickPreloadController_PreloadABConfig_PreloadVideoModule", th.getMessage(), th);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (!ogv.a(jSONObject)) {
            this.f33774a = jSONObject.getBooleanValue("enable");
            this.c = oec.a(jSONObject.get("pdl_size"), 819200L);
            this.d = jSONObject.getLongValue("e_dura") * 1000;
            this.e = jSONObject.getLongValue("re_dura") * 1000;
            this.g = jSONObject.getBooleanValue("enable_net_state");
            this.h = jSONObject.getBooleanValue("disable_exposed");
            this.i = oec.a(jSONObject.get("enable_weex_delay"), true);
            this.m = oec.a(jSONObject.get("enable_load_first_frame_v2"), false);
            this.k = jSONObject.getBooleanValue("disable_bg_download");
            this.f = oec.a(jSONObject.get("auto_scroll_delay"), 1500L);
            this.l = oec.a(jSONObject.get("disable_auto_scroll"), true);
            Object obj = jSONObject.get("cache_expire_timestamp");
            if (obj != null) {
                String obj2 = obj.toString();
                if (!TextUtils.isEmpty(obj2)) {
                    String[] split = obj2.split(",");
                    this.o = new long[split.length];
                    for (int i = 0; i < split.length; i++) {
                        this.o[i] = oec.a((Object) split[i], Long.MAX_VALUE);
                    }
                }
            }
            this.p = oec.a(jSONObject.get("enable_request_after_expire"), true);
            spz.c("PickPreloadController_PreloadABConfig_PreloadVideoModule", "ABTest:" + this);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadABConfig{enable=" + this.f33774a + ", predownloadSize=" + this.c + ", timeoutDura=" + this.d + ", requestTimeoutDura=" + this.e + ", autoScrollDelay=" + this.f + ", enableNetState=" + this.g + ", disableExposed=" + this.h + ", enableWeexDelay=" + this.i + ", disableBgDownload=" + this.k + ", disableAutoScroll=" + this.l + ", enableLoadFirstFrame=" + this.m + ", cacheExpireTimestamp=" + this.o + ", enableRequestAfterExpire=" + this.p + '}';
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f > 0;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.u;
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (ogv.a(jSONObject)) {
                return;
            }
            Object obj = jSONObject.get("abConfig");
            if (!(obj instanceof Map)) {
                return;
            }
            Map map = (Map) obj;
            if (ogv.a(map)) {
                return;
            }
            a(map);
        } catch (Throwable th) {
            th.printStackTrace();
            spz.a("PickPreloadController_PreloadABConfig_PreloadVideoModule", th.getMessage(), th);
        }
    }

    private void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Map a2 = oec.a(map.get("tab2FrameworkRefactor"), (Map) null);
        if (!ogv.a(a2) && a2.containsKey("feConfig")) {
            this.u = true;
        }
        spz.c("PickPreloadController_PreloadABConfig_PreloadVideoModule", "是否是导购版？" + this.u);
    }
}
