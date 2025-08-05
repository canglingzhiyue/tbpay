package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.homepage.utils.e;

/* loaded from: classes8.dex */
public class ort implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f32330a;
    private JSONObject b;
    private orv c;

    static {
        kge.a(-1271560944);
        kge.a(-1201612728);
    }

    public ort(orv orvVar, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f32330a = jSONObject2;
        this.c = orvVar;
        this.b = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        JSONObject jSONObject2 = this.f32330a;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("item")) == null || jSONObject.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR) == null) {
            return;
        }
        String string = jSONObject.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR).getString("targetUrl");
        this.c.a(this.f32330a, jSONObject.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR));
        this.c.a();
        nlr.a(this.b, jSONObject.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR));
        Nav.from(e.a(view)).toUri(string);
    }
}
