package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class lnr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final double HIGH_SCREEN_RATIO = 0.53d;
    public static final double SHORT_SCREEN_RATIO = 0.54d;

    static {
        kge.a(-524025990);
    }

    public static int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8b714a", new Object[]{bVar})).intValue() : R.drawable.half_screen_second_card_medium;
    }

    public static float a(b bVar, int i, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a82cca4", new Object[]{bVar, new Integer(i), new Float(f)})).floatValue() : i - a(bVar, f);
    }

    public static float b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1351766", new Object[]{bVar})).floatValue() : bVar.h().K().a() - d(bVar);
    }

    public static float c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f2debd85", new Object[]{bVar})).floatValue() : (bVar.h().K().a() - d(bVar)) - a(bVar.g());
    }

    private static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (activity != null) {
            return (int) activity.getResources().getDimension(R.dimen.new_detail_half_screen_bottom_divider_height);
        }
        return 0;
    }

    public static float d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e48863a4", new Object[]{bVar})).floatValue() : a(bVar, bVar.h().K().c());
    }

    public static float a(b bVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1e32139", new Object[]{bVar, new Float(f)})).floatValue();
        }
        Activity g = bVar.g();
        if (g == null) {
            return 0.0f;
        }
        double d = f;
        if (d <= 0.53d) {
            if (bVar.h().k().M) {
                return g.getResources().getDimension(R.dimen.new_detail_half_screen_high_screen_guide_height) + 30.0f;
            }
            return g.getResources().getDimension(R.dimen.new_detail_half_screen_high_screen_guide_height);
        } else if (d > 0.53d && d <= 0.54d) {
            return g.getResources().getDimension(R.dimen.new_detail_half_screen_medium_screen_guide_height);
        } else {
            if (d <= 0.54d) {
                return 0.0f;
            }
            return g.getResources().getDimension(R.dimen.new_detail_half_screen_short_screen_guide_height);
        }
    }
}
