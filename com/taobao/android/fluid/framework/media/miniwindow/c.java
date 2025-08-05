package com.taobao.android.fluid.framework.media.miniwindow;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.permission.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import tb.kge;
import tb.ogb;
import tb.sij;
import tb.snv;
import tb.soi;
import tb.soj;
import tb.spv;
import tb.spy;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_NAME = "CURRENT_PLAYVIDEO_MGR";
    public static final int DELAY_MILLIS = 1000;
    private final FluidContext c;
    private Activity d;
    private snv e;
    private IMediaService.a f;
    private boolean g;
    private boolean h;
    private boolean j;
    private boolean k;
    private Handler l;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.android.fluid.framework.permission.a f12586a = new com.taobao.android.fluid.framework.permission.a();
    private final a b = new a();
    private boolean i = false;

    static {
        kge.a(1230551687);
    }

    public static /* synthetic */ snv a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("2fa8b181", new Object[]{cVar}) : cVar.e;
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b60d246e", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.h = z;
        return z;
    }

    public static /* synthetic */ FluidContext b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("2ee8fb9f", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ void b(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7082c4eb", new Object[]{cVar, new Boolean(z)});
        } else {
            cVar.b(z);
        }
    }

    public static /* synthetic */ boolean c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("647b9a6c", new Object[]{cVar})).booleanValue() : cVar.j;
    }

    public static /* synthetic */ boolean d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a7f65cb", new Object[]{cVar})).booleanValue() : cVar.j();
    }

    public static /* synthetic */ a e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("60c7be4b", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ Activity f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("baa85343", new Object[]{cVar}) : cVar.d;
    }

    public c(FluidContext fluidContext) {
        this.c = fluidContext;
    }

    public snv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snv) ipChange.ipc$dispatch("f0a9703", new Object[]{this}) : this.e;
    }

    public void a(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff16fb7d", new Object[]{this, snvVar});
        } else {
            this.e = snvVar;
        }
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.d = activity;
        }
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        this.b.a();
        if (this.h) {
            f.a().b();
            this.h = false;
        }
        this.f12586a.a(activity);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d == null || this.e == null) {
        } else {
            n();
            if (this.d.isFinishing()) {
                this.e.c();
            }
            if (!sij.c()) {
                return;
            }
            l();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.i = false;
        if (!sij.c()) {
            return;
        }
        m();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (sij.c()) {
        } else {
            m();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (sij.c()) {
        } else {
            l();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        snv snvVar = this.e;
        if (snvVar == null || snvVar.e() != 1) {
            return;
        }
        this.e.c();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        snv snvVar = this.e;
        if (snvVar != null && snvVar.e() == 1) {
            f();
        }
        if (this.l == null) {
            this.l = new Handler(Looper.getMainLooper());
        }
        this.l.postDelayed(new Runnable() { // from class: com.taobao.android.fluid.framework.media.miniwindow.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.a(c.this) == null || !soj.b(c.b(c.this)) || com.taobao.android.fluid.framework.mute.helper.f.g(c.b(c.this))) {
                } else {
                    c.a(c.this).e(false);
                }
            }
        }, 1000L);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        snv snvVar = this.e;
        if (snvVar == null || snvVar.e() == 1) {
            return;
        }
        if (this.e.e() != 2) {
            this.e.a();
        } else {
            this.e.b();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        snv snvVar = this.e;
        if (snvVar == null || snvVar.f() == null || this.e.e() == 1 || !j()) {
            return;
        }
        this.e.a(com.taobao.android.fluid.framework.mute.helper.f.g(this.c));
        h();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void a(IMediaService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2a7cd4", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (sij.c()) {
            snv snvVar = this.e;
            return (snvVar != null && !snvVar.l()) && k();
        } else if (!this.k) {
            return k();
        } else {
            return true;
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        com.taobao.tao.flexbox.layoutmanager.container.f pageInterface = ((IHostPageInterfaceService) this.c.getService(IHostPageInterfaceService.class)).getPageInterface();
        com.taobao.android.layoutmanager.container.secondpage.biz.b bVar = null;
        if (pageInterface != null) {
            bVar = com.taobao.android.layoutmanager.container.secondpage.biz.a.a((ogb) pageInterface);
        } else {
            Activity activity = this.d;
            if (activity instanceof ogb) {
                bVar = com.taobao.android.layoutmanager.container.secondpage.biz.a.a((ogb) activity);
            }
        }
        return (bVar == null || !bVar.k()) && !((ISceneConfigService) this.c.getService(ISceneConfigService.class)).getSlidePageLockConfigure().a() && !((ISceneConfigService) this.c.getService(ISceneConfigService.class)).isItemRecognizeShowing();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        snv snvVar = this.e;
        this.k = snvVar != null && snvVar.e() == 1;
        this.i = spv.a().a(this.c) && spv.a().c();
        if (this.g && !b.a(this.d)) {
            snv snvVar2 = this.e;
            if (snvVar2 == null) {
                return;
            }
            if (snvVar2.e() == 2) {
                z = true;
            }
            this.j = z;
            this.f12586a.a(this.d, new a.InterfaceC0496a() { // from class: com.taobao.android.fluid.framework.media.miniwindow.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.fluid.framework.permission.a.InterfaceC0496a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.this.g();
                    }
                }

                @Override // com.taobao.android.fluid.framework.permission.a.InterfaceC0496a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (c.a(c.this) == null) {
                    } else {
                        if (c.a(c.this).f() != null && c.a(c.this).e() == 2 && !c.c(c.this) && c.d(c.this)) {
                            c.this.h();
                        }
                        if (!c.e(c.this).b(c.a(c.this))) {
                            return;
                        }
                        f.a().a(c.f(c.this), c.a(c.this), c.b(c.this));
                        c.a(c.this, true);
                        c.b(c.this, true);
                    }
                }

                @Override // com.taobao.android.fluid.framework.permission.a.InterfaceC0496a
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    } else {
                        c.this.g();
                    }
                }
            });
        } else if (this.i) {
        } else {
            g();
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.g = false;
        if (this.h) {
            f.a().b();
            snv snvVar = this.e;
            if (snvVar != null) {
                this.b.a(snvVar);
                IMediaService.a aVar = this.f;
                if (aVar != null) {
                    aVar.a();
                }
            }
            this.h = false;
            b(false);
        }
        if (soi.d(this.c)) {
            return;
        }
        if (this.e != null && soj.b(this.c) && !com.taobao.android.fluid.framework.mute.helper.f.g(this.c)) {
            Handler handler = this.l;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.e.e(true);
        }
        i();
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        IMessageService iMessageService = (IMessageService) this.c.getService(IMessageService.class);
        a.c currentMediaDetail = ((IDataService) this.c.getService(IDataService.class)).getCurrentMediaDetail();
        if (iMessageService == null || currentMediaDetail == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", z ? "1" : "0");
        iMessageService.sendMessage(new spy("VSMSG_miniWindowStateChanged", currentMediaDetail.c, hashMap));
    }

    private void n() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        snv snvVar = this.e;
        if (snvVar == null) {
            return;
        }
        if (snvVar.e() == 2) {
            z = true;
        }
        snvVar.c(z);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f12589a;
        public int b;
        public ViewGroup c;
        public ViewGroup.LayoutParams d;
        public boolean e;

        static {
            kge.a(1443152916);
        }

        private a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f12589a = 0;
            this.b = 0;
            this.c = null;
            this.d = null;
            this.e = false;
        }

        public void a(snv snvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff16fb7d", new Object[]{this, snvVar});
            } else if (snvVar == null || this.c == null || !this.e) {
            } else {
                snvVar.a(this.f12589a, this.b);
                ViewGroup f = snvVar.f();
                if (f == null) {
                    return;
                }
                ViewParent parent = f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(f);
                }
                this.c.addView(f, 0, this.d);
            }
        }

        public boolean b(snv snvVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ed9a0202", new Object[]{this, snvVar})).booleanValue();
            }
            if (snvVar.f() == null) {
                this.e = false;
                return false;
            }
            this.f12589a = snvVar.f().getWidth();
            this.b = snvVar.f().getHeight();
            this.c = (ViewGroup) snvVar.f().getParent();
            this.d = snvVar.f().getLayoutParams();
            this.e = true;
            return true;
        }
    }
}
