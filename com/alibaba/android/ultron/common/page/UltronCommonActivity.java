package com.alibaba.android.ultron.common.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.taobao.TBActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.android.ultron.common.page.i;
import com.alibaba.android.ultron.common.widget.NestedPtrRecyclerView;
import com.alibaba.android.ultron.common.widget.a;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.ptr.PtrBase;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.bio;
import tb.bip;
import tb.bit;
import tb.biv;
import tb.bix;
import tb.dcn;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronCommonActivity extends AppCompatActivity implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SystemBarDecorator f2521a;
    private NestedPtrRecyclerView b;
    private LinearLayout c;
    private LinearLayout d;
    private TextView e;
    private TextView f;
    private PtrBase g;
    private LinearLayout h;
    private a i;
    private i j;
    private View k;
    private View l;
    private TIconFontTextView m;
    private String n = bip.REQUEST_ONCE;
    private String o = null;
    private String p = null;
    private boolean q = false;
    private JSONObject r;
    private OnScreenChangedListener s;

    static {
        kge.a(-415604860);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(UltronCommonActivity ultronCommonActivity, String str, Object... objArr) {
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
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
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
        j.b(context);
    }

    public static /* synthetic */ void a(UltronCommonActivity ultronCommonActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842026d5", new Object[]{ultronCommonActivity});
        } else {
            ultronCommonActivity.f();
        }
    }

    public static /* synthetic */ void a(UltronCommonActivity ultronCommonActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811902bb", new Object[]{ultronCommonActivity, jSONObject});
        } else {
            ultronCommonActivity.a(jSONObject);
        }
    }

    public static /* synthetic */ i b(UltronCommonActivity ultronCommonActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("8e6a02fe", new Object[]{ultronCommonActivity}) : ultronCommonActivity.j;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.ultron_common_page);
        if (getSupportActionBar() != null) {
            getSupportActionBar().e();
        }
        try {
            this.f2521a = new SystemBarDecorator(this);
            this.f2521a.enableImmersiveStatusBar(true);
        } catch (Throwable th) {
            Log.e("TBMainActivity", "enableImmersiveStatusBar failed:", th);
        }
        a();
        b();
        d();
        if (!dcn.a()) {
            return;
        }
        e();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.s = new OnScreenChangedListener() { // from class: com.alibaba.android.ultron.common.page.UltronCommonActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                } else {
                    UltronCommonActivity.a(UltronCommonActivity.this);
                }
            }
        };
        com.taobao.android.autosize.h.a().c(this.s);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.common.page.provider.a h = this.j.h();
        if (!(h instanceof com.alibaba.android.ultron.common.page.provider.impl.a)) {
            return;
        }
        ((com.alibaba.android.ultron.common.page.provider.impl.a) h).i().a(127);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = (NestedPtrRecyclerView) findViewById(R.id.common_page_recycler_view);
        this.g = (PtrBase) findViewById(R.id.common_page_ultron_refresh);
        this.b.setLayoutManager(new LinearLayoutManager(this));
        this.c = (LinearLayout) findViewById(R.id.common_page_top_layout);
        this.d = (LinearLayout) findViewById(R.id.common_page_bottom_layout);
        this.h = (LinearLayout) findViewById(R.id.status_container);
        this.e = (TextView) findViewById(R.id.common_page_title);
        this.f = (TextView) findViewById(R.id.common_page_actionbar);
        this.i = new a(this, this.c);
        this.k = findViewById(R.id.back_to_pre);
        this.l = findViewById(R.id.title_bar);
        this.m = (TIconFontTextView) findViewById(R.id.back_to_pre);
        this.g.mo1212getStartLayout().setLoadingDelegate(this.i);
        this.g.setOnRefreshListener(new PtrBase.a() { // from class: com.alibaba.android.ultron.common.page.UltronCommonActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullStartToRefresh(PtrBase ptrBase) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
                } else {
                    UltronCommonActivity.b(UltronCommonActivity.this).a(2);
                }
            }

            @Override // com.taobao.ptr.PtrBase.a
            public void onPullEndToRefresh(PtrBase ptrBase) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
                } else if (UltronCommonActivity.b(UltronCommonActivity.this) == null) {
                } else {
                    UltronCommonActivity.b(UltronCommonActivity.this).d();
                }
            }
        });
        this.k.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.f.setVisibility(8);
        c();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j = new i(this);
        this.j.a(this.c, this.b, this.d, this.g);
        this.j.a(new i.a() { // from class: com.alibaba.android.ultron.common.page.UltronCommonActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.common.page.i.a
            public void a(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (i != 0) {
                } else {
                    UltronCommonActivity.a(UltronCommonActivity.this, UltronCommonActivity.b(UltronCommonActivity.this).c());
                }
            }
        });
        this.j.a(new d(this.h, this));
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(this);
        if (biv.a(biv.b(4473924))) {
            systemBarDecorator.enableImmersiveStatusBar(true);
        } else {
            systemBarDecorator.enableImmersiveStatusBar();
        }
        if (!FestivalMgr.a().a("global")) {
            return;
        }
        int a2 = FestivalMgr.a().a("actionbarTextColor", getResources().getColor(R.color.D));
        this.e.setTextColor(a2);
        this.f.setTextColor(a2);
        this.m.setTextColor(a2);
        if (biv.a(a2)) {
            FestivalMgr.a().a(this, this.l, TBActionBar.ActionBarStyle.NORMAL);
        } else {
            FestivalMgr.a().a(this, this.l, TBActionBar.ActionBarStyle.DARK);
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey(bip.KEY_ACTIONBAR_INFO)) {
            this.f.setVisibility(8);
        } else {
            this.r = jSONObject.getJSONObject(bip.KEY_ACTIONBAR_INFO);
            JSONObject jSONObject2 = this.r;
            JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject(bip.KEY_ACTIONBAR_RIGHT_INFO) : null;
            JSONObject jSONObject4 = jSONObject3 != null ? jSONObject3.getJSONObject("fields") : null;
            String string = jSONObject4 != null ? jSONObject4.getString("title") : null;
            if (!TextUtils.isEmpty(string)) {
                this.f.setText(string);
                this.f.setVisibility(0);
                return;
            }
            this.r = null;
            this.f.setVisibility(8);
        }
    }

    private void d() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (getIntent() == null) {
        } else {
            try {
                Uri data = getIntent().getData();
                if (data == null) {
                    return;
                }
                String queryParameter = data.getQueryParameter(bip.a.f25932a);
                this.n = data.getQueryParameter(bip.a.b);
                JSONObject a2 = bio.a().a(this, queryParameter);
                if (a2 == null) {
                    finish();
                    return;
                }
                String a3 = bit.a(queryParameter, (String) null);
                if (!TextUtils.isEmpty(a3)) {
                    Nav.from(Globals.getApplication()).toUri(a3);
                    finish();
                    return;
                }
                if (a2.containsKey(bip.a.o) && (jSONObject = a2.getJSONObject(bip.a.o)) != null) {
                    this.o = jSONObject.getString(bip.a.p);
                    this.p = jSONObject.getString(bip.a.q);
                }
                String string = a2.getString(bip.a.k);
                if (!TextUtils.isEmpty(string)) {
                    this.e.setText(string);
                }
                this.j.a(a2, this.o, a(data));
                if (!bip.REQUEST_ONCE.equals(this.n)) {
                    return;
                }
                this.j.a(1);
            } catch (Exception e) {
                String message = e.getMessage();
                bix.a(this.o, "dataProcess", "READ_ASSET_CONFIG_EXCEPTION", message, (Map<UMDimKey, Object>) null, (com.alibaba.android.umbrella.link.export.a) null);
                bix.a(this.o, "dataProcess", "get_page_config", "READ_ASSET_CONFIG_EXCEPTION", message, (Map<String, String>) null);
            }
        }
    }

    private Map<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{this, uri});
        }
        final String queryParameter = uri.getQueryParameter("params");
        if (queryParameter != null) {
            return new HashMap<String, String>() { // from class: com.alibaba.android.ultron.common.page.UltronCommonActivity.4
                {
                    put("params", queryParameter);
                }
            };
        }
        return null;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else {
            super.onNewIntent(intent);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!TextUtils.isEmpty(this.o)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, this.o);
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(this, this.o);
        }
        if (!TextUtils.isEmpty(this.p)) {
            HashMap hashMap = new HashMap();
            hashMap.put("spm-cnt", this.p);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        }
        if (!bip.REQUEST_ONCE.equals(this.n)) {
            this.j.a(1);
        }
        try {
            String str = this.o + bip.KEY_UMBRELLA_PAGE_POST_FIX;
            HashMap hashMap2 = new HashMap();
            if (getIntent() != null) {
                hashMap2.put(bip.KEY_UMBRELLA_URL, getIntent().getData().toString());
            }
            String pageSpmUrl = UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(this);
            if (!TextUtils.isEmpty(pageSpmUrl)) {
                hashMap2.put(bip.KEY_UMBRELLA_SPM_PRE, pageSpmUrl);
            }
            bix.a(this.o, bip.KEY_UMBRELLA_FEATURE_SHOW, str, str, "", hashMap2);
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == this.k.getId()) {
            finish();
        } else if (view.getId() != this.f.getId() || (jSONObject = this.r) == null) {
        } else {
            JSONArray jSONArray = null;
            JSONObject jSONObject2 = (jSONObject != null ? jSONObject.getJSONObject(bip.KEY_ACTIONBAR_RIGHT_INFO) : null).getJSONObject("events");
            if (jSONObject2 != null) {
                jSONArray = jSONObject2.getJSONArray("click");
            }
            this.j.a(jSONArray);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        i iVar = this.j;
        if (iVar != null) {
            iVar.f();
        }
        if (this.s == null) {
            return;
        }
        com.taobao.android.autosize.h.a().d(this.s);
    }
}
