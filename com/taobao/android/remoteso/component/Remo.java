package com.taobao.android.remoteso.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.component.c;
import com.taobao.android.remoteso.component.h;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.List;
import tb.iht;
import tb.ikq;

/* loaded from: classes6.dex */
public final class Remo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final n f14772a = new n();
    private static final h b = new h();
    private static final c c = new c();

    /* loaded from: classes6.dex */
    public @interface Type {
    }

    public static /* synthetic */ c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fd653243", new Object[0]) : c;
    }

    public static /* synthetic */ n c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("9805f619", new Object[0]) : f14772a;
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("62c4709b", new Object[0]) : f14772a.a();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String a2 = c.a(str);
        RSoLog.c("remo,retrieveFlexaState - moduleName=" + str + " got state=" + a2);
        return a2;
    }

    public static l a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("d86757ab", new Object[]{kVar});
        }
        try {
            RSoLog.c("remo,check, enter = " + kVar);
            j jVar = new j(kVar, "check");
            l b2 = b(jVar);
            m.a(jVar, b2);
            RSoLog.c("remo,check, exit, result = " + b2);
            return b2;
        } catch (Throwable th) {
            ikq.a("remo,check,error", th);
            return l.a("remo,exception=" + th);
        }
    }

    private static l b(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("5b1c30eb", new Object[]{jVar});
        }
        ArrayList arrayList = new ArrayList();
        List<String> a2 = b.a(jVar);
        if (a2.size() > 0) {
            l a3 = l.a("check-failed=" + a2);
            RSoLog.c("remo,performCheck, rso exit, failure = " + a3);
            return a3;
        }
        arrayList.addAll(jVar.a("rso"));
        List<String> a4 = c.a(jVar);
        if (a4.size() > 0) {
            l a5 = l.a("check-failed=" + a4);
            RSoLog.c("remo,performCheck, flexa exit, failure = " + a5);
            return a5;
        }
        arrayList.addAll(jVar.a("flexa"));
        if (arrayList.size() > 0) {
            l a6 = l.a(arrayList);
            RSoLog.c("remo,performCheck, exit, success = " + a6);
            return a6;
        }
        RSoLog.b("remo,performCheck, exit, result failure known");
        return l.a("unknown");
    }

    public static void b(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9439ad9", new Object[]{kVar});
            return;
        }
        try {
            RSoLog.c("remo,install, enter = " + kVar);
            final j jVar = new j(kVar, "install");
            jVar.a(new d() { // from class: com.taobao.android.remoteso.component.Remo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.component.d
                public void a(l lVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcc8199", new Object[]{this, lVar});
                        return;
                    }
                    if (lVar.c() == 1003) {
                        Remo.b().b(j.this);
                    }
                    m.a(j.this, lVar);
                }
            });
            if (jVar.i()) {
                RSoLog.c("remo,install, updateRemoBOForUI = " + kVar);
                c(jVar);
            }
            l b2 = b(jVar);
            if (b2.e()) {
                RSoLog.c("remo,install, all modules done,  request = " + kVar);
                jVar.a(b2);
                return;
            }
            if (jVar.i()) {
                RSoLog.c("remo,install, launchRemoUI with showRemoUI = " + kVar);
                d(jVar);
            }
            a aVar = new a(jVar);
            c.a(jVar, aVar);
            b.a(jVar, aVar);
            RSoLog.c("remo,install, exit,  request = " + kVar);
        } catch (Throwable th) {
            ikq.a("remo,install,error", th);
            l a2 = l.a("remo,exception=" + th);
            d dVar = kVar.f14803a.h;
            if (dVar == null) {
                return;
            }
            dVar.a(a2);
        }
    }

    private static void c(final j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82bab419", new Object[]{jVar});
        } else if (!f14772a.a(jVar)) {
            jVar.a(l.a("requesting_by_other"));
        } else {
            jVar.a(new d() { // from class: com.taobao.android.remoteso.component.Remo.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.component.d
                public void a(l lVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcc8199", new Object[]{this, lVar});
                    } else {
                        Remo.c().b(j.this);
                    }
                }
            });
        }
    }

    private static void d(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3241b8", new Object[]{jVar});
            return;
        }
        Context h = jVar.h();
        if (h instanceof Activity) {
            RSoLog.c("remo,showRemoUI- Activity.startActivity( RemoActivity ) ");
            h.startActivity(new Intent(h, RemoActivity.class));
            return;
        }
        RSoLog.c("remo,showRemoUI- Context.startActivity( RemoActivity ) ");
        h.startActivity(new Intent(h, RemoActivity.class).addFlags(268435456));
    }

    /* loaded from: classes6.dex */
    public static class a implements c.a, h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final j f14775a;
        private final List<String> b;
        private final List<String> c;
        private volatile boolean d;
        private volatile boolean e;

        @Override // com.alibaba.android.split.core.tasks.e
        public /* synthetic */ void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, num});
            } else {
                a(num);
            }
        }

        public a(j jVar) {
            this.f14775a = jVar;
            this.b = jVar.a("flexa");
            this.c = jVar.a("rso");
            boolean z = true;
            this.d = this.b.size() == 0;
            this.e = this.c.size() != 0 ? false : z;
            a("flexa", 0);
            a("rso", 0);
        }

        @Override // com.alibaba.android.split.core.tasks.d
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            RSoLog.c("remo, listener.onFailure = " + exc);
            a(l.a("install-flexa-error=" + exc.toString()));
        }

        public void a(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
                return;
            }
            RSoLog.c("remo, listener.onSuccess = " + num);
            this.d = true;
            a();
        }

        @Override // tb.ihs
        public void a(iht ihtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edb10f83", new Object[]{this, ihtVar});
                return;
            }
            RSoLog.c("remo, listener.onFetchFinished = " + ihtVar);
            if (ihtVar.b()) {
                this.e = true;
                a();
                return;
            }
            a(l.a("install-rso-error=" + ihtVar.a()));
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!this.d || !this.e) {
                RSoLog.c("remo, skip, waiting all module complete");
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.b);
                arrayList.addAll(this.c);
                a(l.a(arrayList));
            }
        }

        @Override // com.taobao.android.remoteso.component.c.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                a("flexa", i);
            }
        }

        @Override // com.taobao.android.remoteso.component.h.a
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                a("rso", i);
            }
        }

        private void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            RSoLog.c("remo, listener.handleProgress, " + str + "=" + i);
            this.f14775a.a(i);
        }

        private void a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc8199", new Object[]{this, lVar});
                return;
            }
            RSoLog.c("remo, listener.handleResult = " + lVar);
            this.f14775a.a(lVar);
        }
    }
}
