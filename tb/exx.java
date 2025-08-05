package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.factory.manager.b;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class exx extends exl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NavBarTabViewModel";

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<exw> f27641a;

    static {
        kge.a(-1815280926);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 21003;
    }

    public exx(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.f27641a = new ArrayList<>();
        a(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.navbar.NavBarTabViewModel");
    }

    private void a(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c0c238", new Object[]{this, componentModel, nodeBundle});
            return;
        }
        b a2 = b.a();
        for (ComponentModel componentModel2 : componentModel.children) {
            exw exwVar = (exw) a2.d(componentModel2, nodeBundle);
            if (exwVar != null) {
                this.f27641a.add(exwVar);
            }
        }
    }
}
