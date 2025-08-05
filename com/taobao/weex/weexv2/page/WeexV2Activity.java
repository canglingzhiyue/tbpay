package com.taobao.weex.weexv2.page;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.Pair;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.app.ActionBar;
import android.taobao.windvane.webview.k;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.f;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.hyt;
import tb.ifg;
import tb.jvr;
import tb.jvw;

/* loaded from: classes9.dex */
public class WeexV2Activity extends CustomBaseActivity implements WeexFragment.a, g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BROWSER_ONLY_CATEGORY = "com.taobao.intent.category.HYBRID_UI";
    private static final String DEGRADE_MSG = "degrade_msg";
    private static final String DEGRADE_TYPE = "degrade_type";
    private static final String DEGRADE_TYPE_INIT_ERROR = "DEGRADE_TYPE_INIT_ERROR";
    private static final String DEGRADE_TYPE_JS_ERROR = "DEGRADE_TYPE_JS_ERROR";
    private static final String DEGRADE_TYPE_PARAMS_ERROR = "DEGRADE_TYPE_PARAMS_ERROR";
    public static final String EXTRA_BUNDLE_URL = "secondFloorBundleUrl";
    private static final String FROM = "_wx_f_";
    private static final String FROM_WEEX = "1";
    private static final String FROM_WEEX_DEGRADE_H5 = "2";
    private static final String HIDDEN_STATUS_BAR_WITH_DARK_TEXT = "hidden_dark_text";
    private static final String HIDDEN_STATUS_BAR_WITH_LIGHT_TEXT = "hidden_light_text";
    private static final String KEY_BROADCAST_DATA_WHITE = "com.taobao.android.abnormal.action.weex.white";
    private static final String KEY_BUNDLE_URL = "bundleUrl";
    private static final String KEY_MUS_TPL = "_mus_tpl";
    private static final String KEY_REPORT_TLOG_SAME_PIXEL_COUNT = "key_report_tlog_same_pixel_count";
    private static final String NAV_HIDDEN = "wx_navbar_hidden";
    private static final String NAV_OVERLAY = "wx_navbar_transparent";
    private static final String ORIENTATION = "orientation";
    private static final String ORIENTATION_VALUE_LANDSCAPE = "landscape";
    private static final String TAG = "WXActivity";
    private static final String WEEX_ORIGINAL_URL = "weex_original_url";
    public static final String WH_QUERY_FALSE = "wh_weex=false";
    public static final String WH_QUERY_TRUE = "wh_weex=true";
    private static final String WX_APPBAR = "_wx_appbar";
    private static final String WX_KEY_INIT_DATA = "initData";
    private static final String WX_SECURE = "wx_secure";
    private static final String WX_STATUSBAR_HIDDEN = "_wx_statusbar_hidden";
    private static final String WX_STATUSBAR_HIDDEN2 = "wx_statusbar_hidden";
    private static final String WX_VIEW_TRANSPARENT = "wx_root_transparent";
    private static volatile Boolean y;
    private com.taobao.android.weex_ability.page.b D;

    /* renamed from: a  reason: collision with root package name */
    public TBActionView f23545a;
    private JSONObject b;
    private String c;
    private String f;
    private String g;
    private WeexFragment h;
    private String j;
    private String k;
    private String l;
    private String mWeexUserInfo;
    private ImageView z;
    private long d = -1;
    private long e = -1;
    private boolean i = false;
    private boolean m = false;
    private boolean q = false;
    private boolean r = false;

    /* renamed from: com.taobao.weex.weexv2.page.WeexV2Activity$4  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23548a = new int[StatusBarTextColor.values().length];

        static {
            try {
                f23548a[StatusBarTextColor.Dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23548a[StatusBarTextColor.Light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public enum StatusBarTextColor {
        Dark,
        Light,
        Undefine
    }

    public static /* synthetic */ Object ipc$super(WeexV2Activity weexV2Activity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
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
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
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

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
        }
    }

    public static /* synthetic */ String a(WeexV2Activity weexV2Activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f32003fe", new Object[]{weexV2Activity}) : weexV2Activity.j;
    }

    @Override // com.taobao.android.weex_ability.page.WeexFragment.a
    public void bj_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa549e1e", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            return;
        }
        String queryParameter = data.getQueryParameter("weex_original_url");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        String a2 = c.a().a(queryParameter);
        this.m = true;
        if (!TextUtils.isEmpty(a2)) {
            Uri.Builder buildUpon = Uri.parse(queryParameter).buildUpon();
            buildUpon.appendQueryParameter("downgradeV1", "true");
            Nav.from(this).toUri(buildUpon.toString());
            finish();
            return;
        }
        Nav.from(this).withCategory("com.taobao.intent.category.HYBRID_UI").skipPreprocess().disableTransition().disallowLoopback().toUri(queryParameter);
        finish();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        com.taobao.android.weex_framework.util.g.d("onRenderFailed: type:" + i + ",errorMsg:" + str);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        b();
        if (!a(getIntent())) {
            super.onCreate(bundle);
            Intent intent = getIntent();
            intent.putExtra(DEGRADE_TYPE, DEGRADE_TYPE_PARAMS_ERROR);
            String uri = getIntent().getData() != null ? getIntent().getData().toString() : "null";
            intent.putExtra(DEGRADE_MSG, "参数非法 ! 降级到h5! params is " + uri);
            return;
        }
        f.a((Activity) this);
        A();
        u();
        a(bundle);
        setContentView(R.layout.weex2_activity_root_layout);
        a();
        s();
        l();
        this.l = a(this.j);
        t();
        j();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            String queryParameter = Uri.parse(this.k).getQueryParameter(WX_VIEW_TRANSPARENT);
            View findViewById = findViewById(R.id.wa_plus_root_layout);
            if (findViewById == null || !TextUtils.equals(queryParameter, Boolean.toString(true))) {
                return;
            }
            findViewById.setBackgroundColor(0);
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.c(TAG, e);
        }
    }

    private void b() {
        String stringExtra;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        this.d = intent.getLongExtra("NAV_TO_URL_START_TIME", -1L);
        this.f = data.toString();
        String queryParameter = data.isHierarchical() ? data.getQueryParameter(KEY_MUS_TPL) : "";
        if (data.isHierarchical() && "true".equals(data.getQueryParameter("wh_weex"))) {
            String stringExtra2 = intent.getStringExtra(ifg.d);
            if (TextUtils.isEmpty(stringExtra2)) {
                if (!TextUtils.isEmpty(intent.getStringExtra(EXTRA_BUNDLE_URL))) {
                    String str = stringExtra.replace(WH_QUERY_FALSE, "wh_weex=true") + "&wx_mute_loading_indicator=true";
                    if (!TextUtils.isEmpty(str)) {
                        intent.putExtra(ifg.c, str);
                        intent.putExtra(ifg.e, str);
                        stringExtra2 = str;
                    }
                }
            }
            this.f = stringExtra2;
            if (!TextUtils.isEmpty(this.f)) {
                Uri parse = Uri.parse(this.f);
                if (parse.isHierarchical()) {
                    String queryParameter2 = parse.getQueryParameter(KEY_MUS_TPL);
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        this.g = queryParameter2;
                        this.f = this.f.replaceFirst("wh_weex=true", WH_QUERY_FALSE);
                    } else {
                        this.g = this.f;
                    }
                } else {
                    this.g = this.f;
                }
            }
            Serializable serializableExtra = getIntent().getSerializableExtra("initData");
            if (serializableExtra instanceof JSONObject) {
                this.b = (JSONObject) serializableExtra;
            } else if (serializableExtra instanceof Map) {
                this.b = new JSONObject((Map) serializableExtra);
            }
        } else if (!TextUtils.isEmpty(queryParameter)) {
            this.g = queryParameter;
        }
        String path = data.getPath();
        if (path == null) {
            return;
        }
        setUTPageName(path);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        k();
        this.D = new a(this);
        this.h.setNavigationAdapter(this.D);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(jvw.KEY_PAGE_STAGES_NAV_START, String.valueOf(this.d));
        hashMap.put("ContainerStart", String.valueOf(this.e));
        this.h = WeexFragment.newInstance(this.g, this.f, null, this.b, hashMap);
        this.h.setOnDowngradeListener(this);
        this.h.setRenderListener(this);
        final Application application = getApplication();
        this.h.setReportInfoListener(new jvr() { // from class: com.taobao.weex.weexv2.page.WeexV2Activity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jvr
            public void a(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                } else if (map == null) {
                } else {
                    WeexV2Activity.a(map, application, WeexV2Activity.a(WeexV2Activity.this));
                }
            }
        });
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.wa_plus_root_layout, this.h, "ali_mus_fragment_tag");
        beginTransaction.commit();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Pair<Boolean, StatusBarTextColor> x = x();
        if (!x.first.booleanValue()) {
            return;
        }
        View findViewById = findViewById(R.id.wa_plus_root_layout);
        findViewById.setFitsSystemWindows(true);
        int i = AnonymousClass4.f23548a[x.second.ordinal()];
        if (i == 1) {
            new SystemBarDecorator(this).enableImmersiveStatusBar(true);
        } else if (i == 2) {
            new SystemBarDecorator(this).enableImmersiveStatusBar(false);
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener() { // from class: com.taobao.weex.weexv2.page.WeexV2Activity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (WindowInsetsCompat) ipChange2.ipc$dispatch("eac8c0", new Object[]{this, view, windowInsetsCompat}) : windowInsetsCompat.consumeSystemWindowInsets();
            }
        });
    }

    private boolean needConstrainStackSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("320a0ab3", new Object[]{this})).booleanValue() : Boolean.TRUE.toString().equals(OrangeConfig.getInstance().getConfig("WXActivityStackSize", "constrainStackSize", "false").toLowerCase());
    }

    public static void a(Map<String, Object> map, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad1f155", new Object[]{map, context, str});
        } else if (context != null) {
            try {
                Double d = (Double) map.get(jvw.KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT);
                if (d == null || d.doubleValue() < e()) {
                    return;
                }
                Intent intent = new Intent();
                intent.setAction(KEY_BROADCAST_DATA_WHITE);
                for (String str2 : map.keySet()) {
                    if (map.get(str2) instanceof String) {
                        intent.putExtra(str2, (String) map.get(str2));
                    } else if (map.get(str2) instanceof Double) {
                        intent.putExtra(str2, (Double) map.get(str2));
                    }
                }
                intent.putExtra("bundleUrl", str);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : com.taobao.android.weex_framework.util.f.j();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        WeexFragment weexFragment = this.h;
        if (weexFragment == null) {
            return;
        }
        weexFragment.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : x().first.booleanValue();
    }

    private boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        this.j = intent.getStringExtra(ifg.c);
        this.k = intent.getStringExtra(ifg.e);
        if (TextUtils.isEmpty(this.j) || TextUtils.isEmpty(this.k)) {
            return false;
        }
        String queryParameter = data.getQueryParameter(FROM);
        if (TextUtils.isEmpty(queryParameter)) {
            com.taobao.android.weex_framework.util.g.a(TAG, "weex url from:" + queryParameter);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("weexUrl", TextUtils.isEmpty(this.k) ? getIntent().getStringExtra(ifg.e) : this.k);
                hashMap.put("bundleUrl", TextUtils.isEmpty(this.j) ? getIntent().getStringExtra(ifg.c) : this.j);
                hashMap.put("pageName", TextUtils.isEmpty(this.l) ? a(getIntent().getStringExtra(ifg.c)) : this.l);
                AppMonitor.Alarm.commitFail("weex", "from_not_nav", JSON.toJSONString(hashMap), "99402", "degradeToWindVane");
            } catch (Throwable unused) {
            }
        }
        k a2 = android.taobao.windvane.webview.j.a();
        if (a2 != null) {
            this.j = a2.dealUrlScheme(this.j);
        }
        com.taobao.android.weex_framework.util.g.a(TAG, "bundleUrl:" + this.j);
        com.taobao.android.weex_framework.util.g.a(TAG, "weexUrl:" + this.k);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.support.v7.app.ActionBar] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.os.Bundle r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.weex.weexv2.page.WeexV2Activity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            java.lang.String r4 = "4b668f6c"
            r0.ipc$dispatch(r4, r1)
            return
        L15:
            boolean r0 = r3.w()
            if (r0 == 0) goto L24
            int r0 = com.taobao.taobao.R.style.Theme_NoBackgroundAndTitle_NoActionBar
            r3.setTheme(r0)
            super.onCreate(r4)
            return
        L24:
            r0 = 8
            r1 = -3
            boolean r2 = r3.v()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r3.q = r2     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            boolean r2 = r3.f()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            r3.r = r2     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            boolean r2 = r3.q     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            if (r2 != 0) goto L40
            boolean r2 = r3.r     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            if (r2 == 0) goto L3c
            goto L40
        L3c:
            r3.supportRequestWindowFeature(r0)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            goto L4b
        L40:
            r2 = 9
            r3.supportRequestWindowFeature(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L48
            goto L4b
        L46:
            r0 = move-exception
            goto L62
        L48:
            r3.supportRequestWindowFeature(r0)     // Catch: java.lang.Throwable -> L46
        L4b:
            android.view.Window r0 = r3.getWindow()
            r0.setFormat(r1)
            super.onCreate(r4)
            android.support.v7.app.ActionBar r4 = r3.getSupportActionBar()
            if (r4 == 0) goto L61
            java.lang.String r0 = "手机淘宝"
            r4.a(r0)
        L61:
            return
        L62:
            android.view.Window r2 = r3.getWindow()
            r2.setFormat(r1)
            super.onCreate(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.weexv2.page.WeexV2Activity.a(android.os.Bundle):void");
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (!w()) {
        } else {
            View findViewById = findViewById(R.id.weex_appbar);
            if (!(findViewById instanceof ImageButton)) {
                return;
            }
            ImageButton imageButton = (ImageButton) findViewById;
            imageButton.setVisibility(0);
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.weex.weexv2.page.WeexV2Activity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        WeexV2Activity.this.finish();
                    }
                }
            });
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        try {
            String queryParameter = Uri.parse(this.k).getQueryParameter("wx_navbar_hidden");
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null || !TextUtils.equals(queryParameter, Boolean.toString(true))) {
                return;
            }
            supportActionBar.e();
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.c(TAG, e);
        }
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (TextUtils.isEmpty(this.k)) {
        } else {
            try {
                if ("true".equalsIgnoreCase(Uri.parse(this.k).getQueryParameter(WX_SECURE))) {
                    getWindow().addFlags(8192);
                } else {
                    getWindow().clearFlags(8192);
                }
            } catch (Throwable th) {
                com.taobao.android.weex_framework.util.g.c(TAG, th);
            }
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.c(TAG, e);
        }
        return TextUtils.equals(Uri.parse(this.k).getQueryParameter("wx_main_hc"), Boolean.toString(true));
    }

    private boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.c(TAG, e);
        }
        return TextUtils.equals(Uri.parse(this.k).getQueryParameter("wx_navbar_transparent"), Boolean.toString(true));
    }

    private boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.c(TAG, e);
        }
        return TextUtils.equals(Uri.parse(this.k).getQueryParameter(WX_APPBAR), Boolean.toString(true));
    }

    private Pair<Boolean, StatusBarTextColor> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("d2e1edb0", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Uri parse = Uri.parse(this.k);
                String queryParameter = parse.getQueryParameter(WX_STATUSBAR_HIDDEN);
                String queryParameter2 = parse.getQueryParameter(WX_STATUSBAR_HIDDEN2);
                if (!TextUtils.equals(queryParameter, Boolean.toString(true)) && !"true".equals(queryParameter2)) {
                    if (TextUtils.equals(queryParameter, HIDDEN_STATUS_BAR_WITH_DARK_TEXT)) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            return new Pair<>(true, StatusBarTextColor.Dark);
                        }
                        return new Pair<>(false, StatusBarTextColor.Dark);
                    } else if (TextUtils.equals(queryParameter, HIDDEN_STATUS_BAR_WITH_LIGHT_TEXT)) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            return new Pair<>(true, StatusBarTextColor.Light);
                        }
                        return new Pair<>(false, StatusBarTextColor.Light);
                    }
                }
                return new Pair<>(true, StatusBarTextColor.Undefine);
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.c(TAG, e);
            }
        }
        return new Pair<>(false, StatusBarTextColor.Undefine);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return !TextUtils.isEmpty(str) ? Uri.parse(str).buildUpon().clearQuery().build().toString() : str;
        } catch (Exception unused) {
            return str;
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
        if (this.r) {
            c_(this.i);
        } else if (!this.q) {
        } else {
            View findViewById = findViewById(R.id.action_bar_container);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(17170445));
            }
            View findViewById2 = findViewById(R.id.action_bar);
            if (findViewById2 == null) {
                return;
            }
            findViewById2.setBackgroundColor(getResources().getColor(17170445));
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (!this.m) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TBPublicMenu publicMenu = getPublicMenu();
        if (publicMenu != null) {
            publicMenu.hide();
        }
        try {
            if (this.h == null) {
                return;
            }
            this.h.onDestroy();
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4 && h()) {
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r4.findItem(com.taobao.taobao.R.id.uik_menu_overflow) == null) goto L11;
     */
    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.weex.weexv2.page.WeexV2Activity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            java.lang.String r4 = "9e84f753"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L1c:
            com.taobao.android.weex_ability.page.b r0 = r3.D
            if (r0 == 0) goto L24
            r1 = 0
            r0.a(r1, r4)
        L24:
            boolean r0 = super.onCreateOptionsMenu(r4)
            if (r4 == 0) goto L32
            int r1 = com.taobao.taobao.R.id.uik_menu_overflow     // Catch: java.lang.Exception -> L76
            android.view.MenuItem r1 = r4.findItem(r1)     // Catch: java.lang.Exception -> L76
            if (r1 != 0) goto L3f
        L32:
            com.taobao.uikit.actionbar.TBPublicMenu r1 = new com.taobao.uikit.actionbar.TBPublicMenu     // Catch: java.lang.Exception -> L76
            r1.<init>(r3)     // Catch: java.lang.Exception -> L76
            android.view.MenuInflater r2 = r3.getMenuInflater()     // Catch: java.lang.Exception -> L76
            android.view.Menu r4 = r1.onCreateOptionsMenu(r2, r4)     // Catch: java.lang.Exception -> L76
        L3f:
            int r1 = com.taobao.taobao.R.id.uik_menu_overflow     // Catch: java.lang.Exception -> L76
            android.view.MenuItem r1 = r4.findItem(r1)     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L62
            int r1 = com.taobao.taobao.R.id.uik_menu_overflow     // Catch: java.lang.Exception -> L76
            android.view.MenuItem r1 = r4.findItem(r1)     // Catch: java.lang.Exception -> L76
            android.view.View r1 = r1.getActionView()     // Catch: java.lang.Exception -> L76
            if (r1 == 0) goto L62
            int r1 = com.taobao.taobao.R.id.uik_menu_overflow     // Catch: java.lang.Exception -> L76
            android.view.MenuItem r4 = r4.findItem(r1)     // Catch: java.lang.Exception -> L76
            android.view.View r4 = r4.getActionView()     // Catch: java.lang.Exception -> L76
            com.taobao.uikit.actionbar.TBActionView r4 = (com.taobao.uikit.actionbar.TBActionView) r4     // Catch: java.lang.Exception -> L76
            r3.f23545a = r4     // Catch: java.lang.Exception -> L76
            goto L91
        L62:
            com.taobao.uikit.actionbar.TBPublicMenu r4 = r3.getPublicMenu()     // Catch: java.lang.Exception -> L76
            com.taobao.uikit.actionbar.TBActionView r4 = r4.getCustomOverflow()     // Catch: java.lang.Exception -> L76
            r3.f23545a = r4     // Catch: java.lang.Exception -> L76
            com.taobao.uikit.actionbar.TBPublicMenu r4 = r3.getPublicMenu()     // Catch: java.lang.Exception -> L76
            com.taobao.uikit.actionbar.TBActionView r1 = r3.f23545a     // Catch: java.lang.Exception -> L76
            r4.setCustomOverflow(r1)     // Catch: java.lang.Exception -> L76
            goto L91
        L76:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error in find overflow menu button. "
            r1.append(r2)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "WXActivity"
            com.taobao.android.weex_framework.util.g.a(r1, r4)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.weexv2.page.WeexV2Activity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        return h() || super.onOptionsItemSelected(menuItem);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        WeexFragment weexFragment = this.h;
        return weexFragment != null && !weexFragment.isDetached() && this.h.onBackPressed();
    }

    public void c_(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c10c51", new Object[]{this, new Boolean(z)});
        } else if (!f()) {
        } else {
            this.i = z;
            if (this.z == null) {
                this.z = (ImageView) findViewById(R.id.fake_title);
            }
            View findViewById = findViewById(R.id.action_bar);
            if (z) {
                ViewGroup.LayoutParams layoutParams = this.z.getLayoutParams();
                if (findViewById != null) {
                    layoutParams.height = findViewById.getHeight();
                    this.z.setLayoutParams(layoutParams);
                }
                this.z.setVisibility(0);
            } else {
                this.z.setVisibility(8);
            }
            View findViewById2 = findViewById(R.id.action_bar_container);
            int i = z ? 17170443 : 17170445;
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(getResources().getColor(i));
            }
            if (findViewById == null) {
                return;
            }
            findViewById.setBackgroundColor(getResources().getColor(i));
        }
    }

    public void setPageUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7c35b", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        String str = this.c;
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", this.j);
            bundle.putParcelable(hyt.ZZB_BUNDLE_KEY, bundle2);
        } else {
            Bundle bundle3 = new Bundle();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(this.c);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle3.putString(next, jSONObject.optString(next));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            bundle.putParcelable(hyt.ZZB_BUNDLE_KEY, bundle3);
        }
        return bundle;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else {
            this.e = System.currentTimeMillis();
        }
    }
}
