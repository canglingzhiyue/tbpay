package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.factory.manager.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;

/* loaded from: classes4.dex */
public class egf extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2065337147);
    }

    public static /* synthetic */ Object ipc$super(egf egfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1026460365) {
            if (hashCode == 9565489) {
                super.a((eop) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else if (hashCode != 1734455116) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return super.a((ComponentModel) objArr[0], (com.taobao.android.detail.datasdk.model.datamodel.node.b) objArr[1]);
            }
        }
        return super.a((ComponentModel) objArr[0]);
    }

    public egf() {
        a(new egd(), 5);
        a(new efy(), 5);
        a(new ege(), 5);
        a(new ega(), 5);
        a(new efz(), 5);
        emu.a("com.taobao.android.detail.core.factory.manager.ViewModelFactoryManager");
    }

    @Override // com.taobao.android.detail.datasdk.factory.manager.b
    public void a(eop eopVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f531", new Object[]{this, eopVar, new Integer(i)});
        } else {
            super.a(eopVar, i);
        }
    }

    @Override // com.taobao.android.detail.datasdk.factory.manager.b
    public com.taobao.android.detail.datasdk.model.viewmodel.main.b a(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.model.viewmodel.main.b) ipChange.ipc$dispatch("6761af4c", new Object[]{this, componentModel, bVar});
        }
        com.taobao.android.detail.datasdk.model.viewmodel.main.b a2 = super.a(componentModel, bVar);
        return a2 == null ? a(componentModel) : a2;
    }

    @Override // com.taobao.android.detail.datasdk.factory.manager.b
    public epf a(ComponentModel componentModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (epf) ipChange.ipc$dispatch("c2d17533", new Object[]{this, componentModel}) : super.a(componentModel);
    }
}
