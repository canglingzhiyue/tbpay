package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class coh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f26352a;

    /* loaded from: classes3.dex */
    public interface a {
        void a(Activity activity, boolean z, boolean z2);
    }

    static {
        kge.a(1237832384);
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330a9cff", new Object[]{aVar});
        } else {
            f26352a = aVar;
        }
    }

    public static void a(Activity activity, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cadf9ba", new Object[]{activity, new Boolean(z), new Boolean(z2)});
        } else {
            f26352a.a(activity, z, z2);
        }
    }
}
