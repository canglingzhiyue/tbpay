package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;

/* loaded from: classes5.dex */
public final class sij {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUTO_NEXT_VIDEO_STATE_FALSE = 2;
    public static final int AUTO_NEXT_VIDEO_STATE_NONE = 0;
    public static final int AUTO_NEXT_VIDEO_STATE_TRUE = 1;
    public static final String KEY_AUTO_NEXT_VIDEO_STATE = "auto_next_video_state";
    public static final String KEY_IS_FIRST_PLAY = "is_not_first_play";

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f33608a;
    private static volatile int b;
    private static volatile boolean c;
    private static volatile int d;

    static {
        kge.a(1177599004);
        d = -1;
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        b = occ.b(obu.e(), KEY_AUTO_NEXT_VIDEO_STATE, 0);
        c = occ.b((Context) obu.e(), KEY_IS_FIRST_PLAY, true);
        f33608a = true;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        e();
        if (b == 1) {
            return true;
        }
        if (b != 2) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        e();
        return b;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        if (z) {
            b = 1;
        } else {
            b = 2;
        }
        occ.a((Context) obu.e(), KEY_AUTO_NEXT_VIDEO_STATE, b);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (d >= 0) {
            return d;
        }
        try {
            d = Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("videoPlayerDelayTime", "1000"));
        } catch (Throwable th) {
            spz.a("VideoConfig", "getVideoPlayerDelayTime", th);
        }
        if (d < 0) {
            d = 1000;
        }
        return d;
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (f33608a) {
        } else {
            d();
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableFixAutoPlayWhenPageAppear", true);
    }
}
