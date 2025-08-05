package com.taobao.search.sf.widgets.list.listcell.inshopauction2020;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.common.util.l;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.search.mmd.util.d;
import com.taobao.search.sf.widgets.list.listcell.inshopauction.InshopAuctionCellBean;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import tb.ium;
import tb.kge;
import tb.ntx;

/* loaded from: classes8.dex */
public class b extends com.taobao.search.sf.widgets.list.listcell.inshopauction.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SearchUrlImageView A;
    private SearchUrlImageView B;
    private LinearLayout u;
    private LinearLayout v;
    private TUrlImageView w;
    private ConstraintLayout x;
    private View y;
    private TextView z;

    static {
        kge.a(-1515079239);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1841496005:
                super.aL_();
                return null;
            case -1108356378:
                super.d((AuctionBaseBean) objArr[0]);
                return null;
            case -131832010:
                super.a((AuctionBaseBean) objArr[0], (PriceView) objArr[1]);
                return null;
            case 1090165565:
                super.a(((Number) objArr[0]).intValue(), (InshopAuctionCellBean) objArr[1]);
                return null;
            case 1150927593:
                super.a((AuctionBaseBean) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.inshopauction.a
    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, Activity activity, ium parent, ViewGroup viewGroup, ListStyle style, int i2, com.taobao.search.sf.a aVar) {
        super(i, activity, parent, viewGroup, style, i2, aVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.a
    public void aL_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923d003b", new Object[]{this});
            return;
        }
        super.aL_();
        this.u = (LinearLayout) this.itemView.findViewById(R.id.ll_sku_container);
        this.v = (LinearLayout) this.itemView.findViewById(R.id.ll_bottom_line);
        View findViewById = this.itemView.findViewById(R.id.imv_top_icon);
        q.a((Object) findViewById, "itemView.findViewById(R.id.imv_top_icon)");
        this.w = (TUrlImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.operation_bar_container);
        q.a((Object) findViewById2, "itemView.findViewById(R.….operation_bar_container)");
        this.x = (ConstraintLayout) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.operation_bg);
        q.a((Object) findViewById3, "itemView.findViewById(R.id.operation_bg)");
        this.y = findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.operation_tv);
        q.a((Object) findViewById4, "itemView.findViewById(R.id.operation_tv)");
        this.z = (TextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.user_ic_1);
        q.a((Object) findViewById5, "itemView.findViewById(R.id.user_ic_1)");
        this.A = (SearchUrlImageView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.user_ic_2);
        q.a((Object) findViewById6, "itemView.findViewById(R.id.user_ic_2)");
        this.B = (SearchUrlImageView) findViewById6;
        ImageShapeFeature imageShapeFeature = new ImageShapeFeature();
        imageShapeFeature.setShape(0);
        SearchUrlImageView searchUrlImageView = this.A;
        if (searchUrlImageView == null) {
            q.b("mSelfOperationIc1");
        }
        ImageShapeFeature imageShapeFeature2 = imageShapeFeature;
        searchUrlImageView.addFeature(imageShapeFeature2);
        SearchUrlImageView searchUrlImageView2 = this.B;
        if (searchUrlImageView2 == null) {
            q.b("mSelfOperationIc2");
        }
        searchUrlImageView2.addFeature(imageShapeFeature2);
        this.g.setOriginPriceSize(13);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.inshopauction.a, com.taobao.search.sf.widgets.list.listcell.baseauction.a
    public void a(AuctionBaseBean auctionBaseBean, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4499c2e9", new Object[]{this, auctionBaseBean, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(auctionBaseBean, i, i2);
        g(auctionBaseBean);
        View view = this.j;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.inshopauction.a, tb.itd
    public void a(int i, InshopAuctionCellBean inshopAuctionCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fa9b3d", new Object[]{this, new Integer(i), inshopAuctionCellBean});
            return;
        }
        super.a(i, inshopAuctionCellBean);
        b(inshopAuctionCellBean);
        a(inshopAuctionCellBean);
    }

    private final void g(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cffb3503", new Object[]{this, auctionBaseBean});
            return;
        }
        ConstraintLayout constraintLayout = this.x;
        if (constraintLayout == null) {
            q.b("mSelfOperationContainer");
        }
        constraintLayout.setVisibility(8);
        if (auctionBaseBean == null || auctionBaseBean.selfOperationInfo == null) {
            return;
        }
        TextView textView = this.z;
        if (textView == null) {
            q.b("mSelfOperationTv");
        }
        textView.setVisibility(0);
        View view = this.y;
        if (view == null) {
            q.b("mSelfOperationBg");
        }
        view.setVisibility(0);
        ConstraintLayout constraintLayout2 = this.x;
        if (constraintLayout2 == null) {
            q.b("mSelfOperationContainer");
        }
        constraintLayout2.setVisibility(0);
        if (auctionBaseBean.selfOperationInfo.recentCommentUsers != null && auctionBaseBean.selfOperationInfo.recentCommentUsers.size() >= 2) {
            SearchUrlImageView searchUrlImageView = this.A;
            if (searchUrlImageView == null) {
                q.b("mSelfOperationIc1");
            }
            searchUrlImageView.setVisibility(0);
            SearchUrlImageView searchUrlImageView2 = this.B;
            if (searchUrlImageView2 == null) {
                q.b("mSelfOperationIc2");
            }
            searchUrlImageView2.setVisibility(0);
            SearchUrlImageView searchUrlImageView3 = this.A;
            if (searchUrlImageView3 == null) {
                q.b("mSelfOperationIc1");
            }
            searchUrlImageView3.setImageUrl(auctionBaseBean.selfOperationInfo.recentCommentUsers.get(0));
            SearchUrlImageView searchUrlImageView4 = this.B;
            if (searchUrlImageView4 == null) {
                q.b("mSelfOperationIc2");
            }
            searchUrlImageView4.setImageUrl(auctionBaseBean.selfOperationInfo.recentCommentUsers.get(1));
            TextView textView2 = this.z;
            if (textView2 == null) {
                q.b("mSelfOperationTv");
            }
            textView2.setGravity(3);
        } else {
            SearchUrlImageView searchUrlImageView5 = this.A;
            if (searchUrlImageView5 == null) {
                q.b("mSelfOperationIc1");
            }
            searchUrlImageView5.setVisibility(8);
            SearchUrlImageView searchUrlImageView6 = this.B;
            if (searchUrlImageView6 == null) {
                q.b("mSelfOperationIc2");
            }
            searchUrlImageView6.setVisibility(8);
            TextView textView3 = this.z;
            if (textView3 == null) {
                q.b("mSelfOperationTv");
            }
            textView3.setGravity(17);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{d.a(auctionBaseBean.selfOperationInfo.commentColorLeft, Color.parseColor("#4DBBFF")), d.a(auctionBaseBean.selfOperationInfo.commentColorRight, Color.parseColor("#1EA9FE"))});
        gradientDrawable.setShape(0);
        View view2 = this.y;
        if (view2 == null) {
            q.b("mSelfOperationBg");
        }
        ViewCompat.setBackground(view2, gradientDrawable);
        TextView textView4 = this.z;
        if (textView4 == null) {
            q.b("mSelfOperationTv");
        }
        textView4.setText(auctionBaseBean.selfOperationInfo.recentComments);
    }

    private final void a(InshopAuctionCellBean inshopAuctionCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bff520a", new Object[]{this, inshopAuctionCellBean});
            return;
        }
        TUrlImageView tUrlImageView = this.w;
        if (tUrlImageView == null) {
            q.b("mImvTopIcon");
        }
        tUrlImageView.setVisibility(8);
        if (!(inshopAuctionCellBean instanceof InshopAuction2020CellBean)) {
            return;
        }
        InshopAuction2020CellBean inshopAuction2020CellBean = (InshopAuction2020CellBean) inshopAuctionCellBean;
        if (TextUtils.isEmpty(inshopAuction2020CellBean.getTopIconUrl()) || inshopAuction2020CellBean.getTopIconWidth() <= 0 || inshopAuction2020CellBean.getTopIconHeight() <= 0) {
            return;
        }
        TUrlImageView tUrlImageView2 = this.w;
        if (tUrlImageView2 == null) {
            q.b("mImvTopIcon");
        }
        tUrlImageView2.setImageUrl(inshopAuction2020CellBean.getTopIconUrl());
        TUrlImageView tUrlImageView3 = this.w;
        if (tUrlImageView3 == null) {
            q.b("mImvTopIcon");
        }
        tUrlImageView3.setVisibility(0);
        TUrlImageView tUrlImageView4 = this.w;
        if (tUrlImageView4 == null) {
            q.b("mImvTopIcon");
        }
        ViewGroup.LayoutParams layoutParams = tUrlImageView4.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.width = l.a(inshopAuction2020CellBean.getTopIconWidth());
        marginLayoutParams.height = l.a(inshopAuction2020CellBean.getTopIconHeight());
        marginLayoutParams.leftMargin = l.a(inshopAuction2020CellBean.getTopIconLeft());
        marginLayoutParams.topMargin = l.a(inshopAuction2020CellBean.getTopIconTop());
        TUrlImageView tUrlImageView5 = this.w;
        if (tUrlImageView5 == null) {
            q.b("mImvTopIcon");
        }
        tUrlImageView5.requestLayout();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.a
    public void d(AuctionBaseBean dataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdefd2e6", new Object[]{this, dataObject});
            return;
        }
        q.c(dataObject, "dataObject");
        super.d(dataObject);
        this.g.setPriceIconSuffix(dataObject.priceIconSuffixText);
        if (TextUtils.isEmpty(dataObject.originPrice)) {
            this.g.setOriginPrice("", false);
        } else {
            PriceView priceView = this.g;
            priceView.setOriginPrice("¥" + dataObject.originPrice, dataObject.hidePriceUndline);
        }
        if (TextUtils.isEmpty(dataObject.priceIconSuffixColor)) {
            return;
        }
        this.g.setIconSuffixColor(d.a(dataObject.priceIconSuffixColor, -1));
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.a
    public void a(AuctionBaseBean dataObject, PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8246736", new Object[]{this, dataObject, priceView});
            return;
        }
        q.c(dataObject, "dataObject");
        super.a(dataObject, priceView);
        this.g.setPriceIconSuffix(dataObject.priceIconSuffixText);
        if (TextUtils.isEmpty(dataObject.originPrice)) {
            this.g.setOriginPrice("", false);
        } else {
            PriceView priceView2 = this.g;
            priceView2.setOriginPrice("¥" + dataObject.originPrice, dataObject.hidePriceUndline);
        }
        if (TextUtils.isEmpty(dataObject.priceIconSuffixColor)) {
            return;
        }
        this.g.setIconSuffixColor(d.a(dataObject.priceIconSuffixColor, -1));
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.inshopauction.a, com.taobao.search.sf.widgets.list.listcell.baseauction.a
    public void a(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe470c9", new Object[]{this, auctionBaseBean});
            return;
        }
        TextView textView = this.h;
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (u() != ListStyle.LIST) {
            return;
        }
        this.g.setAreaText(f(auctionBaseBean));
    }

    private final void b(InshopAuctionCellBean inshopAuctionCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ebbf8b", new Object[]{this, inshopAuctionCellBean});
        } else if (u() != ListStyle.LIST && (inshopAuctionCellBean instanceof InshopAuction2020CellBean)) {
            LinearLayout linearLayout = this.u;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            ArrayList<String> skuPics = ((InshopAuction2020CellBean) inshopAuctionCellBean).getSkuPics();
            if (skuPics == null) {
                return;
            }
            for (String str : skuPics) {
                TUrlImageView M = M();
                M.setImageUrl(str);
                LinearLayout linearLayout2 = this.u;
                if (linearLayout2 != null) {
                    linearLayout2.addView(M);
                }
            }
        }
    }

    private final TUrlImageView M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("29951528", new Object[]{this});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
        int a2 = l.a(10);
        int a3 = l.a(3.5f);
        int a4 = a(a3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a4, a4);
        layoutParams.setMargins(0, a2, a3, 0);
        tUrlImageView.setLayoutParams(layoutParams);
        ImageShapeFeature imageShapeFeature = new ImageShapeFeature();
        imageShapeFeature.setShape(1);
        float a5 = l.a(3);
        imageShapeFeature.setCornerRadius(a5, a5, a5, a5);
        tUrlImageView.addFeature(imageShapeFeature);
        return tUrlImageView;
    }

    private final int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : ((((ntx.a() - I()) / 2) - (l.a(10) * 2)) - (i * 4)) / 5;
    }
}
