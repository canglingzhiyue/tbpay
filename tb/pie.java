package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.g;

/* loaded from: classes4.dex */
public class pie implements eza<pif> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_ID = "id_main_screen";

    /* renamed from: a  reason: collision with root package name */
    private Context f32678a;
    private eyx b;

    static {
        kge.a(-1101251276);
        kge.a(1476351899);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [tb.pif, java.lang.Object] */
    @Override // tb.eza
    public /* synthetic */ pif a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("23059caa", new Object[]{this, jSONObject}) : b(jSONObject);
    }

    public pie(Context context, eyx eyxVar) {
        this.f32678a = context;
        this.b = eyxVar;
    }

    public pif b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pif) ipChange.ipc$dispatch("c3a61492", new Object[]{this, jSONObject}) : c(g.a(jSONObject));
    }

    private pif c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pif) ipChange.ipc$dispatch("5e46d713", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return new pif(jSONObject, this.b.c().a());
        }
        return null;
    }
}
