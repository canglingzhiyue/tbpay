package tb;

import com.alibaba.android.split.core.splitinstall.g;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.android.split.core.splitinstall.m;
import com.alibaba.android.split.core.splitinstall.o;
import com.alibaba.android.split.core.tasks.d;
import com.alibaba.android.split.core.tasks.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.appbundle.c;

/* loaded from: classes4.dex */
public class shh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARTIFACT_ID = "dtao-liveshop-ttdetail";

    /* renamed from: a  reason: collision with root package name */
    private static int f33579a;

    static {
        kge.a(-358021876);
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        f33579a = i;
        return i;
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : f33579a;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        g c = c.Companion.a().c();
        if (c == null) {
            return false;
        }
        if (c.a().contains(ARTIFACT_ID)) {
            return true;
        }
        i.a("TinyShopRemoteUtils", "remomte module not installed：dtao-liveshop-ttdetail");
        b();
        return false;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        final g c = c.Companion.a().c();
        if (c == null) {
            return;
        }
        final a aVar = new a(c);
        c.a(aVar);
        c.a(j.a().a(ARTIFACT_ID).a()).a(new e<Integer>() { // from class: tb.shh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.e
            public /* synthetic */ void onSuccess(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, num});
                } else {
                    a(num);
                }
            }

            public void a(Integer num) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6cdec50f", new Object[]{this, num});
                    return;
                }
                shh.a(num.intValue());
                i.a("TinyShopRemoteUtils", "send install request success: " + shh.c());
            }
        }).a(new d() { // from class: tb.shh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                g.this.b(aVar);
                i.a("TinyShopRemoteUtils", "send install request failure: dtao-liveshop-ttdetail");
            }
        });
    }

    /* loaded from: classes4.dex */
    public static class a implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private g f33581a;

        static {
            kge.a(1530969965);
            kge.a(-1887429869);
        }

        @Override // com.alibaba.android.split.core.listener.b
        public /* synthetic */ void onStateUpdate(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd17bbbe", new Object[]{this, mVar});
            } else {
                a(mVar);
            }
        }

        public a(g gVar) {
            this.f33581a = gVar;
        }

        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            } else if (mVar.a() != shh.c()) {
            } else {
                int b = mVar.b();
                if (b == 5) {
                    this.f33581a.b(this);
                } else if (b != 6) {
                } else {
                    this.f33581a.b(this);
                    i.a("TinyShopRemoteUtils", "install failed dtao-liveshop-ttdetail");
                }
            }
        }
    }
}
