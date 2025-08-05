package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class ltm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<ltp> f30918a = new ArrayList();

    static {
        kge.a(1084008533);
    }

    public ltm(ljs ljsVar) {
        a(ljsVar);
    }

    public JSONObject a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee76f892", new Object[]{this, awesomeGetContainerData, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        for (ltp ltpVar : this.f30918a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            JSONObject a2 = ltpVar.a(awesomeGetContainerData, jSONObject);
            ldf.d("BizParamsGenerator", ltpVar.getClass().getSimpleName() + ", createBizParams 耗时: " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
            if (a2 != null && !a2.isEmpty()) {
                jSONObject2.putAll(a2);
            }
        }
        return jSONObject2;
    }

    private void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        this.f30918a.add(new ltq(ljsVar));
        this.f30918a.add(new lty(ljsVar));
        this.f30918a.add(new lts(ljsVar));
        this.f30918a.add(new ltu(ljsVar));
        this.f30918a.add(new ltr(ljsVar));
        this.f30918a.add(new ltx(ljsVar));
        this.f30918a.add(new ltv(ljsVar));
        this.f30918a.add(new ltz(ljsVar));
        this.f30918a.add(new ltw(ljsVar));
        this.f30918a.add(new ltt(ljsVar));
    }
}
