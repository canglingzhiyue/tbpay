package tb;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.alibaba.android.ultron.trade.data.request.c;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.j;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;
import tb.jnt;
import tb.joa;
import tb.sxz;

/* loaded from: classes2.dex */
public class bcr extends bcq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASYNC_BIZ = "asyncBiz";
    private long j;
    private final ThreadPoolExecutor k;

    static {
        kge.a(1955456953);
    }

    public static /* synthetic */ Object ipc$super(bcr bcrVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.bcq
    public j a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("e3ef30c5", new Object[]{this, jnyVar});
        }
        return null;
    }

    public static /* synthetic */ Context a(bcr bcrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cf0d9edf", new Object[]{bcrVar}) : bcrVar.f;
    }

    public static /* synthetic */ void a(bcr bcrVar, jnv jnvVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1a8801", new Object[]{bcrVar, jnvVar, obj});
        } else {
            bcrVar.b(jnvVar, obj);
        }
    }

    public static /* synthetic */ void a(bcr bcrVar, jnv jnvVar, MtopResponse mtopResponse, jny jnyVar, Map map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739a23c", new Object[]{bcrVar, jnvVar, mtopResponse, jnyVar, map, obj});
        } else {
            bcrVar.a(jnvVar, mtopResponse, jnyVar, map, obj);
        }
    }

    public static /* synthetic */ void a(bcr bcrVar, jnv jnvVar, MtopResponse mtopResponse, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4645bc1b", new Object[]{bcrVar, jnvVar, mtopResponse, new Boolean(z), map});
        } else {
            bcrVar.a(jnvVar, mtopResponse, z, map);
        }
    }

    public bcr(bcb bcbVar, Context context, c cVar) {
        super(bcbVar, context, cVar);
        this.k = jqh.a(1, 1, 3L, TimeUnit.SECONDS, "LocalCacheDataRequester");
    }

    @Override // tb.bcq
    public void a(jnv jnvVar, jny jnyVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e1001d", new Object[]{this, jnvVar, jnyVar, obj});
        } else if (jnvVar == null) {
        } else {
            jpo.b(this.c.m()).a("apmClientBeforeNetworkLogicProcess", false, (Map<String, String>) null);
            this.j = System.currentTimeMillis();
            a(jnvVar, obj);
        }
    }

    private void a(final jnv jnvVar, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d5e042", new Object[]{this, jnvVar, obj});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                b(jnvVar, obj);
            } catch (Exception e) {
                bga.a.b("iCart", "LocalCacheDataRequester", "origin thread doRequestAsync", e.getMessage());
            }
        } else {
            this.k.execute(new Runnable() { // from class: tb.bcr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        bcr.a(bcr.this, jnvVar, obj);
                    } catch (Exception e2) {
                        bga.a.b("iCart", "LocalCacheDataRequester", "doRequestAsync", e2.getMessage());
                    }
                }
            });
        }
    }

    private void b(final jnv jnvVar, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbea883", new Object[]{this, jnvVar, obj});
            return;
        }
        jny andRemoveDmContext = CartFirstPageCache.getAndRemoveDmContext();
        MtopResponse andRemoveMtopResponse = CartFirstPageCache.getAndRemoveMtopResponse();
        if (andRemoveDmContext != null && andRemoveMtopResponse != null) {
            jqg.b("LocalCacheDataRequester", "命中首屏缓存预加载");
            a(jnvVar, andRemoveMtopResponse, andRemoveDmContext, (Map<String, ?>) null, obj);
            return;
        }
        a(new sxz.a<JSONObject>() { // from class: tb.bcr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sxz.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                }
            }

            @Override // tb.sxz.a
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                } else if (jSONObject == null) {
                } else {
                    new jnw(bcr.a(bcr.this)).q(false).a(jSONObject, new jnt.a().a(CartFirstPageCache.getAndRemoveFirstPageCacheByteData()), new joa.a() { // from class: tb.bcr.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.joa.a
                        public void a(MtopResponse mtopResponse, boolean z, Map<String, ?> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("251e7a5e", new Object[]{this, mtopResponse, new Boolean(z), map});
                            } else {
                                bcr.a(bcr.this, jnvVar, mtopResponse, z, map);
                            }
                        }

                        @Override // tb.joa.a
                        public void a(MtopResponse mtopResponse, jny jnyVar, Map<String, ?> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5083cabd", new Object[]{this, mtopResponse, jnyVar, map});
                            } else {
                                bcr.a(bcr.this, jnvVar, mtopResponse, jnyVar, map, obj);
                            }
                        }
                    });
                }
            }
        });
    }

    private void a(final sxz.a<JSONObject> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abecbb66", new Object[]{this, aVar});
            return;
        }
        JSONObject andRemoveFirstPageCacheData = CartFirstPageCache.getAndRemoveFirstPageCacheData();
        if (andRemoveFirstPageCacheData != null) {
            aVar.a((sxz.a<JSONObject>) andRemoveFirstPageCacheData);
            return;
        }
        final jpo b = jpo.b(this.f);
        b.a("getFirstPageCacheData", System.currentTimeMillis(), (String) null, true);
        jqg.b("LocalCacheDataRequester", "实时获取缓存");
        this.d.a(new sxz.a<byte[]>() { // from class: tb.bcr.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.sxz.a
            public void a(byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c19672f", new Object[]{this, bArr});
                    return;
                }
                b.a("getFirstPageCacheData", false, (Map<String, String>) null);
                if (bArr != null) {
                    z = false;
                }
                if (z) {
                    return;
                }
                try {
                    b.a("parseFirstPageCacheData", System.currentTimeMillis(), (String) null, true);
                    JSONObject jSONObject = (JSONObject) JSONObject.parseObject(bArr, JSONObject.class, new Feature[0]);
                    aae.a(bcr.this.c, jSONObject);
                    b.a("parseFirstPageCacheData", false, (Map<String, String>) null);
                    jqg.b("LocalCacheDataRequester", "实时获取缓存成功");
                    aVar.a((sxz.a) jSONObject);
                } catch (Exception unused) {
                    aVar.a("failed to get cache data");
                }
            }

            @Override // tb.sxz.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                aVar.a(str);
                jqg.a("iCart", "缓存加载失败#异常:", str);
            }
        });
    }

    private void a(final jnv jnvVar, final MtopResponse mtopResponse, final boolean z, final Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d567d05c", new Object[]{this, jnvVar, mtopResponse, new Boolean(z), map});
        } else {
            jqh.a(new Runnable() { // from class: tb.bcr.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        jnvVar.a(-1, mtopResponse, (Object) null, z, map);
                    } catch (Exception e) {
                        bga.a.b("iCart", "LocalCacheDataRequester", "onErrorAsync", e.getMessage());
                    }
                }
            }, 0L);
        }
    }

    private void a(final jnv jnvVar, final MtopResponse mtopResponse, final jny jnyVar, final Map<String, ?> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d504291b", new Object[]{this, jnvVar, mtopResponse, jnyVar, map, obj});
            return;
        }
        abi.a(this.c.m(), this.j);
        jnyVar.c("iCart");
        a(new Runnable() { // from class: tb.bcr.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    CartFirstPageCache.clear();
                    if (bcr.this.d.w() != null && !bcr.this.d.w().e()) {
                        return;
                    }
                    jnvVar.a(-1, mtopResponse, (Object) null, jnyVar, map);
                } catch (Exception e) {
                    bga.a.b("iCart", "LocalCacheDataRequester", "onSuccessAsync", e.getMessage());
                    abj.a("localCacheBizHandleError", e);
                    try {
                        jnvVar.a(-1, mtopResponse, (Object) null, false, map);
                    } catch (Exception e2) {
                        abj.a("localCacheOnErrorException", e2);
                    }
                }
            }
        }, e(), obj);
    }

    private void a(Runnable runnable, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39d5d0a", new Object[]{this, runnable, new Boolean(z), obj});
        } else if (ASYNC_BIZ.equals(String.valueOf(obj))) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                jqh.a(runnable);
            } else {
                runnable.run();
            }
        } else {
            bes.a(runnable, z);
        }
    }

    private boolean e() {
        bez x;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.c != null && jqi.a("iCart", "enablePostSuccessToFrontOfMainWhenCacheLoad", true) && (x = this.c.x()) != null && a(x.s()) && a(x.t()) && a(x.r());
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue() : (view == null || view.getParent() == null) ? false : true;
    }
}
