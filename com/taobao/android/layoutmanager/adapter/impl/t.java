package com.taobao.android.layoutmanager.adapter.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.t;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class t extends ILogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, BroadcastReceiver> f13141a = new HashMap();

    /* renamed from: com.taobao.android.layoutmanager.adapter.impl.t$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13142a = new int[LoginAction.values().length];

        static {
            try {
                f13142a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13142a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13142a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(2081094347);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin
    public ILogin.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILogin.a) ipChange.ipc$dispatch("72b154f4", new Object[]{this});
        }
        ILogin.a aVar = new ILogin.a();
        aVar.f19967a = Login.getUserId();
        aVar.b = Login.getNick();
        aVar.c = Login.getHeadPicLink();
        return aVar;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin
    public void a(final ILogin.LoginCallback loginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4b6301", new Object[]{this, loginCallback});
        } else if (loginCallback == null) {
        } else {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.layoutmanager.adapter.impl.TBLogin$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    int i = t.AnonymousClass1.f13142a[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if (i == 1) {
                        loginCallback.a(1);
                    } else if (i == 2) {
                        loginCallback.a(2);
                    } else if (i != 3) {
                    } else {
                        loginCallback.a(3);
                    }
                }
            };
            this.f13141a.put(loginCallback.toString(), broadcastReceiver);
            LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), broadcastReceiver);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin
    public void b(ILogin.LoginCallback loginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c73cc2", new Object[]{this, loginCallback});
        } else if (loginCallback == null) {
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.f13141a.get(loginCallback.toString()));
        }
    }
}
