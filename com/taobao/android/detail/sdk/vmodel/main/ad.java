package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.ResourceNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ad extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10409a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public ResourceNode.Entry h;
    public String i;
    public boolean j;

    static {
        kge.a(614088903);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30017;
    }

    public ad(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.ShopHeaderViewModel");
        this.f10409a = nodeBundle.sellerNode.shopIcon;
        this.c = nodeBundle.sellerNode.shopName;
        this.d = nodeBundle.sellerNode.tagIcon;
        this.e = nodeBundle.sellerNode.shopLevel;
        this.f = nodeBundle.sellerNode.shopType;
        this.g = nodeBundle.sellerNode.certIcon;
        this.b = nodeBundle.sellerNode.shopTitleIcon;
        this.j = nodeBundle.featureNode.isXinxuan;
        if (nodeBundle.resourceNode.entrances.containsKey(ResourceNode.MAP_KEY_ENDORSEMENT)) {
            this.h = nodeBundle.resourceNode.entrances.get(ResourceNode.MAP_KEY_ENDORSEMENT);
        }
        this.i = nodeBundle.sellerNode.userId;
    }
}
