package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.a;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.b;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class lwz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lxh f30962a;
    private lwd b;
    private lwe c;
    private boolean d;
    private ConcurrentHashMap<String, lxg> e = new ConcurrentHashMap<>(2);
    private ConcurrentHashMap<String, b> f = new ConcurrentHashMap<>(2);
    private ConcurrentHashMap<String, a> g = new ConcurrentHashMap<>(2);
    private lxi h;
    private lwu i;

    static {
        kge.a(-1044205133);
        kge.a(-1236742086);
    }

    public lwz(lxh lxhVar, lwd lwdVar, lwu lwuVar, lwe lweVar) {
        this.f30962a = lxhVar;
        this.b = lwdVar;
        this.i = lwuVar;
        this.c = lweVar;
    }

    public lxh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lxh) ipChange.ipc$dispatch("f078c42", new Object[]{this}) : this.f30962a;
    }

    public lwd b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwd) ipChange.ipc$dispatch("16b92d64", new Object[]{this}) : this.b;
    }

    public lwu c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwu) ipChange.ipc$dispatch("1e6ad4d2", new Object[]{this}) : this.i;
    }

    public lwe d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwe) ipChange.ipc$dispatch("261c7841", new Object[]{this}) : this.c;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f30962a.a().getTTID();
    }

    public Context f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("442389e5", new Object[]{this}) : this.f30962a.a().getApplication();
    }

    public void a(lxi lxiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ac115b", new Object[]{this, lxiVar});
        } else {
            this.h = lxiVar;
        }
    }

    public boolean a(lwc lwcVar, lxg lxgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa4f43d9", new Object[]{this, lwcVar, lxgVar})).booleanValue() : b(lwcVar, lxgVar);
    }

    public lxg a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxg) ipChange.ipc$dispatch("7c723519", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.e.get(str);
        }
        return null;
    }

    public boolean a(lwc lwcVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("646e43bf", new Object[]{this, lwcVar, bVar})).booleanValue();
        }
        if (StringUtils.isEmpty(lwcVar.f30931a) || bVar == null || this.f.containsKey(lwcVar.f30931a)) {
            return false;
        }
        this.f.put(lwcVar.f30931a, bVar);
        return true;
    }

    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ae223e1e", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.f.get(str);
        }
        return null;
    }

    public a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("66aefe5e", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return this.g.get(str);
        }
        return null;
    }

    public a a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e4e1a23b", new Object[]{this, strArr});
        }
        a aVar = null;
        if (strArr == null) {
            return null;
        }
        for (String str : strArr) {
            aVar = c(str);
            if (aVar != null) {
                break;
            }
        }
        return aVar;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        if (!this.d) {
            return null;
        }
        if (com.taobao.android.editionswitcher.b.d(this.f30962a.a().getApplication())) {
            return lwc.NEW_FACE_PARENT_INTL.f30931a;
        }
        return lwc.NEW_FACE_PARENT.f30931a;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (this.d) {
            if (com.taobao.android.editionswitcher.b.d(this.f30962a.a().getApplication())) {
                return lwc.NEW_FACE_CHILD_INTL.f30931a;
            }
            return lwc.NEW_FACE_CHILD.f30931a;
        } else if (!this.e.isEmpty()) {
            return this.e.keySet().iterator().next();
        } else {
            return null;
        }
    }

    public boolean b(lwc lwcVar, lxg lxgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e8395a", new Object[]{this, lwcVar, lxgVar})).booleanValue();
        }
        if (StringUtils.isEmpty(lwcVar.f30931a) || lxgVar == null) {
            return false;
        }
        if (this.e.containsKey(lwcVar.f30931a)) {
            lxo.c("DataServiceEngineContext", lwcVar.f30931a + " 数据服务流程处理已存在，将使用新的进行覆盖");
        }
        this.e.put(lwcVar.f30931a, lxgVar);
        return true;
    }
}
