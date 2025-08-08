package com.taobao.widgetvivo.server;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.common.request.b;
import com.taobao.desktop.common.request.c;
import com.taobao.desktop.widget.manager.e;
import com.taobao.desktop.widget.manager.j;
import com.taobao.widgetvivo.server.IWidgetVivoManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.khf;
import tb.khg;
import tb.khw;
import tb.kib;
import tb.kid;
import tb.kif;

/* loaded from: classes9.dex */
public class WidgetVivoService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "widget_order_server";
    public static final int WIDGET_ORDER_MAX_REQUEST_DEFAULT_VALUES = 30;
    public static final String WIDGET_ORDER_MAX_REQUEST_TIMES = "widget_order_max_req";
    private Context c;
    private ScheduledThreadPoolExecutor d;
    private final RemoteCallbackList<IDataRequestListener> b = new RemoteCallbackList<>();

    /* renamed from: a  reason: collision with root package name */
    public khf f23568a = new khf() { // from class: com.taobao.widgetvivo.server.WidgetVivoService.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.khf
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (StringUtils.isEmpty(str)) {
            } else {
                kif.a(WidgetVivoService.LOG_TAG, "WidgetVivoService requestData onSuccess: " + str);
                WidgetVivoService.b(WidgetVivoService.this, str, true);
            }
        }

        @Override // tb.khf
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                return;
            }
            kif.a(WidgetVivoService.LOG_TAG, "WidgetVivoService requestData onError: " + str);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            WidgetVivoService.b(WidgetVivoService.this, str, false);
        }
    };

    static {
        kge.a(-723160891);
    }

    public static /* synthetic */ Object ipc$super(WidgetVivoService widgetVivoService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ RemoteCallbackList a(WidgetVivoService widgetVivoService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteCallbackList) ipChange.ipc$dispatch("71466f", new Object[]{widgetVivoService}) : widgetVivoService.b;
    }

    public static /* synthetic */ void a(WidgetVivoService widgetVivoService, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("195aead8", new Object[]{widgetVivoService, str, new Boolean(z)});
        } else {
            widgetVivoService.b(str, z);
        }
    }

    public static /* synthetic */ void b(WidgetVivoService widgetVivoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bca7b3", new Object[]{widgetVivoService});
        } else {
            widgetVivoService.b();
        }
    }

    public static /* synthetic */ void b(WidgetVivoService widgetVivoService, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba59fb7", new Object[]{widgetVivoService, str, new Boolean(z)});
        } else {
            widgetVivoService.a(str, z);
        }
    }

    public static /* synthetic */ void c(WidgetVivoService widgetVivoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef75934", new Object[]{widgetVivoService});
        } else {
            widgetVivoService.d();
        }
    }

    public static /* synthetic */ void d(WidgetVivoService widgetVivoService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac320ab5", new Object[]{widgetVivoService});
        } else {
            widgetVivoService.c();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : new IManager();
    }

    /* loaded from: classes9.dex */
    private class IManager extends IWidgetVivoManager.Stub {
        static {
            kge.a(143895587);
        }

        private IManager() {
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void registerListener(IDataRequestListener iDataRequestListener) throws RemoteException {
            kif.a(WidgetVivoService.LOG_TAG, "listenerList register");
            WidgetVivoService.a(WidgetVivoService.this).register(iDataRequestListener);
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void unregisterListener(IDataRequestListener iDataRequestListener) throws RemoteException {
            kif.a(WidgetVivoService.LOG_TAG, "listenerList unregister");
            WidgetVivoService.a(WidgetVivoService.this).unregister(iDataRequestListener);
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void postRequest() throws RemoteException {
            kif.a(WidgetVivoService.LOG_TAG, "postRequest");
            WidgetVivoService.b(WidgetVivoService.this);
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void postTaoGoldRequest() {
            WidgetVivoService.c(WidgetVivoService.this);
        }

        @Override // com.taobao.widgetvivo.server.IWidgetVivoManager
        public void postOrderRequest() {
            WidgetVivoService.d(WidgetVivoService.this);
        }
    }

    private void a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            a().execute(new Runnable() { // from class: com.taobao.widgetvivo.server.WidgetVivoService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WidgetVivoService.a(WidgetVivoService.this, str, z);
                    }
                }
            });
        }
    }

    private void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        int beginBroadcast = this.b.beginBroadcast();
        kif.a(LOG_TAG, " handleSuccess num" + beginBroadcast);
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                IDataRequestListener broadcastItem = this.b.getBroadcastItem(i);
                if (broadcastItem == null) {
                    kif.a(LOG_TAG, " handleSuccess mListener=null");
                } else if (z) {
                    broadcastItem.dataRequestSuccess(a(str));
                } else {
                    broadcastItem.dataRequestFailure(a(str));
                }
            } catch (RemoteException e) {
                kif.a(LOG_TAG, e.getMessage());
                this.b.finishBroadcast();
            }
        }
        this.b.finishBroadcast();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (!e()) {
                return;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("id", "61");
            b.a("mtop.taobao.growth.starlink.config.get", "1.0", hashMap, new c() { // from class: com.taobao.widgetvivo.server.WidgetVivoService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.common.request.c
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    kif.a(WidgetVivoService.LOG_TAG, "WidgetVivoService requestData onSuccess: " + str);
                    if (str == null) {
                        return;
                    }
                    WidgetVivoService.b(WidgetVivoService.this, str, true);
                }

                @Override // com.taobao.desktop.common.request.c
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        return;
                    }
                    kif.a(WidgetVivoService.LOG_TAG, "WidgetVivoService requestData onError: " + str2);
                    WidgetVivoService.b(WidgetVivoService.this, str2, false);
                }
            });
        } catch (Throwable th) {
            kif.a(LOG_TAG, "WidgetVivoService requestData error: " + th.getMessage());
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (!e()) {
                return;
            }
            j.a("61", this.f23568a, new khg());
        } catch (Throwable th) {
            kif.a(LOG_TAG, "requestOrderDataNew error: " + th.getMessage());
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (!e()) {
                return;
            }
            j.a("43", this.f23568a, new khg());
        } catch (Throwable th) {
            kif.a(LOG_TAG, "requestTaoGoldData error: " + th.getMessage());
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        this.c = kib.a().b();
        int c = e.c(this.c);
        if (c == 0) {
            return true;
        }
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Calendar.getInstance().getTime());
            String str = (String) khw.a(this.c).b(WIDGET_ORDER_MAX_REQUEST_TIMES, "");
            kif.a(LOG_TAG, "today: " + format + ",localTime: " + str);
            if (!StringUtils.isEmpty(str)) {
                String[] split = str.split(":");
                String str2 = split[0];
                int parseInt = Integer.parseInt(split[1]);
                if (str2.equals(format)) {
                    if (parseInt > c) {
                        kif.a(LOG_TAG, "reach max request limit,configTimes：" + c);
                        return false;
                    }
                    khw a2 = khw.a(this.c);
                    a2.a(WIDGET_ORDER_MAX_REQUEST_TIMES, format + ":" + (parseInt + 1));
                    return true;
                }
            }
            khw a3 = khw.a(this.c);
            a3.a(WIDGET_ORDER_MAX_REQUEST_TIMES, format + ":1");
            kif.a(LOG_TAG, "saveFirstRequestTime");
            return true;
        } catch (Exception e) {
            kif.a(LOG_TAG, e.getMessage());
            return false;
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            return SecurityGuardManager.getInstance(this.c).getStaticDataEncryptComp().staticSafeEncrypt(16, "21646297", str, "");
        } catch (SecException e) {
            kif.a(LOG_TAG, "SecurityGuardManager_strEncrypted_error code: " + e.getErrorCode() + e.toString());
            return str;
        }
    }

    public synchronized ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.taobao.widgetvivo.server.WidgetVivoService.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "WIDGET_ORDER");
                }
            });
            this.d.setKeepAliveTime(10L, TimeUnit.SECONDS);
            this.d.allowCoreThreadTimeOut(true);
        }
        return this.d;
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (e.g(context) && !kid.a()) {
        } else {
            kif.a(LOG_TAG, "sendBroadcastToWidgetClient action: " + str);
            Intent intent = new Intent("android.appwidget.action.TAOBAO_STATE");
            intent.setPackage("com.taobao.widgetvivo");
            intent.putExtra("state", str);
            context.sendBroadcast(intent);
        }
    }
}
