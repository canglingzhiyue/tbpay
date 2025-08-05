package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import com.taobao.android.detail.sdk.vmodel.main.ae;
import com.taobao.android.detail.sdk.vmodel.main.ak;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;

/* loaded from: classes4.dex */
public class ewj implements ewb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2002882764);
        kge.a(1458658842);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.sdk.vmodel.main.MainViewModel, com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel] */
    @Override // tb.ewa
    public /* synthetic */ WidgetViewModel a(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainViewModel) ipChange.ipc$dispatch("ac99d18", new Object[]{this, componentModel, nodeBundle}) : b(componentModel, nodeBundle);
    }

    public ewj() {
        tpc.a("com.taobao.android.detail.sdk.factory.impl.WidgetViewModelFactory");
    }

    public WidgetViewModel b(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewModel) ipChange.ipc$dispatch("5077b1f9", new Object[]{this, componentModel, nodeBundle});
        }
        if (componentModel == null) {
            return null;
        }
        String str = componentModel.key;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int a2 = ewy.a(str);
        if (a2 == 10001) {
            return new ak(componentModel, nodeBundle);
        }
        if (a2 == 20008) {
            return new exc(componentModel, nodeBundle);
        }
        if (a2 == 20013) {
            return new exg(componentModel, nodeBundle);
        }
        if (a2 != 20020) {
            if (a2 == 48001) {
                return new ae(componentModel, nodeBundle);
            }
            if (a2 == 20003) {
                return new exh(componentModel, nodeBundle);
            }
            if (a2 != 20004) {
                switch (a2) {
                    case ewy.T_BOTTOM_BAR_PRE_SALE /* 20015 */:
                        return new exe(componentModel, nodeBundle);
                    case ewy.T_BOTTOM_BAR_WAIT_FOR_SATRT /* 20016 */:
                        return new exj(componentModel, nodeBundle);
                    case ewy.T_BOTTOM_BAR_ICON /* 20017 */:
                        break;
                    case ewy.T_BOTTOM_BAR_REMINDER /* 20018 */:
                        return new exf(componentModel, nodeBundle);
                    default:
                        return null;
                }
            } else {
                return new ewz(componentModel, nodeBundle);
            }
        }
        return new exd(componentModel, nodeBundle);
    }
}
