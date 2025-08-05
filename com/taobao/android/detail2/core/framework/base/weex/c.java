package com.taobao.android.detail2.core.framework.base.weex;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.e;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.util.k;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bga;
import tb.fjp;
import tb.fjt;
import tb.fkp;
import tb.fkr;
import tb.fkt;
import tb.ipa;
import tb.jvq;
import tb.kge;
import tb.nlb;

/* loaded from: classes5.dex */
public class c implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailWeexContainer";

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.detail2.core.framework.base.weex.a f11492a;
    private com.taobao.android.detail2.core.framework.b b;
    private String c;
    private boolean d;
    private Map<String, String> e;
    private JSONObject f;
    private String i;
    private String j;
    private String k;
    private FrameLayout l;
    private BroadcastReceiver m;
    private View n;
    private boolean o;
    private boolean p;
    private jvq u;
    private int v;
    private int w;
    private List<com.taobao.android.detail2.core.framework.base.weex.b> g = new ArrayList();
    private C0456c h = new C0456c();
    private int q = 0;
    private boolean t = ipa.bc();
    private List<b> r = new ArrayList();
    private List<a> s = new ArrayList();

    /* renamed from: com.taobao.android.detail2.core.framework.base.weex.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0456c {

        /* renamed from: a  reason: collision with root package name */
        public String f11499a;
        public int b;
        public String c;
        public boolean d;

        static {
            kge.a(-1784068701);
        }
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfcd13b0", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.w = i;
        return i;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.base.weex.a a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.base.weex.a) ipChange.ipc$dispatch("15091ca6", new Object[]{cVar}) : cVar.f11492a;
    }

    public static /* synthetic */ void a(c cVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96e5f0c", new Object[]{cVar, view});
        } else {
            cVar.a(view);
        }
    }

    public static /* synthetic */ int b(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a42b431", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.v = i;
        return i;
    }

    public static /* synthetic */ FrameLayout d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("4f3808d6", new Object[]{cVar}) : cVar.l;
    }

    public static /* synthetic */ fkr e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("1da9f017", new Object[]{cVar}) : cVar.l();
    }

    public static /* synthetic */ boolean f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23258e5", new Object[]{cVar})).booleanValue() : cVar.o;
    }

    public static /* synthetic */ boolean g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8362444", new Object[]{cVar})).booleanValue() : cVar.q();
    }

    public static /* synthetic */ List h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("50e8d0c8", new Object[]{cVar}) : cVar.s;
    }

    static {
        kge.a(275314911);
        kge.a(543928825);
        try {
            MUSEngine.registerModule("newdetail_message", DetailWeexV2Module.class);
            MUSEngine.registerModule(VideoWeexModule.MODULE_NAME, VideoWeexModule.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public c(com.taobao.android.detail2.core.framework.b bVar, String str, String str2, String str3) {
        a(bVar);
        this.i = str;
        this.j = str2;
        this.k = str3;
    }

    private void a(com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b7157", new Object[]{this, bVar});
            return;
        }
        this.b = bVar;
        this.m = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent == null || !WXSDKInstance.e.equals(intent.getAction())) {
                } else {
                    String stringExtra = intent.getStringExtra("instanceId");
                    if (TextUtils.isEmpty(stringExtra) || c.a(c.this) == null || !stringExtra.equals(c.a(c.this).a())) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("收到weexreload的广播，强制销毁重渲染，instanceId: ");
                    sb.append(stringExtra);
                    sb.append(", itemID: ");
                    c cVar = c.this;
                    sb.append(c.$ipChange.f11499a);
                    sb.append(", index: ");
                    c cVar2 = c.this;
                    sb.append(c.$ipChange.b);
                    sb.append(", containerName: ");
                    c cVar3 = c.this;
                    sb.append(c.$ipChange.c);
                    String sb2 = sb.toString();
                    c cVar4 = c.this;
                    fjp.b(fjp.SCENE_WEEX_CONTAINER, fjp.ERROR_CODE_WEEX_RELOAD_BROADCAST, sb2, c.$ipChange.h().T());
                    c.this.c();
                }
            }
        };
        Activity g = this.b.g();
        if (g == null) {
            return;
        }
        g.registerReceiver(this.m, new IntentFilter("INSTANCE_RELOAD"));
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(i);
    }

    public void a(C0456c c0456c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289d5767", new Object[]{this, c0456c});
        } else if (c0456c == null) {
        } else {
            this.h = c0456c;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public void a(com.taobao.android.detail2.core.framework.base.weex.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41eeba7", new Object[]{this, bVar});
        } else {
            this.g.add(bVar);
        }
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            view.setTag("mountUniqId".hashCode(), this.i);
            view.setTag("mountBizType".hashCode(), this.j);
            view.setTag("mountNewDetailContainer".hashCode(), this.b.f());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b.g() == null) {
            fjp.b("main", fjp.ERROR_CODE_COMMON_CONTEXT_NULL, "上下文为空，forceReload停止执行", l().T());
        } else if (this.q > 3) {
        } else {
            n();
            a(this.e, this.f);
            this.q++;
            if (this.h != null) {
                fjt.a(fjt.TAG_RENDER, "触发了重新渲染, itemId: " + this.h.f11499a + ", index: " + this.h.b);
                return;
            }
            fjt.a(fjt.TAG_RENDER, "触发了重新渲染");
        }
    }

    private fkr l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("63a6bd86", new Object[]{this}) : this.b.h();
    }

    private fkt m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkt) ipChange.ipc$dispatch("6b586323", new Object[]{this}) : l().b();
    }

    public com.taobao.android.detail2.core.framework.base.weex.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.framework.base.weex.a) ipChange.ipc$dispatch("42ff31cb", new Object[]{this}) : this.f11492a;
    }

    public void a(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a16adc", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            if (l().r().e(l().k().W)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewAt(indexOfChild);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                this.l = new FrameLayout(this.b.g());
                viewGroup.addView(this.l, indexOfChild, layoutParams);
            } else {
                viewStub.setLayoutResource(R.layout.newdetail_weex_container_layout);
                this.l = (FrameLayout) viewStub.inflate();
            }
            if (!this.t) {
                return;
            }
            r();
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (this.l == null) {
        } else {
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.taobao.android.detail2.core.framework.base.weex.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public int b = ipa.a("layout_max_count", 10);

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    int i9 = this.b;
                    this.b = i9 - 1;
                    if (i9 <= 0) {
                        fjt.a(fjt.TAG_TIP, "Weex 容器高度的监听超过限制次数。当前限制次数." + this.b);
                        c.d(c.this).removeOnLayoutChangeListener(this);
                        return;
                    }
                    int width = c.d(c.this).getWidth();
                    int height = c.d(c.this).getHeight();
                    c.b(c.this, width);
                    c.a(c.this, height);
                    if (c.a(c.this) == null) {
                        return;
                    }
                    c.a(c.this).b(width, height);
                    if (!c.a(c.this).c()) {
                        return;
                    }
                    fjt.a(fjt.TAG_TIP, "hasInitWeexInstanceData , Weex 容器高度的监听取消。onLayoutMaxCount:" + this.b + " containerWidth:" + width + " containerHeight:" + height);
                    c.d(c.this).removeOnLayoutChangeListener(this);
                }
            };
            this.v = this.l.getWidth();
            this.w = this.l.getHeight();
            this.l.addOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(i);
    }

    private void a(e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c061fe7", new Object[]{this, aVar});
            return;
        }
        this.p = true;
        com.taobao.android.detail2.core.framework.base.weex.a aVar2 = this.f11492a;
        if (aVar2 != null) {
            aVar2.d();
        }
        this.f11492a = new com.taobao.android.detail2.core.framework.base.weex.a(this.b, this.d, new com.taobao.android.weex_framework.f() { // from class: com.taobao.android.detail2.core.framework.base.weex.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    return;
                }
                c.a(c.this, view);
                c.d(c.this).removeAllViews();
                if (view == null) {
                    fjp.b(fjp.SCENE_WEEX_CONTAINER, fjp.ERROR_CODE_WEEX_VIEW_NULL, "实例复用的时候view返回的是空的", c.e(c.this).T());
                }
                c.d(c.this).addView(view);
            }
        }, aVar, this);
        s();
        View view = this.n;
        if (view != null) {
            this.f11492a.a(view);
        }
        if (this.u != null) {
            fjt.a(fjt.TAG_RENDER, "fillInstance时机设置gestureListener成功, itemId: " + this.h.f11499a + ", index: " + this.h.b + ", containerName: " + this.h.c);
            this.f11492a.a(this.u);
        }
        if (this.d) {
            bga.c.a("newDetail", fkp.TINCT_LOAD_OPT, fkp.TINCT_LOAD_OPT_WEEX_V2_KEEP_LIVE, "default", true);
        } else {
            bga.c.a("newDetail", fkp.TINCT_LOAD_OPT, fkp.TINCT_LOAD_OPT_WEEX_KEEP_LIVE, "default", true);
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.v <= 0 && this.w <= 0) {
        } else {
            FrameLayout frameLayout = this.l;
            int width = frameLayout == null ? 0 : frameLayout.getWidth();
            FrameLayout frameLayout2 = this.l;
            if (frameLayout2 != null) {
                i = frameLayout2.getHeight();
            }
            com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f11492a;
            if (aVar == null) {
                return;
            }
            if (width > 0 && i > 0) {
                aVar.b(width, i);
                fjt.a(fjt.TAG_TIP, "WeexUseContainerSize: refreshWeexContainerSize newWidth:" + width + " height:" + i);
                return;
            }
            this.f11492a.b(this.v, this.w);
            fjt.a(fjt.TAG_TIP, "WeexUseContainerSize: refreshWeexContainerSize mContainerViewWidth:" + this.v + " mContainerViewHeight:" + this.w);
        }
    }

    public void a(String str, Map<String, String> map, JSONObject jSONObject, e.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fddc362", new Object[]{this, str, map, jSONObject, aVar, new Boolean(z)});
        } else if (this.o && !k.b(str)) {
            fjt.a(fjt.TAG_RENDER, "DetailWeexContainer binddata mNeedPendingRender为true，延迟渲染任务,index: " + this.h.b + ", itemId: " + this.h.f11499a + ", containerName: " + this.h.c);
            nlb.a("bindData_is_weex_v1", str);
        } else if (TextUtils.isEmpty(str)) {
            if (aVar != null) {
                fjt.a(fjt.TAG_RENDER, "DetailWeexContainer binddata url 为空，销毁weexInstanceWrapper, itemid: " + this.h.f11499a + ", index: " + this.h.b + ", containerName: " + this.h.c);
                aVar.a();
            }
            fjp.b(fjp.SCENE_WEEX_CONTAINER, fjp.ERROR_CODE_WEEX_URL_EMPTY, "weex下发url为空, itemId: " + this.h.f11499a + ", index: " + this.h.b + ", containerName: " + this.h.c, l().T());
            for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
                if (bVar != null) {
                    bVar.a(this.f11492a, ContainerError.WEEX_URL_EMPTY, "weex url为空");
                }
            }
        } else if (this.f11492a == null || TextUtils.isEmpty(this.c) || !this.c.equals(str)) {
            if (!str.equals(this.c) && !TextUtils.isEmpty(this.c)) {
                fjp.b(fjp.SCENE_WEEX_CONTAINER, fjp.ERROR_CODE_WEEX_URL_CHANGE, "weex下发url不一致, beforeUrl: " + this.c + ", afterUrl: " + str + ", itemid: " + this.h.f11499a + ", index: " + this.h.b + ", containerName: " + this.h.c, l().T());
                for (com.taobao.android.detail2.core.framework.base.weex.b bVar2 : this.g) {
                    if (bVar2 != null) {
                        com.taobao.android.detail2.core.framework.base.weex.a aVar2 = this.f11492a;
                        ContainerError containerError = ContainerError.WEEX_URL_INCONSISTENT;
                        bVar2.a(aVar2, containerError, "weex url不一致，beforeUrl: " + this.c + ", afterUrl: " + str);
                    }
                }
            }
            this.c = str;
            d(str);
            if (ipa.I() && aVar != null && aVar.f11500a != null) {
                a(aVar);
                b(jSONObject);
            } else if (!a(this.d, aVar)) {
                if (aVar != null) {
                    fjt.a(fjt.TAG_RENDER, "DetailWeexContainer weex版本与缓存版本不一致，销毁weexInstanceWrapper, itemId: " + this.h.f11499a + ", index: " + this.h.b + ", containerName: " + this.h.c);
                    aVar.a();
                }
                if (ipa.P()) {
                    a(map, jSONObject, (e.a) null, z);
                    return;
                }
                nlb.a("weex_sync_delete_code", "hitIndependentV2AsyncAll-reCreateViewContainer error, sjs:" + ipa.ba());
                n();
                a(map, jSONObject);
            } else {
                a(aVar);
                b(jSONObject);
            }
        } else {
            if (aVar != null) {
                fjt.a(fjt.TAG_RENDER, "DetailWeexContainer weex版本与缓存不一致，销毁InstanceWrapper, itemId:" + this.h.f11499a + ", index: " + this.h.b + ", containerName: " + this.h.c);
                aVar.a();
            }
            c(jSONObject);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        if (ipa.z()) {
            if ("true".equals(this.f11492a.m().getTag("hasSendDataWhenNav"))) {
                return;
            }
        } else {
            View renderRoot = this.f11492a.m().getRenderRoot();
            if (renderRoot == null || renderRoot.getTag("hasSendDataWhenNav".hashCode()) != null) {
                return;
            }
        }
        c(jSONObject);
        this.f11492a.o();
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (k.b(str)) {
            this.d = true;
            bga.c.a("newDetail", fkp.TINCT_LOAD_OPT, fkp.TINCT_LOAD_OPT_WEEX_V2, "default", true);
        } else {
            nlb.a("updateWeexV2Mode_is_weex_v1", str);
            this.d = false;
        }
    }

    private boolean a(boolean z, e.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("baf2f567", new Object[]{this, new Boolean(z), aVar})).booleanValue() : (aVar == null || !z || aVar.f11500a == null) ? false : true;
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (this.f11492a == null) {
        } else {
            fjt.a(fjt.TAG_RENDER, this.f11492a + "sendevent，向weex容器发送消息：" + str);
            this.f11492a.a(str, jSONObject);
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f11492a != null && !TextUtils.isEmpty(this.c) && this.c.equals(str);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            b((e.a) null);
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject, e.a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0089018", new Object[]{this, map, jSONObject, aVar, new Boolean(z)});
            return;
        }
        String str2 = this.c;
        if (map != null) {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            str = buildUpon.toString();
        } else {
            str = str2;
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar2 = this.f11492a;
        if (aVar2 != null) {
            aVar2.d();
        }
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.a();
            }
        }
        this.f11492a = new com.taobao.android.detail2.core.framework.base.weex.a(this.b, this.d, new com.taobao.android.weex_framework.f() { // from class: com.taobao.android.detail2.core.framework.base.weex.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    return;
                }
                c.a(c.this, view);
                if (c.f(c.this) && c.g(c.this)) {
                    c.h(c.this).add(new a(view));
                    return;
                }
                c.d(c.this).removeAllViews();
                c.d(c.this).addView(view);
            }
        }, aVar, this, str, z, jSONObject);
        s();
        View view = this.n;
        if (view != null) {
            this.f11492a.a(view);
        }
        if (this.u != null) {
            fjt.a(fjt.TAG_RENDER, "reCreateViewContainerAndRenderUrlForAsync时机设置gestureListener成功,index: " + this.h.b + ", itemId: " + this.h.f11499a + ", containerName: " + this.h.c);
            this.f11492a.a(this.u);
        }
        o();
        fjt.a(fjt.TAG_RENDER, "beforeRenderUrl: " + str + ", currentTime: " + System.currentTimeMillis());
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar2 : this.g) {
            if (bVar2 != null) {
                bVar2.a(this.f11492a, str, jSONObject);
            }
        }
        this.p = false;
        this.f11492a.b(str2, str, null, jSONObject);
    }

    private void b(e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0448f86", new Object[]{this, aVar});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar2 = this.f11492a;
        if (aVar2 != null) {
            aVar2.d();
        }
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.a();
            }
        }
        this.f11492a = new com.taobao.android.detail2.core.framework.base.weex.a(this.b, this.d, new com.taobao.android.weex_framework.f() { // from class: com.taobao.android.detail2.core.framework.base.weex.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                    return;
                }
                c.a(c.this, view);
                if (c.f(c.this) && c.g(c.this)) {
                    c.h(c.this).add(new a(view));
                    return;
                }
                c.d(c.this).removeAllViews();
                c.d(c.this).addView(view);
            }
        }, null, this);
        View view = this.n;
        if (view != null) {
            this.f11492a.a(view);
        }
        if (this.u != null) {
            fjt.a(fjt.TAG_RENDER, "reCreateViewContainer时机设置gestureListener成功,index: " + this.h.b + ", itemId: " + this.h.f11499a + ", containerName: " + this.h.c);
            this.f11492a.a(this.u);
        }
        o();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        String j = this.f11492a.j();
        if (!TextUtils.isEmpty(j)) {
            hashMap.put("mPageName", j);
        }
        hashMap.put("isWeexV2", Boolean.valueOf(this.f11492a.k()));
        com.alibaba.aliweex.d.a().a("new_detail", hashMap);
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fa073", new Object[]{this, map, jSONObject});
            return;
        }
        this.f = jSONObject;
        this.e = map;
        String str2 = this.c;
        if (map != null) {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            str = buildUpon.toString();
        } else {
            str = str2;
        }
        fjt.a(fjt.TAG_RENDER, "beforeRenderUrl: " + str + ", currentTime: " + System.currentTimeMillis());
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.a(this.f11492a, str, jSONObject);
            }
        }
        this.p = false;
        this.f11492a.a(str2, str, null, jSONObject);
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.f11492a != null) {
            this.f = jSONObject;
            if (p()) {
                c();
                return;
            }
            for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
                if (bVar != null) {
                    bVar.a(this.f11492a, jSONObject);
                }
            }
            a(this.k, jSONObject);
            fjt.a(fjt.TAG_RENDER, this.k + "刷新weex数据，当前卡片,index: " + this.h.b + ", itemId: " + this.h.f11499a + ", containerName: " + this.h.c);
        }
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f11492a;
        if (aVar != null) {
            return aVar.l();
        }
        return !this.p;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.o = true;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.o) {
        } else {
            this.o = false;
            if (q()) {
                a(this.s);
            } else {
                nlb.a("triggerRender_is_weex_v1", null);
            }
        }
    }

    private void a(List<? extends Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            for (Runnable runnable : list) {
                if (runnable != null) {
                    runnable.run();
                }
            }
            list.clear();
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350b2c8a", new Object[]{this, aVar, view});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.a(aVar, view);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266c25a8", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
            return;
        }
        fjt.a(fjt.TAG_RENDER, "onWeexViewRenderSuccess" + aVar.j() + ", instanceID: " + aVar.a());
        this.p = true;
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.a(aVar, i, i2);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void b(com.taobao.android.detail2.core.framework.base.weex.a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baaa9547", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.b(aVar, i, i2);
            }
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5805a85c", new Object[]{this, aVar, str, str2});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.a(aVar, str, str2);
            }
        }
        a(aVar, str, str2, "20002");
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void b(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3887703b", new Object[]{this, aVar, str, str2});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.b(aVar, str, str2);
            }
        }
        a(aVar, str, str2, fjp.ERROR_CODE_WEEX_RENDER_FATAL_EXCEPTION);
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.f
    public void c(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1909381a", new Object[]{this, aVar, str, str2});
            return;
        }
        for (com.taobao.android.detail2.core.framework.base.weex.b bVar : this.g) {
            if (bVar != null) {
                bVar.c(aVar, str, str2);
            }
        }
        a(aVar, str, str2, fjp.ERROR_CODE_WEEX_RENDER_FAILED);
    }

    private void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cebf326", new Object[]{this, aVar, str, str2, str3});
            return;
        }
        JSONObject a2 = a(aVar);
        a2.put("weexErrorCode", (Object) str);
        a2.put("weexErrorMsg", (Object) str2);
        fjp.b(fjp.SCENE_WEEX_CONTAINER, str3, "weex渲染失败: " + a2.toJSONString(), l().T());
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.d;
    }

    private JSONObject a(com.taobao.android.detail2.core.framework.base.weex.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("616e0268", new Object[]{this, aVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWeexV2", (Object) Boolean.valueOf(aVar.k()));
        jSONObject.put("weexUrl", (Object) aVar.j());
        jSONObject.put("itemId", (Object) this.h.f11499a);
        jSONObject.put("containerName", (Object) this.h.c);
        jSONObject.put("index", (Object) Integer.valueOf(this.h.b));
        return jSONObject;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c = null;
        com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f11492a;
        if (aVar != null) {
            aVar.i();
        }
        Activity g = this.b.g();
        try {
            if (this.m != null && g != null) {
                g.unregisterReceiver(this.m);
            }
        } catch (Throwable th) {
            fjt.a(fjt.TAG_RENDER, th.toString());
        }
        for (b bVar : this.r) {
            if (bVar != null) {
                bVar.a();
            }
        }
        this.r.clear();
        this.g.clear();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f11492a;
        if (aVar == null) {
            return;
        }
        aVar.e();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f11492a;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.f11492a == null || !"foreground".equals(str)) {
        } else {
            this.f11492a.g();
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.f11492a == null || !"background".equals(str)) {
        } else {
            if (m().aQ()) {
                fjt.a(fjt.TAG_RENDER, "onPause新的weex生命周期调用");
                this.f11492a.h();
                return;
            }
            this.f11492a.h();
            this.f11492a.e();
        }
    }

    public void a(jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f029d413", new Object[]{this, jvqVar});
            return;
        }
        this.u = jvqVar;
        if (this.f11492a == null) {
            return;
        }
        fjt.a(fjt.TAG_RENDER, "调用DetailWeexContainer setGestureEventListener成功,index: " + this.h.b + ", itemId: " + this.h.f11499a + ", containerName: " + this.h.c);
        this.f11492a.a(jvqVar);
    }

    public View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.l;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.d;
    }

    /* loaded from: classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f11498a;
        private String b;
        private Map<String, String> c;
        private JSONObject d;
        private e.a e;

        static {
            kge.a(1997121414);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f11498a.a(this.b, this.c, this.d, this.e, false);
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            e.a aVar = this.e;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View b;

        static {
            kge.a(1826312656);
            kge.a(-1390502639);
        }

        public a(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c.d(c.this).removeAllViews();
            c.d(c.this).addView(this.b);
        }
    }
}
