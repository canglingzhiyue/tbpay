package com.taobao.android.cash.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.k;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.ali.user.open.ucc.data.ApiConstants;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.MainFragment;
import com.taobao.android.cash.activity.c;
import com.taobao.android.nav.Nav;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXLogUtils;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.HashMap;
import tb.dvu;
import tb.dwb;
import tb.kge;
import tb.mbn;
import tb.riu;

/* loaded from: classes4.dex */
public class CustomHalfWXActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f9301a;
    public static String i;
    public static String k;
    public WeexPageFragment b;
    public BroadcastReceiver c;
    public Activity d;
    public int e = 880;
    public String f = dvu.b;
    public boolean g = true;
    public int h = 0;
    public FragmentManager j;
    private b l;
    private String m;

    public static /* synthetic */ Object ipc$super(CustomHalfWXActivity customHalfWXActivity, String str, Object... objArr) {
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
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
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

    static {
        kge.a(-780721493);
        f9301a = "cashdesk.CustomHalfWXActivity";
        k = "weex_sub_page";
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.g = false;
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", "a2141.b12194043.0.0");
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.g = true;
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.b12194043.0.0");
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_OverseaOldCashier");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(this, "Page_OverseaOldCashier");
    }

    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() != R.id.cash_transparent_click) {
        } else {
            com.taobao.android.cash.c.a(this, new Intent("com.ali.user.cash.close.all"));
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiConstants.ApiField.USER_ACTION, (Object) "1");
        i = JSONObject.toJSONString(jSONObject);
        this.d = this;
        this.j = getSupportFragmentManager();
        this.c = new BroadcastReceiver() { // from class: com.taobao.android.cash.activity.CustomHalfWXActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    CustomHalfWXActivity.this.a(intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ali.user.cash.close.all");
        intentFilter.addAction("com.ali.user.cash.close.all.weex");
        intentFilter.addAction("com.ali.user.cash.close.weex");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.c, intentFilter);
        if (!c()) {
            if (WXEnvironment.isApkDebugable()) {
                Toast.makeText(this, "WEEX_SDK 初始化失败!", 0).show();
            }
            d(getIntent());
            finish();
            return;
        }
        setContentView(R.layout.ali_weex_half_container);
        this.l = new b(this);
        this.l.a();
        if (getSupportActionBar() != null) {
            getSupportActionBar().e();
        }
        c(getIntent());
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        String str = f9301a;
        TLog.logd(str, "onReceived: action = " + intent.getAction() + "activity:" + this.d);
        if ("com.ali.user.cash.close.all".equals(intent.getAction()) || "com.ali.user.cash.close.all.weex".equals(intent.getAction())) {
            this.d.setResult(0);
            finish();
            if (this.g) {
                overridePendingTransition(R.anim.push_up_in, R.anim.push_down_out);
            } else {
                overridePendingTransition(0, 0);
            }
        } else if (!"com.ali.user.cash.close.weex".equals(intent.getAction())) {
        } else {
            this.d.setResult(0);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    private void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa30527", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            String stringExtra = intent.getStringExtra(riu.e);
            this.e = intent.getIntExtra("height", 880);
            this.f = intent.getStringExtra("type");
            this.m = stringExtra;
            this.h = intent.getIntExtra("fullPage", 0);
            String stringExtra2 = intent.getStringExtra(riu.c);
            k a2 = android.taobao.windvane.webview.j.a();
            if (a2 != null) {
                stringExtra2 = a2.dealUrlScheme(stringExtra2);
            }
            String str = stringExtra2;
            String b = b(str);
            Serializable serializable = null;
            if (getIntent() != null) {
                serializable = getIntent().getSerializableExtra("wx_options");
            }
            b();
            a(stringExtra, str, b, WeexPageFragment.FRAGMENT_TAG, serializable, MainFragment.class);
        }
    }

    private void b() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.weex_multiple_container);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (this.h != 0 || (i2 = (this.e * i3) / 750) <= 0 || i2 >= i4) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.addRule(12);
        frameLayout.setLayoutParams(layoutParams);
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            float f = (i3 * 24.0f) / 750.0f;
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(-1);
            frameLayout.setBackground(gradientDrawable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(WeexPageFragment.FRAGMENT_TAG);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Fragment findFragmentByTag = this.j.findFragmentByTag(str);
        if (findFragmentByTag == null) {
            return;
        }
        this.j.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
    }

    private void a(String str, String str2, String str3, String str4, Serializable serializable, Class<? extends WeexPageFragment> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1bd319", new Object[]{this, str, str2, str3, str4, serializable, cls});
            return;
        }
        Fragment findFragmentByTag = this.j.findFragmentByTag(str4);
        if (findFragmentByTag != null) {
            this.j.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        this.b = (WeexPageFragment) a(this, cls, str, str2, R.id.weex_multiple_container, str4, serializable);
        WeexPageFragment weexPageFragment = this.b;
        weexPageFragment.setRenderListener(a(this.l, weexPageFragment, str2, str3));
        this.b.setDynamicUrlEnable(true);
    }

    public Fragment a(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, int i2, String str3, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("d1ca718d", new Object[]{this, fragmentActivity, cls, str, str2, new Integer(i2), str3, serializable});
        }
        String str4 = null;
        return a(fragmentActivity, cls, str4, str, str2, null, str4, i2, str3, serializable);
    }

    public Fragment a(FragmentActivity fragmentActivity, Class<? extends WeexPageFragment> cls, String str, String str2, String str3, HashMap<String, Object> hashMap, String str4, int i2, String str5, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("a69ec2e6", new Object[]{this, fragmentActivity, cls, str, str2, str3, hashMap, str4, new Integer(i2), str5, serializable});
        }
        Fragment findFragmentByTag = this.j.findFragmentByTag(str5);
        if (findFragmentByTag != null) {
            return findFragmentByTag;
        }
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_TEMPLATE, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_BUNDLE_URL, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_RENDER_URL, str3);
        }
        if (hashMap != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_CUSTOM_OPT, hashMap);
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString(WeexPageFragment.FRAGMENT_ARG_INIT_DATA, str4);
        }
        if (serializable != null) {
            bundle.putSerializable(WeexPageFragment.FRAGMENT_ARG_FROM_ACTIVITY, serializable);
        }
        Fragment instantiate = Fragment.instantiate(fragmentActivity, cls.getName(), bundle);
        FragmentTransaction beginTransaction = this.j.beginTransaction();
        if (TextUtils.isEmpty(str5)) {
            str5 = WeexPageFragment.FRAGMENT_TAG;
        }
        beginTransaction.add(i2, instantiate, str5);
        beginTransaction.commitAllowingStateLoss();
        return instantiate;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        try {
            return !TextUtils.isEmpty(str) ? Uri.parse(str).buildUpon().clearQuery().build().toString() : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public WeexPageFragment.a a(b bVar, WeexPageFragment weexPageFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexPageFragment.a) ipChange.ipc$dispatch("2fa90805", new Object[]{this, bVar, weexPageFragment, str, str2}) : new a(bVar, weexPageFragment, str, str2);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        super.onActivityResult(i2, i3, intent);
        WeexPageFragment weexPageFragment = this.b;
        if (weexPageFragment == null) {
            return;
        }
        weexPageFragment.onActivityResult(i2, i3, intent);
    }

    private void d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f2e9a8", new Object[]{this, intent});
            return;
        }
        String stringExtra = intent.getStringExtra(riu.e);
        Nav.from(this).withExtras(intent.getExtras()).withCategory(mbn.BROWSER_ONLY_CATEGORY).skipPreprocess().disableTransition().disallowLoopback().toUri(stringExtra);
        dwb.a("Page_OverseaOldCashier", 2101, "Page_OverseaOldCashier_oversea_pay_error", "weex_error_url=" + stringExtra);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        boolean isDegrade = TBWXConfigManger.getInstance().isDegrade();
        boolean isHardwareSupport = WXEnvironment.isHardwareSupport();
        boolean isInitialized = WXSDKEngine.isInitialized();
        String str = f9301a;
        WXLogUtils.d(str, "degrade:" + isDegrade + " support:" + isHardwareSupport + " init:" + isInitialized);
        return !isDegrade && isHardwareSupport && isInitialized;
    }

    /* loaded from: classes4.dex */
    public static class a extends WeexPageFragment.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b f9303a;
        public WeexPageFragment b;
        public String c;
        public String d;

        static {
            kge.a(441701032);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 578309873) {
                super.onException((WXSDKInstance) objArr[0], ((Boolean) objArr[1]).booleanValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(b bVar, WeexPageFragment weexPageFragment, String str, String str2) {
            this.f9303a = bVar;
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
            b bVar = this.f9303a;
            if (bVar != null) {
                view2 = bVar.a(wXSDKInstance, view);
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
            WXLogUtils.d(CustomHalfWXActivity.f9301a, "into--[onViewCreated]");
            wXSDKInstance.a(new c.a(this.c, wXSDKInstance.O()));
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a, com.taobao.weex.d
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                return;
            }
            WXLogUtils.d(CustomHalfWXActivity.f9301a, "into--[onRenderSuccess]");
            b bVar = this.f9303a;
            if (bVar == null) {
                return;
            }
            bVar.a(wXSDKInstance);
        }

        @Override // com.alibaba.aliweex.bundle.WeexPageFragment.a
        public void onException(WXSDKInstance wXSDKInstance, boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22784ef1", new Object[]{this, wXSDKInstance, new Boolean(z), str, str2});
                return;
            }
            super.onException(wXSDKInstance, z, str, str2);
            b bVar = this.f9303a;
            if (bVar != null) {
                bVar.a(wXSDKInstance, str, str2);
            }
            if (z) {
                Context O = wXSDKInstance.O();
                String ak = wXSDKInstance.ak();
                Intent intent = new Intent(O, CustomBrowserActivity.class);
                intent.putExtra("url", ak);
                intent.putExtra("hasNavBar", ak.contains("hasNavBar=1") ? 1 : 0);
                O.startActivity(intent);
                WeexPageFragment weexPageFragment = this.b;
                if (weexPageFragment != null) {
                    weexPageFragment.destroyWeex();
                }
                AppMonitor.Alarm.commitFail("weex", "renderResult", a(), "99301", str2);
                LocalBroadcastManager.getInstance(wXSDKInstance.O()).sendBroadcast(new Intent("com.ali.user.cash.close.weex"));
            }
            if (!TextUtils.equals(str, WXErrorCode.WX_DEGRAD_ERR_NETWORK_BUNDLE_DOWNLOAD_FAILED.getErrorCode())) {
                return;
            }
            try {
                TBErrorView tBErrorView = new TBErrorView(wXSDKInstance.O());
                Error newError = Error.Factory.newError("ANDROID_SYS_NETWORK_ERROR", "网络错误,请稍后再试");
                newError.url = wXSDKInstance.ak();
                tBErrorView.setError(newError);
                tBErrorView.setBackgroundColor(-1);
                tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: com.taobao.android.cash.activity.CustomHalfWXActivity.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (a.this.b == null || TextUtils.isEmpty(a.this.b.getOriginalRenderUrl()) || TextUtils.isEmpty(a.this.b.getOriginalUrl())) {
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

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        d();
        if (this.c == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.c);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            WVStandardEventCenter.postNotificationToJS("ALBBCashierCloseNotification", i);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        b(new Intent("com.ali.user.cash.close.all"));
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
        TLog.logd("", intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }
}
