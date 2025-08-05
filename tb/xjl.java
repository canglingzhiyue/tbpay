package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.information.ai.api.IInformationFlowAiApi;
import java.util.Map;
import tb.mto;
import tb.xjk;

/* loaded from: classes5.dex */
public class xjl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34335a;
    private final xjk b;
    private IInformationFlowAiApi c;
    private xjk.a d;
    private final xjk.a e;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final xjl f34337a;

        static {
            kge.a(1685579694);
            f34337a = new xjl();
        }

        public static /* synthetic */ xjl a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (xjl) ipChange.ipc$dispatch("f0ccca4", new Object[0]) : f34337a;
        }
    }

    static {
        kge.a(1492078480);
    }

    public static /* synthetic */ IInformationFlowAiApi a(xjl xjlVar, IInformationFlowAiApi iInformationFlowAiApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInformationFlowAiApi) ipChange.ipc$dispatch("95bf8b1e", new Object[]{xjlVar, iInformationFlowAiApi});
        }
        xjlVar.c = iInformationFlowAiApi;
        return iInformationFlowAiApi;
    }

    public static /* synthetic */ xjk.a a(xjl xjlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xjk.a) ipChange.ipc$dispatch("bd8bb932", new Object[]{xjlVar}) : xjlVar.d;
    }

    public static /* synthetic */ void a(xjl xjlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246d3b28", new Object[]{xjlVar, str});
        } else {
            xjlVar.a(str);
        }
    }

    public static /* synthetic */ void b(xjl xjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e5535f", new Object[]{xjlVar});
        } else {
            xjlVar.b();
        }
    }

    public static xjl a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xjl) ipChange.ipc$dispatch("f0ccca4", new Object[0]) : a.a();
    }

    private xjl() {
        this.f34335a = "infromationai_remote_bundle";
        this.e = new xjk.a() { // from class: tb.xjl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.xjk.a
            public void a(IInformationFlowAiApi iInformationFlowAiApi) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1c55301e", new Object[]{this, iInformationFlowAiApi});
                    return;
                }
                ldf.d("InfromationAI", "远程化加载成功");
                xjl.a(xjl.this, iInformationFlowAiApi);
                if (xjl.a(xjl.this) == null) {
                    return;
                }
                xjl.a(xjl.this).a(iInformationFlowAiApi);
            }

            @Override // tb.xjk.a
            public void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                ldf.d("InfromationAI", "远程化加载失败，errorMsg ： " + str);
                xjl.b(xjl.this);
                xjl.a(xjl.this, str);
                if (xjl.a(xjl.this) == null) {
                    return;
                }
                xjl.a(xjl.this).a(str);
            }
        };
        this.b = new xjk(this.e);
    }

    public void a(xjk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b522ace2", new Object[]{this, aVar});
            return;
        }
        ldf.d("InfromationAI", "create ");
        this.d = aVar;
        this.b.a();
    }

    public JSONObject a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b06da9", new Object[]{this, str, str2, map});
        }
        IInformationFlowAiApi iInformationFlowAiApi = this.c;
        if (iInformationFlowAiApi == null) {
            return null;
        }
        return iInformationFlowAiApi.createAiRefreshRequestParams(str, str2, map);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            AppMonitor.register("InfromationAI", "infromationai_remote_bundle", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            AppMonitor.Stat.commit("InfromationAI", "infromationai_remote_bundle", DimensionValueSet.create().setValue("stat", "loading").setValue("success", "false").setValue("errorCode", "-1").setValue("errorMsg", str), MeasureValueSet.create().setValue("cost", mto.a.GEO_NOT_SUPPORT));
        }
    }
}
