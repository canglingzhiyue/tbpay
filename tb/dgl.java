package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorCommitResult;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.achieve.b;
import com.tanx.exposer.achieve.retry.b;
import com.tanx.exposer.c;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.dgk;

/* loaded from: classes4.dex */
public class dgl extends dgk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Queue<String> e;
    private static Map<String, b> f;

    public static /* synthetic */ Object ipc$super(dgl dglVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(dgl dglVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97dab28d", new Object[]{dglVar, str, str2, str3});
        } else {
            dglVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : f;
    }

    public static /* synthetic */ Queue c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("ea7ff0a", new Object[0]) : e;
    }

    static {
        kge.a(1711358046);
        e = new ConcurrentLinkedQueue();
        f = new ConcurrentHashMap();
    }

    public dgl(AdMonitorType adMonitorType, List<String> list, c cVar) {
        super(adMonitorType, list, cVar);
    }

    @Override // tb.dgk
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
                } else if (e.contains(a2)) {
                    dgy.a(this.c);
                } else {
                    dgv.a(new Runnable() { // from class: tb.dgl.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dgl.a(dgl.this, str, host, a2);
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
        } else if (e.contains(str3)) {
            dgy.a(this.c);
        } else {
            b bVar = f.get(str3);
            if (bVar != null) {
                b.C0310b.tanxc_do.a(bVar);
                if (this.c == null) {
                    return;
                }
                dha.a("tanx_expose_request_pending", this.c.toString());
                return;
            }
            dgy.a(this.c, this.b, str2, str3);
            String a2 = this.c == null ? str : dhb.a(str, this.c.a());
            com.tanx.exposer.achieve.b bVar2 = new com.tanx.exposer.achieve.b(str, a2, this.b, str2, str3, this.d.c());
            bVar2.a(this.c);
            new dgp(this.d.d()).a(this.b, a2, new a(bVar2, false));
            f.put(str3, bVar2);
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends dgk.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1816053532);
        }

        public a(com.tanx.exposer.achieve.b bVar, boolean z) {
            super(bVar, z);
        }

        @Override // tb.dgk.a, tb.dgr
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                dgv.a(new Runnable() { // from class: tb.dgl.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b.C0310b.tanxc_do.a(a.this.b, a.this.f26729a);
                        dgl.b().remove(a.this.b.e());
                        if (dgl.c().size() >= 1000) {
                            dgl.c().poll();
                        }
                        dgl.c().offer(a.this.b.e());
                    }
                }, 0L);
            }
        }

        @Override // tb.dgk.a, tb.dgr
        public void a(final int i, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            } else {
                dgv.a(new Runnable() { // from class: tb.dgl.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b.C0310b.tanxc_do.a(a.this.b, i, str, a.this.f26729a);
                        if (b.C0310b.tanxc_do.b(a.this.b)) {
                            return;
                        }
                        dgl.b().remove(a.this.b.e());
                    }
                }, 0L);
            }
        }
    }
}
