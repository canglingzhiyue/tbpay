package com.loc;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.security.ccrc.service.build.Ta;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.search.common.util.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {
    static boolean g = false;
    Context e;
    private List<Messenger> w;
    private boolean o = false;
    private boolean p = false;

    /* renamed from: a  reason: collision with root package name */
    String f7754a = null;
    b b = null;
    private long q = 0;
    private long r = 0;
    private ew s = null;
    AMapLocation c = null;
    private long t = 0;
    private int u = 0;
    a d = null;
    private j v = null;
    er f = null;
    HashMap<Messenger, Long> h = new HashMap<>();
    fw i = null;
    long j = 0;
    long k = 0;
    String l = null;
    private boolean x = true;
    private String y = "";
    AMapLocationClientOption m = null;
    AMapLocationClientOption n = new AMapLocationClientOption();

    /* loaded from: classes4.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: Throwable -> 0x011c, TryCatch #1 {Throwable -> 0x011c, blocks: (B:21:0x0058, B:24:0x005e, B:55:0x0118, B:26:0x0063, B:27:0x006c, B:28:0x0071, B:30:0x0075, B:32:0x007d, B:34:0x0089, B:35:0x0092, B:37:0x009a, B:39:0x00a6, B:40:0x00ae, B:42:0x00b2, B:44:0x00ba, B:46:0x00c6, B:48:0x00db, B:49:0x00e1, B:50:0x00e7, B:51:0x00ed, B:52:0x00f8, B:53:0x0103, B:54:0x010e, B:20:0x0051), top: B:62:0x0051 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r9) {
            /*
                Method dump skipped, instructions count: 312
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.e.a.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            try {
                e.this.v = new j(e.this.e);
                fq.b(e.this.e);
                fq.a(e.this.e);
                e.this.f = new er(false);
                super.onLooperPrepared();
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable th) {
                fr.a(th, "APSManager$ActionThread", "run");
            }
        }
    }

    public e(Context context) {
        this.e = null;
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ew a(int i, String str) {
        try {
            ew ewVar = new ew("");
            ewVar.setErrorCode(i);
            ewVar.setLocationDetail(str);
            return ewVar;
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "newInstanceAMapLoc");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        try {
            if (this.o) {
                if (this.f == null) {
                    return;
                }
                this.f.a();
                return;
            }
            fr.a(this.e);
            if (bundle != null) {
                this.n = fr.a(bundle.getBundle("optBundle"));
            }
            this.f.a(this.e);
            this.f.b();
            a(this.n);
            this.f.c();
            this.o = true;
            this.x = true;
            this.y = "";
            if (this.w == null || this.w.size() <= 0) {
                return;
            }
            e();
        } catch (Throwable th) {
            this.x = false;
            th.printStackTrace();
            this.y = th.getMessage();
            fr.a(th, "ApsServiceCore", "init");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger) {
        this.h.remove(messenger);
    }

    private static void a(Messenger messenger, int i, Bundle bundle) {
        if (messenger != null) {
            try {
                Message obtain = Message.obtain();
                obtain.setData(bundle);
                obtain.what = i;
                messenger.send(obtain);
            } catch (Throwable th) {
                fr.a(th, "ApsServiceCore", "sendMessage");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger, Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty() || this.p) {
                    return;
                }
                this.p = true;
                b(messenger);
            } catch (Throwable th) {
                fr.a(th, "ApsServiceCore", "doInitAuth");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger, AMapLocation aMapLocation, String str, eq eqVar) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, aMapLocation);
        bundle.putString("nb", str);
        bundle.putParcelable(Ta.c, eqVar);
        this.h.put(messenger, Long.valueOf(fy.b()));
        a(messenger, 1, bundle);
    }

    private void a(Messenger messenger, String str) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putInt("I_MAX_GEO_DIS", fq.i() * 3);
        bundle.putInt("I_MIN_GEO_DIS", fq.i());
        bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, this.c);
        a(messenger, "COARSE_LOC".equals(str) ? 103 : 6, bundle);
    }

    private void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (this.f != null) {
                this.f.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption == null) {
                return;
            }
            g = aMapLocationClientOption.isKillProcess();
            if (this.m != null) {
                if (aMapLocationClientOption.isOffset() != this.m.isOffset() || aMapLocationClientOption.isNeedAddress() != this.m.isNeedAddress() || aMapLocationClientOption.isLocationCacheEnable() != this.m.isLocationCacheEnable() || this.m.getGeoLanguage() != aMapLocationClientOption.getGeoLanguage()) {
                    this.r = 0L;
                }
                if (aMapLocationClientOption.isOffset() != this.m.isOffset() || this.m.getGeoLanguage() != aMapLocationClientOption.getGeoLanguage()) {
                    this.c = null;
                }
            }
            this.m = aMapLocationClientOption;
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "setExtra");
        }
    }

    private static AMapLocationClientOption b(Bundle bundle) {
        AMapLocationClientOption aMapLocationClientOption = null;
        try {
            aMapLocationClientOption = fr.a(bundle.getBundle("optBundle"));
            String string = bundle.getString(Repeat.D);
            if (!StringUtils.isEmpty(string)) {
                o.a(string);
            }
        } catch (Throwable th) {
            fr.a(th, "APSManager", "parseBundle");
        }
        return aMapLocationClientOption;
    }

    private void b(Messenger messenger) {
        try {
            this.f.f();
            if (!fq.k()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("installMockApp", true);
            a(messenger, 9, bundle);
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "initAuth");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130 A[Catch: Throwable -> 0x0177, TryCatch #2 {Throwable -> 0x0177, blocks: (B:4:0x0008, B:7:0x0010, B:9:0x0029, B:11:0x002f, B:14:0x0047, B:16:0x004c, B:18:0x007b, B:20:0x0088, B:22:0x0091, B:24:0x00a4, B:43:0x0128, B:45:0x0130, B:46:0x0136, B:48:0x013a, B:49:0x0145, B:51:0x0149, B:62:0x0173, B:54:0x0157, B:56:0x015d, B:58:0x0161, B:26:0x00ad, B:28:0x00bf, B:31:0x00c9, B:33:0x00d1, B:38:0x00f1, B:34:0x00d9, B:36:0x00e2, B:37:0x00ea), top: B:67:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a A[Catch: Throwable -> 0x0177, TryCatch #2 {Throwable -> 0x0177, blocks: (B:4:0x0008, B:7:0x0010, B:9:0x0029, B:11:0x002f, B:14:0x0047, B:16:0x004c, B:18:0x007b, B:20:0x0088, B:22:0x0091, B:24:0x00a4, B:43:0x0128, B:45:0x0130, B:46:0x0136, B:48:0x013a, B:49:0x0145, B:51:0x0149, B:62:0x0173, B:54:0x0157, B:56:0x015d, B:58:0x0161, B:26:0x00ad, B:28:0x00bf, B:31:0x00c9, B:33:0x00d1, B:38:0x00f1, B:34:0x00d9, B:36:0x00e2, B:37:0x00ea), top: B:67:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149 A[Catch: Throwable -> 0x0177, TRY_LEAVE, TryCatch #2 {Throwable -> 0x0177, blocks: (B:4:0x0008, B:7:0x0010, B:9:0x0029, B:11:0x002f, B:14:0x0047, B:16:0x004c, B:18:0x007b, B:20:0x0088, B:22:0x0091, B:24:0x00a4, B:43:0x0128, B:45:0x0130, B:46:0x0136, B:48:0x013a, B:49:0x0145, B:51:0x0149, B:62:0x0173, B:54:0x0157, B:56:0x015d, B:58:0x0161, B:26:0x00ad, B:28:0x00bf, B:31:0x00c9, B:33:0x00d1, B:38:0x00f1, B:34:0x00d9, B:36:0x00e2, B:37:0x00ea), top: B:67:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.os.Messenger r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.e.b(android.os.Messenger, android.os.Bundle):void");
    }

    public static void d() {
        g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (fy.m(this.e)) {
            new Object[1][0] = "Cl | dl -- sc_cpo";
            return;
        }
        try {
            if (this.f == null || this.f == null) {
                return;
            }
            this.f.a(this.d);
            this.f.g();
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "startColl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            fq.c(this.e);
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "doCallOtherSer");
        }
    }

    public final void a() {
        try {
            this.i = new fw();
            this.b = new b("amapLocCoreThread");
            this.b.setPriority(5);
            this.b.start();
            this.d = new a(this.b.getLooper());
            this.w = new ArrayList();
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", i.b.MEASURE_ONCREATE);
        }
    }

    public final void a(Intent intent) {
        a aVar;
        if (!"true".equals(intent.getStringExtra("as")) || (aVar = this.d) == null) {
            return;
        }
        aVar.sendEmptyMessageDelayed(9, 100L);
    }

    final void a(Messenger messenger, Bundle bundle, String str) {
        AMapLocationClientOption b2;
        float f;
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                double d = bundle.getDouble(DispatchConstants.LATITUDE);
                double d2 = bundle.getDouble("lon");
                float f2 = bundle.getFloat("radius");
                long j = bundle.getLong("time");
                if ("FINE_LOC".equals(str)) {
                    AMapLocation aMapLocation = new AMapLocation("gps");
                    aMapLocation.setLatitude(d);
                    aMapLocation.setLocationType(1);
                    aMapLocation.setLongitude(d2);
                    aMapLocation.setAccuracy(f2);
                    aMapLocation.setTime(j);
                    this.f.a(aMapLocation);
                }
                if (fq.h() && (b2 = b(bundle)) != null && b2.isNeedAddress()) {
                    a(b2);
                    if (this.c != null) {
                        f = fy.a(new double[]{d, d2, this.c.getLatitude(), this.c.getLongitude()});
                        if (f < fq.i() * 3) {
                            a(messenger, str);
                        }
                    } else {
                        f = -1.0f;
                    }
                    if (f != -1.0f && f <= fq.i()) {
                        return;
                    }
                    a(bundle);
                    this.c = this.f.a(d, d2);
                    if (this.c == null || StringUtils.isEmpty(this.c.getAdCode())) {
                        return;
                    }
                    a(messenger, str);
                }
            } catch (Throwable th) {
                fr.a(th, "ApsServiceCore", "doLocationGeo");
            }
        }
    }

    public final boolean a(String str) {
        if (StringUtils.isEmpty(this.l)) {
            this.l = fr.b(this.e);
        }
        return !StringUtils.isEmpty(str) && str.equals(this.l);
    }

    public final Handler b() {
        return this.d;
    }

    public final void b(Intent intent) {
        String stringExtra = intent.getStringExtra("a");
        if (!StringUtils.isEmpty(stringExtra)) {
            m.a(this.e, stringExtra);
        }
        this.f7754a = intent.getStringExtra(TplMsg.VALUE_T_NATIVE_RETURN);
        l.a(this.f7754a);
        String stringExtra2 = intent.getStringExtra(Repeat.D);
        if (!StringUtils.isEmpty(stringExtra2)) {
            o.a(stringExtra2);
        }
    }

    public final void c() {
        try {
            if (this.h != null) {
                this.h.clear();
                this.h = null;
            }
            if (this.w != null) {
                this.w.clear();
            }
            if (this.v != null) {
                this.v.c();
                this.v = null;
            }
            this.o = false;
            this.p = false;
            this.f.e();
            if (this.d != null) {
                this.d.removeCallbacksAndMessages(null);
            }
            this.d = null;
            if (this.b != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    fu.a(this.b, HandlerThread.class, "quitSafely", new Object[0]);
                } else {
                    this.b.quit();
                }
            }
            this.b = null;
            if (this.i != null && this.j != 0 && this.k != 0) {
                long b2 = fy.b() - this.j;
                fw.a(this.e, this.i.c(this.e), this.i.d(this.e), this.k, b2);
                this.i.e(this.e);
            }
            fw.a(this.e);
            av.b();
            if (!g) {
                return;
            }
            Process.killProcess(Process.myPid());
        } catch (Throwable th) {
            fr.a(th, "apm", "tdest");
        }
    }
}
