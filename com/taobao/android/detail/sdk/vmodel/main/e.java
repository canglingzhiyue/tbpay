package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.CouponNode;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class e extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public CouponNode f10424a;
    public String b;
    public String c;

    static {
        kge.a(-673839338);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_COUPON_INFO;
    }

    public e(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.CouponInfoViewModel");
        if (nodeBundle == null || nodeBundle.resourceNode == null) {
            return;
        }
        this.f10424a = nodeBundle.resourceNode.couponNode;
        if (nodeBundle.sellerNode != null) {
            this.b = nodeBundle.sellerNode.userId;
        }
        if (nodeBundle.itemNode == null) {
            return;
        }
        this.c = nodeBundle.itemNode.itemId;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        CouponNode couponNode = this.f10424a;
        return (couponNode == null || couponNode.mainItems == null || this.f10424a.mainItems.size() <= 0) ? false : true;
    }
}
