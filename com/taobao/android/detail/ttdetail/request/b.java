package com.taobao.android.detail.ttdetail.request;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.a;
import com.taobao.android.detail.ttdetail.request.callback.CustomMtopRequestCallback;
import com.taobao.android.detail.ttdetail.request.callback.CustomMtopStreamRequestCallBack;
import com.taobao.android.detail.ttdetail.request.callback.MainRequestCallback;
import com.taobao.android.detail.ttdetail.request.callback.PrefetchRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.CustomApiRequestParams;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import com.taobao.android.detail.ttdetail.request.preload.g;
import com.taobao.android.detail.ttdetail.request.preload.h;
import com.taobao.android.detail.ttdetail.request.stream.MtopStreamRequestCallback;
import com.taobao.android.detail.ttdetail.utils.ak;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.aw;
import com.taobao.android.detail.ttdetail.utils.az;
import com.taobao.android.detail.ttdetail.utils.d;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.odg;
import tb.smp;
import tb.smx;
import tb.soa;
import tb.tae;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1300328849);
    }

    public static /* synthetic */ void a(b bVar, soa soaVar, a aVar, com.taobao.android.detail.ttdetail.request.params.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c9c2e2", new Object[]{bVar, soaVar, aVar, aVar2});
        } else {
            bVar.a(soaVar, aVar, aVar2);
        }
    }

    public static void a(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
        } else {
            tae.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.request.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (TextUtils.isEmpty(intent.getStringExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS))) {
                        JSONObject a2 = h.a().a(ak.a(intent));
                        if (a2 != null) {
                            List<String> a3 = aw.a(a2);
                            String b = aw.b(a2);
                            if (a3 != null) {
                                for (String str : a3) {
                                    q.a(str, 480, 480, true, q.a(TaobaoImageUrlStrategy.ImageQuality.q30));
                                }
                            }
                            q.a(b, true);
                            d.l(a2);
                            return;
                        }
                        i.a("RequestManager", "发起nav预加载请求");
                    }
                    g.a().a(intent);
                }
            });
        }
    }

    public static void b(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{intent});
        } else {
            tae.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.request.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MainRequestParams mainRequestParams = new MainRequestParams(intent);
                    i.a("RequestManager", "预请求参数=" + mainRequestParams.getExParams());
                    odg.k().a(mainRequestParams.getItemId(), (odg.i) null);
                    if (!j.ak() || mainRequestParams.getExParams() == null) {
                        i.a("RequestManager", "no reqMergeCrop");
                    } else {
                        i.a("RequestManager", "reqMergeCropping");
                        mainRequestParams.getExParams().put("reqMergeCropping", "true");
                    }
                    smx smxVar = new smx(mainRequestParams);
                    PrefetchRequestCallback prefetchRequestCallback = new PrefetchRequestCallback(mainRequestParams);
                    String detailToken = mainRequestParams.getDetailToken();
                    MtopStreamRequestCallback mtopStreamRequestCallback = new MtopStreamRequestCallback(detailToken, String.valueOf(UUID.randomUUID().hashCode()));
                    mtopStreamRequestCallback.setMtopRequestCallback(prefetchRequestCallback);
                    smxVar.a(true).a(mtopStreamRequestCallback);
                    av.c(detailToken, "request", System.currentTimeMillis());
                    smxVar.k();
                }
            });
        }
    }

    public void a(com.taobao.android.detail.ttdetail.request.params.a aVar, soa soaVar, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d751d08", new Object[]{this, aVar, soaVar, map, new Boolean(z)});
        } else {
            a(aVar, soaVar, map, z, null);
        }
    }

    public void a(com.taobao.android.detail.ttdetail.request.params.a aVar, soa soaVar, Map<String, String> map, boolean z, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54ee0d7d", new Object[]{this, aVar, soaVar, map, new Boolean(z), map2});
        } else if (map != null && Boolean.parseBoolean(map.get("updateWithCustomApi"))) {
            a(aVar, soaVar, map);
        } else {
            b(aVar, soaVar, map, z, map2);
        }
    }

    private void b(final com.taobao.android.detail.ttdetail.request.params.a aVar, final soa soaVar, Map<String, String> map, boolean z, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a5417e", new Object[]{this, aVar, soaVar, map, new Boolean(z), map2});
        } else if (aVar == null) {
        } else {
            String f = aVar.f();
            final a aVar2 = new a(f);
            i.a("RequestManager", "sendRequestNormally token=" + f);
            if (!aVar2.d()) {
                if (z && Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sDisableStreamingNetwork))) {
                    z2 = true;
                }
                MainRequestParams mainRequestParams = new MainRequestParams(aVar);
                mainRequestParams.updateRefreshParams(map);
                i.a("RequestManager", "主请求参数=" + mainRequestParams.getExParams());
                if (j.ak() && mainRequestParams.getExParams() != null && z2) {
                    mainRequestParams.getExParams().put("reqMergeCropping", "true");
                    i.a("RequestManager", "reqMergeCropping");
                } else {
                    i.a("RequestManager", "no reqMergeCrop");
                }
                smx smxVar = new smx(mainRequestParams);
                MainRequestCallback mainRequestCallback = new MainRequestCallback(mainRequestParams, soaVar);
                if (z2) {
                    MtopStreamRequestCallback mtopStreamRequestCallback = new MtopStreamRequestCallback(f, String.valueOf(UUID.randomUUID().hashCode()));
                    mtopStreamRequestCallback.setMtopRequestCallback(mainRequestCallback);
                    smxVar.a(true).a(mtopStreamRequestCallback).a(map2);
                } else {
                    smxVar.a(mainRequestCallback).a(map2);
                }
                smxVar.k();
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.taobao.android.detail.ttdetail.request.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this, soaVar, aVar2, aVar);
                    }
                }
            };
            if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sCallbackInOnCreate))) {
                runnable.run();
            } else {
                tae.b().post(runnable);
            }
        }
    }

    private void a(String str, soa soaVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f05fcfd", new Object[]{this, str, soaVar});
            return;
        }
        com.taobao.android.detail.ttdetail.request.preload.b b = h.a().b(str);
        if (b == null || (a2 = b.a()) == null) {
            return;
        }
        i.a("RequestManager", "从缓存中获取预加载数据");
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setOriginFastJsonObject(a2);
        mtopResponse.setHeaderFields(b.d());
        mtopResponse.setSupportStreamJson(true);
        MtopInfo mtopInfo = new MtopInfo();
        mtopInfo.a(mtopResponse);
        mtopInfo.a(2);
        soaVar.a(mtopInfo, 0, null, null);
        aw.a(str, b.b(), b.c());
    }

    private void a(soa soaVar, a aVar, com.taobao.android.detail.ttdetail.request.params.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42f54ac2", new Object[]{this, soaVar, aVar, aVar2});
        } else if (soaVar == null) {
        } else {
            a.C0427a b = aVar.b();
            aVar.a(soaVar);
            if (b == null) {
                a(aVar2.h(), soaVar);
                return;
            }
            String a2 = b.a();
            MtopInfo b2 = b.b();
            i.a("RequestManager", "从缓存中获取主接口数据，直接回调");
            if (TextUtils.equals(a2, "success")) {
                i.a("RequestManager", "mtopInfo.status=" + b2.a());
                soaVar.a(b2, 0, null, null);
            } else {
                soaVar.a(b2, 0, null);
            }
            if (b2.a() == 1) {
                return;
            }
            aVar.e();
        }
    }

    public void a(com.taobao.android.detail.ttdetail.request.params.a aVar, soa soaVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb7f4c", new Object[]{this, aVar, soaVar, map});
        } else if (map == null || map.isEmpty() || aVar == null) {
        } else {
            smp smpVar = new smp(new CustomApiRequestParams(map));
            String valueOf = String.valueOf(UUID.randomUUID().hashCode());
            a.a(aVar.f(), valueOf);
            boolean b = az.b(map);
            i.a("RequestManager", "sendRequestWithCustomApi isStreamCustomApi=" + b);
            if (b) {
                MtopStreamRequestCallback mtopStreamRequestCallback = new MtopStreamRequestCallback(aVar.f(), valueOf);
                mtopStreamRequestCallback.setMtopRequestCallback(new CustomMtopStreamRequestCallBack(aVar, soaVar));
                smpVar.a(true).a(mtopStreamRequestCallback);
            } else {
                smpVar.a(new CustomMtopRequestCallback(aVar, soaVar));
            }
            smpVar.k();
        }
    }
}
