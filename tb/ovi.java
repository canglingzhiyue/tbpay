package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;

/* loaded from: classes8.dex */
public class ovi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ACCIDENT_SLIDE_X_FACTOR = "accidentSlideXFactor";
    public static final String KEY_ENABLE_ACCIDENT_SLIDE = "enableAccidentSlide";

    /* renamed from: a  reason: collision with root package name */
    private int f32452a;
    private boolean b;
    private float c;
    private int d;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static ovi f32453a;

        static {
            kge.a(-812494217);
            f32453a = new ovi();
        }

        public static /* synthetic */ ovi a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ovi) ipChange.ipc$dispatch("f08e1fc", new Object[0]) : f32453a;
        }
    }

    static {
        kge.a(269377049);
    }

    private ovi() {
        this.f32452a = 3;
        this.b = false;
        this.c = this.f32452a;
        this.d = DensityUtil.dip2px(Globals.getApplication(), 0.0f);
    }

    public static ovi a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ovi) ipChange.ipc$dispatch("f08e1fc", new Object[0]) : a.a();
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.c;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        g();
        a(f());
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            lap.a("AccidentSlide", "parseConfig", "config is null");
        } else {
            lap.a("AccidentSlide", "parseConfig", jSONObject.toString());
            if (jSONObject.containsKey(KEY_ENABLE_ACCIDENT_SLIDE)) {
                try {
                    this.b = jSONObject.getBooleanValue(KEY_ENABLE_ACCIDENT_SLIDE);
                } catch (Throwable th) {
                    lap.a("AccidentSlide", "parseConfig", "isEnable error : " + th.getMessage());
                }
            }
            if (jSONObject.containsKey(KEY_ACCIDENT_SLIDE_X_FACTOR)) {
                try {
                    this.c = jSONObject.getFloatValue(KEY_ACCIDENT_SLIDE_X_FACTOR);
                } catch (Throwable th2) {
                    lap.a("AccidentSlide", "parseConfig", "accidentSlideXFactor error :" + th2.getMessage());
                }
            }
            if (!jSONObject.containsKey("accidentSlideYDistance")) {
                return;
            }
            try {
                this.d = jSONObject.getIntValue("accidentSlideYDistance");
            } catch (Throwable th3) {
                lap.a("AccidentSlide", "parseConfig", "accidentSlideYFactor error :" + th3.getMessage());
            }
        }
    }

    private JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject d = HomePageUtility.d();
        if (d != null) {
            return d.getJSONObject("ext");
        }
        return null;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.b = false;
        this.c = this.f32452a;
        this.d = DensityUtil.dip2px(Globals.getApplication(), 0.0f);
    }
}
