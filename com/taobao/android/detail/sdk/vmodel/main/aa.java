package com.taobao.android.detail.sdk.vmodel.main;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class aa extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10406a;

    static {
        kge.a(-654344803);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 30013;
    }

    public aa(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.RateHeaderViewModel");
        if (nodeBundle.itemNode.commentCount == null) {
            this.f10406a = "宝贝评价";
            return;
        }
        long longValue = nodeBundle.itemNode.commentCount.longValue();
        if (longValue == 0) {
            this.f10406a = String.format("%s(0)", "暂无评价");
        } else {
            this.f10406a = String.format("%s(%d)", "宝贝评价", Long.valueOf(longValue));
        }
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.f10406a);
    }
}
