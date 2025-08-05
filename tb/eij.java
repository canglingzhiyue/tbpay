package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.d;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailClientDataNode;
import com.taobao.android.task.Coordinator;

/* loaded from: classes4.dex */
public class eij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile eij f27321a;
    private eio<String, JSONObject> b = new eil();
    private eio<String, DetailClientDataNode.DetailClientOpt> c = new eii();

    static {
        kge.a(-641049273);
    }

    public static /* synthetic */ eio a(eij eijVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eio) ipChange.ipc$dispatch("e3486e89", new Object[]{eijVar}) : eijVar.c;
    }

    public static /* synthetic */ eio b(eij eijVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eio) ipChange.ipc$dispatch("caea44e8", new Object[]{eijVar}) : eijVar.b;
    }

    private eij() {
        emu.a("com.taobao.android.detail.core.performance.conifg.DetailClientOptStorage");
    }

    public static eij a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eij) ipChange.ipc$dispatch("f042598", new Object[0]);
        }
        if (f27321a == null) {
            synchronized (eij.class) {
                if (f27321a == null) {
                    f27321a = new eij();
                }
            }
        }
        return f27321a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        JSONObject a2 = this.b.a("detailClientOpt");
        if (a2 == null) {
            i.a(d.a("DetailClientOptStorage"), "detailClientOpt加载本地缓存到内存为空");
            return;
        }
        this.c.a("detailClientOpt", DetailClientDataNode.DetailClientOpt.parse(a2));
        String a3 = d.a("DetailClientOptStorage");
        i.c(a3, "detailClientOpt加载本地缓存到内存: " + a2);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            Coordinator.execute(new Coordinator.TaggedRunnable("asyncLoad DetailClientOpt") { // from class: tb.eij.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        eij.this.b();
                    }
                }
            });
        }
    }

    public void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            Coordinator.execute(new Coordinator.TaggedRunnable("asyncSave DetailClientOpt") { // from class: tb.eij.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    eij.a(eij.this).a("detailClientOpt", DetailClientDataNode.DetailClientOpt.parse(jSONObject));
                    eij.b(eij.this).a("detailClientOpt", jSONObject);
                    String a2 = d.a("DetailClientOptStorage");
                    i.c(a2, "异步保存detailClientOpt在本地和内存: " + jSONObject);
                }
            });
        }
    }

    public DetailClientDataNode.DetailClientOpt d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailClientDataNode.DetailClientOpt) ipChange.ipc$dispatch("daa5baf4", new Object[]{this});
        }
        DetailClientDataNode.DetailClientOpt a2 = this.c.a("detailClientOpt");
        if (a2 != null) {
            return a2;
        }
        i.a(d.a("DetailClientOptStorage"), "从缓存中读取detailClientOpt对应结果为空");
        return null;
    }
}
