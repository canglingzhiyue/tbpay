package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.protocol.c;
import java.util.HashMap;
import tb.lji;

/* loaded from: classes7.dex */
public class nwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lji f31812a;
    private final lji.a b = b();
    private final c c;
    private final IHomeSubTabController d;
    private JSONObject e;

    static {
        kge.a(-619835802);
    }

    public static /* synthetic */ JSONObject a(nwq nwqVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ea8c1a00", new Object[]{nwqVar, jSONObject});
        }
        nwqVar.e = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void a(nwq nwqVar, lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d61df2fb", new Object[]{nwqVar, interfaceC1153a});
        } else {
            nwqVar.b(interfaceC1153a);
        }
    }

    public static /* synthetic */ void b(nwq nwqVar, lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4e3ffc", new Object[]{nwqVar, interfaceC1153a});
        } else {
            nwqVar.a(interfaceC1153a);
        }
    }

    public nwq(lji ljiVar, c cVar, IHomeSubTabController iHomeSubTabController) {
        this.f31812a = ljiVar;
        this.c = cVar;
        this.d = iHomeSubTabController;
        this.f31812a.a(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f31812a.b(this.b);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.e = jSONObject;
        }
    }

    private lji.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lji.a) ipChange.ipc$dispatch("4c6e2e55", new Object[]{this}) : new lji.a() { // from class: tb.nwq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lji.a
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "getTabPassParams";
            }

            @Override // tb.lji.a
            public void a(String str, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0e36ce9", new Object[]{this, str, jSONObject, interfaceC1153a});
                } else if (TextUtils.equals("popLayerPassParams", str)) {
                    nwq.a(nwq.this, interfaceC1153a);
                    nwq.a(nwq.this, (JSONObject) null);
                } else if (!TextUtils.equals("tabPassParams", str)) {
                } else {
                    nwq.b(nwq.this, interfaceC1153a);
                }
            }
        };
    }

    private void a(lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2cc4d53", new Object[]{this, interfaceC1153a});
            return;
        }
        HashMap hashMap = new HashMap();
        JSONObject c = thf.c(this.c.g(this.d));
        if (c == null) {
            interfaceC1153a.a("tabPassParams == null");
            return;
        }
        hashMap.put("tabPassParams", c);
        ldf.d("PassParamsService", "获取passParams: " + c);
        interfaceC1153a.a(hashMap);
    }

    private void b(lji.a.InterfaceC1153a interfaceC1153a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3762b54", new Object[]{this, interfaceC1153a});
            return;
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.e;
        if (jSONObject == null) {
            interfaceC1153a.a("popLayerPassParams == null");
            return;
        }
        hashMap.put("popLayerPassParams", jSONObject);
        ldf.d("PassParamsService", "获取popLayerPassParams: " + this.e);
        interfaceC1153a.a(hashMap);
    }
}
