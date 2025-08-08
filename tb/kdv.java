package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class kdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String f;

    /* renamed from: a  reason: collision with root package name */
    public int f29997a = Integer.MAX_VALUE;
    public long b = 0;
    public String c = "";
    public int d = 0;
    public long e = 0;

    public abstract void a(long j);

    public abstract void a(String str, int i);

    public static /* synthetic */ String a(kdv kdvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0dae85", new Object[]{kdvVar}) : kdvVar.e();
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : f;
    }

    static {
        kge.a(-1122936571);
        kge.a(2086838716);
        f = kdv.class.getSimpleName();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.kdv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = kdv.a(kdv.this);
                    kdv kdvVar = kdv.this;
                    kdvVar.a(a2, kdvVar.d);
                    kdv.this.a(currentTimeMillis);
                    String d = kdv.d();
                    kej.a(d, "saveFrequencyLimit currentDay: " + a2 + " ,lastShowDayCountValue:" + kdv.this.d + ",currentTime:" + currentTimeMillis);
                }
            });
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        String e = e();
        String str = f;
        kej.a(str, "isInDayLimit currentDay: " + e);
        if (!StringUtils.equals(e, this.c)) {
            String str2 = f;
            kej.a(str2, "isInDayLimit date diff lastShowDayValue : " + this.c);
            this.d = 0;
            return false;
        }
        String str3 = f;
        kej.a(str3, "isInDayLimit date compare lastShowDayCountValue : " + this.d + ",limitInSingleDayValue: " + this.f29997a);
        return this.d >= this.f29997a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = (System.currentTimeMillis() - this.e) / 1000;
        String str = f;
        kej.a(str, "isInHourLimit: diffTime = " + currentTimeMillis + ",limitSecondsValue:" + this.b);
        return currentTimeMillis <= this.b;
    }

    private String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
}
