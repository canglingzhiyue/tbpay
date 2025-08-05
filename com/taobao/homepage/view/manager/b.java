package com.taobao.homepage.view.manager;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.RequestTypeEnum;
import tb.gmq;
import tb.kge;
import tb.ksp;
import tb.ksr;
import tb.kyu;
import tb.lbo;
import tb.oql;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lbo f17304a;
    private MessageQueue.IdleHandler b = new MessageQueue.IdleHandler() { // from class: com.taobao.homepage.view.manager.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            ksp.a("IdleHandlerManager", "startUpIdleHandler");
            FestivalMgr.a().c();
            return false;
        }
    };
    private MessageQueue.IdleHandler c = new MessageQueue.IdleHandler() { // from class: com.taobao.homepage.view.manager.b.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            ksp.a("IdleHandlerManager", "hotStartIdleHandler");
            ksr.a("hotIdleForRemindAndConfig", "1.0", null, null);
            return false;
        }
    };
    private MessageQueue.IdleHandler d = new MessageQueue.IdleHandler() { // from class: com.taobao.homepage.view.manager.b.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
            }
            gmq.a("idle_coldStart_event", false);
            gmq.d();
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.homepage.view.manager.b.3.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (j.a("disableCallFirstFrameFinishedOnIdle", true)) {
                    } else {
                        kyu.a();
                        oql.a().c();
                    }
                }
            }, 100L);
            Coordinator.execute(new Runnable() { // from class: com.taobao.homepage.view.manager.b.3.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity curActivity = b.this.f17304a.a().getCurActivity();
                    if (curActivity == null) {
                        return;
                    }
                    b.this.f17304a.a().getStartUpWorkflow().a(curActivity.getIntent(), RequestTypeEnum.COLD_START);
                }
            });
            com.taobao.homepage.view.widgets.bgcontainer.c d = b.this.f17304a.d();
            if (d != null) {
                d.d();
            }
            return false;
        }
    };

    static {
        kge.a(337075829);
    }

    public b(lbo lboVar) {
        this.f17304a = lboVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            Looper.myQueue().addIdleHandler(this.d);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            Looper.myQueue().addIdleHandler(this.b);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            Looper.myQueue().addIdleHandler(this.c);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            Looper.myQueue().removeIdleHandler(this.b);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            Looper.myQueue().removeIdleHandler(this.c);
        }
    }
}
