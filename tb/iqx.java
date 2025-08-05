package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.mega.d;
import kotlin.jvm.internal.q;
import mtopsdk.ssrcore.util.SsrLoginOption;

/* loaded from: classes4.dex */
public final class iqx implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1301941141);
        kge.a(-492976882);
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public ExecuteResult a(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b88a424e", new Object[]{this, result});
        }
        q.d(result, "result");
        return result;
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public ExecuteResult b(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("1ae5592d", new Object[]{this, result});
        }
        q.d(result, "result");
        return result;
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        if (dmo.a(jSONObject, SsrLoginOption.SILENT, (JSONObject) null) == null) {
            jSONObject.put((JSONObject) SsrLoginOption.SILENT, (String) false);
        }
        return jSONObject;
    }
}
