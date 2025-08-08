package tb;

import android.app.Activity;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.welcome.Welcome;

/* loaded from: classes6.dex */
public class ker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(819347875);
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue() : TBMainHost.fromActivity(activity) == null && StringUtils.equals(activity.getLocalClassName(), Welcome.class.getName());
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        if (TBMainHost.fromActivity(activity) == null) {
            return false;
        }
        Fragment currentFragment = TBMainHost.a().getCurrentFragment();
        return currentFragment == null || StringUtils.equals(currentFragment.getClass().getName(), "com.taobao.tao.homepage.HomepageFragment");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean a2 = c.a().a("isInBackground", false);
        kej.a(kem.TAG, "on activity stop. background stat: " + a2);
        return a2;
    }
}
