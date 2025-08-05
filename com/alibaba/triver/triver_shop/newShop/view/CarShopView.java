package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.t;
import tb.grv;
import tb.kge;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class CarShopView extends ShopView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean canDoAnimation;
    private boolean carShopMode;
    private boolean inCarCustomTab;
    private boolean shopHeaderNeedScrollMask;

    static {
        kge.a(-1681595066);
    }

    public static /* synthetic */ Object ipc$super(CarShopView carShopView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -37299409) {
            super.changeToBigCardMode();
            return null;
        } else if (hashCode != 267248023) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.init();
            return null;
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public int getContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7bec322", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void liveCardExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfd5158", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b57976c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onHomePageWebViewScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153aca28", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void renderAtmosphereImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c285299c", new Object[]{this, str});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void renderBgImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7bedcf", new Object[]{this});
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public boolean getCarShopMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13bfa582", new Object[]{this})).booleanValue() : this.carShopMode;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setCarShopMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8325222", new Object[]{this, new Boolean(z)});
        } else {
            this.carShopMode = z;
        }
    }

    public final boolean getShopHeaderNeedScrollMask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5bcdd293", new Object[]{this})).booleanValue() : this.shopHeaderNeedScrollMask;
    }

    public final void setShopHeaderNeedScrollMask(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80303099", new Object[]{this, new Boolean(z)});
        } else {
            this.shopHeaderNeedScrollMask = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
        this.carShopMode = true;
        this.canDoAnimation = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.q.d(context, "context");
        this.carShopMode = true;
        this.canDoAnimation = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.q.d(context, "context");
        this.carShopMode = true;
        this.canDoAnimation = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarShopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.q.d(context, "context");
        this.carShopMode = true;
        this.canDoAnimation = true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        com.alibaba.triver.triver_shop.newShop.ext.o.a(getFirstHeadContainer(), com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 55));
        com.alibaba.triver.triver_shop.newShop.ext.o.e(getSecondHeadContainer());
        com.alibaba.triver.triver_shop.newShop.ext.o.c(getContentTopLine(), 0);
        updateSecondHeaderTopPosition(getStatusBarSize() + com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 110));
        com.alibaba.triver.triver_shop.newShop.ext.o.a(getFirstHeadContainer(), com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 110));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void changeToBigCardMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc6db2f", new Object[]{this});
        } else {
            super.changeToBigCardMode();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onContainerSwipeDown() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d7c741", new Object[]{this});
            return;
        }
        ruk<Boolean> canSwipeDownDetector = getCanSwipeDownDetector();
        if (canSwipeDownDetector != null && !canSwipeDownDetector.mo2427invoke().booleanValue()) {
            z = true;
        }
        if (z || !canDoAnimation()) {
            return;
        }
        rul<Boolean, t> willHeadCollapsedCallback = getWillHeadCollapsedCallback();
        if (willHeadCollapsedCallback != null) {
            willHeadCollapsedCallback.mo2421invoke(true);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new CarShopView$onContainerSwipeDown$1(this), 200L);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void onContainerSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5f2ba", new Object[]{this});
        } else if (!canDoAnimation()) {
        } else {
            rul<Boolean, t> willHeadCollapsedCallback = getWillHeadCollapsedCallback();
            if (willHeadCollapsedCallback != null) {
                willHeadCollapsedCallback.mo2421invoke(false);
            }
            com.alibaba.triver.triver_shop.newShop.ext.b.a(new CarShopView$onContainerSwipeUp$1(this), 200L);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateContentTopMargin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6329d3a", new Object[]{this, new Boolean(z)});
            return;
        }
        setInHomePage(z);
        com.alibaba.triver.triver_shop.newShop.ext.b.b(new CarShopView$updateContentTopMargin$1(this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateTopViewTransparentStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56efd", new Object[]{this, new Boolean(z)});
        } else if (z) {
            com.alibaba.triver.triver_shop.newShop.ext.o.a(getFirstHeadContainer(), getStatusBarView());
        } else {
            getFirstHeadContainer().setBackgroundColor(-1);
            getStatusBarView().setBackgroundColor(-1);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateSubPageChanged(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79f7009", new Object[]{this, new Boolean(z), str});
            return;
        }
        setInHomePage(z);
        if (kotlin.jvm.internal.q.a((Object) str, (Object) "dongtai")) {
            com.alibaba.triver.triver_shop.newShop.ext.o.c(getContentTopLine(), getStatusBarSize() + getFirstHeadContainer().getHeight());
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.c(getContentTopLine(), 0);
        }
        if (kotlin.jvm.internal.q.a((Object) com.alibaba.triver.triver_shop.newShop.ext.g.KEY_CUSTOM_CAR_TAB, (Object) str)) {
            onContainerSwipeDown();
            this.inCarCustomTab = true;
            return;
        }
        this.inCarCustomTab = false;
    }

    private final void showBlackHeaderBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe1e33b", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        new grv((Activity) context).a(false);
    }

    private final void hideBlackHeaderBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705d1396", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        new grv((Activity) context).a(true);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public boolean canDoAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f785f954", new Object[]{this})).booleanValue() : this.canDoAnimation && isAnimationTimeValid();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void switchToHomePageBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96961df4", new Object[]{this});
            return;
        }
        setInBabyTab(false);
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getCommonTopView());
        hideOtherTopAndSecondView();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void switchToBabyBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1dc2ac", new Object[]{this});
            return;
        }
        setInBabyTab(true);
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getCommonTopView());
        hideOtherTopAndSecondView();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void switchToOtherBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd69eef0", new Object[]{this});
            return;
        }
        setInBabyTab(false);
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getCommonTopView());
        hideOtherTopAndSecondView();
    }

    private final void hideOtherTopAndSecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355d6a30", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.d(getCommonSecondView());
        com.alibaba.triver.triver_shop.newShop.ext.o.d(getBabyTopView());
        com.alibaba.triver.triver_shop.newShop.ext.o.d(getBabySecondView());
    }
}
