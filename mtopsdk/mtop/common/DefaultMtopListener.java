package mtopsdk.mtop.common;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopCallback;
import tb.kge;

/* loaded from: classes9.dex */
public class DefaultMtopListener extends DefaultMtopCallback implements MtopCallback.MtopCacheListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.DefaultMtopListener";

    static {
        kge.a(226704707);
        kge.a(-429814511);
    }

    @Override // mtopsdk.mtop.common.MtopCallback.MtopCacheListener
    public void onCached(MtopCacheEvent mtopCacheEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0c28d9", new Object[]{this, mtopCacheEvent, obj});
        } else if (mtopCacheEvent == null || mtopCacheEvent.getMtopResponse() == null || !TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
        } else {
            String str = mtopCacheEvent.seqNo;
            TBSdkLog.d(TAG, str, "[onCached]" + mtopCacheEvent.getMtopResponse().toString());
        }
    }
}
