package com.taobao.infoflow.taobao.subservice.biz.aiservice.impl;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;
import com.taobao.android.information.ai.api.IInformationFlowAiApi;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.ldc;
import tb.ldf;
import tb.ljs;
import tb.lli;
import tb.xjk;
import tb.xjl;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IInformationFlowAiApi f17441a;
    private IContainerDataService<?> b;
    private IContainerDataService.a c;
    private IContainerDataService.c d;
    private IAiService.a e;
    private ljs f;
    private xjk.a g = new xjk.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.xjk.a
        public void a(IInformationFlowAiApi iInformationFlowAiApi) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c55301e", new Object[]{this, iInformationFlowAiApi});
                return;
            }
            a.a(a.this, iInformationFlowAiApi);
            if (a.a(a.this) == null) {
                return;
            }
            a.a(a.this).create(a.b(a.this));
        }

        @Override // tb.xjk.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            ldf.d("AiProviderAdapter", "LoadFailure: " + str);
        }
    };

    static {
        kge.a(1979676478);
    }

    public static /* synthetic */ IInformationFlowAiApi a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IInformationFlowAiApi) ipChange.ipc$dispatch("695703c4", new Object[]{aVar}) : aVar.f17441a;
    }

    public static /* synthetic */ IInformationFlowAiApi a(a aVar, IInformationFlowAiApi iInformationFlowAiApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IInformationFlowAiApi) ipChange.ipc$dispatch("f35d84ee", new Object[]{aVar, iInformationFlowAiApi});
        }
        aVar.f17441a = iInformationFlowAiApi;
        return iInformationFlowAiApi;
    }

    public static /* synthetic */ void a(a aVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f334b7", new Object[]{aVar, map});
        } else {
            aVar.a(map);
        }
    }

    public static /* synthetic */ ljs b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("d8f46a82", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34309910", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public a(ljs ljsVar) {
        this.f = ljsVar;
        a(ljsVar);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            xjl.a().a(this.g);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IInformationFlowAiApi iInformationFlowAiApi = this.f17441a;
        if (iInformationFlowAiApi != null) {
            iInformationFlowAiApi.c();
        }
        b();
    }

    public void a(IAiService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d3b897", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    private void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        this.b = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (this.b == null) {
            return;
        }
        Boolean bool = (Boolean) m.a().a("homeNetLowOptimization", Boolean.class);
        if (bool != null && bool.booleanValue() && TextUtils.equals(ldc.a(), "l")) {
            return;
        }
        this.c = c();
        this.b.addDataProcessListener(this.c);
        this.d = d();
        this.b.addRequestBizParamsCreator(this.d);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IContainerDataService<?> iContainerDataService = this.b;
        if (iContainerDataService == null) {
            return;
        }
        IContainerDataService.a aVar = this.c;
        if (aVar != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
        IContainerDataService.c cVar = this.d;
        if (cVar == null) {
            return;
        }
        this.b.removeRequestBizParamsCreator(cVar);
    }

    private IContainerDataService.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.a) ipChange.ipc$dispatch("2b51aadf", new Object[]{this}) : new IContainerDataService.a() { // from class: com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
                } else if (lliVar != null && lliVar.b() != null && TextUtils.equals(lliVar.b().getString(i.CDN_REQUEST_TYPE), "coldStart")) {
                } else {
                    if (a.a(a.this) != null) {
                        a.a(a.this).a();
                    } else {
                        a.c(a.this);
                    }
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
                } else if (lliVar != null && lliVar.b() != null && TextUtils.equals(lliVar.b().getString(i.CDN_REQUEST_TYPE), "coldStart")) {
                } else {
                    if (a.a(a.this) != null) {
                        a.a(a.this).a(iContainerDataModel);
                    } else {
                        a.c(a.this);
                    }
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
            public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
                } else if ((lliVar != null && lliVar.b() != null && TextUtils.equals(lliVar.b().getString(i.CDN_REQUEST_TYPE), "coldStart")) || a.a(a.this) == null) {
                } else {
                    a.a(a.this).b();
                }
            }
        };
    }

    private IContainerDataService.c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("327a8d5e", new Object[]{this}) : new IContainerDataService.c() { // from class: com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                if (lliVar != null && lliVar.b() != null) {
                    lliVar.b().put(i.CDN_REQUEST_TYPE, (Object) str);
                }
                if (TextUtils.equals(str, "coldStart")) {
                    return null;
                }
                HashMap hashMap = new HashMap(8);
                if (a.a(a.this) != null) {
                    a.a(a.this).a(hashMap);
                } else {
                    a.c(a.this);
                }
                a.a(a.this, hashMap);
                return hashMap;
            }
        };
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        IAiService.a aVar = this.e;
        if (aVar == null) {
            ldf.d("AiProviderAdapter", "applyConfigToReqParams mAiConfig is null");
            return;
        }
        IAiService.IApiInfo b = aVar.b();
        if (b != null) {
            ldf.d("AiProviderAdapter", "使用自定义的 Api:" + b.getApi() + ", version:" + b.getVersion());
            map.put("apiName", b.getApi());
            map.put("apiVersion", b.getVersion());
        }
        String a2 = this.e.a();
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        ldf.d("AiProviderAdapter", "使用自定义的 moduleVersion:" + a2);
        map.put("guessModelVersion", a2);
    }
}
