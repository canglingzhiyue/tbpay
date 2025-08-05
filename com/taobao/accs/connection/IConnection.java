package com.taobao.accs.connection;

import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.data.Message;
import com.taobao.aranger.annotation.method.AutoRecover;
import com.taobao.aranger.annotation.method.oneway;
import com.taobao.aranger.annotation.type.ServiceName;
import com.taobao.aranger.exception.IPCException;

@ServiceName("com.taobao.accs.connection.ConnectionWrapper")
/* loaded from: classes.dex */
public interface IConnection {
    boolean cancel(String str) throws IPCException;

    @oneway
    void close() throws IPCException;

    @AutoRecover
    String getAppSecret() throws IPCException;

    @AutoRecover
    String getAppkey() throws IPCException;

    String getConfigTag() throws IPCException;

    String getConnectionUnitInfo() throws IPCException;

    @AutoRecover
    String getHost(String str) throws IPCException;

    @AutoRecover
    boolean getSendBackState() throws IPCException;

    long getServerTime() throws IPCException;

    @AutoRecover
    String getStoreId() throws IPCException;

    String getTag() throws IPCException;

    @AutoRecover
    boolean isAppBinded(String str) throws IPCException;

    boolean isAppUnbinded(String str) throws IPCException;

    @AutoRecover
    boolean isConnected() throws IPCException;

    boolean isUserBinded(String str, String str2) throws IPCException;

    @oneway
    void onResult(Message message, int i) throws IPCException;

    @oneway
    void ping(boolean z, boolean z2) throws IPCException;

    void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) throws IPCException;

    @AutoRecover
    void registerHeartBeatListener(IHeartBeat iHeartBeat) throws IPCException;

    @AutoRecover
    void send(Message message, boolean z) throws IPCException;

    @AutoRecover
    void sendMessage(Message message) throws IPCException;

    void setAppkey(String str) throws IPCException;

    @AutoRecover
    void setForeBackState(int i) throws IPCException;

    @AutoRecover
    void setSendBackState(boolean z) throws IPCException;

    void setTTid(String str) throws IPCException;

    @oneway
    void start() throws IPCException;

    @oneway
    void startChannelService() throws IPCException;

    void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) throws IPCException;

    @AutoRecover
    void unregisterHeartBeatListener(IHeartBeat iHeartBeat) throws IPCException;

    void updateConfig(AccsClientConfig accsClientConfig) throws IPCException;
}
