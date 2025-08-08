package com.alibaba.analytics.core.network;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.apr;
import tb.aqf;
import tb.kge;
import tb.rqd;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f2092a;
    private static SubscriptionManager b;

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f2092a;
    }

    public static /* synthetic */ void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            d(context);
        }
    }

    static {
        kge.a(1511975277);
        f2092a = "Unknown";
        b = null;
    }

    public static synchronized String a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
            }
            return f2092a;
        }
    }

    public static synchronized void a(final Context context) throws Exception {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            } else if (Build.VERSION.SDK_INT < 22) {
            } else {
                if (b == null) {
                    new HandlerC0065a(Looper.getMainLooper()).a(new Runnable() { // from class: com.alibaba.analytics.core.network.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                a.c(context);
                            }
                        }
                    });
                }
            }
        }
    }

    private static synchronized void d(final Context context) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a023673d", new Object[]{context});
            } else if (Build.VERSION.SDK_INT < 22) {
            } else {
                if (b != null) {
                    return;
                }
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                b = subscriptionManager;
                if (subscriptionManager == null) {
                    apr.b("NetworkOperatorUtil", "SubscriptionManager is null");
                    return;
                }
                b.addOnSubscriptionsChangedListener(new SubscriptionManager.OnSubscriptionsChangedListener() { // from class: com.alibaba.analytics.core.network.a.2
                    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
                    public void onSubscriptionsChanged() {
                        super.onSubscriptionsChanged();
                        apr.b("NetworkOperatorUtil", "onSubscriptionsChanged");
                        a.b(context);
                        apr.b("NetworkOperatorUtil", "CurrentNetworkOperator", a.b());
                        aqf.a(context);
                    }
                });
                apr.b("NetworkOperatorUtil", "addOnSubscriptionsChangedListener");
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
                return;
            }
            apr.a("NetworkOperatorUtil", "updateNetworkOperatorName");
            try {
            } catch (Exception e) {
                apr.b("NetworkOperatorUtil", e, new Object[0]);
            }
            if (!rqd.bGetSimOperator) {
                f2092a = "Unknown";
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                f2092a = "Unknown";
                return;
            }
            if (telephonyManager.getSimState() == 5) {
                String simOperator = telephonyManager.getSimOperator();
                if (StringUtils.isEmpty(simOperator)) {
                    String simOperatorName = telephonyManager.getSimOperatorName();
                    if (StringUtils.isEmpty(simOperatorName)) {
                        f2092a = "Unknown";
                        return;
                    } else {
                        f2092a = simOperatorName;
                        return;
                    }
                }
                if (!simOperator.equals("46000") && !simOperator.equals("46002") && !simOperator.equals("46007") && !simOperator.equals("46008")) {
                    if (!simOperator.equals("46001") && !simOperator.equals("46006") && !simOperator.equals("46009")) {
                        if (!simOperator.equals("46003") && !simOperator.equals("46005") && !simOperator.equals("46011")) {
                            String simOperatorName2 = telephonyManager.getSimOperatorName();
                            if (StringUtils.isEmpty(simOperatorName2)) {
                                f2092a = "Unknown";
                                return;
                            } else {
                                f2092a = simOperatorName2;
                                return;
                            }
                        }
                        f2092a = "中国电信";
                        return;
                    }
                    f2092a = "中国联通";
                    return;
                }
                f2092a = "中国移动";
                return;
            }
            f2092a = "Unknown";
        }
    }

    /* renamed from: com.alibaba.analytics.core.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class HandlerC0065a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2059630801);
        }

        public static /* synthetic */ Object ipc$super(HandlerC0065a handlerC0065a, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public HandlerC0065a(Looper looper) {
            super(looper);
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
                return;
            }
            apr.b();
            if (runnable == null) {
                return;
            }
            try {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = runnable;
                sendMessage(obtain);
            } catch (Throwable unused) {
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                if (message.obj != null && (message.obj instanceof Runnable)) {
                    ((Runnable) message.obj).run();
                }
            } catch (Throwable th) {
                apr.b("NetworkOperatorUtil", th, new Object[0]);
            }
            super.handleMessage(message);
        }
    }
}
