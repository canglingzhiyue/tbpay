package com.taobao.android.address;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.webview.k;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.Weex2StartParams;
import com.taobao.themis.external.embed.a;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.i;
import com.taobao.weex.n;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXLogUtils;
import java.io.Serializable;
import java.util.HashMap;
import tb.dof;
import tb.efe;
import tb.gvl;
import tb.ljl;
import tb.mbn;
import tb.riu;

/* loaded from: classes4.dex */
public class WeexPopContainer extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAMS_IS_ADDRESS_USER_WEEX2 = "is_address_user_weex2";
    public static final String PARAMS_IS_TRANSPARENT = "PARAMS_IS_TRANSPARENT";
    public static final String PARAMS_SCENE = "params_scene";
    public static final String PARAMS_SHOW_LOADING = "show_loading";

    /* renamed from: a  reason: collision with root package name */
    public static String f8961a = "left_in";
    public static String b = "bottom_in";
    public static String c = "addressWeex";
    public WeexPageFragment d;
    private TMSEmbed e;
    public Activity f;
    public FragmentManager k;
    private i m;
    private String n;
    private View o;
    private View p;
    private View q;
    private View r;
    private RelativeLayout s;
    private ProgressBar t;
    private String u;
    private boolean v;
    private boolean w;
    private long x;
    private long y;
    private long z;
    public int g = 880;
    public String h = b;
    public boolean i = true;
    public int j = 0;
    public boolean l = false;

    public static /* synthetic */ Object ipc$super(WeexPopContainer weexPopContainer, String str, Object... objArr) {
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
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
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
        j.b(context);
    }

    public static /* synthetic */ void a(WeexPopContainer weexPopContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299513fa", new Object[]{weexPopContainer});
        } else {
            weexPopContainer.a();
        }
    }

    public static /* synthetic */ long b(WeexPopContainer weexPopContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b3eba0d", new Object[]{weexPopContainer})).longValue() : weexPopContainer.z;
    }

    public static /* synthetic */ ProgressBar c(WeexPopContainer weexPopContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProgressBar) ipChange.ipc$dispatch("3ca04fd2", new Object[]{weexPopContainer}) : weexPopContainer.t;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TMSEmbed tMSEmbed = this.e;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.d();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.i = false;
        TMSEmbed tMSEmbed = this.e;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.g();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TMSEmbed tMSEmbed = this.e;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.e();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.i = true;
        TMSEmbed tMSEmbed = this.e;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.f();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TMSEmbed tMSEmbed = this.e;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.c();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.f = this;
        this.k = getSupportFragmentManager();
        Intent intent = getIntent();
        a(intent);
        this.x = System.currentTimeMillis();
        dof.a("createWeex2Act" + this.v, "" + this.x, "", null);
        if (!this.v && !b()) {
            c(intent);
            finish();
            return;
        }
        setContentView(R.layout.aliuser_weex_pop_container);
        c();
        if (this.v) {
            f();
        } else {
            e();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.s = (RelativeLayout) findViewById(R.id.address_common_container);
        this.o = findViewById(R.id.cash_transparent_click);
        this.p = findViewById(R.id.aliaddress_nav);
        this.q = findViewById(R.id.weex_multiple_container);
        this.t = (ProgressBar) findViewById(R.id.address_progress);
        if (this.l) {
            d();
            return;
        }
        this.o.setVisibility(0);
        this.p.setVisibility(0);
        this.q.setBackgroundResource(R.color.ali_address_color);
        if (getSupportActionBar() != null) {
            getSupportActionBar().e();
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.aliuser_dialog_title_cancel_tv);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01NmOQEc1UCnz10fJJN_!!6000000002482-2-tps-48-49.png");
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.address.WeexPopContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    WeexPopContainer.a(WeexPopContainer.this);
                }
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.address.WeexPopContainer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    WeexPopContainer.a(WeexPopContainer.this);
                }
            }
        });
        try {
            ((TextView) findViewById(R.id.aliuser_address_title)).setTypeface(Typeface.createFromAsset(getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Md.ttf"));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        efe.a((Activity) this);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.q.setBackgroundResource(R.color.transparent);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
        this.y = System.currentTimeMillis();
        dof.a("finishWeex2Act" + this.v, "" + this.y, String.valueOf(this.y - this.x), null);
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            this.l = intent.getBooleanExtra(PARAMS_IS_TRANSPARENT, false);
            this.w = intent.getBooleanExtra(PARAMS_SHOW_LOADING, false);
            String stringExtra = intent.getStringExtra(PARAMS_SCENE);
            this.v = intent.getBooleanExtra(PARAMS_IS_ADDRESS_USER_WEEX2, ThemisConfig.a(stringExtra));
            this.g = intent.getIntExtra("height", 880);
            this.h = intent.getStringExtra("type");
            this.j = intent.getIntExtra("fullPage", 0);
            this.n = intent.getStringExtra(riu.e);
            this.u = intent.getStringExtra(riu.c);
            String str = c;
            AdapterForTLog.logd(str, "initData isUserWeex2:" + this.v + " scene:" + stringExtra + " bundleUrl:" + this.u + " mWeexUrl:" + this.n);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        AdapterForTLog.logd(c, "address weex1.0");
        this.m = new i(this);
        this.m.a();
        k a2 = android.taobao.windvane.webview.j.a();
        if (a2 != null) {
            this.u = a2.dealUrlScheme(this.u);
        }
        String a3 = a(this.u);
        Serializable serializable = null;
        if (getIntent() != null) {
            serializable = getIntent().getSerializableExtra("wx_options");
        }
        a(this.n, this.u, a3, WeexPageFragment.FRAGMENT_TAG, serializable, MainFragment.class);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        AdapterForTLog.logd(c, "address weex2.0");
        ProgressBar progressBar = this.t;
        if (!this.w || !efe.c("address_show_common_loading")) {
            i = 8;
        }
        progressBar.setVisibility(i);
        d();
        Weex2StartParams weex2StartParams = new Weex2StartParams();
        weex2StartParams.setUrl(this.u);
        this.z = System.currentTimeMillis();
        dof.a("createWeex2", "" + this.z, String.valueOf(this.z - this.x), null);
        this.e = new TMSEmbed(this, TMSEmbedSolutionType.WEEX);
        this.e.a(weex2StartParams);
        final long currentTimeMillis = System.currentTimeMillis();
        dof.a("initWeex2", "" + currentTimeMillis, String.valueOf(currentTimeMillis - this.z), null);
        this.r = this.e.b();
        this.s.addView(this.r, new RelativeLayout.LayoutParams(-1, -2));
        this.e.a(new a.C0936a() { // from class: com.taobao.android.address.WeexPopContainer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public long b = 0;
            public long c = 0;
            public long d = 0;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                switch (str.hashCode()) {
                    case -650670724:
                        super.a((String) objArr[0], (String) objArr[1]);
                        return null;
                    case -635125116:
                        return new Boolean(super.a(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], (String) objArr[2]));
                    case 90991720:
                        super.a();
                        return null;
                    case 91915241:
                        super.b();
                        return null;
                    case 92838762:
                        super.c();
                        return null;
                    case 93762283:
                        super.d();
                        return null;
                    case 94685804:
                        super.e();
                        return null;
                    case 1708636285:
                        super.b((String) objArr[0], (String) objArr[1]);
                        return null;
                    default:
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
            }

            @Override // com.taobao.themis.external.embed.a.C0936a
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                super.d();
                AdapterForTLog.logd(WeexPopContainer.c, ljl.LAUNCHER_START_TIME);
            }

            @Override // com.taobao.themis.external.embed.a.C0936a
            public void e() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a4ca6c", new Object[]{this});
                    return;
                }
                super.e();
                AdapterForTLog.logd(WeexPopContainer.c, ljl.LAUNCHER_FINISH_TIME);
            }

            @Override // com.taobao.themis.external.embed.a.C0936a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                super.c();
                AdapterForTLog.logd(WeexPopContainer.c, ljl.RENDER_START_TIME);
                this.b = System.currentTimeMillis();
                dof.a("start_weex_render", "" + this.b, String.valueOf(this.b - currentTimeMillis), null);
            }

            @Override // com.taobao.themis.external.embed.a.C0936a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                super.a();
                AdapterForTLog.logd(WeexPopContainer.c, ljl.RENDER_SUCCESS_TIME);
                this.c = System.currentTimeMillis();
                dof.a("finish_weex_render", "" + this.c, String.valueOf(this.c - this.b), null);
                dof.a("success_weex_render", "" + this.c, String.valueOf(this.c - WeexPopContainer.b(WeexPopContainer.this)), null);
                WeexPopContainer.c(WeexPopContainer.this).setVisibility(8);
            }

            @Override // com.taobao.themis.external.embed.a.C0936a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                super.a(str, str2);
                String str3 = WeexPopContainer.c;
                AdapterForTLog.logd(str3, "onRenderFailed errorCode:" + str + " errorMsg:" + str2);
                this.d = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.d);
                dof.a("fail_weex_render", sb.toString(), String.valueOf(this.d - this.b), null);
                WeexPopContainer.c(WeexPopContainer.this).setVisibility(8);
            }

            @Override // com.taobao.themis.external.embed.a.C0936a
            public void b(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                    return;
                }
                super.b(str, str2);
                String str3 = WeexPopContainer.c;
                AdapterForTLog.logd(str3, "onJSException errorCode:" + str + " errorMsg:" + str2);
            }

            @Override // com.taobao.themis.external.embed.a.C0936a
            public boolean a(boolean z, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("da24c284", new Object[]{this, new Boolean(z), str, str2})).booleanValue();
                }
                String str3 = WeexPopContainer.c;
                AdapterForTLog.logd(str3, "onDowngrade canAutoDowngrade:" + z + " errorCode:" + str + " errorMsg:" + str2);
                return super.a(z, str, str2);
            }

            @Override // com.taobao.themis.external.embed.a.C0936a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                super.b();
                AdapterForTLog.logd(WeexPopContainer.c, "onPop");
            }
        });
        this.e.a();
    }

    private void a(String str, String str2, String str3, String str4, Serializable serializable, Class<? extends WeexPageFragment> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1bd319", new Object[]{this, str, str2, str3, str4, serializable, cls});
            return;
        }
        Fragment findFragmentByTag = this.k.findFragmentByTag(str4);
        if (findFragmentByTag != null) {
            this.k.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        this.d = (WeexPageFragment) a(this, cls, str, str2, R.id.weex_multiple_container, str4, serializable);
        WeexPageFragment weexPageFragment = this.d;
        weexPageFragment.setRenderListener(a(this.m, weexPageFragment, str2, str3));
        this.d.setDynamicUrlEnable(true);
    }

    public Fragment a(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i, String str3, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("d1ca718d", new Object[]{this, fragmentActivity, cls, str, str2, new Integer(i), str3, serializable});
        }
        String str4 = null;
        return a(fragmentActivity, cls, str4, str, str2, null, str4, i, str3, serializable);
    }

    public Fragment a(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, String str3, HashMap<String, Object> hashMap, String str4, int i, String str5, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("a69ec2e6", new Object[]{this, fragmentActivity, cls, str, str2, str3, hashMap, str4, new Integer(i), str5, serializable});
        }
        Fragment findFragmentByTag = this.k.findFragmentByTag(str5);
        if (findFragmentByTag != null) {
            return findFragmentByTag;
        }
        Bundle bundle = new Bundle();
        if (!StringUtils.isEmpty(str)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_TEMPLATE, str);
        }
        if (!StringUtils.isEmpty(str2)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_BUNDLE_URL, str2);
        }
        if (!StringUtils.isEmpty(str3)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_RENDER_URL, str3);
        }
        if (hashMap != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_CUSTOM_OPT, hashMap);
        }
        if (!StringUtils.isEmpty(str4)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_INIT_DATA, str4);
        }
        if (serializable != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_FROM_ACTIVITY, serializable);
        }
        Fragment instantiate = Fragment.instantiate(fragmentActivity, cls.getName(), bundle);
        FragmentTransaction beginTransaction = this.k.beginTransaction();
        beginTransaction.setCustomAnimations(R.anim.address_pop_enter_anim, R.anim.address_pop_exit_anim);
        if (StringUtils.isEmpty(str5)) {
            str5 = WeexPageFragment.FRAGMENT_TAG;
        }
        beginTransaction.add(i, instantiate, str5);
        beginTransaction.commitAllowingStateLoss();
        return instantiate;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return !StringUtils.isEmpty(str) ? Uri.parse(str).buildUpon().clearQuery().build().toString() : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public WeexPageFragment.a a(i iVar, WeexPageFragment weexPageFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexPageFragment.a) ipChange.ipc$dispatch("64dc2fc6", new Object[]{this, iVar, weexPageFragment, str, str2}) : new a(iVar, weexPageFragment, str, str2);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        WeexPageFragment weexPageFragment = this.d;
        if (weexPageFragment != null) {
            weexPageFragment.onActivityResult(i, i2, intent);
        }
        TMSEmbed tMSEmbed = this.e;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.a(i, i2, intent);
    }

    private void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa30527", new Object[]{this, intent});
        } else {
            Nav.from(this).withExtras(intent.getExtras()).withCategory(mbn.BROWSER_ONLY_CATEGORY).skipPreprocess().disableTransition().disallowLoopback().toUri(gvl.a(this, intent.getStringExtra(riu.e)));
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        boolean isDegrade = TBWXConfigManger.getInstance().isDegrade();
        boolean isHardwareSupport = WXEnvironment.isHardwareSupport();
        boolean isInitialized = WXSDKEngine.isInitialized();
        String str = c;
        WXLogUtils.d(str, "degrade:" + isDegrade + " support:" + isHardwareSupport + " init:" + isInitialized);
        return !isDegrade && isHardwareSupport && isInitialized;
    }

    /* loaded from: classes4.dex */
    public static class a extends WeexPageFragment.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public i f8965a;
        public WeexPageFragment b;
        public String c;
        public String d;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 578309873) {
                super.onException((WXSDKInstance) objArr[0], ((Boolean) objArr[1]).booleanValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(i iVar, WeexPageFragment weexPageFragment, String str, String str2) {
            this.f8965a = iVar;
            this.b = weexPageFragment;
            this.c = str;
            this.d = str2;
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a
        public View onCreateView(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("31af356d", new Object[]{this, wXSDKInstance, view});
            }
            View view2 = null;
            i iVar = this.f8965a;
            if (iVar != null) {
                view2 = iVar.a(wXSDKInstance, view);
            }
            return view2 == null ? view : view2;
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                return;
            }
            WXLogUtils.d(WeexPopContainer.c, "into--[onViewCreated]");
            wXSDKInstance.a((OnWXScrollListener) new n.a(this.c, wXSDKInstance.O()));
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            WXLogUtils.d(WeexPopContainer.c, "into--[onRenderSuccess]");
            i iVar = this.f8965a;
            if (iVar == null) {
                return;
            }
            iVar.a(wXSDKInstance);
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            super.onException(wXSDKInstance, z, str, str2);
            i iVar = this.f8965a;
            if (iVar != null) {
                iVar.a(wXSDKInstance, str, str2);
            }
            if (z) {
                WeexPageFragment weexPageFragment = this.b;
                if (weexPageFragment != null) {
                    weexPageFragment.destroyWeex();
                }
                Intent intent = new Intent("degradeToWindVane");
                intent.putExtra(riu.c, wXSDKInstance.ak());
                intent.putExtra("degrade_type", "DEGRADE_TYPE_JS_ERROR");
                intent.putExtra("degrade_msg", "降级到h5 Instance创建失败或者网络错误ErrorCode= " + str + "详细错误信息\n" + str2);
                LocalBroadcastManager.getInstance(wXSDKInstance.O()).sendBroadcast(intent);
                AppMonitor.Alarm.commitFail("weex", "renderResult", a(), "99301", str2);
            }
            if (!StringUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode())) {
                return;
            }
            try {
                TBErrorView tBErrorView = new TBErrorView(wXSDKInstance.O());
                Error newError = Error.Factory.newError("ANDROID_SYS_NETWORK_ERROR", "网络错误,请稍后再试");
                newError.url = wXSDKInstance.ak();
                tBErrorView.setError(newError);
                tBErrorView.setBackgroundColor(this.b.getResources().getColor(R.color.ali_address_color));
                tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: com.taobao.android.address.WeexPopContainer.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (a.this.b == null || StringUtils.isEmpty(a.this.b.getOriginalRenderUrl()) || StringUtils.isEmpty(a.this.b.getOriginalUrl())) {
                        } else {
                            a.this.b.replace(a.this.b.getOriginalUrl(), a.this.b.getOriginalRenderUrl());
                        }
                    }
                });
                tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
                if (this.b.getView() != null && (this.b.getView() instanceof ViewGroup)) {
                    ((ViewGroup) this.b.getView()).addView(tBErrorView);
                }
                if (this.b.getView() == null) {
                    return;
                }
                View findViewById = this.b.getView().findViewById(R.id.wa_content_error_root);
                if (findViewById != null) {
                    findViewById.setVisibility(4);
                } else if ((this.b.getView() instanceof FrameLayout) && ((FrameLayout) this.b.getView()).getChildCount() > 0) {
                    for (int i = 0; i < ((FrameLayout) this.b.getView()).getChildCount(); i++) {
                        if (((FrameLayout) this.b.getView()).getChildAt(i) instanceof RelativeLayout) {
                            ((FrameLayout) this.b.getView()).getChildAt(i).setVisibility(4);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                WXLogUtils.e("error in render network failure view of TBErrorView", th);
            }
        }

        private String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.c);
            hashMap.put("pageName", this.d);
            return JSON.toJSONString(hashMap);
        }
    }
}
