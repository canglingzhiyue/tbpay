package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.Props2Node;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class TitleViewModel extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10402a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public ShareType k;
    public String l;
    public ArrayList<Props2Node.ImportantProp> m;

    /* loaded from: classes4.dex */
    public enum ShareType {
        SHARE_TYPE_DEFAULT(1),
        SHARE_TYPE_PRESENT(2),
        SHARE_TYPE_GIFT(3),
        SHARE_TYPE_AWARD(4);
        
        private int value;

        ShareType(int i) {
            this.value = i;
        }

        public static ShareType getEnum(int i) {
            return values()[i - 1];
        }

        public int getValue() {
            return this.value;
        }
    }

    static {
        kge.a(-100795098);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30002;
    }

    public TitleViewModel(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.k = ShareType.SHARE_TYPE_DEFAULT;
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.TitleViewModel");
        this.f10402a = nodeBundle.itemNode.title;
        this.b = nodeBundle.itemNode.subtitle;
        this.c = nodeBundle.featureNode.showSubTitle;
        this.d = nodeBundle.itemNode.titleIcon;
        this.f = nodeBundle.itemNode.itemId;
        this.j = nodeBundle.itemNode.shareIcon;
        this.g = nodeBundle.priceNode.price.priceText;
        this.l = nodeBundle.itemNode.shortTitle;
        this.m = nodeBundle.props2Node.importantProps;
        if (!nodeBundle.itemNode.images.isEmpty()) {
            this.e = nodeBundle.itemNode.images.get(0);
        }
        if (!nodeBundle.priceNode.extraPrices.isEmpty()) {
            this.h = nodeBundle.priceNode.extraPrices.get(0).priceText;
        }
        if (nodeBundle.resourceNode == null || nodeBundle.resourceNode.share == null) {
            return;
        }
        this.i = nodeBundle.resourceNode.share.name;
        this.k = ShareType.getEnum(nodeBundle.resourceNode.share.iconType);
    }
}
