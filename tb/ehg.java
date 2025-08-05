package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ehg extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ehf> f27309a;

    static {
        kge.a(-83585144);
    }

    public static /* synthetic */ Object ipc$super(ehg ehgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.navbar.NavBarTabViewModel";
    }

    public ehg(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
        this.f27309a = new ArrayList<>();
        a(componentModel, bVar);
    }

    private void a(ComponentModel componentModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4b7b32", new Object[]{this, componentModel, bVar});
            return;
        }
        com.taobao.android.detail.datasdk.factory.manager.b l = emx.a(bVar.h()).b().l();
        for (ComponentModel componentModel2 : componentModel.children) {
            ehf ehfVar = (ehf) l.d(componentModel2, bVar);
            if (ehfVar != null) {
                this.f27309a.add(ehfVar);
            }
        }
    }

    public ehg(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        this.f27309a = new ArrayList<>();
        a(iDMComponent, bVar);
    }

    private void a(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bc3186", new Object[]{this, iDMComponent, bVar});
            return;
        }
        eox m = emx.a(bVar.h()).b().m();
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            ehf ehfVar = (ehf) m.d(iDMComponent2, bVar);
            if (ehfVar != null) {
                this.f27309a.add(ehfVar);
            }
            if (bVar.b && iDMComponent2.getChildren() != null) {
                a(m, bVar, iDMComponent2);
            }
        }
    }

    private void a(eox eoxVar, b bVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c666b0", new Object[]{this, eoxVar, bVar, iDMComponent});
            return;
        }
        List<IDMComponent> children = iDMComponent.getChildren();
        if (children == null) {
            return;
        }
        for (IDMComponent iDMComponent2 : children) {
            ehf ehfVar = (ehf) eoxVar.d(iDMComponent2, bVar);
            if (ehfVar != null) {
                this.f27309a.add(ehfVar);
            }
            a(eoxVar, bVar, iDMComponent2);
        }
    }
}
