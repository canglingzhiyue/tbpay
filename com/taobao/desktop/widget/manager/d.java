package com.taobao.desktop.widget.manager;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.d;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.broadcast.LoginBroadcastReceiver;
import com.taobao.widgetvivo.server.WidgetVivoService;
import java.util.concurrent.ScheduledExecutorService;
import tb.kge;
import tb.khn;
import tb.kie;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.desktop.widget.manager.d$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16979a = new int[LoginAction.values().length];

        static {
            try {
                f16979a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16979a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16979a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-411584354);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(context, new LoginBroadcastReceiver() { // from class: com.taobao.desktop.widget.manager.LoginStateManager$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(LoginStateManager$1 loginStateManager$1, String str, Object... objArr) {
                    if (str.hashCode() == 1006950490) {
                        super.onReceive((Context) objArr[0], (Intent) objArr[1]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.login4android.broadcast.LoginBroadcastReceiver, android.content.BroadcastReceiver
                public void onReceive(final Context context2, Intent intent) {
                    ScheduledExecutorService a2;
                    Runnable runnable;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        return;
                    }
                    super.onReceive(context2, intent);
                    if (intent == null) {
                        return;
                    }
                    try {
                        LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                        Log.e(WidgetVivoService.LOG_TAG, "registerLoginReceiver action: " + valueOf);
                        int i = d.AnonymousClass1.f16979a[valueOf.ordinal()];
                        if (i == 1) {
                            Log.e(WidgetVivoService.LOG_TAG, "registerLoginReceiver NOTIFY_LOGIN_SUCCESS");
                            WidgetVivoService.a(context2, valueOf.name());
                            a2 = kie.a();
                            runnable = new Runnable() { // from class: com.taobao.desktop.widget.manager.LoginStateManager$1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        khn.a(context2).a(Login.getUserId());
                                    }
                                }
                            };
                        } else if (i != 2) {
                            if (i != 3) {
                                return;
                            }
                            Log.e(WidgetVivoService.LOG_TAG, "registerLoginReceiver NOTIFY_LOGIN_FAILED");
                            return;
                        } else {
                            Log.e(WidgetVivoService.LOG_TAG, "registerLoginReceiver NOTIFY_LOGOUT");
                            WidgetVivoService.a(context2, valueOf.name());
                            a2 = kie.a();
                            runnable = new Runnable() { // from class: com.taobao.desktop.widget.manager.LoginStateManager$1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        khn.a(context2).a("");
                                    }
                                }
                            };
                        }
                        a2.execute(runnable);
                    } catch (Throwable th) {
                        Log.e(WidgetVivoService.LOG_TAG, th.getMessage());
                    }
                }
            });
        }
    }
}
