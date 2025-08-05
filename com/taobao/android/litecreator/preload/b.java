package com.taobao.android.litecreator.preload;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import java.util.Comparator;
import java.util.Observable;
import java.util.Observer;
import java.util.PriorityQueue;
import tb.kge;

/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f13385a;
    private static final b g;
    private volatile boolean b;
    private HandlerThread c;
    private Handler d;
    private int e = 0;
    private PriorityQueue<a> f = new PriorityQueue<>(1000, new Comparator<a>() { // from class: com.taobao.android.litecreator.preload.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public /* synthetic */ int compare(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, aVar, aVar2})).intValue() : a(aVar, aVar2);
        }

        public int a(a aVar, a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e5dea7cb", new Object[]{this, aVar, aVar2})).intValue();
            }
            if (aVar != null && aVar2 != null) {
                return aVar2.a() - aVar.a();
            }
            return 0;
        }
    });
    private Observer h = new Observer() { // from class: com.taobao.android.litecreator.preload.b.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            } else {
                b.a(b.this, (a) observable, ((Integer) obj).intValue());
            }
        }
    };

    public static /* synthetic */ void a(b bVar, Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8b2d52", new Object[]{bVar, message});
        } else {
            bVar.a(message);
        }
    }

    public static /* synthetic */ void a(b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f563577", new Object[]{bVar, aVar});
        } else {
            bVar.c(aVar);
        }
    }

    public static /* synthetic */ void a(b bVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b70ec6c", new Object[]{bVar, aVar, new Integer(i)});
        } else {
            bVar.a(aVar, i);
        }
    }

    static {
        kge.a(611437349);
        f13385a = s.g();
        g = new b();
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b85270c5", new Object[0]) : g;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            d();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            e();
        }
    }

    private synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b) {
            u.d("MaterialTaskScheduler", "scheduler has already started.");
        } else {
            this.c = new HandlerThread("MaterialTaskScheduler");
            this.c.start();
            this.d = new Handler(this.c.getLooper()) { // from class: com.taobao.android.litecreator.preload.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == 673877017) {
                        super.handleMessage((Message) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                        return;
                    }
                    super.handleMessage(message);
                    b.a(b.this, message);
                }
            };
            this.b = true;
        }
    }

    private synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.b) {
            u.d("MaterialTaskScheduler", "scheduler has already stop.");
        } else {
            if (this.c != null) {
                this.c.quitSafely();
                this.c = null;
                this.d = null;
            }
            this.f.clear();
            this.e = 0;
            this.b = false;
        }
    }

    private void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 1) {
            a aVar = (a) message.obj;
            if (this.f.contains(aVar)) {
                return;
            }
            this.f.offer(aVar);
            u.b("MaterialTaskScheduler", "task-" + aVar.c() + " dispatched, now task queue size = " + this.f.size());
        } else if (i == 2) {
            this.e--;
            u.b("MaterialTaskScheduler", "task-" + ((a) message.obj).c() + " finished, now task queue size = " + this.f.size());
        } else {
            if (i == 3) {
                this.e--;
                u.b("MaterialTaskScheduler", "task-" + ((a) message.obj).c() + " timeout, now task queue size = " + this.f.size());
            } else if (i != 4) {
                if (i != 5) {
                    return;
                }
                a aVar2 = (a) message.obj;
                if (!this.f.contains(aVar2)) {
                    return;
                }
                this.f.remove(aVar2);
                u.b("MaterialTaskScheduler", "task-" + aVar2.c() + " canceled, now task queue size = " + this.f.size());
                return;
            }
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a peek = this.f.peek();
        if (peek == null) {
            u.b("MaterialTaskScheduler", "not task left in this queue, waiting for new task.");
        } else if (b(peek)) {
            u.b("MaterialTaskScheduler", "there is't enough channel.");
        } else {
            a poll = this.f.poll();
            if (poll == null) {
                return;
            }
            this.e++;
            poll.addObserver(this.h);
            au.a(poll, !poll.e());
            u.b("MaterialTaskScheduler", "task-" + poll.c() + " scheduled, now task queue size = " + this.f.size());
        }
    }

    private boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2ade365", new Object[]{this, aVar})).booleanValue() : aVar.a() > 1 ? this.e >= f13385a + 1 : this.e >= f13385a;
    }

    private void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794459e3", new Object[]{this, aVar, new Integer(i)});
        } else if (this.d == null) {
        } else {
            Message obtain = Message.obtain();
            if (i == 2) {
                obtain.what = 2;
            } else if (i == 3) {
                obtain.what = 3;
            }
            obtain.obj = aVar;
            this.d.sendMessage(obtain);
            this.d.sendEmptyMessage(4);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d33bd20", new Object[]{this, aVar});
        } else {
            a(aVar, true);
        }
    }

    public void a(final a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794499b4", new Object[]{this, aVar, new Boolean(z)});
        } else if (z) {
            aVar.run();
        } else if (!this.b || this.d == null) {
            u.d("MaterialTaskScheduler", "scheduler has't started yet.");
        } else {
            au.a(new Runnable() { // from class: com.taobao.android.litecreator.preload.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this, aVar);
                    }
                }
            });
        }
    }

    private void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("182809a2", new Object[]{this, aVar});
        } else if (!this.b || this.d == null) {
            u.d("MaterialTaskScheduler", "scheduler has't started yet.");
        } else {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = aVar;
            this.d.sendMessage(obtain);
            this.d.sendEmptyMessage(4);
        }
    }
}
