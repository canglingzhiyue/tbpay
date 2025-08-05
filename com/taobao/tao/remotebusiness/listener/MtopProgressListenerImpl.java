package com.taobao.tao.remotebusiness.listener;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteProcessListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopHeaderEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.common.MtopProgressEvent;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopProgressListenerImpl extends b implements MtopCallback.MtopHeaderListener, MtopCallback.MtopProgressListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopProgressListenerImpl";

    static {
        kge.a(-1434294661);
        kge.a(-520726170);
        kge.a(-771903738);
    }

    public MtopProgressListenerImpl(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        super(mtopBusiness, mtopListener);
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopProgressListener
    public void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea8f321", new Object[]{this, mtopProgressEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onDataReceived event received.");
        }
        if (this.mtopBusiness.isTaskCanceled()) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, seqNo, "The request of MtopBusiness is cancelled.");
        } else if (!(this.listener instanceof IRemoteProcessListener)) {
        } else {
            if (this.mtopBusiness.mtopProp.handler != null) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, seqNo, "onReceive: ON_DATA_RECEIVED in self-defined handler.");
                }
                try {
                    ((IRemoteProcessListener) this.listener).onDataReceived(mtopProgressEvent, obj);
                    return;
                } catch (Throwable th) {
                    TBSdkLog.e(TAG, seqNo, "listener onDataReceived callback error in self-defined handler.", th);
                    return;
                }
            }
            com.taobao.tao.remotebusiness.handler.a.a().obtainMessage(1, com.taobao.tao.remotebusiness.handler.a.a(this.listener, mtopProgressEvent, this.mtopBusiness)).sendToTarget();
        }
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopHeaderListener
    public void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d28e9f", new Object[]{this, mtopHeaderEvent, obj});
            return;
        }
        String seqNo = this.mtopBusiness.getSeqNo();
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, seqNo, "Mtop onHeader event received.");
        }
        if (this.mtopBusiness.isTaskCanceled()) {
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i(TAG, seqNo, "The request of MtopBusiness is cancelled.");
        } else if (!(this.listener instanceof IRemoteProcessListener)) {
        } else {
            if (this.mtopBusiness.mtopProp.handler != null) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i(TAG, seqNo, "onReceive: ON_HEADER in self-defined handler.");
                }
                try {
                    ((IRemoteProcessListener) this.listener).onHeader(mtopHeaderEvent, obj);
                    return;
                } catch (Throwable th) {
                    TBSdkLog.e(TAG, seqNo, "listener onHeader callback error in self-defined handler.", th);
                    return;
                }
            }
            com.taobao.tao.remotebusiness.handler.a.a().obtainMessage(2, com.taobao.tao.remotebusiness.handler.a.a(this.listener, mtopHeaderEvent, this.mtopBusiness)).sendToTarget();
        }
    }
}
