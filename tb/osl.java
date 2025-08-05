package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.util.Map;
import tb.osz;

/* loaded from: classes8.dex */
public class osl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final osy f32360a;
    private osz.a b;
    private JSONObject c;

    static {
        kge.a(46481932);
    }

    public static /* synthetic */ JSONObject a(osl oslVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("339e7d40", new Object[]{oslVar, jSONObject});
        }
        oslVar.c = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ AwesomeGetContainerData a(osl oslVar, String str, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AwesomeGetContainerData) ipChange.ipc$dispatch("8acb812d", new Object[]{oslVar, str, awesomeGetData}) : oslVar.a(str, awesomeGetData);
    }

    public static /* synthetic */ boolean a(osl oslVar, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a46a6050", new Object[]{oslVar, awesomeGetContainerData})).booleanValue() : oslVar.a(awesomeGetContainerData);
    }

    public static /* synthetic */ JSONObject b(osl oslVar, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("90fea8ad", new Object[]{oslVar, awesomeGetContainerData}) : oslVar.b(awesomeGetContainerData);
    }

    public osl(osy osyVar) {
        this.f32360a = osyVar;
        b();
    }

    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject b = b(str);
        return b != null ? b : this.c;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            c();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f32360a == null) {
        } else {
            this.b = d();
            this.f32360a.a(this.b);
        }
    }

    private void c() {
        osz.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        osy osyVar = this.f32360a;
        if (osyVar == null || (aVar = this.b) == null) {
            return;
        }
        osyVar.b(aVar);
    }

    private osz.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osz.a) ipChange.ipc$dispatch("15ced948", new Object[]{this}) : new osz.a() { // from class: tb.osl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osz.a
            public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d40c4874", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
                }
            }

            @Override // tb.osz.a
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                }
            }

            @Override // tb.osz.a
            public void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("548d9f91", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
                    return;
                }
                AwesomeGetContainerData a2 = osl.a(osl.this, str, awesomeGetData);
                if (a2 == null) {
                    lap.a("buyAfterRecommend", "createRequestListener", "awesomeGetContainerData == null");
                } else if (!osl.a(osl.this, a2)) {
                    lap.a("buyAfterRecommend", "createRequestListener", "不是第一页");
                } else {
                    osl oslVar = osl.this;
                    osl.a(oslVar, osl.b(oslVar, a2));
                }
            }
        };
    }

    private boolean a(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e236be8", new Object[]{this, awesomeGetContainerData})).booleanValue() : awesomeGetContainerData.getPageNum() == 0;
    }

    private AwesomeGetContainerData a(String str, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("142916c5", new Object[]{this, str, awesomeGetData});
        }
        Map<String, AwesomeGetContainerData> containers = awesomeGetData.getContainers();
        if (containers == null || containers.isEmpty()) {
            lap.a("buyAfterRecommend", "parseColdEffectConfig", "containerDataMap == null");
            return null;
        }
        return containers.get(str);
    }

    private JSONObject b(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9012545", new Object[]{this, awesomeGetContainerData}) : a(awesomeGetContainerData.getExt());
    }

    private JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        ope f = d.f(str);
        if (f == null) {
            lap.a("buyAfterRecommend", "getColdEffectConfigFromGateway", "recmdDataSource == null");
            return null;
        }
        AwesomeGetContainerInnerData c = f.c(str);
        if (c == null) {
            lap.a("buyAfterRecommend", "getColdEffectConfigFromGateway", "awesomeGetContainerInnerData == null");
            return null;
        }
        AwesomeGetPageData mo1280getPageParams = c.mo1280getPageParams();
        if (mo1280getPageParams == null) {
            lap.a("buyAfterRecommend", "getColdEffectConfigFromGateway", "pageData == null");
            return null;
        } else if (mo1280getPageParams.getPageNum() != 0) {
            lap.a("buyAfterRecommend", "getColdEffectConfigFromGateway", "不是第一页");
            return null;
        } else {
            return a(c.getExt());
        }
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            lap.a("buyAfterRecommend", "getFirstScreenConfigFromExt", "ext == null");
            return null;
        }
        return jSONObject.getJSONObject("firstScreenEffectConfig");
    }
}
