package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class pkw implements eza<pir> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_ID = "id_ali_tt_detail_global";

    /* renamed from: a  reason: collision with root package name */
    private Context f32739a;
    private eyx b;

    static {
        kge.a(-38003892);
        kge.a(1476351899);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [tb.pir, java.lang.Object] */
    @Override // tb.eza
    public /* synthetic */ pir a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("23059caa", new Object[]{this, jSONObject}) : b(jSONObject);
    }

    public pkw(Context context, eyx eyxVar) {
        this.f32739a = context;
        this.b = eyxVar;
    }

    public pir b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pir) ipChange.ipc$dispatch("c3a61606", new Object[]{this, jSONObject}) : new pir(jSONObject, this.b);
    }
}
