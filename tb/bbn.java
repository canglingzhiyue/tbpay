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
public class bbn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARTIFACT_ID = "fliggy_vacation_ttdetail";

    /* renamed from: a  reason: collision with root package name */
    private static int f25751a;
    private static long b;

    static {
        kge.a(925797516);
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        f25751a = i;
        return i;
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : f25751a;
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
        i.a("FliggyRemoteUtils", "remomte module not installed：fliggy_vacation_ttdetail");
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
        j a2 = j.a().a(ARTIFACT_ID).a();
        b = System.currentTimeMillis();
        c.a(a2).a(new e<Integer>() { // from class: tb.bbn.2
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
                bbn.a(num.intValue());
                i.a("FliggyRemoteUtils", "send install request success: " + bbn.c());
            }
        }).a(new d() { // from class: tb.bbn.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.tasks.d
            public void onFailure(Exception exc) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ebfde814", new Object[]{this, exc});
                    return;
                }
                g.this.b(aVar);
                i.a("FliggyRemoteUtils", "send install request failure: fliggy_vacation_ttdetail");
            }
        });
    }

    /* loaded from: classes4.dex */
    public static class a implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private g f25753a;

        static {
            kge.a(844167213);
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
            this.f25753a = gVar;
        }

        public void a(m mVar) {
            int b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("398f1780", new Object[]{this, mVar});
            } else if (mVar.a() != bbn.c() || (b = mVar.b()) == 2 || b == 4) {
            } else {
                if (b == 5) {
                    this.f25753a.b(this);
                } else if (b != 6) {
                } else {
                    this.f25753a.b(this);
                    i.a("FliggyRemoteUtils", "install failed fliggy_vacation_ttdetail");
                }
            }
        }
    }
}
