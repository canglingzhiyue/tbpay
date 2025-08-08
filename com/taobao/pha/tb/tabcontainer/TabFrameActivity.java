package com.taobao.pha.tb.tabcontainer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.browser.jsbridge.JsApiManager;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.DowngradeType;
import com.taobao.pha.core.controller.d;
import com.taobao.pha.core.controller.i;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.error.a;
import com.taobao.pha.core.manifest.e;
import com.taobao.pha.core.p;
import com.taobao.pha.core.tabcontainer.b;
import com.taobao.pha.tb.h;
import com.taobao.pha.tb.m;
import com.taobao.tao.util.TBStatusBarUtils;
import tb.kge;
import tb.nfc;
import tb.ngn;
import tb.ngr;
import tb.ngu;
import tb.nom;

@PopLayer.PopupAllowedFromFragment
/* loaded from: classes7.dex */
public class TabFrameActivity extends CustomBaseActivity implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AppController f18843a;
    public b b;
    private long c;
    private boolean d;
    private boolean e;
    private long f = -1;
    private long g = -1;

    static {
        kge.a(-374747646);
        kge.a(-1253718971);
    }

    public static /* synthetic */ Object ipc$super(TabFrameActivity tabFrameActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1004512494:
                return new Boolean(super.needActionBar());
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -198387616:
                return new Boolean(super.onPanelKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
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

    @Override // com.taobao.pha.core.controller.d
    public int getNavigationBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f7254aa", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.pha.core.controller.d
    public int getNotchHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9637083", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("447db125", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            super.onCreate(bundle);
            ngr.b("TabFrameActivity", "intent is null.");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL);
        if (StringUtils.isEmpty(stringExtra)) {
            ngr.b("TabFrameActivity", "manifestUrl is null.");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFragment", (Object) 0);
            i.a("launch", jSONObject, PHAErrorType.REFERENCE_ERROR.toString(), a.ERR_MSG_MANIFEST_URL_IS_NULL);
            super.onCreate(bundle);
            finish();
            return;
        }
        boolean z = bundle == null;
        if (z) {
            this.f = SystemClock.uptimeMillis();
        }
        h.a(this);
        if (z) {
            this.g = SystemClock.uptimeMillis();
        }
        Uri parse = Uri.parse(stringExtra);
        b(parse);
        long uptimeMillis = SystemClock.uptimeMillis();
        super.onCreate(bundle);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        ngr.b("TabFrameActivity", "super.onCreate costs " + (uptimeMillis2 - uptimeMillis));
        this.c = intent.getLongExtra("pha_timestamp", 0L);
        if (!ngu.t() && (window = getWindow()) != null) {
            window.getDecorView().setBackgroundColor(-1);
        }
        this.f18843a = AppController.b(intent.getLongExtra("AppControllerInstanceId", 0L));
        if (this.f18843a == null) {
            int intExtra = intent.getIntExtra("manifest_uri_hashcode", 0);
            if (bundle != null || !intent.hasExtra("manifest_uri_hashcode")) {
                intExtra = e.a().a(parse);
            }
            ngr.b("TabFrameActivity", "unexpected case: appController shouldn't be null here");
            this.f18843a = new AppController(stringExtra, PHAContainerType.GENERIC, intExtra);
        }
        this.f18843a.P().a("containerStart", uptimeMillis2, true);
        this.f18843a.a(this, this);
        if (ngu.l()) {
            JsApiManager.initJsApiInPha();
        }
        this.f18843a.a(bundle);
        i P = this.f18843a.P();
        P.a(nfc.PHA_MONITOR_STAGE_NAV_PROCESS_END, intent.getLongExtra("pha_timestamp", 0L));
        P.a(nfc.PHA_MONITOR_STAGE_BEFORE_ON_CREATE, uptimeMillis);
        P.a(nfc.PHA_MONITOR_STAGE_AFTER_ON_CREATE, uptimeMillis2);
        if (!z) {
            return;
        }
        P.a(23, this.f);
        P.a(24, this.g);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        AppController appController = this.f18843a;
        if (appController != null) {
            if (this.b == null) {
                this.b = new m(appController);
            }
            this.b.a(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        if (!ngu.o()) {
            return super.needActionBar();
        }
        if (!this.d) {
            return super.needActionBar();
        }
        return false;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        AppController appController = this.f18843a;
        if (appController == null) {
            return;
        }
        appController.a(i, i2, intent);
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4 && this.f18843a.T()) {
            return true;
        }
        return super.onPanelKeyDown(i, keyEvent);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        AppController appController = this.f18843a;
        if (appController == null) {
            return;
        }
        appController.S();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        AppController appController = this.f18843a;
        if (appController == null) {
            return;
        }
        appController.onResume();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        AppController appController = this.f18843a;
        if (appController == null) {
            return;
        }
        appController.onPause();
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

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        AppController appController = this.f18843a;
        if (appController != null) {
            appController.onDestroy();
            this.f18843a = null;
        }
        super.onDestroy();
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean attachToHost(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b3a4a7", new Object[]{this, fragment})).booleanValue();
        }
        try {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.beginTransaction().replace(16908290, fragment).commitNowAllowingStateLoss();
            }
            return true;
        } catch (Exception e) {
            ngr.b("TabFrameActivity", ngn.a(e));
            return false;
        }
    }

    @Override // com.taobao.pha.core.controller.d
    public long getNavStartTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("78326e5d", new Object[]{this})).longValue() : this.c;
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : this.e;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isNavigationBarHidden() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b479b6a", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // com.taobao.pha.core.controller.d
    public int getStatusBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[]{this})).intValue();
        }
        if (getSystemBarDecorator() != null && getSystemBarDecorator().getConfig() != null) {
            return getSystemBarDecorator().getConfig().getStatusBarHeight();
        }
        return ngn.e("status_bar_height");
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean downgrade(Uri uri, DowngradeType downgradeType, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4424f9ca", new Object[]{this, uri, downgradeType, bool})).booleanValue();
        }
        boolean a2 = p.b().u().a(uri, this, bool);
        finish();
        overridePendingTransition(0, 0);
        return a2;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        finish();
        return true;
    }

    @Override // com.taobao.pha.core.controller.d
    public boolean isTrustedUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c579ad7", new Object[]{this, str})).booleanValue();
        }
        if (!p.c().t()) {
            return true;
        }
        return android.taobao.windvane.config.p.a(str);
    }

    private void b(Uri uri) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3828407e", new Object[]{this, uri});
            return;
        }
        this.d = nom.VALUE_YES.equals(uri.getQueryParameter("disableNav"));
        if (this.d) {
            if (Build.VERSION.SDK_INT < 19 && !TBStatusBarUtils.isMIUIDevice() && !TBStatusBarUtils.isMeizuDevice()) {
                z = false;
            }
            if (z) {
                String queryParameter = uri.getQueryParameter("status_bar_transparent");
                if (!StringUtils.isEmpty(queryParameter)) {
                    this.e = "true".equals(queryParameter);
                }
            }
        }
        if (getWindow() == null) {
            return;
        }
        getWindow().setFormat(-3);
    }
}
