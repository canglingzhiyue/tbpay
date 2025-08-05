package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.overpull.AURAOverPullContainerLayout;
import tb.ekf;
import tb.kge;

/* loaded from: classes2.dex */
public class AliSDetailMainGalleryLoadMoreExtension_InputField_overPullContainerLayout implements IAURAInputField<AURAOverPullContainerLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AURAOverPullContainerLayout overPullContainerLayout;
    private String fieldName = "overPullContainerLayout";
    private Class<ekf> targetClass = ekf.class;
    private boolean isRequired = true;
    private String errorMessage = "";

    static {
        kge.a(-1011341594);
        kge.a(-2013470159);
    }

    public AliSDetailMainGalleryLoadMoreExtension_InputField_overPullContainerLayout(AURAOverPullContainerLayout aURAOverPullContainerLayout) {
        this.overPullContainerLayout = aURAOverPullContainerLayout;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public Class<ekf> getTargetClass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("832385e5", new Object[]{this}) : this.targetClass;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public String getFieldName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("556566a", new Object[]{this}) : this.fieldName;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.alibaba.android.aura.IAURAInputField
    /* renamed from: getData */
    public AURAOverPullContainerLayout mo136getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAOverPullContainerLayout) ipChange.ipc$dispatch("faa417e1", new Object[]{this}) : this.overPullContainerLayout;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public String getErrorMessage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fedd06c4", new Object[]{this}) : this.errorMessage;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public boolean isRequired() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7178baf4", new Object[]{this})).booleanValue() : this.isRequired;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IAURAInputField)) {
            return false;
        }
        IAURAInputField iAURAInputField = (IAURAInputField) obj;
        return mo136getData() == iAURAInputField.mo136getData() && getFieldName() == iAURAInputField.getFieldName() && getTargetClass() == iAURAInputField.getTargetClass();
    }
}
