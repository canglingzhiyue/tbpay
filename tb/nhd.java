package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.i;

/* loaded from: classes7.dex */
public class nhd implements nfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31463a;
    private final AppController b;

    static {
        kge.a(-1773509739);
        kge.a(-1908636620);
        f31463a = nhd.class.getSimpleName();
    }

    public nhd(AppController appController) {
        this.b = appController;
    }

    @Override // tb.nfe
    public void a(JSONObject jSONObject, final nff<JSONObject, String> nffVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba02d8a", new Object[]{this, jSONObject, nffVar});
            return;
        }
        i G = this.b.G();
        if (G == null) {
            return;
        }
        G.a("TinyApp", "sendMtop", jSONObject, new i.a() { // from class: tb.nhd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.pha.core.i.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    nffVar.b(str);
                }
            }

            @Override // com.taobao.pha.core.i.a
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                } else {
                    nffVar.a(jSONObject2);
                }
            }
        });
    }
}
