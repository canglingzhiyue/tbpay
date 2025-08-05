package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.mto;

/* loaded from: classes4.dex */
public class egp extends epi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27295a;
    public String b;
    public double c;
    public ArrayList<epi> d;

    static {
        kge.a(82139196);
    }

    @Override // tb.epi
    public double b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue() : mto.a.GEO_NOT_SUPPORT;
    }

    @Override // tb.epi
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.epi, com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.actionbar.ActionBarItemViewModel";
    }

    public egp(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        this.d = new ArrayList<>();
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f27295a = componentModel.mapping.getString("title");
        this.b = componentModel.mapping.getString("positionKey");
        this.c = componentModel.mapping.getDoubleValue("titleSizeRatio");
        if (componentModel.children == null || componentModel.children.isEmpty()) {
            return;
        }
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.detail.datasdk.factory.manager.b l = emx.a(this.mNodeBundle.h()).b().l();
        for (ComponentModel componentModel : this.component.children) {
            try {
                this.d.add(l.b(componentModel, this.mNodeBundle));
            } catch (Exception e) {
                i.a("ActionBarItemViewModel", "Make widget view model exception.", e);
            }
        }
    }

    public egp(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        this.d = new ArrayList<>();
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        this.f27295a = iDMComponent.getFields().getString("title");
        this.b = iDMComponent.getFields().getString("positionKey");
        this.c = iDMComponent.getFields().getDoubleValue("titleSizeRatio");
        if (iDMComponent.getChildren() == null || iDMComponent.getChildren().isEmpty()) {
            return;
        }
        d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        eox m = emx.a(this.mNodeBundle.h()).b().m();
        for (IDMComponent iDMComponent : this.dmComponent.getChildren()) {
            try {
                this.d.add(m.b(iDMComponent, this.mNodeBundle));
            } catch (Exception e) {
                i.a("ActionBarItemViewModel", "Make widget view model exception.", e);
            }
        }
    }
}
