package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import kotlin.jvm.JvmStatic;

/* loaded from: classes4.dex */
public final class ffz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ffz INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27914a;

    @JvmStatic
    public static final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        return 12;
    }

    @JvmStatic
    public static final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        return 250;
    }

    @JvmStatic
    public static final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        return 300;
    }

    static {
        kge.a(-806840936);
        INSTANCE = new ffz();
    }

    private ffz() {
    }

    @JvmStatic
    public static final void a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            if (ABGlobal.isFeatureOpened(context, "AB_stdpop_new_ux") && dmr.H()) {
                z = true;
            }
            f27914a = z;
        }
    }

    @JvmStatic
    public static final float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[0])).floatValue() : f27914a ? 1000.0f : 900.0f;
    }
}
