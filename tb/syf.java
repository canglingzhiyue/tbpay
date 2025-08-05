package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.a;
import java.util.Map;
import tb.osz;

/* loaded from: classes8.dex */
public class syf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final osy f33945a;
    private osz.a b = a();

    static {
        kge.a(-1308281706);
    }

    public static /* synthetic */ boolean a(syf syfVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a2b0be6", new Object[]{syfVar, str})).booleanValue() : syfVar.a(str);
    }

    public syf(ksk kskVar, osy osyVar) {
        this.f33945a = osyVar;
        this.f33945a.a(this.b);
    }

    private osz.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (osz.a) ipChange.ipc$dispatch("70357c6b", new Object[]{this}) : new osz.b() { // from class: tb.syf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osz.a
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                }
            }

            @Override // tb.osz.b
            public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, a aVar) {
                Map<String, AwesomeGetContainerParams> map;
                AwesomeGetContainerParams awesomeGetContainerParams;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1acb7ed", new Object[]{this, str, awesomeGetRequestParams, aVar});
                } else if (!syf.a(syf.this, str) || (map = awesomeGetRequestParams.containerParams) == null || (awesomeGetContainerParams = map.get(str)) == null) {
                } else {
                    map.put("recommend_multi_channel", awesomeGetContainerParams);
                    map.remove(str);
                }
            }

            @Override // tb.osz.a
            public void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
                Map<String, AwesomeGetContainerParams> map;
                AwesomeGetContainerParams awesomeGetContainerParams;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d40c4874", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
                } else if (!syf.a(syf.this, str) || (map = awesomeGetRequestParams.containerParams) == null || (awesomeGetContainerParams = map.get(str)) == null) {
                } else {
                    map.put("recommend_multi_channel", awesomeGetContainerParams);
                    map.remove(str);
                }
            }

            @Override // tb.osz.a
            public void a(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("548d9f91", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
                } else if (!syf.a(syf.this, str)) {
                } else {
                    Map<String, AwesomeGetContainerData> map = awesomeGetData.containers;
                    if (!map.containsKey("recommend_multi_channel")) {
                        return;
                    }
                    map.put(str, map.get("recommend_multi_channel"));
                    map.remove("recommend_multi_channel");
                }
            }
        };
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str.contains(syc.MULTI_NATIVE_INFOFLOW_CID_PREFIX);
    }
}
