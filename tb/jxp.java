package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class jxp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jyb f29852a;
    private jxo b = new jxo();
    private jyo c = new jyl();
    private Class<? extends jyc> d = null;
    private Class<? extends jxm> e = jxn.class;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private List<jye> i = new ArrayList();

    static {
        kge.a(1617199202);
    }

    public jyb a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jyb) ipChange.ipc$dispatch("f06a68b", new Object[]{this}) : this.f29852a;
    }

    public void a(jyb jybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f04d4905", new Object[]{this, jybVar});
        } else {
            this.f29852a = jybVar;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public Class<? extends jyc> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("8fe80319", new Object[]{this}) : this.d;
    }

    public void a(Class<? extends jyc> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{this, cls});
        } else {
            this.d = cls;
        }
    }

    public void a(String str, Class<? extends jxt> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{this, str, cls});
        } else {
            this.b.a(str, cls);
        }
    }

    public jxo f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jxo) ipChange.ipc$dispatch("357edf38", new Object[]{this}) : this.b;
    }

    public List<jye> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.i;
    }

    public void a(jye jyeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f04ea622", new Object[]{this, jyeVar});
        } else {
            this.i.add(jyeVar);
        }
    }

    public Class<? extends jxm> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("b5b2e39c", new Object[]{this}) : this.e;
    }

    public void b(Class<? extends jxm> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7800274", new Object[]{this, cls});
        } else {
            this.e = cls;
        }
    }

    public jyo i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jyo) ipChange.ipc$dispatch("4c93d316", new Object[]{this}) : this.c;
    }
}
