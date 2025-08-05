package tb;

import com.alibaba.ability.b;
import com.alibaba.ability.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.g;
import com.taobao.android.abilitykit.mega.a;
import java.util.HashMap;

/* loaded from: classes.dex */
public class dkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean h;

    /* renamed from: a  reason: collision with root package name */
    private dks f26819a;
    private JSONObject b;
    private HashMap<String, Object> c;
    private alr e;
    private g f;
    private alu g;

    static {
        kge.a(-1697846670);
        h = false;
    }

    public alr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alr) ipChange.ipc$dispatch("f026057", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new alr("AbilityKit", "AbilityKit");
        }
        this.e.b(this);
        return this.e;
    }

    public void a(alr alrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e041bfd1", new Object[]{this, alrVar});
            return;
        }
        alr alrVar2 = this.e;
        if (alrVar2 == null) {
            this.e = alrVar;
        } else if (!"AbilityKit".equalsIgnoreCase(alrVar2.d()) || !"AbilityKit".equalsIgnoreCase(this.e.e())) {
        } else {
            this.e = alrVar;
            this.f26819a.b(alrVar.e());
        }
    }

    public static void a(dlc dlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e559781d", new Object[]{dlcVar});
        } else if (h) {
        } else {
            h = true;
            if (dlcVar == null) {
                return;
            }
            dks.a(dlcVar);
        }
    }

    public dkt() {
        this(null);
    }

    public dkt(alr alrVar, dku dkuVar) {
        this(dkuVar);
        this.e = alrVar;
    }

    public dkt(dku dkuVar) {
        this.g = null;
        d.a();
        this.f26819a = new dks(a().e());
        this.b = new JSONObject();
        this.c = new HashMap<>();
        this.f = new g();
    }

    public g b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("321b1828", new Object[]{this}) : this.f;
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            this.f.a(str, jSONObject);
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.b;
    }

    public boolean a(String str, dln dlnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2548ee00", new Object[]{this, str, dlnVar})).booleanValue() : this.f26819a.a(str, dlnVar);
    }

    public boolean a(String str, Class<? extends b> cls, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24434259", new Object[]{this, str, cls, str2})).booleanValue() : this.f26819a.a(str, new a(new com.alibaba.ability.builder.a(cls), str2));
    }

    public dlg<dle> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("7c6e6515", new Object[]{this, str}) : this.f26819a.a(str);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    public alu f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alu) ipChange.ipc$dispatch("357a9b8f", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new alu(a());
        }
        return this.g;
    }

    public dkx a(JSONObject jSONObject, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a2dbf5ee", new Object[]{this, jSONObject, dleVar, dllVar});
        }
        if (jSONObject == null) {
            dkw dkwVar = new dkw(new dkv(10002, "NULL"), true);
            dmn.a(dleVar, (dlh) null, dkwVar);
            return dkwVar;
        }
        return a(new dlh(jSONObject), dleVar, dllVar);
    }

    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        if (dleVar == null) {
            dleVar = new dle();
        }
        dleVar.a(this);
        String b = dlhVar.b();
        if (b != null) {
            try {
                dlg<dle> a2 = this.f26819a.a(b);
                if (a2 != null) {
                    return a2.b(dlhVar, dleVar, dllVar);
                }
            } catch (Throwable th) {
                dkw dkwVar = new dkw(new dkv(10000, "type " + b + ", exp=" + dmm.a(th)));
                dmn.a(dleVar, dlhVar, dkwVar);
                return dkwVar;
            }
        }
        dkw dkwVar2 = new dkw(new dkv(10002, "TypeNotFound：" + b));
        dmn.a(dleVar, dlhVar, dkwVar2);
        return dkwVar2;
    }
}
