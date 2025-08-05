package com.taobao.android.auth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.fragment.WVWebViewFragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.mobile.utils.LoginNavUtils;
import com.ali.user.mobile.utils.MD5Util;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.auth.a;
import com.taobao.android.nav.Nav;
import com.taobao.android.sso.v2.model.SSOIPCConstants;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.search.common.util.k;
import com.taobao.taobao.R;
import com.uc.webview.export.extension.UCExtension;
import com.ut.mini.UTAnalytics;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes4.dex */
public class AuthEntranceActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;
    private String d;
    private String e;
    private List<String> f;
    private boolean h = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9088a = false;
    private boolean j = false;
    private BroadcastReceiver k = new BroadcastReceiver() { // from class: com.taobao.android.auth.AuthEntranceActivity.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null) {
            } else {
                int i = AnonymousClass7.f9095a[valueOf.ordinal()];
                if (i == 1) {
                    AuthEntranceActivity.a(AuthEntranceActivity.this);
                } else if (i != 2) {
                } else {
                    if (AuthEntranceActivity.b(AuthEntranceActivity.this) != null) {
                        AuthEntranceActivity authEntranceActivity = AuthEntranceActivity.this;
                        LoginBroadcastHelper.unregisterLoginReceiver(authEntranceActivity, AuthEntranceActivity.b(authEntranceActivity));
                    }
                    Log.e("login.AuthEntrance", "nofify_cancel, finish auth entrance");
                    AuthEntranceActivity.this.setResult(0);
                    AuthEntranceActivity.this.finish();
                }
            }
        }
    };

    /* renamed from: com.taobao.android.auth.AuthEntranceActivity$7  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9095a = new int[LoginAction.values().length];

        static {
            try {
                f9095a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9095a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AuthEntranceActivity authEntranceActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1628464379:
                super.startIntentSenderForResult((IntentSender) objArr[0], ((Number) objArr[1]).intValue(), (Intent) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
                return null;
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
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Page_Auth";
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

    public static /* synthetic */ void a(AuthEntranceActivity authEntranceActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa25cd6", new Object[]{authEntranceActivity});
        } else {
            authEntranceActivity.c();
        }
    }

    public static /* synthetic */ void a(AuthEntranceActivity authEntranceActivity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e951d9e3", new Object[]{authEntranceActivity, str, new Integer(i)});
        } else {
            authEntranceActivity.a(str, i);
        }
    }

    public static /* synthetic */ BroadcastReceiver b(AuthEntranceActivity authEntranceActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("e8be08ce", new Object[]{authEntranceActivity}) : authEntranceActivity.k;
    }

    public static /* synthetic */ String c(AuthEntranceActivity authEntranceActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39ea1748", new Object[]{authEntranceActivity}) : authEntranceActivity.k();
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.BaseFragmentActivityApi14, android.app.Activity
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(R.layout.aliauth_activity_auth_entrance);
        try {
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(a());
        } catch (Exception unused) {
        }
        a(getIntent());
        j();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        a(getIntent());
        j();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        try {
            super.onResume();
            b();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        a.h = "";
        if (intent == null || intent.getData() == null) {
            a(301, a.THIRD_ERROR_NULL_INTENT_MSG);
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            this.b = data.getQueryParameter("appkey");
            this.f = data.getPathSegments();
            this.d = data.getQueryParameter("targetUrl");
            this.e = data.getQueryParameter("action");
        } catch (Exception e) {
            LoginTLogAdapter.e("login.AuthEntrance", e.toString());
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        UserTrackAdapter.sendUT(a(), "checkSessionValid");
        if (Login.checkSessionValid()) {
            LoginStatus.resetLoginFlag();
            c();
            return;
        }
        LoginStatus.resetLoginFlag();
        new Handler().postDelayed(new Runnable() { // from class: com.taobao.android.auth.AuthEntranceActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Login.login(true);
                }
            }
        }, 400L);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.h && !this.j) {
        } else {
            this.h = true;
            List<String> list = this.f;
            String str = "";
            String str2 = (list == null || list.size() <= 0) ? str : this.f.get(0);
            if (a.b.equals(str2)) {
                this.f9088a = false;
                d();
            } else if (a.c.equals(str2)) {
                this.f9088a = true;
                e();
            } else if (a.d.equals(str2)) {
                try {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(this.d));
                    if (!TextUtils.isEmpty(this.e)) {
                        intent.setAction(this.e);
                    }
                    List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
                    if (queryIntentActivities != null && queryIntentActivities.size() == 1) {
                        str = MD5Util.getApkPublicKeyDigest(queryIntentActivities.get(0).activityInfo.packageName);
                    }
                    if (queryIntentActivities != null) {
                        i = queryIntentActivities.size();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                String f = f();
                if (getIntent() != null) {
                    Uri.Builder buildUpon = getIntent().getData().buildUpon();
                    buildUpon.appendQueryParameter(a.g, a.C0351a.c);
                    if (!TextUtils.isEmpty(f)) {
                        buildUpon.appendQueryParameter("callingPackage", f);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        buildUpon.appendQueryParameter("callingPackageSign", str);
                    }
                    buildUpon.appendQueryParameter("supportAppSize", String.valueOf(i));
                    getIntent().setData(buildUpon.build());
                }
                a(k(), 268435456);
            } else {
                Log.e("login.AuthEntrance", "unknown scheme, finish AuthEntranceActivity");
                finish();
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (getIntent() != null) {
            Uri.Builder buildUpon = getIntent().getData().buildUpon();
            buildUpon.appendQueryParameter(a.g, a.C0351a.b);
            getIntent().setData(buildUpon.build());
        }
        try {
            runOnUiThread(new Runnable() { // from class: com.taobao.android.auth.AuthEntranceActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AuthEntranceActivity authEntranceActivity = AuthEntranceActivity.this;
                    AuthEntranceActivity.a(authEntranceActivity, AuthEntranceActivity.c(authEntranceActivity), 268435456);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (getIntent() != null) {
            Uri.Builder buildUpon = getIntent().getData().buildUpon();
            buildUpon.appendQueryParameter(a.g, a.C0351a.f9096a);
            buildUpon.appendQueryParameter("appKey", this.b);
            getIntent().setData(buildUpon.build());
        }
        runOnUiThread(new Runnable() { // from class: com.taobao.android.auth.AuthEntranceActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AuthEntranceActivity authEntranceActivity = AuthEntranceActivity.this;
                AuthEntranceActivity.a(authEntranceActivity, AuthEntranceActivity.c(authEntranceActivity), UCExtension.EXTEND_INPUT_TYPE_IDCARD);
            }
        });
    }

    private String f() {
        Method method;
        Method[] methods;
        try {
            Method[] methods2 = AuthEntranceActivity.class.getMethods();
            int length = methods2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods2[i];
                if (method.getName().equals("getActivityToken")) {
                    break;
                }
                i++;
            }
            if (method != null) {
                Object invoke = method.invoke(this, new Object[0]);
                Object invoke2 = Class.forName("android.app.ActivityManagerNative").getDeclaredMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                for (Method method2 : invoke2.getClass().getMethods()) {
                    if (method2.getName().equals("getLaunchedFromPackage")) {
                        return String.valueOf(method2.invoke(invoke2, invoke));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "";
    }

    private String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        int envType = DataProviderFactory.getDataProvider().getEnvType();
        StringBuilder sb = new StringBuilder();
        sb.append(k.HTTP_PREFIX);
        if (envType == LoginEnvType.DEV.getSdkEnvType() || envType == LoginEnvType.PRE.getSdkEnvType()) {
            sb.append("market.wapa.taobao.com");
        } else {
            sb.append("market.m.taobao.com");
        }
        sb.append("/app/vip/member4weex/pages/member_auth?wh_weex=");
        sb.append(LoginSwitch.isInABTestRegion(LoginSwitch.MEMBER_AUTH_USE_H5_PERCENT, -1) ? "false" : "true");
        return LoginSwitch.getConfig(LoginSwitch.MEMBER_AUTH_URL, sb.toString());
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        int envType = DataProviderFactory.getDataProvider().getEnvType();
        return (envType == LoginEnvType.DEV.getSdkEnvType() || envType == LoginEnvType.PRE.getSdkEnvType()) ? "http://market.wapa.taobao.com/app/vip/member4weex/pages/member_auth?wh_weex=false" : "http://market.m.taobao.com/app/vip/member4weex/pages/member_auth?wh_weex=false";
    }

    private void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (Debuggable.isDebug()) {
            LoginTLogAdapter.trace("login.AuthEntrance", "Nav.5 in navToWeexPage");
        }
        b(str, i);
    }

    private void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (Debuggable.isDebug()) {
            LoginTLogAdapter.trace("login.AuthEntrance", "Nav.6 in auth2Weex");
        }
        if (getIntent() != null) {
            Log.e("login.AuthEntrance", "Nav.6 in data!=null");
            String dataString = getIntent().getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                JSONObject bundleToJSON = BundleUtil.bundleToJSON(Uri.parse(dataString).getEncodedQuery());
                try {
                    long currentTimeMillis = System.currentTimeMillis() - bundleToJSON.getLong("t").longValue();
                    Log.e("login.AuthEntrance", "Nav.launchDelta=" + currentTimeMillis);
                    UserTrackAdapter.sendUT(a(), "LaunchAuthTime", String.valueOf(currentTimeMillis), bundleToJSON.getString("appKey"), null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                a.h = bundleToJSON == null ? "" : bundleToJSON.toJSONString();
                if (bundleToJSON != null) {
                    String str2 = "auth2Weex: json!=null,json=" + bundleToJSON;
                    try {
                        if ("true".equals(bundleToJSON.getString("sso_tao_simple"))) {
                            LoginTLogAdapter.trace("login.AuthEntrance", "auth2Weex: sso_tao_simple=true");
                            UserTrackAdapter.sendUT("sso_tao_simple");
                            this.j = true;
                            h();
                            return;
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        if (Debuggable.isDebug()) {
            Log.e("login.AuthEntrance", "call Nav in  auth2Weex 22");
        }
        Nav.from(this).withFlags(i).toUri(LoginNavUtils.preHandleUri(this, str));
        i();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (Debuggable.isDebug()) {
            LoginTLogAdapter.trace("login.AuthEntrance", "addWebFragment");
            Log.e("login.AuthEntrance", "addWebFragment call,url=" + g());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().e();
        }
        View findViewById = findViewById(R.id.aliuser_auth_rl);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.aliuser_auth_title_back_tv);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.auth.AuthEntranceActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        AuthEntranceActivity.this.onBackPressed();
                    }
                }
            });
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", g());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        WVWebViewFragment wVWebViewFragment = new WVWebViewFragment(this);
        wVWebViewFragment.setArguments(bundle);
        beginTransaction.add(R.id.browser_fragment_layout, wVWebViewFragment);
        beginTransaction.commit();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        UserTrackAdapter.sendUT(a(), "onBackPressed");
        try {
            if (!TextUtils.isEmpty(a.h)) {
                JSONObject parseObject = JSON.parseObject(a.h);
                if (parseObject != null) {
                    parseObject.put(SSOIPCConstants.APPLY_SSO_RESULT, (Object) 504);
                }
                b.a(parseObject.toJSONString(), this);
                return;
            }
        } catch (Throwable unused) {
        }
        super.onBackPressed();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.android.auth.AuthEntranceActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (Debuggable.isDebug()) {
                        Log.e("login.AuthEntrance", "Nav. finish auth entrance");
                    }
                    AuthEntranceActivity.this.finish();
                }
            }, 1000L);
        }
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("errorCode", i);
        intent.putExtra("errorMsg", str);
        setResult(-2, intent);
        finish();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.k;
        if (broadcastReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(this, broadcastReceiver);
        }
        this.h = false;
        super.onDestroy();
        overridePendingTransition(0, 0);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(this, this.k);
        }
    }
}
