package com.taobao.tao.remotebusiness.listener;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteCacheListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.handler.HandlerParam;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCacheEvent;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopConvert;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopCacheListenerImpl extends b implements MtopCallback.MtopCacheListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopCacheListenerImpl";

    static {
        kge.a(434008348);
        kge.a(-429814511);
    }

    public MtopCacheListenerImpl(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        super(mtopBusiness, mtopListener);
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopCacheListener
    public void onCached(MtopCacheEvent mtopCacheEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0c28d9", new Object[]{this, mtopCacheEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onCached event received. apiKey=" + this.mtopBusiness.request.getKey());
        }
        if (this.mtopBusiness.isTaskCanceled()) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, seqNo, "The request of MtopBusiness is cancelled.");
        } else if (this.listener == null) {
            TBSdkLog.e(TAG, seqNo, "The listener of MtopBusiness is null.");
        } else if (mtopCacheEvent == null) {
            TBSdkLog.e(TAG, seqNo, "MtopCacheEvent is null.");
        } else {
            MtopResponse mtopResponse = mtopCacheEvent.getMtopResponse();
            if (mtopResponse == null) {
                TBSdkLog.e(TAG, seqNo, "The MtopResponse of MtopCacheEvent is null.");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            MtopStatistics.RbStatisticData rbStatisticData = null;
            BaseOutDo mtopResponseToOutputDO = (!mtopResponse.isApiSuccess() || this.mtopBusiness.clazz == null) ? null : MtopConvert.mtopResponseToOutputDO(mtopResponse, this.mtopBusiness.clazz);
            long currentTimeMillis3 = System.currentTimeMillis();
            this.mtopBusiness.onBgFinishTime = currentTimeMillis3;
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            if (mtopStat != null) {
                rbStatisticData = mtopStat.getRbStatData();
                rbStatisticData.jsonParseTime = currentTimeMillis3 - currentTimeMillis2;
                rbStatisticData.jsonTime = rbStatisticData.jsonParseTime;
                rbStatisticData.isCache = 1;
                rbStatisticData.mtopReqTime = currentTimeMillis - this.mtopBusiness.sendStartTime;
                rbStatisticData.rbReqTime = this.mtopBusiness.onBgFinishTime - this.mtopBusiness.reqStartTime;
                rbStatisticData.totalTime = rbStatisticData.rbReqTime;
            }
            HandlerParam a2 = com.taobao.tao.remotebusiness.handler.a.a(this.listener, mtopCacheEvent, this.mtopBusiness);
            a2.pojo = mtopResponseToOutputDO;
            a2.mtopResponse = mtopResponse;
            this.mtopBusiness.isCached = true;
            if (this.mtopBusiness.mtopProp.handler != null) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, seqNo, "onReceive: ON_CACHED in self-defined handler.");
                }
                if (mtopStat != null) {
                    if (rbStatisticData != null && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                        TBSdkLog.d(TAG, seqNo, rbStatisticData.toString());
                    }
                    mtopStat.commitStatData(true);
                }
                try {
                    if (a2.listener instanceof IRemoteCacheListener) {
                        TBSdkLog.i(TAG, seqNo, "listener onCached callback");
                        ((IRemoteCacheListener) a2.listener).onCached(mtopCacheEvent, a2.pojo, obj);
                        return;
                    }
                    TBSdkLog.i(TAG, seqNo, "listener onCached transfer to onSuccess callback");
                    ((IRemoteListener) a2.listener).onSuccess(a2.mtopBusiness.getRequestType(), a2.mtopResponse, a2.pojo, obj);
                    return;
                } catch (Throwable th) {
                    TBSdkLog.e(TAG, seqNo, "listener onCached callback error in self-defined handler.", th);
                    return;
                }
            }
            com.taobao.tao.remotebusiness.handler.a.a().obtainMessage(4, a2).sendToTarget();
        }
    }
}
