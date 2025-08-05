package com.loc;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.fence.GeoFence;
import com.amap.api.fence.GeoFenceListener;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.DPoint;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.extension.UCExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import tb.cew;
import tb.mto;
import tb.rlp;

/* loaded from: classes4.dex */
public final class a {
    private static boolean A = false;
    Context b;

    /* renamed from: a  reason: collision with root package name */
    fw f7638a = null;
    PendingIntent c = null;
    String d = null;
    GeoFenceListener e = null;
    private Object z = new Object();
    volatile int f = 1;
    ArrayList<GeoFence> g = new ArrayList<>();
    c h = null;
    Object i = new Object();
    Object j = new Object();
    HandlerC0269a k = null;
    b l = null;
    volatile boolean m = false;
    volatile boolean n = false;
    volatile boolean o = false;
    com.loc.b p = null;
    com.loc.c q = null;
    AMapLocationClient r = null;
    volatile AMapLocation s = null;
    long t = 0;
    AMapLocationClientOption u = null;
    int v = 0;
    AMapLocationListener w = new AMapLocationListener() { // from class: com.loc.a.1
        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            boolean z;
            int i;
            try {
                if (a.this.y || !a.this.o) {
                    return;
                }
                a.this.s = aMapLocation;
                if (aMapLocation != null) {
                    i = aMapLocation.getErrorCode();
                    if (aMapLocation.getErrorCode() == 0) {
                        a.this.t = fy.b();
                        a.this.a(5, (Bundle) null, 0L);
                        z = true;
                    } else {
                        a.a("定位失败", aMapLocation.getErrorCode(), aMapLocation.getErrorInfo(), "locationDetail:" + aMapLocation.getLocationDetail());
                        z = false;
                    }
                } else {
                    z = false;
                    i = 8;
                }
                if (z) {
                    a.this.v = 0;
                    a.this.a(6, (Bundle) null, 0L);
                    return;
                }
                Bundle bundle = new Bundle();
                if (!a.this.m) {
                    a.this.b(7);
                    bundle.putLong(Constants.Name.INTERVAL, 2000L);
                    a.this.a(8, bundle, 2000L);
                }
                a.this.v++;
                if (a.this.v < 3) {
                    return;
                }
                bundle.putInt(GeoFence.BUNDLE_KEY_LOCERRORCODE, i);
                a.this.a(1002, bundle);
            } catch (Throwable unused) {
            }
        }
    };
    final int x = 3;
    volatile boolean y = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.loc.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class HandlerC0269a extends Handler {
        public HandlerC0269a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 0:
                        a.this.b(message.getData());
                        return;
                    case 1:
                        a.this.c(message.getData());
                        return;
                    case 2:
                        a.this.e(message.getData());
                        return;
                    case 3:
                        a.this.d(message.getData());
                        return;
                    case 4:
                        a.this.f(message.getData());
                        return;
                    case 5:
                        a.this.e();
                        return;
                    case 6:
                        a.this.a(a.this.s);
                        return;
                    case 7:
                        a.this.d();
                        return;
                    case 8:
                        a.this.j(message.getData());
                        return;
                    case 9:
                        a.this.a(message.getData());
                        return;
                    case 10:
                        a.this.c();
                        return;
                    case 11:
                        a.this.h(message.getData());
                        return;
                    case 12:
                        a.this.g(message.getData());
                        return;
                    case 13:
                        a.this.g();
                        return;
                    default:
                        return;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends Handler {
        public c() {
        }

        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                Bundle data = message.getData();
                switch (message.what) {
                    case 1000:
                        a.this.i(data);
                        return;
                    case 1001:
                        a.this.b((GeoFence) data.getParcelable("geoFence"));
                        return;
                    case 1002:
                        a.this.c(data.getInt(GeoFence.BUNDLE_KEY_LOCERRORCODE));
                        return;
                    default:
                        return;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public a(Context context) {
        this.b = null;
        try {
            this.b = context.getApplicationContext();
            j();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManger", "<init>");
        }
    }

    private static float a(AMapLocation aMapLocation, List<GeoFence> list) {
        float f = Float.MAX_VALUE;
        if (aMapLocation != null && aMapLocation.getErrorCode() == 0 && list != null && !list.isEmpty()) {
            DPoint dPoint = new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude());
            for (GeoFence geoFence : list) {
                if (geoFence.isAble()) {
                    float a2 = fy.a(dPoint, geoFence.getCenter());
                    if (a2 > geoFence.getMinDis2Center() && a2 < geoFence.getMaxDis2Center()) {
                        return 0.0f;
                    }
                    if (a2 > geoFence.getMaxDis2Center()) {
                        f = Math.min(f, a2 - geoFence.getMaxDis2Center());
                    }
                    if (a2 < geoFence.getMinDis2Center()) {
                        f = Math.min(f, geoFence.getMinDis2Center() - a2);
                    }
                }
            }
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(DPoint dPoint, List<DPoint> list) {
        float f = Float.MAX_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            for (DPoint dPoint2 : list) {
                f = Math.min(f, fy.a(dPoint, dPoint2));
            }
        }
        return f;
    }

    private int a(List<GeoFence> list) {
        try {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            for (GeoFence geoFence : list) {
                c(geoFence);
            }
            return 0;
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "addGeoFenceList");
            a("添加围栏失败", 8, th.getMessage(), new String[0]);
            return 8;
        }
    }

    private static Bundle a(GeoFence geoFence, String str, String str2, int i, int i2) {
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString(GeoFence.BUNDLE_KEY_FENCEID, str);
        bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str2);
        bundle.putInt("event", i);
        bundle.putInt(GeoFence.BUNDLE_KEY_LOCERRORCODE, i2);
        bundle.putParcelable("fence", geoFence);
        return bundle;
    }

    private GeoFence a(Bundle bundle, boolean z) {
        GeoFence geoFence = new GeoFence();
        ArrayList arrayList = new ArrayList();
        DPoint dPoint = new DPoint();
        if (z) {
            geoFence.setType(1);
            arrayList = bundle.getParcelableArrayList("pointList");
            if (arrayList != null) {
                dPoint = b(arrayList);
            }
            geoFence.setMaxDis2Center(b(dPoint, arrayList));
            geoFence.setMinDis2Center(a(dPoint, arrayList));
        } else {
            geoFence.setType(0);
            dPoint = (DPoint) bundle.getParcelable("centerPoint");
            if (dPoint != null) {
                arrayList.add(dPoint);
            }
            float f = 1000.0f;
            float f2 = bundle.getFloat("fenceRadius", 1000.0f);
            if (f2 > 0.0f) {
                f = f2;
            }
            geoFence.setRadius(f);
            geoFence.setMinDis2Center(f);
            geoFence.setMaxDis2Center(f);
        }
        geoFence.setActivatesAction(this.f);
        geoFence.setCustomId(bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(arrayList);
        geoFence.setPointList(arrayList2);
        geoFence.setCenter(dPoint);
        geoFence.setPendingIntentAction(this.d);
        geoFence.setExpiration(-1L);
        geoFence.setPendingIntent(this.c);
        StringBuilder sb = new StringBuilder();
        sb.append(com.loc.c.a());
        geoFence.setFenceId(sb.toString());
        fw fwVar = this.f7638a;
        if (fwVar != null) {
            fwVar.a(this.b, 2);
        }
        return geoFence;
    }

    static void a(String str, int i, String str2, String... strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("===========================================\n");
        stringBuffer.append("              " + str + "                ");
        stringBuffer.append("\n");
        stringBuffer.append("-------------------------------------------\n");
        stringBuffer.append("errorCode:".concat(String.valueOf(i)));
        stringBuffer.append("\n");
        stringBuffer.append("错误信息:".concat(String.valueOf(str2)));
        stringBuffer.append("\n");
        if (strArr.length > 0) {
            for (String str3 : strArr) {
                stringBuffer.append(str3);
                stringBuffer.append("\n");
            }
        }
        stringBuffer.append("===========================================\n");
        stringBuffer.toString();
    }

    private static boolean a(int i, String str, String str2, DPoint dPoint) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (i != 1) {
            if (i == 2) {
                if (dPoint == null) {
                    return false;
                }
                if (dPoint.getLatitude() > 90.0d || dPoint.getLatitude() < -90.0d || dPoint.getLongitude() > 180.0d || dPoint.getLongitude() < -180.0d) {
                    a("添加围栏失败", 0, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new String[0]);
                    return false;
                }
            }
        } else if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    private static boolean a(GeoFence geoFence, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            try {
                if (geoFence.getStatus() == 1) {
                    z = true;
                }
            } catch (Throwable th) {
                fr.a(th, "Utils", "remindStatus");
                return z;
            }
        }
        if ((i & 2) == 2 && geoFence.getStatus() == 2) {
            z = true;
        }
        if ((i & 4) == 4) {
            if (geoFence.getStatus() != 3) {
                return z;
            }
            return true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (a(r4, r5.getCenter(), r5.getRadius()) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(com.amap.api.location.AMapLocation r4, com.amap.api.fence.GeoFence r5) {
        /*
            r0 = 1
            r1 = 0
            boolean r2 = com.loc.fy.a(r4)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L59
            if (r5 == 0) goto L59
            java.util.List r2 = r5.getPointList()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L59
            java.util.List r2 = r5.getPointList()     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L5b
            if (r2 != 0) goto L59
            int r2 = r5.getType()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L4a
            if (r2 == r0) goto L29
            r3 = 2
            if (r2 == r3) goto L4a
            r3 = 3
            if (r2 == r3) goto L29
            goto L59
        L29:
            java.util.List r5 = r5.getPointList()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5b
        L31:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L45
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L47
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L47
            boolean r2 = b(r4, r2)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L31
            r1 = 1
            goto L31
        L45:
            r0 = r1
            goto L64
        L47:
            r4 = move-exception
            r0 = r1
            goto L5d
        L4a:
            com.amap.api.location.DPoint r2 = r5.getCenter()     // Catch: java.lang.Throwable -> L5b
            float r5 = r5.getRadius()     // Catch: java.lang.Throwable -> L5b
            boolean r4 = a(r4, r2, r5)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L59
            goto L64
        L59:
            r0 = 0
            goto L64
        L5b:
            r4 = move-exception
            r0 = 0
        L5d:
            java.lang.String r5 = "Utils"
            java.lang.String r1 = "isInGeoFence"
            com.loc.fr.a(r4, r5, r1)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.a.a(com.amap.api.location.AMapLocation, com.amap.api.fence.GeoFence):boolean");
    }

    private static boolean a(AMapLocation aMapLocation, DPoint dPoint, float f) {
        return fy.a(new double[]{dPoint.getLatitude(), dPoint.getLongitude(), aMapLocation.getLatitude(), aMapLocation.getLongitude()}) <= f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(DPoint dPoint, List<DPoint> list) {
        float f = Float.MIN_VALUE;
        if (dPoint != null && list != null && !list.isEmpty()) {
            for (DPoint dPoint2 : list) {
                f = Math.max(f, fy.a(dPoint, dPoint2));
            }
        }
        return f;
    }

    private static DPoint b(List<DPoint> list) {
        DPoint dPoint = new DPoint();
        if (list != null) {
            try {
                double d = mto.a.GEO_NOT_SUPPORT;
                double d2 = 0.0d;
                for (DPoint dPoint2 : list) {
                    d += dPoint2.getLatitude();
                    d2 += dPoint2.getLongitude();
                }
                return new DPoint(fy.b(d / list.size()), fy.b(d2 / list.size()));
            } catch (Throwable th) {
                fr.a(th, "GeoFenceUtil", "getPolygonCenter");
                return dPoint;
            }
        }
        return dPoint;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private void b(int r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.a.b(int, android.os.Bundle):void");
    }

    private static boolean b(AMapLocation aMapLocation, GeoFence geoFence) {
        boolean z = true;
        try {
            if (!a(aMapLocation, geoFence)) {
                if (geoFence.getStatus() != 2) {
                    try {
                        geoFence.setStatus(2);
                        geoFence.setEnterTime(-1L);
                    } catch (Throwable th) {
                        th = th;
                        fr.a(th, "Utils", "isFenceStatusChanged");
                        return z;
                    }
                }
                z = false;
            } else if (geoFence.getEnterTime() == -1) {
                if (geoFence.getStatus() != 1) {
                    geoFence.setEnterTime(fy.b());
                    geoFence.setStatus(1);
                }
                z = false;
            } else {
                if (geoFence.getStatus() != 3 && fy.b() - geoFence.getEnterTime() > cew.a.CONFIG_TRACK_1022_INTERVAL_TIME) {
                    geoFence.setStatus(3);
                }
                z = false;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    private static boolean b(AMapLocation aMapLocation, List<DPoint> list) {
        if (list.size() < 3) {
            return false;
        }
        return fr.a(new DPoint(aMapLocation.getLatitude(), aMapLocation.getLongitude()), list);
    }

    private int c(GeoFence geoFence) {
        try {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            if (this.g.contains(geoFence)) {
                return 17;
            }
            this.g.add(geoFence);
            return 0;
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "addGeoFence2List");
            a("添加围栏失败", 8, th.getMessage(), new String[0]);
            return 8;
        }
    }

    private static int d(int i) {
        int i2 = 8;
        if (i != 1 && i != 7 && i != 4 && i != 5 && i != 16 && i != 17) {
            switch (i) {
                case 10000:
                    i2 = 0;
                    break;
                case 10001:
                case 10002:
                case 10007:
                case 10008:
                case 10009:
                case 10012:
                case 10013:
                    i2 = 7;
                    break;
                case 10003:
                case 10004:
                case 10005:
                case 10006:
                case 10010:
                case 10011:
                case rlp.T_BORDER_WIDTH /* 10014 */:
                case 10015:
                case 10016:
                case rlp.T_BORDER_SELECTOR /* 10017 */:
                    i2 = 4;
                    break;
                default:
                    switch (i) {
                        case 20000:
                        case 20001:
                        case 20002:
                            i2 = 1;
                            break;
                    }
            }
        } else {
            i2 = i;
        }
        if (i2 != 0) {
            a("添加围栏失败", i2, "searchErrCode is ".concat(String.valueOf(i2)), new String[0]);
        }
        return i2;
    }

    private void d(GeoFence geoFence) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("geoFence", geoFence);
        a(1001, bundle);
    }

    private void j() {
        if (!this.o) {
            this.o = true;
        }
        if (this.n) {
            return;
        }
        try {
            this.h = Looper.myLooper() == null ? new c(this.b.getMainLooper()) : new c();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManger", "init 1");
        }
        try {
            this.l = new b("fenceActionThread");
            this.l.setPriority(5);
            this.l.start();
            this.k = new HandlerC0269a(this.l.getLooper());
        } catch (Throwable th2) {
            fr.a(th2, "GeoFenceManger", "init 2");
        }
        try {
            this.p = new com.loc.b(this.b);
            this.q = new com.loc.c();
            this.u = new AMapLocationClientOption();
            this.r = new AMapLocationClient(this.b);
            this.u.setLocationCacheEnable(true);
            this.u.setNeedAddress(false);
            this.r.setLocationListener(this.w);
            if (this.f7638a == null) {
                this.f7638a = new fw();
            }
        } catch (Throwable th3) {
            fr.a(th3, "GeoFenceManger", "initBase");
        }
        this.n = true;
        try {
            if (this.d != null && this.c == null) {
                a(this.d);
            }
        } catch (Throwable th4) {
            fr.a(th4, "GeoFenceManger", "init 4");
        }
        if (A) {
            return;
        }
        A = true;
        fw.a(this.b, "O020", (JSONObject) null);
    }

    private boolean k() {
        ArrayList<GeoFence> arrayList = this.g;
        if (arrayList == null || arrayList.isEmpty()) {
            return true;
        }
        Iterator<GeoFence> it = this.g.iterator();
        while (it.hasNext()) {
            if (it.next().isAble()) {
                return false;
            }
        }
        return true;
    }

    private void l() {
        try {
            synchronized (this.j) {
                if (this.h != null) {
                    this.h.removeCallbacksAndMessages(null);
                }
                this.h = null;
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "destroyResultHandler");
        }
    }

    private void m() {
        try {
            synchronized (this.i) {
                if (this.k != null) {
                    this.k.removeCallbacksAndMessages(null);
                }
                this.k = null;
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "destroyActionHandler");
        }
    }

    private void n() {
        if (!this.y && this.k != null) {
            if (p()) {
                a(6, (Bundle) null, 0L);
                a(5, (Bundle) null, 0L);
                return;
            }
            b(7);
            a(7, (Bundle) null, 0L);
        }
    }

    private void o() {
        try {
            if (this.m) {
                b(8);
            }
            if (this.r != null) {
                this.r.stopLocation();
            }
            this.m = false;
        } catch (Throwable unused) {
        }
    }

    private boolean p() {
        return this.s != null && fy.a(this.s) && fy.b() - this.t < 10000;
    }

    public final PendingIntent a(String str) {
        synchronized (this.z) {
            try {
                Intent intent = new Intent(str);
                intent.setPackage(l.c(this.b));
                this.c = (Build.VERSION.SDK_INT < 31 || this.b.getApplicationInfo().targetSdkVersion < 31) ? com.android.taobao.aop.a.b(this.b, 0, intent, 0) : com.android.taobao.aop.a.b(this.b, 0, intent, UCExtension.EXTEND_INPUT_TYPE_IDCARD);
                this.d = str;
                if (this.g != null && !this.g.isEmpty()) {
                    Iterator<GeoFence> it = this.g.iterator();
                    while (it.hasNext()) {
                        GeoFence next = it.next();
                        next.setPendingIntent(this.c);
                        next.setPendingIntentAction(this.d);
                    }
                }
            }
        }
        return this.c;
    }

    public final void a() {
        try {
            this.o = false;
            a(10, (Bundle) null, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "removeGeoFence");
        }
    }

    public final void a(int i) {
        try {
            j();
            if (i > 7 || i <= 0) {
                i = 1;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("activatesAction", i);
            a(9, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "setActivateAction");
        }
    }

    final void a(int i, Bundle bundle) {
        try {
            synchronized (this.j) {
                if (this.h != null) {
                    Message obtainMessage = this.h.obtainMessage();
                    obtainMessage.what = i;
                    obtainMessage.setData(bundle);
                    this.h.sendMessage(obtainMessage);
                }
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "sendResultHandlerMessage");
        }
    }

    final void a(int i, Bundle bundle, long j) {
        try {
            synchronized (this.i) {
                if (this.k != null) {
                    Message obtainMessage = this.k.obtainMessage();
                    obtainMessage.what = i;
                    obtainMessage.setData(bundle);
                    this.k.sendMessageDelayed(obtainMessage, j);
                }
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "sendActionHandlerMessage");
        }
    }

    final void a(Bundle bundle) {
        int i = 1;
        if (bundle != null) {
            try {
                i = bundle.getInt("activatesAction", 1);
            } catch (Throwable th) {
                fr.a(th, "GeoFenceManager", "doSetActivatesAction");
                return;
            }
        }
        if (this.f != i) {
            if (this.g != null && !this.g.isEmpty()) {
                Iterator<GeoFence> it = this.g.iterator();
                while (it.hasNext()) {
                    GeoFence next = it.next();
                    next.setStatus(0);
                    next.setEnterTime(-1L);
                }
            }
            n();
        }
        this.f = i;
    }

    public final void a(GeoFenceListener geoFenceListener) {
        try {
            this.e = geoFenceListener;
        } catch (Throwable unused) {
        }
    }

    final void a(AMapLocation aMapLocation) {
        try {
            if (this.y || this.g == null || this.g.isEmpty() || aMapLocation == null || aMapLocation.getErrorCode() != 0) {
                return;
            }
            Iterator<GeoFence> it = this.g.iterator();
            while (it.hasNext()) {
                GeoFence next = it.next();
                if (next.isAble() && b(aMapLocation, next) && a(next, this.f)) {
                    next.setCurrentLocation(aMapLocation);
                    d(next);
                }
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "doCheckFence");
        }
    }

    public final void a(DPoint dPoint, float f, String str) {
        try {
            j();
            Bundle bundle = new Bundle();
            bundle.putParcelable("centerPoint", dPoint);
            bundle.putFloat("fenceRadius", f);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(0, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "addRoundGeoFence");
        }
    }

    public final void a(String str, String str2) {
        try {
            j();
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str2);
            a(4, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "addDistricetGeoFence");
        }
    }

    public final void a(String str, String str2, DPoint dPoint, float f, int i, String str3) {
        try {
            j();
            if (f <= 0.0f || f > 50000.0f) {
                f = 3000.0f;
            }
            if (i <= 0) {
                i = 10;
            }
            if (i > 25) {
                i = 25;
            }
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString("poiType", str2);
            bundle.putParcelable("centerPoint", dPoint);
            bundle.putFloat("aroundRadius", f);
            bundle.putInt("searchSize", i);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str3);
            a(3, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "addNearbyGeoFence");
        }
    }

    public final void a(String str, String str2, String str3, int i, String str4) {
        try {
            j();
            if (i <= 0) {
                i = 10;
            }
            if (i > 25) {
                i = 25;
            }
            Bundle bundle = new Bundle();
            bundle.putString("keyWords", str);
            bundle.putString("poiType", str2);
            bundle.putString("city", str3);
            bundle.putInt("searchSize", i);
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str4);
            a(2, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "addKeywordGeoFence");
        }
    }

    public final void a(String str, boolean z) {
        try {
            j();
            Bundle bundle = new Bundle();
            bundle.putString("fid", str);
            bundle.putBoolean("ab", z);
            a(12, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "setGeoFenceAble");
        }
    }

    public final void a(List<DPoint> list, String str) {
        try {
            j();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("pointList", new ArrayList<>(list));
            bundle.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(1, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "addPolygonGeoFence");
        }
    }

    public final boolean a(GeoFence geoFence) {
        try {
            if (this.g != null && !this.g.isEmpty()) {
                if (!this.g.contains(geoFence)) {
                    return false;
                }
                if (this.g.size() == 1) {
                    this.o = false;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("fc", geoFence);
                a(11, bundle, 0L);
                return true;
            }
            this.o = false;
            a(10, (Bundle) null, 0L);
            return true;
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "removeGeoFence(GeoFence)");
            return false;
        }
    }

    public final List<GeoFence> b() {
        try {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            return (ArrayList) this.g.clone();
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    final void b(int i) {
        try {
            synchronized (this.i) {
                if (this.k != null) {
                    this.k.removeMessages(i);
                }
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "removeActionHandlerMessage");
        }
    }

    final void b(Bundle bundle) {
        String str;
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int i = 1;
            if (bundle == null || bundle.isEmpty()) {
                str = "";
            } else {
                DPoint dPoint = (DPoint) bundle.getParcelable("centerPoint");
                str = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                if (dPoint != null) {
                    if (dPoint.getLatitude() <= 90.0d && dPoint.getLatitude() >= -90.0d && dPoint.getLongitude() <= 180.0d && dPoint.getLongitude() >= -180.0d) {
                        GeoFence a2 = a(bundle, false);
                        i = c(a2);
                        if (i == 0) {
                            arrayList.add(a2);
                        }
                    }
                    a("添加围栏失败", 1, "经纬度错误，传入的纬度：" + dPoint.getLatitude() + "传入的经度:" + dPoint.getLongitude(), new String[0]);
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("errorCode", i);
            bundle2.putParcelableArrayList("resultList", arrayList);
            bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            a(1000, bundle2);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "doAddGeoFenceRound");
        }
    }

    final void b(GeoFence geoFence) {
        PendingIntent pendingIntent;
        Context context;
        try {
            synchronized (this.z) {
                if (this.b != null) {
                    if (this.c == null && geoFence.getPendingIntent() == null) {
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtras(a(geoFence, geoFence.getFenceId(), geoFence.getCustomId(), geoFence.getStatus(), 0));
                    if (this.d != null) {
                        intent.setAction(this.d);
                    }
                    intent.setPackage(l.c(this.b));
                    if (geoFence.getPendingIntent() != null) {
                        pendingIntent = geoFence.getPendingIntent();
                        context = this.b;
                    } else {
                        pendingIntent = this.c;
                        context = this.b;
                    }
                    pendingIntent.send(context, 0, intent);
                }
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "resultTriggerGeoFence");
        }
    }

    final void c() {
        if (!this.n) {
            return;
        }
        if (this.g != null) {
            this.g.clear();
            this.g = null;
        }
        if (this.o) {
            return;
        }
        m();
        if (this.r != null) {
            this.r.stopLocation();
            this.r.onDestroy();
        }
        this.r = null;
        if (this.l != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                this.l.quitSafely();
            } else {
                this.l.quit();
            }
        }
        this.l = null;
        this.p = null;
        synchronized (this.z) {
            if (this.c != null) {
                this.c.cancel();
            }
            this.c = null;
        }
        l();
        if (this.f7638a != null) {
            this.f7638a.b(this.b);
        }
        this.m = false;
        this.n = false;
    }

    final void c(int i) {
        try {
            if (this.b == null) {
                return;
            }
            synchronized (this.z) {
                if (this.c == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.putExtras(a((GeoFence) null, (String) null, (String) null, 4, i));
                this.c.send(this.b, 0, intent);
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "resultRemindLocationError");
        }
    }

    final void c(Bundle bundle) {
        String str;
        GeoFence a2;
        try {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            int i = 1;
            if (bundle == null || bundle.isEmpty()) {
                str = "";
            } else {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("pointList");
                str = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                if (parcelableArrayList != null && parcelableArrayList.size() > 2 && (i = c((a2 = a(bundle, true)))) == 0) {
                    arrayList.add(a2);
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(GeoFence.BUNDLE_KEY_CUSTOMID, str);
            bundle2.putInt("errorCode", i);
            bundle2.putParcelableArrayList("resultList", arrayList);
            a(1000, bundle2);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "doAddGeoFencePolygon");
        }
    }

    final void d() {
        try {
            if (this.r == null) {
                return;
            }
            o();
            this.u.setOnceLocation(true);
            this.r.setLocationOption(this.u);
            this.r.startLocation();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "doStartOnceLocation");
        }
    }

    final void d(Bundle bundle) {
        b(2, bundle);
    }

    final void e() {
        try {
            if (this.y || !fy.a(this.s)) {
                return;
            }
            float a2 = a(this.s, this.g);
            if (a2 == Float.MAX_VALUE) {
                return;
            }
            if (a2 < 1000.0f) {
                b(7);
                Bundle bundle = new Bundle();
                bundle.putLong(Constants.Name.INTERVAL, 2000L);
                a(8, bundle, 500L);
            } else if (a2 < 5000.0f) {
                o();
                b(7);
                a(7, (Bundle) null, 10000L);
            } else {
                o();
                b(7);
                a(7, (Bundle) null, ((a2 - 4000.0f) / 100.0f) * 1000.0f);
            }
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "doCheckLocationPolicy");
        }
    }

    final void e(Bundle bundle) {
        b(1, bundle);
    }

    public final void f() {
        try {
            j();
            this.y = true;
            a(13, (Bundle) null, 0L);
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "pauseGeoFence");
        }
    }

    final void f(Bundle bundle) {
        b(3, bundle);
    }

    final void g() {
        try {
            b(7);
            b(8);
            if (this.r != null) {
                this.r.stopLocation();
            }
            this.m = false;
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "doPauseGeoFence");
        }
    }

    final void g(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                String string = bundle.getString("fid");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                boolean z = bundle.getBoolean("ab", true);
                if (this.g != null && !this.g.isEmpty()) {
                    Iterator<GeoFence> it = this.g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        GeoFence next = it.next();
                        if (next.getFenceId().equals(string)) {
                            next.setAble(z);
                            break;
                        }
                    }
                }
                if (z) {
                    n();
                } else if (!k()) {
                } else {
                    g();
                }
            } catch (Throwable th) {
                fr.a(th, "GeoFenceManager", "doSetGeoFenceAble");
            }
        }
    }

    public final void h() {
        try {
            j();
            if (!this.y) {
                return;
            }
            this.y = false;
            n();
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "resumeGeoFence");
        }
    }

    final void h(Bundle bundle) {
        try {
            if (this.g == null) {
                return;
            }
            GeoFence geoFence = (GeoFence) bundle.getParcelable("fc");
            if (this.g.contains(geoFence)) {
                this.g.remove(geoFence);
            }
            if (this.g.size() <= 0) {
                c();
            } else {
                n();
            }
        } catch (Throwable unused) {
        }
    }

    final void i(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.isEmpty()) {
                    return;
                }
                int i = bundle.getInt("errorCode");
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("resultList");
                if (parcelableArrayList == null) {
                    parcelableArrayList = new ArrayList();
                }
                String string = bundle.getString(GeoFence.BUNDLE_KEY_CUSTOMID);
                if (string == null) {
                    string = "";
                }
                if (this.e != null) {
                    this.e.onGeoFenceCreateFinished((ArrayList) parcelableArrayList.clone(), i, string);
                }
                if (i != 0) {
                    return;
                }
                n();
            } catch (Throwable th) {
                fr.a(th, "GeoFenceManager", "resultAddGeoFenceFinished");
            }
        }
    }

    public final boolean i() {
        return this.y;
    }

    final void j(Bundle bundle) {
        try {
            if (this.r == null) {
                return;
            }
            long j = 2000;
            if (bundle != null && !bundle.isEmpty()) {
                j = bundle.getLong(Constants.Name.INTERVAL, 2000L);
            }
            this.u.setOnceLocation(false);
            this.u.setInterval(j);
            this.r.setLocationOption(this.u);
            if (this.m) {
                return;
            }
            this.r.stopLocation();
            this.r.startLocation();
            this.m = true;
        } catch (Throwable th) {
            fr.a(th, "GeoFenceManager", "doStartContinueLocation");
        }
    }
}
