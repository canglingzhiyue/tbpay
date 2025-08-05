package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public abstract class irv implements irz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public irw f29265a;
    public int b = -1;
    public NavigableMap<Integer, irw> c = new TreeMap();

    static {
        kge.a(-907131921);
        kge.a(2013495334);
    }

    public float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue();
        }
        return 0.75f;
    }

    @Override // tb.irz
    public void a(iry iryVar, irw irwVar, int i) {
        int i2;
        Map.Entry<Integer, irw> higherEntry;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe6bc99", new Object[]{this, iryVar, irwVar, new Integer(i)});
        } else if (this.c.isEmpty() || (i2 = this.b) < 0 || this.f29265a == null || (higherEntry = this.c.higherEntry(Integer.valueOf(i2))) == null) {
        } else {
            int intValue = higherEntry.getKey().intValue();
            irw value = higherEntry.getValue();
            int D = iryVar.D();
            int E = iryVar.E();
            int f = value.f();
            int g = value.g();
            int b = (int) ((g - f) * b());
            if (g - D < b || E - f < b) {
                return;
            }
            a(value, intValue);
        }
    }

    @Override // tb.irz
    public void a(boolean z, iry iryVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b0636c", new Object[]{this, new Boolean(z), iryVar});
        } else {
            c(z, iryVar);
        }
    }

    @Override // tb.irz
    public void b(boolean z, iry iryVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78e2d0b", new Object[]{this, new Boolean(z), iryVar});
        } else {
            c(z, iryVar);
        }
    }

    private void c(boolean z, iry iryVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a96bf6aa", new Object[]{this, new Boolean(z), iryVar});
        } else if (!z) {
            a();
        } else {
            a(iryVar);
        }
    }

    @Override // tb.irz
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        irw irwVar = this.f29265a;
        if (irwVar != null) {
            irwVar.c();
        }
        this.f29265a = null;
        this.b = -1;
    }

    public final void a(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac1099", new Object[]{this, irwVar, new Integer(i)});
            return;
        }
        irw irwVar2 = this.f29265a;
        if (irwVar == irwVar2) {
            return;
        }
        if (irwVar2 != null) {
            irwVar2.c();
        }
        irwVar.b();
        this.f29265a = irwVar;
        this.b = i;
    }

    @Override // tb.irz
    public void b(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb89da38", new Object[]{this, irwVar, new Integer(i)});
        } else if (!irwVar.d()) {
        } else {
            this.c.put(Integer.valueOf(i), irwVar);
        }
    }

    @Override // tb.irz
    public void c(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d67a3d7", new Object[]{this, irwVar, new Integer(i)});
            return;
        }
        if (irwVar == this.f29265a) {
            irwVar.c();
            this.f29265a = null;
            this.b = -1;
        }
        this.c.remove(Integer.valueOf(i));
    }

    @Override // tb.irz
    public void d(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f456d76", new Object[]{this, irwVar, new Integer(i)});
        } else if (!irwVar.d() || !irwVar.e()) {
        } else {
            if (irwVar == this.f29265a) {
                irwVar.b();
            } else {
                irwVar.c();
            }
        }
    }

    @Override // tb.irz
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (Map.Entry<Integer, irw> entry : this.c.entrySet()) {
            d(entry.getValue(), entry.getKey().intValue());
        }
    }

    @Override // tb.irz
    public void e(irw irwVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61233715", new Object[]{this, irwVar, new Integer(i)});
        } else if (irwVar == null || irwVar == this.f29265a) {
        } else {
            a();
            a(irwVar, i);
        }
    }

    @Override // tb.irz
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a();
        this.c.clear();
    }
}
