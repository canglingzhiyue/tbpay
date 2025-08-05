package tb;

import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import com.taobao.login4android.api.Login;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bed;

/* loaded from: classes5.dex */
public final class gnw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f28398a;
    private static final AtomicBoolean b;
    private static aat c;
    private static CountDownLatch d;
    private static a e;

    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void b();
    }

    public static /* synthetic */ void a(jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbb5de6", new Object[]{jnvVar});
        } else {
            b(jnvVar);
        }
    }

    public static /* synthetic */ void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{new Boolean(z), str});
        } else {
            b(z, str);
        }
    }

    public static /* synthetic */ CountDownLatch d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("1269ac51", new Object[0]) : d;
    }

    public static /* synthetic */ a e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e9be0b4d", new Object[0]) : e;
    }

    static {
        kge.a(1303734849);
        f28398a = new AtomicBoolean();
        b = new AtomicBoolean();
        d = new CountDownLatch(1);
    }

    public static void a(aat aatVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa7a604", new Object[]{aatVar});
        } else if (c != null) {
        } else {
            CountDownLatch countDownLatch = d;
            if (countDownLatch != null && countDownLatch.getCount() == 1) {
                b();
            }
            d = new CountDownLatch(1);
            c = aatVar;
            a();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            d.countDown();
        } catch (Exception e2) {
            jqg.a("iCart", "onEngineEnd countDown error=" + e2.getMessage());
        }
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b741c68b", new Object[]{aVar});
        } else {
            e = aVar;
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f28398a.getAndSet(true)) {
        } else {
            jqg.b("iCart", "firstPageLoad code=" + c.i().hashCode());
            CartFirstPageCache.loadFirstPageCacheData(new CartFirstPageCache.b() { // from class: tb.gnw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.b
                public void a(CartFirstPageCache.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2df42844", new Object[]{this, aVar});
                        return;
                    }
                    gnw.a(true, "loadSuccess");
                    try {
                        if (gnw.d().getCount() == 1) {
                            long currentTimeMillis = System.currentTimeMillis();
                            gnw.d().await();
                            jqg.b("iCart", "等待engine创建完成，耗时：time=" + (System.currentTimeMillis() - currentTimeMillis));
                        }
                    } catch (InterruptedException e2) {
                        jqg.a("loadFirstPageCacheData success error", e2.getMessage());
                    }
                    gnw.a(new jnv() { // from class: tb.gnw.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.joc
                        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                            } else if (gnw.e() == null) {
                            } else {
                                gnw.e().b();
                            }
                        }

                        @Override // tb.joc
                        public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                            } else if (gnw.e() == null) {
                            } else {
                                gnw.e().a();
                            }
                        }
                    });
                }

                @Override // com.alibaba.android.icart.core.performance.cache.CartFirstPageCache.b
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    try {
                        if (gnw.d().getCount() == 1) {
                            long currentTimeMillis = System.currentTimeMillis();
                            gnw.d().await();
                            jqg.b("iCart", "缓存加载失败，等待engine创建完成，耗时：time=" + (System.currentTimeMillis() - currentTimeMillis));
                        }
                    } catch (InterruptedException e2) {
                        jqg.a("loadFirstPageCacheData onError errorMsg", e2.getMessage());
                    }
                    if (gnw.e() != null) {
                        gnw.e().b();
                    }
                    gnw.a(false, "loadFailed#" + str);
                }
            });
            mvu.a();
        }
    }

    public static aat c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aat) ipChange.ipc$dispatch("1e658208", new Object[0]);
        }
        aat aatVar = c;
        c = null;
        e = null;
        f28398a.set(false);
        b.set(false);
        b();
        return aatVar;
    }

    private static void b(jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3e6467", new Object[]{jnvVar});
        } else if (f()) {
            if (jnvVar != null) {
                jnvVar.a(-1, (MtopResponse) null, (Object) null, false, (Map<String, ? extends Object>) null);
            }
            jqg.b("iCart", "尝试加载缓存，但cartVEngine未初始化完成");
        } else if (!CartFirstPageCache.hasPreloadFinishedAndDataValid()) {
            if (jnvVar != null) {
                jnvVar.a(-1, (MtopResponse) null, (Object) null, false, (Map<String, ? extends Object>) null);
            }
            jqg.b("iCart", "尝试加载缓存，但首页缓存数据未加载成功,直接发起缓存请求");
        } else if (b.getAndSet(true)) {
            if (jnvVar != null) {
                jnvVar.a(-1, (MtopResponse) null, (Object) null, false, (Map<String, ? extends Object>) null);
            }
            jqg.b("iCart", "预请求的缓存已经加载了，此次忽略");
        } else {
            jqg.b("iCart", "开始发起缓存请求");
            c.h().a(jnvVar, true);
        }
    }

    private static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        aat aatVar = c;
        return aatVar == null || aatVar.h() == null || c.h().x() == null;
    }

    private static void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31b0915", new Object[]{new Boolean(z), str});
            return;
        }
        try {
            if (!c.h().v().i()) {
                return;
            }
        } catch (Exception unused) {
        }
        bed.a b2 = bed.a.b("firstPagePreloadStatus");
        StringBuilder sb = new StringBuilder();
        sb.append(z ? ResultCode.MSG_SUCCESS : ResultCode.MSG_FAILED);
        sb.append("#是否登录：");
        sb.append(Login.checkSessionValid());
        b2.c(sb.toString());
        b2.a(str);
        b2.a(z);
        b2.a(0.005f);
        bed.a(b2);
    }
}
