package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import tb.azo;
import tb.kge;

/* loaded from: classes2.dex */
public class AURADismissFloatEvent_InputField_floatView implements IAURAInputField<com.alibaba.android.umf.taobao.adapter.widget.floatview.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.alibaba.android.umf.taobao.adapter.widget.floatview.a floatView;
    private String fieldName = "floatView";
    private Class<azo> targetClass = azo.class;
    private boolean isRequired = false;
    private String errorMessage = "";

    static {
        kge.a(641902263);
        kge.a(-2013470159);
    }

    public AURADismissFloatEvent_InputField_floatView(com.alibaba.android.umf.taobao.adapter.widget.floatview.a aVar) {
        this.floatView = aVar;
    }

    @Override // com.alibaba.android.aura.IAURAInputField
    public Class<azo> getTargetClass() {
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
    public com.alibaba.android.umf.taobao.adapter.widget.floatview.a mo136getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.umf.taobao.adapter.widget.floatview.a) ipChange.ipc$dispatch("a89bf9d1", new Object[]{this}) : this.floatView;
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
