package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.p;

/* loaded from: classes8.dex */
public class tki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f34181a;

    static {
        kge.a(277229511);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!f34181a || !p.a("enableMergeUnImportantLiveInfo0926", true)) {
            return false;
        }
        return l.d(p.a("taolive", "MergeUnImportantLiveInfo0806", "enableMergeUnImportantLiveInfo0806", "false"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : p.a("enableObserveUnImportantLiveInfo", true);
    }
}
