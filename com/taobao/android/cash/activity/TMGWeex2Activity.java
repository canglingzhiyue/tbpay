package com.taobao.android.cash.activity;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.ali.user.open.ucc.data.ApiConstants;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.e;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.dwb;
import tb.kge;

/* loaded from: classes4.dex */
public class TMGWeex2Activity extends AppCompatActivity implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String b;

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f9305a;
    public int c = 0;
    public int d = 880;
    public long f = 0;
    public boolean g = false;
    private WeexFragment h;
    private String i;

    static {
        kge.a(642222825);
        kge.a(-311268728);
    }

    public static /* synthetic */ Object ipc$super(TMGWeex2Activity tMGWeex2Activity, String str, Object... objArr) {
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
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
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

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ApiConstants.ApiField.USER_ACTION, (Object) "1");
        b = JSONObject.toJSONString(jSONObject);
        this.f9305a = new BroadcastReceiver() { // from class: com.taobao.android.cash.activity.TMGWeex2Activity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    TMGWeex2Activity.this.a(intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ali.user.cash.close.all");
        intentFilter.addAction("com.ali.user.cash.close.all.weex");
        intentFilter.addAction("com.ali.user.cash.card.selected");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.f9305a, intentFilter);
        a(getApplication());
        setContentView(R.layout.weexv2_activity);
        c(getIntent());
        a(false);
        findViewById(R.id.fl_render).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.cash.activity.TMGWeex2Activity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TMGWeex2Activity.this.b(new Intent("com.ali.user.cash.close.all"));
                }
            }
        });
        a();
        if (getSupportActionBar() == null) {
            return;
        }
        getSupportActionBar().e();
    }

    private void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa30527", new Object[]{this, intent});
        } else {
            b(intent.getData());
        }
    }

    private void b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3828407e", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            this.i = uri.toString();
            String queryParameter = uri.getQueryParameter("height");
            String queryParameter2 = uri.getQueryParameter("cashierHeight");
            String queryParameter3 = uri.getQueryParameter("fullPage");
            try {
                if (!TextUtils.isEmpty(queryParameter)) {
                    this.d = Integer.parseInt(queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    this.d = Integer.parseInt(queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    this.c = Integer.parseInt(queryParameter3);
                }
                if (!"false".equals(uri.getQueryParameter("dimEnabled"))) {
                    return;
                }
                getWindow().setDimAmount(0.0f);
            } catch (Exception e) {
                e.printStackTrace();
                String str = "parseInt error:" + e.getMessage();
            }
        }
    }

    private void a(boolean z) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (TextUtils.isEmpty(this.i)) {
        } else {
            if (!z && (intent = getIntent()) != null) {
                this.f = intent.getLongExtra("routerTime", 0L);
                String stringExtra = intent.getStringExtra("nativeFrom");
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.i += "&nativeFrom=" + stringExtra;
                }
                Log.e("TMGWeex2Activity", "weexUrl:" + this.i);
            }
            String str = this.i;
            this.h = WeexFragment.newInstance(str, str, null, null, null);
            this.h.setRenderListener(this);
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            if (z) {
                beginTransaction.replace(R.id.container, this.h, "ali_mus_fragment_tag");
            } else {
                beginTransaction.add(R.id.container, this.h, "ali_mus_fragment_tag");
            }
            beginTransaction.commitAllowingStateLoss();
        }
    }

    private void a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.container);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (this.c != 0 || (i = this.d) <= 0) {
            return;
        }
        int i4 = (int) (i * (i2 / 750.0f));
        if (i4 <= i3) {
            i3 = i4;
        }
        if (i3 <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = i3;
        linearLayout.setLayoutParams(layoutParams);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            e.a().a(application);
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
        if (!this.g) {
            b();
        }
        if (this.f9305a == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.f9305a);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            WVStandardEventCenter.postNotificationToJS("ALBBCashierCloseNotification", b);
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        TLog.logd("cash4android", "TMGWeex2Activity", "onReceived: action = " + intent.getAction());
        if ("com.ali.user.cash.close.all".equals(intent.getAction()) || "com.ali.user.cash.close.all.weex".equals(intent.getAction())) {
            setResult(0);
            finish();
            overridePendingTransition(0, 0);
        } else if (!"com.ali.user.cash.card.selected".equals(intent.getAction())) {
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("data", intent.getStringExtra("data"));
            setResult(-1, intent2);
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
            return;
        }
        if (uri != null) {
            b(uri);
        }
        a(true);
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
        TLog.logd("cash4android", "TMGWeex2Activity", intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        c();
        String str2 = "onJSException:" + str;
        dwb.a("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_oversea_weex_degrade", "weex_degrade_url=" + this.i, "onRenderFailed type:" + i + ",degrade_error=" + str + ",isFatal:" + z);
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        String str2 = "onJSException:" + str;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
            return;
        }
        String str2 = "onFatalException:" + str;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.g = true;
        if (this.i.contains("&openDataPrefetch=true")) {
            this.i = this.i.replace("&openDataPrefetch=true", "");
        }
        if (this.i.contains("&nativeFrom=buy")) {
            this.i = this.i.replace("&nativeFrom=buy", "");
        }
        Intent intent = new Intent(this, CustomBrowserActivity.class);
        intent.putExtra("url", this.i);
        intent.putExtra("hasNavBar", this.i.contains("hasNavBar=1") ? 1 : 0);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        HashMap hashMap = new HashMap(16);
        hashMap.put("spm-cnt", "a2141.b17898281.0.0");
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_OverseaNewCashier");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(this, "Page_OverseaNewCashier");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        HashMap hashMap = new HashMap(16);
        hashMap.put("spm-url", "a2141.b17898281.0.0");
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }
}
