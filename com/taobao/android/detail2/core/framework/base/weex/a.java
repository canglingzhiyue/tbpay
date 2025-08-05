package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.e;
import com.taobao.android.detail2.core.framework.j;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.s;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import java.util.HashMap;
import java.util.Map;
import tb.fjm;
import tb.fjt;
import tb.hnj;
import tb.idk;
import tb.ipa;
import tb.jvb;
import tb.jvq;
import tb.kge;
import tb.nlb;
import tb.qxo;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f11484a;
    private static int b;
    private static int c;
    private static int d;
    private int e;
    private int f;
    private boolean g;
    private jvq h;
    private boolean i;
    private p j;
    private Runnable k;
    private f l;
    private boolean n;
    private com.taobao.android.detail2.core.framework.b o;
    private boolean p;
    private int q;
    private boolean r;
    private boolean s;

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfb0e4ae", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.q = i;
        return i;
    }

    public static /* synthetic */ p a(a aVar, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("8b8b8542", new Object[]{aVar, pVar});
        }
        aVar.j = pVar;
        return pVar;
    }

    public static /* synthetic */ Runnable a(a aVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("6254660e", new Object[]{aVar, runnable});
        }
        aVar.k = runnable;
        return runnable;
    }

    public static /* synthetic */ void a(a aVar, Context context, com.taobao.android.weex_framework.f fVar, e.a aVar2, MUSDKInstance mUSDKInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ed6368", new Object[]{aVar, context, fVar, aVar2, mUSDKInstance, str});
        } else {
            aVar.a(context, fVar, aVar2, mUSDKInstance, str);
        }
    }

    public static /* synthetic */ void a(a aVar, Context context, com.taobao.android.weex_framework.f fVar, e.a aVar2, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aee7f8e", new Object[]{aVar, context, fVar, aVar2, str, jSONObject});
        } else {
            aVar.b(context, fVar, aVar2, str, jSONObject);
        }
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b41e774c", new Object[]{aVar})).booleanValue() : aVar.r;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfb12490", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.p = z;
        return z;
    }

    public static /* synthetic */ jvq b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvq) ipChange.ipc$dispatch("609e11fa", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ void b(a aVar, Context context, com.taobao.android.weex_framework.f fVar, e.a aVar2, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a3b42d", new Object[]{aVar, context, fVar, aVar2, str, jSONObject});
        } else {
            aVar.c(context, fVar, aVar2, str, jSONObject);
        }
    }

    public static /* synthetic */ Runnable c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("4400ddce", new Object[]{aVar}) : aVar.k;
    }

    public static /* synthetic */ f d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("2e2a7960", new Object[]{aVar}) : aVar.l;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc2da4c8", new Object[]{aVar})).booleanValue() : aVar.i;
    }

    public static /* synthetic */ p g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("4261afff", new Object[]{aVar}) : aVar.j;
    }

    public static /* synthetic */ int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[0])).intValue() : f11484a;
    }

    public static /* synthetic */ int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[0])).intValue() : b;
    }

    public static /* synthetic */ int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[0])).intValue() : d;
    }

    static {
        kge.a(1592154389);
        f11484a = 0;
        b = 1;
        c = 2;
        d = 3;
    }

    public a(com.taobao.android.detail2.core.framework.b bVar, boolean z, com.taobao.android.weex_framework.f fVar, e.a aVar, f fVar2) {
        this(bVar, z, fVar, aVar, fVar2, null, false, null);
    }

    public a(com.taobao.android.detail2.core.framework.b bVar, boolean z, com.taobao.android.weex_framework.f fVar, e.a aVar, f fVar2, String str, boolean z2, JSONObject jSONObject) {
        this.n = true;
        this.q = c;
        this.k = null;
        this.p = false;
        this.r = false;
        this.o = bVar;
        this.s = z2;
        this.l = fVar2;
        this.i = z;
        if (this.i) {
            if (ipa.P()) {
                a(bVar.g(), fVar, aVar, str, jSONObject);
                return;
            }
            nlb.a("weex_sync_delete_code", "hitIndependentV2AsyncAll-createWeexV2Instance sjs:" + ipa.ba());
            b(bVar.g(), fVar, aVar);
            return;
        }
        nlb.a("Instance_Constructor_is_weex_v1", null);
    }

    private void a(final Context context, final com.taobao.android.weex_framework.f fVar, final e.a aVar, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5360cae", new Object[]{this, context, fVar, aVar, str, jSONObject});
        } else if (aVar != null && aVar.f11500a != null) {
            this.q = f11484a;
            this.j = aVar.f11500a;
            if (this.h != null) {
                fjt.a(fjt.TAG_RENDER, "fill instance createWeexV2InstanceForAsync时机设置mGestureListener成功");
                this.j.setGestureEventListener(this.h);
            }
            if (fVar != null) {
                fVar.onCreateView(this.j.getRenderRoot());
            }
            f fVar2 = this.l;
            if (fVar2 == null) {
                return;
            }
            fVar2.a(this, this.j.getRenderRoot());
        } else if (this.s) {
            ipa.N().postDelayed(new Runnable() { // from class: com.taobao.android.detail2.core.framework.base.weex.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this, context, fVar, aVar, str, jSONObject);
                    }
                }
            }, ipa.ab());
        } else {
            b(context, fVar, aVar, str, jSONObject);
        }
    }

    private void b(final Context context, final com.taobao.android.weex_framework.f fVar, final e.a aVar, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cb22ef", new Object[]{this, context, fVar, aVar, str, jSONObject});
        } else {
            idk.b(new Runnable() { // from class: com.taobao.android.detail2.core.framework.base.weex.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.b(a.this, context, fVar, aVar, str, jSONObject);
                    }
                }
            });
        }
    }

    private void c(final Context context, final com.taobao.android.weex_framework.f fVar, final e.a aVar, final String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6603930", new Object[]{this, context, fVar, aVar, str, jSONObject});
            return;
        }
        final j jVar = context instanceof j ? (j) context : null;
        if (jVar != null && jVar.c()) {
            return;
        }
        h.a(context, str, new s() { // from class: com.taobao.android.detail2.core.framework.base.weex.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex.s
            public void a(s.a aVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8d89384", new Object[]{this, aVar2});
                    return;
                }
                j jVar2 = jVar;
                if (jVar2 != null && jVar2.c()) {
                    aVar2.a();
                } else if (a.a(a.this)) {
                    aVar2.a();
                } else {
                    WeexInstance a2 = aVar2.a(context);
                    jvb adapterMUSInstance = a2 != null ? ((WeexInstanceImpl) a2).getAdapterMUSInstance() : null;
                    if (adapterMUSInstance == null) {
                        if (qxo.a()) {
                            throw new RuntimeException("mus 为空，无法获取到有效的 weex 实例。");
                        }
                        return;
                    }
                    a.a(a.this, context, fVar, aVar, adapterMUSInstance, str);
                    a.a(a.this, adapterMUSInstance);
                    if (a.b(a.this) != null) {
                        fjt.a(fjt.TAG_RENDER, "onInstanceCreatedInMain时机设置mGestureListener成功");
                        a.g(a.this).setGestureEventListener(a.b(a.this));
                    }
                    a.a(a.this, true);
                    Runnable c2 = a.c(a.this);
                    a.a(a.this, (Runnable) null);
                    if (c2 == null) {
                        return;
                    }
                    c2.run();
                }
            }
        }, jSONObject, this.e, this.f);
        this.g = true;
    }

    private void a(Context context, final com.taobao.android.weex_framework.f fVar, e.a aVar, MUSDKInstance mUSDKInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b6b088", new Object[]{this, context, fVar, aVar, mUSDKInstance, str});
            return;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        if (fjm.c()) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("memory-opt-level", "1");
            mUSInstanceConfig.a(hashMap);
        }
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.f(false);
        if (this.o.h().b().b()) {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.image);
        } else {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        }
        com.taobao.android.weex_framework.f fVar2 = new com.taobao.android.weex_framework.f() { // from class: com.taobao.android.detail2.core.framework.base.weex.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    return;
                }
                com.taobao.android.weex_framework.f fVar3 = fVar;
                if (fVar3 != null) {
                    fVar3.onCreateView(view);
                }
                if (a.d(a.this) == null) {
                    return;
                }
                a.d(a.this).a(a.this, view);
            }
        };
        this.j = mUSDKInstance;
        if (str == null) {
            str = "new_detail";
        }
        mUSInstanceConfig.c(str);
        mUSDKInstance.registerRenderListener(new com.taobao.android.weex_framework.g() { // from class: com.taobao.android.detail2.core.framework.base.weex.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.g
            public void onDestroyed(MUSDKInstance mUSDKInstance2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance2});
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onForeground(p pVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onPrepareSuccess(p pVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshFailed(p pVar, int i, String str2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str2, new Boolean(z)});
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderSuccess(p pVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                    return;
                }
                a.a(a.this, a.p());
                if (a.d(a.this) == null) {
                    return;
                }
                a.d(a.this).a(a.this, 0, 0);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRenderFailed(p pVar, int i, String str2, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str2, new Boolean(z)});
                    return;
                }
                a.a(a.this, a.q());
                if (a.d(a.this) == null) {
                    return;
                }
                a.d(a.this).c(a.this, String.valueOf(i), str2);
            }

            @Override // com.taobao.android.weex_framework.g
            public void onRefreshSuccess(p pVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                } else if (a.d(a.this) == null) {
                } else {
                    a.d(a.this).b(a.this, 0, 0);
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onJSException(p pVar, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str2});
                } else if (a.d(a.this) == null) {
                } else {
                    a.d(a.this).a(a.this, String.valueOf(i), str2);
                }
            }

            @Override // com.taobao.android.weex_framework.g
            public void onFatalException(p pVar, int i, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str2});
                    return;
                }
                a.a(a.this, a.q());
                if (a.d(a.this) == null) {
                    return;
                }
                a.d(a.this).b(a.this, String.valueOf(i), str2);
            }
        });
        fVar2.onCreateView(mUSDKInstance.getRenderRoot());
        if (!ipa.T()) {
            return;
        }
        hnj.a(mUSDKInstance);
    }

    private void b(Context context, final com.taobao.android.weex_framework.f fVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f2ee17", new Object[]{this, context, fVar, aVar});
        } else if (aVar != null && aVar.f11500a != null) {
            this.q = f11484a;
            this.j = aVar.f11500a;
            if (this.h != null) {
                fjt.a(fjt.TAG_RENDER, "fill instance createWeexV2Instance时机设置mGestureListener成功");
                this.j.setGestureEventListener(this.h);
            }
            if (fVar != null) {
                fVar.onCreateView(this.j.getRenderRoot());
            }
            f fVar2 = this.l;
            if (fVar2 == null) {
                return;
            }
            fVar2.a(this, this.j.getRenderRoot());
        } else {
            MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
            if (fjm.c()) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("memory-opt-level", "1");
                mUSInstanceConfig.a(hashMap);
            }
            mUSInstanceConfig.d(true);
            mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
            mUSInstanceConfig.f(false);
            if (this.o.h().b().b()) {
                mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.image);
            } else {
                mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
            }
            mUSInstanceConfig.a(new com.taobao.android.weex_framework.f() { // from class: com.taobao.android.detail2.core.framework.base.weex.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.f
                public void onCreateView(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                        return;
                    }
                    com.taobao.android.weex_framework.f fVar3 = fVar;
                    if (fVar3 != null) {
                        fVar3.onCreateView(view);
                    }
                    if (a.d(a.this) == null) {
                        return;
                    }
                    a.d(a.this).a(a.this, view);
                }
            });
            mUSInstanceConfig.c("new_detail");
            this.j = q.a().a(context, mUSInstanceConfig);
            if (this.h != null) {
                fjt.a(fjt.TAG_RENDER, "createWeexV2Instance时机设置mGestureListener成功");
                this.j.setGestureEventListener(this.h);
            }
            this.j.registerRenderListener(new com.taobao.android.weex_framework.g() { // from class: com.taobao.android.detail2.core.framework.base.weex.a.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.g
                public void onDestroyed(MUSDKInstance mUSDKInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onForeground(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onPrepareSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshFailed(p pVar, int i, String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar});
                        return;
                    }
                    a.a(a.this, a.p());
                    if (a.d(a.this) == null) {
                        return;
                    }
                    a.d(a.this).a(a.this, 0, 0);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderFailed(p pVar, int i, String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    a.a(a.this, a.q());
                    if (a.d(a.this) == null) {
                        return;
                    }
                    a.d(a.this).c(a.this, String.valueOf(i), str);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshSuccess(p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
                    } else if (a.d(a.this) == null) {
                    } else {
                        a.d(a.this).b(a.this, 0, 0);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onJSException(p pVar, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
                    } else if (a.d(a.this) == null) {
                    } else {
                        a.d(a.this).a(a.this, String.valueOf(i), str);
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onFatalException(p pVar, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
                        return;
                    }
                    a.a(a.this, a.q());
                    if (a.d(a.this) == null) {
                        return;
                    }
                    a.d(a.this).b(a.this, String.valueOf(i), str);
                }
            });
            if (!ipa.T()) {
                return;
            }
            hnj.a(this.j);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.i) {
            p pVar = this.j;
            return pVar == null ? "-1" : String.valueOf(pVar.getInstanceId());
        }
        nlb.a("getInstanceId_is_weex_v1", null);
        return "-1";
    }

    public void a(View view) {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!this.i || (pVar = this.j) == null) {
        } else {
            pVar.setGestureConsumptionView(view);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(str, (Object) jSONObject);
        if (this.i) {
            if (this.j == null) {
                return;
            }
            fjt.a(fjt.TAG_RENDER, this.j + "sendEvent: " + str);
            this.j.fireEvent(2, "newdetailcallback", jSONObject2);
            return;
        }
        nlb.a("sendEvent_is_weex_v1", null);
    }

    public void a(String str, String str2, Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b274c987", new Object[]{this, str, str2, map, jSONObject});
        } else if (this.i) {
            p pVar = this.j;
            if (pVar == null) {
                return;
            }
            pVar.initWithURL(Uri.parse(str2));
            this.j.render(jSONObject, map);
            this.q = d;
        } else {
            nlb.a("renderByUrl_is_weex_v1", str2);
        }
    }

    public void b(String str, final String str2, final Map<String, Object> map, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7c8e88", new Object[]{this, str, str2, map, jSONObject});
        } else if (this.p) {
            if (this.i) {
                p pVar = this.j;
                if (pVar == null) {
                    return;
                }
                pVar.initWithURL(Uri.parse(str2));
                this.j.render(jSONObject, map);
                this.q = d;
                return;
            }
            nlb.a("renderByUrl_is_weex_v1", str2);
        } else {
            this.k = new Runnable() { // from class: com.taobao.android.detail2.core.framework.base.weex.a.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!a.e(a.this)) {
                        nlb.a("renderByUrl_is_weex_v1", str2);
                    } else if (a.g(a.this) == null) {
                    } else {
                        a.g(a.this).initWithURL(Uri.parse(str2));
                        a.g(a.this).render(jSONObject, map);
                        a.a(a.this, a.r());
                    }
                }
            };
        }
    }

    public HashMap<String, String> b() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        }
        if (this.i && (pVar = this.j) != null) {
            return ((MUSDKInstance) pVar).getPerformanceInfo();
        }
        return null;
    }

    public void d() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.r = true;
        if (!this.i || (pVar = this.j) == null) {
            return;
        }
        pVar.destroy();
    }

    public void e() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.i || (pVar = this.j) == null) {
        } else {
            pVar.onActivityStop();
        }
    }

    public void f() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.i || (pVar = this.j) == null) {
        } else {
            pVar.onActivityStart();
        }
    }

    public void g() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.i || (pVar = this.j) == null) {
        } else {
            pVar.onActivityResume();
        }
    }

    public void h() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.i || (pVar = this.j) == null) {
        } else {
            pVar.onActivityPause();
        }
    }

    public void i() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!this.i || (pVar = this.j) == null) {
        } else {
            pVar.destroy();
        }
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        if (this.i) {
            p pVar = this.j;
            if (pVar instanceof MUSDKInstance) {
                return ((MUSDKInstance) pVar).getInstanceEnv("bundleUrl");
            }
        }
        return "";
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.i;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.i && this.q == b;
    }

    public p m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("180ae9f1", new Object[]{this}) : this.j;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.n;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void o() {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (!this.i || (pVar = this.j) == null) {
        } else {
            ((MUSDKInstance) pVar).forceBeginFrame();
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.i || this.j == null) {
        } else {
            ((MUSDKInstance) this.j).setConstrainedSize(new com.taobao.android.weex_framework.ui.a(i, i2));
        }
    }

    public void a(jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f029d413", new Object[]{this, jvqVar});
            return;
        }
        this.h = jvqVar;
        if (!this.i || this.j == null) {
            return;
        }
        fjt.a(fjt.TAG_RENDER, "调用AliDetailWeexInstance setGestureEventListener成功");
        this.j.setGestureEventListener(jvqVar);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.g;
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e = i;
        this.f = i2;
    }
}
