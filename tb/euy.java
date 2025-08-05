package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.core.IActivityAdapter;
import com.taobao.android.detail.protocol.adapter.core.IAppAdapter;
import com.taobao.android.detail.protocol.adapter.core.ILimitAdapter;
import com.taobao.android.detail.protocol.adapter.core.INavAdapter;
import com.taobao.android.detail.protocol.adapter.core.IShareAdapter;
import com.taobao.android.detail.protocol.adapter.core.IWeAppAdapter;
import com.taobao.android.detail.protocol.adapter.core.a;
import com.taobao.android.detail.protocol.adapter.core.b;
import com.taobao.android.detail.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.detail.protocol.adapter.optional.c;
import com.taobao.android.detail.protocol.adapter.optional.d;
import com.taobao.android.detail.protocol.adapter.optional.e;

/* loaded from: classes4.dex */
public class euy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27591a = false;
    private static IActivityAdapter b = null;
    private static IAppAdapter c = null;
    private static a d = null;
    private static b e = null;
    private static INavAdapter f = null;
    private static IShareAdapter g = null;
    private static IWeAppAdapter h = null;
    private static ILimitAdapter i = null;
    private static c j = null;
    private static com.taobao.android.detail.protocol.adapter.optional.a k = null;
    private static com.taobao.android.detail.protocol.adapter.optional.b l = null;
    private static e m = null;
    private static ITrackAdapter n = null;
    private static d o = null;
    private static boolean p = false;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f27591a;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f27591a = z;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : p;
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb9db39", new Object[]{cVar});
        } else {
            j = cVar;
        }
    }

    public static void a(IActivityAdapter iActivityAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb101bbc", new Object[]{iActivityAdapter});
        } else {
            b = iActivityAdapter;
        }
    }

    public static IAppAdapter c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAppAdapter) ipChange.ipc$dispatch("7306f568", new Object[0]) : c;
    }

    public static void a(IAppAdapter iAppAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce04f66", new Object[]{iAppAdapter});
        } else {
            c = iAppAdapter;
        }
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c1581c", new Object[]{aVar});
        } else {
            d = aVar;
        }
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9c1cc7b", new Object[]{bVar});
        } else {
            e = bVar;
        }
    }

    public static void a(INavAdapter iNavAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737b23e8", new Object[]{iNavAdapter});
        } else {
            f = iNavAdapter;
        }
    }

    public static void a(IShareAdapter iShareAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6666ca4", new Object[]{iShareAdapter});
        } else {
            g = iShareAdapter;
        }
    }

    public static com.taobao.android.detail.protocol.adapter.optional.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.protocol.adapter.optional.b) ipChange.ipc$dispatch("3c0aaa9e", new Object[0]) : l;
    }

    public static void a(com.taobao.android.detail.protocol.adapter.optional.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb966da", new Object[]{bVar});
        } else {
            l = bVar;
        }
    }

    public static e f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4cc077bc", new Object[0]) : m;
    }

    public static void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbac3f7", new Object[]{eVar});
        } else {
            m = eVar;
        }
    }

    public static ITrackAdapter g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITrackAdapter) ipChange.ipc$dispatch("b57ab4f5", new Object[0]) : n;
    }

    public static void a(ITrackAdapter iTrackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3adf3aef", new Object[]{iTrackAdapter});
        } else {
            n = iTrackAdapter;
        }
    }

    public static d h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("6e2c111f", new Object[0]) : o;
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddba4f98", new Object[]{dVar});
        } else {
            o = dVar;
        }
    }
}
