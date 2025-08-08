package com.taobao.android.interactive_common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import tb.grr;
import tb.grw;
import tb.gry;
import tb.hyt;

/* loaded from: classes5.dex */
public class CXCommonActivity extends CustomBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTENT_PATH = "/apps/market/content/index.html";
    public static final String EXTRA_CURRENT_TARGET = "current_target";
    public static final String EXTRA_START_TARGET = "start_target";
    public static final String FLOAT_LAYER_DETAIL_HOST = "market.m.taobao.com";
    public static final String FLOAT_LAYER_DETAIL_HOST_PRE = "market.wapa.taobao.com";
    public static final String FLOAT_LAYER_DETAIL_PATH = "/apps/market/content/floatlayer.html";
    public static final String NAV_HIDDEN = "wx_navbar_hidden";
    public static final String NAV_OVERLAY = "wx_navbar_transparent";
    public static final String UNITE_VIDEO_CONTENT_PATH = "/app/mtb/content/pages/content";
    public static final String UNITE_VIDEO_FULLPAGE_PATH = "/app/mtb/content/pages/video";
    public static final String VIDEO_FULLPAGE_HOST = "market.m.taobao.com";
    public static final String VIDEO_FULLPAGE_HOST_PRE = "market.wapa.taobao.com";
    public static final String VIDEO_FULLPAGE_PATH = "/app/tb-source-app/video-fullpage/pages/index2";
    public static final String WX_DATA_RENDER = "_data_render";
    public static final String WX_EAGLE = "wx_eagle";
    public static long e;

    /* renamed from: a  reason: collision with root package name */
    public TBActionView f12926a;
    public grw c;
    public boolean d;
    private String f;
    private boolean g;
    private String h;
    private Uri j;
    private BroadcastReceiver k;

    public static /* synthetic */ Object ipc$super(CXCommonActivity cXCommonActivity, String str, Object... objArr) {
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
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1270686685:
                super.onLowMemory();
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
        j.b(context);
    }

    public CXCommonActivity() {
        f.a("null", "com.taobao.android.interactive_common.CXCommonActivity");
        this.g = false;
        this.k = new BroadcastReceiver() { // from class: com.taobao.android.interactive_common.CXCommonActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!StringUtils.equals(intent.getAction(), "degradeToWindVane")) {
                } else {
                    CXCommonActivity cXCommonActivity = CXCommonActivity.this;
                    gry.a(cXCommonActivity, cXCommonActivity.getIntent());
                    CXCommonActivity.this.finish();
                }
            }
        };
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        e = currentTimeMillis;
        c.f12928a = currentTimeMillis;
        c.a(i.b.MEASURE_ONCREATE);
        if (getIntent() == null || getIntent().getData() == null) {
            finish();
            super.onCreate(bundle);
            return;
        }
        a(getIntent());
        if (WXEnvironment.isApkDebugable()) {
            this.c = new grw(this);
            this.c.a();
        }
        if (WXEnvironment.isApkDebugable()) {
            Toast.makeText(this, "CXCommonActivity WEEX_SDK 初始化失败!", 0).show();
        }
        Intent intent = getIntent();
        intent.putExtra("degrade_type", "DEGRADE_TYPE_INIT_ERROR");
        intent.putExtra("degrade_msg", "WEEX_SDK 初始化失败!降级到h5");
        gry.a(this, intent);
        finish();
        super.onCreate(bundle);
        HashMap hashMap = new HashMap();
        hashMap.put("isDegradeToH5", "true");
        grr.a(this, "CXCommonActivity_onCreate", hashMap);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    private boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        this.j = a(data);
        getIntent().setData(this.j);
        this.h = this.j.toString();
        return true;
    }

    private Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{this, uri});
        }
        if (uri == null) {
            return null;
        }
        String str = "before:" + uri.toString();
        Uri.Builder buildUpon = uri.buildUpon();
        if (buildUpon == null) {
            return null;
        }
        if (UNITE_VIDEO_FULLPAGE_PATH.equals(uri.getPath())) {
            String queryParameter = uri.getQueryParameter("bizFrom");
            if (!StringUtils.isEmpty(queryParameter)) {
                buildUpon.appendQueryParameter("type", queryParameter);
                buildUpon.appendQueryParameter("source", queryParameter);
            }
            buildUpon.path("/app/tb-source-app/video-fullpage/pages/index2");
        } else if (UNITE_VIDEO_CONTENT_PATH.equals(uri.getPath())) {
            String queryParameter2 = uri.getQueryParameter("id");
            String queryParameter3 = uri.getQueryParameter("bizFrom");
            if (!StringUtils.isEmpty(queryParameter2) && !StringUtils.isEmpty(queryParameter3)) {
                buildUpon.appendQueryParameter("contentId", queryParameter2);
                buildUpon.appendQueryParameter("source", queryParameter3);
            }
            if ("floatlayer".equals(uri.getQueryParameter("content_style"))) {
                buildUpon.path(FLOAT_LAYER_DETAIL_PATH);
            } else {
                buildUpon.path(CONTENT_PATH);
                buildUpon.appendQueryParameter(WX_EAGLE, "true");
            }
        }
        String str2 = "after:" + buildUpon.toString();
        return buildUpon.build();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        grw grwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (!WXEnvironment.isApkDebugable() || (grwVar = this.c) == null) {
            return;
        }
        grwVar.b();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        grw grwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(this.k, new IntentFilter("degradeToWindVane"));
        if (this.g) {
            View findViewById = findViewById(R.id.action_bar_container);
            if (findViewById != null) {
                findViewById.setBackgroundColor(getResources().getColor(17170445));
            }
            View findViewById2 = findViewById(R.id.action_bar);
            if (findViewById2 != null) {
                findViewById2.setBackgroundColor(getResources().getColor(17170445));
            }
        }
        if (!WXEnvironment.isApkDebugable() || (grwVar = this.c) == null) {
            return;
        }
        grwVar.c();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        grw grwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.k);
        if (!WXEnvironment.isApkDebugable() || (grwVar = this.c) == null) {
            return;
        }
        grwVar.d();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        grw grwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (!WXEnvironment.isApkDebugable() || (grwVar = this.c) == null) {
            return;
        }
        grwVar.e();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        grw grwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (!WXEnvironment.isApkDebugable() || (grwVar = this.c) == null) {
            return;
        }
        grwVar.f();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (a()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        return a() || super.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.d) {
            return false;
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        boolean z = true;
        try {
            try {
                Field declaredField = getClass().getSuperclass().getSuperclass().getDeclaredField("mNeedPublicMenuShow");
                declaredField.setAccessible(true);
                z = ((Boolean) declaredField.get(this)).booleanValue();
            } catch (Exception e2) {
                WXLogUtils.d("error in get mNeedPublicMenuShow from BaseActivity", e2);
            }
            if (z) {
                if (menu == null || menu.findItem(R.id.uik_menu_overflow) == null) {
                    menu = new TBPublicMenu(this).onCreateOptionsMenu(getMenuInflater(), menu);
                }
                if (menu.findItem(R.id.uik_menu_overflow) != null && menu.findItem(R.id.uik_menu_overflow).getActionView() != null) {
                    this.f12926a = (TBActionView) menu.findItem(R.id.uik_menu_overflow).getActionView();
                }
            }
        } catch (Exception e3) {
            WXLogUtils.d("CXCommonActivity", "error in find overflow menu button. " + e3.getMessage());
        }
        return onCreateOptionsMenu;
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
        return a() || super.onOptionsItemSelected(menuItem);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        Intent intent = new Intent(WXModule.ACTION_REQUEST_PERMISSIONS_RESULT);
        intent.putExtra("requestCode", i);
        intent.putExtra("permissions", strArr);
        intent.putExtra(WXModule.GRANT_RESULTS, iArr);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.d) {
            finish();
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        } else {
            finish();
        }
        return true;
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

    public void setPageUserInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef7c35b", new Object[]{this, str});
            return;
        }
        WXLogUtils.d("CXCommonActivity", "setPageUserInfo:" + str);
        this.f = str;
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        String str = this.f;
        Bundle bundle = new Bundle();
        if (StringUtils.isEmpty(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pageName", this.h);
            bundle.putParcelable(hyt.ZZB_BUNDLE_KEY, bundle2);
        } else {
            Bundle bundle3 = new Bundle();
            try {
                JSONObject jSONObject = new JSONObject(this.f);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle3.putString(next, jSONObject.optString(next));
                }
            } catch (Throwable unused) {
            }
            bundle.putParcelable(hyt.ZZB_BUNDLE_KEY, bundle3);
        }
        return bundle;
    }
}
