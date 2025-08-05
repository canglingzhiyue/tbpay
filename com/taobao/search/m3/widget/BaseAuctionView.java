package com.taobao.search.m3.widget;

import android.content.Context;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.m3.comment.CommentView;
import com.taobao.search.m3.composite.CompositeView;
import com.taobao.search.m3.discount.DiscountView;
import com.taobao.search.m3.feedback.FeedbackView;
import com.taobao.search.m3.flash.FlashSaleView;
import com.taobao.search.m3.icons.IconView;
import com.taobao.search.m3.icons.g;
import com.taobao.search.m3.image.M3ImageView;
import com.taobao.search.m3.interactive.InteractiveView;
import com.taobao.search.m3.more.MoreAreaView;
import com.taobao.search.m3.price.M3PriceView;
import com.taobao.search.m3.price.PriceBottomView;
import com.taobao.search.m3.property.PropertyView;
import com.taobao.search.m3.shoinfo.ShopInfoView;
import com.taobao.search.m3.singlerow.SingleRowMultiView;
import com.taobao.search.m3.singlerow.SingleRowView;
import com.taobao.search.m3.title.M3Title;
import com.taobao.search.m3.video.M3VideoView;
import com.taobao.search.m3.widget.c;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseAuctionView extends ViewGroup implements com.taobao.search.m3.f, c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int tb2024Margin;
    private final CommentView commentView;
    private final CompositeView compositeView;
    private final DiscountView discountView;
    private final FeedbackView feedback;
    private final FlashSaleView flashSaleView;
    private final IconView icons;
    private final M3ImageView imagePic;
    private final InteractiveView interactiveView;
    private final MoreAreaView moreBtn;
    private final SingleRowMultiView multiSingleRow;
    private final PriceBottomView priceBottomView;
    private final M3PriceView priceView;
    private final PropertyView propertyView;
    private final FrameLayout rainbowContainer;
    private final ShopInfoView shopInfo;
    private final SingleRowView singleRow;
    private final M3Title title;
    private final M3VideoView video;

    @Override // com.taobao.search.m3.f
    public int getCardBackgroundColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b7f4369", new Object[]{this})).intValue();
        }
        return -1;
    }

    public void layoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b254c2f6", new Object[]{this});
        }
    }

    public abstract void measureContent(int i, int i2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAuctionView(Context context, boolean z) {
        super(context);
        q.c(context, "context");
        this.feedback = new FeedbackView(context, z);
        this.imagePic = new M3ImageView(context, z, false);
        this.video = new M3VideoView(context, z);
        this.title = new M3Title(context);
        this.flashSaleView = new FlashSaleView(context);
        this.discountView = new DiscountView(context);
        this.priceView = new M3PriceView(context, z);
        this.priceBottomView = new PriceBottomView(context);
        this.shopInfo = new ShopInfoView(context);
        this.icons = new IconView(context, this, z);
        this.interactiveView = new InteractiveView(context);
        this.commentView = new CommentView(context, !z);
        this.compositeView = new CompositeView(context);
        this.singleRow = new SingleRowView(context);
        this.multiSingleRow = new SingleRowMultiView(context);
        this.propertyView = new PropertyView(context, z);
        this.moreBtn = new MoreAreaView(context);
        this.rainbowContainer = new FrameLayout(context);
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        layoutParams.setFullSpan(!z);
        setLayoutParams(layoutParams);
        setClipChildren(false);
        this.rainbowContainer.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
    }

    public static final /* synthetic */ int access$getTb2024Margin$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c7bcdc59", new Object[0])).intValue() : tb2024Margin;
    }

    public void insertAdIcons(M3CellBean bean, boolean z, g listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74bdff7", new Object[]{this, bean, new Boolean(z), listener});
            return;
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        c.a.a(this, bean, z, listener);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2005848937);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : BaseAuctionView.access$getTb2024Margin$cp();
        }
    }

    static {
        kge.a(-319066783);
        kge.a(595092021);
        kge.a(-1867925062);
        Companion = new a(null);
        tb2024Margin = l.a(8.0f);
    }

    public final FeedbackView getFeedback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FeedbackView) ipChange.ipc$dispatch("c055c8e4", new Object[]{this}) : this.feedback;
    }

    public final M3ImageView getImagePic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M3ImageView) ipChange.ipc$dispatch("7e7b45e8", new Object[]{this}) : this.imagePic;
    }

    public final M3VideoView getVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M3VideoView) ipChange.ipc$dispatch("7aab1488", new Object[]{this}) : this.video;
    }

    public final M3Title getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M3Title) ipChange.ipc$dispatch("80381fb6", new Object[]{this}) : this.title;
    }

    public final FlashSaleView getFlashSaleView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlashSaleView) ipChange.ipc$dispatch("e7b9f2d0", new Object[]{this}) : this.flashSaleView;
    }

    public final DiscountView getDiscountView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DiscountView) ipChange.ipc$dispatch("f0dfc243", new Object[]{this}) : this.discountView;
    }

    public final M3PriceView getPriceView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M3PriceView) ipChange.ipc$dispatch("f6feb279", new Object[]{this}) : this.priceView;
    }

    public final PriceBottomView getPriceBottomView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PriceBottomView) ipChange.ipc$dispatch("649306dd", new Object[]{this}) : this.priceBottomView;
    }

    public final ShopInfoView getShopInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopInfoView) ipChange.ipc$dispatch("9843c94d", new Object[]{this}) : this.shopInfo;
    }

    public final IconView getIcons() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IconView) ipChange.ipc$dispatch("bda35614", new Object[]{this}) : this.icons;
    }

    public final InteractiveView getInteractiveView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InteractiveView) ipChange.ipc$dispatch("c81b1b08", new Object[]{this}) : this.interactiveView;
    }

    public final CommentView getCommentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommentView) ipChange.ipc$dispatch("5a0413f1", new Object[]{this}) : this.commentView;
    }

    public final CompositeView getCompositeView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CompositeView) ipChange.ipc$dispatch("b620c5f9", new Object[]{this}) : this.compositeView;
    }

    public final SingleRowView getSingleRow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SingleRowView) ipChange.ipc$dispatch("a37b769d", new Object[]{this}) : this.singleRow;
    }

    public final SingleRowMultiView getMultiSingleRow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SingleRowMultiView) ipChange.ipc$dispatch("81363ea9", new Object[]{this}) : this.multiSingleRow;
    }

    public final PropertyView getPropertyView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PropertyView) ipChange.ipc$dispatch("391c42af", new Object[]{this}) : this.propertyView;
    }

    public final MoreAreaView getMoreBtn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MoreAreaView) ipChange.ipc$dispatch("85bb3401", new Object[]{this}) : this.moreBtn;
    }

    public final FrameLayout getRainbowContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("cbe384f1", new Object[]{this}) : this.rainbowContainer;
    }

    public void updatePrice(M3CellBean bean, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea2d427", new Object[]{this, bean, new Boolean(z)});
            return;
        }
        q.c(bean, "bean");
        com.taobao.search.m3.price.e priceInfo = bean.getPriceInfo();
        if (priceInfo == null || (str = priceInfo.m()) == null) {
            str = "";
        }
        setContentDescription(str);
    }

    public boolean updateVideo(M3CellBean bean, com.taobao.search.m3.video.a listener, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffeddc60", new Object[]{this, bean, listener, tbSearchStyle})).booleanValue();
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        if (!bean.getVideoAutoPlay()) {
            return false;
        }
        boolean update = this.video.update(bean, listener, tbSearchStyle);
        if (update) {
            showItem(this.video, 0, 0, 0, 0);
        }
        return update;
    }

    public final void showItem(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a962aa7b", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        q.c(view, "view");
        if (view.getParent() != null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.bottomMargin = i4;
        addView(view, marginLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        layoutContent();
        if (this.feedback.getParent() != this) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.feedback.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.feedback.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.leftMargin + this.feedback.getMeasuredWidth(), marginLayoutParams.topMargin + this.feedback.getMeasuredHeight());
    }

    public void updateItemImage(M3CellBean bean, boolean z, TbSearchStyle tbSearchStyle) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9147410", new Object[]{this, bean, new Boolean(z), tbSearchStyle});
            return;
        }
        q.c(bean, "bean");
        this.imagePic.updateHotIcon(bean.getP4pIcon());
        this.imagePic.updateRightBottomP4pIcon(bean.getMoveP4pIconBottom(), bean.getP4pIconUrl(), bean.getP4pIconWidth(), bean.getP4pIconHeight(), bean.getP4pIconBottomLeft());
        this.imagePic.updateNewDate(bean.getNewDate());
        M3ImageView m3ImageView = this.imagePic;
        com.taobao.search.m3.image.c leftScriptInfo = bean.getLeftScriptInfo();
        if (tbSearchStyle != null && tbSearchStyle.isTb2024) {
            z2 = true;
        }
        m3ImageView.updateLeftScriptIcon(leftScriptInfo, z2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        measureContent(i, i2);
        if (this.feedback.getParent() != this) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.feedback.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.feedback.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824));
    }

    @Override // com.taobao.search.m3.widget.c
    public void addDynamicCard(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f40dd7", new Object[]{this, view, new Boolean(z)});
            return;
        }
        q.c(view, "view");
        this.rainbowContainer.removeAllViews();
        this.rainbowContainer.addView(view, new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // com.taobao.search.m3.widget.c
    public void hideFeedback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757083ee", new Object[]{this});
        } else if (this.feedback.getParent() != this || this.feedback.getVisibility() != 0) {
        } else {
            this.feedback.hide();
        }
    }

    @Override // com.taobao.search.m3.widget.c
    public void addMoreButton(boolean z, boolean z2, M3CellBean bean, com.taobao.search.m3.more.b listener, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7724d15", new Object[]{this, new Boolean(z), new Boolean(z2), bean, listener, new Boolean(z3)});
            return;
        }
        q.c(bean, "bean");
        q.c(listener, "listener");
        this.moreBtn.update(z, bean.getPkInfo(), z2, bean.getJiaGouInfo(), listener, z3);
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        removeAllViews();
        setTouchDelegate(null);
    }

    @Override // com.taobao.search.m3.widget.c
    public void removeDynamicCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09633d2", new Object[]{this});
        } else {
            this.rainbowContainer.removeAllViews();
        }
    }

    @Override // com.taobao.search.m3.widget.c
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else {
            this.video.play();
        }
    }

    @Override // com.taobao.search.m3.widget.c
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            this.video.stop();
        }
    }

    @Override // com.taobao.search.m3.widget.c
    public boolean canPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d7069af", new Object[]{this})).booleanValue() : this.video.getParent() == this;
    }

    @Override // com.taobao.search.m3.widget.c
    public List<com.taobao.search.m3.icons.c> getDisplayIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("64cf632", new Object[]{this});
        }
        if (this.icons.getParent() == this) {
            return this.icons.getDisplayIcons();
        }
        return null;
    }
}
