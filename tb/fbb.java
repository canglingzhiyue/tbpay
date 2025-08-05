package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes5.dex */
public class fbb extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27732a;

    static {
        kge.a(-978239283);
    }

    public fbb(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.CompositeContainerModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f27732a = jSONObject.getString("tipText");
        }
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.A.size() == 0;
    }
}
