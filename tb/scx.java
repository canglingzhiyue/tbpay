package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.jfd;
import tb.scx;

/* loaded from: classes6.dex */
public class scx implements scy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final jdy f33486a;
    private final jft b;

    public static /* synthetic */ jdy a(scx scxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdy) ipChange.ipc$dispatch("e4cce437", new Object[]{scxVar}) : scxVar.f33486a;
    }

    public static /* synthetic */ jft b(scx scxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jft) ipChange.ipc$dispatch("cc6ec17d", new Object[]{scxVar}) : scxVar.b;
    }

    public scx(jdy jdyVar, jft jftVar) {
        this.f33486a = jdyVar;
        this.b = jftVar;
    }

    @Override // tb.scy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            jgb.a(new a()).a(jgb.sScheduler).a();
        }
    }

    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void lambda$xFbn3bdp6O89WLVKORuRdh4wByk(a aVar, File file) {
            aVar.a(file);
        }

        private a() {
            scx.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            jdv d = scx.a(scx.this).d();
            int a2 = new jgd(scx.a(scx.this).a(), scx.a(scx.this).c()).a(20);
            if (a2 > 0) {
                jfj.b("LocalFileTask", com.taobao.android.weex_framework.util.a.ATOM_EXT_del, "" + a2);
            }
            jfd.a aVar = new jfd.a() { // from class: tb.-$$Lambda$scx$a$xFbn3bdp6O89WLVKORuRdh4wByk
                @Override // tb.jfd.a
                public final void accept(File file) {
                    scx.a.lambda$xFbn3bdp6O89WLVKORuRdh4wByk(scx.a.this, file);
                }
            };
            $$Lambda$r0mWexerADgyYDX5_PJ_sXRg5QA __lambda_r0mwexeradgyydx5_pj_sxrg5qa = $$Lambda$r0mWexerADgyYDX5_PJ_sXRg5QA.INSTANCE;
            File[] a3 = new jff(scx.a(scx.this)).a();
            File[] a4 = new jfh(scx.a(scx.this)).a();
            if (d.a("delDupAnr", false)) {
                jfd.a(new jfe(scx.a(scx.this)).a(), __lambda_r0mwexeradgyydx5_pj_sxrg5qa).a();
            } else {
                jfd.a(new jfe(scx.a(scx.this)).a(), aVar).a();
            }
            jfd.a(a3, aVar).a();
            jfd.a(a4, aVar).a();
            jfd.a(new jfg(scx.a(scx.this)).a(), aVar).a();
            jfd.a(new jfi(scx.a(scx.this)).a(), __lambda_r0mwexeradgyydx5_pj_sxrg5qa).a();
        }

        public /* synthetic */ void a(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a979fdf", new Object[]{this, file});
                return;
            }
            jfv a2 = jfw.a(file);
            if (a2 == null) {
                return;
            }
            jfr.a().a("STAGE_ANR_HAPPENED_LAUNCH_SEND", "TCrash", a2.b());
            scx.b(scx.this).a(a2);
        }
    }
}
