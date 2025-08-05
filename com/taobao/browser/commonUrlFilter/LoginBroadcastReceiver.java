package com.taobao.browser.commonUrlFilter;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACTION_LOGIN = 102;
    public static final int ACTION_LOGOUT = 103;
    public static final int ACTION_REFRESH_COOKIE = 101;
    public static final String TAG = "LoginBroadcastReceiver";
    private static final Map<Integer, LoginBroadcastReceiver> d;
    private static final Map<Integer, LoginBroadcastReceiver> e;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<IWVWebView> f16766a;
    private WeakReference<a> b;
    private WeakReference<Activity> c;

    /* renamed from: com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16767a = new int[LoginAction.values().length];

        static {
            try {
                f16767a[LoginAction.NOTIFY_REFRESH_COOKIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16767a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16767a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16767a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16767a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-278473068);
        d = new ConcurrentHashMap();
        e = new ConcurrentHashMap();
    }

    public static void a(Activity activity, IWVWebView iWVWebView, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4455e8a", new Object[]{activity, iWVWebView, aVar, new Integer(i)});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        switch (i) {
            case 101:
                intentFilter.addAction(LoginAction.NOTIFY_REFRESH_COOKIES.name());
                break;
            case 102:
            case 103:
                intentFilter.addAction(LoginAction.NOTIFY_LOGIN_CANCEL.name());
                intentFilter.addAction(LoginAction.NOTIFY_LOGIN_FAILED.name());
                intentFilter.addAction(LoginAction.NOTIFY_LOGIN_SUCCESS.name());
                intentFilter.addAction(LoginAction.NOTIFY_LOGOUT.name());
                break;
        }
        LoginBroadcastReceiver loginBroadcastReceiver = new LoginBroadcastReceiver(activity, iWVWebView, aVar);
        if (activity == null) {
            m.e(TAG, "Activity is null?");
        } else if (i == 101) {
            if (d.containsKey(Integer.valueOf(activity.hashCode()))) {
                return;
            }
            d.put(Integer.valueOf(activity.hashCode()), loginBroadcastReceiver);
            LoginBroadcastHelper.registerLoginReceiver(activity.getApplicationContext(), loginBroadcastReceiver, intentFilter);
        } else if (i == 102 || i == 103) {
            if (e.containsKey(Integer.valueOf(activity.hashCode()))) {
                return;
            }
            e.put(Integer.valueOf(activity.hashCode()), loginBroadcastReceiver);
            LoginBroadcastHelper.registerLoginReceiver(activity.getApplicationContext(), loginBroadcastReceiver, intentFilter);
        } else {
            m.b(TAG, "Activity " + activity.hashCode() + " has register for:" + i);
        }
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
            return;
        }
        LoginBroadcastReceiver remove = d.remove(Integer.valueOf(activity.hashCode()));
        if (remove != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(activity.getApplicationContext(), remove);
        }
        LoginBroadcastReceiver remove2 = e.remove(Integer.valueOf(activity.hashCode()));
        if (remove2 == null) {
            return;
        }
        LoginBroadcastHelper.unregisterLoginReceiver(activity.getApplicationContext(), remove2);
    }

    public LoginBroadcastReceiver(Activity activity, IWVWebView iWVWebView, a aVar) {
        this.c = new WeakReference<>(activity);
        this.f16766a = new WeakReference<>(iWVWebView);
        this.b = new WeakReference<>(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.browser.commonUrlFilter.LoginBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
