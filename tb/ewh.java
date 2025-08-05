package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;

@Deprecated
/* loaded from: classes4.dex */
public class ewh implements evu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1394500272);
        kge.a(-1070505763);
    }

    public ewh() {
        tpc.a("com.taobao.android.detail.sdk.factory.impl.MainBeforeViewModelValidator");
    }

    @Override // tb.evu
    public boolean a(String str, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54cea568", new Object[]{this, str, nodeBundle})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && nodeBundle != null) {
            int a2 = ewy.a(str);
            if (a2 != 30004) {
                if (a2 == 30008) {
                    return (nodeBundle.rightsNode == null || nodeBundle.rightsNode.rights == null || nodeBundle.rightsNode.rights.isEmpty()) ? false : true;
                } else if (a2 == 30011) {
                    return !(nodeBundle.resourceNode == null || nodeBundle.resourceNode.shopPromotions == null || nodeBundle.resourceNode.shopPromotions.isEmpty()) || !(nodeBundle.priceNode == null || nodeBundle.priceNode.shopPromotions == null || nodeBundle.priceNode.shopPromotions.isEmpty()) || (nodeBundle.itemNode != null && nodeBundle.itemNode.itemPoint > 0);
                } else if (a2 == 30012) {
                    return nodeBundle.itemNode != null && !TextUtils.isEmpty(nodeBundle.itemNode.skuText);
                } else if (a2 == 30014) {
                    return (nodeBundle.rateNode == null || nodeBundle.rateNode.keywords == null || nodeBundle.rateNode.keywords.isEmpty()) ? false : true;
                } else if (a2 != 30015) {
                    return true;
                } else {
                    return (nodeBundle.rateNode == null || nodeBundle.rateNode.rateList == null || nodeBundle.rateNode.rateList.isEmpty()) ? false : true;
                }
            } else if (nodeBundle.priceNode != null && nodeBundle.priceNode.priceTags != null && !nodeBundle.priceNode.priceTags.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
