package tb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.a;
import com.taobao.passivelocation.gathering.receiver.LocationChangedReceiver;
import com.taobao.passivelocation.gathering.receiver.PassiveLocationChangedReceiver;

/* loaded from: classes7.dex */
public class ndv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FENCE_CHANNEL_GATHER_SOURCE = "fence";
    public static final int GATHERING_REQUEST_CODE = 2;
    public static final int PASSIVE_GATHERING_REQUEST_CODE = 3;
    public static final String PASSIVE_LOCATION_CHANNEL_GATHER_SOURCE = "passiveLocation";
    public static final String REQUEST_ALARM = "alarm";
    public static final String REQUEST_PASSIVE = "passive";
    public static final String REQUEST_UPDATES = "updates";

    /* renamed from: a  reason: collision with root package name */
    private final String f31375a = "lbs_passive.loc_MLR";
    private Context b;
    private String c;

    static {
        kge.a(1013505916);
    }

    public ndv(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public void a(long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11bbe4", new Object[]{this, new Long(j), new Float(f)});
            return;
        }
        try {
            if (this.b == null) {
                this.b = ndw.f31376a;
            }
            nea.d("lbs_passive.loc_MLR", "[startLocationSampling] last set minTime=" + String.valueOf(j / 60000));
            a();
            a(j);
        } catch (Exception e) {
            nea.d("lbs_passive.loc_MLR", "[startLocationSampling] error: " + e.getMessage());
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        nea.d("lbs_passive.loc_MLR", "[stopLocationSampling] begin source=" + this.c);
        if (this.b == null) {
            this.b = ndw.f31376a;
        }
        try {
            LocationManager locationManager = (LocationManager) this.b.getSystemService("location");
            nea.d("lbs_passive.loc_MLR", "[stopLocationSampling] stop activeIntent and passiveIntent source=" + this.c);
            PendingIntent a2 = a(this.b, 2, LocationChangedReceiver.class);
            PendingIntent a3 = a(this.b, 3, PassiveLocationChangedReceiver.class);
            locationManager.removeUpdates(a2);
            locationManager.removeUpdates(a3);
            a2.cancel();
            a3.cancel();
            nea.d("lbs_passive.loc_MLR", "[stopLocationSampling] stop cell tower listening source=" + this.c);
            b();
            nea.d("lbs_passive.loc_MLR", "[stopLocationSampling] cancel AlarmManager source=" + this.c);
            ((AlarmManager) this.b.getSystemService("alarm")).cancel(a(this.b, 2, LocationChangedReceiver.class));
        } catch (Exception e) {
            nea.a("lbs_passive.loc_MLR", "[stopLocationSampling] source=" + this.c + " error: ", e);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        nea.c("lbs_passive.loc_MLR", "[stopCellLocationGathering]");
        try {
            ((TelephonyManager) this.b.getSystemService("phone")).listen(new nds(this.b), 0);
        } catch (Exception unused) {
        }
    }

    private PendingIntent a(Context context, int i, Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingIntent) ipChange.ipc$dispatch("783f4be6", new Object[]{this, context, new Integer(i), cls}) : a.b(context, i, new Intent(context, cls), 134217728);
    }

    private void a(long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        if (this.b == null) {
            this.b = ndw.f31376a;
        }
        AlarmManager alarmManager = (AlarmManager) this.b.getSystemService("alarm");
        String str = this.c;
        if (str != null && str.equalsIgnoreCase("fence")) {
            j2 = System.currentTimeMillis() + j;
        } else {
            j2 = ndw.b + 2000;
        }
        Intent intent = new Intent(this.b, LocationChangedReceiver.class);
        intent.putExtra("alarm", this.c + "_alarm");
        PendingIntent b = a.b(this.b, 2, intent, 134217728);
        alarmManager.cancel(b);
        nea.d("lbs_passive.loc_MLR", "[startAlarmGathering] start location gathering through alarms with params: [type=RTC_WAKEUP,triggerTime=" + j2 + ", minTime=" + (j / 1000) + "s] source=" + this.c);
        alarmManager.setRepeating(1, j2 < 5000 ? 5000L : j2, j, b);
    }
}
