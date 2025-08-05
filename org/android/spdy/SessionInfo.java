package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class SessionInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INVALID_PUBLIC_SEQNUM = -1;
    private final String domain;
    private final String host;
    private final int mode;
    private final int port;
    private final String proxyHost;
    private final int proxyPort;
    private int recvRateBps;
    private final SessionCb sessionCb;
    private SessionCustomExtraCb sessionCustomExtraCb;
    private final Object sessionUserData;
    private int setMSS;
    private int tunnelRetryTimes;
    private String certHost = null;
    private volatile int connectIndex = 0;
    private boolean tryForceCellular = false;
    private ArrayList<StrategyInfo> tunnelInfoArrayList = null;
    private String tunnelInfo = null;
    private final String tunnelDomain = "test.xquic.com";
    private boolean multiPathCompensateEnable = false;
    private boolean multiPathParallelAddSpeedEnable = false;
    private int pubkey_seqnum = -1;
    private int connTimeoutMs = -1;
    private int cong_control = 0;

    @Deprecated
    public void setXquicLossDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3811dd33", new Object[]{this, new Boolean(z)});
        }
    }

    @Deprecated
    public void setXquicPacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3046d338", new Object[]{this, new Integer(i)});
        }
    }

    public SessionInfo(String str, int i, String str2, String str3, int i2, Object obj, SessionCb sessionCb, int i3) {
        this.host = str;
        this.port = i;
        this.domain = str2;
        this.proxyHost = str3;
        this.proxyPort = i2;
        this.sessionUserData = obj;
        this.sessionCb = sessionCb;
        this.mode = i3;
    }

    public String getAuthority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dac808c", new Object[]{this});
        }
        if (this.proxyHost != null && this.proxyPort != 0) {
            return this.host + ":" + this.port + "/" + this.proxyHost + ":" + this.proxyPort;
        }
        return this.host + ":" + this.port;
    }

    public String getCertHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fae080d7", new Object[]{this});
        }
        if (this.pubkey_seqnum == -1) {
            return this.certHost;
        }
        return null;
    }

    public void setCertHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0cf47f", new Object[]{this, str});
        } else {
            this.certHost = str;
        }
    }

    public Object getSessonUserData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("66e7234f", new Object[]{this}) : this.sessionUserData;
    }

    public SessionCb getSessionCb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionCb) ipChange.ipc$dispatch("8fbe44bc", new Object[]{this}) : this.sessionCb;
    }

    public SessionInfo setSessionCustomExtraCb(SessionCustomExtraCb sessionCustomExtraCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("c0468dbd", new Object[]{this, sessionCustomExtraCb});
        }
        if (sessionCustomExtraCb != null) {
            this.sessionCustomExtraCb = sessionCustomExtraCb;
        }
        return this;
    }

    public SessionCustomExtraCb getSessionCustomExtraCb() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionCustomExtraCb) ipChange.ipc$dispatch("954226dc", new Object[]{this}) : this.sessionCustomExtraCb;
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue() : this.mode;
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this}) : this.domain;
    }

    public void setConnectionTimeoutMs(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd0fdd5", new Object[]{this, new Integer(i)});
        } else {
            this.connTimeoutMs = i;
        }
    }

    public int getConnectionTimeoutMs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b39ed6d", new Object[]{this})).intValue() : this.connTimeoutMs;
    }

    public void setPubKeySeqNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892ca551", new Object[]{this, new Integer(i)});
        } else {
            this.pubkey_seqnum = i;
        }
    }

    public int getPubKeySeqNum() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a280b6d9", new Object[]{this})).intValue() : this.pubkey_seqnum;
    }

    public void setXquicCongControl(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd42378", new Object[]{this, new Integer(i)});
        } else {
            this.cong_control = i;
        }
    }

    public int getXquicCongControl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3716bdd2", new Object[]{this})).intValue() : this.cong_control;
    }

    public void setRecvRateBps(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fabb1f", new Object[]{this, new Integer(i)});
        } else {
            this.recvRateBps = i;
        }
    }

    public int getRecvRateBps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1f7aae3", new Object[]{this})).intValue() : this.recvRateBps;
    }

    public void setMss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb82671", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.setMSS = i;
        }
    }

    public int getMss() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e7bd951", new Object[]{this})).intValue() : this.setMSS;
    }

    public void setConnectIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d95612", new Object[]{this, new Integer(i)});
        } else {
            this.connectIndex = i;
        }
    }

    public int getConnectIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f90a69f8", new Object[]{this})).intValue() : this.connectIndex;
    }

    public String getTunnelDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e1fc677", new Object[]{this});
        }
        getClass();
        return "test.xquic.com";
    }

    public void setTunnelInfos(ArrayList<StrategyInfo> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626f3ba8", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList == Collections.EMPTY_LIST) {
        } else {
            this.tunnelInfoArrayList = new ArrayList<>(arrayList);
        }
    }

    public ArrayList<StrategyInfo> getTunnelStrategyList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("72cac310", new Object[]{this}) : this.tunnelInfoArrayList;
    }

    public SessionInfo setMultiPathCompensateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("9223ab5c", new Object[]{this, new Boolean(z)});
        }
        this.multiPathCompensateEnable = z;
        return this;
    }

    public boolean getMultiPathCompensateEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ea5878d", new Object[]{this})).booleanValue() : this.multiPathCompensateEnable;
    }

    public SessionInfo setMultiPathParallelAddSpeedEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("f0d43e72", new Object[]{this, new Boolean(z)});
        }
        this.multiPathParallelAddSpeedEnable = z;
        return this;
    }

    public boolean getMultiPathParallelAddSpeedEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad2c23", new Object[]{this})).booleanValue() : this.multiPathParallelAddSpeedEnable;
    }

    public SessionInfo setTryForceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("92e11d62", new Object[]{this, new Boolean(z)});
        }
        this.tryForceCellular = z;
        return this;
    }

    public boolean isTryForceCellular() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7cdb434f", new Object[]{this})).booleanValue() : this.tryForceCellular;
    }
}
