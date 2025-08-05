package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.SellerNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class af extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<SellerNode.ShopDsrInfo> f10411a;
    public boolean b;

    static {
        kge.a(744007622);
    }

    public static /* synthetic */ Object ipc$super(af afVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30018;
    }

    public af(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.ShopInfoViewModel");
        if (nodeBundle == null) {
            return;
        }
        if (nodeBundle.sellerNode != null) {
            this.f10411a = nodeBundle.sellerNode.shopDsrInfoList;
        }
        if (nodeBundle.featureNode == null) {
            return;
        }
        this.b = nodeBundle.featureNode.hideShopDsr;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        ArrayList<SellerNode.ShopDsrInfo> arrayList;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : (this.children == null || this.children.size() == 0 || (arrayList = this.f10411a) == null || arrayList.size() == 0 || !super.isValid()) ? false : true;
    }
}
