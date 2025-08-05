package tb;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.BackupFastSp;
import tb.tcp;

/* loaded from: classes4.dex */
public class ixq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final tcp f29398a;
    private final SharedPreferences b;

    static {
        kge.a(-768369397);
    }

    public static ixq a(String str, String str2, tcp.c<SharedPreferences> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ixq) ipChange.ipc$dispatch("76125598", new Object[]{str, str2, cVar});
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        SharedPreferences call = cVar.call();
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        String str3 = call instanceof BackupFastSp ? "fast_sp" : "system_sp";
        tcr.a().a(str, str2, str3, "true", "create", elapsedRealtimeNanos2 - elapsedRealtimeNanos);
        return new ixq(str, str2, str3, call);
    }

    public ixq(String str, String str2, String str3, SharedPreferences sharedPreferences) {
        this.f29398a = new tcp(str, str2, str3);
        this.b = sharedPreferences;
    }

    public tcp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tcp) ipChange.ipc$dispatch("f0ae15d", new Object[]{this}) : this.f29398a;
    }

    public SharedPreferences b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("811fa7d", new Object[]{this}) : this.b;
    }
}
