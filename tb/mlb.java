package tb;

import android.app.ApplicationExitInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.utils.d;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class mlb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REASON_ANR = 6;
    public static final int REASON_CRASH = 4;
    public static final int REASON_CRASH_NATIVE = 5;
    public static final int REASON_DEPENDENCY_DIED = 12;
    public static final int REASON_EXCESSIVE_RESOURCE_USAGE = 9;
    public static final int REASON_EXIT_SELF = 1;
    public static final int REASON_FREEZER = 14;
    public static final int REASON_INITIALIZATION_FAILURE = 7;
    public static final int REASON_LOW_MEMORY = 3;
    public static final int REASON_OTHER = 13;
    public static final int REASON_PERMISSION_CHANGE = 8;
    public static final int REASON_SIGNALED = 2;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_USER_REQUESTED = 10;
    public static final int REASON_USER_STOPPED = 11;

    /* renamed from: a  reason: collision with root package name */
    public static mlb f31083a = new mlb();
    private int b;
    private String c;
    private int d;
    private int e;
    private long f;
    private long g;
    private long h;
    private String i;
    private int j;
    private String k;

    private mlb() {
    }

    public mlb(ApplicationExitInfo applicationExitInfo) {
        this(applicationExitInfo.getProcessName(), applicationExitInfo.getTimestamp(), applicationExitInfo.getPid(), applicationExitInfo.getReason(), a(applicationExitInfo), applicationExitInfo.getStatus(), applicationExitInfo.getDescription(), applicationExitInfo.getPss() << 10, applicationExitInfo.getRss() << 10);
    }

    public mlb(String str, long j, int i, int i2, int i3, int i4, String str2, long j2, long j3) {
        this.c = str;
        this.k = str;
        this.h = j;
        this.b = i;
        this.d = i2;
        this.j = i3;
        this.e = i4;
        this.i = str2;
        this.f = j2;
        this.g = j3;
    }

    private static int a(ApplicationExitInfo applicationExitInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96982dde", new Object[]{applicationExitInfo})).intValue();
        }
        try {
            return ((Integer) d.a(ApplicationExitInfo.class, applicationExitInfo, "mSubReason")).intValue();
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("MetricKit.ApplicationExitCollectResult", "mSubReason get fail.", th);
            return -1;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : a(this.d);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.e;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.f;
    }

    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.g;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : this.h;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        String str = this.i;
        return str == null ? "null" : str;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        try {
            return (String) d.a(ApplicationExitInfo.class, "subreasonToString", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(this.j)});
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("MetricKit.ApplicationExitCollectResult", "subreasonToString fail.", th);
            return String.valueOf(this.j);
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.k;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "timestamp=" + this.h + " pid=" + this.b + " process=" + this.c + " reason=" + this.d + " (" + a(this.d) + riy.BRACKET_END_STR + " subReason=" + h() + " status=" + this.e + " pss=" + this.f + " rss=" + this.g + " description=" + this.i;
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        try {
            return (String) d.a(ApplicationExitInfo.class, "reasonCodeToString", new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("MetricKit.ApplicationExitCollectResult", "reasonCodeToString fail.", th);
            return String.valueOf(i);
        }
    }
}
