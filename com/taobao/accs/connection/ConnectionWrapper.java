package com.taobao.accs.connection;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.f;
import com.taobao.aranger.exception.IPCException;
import tb.kge;

/* loaded from: classes.dex */
public class ConnectionWrapper implements IConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ConnectionWrapper";
    private com.taobao.accs.net.c connection;

    static {
        kge.a(21969870);
        kge.a(-2125803808);
    }

    public ConnectionWrapper(AccsClientConfig accsClientConfig, int i) {
        AccsClientConfig.setAccsConfig(accsClientConfig.getConfigEnv(), accsClientConfig);
        this.connection = d.getConnection(GlobalClientInfo.mContext, accsClientConfig.getTag(), true, 0, i);
    }

    public ConnectionWrapper(String str) {
        if (UtilityImpl.isMainProcess(GlobalClientInfo.getContext())) {
            this.connection = d.getConnection(GlobalClientInfo.mContext, str, true, 0, f.a().c());
            return;
        }
        this.connection = d.getConnection(GlobalClientInfo.mContext, str, true, 0);
    }

    public com.taobao.accs.net.c getConnection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.accs.net.c) ipChange.ipc$dispatch("7dd31105", new Object[]{this}) : this.connection;
    }

    @Override // com.taobao.accs.connection.IConnection
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.connection.c();
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void ping(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec72fd39", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.connection.a(z, z2);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.connection.d();
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean cancel(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5301f18f", new Object[]{this, str})).booleanValue() : this.connection.b(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.connection.g();
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getConfigTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d33cb5f7", new Object[]{this}) : this.connection.o;
    }

    @Override // com.taobao.accs.connection.IConnection
    public void startChannelService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ecfbb", new Object[]{this});
        } else {
            this.connection.m();
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getAppkey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this}) : this.connection.k();
    }

    @Override // com.taobao.accs.connection.IConnection
    public void onResult(Message message, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd80fc3d", new Object[]{this, message, new Integer(i)});
        } else {
            this.connection.b(message, i);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getHost(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("500f2a51", new Object[]{this, str}) : this.connection.c(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getAppSecret() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("96a305e", new Object[]{this}) : this.connection.j.getAppSecret();
    }

    @Override // com.taobao.accs.connection.IConnection
    public void setTTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41e61ce", new Object[]{this, str});
        } else {
            this.connection.f8266a = str;
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void setAppkey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9dfe31", new Object[]{this, str});
        } else {
            this.connection.b = str;
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void send(Message message, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb9ebe2", new Object[]{this, message, new Boolean(z)});
        } else {
            this.connection.b(message, z);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void updateConfig(AccsClientConfig accsClientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2d53f8", new Object[]{this, accsClientConfig});
            return;
        }
        com.taobao.accs.net.c cVar = this.connection;
        if (!(cVar instanceof com.taobao.accs.net.e)) {
            return;
        }
        ((com.taobao.accs.net.e) cVar).a(accsClientConfig);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean isAppBinded(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bdfebb68", new Object[]{this, str})).booleanValue() : this.connection.l().c(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean isAppUnbinded(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abec28c1", new Object[]{this, str})).booleanValue() : this.connection.l().d(str);
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean isUserBinded(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40bdc330", new Object[]{this, str, str2})).booleanValue() : this.connection.l().c(str, str2);
    }

    @Override // com.taobao.accs.connection.IConnection
    public void sendMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e2a749", new Object[]{this, message});
        } else {
            this.connection.a(message, true);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void setForeBackState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("135ddd90", new Object[]{this, new Integer(i)});
        } else {
            this.connection.b(i);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void setSendBackState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8010b2d", new Object[]{this, new Boolean(z)});
        } else {
            this.connection.a(z);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getStoreId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5844913", new Object[]{this}) : this.connection.j.getStoreId();
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean isConnected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[]{this})).booleanValue() : this.connection.p();
    }

    @Override // com.taobao.accs.connection.IConnection
    public boolean getSendBackState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7740ac17", new Object[]{this})).booleanValue() : this.connection.q();
    }

    @Override // com.taobao.accs.connection.IConnection
    public long getServerTime() throws IPCException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7cda1621", new Object[]{this})).longValue() : this.connection.t();
    }

    @Override // com.taobao.accs.connection.IConnection
    public void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb59c4bb", new Object[]{this, accsConnectStateListener});
        } else {
            this.connection.a(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4790e2", new Object[]{this, accsConnectStateListener});
        } else {
            this.connection.b(accsConnectStateListener);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public String getConnectionUnitInfo() throws IPCException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4d9bf73", new Object[]{this}) : this.connection.j();
    }

    @Override // com.taobao.accs.connection.IConnection
    public void registerHeartBeatListener(IHeartBeat iHeartBeat) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf7e846", new Object[]{this, iHeartBeat});
        } else {
            this.connection.a(iHeartBeat);
        }
    }

    @Override // com.taobao.accs.connection.IConnection
    public void unregisterHeartBeatListener(IHeartBeat iHeartBeat) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bee6bcd", new Object[]{this, iHeartBeat});
        } else {
            this.connection.b(iHeartBeat);
        }
    }
}
