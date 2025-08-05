package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.tao.adapter.biz.weex.module.ShareGiftWeexModule;
import com.taobao.tao.adapter.biz.weex.module.TaopasswordLayerModule;
import com.taobao.weex.TBWXSDKEngine;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.d;
import java.util.Map;
import tb.mto;
import tb.nzo;

/* loaded from: classes8.dex */
public class ode implements nzo, nzo.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean b;

    /* renamed from: a  reason: collision with root package name */
    private WXSDKInstance f31934a;
    private long c;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static ode f31938a;

        static {
            kge.a(987775795);
            f31938a = new ode();
        }

        public static /* synthetic */ ode a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ode) ipChange.ipc$dispatch("f089dee", new Object[0]) : f31938a;
        }
    }

    @Override // tb.nzo
    public WeexInstance f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("c92b65a7", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ WXSDKInstance a(ode odeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("8643ca86", new Object[]{odeVar}) : odeVar.f31934a;
    }

    public static /* synthetic */ long b(ode odeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e631fa1d", new Object[]{odeVar})).longValue() : odeVar.c;
    }

    static {
        kge.a(-1165403552);
        kge.a(-331970706);
        kge.a(1874732861);
        b = false;
    }

    public static ode e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ode) ipChange.ipc$dispatch("2dcf336a", new Object[0]) : a.a();
    }

    private ode() {
    }

    @Override // tb.nzo
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (b) {
        } else {
            try {
                WXSDKEngine.registerModule("TaopasswordLayerModule", TaopasswordLayerModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
            b = true;
        }
    }

    @Override // tb.nzo
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            WXSDKEngine.registerModule("ShareGiftWeexModule", ShareGiftWeexModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

    @Override // tb.nzo
    public nzo.a a(Context context, final nzo.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzo.a) ipChange.ipc$dispatch("6f892777", new Object[]{this, context, bVar});
        }
        ode e = e();
        this.f31934a = new WXSDKInstance(context);
        this.f31934a.a(new d() { // from class: tb.ode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.weex.d
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                }
            }

            @Override // com.taobao.weex.d
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                } else {
                    bVar.viewCreated(view);
                }
            }

            @Override // com.taobao.weex.d
            public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                } else {
                    bVar.viewReady();
                }
            }

            @Override // com.taobao.weex.d
            public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                    return;
                }
                nzo.b bVar2 = bVar;
                bVar2.weexError(str + "，" + str2);
            }
        });
        return e;
    }

    @Override // tb.nzo
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (WXSDKEngine.isInitialized()) {
        } else {
            TBWXSDKEngine.initSDKEngine(false);
        }
    }

    @Override // tb.nzo.a
    public void a(final String str, final String str2, final Map<String, Object> map, final String str3, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f592c7b3", new Object[]{this, str, str2, map, str3, new Integer(i), new Integer(i2)});
        } else if (this.f31934a == null) {
        } else {
            if (!nyl.k()) {
                nyy.b("TBShareWeex", "不等待weex初始化");
                nyy.a("invoke WXSDKInstance#renderByUrl");
                this.f31934a.a(str, str2, map, str3, i, i2, WXRenderStrategy.APPEND_ONCE);
            } else if (WXSDKEngine.isInitialized()) {
                nyy.b("TBShareWeex", "weex已初始化");
                nyy.a("invoke WXSDKInstance#renderByUrl");
                this.f31934a.a(str, str2, map, str3, i, i2, WXRenderStrategy.APPEND_ONCE);
                AppMonitor.Counter.commit(nyy.SHARE_TAG, "waitWeexMillis", mto.a.GEO_NOT_SUPPORT);
            } else {
                nyy.b("TBShareWeex", "等待weex初始化");
                this.c = System.currentTimeMillis();
                this.f31934a.n(str2);
                this.f31934a.a(new WXSDKManager.a() { // from class: tb.ode.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.WXSDKManager.a
                    public void a(String str4, String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str4, str5});
                        }
                    }

                    @Override // com.taobao.weex.WXSDKManager.a
                    public void onInitSuccess() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fb2dd3fb", new Object[]{this});
                            return;
                        }
                        nyy.b("TBShareWeex", "weex初始化成功");
                        odd.a(new Runnable() { // from class: tb.ode.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (ode.a(ode.this) != null) {
                                    nyy.a("invoke WXSDKInstance#renderByUrl");
                                    ode.a(ode.this).a(str, str2, map, str3, i, i2, WXRenderStrategy.APPEND_ONCE);
                                }
                                AppMonitor.Counter.commit(nyy.SHARE_TAG, "waitWeexMillis", System.currentTimeMillis() - ode.b(ode.this));
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // tb.nzo.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.f31934a;
        if (wXSDKInstance == null) {
            return;
        }
        wXSDKInstance.e();
        this.f31934a = null;
    }
}
