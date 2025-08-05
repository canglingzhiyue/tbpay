package tb;

import android.content.Context;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.a;
import com.taobao.android.resourceguardian.data.model.b;
import java.util.Map;
import tb.ilj;

/* loaded from: classes6.dex */
public class ilf implements ilj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ili b;
    private final iln d;
    private Context e;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<ilb> f29133a = new SparseArray<>();
    private final ilh c = new ilh();

    static {
        kge.a(-1941199023);
        kge.a(1853984502);
    }

    public ilf(iln ilnVar, ili iliVar) {
        this.b = iliVar;
        this.d = ilnVar;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.d.a(4, this);
        this.d.a(2, this);
        this.d.a(1, this);
        this.d.a(3, this);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        ilv.a(context);
        if (!ilv.a()) {
            return;
        }
        ilt.a("TBResourceGuardianController", "start init TBResourceGuardianController");
        this.e = context;
        b();
        this.d.a(context);
        this.c.a(context);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!ilv.a()) {
        } else {
            this.d.a();
        }
    }

    private void a(ilb ilbVar, b bVar) {
        boolean a2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58464f4", new Object[]{this, ilbVar, bVar});
        } else if (this.e == null) {
            ilt.a("TBResourceGuardianController", "cancel notify, context is null", bVar.toString());
        } else {
            String c = ilbVar.c();
            String d = ilbVar.d();
            boolean b = ilv.b(c);
            if (b) {
                boolean b2 = ilv.b(this.e);
                if (b2) {
                    a2 = ilbVar.a(bVar);
                    z = b2;
                } else {
                    z = b2;
                    a2 = false;
                }
            } else {
                a2 = ilbVar.a(bVar);
                z = false;
            }
            ilt.a("TBResourceGuardianController", "notifyAndCount", "bizName", c, "bizUrl", d, "isDowngraded", String.valueOf(a2), "isAbSwitchOn", String.valueOf(z), "isBizAbSwitchOn", String.valueOf(b), bVar.toString());
            ilu.a(c, bVar, a2, z, b, d);
        }
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733ff0c3", new Object[]{this, bVar});
            return;
        }
        if (ilv.b()) {
            ilt.a("TBResourceGuardianController", "notifyPerformanceWarning", bVar.toString());
        }
        synchronized (this) {
            for (int i = 0; i < this.f29133a.size(); i++) {
                ilb valueAt = this.f29133a.valueAt(i);
                if (valueAt.b() == 9) {
                    a(valueAt, bVar);
                } else if (valueAt.b() == bVar.f14879a && (valueAt.a() == 999 || valueAt.b() == bVar.f14879a)) {
                    a(valueAt, bVar);
                }
            }
        }
    }

    @Override // tb.ilj.a
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733f7c64", new Object[]{this, aVar});
            return;
        }
        b a2 = this.b.a(aVar);
        if (a2 == null) {
            return;
        }
        a(a2);
    }

    public boolean a(ilb ilbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ede13edd", new Object[]{this, ilbVar})).booleanValue();
        }
        ilc ilcVar = new ilc(ilbVar);
        ilu.a("add", ilcVar.c(), ilcVar.b(), ilcVar.a(), ilcVar.d());
        ilt.a("TBResourceGuardianController", "add performance listener", "listener biz is", ilcVar.c(), "listener url is", ilcVar.d());
        synchronized (this) {
            this.f29133a.put(ilbVar.hashCode(), ilcVar);
        }
        return true;
    }

    public boolean b(ilb ilbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc64455e", new Object[]{this, ilbVar})).booleanValue();
        }
        ilb ilbVar2 = this.f29133a.get(ilbVar.hashCode());
        if (ilbVar2 == null) {
            return false;
        }
        ilu.a("remove", ilbVar2.c(), ilbVar2.b(), ilbVar2.a(), ilbVar2.d());
        ilt.a("TBResourceGuardianController", "remove performance listener", "listener biz is", ilbVar2.c(), "listener url is", ilbVar2.d());
        synchronized (this) {
            this.f29133a.remove(ilbVar.hashCode());
        }
        return true;
    }

    public Map<String, String> a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("35efba90", new Object[]{this, new Integer(i)}) : this.c.a(i);
    }
}
