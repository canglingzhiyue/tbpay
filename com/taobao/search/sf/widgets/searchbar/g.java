package com.taobao.search.sf.widgets.searchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.n;
import android.support.v7.taobao.TBActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.m;
import com.taobao.search.common.util.p;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareBusinessListener;
import com.ut.share.business.ShareContent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.iru;
import tb.isv;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.noa;
import tb.nud;
import tb.nvj;
import tb.nvk;
import tb.nwk;
import tb.nxa;
import tb.poq;

/* loaded from: classes8.dex */
public class g extends ius<Void, ViewGroup, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>> implements com.taobao.android.xsearchplugin.muise.e, nvk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACK_BUTTON_ICON_DARK = "https://img.alicdn.com/imgextra/i3/O1CN01NJOAim1JBT5vetxFd_!!6000000000990-2-tps-80-80.png";
    public static final String BACK_BUTTON_ICON_LIGHT = "https://img.alicdn.com/imgextra/i1/O1CN01tDF3uq1uvOau3MfqW_!!6000000006099-2-tps-80-80.png";
    public static final String PHOTO_SEARCH_ICON = "https://gw.alicdn.com/imgextra/i4/O1CN01cH7J8D1MMPKsMda4D_!!6000000001420-2-tps-120-111.png";
    public static final String PHOTO_SEARCH_ICON_2024 = "https://gw.alicdn.com/imgextra/i2/O1CN01cgCAeP1pYQeISAJ5G_!!6000000005372-2-tps-80-80.png";
    public static final String PHOTO_SEARCH_ICON_2024_DARK = "https://img.alicdn.com/imgextra/i3/O1CN01gdGmNS1qOdo4kQXue_!!6000000005486-2-tps-80-80.png";
    public static final String PHOTO_SEARCH_ICON_I18N = "https://gw.alicdn.com/imgextra/i1/O1CN01Ow0lo51j9ndXbzPVP_!!6000000004506-2-tps-80-80.png";
    public static final String PHOTO_SEARCH_ICON_LIGHT = "https://gw.alicdn.com/imgextra/i3/O1CN01e6A34b25KGBg9w8i1_!!6000000007507-2-tps-120-111.png";
    public static final String SHARE_IMAGE_URL = "https://gw.alicdn.com/mt/TB1MtXRhhuTBuNkHFNRXXc9qpXa-200-200.jpg_150x150.jpg";
    private static final String l;
    private static final String x;
    private static final String y;
    private TUrlImageView A;

    /* renamed from: a  reason: collision with root package name */
    public View f19588a;
    public TextView b;
    private SFPromotionBean c;
    private TBPublicMenu d;
    private ActionBar e;
    private TextView f;
    private int g;
    private TUrlImageView h;
    private TUrlImageView i;
    private View j;
    private TextView k;
    private Toolbar m;
    private TUrlImageView n;
    private LinearLayout o;
    private RelativeLayout p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private View.OnClickListener w;
    private boolean z;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -211767613) {
            super.onComponentDestroy();
            return null;
        } else if (hashCode != 217607196) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxResume();
            return null;
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "SearchBarWidget";
    }

    public static /* synthetic */ ActionBar a(g gVar, ActionBar actionBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("2f7bf63a", new Object[]{gVar, actionBar});
        }
        gVar.e = actionBar;
        return actionBar;
    }

    public static /* synthetic */ void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5434cbdc", new Object[]{gVar});
        } else {
            gVar.l();
        }
    }

    public static /* synthetic */ void a(g gVar, SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25b03359", new Object[]{gVar, sFPromotionBean});
        } else {
            gVar.b(sFPromotionBean);
        }
    }

    public static /* synthetic */ void a(g gVar, SearchBarTagBean searchBarTagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("494f7a7a", new Object[]{gVar, searchBarTagBean});
        } else {
            gVar.a(searchBarTagBean);
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32656278", new Object[]{gVar, new Boolean(z)});
        } else {
            gVar.b(z);
        }
    }

    public static /* synthetic */ SFPromotionBean b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SFPromotionBean) ipChange.ipc$dispatch("e62402c2", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ ActionBar c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionBar) ipChange.ipc$dispatch("96298046", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ Activity d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("c9be4569", new Object[]{gVar}) : gVar.mActivity;
    }

    public static /* synthetic */ Toolbar e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Toolbar) ipChange.ipc$dispatch("ad9fad53", new Object[]{gVar}) : gVar.m;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.view.ViewGroup] */
    @Override // tb.ius
    public /* synthetic */ ViewGroup onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : b();
    }

    static {
        kge.a(1084847747);
        kge.a(-608431992);
        kge.a(1351750140);
        l = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16690);
        x = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16646);
        y = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16705);
    }

    public g(Activity activity, ium iumVar, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        this.c = null;
        this.d = null;
        this.q = false;
        this.r = false;
        this.u = false;
        this.v = r.cF();
        this.w = new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.searchbar.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                SearchBarTagBean searchBarTagBean = (SearchBarTagBean) view.getTag();
                if (searchBarTagBean == null) {
                    return;
                }
                if (r.aA()) {
                    g.a(g.this, searchBarTagBean);
                } else if (!(g.this.getActivity() instanceof BaseResultActivity)) {
                } else {
                    ((BaseResultActivity) g.this.getActivity()).b(searchBarTagBean);
                }
            }
        };
        this.z = poq.a(activity);
        this.s = "UOne".equals(((c) getModel().c()).getParamValueIncludingGlobal("searchBoxShowType"));
        this.t = getModel().f().getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN);
        attachToContainer();
        iruVar.c().subscribe(this);
        subscribeEvent(this);
        nvj nvjVar = (nvj) getModel().e().b(nvj.CONFIG_KEY);
        if (nvjVar != null) {
            nvjVar.a(this);
        }
        if (activity instanceof com.taobao.android.xsearchplugin.muise.f) {
            ((com.taobao.android.xsearchplugin.muise.f) activity).a(this);
        }
    }

    public ViewGroup b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7d42400c", new Object[]{this});
        }
        this.m = d();
        if (this.m == null) {
            this.m = (Toolbar) LayoutInflater.from(this.mActivity).inflate(a(), this.mContainer, false);
            if (this.mActivity instanceof BaseResultActivity) {
                ((BaseResultActivity) this.mActivity).a(this.m);
            }
        }
        return this.m;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (this.z) {
            return R.layout.nx_tbsearch_searchbar_immersive_with_tag_new;
        }
        return R.layout.nx_tbsearch_searchbar_immersive_with_tag;
    }

    private Toolbar d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Toolbar) ipChange.ipc$dispatch("e095b89e", new Object[]{this});
        }
        if (!(this.mActivity instanceof BaseResultActivity)) {
            return null;
        }
        if (r.h()) {
            Log.e("SearchBarWidget", "回收toolbar被禁用");
            return null;
        }
        Toolbar toolbar = ((BaseResultActivity) this.mActivity).getToolbar();
        if (toolbar == null) {
            Log.e("SearchBarWidget", "回收toolbar为空");
            return null;
        }
        this.m = toolbar;
        ViewGroup viewGroup = (ViewGroup) this.m.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.m);
        }
        this.r = true;
        return toolbar;
    }

    private void a(SearchBarTagBean searchBarTagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0147f6e", new Object[]{this, searchBarTagBean});
        } else if (!(getActivity() instanceof BaseResultActivity)) {
        } else {
            List<SearchBarTagBean> t = ((BaseResultActivity) getActivity()).t();
            if (t == null || t.isEmpty()) {
                b(false);
            } else if (searchBarTagBean == t.get(t.size() - 1)) {
                getActivity().finish();
            } else {
                b(false);
            }
        }
    }

    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        final AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        if (!(appCompatActivity.getSupportActionBar() instanceof n) && !this.r) {
            appCompatActivity.setSupportActionBar((Toolbar) getView());
            AppMonitor.Alarm.commitSuccess("SearchResultPage", DxContainerActivity.PARAMS_SHOW_ACTION_BAR);
        } else {
            Log.e("SearchBarWidget", "actionbar exists, cannot set toolbar");
            AppMonitor.Alarm.commitFail("SearchResultPage", DxContainerActivity.PARAMS_SHOW_ACTION_BAR, "actionBarExists", "true");
        }
        this.f19588a = findView(R.id.search_bar_left_container);
        this.b = (TextView) findView(R.id.sblc_txt_tv);
        this.b.setTextColor(Color.parseColor("#777777"));
        this.f = (TextView) findView(R.id.searchEdit);
        this.i = (TUrlImageView) findView(R.id.iv_suffix_icon);
        this.h = (TUrlImageView) findView(R.id.photoBtn);
        if (this.h != null) {
            if (!this.z) {
                if (com.alibaba.ability.localization.b.b()) {
                    this.h.setImageUrl(PHOTO_SEARCH_ICON);
                } else {
                    this.h.setImageUrl(PHOTO_SEARCH_ICON_I18N);
                }
            } else if ((getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g()) {
                this.h.setImageUrl(PHOTO_SEARCH_ICON_2024_DARK);
            } else {
                this.h.setImageUrl(PHOTO_SEARCH_ICON_2024);
            }
        }
        this.j = findView(R.id.searchbar_inner);
        this.k = (TextView) findView(R.id.search_title);
        this.n = (TUrlImageView) findView(R.id.imv_title_icon);
        this.o = (LinearLayout) findView(R.id.ll_tags_container);
        this.p = (RelativeLayout) findView(R.id.search_bar_wrapper);
        RelativeLayout relativeLayout = this.p;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.searchbar.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        g.a(g.this, true);
                    }
                }
            });
        }
        appCompatActivity.runOnUiThread(new Runnable() { // from class: com.taobao.search.sf.widgets.searchbar.g.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                g.a(g.this, appCompatActivity.getSupportActionBar());
                g.a(g.this);
            }
        });
        this.j.setVisibility(0);
        this.k.setVisibility(8);
        a((CommonSearchResult) null);
        CommonSearchContext commonSearchContext = (CommonSearchContext) getModel().f();
        if (getActivity() instanceof ITBPublicMenu) {
            this.d = ((ITBPublicMenu) getActivity()).getPublicMenu();
        }
        ((ViewGroup) getView()).post(new Runnable() { // from class: com.taobao.search.sf.widgets.searchbar.g.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                g gVar = g.this;
                g.a(gVar, g.b(gVar));
            }
        });
        if (this.t) {
            e();
        }
        if (this.z) {
            this.A = (TUrlImageView) findView(R.id.btn_go_back);
            this.A.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.searchbar.g.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        g.d(g.this).finish();
                    }
                }
            });
            this.j.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_uone_new);
        } else if (this.s) {
            this.j.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_uone);
        } else if (!com.alibaba.ability.localization.b.b()) {
            this.j.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_i18n);
        }
        this.u = Arrays.asList(r.aV()).contains(commonSearchContext.getChannelSrp());
        if (this.u) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        if (!k()) {
            return;
        }
        a(DensityUtil.dip2px(this.mActivity, 30.0f));
        ViewGroup.LayoutParams layoutParams = this.d.getCustomOverflow().getLayoutParams();
        if (layoutParams == null) {
            this.d.getCustomOverflow().setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            return;
        }
        layoutParams.width = 0;
        layoutParams.height = 0;
        this.d.getCustomOverflow().requestLayout();
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            ((ViewGroup.MarginLayoutParams) this.j.getLayoutParams()).rightMargin = i;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TextView textView = this.b;
        m mVar = m.INSTANCE;
        textView.setTextSize(1, m.a(14, true));
        TextView textView2 = this.f;
        m mVar2 = m.INSTANCE;
        textView2.setTextSize(1, m.a(14, true));
        TextView textView3 = this.k;
        m mVar3 = m.INSTANCE;
        textView3.setTextSize(1, m.a(14, true));
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
        } else {
            super.onCtxResume();
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            nud.a(z, getActivity());
        }
    }

    private void a(SearchBarBean searchBarBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b464a892", new Object[]{this, searchBarBean});
        } else if (!TextUtils.equals(searchBarBean.type, "title")) {
            this.n.setVisibility(8);
        } else {
            final String str = searchBarBean.info;
            String str2 = searchBarBean.icon;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                this.n.setVisibility(8);
                return;
            }
            this.n.setVisibility(0);
            this.n.setImageUrl(str2);
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.searchbar.g.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        Toast.makeText(g.this.getActivity(), str, 0).show();
                    }
                }
            });
        }
    }

    public void a(CommonSearchContext commonSearchContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b1f163", new Object[]{this, commonSearchContext});
            return;
        }
        String param = commonSearchContext.getParam(k.a.PARAM_COMBO_BIZ_NAME, "");
        if (TextUtils.isEmpty(param)) {
            this.f19588a.setVisibility(8);
            return;
        }
        this.f19588a.setVisibility(0);
        this.b.setText(param);
    }

    private void a(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4cbd85", new Object[]{this, commonSearchResult});
            return;
        }
        this.f.setText(getModel().c().getKeyword());
        CommonSearchContext commonSearchContext = (CommonSearchContext) getModel().f();
        h();
        if (commonSearchResult != null) {
            a(commonSearchResult.getSearchBarInfo());
        }
        if (this.q) {
            return;
        }
        a(commonSearchContext);
        this.o.removeAllViews();
        this.o.addView(this.f);
        this.o.addView(this.i);
        boolean booleanParam = commonSearchContext.getBooleanParam(noa.KEY_SRP_SEARCH_BAR_TAG_STYLE);
        List<SearchBarTagBean> t = getActivity() instanceof d ? ((d) getActivity()).t() : null;
        if (!(!TextUtils.isEmpty(commonSearchContext.getParam(noa.KEY_SEARCH_BAR_ICON))) && (booleanParam || (t != null && !t.isEmpty()))) {
            this.f.setBackgroundResource(R.drawable.tbsearch_searchbar_tag_background);
            this.j.setPadding(l.a(3), 0, l.a(15), 0);
            if (t == null || t.isEmpty()) {
                return;
            }
            for (SearchBarTagBean searchBarTagBean : t) {
                TextView g = g();
                g.setTag(searchBarTagBean);
                g.setText(searchBarTagBean.getShowKeyword());
                g.setOnClickListener(this.w);
                this.o.addView(g);
            }
            return;
        }
        this.f.setBackgroundDrawable(null);
        this.j.setPadding(0, 0, l.a(15), 0);
        f();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        String param = ((CommonSearchContext) getModel().f()).getParam(noa.KEY_SEARCH_BAR_ICON);
        if (TextUtils.isEmpty(param)) {
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(param);
            int intValue = parseObject.getIntValue("width");
            int intValue2 = parseObject.getIntValue("height");
            int a2 = l.a(51.5f);
            int a3 = l.a(14.0f);
            if (intValue2 != 0 && intValue != 0) {
                a2 = (int) (((intValue * 1.0f) / intValue2) * a3);
            }
            TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a3);
            layoutParams.leftMargin = l.a(1.0f);
            layoutParams.gravity = 16;
            this.o.addView(tUrlImageView, layoutParams);
            tUrlImageView.setImageUrl(parseObject.getString("url"));
            this.f.setIncludeFontPadding(false);
        } catch (Exception e) {
            q.b("renderSearchIcon", "原始数据" + param);
            q.b("renderSearchIcon", e.getLocalizedMessage());
        }
    }

    private TextView g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("c66fb7e2", new Object[]{this});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(l.a(3), 0, 0, 0);
        TextView textView = new TextView(getActivity());
        textView.setLayoutParams(layoutParams);
        if (this.t) {
            m mVar = m.INSTANCE;
            textView.setTextSize(1, m.a(14, true));
        } else {
            textView.setTextSize(1, this.z ? 15.0f : 13.5f);
        }
        textView.setGravity(16);
        textView.setTextColor(Color.parseColor("#333333"));
        textView.setBackgroundResource(R.drawable.tbsearch_searchbar_tag_background);
        return textView;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        CommonSearchContext commonSearchContext = (CommonSearchContext) getModel().f();
        if (commonSearchContext == null) {
            return;
        }
        String string = commonSearchContext.isSameStyleModule() ? Globals.getApplication().getResources().getString(R.string.same_result_activity_title) : "";
        if (commonSearchContext.isSimilarModule()) {
            string = Globals.getApplication().getResources().getString(R.string.similar_result_activity_title);
        }
        if (commonSearchContext.isLongSleeveRecommendModule()) {
            string = Globals.getApplication().getResources().getString(R.string.recommend_result_activity_title);
        }
        if (commonSearchContext.isShopSimilarSearchModule()) {
            string = Globals.getApplication().getString(R.string.shopsimilar_result_activity_title);
        }
        String param = commonSearchContext.getParam(k.KEY_SRP_CUSTOM_TITLE);
        if (TextUtils.isEmpty(param)) {
            param = string;
        }
        if (TextUtils.isEmpty(param)) {
            return;
        }
        this.k.setText(param);
        this.k.setVisibility(0);
        this.j.setVisibility(8);
        this.q = true;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        Toolbar toolbar = this.m;
        if (toolbar != null) {
            ViewCompat.setBackground(toolbar, null);
        }
        n();
        View view = this.j;
        if (view == null) {
            return;
        }
        view.setAlpha(0.5f);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            this.j.setVisibility(8);
        }
    }

    private void b(boolean z) {
        Iterator<SearchBarTagBean> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.search.mmd.util.e.a("Door", "a2141.7631709.1999021211.4922321");
        com.taobao.search.mmd.util.e.a("ChangeSearch");
        CommonSearchContext commonSearchContext = (CommonSearchContext) getModel().f();
        final c cVar = (c) getModel().b();
        boolean booleanParam = commonSearchContext.getBooleanParam(noa.KEY_SRP_SEARCH_BAR_TAG_STYLE);
        List<SearchBarTagBean> list = null;
        if (getActivity() instanceof d) {
            list = ((d) getActivity()).t();
        }
        final String charSequence = r.bx() ? this.f.getText().toString() : getModel().c().getKeyword();
        if ((getModel().c().getTotalSearchResult() instanceof CommonSearchResult) && ((CommonSearchResult) getModel().c().getTotalSearchResult()).guideSearch) {
            charSequence = getModel().c().getKeyword();
        }
        final String str = "";
        if (list != null && !list.isEmpty()) {
            while (list.iterator().hasNext()) {
                charSequence = charSequence + " " + it.next().getShowKeyword();
            }
        } else if (!z && booleanParam) {
            charSequence = str;
        }
        if ("true".equals(cVar.getParamValue(noa.KEY_HAS_TAB))) {
            str = cVar.getTab();
        }
        if (commonSearchContext.isPopupSrp()) {
            ((BaseResultActivity) this.mActivity).a(new AnimatorListenerAdapter() { // from class: com.taobao.search.sf.widgets.searchbar.g.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        p.a(charSequence, str, cVar.D(), g.this.getActivity(), "srp", false);
                    }
                }
            });
        } else {
            p.a(charSequence, str, cVar.D(), getActivity(), "srp");
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : ((CommonSearchContext) getModel().f()).isPopupSrp();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.searchbar.g.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    g.a(g.this, false);
                }
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.sf.widgets.searchbar.g.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    String str = "ssk";
                    String paramValueIncludingGlobal = g.this.getModel().d().getParamValueIncludingGlobal("channelSrp");
                    if (!TextUtils.isEmpty(paramValueIncludingGlobal)) {
                        str = str + "-" + paramValueIncludingGlobal;
                    }
                    Nav.from(g.this.getActivity()).toUri("http://h5.m.taobao.com/tusou/index.html?pssource=" + str);
                    com.taobao.search.mmd.util.e.a("PhotoSearch_Enter", "a2141.7631709.1999021211.4922322");
                } catch (Throwable unused) {
                    q.b("SearchDoorActivity", "启动图搜失败！");
                }
            }
        });
        ActionBar actionBar = this.e;
        if (actionBar == null) {
            return;
        }
        actionBar.c(true);
    }

    public void a(MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4f7fe", new Object[]{this, mSearchResult});
        } else if (mSearchResult.isFailed()) {
        } else {
            a((CommonSearchResult) mSearchResult);
            if (this.q) {
                return;
            }
            SearchBarBean searchBarInfo = mSearchResult.getSearchBarInfo();
            if ("search".equals(searchBarInfo.type)) {
                this.j.setVisibility(0);
                if (!TextUtils.isEmpty(searchBarInfo.text)) {
                    this.f.setText(searchBarInfo.text);
                }
                b(searchBarInfo);
            } else {
                this.j.setVisibility(8);
            }
            if ("title".equals(searchBarInfo.type)) {
                this.k.setText(searchBarInfo.text);
                this.k.setVisibility(0);
                return;
            }
            this.k.setVisibility(8);
        }
    }

    private void b(SearchBarBean searchBarBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4151bfb1", new Object[]{this, searchBarBean});
        } else if (searchBarBean == null) {
            this.i.setVisibility(8);
        } else {
            String str = searchBarBean.suffixIcon;
            if (TextUtils.isEmpty(str)) {
                this.i.setVisibility(8);
                return;
            }
            this.i.setVisibility(0);
            this.i.getLayoutParams().width = (int) (searchBarBean.suffixIconRatio * this.i.getLayoutParams().height);
            this.i.setImageUrl(str);
            this.i.requestLayout();
            this.f.setIncludeFontPadding(false);
        }
    }

    public void onEventMainThread(isv.a aVar) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, aVar});
        } else if (!aVar.b() || (commonSearchResult = (CommonSearchResult) getModel().c().getTotalSearchResult()) == null || commonSearchResult.isFailed()) {
        } else {
            a(commonSearchResult);
            if (this.q) {
                return;
            }
            SearchBarBean searchBarInfo = commonSearchResult.getSearchBarInfo();
            if ("search".equals(searchBarInfo.type)) {
                this.j.setVisibility(0);
                if (!TextUtils.isEmpty(searchBarInfo.text)) {
                    this.f.setText(searchBarInfo.text);
                }
            } else {
                this.j.setVisibility(8);
            }
            if ("title".equals(searchBarInfo.type)) {
                this.k.setText(searchBarInfo.text);
                this.k.setVisibility(0);
                return;
            }
            this.k.setVisibility(8);
        }
    }

    private void a(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2945670", new Object[]{this, menu});
        } else if (menu == null) {
        } else {
            menu.add(0, 1001, 0, getActivity().getResources().getString(R.string.uik_icon_share) + l).setOnMenuItemClickListener(new a(getActivity(), getModel().f()));
        }
    }

    @Override // tb.nvk
    public void a(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c019e54d", new Object[]{this, sFPromotionBean});
            return;
        }
        this.c = sFPromotionBean;
        b(sFPromotionBean);
    }

    private void b(SFPromotionBean sFPromotionBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61db0ac", new Object[]{this, sFPromotionBean});
        } else if ((getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g()) {
            m();
            Toolbar toolbar = this.m;
            if (toolbar == null) {
                return;
            }
            ViewCompat.setBackground(toolbar, null);
        } else if (sFPromotionBean == null) {
        } else {
            Toolbar toolbar2 = this.m;
            if (toolbar2 != null) {
                ViewCompat.setBackground(toolbar2, null);
            }
            if (sFPromotionBean.f19160a == 10002) {
                n();
                a(sFPromotionBean, false);
                return;
            }
            m();
            a(sFPromotionBean, true);
        }
    }

    private void a(SFPromotionBean sFPromotionBean, boolean z) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43237727", new Object[]{this, sFPromotionBean, new Boolean(z)});
        } else if (!this.v || (commonSearchResult = (CommonSearchResult) getModel().d().getTotalSearchResult()) == null || !commonSearchResult.hasGuideSearchTopHeader) {
        } else {
            int i = (int) ((1.0f - sFPromotionBean.f) * 255.0f);
            ((GradientDrawable) this.j.getBackground().mutate()).setColor(Color.argb((int) ((204 * (1.0f - sFPromotionBean.f)) + 51), i, i, i));
            if (this.g == 0) {
                this.g = this.f.getCurrentTextColor();
            }
            if (z) {
                this.f.setTextColor(this.g);
                this.h.setImageUrl(PHOTO_SEARCH_ICON);
                return;
            }
            this.f.setTextColor(-1);
            this.h.setImageUrl(PHOTO_SEARCH_ICON_LIGHT);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.e
    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        m();
        Toolbar toolbar = this.m;
        if (toolbar == null) {
            return;
        }
        ViewCompat.setBackground(toolbar, null);
    }

    /* loaded from: classes8.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Activity f19597a;
        private com.taobao.android.searchbaseframe.context.a b;

        static {
            kge.a(-2120226647);
            kge.a(78402243);
        }

        public a(Activity activity, com.taobao.android.searchbaseframe.context.a aVar) {
            this.f19597a = activity;
            this.b = aVar;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            if (menuItem != null && menuItem.getItemId() == 1001) {
                a();
            }
            return false;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                ShareBusiness.share(this.f19597a, g.a(this.b), (ShareBusinessListener) null);
            }
        }
    }

    public static ShareContent a(com.taobao.android.searchbaseframe.context.a aVar) {
        Map<String, String> hashMap;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("fd2a76a", new Object[]{aVar});
        }
        ShareContent shareContent = new ShareContent();
        if (aVar != null) {
            str = aVar.getParam("q");
            hashMap = aVar.getParamsSnapshot();
        } else {
            hashMap = new HashMap<>(1);
            str = "";
        }
        shareContent.url = y.a(r.bD(), hashMap);
        if (TextUtils.isEmpty(str)) {
            shareContent.description = y;
        } else {
            shareContent.description = String.format(x, str);
        }
        shareContent.businessId = "shoutaosearch";
        shareContent.imageUrl = SHARE_IMAGE_URL;
        return shareContent;
    }

    public void onEventMainThread(nwk.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1246cbf3", new Object[]{this, dVar});
        } else if ("1".equals(dVar.f31808a)) {
            j();
        } else if (!"2".equals(dVar.f31808a)) {
        } else {
            i();
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (this.e != null) {
            if ((getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g()) {
                this.e.c(getActivity().getResources().getDrawable(R.drawable.actionbar_left_arrow));
                a(false);
            } else {
                this.e.c(getActivity().getResources().getDrawable(R.drawable.tbsearch_ck_android_black));
                a(true);
            }
            if (this.z) {
                this.e.c(false);
            }
        }
        this.k.setTextColor(Color.parseColor("#333333"));
        if (this.z && this.A != null) {
            if ((getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g()) {
                this.A.setImageUrl(BACK_BUTTON_ICON_DARK);
                a(false);
            } else {
                this.A.setImageUrl(BACK_BUTTON_ICON_LIGHT);
                a(true);
            }
        }
        TBPublicMenu tBPublicMenu = this.d;
        if (tBPublicMenu != null && tBPublicMenu.getCustomOverflow() != null) {
            if ((getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g()) {
                this.d.getCustomOverflow().switchActionStyle(TBActionBar.ActionBarStyle.DARK);
            } else {
                this.d.getCustomOverflow().switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
            }
        }
        TUrlImageView tUrlImageView = this.h;
        if (tUrlImageView == null) {
            return;
        }
        if (this.z) {
            if ((getActivity() instanceof com.taobao.android.xsearchplugin.muise.f) && ((com.taobao.android.xsearchplugin.muise.f) getActivity()).g()) {
                this.h.setImageUrl(PHOTO_SEARCH_ICON_2024_DARK);
                return;
            } else {
                this.h.setImageUrl(PHOTO_SEARCH_ICON_2024);
                return;
            }
        }
        tUrlImageView.setImageUrl(com.alibaba.ability.localization.b.b() ? PHOTO_SEARCH_ICON_LIGHT : PHOTO_SEARCH_ICON_I18N);
    }

    private void n() {
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        a(false);
        if (this.z && (tUrlImageView = this.A) != null) {
            tUrlImageView.setImageUrl(BACK_BUTTON_ICON_DARK);
        }
        ActionBar actionBar = this.e;
        if (actionBar != null) {
            actionBar.c(getActivity().getResources().getDrawable(R.drawable.actionbar_left_arrow));
            if (this.z) {
                this.e.c(false);
            }
        }
        this.k.setTextColor(-1);
        TBPublicMenu tBPublicMenu = this.d;
        if (tBPublicMenu == null || tBPublicMenu.getCustomOverflow() == null) {
            return;
        }
        this.d.getCustomOverflow().switchActionStyle(TBActionBar.ActionBarStyle.DARK);
    }

    public void onEventMainThread(nxa.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361ba840", new Object[]{this, bVar});
        } else {
            a(bVar.f31825a);
        }
    }

    public void onEventMainThread(nxa.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361b33e1", new Object[]{this, aVar});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.search.sf.widgets.searchbar.g.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (g.c(g.this) != null) {
                        g.c(g.this).e();
                    }
                    if (g.e(g.this) == null) {
                        return;
                    }
                    g.e(g.this).setVisibility(8);
                }
            });
        }
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        if (!(getActivity() instanceof com.taobao.android.xsearchplugin.muise.f)) {
            return;
        }
        ((com.taobao.android.xsearchplugin.muise.f) getActivity()).b(this);
    }
}
