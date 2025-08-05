package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;

/* loaded from: classes.dex */
public final class ije implements ijd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f29067a;

    public ije(ijd ijdVar) {
        this.f29067a = ijdVar;
    }

    @Override // tb.ijd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f29067a.a();
        }
    }

    @Override // tb.ijd
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        boolean a2 = this.f29067a.a(str);
        if (a2) {
            RSoLog.c("config -> read sp, libDisabled=true, libName=" + str);
        }
        return a2;
    }

    @Override // tb.ijd
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        boolean b = this.f29067a.b(str);
        if (b) {
            RSoLog.d("config -> read sp, onDemandFetchDisabled=true, libName=" + str);
        }
        return b;
    }

    @Override // tb.ijd
    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        boolean a2 = this.f29067a.a(str, z);
        if (a2 != z) {
            RSoLog.d("config -> readBool(), key=" + str + " result=" + a2 + " : defaultValue=" + z);
        }
        return a2;
    }

    @Override // tb.ijd
    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        long a2 = this.f29067a.a(str, j);
        if (a2 != j) {
            RSoLog.d("config -> readLong(), key=" + str + " longValue=" + a2 + " : defaultValue=" + j);
        }
        return a2;
    }

    @Override // tb.ijd
    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        String b = this.f29067a.b(str, str2);
        if (!ikw.a((CharSequence) b, (CharSequence) str2)) {
            RSoLog.d("config -> readString(), key=" + str + " , s=" + b + " : defaultValue=" + str2);
        }
        return b;
    }

    @Override // tb.ijd
    public List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eb209513", new Object[]{this, str});
        }
        List<String> c = this.f29067a.c(str);
        RSoLog.d("config -> readStringList(), key=" + str + ", result=" + c);
        return c;
    }

    @Override // tb.ijd
    public List<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, str, str2});
        }
        List<String> a2 = this.f29067a.a(str, str2);
        if (ikw.a((CharSequence) str2) && a2.isEmpty()) {
            return a2;
        }
        RSoLog.d("config -> readStringList(), key=" + str + ", defaultValue=" + str2 + ", result=" + a2);
        return a2;
    }

    @Override // tb.ijd
    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str});
        }
        String d = this.f29067a.d(str);
        if (!ikw.a((CharSequence) d, (CharSequence) str)) {
            RSoLog.d("config -> readCustomContent(), customContent exist, defaultContent = " + str);
        }
        return d;
    }
}
