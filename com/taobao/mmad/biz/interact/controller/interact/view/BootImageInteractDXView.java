package com.taobao.mmad.biz.interact.controller.interact.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.nav.Nav;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.interact.presenter.a;
import com.taobao.bootimage.interact.presenter.c;
import com.taobao.bootimage.linked.h;
import com.taobao.mmad.render.dx.event.DXSwipeInteractEvent;
import com.taobao.mmad.render.dx.widget.a;
import com.taobao.taobao.R;
import tb.iqp;
import tb.iqq;
import tb.kej;
import tb.ken;
import tb.kge;
import tb.stt;
import tb.stv;
import tb.szy;
import tb.tcs;
import tb.tda;

/* loaded from: classes7.dex */
public class BootImageInteractDXView extends BootImageInteractSlideView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BootImageInteractDXView";
    private final String ACTION_RESPONSE_ADD_CART;
    private final String ACTION_RESPONSE_ADD_CART_JUMP_PAGE;
    private final String ACTION_RESPONSE_COUPON;
    private final String ACTION_RESPONSE_COUPON_JUMP_PAGE;
    private final String DX_COMMENT_ACTION_EVENT;
    private final String DX_EVENT_NAV;
    private final String DX_INTERACT_TYPE_ADD_CART;
    private final String DX_INTERACT_TYPE_COUPON;
    private JSONObject bootImageObj;
    private boolean loadDXFailed;
    private a mAddCartPresenter;
    private c mCouponPresenter;
    public DinamicXEngine mDinamicXEngine;
    public DXRootView mDinamicXView;

    static {
        kge.a(-1231687848);
    }

    public static /* synthetic */ Object ipc$super(BootImageInteractDXView bootImageInteractDXView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -2023236405) {
            if (hashCode == -483678593) {
                super.close();
                return null;
            } else if (hashCode != -340027128) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.show());
            }
        }
        return new Boolean(super.showWithAnim((Animation.AnimationListener) objArr[0]));
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void renderDefaultCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83db882", new Object[]{this});
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void startInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcba53f", new Object[]{this});
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView, com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void stopInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8e78df", new Object[]{this});
        }
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void switchToReceived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c9f057", new Object[]{this});
        }
    }

    public static /* synthetic */ BootImageInfo access$000(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageInfo) ipChange.ipc$dispatch("54648f8", new Object[]{bootImageInteractDXView}) : bootImageInteractDXView.mBootImageInfo;
    }

    public static /* synthetic */ BootImageInfo access$100(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageInfo) ipChange.ipc$dispatch("f8784097", new Object[]{bootImageInteractDXView}) : bootImageInteractDXView.mBootImageInfo;
    }

    public static /* synthetic */ BootImageInfo access$200(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageInfo) ipChange.ipc$dispatch("ebaa3836", new Object[]{bootImageInteractDXView}) : bootImageInteractDXView.mBootImageInfo;
    }

    public static /* synthetic */ void access$300(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6426592f", new Object[]{bootImageInteractDXView});
        } else {
            bootImageInteractDXView.jumpNextPage();
        }
    }

    public static /* synthetic */ void access$400(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c79bce", new Object[]{bootImageInteractDXView});
        } else {
            bootImageInteractDXView.addCart();
        }
    }

    public static /* synthetic */ void access$500(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef68de6d", new Object[]{bootImageInteractDXView});
        } else {
            bootImageInteractDXView.receiveCoupon();
        }
    }

    public static /* synthetic */ BootImageInfo access$600(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageInfo) ipChange.ipc$dispatch("b87216b2", new Object[]{bootImageInteractDXView}) : bootImageInteractDXView.mBootImageInfo;
    }

    public static /* synthetic */ void access$700(BootImageInteractDXView bootImageInteractDXView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d18b5", new Object[]{bootImageInteractDXView, str});
        } else {
            bootImageInteractDXView.processCommonActionEvent(str);
        }
    }

    public static /* synthetic */ void access$800(BootImageInteractDXView bootImageInteractDXView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04ca64a", new Object[]{bootImageInteractDXView});
        } else {
            bootImageInteractDXView.refreshAfterInteract();
        }
    }

    public BootImageInteractDXView(Context context, BootImageInfo bootImageInfo, JSONObject jSONObject) {
        super(context, bootImageInfo);
        this.DX_INTERACT_TYPE_ADD_CART = "addToCart";
        this.DX_INTERACT_TYPE_COUPON = "claimedCoupon";
        this.DX_EVENT_NAV = "jumpNextPage";
        this.DX_COMMENT_ACTION_EVENT = "commonActionEvent";
        this.ACTION_RESPONSE_ADD_CART = "1";
        this.ACTION_RESPONSE_ADD_CART_JUMP_PAGE = "101";
        this.ACTION_RESPONSE_COUPON = "2";
        this.ACTION_RESPONSE_COUPON_JUMP_PAGE = "102";
        if (bootImageInfo != null) {
            try {
                bootImageInfo.isDxTemplate = true;
            } catch (Throwable th) {
                kej.a(TAG, "BootImageInteractDXView constructor error", th);
                return;
            }
        }
        if (this.mBootImageInfo != null) {
            this.mBootImageInfo.isDxTemplate = true;
        }
        this.splashObject = jSONObject;
        this.mDisableInteract = true;
        LayoutInflater.from(context).inflate(R.layout.bootimage_interact_dx, this);
        this.mInteractClickContainer = (LinearLayout) findViewById(R.id.bootimage_interact_dx_click_container);
        this.mDinamicXEngine = new DinamicXEngine(new DXEngineConfig.a("MMAdBiz").a());
        kej.a(TAG, "do start show DXTemplateItem dinamicXEngine = " + this.mDinamicXEngine);
        this.mDinamicXEngine.a(com.taobao.mmad.render.dx.widget.a.DXMMSWIPEINTERACTIONVIEW_MMSWIPEINTERACTIONVIEW, new a.C0722a());
        this.mDinamicXEngine.a(szy.DX_PARSER_MMGETLOCALURL, new szy());
        this.mDinamicXEngine.a(tcs.DX_PARSER_MM_ORANGE, new tcs());
        this.mDinamicXEngine.a(tda.DX_PARSER_SPLITJSONARRAY, new tda());
        this.mDinamicXEngine.a(18615516725124L, new iqp(new iqq() { // from class: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iqq
            public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dd72af8", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                    return;
                }
                String str = "";
                if (dXEvent instanceof DXSwipeInteractEvent) {
                    stv.a(BootImageInteractDXView.TAG, "handleEvent DXSwipeInteractEvent");
                    DXSwipeInteractEvent dXSwipeInteractEvent = (DXSwipeInteractEvent) dXEvent;
                    h.b(str).a(dXSwipeInteractEvent.isTriggerInteractSuccess() ? 8 : 11, BootImageInteractDXView.access$000(BootImageInteractDXView.this).isColdStart);
                    if (!dXSwipeInteractEvent.isTriggerInteractSuccess()) {
                        stv.a(BootImageInteractDXView.TAG, "handleEvent DXSwipeInteractEvent isTriggerInteractSuccess = false");
                        return;
                    }
                } else {
                    stv.a(BootImageInteractDXView.TAG, "handleEvent default click event, mSlideSuccess=" + BootImageInteractDXView.this.mSlideSuccess);
                    h.b(str).a(7, BootImageInteractDXView.access$100(BootImageInteractDXView.this).isColdStart);
                    ken.a(BootImageInteractDXView.access$200(BootImageInteractDXView.this));
                }
                if (objArr != null && objArr.length > 0) {
                    str = objArr[0].toString();
                }
                stv.a(BootImageInteractDXView.TAG, "handleEvent eventName = " + str);
                char c = 65535;
                switch (str.hashCode()) {
                    case -414047463:
                        if (str.equals("commonActionEvent")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 23457852:
                        if (str.equals("addToCart")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1475693025:
                        if (str.equals("claimedCoupon")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1980299888:
                        if (str.equals("jumpNextPage")) {
                            c = 0;
                            break;
                        }
                        break;
                }
                if (c != 0) {
                    if (c == 1) {
                        BootImageInteractDXView.access$400(BootImageInteractDXView.this);
                    } else if (c == 2) {
                        BootImageInteractDXView.access$500(BootImageInteractDXView.this);
                    } else if (c == 3) {
                        BootImageInteractDXView bootImageInteractDXView = BootImageInteractDXView.this;
                        BootImageInteractDXView.access$700(bootImageInteractDXView, BootImageInteractDXView.access$600(bootImageInteractDXView).actionResponse);
                    }
                    BootImageInteractDXView.access$800(BootImageInteractDXView.this);
                }
                BootImageInteractDXView.access$300(BootImageInteractDXView.this);
                BootImageInteractDXView.access$800(BootImageInteractDXView.this);
            }
        }));
        this.mDinamicXView = getDXView(context);
        if (this.mDinamicXView == null) {
            kej.a(TAG, "getDXView mDinamicXView == null , setVisibility(GONE)");
            setVisibility(8);
            this.loadDXFailed = true;
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mDinamicXView.getLayoutParams();
        this.mInteractClickContainer.addView(this.mDinamicXView, layoutParams == null ? new FrameLayout.LayoutParams(-1, -2) : layoutParams);
        this.mAddCartPresenter = new com.taobao.bootimage.interact.presenter.a(context, bootImageInfo, this);
        this.mCouponPresenter = new c(context, bootImageInfo, this);
    }

    private void processCommonActionEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e162bf7b", new Object[]{this, str});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 49) {
            if (hashCode != 50) {
                switch (hashCode) {
                    case 48626:
                        if (str.equals("101")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 48627:
                        if (str.equals("102")) {
                            c = 3;
                            break;
                        }
                        break;
                }
            } else if (str.equals("2")) {
                c = 2;
            }
        } else if (str.equals("1")) {
            c = 0;
        }
        if (c == 0) {
            addCart();
        } else if (c == 1) {
            addCart();
            jumpNextPage();
        } else if (c == 2) {
            receiveCoupon();
        } else if (c == 3) {
            receiveCoupon();
            jumpNextPage();
        } else {
            stv.a(TAG, "handleEvent DX_COMMENT_ACTION_EVENT default jumpNextPage, actionResponse = " + str);
            jumpNextPage();
        }
    }

    private void addCart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63f1b68", new Object[]{this});
            return;
        }
        com.taobao.bootimage.interact.presenter.a aVar = this.mAddCartPresenter;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    private void receiveCoupon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7c28f0", new Object[]{this});
            return;
        }
        c cVar = this.mCouponPresenter;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    private void jumpNextPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3bc6f7", new Object[]{this});
            return;
        }
        try {
            String string = this.splashObject.getJSONObject("item").getJSONObject("0").getString("targetUrl");
            stv.a(TAG, "handleEvent jumpNextPage: targetUrl=" + string);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Nav.from(getContext()).toUri(string);
            postDelayed(new Runnable() { // from class: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (BootImageInteractDXView.this.getBootImageContentListener() == null) {
                            return;
                        }
                        stv.a(BootImageInteractDXView.TAG, "handleEvent getBootImageContentListener().onClose ");
                        BootImageInteractDXView.this.getBootImageContentListener().a("redirect");
                    } catch (Throwable th) {
                        stv.a(BootImageInteractDXView.TAG, "handleEvent getBootImageContentListener().onClose error", th);
                    }
                }
            }, 500L);
        } catch (Throwable th) {
            kej.a(TAG, "jumpNextPage error", th);
        }
    }

    private DXRootView getDXView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("4d8b5245", new Object[]{this, context});
        }
        try {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            JSONObject jSONObject = this.splashObject.getJSONObject("template");
            dXTemplateItem.b = Long.parseLong(jSONObject.getString("version"));
            dXTemplateItem.f11925a = jSONObject.getString("name");
            dXTemplateItem.c = jSONObject.getString("url");
            kej.a(TAG, "getDXView DXTemplateItem version = " + dXTemplateItem.b + ", name = " + dXTemplateItem.f11925a + ", templateUrl = " + dXTemplateItem.c);
            this.bootImageObj = this.splashObject.getJSONObject("item").getJSONObject("0").getJSONObject("content");
            if (this.bootImageObj == null) {
                kej.a(TAG, "getDXView bootImageObj == null");
                return null;
            }
            DXTemplateItem a2 = this.mDinamicXEngine.a(dXTemplateItem);
            if (a2 == null) {
                kej.a(TAG, "getDXView DXTemplateItem is null");
                return null;
            }
            a2.b = Long.parseLong(jSONObject.getString("version"));
            if (a2 != null && a2.b != dXTemplateItem.b) {
                kej.a(TAG, "getDXView different DXTemplateItem version, return null, nowVer = " + a2.b + "lastVer = " + dXTemplateItem.b);
                return null;
            }
            addAdditionalInfo(this.bootImageObj);
            DXResult<DXRootView> a3 = this.mDinamicXEngine.a(this.mDinamicXEngine.b(context, a2).f11780a, this.bootImageObj);
            this.mDinamicXEngine.b(a3.f11780a);
            kej.a(TAG, "getDXView do end show DXTemplateItem");
            return a3.f11780a;
        } catch (Throwable th) {
            kej.a(TAG, "getDXView error", th);
            return null;
        }
    }

    private void addAdditionalInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1569d893", new Object[]{this, jSONObject});
        } else {
            jSONObject.put("topshowScreenHeight", (Object) Float.valueOf(stt.c()));
        }
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onSlide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9ebe99", new Object[]{this});
            return;
        }
        kej.a(TAG, "onSlide");
        onInteractSuccess(null);
    }

    @Override // com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractSlideView
    public void onAdClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f625d9cd", new Object[]{this});
        } else {
            kej.a(TAG, "onAdClick ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9 A[Catch: Throwable -> 0x00ee, TryCatch #0 {Throwable -> 0x00ee, blocks: (B:6:0x0017, B:8:0x0021, B:10:0x0028, B:13:0x0035, B:15:0x003f, B:29:0x006b, B:20:0x0052, B:23:0x005c, B:32:0x0073, B:34:0x0079, B:36:0x007f, B:50:0x00b5, B:57:0x00e2, B:51:0x00cf, B:53:0x00d3, B:54:0x00d9, B:56:0x00dd, B:41:0x00a1, B:44:0x00a9), top: B:62:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onInteractSuccess(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractDXView.onInteractSuccess(java.lang.Object):void");
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public boolean show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbb9908", new Object[]{this})).booleanValue();
        }
        boolean show = super.show();
        if (show) {
            return show;
        }
        return false;
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public boolean showWithAnim(Animation.AnimationListener animationListener) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8767dccb", new Object[]{this, animationListener})).booleanValue();
        }
        if (!super.showWithAnim(animationListener) || this.loadDXFailed) {
            z = false;
        }
        if (z) {
            try {
                setVisibility(0);
                if (animationListener != null) {
                    animationListener.onAnimationEnd(null);
                }
            } catch (Throwable th) {
                kej.a(TAG, "showWithAnimError", th);
            }
        }
        return z;
    }

    @Override // com.taobao.bootimage.interact.view.BootImageInteractBaseView
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        super.close();
        stopInteract();
        c cVar = this.mCouponPresenter;
        if (cVar != null) {
            cVar.d();
        }
        com.taobao.bootimage.interact.presenter.a aVar = this.mAddCartPresenter;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    private void refreshAfterInteract() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f3de1e", new Object[]{this});
        } else if (this.mDinamicXEngine == null || this.mDinamicXView == null) {
            stv.a(TAG, "refreshAfterInteract null, dinamicXEngine=" + this.mDinamicXEngine + ", renderView=" + this.mDinamicXView);
        } else {
            JSONObject jSONObject = new JSONObject(this.bootImageObj);
            jSONObject.put("disableAnimation", (Object) true);
            jSONObject.put("disableInteract", (Object) true);
            this.mDinamicXEngine.a(this.mDinamicXView, jSONObject);
        }
    }
}
