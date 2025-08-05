package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class tjz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_PRIORITY = 1;
    public static final int LOW_PRIORITY = 2;
    public static final int NORMAL_PRIORITY = 0;

    /* renamed from: a  reason: collision with root package name */
    private Handler f34168a = new Handler(Looper.getMainLooper());
    private boolean b = oeb.a("filterDupMessage", true);
    private final List<WeakReference<a>> c = new ArrayList();

    static {
        kge.a(-1956312158);
    }

    public static /* synthetic */ void a(tjz tjzVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94987ee3", new Object[]{tjzVar, aVar});
        } else {
            tjzVar.b(aVar);
        }
    }

    private void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891214f8", new Object[]{this, aVar});
            return;
        }
        synchronized (this.c) {
            Iterator<WeakReference<a>> it = this.c.iterator();
            while (it.hasNext()) {
                if (it.next().get() == aVar) {
                    it.remove();
                }
            }
        }
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("35a32773", new Object[]{this, str});
        }
        synchronized (this.c) {
            Iterator<WeakReference<a>> it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = it.next().get();
                if (aVar != null && TextUtils.equals(a.a(aVar), str)) {
                    it.remove();
                    return aVar;
                }
            }
            return null;
        }
    }

    private void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ed7f39", new Object[]{this, aVar});
            return;
        }
        synchronized (this.c) {
            this.c.add(new WeakReference<>(aVar));
        }
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79f1f2c", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        if (a.b(aVar) != 0) {
            ogg.a("PriorityHandler", "only support normal priority task");
        }
        this.f34168a.postDelayed(aVar, i);
    }

    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f36aab7", new Object[]{this, aVar});
            return;
        }
        a.a(aVar, this);
        int b = a.b(aVar);
        if (b != 1) {
            if (b == 2) {
                final MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: tb.tjz.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                        }
                        aVar.run();
                        return false;
                    }
                };
                oec.a(new Runnable() { // from class: tb.tjz.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Looper.myQueue().addIdleHandler(idleHandler);
                        }
                    }
                }, true);
                return;
            }
            this.f34168a.post(aVar);
            return;
        }
        if (this.b) {
            a a2 = a(a.a(aVar));
            if (a2 != null) {
                this.f34168a.removeCallbacks(a2);
            }
            c(aVar);
        }
        this.f34168a.postAtFrontOfQueue(aVar);
    }

    /* loaded from: classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private tjz f34171a;
        private String b;
        private int c = 0;

        static {
            kge.a(-741778645);
            kge.a(-1390502639);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11352ec9", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ tjz a(a aVar, tjz tjzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tjz) ipChange.ipc$dispatch("ebaef1ff", new Object[]{aVar, tjzVar});
            }
            aVar.f34171a = tjzVar;
            return tjzVar;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("891214eb", new Object[]{aVar})).intValue() : aVar.c;
        }

        public a() {
        }

        public a(String str) {
            this.b = str;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.c = i;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.c != 1) {
            } else {
                tjz.a(this.f34171a, this);
            }
        }
    }
}
