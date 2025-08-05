package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.TmallFeatureNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class am extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TmallFeatureNode f10419a;
    public String b;
    public String c;

    static {
        kge.a(-1651643524);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_TMALL_FEATURE;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public am(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        if (nodeBundle != null && nodeBundle.resourceNode != null) {
            this.f10419a = nodeBundle.resourceNode.tmallFeatureNode;
            if (nodeBundle.sellerNode != null) {
                this.b = nodeBundle.sellerNode.userId;
            }
            if (nodeBundle.itemNode != null) {
                this.c = nodeBundle.itemNode.itemId;
            }
        }
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.TmallFeatureViewModel");
    }
}
