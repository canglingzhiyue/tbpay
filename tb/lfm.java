package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class lfm implements eza<lfc> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_ID = "id_recommend";

    /* renamed from: a  reason: collision with root package name */
    private Context f30545a;
    private eyx b;

    static {
        kge.a(1096954707);
        kge.a(1476351899);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [tb.lfc, java.lang.Object] */
    @Override // tb.eza
    public /* synthetic */ lfc a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("23059caa", new Object[]{this, jSONObject}) : b(jSONObject);
    }

    public lfm(Context context, eyx eyxVar) {
        this.f30545a = context;
        this.b = eyxVar;
    }

    public lfc b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lfc) ipChange.ipc$dispatch("c3a43776", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return new lfc(jSONObject, this.b.c().a());
        }
        return null;
    }
}
