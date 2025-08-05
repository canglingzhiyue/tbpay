package com.taobao.search.m3.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.comment.CommentView;
import com.taobao.search.m3.composite.CompositeView;
import com.taobao.search.m3.discount.DiscountView;
import com.taobao.search.m3.icons.IconView;
import com.taobao.search.m3.icons.g;
import com.taobao.search.m3.image.M3ImageView;
import com.taobao.search.m3.interactive.InteractiveView;
import com.taobao.search.m3.price.M3PriceView;
import com.taobao.search.m3.price.PriceBottomView;
import com.taobao.search.m3.property.PropertyView;
import com.taobao.search.m3.shoinfo.ShopInfoView;
import com.taobao.search.m3.singlerow.SingleRowMultiView;
import com.taobao.search.m3.singlerow.SingleRowView;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class M3ListContainer extends BaseAuctionView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int areaMargin;
    private static final int bottomPriceTopMargin;
    private static final int commonMargin;
    private static final int contentLeftMargin;
    private static final int contentRightMargin;
    private static final int imageLeftMargin;
    private static final int imageSize;
    private static final int moreMarginLeft;
    private static final int padding;
    private static final int priceTopMargin;
    private final ArrayList<d> bottomLines;
    private d currentLine;
    private d rainbowLine;
    private final ArrayList<d> topLines;

    public static /* synthetic */ Object ipc$super(M3ListContainer m3ListContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2130491415:
                super.start();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3ListContainer(Context context) {
        super(context, false);
        q.c(context, "context");
        this.topLines = new ArrayList<>();
        this.bottomLines = new ArrayList<>();
        int i = padding;
        setPadding(0, i, 0, i);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1701879377);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1658455257);
        Companion = new a(null);
        imageLeftMargin = l.a(6.0f);
        padding = l.a(5.0f);
        commonMargin = l.a(3.0f);
        priceTopMargin = l.a(6.8f);
        bottomPriceTopMargin = l.a(4.5f);
        areaMargin = l.a(3.0f);
        contentLeftMargin = l.a(8.5f);
        contentRightMargin = l.a(8.0f);
        moreMarginLeft = l.a(8.0f);
        imageSize = l.a(140.0f);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void layoutContent() {
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b254c2f6", new Object[]{this});
            return;
        }
        int i = padding;
        M3ImageView imagePic = getImagePic();
        int i2 = imageLeftMargin;
        imagePic.layout(i2, i, getImagePic().getMeasuredWidth() + i2, getImagePic().getMeasuredHeight() + i);
        if (getVideo().getParent() == this) {
            getVideo().layout(getImagePic().getLeft(), getImagePic().getTop(), getImagePic().getRight(), getImagePic().getBottom());
        }
        d dVar = this.rainbowLine;
        if (dVar != null) {
            dVar.a(getImagePic().getBottom(), 0, getWidth());
        }
        int measuredWidth = imageLeftMargin + getImagePic().getMeasuredWidth();
        int width = getWidth() - contentRightMargin;
        Iterator<d> it = this.topLines.iterator();
        while (it.hasNext()) {
            d next = it.next();
            next.a(i, measuredWidth, width);
            i += next.c();
        }
        d dVar2 = this.rainbowLine;
        if (dVar2 != null) {
            height = getHeight() - dVar2.b();
        } else {
            height = getHeight() - padding;
        }
        for (int size = this.bottomLines.size() - 1; size >= 0; size--) {
            d dVar3 = this.bottomLines.get(size);
            q.a((Object) dVar3, "bottomLines[index]");
            d dVar4 = dVar3;
            height -= dVar4.b();
            dVar4.a(height, measuredWidth, width);
        }
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void measureContent(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5cc822", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(imageSize, 1073741824);
        getImagePic().measure(makeMeasureSpec, makeMeasureSpec);
        if (getVideo().getParent() == this) {
            getVideo().measure(makeMeasureSpec, makeMeasureSpec);
        }
        d dVar = this.rainbowLine;
        if (dVar != null) {
            dVar.a(i, i2);
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(((size - getImagePic().getMeasuredWidth()) - imageLeftMargin) - contentRightMargin, Integer.MIN_VALUE);
        Iterator<d> it = this.topLines.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            d next = it.next();
            next.a(makeMeasureSpec2, i2);
            i4 += next.c();
        }
        int i5 = i4 + areaMargin;
        Iterator<d> it2 = this.bottomLines.iterator();
        while (it2.hasNext()) {
            d next2 = it2.next();
            next2.a(makeMeasureSpec2, i2);
            i5 += next2.c();
        }
        int c = padding + rwf.c(i5, getImagePic().getMeasuredHeight());
        d dVar2 = this.rainbowLine;
        if (dVar2 != null) {
            i3 = dVar2.c();
        }
        setMeasuredDimension(size, c + i3 + padding);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        super.start();
        this.rainbowLine = null;
        this.topLines.clear();
        this.bottomLines.clear();
    }

    private final void newLine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44231f9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.currentLine = new d();
        if (z) {
            ArrayList<d> arrayList = this.topLines;
            d dVar = this.currentLine;
            if (dVar == null) {
                q.a();
            }
            arrayList.add(dVar);
            return;
        }
        ArrayList<d> arrayList2 = this.bottomLines;
        d dVar2 = this.currentLine;
        if (dVar2 == null) {
            q.a();
        }
        arrayList2.add(dVar2);
    }

    @Override // com.taobao.search.m3.widget.BaseAuctionView
    public void updateItemImage(M3CellBean bean, boolean z, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9147410", new Object[]{this, bean, new Boolean(z), tbSearchStyle});
            return;
        }
        q.c(bean, "bean");
        super.updateItemImage(bean, z, tbSearchStyle);
        if (z) {
            getImagePic().setImageUrl("", 1.0f, tbSearchStyle);
        } else {
            String picPath = bean.getPicPath();
            if (picPath != null) {
                getImagePic().setImageUrl(picPath, 1.0f, tbSearchStyle);
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
        getTitle().update(bean.getTitleIcon(), bean.getTitle(), bean.isClicked(), bean.getListTitleLines(), false, tbSearchStyle);
        if (getTitle().getParent() != null) {
            return;
        }
        newLine(true);
        showItem(getTitle(), contentLeftMargin, 0, M3WfContainer.Companion.a(), 0);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getTitle());
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
        newLine(true);
        showItem(getFlashSaleView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : commonMargin, 0);
        getFlashSaleView().update(bean.getFlashSaleInfo());
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getFlashSaleView());
        return true;
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
        newLine(true);
        showItem(getDiscountView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : commonMargin, 0);
        DiscountView discountView = getDiscountView();
        com.taobao.search.m3.discount.a discountInfo = bean.getDiscountInfo();
        if (discountInfo == null) {
            q.a();
        }
        discountView.update(discountInfo);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getDiscountView());
        return true;
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
        newLine(false);
        showItem(getPriceView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : priceTopMargin, 0);
        M3PriceView priceView = getPriceView();
        com.taobao.search.m3.price.e priceInfo = bean.getPriceInfo();
        if (priceInfo == null) {
            q.a();
        }
        priceView.update(priceInfo, z);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getPriceView());
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
        newLine(false);
        showItem(getPriceBottomView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : bottomPriceTopMargin, 0);
        d dVar2 = this.currentLine;
        if (dVar2 == null) {
            q.a();
        }
        dVar2.a(getPriceBottomView());
    }

    public void updateShopInfo(M3CellBean bean, com.taobao.search.m3.shoinfo.a listener, boolean z) {
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
        newLine(false);
        showItem(getShopInfo(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : M3WfContainer.Companion.c(), 0);
        ShopInfoView shopInfo = getShopInfo();
        com.taobao.search.m3.shoinfo.b shopInfo2 = bean.getShopInfo();
        if (shopInfo2 == null) {
            q.a();
        }
        shopInfo.update(shopInfo2, listener, z);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getShopInfo());
    }

    public boolean updateIcons(M3CellBean bean, boolean z, boolean z2, g listener, boolean z3) {
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
                newLine(z);
                showItem(getIcons(), contentLeftMargin, 0, z3 ? BaseAuctionView.Companion.a() : M3WfContainer.Companion.d(), 0);
                IconView icons = getIcons();
                com.taobao.search.m3.icons.b iconInfo2 = bean.getIconInfo();
                if (iconInfo2 == null) {
                    q.a();
                }
                icons.update(iconInfo2, false, listener);
                d dVar = this.currentLine;
                if (dVar == null) {
                    q.a();
                }
                dVar.a(getIcons());
                return true;
            }
        }
        return false;
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
        newLine(!bean.getUspBottom());
        showItem(getInteractiveView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        InteractiveView interactiveView = getInteractiveView();
        com.taobao.search.m3.interactive.b interactiveInfo = bean.getInteractiveInfo();
        if (interactiveInfo == null) {
            q.a();
        }
        interactiveView.update(interactiveInfo, listener, z);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getInteractiveView());
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
        newLine(false);
        showItem(getInteractiveView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : M3WfContainer.Companion.f(), 0);
        InteractiveView interactiveView = getInteractiveView();
        com.taobao.search.m3.interactive.b bottomTagInfo = bean.getBottomTagInfo();
        if (bottomTagInfo == null) {
            q.a();
        }
        interactiveView.update(bottomTagInfo, listener, z);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getInteractiveView());
        return true;
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
        newLine(!bean.getUspBottom());
        showItem(getCommentView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        CommentView commentView = getCommentView();
        com.taobao.search.m3.comment.a commentInfo = bean.getCommentInfo();
        if (commentInfo == null) {
            q.a();
        }
        commentView.update(commentInfo, bean.getUspBottom());
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getCommentView());
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
        newLine(!bean.getUspBottom());
        showItem(getCompositeView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        CompositeView compositeView = getCompositeView();
        com.taobao.search.m3.composite.b compositeInfo = bean.getCompositeInfo();
        if (compositeInfo == null) {
            q.a();
        }
        compositeView.update(compositeInfo, bean.getUspBottom());
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getCompositeView());
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
        newLine(!bean.getUspBottom());
        com.taobao.search.m3.singlerow.b singleRowInfo = bean.getSingleRowInfo();
        if (singleRowInfo == null) {
            q.a();
        }
        View multiSingleRow = singleRowInfo.a().size() > 1 ? getMultiSingleRow() : getSingleRow();
        showItem(multiSingleRow, contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
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
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(multiSingleRow);
        return true;
    }

    private final int getUspMarginTop(M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d2f4b55", new Object[]{this, m3CellBean})).intValue() : m3CellBean.getUspBottom() ? M3WfContainer.Companion.f() : M3WfContainer.Companion.e();
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
        showItem(getMoreBtn(), moreMarginLeft, 0, 0, 0);
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
        newLine(!bean.getUspBottom());
        showItem(getPropertyView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        PropertyView propertyView = getPropertyView();
        com.taobao.search.m3.property.a propertyInfo = bean.getPropertyInfo();
        if (propertyInfo == null) {
            q.a();
        }
        propertyView.update(propertyInfo, bean.getUspBottom(), false);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getPropertyView());
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
        newLine(!bean.getUspBottom());
        showItem(getPropertyView(), contentLeftMargin, 0, z ? BaseAuctionView.Companion.a() : getUspMarginTop(bean), 0);
        PropertyView propertyView = getPropertyView();
        com.taobao.search.m3.property.a summaryTips = bean.getSummaryTips();
        if (summaryTips == null) {
            q.a();
        }
        propertyView.update(summaryTips, bean.getUspBottom(), true);
        d dVar = this.currentLine;
        if (dVar == null) {
            q.a();
        }
        dVar.a(getPropertyView());
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
        int i = imageLeftMargin;
        int i2 = padding;
        showItem(getFeedback(), i, i, i2, i2);
        getFeedback().update(bean, bean.getPicPath(), listener, tbSearchStyle, false);
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
        if (z) {
            newLine(false);
            showItem(getRainbowContainer(), contentLeftMargin, 0, BaseAuctionView.Companion.a(), 0);
            d dVar = this.currentLine;
            if (dVar == null) {
                q.a();
            }
            dVar.a(getRainbowContainer());
            return;
        }
        this.rainbowLine = new d();
        showItem(getRainbowContainer(), 0, 0, M3WfContainer.Companion.g(), 0);
        d dVar2 = this.rainbowLine;
        if (dVar2 == null) {
            q.a();
        }
        dVar2.a(getRainbowContainer());
    }
}
