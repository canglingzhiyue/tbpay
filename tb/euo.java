package tb;

import android.util.Log;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.g;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.ptr.PullBase;

/* loaded from: classes4.dex */
public class euo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIGHT_OFF_PAGE_OPEN_SHARE_FLOAT = "detail_longclick_lightoffpage_open_sharefloat";
    public static final String SLICE_KEY = "slice";
    public static final String SLICE_NAMESPACE = "new_mainpic_slice";
    public static final String VARIATION_DAMPING = "damping";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27587a = false;

    public static void a(g gVar, PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34fc6dc", new Object[]{gVar, pullBase});
        } else if (gVar == null || pullBase == null) {
        } else {
            try {
                Variation variation = EVO.activateSync(SLICE_NAMESPACE, "slice", null, gVar.e()).getVariation(VARIATION_DAMPING);
                if (variation == null) {
                    return;
                }
                pullBase.setPullInterpolator(new etv(variation.getValueAsFloat(0.7f)));
            } catch (Exception e) {
                UnifyLog.d("MainPicABUtils", "fetchABDampingError: " + Log.getStackTraceString(e));
                euw.b(gVar, "fetchABDampingError", Log.getStackTraceString(e));
                e.printStackTrace();
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_detail", LIGHT_OFF_PAGE_OPEN_SHARE_FLOAT, "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return c() && "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "enable_preload_mainpic_blink_opt", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : f27587a;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f27587a = z;
        }
    }
}
