package com.taobao.tbpoplayer.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tbpoplayer.util.d;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f22254a;

    /* renamed from: com.taobao.tbpoplayer.util.d$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22255a = new int[LoginAction.values().length];

        static {
            try {
                f22255a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22255a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-1620058448);
        f22254a = new AtomicBoolean(false);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            if (!f22254a.compareAndSet(false, true)) {
                return;
            }
            LoginBroadcastHelper.registerLoginReceiver(PopLayer.getReference().getApp(), new BroadcastReceiver() { // from class: com.taobao.tbpoplayer.util.LoginStatusListener$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null) {
                    } else {
                        try {
                            LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                            JSONObject jSONObject = new JSONObject();
                            int i = d.AnonymousClass1.f22255a[valueOf.ordinal()];
                            if (i == 1) {
                                String userId = Login.getUserId();
                                jSONObject.put("loginStatus", (Object) b.REFRESH_SOURCE_LOGIN_SUCCESS);
                                jSONObject.put("userId", (Object) userId);
                                com.taobao.tbpoplayer.view.c.a().a("PopLayer", com.taobao.tbpoplayer.view.c.PAGE_EVENT_LOGIN_STATUS_SWITCHED, jSONObject, new JSONObject());
                            } else if (i != 2) {
                            } else {
                                jSONObject.put("loginStatus", (Object) Baggage.Amnet.USER_O);
                                jSONObject.put("userId", (Object) "");
                                com.taobao.tbpoplayer.view.c.a().a("PopLayer", com.taobao.tbpoplayer.view.c.PAGE_EVENT_LOGIN_STATUS_SWITCHED, jSONObject, new JSONObject());
                            }
                        } catch (Throwable th) {
                            com.alibaba.poplayer.utils.c.a("LoginStatusListener.onReceive.error", th);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("LoginStatusListener.startListener.error", th);
        }
    }
}
