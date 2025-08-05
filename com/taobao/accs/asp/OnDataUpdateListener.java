package com.taobao.accs.asp;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface OnDataUpdateListener {
    void onDataUpdate(ModifiedRecord modifiedRecord) throws IPCException;
}
