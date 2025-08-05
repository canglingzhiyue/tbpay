package com.alibaba.analytics;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.taobao.windvane.runtimepermission.a;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ut.abtest.UTABEnvironment;
import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.util.HashMap;
import tb.cex;

/* loaded from: classes.dex */
public class InitABTest implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitABTest";

    /* renamed from: com.alibaba.analytics.InitABTest$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2048a = new int[LoginAction.values().length];

        static {
            try {
                f2048a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2048a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application == null || hashMap == null) {
            if (application == null) {
                Log.e(TAG, "init error: application is null");
            }
            if (hashMap != null) {
                return;
            }
            Log.e(TAG, "init error: params is null");
        } else {
            boolean booleanValue = hashMap.get("isDebuggable") != null ? ((Boolean) hashMap.get("isDebuggable")).booleanValue() : false;
            if (booleanValue) {
                String str = "application:" + application + ",params:" + hashMap;
            }
            if (hashMap.get("isUserTracklogEnable") != null) {
                z = ((Boolean) hashMap.get("isUserTracklogEnable")).booleanValue();
            }
            if (booleanValue) {
                String str2 = "isUserTracklogEnable:" + z;
            }
            UTABEnvironment uTABEnvironment = UTABEnvironment.Product;
            try {
                Number number = (Number) hashMap.get(OConstant.LAUNCH_ENVINDEX);
                if (number != null) {
                    int intValue = number.intValue();
                    if (intValue == 1) {
                        uTABEnvironment = UTABEnvironment.Prepare;
                    } else if (intValue == 2) {
                        uTABEnvironment = UTABEnvironment.Daily;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                UTABTest.initialize(application, UTABTest.newConfigurationBuilder().a(z).a(uTABEnvironment).a(UTABMethod.Push).a());
                UTABTest.updateUserAccount(Login.getNick(), Login.getUserId());
                LoginBroadcastHelper.registerLoginReceiver(application, new BroadcastReceiver() { // from class: com.alibaba.analytics.InitABTest.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        LoginAction valueOf;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null) {
                        } else {
                            int i = AnonymousClass3.f2048a[valueOf.ordinal()];
                            if (i != 1 && i != 2) {
                                return;
                            }
                            UTABTest.updateUserAccount(Login.getNick(), Login.getUserId());
                        }
                    }
                });
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Nav.registerPreprocessor(new Nav.k() { // from class: com.alibaba.analytics.InitABTest.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.nav.Nav.h
                    public boolean beforeNavTo(Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("66a5c187", new Object[]{this, intent})).booleanValue();
                        }
                        return false;
                    }

                    @Override // com.taobao.android.nav.Nav.k
                    public boolean a(Nav nav, Intent intent) {
                        Variation variation;
                        Uri parse;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("4b7d6f4", new Object[]{this, nav, intent})).booleanValue();
                        }
                        try {
                        } catch (Throwable th3) {
                            Log.e(InitABTest.TAG, th3.toString());
                        }
                        if (cex.a().j().o()) {
                            return true;
                        }
                        Uri data = intent.getData();
                        if (data != null) {
                            String uri = data.toString();
                            if (!TextUtils.isEmpty(uri) && (variation = UTABTest.activate(UTABTest.COMPONENT_NAV, uri).getVariation("bucket")) != null) {
                                String valueAsString = variation.getValueAsString(null);
                                if (!TextUtils.isEmpty(valueAsString) && !TextUtils.equals(uri, valueAsString) && (parse = Uri.parse(valueAsString)) != null) {
                                    intent.setData(parse);
                                    String queryParameter = parse.getQueryParameter("UTABTEST-LOOPBACK");
                                    if (TextUtils.isEmpty(queryParameter)) {
                                        nav.allowLoopback();
                                    } else if (TextUtils.equals(a.PERMISSION_ALLOW, queryParameter)) {
                                        nav.allowLoopback();
                                    } else if (TextUtils.equals("disallow", queryParameter)) {
                                        nav.disallowLoopback();
                                    }
                                }
                            }
                        }
                        return true;
                    }
                });
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }
}
