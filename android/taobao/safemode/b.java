package android.taobao.safemode;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f1516a;
    private Context b;
    private final int c = RemoteMessageConst.DEFAULT_TTL;
    private final long d = 86400000;
    private final long e = 3600000;

    private boolean a(long j, long j2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2628051f", new Object[]{this, new Long(j), new Long(j2), new Integer(i)})).booleanValue() : j - j2 > ((long) i) * 3600000;
    }

    public b(Context context) {
        this.b = context;
    }

    public static b a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b1a010ed", new Object[]{context});
        }
        if (f1516a == null) {
            synchronized (b.class) {
                f1516a = new b(context);
            }
        }
        return f1516a;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b.getSharedPreferences("safemode_sp", 0).getBoolean("launch_crash_enable", true);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b.getSharedPreferences("safemode_sp", 0).getBoolean("normal_crash_enable", true);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = this.b.getSharedPreferences("safemode_sp", 0).edit();
        edit.putBoolean("launch_crash", true);
        edit.commit();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = this.b.getSharedPreferences("safemode_sp", 0).edit();
        edit.putBoolean("normal_crash", true);
        edit.putInt("normal_crash_hash", i);
        edit.commit();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = this.b.getSharedPreferences("safemode_sp", 0).edit();
        edit.putBoolean("launch_crash", false);
        edit.apply();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.b.getSharedPreferences("safemode_sp", 0).getBoolean("launch_crash", false);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : System.currentTimeMillis() - this.b.getSharedPreferences("safemode_sp", 0).getLong("safemode_time", 0L) < android.taobao.windvane.util.b.DEFAULT_SMALL_MAX_AGE;
    }

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("safemode_sp", 0);
        boolean z = sharedPreferences.getBoolean("normal_crash", false);
        return z ? sharedPreferences.getInt("normal_crash_hash", 0) == i : z;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        long j = this.b.getSharedPreferences("safemode_sp", 0).getLong("safemode_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j != 0) {
            return a(j, currentTimeMillis);
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        int i = this.b.getSharedPreferences("safemode_sp", 0).getInt("safemode_count", 1);
        return i != 1 && i > 2;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        long j = this.b.getSharedPreferences("safemode_sp", 0).getLong("safemode_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j != 0) {
            return a(currentTimeMillis, j, 4);
        }
        return false;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        SharedPreferences.Editor edit = this.b.getSharedPreferences("safemode_sp", 0).edit();
        edit.putInt("safemode_count", 1);
        edit.putLong("safemode_time", System.currentTimeMillis());
        edit.putBoolean("normal_crash", false);
        edit.putBoolean("launch_crash", false);
        edit.putInt("normal_crash_hash", 0);
        edit.commit();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("safemode_sp", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("safemode_count", sharedPreferences.getInt("safemode_count", 0) + 1);
        edit.putLong("safemode_time", System.currentTimeMillis());
        edit.putBoolean("normal_crash", false);
        edit.putBoolean("launch_crash", false);
        edit.putInt("normal_crash_hash", 0);
        edit.commit();
    }

    private boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{this, new Long(j), new Long(j2)})).booleanValue();
        }
        long j3 = j - j2;
        return j3 < 86400000 && j3 > -86400000 && a(j) == a(j2);
    }

    private long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue() : (j + TimeZone.getDefault().getOffset(j)) / 86400000;
    }
}
