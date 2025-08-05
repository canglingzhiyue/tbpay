package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;

/* loaded from: classes.dex */
public class ovt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f32467a = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f32469a = "";
        public String b = "";

        static {
            kge.a(-1000812316);
        }
    }

    static {
        kge.a(-223103155);
    }

    public static /* synthetic */ a a(ovt ovtVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("90a43831", new Object[]{ovtVar}) : ovtVar.f32467a;
    }

    public IHomeSubTabController.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IHomeSubTabController.a) ipChange.ipc$dispatch("fde6dfdc", new Object[]{this}) : new IHomeSubTabController.a() { // from class: tb.ovt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                ovt.a(ovt.this).f32469a = ovt.a(ovt.this).b;
                ovt.a(ovt.this).b = str;
                c.b B = c.a().B();
                kuk.a("tabSwitched").a("sourceTabName", HomePageUtility.a(B.f21153a, ovt.a(ovt.this).f32469a)).a("targetTabName", HomePageUtility.a(B.b, ovt.a(ovt.this).b)).b();
            }
        };
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("523ad253", new Object[]{this}) : this.f32467a;
    }
}
