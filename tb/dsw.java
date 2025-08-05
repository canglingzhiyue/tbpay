package tb;

import android.app.Activity;
import android.util.Pair;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes4.dex */
public class dsw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private duk f26949a;
    private Pair<Integer, duk> b;

    static {
        kge.a(1093034769);
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        return null;
    }

    public dsw(Activity activity) {
        this(activity, false);
    }

    public dsw(Activity activity, boolean z) {
        if (z) {
            if (this.b != null) {
                return;
            }
            this.b = new Pair<>(Integer.valueOf(System.identityHashCode(activity)), new duk(activity));
            return;
        }
        this.f26949a = new duk(activity);
    }

    public duk g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (duk) ipChange.ipc$dispatch("3d2dbe9e", new Object[]{this}) : this.f26949a;
    }

    public AURANextRPCEndpoint a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("3f200d1", new Object[]{this});
        }
        AURANextRPCEndpoint a2 = this.f26949a.a().a();
        a(a2);
        return a2;
    }

    public AURANextRPCEndpoint a(b bVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("19242e2c", new Object[]{this, bVar, new Boolean(z), new Boolean(z2)});
        }
        AURANextRPCEndpoint a2 = this.f26949a.a().a(bVar, z, z2);
        a(a2);
        return a2;
    }

    public AURANextRPCEndpoint b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("a05ffd30", new Object[]{this});
        }
        AURANextRPCEndpoint a2 = this.f26949a.b().a();
        a(a2);
        return a2;
    }

    public AURANextRPCEndpoint c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCEndpoint) ipChange.ipc$dispatch("3ccdf98f", new Object[]{this});
        }
        AURANextRPCEndpoint a2 = this.f26949a.c().a();
        a(a2);
        return a2;
    }

    private void a(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24827ecb", new Object[]{this, aURANextRPCEndpoint});
            return;
        }
        Map<String, String> d = d();
        if (d != null) {
            aURANextRPCEndpoint.appendParams(d);
        }
        Map<String, String> e = e();
        if (d == null) {
            return;
        }
        aURANextRPCEndpoint.appendHeaders(e);
    }
}
