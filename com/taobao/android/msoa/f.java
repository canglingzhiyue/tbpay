package com.taobao.android.msoa;

import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.android.msoa.annotation.ServiceRouter;
import com.taobao.android.msoa.q;
import com.taobao.android.msoa.util.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import tb.oan;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static f i;
    private o f;

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<g> f14426a = new LinkedBlockingQueue();
    private Map<String, BlockingQueue<g>> b = new ConcurrentHashMap();
    private Map<String, j> c = new ConcurrentHashMap();
    private Map<String, Object> d = new ConcurrentHashMap();
    private boolean e = false;
    private Handler g = new Handler(Looper.getMainLooper());
    private Map<String, Runnable> h = new ConcurrentHashMap();

    public static /* synthetic */ Map a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4031b52c", new Object[]{fVar}) : fVar.d;
    }

    public static /* synthetic */ void a(f fVar, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c00aebe", new Object[]{fVar, pVar});
        } else {
            fVar.a(pVar);
        }
    }

    public static /* synthetic */ void a(f fVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3c7941", new Object[]{fVar, str});
        } else {
            fVar.b(str);
        }
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fa08a81", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.e = z;
        return z;
    }

    public static /* synthetic */ BlockingQueue b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("2a8fa88b", new Object[]{fVar}) : fVar.f14426a;
    }

    public static /* synthetic */ Map c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b320d06a", new Object[]{fVar}) : fVar.b;
    }

    public static /* synthetic */ Handler d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("d2e7a772", new Object[]{fVar}) : fVar.g;
    }

    public static /* synthetic */ Map e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("260feba8", new Object[]{fVar}) : fVar.h;
    }

    private f() {
        q.a(new q.a() { // from class: com.taobao.android.msoa.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.q.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                f.a(f.this, true);
                f.a(f.this, (String) null);
            }
        });
        m.a();
        this.f = new o() { // from class: com.taobao.android.msoa.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.o
            public void a(String str, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                } else if (obj == null) {
                } else {
                    String str2 = str + " server bind service success";
                    f.a(f.this).put(str, obj);
                    f.a(f.this, str);
                }
            }
        };
        OrangeConfig.getInstance().registerListener(new String[]{m.ORANGE_GROUP_MSOA_PERMISSION}, new com.taobao.orange.g() { // from class: com.taobao.android.msoa.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.g
            public void onConfigUpdate(String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                } else {
                    m.a();
                }
            }
        });
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("8d4ed8b7", new Object[0]);
        }
        if (i == null) {
            synchronized (f.class) {
                if (i == null) {
                    i = new f();
                }
            }
        }
        return i;
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a28396", new Object[]{this, gVar});
        } else if (gVar == null) {
        } else {
            String str = gVar.f14434a + " server request service";
            if (this.f14426a.offer(gVar)) {
                if (!this.e) {
                    return;
                }
                b((String) null);
                return;
            }
            c.a().b(gVar.f14434a, "msoa_error_queue_full", "queue full", null);
        }
    }

    private void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.android.msoa.f.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Can't wrap try/catch for region: R(8:9|(2:11|(2:13|(2:15|(10:17|(1:19)|20|21|(2:23|(1:52)(4:27|(4:30|(2:32|33)(2:35|(2:37|38)(2:39|40))|34|28)|41|42))(5:53|(1:55)|56|(2:58|(3:60|(1:62)|81)(3:82|(1:84)|81))(3:85|(1:87)|81)|(1:(1:(2:67|(1:69)(1:70)))(4:71|72|(1:74)(1:77)|75))(1:80))|43|44|45|46|47)(1:89))(1:91))(1:92))(1:93)|90|43|44|45|46|47) */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
                    if (r7.equals("bindService") == false) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x0223, code lost:
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x0224, code lost:
                    r0.printStackTrace();
                 */
                /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 559
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.msoa.f.AnonymousClass4.run():void");
                }
            });
        }
    }

    private void a(final p pVar) {
        g peek;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64a69aed", new Object[]{this, pVar});
            return;
        }
        android.taobao.util.k.a("MSOA", pVar.d + " server bind service");
        final Intent intent = new Intent(pVar.e);
        intent.setComponent(new ComponentName("com.taobao.taobao", pVar.d));
        if (this.c.get(pVar.d) != null) {
            return;
        }
        final j jVar = new j(pVar.d, this.f);
        this.c.put(pVar.d, jVar);
        if (b.a().q(pVar.d)) {
            final String str = b.a().m(pVar.d).d;
            if (com.alibaba.android.split.p.a().a().contains(str)) {
                android.taobao.util.k.a("MSOA", pVar.d + " feature installed----" + str);
                Globals.getApplication().bindService(intent, jVar, 1);
                return;
            }
            android.taobao.util.k.a("MSOA", pVar.d + " feature not installed----" + str);
            BlockingQueue<g> blockingQueue = this.b.get(pVar.d);
            final String str2 = (blockingQueue == null || (peek = blockingQueue.peek()) == null || !(peek instanceof g)) ? "" : peek.f14434a;
            final String str3 = str2;
            com.alibaba.flexa.compat.c.a(pVar.d, new c.a() { // from class: com.taobao.android.msoa.f.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                        return;
                    }
                    android.taobao.util.k.a("MSOA", pVar.d + " onClassLoaded ----" + str);
                    Globals.getApplication().bindService(intent, jVar, 1);
                    f.this.a(str3);
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                        return;
                    }
                    f.this.a(str3);
                    c a2 = c.a();
                    String str4 = str3;
                    a2.b(str4, "onClassNotFound", pVar.d + " :onClassNotFound", null);
                    android.taobao.util.k.a("MSOA", pVar.d + " onClassNotFound ----" + str);
                }
            });
            Runnable runnable = new Runnable() { // from class: com.taobao.android.msoa.f.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a().b(str2, "msoa_error_timeout", "timeout", null);
                    }
                }
            };
            this.g.postDelayed(runnable, 5000L);
            this.h.put(str2, runnable);
            return;
        }
        Globals.getApplication().bindService(intent, jVar, 1);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Runnable remove = this.h.remove(str);
        if (remove == null) {
            return;
        }
        this.g.removeCallbacks(remove);
    }

    public <T> T a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("387a91d9", new Object[]{this, dVar});
        }
        if (dVar != null && !TextUtils.isEmpty(dVar.a()) && dVar.b() != null) {
            String str = "msoa.interface." + dVar.b().getCanonicalName() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX;
            String a2 = dVar.a();
            if (!TextUtils.isEmpty(dVar.c())) {
                a2 = dVar.a() + "@" + dVar.c();
            }
            com.taobao.android.msoa.util.d.a(str, "1.0", dVar.a(), dVar.c(), com.taobao.android.msoa.util.d.a(str), null, null, null, "MSOA_ObtainService");
            if (m.a(str + "@1.0", a2)) {
                ServiceRouter serviceRouter = (ServiceRouter) dVar.b().getAnnotation(ServiceRouter.class);
                Object a3 = serviceRouter != null ? a.a(serviceRouter.bundleName(), serviceRouter.implClass().getCanonicalName()) : null;
                if (a3 == null) {
                    return null;
                }
                return (T) Proxy.newProxyInstance(a3.getClass().getClassLoader(), new Class[]{dVar.b()}, new e(a3, dVar.b().getCanonicalName(), dVar.a(), dVar.c()));
            }
        }
        return null;
    }
}
