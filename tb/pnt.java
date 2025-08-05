package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.Map;

/* loaded from: classes8.dex */
public class pnt implements pns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pns f32770a;
    private pno b;

    static {
        kge.a(-1799880124);
        kge.a(-1749827940);
    }

    public static /* synthetic */ pno a(pnt pntVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pno) ipChange.ipc$dispatch("1a55ff53", new Object[]{pntVar}) : pntVar.b;
    }

    public void a(pns pnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f71483", new Object[]{this, pnsVar});
        } else {
            this.f32770a = pnsVar;
        }
    }

    public void a(pno pnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f54307", new Object[]{this, pnoVar});
        } else {
            this.b = pnoVar;
        }
    }

    @Override // tb.pns
    public int a(int i, String str, pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f909d354", new Object[]{this, new Integer(i), str, pnrVar})).intValue();
        }
        if (this.f32770a == null) {
            return -1;
        }
        pnu pnuVar = new pnu();
        pnuVar.a(pnrVar);
        pnuVar.a(this.b);
        return this.f32770a.a(i, str, pnuVar);
    }

    @Override // tb.pns
    public void a(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34dafe", new Object[]{this, new Integer(i), str, new Integer(i2)});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(i, str, i2);
    }

    @Override // tb.pns
    public void a(final int i, final String str, String str2, final String str3, String str4, String str5, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c716ecc7", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, pnqVar, objArr});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(i, str, TextUtils.isEmpty(str2) ? "" : str2, str3, str4, str5, new pnq() { // from class: tb.pnt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i2, Map<String, Object> map, Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                    return;
                }
                pnq pnqVar2 = pnqVar;
                if (pnqVar2 != null) {
                    pnqVar2.a(i2, map, objArr2);
                }
                if (pnt.a(pnt.this) == null) {
                    return;
                }
                pnt.a(pnt.this).b(i2, i, str, str3);
            }
        }, objArr);
    }

    @Override // tb.pns
    public void a(final int i, final String str, String str2, final String str3, String str4, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcda211", new Object[]{this, new Integer(i), str, str2, str3, str4, pnqVar, objArr});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(i, str, TextUtils.isEmpty(str2) ? "" : str2, str3, str4, null, new pnq() { // from class: tb.pnt.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i2, Map<String, Object> map, Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                    return;
                }
                pnq pnqVar2 = pnqVar;
                if (pnqVar2 != null) {
                    pnqVar2.a(i2, map, objArr2);
                }
                if (pnt.a(pnt.this) == null) {
                    return;
                }
                pnt.a(pnt.this).b(i2, i, str, str3);
            }
        }, objArr);
    }

    @Override // tb.pns
    public void a(final int i, final String str, final String str2, String str3, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b61f5db", new Object[]{this, new Integer(i), str, str2, str3, pnqVar, objArr});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(i, str, str2, str3, (String) null, new pnq() { // from class: tb.pnt.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i2, Map<String, Object> map, Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                    return;
                }
                pnq pnqVar2 = pnqVar;
                if (pnqVar2 != null) {
                    pnqVar2.a(i2, map, objArr2);
                }
                if (pnt.a(pnt.this) == null) {
                    return;
                }
                pnt.a(pnt.this).b(i2, i, str, str2);
            }
        }, objArr);
    }

    @Override // tb.pns
    public void b(final int i, final String str, String str2, final String str3, String str4, String str5, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c63188", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, pnqVar, objArr});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.b(i, str, TextUtils.isEmpty(str2) ? "" : str2, str3, str4, str5, new pnq() { // from class: tb.pnt.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i2, Map<String, Object> map, Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                    return;
                }
                pnq pnqVar2 = pnqVar;
                if (pnqVar2 != null) {
                    pnqVar2.a(i2, map, objArr2);
                }
                if (pnt.a(pnt.this) == null) {
                    return;
                }
                pnt.a(pnt.this).a(i2, i, str, str3);
            }
        }, objArr);
    }

    @Override // tb.pns
    public void b(final int i, final String str, String str2, final String str3, String str4, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61554512", new Object[]{this, new Integer(i), str, str2, str3, str4, pnqVar, objArr});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.b(i, str, TextUtils.isEmpty(str2) ? "" : str2, str3, str4, null, new pnq() { // from class: tb.pnt.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i2, Map<String, Object> map, Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                    return;
                }
                pnq pnqVar2 = pnqVar;
                if (pnqVar2 != null) {
                    pnqVar2.a(i2, map, objArr2);
                }
                if (pnt.a(pnt.this) == null) {
                    return;
                }
                pnt.a(pnt.this).a(i2, i, str, str3);
            }
        }, objArr);
    }

    @Override // tb.pns
    public void b(final int i, final String str, final String str2, String str3, final pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e9071c", new Object[]{this, new Integer(i), str, str2, str3, pnqVar, objArr});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.b(i, str, str2, str3, null, new pnq() { // from class: tb.pnt.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pnq
            public void a(int i2, Map<String, Object> map, Object... objArr2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bad9c67", new Object[]{this, new Integer(i2), map, objArr2});
                    return;
                }
                pnq pnqVar2 = pnqVar;
                if (pnqVar2 != null) {
                    pnqVar2.a(i2, map, objArr2);
                }
                if (pnt.a(pnt.this) == null) {
                    return;
                }
                pnt.a(pnt.this).a(i2, i, str, str2);
            }
        }, objArr);
    }

    @Override // tb.pns
    public void a(int i, TLiveMsg tLiveMsg, pnq pnqVar, Object... objArr) {
        pns pnsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab74d526", new Object[]{this, new Integer(i), tLiveMsg, pnqVar, objArr});
        } else if (tLiveMsg == null || (pnsVar = this.f32770a) == null) {
        } else {
            pnsVar.a(i, tLiveMsg, pnqVar, objArr);
        }
    }

    @Override // tb.pns
    public void b(int i, TLiveMsg tLiveMsg, pnq pnqVar, Object... objArr) {
        pns pnsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89683b05", new Object[]{this, new Integer(i), tLiveMsg, pnqVar, objArr});
        } else if (tLiveMsg == null || (pnsVar = this.f32770a) == null) {
        } else {
            pnsVar.a(i, tLiveMsg, pnqVar, objArr);
        }
    }

    @Override // tb.pns
    public void a(int i, String str, Map<String, Double> map, boolean z, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539b5da0", new Object[]{this, new Integer(i), str, map, new Boolean(z), pnqVar, objArr});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(i, str, map, z, pnqVar, objArr);
    }

    @Override // tb.pns
    public void a(int i, TLiveMsg tLiveMsg, int i2) {
        pns pnsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3970df5", new Object[]{this, new Integer(i), tLiveMsg, new Integer(i2)});
        } else if (tLiveMsg == null || (pnsVar = this.f32770a) == null) {
        } else {
            pnsVar.a(i, tLiveMsg, i2);
        }
    }

    @Override // tb.pns
    public void a(int i, String str, int i2, int i3, int i4, pnq pnqVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c4f616", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), pnqVar, objArr});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(i, str, i2, i3, i4, pnqVar, objArr);
    }

    @Override // tb.pns
    public void a(TLiveMsg tLiveMsg, int i, boolean z) {
        pns pnsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0459252", new Object[]{this, tLiveMsg, new Integer(i), new Boolean(z)});
        } else if (tLiveMsg == null || (pnsVar = this.f32770a) == null) {
        } else {
            pnsVar.a(tLiveMsg, i, z);
        }
    }

    @Override // tb.pns
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.c();
    }

    @Override // tb.pns
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.d();
    }

    @Override // tb.pns
    public void a(boolean z, boolean z2, pnn pnnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f92f28", new Object[]{this, new Boolean(z), new Boolean(z2), pnnVar});
            return;
        }
        pns pnsVar = this.f32770a;
        if (pnsVar == null) {
            return;
        }
        pnsVar.a(z, z2, pnnVar);
    }
}
