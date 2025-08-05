package tb;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.a;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public abstract class rnn implements roa, row {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public WeakReference<rnx> c;
    private volatile int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f33242a = hashCode();

    public abstract Pair<Integer, Integer> a(rox roxVar, rny rnyVar);

    public abstract Pair<rov, ? extends Object> a(rox roxVar, rny rnyVar, rns rnsVar);

    public abstract rov a(rox roxVar, rny rnyVar, Pair<Integer, Integer> pair);

    public abstract rov a(rox roxVar, rny rnyVar, rov rovVar);

    public abstract rov a(rox roxVar, rny rnyVar, boolean z);

    public abstract void a();

    public abstract void a(int i, Object obj);

    public abstract boolean a(rox roxVar);

    public abstract boolean b();

    public rnn(Context context) {
        this.b = context;
    }

    public final void a(rnx rnxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd630b9c", new Object[]{this, rnxVar});
        } else {
            this.c = new WeakReference<>(rnxVar);
        }
    }

    private rnx e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rnx) ipChange.ipc$dispatch("2dd0b85e", new Object[]{this});
        }
        WeakReference<rnx> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public final void a(rox roxVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc16c14", new Object[]{this, roxVar, rovVar});
        } else if (this.d != 3) {
            if (rovVar != null) {
                a(roxVar, rovVar, 1);
            } else {
                d(roxVar);
            }
        } else if (!a.a(8)) {
        } else {
            a.a(8, "AbstractUploaderAction", this.f33242a + " begin, state is finish");
        }
    }

    private void d(rox roxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8fa36a0", new Object[]{this, roxVar});
            return;
        }
        boolean b = b();
        if (a.a(2)) {
            a.a(2, "AbstractUploaderAction", this.f33242a + " begin, session:" + roxVar.hashCode() + " state:" + this.d + " stepUp:" + b);
        }
        if (b) {
            a(2);
        }
        rov a2 = a(roxVar, (rny) null, true);
        if (a2 == null) {
            return;
        }
        a(roxVar, a2, 1);
    }

    public final void b(rox roxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf4299e", new Object[]{this, roxVar});
            return;
        }
        int i = this.d == 0 ? 5 : 6;
        if (a.a(8)) {
            a.a(8, "AbstractUploaderAction", this.f33242a + " onStart, state:" + this.d + " notifyType:" + i + " session:" + roxVar.hashCode());
        }
        int i2 = this.d;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (a.a(8)) {
                            a.a(8, "AbstractUploaderAction", this.f33242a + " no need to begin,  state:" + this.d);
                        }
                        a(i, (Object) null);
                    }
                }
            }
            if (!a(2)) {
                a();
                roxVar.a((row) null);
                roxVar.a();
            }
            roxVar.a(this);
            rov a2 = a(roxVar, (rny) null, true);
            if (a2 != null) {
                a(roxVar, a2, 1);
            }
            a(i, (Object) null);
        }
        if (!a(1)) {
            a();
            roxVar.a((row) null);
            roxVar.a();
        }
        roxVar.a(this);
        if (!a(roxVar)) {
            d(roxVar);
        }
        if (a.a(2)) {
            a.a(2, "AbstractUploaderAction", this.f33242a + " submit timeConsuming, session:" + roxVar.hashCode() + " state:" + this.d);
        }
        a(i, (Object) null);
    }

    public final void b(rox roxVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395a6195", new Object[]{this, roxVar, rovVar});
        } else if (this.d == 3) {
            if (!a.a(8)) {
                return;
            }
            a.a(8, "AbstractUploaderAction", this.f33242a + " onCancel, state is finish");
        } else {
            a(roxVar, rovVar, 0);
        }
    }

    @Override // tb.row
    public final void a(rox roxVar, rny rnyVar, rnz rnzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d671a2", new Object[]{this, roxVar, rnyVar, rnzVar});
            return;
        }
        rns rnsVar = (rns) rnzVar;
        int a2 = rnsVar.a();
        if (a.a(2)) {
            a.a(2, "AbstractUploaderAction", this.f33242a + " onReceive, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode() + " response:" + rnsVar.hashCode() + " state:" + this.d + " type:" + a2 + " content:" + rnsVar.b().toString());
        }
        if (this.d == 3) {
            if (!a.a(8)) {
                return;
            }
            a.a(8, "AbstractUploaderAction", this.f33242a + " onReceive, state is finish");
            return;
        }
        Pair<rov, ? extends Object> a3 = a(roxVar, rnyVar, rnsVar);
        rov rovVar = (rov) a3.first;
        switch (a2) {
            case 1:
                if (rovVar == null) {
                    if (b()) {
                        a(2);
                        rovVar = a(roxVar, rnyVar, true);
                        break;
                    } else {
                        a(3);
                        roxVar.a(rnyVar, true);
                        rnx e = e();
                        if (e != null) {
                            e.a(this);
                            break;
                        }
                    }
                }
                break;
            case 2:
                if (a3.second != null) {
                    a(3, a3.second);
                    break;
                }
                break;
            case 3:
                if (a3.second != null) {
                    rovVar = a(roxVar, rnyVar, (Pair) a3.second);
                    break;
                }
                break;
            case 4:
                a(3);
                roxVar.a((row) null);
                roxVar.a(rnyVar, true);
                a(0, a3.second);
                rnx e2 = e();
                if (e2 != null) {
                    e2.a(this);
                    break;
                }
                break;
            case 5:
                if (rovVar != null && "300".equals(rovVar.f24058a) && "2".equals(rovVar.b)) {
                    a(1);
                    rovVar = a(roxVar, (rny) null, true);
                    break;
                }
                break;
            case 6:
                rovVar = new rov("300", "3", a3.second == null ? "" : a3.second.toString(), true);
                break;
        }
        c(roxVar, rnyVar, rovVar);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.d == i) {
            return false;
        }
        if (a.a(2)) {
            a.a(2, "AbstractUploaderAction", this.f33242a + " setState, oldState:" + this.d + " state:" + i);
        }
        this.d = i;
        return true;
    }

    @Override // tb.row
    public final void b(rox roxVar, rny rnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("394da731", new Object[]{this, roxVar, rnyVar});
            return;
        }
        if (a.a(2)) {
            a.a(2, "AbstractUploaderAction", this.f33242a + " onSend, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode());
        }
        if (this.d == 3) {
            if (!a.a(8)) {
                return;
            }
            a.a(8, "AbstractUploaderAction", this.f33242a + " onSend, state is finish");
            return;
        }
        Pair<Integer, Integer> a2 = a(roxVar, rnyVar);
        if (a2 == null) {
            return;
        }
        c(roxVar, rnyVar, a(roxVar, rnyVar, a2));
    }

    private void a(rox roxVar, rov rovVar, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6c896f", new Object[]{this, roxVar, rovVar, new Integer(i)});
            return;
        }
        int i3 = this.d;
        if (a.a(8)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33242a);
            sb.append(" stop, session:");
            sb.append(roxVar == null ? "null" : Integer.valueOf(roxVar.hashCode()));
            sb.append(" oldState:");
            sb.append(i3);
            sb.append(" error:");
            sb.append(rovVar);
            sb.append(" reason:");
            sb.append(i);
            a.a(8, "AbstractUploaderAction", sb.toString());
        }
        if (roxVar != null) {
            a();
            roxVar.a((row) null);
            roxVar.a();
        }
        if (i == 2) {
            a(this.d == 2 ? 5 : 4);
            i2 = 4;
        } else {
            a(3);
            rnx e = e();
            if (e != null) {
                e.a(this);
            }
            if (i != 0) {
                i2 = 2;
            }
        }
        a(i2, rovVar);
    }

    @Override // tb.row
    public final void b(rox roxVar, rny rnyVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab329c28", new Object[]{this, roxVar, rnyVar, rovVar});
            return;
        }
        if (a.a(2)) {
            a.a(2, "AbstractUploaderAction", this.f33242a + " onError, session:" + roxVar.hashCode() + " request:" + rnyVar.hashCode() + " error:" + rovVar.toString());
        }
        if (this.d == 3) {
            if (!a.a(8)) {
                return;
            }
            a.a(8, "AbstractUploaderAction", this.f33242a + " onError, state is finish");
            return;
        }
        if ("100".equals(rovVar.f24058a)) {
            boolean a2 = roz.a(this.b);
            if (a.a(2)) {
                a.a(2, "AbstractUploaderAction", this.f33242a + " onError, connection error, isConnected:" + a2 + " error:" + rovVar.toString());
            }
            if (!a2 || "-1".equals(rovVar.b)) {
                a(roxVar, rovVar, 2);
                return;
            }
        }
        c(roxVar, rnyVar, rovVar);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(7, (Object) null);
        }
    }

    private void c(rox roxVar, rny rnyVar, rov rovVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48280a9", new Object[]{this, roxVar, rnyVar, rovVar});
        } else if (rovVar == null) {
        } else {
            if (!rovVar.d) {
                a(roxVar, rovVar, 1);
                return;
            }
            rov a2 = a(roxVar, rnyVar, rovVar);
            if (a2 == null) {
                return;
            }
            a(roxVar, a2, 1);
        }
    }

    public void c(rox roxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da77301f", new Object[]{this, roxVar});
            return;
        }
        if (a.a(8)) {
            a.a(8, "AbstractUploaderAction", this.f33242a + "onPause");
        }
        a(roxVar, (rov) null, 2);
    }
}
