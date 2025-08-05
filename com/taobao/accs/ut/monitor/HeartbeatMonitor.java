package com.taobao.accs.ut.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import tb.kge;

@Monitor(module = "accs", monitorPoint = "smart_hb")
/* loaded from: classes.dex */
public class HeartbeatMonitor extends BaseMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HeartbeatMonitor";
    @Dimension
    public long bucketId = -1;
    @Measure
    public long intervalInSec;
    @Dimension
    public String netType;
    @Dimension
    public String state;

    static {
        kge.a(-1267845095);
    }

    public static /* synthetic */ Object ipc$super(HeartbeatMonitor heartbeatMonitor, String str, Object... objArr) {
        if (str.hashCode() == 358433569) {
            return new Boolean(super.beforeCommit());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HeartbeatMonitor(String str, long j) {
        this.state = str;
        this.intervalInSec = j;
    }

    public void setBucketId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25a1c456", new Object[]{this, new Long(j)});
        } else {
            this.bucketId = j;
        }
    }

    public void setNetType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c08b7486", new Object[]{this, str});
        } else {
            this.netType = str;
        }
    }

    @Override // com.taobao.accs.utl.BaseMonitor, anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        ALog.e(TAG, "beforeCommit", "state", this.state, "intervalInSec", Long.valueOf(this.intervalInSec));
        return super.beforeCommit();
    }
}
