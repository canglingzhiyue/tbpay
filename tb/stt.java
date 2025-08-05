package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;

/* loaded from: classes7.dex */
public class stt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-68954192);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) (f * Global.getApplication().getResources().getDisplayMetrics().density);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : Global.getApplication().getResources().getDisplayMetrics().widthPixels;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : Global.getApplication().getResources().getDisplayMetrics().heightPixels;
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[0])).floatValue();
        }
        try {
            int b = b();
            int a2 = a();
            if (b <= 0 || a2 <= 0) {
                stv.a("getTopshowMaxHeight", "screenHeight error, use 700ap. screenHeight = " + b + ", screenWidth = " + a2);
                return 700.0f;
            }
            float c = ((b * 375.0f) / a2) - gbg.c(Global.getApplication(), 172.0f);
            if (c <= 0.0f) {
                stv.a("getTopshowMaxHeight", "topshowScreenHeight error, use 700ap.");
                c = 700.0f;
            }
            stv.a("getTopshowMaxHeight", "topshowScreenHeight= " + c + ", screenHeight = " + b + ", screenWidth = " + a2);
            return c;
        } catch (Throwable th) {
            stv.a("getTopshowMaxHeight", "caltulate error", th);
            return 700.0f;
        }
    }
}
