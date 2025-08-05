package com.taobao.search.sf.widgets.list.listcell.defaultshop;

import android.app.Activity;
import android.graphics.Outline;
import android.os.Build;
import android.taobao.util.f;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.json.JSONObject;
import tb.itd;
import tb.ium;
import tb.kge;

/* loaded from: classes8.dex */
public final class b extends itd<DefaultShopCellBean, com.taobao.search.sf.a> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f19528a;
    private SearchUrlImageView e;
    private LinearLayout f;
    private View g;
    private int h;
    private DefaultShopCellBean i;

    /* loaded from: classes8.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            q.c(view, "view");
            q.c(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), j.a(12.0f));
        }
    }

    /* renamed from: com.taobao.search.sf.widgets.list.listcell.defaultshop.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class View$OnClickListenerC0795b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ DefaultShopCellBean c;
        public final /* synthetic */ JSONObject d;

        public View$OnClickListenerC0795b(int i, DefaultShopCellBean defaultShopCellBean, JSONObject jSONObject) {
            this.b = i;
            this.c = defaultShopCellBean;
            this.d = jSONObject;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Activity activity = b.this.getActivity();
            int i = this.b;
            DefaultShopCellBean defaultShopCellBean = this.c;
            JSONObject jSONObject = this.d;
            com.taobao.search.sf.a model = b.this.j();
            q.a((Object) model, "model");
            com.taobao.search.mmd.util.b.a(activity, i, defaultShopCellBean, jSONObject, model.b());
        }
    }

    static {
        kge.a(1698921375);
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
    public b(View view, Activity activity, ium parent, ListStyle style, int i, com.taobao.search.sf.a modelAdapter) {
        super(view, activity, parent, style, i, modelAdapter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
        q.c(modelAdapter, "modelAdapter");
        this.h = -1;
        if (view != null) {
            this.f19528a = (TextView) view.findViewById(R.id.tv_title);
            this.e = (SearchUrlImageView) view.findViewById(R.id.iv_logo);
            this.f = (LinearLayout) view.findViewById(R.id.auction_container);
            this.g = view.findViewById(R.id.btn_shop_enter);
            View view2 = this.g;
            if (view2 == null) {
                q.a();
            }
            b bVar = this;
            view2.setOnClickListener(bVar);
            view.setOnClickListener(bVar);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.hsv_container);
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            if (horizontalScrollView != null) {
                horizontalScrollView.setClipToOutline(true);
            }
            if (horizontalScrollView == null) {
                return;
            }
            horizontalScrollView.setOutlineProvider(new a());
        }
    }

    @Override // tb.itd
    public void t() {
        Map<String, String> map;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        DefaultShopCellBean defaultShopCellBean = this.i;
        if (defaultShopCellBean == null || defaultShopCellBean.isExposed) {
            return;
        }
        DefaultShopCellBean defaultShopCellBean2 = this.i;
        if (defaultShopCellBean2 != null) {
            defaultShopCellBean2.isExposed = true;
        }
        DefaultShopCellBean defaultShopCellBean3 = this.i;
        String str2 = null;
        if (defaultShopCellBean3 != null) {
            com.taobao.search.sf.a j = j();
            map = defaultShopCellBean3.getUTParams(j != null ? j.b() : null, this.h);
        } else {
            map = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("utLogMap", f.a(JSON.toJSONString(map), "utf-8"));
        DefaultShopCellBean defaultShopCellBean4 = this.i;
        if (defaultShopCellBean4 != null) {
            com.taobao.search.sf.a j2 = j();
            str = defaultShopCellBean4.getCellSpm(j2 != null ? j2.b() : null, this.h);
        } else {
            str = null;
        }
        hashMap.put("spm", str);
        DefaultShopCellBean defaultShopCellBean5 = this.i;
        hashMap.put("seller_id", defaultShopCellBean5 != null ? defaultShopCellBean5.getSellerId() : null);
        l lVar = l.getInstance();
        q.a((Object) lVar, "UTPageHitHelper.getInstance()");
        String currentPageName = lVar.getCurrentPageName();
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(currentPageName, 2201, currentPageName + "_Button-ShopExposure", "", "", hashMap);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
        i.f a2 = i.f.a();
        DefaultShopCellBean defaultShopCellBean6 = this.i;
        String str3 = defaultShopCellBean6 != null ? defaultShopCellBean6.type : null;
        DefaultShopCellBean defaultShopCellBean7 = this.i;
        if (defaultShopCellBean7 != null) {
            str2 = defaultShopCellBean7.getOriginTItemType();
        }
        a2.a(currentPageName, str3, str2);
    }

    @Override // tb.itd
    public void a(int i, DefaultShopCellBean defaultShopCellBean) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11694f9f", new Object[]{this, new Integer(i), defaultShopCellBean});
            return;
        }
        this.h = i;
        this.i = defaultShopCellBean;
        if (defaultShopCellBean == null) {
            return;
        }
        TextView textView = this.f19528a;
        if (textView != null) {
            textView.setText(defaultShopCellBean.getTitle());
        }
        SearchUrlImageView searchUrlImageView = this.e;
        if (searchUrlImageView != null) {
            searchUrlImageView.setImageUrl(defaultShopCellBean.getLogo());
        }
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (defaultShopCellBean.getAuctions().size() <= 0 || (size = defaultShopCellBean.getAuctions().size()) < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            JSONObject jSONObject = defaultShopCellBean.getAuctions().get(i2);
            SearchUrlImageView searchUrlImageView2 = new SearchUrlImageView(getActivity());
            searchUrlImageView2.setOnClickListener(new View$OnClickListenerC0795b(i, defaultShopCellBean, jSONObject));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(j.a(110.0f), j.a(165.0f));
            layoutParams.setMargins(0, 0, j.a(2.0f), 0);
            LinearLayout linearLayout2 = this.f;
            if (linearLayout2 != null) {
                linearLayout2.addView(searchUrlImageView2, layoutParams);
            }
            searchUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            searchUrlImageView2.setImageUrl(com.taobao.search.common.uikit.a.a(android.taobao.util.j.a(jSONObject.optString("pic", ""))));
            if (i2 == size) {
                return;
            }
            i2++;
        }
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String simpleName = b.class.getSimpleName();
        q.a((Object) simpleName, "DefaultShopCellWidget::class.java.simpleName");
        return simpleName;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        Activity activity = getActivity();
        int i = this.h;
        DefaultShopCellBean defaultShopCellBean = this.i;
        com.taobao.search.sf.a model = j();
        q.a((Object) model, "model");
        com.taobao.search.mmd.util.b.a(activity, i, defaultShopCellBean, model.b());
    }
}
