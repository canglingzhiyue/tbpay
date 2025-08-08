package com.taobao.passivelocation.gathering.service;

import android.app.IntentService;
import android.content.ContentResolver;
import android.content.Intent;
import android.location.Location;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.passivelocation.report.service.LocationReportService;
import com.taobao.tao.Globals;
import tb.kge;
import tb.ndp;
import tb.ndr;
import tb.ndt;
import tb.ndu;
import tb.ndw;
import tb.nea;

/* loaded from: classes7.dex */
public class LocationGatheringService extends IntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCATION_CHANGED_ACTION = "com.taobao.passivelocation.gathering.service.LOCATION_GATHERING_ACTION";
    public static final String LOCATION_GATHERING_START_ACTION = "com.taobao.passivelocation.gathering.service.LOCATION_GATHERING_START_ACTION";
    private static final Object d;

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f18675a;
    private ndr b;
    private a c;

    /* loaded from: classes7.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocationGatheringService f18676a;
        private Intent b;

        static {
            kge.a(142331726);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                LocationGatheringService.a(this.f18676a, this.b);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(LocationGatheringService locationGatheringService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1899989668) {
            super.onStart((Intent) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    public static /* synthetic */ void a(LocationGatheringService locationGatheringService, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc431f2b", new Object[]{locationGatheringService, intent});
        } else {
            locationGatheringService.a(intent);
        }
    }

    static {
        kge.a(-1553032629);
        d = new Object();
    }

    public LocationGatheringService() {
        this("LocationGatheringService");
    }

    public LocationGatheringService(String str) {
        super(str);
        this.c = null;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        nea.d("lbs_passive.loc_LGS", "[onCreate] begin");
        super.onCreate();
        ndw.f31376a = getApplicationContext();
        this.f18675a = getContentResolver();
        this.b = new ndr(getApplicationContext());
        AppMonitor.Counter.commit("passivelocation", "LocationGatheringService", 1.0d);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec0755c", new Object[]{this, intent, new Integer(i)});
            return;
        }
        nea.d("lbs_passive.loc_LGS", "[onStart] begin");
        super.onStart(intent, i);
        if (intent == null || StringUtils.isEmpty(intent.getAction()) || !LOCATION_GATHERING_START_ACTION.equals(intent.getAction())) {
            return;
        }
        nea.d("lbs_passive.loc_LGS", "[onStart] invoke GatheringCommand.startGathering");
        new ndt().a(getApplicationContext(), ndr.b);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253e327", new Object[]{this, intent});
        } else if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "passiveGather", "on"))) {
            nea.a("lbs_passive.loc_LGS", "LocationGather降级");
        } else {
            nea.d("lbs_passive.loc_LGS", "[onHandleIntent] begin");
            if (intent == null || StringUtils.isEmpty(intent.getAction())) {
                nea.d("lbs_passive.loc_LGS", "[onHandleIntent] intent null or action null");
            } else {
                a(intent);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if (r3.getLatitude().doubleValue() <= tb.mto.a.GEO_NOT_SUPPORT) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
        if (r3.getLongitude().doubleValue() <= tb.mto.a.GEO_NOT_SUPPORT) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
        r14 = (int) ((tb.ndx.a((int) (r3.getLongitude().doubleValue() * 3600000.0d), (int) (r3.getLatitude().doubleValue() * 3600000.0d), (int) (r6.getLongitude() * 3600000.0d), (int) (r6.getLatitude() * 3600000.0d), 3600000.0d) * 1000.0d) + 0.5d);
        r0 = 500;
        r1 = com.taobao.orange.OrangeConfig.getInstance().getConfig("gps", "gatherNormalDistance", "500");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0116, code lost:
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
        if (r1.isEmpty() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011e, code lost:
        r0 = java.lang.Integer.parseInt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        if (r14 >= r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0124, code lost:
        tb.nea.d("lbs_passive.loc_LGS", "[onHandleIntent] 与上次位置距离较近且在距离配置范围内不上报位置~");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012a, code lost:
        b(r6);
        c(r6);
        a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.passivelocation.gathering.service.LocationGatheringService.a(android.content.Intent):void");
    }

    private void b(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d348549", new Object[]{this, location});
        } else {
            new ndp(getApplicationContext()).a(this.f18675a, ndu.a(location));
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !LOCATION_GATHERING_START_ACTION.equals(str) && LOCATION_CHANGED_ACTION.equals(str);
    }

    private String b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{this, intent});
        }
        if (intent.hasExtra("location_source_key")) {
            String stringExtra = intent.getStringExtra("location_source_key");
            nea.d("lbs_passive.loc_LGS", "[onHandleIntent] source=" + stringExtra);
            return stringExtra;
        }
        nea.b("lbs_passive.loc_LGS", "[onHandleIntent] source null");
        return null;
    }

    private void c(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b564c528", new Object[]{this, location});
            return;
        }
        try {
            Intent intent = new Intent(LocationReportService.LOCATION_UPLOAD_ACTION);
            intent.putExtra(LocationReportService.LOCATION_EXTRA_REPORT_ACTION, location);
            intent.setPackage(ndw.f31376a.getPackageName());
            ndw.f31376a.startService(intent);
        } catch (Exception e) {
            nea.a("lbs_passive.loc_LGS", "Report异常", e);
        }
    }

    public static void a(Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a504456a", new Object[]{location});
            return;
        }
        Intent intent = new Intent("com.taobao.passivelocation.gathering.service.LOCATION_RESULT_ACTION");
        intent.putExtra("com.taobao.passivelocation.gathering.service.LOCATION_RESULT_OBJ", location);
        intent.setPackage(ndw.f31376a.getPackageName());
        Globals.getApplication().sendBroadcast(intent);
    }
}
