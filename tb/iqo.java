package tb;

import android.text.TextUtils;
import android.view.animation.Animation;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.interact.view.BootImageInteractBaseView;
import com.taobao.bootimage.linked.h;
import com.taobao.login4android.api.Login;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractAddCartView;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractCouponView;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView;

/* loaded from: classes7.dex */
public class iqo extends iqn implements Animation.AnimationListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1876946577);
        kge.a(-911284573);
    }

    public static /* synthetic */ Object ipc$super(iqo iqoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iqn
    public void b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == null) {
            kej.a("BootImageInteractController", "bootImageInfo_null");
        } else if (this.f29231a == null) {
            kej.a("BootImageInteractController", "interactView_null");
        } else if (this.f29231a.getParent() == null) {
            kej.a("BootImageInteractController", "containerView_no_parent");
        } else {
            try {
                if (!Login.checkInit() && !kel.i) {
                    kej.a("BootImageInteractController", "LoginSdkNotInited");
                    ken.d(this.b);
                    return;
                }
            } catch (Throwable th) {
                kej.a("BootImageInteractController", "\"LoginSdkNotInited Error  ", th);
            }
            try {
                boolean showWithAnim = this.f29231a.showWithAnim(this);
                kej.a("BootImageInteractController", "show=" + showWithAnim);
                if (showWithAnim) {
                    h.b("").b(this.b.isColdStart);
                    if (this.b.isColdStart) {
                        i = 1;
                    }
                    ken.a(1, i, this.f29231a.getShowInteractGuideImage(), this.f29231a.getShowInteractCardImage(), this.b);
                    return;
                }
                this.f29231a.setVisibility(8);
                if (!this.b.isColdStart) {
                    i2 = 0;
                }
                ken.a(0, i2, this.f29231a.getShowInteractGuideImage(), this.f29231a.getShowInteractCardImage(), this.b);
            } catch (Throwable th2) {
                kej.a("BootImageInteractController", "show showWithAnim ", th2);
            }
        }
    }

    @Override // tb.iqn
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f29231a == null) {
        } else {
            this.f29231a.close();
            this.f29231a.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8 A[Catch: Throwable -> 0x00fd, TryCatch #2 {Throwable -> 0x00fd, blocks: (B:7:0x0019, B:9:0x001d, B:11:0x0023, B:13:0x0027, B:15:0x002d, B:17:0x0037, B:19:0x003d, B:21:0x0043, B:29:0x0078, B:53:0x00de, B:55:0x00e2, B:57:0x00e8, B:58:0x00f9, B:36:0x0092, B:50:0x00b8, B:51:0x00d1, B:52:0x00d8, B:41:0x00a0, B:44:0x00aa, B:22:0x0048, B:24:0x006b, B:26:0x0071, B:31:0x007f), top: B:63:0x0019 }] */
    @Override // tb.iqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iqo.a():void");
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            kej.a("BootImageInteractController", "preInitLoginSDK enableLoginPreInit = " + kel.i);
            if (this.f29231a == null || !kel.i || Login.checkInit()) {
                return;
            }
            kej.a("BootImageInteractController", "preInitLoginSDK preInit");
            Login.preInit();
        } catch (Throwable th) {
            kej.a("BootImageInteractController", "show preInitLoginSDK error ", th);
        }
    }

    private boolean f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            jSONObject = this.c.getJSONObject("bizData");
        } catch (Throwable th) {
            kej.a("BootImageInteractController", "isUseDX error ", th);
        }
        if (jSONObject != null && jSONObject.size() != 0 && jSONObject.containsKey("dxTemplateName")) {
            String string = jSONObject.getString("dxTemplateName");
            kej.a("BootImageInteractController", "isUseDX is true, dxTemplateName = " + string);
            return !TextUtils.isEmpty(string);
        }
        kej.a("BootImageInteractController", "isUseDX is false");
        return false;
    }

    @Override // tb.iqn
    public BootImageInteractBaseView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("26d0398f", new Object[]{this});
        }
        if (this.f29231a == null) {
            a();
        }
        return this.f29231a;
    }

    private BootImageInteractBaseView g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("655ed1ec", new Object[]{this});
        }
        if (this.f29231a == null) {
            kej.a("BootImageInteractController", "createCouponView");
            this.f29231a = new BootImageInteractCouponView(this.d, this.b);
        }
        return this.f29231a;
    }

    private BootImageInteractBaseView h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("cf8e5a0b", new Object[]{this});
        }
        if (this.f29231a == null) {
            kej.a("BootImageInteractController", "createCartView");
            this.f29231a = new BootImageInteractAddCartView(this.d, this.b);
        }
        return this.f29231a;
    }

    private BootImageInteractBaseView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("39bde22a", new Object[]{this});
        }
        if (this.f29231a == null) {
            kej.a("BootImageInteractController", "createDXView");
            this.f29231a = new BootImageInteractDXView(this.d, this.b, this.c);
        }
        return this.f29231a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            return;
        }
        kej.a("BootImageInteractController", "onAnimationStart");
        if (this.f29231a == null) {
            return;
        }
        this.f29231a.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            return;
        }
        kej.a("BootImageInteractController", "onAnimationEnd");
        if (this.f29231a != null) {
            this.f29231a.startInteract();
        }
        try {
            if (Login.checkInit()) {
                AppMonitor.Alarm.commitSuccess(BootImageDataMgr.CACHE_MODULE, "loginSdkInit");
                ken.c(this.b);
                return;
            }
            AppMonitor.Alarm.commitFail(BootImageDataMgr.CACHE_MODULE, "loginSdkInit", "-1", "notInit");
            ken.b(this.b);
        } catch (Throwable th) {
            kej.a("BootImageInteractController", "show preInitLoginSDKFailed ", th);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
        } else {
            kej.a("BootImageInteractController", "onAnimationRepeat");
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.isDxTemplate = true;
            if (!this.b.isColdStart) {
                i = 0;
            }
            ken.a(0, i, "", "", this.b);
        } catch (Throwable th) {
            kej.a("BootImageInteractController", "renderDXFailhow fail ", th);
        }
    }
}
