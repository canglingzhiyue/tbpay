package com.taobao.accs.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class AccsStreamConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int endSeq;
    private boolean saveDB = false;
    private int seqSnapshotInterval;
    private String serviceId;
    private int startSeq;
    private String streamId;
    private long syncTimeoutInMill;
    private String userId;

    static {
        kge.a(619506223);
        kge.a(1028243835);
    }

    public AccsStreamConfig(String str) {
        this.serviceId = str;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : this.userId;
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public long getSyncTimeoutInMill() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63747c0c", new Object[]{this})).longValue() : this.syncTimeoutInMill;
    }

    public void setSyncTimeoutInMill(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5f19b8", new Object[]{this, new Long(j)});
        } else {
            this.syncTimeoutInMill = j;
        }
    }

    public String getStreamId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec97f168", new Object[]{this}) : this.streamId;
    }

    public AccsStreamConfig setStreamId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("54974ef0", new Object[]{this, str});
        }
        this.streamId = str;
        return this;
    }

    public String getServiceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5f673f", new Object[]{this}) : this.serviceId;
    }

    public AccsStreamConfig setServiceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("319f98a1", new Object[]{this, str});
        }
        this.serviceId = str;
        return this;
    }

    public int getStartSeq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf030d0d", new Object[]{this})).intValue() : this.startSeq;
    }

    public AccsStreamConfig setStartSeq(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("23e8853f", new Object[]{this, new Integer(i)});
        }
        this.startSeq = i;
        return this;
    }

    public int getSeqSnapshotInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("892f956c", new Object[]{this})).intValue() : this.seqSnapshotInterval;
    }

    public AccsStreamConfig setSeqSnapshotInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("37ff1098", new Object[]{this, new Integer(i)});
        }
        this.seqSnapshotInterval = i;
        return this;
    }

    public int getEndSeq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("71e423f4", new Object[]{this})).intValue() : this.endSeq;
    }

    public AccsStreamConfig setEndSeq(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsStreamConfig) ipChange.ipc$dispatch("117c5578", new Object[]{this, new Integer(i)});
        }
        this.endSeq = i;
        return this;
    }

    public boolean isSaveDB() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4b80a90", new Object[]{this})).booleanValue() : this.saveDB;
    }

    public void setSaveDB(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6911790", new Object[]{this, new Boolean(z)});
        } else {
            this.saveDB = z;
        }
    }
}
