package tb;

import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import kotlin.text.n;

/* loaded from: classes6.dex */
public final class jaj extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UltronInstanceConfig i;
    private JSONObject j;

    static {
        kge.a(-8688292);
    }

    public jaj(JSONObject jSONObject) {
        super(jSONObject);
        this.i = new UltronInstanceConfig();
        UltronInstanceConfig ultronInstanceConfig = this.i;
        String str = this.d;
        int i = 1;
        ultronInstanceConfig.a(!(str == null || n.a((CharSequence) str)) ? this.d : "stdUltronPop");
        JSONObject a2 = dmo.a(jSONObject, "content", (JSONObject) null);
        if (a2 != null) {
            this.j = dmo.a(a2, "data", (JSONObject) null);
            if (this.j == null) {
                this.j = new JSONObject(0);
            }
            String a3 = dmo.a(a2, "namespace", (String) null);
            this.g = a3 == null ? this.g : a3;
            JSONObject a4 = dmo.a(a2, "containerConfig", (JSONObject) null);
            if (a4 == null) {
                return;
            }
            this.i.j(dmo.a(a4, "enableTextSizeStrategy", false));
            this.i.a(dmo.a(a4, "isRefreshDownloaded", false) ? 2 : i);
        }
    }

    public final UltronInstanceConfig a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronInstanceConfig) ipChange.ipc$dispatch("f1a3ef3a", new Object[]{this}) : this.i;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.j;
    }
}
