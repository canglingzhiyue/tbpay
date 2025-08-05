package tb;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.a;
import com.taobao.android.launch.turbo.profile.d;
import com.taobao.android.launch.turbo.profile.f;
import com.taobao.android.launch.turbo.profile.i;
import com.taobao.android.launch.turbo.profile.j;

/* loaded from: classes5.dex */
public class gsw implements gsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final i f28432a = new i();

    static {
        kge.a(-1045497283);
        kge.a(-2112197540);
    }

    @Override // tb.gsx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "CompileProfile";
    }

    public static /* synthetic */ i a(gsw gswVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("89619475", new Object[]{gswVar}) : gswVar.f28432a;
    }

    @Override // tb.gsx
    public void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce40c78", new Object[]{this, aVar});
            return;
        }
        Context e = aVar.e();
        final j d = aVar.d();
        String packageName = e.getPackageName();
        d.b(103);
        this.f28432a.a(aVar.c().c);
        long a2 = d.a(e);
        d.a(a2);
        String a3 = a();
        gsv.a(a3, "current odex file size is " + a2);
        Pair<Boolean, Long> a4 = f.a(Build.VERSION.SDK_INT, packageName, "speed-profile", new f.e() { // from class: tb.gsw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launch.turbo.profile.f.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                gsv.a(gsw.this.a(), "onCommandInvoked");
                d.b(105);
                gsw.a(gsw.this).b(aVar.b() + 1);
            }

            @Override // com.taobao.android.launch.turbo.profile.f.e
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    gsv.a(gsw.this.a(), "onCommandFinished");
                }
            }
        });
        int a5 = aVar.a();
        String a6 = a();
        gsv.a(a6, "current compile times: " + a5);
        if (((Boolean) a4.first).booleanValue()) {
            this.f28432a.a(((Long) a4.second).longValue(), a5);
            long a7 = a(e, a2);
            String a8 = a();
            gsv.a(a8, "compiled, odexSize " + a2 + " -> " + a7);
            d.b(a7);
            this.f28432a.a(a2, a7, ((Long) a4.second).longValue(), a5);
            if (aVar.c().e) {
                aVar.a(new gsz(this, "compiled and finishWhenInvoked is true")).f();
                return;
            } else if (a5 != -1 && a7 <= 0) {
                String a9 = a();
                gsv.a(a9, "something went wrong, abnormal odex file size: " + a7 + ", trigger retry strategy");
                aVar.a(new gtb()).f();
                return;
            }
        } else {
            this.f28432a.c(a5);
            if (a5 != -1) {
                gsv.a(a(), "compile failed, trigger try strategy");
                aVar.a(new gtb()).f();
                return;
            }
        }
        aVar.a(new gsz(this)).f();
    }

    private long a(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9e58", new Object[]{this, context, new Long(j)})).longValue();
        }
        long j2 = -1;
        for (int i = 0; i < 30; i++) {
            try {
                j2 = d.a(context);
                if (j2 > j) {
                    break;
                }
                gsv.b(a(), "waiting for odex size to be changed, retry after 2000ms");
                Thread.sleep(2000L);
            } catch (Throwable th) {
                gsv.a(a(), "get odex size occur error:", th);
            }
        }
        return j2;
    }
}
