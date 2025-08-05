package com.taobao.search.sf;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ah;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.irg;
import tb.kge;
import tb.nne;
import tb.noa;
import tb.nop;
import tb.nto;
import tb.nwl;
import tb.nwr;

/* loaded from: classes8.dex */
public class InshopResultActivity extends CustomBaseActivity implements com.taobao.android.xsearchplugin.muise.f, irg, nop.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALL_ITEM_SPM = "a2141.7631671.0.0";
    public static final String CATEGORY_PAGE_SPM = "a2141.7631684.0.0";
    public static final String SEARCH_PAGE_SPM = "a2141.11319901.0.0";
    public static final String SPM = "spm";
    public static final String SPM_CNT = "spm-cnt";

    /* renamed from: a  reason: collision with root package name */
    private nwl f19421a;
    private CommonSearchContext b;
    private String c;
    private Map<String, String> d = new HashMap();
    private com.taobao.search.c e = new com.taobao.search.c();

    static {
        kge.a(-597706065);
        kge.a(-569200449);
        kge.a(754605064);
        kge.a(-629875645);
    }

    public static /* synthetic */ Object ipc$super(InshopResultActivity inshopResultActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    @Override // tb.nop.a
    public void onSearchRenderEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59913c45", new Object[]{this});
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        TLogTracker.a(nne.PAGE_NAME_INSHOP);
        SearchSdk.init();
        setTheme(R.style.Theme_SearchAnimation);
        ScreenType.b(this);
        this.e.a((Activity) this, true);
        super.onCreate(bundle);
        setContentView(R.layout.plugin_test_layout);
        TLogTracker.a(r.bk());
        nto.INSTANCE.a(getIntent());
        this.b = CommonSearchContext.fromMap(com.taobao.search.mmd.util.a.a(getIntent()));
        this.b.setParam(noa.KEY_IS_WEEX_SHOP, "true");
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.d);
        if ("category".equals(this.b.getParam("from", ""))) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Category_List");
            this.c = "Page_Shop_Category_List";
            setUTPageName("Page_Shop_Category_List");
            hashMap.put("spm-cnt", CATEGORY_PAGE_SPM);
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Search_List");
            this.c = "Page_Shop_Search_List";
            setUTPageName("Page_Shop_Search_List");
            hashMap.put("spm-cnt", SEARCH_PAGE_SPM);
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        this.f19421a = new nwr(true);
        this.f19421a.a(this);
        this.f19421a.a(this, this.b);
        ((LinearLayout) findViewById(R.id.list_container)).addView(this.f19421a.a());
        this.f19421a.b();
        TLogTracker.a(this.b.getParamsSnapshot());
        this.e.a(this.f19421a.a(), 0);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.a(nne.PAGE_NAME_INSHOP);
        super.onResume();
        this.f19421a.c();
        HashMap hashMap = new HashMap(this.d);
        if ("category".equals(this.b.getParam("from", ""))) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Category_List");
            setUTPageName("Page_Shop_Category_List");
            hashMap.put("spm-cnt", CATEGORY_PAGE_SPM);
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Shop_Search_List");
            setUTPageName("Page_Shop_Search_List");
            hashMap.put("spm-cnt", SEARCH_PAGE_SPM);
        }
        com.taobao.search.jarvis.c.a(this.c, (String) null, a(), this);
        hashMap.put(noa.KEY_MINI_APP, this.b.getParam(noa.KEY_MINI_APP));
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.f19421a.d();
        com.taobao.search.jarvis.c.b(this.c, null, a(), this);
    }

    private Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("query", this.b.getKeyword());
        return hashMap;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TLogTracker.a();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TLogTracker.b();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TLogTracker.c();
        this.f19421a.e();
    }

    @Override // tb.nop.a
    public void onPagePropertiesUpdate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d12d4", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.d.clear();
            this.d.putAll(map);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, this.d);
        }
    }

    @Override // tb.irg
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            TLogTracker.b(str, map);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.e.a();
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void closeViewDarkMode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dae15", new Object[]{this, view});
        } else if (view == null || !r.cB()) {
        } else {
            ah.a(view);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void a(com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf8a69d", new Object[]{this, eVar});
        } else {
            this.e.a(eVar);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void b(com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5172ccde", new Object[]{this, eVar});
        } else {
            this.e.b(eVar);
        }
    }
}
