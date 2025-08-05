package com.taobao.search.sf.widgets.list.listcell.baseauction;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.search.mmd.uikit.iconlist.IconListView;
import com.taobao.search.sf.b;
import com.taobao.search.sf.realtimetag.IRealTimeTagContainer;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.taobao.R;
import tb.ium;
import tb.kge;
import tb.nnx;
import tb.nny;
import tb.noq;
import tb.nor;
import tb.nus;
import tb.nvx;
import tb.nwa;

/* loaded from: classes8.dex */
public abstract class a<BEAN extends SFAuctionBaseCellBean> extends nvx<BEAN> implements IRealTimeTagContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SearchUrlImageView f19523a;
    public TextView e;
    public ImageView f;
    public PriceView g;
    public TextView h;
    public View j;
    public IconListView m;
    public int n;
    public ViewGroup o;

    static {
        kge.a(-28633451);
        kge.a(-1225658221);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public int aM_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93f1d8cd", new Object[]{this})).intValue();
        }
        return 1;
    }

    public a(View view, Activity activity, ium iumVar, ListStyle listStyle, int i, com.taobao.search.sf.a aVar) {
        super(view, activity, iumVar, listStyle, i, aVar);
        this.n = -1;
        aL_();
    }

    public void aL_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923d003b", new Object[]{this});
            return;
        }
        this.f19523a = (SearchUrlImageView) this.itemView.findViewById(R.id.goodsimage);
        this.e = (TextView) this.itemView.findViewById(R.id.title);
        this.f = (ImageView) this.itemView.findViewById(R.id.corner_icon);
        this.g = (PriceView) this.itemView.findViewById(R.id.priceBlock);
        this.j = this.itemView.findViewById(R.id.add_cart_btn);
        this.h = (TextView) this.itemView.findViewById(R.id.sales_area);
        this.m = (IconListView) this.itemView.findViewById(R.id.icon_list_row);
        this.o = (ViewGroup) this.itemView.findViewById(R.id.realtime_tag_container);
        if (com.taobao.search.mmd.datasource.bean.ListStyle.convertFromSFStyle(u()) == com.taobao.search.mmd.datasource.bean.ListStyle.LIST) {
            this.e.setLines(2);
        } else {
            this.e.setMaxLines(aM_());
        }
    }

    public void a(AuctionBaseBean auctionBaseBean, int i, int i2) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4499c2e9", new Object[]{this, auctionBaseBean, new Integer(i), new Integer(i2)});
            return;
        }
        this.n = i;
        ium parent = w().getParent();
        if ((parent instanceof nus) && ((nus) parent).x()) {
            a2 = b.g.REM12 * 3;
        } else {
            a2 = nwa.a();
        }
        noq.a(this.f19523a, auctionBaseBean, com.taobao.search.mmd.datasource.bean.ListStyle.convertFromSFStyle(u()), a2);
        noq.a(this.f, auctionBaseBean);
        nor.a(this.e, auctionBaseBean, com.taobao.search.mmd.datasource.bean.ListStyle.convertFromSFStyle(u()));
        e(auctionBaseBean);
        a(auctionBaseBean);
        b(auctionBaseBean);
        c(auctionBaseBean);
        if (i != 0) {
            return;
        }
        a(this.itemView);
    }

    private void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.search.sf.widgets.list.listcell.baseauction.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                    }
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    return true;
                }
            });
        }
    }

    private void b(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e83c28", new Object[]{this, auctionBaseBean});
        } else if (u() == ListStyle.LIST) {
            d(auctionBaseBean);
        } else {
            a(auctionBaseBean, this.g);
        }
    }

    public void c(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ec0787", new Object[]{this, auctionBaseBean});
        } else {
            this.m.render(auctionBaseBean.listIconArray);
        }
    }

    public SearchUrlImageView H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchUrlImageView) ipChange.ipc$dispatch("11cf60a", new Object[]{this}) : this.f19523a;
    }

    public void a(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe470c9", new Object[]{this, auctionBaseBean});
        } else {
            this.h.setVisibility(0);
        }
    }

    public void d(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdefd2e6", new Object[]{this, auctionBaseBean});
        } else {
            nnx.a(auctionBaseBean, this.g);
        }
    }

    public void a(AuctionBaseBean auctionBaseBean, PriceView priceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8246736", new Object[]{this, auctionBaseBean, priceView});
            return;
        }
        nnx.a(auctionBaseBean, priceView);
        if (auctionBaseBean.price == null || auctionBaseBean.price.length() <= 11) {
            return;
        }
        nny.a(priceView);
    }

    public void e(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3f39e45", new Object[]{this, auctionBaseBean});
        } else {
            nny.a(this.g, auctionBaseBean);
        }
    }

    public void a(Context context, AuctionBaseBean auctionBaseBean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5730b23", new Object[]{this, context, auctionBaseBean, new Boolean(z)});
            return;
        }
        if (z) {
            com.taobao.search.common.util.a.a().a(j().d().getTab(), auctionBaseBean.itemId, String.valueOf(System.currentTimeMillis()));
        }
        auctionBaseBean.isClicked = true;
        TextView textView = this.e;
        if (textView == null) {
            return;
        }
        textView.setTextColor(context.getResources().getColor(R.color.list_item_click_title_color));
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public ListStyle getContainerListStyle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("1c77b9ec", new Object[]{this}) : u();
    }

    @Override // com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.o;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
    }
}
