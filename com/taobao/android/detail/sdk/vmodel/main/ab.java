package com.taobao.android.detail.sdk.vmodel.main;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.node.RateNode;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ab extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RateNode.RateKeyword> f10407a;
    public ArrayList<RateNode.SimpleRateItem> b;
    public long c;

    static {
        kge.a(-15107311);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30014;
    }

    public ab(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.f10407a = nodeBundle.rateNode.keywords;
        this.b = nodeBundle.rateNode.rateList;
        this.c = nodeBundle.itemNode.commentCount.longValue();
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.RateTagsViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        ArrayList<RateNode.RateKeyword> arrayList;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.c > 0 && (arrayList = this.f10407a) != null && arrayList.size() > 0;
    }
}
