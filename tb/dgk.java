package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorCommitResult;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.achieve.retry.b;
import com.tanx.exposer.b;
import com.tanx.exposer.c;
import com.tanx.exposer.d;
import java.util.List;

/* loaded from: classes4.dex */
public class dgk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f26727a;
    public AdMonitorType b;
    public c c;
    public b d = d.a().d();

    static {
        kge.a(1711357900);
        kge.a(-1242111441);
    }

    public static /* synthetic */ void a(dgk dgkVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed9b6e", new Object[]{dgkVar, str, str2, str3});
        } else {
            dgkVar.a(str, str2, str3);
        }
    }

    public dgk(AdMonitorType adMonitorType, List<String> list, c cVar) {
        this.b = adMonitorType;
        this.f26727a = list;
        this.c = cVar;
    }

    public AdMonitorCommitResult a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("85c55f1b", new Object[]{this});
        }
        for (final String str : this.f26727a) {
            final String a2 = dhb.a(str);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(a2)) {
                dgy.b(this.c, this.b, "url_is_empty_or_hash_error");
            } else {
                final String host = Uri.parse(str).getHost();
                if (TextUtils.isEmpty(host)) {
                    dgy.b(this.c, this.b, "domain_not_right");
                } else {
                    dgv.a(new Runnable() { // from class: tb.dgk.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dgk.a(dgk.this, str, host, a2);
                            }
                        }
                    }, 0L);
                }
            }
        }
        return AdMonitorCommitResult.COMMITED;
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        c cVar = this.c;
        String a2 = cVar == null ? str : dhb.a(str, cVar.a());
        dgy.a(this.c, this.b, str2, str3);
        com.tanx.exposer.achieve.b bVar = new com.tanx.exposer.achieve.b(str, a2, this.b, str2, str3, this.d.c());
        bVar.a(this.c);
        new dgp(this.d.d()).a(this.b, a2, new a(bVar, false));
    }

    /* loaded from: classes4.dex */
    public static class a implements dgr {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f26729a;
        public com.tanx.exposer.achieve.b b;

        static {
            kge.a(1105114422);
            kge.a(-729852121);
        }

        public a(com.tanx.exposer.achieve.b bVar, boolean z) {
            this.b = bVar;
            this.f26729a = z;
        }

        @Override // tb.dgr
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                dgv.a(new Runnable() { // from class: tb.dgk.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.C0310b.tanxc_do.a(a.this.b, a.this.f26729a);
                        }
                    }
                }, 0L);
            }
        }

        @Override // tb.dgr
        public void a(final int i, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            } else {
                dgv.a(new Runnable() { // from class: tb.dgk.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            b.C0310b.tanxc_do.a(a.this.b, i, str, a.this.f26729a);
                        }
                    }
                }, 0L);
            }
        }
    }
}
