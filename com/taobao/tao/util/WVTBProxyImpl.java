package com.taobao.tao.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.taobao.windvane.extra.WVIAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.Globals;
import com.taobao.tao.timestamp.TimeStampManager;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class WVTBProxyImpl extends BroadcastReceiver implements WVIAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler = null;
    private final Object lock = new Object();

    /* renamed from: com.taobao.tao.util.WVTBProxyImpl$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21172a = new int[LoginAction.values().length];

        static {
            try {
                f21172a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21172a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21172a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(1224641748);
        kge.a(-291408440);
    }

    @Override // android.taobao.windvane.extra.WVIAdapter
    public long getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        String str = "getTimestamp success, timestamp: " + currentTimeStamp;
        return currentTimeStamp;
    }

    @Override // android.taobao.windvane.extra.WVIAdapter
    public Map<String, String> getLoginInfo(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d26d646d", new Object[]{this, handler});
        }
        synchronized (this.lock) {
            this.mHandler = handler;
            if (Login.checkSessionValid()) {
                this.mHandler = null;
                String ecode = Login.getEcode();
                String str = "getLoginInfo, sid: " + Login.getSid() + ";ecode: " + ecode;
                HashMap hashMap = new HashMap();
                hashMap.put("sid", Login.getSid());
                hashMap.put(SessionConstants.ECODE, ecode);
                return hashMap;
            }
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this);
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.taobao.tao.login.REFRESH_COOKIES_FIRST", true);
            Login.login(false, bundle);
            return null;
        }
    }

    @Override // android.taobao.windvane.extra.WVIAdapter
    public synchronized void login(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66feea0", new Object[]{this, handler});
            return;
        }
        synchronized (this.lock) {
            this.mHandler = handler;
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this);
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.taobao.tao.login.REFRESH_COOKIES_FIRST", true);
            Login.login(true, bundle);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LoginAction valueOf;
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null) {
        } else {
            int i = AnonymousClass1.f21172a[valueOf.ordinal()];
            if (i == 1) {
                Handler handler2 = this.mHandler;
                if (handler2 == null) {
                    return;
                }
                handler2.sendEmptyMessage(1);
                LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this);
                this.mHandler = null;
            } else if ((i != 2 && i != 3) || (handler = this.mHandler) == null) {
            } else {
                handler.sendEmptyMessage(0);
                LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this);
                this.mHandler = null;
            }
        }
    }
}
