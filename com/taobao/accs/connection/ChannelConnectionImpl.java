package com.taobao.accs.connection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.connection.state.StateMachine;
import com.taobao.accs.utl.ALog;
import com.taobao.aranger.exception.IPCException;
import tb.kge;

/* loaded from: classes.dex */
public class ChannelConnectionImpl implements IChannelConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ChannelConnectionImpl";

    static {
        kge.a(-396341894);
        kge.a(-1470514689);
    }

    @Override // com.taobao.accs.connection.IChannelConnection
    public void start(String str, int i, IChannelConnListener iChannelConnListener) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c4f150", new Object[]{this, str, new Integer(i), iChannelConnListener});
            return;
        }
        ALog.e(TAG, "start()", Constants.KEY_CONFIG_TAG, str, "state", Integer.valueOf(i));
        if (iChannelConnListener == null) {
            return;
        }
        try {
            iChannelConnListener.onStart();
            com.taobao.accs.net.e.J = true;
            com.taobao.accs.net.c connection = d.getConnection(GlobalClientInfo.getContext(), str, false, -1, i);
            connection.b(i);
            connection.c();
        } catch (Throwable th) {
            ALog.e(TAG, "start err", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.connection.IChannelConnection
    public void mainProcessStartUp(StateMachine.Event event) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dea44522", new Object[]{this, event});
            return;
        }
        ALog.e(TAG, "mainProcessStartUp", new Object[0]);
        com.taobao.accs.connection.state.a.a().b(event);
    }
}
