package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.config.b;
import com.taobao.android.weex.e;
import com.taobao.android.weex.h;
import com.taobao.android.weex_framework.ui.i;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.tao.adapter.biz.weex.module.ShareGiftWeexModule2;
import com.taobao.tao.adapter.biz.weex.module.TaopasswordLayerModule2;
import java.util.Map;
import tb.nzo;

/* loaded from: classes8.dex */
public class tjr implements nzo, nzo.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean b;

    /* renamed from: a  reason: collision with root package name */
    private WeexInstance f34155a;
    private nzo.b c;
    private Context d;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static tjr f34160a;

        static {
            kge.a(76527269);
            f34160a = new tjr();
        }

        public static /* synthetic */ tjr a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (tjr) ipChange.ipc$dispatch("f0afbe2", new Object[0]) : f34160a;
        }
    }

    @Override // tb.nzo
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public static /* synthetic */ nzo.b a(tjr tjrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nzo.b) ipChange.ipc$dispatch("dd030aa9", new Object[]{tjrVar}) : tjrVar.c;
    }

    public static /* synthetic */ Context b(tjr tjrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1008c315", new Object[]{tjrVar}) : tjrVar.d;
    }

    public static /* synthetic */ WeexInstance c(tjr tjrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("e68a4096", new Object[]{tjrVar}) : tjrVar.f34155a;
    }

    static {
        kge.a(-1767771694);
        kge.a(-331970706);
        kge.a(1874732861);
        b = false;
    }

    public static tjr e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tjr) ipChange.ipc$dispatch("2dd1915e", new Object[0]) : a.a();
    }

    private tjr() {
        g();
    }

    @Override // tb.nzo
    public WeexInstance f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("c92b65a7", new Object[]{this}) : this.f34155a;
    }

    @Override // tb.nzo
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (b) {
        } else {
            try {
                e.a().b("TaopasswordLayerModule", TaopasswordLayerModule2.class);
            } catch (Throwable th) {
                th.printStackTrace();
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
            e.a().b("ShareGiftWeexModule", ShareGiftWeexModule2.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.nzo
    public nzo.a a(Context context, nzo.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzo.a) ipChange.ipc$dispatch("6f892777", new Object[]{this, context, bVar});
        }
        tjr e = e();
        this.c = bVar;
        this.d = context;
        return e;
    }

    private WeexInstance a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("17367282", new Object[]{this, str});
        }
        WeexInstance weexInstance = this.f34155a;
        if (weexInstance != null) {
            weexInstance.destroy();
            this.f34155a = null;
        }
        b bVar = new b();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        bVar.a(weexUnicornConfig);
        weexUnicornConfig.a((i) null);
        weexUnicornConfig.a(true);
        weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        this.f34155a = e.a(this.d, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
        try {
            this.f34155a.getRootView().setFitsSystemWindows(false);
            this.c.viewCreated(this.f34155a.getRootView());
        } catch (Throwable unused) {
        }
        this.f34155a.addInstanceListener(new h() { // from class: tb.tjr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex.h
            public void onDestroyed(WeexInstance weexInstance2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("68c948df", new Object[]{this, weexInstance2});
                }
            }

            @Override // com.taobao.android.weex.h
            public void onEngineException(WeexInstance weexInstance2, WeexErrorType weexErrorType, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance2, weexErrorType, str2});
                }
            }

            @Override // com.taobao.android.weex.h
            public void onExecuteFailed(WeexInstance weexInstance2, WeexErrorType weexErrorType, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("55726f6d", new Object[]{this, weexInstance2, weexErrorType, str2});
                }
            }

            @Override // com.taobao.android.weex.h
            public void onExecuteSuccess(WeexInstance weexInstance2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance2});
                }
            }

            @Override // com.taobao.android.weex.h
            public void onInitSuccess(WeexInstance weexInstance2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f794a71b", new Object[]{this, weexInstance2, new Boolean(z)});
                }
            }

            @Override // com.taobao.android.weex.h
            public void onScriptException(WeexInstance weexInstance2, WeexErrorType weexErrorType, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("52b846bb", new Object[]{this, weexInstance2, weexErrorType, str2});
                }
            }

            @Override // com.taobao.android.weex.h
            public void onInitFailed(WeexInstance weexInstance2, boolean z, WeexErrorType weexErrorType, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bee002", new Object[]{this, weexInstance2, new Boolean(z), weexErrorType, str2});
                } else if (tjr.a(tjr.this) == null) {
                } else {
                    nzo.b a2 = tjr.a(tjr.this);
                    a2.weexError(str2 + "，" + z);
                }
            }

            @Override // com.taobao.android.weex.h
            public void onRenderSuccess(WeexInstance weexInstance2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a414e261", new Object[]{this, weexInstance2, new Boolean(z)});
                } else if (tjr.a(tjr.this) == null) {
                } else {
                    tjr.a(tjr.this).viewReady();
                }
            }

            @Override // com.taobao.android.weex.h
            public void onRenderFailed(WeexInstance weexInstance2, boolean z, WeexErrorType weexErrorType, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("99cc9148", new Object[]{this, weexInstance2, new Boolean(z), weexErrorType, str2});
                    return;
                }
                String str3 = "onRenderFailed:" + str2;
                if (tjr.a(tjr.this) == null) {
                    return;
                }
                tjr.a(tjr.this).weexError(str2 + "，" + z);
            }
        });
        return this.f34155a;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            c.a(new a.b() { // from class: tb.tjr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                        return;
                    }
                    String str = "initLifecycleObserver type:" + i;
                    if (i == 50 || i == 1) {
                        if (!(tjr.b(tjr.this) instanceof Activity)) {
                            return;
                        }
                        ((Activity) tjr.b(tjr.this)).runOnUiThread(new Runnable() { // from class: tb.tjr.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    if (tjr.c(tjr.this) == null) {
                                        return;
                                    }
                                    tjr.c(tjr.this).onActivityPause();
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    } else if (i != 2 || !(tjr.b(tjr.this) instanceof Activity)) {
                    } else {
                        ((Activity) tjr.b(tjr.this)).runOnUiThread(new Runnable() { // from class: tb.tjr.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    if (tjr.c(tjr.this) == null) {
                                        return;
                                    }
                                    tjr.c(tjr.this).onActivityResume();
                                } catch (Throwable unused) {
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // tb.nzo.a
    public void a(String str, String str2, Map<String, Object> map, String str3, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f592c7b3", new Object[]{this, str, str2, map, str3, new Integer(i), new Integer(i2)});
            return;
        }
        this.f34155a = a(str2);
        if (this.f34155a == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str4 : map.keySet()) {
                    jSONObject.put(str4, map.get(str4));
                }
            }
            this.f34155a.initWithURL(str2);
            this.f34155a.render(e.b().a(jSONObject));
            this.f34155a.onActivityStart();
        } catch (Throwable unused) {
        }
    }

    @Override // tb.nzo.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.f34155a;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
            this.f34155a.destroy();
            this.f34155a = null;
        }
        if (this.c == null) {
            return;
        }
        this.c = null;
    }
}
