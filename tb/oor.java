package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.home.component.utils.e;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.login4android.api.Login;
import com.taobao.realtimerecommend.j;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.remote.RecommendEdgeClient;
import com.taobao.tao.recommend3.remote.RecommendEdgeParams;
import com.taobao.tao.recommend3.remote.RecommendEdgeResult;
import com.taobao.tao.recommend3.util.c;
import com.taobao.tao.util.TaoHelper;
import com.taobao.themis.kernel.i;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public class oor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EdgeComputeDataManager";

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final oor f32231a = new oor();

        public static /* synthetic */ oor a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (oor) ipChange.ipc$dispatch("f08c8cc", new Object[0]) : f32231a;
        }
    }

    static {
        kge.a(-596702301);
    }

    public static /* synthetic */ Map a(oor oorVar, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("519af9ce", new Object[]{oorVar, awesomeGetData}) : oorVar.b(awesomeGetData);
    }

    public static /* synthetic */ Map a(oor oorVar, RecommendEdgeResult recommendEdgeResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5576d2c5", new Object[]{oorVar, recommendEdgeResult}) : oorVar.a(recommendEdgeResult);
    }

    public static /* synthetic */ void a(oor oorVar, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356b35e6", new Object[]{oorVar, map, map2});
        } else {
            oorVar.a(map, map2);
        }
    }

    public static /* synthetic */ void a(oor oorVar, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975af5", new Object[]{oorVar, map, new Boolean(z)});
        } else {
            oorVar.a(map, z);
        }
    }

    public static oor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oor) ipChange.ipc$dispatch("f08c8cc", new Object[0]) : a.a();
    }

    public void a(AwesomeGetData awesomeGetData) {
        Map<String, AwesomeGetContainerData> map;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6637", new Object[]{this, awesomeGetData});
        } else if (awesomeGetData != null && (map = awesomeGetData.containers) != null) {
            for (String str : map.keySet()) {
                AwesomeGetContainerData awesomeGetContainerData = map.get(str);
                if (awesomeGetContainerData != null && (a2 = a(awesomeGetContainerData)) != null) {
                    a(a2, awesomeGetData);
                    if (jqm.a()) {
                        e.e(TAG, "edge request info is not null, start request edge data. requestInfo = " + a2);
                    }
                }
            }
        }
    }

    private void a(String str, final AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5217cfad", new Object[]{this, str, awesomeGetData});
            return;
        }
        PositionInfo b = l.b(Globals.getApplication());
        RecommendEdgeClient recommendEdgeClient = new RecommendEdgeClient();
        String str2 = "";
        RecommendEdgeParams.a f = new RecommendEdgeParams.a().a(str).b(Login.getNick()).i(Login.getOldUserId()).d(Login.getOldEncryptedUserId() == null ? str2 : Login.getOldEncryptedUserId()).c(UTDevice.getUtdid(g.a())).f(c.b());
        if (b != null) {
            str2 = b.countryCode;
        }
        recommendEdgeClient.execute(f.e(str2).h("afterRecommend").g("recommend_home_main_edge").a(), new com.taobao.android.trade.boost.request.mtop.a<RecommendEdgeResult>() { // from class: tb.oor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onSuccess(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                } else {
                    a((RecommendEdgeResult) obj);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                    return;
                }
                try {
                    ksr.a(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), i.CDN_REQUEST_TYPE, "");
                } catch (Throwable unused) {
                }
            }

            public void a(RecommendEdgeResult recommendEdgeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("72db6c72", new Object[]{this, recommendEdgeResult});
                } else if (recommendEdgeResult == null || awesomeGetData == null) {
                } else {
                    Map a2 = oor.a(oor.this, recommendEdgeResult);
                    if (a2 == null) {
                        com.taobao.tao.linklog.a.b("intentProcess", "process_error", "edgeMap is null.", oor.TAG, "");
                        return;
                    }
                    if (jqm.a()) {
                        e.e(oor.TAG, "parse edge data complete.");
                    }
                    Map a3 = oor.a(oor.this, awesomeGetData);
                    if (a3 == null) {
                        com.taobao.tao.linklog.a.b("intentProcess", "process_error", "dataMap is null.", oor.TAG, "");
                        return;
                    }
                    if (jqm.a()) {
                        e.e(oor.TAG, "parse data map complete.");
                    }
                    oor.a(oor.this, a2, a3);
                    if (!jqm.a()) {
                        return;
                    }
                    e.e(oor.TAG, "merge data and edge map complete.");
                    oor.a(oor.this, a3, true);
                }
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                try {
                    ksr.a(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), i.CDN_REQUEST_TYPE, "");
                } catch (Throwable unused) {
                }
            }
        }, TaoHelper.getTTID());
    }

    private void a(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
        } else if (map != null && map2 != null) {
            for (String str : map.keySet()) {
                a(map.get(str), map2.get(str));
                if (jqm.a() && map2.get(str) == null) {
                    e.e(TAG, "error. no key = " + str + " match to data");
                    StringBuilder sb = new StringBuilder();
                    sb.append("no key is ");
                    sb.append(str);
                    com.taobao.tao.linklog.a.b("intentProcess", "process_error", sb.toString(), TAG, "");
                }
            }
        }
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject2 == null || (jSONObject3 = jSONObject2.getJSONObject("args")) == null) {
        } else {
            jSONObject3.put("utLogMapEdge", (Object) jSONObject);
        }
    }

    private Map<String, JSONObject> a(RecommendEdgeResult recommendEdgeResult) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e1d5cf27", new Object[]{this, recommendEdgeResult});
        }
        if (recommendEdgeResult == null || (jSONObject = recommendEdgeResult.containers) == null || (jSONObject2 = jSONObject.getJSONObject("recommend_home_main_edge")) == null) {
            return null;
        }
        HashMap hashMap = new HashMap(50);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("base");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("delta");
        if (jSONObject3 != null && jSONObject3.size() != 0 && jSONObject3.getJSONArray("sections") != null) {
            JSONArray jSONArray = jSONObject3.getJSONArray("sections");
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject c = c(jSONArray.getJSONObject(i));
                String a2 = a(jSONArray.getJSONObject(i));
                if (c != null) {
                    hashMap.put(a2, c);
                }
            }
        }
        if (jSONObject4 != null && jSONObject4.size() != 0 && jSONObject4.getJSONArray("sections") != null) {
            JSONArray jSONArray2 = jSONObject4.getJSONArray("sections");
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                JSONObject c2 = c(jSONArray2.getJSONObject(i2));
                String a3 = a(jSONArray2.getJSONObject(i2));
                if (c2 != null) {
                    hashMap.put(a3, c2);
                }
            }
        }
        return hashMap;
    }

    private Map<String, JSONObject> b(AwesomeGetData awesomeGetData) {
        Map<String, AwesomeGetContainerData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("17472a8b", new Object[]{this, awesomeGetData});
        }
        if (awesomeGetData == null || (map = awesomeGetData.containers) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            AwesomeGetContainerData awesomeGetContainerData = map.get(str);
            if (awesomeGetContainerData != null && awesomeGetContainerData.base != null && awesomeGetContainerData.base.sections != null) {
                for (SectionModel sectionModel : awesomeGetContainerData.base.sections) {
                    String b = b(sectionModel);
                    if (!StringUtils.isEmpty(b)) {
                        hashMap.put(b, sectionModel);
                    }
                }
            }
        }
        return hashMap;
    }

    private String a(AwesomeGetContainerData awesomeGetContainerData) {
        JSONObject a2;
        JSONObject a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0e74d3c", new Object[]{this, awesomeGetContainerData});
        }
        if (awesomeGetContainerData == null) {
            return null;
        }
        JSONObject ext = awesomeGetContainerData.getExt();
        if (ext != null && (a3 = j.a(ext)) != null && a3.getBooleanValue("isOpen")) {
            return a3.getString("requestInfo");
        }
        JSONObject deltaExt = awesomeGetContainerData.getDeltaExt();
        if (deltaExt != null && (a2 = j.a(deltaExt)) != null && a2.getBooleanValue("isOpen")) {
            return a2.getString("requestInfo");
        }
        return null;
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && jSONObject.getJSONObject("item") != null && jSONObject.getJSONObject("item").getJSONObject("0") != null && jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("content") != null) {
            return jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("content").getString("edgeComputeId");
        }
        return null;
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && jSONObject.getJSONObject("args") != null) {
            return jSONObject.getJSONObject("args").getString("edgeComputeId");
        }
        return null;
    }

    private JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && jSONObject.getJSONObject("item") != null && jSONObject.getJSONObject("item").getJSONObject("0") != null && jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("content") != null) {
            return jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("content").getJSONObject("utLogMapEdge");
        }
        return null;
    }

    private void a(Map<String, JSONObject> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
        } else if (jqm.a() && map != null) {
            for (String str : map.keySet()) {
                JSONObject jSONObject = map.get(str);
                if (z) {
                    e.e(TAG, "index is 0, key = " + str + ", data is " + jSONObject.getJSONObject("args"));
                } else {
                    e.e(TAG, "index is 0, key = " + str + ", data is " + jSONObject);
                }
            }
        }
    }
}
