package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.RequestStats;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.ResultException;
import com.taobao.android.searchbaseframe.net.c;
import com.taobao.android.searchbaseframe.net.e;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.network.domain.NetworkStats;

/* loaded from: classes6.dex */
public class its implements c<itt, e> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUCCESS_STATUS = "SUCCESS";
    public static final String TRAFFIC_LIMIT_LOCKED_STATUS = "ANDROID_SYS_API_FLOW_LIMIT_LOCKED";
    public static final String TRAFFIC_LIMIT_STATUS = "FAIL_SYS_TRAFFIC_LIMIT";
    public static volatile boolean b;
    public static volatile boolean d;

    /* renamed from: a  reason: collision with root package name */
    private final imn f29313a;

    static {
        kge.a(372226217);
        kge.a(-804033230);
        d = false;
        b = false;
    }

    public its(imn imnVar) {
        this.f29313a = imnVar;
    }

    public static JSONObject b(JSONObject jSONObject) throws ResultException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            throw new ResultException(new ResultError(3, "no data object in mtop"));
        }
        return jSONObject2;
    }

    @Override // com.taobao.android.searchbaseframe.net.c
    public JSONObject a(JSONObject jSONObject) throws ResultException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject}) : b(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fa  */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v5 */
    @Override // com.taobao.android.searchbaseframe.net.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.searchbaseframe.net.e a(tb.itt r23, tb.iox r24) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.its.a(tb.itt, tb.iox):com.taobao.android.searchbaseframe.net.e");
    }

    @Override // com.taobao.android.searchbaseframe.net.c
    public e a(itt ittVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("5dce56b1", new Object[]{this, ittVar}) : a(ittVar, (iox) null);
    }

    private RequestStats a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestStats) ipChange.ipc$dispatch("bac03b4e", new Object[]{this, mtopResponse});
        }
        RequestStats requestStats = new RequestStats();
        if (mtopResponse.getMtopStat() != null && mtopResponse.getMtopStat().netStats != null) {
            NetworkStats networkStats = mtopResponse.getMtopStat().netStats;
            requestStats.oneWayTime = networkStats.oneWayTime_ANet;
            requestStats.serverRt = networkStats.serverRT;
            requestStats.recvDataSize = networkStats.recvSize;
            requestStats.recvDataTime = networkStats.recDataTime;
            requestStats.retryTimes = networkStats.retryTimes;
            requestStats.sendDataSize = networkStats.sendSize;
        }
        return requestStats;
    }
}
