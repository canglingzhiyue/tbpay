package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class BigCardShopView extends ShopView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean bigCardMode;

    static {
        kge.a(783225378);
    }

    public static /* synthetic */ Object ipc$super(BigCardShopView bigCardShopView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
    public boolean getBigCardMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e57d26c8", new Object[]{this})).booleanValue() : this.bigCardMode;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void setBigCardMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e24f99c", new Object[]{this, new Boolean(z)});
        } else {
            this.bigCardMode = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
        this.bigCardMode = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.q.d(context, "context");
        this.bigCardMode = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.q.d(context, "context");
        this.bigCardMode = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigCardShopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.q.d(context, "context");
        this.bigCardMode = true;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateContentTopMargin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6329d3a", new Object[]{this, new Boolean(z)});
            return;
        }
        setInHomePage(z);
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new BigCardShopView$updateContentTopMargin$1(z, this));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeDownEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a680146", new Object[]{this});
        } else if (getInHomePage()) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.g(getFirstHeadContainer());
            com.alibaba.triver.triver_shop.newShop.ext.o.g(getStatusBarView());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void swipeDownStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f9584d", new Object[]{this});
            return;
        }
        if (getBigCardMode() && getInHomePage()) {
            getSecondHeadContainer().setBackgroundColor(-1);
        }
        if (!getBigCardMode() || !getInHomePage()) {
            return;
        }
        updateTopViewTransparentStyle(true);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void liveCardExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfd5158", new Object[]{this, new Boolean(z)});
        } else if (z) {
            updateBottomGuidLineEnd(0);
            com.alibaba.triver.triver_shop.newShop.ext.o.d(getFirstHeadContainer());
            com.alibaba.triver.triver_shop.newShop.ext.o.d(getSecondHeadContainer());
            com.alibaba.triver.triver_shop.newShop.ext.o.d(getBottomContainer());
        } else {
            updateBottomGuidLineEnd(com.alibaba.triver.triver_shop.newShop.ext.o.a(Float.valueOf(83.0f)));
            com.alibaba.triver.triver_shop.newShop.ext.o.b(getFirstHeadContainer());
            com.alibaba.triver.triver_shop.newShop.ext.o.b(getSecondHeadContainer());
            com.alibaba.triver.triver_shop.newShop.ext.o.b(getBottomContainer());
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView
    public void updateTopViewTransparentStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56efd", new Object[]{this, new Boolean(z)});
        } else if (z) {
            com.alibaba.triver.triver_shop.newShop.ext.o.b(getBigCardModeHeaderBG());
            bigCardModeUpdateTopViewTransparentStyle();
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.d(getBigCardModeHeaderBG());
        }
    }

    private final void bigCardModeUpdateTopViewTransparentStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f546304", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.a(getStatusBarView(), getFirstHeadContainer(), getSecondHeadContainer());
        }
    }
}
