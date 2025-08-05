package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final tao.reactivex.k f25163a;

        static {
            kge.a(-1469161630);
            f25163a = new tao.reactivex.f.b();
        }
    }

    /* loaded from: classes9.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final tao.reactivex.k f25164a;

        static {
            kge.a(-1469161629);
            f25164a = new d();
        }
    }

    static {
        kge.a(1964949477);
    }

    public static tao.reactivex.k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tao.reactivex.k) ipChange.ipc$dispatch("96225a4b", new Object[0]) : a.f25163a;
    }

    public static tao.reactivex.k b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tao.reactivex.k) ipChange.ipc$dispatch("a2bb4fcc", new Object[0]) : b.f25164a;
    }
}
