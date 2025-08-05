package com.taobao.android.detail.ttdetail.communication;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f10519a = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.android.detail.ttdetail.communication.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicInteger b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "CommunicationCenter Thread - " + this.b.getAndIncrement());
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    });
    private final C0404b b = new C0404b(new e() { // from class: com.taobao.android.detail.ttdetail.communication.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.communication.e
        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else if (Looper.myLooper() != Looper.getMainLooper()) {
                runnable.run();
            } else {
                b.a(b.this).execute(runnable);
            }
        }
    });
    private final Handler c = new Handler(Looper.getMainLooper());
    private final C0404b d = new C0404b(new e() { // from class: com.taobao.android.detail.ttdetail.communication.b.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.communication.e
        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                b.b(b.this).post(runnable);
            }
        }
    });
    private final Map<Integer, List<g>> e = new ConcurrentHashMap();
    private final Map<Integer, f> f = new ConcurrentHashMap();

    static {
        kge.a(1284344383);
    }

    public static /* synthetic */ ThreadPoolExecutor a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("27a4bbc1", new Object[]{bVar}) : bVar.f10519a;
    }

    public static /* synthetic */ Handler b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("23cfc8a4", new Object[]{bVar}) : bVar.c;
    }

    public b() {
        this.f10519a.allowCoreThreadTimeOut(true);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e.clear();
        this.f.clear();
    }

    public void a(int i, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988c3310", new Object[]{this, new Integer(i), fVar});
        } else if (fVar == null) {
        } else {
            synchronized (this) {
                this.f.put(Integer.valueOf(i), fVar);
            }
        }
    }

    public <T extends d> void a(Class<T> cls, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197f1e4a", new Object[]{this, cls, fVar});
        } else {
            a(h.a(cls), fVar);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f.remove(Integer.valueOf(i));
        }
    }

    public <T extends d> void b(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7800274", new Object[]{this, cls});
        } else {
            b(h.a(cls));
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629b2f5d", new Object[]{this, fVar});
        } else if (fVar != null) {
            synchronized (this) {
                for (Map.Entry<Integer, f> entry : this.f.entrySet()) {
                    if (entry.getValue() == fVar) {
                        this.f.remove(entry.getKey());
                    }
                }
            }
        }
    }

    public <T> T a(d dVar) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("358d0273", new Object[]{this, dVar});
        }
        if (dVar != null && (fVar = this.f.get(Integer.valueOf(dVar.d()))) != null) {
            return (T) fVar.a(dVar);
        }
        return null;
    }

    public void a(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988ca76f", new Object[]{this, new Integer(i), gVar});
        } else if (gVar != null) {
            synchronized (this) {
                List<g> list = this.e.get(Integer.valueOf(i));
                if (list == null) {
                    list = Collections.synchronizedList(new ArrayList());
                    this.e.put(Integer.valueOf(i), list);
                }
                for (g gVar2 : list) {
                    if (gVar2 == gVar) {
                        return;
                    }
                }
                list.add(gVar);
            }
        }
    }

    public <T extends d> void a(Class<T> cls, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197f92a9", new Object[]{this, cls, gVar});
        } else {
            a(h.a(cls), gVar);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e.remove(Integer.valueOf(i));
        }
    }

    public <T extends d> void a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{this, cls});
        } else {
            a(h.a(cls));
        }
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629ba3bc", new Object[]{this, gVar});
        } else if (gVar != null) {
            synchronized (this) {
                for (List<g> list : this.e.values()) {
                    for (int size = list.size() - 1; size > 0; size--) {
                        if (list.get(size) == gVar) {
                            list.remove(size);
                        }
                    }
                }
            }
        }
    }

    public void b(d dVar) {
        List<g> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882e4fa0", new Object[]{this, dVar});
        } else if (dVar != null && (list = this.e.get(Integer.valueOf(dVar.d()))) != null) {
            for (g gVar : list) {
                if (ThreadMode.WorkThread == gVar.onRunThreadMode()) {
                    this.b.a(new a(dVar, gVar));
                } else {
                    this.d.a(new a(dVar, gVar));
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private d f10523a;
        private g b;

        static {
            kge.a(-1796187105);
            kge.a(-1390502639);
        }

        public a(d dVar, g gVar) {
            this.f10523a = dVar;
            this.b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            g gVar = this.b;
            if (gVar == null) {
                return;
            }
            gVar.receiveMessage(this.f10523a);
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.communication.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0404b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final e f10524a;
        private final ArrayDeque<Runnable> b = new ArrayDeque<>();
        private Runnable c;

        static {
            kge.a(1525731448);
        }

        public static /* synthetic */ void a(C0404b c0404b) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("208ed623", new Object[]{c0404b});
            } else {
                c0404b.a();
            }
        }

        public C0404b(e eVar) {
            this.f10524a = eVar;
        }

        public synchronized void a(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
                return;
            }
            this.b.offer(new Runnable() { // from class: com.taobao.android.detail.ttdetail.communication.b.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        runnable.run();
                    } finally {
                        C0404b.a(C0404b.this);
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }

        private synchronized void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Runnable poll = this.b.poll();
            this.c = poll;
            if (poll != null) {
                this.f10524a.a(this.c);
            }
        }
    }
}
