package com.alibaba.android.ultron.vfw.weex2;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.s;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.q;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.abn;
import tb.adh;
import tb.cts;
import tb.iro;
import tb.jqg;
import tb.jvb;
import tb.kge;
import tb.spk;
import tb.tbt;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static f f2764a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, p pVar);
    }

    static {
        kge.a(-75136776);
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("2df3e717", new Object[0]);
        }
        if (f2764a == null) {
            synchronized (f.class) {
                if (f2764a == null) {
                    f2764a = new f();
                }
            }
        }
        return f2764a;
    }

    public String a(Context context, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f530fa4c", new Object[]{this, context, str, str2, new Integer(i), new Integer(i2)}) : a(context, str, str2, UltronTradeHybridInstanceRenderMode.UNSPECIFIC, i, i2);
    }

    public String a(Context context, String str, String str2, String str3, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551e6d42", new Object[]{this, context, str, str2, str3, new Integer(i), new Integer(i2)});
        }
        if (i <= 0 || i2 <= 0) {
            UnifyLog.d("UltronWeex2InstanceFactory.generateInstanceByPreRender", "width or height invalid");
            return null;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.c(str2);
        char c = 65535;
        int hashCode = str3.hashCode();
        if (hashCode != -1853231955) {
            if (hashCode != -1417816805) {
                if (hashCode == -606646581 && str3.equals(UltronTradeHybridInstanceRenderMode.UNSPECIFIC)) {
                    c = 2;
                }
            } else if (str3.equals(UltronTradeHybridInstanceRenderMode.TEXTURE)) {
                c = 0;
            }
        } else if (str3.equals(UltronTradeHybridInstanceRenderMode.SURFACE)) {
            c = 1;
        }
        if (c == 0) {
            mUSInstanceConfig.f(false);
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        } else if (c == 1) {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.surface);
        } else if (StringUtils.equals(adh.a(str2, "renderMode"), UltronTradeHybridInstanceRenderMode.SURFACE)) {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.surface);
        } else {
            mUSInstanceConfig.f(false);
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        }
        String a2 = adh.a(str2, "wx_opaque");
        if (StringUtils.equals(a2, "0")) {
            mUSInstanceConfig.f(false);
        } else if (StringUtils.equals(a2, "1")) {
            mUSInstanceConfig.f(true);
        }
        mUSInstanceConfig.a(new com.taobao.android.weex_framework.f() { // from class: com.alibaba.android.ultron.vfw.weex2.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                } else if (view == null) {
                    UnifyLog.d("UltronWeex2InstanceFactory.generateInstanceByPreRender", "onCreateView:view is null");
                } else {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
            }
        });
        String str4 = str + "_" + System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) str4);
        jSONObject.put("bundleUrl", (Object) str2);
        jSONObject.put(tbt.PRE_RENDER, (Object) true);
        q.a().a(context, mUSInstanceConfig, jSONObject, i, i2);
        return str4;
    }

    public MUSDKInstance a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("18df8e88", new Object[]{this, str, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(tbt.PRE_RENDER, (Object) Boolean.valueOf(z));
        return q.a().a(str, jSONObject);
    }

    @Deprecated
    public p a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("d69076a7", new Object[]{this, context, str}) : a(context, str, UltronTradeHybridInstanceRenderMode.UNSPECIFIC);
    }

    public p a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("6e4dccf1", new Object[]{this, context, str, str2});
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -1853231955) {
            if (hashCode != -1417816805) {
                if (hashCode == -606646581 && str2.equals(UltronTradeHybridInstanceRenderMode.UNSPECIFIC)) {
                    c = 2;
                }
            } else if (str2.equals(UltronTradeHybridInstanceRenderMode.TEXTURE)) {
                c = 0;
            }
        } else if (str2.equals(UltronTradeHybridInstanceRenderMode.SURFACE)) {
            c = 1;
        }
        if (c == 0) {
            mUSInstanceConfig.f(false);
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        } else if (c == 1) {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.surface);
        } else if (StringUtils.equals(adh.a(str, "renderMode"), UltronTradeHybridInstanceRenderMode.SURFACE)) {
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.surface);
        } else {
            mUSInstanceConfig.f(false);
            mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        }
        String a2 = adh.a(str, "wx_opaque");
        if (StringUtils.equals(a2, "0")) {
            mUSInstanceConfig.f(false);
        } else if (StringUtils.equals(a2, "1")) {
            mUSInstanceConfig.f(true);
        }
        mUSInstanceConfig.a(new com.taobao.android.weex_framework.f() { // from class: com.alibaba.android.ultron.vfw.weex2.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                } else if (view == null) {
                    UnifyLog.d("UltronWeex2InstanceFactory.generateInstance", "onCreateView:view is null");
                } else {
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
            }
        });
        if (!StringUtils.isEmpty(str)) {
            mUSInstanceConfig.c(str);
        }
        return q.a().a(context, mUSInstanceConfig);
    }

    public void a(Context context, int i, int i2, com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a aVar, CopyOnWriteArrayList<Pair<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a, Object>> copyOnWriteArrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0eb068", new Object[]{this, context, new Integer(i), new Integer(i2), aVar, copyOnWriteArrayList});
        } else {
            a(context, i, i2, aVar, copyOnWriteArrayList, (a) null);
        }
    }

    public void a(final Context context, int i, int i2, final com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a aVar, final CopyOnWriteArrayList<Pair<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a, Object>> copyOnWriteArrayList, final a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11d7e74", new Object[]{this, context, new Integer(i), new Integer(i2), aVar, copyOnWriteArrayList, aVar2});
        } else if (!spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, cts.a.QUERY_ASYNC_CREATE_INSTANCE, false)) {
            jqg.b("UltronWeex2InstanceFactory.asyncGenerateInstanceByPreRender", "switcher is off");
        } else if (i <= 0 || i2 <= 0) {
            jqg.b("UltronWeex2InstanceFactory.asyncGenerateInstanceByPreRender", "width or height invalid");
        } else {
            String str = aVar.b;
            WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
            String str2 = aVar.h;
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1853231955) {
                if (hashCode != -1417816805) {
                    if (hashCode == -606646581 && str2.equals(UltronTradeHybridInstanceRenderMode.UNSPECIFIC)) {
                        c = 2;
                    }
                } else if (str2.equals(UltronTradeHybridInstanceRenderMode.TEXTURE)) {
                    c = 0;
                }
            } else if (str2.equals(UltronTradeHybridInstanceRenderMode.SURFACE)) {
                c = 1;
            }
            if (c == 0) {
                weexUnicornConfig.a(true);
                weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
            } else if (c == 1) {
                weexUnicornConfig.a(WeexUnicornConfig.RenderMode.surface);
            } else if (StringUtils.equals(adh.a(str, "renderMode"), UltronTradeHybridInstanceRenderMode.SURFACE)) {
                weexUnicornConfig.a(WeexUnicornConfig.RenderMode.surface);
            } else {
                weexUnicornConfig.a(true);
                weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
            }
            String a2 = adh.a(str, "wx_opaque");
            if (StringUtils.equals(a2, "0")) {
                weexUnicornConfig.a(true);
            } else if (StringUtils.equals(a2, "1")) {
                weexUnicornConfig.a(false);
            }
            com.taobao.android.weex.config.b bVar = new com.taobao.android.weex.config.b();
            bVar.a(weexUnicornConfig);
            final String str3 = aVar.f2786a + "_" + System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizName", (Object) str3);
            jSONObject.put("bundleUrl", (Object) str);
            jSONObject.put(tbt.PRE_RENDER, (Object) true);
            com.taobao.android.weex.q b = com.taobao.android.weex.e.b(context, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, jSONObject, bVar);
            b.a(i, i2);
            b.a(str);
            b.a((WeexValue) null);
            final Pair<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a, Object> pair = new Pair<>(aVar, str3);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.add(pair);
            }
            b.a(new s() { // from class: com.alibaba.android.ultron.vfw.weex2.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex.s
                public void a(s.a aVar3) {
                    StringBuilder sb;
                    String str4;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8d89384", new Object[]{this, aVar3});
                        return;
                    }
                    Context context2 = context;
                    if (!(context2 instanceof Activity)) {
                        jqg.b("UltronWeex2InstanceFactory.asyncGenerateInstanceByPreRender", "context is not Activity");
                        return;
                    }
                    jvb adapterMUSInstance = ((WeexInstanceImpl) aVar3.a(context2)).getAdapterMUSInstance();
                    CopyOnWriteArrayList copyOnWriteArrayList2 = copyOnWriteArrayList;
                    if (copyOnWriteArrayList2 != null) {
                        copyOnWriteArrayList2.remove(pair);
                        copyOnWriteArrayList.add(new Pair(aVar, adapterMUSInstance));
                    }
                    a aVar4 = aVar2;
                    if (aVar4 != null) {
                        aVar4.a(str3, adapterMUSInstance);
                        sb = new StringBuilder();
                        str4 = "callback success: ";
                    } else {
                        abn abnVar = new abn(adapterMUSInstance);
                        adapterMUSInstance.registerRenderListener(abnVar);
                        adapterMUSInstance.setTag("bizId", str3);
                        adapterMUSInstance.setTag("bizLifecycleListener", abnVar);
                        sb = new StringBuilder();
                        str4 = "generate success: ";
                    }
                    sb.append(str4);
                    sb.append(str3);
                    jqg.b("UltronWeex2InstanceFactory.asyncGenerateInstanceByPreRender", sb.toString());
                    View renderRoot = adapterMUSInstance.getRenderRoot();
                    if (renderRoot == null) {
                        return;
                    }
                    ViewParent parent = renderRoot.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(renderRoot);
                    }
                    ViewGroup.LayoutParams layoutParams = renderRoot.getLayoutParams();
                    if (layoutParams == null) {
                        renderRoot.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        return;
                    }
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
            }).c();
        }
    }
}
