package com.taobao.search.musie;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.Pair;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.taobao.TBActionBar;
import mtopsdk.common.util.StringUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_ability.page.MUSPageFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.ut.mini.UTAnalytics;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import tb.irg;
import tb.kge;
import tb.nue;

/* loaded from: classes7.dex */
public class MUSPageActivity extends CustomBaseActivity implements com.taobao.android.searchbaseframe.uikit.screentype.a, com.taobao.android.searchbaseframe.xsl.i, MUSPageFragment.a, com.taobao.android.weex_framework.g, com.taobao.android.xsearchplugin.muise.g, irg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBActionView f19200a;
    private MUSPageFragment b;
    private g d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private TextView j;
    private String k;
    private com.taobao.android.searchbaseframe.xsl.h c = new com.taobao.android.searchbaseframe.xsl.h();
    private com.taobao.search.sf.h l = new com.taobao.search.sf.h();

    static {
        kge.a(-1634967379);
        kge.a(1975537242);
        kge.a(-311268728);
        kge.a(754605064);
        kge.a(-1119321216);
        kge.a(836797990);
        kge.a(-1327398134);
    }

    public static /* synthetic */ Object ipc$super(MUSPageActivity mUSPageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
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

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(com.taobao.android.weex_framework.p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(com.taobao.android.weex_framework.p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ScreenType b = ScreenType.b((Context) this);
        if (b != null) {
            b.a((com.taobao.android.searchbaseframe.uikit.screentype.a) this);
        }
        TLogTracker.a("MusPage");
        this.c.a(System.currentTimeMillis());
        this.c.b(!SearchSdk.sInited);
        try {
            this.c.c(System.currentTimeMillis());
            SearchSdk.init();
            try {
                com.etao.feimagesearch.o.a();
            } catch (Throwable unused) {
            }
            this.c.b(System.currentTimeMillis());
            String path = getIntent().getData().getPath();
            if (path != null && path.equals("/dinamicx_scan_dev")) {
                super.onCreate(null);
                try {
                    com.taobao.search.common.util.w.a("模版" + getIntent().getData().getQueryParameter("inspect_dev_key") + "进入本地开发模式" + getIntent().getData().getQueryParameter("_mus_tpl"));
                } catch (Exception unused2) {
                }
                finish();
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        TLogTracker.a(com.taobao.search.common.util.r.bk());
        h();
        if (StringUtils.isEmpty(this.f)) {
            super.onCreate(null);
            com.taobao.android.weex_framework.util.g.b("MUSPageActivity", "没有wh_muise=true 或 _mus_tpl, 降级h5");
            b();
            return;
        }
        String a2 = nue.a().a(this.f);
        if (!StringUtils.isEmpty(a2)) {
            this.f = a2;
        }
        a((Bundle) null);
        setContentView(R.layout.activity_mus_page);
        k();
        f();
        i();
        this.d = new g(this);
        this.d.c(this.f);
        MUSPageFragment mUSPageFragment = this.b;
        if (mUSPageFragment != null) {
            mUSPageFragment.setNavigationAdapter(this.d);
            this.b.setRenderListener(this);
        }
        this.c.a(e());
        this.c.d(System.currentTimeMillis());
        HashMap hashMap = new HashMap();
        hashMap.put("webUrl", this.e);
        TLogTracker.a(hashMap);
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        Uri data = getIntent().getData();
        if (data != null) {
            return data.getBooleanQueryParameter("isPreload", false);
        }
        return false;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!g().first.booleanValue()) {
        } else {
            View findViewById = findViewById(R.id.fl_root);
            findViewById.setFitsSystemWindows(true);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener() { // from class: com.taobao.search.musie.MUSPageActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.support.v4.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (WindowInsetsCompat) ipChange2.ipc$dispatch("eac8c0", new Object[]{this, view, windowInsetsCompat}) : windowInsetsCompat.consumeSystemWindowInsets();
                }
            });
        }
    }

    private Pair<Boolean, t> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c3c5e7a1", new Object[]{this});
        }
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Uri parse = Uri.parse(this.e);
                String queryParameter = parse.getQueryParameter("_wx_statusbar_hidden");
                String queryParameter2 = parse.getQueryParameter(CXCommonActivity.NAV_OVERLAY);
                if (StringUtils.equals(queryParameter, "true") || StringUtils.equals(queryParameter2, "true")) {
                    return new Pair<>(true, t.Undefine);
                }
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.c("MUSPageActivity", e);
            }
        }
        return new Pair<>(false, t.Undefine);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            return;
        }
        this.e = data.toString();
        ScreenType a2 = ScreenType.a((Context) this);
        if (a2 != null) {
            this.e = com.taobao.android.searchbaseframe.util.r.a(this.e, com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(a2.a()));
        }
        if ("true".equals(data.getQueryParameter("wh_muise"))) {
            this.f = this.e;
        } else {
            String queryParameter = data.getQueryParameter("_mus_tpl");
            this.f = queryParameter;
            StringUtils.isEmpty(queryParameter);
        }
        String path = data.getPath();
        if (path == null) {
            return;
        }
        setUTPageName(path);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (StringUtils.isEmpty(this.f)) {
        } else {
            this.b = MUSPageFragment.newInstance(this.f, this.e, null, null);
            this.b.setOnDowngradeListener(this);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.add(R.id.fl_render, this.b, "ali_mus_fragment_tag");
            beginTransaction.commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.os.Bundle r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.musie.MUSPageActivity.$ipChange
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
            r0 = 8
            r1 = -3
            boolean r2 = r3.j()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r3.h = r2     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            boolean r2 = r3.d()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r3.g = r2     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            boolean r2 = r3.h     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            if (r2 != 0) goto L31
            boolean r2 = r3.g     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            if (r2 == 0) goto L2d
            goto L31
        L2d:
            r3.supportRequestWindowFeature(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            goto L3c
        L31:
            r2 = 9
            r3.supportRequestWindowFeature(r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            goto L3c
        L37:
            r0 = move-exception
            goto L52
        L39:
            r3.supportRequestWindowFeature(r0)     // Catch: java.lang.Throwable -> L37
        L3c:
            android.view.Window r0 = r3.getWindow()
            r0.setFormat(r1)
            super.onCreate(r4)
            android.support.v7.app.ActionBar r4 = r3.getSupportActionBar()
            if (r4 == 0) goto L51
            java.lang.String r0 = ""
            r4.a(r0)
        L51:
            return
        L52:
            android.view.Window r2 = r3.getWindow()
            r2.setFormat(r1)
            super.onCreate(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.MUSPageActivity.a(android.os.Bundle):void");
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.c("MUSPageActivity", e);
        }
        return StringUtils.equals(Uri.parse(this.e).getQueryParameter(CXCommonActivity.NAV_OVERLAY), Boolean.toString(true));
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
        return c() || super.onOptionsItemSelected(menuItem);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        MUSPageFragment mUSPageFragment = this.b;
        return mUSPageFragment != null && !mUSPageFragment.isDetached() && this.b.onBackPressed();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        g gVar;
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.a((com.taobao.android.weex_framework.p) null, menu);
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        if (com.taobao.search.common.util.r.aa() && (gVar = this.d) != null && !gVar.g() && !isIgnoreFestival() && !this.d.h()) {
            FestivalMgr.a().a(this, TBActionBar.ActionBarStyle.NORMAL);
        }
        try {
            try {
                Field declaredField = getClass().getSuperclass().getSuperclass().getDeclaredField("mNeedPublicMenuShow");
                declaredField.setAccessible(true);
                z = ((Boolean) declaredField.get(this)).booleanValue();
            } catch (Exception e) {
                com.taobao.android.weex_framework.util.g.a("MUSPageActivity", "error in find overflow menu button. " + e.getMessage());
            }
        } catch (Exception e2) {
            com.taobao.android.weex_framework.util.g.c("error in get mNeedPublicMenuShow from BaseActivity", e2);
            z = true;
        }
        if (z) {
            if (menu == null || menu.findItem(R.id.uik_menu_overflow) == null) {
                TBPublicMenu publicMenu = getPublicMenu();
                publicMenu.togglePublicMenu(true);
                menu = publicMenu.onCreateOptionsMenu(getMenuInflater(), menu);
            }
            if (menu.findItem(R.id.uik_menu_overflow) != null && menu.findItem(R.id.uik_menu_overflow).getActionView() != null) {
                this.f19200a = (TBActionView) menu.findItem(R.id.uik_menu_overflow).getActionView();
            } else {
                this.f19200a = getPublicMenu().getCustomOverflow();
                getPublicMenu().setCustomOverflow(this.f19200a);
            }
        }
        return onCreateOptionsMenu;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.j = (TextView) findViewById(R.id.progress_bar);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = z;
        View findViewById = findViewById(R.id.action_bar);
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

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        MUSPageFragment mUSPageFragment = this.b;
        if (mUSPageFragment == null) {
            return;
        }
        mUSPageFragment.onActivityResult(i, i2, intent);
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        if (this.e != null) {
            return g().first.booleanValue();
        }
        return false;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.a("MusPage");
        super.onResume();
        if (this.g) {
            a(this.i);
        } else if (this.h) {
            View findViewById = findViewById(R.id.action_bar_container);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(17170445));
            }
            View findViewById2 = findViewById(R.id.action_bar);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(getResources().getColor(17170445));
            }
        }
        if (StringUtils.isEmpty(this.k)) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, this.k);
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
        try {
            if (this.b != null) {
                this.b.onDestroy();
            }
        } catch (Throwable unused) {
        }
        this.l.a();
    }

    @Override // com.taobao.android.weex_ability.page.MUSPageFragment.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
        } else if (StringUtils.isEmpty(data.toString())) {
            finish();
        } else {
            Nav.from(this).toUri(data.buildUpon().appendQueryParameter("hybrid", "true").build().toString());
            finish();
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.k = com.ut.mini.l.getInstance().getCurrentPageName();
        super.onPause();
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
            return;
        }
        ScreenType a2 = ScreenType.a((Context) this);
        if (a2 == null) {
            return;
        }
        pVar.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(a2.a()));
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        this.j.setVisibility(8);
        this.c.e(System.currentTimeMillis());
        MUSMonitor.a aVar = ((MUSDKInstance) pVar).getMonitor().a().get(MUSMonitor.KEY_BG_TIME_ALL);
        if (aVar == null) {
            return;
        }
        this.c.a((int) aVar.c());
    }

    @Override // com.taobao.android.xsearchplugin.muise.g
    public void a(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        } else {
            this.l.a(pVar);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.g
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.l.a(str);
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.i
    public com.taobao.android.searchbaseframe.xsl.h a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.xsl.h) ipChange.ipc$dispatch("514a78a1", new Object[]{this}) : this.c;
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

    @Override // com.taobao.android.searchbaseframe.uikit.screentype.a
    public void i_(int i) {
        com.taobao.android.weex_framework.p mUSPageFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57263006", new Object[]{this, new Integer(i)});
            return;
        }
        MUSPageFragment mUSPageFragment2 = this.b;
        if (mUSPageFragment2 == null || (mUSPageFragment = mUSPageFragment2.getInstance()) == null || mUSPageFragment.isDestroyed()) {
            return;
        }
        mUSPageFragment.addInstanceEnv(com.etao.feimagesearch.p.KEY_SCREEN_STYLE, ScreenType.a(i));
        mUSPageFragment.refresh(null, null);
    }
}
