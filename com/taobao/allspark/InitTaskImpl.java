package com.taobao.allspark;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.d;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.e;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.taobao.wetao.home.GuangGuangTnodeMainFragment;
import com.taobao.wetao.home.tnode.GuangGuangBroadcastModule;
import com.taobao.wetao.home.tnode.a;
import com.taobao.wetao.receiver.LoginBroadcastReceiver;
import tb.ilw;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.rjk;

/* loaded from: classes4.dex */
public class InitTaskImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f8518a;
    private Application b;
    private boolean e;
    private boolean c = false;
    private long d = 0;
    private LoginBroadcastReceiver f = LoginBroadcastReceiver.a();
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: com.taobao.allspark.InitTaskImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!EVO.ACTION_INITIALIZE_COMPLETE.equals(intent.getAction())) {
            } else {
                InitTaskImpl.a(InitTaskImpl.this);
            }
        }
    };
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: com.taobao.allspark.InitTaskImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!d.ACTION_CHECK_PRELOAD.equals(intent.getAction()) || !InitTaskImpl.b(InitTaskImpl.this)) {
            } else {
                if (ab.b(a.a()) != null) {
                    ogg.a("find guangguang engine when Activity recreate,guangguang Engine is not empty");
                    return;
                }
                ogg.a("find guangguang engine when Activity recreate,guangguang Engine is empty, preload GuangGuang");
                InitTaskImpl.c(InitTaskImpl.this);
            }
        }
    };

    /* loaded from: classes4.dex */
    public class Tab2ChangedBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public Tab2ChangedBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            boolean d = InitTaskImpl.d(InitTaskImpl.this);
            InitTaskImpl initTaskImpl = InitTaskImpl.this;
            InitTaskImpl.a(initTaskImpl, InitTaskImpl.b(initTaskImpl));
            if (d == InitTaskImpl.d(InitTaskImpl.this)) {
                return;
            }
            InitTaskImpl initTaskImpl2 = InitTaskImpl.this;
            InitTaskImpl.b(initTaskImpl2, InitTaskImpl.d(initTaskImpl2));
        }
    }

    public static /* synthetic */ void a(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7bafa2", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.d();
        }
    }

    public static /* synthetic */ boolean a(InitTaskImpl initTaskImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34faf776", new Object[]{initTaskImpl, new Boolean(z)})).booleanValue();
        }
        initTaskImpl.c = z;
        return z;
    }

    public static /* synthetic */ void b(InitTaskImpl initTaskImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c18e851", new Object[]{initTaskImpl, new Boolean(z)});
        } else {
            initTaskImpl.a(z);
        }
    }

    public static /* synthetic */ boolean b(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e37ca6e7", new Object[]{initTaskImpl})).booleanValue() : initTaskImpl.e();
    }

    public static /* synthetic */ void c(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7d9e24", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.m();
        }
    }

    public static /* synthetic */ boolean d(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("757e9569", new Object[]{initTaskImpl})).booleanValue() : initTaskImpl.c;
    }

    public static /* synthetic */ void f(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78083e7", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.j();
        }
    }

    public static /* synthetic */ void g(InitTaskImpl initTaskImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0817b28", new Object[]{initTaskImpl});
        } else {
            initTaskImpl.k();
        }
    }

    public InitTaskImpl(Application application, boolean z) {
        this.b = application;
        this.f8518a = z;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if ("true".equals(oeb.b("Tab2.Tab2TaskOpt.enable_quick_launch_tab2task", "false")) != this.f8518a) {
        } else {
            ogg.a("start Tab2Task, fromQuickLaunch:" + this.f8518a);
            i();
            n();
            o();
            q();
            if (TBRevisionSwitchManager.i().e()) {
                return;
            }
            g();
            f();
            this.c = e();
            if (!this.c) {
                return;
            }
            if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().b() == 1) {
                String str = null;
                Context context = com.taobao.tao.navigation.e.c().getContext();
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getIntent() != null) {
                        str = activity.getIntent().getDataString();
                    }
                }
                GuangGuangTnodeMainFragment.doPreload(str);
            }
            l();
            if (c()) {
                if (EVO.isInitialized()) {
                    m();
                    return;
                }
                h();
                oec.a(new Runnable() { // from class: com.taobao.allspark.InitTaskImpl.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            InitTaskImpl.a(InitTaskImpl.this);
                        }
                    }
                }, 2000L);
                return;
            }
            m();
        }
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : OrangeConfig.getInstance().getConfig("weitao_switch", "enable_listen_abtest_ready", "true").equals("true");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e) {
        } else {
            this.e = true;
            m();
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : TBRevisionSwitchManager.i().a(ilw.KEY_NEW_CONTENT_ENABLE);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            d.a();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.b).registerReceiver(new Tab2ChangedBroadcastReceiver(), new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.g, new IntentFilter(EVO.ACTION_INITIALIZE_COMPLETE));
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            l();
            m();
            NavigationTabModule.resetTab(null);
        } else {
            ab b = ab.b(a.a());
            if (b != null) {
                b.y();
            }
            NavigationTabModule.resetTab(null);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            ab.a((Context) this.b);
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (!rjk.a().e()) {
        } else {
            final Runnable runnable = new Runnable() { // from class: com.taobao.allspark.InitTaskImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        com.taobao.tao.flexbox.layoutmanager.container.dx.c.INSTANCE.a();
                    } catch (Throwable th) {
                        TLog.loge("GuangGuang", "startDownloadDxTemplate", th);
                    }
                }
            };
            oec.a(new Runnable() { // from class: com.taobao.allspark.InitTaskImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AsyncTask.execute(runnable);
                    }
                }
            }, 1000L);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!rjk.a().d()) {
        } else {
            final Runnable runnable = new Runnable() { // from class: com.taobao.allspark.InitTaskImpl.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        com.taobao.umipublish.ayscpublish.c.a().e();
                    } catch (Throwable th) {
                        TLog.loge("GuangGuang", "startAsyncPublishTask", th);
                    }
                }
            };
            if (rjk.a().c()) {
                oec.a(new Runnable() { // from class: com.taobao.allspark.InitTaskImpl.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AsyncTask.execute(runnable);
                        }
                    }
                }, 2000L);
            } else {
                runnable.run();
            }
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!rjk.a().d()) {
        } else {
            try {
                com.taobao.android.publisher.service.export.ayscpublish.core.d.b().d();
            } catch (Throwable th) {
                TLog.loge("GuangGuang", "stopAsyncPublishTask", th);
            }
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            WXSDKEngine.registerModule("GuangGuangBroadcast", GuangGuangBroadcastModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
        if (Login.checkSessionValid()) {
            j();
        }
        com.taobao.tao.navigation.e.a(1, new e.InterfaceC0873e() { // from class: com.taobao.allspark.InitTaskImpl.8
        });
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            d.a(Globals.getApplication(), a.a());
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.f.a(new LoginBroadcastReceiver.b() { // from class: com.taobao.allspark.InitTaskImpl.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.b, com.taobao.wetao.receiver.LoginBroadcastReceiver.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!InitTaskImpl.b(InitTaskImpl.this)) {
                } else {
                    InitTaskImpl.f(InitTaskImpl.this);
                }
            }

            @Override // com.taobao.wetao.receiver.LoginBroadcastReceiver.b, com.taobao.wetao.receiver.LoginBroadcastReceiver.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    InitTaskImpl.g(InitTaskImpl.this);
                }
            }
        });
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.f);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.b).registerReceiver(this.h, new IntentFilter(d.ACTION_CHECK_PRELOAD));
        }
    }
}
