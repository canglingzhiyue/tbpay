package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class o extends w {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long kAllProperties = 0;
    public static final long kOnlyConfigurable = 4;
    public static final long kOnlyEnumerable = 2;
    public static final long kOnlyWritable = 1;

    static {
        kge.a(-1879165908);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public o o_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("f50c6c7d", new Object[]{this}) : this;
    }

    public o(com.alibaba.jsi.standard.d dVar) {
        super(dVar, Bridge.createNative(dVar, 7));
        k(dVar);
    }

    public o(com.alibaba.jsi.standard.d dVar, long j) {
        super(dVar, j);
        k(dVar);
    }

    public boolean a(com.alibaba.jsi.standard.d dVar, w wVar, w wVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("678388b9", new Object[]{this, dVar, wVar, wVar2})).booleanValue();
        }
        m();
        return Bridge.cmd(dVar, 100, this.b, new Object[]{wVar, wVar2}) != null;
    }

    public boolean a(com.alibaba.jsi.standard.d dVar, int i, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2310044", new Object[]{this, dVar, new Integer(i), wVar})).booleanValue();
        }
        m();
        return Bridge.cmd(dVar, 101, this.b, (long) i, new Object[]{wVar}) != null;
    }

    public boolean a(com.alibaba.jsi.standard.d dVar, String str, w wVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3cd7ded3", new Object[]{this, dVar, str, wVar})).booleanValue() : a(dVar, new s(str), wVar);
    }

    public w a(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("bbc33a37", new Object[]{this, dVar, wVar});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 102, this.b, new Object[]{wVar});
        if (cmd == null) {
            return null;
        }
        return (w) cmd;
    }

    public w a(com.alibaba.jsi.standard.d dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("4b13254c", new Object[]{this, dVar, new Integer(i)});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 103, this.b, i);
        if (cmd == null) {
            return null;
        }
        return (w) cmd;
    }

    public w a(com.alibaba.jsi.standard.d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("a9deb8dd", new Object[]{this, dVar, str}) : a(dVar, new s(str));
    }

    public boolean b(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf635a7c", new Object[]{this, dVar, wVar})).booleanValue();
        }
        m();
        return Bridge.cmd(dVar, 104, this.b, new Object[]{wVar}) != null;
    }

    public boolean b(com.alibaba.jsi.standard.d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b711f984", new Object[]{this, dVar, str})).booleanValue() : b(dVar, new s(str));
    }

    public boolean c(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dc45e5b", new Object[]{this, dVar, wVar})).booleanValue();
        }
        m();
        return Bridge.cmd(dVar, 106, this.b, new Object[]{wVar}) != null;
    }

    public boolean c(com.alibaba.jsi.standard.d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa9d1745", new Object[]{this, dVar, str})).booleanValue() : c(dVar, new s(str));
    }

    public d e(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("683f2e8a", new Object[]{this, dVar});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 111, this.b);
        if (cmd == null) {
            return null;
        }
        return (d) cmd;
    }

    public d a(com.alibaba.jsi.standard.d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c8eadf00", new Object[]{this, dVar, new Long(j)});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 124, this.b, j);
        if (cmd == null) {
            return null;
        }
        return (d) cmd;
    }

    public w f(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("5bceb518", new Object[]{this, dVar});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 116, this.b);
        if (cmd == null) {
            return null;
        }
        return (w) cmd;
    }

    public boolean d(com.alibaba.jsi.standard.d dVar, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc25623a", new Object[]{this, dVar, wVar})).booleanValue();
        }
        m();
        return Bridge.cmd(dVar, 117, this.b, new Object[]{wVar}) != null;
    }

    public h g(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("4f5e3788", new Object[]{this, dVar});
        }
        m();
        Object cmd = Bridge.cmd(dVar, 119, this.b);
        if (!(cmd instanceof h)) {
            return null;
        }
        return (h) cmd;
    }

    public boolean h(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91c4d940", new Object[]{this, dVar})).booleanValue();
        }
        m();
        return Bridge.cmd(dVar, 122, this.b) != null;
    }

    @Override // com.alibaba.jsi.standard.js.w
    public z i(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (z) ipChange.ipc$dispatch("367d4238", new Object[]{this, dVar}) : m(dVar);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public final w j(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("2a0cc61c", new Object[]{this, dVar}) : n(dVar);
    }

    public static void k(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c0d3f", new Object[]{dVar});
        } else if (!dVar.c()) {
        } else {
            throw new RuntimeException("JSContext '" + dVar.e() + "'has been disposed!");
        }
    }
}
