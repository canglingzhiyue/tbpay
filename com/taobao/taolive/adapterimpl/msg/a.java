package com.taobao.taolive.adapterimpl.msg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Map;
import tb.kge;
import tb.pef;
import tb.peh;
import tb.pej;
import tb.pmc;
import tb.pmd;
import tb.pnm;
import tb.pnn;
import tb.pnq;
import tb.pnr;
import tb.pns;
import tb.ppp;

/* loaded from: classes8.dex */
public class a implements pnm, pns, ppp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pef f21379a;
    private b b;
    private boolean c = true;
    private boolean d = true;
    private pnn e;
    private boolean f;

    static {
        kge.a(133988796);
        kge.a(-1749827940);
        kge.a(-1103629701);
        kge.a(-1010935401);
    }

    @Override // tb.pns
    public void a(int i, TLiveMsg tLiveMsg, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3970df5", new Object[]{this, new Integer(i), tLiveMsg, new Integer(i2)});
        }
    }

    @Override // tb.pns
    public void a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34dafe", new Object[]{this, new Integer(i), str, new Integer(i2)});
        }
    }

    @Override // tb.pns
    public void a(TLiveMsg tLiveMsg, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0459252", new Object[]{this, tLiveMsg, new Integer(i), new Boolean(z)});
        }
    }

    public static /* synthetic */ pnn a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pnn) ipChange.ipc$dispatch("a77bf5fe", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("847eb01d", new Object[]{aVar})).booleanValue() : aVar.f;
    }

    @Override // tb.pns
    public int a(int i, String str, pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f909d354", new Object[]{this, new Integer(i), str, pnrVar})).intValue();
        }
        if (this.b == null) {
            this.b = new b();
        }
        this.b.a(pnrVar);
        return 1;
    }

    @Override // tb.pns
    public void a(int i, String str, String str2, String str3, String str4, String str5, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c716ecc7", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, pnqVar, objArr});
            return;
        }
        pmd.a().w().b();
        pmd.a().y().a(pmd.a().u().c(), this);
        pmd.a().u().a(this);
        this.f21379a = new pef(pmd.a().x().a(pmd.a().u().c()), this.c, this.d, new pej() { // from class: com.taobao.taolive.adapterimpl.msg.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pej
            public Map<String, String> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("a014a89d", new Object[]{this});
                }
                if (a.a(a.this) == null) {
                    return null;
                }
                return a.a(a.this).getHeartParams();
            }

            @Override // tb.pej
            public int b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : com.taobao.taolive.sdk.utils.b.f(pmd.a().u().c());
            }

            @Override // tb.pej
            public boolean c() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : pmc.a().b().e();
            }

            @Override // tb.pej
            public boolean d() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : a.b(a.this);
            }
        });
        peh pehVar = new peh();
        pehVar.f32566a = i;
        pehVar.b = str;
        pehVar.c = str2;
        pehVar.d = str3;
        pehVar.e = str5;
        pehVar.f = pnqVar;
        this.f21379a.a(pehVar);
        this.f21379a.a(this.b);
    }

    @Override // tb.pns
    public void a(int i, String str, String str2, String str3, String str4, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcda211", new Object[]{this, new Integer(i), str, str2, str3, str4, pnqVar, objArr});
        } else {
            a(i, str, null, str3, str4, null, pnqVar, objArr);
        }
    }

    @Override // tb.pns
    public void a(int i, String str, String str2, String str3, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b61f5db", new Object[]{this, new Integer(i), str, str2, str3, pnqVar, objArr});
        } else {
            a(i, str, (String) null, str2, str3, pnqVar, objArr);
        }
    }

    @Override // tb.pns
    public void b(int i, String str, String str2, String str3, String str4, String str5, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c63188", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, pnqVar, objArr});
            return;
        }
        if (this.f21379a != null) {
            peh pehVar = new peh();
            pehVar.f32566a = i;
            pehVar.b = str;
            pehVar.c = str2;
            pehVar.d = str3;
            pehVar.e = str5;
            pehVar.f = pnqVar;
            this.f21379a.b(pehVar);
            this.f21379a.b(this.b);
            this.f21379a = null;
        }
        this.e = null;
        pmd.a().u().b(this);
        pmd.a().y().b(pmd.a().u().c(), this);
    }

    @Override // tb.pns
    public void b(int i, String str, String str2, String str3, String str4, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61554512", new Object[]{this, new Integer(i), str, str2, str3, str4, pnqVar, objArr});
        } else {
            b(i, str, null, str3, str4, null, pnqVar, objArr);
        }
    }

    @Override // tb.pns
    public void b(int i, String str, String str2, String str3, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e9071c", new Object[]{this, new Integer(i), str, str2, str3, pnqVar, objArr});
        } else {
            b(i, str, null, str2, str3, pnqVar, objArr);
        }
    }

    @Override // tb.pns
    public void a(int i, TLiveMsg tLiveMsg, pnq pnqVar, Object... objArr) {
        pef pefVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab74d526", new Object[]{this, new Integer(i), tLiveMsg, pnqVar, objArr});
        } else if (tLiveMsg == null || (pefVar = this.f21379a) == null) {
        } else {
            pefVar.a(tLiveMsg, pnqVar);
        }
    }

    @Override // tb.pns
    public void b(int i, TLiveMsg tLiveMsg, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89683b05", new Object[]{this, new Integer(i), tLiveMsg, pnqVar, objArr});
        } else {
            a(i, tLiveMsg, pnqVar, objArr);
        }
    }

    @Override // tb.pns
    public void a(int i, String str, Map<String, Double> map, boolean z, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539b5da0", new Object[]{this, new Integer(i), str, map, new Boolean(z), pnqVar, objArr});
            return;
        }
        pef pefVar = this.f21379a;
        if (pefVar == null) {
            return;
        }
        pefVar.a(map, z, pnqVar);
    }

    @Override // tb.pns
    public void a(int i, String str, int i2, int i3, int i4, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c4f616", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), pnqVar, objArr});
            return;
        }
        pef pefVar = this.f21379a;
        if (pefVar == null) {
            return;
        }
        pefVar.a(i2, i3, i4, pnqVar);
    }

    @Override // tb.pns
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        pef pefVar = this.f21379a;
        if (pefVar == null) {
            return;
        }
        pefVar.c();
    }

    @Override // tb.pns
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        pef pefVar = this.f21379a;
        if (pefVar == null) {
            return;
        }
        pefVar.d();
    }

    @Override // tb.ppp.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        pef pefVar = this.f21379a;
        if (pefVar == null) {
            return;
        }
        pefVar.a();
    }

    @Override // tb.ppp.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        pef pefVar = this.f21379a;
        if (pefVar == null) {
            return;
        }
        pefVar.b();
    }

    @Override // tb.pns
    public void a(boolean z, boolean z2, pnn pnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f92f28", new Object[]{this, new Boolean(z), new Boolean(z2), pnnVar});
            return;
        }
        this.c = z;
        this.d = z2;
        this.e = pnnVar;
    }

    @Override // tb.pnm
    public void a(Boolean bool, int i, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29532c08", new Object[]{this, bool, new Integer(i), str});
            return;
        }
        if (bool != null && !bool.booleanValue()) {
            z = false;
        }
        this.f = z;
    }
}
