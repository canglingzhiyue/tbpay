package com.taobao.search.sf.widgets.list.listcell.defaultauction;

import android.app.Activity;
import android.taobao.util.f;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.common.util.i;
import com.taobao.search.mmd.uikit.PriceView;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import tb.itd;
import tb.ium;
import tb.kge;

/* loaded from: classes8.dex */
public final class b extends itd<DefaultAuctionCellBean, com.taobao.search.sf.a> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f19527a;
    private PriceView e;
    private SearchUrlImageView f;
    private DefaultAuctionCellBean g;
    private int h;

    static {
        kge.a(-1274588561);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 108538619) {
            super.t();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, Activity activity, ium parent, ListStyle style, int i) {
        super(view, activity, parent, style, i, null);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
        this.h = -1;
        if (view != null) {
            this.f19527a = (TextView) view.findViewById(R.id.tv_title);
            this.e = (PriceView) view.findViewById(R.id.view_price);
            PriceView priceView = this.e;
            if (priceView != null) {
                priceView.setOriginPriceSize(12);
            }
            this.f = (SearchUrlImageView) view.findViewById(R.id.iv_auction_pic);
            view.setOnClickListener(this);
        }
    }

    @Override // tb.itd
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        DefaultAuctionCellBean defaultAuctionCellBean = this.g;
        if (defaultAuctionCellBean == null || defaultAuctionCellBean.isExposed) {
            return;
        }
        DefaultAuctionCellBean defaultAuctionCellBean2 = this.g;
        if (defaultAuctionCellBean2 != null) {
            defaultAuctionCellBean2.isExposed = true;
        }
        l lVar = l.getInstance();
        q.a((Object) lVar, "UTPageHitHelper.getInstance()");
        String currentPageName = lVar.getCurrentPageName();
        DefaultAuctionCellBean defaultAuctionCellBean3 = this.g;
        String str = null;
        Map<String, String> uTParams = defaultAuctionCellBean3 != null ? defaultAuctionCellBean3.getUTParams(this.h) : null;
        HashMap hashMap = new HashMap();
        hashMap.put("utLogMap", f.a(JSON.toJSONString(uTParams), "utf-8"));
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(currentPageName, 2201, "Search-ItemExposure", "", "", hashMap);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
        i.f a2 = i.f.a();
        DefaultAuctionCellBean defaultAuctionCellBean4 = this.g;
        String str2 = defaultAuctionCellBean4 != null ? defaultAuctionCellBean4.type : null;
        DefaultAuctionCellBean defaultAuctionCellBean5 = this.g;
        if (defaultAuctionCellBean5 != null) {
            str = defaultAuctionCellBean5.getOriginTItemType();
        }
        a2.a(currentPageName, str2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
        if (r10 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
        if (r10 != null) goto L56;
     */
    @Override // tb.itd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r9, com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.list.listcell.defaultauction.b.a(int, com.taobao.search.sf.widgets.list.listcell.defaultauction.DefaultAuctionCellBean):void");
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String simpleName = b.class.getSimpleName();
        q.a((Object) simpleName, "DefaultAuctionCellWidget::class.java.simpleName");
        return simpleName;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        DefaultAuctionCellBean defaultAuctionCellBean = this.g;
        String auctionUrl = defaultAuctionCellBean != null ? defaultAuctionCellBean.getAuctionUrl() : null;
        String str = auctionUrl;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            return;
        }
        Nav.from(this.b).toUri(auctionUrl);
    }
}
