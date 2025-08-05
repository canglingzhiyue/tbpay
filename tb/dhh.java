package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.net.core.request.d;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import tb.dhg;

/* loaded from: classes4.dex */
public class dhh extends dhg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dhg.a f26751a;
    private ConcurrentLinkedQueue<dho> b;
    private ConcurrentHashMap<dho, com.taobao.alimama.net.core.request.a> c;
    private AtomicInteger d;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final dhh f26757a;

        static {
            kge.a(1380324716);
            f26757a = new dhh();
        }

        public static /* synthetic */ dhh a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dhh) ipChange.ipc$dispatch("f03ad3a", new Object[0]) : f26757a;
        }
    }

    static {
        kge.a(1382872409);
    }

    public static /* synthetic */ Object ipc$super(dhh dhhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ConcurrentHashMap a(dhh dhhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("87074572", new Object[]{dhhVar}) : dhhVar.c;
    }

    public static /* synthetic */ void a(dhh dhhVar, dho dhoVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8709d8bf", new Object[]{dhhVar, dhoVar, str, obj});
        } else {
            dhhVar.b(dhoVar, str, obj);
        }
    }

    public static /* synthetic */ void a(dhh dhhVar, dho dhoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48b12ad", new Object[]{dhhVar, dhoVar, str, str2});
        } else {
            dhhVar.d(dhoVar, str, str2);
        }
    }

    public static /* synthetic */ void b(dhh dhhVar, dho dhoVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9de1c0", new Object[]{dhhVar, dhoVar, str, obj});
        } else {
            dhhVar.a(dhoVar, str, obj);
        }
    }

    public static /* synthetic */ void b(dhh dhhVar, dho dhoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1f1bae", new Object[]{dhhVar, dhoVar, str, str2});
        } else {
            dhhVar.b(dhoVar, str, str2);
        }
    }

    public static /* synthetic */ void c(dhh dhhVar, dho dhoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb324af", new Object[]{dhhVar, dhoVar, str, str2});
        } else {
            dhhVar.c(dhoVar, str, str2);
        }
    }

    public static /* synthetic */ void d(dhh dhhVar, dho dhoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45472db0", new Object[]{dhhVar, dhoVar, str, str2});
        } else {
            dhhVar.a(dhoVar, str, str2);
        }
    }

    @Override // tb.dhg
    public dhi a(dho dhoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhi) ipChange.ipc$dispatch("d58ac794", new Object[]{this, dhoVar});
        }
        if (dhoVar == null) {
            return null;
        }
        if (!dhoVar.b()) {
            dhoVar.a(Looper.myLooper());
        }
        return a(dhoVar, false);
    }

    private dhi a(final dho dhoVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhi) ipChange.ipc$dispatch("299d46fa", new Object[]{this, dhoVar, new Boolean(z)});
        }
        com.taobao.alimama.net.core.request.a a2 = d.a(dhoVar);
        if (a2 == null || dhoVar == null || dhoVar.e() == null) {
            return null;
        }
        if (z) {
            dhoVar.e().f26761a.incrementAndGet();
            this.d.incrementAndGet();
        }
        this.c.put(dhoVar, a2);
        a2.a(dhoVar, new dhl() { // from class: tb.dhh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dhl
            public void a(dhk dhkVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e524bd11", new Object[]{this, dhkVar});
                    return;
                }
                dhh.a(dhh.this).remove(dhoVar);
                if (dhkVar.a()) {
                    if (z) {
                        dhh.a(dhh.this, dhoVar, (String) null, (String) null);
                    } else {
                        dhh.b(dhh.this, dhoVar, (String) null, (String) null);
                    }
                } else if (dhoVar.a(dhkVar.f26759a)) {
                    if (z) {
                        dhh.a(dhh.this, dhoVar, dhkVar.f26759a, dhkVar.c);
                    } else {
                        dhh.b(dhh.this, dhoVar, dhkVar.f26759a, dhkVar.c);
                    }
                } else if (dhoVar.b(dhkVar.f26759a)) {
                    if (z) {
                        dhh.a(dhh.this, dhoVar, dhkVar.f26759a, dhkVar.b);
                    } else {
                        dhh.b(dhh.this, dhoVar, dhkVar.f26759a, dhkVar.b);
                    }
                } else if (z) {
                    dhh.c(dhh.this, dhoVar, dhkVar.f26759a, dhkVar.b);
                } else {
                    dhh.d(dhh.this, dhoVar, dhkVar.f26759a, dhkVar.b);
                }
            }
        });
        return new dhj(dhoVar);
    }

    public void b(dho dhoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a9950e", new Object[]{this, dhoVar});
        } else if (dhoVar == null || !this.b.contains(dhoVar) || !this.b.remove(dhoVar)) {
        } else {
            a(dhoVar, false);
        }
    }

    private void a(dho dhoVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c90733", new Object[]{this, dhoVar, str, obj});
            return;
        }
        c(dhoVar, str, obj);
        c();
    }

    private void a(dho dhoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a4121", new Object[]{this, dhoVar, str, str2});
        } else {
            f(dhoVar, str, str2);
        }
    }

    private void b(dho dhoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3db22", new Object[]{this, dhoVar, str, str2});
        } else if (c(dhoVar)) {
            if (!this.b.contains(dhoVar)) {
                d();
                this.b.add(dhoVar);
            }
            e(dhoVar, str, str2);
        } else {
            f(dhoVar, str, str2);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int i = this.f26751a.b - this.d.get();
        if (i <= 0) {
            return;
        }
        ArrayList<dho> arrayList = new ArrayList();
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            dho poll = this.b.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
            i = i2;
        }
        for (dho dhoVar : arrayList) {
            a(dhoVar, true);
        }
    }

    private void b(dho dhoVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b752a134", new Object[]{this, dhoVar, str, obj});
            return;
        }
        this.d.decrementAndGet();
        c(dhoVar, str, obj);
    }

    private void c(dho dhoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d7523", new Object[]{this, dhoVar, str, str2});
            return;
        }
        this.d.decrementAndGet();
        f(dhoVar, str, str2);
    }

    private void d(dho dhoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e70f24", new Object[]{this, dhoVar, str, str2});
            return;
        }
        this.d.decrementAndGet();
        if (c(dhoVar)) {
            if (!this.b.contains(dhoVar)) {
                d();
                this.b.add(dhoVar);
            }
            e(dhoVar, str, str2);
            return;
        }
        f(dhoVar, str, str2);
    }

    private boolean c(dho dhoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c22c9b93", new Object[]{this, dhoVar})).booleanValue() : dhoVar.d().f26760a > 0 && dhoVar.e().f26761a.get() < dhoVar.d().f26760a;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ArrayList<dho> arrayList = new ArrayList();
        while (this.b.size() >= this.f26751a.f26750a) {
            dho poll = this.b.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        }
        for (final dho dhoVar : arrayList) {
            a(dhoVar, new Runnable() { // from class: tb.dhh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dhoVar.f().b("ERROR_BE_ABANDONED", null);
                    }
                }
            });
        }
    }

    private void c(final dho dhoVar, final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dc3b35", new Object[]{this, dhoVar, str, obj});
        } else if (dhoVar.f() == null) {
        } else {
            a(dhoVar, new Runnable() { // from class: tb.dhh.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dhoVar.f().a(str, obj);
                    }
                }
            });
        }
    }

    private void e(final dho dhoVar, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("370a925", new Object[]{this, dhoVar, str, str2});
        } else if (dhoVar.f() == null) {
        } else {
            a(dhoVar, new Runnable() { // from class: tb.dhh.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dhoVar.f().a(str, str2);
                    }
                }
            });
        }
    }

    private void f(final dho dhoVar, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa4326", new Object[]{this, dhoVar, str, str2});
        } else if (dhoVar.f() == null) {
        } else {
            a(dhoVar, new Runnable() { // from class: tb.dhh.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        dhoVar.f().b(str, str2);
                    }
                }
            });
        }
    }

    private void a(dho dhoVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e501b08b", new Object[]{this, dhoVar, runnable});
            return;
        }
        Handler a2 = dhoVar.a();
        if (a2 != null) {
            a2.post(runnable);
        } else {
            runnable.run();
        }
    }

    private dhh() {
        this.f26751a = new dhg.a();
        this.b = new ConcurrentLinkedQueue<>();
        this.c = new ConcurrentHashMap<>();
        this.d = new AtomicInteger(0);
    }

    public static dhh b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dhh) ipChange.ipc$dispatch("16b55299", new Object[0]) : a.a();
    }
}
