package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class ehd extends epe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public eox f27306a;
    private ehc b;

    static {
        kge.a(-66065379);
    }

    public static /* synthetic */ Object ipc$super(ehd ehdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.container.DetailTTFloatViewModel";
    }

    public ehd(IDMComponent iDMComponent, b bVar) {
        super(iDMComponent, bVar);
        if (iDMComponent == null || iDMComponent.getFields() == null || iDMComponent.getChildren() == null || iDMComponent.getChildren().isEmpty()) {
            i.a(com.taobao.android.detail.core.performance.i.a("DetailTTFloatViewModel", BTags.TTFloat), "no data");
            return;
        }
        this.f27306a = emx.a(this.mNodeBundle.h()).b().m();
        a(iDMComponent);
    }

    private void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            try {
                if (iDMComponent2.getChildren() != null && !iDMComponent2.getChildren().isEmpty()) {
                    a(iDMComponent2);
                } else {
                    epe d = this.f27306a.d(iDMComponent2, this.mNodeBundle);
                    if (d instanceof ehc) {
                        this.b = (ehc) d;
                    }
                }
            } catch (Exception e) {
                i.a(com.taobao.android.detail.core.performance.i.a("DetailTTFloatViewModel", BTags.TTFloat), "Make widget view model exception.", e);
            }
        }
    }

    public ehc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehc) ipChange.ipc$dispatch("f0420fe", new Object[]{this}) : this.b;
    }
}
