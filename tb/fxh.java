package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class fxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f28188a = true;
    private a b = new a(this);
    private List<fxg> c;
    private long d;

    static {
        kge.a(281426873);
    }

    public static /* synthetic */ boolean a(fxh fxhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e96e8946", new Object[]{fxhVar})).booleanValue() : fxhVar.f28188a;
    }

    public static /* synthetic */ long b(fxh fxhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d7f18fb7", new Object[]{fxhVar})).longValue() : fxhVar.d;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f28188a = true;
        this.b.removeMessages(1);
    }

    public fxh(long j) {
        this.d = j;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<fxg> list = this.c;
        if (list == null || list.size() == 0) {
            a();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (fxg fxgVar : this.c) {
            int i = (int) ((elapsedRealtime - fxgVar.c) / fxgVar.b);
            if (i >= fxgVar.d + 1) {
                fxgVar.f28187a.a();
                fxgVar.d = i;
            }
        }
    }

    public void a(fxf fxfVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4446e6c0", new Object[]{this, fxfVar, new Long(j)});
        } else if (fxfVar != null && j > 0) {
            if (this.c == null) {
                this.c = new CopyOnWriteArrayList();
            }
            for (fxg fxgVar : this.c) {
                if (fxgVar.f28187a == fxfVar) {
                    return;
                }
            }
            fxg fxgVar2 = new fxg();
            fxgVar2.f28187a = fxfVar;
            long j2 = this.d;
            if (j <= j2) {
                j = j2;
            }
            fxgVar2.b = j;
            fxgVar2.c = SystemClock.elapsedRealtime();
            this.c.add(fxgVar2);
            c();
        }
    }

    public void a(fxf fxfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96da084", new Object[]{this, fxfVar});
        } else if (fxfVar == null) {
        } else {
            List<fxg> list = this.c;
            if (list == null) {
                a();
                return;
            }
            Iterator<fxg> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fxg next = it.next();
                if (next.f28187a == fxfVar) {
                    this.c.remove(next);
                    break;
                }
            }
            if (this.c.size() != 0) {
                return;
            }
            a();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f28188a) {
        } else {
            this.f28188a = false;
            this.b.a(SystemClock.elapsedRealtime());
            a aVar = this.b;
            aVar.sendMessage(aVar.obtainMessage(1));
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        List<fxg> list = this.c;
        if (list != null) {
            list.clear();
        }
        a();
    }

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<fxh> f28189a;
        private long b;

        static {
            kge.a(-1175811814);
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }

        public a(fxh fxhVar) {
            super(Looper.getMainLooper());
            this.f28189a = new WeakReference<>(fxhVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            fxh fxhVar = this.f28189a.get();
            if (fxhVar == null || fxh.a(fxhVar)) {
                return;
            }
            fxhVar.b();
            sendMessageDelayed(obtainMessage(1), fxh.b(fxhVar) - ((SystemClock.elapsedRealtime() - this.b) % fxh.b(fxhVar)));
        }
    }
}
