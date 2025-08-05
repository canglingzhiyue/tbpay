package com.taobao.accs.ut.monitor;

import android.content.Intent;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import tb.kge;
import tb.mto;

@Monitor(module = "accs", monitorPoint = "data_receive")
/* loaded from: classes.dex */
public class DataReceiveMonitor extends BaseMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CB_LISTENER = "listener";
    public static final String CB_SERVICE = "service";
    private static final String TAG = "DataReceiveMonitor";
    public long accsExecTime;
    public long accsHandlerTime;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long business_to_dispatch;
    @Dimension
    public String callback;
    @Dimension
    public String dataId;
    public long dispatchTime;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long dispatch_to_handler;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long dispatch_to_service;
    public long distributeEndTime;
    public long distributeTime;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long distribute_to_business;
    public long endTime;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long exec_to_end;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long handler_to_exec;
    public long parseAfterAckTime;
    public long parseBeforeAckTime;
    public long parseHandleTime;
    public long parseStartTime;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long parse_t1;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long parse_t2;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long parse_t3;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long parse_to_distribute;
    @Dimension
    public String process;
    public long receiveTime;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long recv_to_parse;
    @Dimension
    public String serviceId;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long service_to_handler;
    public long startBusinessTime;
    public long svcStartTime;
    @Measure(constantValue = mto.a.GEO_NOT_SUPPORT, max = 600000.0d, min = mto.a.GEO_NOT_SUPPORT)
    public long totalTime;

    static {
        kge.a(1016148956);
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

    @Override // com.taobao.accs.utl.BaseMonitor, anet.channel.statist.StatObject
    public boolean beforeCommit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155d4321", new Object[]{this})).booleanValue();
        }
        this.recv_to_parse = computeTime(this.receiveTime, this.parseStartTime);
        this.parse_t1 = computeTime(this.parseStartTime, this.parseHandleTime);
        this.parse_t2 = computeTime(this.parseHandleTime, this.parseBeforeAckTime);
        this.parse_t3 = computeTime(this.parseBeforeAckTime, this.parseAfterAckTime);
        this.parse_to_distribute = computeTime(this.parseAfterAckTime, this.distributeTime);
        this.distribute_to_business = computeTime(this.distributeEndTime, this.startBusinessTime);
        this.business_to_dispatch = computeTime(this.startBusinessTime, this.dispatchTime);
        if ("service".equals(this.callback)) {
            this.dispatch_to_service = computeTime(this.dispatchTime, this.svcStartTime);
            this.service_to_handler = computeTime(this.svcStartTime, this.accsHandlerTime);
        }
        this.dispatch_to_handler = computeTime(this.dispatchTime, this.accsHandlerTime);
        this.handler_to_exec = computeTime(this.accsHandlerTime, this.accsExecTime);
        this.exec_to_end = computeTime(this.accsExecTime, this.endTime);
        this.totalTime = computeTime(this.receiveTime, this.endTime);
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.e(TAG, "beforeCommit", toString());
        }
        return super.beforeCommit();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DataReceiveMonitor{recv_to_parse=" + this.recv_to_parse + ", parse_t1=" + this.parse_t1 + ", parse_t2=" + this.parse_t2 + ", parse_t3=" + this.parse_t3 + ", parse_to_distribute=" + this.parse_to_distribute + ", distribute_to_business=" + this.distribute_to_business + ", business_to_dispatch=" + this.business_to_dispatch + ", dispatch_to_service=" + this.dispatch_to_service + ", service_to_handler=" + this.service_to_handler + ", totalTime=" + this.totalTime + ", serviceId='" + this.serviceId + "', dataId='" + this.dataId + "', process='" + this.process + "', callback='" + this.callback + "'}";
    }

    public static DataReceiveMonitor get(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DataReceiveMonitor) ipChange.ipc$dispatch("e158856f", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        try {
            return (DataReceiveMonitor) intent.getSerializableExtra(Constants.KEY_DOWN_MONITOR);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
