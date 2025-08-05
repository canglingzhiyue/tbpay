package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ggu f28317a;
    public ggj b = new ggj();

    static {
        kge.a(1801943756);
    }

    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte f28319a;
        private boolean b;
        private short c;
        private String d;

        static {
            kge.a(403010830);
        }

        public b(byte b, boolean z, short s, String str) {
            this.f28319a = b;
            this.b = z;
            this.c = s;
            this.d = str;
        }

        public byte a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c54", new Object[]{this})).byteValue() : this.f28319a;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
        }

        public short c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b67", new Object[]{this})).shortValue() : this.c;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final int f28318a;
        private final byte b;

        static {
            kge.a(-599465914);
        }

        public a(int i, byte b) {
            this.f28318a = i;
            this.b = b;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f28318a;
        }

        public byte b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d5", new Object[]{this})).byteValue() : this.b;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.f28316a = i;
        }
    }

    public byte c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b56", new Object[]{this})).byteValue() : this.b.b;
    }

    public short d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2e8", new Object[]{this})).shortValue() : this.b.c;
    }

    public void a(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821b925", new Object[]{this, new Short(s)});
        } else {
            this.b.c = s;
        }
    }

    public void a(byte b2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b2)});
        } else {
            this.b.b = b2;
        }
    }

    public List<ggl> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.b.d;
    }

    public void a(List<ggl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.b.d = list;
        }
    }

    public b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("cb33bc10", new Object[]{this}) : this.b.e;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307c74af", new Object[]{this, bVar});
        } else {
            this.b.e = bVar;
        }
    }

    public List<a> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.b.f;
    }

    public void b(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.b.f = list;
        }
    }

    public ggu h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ggu) ipChange.ipc$dispatch("44e08dc2", new Object[]{this}) : this.f28317a;
    }

    public void a(ggu gguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea39bb23", new Object[]{this, gguVar});
        } else {
            this.f28317a = gguVar;
        }
    }

    public gfx i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("4c922fbd", new Object[]{this});
        }
        ggu gguVar = this.f28317a;
        if (gguVar != null) {
            short g = gguVar.g();
            if (g == 1 || g == 2) {
                return gfx.a(this.f28317a.e());
            }
            if (g == 3) {
                return gfx.a(this.f28317a.c());
            }
            if (g == 4) {
                if (this.f28317a.f() != null) {
                    return gfx.a(this.f28317a.f().toString());
                }
                return gfx.a((String) null);
            } else if (g == 8) {
                return gfx.a((List<Object>) this.f28317a.f());
            } else {
                if (g == 9) {
                    return gfx.a((Map<String, Object>) this.f28317a.f());
                }
                if (g == 14) {
                    return gfx.a(this.f28317a.f());
                }
                if (g == 15) {
                    return gfx.a(this.f28317a.a());
                }
                if (g == 17) {
                    return gfx.a(this.f28317a.d());
                }
            }
        }
        return gfx.e();
    }

    public void a(ggk ggkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea352f6d", new Object[]{this, ggkVar});
            return;
        }
        ggkVar.b = this.b;
        ggu gguVar = this.f28317a;
        if (gguVar == null) {
            ggkVar.f28317a = null;
        } else {
            ggkVar.f28317a = gguVar.b();
        }
    }
}
