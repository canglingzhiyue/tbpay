package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fcd extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27786a;
    public JSONObject b;

    static {
        kge.a(-1613646800);
    }

    public fcd(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        if (componentModel != null && componentModel.mapping != null) {
            this.f27786a = componentModel.mapping.getString("url");
        }
        this.b = bVar.a();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.MainWeexViewModel");
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f27786a) && this.b != null;
    }

    public fcd(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        this.f27786a = iDMComponent.getFields().getString("url");
        this.b = bVar.a();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewmodel.MainWeexViewModel");
    }
}
