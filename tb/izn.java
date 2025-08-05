package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.abilitykit.ability.pop.model.c;

/* loaded from: classes6.dex */
public class izn extends c {
    public jnk i;

    static {
        kge.a(-147535972);
    }

    public izn(JSONObject jSONObject) {
        super(jSONObject);
        if (this.f != null) {
            this.i = new jnk(this.f);
            return;
        }
        this.i = new jnk(this.e);
        this.e = dmo.a(this.e, "data", (JSONObject) null);
    }
}
