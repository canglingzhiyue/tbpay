package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fag extends egv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27713a;
    public String b;
    public String c;
    public boolean d;

    static {
        kge.a(616330499);
    }

    @Override // tb.epi
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 0;
    }

    public fag(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        if (componentModel != null && componentModel.mapping != null) {
            this.f27713a = componentModel.mapping.getString("title");
            this.b = componentModel.mapping.getString("itemId");
            this.c = componentModel.mapping.getString("supplement");
            this.d = componentModel.mapping.getBoolean("disabled").booleanValue();
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewmodel.BottomBarReminderViewModel");
    }

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : this.A;
    }

    public fag(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        this.f27713a = iDMComponent.getFields().getString("title");
        this.b = iDMComponent.getFields().getString("itemId");
        this.c = iDMComponent.getFields().getString("supplement");
        this.d = iDMComponent.getFields().getBoolean("disabled").booleanValue();
    }
}
