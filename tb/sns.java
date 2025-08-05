package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;

/* loaded from: classes5.dex */
public class sns {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VALUE_LOOP_CLOSE = 0;
    public static final int VALUE_LOOP_OPEN = 1;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33753a = false;
    private boolean b = false;
    private boolean c;

    static {
        kge.a(-973721300);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : oeb.a("ShortVideo.degradeToTBDWInstance", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : Boolean.parseBoolean(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("degradeToNoUsePlayerPrepareLoad", "false"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : oeb.a("ShortVideo.degradeToNoUsePrepareToFirstFrame", false);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableRemoveCoverView", true);
        ogg.b("未起播视频移除封面图开关：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f33753a;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.f33753a = z;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.b;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
