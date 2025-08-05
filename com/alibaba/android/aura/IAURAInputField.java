package com.alibaba.android.aura;

import java.io.Serializable;

/* loaded from: classes2.dex */
public interface IAURAInputField<DATA> extends Serializable {
    /* renamed from: getData */
    DATA mo136getData();

    String getErrorMessage();

    String getFieldName();

    Class getTargetClass();

    boolean isRequired();
}
