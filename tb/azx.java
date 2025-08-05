package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class azx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25720a;
    private final Component b;
    private final JSONObject c;

    static {
        kge.a(1634275294);
    }

    public azx(String str, Component component, JSONObject jSONObject) {
        this.f25720a = str;
        this.b = component;
        this.c = jSONObject;
    }

    public Component a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("e1051328", new Object[]{this}) : this.b;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.c;
    }
}
