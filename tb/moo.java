package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class moo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-150499911);
    }

    public static float a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{new Integer(i)})).floatValue() : i * 1.6666666f;
    }

    public static float a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8b7147", new Object[]{bVar})).floatValue() : a(bVar.h().K().b());
    }

    public static float b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1351766", new Object[]{bVar})).floatValue() : a(bVar) + a(bVar.g());
    }

    private static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (activity != null) {
            return (int) activity.getResources().getDimension(R.dimen.new_detail_vertical_non_full_bottom_divider_height);
        }
        return 0;
    }
}
