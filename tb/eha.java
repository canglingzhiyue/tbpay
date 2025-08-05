package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class eha extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<epe> f27304a;

    static {
        kge.a(463659120);
    }

    public static /* synthetic */ Object ipc$super(eha ehaVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.container.DetailHomeViewModel";
    }

    public eha(ComponentModel componentModel, b bVar) {
        super(componentModel, bVar);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public void buildChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccdb094", new Object[]{this});
        } else if (this.component != null && this.component.children != null) {
            this.f27304a = new ArrayList();
            com.taobao.android.detail.datasdk.factory.manager.b l = emx.a(this.mNodeBundle.h()).b().l();
            for (ComponentModel componentModel : this.component.children) {
                epe epeVar = null;
                try {
                    epeVar = l.d(componentModel, this.mNodeBundle);
                } catch (Exception unused) {
                }
                if (epeVar != null) {
                    this.f27304a.add(epeVar);
                }
            }
        }
    }

    public eha(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public void ultronBuildChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f97f700", new Object[]{this});
        } else if (this.dmComponent != null && this.dmComponent.getChildren() != null) {
            this.f27304a = new ArrayList();
            eox m = emx.a(this.mNodeBundle.h()).b().m();
            for (IDMComponent iDMComponent : this.dmComponent.getChildren()) {
                epe epeVar = null;
                try {
                    if (this.mNodeBundle != null && this.mNodeBundle.b) {
                        epeVar = a(m, iDMComponent);
                    } else if (!TextUtils.isEmpty(iDMComponent.getTag()) && iDMComponent.getChildren() != null && iDMComponent.getChildren().size() > 0) {
                        epeVar = m.d(iDMComponent.getChildren().get(0), this.mNodeBundle);
                    } else {
                        epeVar = m.d(iDMComponent, this.mNodeBundle);
                    }
                } catch (Exception unused) {
                }
                if (epeVar != null) {
                    this.f27304a.add(epeVar);
                }
            }
        }
    }

    private epe a(eox eoxVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epe) ipChange.ipc$dispatch("89064ee2", new Object[]{this, eoxVar, iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        epe d = eoxVar.d(iDMComponent, this.mNodeBundle);
        if (d != null) {
            return d;
        }
        if (iDMComponent.getChildren() != null && iDMComponent.getChildren().size() > 0) {
            return a(eoxVar, iDMComponent.getChildren().get(0));
        }
        return null;
    }
}
