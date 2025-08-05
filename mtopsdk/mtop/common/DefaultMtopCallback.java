package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import tb.kge;

/* loaded from: classes9.dex */
public class DefaultMtopCallback implements MtopCallback.MtopFinishListener, MtopCallback.MtopHeaderListener, MtopCallback.MtopProgressListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.DefaultMtopCallback";

    static {
        kge.a(-1291675436);
        kge.a(-520726170);
        kge.a(-1507658996);
        kge.a(-771903738);
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
    public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
        } else if (mtopFinishEvent == null || mtopFinishEvent.getMtopResponse() == null || !TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
        } else {
            String str = mtopFinishEvent.seqNo;
            TBSdkLog.d(TAG, str, "[onFinished]" + mtopFinishEvent.getMtopResponse().toString());
        }
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopProgressListener
    public void onDataReceived(MtopProgressEvent mtopProgressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea8f321", new Object[]{this, mtopProgressEvent, obj});
        } else if (mtopProgressEvent == null || !TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
        } else {
            String str = mtopProgressEvent.seqNo;
            TBSdkLog.d(TAG, str, "[onDataReceived]" + mtopProgressEvent.toString());
        }
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopHeaderListener
    public void onHeader(MtopHeaderEvent mtopHeaderEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d28e9f", new Object[]{this, mtopHeaderEvent, obj});
        } else if (mtopHeaderEvent == null || !TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
        } else {
            String str = mtopHeaderEvent.seqNo;
            TBSdkLog.d(TAG, str, "[onHeader]" + mtopHeaderEvent.toString());
        }
    }
}
