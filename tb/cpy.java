package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.bridge.b;
import kotlin.t;

/* loaded from: classes3.dex */
public final class cpy implements cpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f26425a;
    private final b b;

    static {
        kge.a(-1481435670);
        kge.a(-977045217);
    }

    public cpy(b bVar, b bVar2) {
        this.f26425a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    @Override // tb.cpx
    public void a(JSONObject jSONObject, Integer num, String str) {
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56ecdf9", new Object[]{this, jSONObject, num, str});
            return;
        }
        if (jSONObject != null) {
            b bVar = this.f26425a;
            if (bVar != null) {
                bVar.a(jSONObject);
                tVar = t.INSTANCE;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        Integer num2 = num;
        if (num == null) {
            num2 = "-1";
        }
        jSONObject3.put((JSONObject) "errorCode", (String) num2);
        if (str == null) {
            str = "";
        }
        jSONObject3.put((JSONObject) "errorMessage", str);
        b bVar2 = this.b;
        if (bVar2 == null) {
            return;
        }
        bVar2.a(jSONObject2);
        t tVar2 = t.INSTANCE;
    }
}
