package tb;

import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import anetwork.channel.statist.StatisticData;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.net.NetError;
import com.taobao.android.searchbaseframe.net.RequestStats;
import com.taobao.android.searchbaseframe.net.ResultException;
import com.taobao.android.searchbaseframe.net.a;
import com.taobao.android.searchbaseframe.net.b;
import com.taobao.android.searchbaseframe.net.c;
import com.taobao.android.searchbaseframe.net.e;
import com.taobao.android.searchbaseframe.util.k;
import java.util.Map;

/* loaded from: classes6.dex */
public class itr implements c<a, e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final imn f29312a;

    static {
        kge.a(-749534359);
        kge.a(-804033230);
    }

    @Override // com.taobao.android.searchbaseframe.net.c
    public JSONObject a(JSONObject jSONObject) throws ResultException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject}) : jSONObject;
    }

    public itr(imn imnVar) {
        this.f29312a = imnVar;
    }

    @Override // com.taobao.android.searchbaseframe.net.c
    public e a(a aVar, iox ioxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("72d4944c", new Object[]{this, aVar, ioxVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        e eVar = new e();
        try {
            HttpNetwork httpNetwork = new HttpNetwork(imo.c());
            RequestImpl requestImpl = new RequestImpl((String) aVar.b);
            if (ioxVar != null) {
                ioxVar.a(requestImpl);
            }
            if (this.f29312a.a().d() != -1) {
                requestImpl.setBizId(this.f29312a.a().d());
            }
            requestImpl.setConnectTimeout(this.f29312a.c().k().b);
            requestImpl.setReadTimeout(this.f29312a.c().k().c);
            requestImpl.setRetryTime(0);
            if (StringUtils.equals(aVar.f14989a, "POST")) {
                requestImpl.setMethod("POST");
                requestImpl.setParams(b.a((Map) aVar.c));
            }
            Response syncSend = httpNetwork.syncSend(requestImpl, null);
            eVar.a(a(syncSend));
            eVar.a(syncSend.getConnHeadFields());
            int statusCode = syncSend.getStatusCode();
            if (statusCode <= 0) {
                eVar.a(new NetError(6, "" + statusCode + " : " + syncSend.getDesc()));
            } else {
                eVar.a(syncSend.getBytedata());
            }
        } catch (Exception e) {
            eVar.a(new NetError(0, "request exception", e));
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            k b = this.f29312a.b();
            b.f("HttpNetAdapter", "http request <" + ((String) aVar.b) + "> time:" + (currentTimeMillis2 - currentTimeMillis));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return eVar;
    }

    @Override // com.taobao.android.searchbaseframe.net.c
    public e a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("929525aa", new Object[]{this, aVar}) : a(aVar, (iox) null);
    }

    private RequestStats a(Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestStats) ipChange.ipc$dispatch("78c8fc4b", new Object[]{this, response});
        }
        RequestStats requestStats = new RequestStats();
        if (response.getStatisticData() != null) {
            StatisticData statisticData = response.getStatisticData();
            requestStats.oneWayTime = statisticData.oneWayTime_ANet;
            requestStats.serverRt = statisticData.serverRT;
            requestStats.recvDataSize = statisticData.totalSize;
            requestStats.recvDataTime = statisticData.recDataTime;
            requestStats.retryTimes = statisticData.retryTime;
            requestStats.sendDataSize = statisticData.sendSize;
        }
        return requestStats;
    }
}
