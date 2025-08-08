package com.alibaba.android.ultron.vfw.weex2;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.p;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.media.MessageID;
import tb.bmc;
import tb.bny;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class g extends com.alibaba.android.ultron.vfw.viewholder.b implements bmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout e;
    private p f;
    private String g;
    private a h;

    static {
        kge.a(1138513698);
        kge.a(372985376);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ FrameLayout a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("41371be9", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ a b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("68025153", new Object[]{gVar}) : gVar.h;
    }

    public static /* synthetic */ IDMComponent c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("6fdb42f6", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ IDMComponent d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("9f9276f7", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ IDMComponent e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("cf49aaf8", new Object[]{gVar}) : gVar.c;
    }

    public g(bny bnyVar) {
        super(bnyVar);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        this.e = new Weex2ContainerFrameLayout(this.f2738a.k());
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return this.e;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        this.c = iDMComponent;
        String a2 = i.a(iDMComponent);
        this.g = a2;
        if (StringUtils.isEmpty(a2)) {
            i.a(this.e, this.c);
            UnifyLog.d("Weex2ViewHolder.onBindData", "url is empty");
            return;
        }
        if (this.f == null) {
            this.f = a(this.f2738a.k(), a2);
            ((Weex2ContainerFrameLayout) this.e).initWeex2Instance(this.f);
            a(this.f);
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout instanceof Weex2ContainerFrameLayout) {
            ((Weex2ContainerFrameLayout) frameLayout).setDispatchEventState(iDMComponent);
        }
        JSONObject fields = this.c.getFields();
        if ((this.e instanceof Weex2ContainerFrameLayout) && fields != null && fields.getString("enableNestedScroll") != null && "true".equalsIgnoreCase(fields.getString("enableNestedScroll"))) {
            ((Weex2ContainerFrameLayout) this.e).setEnableNestedScroll(true);
        }
        if (this.f.isRenderCalled()) {
            this.f.refresh(fields, null);
            return;
        }
        if (fields != null) {
            a(fields);
        }
        this.f.initWithURL(Uri.parse(a2));
        this.f.render(fields, null);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b497d115", new Object[]{this, bVar});
            return;
        }
        FrameLayout frameLayout = this.e;
        if (!(frameLayout instanceof Weex2ContainerFrameLayout)) {
            return;
        }
        ((Weex2ContainerFrameLayout) frameLayout).setWeex2EventDispatch(bVar);
    }

    private void a(JSONObject jSONObject) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        q.a("weex2component", new WVWeex2JSBridgePlugin(this.e, this.c));
        if (!jSONObject.containsKey("style")) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("style");
            ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
            boolean containsKey = jSONObject2.containsKey("height");
            if (containsKey) {
                int a3 = a(this.f2738a.k(), jSONObject2.getInteger("height").intValue());
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, a3);
                } else {
                    layoutParams.height = a3;
                }
            }
            boolean containsKey2 = jSONObject2.containsKey("gravity");
            if (containsKey2 && (a2 = a(jSONObject2.getString("gravity"))) != 0 && (layoutParams instanceof FrameLayout.LayoutParams)) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = a2;
            }
            if (containsKey || containsKey2) {
                this.e.setLayoutParams(layoutParams);
            }
            if (!jSONObject2.containsKey(Constants.Name.PLACE_HOLDER)) {
                return;
            }
            String string = jSONObject2.getString(Constants.Name.PLACE_HOLDER);
            TUrlImageView tUrlImageView = new TUrlImageView(this.f2738a.k());
            tUrlImageView.setImageUrl(string);
            tUrlImageView.setVisibility(0);
            tUrlImageView.setScaleType(ImageView.ScaleType.FIT_START);
            this.e.addView(tUrlImageView, new ViewGroup.LayoutParams(-1, -1));
        } catch (Throwable unused) {
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f == null) {
        } else {
            jqg.b("weex2lifecycle", "onStart");
            this.f.onActivityStart();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f == null) {
        } else {
            jqg.b("weex2lifecycle", "onResume");
            this.f.onActivityResume();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.f == null) {
        } else {
            jqg.b("weex2lifecycle", "onPause");
            this.f.onActivityPause();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.f == null) {
        } else {
            jqg.b("weex2lifecycle", MessageID.onStop);
            this.f.onActivityStop();
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f == null) {
            UnifyLog.d("Weex2ViewHolder.onDestroy", "mMUSInstance is null");
        } else {
            q.b("weex2component");
            this.f.destroy();
        }
    }

    private p a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("d69076a7", new Object[]{this, context, str});
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.f(false);
        mUSInstanceConfig.c(str);
        mUSInstanceConfig.a(new com.taobao.android.weex_framework.f() { // from class: com.alibaba.android.ultron.vfw.weex2.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.f
            public void onCreateView(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1414cfeb", new Object[]{this, view});
                } else if (view == null) {
                    UnifyLog.d("Weex2ViewHolder.createWeex2Instance", "weex2View is null");
                } else if (g.a(g.this) == null) {
                    UnifyLog.d("Weex2ViewHolder.createWeex2Instance", "mRootView is null");
                } else {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    } else {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    }
                    view.setLayoutParams(layoutParams);
                }
            }
        });
        return com.taobao.android.weex_framework.q.a().a(context, mUSInstanceConfig);
    }

    private void a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        } else {
            pVar.registerRenderListener(new com.taobao.android.weex_framework.g() { // from class: com.alibaba.android.ultron.vfw.weex2.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.g
                public void onForeground(p pVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar2});
                    } else {
                        UnifyLog.b("Weex2ViewHolder.onForeground", "");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onPrepareSuccess(p pVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar2});
                    } else {
                        UnifyLog.b("Weex2ViewHolder.onPrepareSuccess", "");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderSuccess(p pVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar2});
                        return;
                    }
                    if (g.b(g.this) != null) {
                        g.b(g.this);
                        pVar2.getRenderView();
                    }
                    if (g.a(g.this) == null || g.c(g.this) == null) {
                        return;
                    }
                    g.a(g.this).addView(pVar2.getRenderRoot());
                    UnifyLog.b("Weex2ViewHolder.onRenderSuccess", "");
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderFailed(p pVar2, int i, String str, boolean z) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    if (g.b(g.this) != null) {
                        g.b(g.this);
                    } else {
                        i.a(g.a(g.this), g.d(g.this));
                    }
                    String[] strArr = new String[1];
                    if (("errorType:" + i + ",errorMsg:" + str) == null) {
                        str2 = "";
                    } else {
                        str2 = str + ",isFatal:" + z;
                    }
                    strArr[0] = str2;
                    UnifyLog.d("Weex2ViewHolder.onRenderFailed", strArr);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshSuccess(p pVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar2});
                    } else {
                        UnifyLog.b("Weex2ViewHolder.onRefreshSuccess", "");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshFailed(p pVar2, int i, String str, boolean z) {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    if (g.b(g.this) != null) {
                        g.b(g.this);
                    } else {
                        i.a(g.a(g.this), g.e(g.this));
                    }
                    String[] strArr = new String[1];
                    if (("errorType:" + i + ",errorMsg:" + str) == null) {
                        str2 = "";
                    } else {
                        str2 = str + ",isFatal:" + z;
                    }
                    strArr[0] = str2;
                    UnifyLog.d("Weex2ViewHolder.onRefreshFailed", strArr);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onJSException(p pVar2, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar2, new Integer(i), str});
                        return;
                    }
                    String[] strArr = new String[1];
                    if (("errorType:" + i + ",errorMsg:" + str) == null) {
                        str = "";
                    }
                    strArr[0] = str;
                    UnifyLog.d("Weex2ViewHolder.onJSException", strArr);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onFatalException(p pVar2, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar2, new Integer(i), str});
                        return;
                    }
                    String[] strArr = new String[1];
                    if (("errorType:" + i + ",errorMsg:" + str) == null) {
                        str = "";
                    }
                    strArr[0] = str;
                    UnifyLog.d("Weex2ViewHolder.onFatalException", strArr);
                }

                @Override // com.taobao.android.weex_framework.g
                public void onDestroyed(MUSDKInstance mUSDKInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                    } else {
                        UnifyLog.b("Weex2ViewHolder.onDestroyed", "");
                    }
                }
            });
        }
    }

    private static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue() : (i * context.getResources().getDisplayMetrics().widthPixels) / 375;
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 4;
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c = 0;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 48;
        }
        if (c == 1) {
            return 80;
        }
        if (c == 2) {
            return 3;
        }
        if (c == 3) {
            return 5;
        }
        return c != 4 ? 0 : 17;
    }
}
