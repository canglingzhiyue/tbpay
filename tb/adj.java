package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;
import com.taobao.analysis.v3.p;

/* loaded from: classes2.dex */
public class adj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public n f25267a;

    static {
        kge.a(-285483817);
    }

    public adj() {
    }

    public adj(n nVar) {
        this.f25267a = nVar;
    }

    public void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d53277b", new Object[]{this, nVar});
        } else {
            this.f25267a = nVar;
        }
    }

    public void a(adj adjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcd60d1", new Object[]{this, adjVar});
        } else if (adjVar == null) {
        } else {
            this.f25267a = adjVar.f25267a;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f25267a == null) {
        } else {
            n.ERROR_CODE.a(this.f25267a, "failed");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return;
        }
        nVar.c();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return;
        }
        nVar.b(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return;
        }
        nVar.f(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return;
        }
        nVar.a(str);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return;
        }
        nVar.a(str, str2);
        n nVar2 = this.f25267a;
        nVar2.f("{\"H5Property\":\"" + str + "\",\"value\":\"" + str2 + "\"}");
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return;
        }
        nVar.a(str, str2);
        n nVar2 = this.f25267a;
        nVar2.f("{\"H5CustomProperty\":\"" + str + "\",\"value\":\"" + str2 + "\"}");
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return;
        }
        nVar.a(str, z);
        n nVar2 = this.f25267a;
        nVar2.f("{\"H5Property\":\"" + str + "\",\"value\":\"" + z + "\"}");
    }

    public void a(String str, Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d7a744", new Object[]{this, str, number});
            return;
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return;
        }
        nVar.a(str, number);
        n nVar2 = this.f25267a;
        nVar2.f("{\"H5Property\":\"" + str + "\",\"value\":\"" + number + "\"}");
    }

    public p d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("d389b912", new Object[]{this, str});
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return null;
        }
        return nVar.c(str);
    }

    public mys c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mys) ipChange.ipc$dispatch("1e6b5075", new Object[]{this});
        }
        n nVar = this.f25267a;
        if (nVar == null) {
            return null;
        }
        return nVar.h();
    }
}
