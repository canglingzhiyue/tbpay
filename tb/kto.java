package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes7.dex */
public class kto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final kto f30306a;
    private volatile long b = Long.MAX_VALUE;
    private volatile long c = 0;

    static {
        kge.a(306473316);
        f30306a = new kto();
    }

    private kto() {
    }

    public static kto a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kto) ipChange.ipc$dispatch("f0709b8", new Object[0]) : f30306a;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c;
    }

    public void a(MtopResponse mtopResponse, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8fcf6d", new Object[]{this, mtopResponse, new Long(j), new Long(j2)});
        } else if (mtopResponse == null || mtopResponse.isApiSuccess()) {
        } else {
            try {
                long j3 = mtopResponse.getDataJsonObject().getLong("highwayTime");
                long j4 = j / 2;
                if (j4 < 0) {
                    Log.e("ServerTimeHandler", "response error" + mtopResponse.getMtopStat().toString());
                }
                synchronized (this) {
                    if (this.b > j4) {
                        this.c = (j3 + j4) - j2;
                        this.b = j4;
                    }
                }
            } catch (Exception e) {
                Log.e("ServerTimeHandler", "updateServerTimeDiff error: " + e.getMessage());
            }
        }
    }
}
