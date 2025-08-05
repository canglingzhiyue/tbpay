package com.taobao.accs.base;

import com.taobao.accs.base.TaoBaseService;
import com.taobao.aranger.annotation.type.Callback;
import com.taobao.aranger.exception.IPCException;

@Callback
/* loaded from: classes.dex */
public interface AccsConnectStateListener2 extends AccsConnectStateListener {
    void onConnectFail(TaoBaseService.ConnectInfo connectInfo) throws IPCException;

    @Override // com.taobao.accs.base.AccsConnectStateListener
    void onConnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException;

    @Override // com.taobao.accs.base.AccsConnectStateListener
    void onDisconnected(TaoBaseService.ConnectInfo connectInfo) throws IPCException;
}
