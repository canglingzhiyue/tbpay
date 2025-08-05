package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import com.taobao.homepage.messiah.mtop.StabilityDataUploadClient;
import com.taobao.homepage.messiah.mtop.StabilityDataUploadMtopParams;
import com.taobao.homepage.messiah.mtop.StabilityDataUploadResult;
import com.taobao.tao.homepage.d;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes7.dex */
public class kyl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-561808182);
    }

    public static /* synthetic */ a a(kyl kylVar, kys kysVar, kym kymVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("23e08c3", new Object[]{kylVar, kysVar, kymVar}) : kylVar.a(kysVar, kymVar);
    }

    public static /* synthetic */ StabilityDataUploadMtopParams.a a(kyl kylVar, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StabilityDataUploadMtopParams.a) ipChange.ipc$dispatch("a92a3ffd", new Object[]{kylVar, list}) : kylVar.a(list);
    }

    public void a(kys kysVar, List<TbHRLogModel> list, kym kymVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eca9c35", new Object[]{this, kysVar, list, kymVar});
            return;
        }
        try {
            b(kysVar, list, kymVar);
        } catch (Exception e) {
            ldf.d("Uploader", "uploadData occur Exception" + e);
        }
    }

    private void b(final kys kysVar, final List<TbHRLogModel> list, final kym kymVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62726fb6", new Object[]{this, kysVar, list, kymVar});
        } else {
            ljd.a().a(new Runnable() { // from class: tb.kyl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    new StabilityDataUploadClient().execute(kyl.a(kyl.this, list).a(), kyl.a(kyl.this, kysVar, kymVar), null);
                }
            });
        }
    }

    private a<StabilityDataUploadResult> a(final kys kysVar, final kym kymVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6868c351", new Object[]{this, kysVar, kymVar}) : new a<StabilityDataUploadResult>() { // from class: tb.kyl.2
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
                    a((StabilityDataUploadResult) obj);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                    return;
                }
                kymVar.a(kysVar);
                ldf.d("Uploader", "数据系统上报失败");
            }

            public void a(StabilityDataUploadResult stabilityDataUploadResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4308788", new Object[]{this, stabilityDataUploadResult});
                } else {
                    kymVar.b(kysVar);
                }
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                    return;
                }
                kymVar.a(kysVar);
                ldf.d("Uploader", "数据上报失败");
            }
        };
    }

    private StabilityDataUploadMtopParams.a a(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StabilityDataUploadMtopParams.a) ipChange.ipc$dispatch("c0462eaf", new Object[]{this, list});
        }
        StabilityDataUploadMtopParams.a aVar = new StabilityDataUploadMtopParams.a();
        HashMap hashMap = new HashMap();
        hashMap.put("hsrRequestResource", "homePageClient");
        String str = "";
        try {
            str = JSON.toJSONString(list, SerializerFeature.DisableCircularReferenceDetect);
            ldf.d("Uploader", "构建参数" + str);
        } catch (Exception e) {
            ldf.d("Uploader", "constructUploadMtopParamsBuilder occur Exception: " + e);
        }
        hashMap.put("tbHRLog", str);
        aVar.b(JSON.toJSONString(hashMap)).a(a());
        return aVar;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        JSONObject c = d.a().c();
        if (c == null) {
            ldf.d("Uploader", "getAppId, ext == null");
            return "9522";
        } else if (!c.containsKey("channelHandleAppID")) {
            ldf.d("Uploader", "getAppId, channelHandleAppID not exist");
            return "9522";
        } else {
            return c.getString("channelHandleAppID");
        }
    }
}
