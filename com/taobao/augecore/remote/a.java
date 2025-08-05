package com.taobao.augecore.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.augecore.data.GroupData;
import com.taobao.augecore.remote.a;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.List;
import tb.kaw;
import tb.kba;
import tb.kbb;
import tb.kbd;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.augecore.remote.a$2 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16408a = new int[LoginAction.values().length];

        static {
            try {
                f16408a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16408a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        kbd.a(kaw.LOG_TAG, "注册登录广播监听");
        LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.augecore.remote.BroadCastManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent == null) {
                } else {
                    String action = intent.getAction();
                    kbd.a(kaw.LOG_TAG, "接收登录广播，当前的action是 == " + action);
                    LoginAction valueOf = LoginAction.valueOf(action);
                    if (valueOf == null) {
                        return;
                    }
                    int i = a.AnonymousClass2.f16408a[valueOf.ordinal()];
                    if (i != 1 && i != 2) {
                        return;
                    }
                    a.a();
                }
            }
        });
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        kbd.a(kaw.LOG_TAG, "接收到登录广播，开始请求网络，处理请求对列数据，保存数据到本地");
        if (kbb.a().b) {
            kbd.a(kaw.LOG_TAG, "接收到登录广播，正在发起的请求，不重新发起请求");
        } else {
            kbb.a().a(new kba() { // from class: com.taobao.augecore.remote.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kba
                public void a(List<GroupData> list, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
                    }
                }
            });
        }
    }
}
