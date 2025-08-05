package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.android.ultron.datamodel.imp.b;
import java.util.Map;

/* loaded from: classes4.dex */
public class enb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27454a = true;
    private b c = new b(this.f27454a);
    private ParseResponseHelper b = new ParseResponseHelper(this.c);

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27455a;
        public jny b;
        public Map<String, Object> c;

        static {
            kge.a(-654800441);
        }

        public a(boolean z, jny jnyVar, Map<String, Object> map) {
            this.f27455a = z;
            this.b = jnyVar;
            this.c = map;
        }
    }

    static {
        kge.a(408298606);
    }

    public enb() {
        emu.a("com.taobao.android.detail.datasdk.engine.dataengine.ultron.UltronParser");
    }

    public a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ea781ca8", new Object[]{this, jSONObject});
        }
        this.b.a(jSONObject);
        return new a(this.b.a(), this.c, this.b.b());
    }

    public void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{this, context, jSONObject});
        } else {
            this.b.a(context, "detail", jSONObject, true, false);
        }
    }
}
