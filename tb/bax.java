package tb;

import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.application.common.d;

/* loaded from: classes2.dex */
public class bax {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class a {
        public static final int LEVEL_CODE_HIGH = 3;
        public static final int LEVEL_CODE_LOW = 1;
        public static final int LEVEL_CODE_MIDDLE = 2;
        public static final int LEVEL_CODE_UNKNOWN = 0;
        public static final String LEVEL_NAME_HIGH = "high";
        public static final String LEVEL_NAME_LOW = "low";
        public static final String LEVEL_NAME_MIDDLE = "middle";
        public static final String LEVEL_NAME_UNKNOWN = "unknown";

        /* renamed from: a  reason: collision with root package name */
        public final int f25741a;
        public final String b;

        static {
            kge.a(-243347491);
        }

        public a(int i, String str) {
            this.f25741a = i;
            this.b = str;
        }
    }

    static {
        kge.a(605212438);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5907ec88", new Object[0]);
        }
        try {
            d a2 = c.a();
            if (a2 != null) {
                int a3 = a2.a("deviceLevel", -1);
                return a3 == 2 ? new a(1, "low") : a3 == 1 ? new a(2, "middle") : a3 == 0 ? new a(3, "high") : new a(0, "unknown");
            }
        } catch (Exception e) {
            arc.a().c("AURADeviceUtils", PerformanceAbility.API_GET_DEVICE_LEVEL, e.toString());
        }
        return new a(0, "unknown");
    }
}
