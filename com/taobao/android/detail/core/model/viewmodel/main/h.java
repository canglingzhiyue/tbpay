package com.taobao.android.detail.core.model.viewmodel.main;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.kge;

/* loaded from: classes4.dex */
public class h extends com.taobao.android.detail.datasdk.model.viewmodel.main.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9771a;

    static {
        kge.a(-1761029271);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.TipViewModel";
    }

    public h(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
        if (componentModel == null || componentModel.mapping == null) {
            return;
        }
        this.f9771a = componentModel.mapping.getString("text");
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!StringUtils.isEmpty(this.f9771a)) {
            return super.isValid();
        }
        return false;
    }

    public h(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return;
        }
        this.f9771a = iDMComponent.getFields().getString("text");
    }
}
