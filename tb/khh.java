package tb;

import android.content.Context;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class khh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final alu f30071a;
    private final alq b = new alq();
    private final Map<String, String> c = new HashMap();
    private final alo d = new alo() { // from class: tb.khh.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.alo
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ldf.d("MegaPreloadFirstChunk", "preloadFirstChunk onCallback : " + JSON.toJSONString(executeResult));
        }
    };

    static {
        kge.a(-727881355);
    }

    public khh(Context context, String str) {
        alr alrVar = new alr(str, "homepage");
        alrVar.a(context);
        this.f30071a = new alu(alrVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ldf.d("MegaPreloadFirstChunk", "preloadFirstChunk : " + str);
        this.c.put("url", str);
        this.c.put("preloadFirstChunk", "true");
        try {
            this.f30071a.b("ssr", "preloadFirstChunk", this.b, this.c, this.d);
        } catch (InfoFlowRuntimeException e) {
            ldf.a("MegaPreloadFirstChunk", "preloadFirstChunk error:" + e.getMessage(), e);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f30071a.a();
        }
    }
}
