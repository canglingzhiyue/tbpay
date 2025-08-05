package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class caj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final cap f26226a;

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final caj f26227a = new caj();

        public static /* synthetic */ caj a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (caj) ipChange.ipc$dispatch("f031ed2", new Object[0]) : f26227a;
        }
    }

    private caj() {
        this.f26226a = new caq();
    }

    public static caj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (caj) ipChange.ipc$dispatch("f031ed2", new Object[0]) : a.a();
    }

    public int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue() : this.f26226a.a(context, str);
    }
}
