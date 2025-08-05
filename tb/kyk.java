package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.opx;

/* loaded from: classes7.dex */
public class kyk implements opx.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final kyj f30400a;

    static {
        kge.a(1403521951);
        kge.a(662474730);
    }

    public kyk(kyj kyjVar) {
        this.f30400a = kyjVar;
    }

    @Override // tb.opx.a
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        b(jSONObject);
        a();
        b();
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        String c = c(jSONObject);
        if (c == null || TextUtils.isEmpty(c)) {
            ldf.d("DxItemClickListener", "realTimeClickParams == null");
        } else {
            this.f30400a.a(c);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Map<String, Object> b = this.f30400a.b("click");
        kyh.a().a("click", ksk.NEW_FACE_PARENT.c, b);
        kyh.a().b("click", ksk.NEW_FACE_PARENT.c, b);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f30400a.c("click");
        }
    }

    private String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            ldf.d("DxItemClickListener", "getRealTimeClickParams ext == null");
            return null;
        }
        return jSONObject2.getString("realtimeClickParam");
    }
}
