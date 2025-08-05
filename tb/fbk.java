package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes5.dex */
public class fbk extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-220547391);
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public fbk(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.VideoContainerModel");
    }

    @Override // tb.epf
    public String E_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a249be7f", new Object[]{this});
        }
        if (this.A.size() > 0) {
            return this.u + "_" + this.A.get(0).u + "_" + this.A.size();
        }
        return this.u;
    }
}
