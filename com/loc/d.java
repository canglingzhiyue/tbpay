package com.loc;

import android.app.Application;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.alibaba.security.ccrc.service.build.Ta;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.AMapLocationQualityReport;
import com.amap.api.location.APSService;
import com.amap.api.location.UmidtokenInfo;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.mto;
import tb.ndw;

/* loaded from: classes4.dex */
public final class d {
    private static boolean G = true;
    private static boolean I = false;
    private static AtomicBoolean J = new AtomicBoolean(false);
    public static volatile boolean g = false;
    private Context C;
    private g D;

    /* renamed from: a  reason: collision with root package name */
    ew f7736a;
    public c c;
    j j;
    Intent m;
    AMapLocationClientOption b = new AMapLocationClientOption();
    h d = null;
    private boolean E = false;
    private volatile boolean F = false;
    ArrayList<AMapLocationListener> e = new ArrayList<>();
    boolean f = false;
    public boolean h = true;
    public boolean i = true;
    Messenger k = null;
    Messenger l = null;
    int n = 0;
    private boolean H = true;
    b o = null;
    boolean p = false;
    AMapLocationClientOption.AMapLocationMode q = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
    Object r = new Object();
    fw s = null;
    boolean t = false;
    e u = null;
    private AMapLocationClientOption K = new AMapLocationClientOption();
    private i L = null;
    String v = null;
    private ServiceConnection M = new ServiceConnection() { // from class: com.loc.d.2
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                d.this.k = new Messenger(iBinder);
                d.this.E = true;
                d.this.t = true;
            } catch (Throwable th) {
                fr.a(th, "ALManager", "onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            d dVar = d.this;
            dVar.k = null;
            dVar.E = false;
        }
    };
    AMapLocationQualityReport w = null;
    boolean x = false;
    boolean y = false;
    private volatile boolean N = false;
    a z = null;
    String A = null;
    boolean B = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.loc.d$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7739a = new int[AMapLocationClientOption.AMapLocationMode.values().length];

        static {
            try {
                f7739a[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7739a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7739a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v7 */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ?? r0 = 0;
            try {
                super.handleMessage(message);
                int i = message.what;
                if (i == 11) {
                    d.this.a(message.getData());
                } else if (i == 12) {
                    d.this.b(message);
                } else if (i == 1010) {
                } else {
                    if (i == 1011) {
                        d.this.a(14, (Bundle) null);
                        d.this.g();
                        return;
                    }
                    try {
                        switch (i) {
                            case 1002:
                                d.this.c((AMapLocationListener) message.obj);
                                return;
                            case 1003:
                                d.this.j();
                                d.this.a(13, (Bundle) null);
                                return;
                            case 1004:
                                d.this.l();
                                d.this.a(14, (Bundle) null);
                                return;
                            case 1005:
                                d.this.d((AMapLocationListener) message.obj);
                                return;
                            case 1006:
                            case 1007:
                                return;
                            default:
                                switch (i) {
                                    case 1014:
                                        d.this.a(message);
                                        return;
                                    case 1015:
                                        d.this.d.a(d.this.b);
                                        d.this.a(1025, (Object) null, 300000L);
                                        return;
                                    case 1016:
                                        if (fy.m(d.this.C)) {
                                            new Object[1][0] = "coarse permission lbs location";
                                            d.this.r();
                                            return;
                                        } else if (d.this.d.b()) {
                                            d.this.a(1016, (Object) null, 1000L);
                                            return;
                                        } else {
                                            d.this.n();
                                            return;
                                        }
                                    case 1017:
                                        d.this.d.a();
                                        d.this.a(1025);
                                        return;
                                    case 1018:
                                        d.this.b = (AMapLocationClientOption) message.obj;
                                        if (d.this.b == null) {
                                            return;
                                        }
                                        d.this.s();
                                        return;
                                    case 1019:
                                    case 1020:
                                    case 1021:
                                    case 1022:
                                        return;
                                    case 1023:
                                        d.this.c(message);
                                        return;
                                    case 1024:
                                        d.this.d(message);
                                        return;
                                    case 1025:
                                        if (d.this.d.f()) {
                                            d.this.d.a();
                                            d.this.d.a(d.this.b);
                                        }
                                        d.this.a(1025, (Object) null, 300000L);
                                        return;
                                    case 1026:
                                        d.this.D.a(d.this.b);
                                        return;
                                    case 1027:
                                        d.this.D.a();
                                        return;
                                    case 1028:
                                        d.this.g((AMapLocation) message.obj);
                                        return;
                                    default:
                                        return;
                                }
                        }
                    } catch (Throwable th) {
                        r0 = message;
                        th = th;
                        if (r0 == 0) {
                            r0 = "handleMessage";
                        }
                        fr.a(th, "AMapLocationManage$MHandlerr", r0);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class b extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        d f7741a;

        public b(String str, d dVar) {
            super(str);
            this.f7741a = null;
            this.f7741a = dVar;
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            try {
                this.f7741a.j.a();
                fv.a(this.f7741a.C);
                this.f7741a.p();
                if (this.f7741a != null && this.f7741a.C != null) {
                    fq.b(this.f7741a.C);
                    fq.a(this.f7741a.C);
                }
                super.onLooperPrepared();
            } catch (Throwable unused) {
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public class c extends Handler {
        public c() {
        }

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str = null;
            try {
                super.handleMessage(message);
                if (d.this.p) {
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    Message obtainMessage = d.this.z.obtainMessage();
                    obtainMessage.what = 11;
                    obtainMessage.setData(message.getData());
                    d.this.z.sendMessage(obtainMessage);
                    return;
                }
                if (i != 2) {
                    if (i == 3) {
                        return;
                    }
                    if (i == 13) {
                        if (d.this.f7736a != null) {
                            d.this.a(d.this.f7736a);
                            return;
                        }
                        AMapLocation aMapLocation = new AMapLocation("LBS");
                        aMapLocation.setErrorCode(33);
                        d.this.a(aMapLocation);
                        return;
                    }
                    switch (i) {
                        case 5:
                            Bundle data = message.getData();
                            data.putBundle("optBundle", fr.a(d.this.b));
                            d.this.a(10, data);
                            return;
                        case 6:
                            Bundle data2 = message.getData();
                            if (d.this.d == null) {
                                return;
                            }
                            d.this.d.a(data2);
                            return;
                        case 7:
                            Bundle data3 = message.getData();
                            d.this.H = data3.getBoolean("ngpsAble");
                            return;
                        case 8:
                            fw.a((String) null, 2141);
                            break;
                        case 9:
                            boolean unused = d.I = message.getData().getBoolean("installMockApp");
                            return;
                        case 10:
                            d.this.a((AMapLocation) message.obj);
                            return;
                        default:
                            switch (i) {
                                case 100:
                                    fw.a((String) null, 2155);
                                    break;
                                case 101:
                                    break;
                                case 102:
                                    Bundle data4 = message.getData();
                                    data4.putBundle("optBundle", fr.a(d.this.b));
                                    d.this.a(15, data4);
                                    return;
                                case 103:
                                    Bundle data5 = message.getData();
                                    if (d.this.D == null) {
                                        return;
                                    }
                                    d.this.D.a(data5);
                                    return;
                                default:
                                    return;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 1028;
                            obtain.obj = message.obj;
                            d.this.z.sendMessage(obtain);
                            if (d.this.K == null || !d.this.K.getCacheCallBack() || d.this.c == null) {
                                return;
                            }
                            d.this.c.removeMessages(13);
                            return;
                    }
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 12;
                obtain2.obj = message.obj;
                d.this.z.sendMessage(obtain2);
                if (d.this.K == null || !d.this.K.getCacheCallBack() || d.this.c == null) {
                    return;
                }
                d.this.c.removeMessages(13);
            } catch (Throwable th) {
                if (0 == 0) {
                    str = "handleMessage";
                }
                fr.a(th, "AmapLocationManager$MainHandler", str);
            }
        }
    }

    public d(Context context, Intent intent, Looper looper) {
        this.m = null;
        this.C = context;
        this.m = intent;
        b(looper);
    }

    private a a(Looper looper) {
        a aVar;
        synchronized (this.r) {
            this.z = new a(looper);
            aVar = this.z;
        }
        return aVar;
    }

    private ew a(er erVar, boolean z) {
        if (this.b.isLocationCacheEnable()) {
            try {
                return erVar.a(z);
            } catch (Throwable th) {
                fr.a(th, "ALManager", "doFirstCacheLoc");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.r) {
            if (this.z != null) {
                this.z.removeMessages(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = new Bundle();
            } catch (Throwable th) {
                boolean z = (th instanceof IllegalStateException) && th.getMessage().contains("sending message to a Handler on a dead thread");
                if ((th instanceof RemoteException) || z) {
                    this.k = null;
                    this.E = false;
                }
                fr.a(th, "ALManager", "sendLocMessage");
                return;
            }
        }
        if (TextUtils.isEmpty(this.v)) {
            this.v = fr.b(this.C);
        }
        bundle.putString(com.taobao.android.msoa.c.TAG, this.v);
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.setData(bundle);
        obtain.replyTo = this.l;
        if (this.k != null) {
            this.k.send(obtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, long j) {
        synchronized (this.r) {
            if (this.z != null) {
                Message obtain = Message.obtain();
                obtain.what = i;
                if (obj instanceof Bundle) {
                    obtain.setData((Bundle) obj);
                } else {
                    obtain.obj = obj;
                }
                this.z.sendMessageDelayed(obtain, j);
            }
        }
    }

    private static void a(final Context context) {
        if (J.compareAndSet(false, true)) {
            cr.a().b(new cs() { // from class: com.loc.d.1
                @Override // com.loc.cs
                public final void a() {
                    o.l();
                    o.a(context);
                    o.f(context);
                }
            });
        }
    }

    private void a(Intent intent) {
        try {
            this.C.bindService(intent, this.M, 1);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "startServiceImpl");
        }
    }

    private void a(Intent intent, boolean z) {
        if (this.C != null) {
            if (Build.VERSION.SDK_INT >= 26 && z) {
                if (!t()) {
                    Log.e("amapapi", "-------------调用后台定位服务，缺少权限：android.permission.FOREGROUND_SERVICE--------------");
                    return;
                }
                try {
                    this.C.getClass().getMethod("startForegroundService", Intent.class).invoke(this.C, intent);
                } catch (Throwable unused) {
                }
                this.B = true;
            }
            this.C.startService(intent);
            this.B = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        eq eqVar;
        AMapLocation aMapLocation;
        AMapLocation aMapLocation2 = null;
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                aMapLocation = (AMapLocation) bundle.getParcelable(MspEventTypes.ACTION_INVOKE_LOC);
                this.A = bundle.getString("nb");
                eqVar = (eq) bundle.getParcelable(Ta.c);
                if (aMapLocation != null) {
                    try {
                        if (aMapLocation.getErrorCode() == 0 && this.d != null) {
                            this.d.c();
                            if (!TextUtils.isEmpty(aMapLocation.getAdCode())) {
                                h.y = aMapLocation;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fr.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
                        a(aMapLocation2, eqVar);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                eqVar = null;
                fr.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
                a(aMapLocation2, eqVar);
            }
        } else {
            eqVar = null;
            aMapLocation = null;
        }
        aMapLocation2 = this.d != null ? this.d.a(aMapLocation, this.A) : aMapLocation;
        a(aMapLocation2, eqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        try {
            Bundle data = message.getData();
            AMapLocation aMapLocation = (AMapLocation) data.getParcelable(MspEventTypes.ACTION_INVOKE_LOC);
            String string = data.getString("lastLocNb");
            f(aMapLocation);
            if (!this.j.a(aMapLocation, string)) {
                return;
            }
            this.j.d();
        } catch (Throwable th) {
            fr.a(th, "ALManager", "doSaveLastLocation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AMapLocation aMapLocation) {
        try {
            if (aMapLocation.getErrorCode() != 0) {
                aMapLocation.setLocationType(0);
            }
            if (aMapLocation.getErrorCode() == 0) {
                double latitude = aMapLocation.getLatitude();
                double longitude = aMapLocation.getLongitude();
                if ((latitude == mto.a.GEO_NOT_SUPPORT && longitude == mto.a.GEO_NOT_SUPPORT) || latitude < -90.0d || latitude > 90.0d || longitude < -180.0d || longitude > 180.0d) {
                    fw.a("errorLatLng", aMapLocation.toStr());
                    aMapLocation.setLocationType(0);
                    aMapLocation.setErrorCode(8);
                    aMapLocation.setLocationDetail("LatLng is error#0802");
                }
            }
            if (!"gps".equalsIgnoreCase(aMapLocation.getProvider()) && this.d.b()) {
                return;
            }
            aMapLocation.setAltitude(fy.c(aMapLocation.getAltitude()));
            aMapLocation.setBearing(fy.a(aMapLocation.getBearing()));
            aMapLocation.setSpeed(fy.a(aMapLocation.getSpeed()));
            c(aMapLocation);
            b(aMapLocation);
            Iterator<AMapLocationListener> it = this.e.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onLocationChanged(aMapLocation);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private synchronized void a(AMapLocation aMapLocation, eq eqVar) {
        if (aMapLocation == null) {
            try {
                aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(8);
                aMapLocation.setLocationDetail("amapLocation is null#0801");
            } catch (Throwable th) {
                fr.a(th, "ALManager", "handlerLocation part3");
                return;
            }
        }
        if (!"gps".equalsIgnoreCase(aMapLocation.getProvider())) {
            aMapLocation.setProvider(ndw.SP_PREFIX_KEY);
        }
        if (this.w == null) {
            this.w = new AMapLocationQualityReport();
        }
        this.w.setLocationMode(this.b.getLocationMode());
        if (this.d != null) {
            this.w.setGPSSatellites(this.d.e());
            this.w.setGpsStatus(this.d.d());
        }
        this.w.setWifiAble(fy.g(this.C));
        this.w.setNetworkType(fy.h(this.C));
        if (aMapLocation.getLocationType() == 1 || "gps".equalsIgnoreCase(aMapLocation.getProvider())) {
            this.w.setNetUseTime(0L);
        }
        if (eqVar != null) {
            this.w.setNetUseTime(eqVar.a());
        }
        this.w.setInstallHighDangerMockApp(I);
        aMapLocation.setLocationQualityReport(this.w);
        if (this.F) {
            a(aMapLocation, this.A);
            if (eqVar != null) {
                eqVar.d(fy.b());
            }
            fw.a(this.C, aMapLocation, eqVar);
            fw.a(this.C, aMapLocation);
            d(aMapLocation.m612clone());
            fv.a(this.C).a(aMapLocation);
            fv.a(this.C).b();
        }
        if (this.p) {
            return;
        }
        if (this.b.isOnceLocation()) {
            l();
            a(14, (Bundle) null);
        }
    }

    private void a(AMapLocation aMapLocation, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, aMapLocation);
        bundle.putString("lastLocNb", str);
        a(1014, bundle, 0L);
    }

    private static void a(er erVar) {
        try {
            erVar.d();
            erVar.a(new AMapLocationClientOption().setNeedAddress(false));
            erVar.a(true, new eq());
        } catch (Throwable th) {
            fr.a(th, "ALManager", "apsLocation:doFirstNetLocate 2");
        }
    }

    private void a(er erVar, eq eqVar) {
        try {
            erVar.a(this.C);
            erVar.a(this.b);
            erVar.b(eqVar);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "initApsBase");
        }
    }

    private static void a(er erVar, ew ewVar) {
        if (ewVar != null) {
            try {
                if (ewVar.getErrorCode() != 0) {
                    return;
                }
                erVar.b(ewVar);
            } catch (Throwable th) {
                fr.a(th, "ALManager", "apsLocation:doFirstAddCache");
            }
        }
    }

    private ew b(er erVar) {
        ew ewVar;
        boolean z;
        String str;
        AMapLocation aMapLocation = null;
        this.f7736a = null;
        eq eqVar = new eq();
        try {
            eqVar.c(fy.b());
            String apikey = AMapLocationClientOption.getAPIKEY();
            if (!TextUtils.isEmpty(apikey)) {
                m.a(this.C, apikey);
            }
            String umidtoken = UmidtokenInfo.getUmidtoken();
            if (!TextUtils.isEmpty(umidtoken)) {
                o.a(umidtoken);
            }
            a(erVar, eqVar);
            boolean l = fq.l();
            boolean z2 = false;
            if (this.K.getCacheCallBack()) {
                ewVar = a(erVar, this.K.getCacheCallBack());
                if (ewVar != null) {
                    if (!fq.a(ewVar.getTime())) {
                        if (this.K.getCacheCallBack()) {
                            int cacheTimeOut = this.K.getCacheTimeOut();
                            long a2 = fy.a() - ewVar.getTime();
                            if (a2 > 0 && a2 < cacheTimeOut) {
                                this.f7736a = ewVar;
                                this.f7736a.setLocationType(10);
                            }
                        }
                    }
                }
                ewVar = null;
            } else {
                ewVar = a(erVar, false);
            }
            if (ewVar == null) {
                try {
                    ewVar = erVar.a(!l, eqVar);
                    if (ewVar != null && ewVar.getErrorCode() == 0) {
                        z2 = true;
                    }
                    z = z2;
                    z2 = true;
                }
            } else {
                z = false;
            }
            if (ewVar != null) {
                str = ewVar.k();
                aMapLocation = ewVar.m612clone();
            } else {
                str = null;
            }
            if (this.b.isLocationCacheEnable() && this.j != null) {
                aMapLocation = this.j.a(aMapLocation, str, this.b.getLastLocationLifeCycle());
            }
            try {
                if (this.K.getCacheCallBack() && this.c != null) {
                    this.c.removeMessages(13);
                }
            } catch (Throwable unused) {
            }
            Bundle bundle = new Bundle();
            if (aMapLocation != null) {
                bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, aMapLocation);
                bundle.putString("nb", ewVar.k());
                bundle.putParcelable(Ta.c, eqVar);
            }
            a(bundle);
            if (z) {
                a(erVar, ewVar);
            }
            if (z2 && l && !g) {
                g = true;
                a(erVar);
            }
        } catch (Throwable th) {
            ewVar = null;
            try {
                fr.a(th, "ALManager", "apsLocation");
            } catch (Throwable th2) {
                try {
                    erVar.e();
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
        try {
            erVar.e();
        } catch (Throwable unused3) {
            return ewVar;
        }
    }

    private void b(Looper looper) {
        try {
            if (looper == null) {
                this.c = Looper.myLooper() == null ? new c(this.C.getMainLooper()) : new c();
            } else {
                this.c = new c(looper);
            }
        } catch (Throwable th) {
            fr.a(th, "ALManager", "init 1");
        }
        try {
            this.j = new j(this.C);
            this.o = new b("amapLocManagerThread", this);
            this.o.setPriority(5);
            this.o.start();
            this.z = a(this.o.getLooper());
            try {
                this.d = new h(this.C, this.c);
                this.D = new g(this.C, this.c);
            } catch (Throwable th2) {
                fr.a(th2, "ALManager", "init 3");
            }
            if (this.s == null) {
                this.s = new fw();
            }
            a(this.C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        try {
            AMapLocation aMapLocation = (AMapLocation) message.obj;
            if (this.h && this.k != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", fr.a(this.b));
                a(0, bundle);
                if (this.F) {
                    a(13, (Bundle) null);
                }
                this.h = false;
            }
            a(aMapLocation, (eq) null);
            a(1025);
            a(1025, (Object) null, 300000L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    private static void b(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            return;
        }
        try {
            if (2 != aMapLocation.getLocationType() && 4 != aMapLocation.getLocationType()) {
                return;
            }
            long time = aMapLocation.getTime();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis <= time) {
                return;
            }
            aMapLocation.setTime(currentTimeMillis);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        if (message == null) {
            return;
        }
        try {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            int i = data.getInt(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, 0);
            Intent q = q();
            q.putExtra(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, i);
            q.putExtra("h", (Notification) data.getParcelable("h"));
            q.putExtra(at.f, 1);
            a(q, true);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "doEnableBackgroundLocation");
        }
    }

    private void c(AMapLocation aMapLocation) {
        if (aMapLocation != null) {
            try {
                String locationDetail = aMapLocation.getLocationDetail();
                StringBuilder sb = TextUtils.isEmpty(locationDetail) ? new StringBuilder() : new StringBuilder(locationDetail);
                boolean c2 = fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF");
                boolean c3 = fy.c(this.C, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF");
                boolean c4 = fy.c(this.C, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==");
                boolean c5 = fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=");
                boolean c6 = fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O");
                boolean c7 = fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=");
                sb.append(c2 ? "#pm1" : "#pm0");
                String str = "1";
                sb.append(c3 ? str : "0");
                sb.append(c4 ? str : "0");
                sb.append(c5 ? str : "0");
                sb.append(c6 ? str : "0");
                if (!c7) {
                    str = "0";
                }
                sb.append(str);
                aMapLocation.setLocationDetail(sb.toString());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener != null) {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            if (this.e.contains(aMapLocationListener)) {
                return;
            }
            this.e.add(aMapLocationListener);
            return;
        }
        throw new IllegalArgumentException("listener参数不能为null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        if (message == null) {
            return;
        }
        try {
            Bundle data = message.getData();
            if (data == null) {
                return;
            }
            boolean z = data.getBoolean(at.j, true);
            Intent q = q();
            q.putExtra(at.j, z);
            q.putExtra(at.f, 2);
            a(q, false);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "doDisableBackgroundLocation");
        }
    }

    private void d(AMapLocation aMapLocation) {
        Message obtainMessage = this.c.obtainMessage();
        obtainMessage.what = 10;
        obtainMessage.obj = aMapLocation;
        this.c.sendMessage(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AMapLocationListener aMapLocationListener) {
        if (!this.e.isEmpty() && this.e.contains(aMapLocationListener)) {
            this.e.remove(aMapLocationListener);
        }
        if (this.e.isEmpty()) {
            l();
        }
    }

    private synchronized void e(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            try {
                aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(8);
                aMapLocation.setLocationDetail("coarse amapLocation is null#2005");
            } catch (Throwable th) {
                fr.a(th, "ALManager", "handlerCoarseLocation part2");
                return;
            }
        }
        if (this.w == null) {
            this.w = new AMapLocationQualityReport();
        }
        this.w.setLocationMode(this.b.getLocationMode());
        if (this.D != null) {
            this.w.setGPSSatellites(aMapLocation.getSatellites());
            this.w.setGpsStatus(this.D.b());
        }
        this.w.setWifiAble(fy.g(this.C));
        this.w.setNetworkType(fy.h(this.C));
        this.w.setNetUseTime(0L);
        this.w.setInstallHighDangerMockApp(I);
        aMapLocation.setLocationQualityReport(this.w);
        if (this.F) {
            fw.a(this.C, aMapLocation);
            d(aMapLocation.m612clone());
            fv.a(this.C).a(aMapLocation);
            fv.a(this.C).b();
        }
        if (this.p) {
            return;
        }
        if (this.D != null) {
            l();
        }
        a(14, (Bundle) null);
    }

    private void f(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            return;
        }
        AMapLocation aMapLocation2 = null;
        try {
            if (j.b != null) {
                aMapLocation2 = j.b.a();
            } else if (this.j != null) {
                aMapLocation2 = this.j.b();
            }
            fw.a(aMapLocation2, aMapLocation);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(AMapLocation aMapLocation) {
        try {
            if (this.i && this.k != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", fr.a(this.b));
                a(0, bundle);
                if (this.F) {
                    a(13, (Bundle) null);
                }
                this.i = false;
            }
            e(aMapLocation);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    private void h() {
        synchronized (this.r) {
            if (this.z != null) {
                this.z.removeCallbacksAndMessages(null);
            }
            this.z = null;
        }
    }

    private boolean i() {
        boolean z = false;
        int i = 0;
        do {
            try {
                if (this.k != null) {
                    break;
                }
                Thread.sleep(100L);
                i++;
            } catch (Throwable th) {
                fr.a(th, "ALManager", "checkAPSManager");
            }
        } while (i < 50);
        if (this.k == null) {
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setErrorCode(10);
            aMapLocation.setLocationDetail(!fy.k(this.C.getApplicationContext()) ? "请检查配置文件是否配置服务，并且manifest中service标签是否配置在application标签内#1003" : "启动ApsServcie失败#1001");
            bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, aMapLocation);
            obtain.setData(bundle);
            obtain.what = 1;
            this.c.sendMessage(obtain);
        } else {
            z = true;
        }
        if (!z) {
            fw.a((String) null, !fy.k(this.C.getApplicationContext()) ? 2103 : 2101);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        if ((Build.VERSION.SDK_INT < 29 && Build.VERSION.SDK_INT >= 23 && !fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") && !fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) || ((Build.VERSION.SDK_INT < 31 && Build.VERSION.SDK_INT >= 29 && this.C.getApplicationInfo().targetSdkVersion >= 29 && !fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) || ((Build.VERSION.SDK_INT < 31 && Build.VERSION.SDK_INT >= 29 && this.C.getApplicationInfo().targetSdkVersion < 29 && !fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") && !fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) || (Build.VERSION.SDK_INT >= 31 && !fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") && !fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O"))))) {
            k();
            return;
        }
        if (this.b == null) {
            this.b = new AMapLocationClientOption();
        }
        if (this.F) {
            return;
        }
        this.F = true;
        int i = AnonymousClass3.f7739a[this.b.getLocationMode().ordinal()];
        long j = 0;
        if (i == 1) {
            a(1027, (Object) null, 0L);
            a(1017, (Object) null, 0L);
            a(1016, (Object) null, 0L);
        } else if (i == 2) {
            if (fy.m(this.C)) {
                a(1016);
                a(1017, (Object) null, 0L);
                a(1026, (Object) null, 0L);
                return;
            }
            a(1016);
            a(1027, (Object) null, 0L);
            a(1015, (Object) null, 0L);
        } else {
            if (i == 3) {
                if (fy.m(this.C)) {
                    a(1016);
                    a(1017, (Object) null, 0L);
                    a(1026, (Object) null, 0L);
                    return;
                }
                a(1027, (Object) null, 0L);
                a(1015, (Object) null, 0L);
                if (this.b.isGpsFirst() && this.b.isOnceLocation()) {
                    j = this.b.getGpsFirstTimeout();
                }
                a(1016, (Object) null, j);
            }
        }
    }

    private void k() {
        AMapLocation aMapLocation = new AMapLocation("");
        aMapLocation.setErrorCode(12);
        aMapLocation.setLocationDetail("定位权限被禁用,请授予应用定位权限 #1201");
        if (this.w == null) {
            this.w = new AMapLocationQualityReport();
        }
        this.w = new AMapLocationQualityReport();
        this.w.setGpsStatus(4);
        this.w.setGPSSatellites(0);
        this.w.setLocationMode(this.b.getLocationMode());
        this.w.setWifiAble(fy.g(this.C));
        this.w.setNetworkType(fy.h(this.C));
        this.w.setNetUseTime(0L);
        aMapLocation.setLocationQualityReport(this.w);
        fw.a((String) null, 2121);
        d(aMapLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            a(1025);
            if (this.d != null) {
                this.d.a();
            }
            if (this.D != null) {
                this.D.a();
            }
            a(1016);
            this.F = false;
            this.n = 0;
        } catch (Throwable th) {
            fr.a(th, "ALManager", "stopLocation");
        }
    }

    private void m() {
        ew b2 = b(new er(true));
        if (i()) {
            Bundle bundle = new Bundle();
            String str = (b2 == null || !(b2.getLocationType() == 2 || b2.getLocationType() == 4)) ? "0" : "1";
            bundle.putBundle("optBundle", fr.a(this.b));
            bundle.putString("isCacheLoc", str);
            a(0, bundle);
            if (!this.F) {
                return;
            }
            a(13, (Bundle) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (G || (!this.t && !this.N)) {
                G = false;
                this.N = true;
                m();
            } else {
                if (this.t && !a() && !this.y) {
                    this.y = true;
                    p();
                }
                if (i()) {
                    this.y = false;
                    Bundle bundle = new Bundle();
                    bundle.putBundle("optBundle", fr.a(this.b));
                    bundle.putString(Repeat.D, UmidtokenInfo.getUmidtoken());
                    if (!this.d.b()) {
                        a(1, bundle);
                    }
                }
            }
            try {
                if (this.b.isOnceLocation()) {
                    return;
                }
                o();
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            try {
                fr.a(th, "ALManager", "doLBSLocation");
                try {
                    if (this.b.isOnceLocation()) {
                        return;
                    }
                    o();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th2) {
                try {
                    if (!this.b.isOnceLocation()) {
                        o();
                    }
                } catch (Throwable unused3) {
                }
                throw th2;
            }
        }
    }

    private void o() {
        if (this.b.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
            long j = 1000;
            if (this.b.getInterval() >= 1000) {
                j = this.b.getInterval();
            }
            a(1016, (Object) null, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        try {
            if (this.l == null) {
                this.l = new Messenger(this.c);
            }
            a(q());
        } catch (Throwable unused) {
        }
    }

    private Intent q() {
        String str;
        if (this.m == null) {
            this.m = new Intent(this.C, APSService.class);
        }
        try {
            str = !TextUtils.isEmpty(AMapLocationClientOption.getAPIKEY()) ? AMapLocationClientOption.getAPIKEY() : l.f(this.C);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "startServiceImpl p2");
            str = "";
        }
        this.m.putExtra("a", str);
        this.m.putExtra(TplMsg.VALUE_T_NATIVE_RETURN, l.c(this.C));
        this.m.putExtra(Repeat.D, UmidtokenInfo.getUmidtoken());
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            StringBuilder sb = new StringBuilder();
            new eq().f("#2001");
            sb.append("模糊权限下不支持低功耗定位#2001");
            fw.a((String) null, 2153);
            ew ewVar = new ew("");
            ewVar.setErrorCode(20);
            ewVar.setLocationDetail(sb.toString());
            g(ewVar);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "apsLocation:callback");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        fw fwVar;
        Context context;
        int i;
        this.d.b(this.b);
        this.D.b(this.b);
        if (this.F && !this.b.getLocationMode().equals(this.q)) {
            l();
            j();
        }
        this.q = this.b.getLocationMode();
        if (this.s != null) {
            if (this.b.isOnceLocation()) {
                fwVar = this.s;
                context = this.C;
                i = 0;
            } else {
                fwVar = this.s;
                context = this.C;
                i = 1;
            }
            fwVar.a(context, i);
            this.s.a(this.C, this.b);
        }
    }

    private boolean t() {
        if (fy.j(this.C)) {
            int i = -1;
            try {
                i = fu.b(((Application) this.C.getApplicationContext()).getBaseContext(), "checkSelfPermission", "android.permission.FOREGROUND_SERVICE");
            } catch (Throwable unused) {
            }
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public final void a(int i, Notification notification) {
        if (i == 0 || notification == null) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, i);
            bundle.putParcelable("h", notification);
            a(1023, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    public final void a(WebView webView) {
        if (this.L == null) {
            this.L = new i(this.C, webView);
        }
        this.L.a();
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.K = aMapLocationClientOption.m613clone();
            a(1018, aMapLocationClientOption.m613clone(), 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "setLocationOption");
        }
    }

    public final void a(AMapLocationListener aMapLocationListener) {
        try {
            a(1002, aMapLocationListener, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "setLocationListener");
        }
    }

    public final void a(boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(at.j, z);
            a(1024, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    public final boolean a() {
        return this.E;
    }

    public final void b() {
        try {
            if (this.K.getCacheCallBack() && this.c != null) {
                this.c.sendEmptyMessageDelayed(13, this.K.getCacheCallBackTime());
            }
        } catch (Throwable unused) {
        }
        try {
            a(1003, (Object) null, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "startLocation");
        }
    }

    public final void b(AMapLocationListener aMapLocationListener) {
        try {
            a(1005, aMapLocationListener, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "unRegisterLocationListener");
        }
    }

    public final void c() {
        try {
            a(1004, (Object) null, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "stopLocation");
        }
    }

    public final void d() {
        try {
            if (this.L != null) {
                this.L.b();
                this.L = null;
            }
            a(1011, (Object) null, 0L);
            this.p = true;
        } catch (Throwable th) {
            fr.a(th, "ALManager", MessageID.onDestroy);
        }
    }

    public final AMapLocation e() {
        AMapLocation aMapLocation = null;
        try {
            if (this.j != null && (aMapLocation = this.j.b()) != null) {
                aMapLocation.setTrustedLevel(3);
            }
        } catch (Throwable th) {
            fr.a(th, "ALManager", "getLastKnownLocation");
        }
        return aMapLocation;
    }

    public final void f() {
        try {
            if (this.L == null) {
                return;
            }
            this.L.b();
            this.L = null;
        } catch (Throwable th) {
            fr.a(th, "ALManager", "stopAssistantLocation");
        }
    }

    final void g() {
        a(12, (Bundle) null);
        this.h = true;
        this.i = true;
        this.E = false;
        this.t = false;
        l();
        fw fwVar = this.s;
        if (fwVar != null) {
            fwVar.b(this.C);
        }
        fv.a(this.C).a();
        fw.a(this.C);
        e eVar = this.u;
        if (eVar != null) {
            eVar.b().sendEmptyMessage(11);
        } else {
            ServiceConnection serviceConnection = this.M;
            if (serviceConnection != null) {
                this.C.unbindService(serviceConnection);
            }
        }
        try {
            if (this.B) {
                this.C.stopService(q());
            }
        } catch (Throwable unused) {
        }
        this.B = false;
        ArrayList<AMapLocationListener> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
            this.e = null;
        }
        this.M = null;
        h();
        if (this.o != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    fu.a(this.o, HandlerThread.class, "quitSafely", new Object[0]);
                } catch (Throwable unused2) {
                }
            }
            this.o.quit();
        }
        this.o = null;
        c cVar = this.c;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        j jVar = this.j;
        if (jVar != null) {
            jVar.c();
            this.j = null;
        }
    }
}
