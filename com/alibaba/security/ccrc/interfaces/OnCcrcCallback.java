package com.alibaba.security.ccrc.interfaces;

import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.model.InitResult;

/* loaded from: classes3.dex */
public interface OnCcrcCallback {
    void onInit(InitState initState, InitResult initResult);
}
