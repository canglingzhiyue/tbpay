package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class snr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f33751a;
    private final psw b;
    private final a c;
    private final snk d;
    private boolean e;

    public static /* synthetic */ boolean a(snr snrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff152a05", new Object[]{snrVar})).booleanValue() : snrVar.e;
    }

    public static /* synthetic */ void b(snr snrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed983082", new Object[]{snrVar});
        } else {
            snrVar.c();
        }
    }

    public static /* synthetic */ void c(snr snrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1b3703", new Object[]{snrVar});
        } else {
            snrVar.d();
        }
    }

    public static /* synthetic */ psw d(snr snrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("72fb442e", new Object[]{snrVar}) : snrVar.b;
    }

    static {
        kge.a(-26208795);
        f33751a = obu.a(obu.e());
    }

    public snr(snk snkVar, psw pswVar, a aVar) {
        this.d = snkVar;
        this.b = pswVar;
        this.c = aVar;
    }

    public static void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{recyclerView, new Integer(i)});
        } else if (!sjt.a() || i == -1) {
        } else {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (!(findViewHolderForAdapterPosition instanceof snp)) {
                return;
            }
            ((snp) findViewHolderForAdapterPosition).f33749a.h();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        spz.c("WillActivePerformer", "willActive");
        a.a(this.c, this);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        spz.c("WillActivePerformer", "willDisActive");
        a.b(this.c, this);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.d.f()) {
            if (!f33751a) {
                return;
            }
            spz.c("WillActivePerformer", "onWillActive must after appear");
        } else if (this.e) {
            spz.c("WillActivePerformer", "onWillActive mIsWillActive");
        } else {
            spz.c("WillActivePerformer", "onWillActive");
            psw pswVar = this.b;
            pswVar.onWillActive(pswVar);
            this.e = true;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.e) {
        } else {
            spz.c("WillActivePerformer", "onWillDisActive");
            psw pswVar = this.b;
            pswVar.onWillDisActive(pswVar);
            this.e = false;
        }
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private snr f33752a;
        private int b;
        private snj c;

        static {
            kge.a(502584682);
        }

        public static /* synthetic */ void a(a aVar, snr snrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89cd277d", new Object[]{aVar, snrVar});
            } else {
                aVar.a(snrVar);
            }
        }

        public static /* synthetic */ void b(a aVar, snr snrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3fec0be", new Object[]{aVar, snrVar});
            } else {
                aVar.b(snrVar);
            }
        }

        private void a(snr snrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff152a01", new Object[]{this, snrVar});
                return;
            }
            this.b++;
            snr snrVar2 = this.f33752a;
            if (snrVar == snrVar2) {
                if (snrVar == null || snr.a(snrVar)) {
                    return;
                }
                snr.b(snrVar);
                return;
            }
            psw pswVar = null;
            if (snrVar2 != null && snr.a(snrVar2)) {
                snr.c(this.f33752a);
            }
            snr snrVar3 = this.f33752a;
            if (snrVar3 != null) {
                pswVar = snr.d(snrVar3);
            }
            if (snrVar != null && !snr.a(snrVar)) {
                snj snjVar = this.c;
                if (snjVar != null) {
                    snjVar.a(snr.d(snrVar), pswVar);
                }
                snr.b(snrVar);
                snj snjVar2 = this.c;
                if (snjVar2 != null) {
                    snjVar2.b(snr.d(snrVar), pswVar);
                }
            }
            this.f33752a = snrVar;
        }

        private void b(snr snrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed983082", new Object[]{this, snrVar});
            } else if (snrVar == null) {
            } else {
                snr.c(snrVar);
            }
        }
    }
}
