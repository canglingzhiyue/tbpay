package com.taobao.search.sf.widgets.list.listcell.inshopauction;

import android.app.Activity;
import android.content.Context;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.r;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.common.uikit.SummaryTipsView;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.datasource.bean.InshopAuctionRadiusBean;
import com.taobao.search.mmd.util.e;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.search.sf.b;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.realtimetag.b;
import com.taobao.search.sf.realtimetag.c;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.tao.util.StringUtil;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.irw;
import tb.ium;
import tb.jxz;
import tb.kge;
import tb.nnd;
import tb.ntt;
import tb.ntx;
import tb.nus;
import tb.nvw;
import tb.nwa;

/* loaded from: classes8.dex */
public class a extends com.taobao.search.sf.widgets.list.listcell.baseauction.a<InshopAuctionCellBean> implements View.OnClickListener, View.OnTouchListener, irw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHOP_ALL = "SHOPALL";
    public static final String SHOP_CATEGORY = "SHOPCATEGORY";
    public static final String SHOP_SEARCH = "SHOPSEARCH";
    private String A;
    private String B;
    private String C;
    public TextView p;
    public AuctionBaseBean q;
    public C0796a r;
    private GestureDetector u;
    private SummaryTipsView v;
    private TextView w;
    private FrameLayout x;
    private View y;
    private FrameLayout z;

    static {
        kge.a(-1895623871);
        kge.a(-1201612728);
        kge.a(512613135);
        kge.a(-468432129);
        kge.a(1609693765);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1411092279) {
            super.a((AuctionBaseBean) objArr[0]);
            return null;
        } else if (hashCode == 107615098) {
            super.s();
            return null;
        } else if (hashCode != 1150927593) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((AuctionBaseBean) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        }
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return null;
    }

    @Override // tb.irw
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.irw
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // tb.irw
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f6d6a3", new Object[]{aVar});
        } else {
            aVar.Q();
        }
    }

    public static /* synthetic */ void a(a aVar, Context context, AuctionBaseBean auctionBaseBean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3fd5648", new Object[]{aVar, context, auctionBaseBean, new Boolean(z)});
        } else {
            aVar.a(context, auctionBaseBean, z);
        }
    }

    public static /* synthetic */ Activity b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("71d1da84", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ ListStyle c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("bf664062", new Object[]{aVar}) : aVar.u();
    }

    public static /* synthetic */ Activity d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("fd145fc2", new Object[]{aVar}) : aVar.b;
    }

    public a(int i, Activity activity, ium iumVar, ViewGroup viewGroup, ListStyle listStyle, int i2, com.taobao.search.sf.a aVar) {
        super(LayoutInflater.from(activity).inflate(i, viewGroup, false), activity, iumVar, listStyle, i2, aVar);
        this.r = new C0796a();
        this.p = (TextView) this.itemView.findViewById(R.id.shop_coupon);
        this.v = (SummaryTipsView) this.itemView.findViewById(R.id.tv_summary_tips);
        this.w = (TextView) this.itemView.findViewById(R.id.tv_recommend_reason);
        this.x = (FrameLayout) this.itemView.findViewById(R.id.auction_layout);
        this.y = this.itemView.findViewById(R.id.dynamic_card_2in1_bg);
        this.z = (FrameLayout) this.itemView.findViewById(R.id.dynamic_card_mask_container);
        N();
        M();
    }

    @Override // tb.itd
    public void a(int i, InshopAuctionCellBean inshopAuctionCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fa9b3d", new Object[]{this, new Integer(i), inshopAuctionCellBean});
            return;
        }
        if (inshopAuctionCellBean.dynamicCardBean != null) {
            a(inshopAuctionCellBean.dynamicCardBean, i);
        } else {
            this.o.removeAllViews();
            this.z.removeAllViews();
        }
        a(inshopAuctionCellBean.auctionBaseBean, i, inshopAuctionCellBean.pagePos);
    }

    private void a(DynamicCardBean dynamicCardBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4bd80", new Object[]{this, dynamicCardBean, new Integer(i)});
            return;
        }
        View view = c.a(this, getActivity(), dynamicCardBean, i).itemView;
        if (StringUtils.equals(dynamicCardBean.style, "mask")) {
            b K = j().d().K();
            K.b();
            this.z.addView(view);
            K.a(this, (SFAuctionBaseCellBean) l());
            return;
        }
        this.o.addView(view);
        if (this.y != null) {
            if (StringUtils.equals(dynamicCardBean.mOriginData.getString("2in1"), "true")) {
                this.y.setVisibility(0);
            } else {
                this.y.setVisibility(8);
            }
        }
        if (!dynamicCardBean.firstRender) {
            return;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
        scaleAnimation.setDuration(500L);
        view.startAnimation(scaleAnimation);
        dynamicCardBean.firstRender = false;
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.context.a f = j().f();
        if (f == null) {
            return;
        }
        this.B = f.getParam("shopId");
        this.C = f.getParam("sellerId");
        if (getActivity() instanceof InshopResultActivity) {
            if ("category".equals(f.getParam("from", ""))) {
                this.A = SHOP_CATEGORY;
                return;
            } else {
                this.A = SHOP_SEARCH;
                return;
            }
        }
        this.A = SHOP_ALL;
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        this.j.setOnClickListener(this);
        this.u = new GestureDetector(getActivity(), this.r);
        this.itemView.setOnTouchListener(this);
    }

    public int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41a3843", new Object[]{this})).intValue();
        }
        ium parent = w().getParent();
        if ((parent instanceof nus) && ((nus) parent).x()) {
            return b.g.REM12 * 3;
        }
        return nwa.b();
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.a
    public void a(AuctionBaseBean auctionBaseBean, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4499c2e9", new Object[]{this, auctionBaseBean, new Integer(i), new Integer(i2)});
            return;
        }
        super.a(auctionBaseBean, i, i2);
        this.q = auctionBaseBean;
        if (j().b().J()) {
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
        if (u() == ListStyle.WATERFALL && this.p != null) {
            b(auctionBaseBean.shopCoupon);
        }
        ViewGroup.LayoutParams layoutParams = H().getLayoutParams();
        if (u() == ListStyle.WATERFALL) {
            layoutParams.width = (ntx.a() - I()) / 2;
        }
        if (!StringUtils.isEmpty(auctionBaseBean.videoUrl) && u() == ListStyle.WATERFALL) {
            SearchUrlImageView H = H();
            layoutParams.height = (int) ((layoutParams.width / auctionBaseBean.videoWidth) * auctionBaseBean.videoHeight);
            String str = !StringUtils.isEmpty(auctionBaseBean.videoCover) ? auctionBaseBean.videoCover : auctionBaseBean.picUrl;
            if (!StringUtils.isEmpty(str)) {
                H.setImageUrl(str);
            }
        }
        H().setLayoutParams(layoutParams);
        O();
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        this.v.setVisibility(8);
        this.w.setVisibility(8);
        if (!J()) {
            return;
        }
        AuctionBaseBean auctionBaseBean = this.q;
        String str = auctionBaseBean instanceof InshopAuctionRadiusBean ? ((InshopAuctionRadiusBean) auctionBaseBean).recommendReason : "";
        if (!StringUtils.isEmpty(str)) {
            this.w.setVisibility(0);
            this.w.setText(str);
        } else if (this.q.summaryTipList == null || this.q.summaryTipList.isEmpty()) {
        } else {
            this.v.setVisibility(0);
            this.v.setSummaryTips(this.q.summaryTipList);
        }
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : u() != ListStyle.WATERFALL || this.q.waterfallIconArray == null || this.q.waterfallIconArray.isEmpty();
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            this.p.setVisibility(8);
        } else {
            this.p.setText(str);
            this.p.setVisibility(0);
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.a
    public void c(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7ec0787", new Object[]{this, auctionBaseBean});
            return;
        }
        this.m.setVisibility(8);
        if (u() == ListStyle.LIST) {
            if (auctionBaseBean.listIconArray == null || auctionBaseBean.listIconArray.size() == 0) {
                return;
            }
            this.m.setVisibility(0);
            this.m.render(auctionBaseBean.listIconArray);
        } else if (auctionBaseBean.waterfallIconArray == null || auctionBaseBean.waterfallIconArray.size() == 0) {
        } else {
            this.m.setVisibility(0);
            this.m.render(auctionBaseBean.waterfallIconArray);
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.a
    public void a(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe470c9", new Object[]{this, auctionBaseBean});
            return;
        }
        super.a(auctionBaseBean);
        this.h.setVisibility(0);
        if (u() == ListStyle.LIST) {
            this.h.setText(f(auctionBaseBean));
        } else {
            this.h.setVisibility(8);
        }
    }

    public String f(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f56877c", new Object[]{this, auctionBaseBean});
        }
        if (StringUtil.isEmpty(auctionBaseBean.postFee)) {
            return "";
        }
        if (auctionBaseBean.postFee.equals("0.00")) {
            return com.alibaba.ability.localization.b.a(R.string.app_free_shipping);
        }
        return com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16671) + auctionBaseBean.postFee.replace(".00", "");
    }

    @Override // tb.nvx
    public Map<String, String> G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bcc6bb03", new Object[]{this});
        }
        com.taobao.android.searchbaseframe.context.a f = j().f();
        if (f == null) {
            return null;
        }
        String param = f.getParam("sellerId");
        if (StringUtils.isEmpty(param)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sellerId", param);
        hashMap.put("seller_id", param);
        String c = com.taobao.search.rainbow.a.c();
        hashMap.put("rainbow", c);
        hashMap.put("encode_rainbow", r.c(c));
        CommonSearchResult commonSearchResult = (CommonSearchResult) j().d().getTotalSearchResult();
        if (commonSearchResult != null) {
            hashMap.put("pageid", commonSearchResult.getMainInfo().rn);
        }
        hashMap.put("spm", com.taobao.search.mmd.util.b.a(getActivity(), j().d(), m()));
        return hashMap;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view != this.j || this.q == null) {
        } else {
            ntt.a().a(this.q.itemId, j().b(), true, this.q, getActivity());
        }
    }

    @Override // tb.nvx, tb.itd
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        super.s();
        P();
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        this.z.removeAllViews();
        InshopAuctionCellBean inshopAuctionCellBean = (InshopAuctionCellBean) l();
        if (inshopAuctionCellBean == null || inshopAuctionCellBean.dynamicCardBean == null || !"mask".equals(inshopAuctionCellBean.dynamicCardBean.style)) {
            return;
        }
        inshopAuctionCellBean.dynamicCardBean = null;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        GestureDetector gestureDetector = this.u;
        if (gestureDetector == null) {
            return true;
        }
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    @Override // tb.irw
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (nnd.a(j().d())) {
            return K();
        }
        return false;
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(F()));
        hashMap.put("page", String.valueOf(this.q.page));
        hashMap.put("trigger_item_id", this.q.itemId);
        hashMap.put("pv_pos", String.valueOf(((InshopAuctionCellBean) l()).pagePos));
        hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, this.q.rn);
        hashMap.put("pv_size", String.valueOf(((InshopAuctionCellBean) l()).pageSize));
        a(new jxz(this.q.itemId, hashMap), "childPageWidget");
    }

    /* renamed from: com.taobao.search.sf.widgets.list.listcell.inshopauction.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public class C0796a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1244170650);
        }

        public static /* synthetic */ Object ipc$super(C0796a c0796a, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2043089436) {
                super.onLongPress((MotionEvent) objArr[0]);
                return null;
            } else if (hashCode != 1575121015) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            }
        }

        private C0796a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            if (a.this.q == null) {
                return super.onSingleTapUp(motionEvent);
            }
            a aVar = a.this;
            a.a(aVar, aVar.getActivity(), a.this.q, false);
            a.a(a.this);
            com.taobao.search.mmd.util.b.a(a.this.q, a.b(a.this), a.this.j().b(), a.c(a.this), com.taobao.search.mmd.util.b.a(a.d(a.this), a.this.j().d(), a.this.m()));
            com.taobao.search.jarvis.c.a(a.this.q, a.this.j().d().getKeyword(), a.this.getActivity(), a.this.m(), (Map<String, Object>) null);
            return super.onSingleTapUp(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
            } else if (a.this.q == null) {
            } else {
                a aVar = a.this;
                aVar.a(nvw.a.a(aVar.q, (ViewGroup) a.this.itemView.findViewById(R.id.layer_container)), "childPageWidget");
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("item_id", a.this.q.itemId);
                arrayMap.put("keyword", a.this.j().d().getKeyword());
                e.a("longpress", (ArrayMap<String, String>) arrayMap);
                super.onLongPress(motionEvent);
            }
        }
    }

    @Override // com.taobao.search.sf.widgets.list.listcell.baseauction.a, com.taobao.search.sf.realtimetag.IRealTimeTagContainer
    public void clearTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a22e8814", new Object[]{this});
        } else {
            P();
        }
    }
}
