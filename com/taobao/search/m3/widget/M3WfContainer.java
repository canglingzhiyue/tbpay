package com.taobao.search.m3.widget;

import android.content.Context;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.comment.CommentView;
import com.taobao.search.m3.composite.CompositeView;
import com.taobao.search.m3.discount.DiscountView;
import com.taobao.search.m3.flash.FlashSaleView;
import com.taobao.search.m3.icons.IconView;
import com.taobao.search.m3.icons.g;
import com.taobao.search.m3.interactive.InteractiveView;
import com.taobao.search.m3.price.M3PriceView;
import com.taobao.search.m3.price.PriceBottomView;
import com.taobao.search.m3.property.PropertyView;
import com.taobao.search.m3.shoinfo.ShopInfoView;
import com.taobao.search.m3.singlerow.SingleRowMultiView;
import com.taobao.search.m3.singlerow.SingleRowView;
import com.taobao.search.m3.title.M3Title;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class M3WfContainer extends BaseAuctionView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int bottomPriceMargin;
    private static final int commonContentPadding;
    private static final int contentPadding2024;
    private static final int contentPaddingBottom;
    private static final int contentPaddingBottomWhenDynamicCard;
    private static final int discountMarginBottom = 0;
    private static final int discountMarginTop;
    private static final int dynamicMarginTop;
    private static final int iconInfoBottomMargin;
    private static final int iconInfoTopMargin;
    private static final int iconInfoTopMarginWhenMoveUp;
    private static final int priceTopMargin;
    private static final int priceTopMarginUnderUSP;
    private static final int shopInfoTopMargin;
    private static final int shopInfoTopMarginWhenIconUp;
    private static final int titleTopMargin;
    private static final int uspTopMargin;
    private static final int uspTopMarginWhenUnderPrice;
    private static final int uspTopMarginWhenUspBottom;
    private int currentContentPadding;
    private d currentLine;
    private int extraPaddingBottom;
    private final ArrayList<d> lines;

    public static /* synthetic */ Object ipc$super(M3WfContainer m3WfContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2124330504:
                super.removeAllViews();
                return null;
            case -1901931481:
                super.updatePrice((M3CellBean) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1458277360:
                super.updateItemImage((M3CellBean) objArr[0], ((Boolean) objArr[1]).booleanValue(), (TbSearchStyle) objArr[2]);
                return null;
            case -1217245931:
                super.addMoreButton(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue(), (M3CellBean) objArr[2], (com.taobao.search.m3.more.b) objArr[3], ((Boolean) objArr[4]).booleanValue());
                return null;
            case 703860183:
                super.addDynamicCard((View) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-611375906);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : M3WfContainer.access$getTitleTopMargin$cp();
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : M3WfContainer.access$getShopInfoTopMargin$cp();
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : M3WfContainer.access$getIconInfoTopMargin$cp();
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : M3WfContainer.access$getUspTopMargin$cp();
        }

        public final int f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : M3WfContainer.access$getUspTopMarginWhenUspBottom$cp();
        }

        public final int g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : M3WfContainer.access$getDynamicMarginTop$cp();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3WfContainer(Context context) {
        super(context, true);
        q.c(context, "context");
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        layoutParams.setFullSpan(false);
        setLayoutParams(layoutParams);
        this.currentContentPadding = commonContentPadding;
        this.lines = new ArrayList<>(5);
        this.extraPaddingBottom = contentPaddingBottom;
    }

    public static final /* synthetic */ int access$getDynamicMarginTop$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e8a24d", new Object[0])).intValue() : dynamicMarginTop;
    }

    public static final /* synthetic */ int access$getIconInfoTopMargin$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c80f5be5", new Object[0])).intValue() : iconInfoTopMargin;
    }

    public static final /* synthetic */ int access$getShopInfoTopMargin$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c48d9e2", new Object[0])).intValue() : shopInfoTopMargin;
    }

    public static final /* synthetic */ int access$getTitleTopMargin$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6d502ca", new Object[0])).intValue() : titleTopMargin;
    }

    public static final /* synthetic */ int access$getUspTopMargin$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e01cc84", new Object[0])).intValue() : uspTopMargin;
    }

    public static final /* synthetic */ int access$getUspTopMarginWhenUspBottom$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1745af", new Object[0])).intValue() : uspTopMarginWhenUspBottom;
    }

    static {
        kge.a(-401072874);
        Companion = new a(null);
        commonContentPadding = l.a(6.0f);
        contentPadding2024 = l.a(8.0f);
        titleTopMargin = l.a(4.0f);
        priceTopMargin = l.a(4.5f);
        bottomPriceMargin = l.a(6.0f);
        priceTopMarginUnderUSP = l.a(6.8f);
        shopInfoTopMargin = l.a(5.5f);
        shopInfoTopMarginWhenIconUp = l.a(8.0f);
        iconInfoTopMargin = l.a(6.0f);
        iconInfoTopMarginWhenMoveUp = l.a(2.0f);
        iconInfoBottomMargin = l.a(2.0f);
        uspTopMargin = l.a(2.0f);
        uspTopMarginWhenUnderPrice = l.a(6.0f);
        uspTopMarginWhenUspBottom = l.a(6.0f);
        dynamicMarginTop = l.a(8.0f);
        contentPaddingBottom = l.a(6.0f);
        contentPaddingBottomWhenDynamicCard = l.a(8.5f);
        discountMarginTop = l.a(2.0f);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void layoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b254c2f6", new Object[]{this});
            return;
        }
        int layoutItem = layoutItem(getImagePic(), 0);
        M3WfContainer m3WfContainer = this;
        if (getVideo().getParent() == m3WfContainer) {
            layoutItem(getVideo(), 0);
        }
        int layoutItem2 = layoutItem(getTitle(), layoutItem);
        int width = getWidth();
        Iterator<d> it = this.lines.iterator();
        while (it.hasNext()) {
            layoutItem2 += it.next().a(layoutItem2, 0, width);
        }
        if (getRainbowContainer().getParent() != m3WfContainer) {
            return;
        }
        getRainbowContainer().layout(0, getHeight() - getRainbowContainer().getMeasuredHeight(), width, getHeight());
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void measureContent(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5cc822", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        getImagePic().measure(i, i2);
        M3WfContainer m3WfContainer = this;
        if (getVideo().getParent() == m3WfContainer) {
            getVideo().measure(i, View.MeasureSpec.makeMeasureSpec(getImagePic().getMeasuredHeight(), 1073741824));
        }
        measureItem(getTitle(), i, i2);
        int addItemHeight = addItemHeight(getTitle(), getImagePic().getMeasuredHeight());
        Iterator<d> it = this.lines.iterator();
        while (it.hasNext()) {
            d next = it.next();
            next.a(i, i2);
            addItemHeight += next.c();
        }
        if (getRainbowContainer().getParent() == m3WfContainer) {
            getRainbowContainer().measure(i, i2);
            addItemHeight += getRainbowContainer().getMeasuredHeight();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), addItemHeight + this.extraPaddingBottom);
    }

    private final int addItemHeight(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b744c06", new Object[]{this, view, new Integer(i)})).intValue();
        }
        if (view.getParent() == null) {
            return i;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return i + view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void measureItem(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b07921a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view.getParent() == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, Integer.MIN_VALUE), i2);
        }
    }

    private final int layoutItem(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b930dc8", new Object[]{this, view, new Integer(i)})).intValue();
        }
        if (view.getParent() == null) {
            return i;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        view.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin + i, marginLayoutParams.leftMargin + view.getMeasuredWidth(), i + marginLayoutParams.topMargin + view.getMeasuredHeight());
        return view.getBottom() + marginLayoutParams.bottomMargin;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        super.removeAllViews();
        this.lines.clear();
        this.extraPaddingBottom = contentPaddingBottom;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updateItemImage(M3CellBean bean, boolean z, TbSearchStyle tbSearchStyle) {
        String picPath;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9147410", new Object[]{this, bean, new Boolean(z), tbSearchStyle});
            return;
        }
        q.c(bean, "bean");
        this.currentContentPadding = (tbSearchStyle == null || !tbSearchStyle.isTb2024) ? commonContentPadding : contentPadding2024;
        super.updateItemImage(bean, z, tbSearchStyle);
        if (z) {
            getImagePic().setImageUrl("", bean.getWfRatio(), tbSearchStyle);
        } else {
            if (!TextUtils.isEmpty(bean.getUprightImage())) {
                picPath = bean.getUprightImage();
            } else {
                picPath = bean.getPicPath();
            }
            if (picPath != null) {
                getImagePic().setImageUrl(picPath, bean.getWfRatio(), tbSearchStyle);
            }
        }
        showItem(getImagePic(), 0, 0, 0, 0);
    }

    @Override // com.taobao.search.m3.widget.c
    public void updateTitle(M3CellBean bean, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862ef488", new Object[]{this, bean, tbSearchStyle});
            return;
        }
        q.c(bean, "bean");
        getTitle().update(bean.getTitleIcon(), bean.getTitle(), bean.isClicked(), bean.getWfTitleLines(), false, tbSearchStyle);
        M3Title title = getTitle();
        int i = this.currentContentPadding;
        showItem(title, i, i, (tbSearchStyle == null || !tbSearchStyle.isTb2024) ? titleTopMargin : BaseAuctionView.Companion.a(), 0);
    }

    public boolean updateFlashSale(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48598139", new Object[]{this, bean, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        if (bean.getFlashSaleInfo() == null) {
            return false;
        }
        newLine();
        FlashSaleView flashSaleView = getFlashSaleView();
        int i = this.currentContentPadding;
        showItem(flashSaleView, i, i, z ? BaseAuctionView.Companion.a() : 0, 0);
        addLine(getFlashSaleView());
        getFlashSaleView().update(bean.getFlashSaleInfo());
        return true;
    }

    private final void addLine(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e467116", new Object[]{this, view});
            return;
        }
        d dVar = this.currentLine;
        if (dVar == null) {
            return;
        }
        dVar.a(view);
    }

    private final void newLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91af883b", new Object[]{this});
            return;
        }
        this.currentLine = new d();
        ArrayList<d> arrayList = this.lines;
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        arrayList.add(dVar);
    }

    public boolean updateDiscount(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7a7bfd5", new Object[]{this, bean, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        if (bean.getDiscountInfo() == null) {
            return false;
        }
        newLine();
        DiscountView discountView = getDiscountView();
        int i = this.currentContentPadding;
        showItem(discountView, i, i, z ? BaseAuctionView.Companion.a() : discountMarginTop, discountMarginBottom);
        addLine(getDiscountView());
        DiscountView discountView2 = getDiscountView();
        com.taobao.search.m3.discount.a discountInfo = bean.getDiscountInfo();
        if (discountInfo == null) {
            q.a();
        }
        discountView2.update(discountInfo);
        return true;
    }

    private final int getPriceMarginTop(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a80a44c", new Object[]{this, m3CellBean})).intValue();
        }
        boolean z2 = m3CellBean.getMergeLocToPrice() == 1;
        if (m3CellBean.getIconUspMerge() > 0 && !m3CellBean.getUspBottom()) {
            z = true;
        }
        if (z && !z2) {
            return priceTopMargin;
        }
        return priceTopMarginUnderUSP;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updatePrice(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea2d427", new Object[]{this, bean, new Boolean(z)});
            return;
        }
        q.c(bean, "bean");
        super.updatePrice(bean, z);
        if (bean.getPriceInfo() == null) {
            return;
        }
        newLine();
        M3PriceView priceView = getPriceView();
        int i = this.currentContentPadding;
        showItem(priceView, i, i, z ? BaseAuctionView.Companion.a() : getPriceMarginTop(bean), 0);
        M3PriceView priceView2 = getPriceView();
        com.taobao.search.m3.price.e priceInfo = bean.getPriceInfo();
        if (priceInfo == null) {
            q.a();
        }
        priceView2.update(priceInfo, z);
        addLine(getPriceView());
        PriceBottomView priceBottomView = getPriceBottomView();
        com.taobao.search.m3.price.e priceInfo2 = bean.getPriceInfo();
        if (priceInfo2 == null) {
            q.a();
        }
        String n = priceInfo2.n();
        com.taobao.search.m3.price.e priceInfo3 = bean.getPriceInfo();
        if (priceInfo3 == null) {
            q.a();
        }
        if (!priceBottomView.update(n, priceInfo3.o())) {
            return;
        }
        newLine();
        PriceBottomView priceBottomView2 = getPriceBottomView();
        int i2 = this.currentContentPadding;
        showItem(priceBottomView2, i2, i2, z ? BaseAuctionView.Companion.a() : bottomPriceMargin, 0);
        addLine(getPriceBottomView());
    }

    public void updateShopInfo(M3CellBean bean, com.taobao.search.m3.shoinfo.a listener, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d304ca", new Object[]{this, bean, listener, new Boolean(z)});
            return;
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        if (bean.getShopInfo() == null) {
            return;
        }
        newLine();
        ShopInfoView shopInfo = getShopInfo();
        int i2 = this.currentContentPadding;
        if (z) {
            i = BaseAuctionView.Companion.a();
        } else {
            i = bean.getMergeLocToPrice() == 1 ? shopInfoTopMarginWhenIconUp : shopInfoTopMargin;
        }
        showItem(shopInfo, i2, i2, i, 0);
        ShopInfoView shopInfo2 = getShopInfo();
        com.taobao.search.m3.shoinfo.b shopInfo3 = bean.getShopInfo();
        if (shopInfo3 == null) {
            q.a();
        }
        shopInfo2.update(shopInfo3, listener, z);
        addLine(getShopInfo());
    }

    public boolean updateIcons(M3CellBean bean, boolean z, boolean z2, g listener, boolean z3) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6c91aa", new Object[]{this, bean, new Boolean(z), new Boolean(z2), listener, new Boolean(z3)})).booleanValue();
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        if (bean.getIconInfo() != null) {
            com.taobao.search.m3.icons.b iconInfo = bean.getIconInfo();
            if (iconInfo == null) {
                q.a();
            }
            if (!iconInfo.a().isEmpty()) {
                newLine();
                IconView icons = getIcons();
                int i2 = this.currentContentPadding;
                if (z3) {
                    i = BaseAuctionView.Companion.a();
                } else {
                    i = !z2 ? iconInfoTopMarginWhenMoveUp : iconInfoTopMargin;
                }
                showItem(icons, i2, i2, i, iconInfoBottomMargin);
                IconView icons2 = getIcons();
                com.taobao.search.m3.icons.b iconInfo2 = bean.getIconInfo();
                if (iconInfo2 == null) {
                    q.a();
                }
                icons2.update(iconInfo2, false, listener);
                addLine(getIcons());
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void insertAdIcons(M3CellBean bean, boolean z, g listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74bdff7", new Object[]{this, bean, new Boolean(z), listener});
            return;
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        showItem(getIcons(), this.currentContentPadding, 0, z ? iconInfoTopMargin : iconInfoTopMarginWhenMoveUp, 0);
        IconView icons = getIcons();
        com.taobao.search.m3.icons.b iconInfo = bean.getIconInfo();
        if (iconInfo == null) {
            q.a();
        }
        icons.update(iconInfo, true, listener);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.b(getIcons());
    }

    @Override // com.taobao.search.m3.widget.c
    public boolean updateInteractiveTag(M3CellBean bean, com.taobao.search.m3.interactive.d listener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eabee11f", new Object[]{this, bean, listener, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        if (bean.getInteractiveInfo() == null) {
            return false;
        }
        newLine();
        InteractiveView interactiveView = getInteractiveView();
        int i = this.currentContentPadding;
        showItem(interactiveView, i, i, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        InteractiveView interactiveView2 = getInteractiveView();
        com.taobao.search.m3.interactive.b interactiveInfo = bean.getInteractiveInfo();
        if (interactiveInfo == null) {
            q.a();
        }
        interactiveView2.update(interactiveInfo, listener, z);
        addLine(getInteractiveView());
        return true;
    }

    public boolean updateBottomTag(M3CellBean bean, com.taobao.search.m3.interactive.d listener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9951db04", new Object[]{this, bean, listener, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        if (bean.getBottomTagInfo() == null) {
            return false;
        }
        newLine();
        InteractiveView interactiveView = getInteractiveView();
        int i = this.currentContentPadding;
        showItem(interactiveView, i, i, z ? BaseAuctionView.Companion.a() : uspTopMarginWhenUspBottom, 0);
        InteractiveView interactiveView2 = getInteractiveView();
        com.taobao.search.m3.interactive.b bottomTagInfo = bean.getBottomTagInfo();
        if (bottomTagInfo == null) {
            q.a();
        }
        interactiveView2.update(bottomTagInfo, listener, z);
        addLine(getInteractiveView());
        return true;
    }

    private final int getUspMarginTop(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d2f4b55", new Object[]{this, m3CellBean})).intValue();
        }
        boolean z2 = m3CellBean.getMergeLocToPrice() == 1;
        if (m3CellBean.getIconUspMerge() > 0 && !m3CellBean.getUspBottom()) {
            z = true;
        }
        if (z && !z2) {
            return uspTopMarginWhenUnderPrice;
        }
        return m3CellBean.getUspBottom() ? uspTopMarginWhenUspBottom : uspTopMargin;
    }

    @Override // com.taobao.search.m3.widget.c
    public boolean updateComment(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34ab8f01", new Object[]{this, bean, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        if (bean.getCommentInfo() == null) {
            return false;
        }
        newLine();
        CommentView commentView = getCommentView();
        int i = this.currentContentPadding;
        showItem(commentView, i, i, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        CommentView commentView2 = getCommentView();
        com.taobao.search.m3.comment.a commentInfo = bean.getCommentInfo();
        if (commentInfo == null) {
            q.a();
        }
        commentView2.update(commentInfo, bean.getUspBottom());
        addLine(getCommentView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.c
    public boolean updateComposite(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a772369", new Object[]{this, bean, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        if (bean.getCompositeInfo() == null) {
            return false;
        }
        newLine();
        CompositeView compositeView = getCompositeView();
        int i = this.currentContentPadding;
        showItem(compositeView, i, i, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        CompositeView compositeView2 = getCompositeView();
        com.taobao.search.m3.composite.b compositeInfo = bean.getCompositeInfo();
        if (compositeInfo == null) {
            q.a();
        }
        compositeView2.update(compositeInfo, bean.getUspBottom());
        addLine(getCompositeView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.c
    public boolean updateSingleRow(M3CellBean bean, com.taobao.search.m3.singlerow.a listener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81110174", new Object[]{this, bean, listener, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        if (bean.getSingleRowInfo() == null) {
            return false;
        }
        newLine();
        com.taobao.search.m3.singlerow.b singleRowInfo = bean.getSingleRowInfo();
        if (singleRowInfo == null) {
            q.a();
        }
        View multiSingleRow = singleRowInfo.a().size() > 1 ? getMultiSingleRow() : getSingleRow();
        int i = this.currentContentPadding;
        showItem(multiSingleRow, i, i, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        if (multiSingleRow instanceof SingleRowView) {
            SingleRowView singleRowView = (SingleRowView) multiSingleRow;
            com.taobao.search.m3.singlerow.b singleRowInfo2 = bean.getSingleRowInfo();
            if (singleRowInfo2 == null) {
                q.a();
            }
            singleRowView.update(singleRowInfo2.a().get(0), bean.getUspBottom(), listener);
        } else if (multiSingleRow != null) {
            SingleRowMultiView singleRowMultiView = (SingleRowMultiView) multiSingleRow;
            com.taobao.search.m3.singlerow.b singleRowInfo3 = bean.getSingleRowInfo();
            if (singleRowInfo3 == null) {
                q.a();
            }
            singleRowMultiView.update(singleRowInfo3, bean.getUspBottom(), listener);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.m3.singlerow.SingleRowMultiView");
        }
        addLine(multiSingleRow);
        return true;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, com.taobao.search.m3.widget.c
    public void addMoreButton(boolean z, boolean z2, M3CellBean bean, com.taobao.search.m3.more.b listener, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7724d15", new Object[]{this, new Boolean(z), new Boolean(z2), bean, listener, new Boolean(z3)});
            return;
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        super.addMoreButton(z, z2, bean, listener, z3);
        if (getMoreBtn().getParent() == this) {
            return;
        }
        showItem(getMoreBtn(), 0, this.currentContentPadding, 0, 0);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.b(getMoreBtn());
        d dVar2 = this.currentLine;
        if (dVar2 == null) {
            q.a();
        }
        dVar2.a();
    }

    @Override // com.taobao.search.m3.widget.c
    public boolean updateProperty(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a96e1969", new Object[]{this, bean, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        if (bean.getPropertyInfo() == null) {
            return false;
        }
        newLine();
        PropertyView propertyView = getPropertyView();
        int i = this.currentContentPadding;
        showItem(propertyView, i, i, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        PropertyView propertyView2 = getPropertyView();
        com.taobao.search.m3.property.a propertyInfo = bean.getPropertyInfo();
        if (propertyInfo == null) {
            q.a();
        }
        propertyView2.update(propertyInfo, bean.getUspBottom(), false);
        addLine(getPropertyView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.c
    public boolean updateSummaryTips(M3CellBean bean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f05e9e0", new Object[]{this, bean, new Boolean(z)})).booleanValue();
        }
        q.c(bean, "bean");
        if (bean.getSummaryTips() == null) {
            return false;
        }
        newLine();
        PropertyView propertyView = getPropertyView();
        int i = this.currentContentPadding;
        showItem(propertyView, i, i, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        PropertyView propertyView2 = getPropertyView();
        com.taobao.search.m3.property.a summaryTips = bean.getSummaryTips();
        if (summaryTips == null) {
            q.a();
        }
        propertyView2.update(summaryTips, bean.getUspBottom(), true);
        addLine(getPropertyView());
        return true;
    }

    @Override // com.taobao.search.m3.widget.c
    public void updateFeedback(M3CellBean bean, com.taobao.search.m3.feedback.b listener, TbSearchStyle tbSearchStyle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c17855", new Object[]{this, bean, listener, tbSearchStyle, new Boolean(z)});
            return;
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        showItem(getFeedback(), 0, 0, 0, 0);
        getFeedback().update(bean, bean.getPicPath(), listener, tbSearchStyle, z);
        getFeedback().setVisibility(0);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, com.taobao.search.m3.widget.c
    public void addDynamicCard(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f40dd7", new Object[]{this, view, new Boolean(z)});
            return;
        }
        q.c(view, "view");
        super.addDynamicCard(view, z);
        showItem(getRainbowContainer(), 0, 0, 0, 0);
        this.extraPaddingBottom = contentPaddingBottomWhenDynamicCard;
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView, com.taobao.search.m3.widget.c
    public void removeDynamicCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09633d2", new Object[]{this});
        } else {
            getRainbowContainer().removeAllViews();
        }
    }
}
