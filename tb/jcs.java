package tb;

import android.util.LruCache;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;

/* loaded from: classes5.dex */
public class jcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LruCache<String, jcu> f29461a;

    static {
        kge.a(1531575460);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("isEnablePredictTracker", true);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableVideoBxFeatures", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableReceiveAINotification", true);
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("maxModelTriggerTime", 1000);
    }

    public static int[] e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("aef483f8", new Object[0]);
        }
        int[] iArr = {0, 300};
        VariationSet activate = UTABTest.activate("AB_fullscreenpage_sensor", "sensor_collection");
        if (activate == null) {
            return iArr;
        }
        Variation variation = activate.getVariation("enableGesture");
        Variation variation2 = activate.getVariation("maxMoveCount");
        if (variation != null) {
            iArr[0] = variation.getValueAsBoolean(false) ? 1 : 0;
        }
        if (variation2 != null) {
            iArr[1] = variation2.getValueAsInt(300);
        }
        return iArr;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableGGVideoBxFeatures", true);
    }

    public LruCache<String, jcu> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LruCache) ipChange.ipc$dispatch("db17219f", new Object[]{this}) : this.f29461a;
    }

    public void a(LruCache<String, jcu> lruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2261d499", new Object[]{this, lruCache});
        } else {
            this.f29461a = lruCache;
        }
    }
}
