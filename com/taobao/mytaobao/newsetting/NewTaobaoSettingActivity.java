package com.taobao.mytaobao.newsetting;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.ali.user.mobile.model.TokenType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.android.task.Coordinator;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.global.setting.mtop.model.UserProfile;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.api.aidl.ICheckResultCallback;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity;
import com.taobao.mytaobao.newsetting.business.model.ComplianceSettingItem;
import com.taobao.mytaobao.newsetting.business.model.DynamicSettingItem;
import com.taobao.mytaobao.newsetting.business.response.DynamicSettingPageResponse;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.feature.features.SmoothRecyclerScrollFeature;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.view.TRecyclerView;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.mvn;
import tb.mxj;
import tb.mxu;
import tb.mxz;
import tb.qpl;

/* loaded from: classes7.dex */
public class NewTaobaoSettingActivity extends CustomBaseActivity implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_COMPLIANCE_SETTING_DATA = "{\"textColor\":\"#597CAA\",\"textSize\":\"3\",\"items\":[[{\"text\":\"《证照信息》\",\"navUrl\":\"https://haibao.m.taobao.com/html/n2FCkYzwa\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-license\",\"params\":{\"spm\":\"a2141.20998086.1.30\"}}},{\"text\":\"《淘宝规则》\",\"navUrl\":\"https://market.m.taobao.com/app/msd/mobile-rule/index.html?spm=a2159r.13376460.0.0\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-TBGZ\",\"params\":{\"spm\":\"a2141.20998086.1.31\"}}},{\"text\":\"《淘宝平台服务协议》\",\"navUrl\":\"http://terms.alicdn.com/legal-agreement/terms/TD/TD201609301342_19559.html?spm=a2145.7268393.0.0.4b1c0162lHc2R0\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-protocol\",\"params\":{\"spm\":\"a2141.20998086.1.32\"}}}],[{\"text\":\"《天猫规则》\",\"navUrl\":\"https://market.m.taobao.com/app/msd/mobile-rule/index.html?identity=tmall&spm=defwork.home.0.0.5b283f1bsdAifB#/home\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-TMGZ\",\"params\":{\"spm\":\"a2141.20998086.1.33\"}}},{\"text\":\"《个人信息共享清单》\",\"navUrl\":\"https://terms.alicdn.com/legal-agreement/terms/suit_bu1_taobao/suit_bu1_taobao202112231044_47733.html\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-GXQD\",\"params\":{\"spm\":\"a2141.20998086.1.34\"}}},{\"text\":\"《个人信息收集清单》\",\"navUrl\":\"https://market.m.taobao.com/app/msd/m-privacy-center/index.html#/pinfolist/home\",\"userTrack\":{\"arg1\":\"Page_MYTBSettingVC_Button-SJQD\",\"params\":{\"spm\":\"a2141.20998086.1.35\"}}}]]}";
    public static final String EXTRA_KEY_SHOW_LOGOUT = "showLogout";

    /* renamed from: a */
    public int f18407a;
    public List<TextView> b;
    private ViewGroup d;
    private TUrlImageView e;
    private TextView f;
    private TextView g;
    private View h;
    private String i;
    private TRecyclerView j;
    private com.taobao.mytaobao.newsetting.adapter.b k;
    private TextView m;
    private TextView n;
    private LinearLayout o;
    private com.taobao.mytaobao.newsetting.business.request.a p;
    private com.taobao.global.setting.c q;
    private BroadcastReceiver r;
    private boolean s;

    /* renamed from: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity$11 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass11 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18410a = new int[LoginAction.values().length];

        static {
            try {
                f18410a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        kge.a(-872008370);
        kge.a(-894912271);
    }

    public static /* synthetic */ Object ipc$super(NewTaobaoSettingActivity newTaobaoSettingActivity, String str, Object... objArr) {
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

    @Override // com.taobao.mytaobao.newsetting.e
    public List<ViewGroup> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        return null;
    }

    public NewTaobaoSettingActivity() {
        ApplicationInvoker.getInstance("com.taobao.mytaobao").invoke("com.taobao.tao.MytaobaoApplication", TaobaoApplication.sApplication);
        this.i = "userInfo";
        this.s = false;
        this.f18407a = 1;
    }

    public static /* synthetic */ TextView a(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("1071ecbf", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.m;
    }

    public static /* synthetic */ List a(NewTaobaoSettingActivity newTaobaoSettingActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("60202ca2", new Object[]{newTaobaoSettingActivity, jSONObject}) : newTaobaoSettingActivity.a(jSONObject);
    }

    public static /* synthetic */ void a(NewTaobaoSettingActivity newTaobaoSettingActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20656718", new Object[]{newTaobaoSettingActivity, new Integer(i)});
        } else {
            newTaobaoSettingActivity.b(i);
        }
    }

    public static /* synthetic */ void a(NewTaobaoSettingActivity newTaobaoSettingActivity, ComplianceSettingItem complianceSettingItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1fb3c6", new Object[]{newTaobaoSettingActivity, complianceSettingItem});
        } else {
            newTaobaoSettingActivity.b(complianceSettingItem);
        }
    }

    public static /* synthetic */ void a(NewTaobaoSettingActivity newTaobaoSettingActivity, DynamicSettingPageResponse dynamicSettingPageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("735a0e39", new Object[]{newTaobaoSettingActivity, dynamicSettingPageResponse});
        } else {
            newTaobaoSettingActivity.a(dynamicSettingPageResponse);
        }
    }

    public static /* synthetic */ void a(NewTaobaoSettingActivity newTaobaoSettingActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7a4c3c", new Object[]{newTaobaoSettingActivity, list});
        } else {
            newTaobaoSettingActivity.b(list);
        }
    }

    public static /* synthetic */ void a(NewTaobaoSettingActivity newTaobaoSettingActivity, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e811e50", new Object[]{newTaobaoSettingActivity, mtopResponse});
        } else {
            newTaobaoSettingActivity.a(mtopResponse);
        }
    }

    public static /* synthetic */ boolean a(NewTaobaoSettingActivity newTaobaoSettingActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2065a6ed", new Object[]{newTaobaoSettingActivity, new Boolean(z)})).booleanValue();
        }
        newTaobaoSettingActivity.s = z;
        return z;
    }

    public static /* synthetic */ View b(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e60b16ac", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.h;
    }

    public static /* synthetic */ ViewGroup c(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("abd57b6c", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.d;
    }

    public static /* synthetic */ boolean d(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d68d042c", new Object[]{newTaobaoSettingActivity})).booleanValue() : newTaobaoSettingActivity.s;
    }

    public static /* synthetic */ String e(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3c9a7b9", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.i;
    }

    public static /* synthetic */ void f(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff09e366", new Object[]{newTaobaoSettingActivity});
        } else {
            newTaobaoSettingActivity.r();
        }
    }

    public static /* synthetic */ TextView g(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b2397c79", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.n;
    }

    public static /* synthetic */ com.taobao.global.setting.c h(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.global.setting.c) ipChange.ipc$dispatch("2c6a380a", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.q;
    }

    public static /* synthetic */ TUrlImageView i(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("c392b8d9", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.e;
    }

    public static /* synthetic */ TextView j(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("831d4456", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.f;
    }

    public static /* synthetic */ TextView k(NewTaobaoSettingActivity newTaobaoSettingActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c8be86f5", new Object[]{newTaobaoSettingActivity}) : newTaobaoSettingActivity.g;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.new_mytaobao_setting_page);
        com.taobao.android.autosize.f.a((Activity) this);
        h();
        g();
        i();
        f();
        j();
        e();
        d();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(mvn.ACTION_USER_AVATAR_CHANGED);
        this.r = new CustomBCR();
        registerReceiver(this.r, intentFilter);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.q = com.taobao.global.setting.c.a(getApplicationContext(), "mytaobao");
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        Uri data = getIntent().getData();
        String queryParameter = data != null ? data.getQueryParameter("spm") : "";
        hashMap.put("spm-cnt", "a2141.20998086.1.1");
        hashMap.put("spm-url", queryParameter);
        com.taobao.mytaobao.ut.c.a(this, "Page_MYTBSettingVC");
        com.taobao.mytaobao.ut.c.a(this, hashMap);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.b(R.string.mytaobao_setting_title);
            supportActionBar.c(true);
        }
        getPublicMenu().setOnOverflowButtonClickListener(new TBPublicMenu.TBOnOverflowButtonClickListener() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                NewTaobaoSettingActivity.this = this;
            }

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
            public void onOverflowButtonClicked() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ddc419b", new Object[]{this});
                } else {
                    TBS.Ext.commitEvent("Page_MYTBSettingVC", Integer.parseInt("2101"), "Page_MYTBSettingVC_功能直达", null, null, "spm=a2141.20998086.1.13");
                }
            }
        });
        try {
            this.systemBarDecorator = new SystemBarDecorator(this);
            this.systemBarDecorator.enableImmersiveStatusBar(true);
        } catch (Throwable th) {
            Log.e("TBMainActivity", "enableImmersiveStatusBar failed:", th);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        TBS.Ext.commitEvent("Page_MYTBSettingVC", Integer.parseInt("2101"), "Page_MYTBSettingVC_返回", null, null, "spm=a2141.20998086.1.14");
        finish();
        return true;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.new_mytaobao_setting_page_header, (ViewGroup) null);
        this.d = (ViewGroup) inflate.findViewById(R.id.layout_setting_page_user_block);
        this.e = (TUrlImageView) inflate.findViewById(R.id.iv_setting_page_user_icon);
        this.f = (TextView) inflate.findViewById(R.id.tv_setting_page_user_sns_nick);
        this.g = (TextView) inflate.findViewById(R.id.tv_setting_page_user_nick);
        this.h = inflate.findViewById(R.id.btn_red_dot);
        View inflate2 = LayoutInflater.from(this).inflate(R.layout.new_mytaobao_setting_page_footer, (ViewGroup) null);
        this.m = (TextView) inflate2.findViewById(R.id.tv_multi_account);
        this.n = (TextView) inflate2.findViewById(R.id.tv_user_logout);
        this.o = (LinearLayout) inflate2.findViewById(R.id.ll_compliance_container);
        this.j = (TRecyclerView) findViewById(R.id.recycle_setting_page_main_items);
        this.j.addHeaderView(inflate);
        this.j.addFooterView(inflate2);
        this.j.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.j.addFeature(new SmoothRecyclerScrollFeature());
        this.n.setVisibility(0);
        this.m.setVisibility(0);
        Login.checkMultiAccountPageEnable(new ICheckResultCallback.Stub() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.2
            {
                NewTaobaoSettingActivity.this = this;
            }

            @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
            public void onSucess(boolean z) throws RemoteException {
                if (z) {
                    NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, 0);
                } else {
                    NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, 8);
                }
            }

            @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
            public void onFail(String str, String str2) throws RemoteException {
                NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, 8);
            }
        });
        Login.checkLogoutPanelEnable(new ICheckResultCallback.Stub() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.3
            {
                NewTaobaoSettingActivity.this = this;
            }

            @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
            public void onSucess(boolean z) throws RemoteException {
                NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, z);
            }

            @Override // com.taobao.login4android.api.aidl.ICheckResultCallback
            public void onFail(String str, String str2) throws RemoteException {
                NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, false);
            }
        });
        p();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = new ArrayList();
        this.b.add(this.f);
        this.b.add(this.g);
        this.b.add(this.m);
        this.b.add(this.n);
    }

    private void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            runOnUiThread(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    NewTaobaoSettingActivity.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this).setVisibility(i);
                    }
                }
            });
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.k = new com.taobao.mytaobao.newsetting.adapter.b(this);
        this.k.a(true);
        this.j.setAdapter(this.k);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                NewTaobaoSettingActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBS.Ext.commitEvent("Page_MYTBSettingVC", Integer.parseInt("2101"), "Page_MYTBSettingVC_个人信息", null, null, "spm=a2141.20998086.1.2");
                String config = OrangeConfig.getInstance().getConfig(mxj.GROUP_NAME, "weexProfileEditorUrlV2", "https://web.m.taobao.com/app/message-social-front/user-info-edit/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_statusbar_hidden=true");
                Nav from = Nav.from(NewTaobaoSettingActivity.this);
                if (StringUtils.isEmpty(config)) {
                    config = "https://web.m.taobao.com/app/message-social-front/user-info-edit/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_statusbar_hidden=true";
                }
                from.toUri(config);
                if (NewTaobaoSettingActivity.b(NewTaobaoSettingActivity.this).getVisibility() != 0) {
                    return;
                }
                com.taobao.mytaobao.newsetting.business.request.b.a(NewTaobaoSettingActivity.c(NewTaobaoSettingActivity.this).getContext(), NewTaobaoSettingActivity.e(NewTaobaoSettingActivity.this));
            }
        });
        this.m.setOnClickListener(new b());
        this.n.setOnClickListener(new b());
    }

    @Override // com.taobao.mytaobao.newsetting.e
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f18407a;
    }

    @Override // com.taobao.mytaobao.newsetting.e
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f18407a = i;
        }
    }

    @Override // com.taobao.mytaobao.newsetting.e
    public List<TextView> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
    }

    /* loaded from: classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(428687484);
            kge.a(-1201612728);
        }

        private b() {
            NewTaobaoSettingActivity.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBS.Page.buttonClicked("ExitAccount");
            TLog.logd(TokenType.LOGIN, "SettingsActivity logout");
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), new BroadcastReceiver() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity$LogoutClickListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null || StringUtils.isEmpty(intent.getAction()) || NewTaobaoSettingActivity.AnonymousClass11.f18410a[LoginAction.valueOf(intent.getAction()).ordinal()] != 1) {
                    } else {
                        NewTaobaoSettingActivity.f(NewTaobaoSettingActivity.this);
                        NewTaobaoSettingActivity.this.finish();
                        LoginBroadcastHelper.unregisterLoginReceiver(NewTaobaoSettingActivity.this.getApplicationContext(), this);
                    }
                }
            });
            if (view.getId() == NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this).getId()) {
                TBS.Ext.commitEvent("Page_MYTBSettingVC", Integer.parseInt("2101"), "Page_MYTBSettingVC_切换账户", null, null, "spm=a2141.20998086.1.12");
                Login.openMultiAccountPage();
            } else if (view.getId() != NewTaobaoSettingActivity.g(NewTaobaoSettingActivity.this).getId()) {
            } else {
                TBS.Ext.commitEvent("Page_MYTBSettingVC", Integer.parseInt("2101"), "Page_MYTBSettingVC_退出登录", null, null, "spm=a2141.20998086.1.11");
                if (NewTaobaoSettingActivity.d(NewTaobaoSettingActivity.this)) {
                    Login.showLogoutPanel();
                } else {
                    Login.logout(true);
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public class CustomBCR extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private CustomBCR() {
            NewTaobaoSettingActivity.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !mvn.ACTION_USER_AVATAR_CHANGED.equals(intent.getAction())) {
            } else {
                NewTaobaoSettingActivity.h(NewTaobaoSettingActivity.this).d();
            }
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_MYTBSettingVC");
        k();
        l();
        d.a().a(this, this);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.q.a().a("mytaobao", new com.taobao.global.setting.data.c() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    NewTaobaoSettingActivity.this = this;
                }

                @Override // com.taobao.global.setting.data.c
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                    } else if (obj == null) {
                    } else {
                        UserProfile userProfile = (UserProfile) obj;
                        if (NewTaobaoSettingActivity.i(NewTaobaoSettingActivity.this) != null) {
                            NewTaobaoSettingActivity.i(NewTaobaoSettingActivity.this).setImageUrl(userProfile.userLogo);
                        }
                        if (NewTaobaoSettingActivity.j(NewTaobaoSettingActivity.this) != null) {
                            String str = userProfile.jianghuNick;
                            if (StringUtils.isEmpty(str)) {
                                str = "点击设置淘宝昵称";
                            }
                            NewTaobaoSettingActivity.j(NewTaobaoSettingActivity.this).setText(str);
                        }
                        if (NewTaobaoSettingActivity.k(NewTaobaoSettingActivity.this) == null) {
                            return;
                        }
                        TextView k = NewTaobaoSettingActivity.k(NewTaobaoSettingActivity.this);
                        k.setText("账号名:" + userProfile.userNick);
                    }
                }

                @Override // com.taobao.global.setting.data.c
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else {
                        Toast.makeText(NewTaobaoSettingActivity.this, str, 0).show();
                    }
                }
            });
        }
    }

    private void a(List<DynamicSettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.k.a(list);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        m();
        o();
    }

    private DynamicSettingPageResponse s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicSettingPageResponse) ipChange.ipc$dispatch("8924bbce", new Object[]{this});
        }
        if (mxz.b) {
            return null;
        }
        String a2 = com.taobao.mytaobao.newSettingV2.a.INSTANCE.a("mtbSettingsPageSnsp");
        if (!StringUtils.isEmpty(a2)) {
            try {
                DynamicSettingPageResponse dynamicSettingPageResponse = (DynamicSettingPageResponse) JSONObject.parseObject(a2, DynamicSettingPageResponse.class);
                if (dynamicSettingPageResponse.data != null) {
                    return dynamicSettingPageResponse;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.k.getItemCount() > 0) {
        } else {
            DynamicSettingPageResponse s = s();
            if (s != null) {
                a(s);
            } else {
                a(q());
            }
        }
    }

    private void a(DynamicSettingPageResponse dynamicSettingPageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ef63c", new Object[]{this, dynamicSettingPageResponse});
            return;
        }
        List<DynamicSettingItem> d = d(dynamicSettingPageResponse.mo2429getData().getResult());
        if (d == null || d.size() <= 0) {
            return;
        }
        a(d);
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        if (this.p == null) {
            this.p = new com.taobao.mytaobao.newsetting.business.request.c();
        }
        this.p.a(mvn.KEY_SETTING_INDEX_PAGE, new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                NewTaobaoSettingActivity.this = this;
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (baseOutDo != null && baseOutDo.mo2429getData() != null) {
                    NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, (DynamicSettingPageResponse) baseOutDo);
                    NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, mtopResponse);
                }
                qpl.c("MyTaoBao_Settings", "LoadMyTaoBao_Settings", null);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else if (mtopResponse == null) {
                } else {
                    qpl.a("MyTaoBao_Settings", "LoadMyTaoBao_Settings", null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                }
            }
        });
    }

    private void a(final MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else if (mxz.b) {
        } else {
            com.taobao.mytaobao.base.b.b(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    NewTaobaoSettingActivity.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.mytaobao.newSettingV2.a.INSTANCE.a("mtbSettingsPageSnsp", new String(mtopResponse.getBytedata()));
                    }
                }
            });
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    NewTaobaoSettingActivity.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = null;
                    try {
                        jSONObject = JSONObject.parseObject(mxz.j);
                    } catch (Exception unused) {
                    }
                    final List a2 = NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, jSONObject);
                    NewTaobaoSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.10.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass10.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, a2);
                            }
                        }
                    });
                }
            });
        }
    }

    private void b(List<List<ComplianceSettingItem>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null) {
            for (List<ComplianceSettingItem> list2 : list) {
                this.o.addView(c(list2));
            }
        }
    }

    private View c(List<ComplianceSettingItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f4296bdd", new Object[]{this, list});
        }
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = DensityUtil.dip2px(this, 5.0f);
        linearLayout.setLayoutParams(layoutParams);
        for (ComplianceSettingItem complianceSettingItem : list) {
            linearLayout.addView(a(complianceSettingItem));
        }
        return linearLayout;
    }

    private View a(final ComplianceSettingItem complianceSettingItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9ad026cb", new Object[]{this, complianceSettingItem});
        }
        TextView textView = new TextView(this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        complianceSettingItem.processDefaultValue();
        textView.setText(complianceSettingItem.text);
        textView.setTextSize(2, complianceSettingItem.parseTextSize() + 10);
        textView.setTextColor(complianceSettingItem.parseTextColor());
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                NewTaobaoSettingActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Nav.from(NewTaobaoSettingActivity.this).toUri(complianceSettingItem.navUrl);
                NewTaobaoSettingActivity.a(NewTaobaoSettingActivity.this, complianceSettingItem);
            }
        });
        return textView;
    }

    private void b(ComplianceSettingItem complianceSettingItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b347e8", new Object[]{this, complianceSettingItem});
            return;
        }
        JSONObject jSONObject = complianceSettingItem.userTrack;
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.getString("arg1");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        com.taobao.mytaobao.ut.c.b("Page_MyTaobao", string, com.taobao.mytaobao.ut.c.a(jSONObject.getJSONObject("params")));
    }

    private List<List<ComplianceSettingItem>> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("textSize");
        String string2 = jSONObject.getString("textColor");
        List<JSONArray> b2 = b(jSONObject);
        ArrayList arrayList = new ArrayList();
        for (JSONArray jSONArray : b2) {
            List<ComplianceSettingItem> a2 = a(jSONArray, string, string2);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        return null;
    }

    private List<ComplianceSettingItem> a(JSONArray jSONArray, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6f0f6323", new Object[]{this, jSONArray, str, str2});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                jSONObject.put("textSize", (Object) str);
                jSONObject.put("textColor", (Object) str2);
                ComplianceSettingItem complianceSettingItem = (ComplianceSettingItem) JSONObject.parseObject(jSONObject.toJSONString(), ComplianceSettingItem.class);
                if (complianceSettingItem != null) {
                    arrayList.add(complianceSettingItem);
                }
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        return null;
    }

    private List<JSONArray> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONArray) {
                arrayList.add((JSONArray) next);
            }
        }
        return arrayList;
    }

    private List<DynamicSettingItem> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc936ecf", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        DynamicSettingItem dynamicSettingItem = new DynamicSettingItem(getResources().getString(R.string.setting_homepage_item_delivery_address), "http://my.m.taobao.com/deliver/wap_deliver_address_list.htm", "0", "1");
        DynamicSettingItem dynamicSettingItem2 = new DynamicSettingItem(getResources().getString(R.string.setting_homepage_item_account_security), "https://m.taobao.com/go/accountsecuritysettings", "1", "0");
        DynamicSettingItem dynamicSettingItem3 = new DynamicSettingItem(getResources().getString(R.string.setting_homepage_item_pay), "https://m.taobao.com/go/mytaobao/newpaysettings", "1", "1");
        DynamicSettingItem dynamicSettingItem4 = new DynamicSettingItem(getResources().getString(R.string.setting_homepage_item_new_message_notify), "https://market.m.taobao.com/app/mpds/Container/pages/msg_im_mytaobao_settings?wh_weex=true", "2", "0");
        DynamicSettingItem dynamicSettingItem5 = new DynamicSettingItem(getResources().getString(R.string.setting_homepage_item_privacy), "https://market.m.taobao.com/app/msd/m-privacy-center/index.html?spm=a2141.20998086.1.7", "2", "1");
        DynamicSettingItem dynamicSettingItem6 = new DynamicSettingItem(getResources().getString(R.string.setting_homepage_item_general), "http://m.taobao.com/go/newmytaobaocommonsettings2", "2", "2");
        DynamicSettingItem dynamicSettingItem7 = new DynamicSettingItem(getResources().getString(R.string.setting_homepage_item_help_and_feedback), "https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html#/?x=2&spm=a2141.20998086.1.9", "3", "0");
        DynamicSettingItem dynamicSettingItem8 = new DynamicSettingItem(getResources().getString(R.string.setting_homepage_item_about), "http://m.taobao.com/go/newmytaobaohelpsettings", "3", "1");
        arrayList.add(dynamicSettingItem);
        arrayList.add(dynamicSettingItem2);
        arrayList.add(dynamicSettingItem3);
        arrayList.add(dynamicSettingItem4);
        arrayList.add(dynamicSettingItem5);
        arrayList.add(dynamicSettingItem6);
        arrayList.add(dynamicSettingItem7);
        arrayList.add(dynamicSettingItem8);
        return arrayList;
    }

    private List<DynamicSettingItem> d(List<List<DynamicSettingItem>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("13dd54eb", new Object[]{this, list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Collections.sort(list, new a());
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<DynamicSettingItem> list2 = list.get(i);
                Collections.sort(list2);
                arrayList.addAll(list2);
            }
        }
        DynamicSettingItem dynamicSettingItem = (DynamicSettingItem) arrayList.get(arrayList.size() - 1);
        if (StringUtils.equals(dynamicSettingItem.moduleNumber, "-1")) {
            if (!StringUtils.isEmpty(dynamicSettingItem.key)) {
                this.i = dynamicSettingItem.key;
            }
            if (dynamicSettingItem.showRedDot) {
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
            }
            arrayList.remove(dynamicSettingItem);
        } else {
            this.h.setVisibility(8);
        }
        return arrayList;
    }

    /* loaded from: classes7.dex */
    public static class a implements Comparator<List<DynamicSettingItem>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1470746766);
            kge.a(-2099169482);
        }

        private a() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(List<DynamicSettingItem> list, List<DynamicSettingItem> list2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, list, list2})).intValue() : a(list, list2);
        }

        public int a(List<DynamicSettingItem> list, List<DynamicSettingItem> list2) {
            DynamicSettingItem dynamicSettingItem;
            DynamicSettingItem dynamicSettingItem2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("78fe43d", new Object[]{this, list, list2})).intValue();
            }
            String str = "";
            String str2 = (list == null || list.size() <= 0 || (dynamicSettingItem2 = list.get(0)) == null) ? str : dynamicSettingItem2.moduleNumber;
            if (list2 != null && list2.size() > 0 && (dynamicSettingItem = list2.get(0)) != null) {
                str = dynamicSettingItem.moduleNumber;
            }
            int a2 = a(str2);
            int a3 = a(str);
            if (a2 > a3) {
                return 1;
            }
            return a2 < a3 ? -1 : 0;
        }

        private int a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
            }
            if (!StringUtils.isEmpty(str) && StringUtils.isDigitsOnly(str)) {
                return Integer.valueOf(str).intValue();
            }
            return 99;
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        unregisterReceiver(this.r);
        com.taobao.global.setting.c cVar = this.q;
        if (cVar != null) {
            cVar.e();
        }
        com.taobao.mytaobao.newsetting.adapter.b bVar = this.k;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.ultron.b.a().i();
        mxu.a(Globals.getApplication());
        com.taobao.global.setting.c cVar = this.q;
        if (cVar != null) {
            cVar.d();
        }
        try {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
            edit.putBoolean("settings_LOGOUT", true);
            edit.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
