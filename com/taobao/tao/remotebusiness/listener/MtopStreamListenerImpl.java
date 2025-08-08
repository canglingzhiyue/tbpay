package com.taobao.tao.remotebusiness.listener;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.handler.HandlerParam;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopStreamListenerImpl extends b implements MtopCallback.MtopStreamListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopStreamListenerImpl";

    static {
        kge.a(-169216562);
        kge.a(-513312519);
    }

    public static /* synthetic */ Object ipc$super(MtopStreamListenerImpl mtopStreamListenerImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MtopStreamListenerImpl(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        super(mtopBusiness, mtopListener);
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopStreamListener
    public void onReceiveData(MtopFinishEvent mtopFinishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ff6763", new Object[]{this, mtopFinishEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onReceiveData");
        }
        MtopResponse abnormalSituation = abnormalSituation(mtopFinishEvent);
        if (abnormalSituation == null) {
            TBSdkLog.e(TAG, seqNo, "The MtopResponse of MtopFinishEvent is null.");
            return;
        }
        if (this.mtopBusiness.onStreamFirstResReadyTime <= 0) {
            this.mtopBusiness.onStreamFirstResReadyTime = System.currentTimeMillis();
        }
        HandlerParam a2 = com.taobao.tao.remotebusiness.handler.a.a(this.listener, mtopFinishEvent, this.mtopBusiness);
        a2.mtopResponse = abnormalSituation;
        if (this.mtopBusiness.clazz != null) {
            if (StringUtils.isEmpty(abnormalSituation.getRetCode())) {
                abnormalSituation.parseJsonByte();
            }
            if (abnormalSituation.isApiSuccess()) {
                a2.pojo = MtopConvert.mtopResponseToOutputDO(abnormalSituation, this.mtopBusiness.clazz);
            }
        }
        if (this.mtopBusiness.mtopProp.handler != null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, seqNo, "onReceive: ON_FINISHED in self-defined handler.");
            }
            a2.mtopBusiness.doStreamReceiveData(a2.mtopResponse, a2.pojo);
            return;
        }
        com.taobao.tao.remotebusiness.handler.a.a().obtainMessage(10, a2).sendToTarget();
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopStreamListener
    public void onFinish(MtopFinishEvent mtopFinishEvent, Object obj) {
        long j;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57cf75f", new Object[]{this, mtopFinishEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onFinished event received.");
        }
        MtopResponse abnormalSituation = abnormalSituation(mtopFinishEvent);
        if (abnormalSituation == null) {
            TBSdkLog.e(TAG, seqNo, "The MtopResponse of MtopFinishEvent is null.");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HandlerParam a2 = com.taobao.tao.remotebusiness.handler.a.a(this.listener, mtopFinishEvent, this.mtopBusiness);
        a2.mtopResponse = abnormalSituation;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (!abnormalSituation.isApiSuccess() || this.mtopBusiness.clazz == null || abnormalSituation.getStreamModeData() != null) {
            j = currentTimeMillis2;
        } else {
            a2.pojo = MtopConvert.mtopResponseToOutputDO(abnormalSituation, this.mtopBusiness.clazz);
            j = System.currentTimeMillis();
        }
        this.mtopBusiness.onBgFinishTime = j;
        MtopStatistics mtopStat = abnormalSituation.getMtopStat();
        MtopStatistics.RbStatisticData rbStatisticData = null;
        if (mtopStat != null) {
            rbStatisticData = mtopStat.getRbStatData();
            long j2 = this.mtopBusiness.sendStartTime;
            MtopBusiness mtopBusiness = this.mtopBusiness;
            str = TAG;
            rbStatisticData.beforeReqTime = j2 - mtopBusiness.reqStartTime;
            rbStatisticData.mtopReqTime = currentTimeMillis - this.mtopBusiness.sendStartTime;
            rbStatisticData.afterReqTime = this.mtopBusiness.onBgFinishTime - currentTimeMillis;
            rbStatisticData.parseTime = currentTimeMillis2 - currentTimeMillis;
            rbStatisticData.jsonParseTime = j - currentTimeMillis2;
            rbStatisticData.jsonTime = rbStatisticData.jsonParseTime;
            rbStatisticData.rbReqTime = this.mtopBusiness.onBgFinishTime - this.mtopBusiness.reqStartTime;
            rbStatisticData.totalTime = rbStatisticData.rbReqTime;
            rbStatisticData.mtopDispatchTime = mtopStat.currentTimeMillis() - mtopStat.startCallbackTime;
        } else {
            str = TAG;
        }
        if (this.mtopBusiness.mtopProp.handler != null) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                str2 = str;
                TBSdkLog.i(str2, seqNo, "onReceive: ON_FINISHED in self-defined handler.");
            } else {
                str2 = str;
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            if (mtopStat != null) {
                FullTraceHelper.recordRspCbStart(mtopStat);
            }
            a2.mtopBusiness.doStreamFinish(a2.mtopResponse, a2.pojo);
            if (mtopStat != null) {
                FullTraceHelper.recordRspCbEnd(mtopStat);
                mtopStat.commitFullTrace();
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                long j3 = 0;
                if (a2.mtopResponse.getBytedata() != null) {
                    j3 = a2.mtopResponse.getBytedata().length;
                }
                StringBuilder sb = new StringBuilder(128);
                sb.append("onReceive: ON_FINISHED in self-defined handler.");
                sb.append("doFinishTime=");
                sb.append(System.currentTimeMillis() - currentTimeMillis3);
                sb.append(", dataSize=");
                sb.append(j3);
                sb.append("; ");
                if (rbStatisticData != null) {
                    sb.append(rbStatisticData.toString());
                }
                TBSdkLog.i(str2, seqNo, sb.toString());
            }
            if (mtopStat == null) {
                return;
            }
            mtopStat.commitStatData(true);
            return;
        }
        if (mtopStat != null) {
            FullTraceHelper.recordRspCbDispatch(mtopStat);
        }
        com.taobao.tao.remotebusiness.handler.a.a().obtainMessage(11, a2).sendToTarget();
    }

    private void commitFullTrace(MtopFinishEvent mtopFinishEvent, String str) {
        MtopStatistics mtopStat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42d73000", new Object[]{this, mtopFinishEvent, str});
        } else if (mtopFinishEvent == null) {
        } else {
            try {
                MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
                if (mtopResponse == null || (mtopStat = mtopResponse.getMtopStat()) == null) {
                    return;
                }
                mtopStat.cancelRequest = true;
                FullTraceHelper.recordRspCbStart(mtopStat);
                FullTraceHelper.recordRspCbEnd(mtopStat);
                mtopStat.commitFullTrace();
            } catch (Throwable th) {
                TBSdkLog.e(TAG, str, "commitFullTrace error.", th);
            }
        }
    }

    private MtopResponse abnormalSituation(MtopFinishEvent mtopFinishEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("577f9bbc", new Object[]{this, mtopFinishEvent});
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        if (this.mtopBusiness.isTaskCanceled()) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e(TAG, seqNo, "The request of MtopBusiness is canceled.");
            }
            commitFullTrace(mtopFinishEvent, seqNo);
            return null;
        } else if (this.listener == null) {
            TBSdkLog.e(TAG, seqNo, "The listener of MtopBusiness is null.");
            return null;
        } else if (mtopFinishEvent == null) {
            TBSdkLog.e(TAG, seqNo, "MtopFinishEvent is null.");
            return null;
        } else {
            return mtopFinishEvent.getMtopResponse();
        }
    }
}
