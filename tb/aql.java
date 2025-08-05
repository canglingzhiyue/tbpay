package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.j;
import com.alibaba.android.aura.nodemodel.a;
import com.alibaba.android.aura.nodemodel.branch.b;
import com.alibaba.android.aura.nodemodel.branch.c;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.arc;

/* loaded from: classes2.dex */
public class aql {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private q b;
    private j c;
    private a d;
    private Map<String, aqp> f;

    /* renamed from: a  reason: collision with root package name */
    private final String f25518a = "AURABranchManager";
    private Map<String, Boolean> e = new ConcurrentHashMap();

    static {
        kge.a(225901286);
    }

    public aql(q qVar, j jVar, a aVar) {
        this.b = qVar;
        this.c = jVar;
        this.d = aVar;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f = new HashMap();
        aqo aqoVar = new aqo();
        this.f.put(aqoVar.a(), aqoVar);
    }

    public boolean a(c cVar) {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe2c1914", new Object[]{this, cVar})).booleanValue();
        }
        if (cVar == null) {
            return true;
        }
        String str = cVar.f2155a;
        boolean parseBoolean = Boolean.parseBoolean(cVar.b);
        String str2 = cVar.c;
        if (TextUtils.isEmpty(str)) {
            arc.a().a("branchValue#branchCode is empty", arc.a.a().b("AURABranchManager").a("默认值", parseBoolean).b());
            return parseBoolean;
        }
        com.alibaba.android.aura.nodemodel.branch.a b = this.d.b(str);
        if (b == null) {
            if (baw.a()) {
                ard a2 = arc.a();
                a2.a("branchValue#在配置中找不到【" + str + "】", arc.a.a().b("AURABranchManager").a("默认值", parseBoolean).b());
            }
            return parseBoolean;
        }
        Boolean a3 = a(b);
        if (a3 == null) {
            List<b> list = b.c;
            if (bau.a(list)) {
                ard a4 = arc.a();
                a4.c("AURABranchManager", "branchValueForCode", "配置【" + str + "】中没有配置具体的Condition");
                return parseBoolean;
            }
            booleanValue = a(list);
            a(b, booleanValue);
        } else {
            booleanValue = a3.booleanValue();
        }
        return a(booleanValue, str2);
    }

    private boolean a(List<b> list) {
        boolean z = true;
        for (b bVar : list) {
            Class<? extends aqn> d = this.c.d(bVar.f2154a);
            if (d != null) {
                try {
                    aqn newInstance = d.newInstance();
                    newInstance.a(this.b);
                    z = a(newInstance.a(bVar.b), bVar.c);
                    if (!z) {
                        break;
                    }
                } catch (IllegalAccessException e) {
                    ard a2 = arc.a();
                    a2.c("AURABranchManager", "branchValueForCode", "创建实例失败(IllegalAccessException)：" + e.getMessage());
                } catch (InstantiationException e2) {
                    ard a3 = arc.a();
                    a3.c("AURABranchManager", "branchValueForCode", "创建实例失败(InstantiationException)：" + e2.getMessage());
                }
            }
        }
        return z;
    }

    private Boolean a(com.alibaba.android.aura.nodemodel.branch.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("a6eb914f", new Object[]{this, aVar}) : this.e.get(aVar.f2153a);
    }

    private void a(com.alibaba.android.aura.nodemodel.branch.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c73b8cc2", new Object[]{this, aVar, new Boolean(z)});
        } else if (!aVar.b) {
        } else {
            this.e.put(aVar.f2153a, Boolean.valueOf(z));
        }
    }

    private boolean a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7197a3a", new Object[]{this, new Boolean(z), str})).booleanValue();
        }
        aqp aqpVar = this.f.get(str);
        return aqpVar == null ? z : aqpVar.a(z);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e.clear();
        }
    }
}
