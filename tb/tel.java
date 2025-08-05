package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.m;
import com.taobao.umipublish.extension.windvane.abilities.AbilityConst;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"getTitle", "", "cardData", "Lcom/alibaba/fastjson/JSONObject;", "umipublish_extends_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public final class tel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1496338376);
    }

    public static final String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject}) : m.a("", jSONObject, AbilityConst.Server.f23328a, AbilityConst.Server.g, AbilityConst.Server.h);
    }
}
