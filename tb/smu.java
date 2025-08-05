package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.layer.h5.data.H5InteractLayerRequestParams;
import com.taobao.tab2interact.core.utils.c;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public final class smu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final b f33721a;

    /* loaded from: classes8.dex */
    public interface b {
        void a(long j);

        void a(JSONObject jSONObject, long j);
    }

    static {
        kge.a(1575612620);
        Companion = new a(null);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(1510755604);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public smu(b dataCallback) {
        q.d(dataCallback, "dataCallback");
        this.f33721a = dataCallback;
    }

    public static final /* synthetic */ void a(smu smuVar, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("866104cc", new Object[]{smuVar, new Long(j), mtopResponse});
        } else {
            smuVar.a(j, mtopResponse);
        }
    }

    public static final /* synthetic */ void b(smu smuVar, long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02ba6ab", new Object[]{smuVar, new Long(j), mtopResponse});
        } else {
            smuVar.b(j, mtopResponse);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        H5InteractLayerRequestParams h5InteractLayerRequestParams = new H5InteractLayerRequestParams();
        JSONObject requestBody = skq.i();
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayerDataRequester", "请求数据，requestBody=" + requestBody);
        q.b(requestBody, "requestBody");
        h5InteractLayerRequestParams.a(requestBody);
        com.taobao.tab2interact.core.utils.c.INSTANCE.a(h5InteractLayerRequestParams, new c(elapsedRealtime));
    }

    /* loaded from: classes8.dex */
    public static final class c implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;

        public c(long j) {
            this.b = j;
        }

        @Override // com.taobao.tab2interact.core.utils.c.a
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            } else {
                smu.a(smu.this, this.b, mtopResponse);
            }
        }

        @Override // com.taobao.tab2interact.core.utils.c.a
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
            } else {
                smu.b(smu.this, this.b, mtopResponse);
            }
        }
    }

    private final void a(long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6bd3c21", new Object[]{this, new Long(j), mtopResponse});
            return;
        }
        try {
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                q.b(bytedata, "response.bytedata");
                String str = new String(bytedata, d.UTF_8);
                com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayerDataRequester", "数据请求成功，response不为空，result=" + str);
                com.taobao.tab2interact.core.utils.b.a("H5RequestData", null);
                Object obj = JSON.parseObject(str).get("data");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                a(j, (JSONObject) obj);
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayerDataRequester", "数据请求成功，response为空");
            com.taobao.tab2interact.core.utils.b.a("H5RequestData", "ResponseNull", "response为空", null);
            a(j);
        } catch (Exception e) {
            Exception exc = e;
            com.taobao.tab2interact.core.utils.a.a(this, "H5InteractLayerDataRequester", "数据请求成功，处理返回结果异常", exc);
            com.taobao.tab2interact.core.utils.b.a("H5RequestData", "HandleSuccessException", "处理成功数据异常", null, exc);
            a(j);
        }
    }

    private final void b(long j, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ddb2d00", new Object[]{this, new Long(j), mtopResponse});
            return;
        }
        try {
            if (mtopResponse != null) {
                byte[] bytedata = mtopResponse.getBytedata();
                q.b(bytedata, "response.bytedata");
                String str = new String(bytedata, d.UTF_8);
                com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayerDataRequester", "数据请求失败，response不为空，result=" + str);
                com.taobao.tab2interact.core.utils.b.a("H5RequestData", "RequestError", "数据请求失败", "result=" + str);
                a(j);
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayerDataRequester", "数据请求失败，response为空");
            com.taobao.tab2interact.core.utils.b.a("H5RequestData", "ResponseNull", "response为空", null);
            a(j);
        } catch (Exception e) {
            Exception exc = e;
            com.taobao.tab2interact.core.utils.a.a(this, "H5InteractLayerDataRequester", "数据请求失败，处理返回结果异常", exc);
            com.taobao.tab2interact.core.utils.b.a("H5RequestData", "HandleErrorException", "处理失败数据异常", null, exc);
            a(j);
        }
    }

    private final void a(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c5ff14", new Object[]{this, new Long(j), jSONObject});
        } else {
            this.f33721a.a(jSONObject, SystemClock.elapsedRealtime() - j);
        }
    }

    private final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f33721a.a(SystemClock.elapsedRealtime() - j);
        }
    }
}
