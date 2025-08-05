package com.alibaba.android.icart.core.performance.cache;

import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.aae;
import tb.bci;
import tb.jnt;
import tb.jnw;
import tb.jny;
import tb.joa;
import tb.jqg;
import tb.jqi;
import tb.kge;
import tb.sxz;

/* loaded from: classes2.dex */
public final class CartFirstPageCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile CartGlobal sCartGlobalCache;
    private static volatile bci sDataCache;
    private static byte[] sFirstPageCacheByteData;
    private static volatile JSONObject sFirstPageCacheData;
    private static volatile jny sIdmContext;
    private static boolean sIsEnable;
    private static boolean sIsFinished;
    private static volatile MtopResponse sMtopResponse;

    /* loaded from: classes2.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-456385775);
        }

        public abstract void a(a aVar);

        public abstract void a(String str);
    }

    public static /* synthetic */ byte[] access$002(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e1492fdd", new Object[]{bArr});
        }
        sFirstPageCacheByteData = bArr;
        return bArr;
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        sIsFinished = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$202(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b6d67075", new Object[]{jSONObject});
        }
        sFirstPageCacheData = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ jny access$302(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jny) ipChange.ipc$dispatch("c0e67eba", new Object[]{jnyVar});
        }
        sIdmContext = jnyVar;
        return jnyVar;
    }

    public static /* synthetic */ MtopResponse access$402(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("1f66b99", new Object[]{mtopResponse});
        }
        sMtopResponse = mtopResponse;
        return mtopResponse;
    }

    public static /* synthetic */ CartGlobal access$502(CartGlobal cartGlobal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal) ipChange.ipc$dispatch("8bbca618", new Object[]{cartGlobal});
        }
        sCartGlobalCache = cartGlobal;
        return cartGlobal;
    }

    static {
        kge.a(892636280);
        sFirstPageCacheData = null;
        sIsEnable = false;
        sIsFinished = false;
    }

    public static void loadFirstPageCacheData(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af7d691", new Object[]{bVar});
            return;
        }
        try {
            boolean a2 = jqi.a("iCart", "preloadFirstPageCacheData", true);
            sIsEnable = a2;
            if (!a2) {
                return;
            }
            if (sDataCache == null) {
                sDataCache = new bci(Globals.getApplication());
            }
            sDataCache.a(new sxz.a<byte[]>() { // from class: com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.sxz.a
                public void a(byte[] bArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                        return;
                    }
                    try {
                        CartFirstPageCache.access$002(bArr);
                        if (bArr == null) {
                            CartFirstPageCache.access$102(true);
                            b.this.a("FirstPageCacheByteDataIsNull");
                            return;
                        }
                        JSONObject jSONObject = (JSONObject) JSONObject.parseObject(bArr, JSONObject.class, new Feature[0]);
                        aae.a(TBMainHost.a().getContext(), jSONObject);
                        CartFirstPageCache.access$202(jSONObject);
                        new jnw(Globals.getApplication()).q(false).a(jSONObject, new jnt.a().a(bArr), new joa.a() { // from class: com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.joa.a
                            public void a(MtopResponse mtopResponse, boolean z, Map<String, ?> map) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("251e7a5e", new Object[]{this, mtopResponse, new Boolean(z), map});
                                    return;
                                }
                                jqg.b("iCart", "预加载首页缓存失败");
                                CartFirstPageCache.access$102(true);
                                b.this.a("ExecuteFailed");
                            }

                            @Override // tb.joa.a
                            public void a(MtopResponse mtopResponse, jny jnyVar, Map<String, ?> map) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5083cabd", new Object[]{this, mtopResponse, jnyVar, map});
                                    return;
                                }
                                jqg.b("iCart", "预加载首页缓存成功");
                                try {
                                    CartFirstPageCache.access$102(true);
                                    CartFirstPageCache.access$302(jnyVar);
                                    CartFirstPageCache.access$402(mtopResponse);
                                    com.taobao.android.ultron.datamodel.imp.b bVar2 = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
                                    JSONObject M = bVar2.M();
                                    if (M == null) {
                                        M = bVar2.t().d();
                                    }
                                    CartFirstPageCache.access$502(CartGlobal.parseCartGlobal(M.getJSONObject("global")));
                                    if (mtopResponse != null) {
                                        b.this.a(new a(jnyVar, mtopResponse));
                                    } else {
                                        b.this.a("MtopResponseIsNull");
                                    }
                                } catch (Exception e) {
                                    jqg.a("iCart", "首屏缓存获取失败#", e.getMessage());
                                }
                            }
                        });
                    } catch (Exception unused) {
                        b.this.a("ExecuteException");
                    }
                }

                @Override // tb.sxz.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        b.this.a(str);
                    }
                }
            });
        } catch (Exception unused) {
            bVar.a("loadFirstPageCacheDataException");
        }
    }

    public static JSONObject getAndRemoveFirstPageCacheData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8c5f75b9", new Object[0]);
        }
        JSONObject jSONObject = sFirstPageCacheData;
        sFirstPageCacheData = null;
        return jSONObject;
    }

    public static byte[] getAndRemoveFirstPageCacheByteData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8500413c", new Object[0]);
        }
        byte[] bArr = sFirstPageCacheByteData;
        sFirstPageCacheByteData = null;
        return bArr;
    }

    public static bci getAndRemoveDataCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bci) ipChange.ipc$dispatch("7d332604", new Object[0]);
        }
        bci bciVar = sDataCache;
        sDataCache = null;
        return bciVar;
    }

    public static jny getAndRemoveDmContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jny) ipChange.ipc$dispatch("98af3889", new Object[0]);
        }
        jny jnyVar = sIdmContext;
        sIdmContext = null;
        return jnyVar;
    }

    public static MtopResponse getAndRemoveMtopResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("28949f26", new Object[0]);
        }
        MtopResponse mtopResponse = sMtopResponse;
        sMtopResponse = null;
        return mtopResponse;
    }

    public static CartGlobal getAndRemoveCartGlobal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal) ipChange.ipc$dispatch("8faebcb1", new Object[0]);
        }
        CartGlobal cartGlobal = sCartGlobalCache;
        sCartGlobalCache = null;
        return cartGlobal;
    }

    public static boolean hasPreloadFinishedAndDataValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("348c4b27", new Object[0])).booleanValue() : (!sIsFinished || sMtopResponse == null || sIdmContext == null) ? false : true;
    }

    public static boolean isEnablePreload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb63b487", new Object[0])).booleanValue() : sIsEnable;
    }

    public static void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
            return;
        }
        sFirstPageCacheData = null;
        sFirstPageCacheByteData = null;
        sDataCache = null;
        sMtopResponse = null;
        sIdmContext = null;
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final jny f2371a;
        private final MtopResponse b;

        static {
            kge.a(-773267200);
        }

        private a(jny jnyVar, MtopResponse mtopResponse) {
            this.f2371a = jnyVar;
            this.b = mtopResponse;
        }
    }
}
