package mtopsdk.mtop.stat;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.kge;

/* loaded from: classes9.dex */
public class PrefetchStatistics {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MTOP_PREFETCH = "mtopPrefetch";
    private static final String MTOP_STATS_MODULE = "mtopsdk";
    private static final String TAG = "mtopsdk.PrefetchStatistics";
    private static volatile AtomicBoolean isRegistered;
    private String seqNo = "";
    private IUploadStats uploadStats;

    static {
        kge.a(1248722539);
        isRegistered = new AtomicBoolean(false);
    }

    public PrefetchStatistics(IUploadStats iUploadStats) {
        this.uploadStats = iUploadStats;
    }

    public void doPrefetchCommit(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4007429", new Object[]{this, str, hashMap});
        } else if (hashMap == null) {
        } else {
            this.seqNo = hashMap.get(MtopPrefetch.IPrefetchCallback.DATA_SEQ);
            if (this.uploadStats == null) {
                TBSdkLog.e(TAG, this.seqNo, "[doPrefetchCommit]register MtopStats error, uploadStats=null");
                return;
            }
            if ("TYPE_HIT".equals(str)) {
                i = 1;
            } else if (!"TYPE_MISS".equals(str)) {
                if ("TYPE_EXPIRE".equals(str)) {
                    i = 3;
                } else if (MtopPrefetch.IPrefetchCallback.PrefetchCallbackType.TYPE_CLEAR.equals(str)) {
                    i = 4;
                } else {
                    i = "TYPE_MERGE".equals(str) ? 5 : 0;
                }
            }
            if (isRegistered.compareAndSet(false, true)) {
                registerPrefetchStats();
            }
            try {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("api", hashMap.get(MtopPrefetch.IPrefetchCallback.DATA_API));
                hashMap2.put("version", hashMap.get(MtopPrefetch.IPrefetchCallback.DATA_VERSION));
                hashMap2.put("key", hashMap.get("data_key"));
                HashMap hashMap3 = new HashMap();
                hashMap3.put("time", Double.valueOf(Double.parseDouble(hashMap.get(MtopPrefetch.IPrefetchCallback.DATA_COST_TIME))));
                hashMap3.put("type", Double.valueOf(i));
                this.uploadStats.onCommit("mtopsdk", MTOP_PREFETCH, hashMap2, hashMap3);
            } catch (Throwable th) {
                String str2 = this.seqNo;
                TBSdkLog.e(TAG, str2, "[doPrefetchCommit] commit mtopStats error ---" + th.toString());
            }
        }
    }

    private void registerPrefetchStats() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6a910c", new Object[]{this});
            return;
        }
        try {
            if (this.uploadStats == null) {
                TBSdkLog.e(TAG, this.seqNo, "[registerPrefetchStats]register MtopStats error, uploadStats=null");
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add("api");
            hashSet.add("version");
            hashSet.add("key");
            HashSet hashSet2 = new HashSet();
            hashSet2.add("time");
            hashSet2.add("type");
            if (this.uploadStats == null) {
                return;
            }
            this.uploadStats.onRegister("mtopsdk", MTOP_PREFETCH, hashSet, hashSet2, false);
        } catch (Throwable th) {
            String str = this.seqNo;
            TBSdkLog.e(TAG, str, "[registerPrefetchStats] register MtopStats error ---" + th.toString());
        }
    }
}
