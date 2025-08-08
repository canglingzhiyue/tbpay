package tb;

import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class lel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String c;

    /* renamed from: a  reason: collision with root package name */
    private lli f30525a;
    private final IContainerDataService<?> b;

    public static /* synthetic */ String a(lel lelVar, IContainerDataService iContainerDataService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c115e163", new Object[]{lelVar, iContainerDataService}) : lelVar.a(iContainerDataService);
    }

    public static /* synthetic */ lli a(lel lelVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lli) ipChange.ipc$dispatch("73e3a538", new Object[]{lelVar}) : lelVar.f30525a;
    }

    public static /* synthetic */ void a(lel lelVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1628a6f", new Object[]{lelVar, str});
        } else {
            lelVar.a(str);
        }
    }

    public static /* synthetic */ IContainerDataService b(lel lelVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService) ipChange.ipc$dispatch("f94f9338", new Object[]{lelVar}) : lelVar.b;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : c;
    }

    static {
        kge.a(-696551161);
        c = b.a(R.string.taobao_app_1000_1_16710);
    }

    public lel(ljs ljsVar) {
        this.b = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (this.b == null) {
            return;
        }
        this.f30525a = new lek();
        this.b.addRequestListener(a());
        this.b.addDataProcessListener(b());
    }

    public void a(ljs ljsVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3a83d7", new Object[]{this, ljsVar, jSONObject, str});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("NewInterActiveUtil", "containerDataService is null");
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            ldf.d("NewInterActiveUtil", "jsonContent is null");
            return;
        }
        String string = jSONObject2.getString("upBizParam");
        if (StringUtils.isEmpty(string)) {
            ldf.d("NewInterActiveUtil", "upBizParam is empty");
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("sectionBizCode", (Object) str);
        jSONObject4.put("upBizParam", (Object) string);
        jSONObject3.put("bizParam", (Object) jSONObject4);
        iContainerDataService.triggerEvent("NewInteractive", jSONObject3, this.f30525a);
    }

    private IContainerDataService.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.b) ipChange.ipc$dispatch("1cffe67c", new Object[]{this}) : new IContainerDataService.b() { // from class: tb.lel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d905f556", new Object[]{this, lliVar, iContainerDataModel, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("552c8b59", new Object[]{this, lliVar, str});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.b
            public void a(lli lliVar, String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("74bec7ed", new Object[]{this, lliVar, str, str2, str3});
                } else if (!lel.a(lel.this).equals(lliVar)) {
                } else {
                    ljd.a().b(new Runnable() { // from class: tb.lel.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                lel.a(lel.this, lel.c());
                            }
                        }
                    });
                }
            }
        };
    }

    private IContainerDataService.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("2428c89e", new Object[]{this}) : new IContainerDataService.a() { // from class: tb.lel.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else if (!lel.a(lel.this).equals(lliVar)) {
                } else {
                    lel lelVar = lel.this;
                    final String a2 = lel.a(lelVar, lel.b(lelVar));
                    if (StringUtils.isEmpty(a2)) {
                        return;
                    }
                    ljd.a().b(new Runnable() { // from class: tb.lel.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                lel.a(lel.this, a2);
                            }
                        }
                    });
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private String a(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df919826", new Object[]{this, iContainerDataService});
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            ldf.d("NewInterActiveUtil", "containerDataModel is null");
            return null;
        }
        IContainerInnerDataModel delta = containerData.getDelta();
        if (delta == null) {
            ldf.d("NewInterActiveUtil", "delta is null");
            return null;
        }
        JSONObject ext = delta.getExt();
        if (ext == null) {
            ldf.d("NewInterActiveUtil", "ext is null");
            return null;
        }
        String string = ext.getString("insertCardToast");
        if (StringUtils.isEmpty(string)) {
            ldf.d("NewInterActiveUtil", "insertCardToast error toast 未下发");
        }
        return string;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            Toast.makeText(lcz.a(), str, 0).show();
        }
    }
}
