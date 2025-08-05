package anet.channel;

import anet.channel.heartbeat.IHeartbeat;
import anet.channel.session.TnetSpdySession;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class SessionInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final IAuth auth;
    public final CustomDataFrameCb customDataFrameCb;
    @Deprecated
    public final DataFrameCb dataFrameCb;
    public final IHeartbeat heartbeat;
    public final String host;
    public final boolean isAccs;
    public final boolean isKeepAlive;

    static {
        kge.a(-1315214267);
    }

    @Deprecated
    public static SessionInfo create(String str, boolean z, boolean z2, IAuth iAuth, IHeartbeat iHeartbeat, DataFrameCb dataFrameCb) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionInfo) ipChange.ipc$dispatch("37a792a2", new Object[]{str, new Boolean(z), new Boolean(z2), iAuth, iHeartbeat, dataFrameCb}) : new SessionInfo(str, z, z2, iAuth, iHeartbeat, dataFrameCb);
    }

    public static SessionInfo create(String str, boolean z, boolean z2, IAuth iAuth, IHeartbeat iHeartbeat, CustomDataFrameCb customDataFrameCb) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionInfo) ipChange.ipc$dispatch("5840a3f1", new Object[]{str, new Boolean(z), new Boolean(z2), iAuth, iHeartbeat, customDataFrameCb}) : new SessionInfo(str, z, z2, iAuth, iHeartbeat, null, customDataFrameCb);
    }

    private SessionInfo(String str, boolean z, boolean z2, IAuth iAuth, IHeartbeat iHeartbeat, final DataFrameCb dataFrameCb) {
        this(str, z, z2, iAuth, iHeartbeat, dataFrameCb, dataFrameCb == null ? null : new CustomDataFrameCb() { // from class: anet.channel.SessionInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.CustomDataFrameCb
            public void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i, int i2, int i3, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2636add6", new Object[]{this, tnetSpdySession, bArr, new Integer(i), new Integer(i2), new Integer(i3), map});
                } else {
                    DataFrameCb.this.onDataReceive(tnetSpdySession, bArr, i, i2);
                }
            }

            @Override // anet.channel.CustomDataFrameCb
            public void onException(int i, int i2, boolean z3, String str2, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2bce0ebe", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z3), str2, map});
                } else {
                    DataFrameCb.this.onException(i, i2, z3, str2);
                }
            }
        });
    }

    private SessionInfo(String str, boolean z, boolean z2, IAuth iAuth, IHeartbeat iHeartbeat, DataFrameCb dataFrameCb, CustomDataFrameCb customDataFrameCb) {
        this.host = str;
        this.isAccs = z2;
        this.auth = iAuth;
        this.isKeepAlive = z;
        this.heartbeat = iHeartbeat;
        this.dataFrameCb = dataFrameCb;
        this.customDataFrameCb = customDataFrameCb;
    }
}
