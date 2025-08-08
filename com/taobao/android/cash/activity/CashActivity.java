package com.taobao.android.cash.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cash.enume.PrefetchDataState;
import com.taobao.android.cash.jsbridge.CashJSBridge;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import tb.dvu;
import tb.dwb;
import tb.kge;
import tb.riu;

/* loaded from: classes4.dex */
public class CashActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RESULT_CODE_WEEXV2 = 20001;

    /* renamed from: a  reason: collision with root package name */
    public BroadcastReceiver f9292a;
    public Activity b;
    public String c = dvu.e;
    public String d = dvu.d;
    public String e = dvu.f;
    private long f = 0;
    private volatile PrefetchDataState i = null;

    static {
        kge.a(-1121645127);
    }

    public static /* synthetic */ Object ipc$super(CashActivity cashActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
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

    public static /* synthetic */ PrefetchDataState a(CashActivity cashActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PrefetchDataState) ipChange.ipc$dispatch("b3a2b795", new Object[]{cashActivity}) : cashActivity.i;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        b();
        super.onCreate(bundle);
        this.b = this;
        q.a("ALBBCashier", (Class<? extends e>) CashJSBridge.class);
        this.f9292a = new BroadcastReceiver() { // from class: com.taobao.android.cash.activity.CashActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                TLog.logd("frontCashier", "CashActivity", "onReceived: action = " + intent.getAction() + "activity:" + CashActivity.this.b);
                if ("com.ali.user.cash.close.all".equals(intent.getAction())) {
                    CashActivity.this.b.setResult(0);
                    CashActivity.this.finish();
                    CashActivity.this.overridePendingTransition(0, 0);
                } else if (!"com.ali.user.cash.card.selected".equals(intent.getAction())) {
                    if (!"com.ali.user.cash.bridge.requestPrefetchData".equals(intent.getAction()) || CashActivity.a(CashActivity.this) == null) {
                        return;
                    }
                    CashActivity.a(CashActivity.this).setState(PrefetchDataState.PrefetchDataStateEnum.REQUESTED, null);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("data", intent.getStringExtra("data"));
                    CashActivity.this.b.setResult(-1, intent2);
                    CashActivity.this.finish();
                    CashActivity.this.overridePendingTransition(0, 0);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ali.user.cash.close.all");
        intentFilter.addAction("com.ali.user.cash.card.selected");
        intentFilter.addAction("com.ali.user.cash.bridge.requestPrefetchData");
        LocalBroadcastManager.getInstance(getApplicationContext()).registerReceiver(this.f9292a, intentFilter);
        a();
    }

    private void a() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (getIntent() != null && getIntent().getData() != null) {
            try {
                Uri data = getIntent().getData();
                dwb.a("Page_OverseaNewCashier", 2101, "Page_OverseaNewCashier_oldUrlMonitor", "oversea_url:" + data.toString());
                String path = data.getPath();
                if ("h5.m.taobao.com".equalsIgnoreCase(data.getHost()) && dvu.UNI_PATH.equalsIgnoreCase(path)) {
                    a(data.getQueryParameter("baseUrl"));
                } else if (data.toString().contains("baseUrl")) {
                    String queryParameter = data.getQueryParameter("baseUrl");
                    String str = "";
                    for (String str2 : data.getEncodedQuery().split("&")) {
                        if (str2.contains("baseUrl=")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2.replace("baseUrl=", "").trim());
                            sb.append(Uri.decode(str2).contains("?") ? "" : "?");
                            sb.append(str);
                            str = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(str.endsWith("?") ? "" : "&");
                            sb2.append(str2);
                            str = sb2.toString();
                        }
                    }
                    if (queryParameter != null && !queryParameter.contains("weex_mode=dom")) {
                        Intent intent = new Intent(this, CustomBrowserActivity.class);
                        intent.putExtra("url", Uri.decode(str));
                        intent.putExtra("hasNavBar", Uri.decode(str).contains("hasNavBar=1") ? 1 : 0);
                        intent.putExtra("downgrade", true);
                        startActivity(intent);
                        overridePendingTransition(0, 0);
                        return;
                    }
                    Intent intent2 = new Intent(this, TMGWeex2Activity.class);
                    intent2.putExtra("routerTime", this.f);
                    if (this.f > 0) {
                        intent2.putExtra("nativeFrom", "buy");
                    }
                    intent2.setData(Uri.parse(Uri.decode(str)));
                    startActivityForResult(intent2, 20001);
                    overridePendingTransition(0, 0);
                } else if (!StringUtils.isEmpty(path) && path.contains("go/openCashier")) {
                    a(data, this.d);
                } else if (!StringUtils.isEmpty(path) && path.contains("go/simpleCashier")) {
                    a(data, this.e);
                } else if (!StringUtils.isEmpty(path) && path.contains("go/startPayment")) {
                    Intent intent3 = new Intent(this, CustomHalfWXActivity.class);
                    String query = data.getQuery();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.c);
                    if (!StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(query)) {
                        if (this.d.indexOf("?") >= 0) {
                            sb3.append("&");
                            sb3.append(query);
                        } else {
                            sb3.append("?");
                            sb3.append(query);
                        }
                    }
                    intent3.putExtra("fullPage", 1);
                    intent3.putExtra("type", dvu.c);
                    intent3.putExtra(riu.e, sb3.toString());
                    intent3.putExtra(riu.c, sb3.toString());
                    startActivity(intent3);
                } else {
                    Intent intent4 = new Intent(this, PopupWXActivity.class);
                    intent4.putExtra(riu.e, data.toString());
                    intent4.putExtra(riu.c, data.toString());
                    startActivity(intent4);
                }
            } catch (Exception e) {
                e.getMessage();
                finish();
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str.contains("wh_weex=true")) {
            Intent intent = new Intent(this, TMGWeex2Activity.class);
            intent.setData(Uri.parse(str));
            startActivity(intent);
        } else {
            Intent intent2 = new Intent(this, CustomBrowserActivity.class);
            intent2.putExtra("url", Uri.decode(str));
            intent2.putExtra("hasNavBar", Uri.decode(str).contains("hasNavBar=1") ? 1 : 0);
            startActivity(intent2);
        }
        overridePendingTransition(0, 0);
        finish();
    }

    public void a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1b95e9", new Object[]{this, uri, str});
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        Intent intent = new Intent(this, PopupWXActivity.class);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(encodedQuery)) {
            if (this.d.indexOf("?") >= 0) {
                sb.append("&");
                sb.append(encodedQuery);
            } else {
                sb.append("?");
                sb.append(encodedQuery);
            }
        }
        intent.putExtra(riu.e, sb.toString());
        intent.putExtra(riu.c, sb.toString());
        intent.putExtra("type", dvu.b);
        intent.putExtra("fullPage", 0);
        startActivity(intent);
        overridePendingTransition(R.anim.tmg_cash_pop_enter_anim, R.anim.tmg_cash_pop_exit_anim);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.c = OrangeConfig.getInstance().getConfig("cash4android", "payloading_url", dvu.e);
            this.d = OrangeConfig.getInstance().getConfig("cash4android", "cashier_url", dvu.d);
            this.e = OrangeConfig.getInstance().getConfig("cash4android", "simple_cashier_url", dvu.f);
        } catch (Throwable th) {
            th.printStackTrace();
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
        if (this.f9292a == null) {
            return;
        }
        LocalBroadcastManager.getInstance(getApplicationContext()).unregisterReceiver(this.f9292a);
    }
}
