package com.taobao.android.detail.sdk.vmodel.main;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class al extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10418a;

    static {
        kge.a(-571000637);
    }

    public static /* synthetic */ Object ipc$super(al alVar, String str, Object... objArr) {
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
        return 30005;
    }

    public al(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        tpc.a("com.taobao.android.detail.sdk.vmodel.main.TipViewModel");
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f10418a = componentModel.mapping.getString("text");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.f10418a)) {
            return super.isValid();
        }
        return false;
    }
}
