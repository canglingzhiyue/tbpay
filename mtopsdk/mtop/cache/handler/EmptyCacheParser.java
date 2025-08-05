package mtopsdk.mtop.cache.handler;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.ResponseSource;
import tb.kge;

/* loaded from: classes9.dex */
public class EmptyCacheParser implements ICacheParser {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.EmptyCacheParser";

    static {
        kge.a(941679600);
        kge.a(868916564);
    }

    @Override // mtopsdk.mtop.cache.handler.ICacheParser
    public void parse(ResponseSource responseSource, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0249bc", new Object[]{this, responseSource, handler});
        } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
        } else {
            TBSdkLog.i(TAG, "[parse]EmptyCacheParser parse called");
        }
    }
}
