package tb;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter;

/* loaded from: classes4.dex */
public class evb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ITrackAdapter f27593a = euy.g();

    public static void a(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa971818", new Object[]{activity, str, str2, str3});
            return;
        }
        ITrackAdapter iTrackAdapter = f27593a;
        if (iTrackAdapter == null) {
            return;
        }
        iTrackAdapter.pageEnter(activity, str, str2, str3);
    }

    public static void a(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36e85ce", new Object[]{activity, str, str2});
            return;
        }
        ITrackAdapter iTrackAdapter = f27593a;
        if (iTrackAdapter == null) {
            return;
        }
        iTrackAdapter.pageLeave(activity, str, str2);
    }

    @SafeVarargs
    public static void a(Context context, String str, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e707d4f", new Object[]{context, str, pairArr});
        } else {
            a(context, (String) null, str, pairArr);
        }
    }

    @SafeVarargs
    public static void a(Context context, String str, String str2, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a7a799", new Object[]{context, str, str2, pairArr});
            return;
        }
        ITrackAdapter iTrackAdapter = f27593a;
        if (iTrackAdapter == null) {
            return;
        }
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("context must be activity");
        }
        iTrackAdapter.ctrlClickedOnPage(context, str, str2, pairArr);
    }

    public static void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d9201a", new Object[]{str, new Integer(i), obj, obj2, obj3, strArr});
            return;
        }
        ITrackAdapter iTrackAdapter = f27593a;
        if (iTrackAdapter == null) {
            return;
        }
        iTrackAdapter.commitEvent(str, i, obj, obj2, obj3, strArr);
    }
}
