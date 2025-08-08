package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;

/* loaded from: classes4.dex */
public class ewd implements evw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1712337059);
        kge.a(-1091129673);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.sdk.vmodel.main.MainViewModel, tb.exl] */
    @Override // tb.ewa
    public /* synthetic */ exl a(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainViewModel) ipChange.ipc$dispatch("ac99d18", new Object[]{this, componentModel, nodeBundle}) : b(componentModel, nodeBundle);
    }

    public ewd() {
        tpc.a("com.taobao.android.detail.sdk.factory.impl.ContainerViewModelFactory");
    }

    public exl b(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (exl) ipChange.ipc$dispatch("c23cd5f4", new Object[]{this, componentModel, nodeBundle});
        }
        if (componentModel == null || nodeBundle == null) {
            return null;
        }
        String str = componentModel.type;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        int a2 = ewy.a(str);
        if (a2 == 30020) {
            return new exo(componentModel, nodeBundle);
        }
        if (a2 != 35034) {
            switch (a2) {
                case ewy.T_DETAIL_NAVI_BAR /* 21002 */:
                    return new exy(componentModel, nodeBundle);
                case 21003:
                    return new exx(componentModel, nodeBundle);
                case 21004:
                    return new exv(componentModel, nodeBundle);
                case 21005:
                    return new exw(componentModel, nodeBundle);
                case 21006:
                    return new exq(componentModel, nodeBundle);
                default:
                    switch (a2) {
                        case 21008:
                            return new exn(componentModel, nodeBundle);
                        case 21009:
                            return new exm(componentModel, nodeBundle);
                        case 21010:
                            return new exp(componentModel, nodeBundle);
                        default:
                            return null;
                    }
            }
        }
        return new exr(componentModel, nodeBundle);
    }
}
