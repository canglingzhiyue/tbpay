package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes5.dex */
public class fbc extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f27733a;
    public int b;
    public String c;
    public String d;

    static {
        kge.a(206216618);
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public fbc(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.CustomModuleModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return;
        }
        this.c = jSONObject2.getString("bgUrl");
        this.d = jSONObject2.getString("jumpUrl");
        this.f27733a = jSONObject2.getIntValue("width");
        this.b = jSONObject2.getIntValue("height");
    }
}
