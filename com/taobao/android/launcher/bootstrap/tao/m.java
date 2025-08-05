package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.gtk;
import tb.gtx;
import tb.gve;
import tb.gvt;
import tb.nld;
import tb.nso;

/* loaded from: classes5.dex */
public class m extends e implements ScheduleComposer, com.taobao.android.launcher.bootstrap.tao.ability.n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ScheduleComposer f13096a;

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        if (str.hashCode() == 948947437) {
            super.a((Application) objArr[0], (gtx) objArr[1], (e.a) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public m(gtk gtkVar) {
        this.f13096a = nso.a(gtkVar);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.e
    public void a(Application application, gtx gtxVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388fc9ed", new Object[]{this, application, gtxVar, aVar});
            return;
        }
        a aVar2 = new a(this.f13096a, aVar);
        super.a(application, gtxVar, aVar2);
        boolean b = nld.b(application);
        boolean a2 = nld.a(application);
        h.b("ngSchedule", "ColdStartAdInfoCache needBootImage ? " + b + ", needUCP ? " + a2);
        if (b) {
            BootstrapMode.a(32);
        }
        if (a2) {
            BootstrapMode.a(96);
        }
        a(application, aVar2);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.n
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        ScheduleComposer scheduleComposer = this.f13096a;
        if (!(scheduleComposer instanceof com.taobao.android.launcher.bootstrap.tao.ability.n)) {
            return false;
        }
        return ((com.taobao.android.launcher.bootstrap.tao.ability.n) scheduleComposer).b(context);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f13096a.a(str);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
        } else {
            this.f13096a.onActivityPreCreated(activity, bundle);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cb46a1", new Object[]{this, activity, bundle});
        } else {
            this.f13096a.onActivityPostCreated(activity, bundle);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void a(Application application, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6870645", new Object[]{this, application, oVar});
        } else {
            this.f13096a.a(application, oVar);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f13096a.a();
    }

    /* loaded from: classes5.dex */
    public static class a implements e.a, o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final e.a f13097a;
        private final ScheduleComposer b;
        private final List<Runnable> c = new CopyOnWriteArrayList();

        public a(ScheduleComposer scheduleComposer, e.a aVar) {
            this.b = scheduleComposer;
            this.f13097a = aVar;
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.e.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            gvt.a("onLaunchCompleteReceived");
            gvt.a();
            final e.a aVar = this.f13097a;
            if (aVar == null) {
                return;
            }
            if (this.b.a()) {
                h.b("ngSchedule", "composer is finished, fire the onLaunchCompleted event immediately");
                aVar.a();
                return;
            }
            h.b("ngSchedule", "composer is not finished, stash the onLaunchCompleted event");
            this.c.add(new Runnable() { // from class: com.taobao.android.launcher.bootstrap.tao.m.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aVar.a();
                    }
                }
            });
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.e.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            final e.a aVar = this.f13097a;
            if (aVar == null) {
                return;
            }
            if (this.b.a()) {
                h.b("ngSchedule", "composer is finished, fire the onLaunchBackgroundDeepIdle event immediately");
                aVar.b();
                return;
            }
            h.b("ngSchedule", "composer is not finished, stash the onLaunchBackgroundDeepIdle event");
            this.c.add(new Runnable() { // from class: com.taobao.android.launcher.bootstrap.tao.m.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aVar.b();
                    }
                }
            });
        }

        @Override // com.taobao.android.launcher.bootstrap.tao.o
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            boolean isEmpty = this.c.isEmpty();
            int d = BootstrapMode.d();
            AppMonitor.Counter.commit(gve.MODULE, "ngSchedule", "stashEmpty=" + isEmpty + ",coldUCP=" + BootstrapMode.a(d, 64) + ",coldBootImage=" + BootstrapMode.a(d, 32) + ",ngLaunch=" + BootstrapMode.a(d, 4) + ",ngNextLaunch=" + BootstrapMode.a(d, 8) + ",eraseState=" + BootstrapMode.a(d, 128) + ",coldAdv=" + BootstrapMode.a(d, 256) + ",ngNextDelegate=" + BootstrapMode.a(d, 512) + ",fullyNewInstall=" + BootstrapMode.a(d, 1024) + ",multiLang=" + BootstrapMode.a(d, 2048) + ",coldPreload=" + BootstrapMode.a(d, 4096) + ",qosSchedule=" + BootstrapMode.a(d, 8192) + ",startupContextFix=" + BootstrapMode.a(d, 16384), 1.0d);
            if (isEmpty) {
                return;
            }
            h.b("ngSchedule", "composer callback arrived, fire the events stashed before");
            for (Runnable runnable : this.c) {
                runnable.run();
            }
        }
    }
}
