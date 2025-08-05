package com.taobao.accs.connection;

import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface IChannelConnListener {
    void onStart() throws IPCException;
}
