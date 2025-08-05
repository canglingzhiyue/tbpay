package com.etao.feimagesearch.util;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public class ad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f7007a;
    private final ExecutorService c;
    private final Handler b = new Handler(Looper.getMainLooper());
    private volatile boolean e = false;

    public static /* synthetic */ ExecutorService a(ad adVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("1256625", new Object[]{adVar}) : adVar.c;
    }

    static {
        kge.a(216187023);
        f7007a = new Handler(Looper.getMainLooper());
    }

    public ad(final String str) {
        this.c = VExecutors.newSingleThreadExecutor(new com.taobao.android.virtual_thread.face.h() { // from class: com.etao.feimagesearch.util.ad.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return str + "_" + hashCode();
            }
        });
    }

    public void a(String str, ac acVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72a4e221", new Object[]{this, str, acVar});
            return;
        }
        acVar.b(str);
        this.b.post(acVar);
    }

    public void b(String str, ac acVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf93762", new Object[]{this, str, acVar});
        } else if (this.e) {
        } else {
            acVar.b(str);
            try {
                this.c.submit(acVar);
            } catch (Exception unused) {
            }
        }
    }

    public void a(ac acVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e29535d", new Object[]{this, acVar, new Boolean(z)});
            return;
        }
        b();
        b(acVar, z);
    }

    private void b(ac acVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7beffc", new Object[]{this, acVar, new Boolean(z)});
        } else if (this.e) {
        } else {
            this.e = true;
            if (acVar == null) {
                return;
            }
            acVar.b("clearAndDestroy");
            if (z) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z2 = true;
                }
                if (z2) {
                    acVar.a();
                } else {
                    this.b.post(acVar);
                }
                this.c.shutdown();
            } else if (com.etao.feimagesearch.config.b.bq()) {
                this.c.submit(acVar);
                this.c.submit(new ac() { // from class: com.etao.feimagesearch.util.ad.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                        if (str.hashCode() == -73738099) {
                            super.a((Throwable) objArr[0]);
                            return null;
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            ad.a(ad.this).shutdown();
                        }
                    }

                    @Override // com.etao.feimagesearch.util.ac
                    public void a(Throwable th) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                            return;
                        }
                        super.a(th);
                        cot.a("PltCameraPai", "ThreadDispatcher", cot.a("shutdown error ", th));
                    }
                });
            } else {
                try {
                    this.c.submit(acVar);
                } catch (Exception unused) {
                }
                this.c.shutdown();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.removeCallbacksAndMessages(null);
        }
    }

    public static void c(String str, ac acVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54d8ca3", new Object[]{str, acVar});
            return;
        }
        acVar.b(str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            acVar.run();
        } else {
            f7007a.post(acVar);
        }
    }

    public static void a(String str, ac acVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f7d8c3", new Object[]{str, acVar, new Long(j)});
            return;
        }
        acVar.b(str);
        f7007a.postDelayed(acVar, j);
    }
}
