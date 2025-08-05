package com.taobao.accs;

import android.os.IBinder;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.exception.IPCException;
import java.util.Map;

@ServiceName("com.taobao.accs.client.GlobalClientInfo")
/* loaded from: classes.dex */
public interface IGlobalClientInfoService {
    void registerAllRemoteService(String str, Map<String, String> map) throws IPCException;

    void registerRemoteConnectionListener(String str, String str2, AccsConnectStateListener accsConnectStateListener) throws IPCException;

    void registerRemoteListener(String str, AccsDataListener accsDataListener) throws IPCException;

    void registerRemoteMainBinder(IBinder iBinder) throws IPCException;

    void registerRemoteService(String str, String str2) throws IPCException;

    void setRemoteAgooAppReceiver(IAgooAppReceiver iAgooAppReceiver) throws IPCException;

    void setRemoteAppReceiver(String str, IAppReceiver iAppReceiver) throws IPCException;

    void unregisterRemoteConnectionListener(String str, String str2, AccsConnectStateListener accsConnectStateListener) throws IPCException;

    void unregisterRemoteListener(String str) throws IPCException;

    void unregisterRemoteService(String str) throws IPCException;
}
