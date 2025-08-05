package com.taobao.tao.messagekit.base.monitor.model;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.PMBaseMonitor;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import tb.kge;
import tb.mto;

@Monitor(module = "pm", monitorPoint = "data_rcv")
/* loaded from: classes8.dex */
public class DataReceiveMonitor extends PMBaseMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int ERR_CACHED = 0;
    public static int ERR_DUPLICATE = 0;
    private static final String TAG = "DataReceiveMonitor";
    public String accsDataId;
    @Measure
    public long errorCode;
    public String msgId;
    public long msgOnNextTime;
    public long parseEndTime;
    public long parseMapTime;
    public long pipeTime;
    public long rcvTime;
    public long startDispatchTime;
    public long streamFilterTime;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long t_1;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long t_2;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long t_3;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long t_4;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long t_5;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long t_6;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long t_7;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long totalTime;
    public long upFilterTime;
    @Dimension
    public boolean result = false;
    @Dimension
    public int namespace = -1;
    @Dimension
    public String source = "";

    static {
        kge.a(324334458);
        ERR_DUPLICATE = -1;
        ERR_CACHED = -2;
    }

    private long computeTime(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2b567df", new Object[]{this, new Long(j), new Long(j2)})).longValue();
        }
        if (j > 0 && j2 > 0) {
            return j2 - j;
        }
        return 0L;
    }

    public static /* synthetic */ Object ipc$super(DataReceiveMonitor dataReceiveMonitor, String str, Object... objArr) {
        if (str.hashCode() == 358433569) {
            return new Boolean(super.beforeCommit());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.messagekit.base.monitor.PMBaseMonitor, anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        this.t_1 = computeTime(this.rcvTime, this.parseEndTime);
        this.t_2 = computeTime(this.parseEndTime, this.parseMapTime);
        this.t_3 = computeTime(this.parseMapTime, this.upFilterTime);
        this.t_4 = computeTime(this.upFilterTime, this.pipeTime);
        this.t_5 = computeTime(this.pipeTime, this.streamFilterTime);
        this.t_6 = computeTime(this.streamFilterTime, this.msgOnNextTime);
        this.t_7 = computeTime(this.msgOnNextTime, this.startDispatchTime);
        this.totalTime = computeTime(this.rcvTime, this.startDispatchTime);
        if (MsgLog.a(MsgLog.Level.D)) {
            MsgLog.a(TAG, "beforeCommit", toString());
        }
        return super.beforeCommit();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DataReceiveMonitor{t_1=" + this.t_1 + ", t_2=" + this.t_2 + ", t_3=" + this.t_3 + ", t_4=" + this.t_4 + ", t_5=" + this.t_5 + ", t_6=" + this.t_6 + ", t_7=" + this.t_7 + ", totalTime=" + this.totalTime + ", result=" + this.result + ", namespace=" + this.namespace + ", accsDataId=" + this.accsDataId + ", msgId=" + this.msgId + ", source='" + this.source + "'}";
    }
}
