package com.taobao.tao.remotebusiness.listener;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;
import tb.kge;

/* loaded from: classes.dex */
public class MtopFinishListenerImpl extends b implements MtopCallback.MtopFinishListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.MtopFinishListenerImpl";

    static {
        kge.a(-1654378911);
        kge.a(-1507658996);
    }

    public static /* synthetic */ Object ipc$super(MtopFinishListenerImpl mtopFinishListenerImpl, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MtopFinishListenerImpl(MtopBusiness mtopBusiness, MtopListener mtopListener) {
        super(mtopBusiness, mtopListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFinished(mtopsdk.mtop.common.MtopFinishEvent r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.remotebusiness.listener.MtopFinishListenerImpl.onFinished(mtopsdk.mtop.common.MtopFinishEvent, java.lang.Object):void");
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
}
