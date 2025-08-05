package tb;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter;
import java.util.Map;

/* loaded from: classes4.dex */
public class eps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1148624495);
        emu.a("com.taobao.android.detail.datasdk.protocol.utils.TrackUtils");
    }

    public static void a(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb19e01", new Object[]{activity, str, map});
            return;
        }
        ITrackAdapter j = epj.j();
        if (j == null) {
            return;
        }
        j.pageUpdate(activity, str, map);
    }

    @SafeVarargs
    public static void a(Context context, String str, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e707d4f", new Object[]{context, str, pairArr});
        } else {
            a(context, null, str, pairArr);
        }
    }

    public static void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
            return;
        }
        Pair[] pairArr = null;
        if (map != null && map.size() > 0) {
            pairArr = new Pair[map.size()];
            for (String str2 : map.keySet()) {
                pairArr[i] = new Pair(str2, map.get(str2));
                i++;
            }
        }
        a(context, str, pairArr);
    }

    @SafeVarargs
    public static void a(Context context, String str, String str2, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a7a799", new Object[]{context, str, str2, pairArr});
            return;
        }
        ITrackAdapter j = epj.j();
        if (j == null) {
            return;
        }
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("context must be activity");
        }
        j.ctrlClickedOnPage(context, str, str2, pairArr);
    }

    public static void a(Context context, String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5acb3412", new Object[]{context, str, new Integer(i), obj, obj2, obj3, strArr});
            return;
        }
        ITrackAdapter j = epj.j();
        if (j == null) {
            return;
        }
        j.commitEvent(context, str, i, obj, obj2, obj3, strArr);
    }

    public static void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d9201a", new Object[]{str, new Integer(i), obj, obj2, obj3, strArr});
            return;
        }
        ITrackAdapter j = epj.j();
        if (j == null) {
            return;
        }
        j.commitEvent(str, i, obj, obj2, obj3, strArr);
    }

    public static void b(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8590541b", new Object[]{str, new Integer(i), obj, obj2, obj3, strArr});
            return;
        }
        ITrackAdapter j = epj.j();
        if (j == null) {
            return;
        }
        j.disappearTrack(str, i, obj, obj2, obj3, strArr);
    }

    public static String a(ITrackAdapter.TrackExtra trackExtra) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e23cb67", new Object[]{trackExtra});
        }
        ITrackAdapter j = epj.j();
        if (j == null) {
            return null;
        }
        return j.getExtra(trackExtra);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        ITrackAdapter j = epj.j();
        if (j == null) {
            return;
        }
        j.customEvent(str, str2, map);
    }
}
