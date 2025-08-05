package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lji;

/* loaded from: classes7.dex */
public class ljk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MAIN_BIZ_NAME = "Page_Home_Container";
    public static final String TAG_ID = "container";
    public static final String TAG_VERSION = "1.0";
    public static final String UMBRELLA_CURRENT_CONTAINER_TYPE = "containerType";
    public static final String UMBRELLA_CURRENT_URL = "pageUrl";

    /* renamed from: a  reason: collision with root package name */
    private final lji f30678a;
    private final lji.a b = b();
    private final String c;

    static {
        kge.a(1154963719);
    }

    public static /* synthetic */ String a(ljk ljkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0cf1af5", new Object[]{ljkVar}) : ljkVar.c;
    }

    public ljk(lji ljiVar, String str) {
        this.f30678a = ljiVar;
        this.c = str;
        this.f30678a.a(this.b);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30678a.b(this.b);
        }
    }

    private lji.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lji.a) ipChange.ipc$dispatch("4c6e2e55", new Object[]{this}) : new lji.a() { // from class: tb.ljk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lji.a
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "commitFailureMonitorPoint";
            }

            @Override // tb.lji.a
            public void a(String str, JSONObject jSONObject, lji.a.InterfaceC1153a interfaceC1153a) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e0e36ce9", new Object[]{this, str, jSONObject, interfaceC1153a});
                } else if (jSONObject == null) {
                    interfaceC1153a.a("jsParams == null");
                } else {
                    tbw.INSTANCE.a("webShow", jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"), ljk.a(ljk.this), jSONObject.getString("pageType"), jSONObject.getString("pageUrl"));
                    interfaceC1153a.b("当前稳定性埋点上报成功");
                }
            }
        };
    }
}
