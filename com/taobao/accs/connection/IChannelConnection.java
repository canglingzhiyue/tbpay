package com.taobao.accs.connection;

import com.taobao.accs.connection.state.StateMachine;
import com.taobao.aranger.annotation.method.oneway;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.exception.IPCException;

@ServiceName("com.taobao.accs.connection.ChannelConnectionImpl")
/* loaded from: classes.dex */
public interface IChannelConnection {
    @oneway
    void mainProcessStartUp(StateMachine.Event event) throws IPCException;

    @oneway
    void start(String str, int i, IChannelConnListener iChannelConnListener) throws IPCException;
}
