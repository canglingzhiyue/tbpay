package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import java.util.Map;
import java.util.Random;

/* loaded from: classes6.dex */
public class ivs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f29345a = false;
    private int b = 600;
    private int c = ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;

    static {
        kge.a(-820855767);
    }

    public ivs() {
    }

    public ivs(JSONObject jSONObject) {
        a(jSONObject);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f29345a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = null;
            if (!ogv.a(jSONObject)) {
                Map a2 = oec.a(jSONObject.get("prefetchConfig"), (Map) null);
                if (!ogv.a(a2)) {
                    jSONObject2 = (JSONObject) a2;
                    ogg.a("LivePreloadABConfig", "initABConfig,优先从preloadArgs读取");
                }
            }
            if (ogv.a(jSONObject2)) {
                jSONObject2 = (JSONObject) ohh.b("TAB2_LIVE_ROOM_RED_POINT_PRELOAD_CONFIG");
            } else {
                ohh.b("TAB2_LIVE_ROOM_RED_POINT_PRELOAD_CONFIG", jSONObject2);
            }
            if (ogv.a(jSONObject2)) {
                return;
            }
            b(jSONObject2);
        } catch (Throwable th) {
            ogg.a("LivePreloadABConfig", "initAndUpdateABConfig读取AB配置异常" + th.getMessage());
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        try {
            if (ogv.a(jSONObject)) {
                return;
            }
            Map a2 = oec.a(jSONObject.get("abConfig"), (Map) null);
            if (ogv.a(a2)) {
                return;
            }
            Map a3 = oec.a(a2.get("livePreloadConfig"), (Map) null);
            if (ogv.a(a3)) {
                return;
            }
            if (!d() || !oec.a(a3.get("enable_live_recommend_preload"), false)) {
                z = false;
            }
            this.f29345a = z;
            int nextInt = new Random().nextInt(100);
            ogg.a("LivePreloadABConfig", "生成的随机数：" + nextInt);
            this.b = oec.a(a3.get("preload_live_status_check_interval"), 600) + nextInt;
            this.c = oec.a(a3.get("preload_force_refresh_recommend_interval"), (int) ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
            ogg.a("LivePreloadABConfig", "ABTest:" + this);
        } catch (Throwable th) {
            ogg.a("LivePreloadABConfig", "initAndUpdateABConfig读取AB配置异常" + th.getMessage());
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : oeb.a("tblive.enableRecommendPreload", true);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LivePreloadABConfig{enableRecommendPreload=" + this.f29345a + ", preloadLiveStatusCheckInterval=" + this.b + ", preloadForceRefreshRecommendInterval=" + this.c + '}';
    }
}
