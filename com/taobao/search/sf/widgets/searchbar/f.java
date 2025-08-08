package com.taobao.search.sf.widgets.searchbar;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.taobao.TBActionBar;
import android.support.v7.widget.Toolbar;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.m;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.y;
import com.taobao.search.sf.InshopResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import tb.irq;
import tb.iru;
import tb.ise;
import tb.itl;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.noa;
import tb.nto;

/* loaded from: classes8.dex */
public class f extends ius<Void, View, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> implements View.OnClickListener, itl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ise<irq, ius> CREATOR;
    public static final String DISPLAY_Q = "displayQ";

    /* renamed from: a  reason: collision with root package name */
    private Toolbar f19587a;
    private Activity b;
    private TextView c;
    private View d;
    private TextView e;
    private TextView f;
    private View g;
    private TextView h;
    private CommonSearchContext i;
    private boolean j;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 217607196) {
            super.onCtxResume();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.itl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.itl
    public void a(boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1901d4", new Object[]{this, new Boolean(z), new Float(f)});
        }
    }

    @Override // tb.itl
    public void aG_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b4c520", new Object[]{this});
        }
    }

    @Override // tb.itl
    public void aH_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b699dbf", new Object[]{this});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SFShopActionBarWidget";
    }

    @Override // tb.itl
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.itl
    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        return 0;
    }

    static {
        kge.a(1724317612);
        kge.a(-1201612728);
        kge.a(733709958);
        CREATOR = new ise<irq, ius>() { // from class: com.taobao.search.sf.widgets.searchbar.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public ius a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("f4d63b2f", new Object[]{this, irqVar}) : new f(irqVar.c, irqVar.d, irqVar.e, irqVar.f, irqVar.g);
            }
        };
    }

    public f(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        this.j = false;
        this.b = getActivity();
        this.i = (CommonSearchContext) iruVar.f();
        this.j = this.i.getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN);
        attachToContainer();
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        if (FestivalMgr.a().a("global")) {
            a();
        } else {
            b();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        FestivalMgr.a().a(this.b, TBActionBar.ActionBarStyle.NORMAL);
        ((TextView) this.g.findViewById(R.id.shop_search_result_category_bt)).setTextColor(-1);
        ((TextView) this.g.findViewById(R.id.shop_search_result_category_text)).setTextColor(-1);
        int a2 = l.a(6);
        this.d.setPadding(a2, 0, a2, 0);
        this.d.setBackgroundResource(R.drawable.tbsearch_style_searchbar_promotion);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        FestivalMgr.a().a(this.b, TBActionBar.ActionBarStyle.NORMAL);
        int color = ContextCompat.getColor(this.b, R.color.big_K);
        ((TextView) this.g.findViewById(R.id.shop_search_result_category_bt)).setTextColor(color);
        ((TextView) this.g.findViewById(R.id.shop_search_result_category_text)).setTextColor(color);
        this.d.setBackgroundResource(R.drawable.tbsearch_searchbar_input_background);
        int a2 = l.a(15);
        this.d.setPadding(a2, 0, a2, 0);
    }

    private void a(Toolbar toolbar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a581665", new Object[]{this, toolbar, str});
            return;
        }
        this.c = (TextView) toolbar.findViewById(R.id.searchEdit);
        this.c.setFocusable(false);
        this.c.setText(str);
        TextView textView = this.c;
        textView.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16703) + str);
        this.c.setOnClickListener(this);
        String param = this.i.getParam("searchTips");
        if (!StringUtils.isEmpty(param)) {
            this.c.setHint(param);
        }
        this.d = toolbar.findViewById(R.id.searchbar_inner);
        this.g = toolbar.findViewById(R.id.shop_search_result_category_ll);
        this.g.setOnClickListener(this);
        this.e = (TextView) toolbar.findViewById(R.id.shop_search_result_category_bt);
        this.f = (TextView) toolbar.findViewById(R.id.shop_search_result_category_text);
        this.h = (TextView) toolbar.findViewById(R.id.photoBtn);
        if (!"true".equals(getModel().f().getParam("photoSearch"))) {
            return;
        }
        this.h.setVisibility(0);
        this.h.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("shop_id", this.i.getParam("shopId", ""));
        arrayMap.put("seller_id", this.i.getParam("sellerId", ""));
        if (view.getId() == R.id.shop_search_result_category_ll) {
            ArrayMap arrayMap2 = new ArrayMap();
            arrayMap2.put("shop_id", this.i.getParam("shopId", ""));
            arrayMap2.put("user_id", this.i.getParam("sellerId", ""));
            String param = this.i.getParam(noa.KEY_MINI_APP);
            String param2 = this.i.getParam(noa.KEY_MINI_APP_CATEGORY_URL);
            if (!StringUtils.equals("true", param) || StringUtils.isEmpty(param2)) {
                z = false;
            }
            arrayMap2.put("isNewStyle", getModel().d().getParamValue("isNewStyle"));
            if (StringUtils.equals(this.i.getParam("from"), "category")) {
                this.b.finish();
            } else {
                arrayMap2.put("spm", InshopResultActivity.SEARCH_PAGE_SPM);
                if (z) {
                    Nav.from(this.b).toUri(param2);
                } else {
                    Nav.from(this.b).toUri(y.a("http://shop.m.taobao.com/category/index.htm", (ArrayMap<String, String>) arrayMap2));
                }
            }
            com.taobao.search.mmd.util.e.a("Category", (ArrayMap<String, String>) arrayMap);
        } else if (view.getId() == R.id.searchEdit) {
            com.taobao.search.mmd.util.e.a("Door");
            com.taobao.search.mmd.util.e.a("ChangeSearch");
            com.taobao.search.mmd.util.e.a(ag.SEARCH_ENTRANCE_CLICK, (ArrayMap<String, String>) arrayMap);
            ArrayMap arrayMap3 = new ArrayMap();
            arrayMap3.put("shopId", this.i.getParam("shopId", ""));
            arrayMap3.put("sellerId", this.i.getParam("sellerId", ""));
            arrayMap3.put(DISPLAY_Q, ((Object) this.c.getText()) + "");
            String param3 = this.i.getParam("photoSearch");
            if (!StringUtils.isEmpty(param3)) {
                arrayMap3.put("photoSearch", param3);
            }
            String param4 = this.i.getParam("storeId");
            if (!StringUtils.isEmpty(param4)) {
                arrayMap3.put("storeId", param4);
            }
            String param5 = this.i.getParam("searchTips");
            String param6 = this.i.getParam("searchWord");
            if (!StringUtils.isEmpty(param5) && !StringUtils.isEmpty(param6)) {
                arrayMap3.put("searchTips", param5);
                arrayMap3.put("searchWord", param6);
            }
            arrayMap3.put("spm", StringUtils.equals(this.i.getParam("from"), "category") ? InshopResultActivity.CATEGORY_PAGE_SPM : InshopResultActivity.SEARCH_PAGE_SPM);
            arrayMap3.put("isNewStyle", getModel().d().getParamValue("isNewStyle"));
            if ("true".equals(this.i.getParam(noa.KEY_SEARCH_ELDER_HOME_OPEN))) {
                arrayMap3.put(noa.KEY_SHOP_SEARCH_ELDER, nto.IN_SHOP_ELDER_HIT_VALUE);
            }
            Nav.from(this.b).toUri(y.a("http://shop.m.taobao.com/goods/index.htm?gotoSearch=1", (ArrayMap<String, String>) arrayMap3));
            this.b.finish();
        } else if (view.getId() != R.id.photoBtn) {
        } else {
            d();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("pssource", "store");
            com.taobao.android.searchbaseframe.context.a f = getModel().f();
            arrayMap.put("sellerId", f.getParam("sellerId"));
            arrayMap.put("shopId", f.getParam("shopId"));
            Nav.from(getActivity()).toUri(y.a(k.PAILITAO_URL, (ArrayMap<String, String>) arrayMap));
            com.taobao.search.mmd.util.e.a("PhotoSearch_Enter");
        } catch (Throwable th) {
            q.a("SearchDoorActivity", "启动图搜失败！", th);
        }
    }

    @Override // tb.ius
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        this.f19587a = (Toolbar) LayoutInflater.from(this.b).inflate(R.layout.sf_tbsearch_shopsearchbar, this.mContainer, false);
        a(this.f19587a, this.i.getParam("q", ""));
        ((AppCompatActivity) getActivity()).setSupportActionBar(this.f19587a);
        if (this.j) {
            TextView textView = this.c;
            m mVar = m.INSTANCE;
            textView.setTextSize(1, m.a(14, true));
            this.e.setVisibility(8);
            TextView textView2 = this.f;
            m mVar2 = m.INSTANCE;
            textView2.setTextSize(1, m.a(14, true));
        }
        return this.f19587a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    @Override // tb.itl
    public com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a) ipChange.ipc$dispatch("26ed9943", new Object[]{this}) : new com.taobao.android.searchbaseframe.meta.uikit.header.behavior.b((View) getView(), true, new com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d(com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d.HALF_STICKY.b - 1, 1001, 2000));
    }
}
