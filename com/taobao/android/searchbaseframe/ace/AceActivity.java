package com.taobao.android.searchbaseframe.ace;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.c;
import com.taobao.android.searchbaseframe.ace.model.AceStrategy;
import com.taobao.android.searchbaseframe.ace.model.AceSubStrategy;
import com.taobao.android.searchbaseframe.net.b;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.util.n;
import com.taobao.android.searchbaseframe.util.r;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.imn;
import tb.imo;
import tb.imp;
import tb.kge;

/* loaded from: classes6.dex */
public class AceActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1480682408);
    }

    public static /* synthetic */ Object ipc$super(AceActivity aceActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
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

    public static /* synthetic */ void a(AceActivity aceActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8060be49", new Object[]{aceActivity, str});
        } else {
            aceActivity.a(str);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        a();
        b();
        imp.a().a(this);
        c();
        finish();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        imn b = imo.b();
        if (b == null) {
            return;
        }
        com.taobao.android.searchbaseframe.net.b.a(b, new com.taobao.android.searchbaseframe.net.a(r.a("https://admin.search.taobao.com/chitu/chituApi/deviceService?lang=cn&debugApp=android&serviceType=register", "utdid", b.a().b())), new b.AbstractC0575b() { // from class: com.taobao.android.searchbaseframe.ace.AceActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.net.b.AbstractC0575b
            public void a(e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("828c1bf2", new Object[]{this, eVar});
                } else {
                    k.a("Ace.Register", "register white list success");
                }
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        imn b = imo.b();
        if (b == null) {
            return;
        }
        b.l().c(true);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Uri data = getIntent().getData();
        String path = data.getPath();
        if (StringUtils.isEmpty(path)) {
            return;
        }
        if (path.contains("connect")) {
            d(data);
        } else if (path.contains("setIp")) {
            e(data);
        } else if (path.contains("pre_workout")) {
            c(data);
        } else if (path.contains(StEvent.SEND_MSG)) {
            b(data);
        } else if (!path.contains("skyline_preview")) {
        } else {
            a(data);
        }
    }

    private void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
            return;
        }
        Map<String, String> a2 = r.a(uri.toString());
        String remove = a2.remove("q");
        AceStrategy aceStrategy = new AceStrategy();
        aceStrategy.setName("天际投放预览");
        aceStrategy.setParams(a2);
        aceStrategy.setId(-2);
        b.a(aceStrategy);
        if (StringUtils.isEmpty(remove)) {
            return;
        }
        n.a(this, "https://s.m.taobao.com/h5?q=" + remove);
    }

    private void b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3828407e", new Object[]{this, uri});
            return;
        }
        String queryParameter = uri.getQueryParameter("content");
        if (StringUtils.isEmpty(queryParameter)) {
            return;
        }
        a.b(this);
        a.a("clientMsg", queryParameter);
        startActivity(new Intent(this, AcePanelActivity.class));
    }

    private void c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beadfb1d", new Object[]{this, uri});
            return;
        }
        final String queryParameter = uri.getQueryParameter("pageUrl");
        String queryParameter2 = uri.getQueryParameter("aceId");
        String queryParameter3 = uri.getQueryParameter("scriptParams");
        String queryParameter4 = uri.getQueryParameter("mockUrl");
        String queryParameter5 = uri.getQueryParameter("requestAlias");
        if (StringUtils.isEmpty(queryParameter2) || StringUtils.isEmpty(queryParameter5)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scriptParams", queryParameter3);
        hashMap.put("mockUrl", queryParameter4);
        AceSubStrategy aceSubStrategy = new AceSubStrategy();
        aceSubStrategy.setStrategyType("FeDev");
        aceSubStrategy.setId(queryParameter2);
        aceSubStrategy.setRequestParams(hashMap);
        b.a(queryParameter5, aceSubStrategy);
        if (StringUtils.isEmpty(queryParameter)) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.android.searchbaseframe.ace.AceActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    n.a(AceActivity.this, queryParameter);
                }
            }
        }, 1000L);
    }

    private void d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533b5bc", new Object[]{this, uri});
            return;
        }
        final String queryParameter = uri.getQueryParameter(c.IP);
        imp.a().f().a(new Runnable() { // from class: com.taobao.android.searchbaseframe.ace.AceActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AceActivity.a(AceActivity.this, String.format("http://%s:63231/command?name=afox.connectMe", queryParameter));
                }
            }
        });
    }

    private void e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb9705b", new Object[]{this, uri});
            return;
        }
        final String queryParameter = uri.getQueryParameter("uuid");
        final String queryParameter2 = uri.getQueryParameter("host");
        final String d = d();
        if (StringUtils.isEmpty(queryParameter) || StringUtils.isEmpty(queryParameter2) || StringUtils.isEmpty(d)) {
            return;
        }
        imp.a().f().a(new Runnable() { // from class: com.taobao.android.searchbaseframe.ace.AceActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AceActivity.a(AceActivity.this, String.format("https://%s/setIp?uuid=%s&addresses=%s", queryParameter2, URLEncoder.encode(queryParameter), URLEncoder.encode(d)));
                }
            }
        });
    }

    private void a(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.connect();
            k.f("AceConnect", "response code:" + httpURLConnection.getResponseCode(), new Object[0]);
        } catch (Throwable th3) {
            th = th3;
            try {
                th.printStackTrace();
                if (httpURLConnection == null) {
                    return;
                }
                httpURLConnection.disconnect();
            } finally {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            }
        }
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        if (!wifiManager.isWifiEnabled()) {
            Toast.makeText(this, "请开启wifi后再进行连接操作", 0).show();
            return "";
        }
        int ipAddress = wifiManager.getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            Toast.makeText(this, "请连接wifi后再进行连接操作", 0).show();
            return "";
        }
        return a(ipAddress) + ":" + imp.a().g();
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + (i >>> 24);
    }
}
