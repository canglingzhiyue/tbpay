package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.copy.a;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.homepage.HomepageFragment;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ovk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(319359724);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        WeakReference<Activity> e = a.a().e();
        if (e == null) {
            ldf.d("PageCallback", "activityWeakReference is null");
            return false;
        }
        Activity activity = e.get();
        if (activity == null) {
            ldf.d("PageCallback", "activity is null");
            return false;
        }
        try {
            if (TBMainHost.fromActivity(activity) == null) {
                ldf.d("PageCallback", "tbMain is null");
                return false;
            }
            return TBMainHost.a().getCurrentFragment() instanceof HomepageFragment;
        } catch (Exception e2) {
            ldf.d("PageCallback", "出现异常： " + e2);
            return true;
        }
    }
}
