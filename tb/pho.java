package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.d;
import com.taobao.android.detail.ttdetail.utils.g;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;

/* loaded from: classes4.dex */
public class pho implements eza<eze> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_ID = "id_header_pic";

    /* renamed from: a  reason: collision with root package name */
    private Context f32651a;
    private eyx b;

    static {
        kge.a(581878249);
        kge.a(1476351899);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tb.eze] */
    @Override // tb.eza
    public /* synthetic */ eze a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("23059caa", new Object[]{this, jSONObject}) : b(jSONObject);
    }

    public pho(Context context, eyx eyxVar) {
        this.f32651a = context;
        this.b = eyxVar;
    }

    public eze b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eze) ipChange.ipc$dispatch("c3a1542f", new Object[]{this, jSONObject}) : c(g.a(jSONObject));
    }

    private eze c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eze) ipChange.ipc$dispatch("5e4216b0", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("model")) == null || (jSONObject3 = jSONObject2.getJSONObject("headerPic")) == null) {
            return null;
        }
        if (j.e() && d.a(this.b.a())) {
            try {
                d.g(jSONObject3);
            } catch (Throwable th) {
                i.a("DefaultParser", "extractHeaderPicData error=" + Log.getStackTraceString(th));
            }
        }
        return new eze(jSONObject3, this.b.c().a());
    }
}
