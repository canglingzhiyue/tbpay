package com.taobao.themis.external.embed;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.external.embed.a;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.hij;
import tb.kge;
import tb.ljl;
import tb.qot;
import tb.swd;
import tb.tob;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002>?B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0019J$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0013J%\u0010\u001f\u001a\u0004\u0018\u0001H \"\b\b\u0000\u0010 *\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H 0#¢\u0006\u0002\u0010$J\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\f\u0012\u0006\b\u0001\u0012\u00020(\u0018\u00010#J\u000e\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020(J\b\u0010+\u001a\u00020\u0019H\u0002J\u0006\u0010,\u001a\u00020\u0019J \u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u000102J\u0006\u00103\u001a\u00020\u0019J\u0006\u00104\u001a\u00020\u0019J\u0006\u00105\u001a\u00020\u0019J\u0006\u00106\u001a\u00020\u0019J\u0006\u00107\u001a\u00020\u0019J\u000e\u00108\u001a\u00020\u00192\u0006\u00101\u001a\u000209J\u000e\u0010:\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u0015J\u001a\u0010<\u001a\u00020\u00192\u0006\u0010*\u001a\u00020(2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0006\u0010=\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/taobao/themis/external/embed/TMSEmbed;", "", "activity", "Landroid/app/Activity;", "solution", "Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;", "(Landroid/app/Activity;Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;)V", "(Landroid/app/Activity;)V", "mRootView", "Lcom/taobao/themis/external/embed/TMSEmbed$EmbedRootView;", "useSplashView", "", "(Landroid/app/Activity;Lcom/taobao/themis/external/embed/TMSEmbedSolutionType;Lcom/taobao/themis/external/embed/TMSEmbed$EmbedRootView;Z)V", "containerOnCreate", "", "containerStartTime", "mContainerHelper", "Lcom/taobao/themis/container/embed/TMSEmbedContainerHelper;", "mLogTraceId", "", "mRenderListener", "Lcom/taobao/themis/external/embed/TMSEmbed$IRenderListener;", "mSplashContainer", "Landroid/widget/FrameLayout;", "destroy", "", "dispatchEvent", "eventName", "params", "Lcom/alibaba/fastjson/JSON;", "target", "getExtend", "T", "Lcom/taobao/themis/kernel/extension/controller/IControllerExtension;", "clz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/taobao/themis/kernel/extension/controller/IControllerExtension;", "getRootView", "Landroid/view/View;", "getStartParamClass", "Lcom/taobao/themis/external/embed/StartParams;", "init", RVConstants.EXTRA_START_PARAMS, "initSplashView", "onActivityPause", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onActivityResume", "onActivityStart", "onActivityStop", "onViewAppear", "onViewDisappear", "refresh", "Lcom/alibaba/fastjson/JSONObject;", "registerRenderListener", DataReceiveMonitor.CB_LISTENER, "reload", "render", "EmbedRootView", "IRenderListener", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSEmbed {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private a.C0936a f22410a;
    private qot b;
    private EmbedRootView c;
    private String d;
    private FrameLayout e;
    private final Activity f;
    private TMSEmbedSolutionType g;
    private final boolean h;
    private long i;
    private long j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "errorCode", "", "kotlin.jvm.PlatformType", "errorMsg", "onJSError"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements f.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
            TMSEmbed.this = r1;
        }

        @Override // com.taobao.themis.kernel.f.d
        public final void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            a.C0936a d = TMSEmbed.d(TMSEmbed.this);
            if (d == null) {
                return;
            }
            if (str == null) {
                str = "JSError";
            }
            if (str2 == null) {
                str2 = "";
            }
            d.b(str, str2);
        }
    }

    static {
        kge.a(1267421027);
    }

    public TMSEmbed(Activity activity, TMSEmbedSolutionType tMSEmbedSolutionType, EmbedRootView mRootView, boolean z) {
        q.d(activity, "activity");
        q.d(mRootView, "mRootView");
        this.f = activity;
        this.g = tMSEmbedSolutionType;
        this.c = mRootView;
        this.h = z;
        this.d = "_embed";
        this.i = -1L;
        this.j = -1L;
        this.i = System.currentTimeMillis();
        com.taobao.themis.container.utils.b.a(this.f.getApplicationContext());
        this.j = System.currentTimeMillis();
        if (this.h) {
            j();
        }
        this.b = new qot(this.f, this.e, this.c);
    }

    public static final /* synthetic */ qot a(TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qot) ipChange.ipc$dispatch("4dd99d9a", new Object[]{tMSEmbed}) : tMSEmbed.b;
    }

    public static final /* synthetic */ String b(TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59772a8b", new Object[]{tMSEmbed}) : tMSEmbed.d;
    }

    public static final /* synthetic */ a.C0936a d(TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.C0936a) ipChange.ipc$dispatch("9340f5b8", new Object[]{tMSEmbed}) : tMSEmbed.f22410a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TMSEmbed(Activity activity, TMSEmbedSolutionType solution) {
        this(activity, solution, new EmbedRootView(activity), true);
        q.d(activity, "activity");
        q.d(solution, "solution");
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.f);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        t tVar = t.INSTANCE;
        this.e = frameLayout;
        this.c.addView(this.e);
    }

    public final void a(a.C0936a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641d4c9d", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.f22410a = listener;
    }

    public final void a(StartParams startParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1079f5d3", new Object[]{this, startParams});
            return;
        }
        q.d(startParams, "startParams");
        Uri build = Uri.parse(startParams.getUrl()).buildUpon().build();
        JSONObject jSONObject = new JSONObject();
        if (startParams instanceof Weex2StartParams) {
            jSONObject.put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_WEEX_INIT_DATA, (String) ((Weex2StartParams) startParams).getInitData());
        }
        boolean z = startParams instanceof WidgetStartParams;
        if (z) {
            WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
            String sceneParamValue = widgetStartParams.getSceneParamValue("sceneId");
            if (sceneParamValue != null) {
                jSONObject.put((JSONObject) "sceneId", sceneParamValue);
            }
            String sceneParamValue2 = widgetStartParams.getSceneParamValue("sellerId");
            if (sceneParamValue2 != null) {
                jSONObject.put((JSONObject) "sellerId", sceneParamValue2);
            }
        }
        a.C0936a c0936a = this.f22410a;
        if (c0936a != null) {
            c0936a.d();
        }
        qot qotVar = this.b;
        String uri = build.toString();
        q.b(uri, "uri.toString()");
        f a2 = qotVar.a(uri, jSONObject);
        this.b.a(ai.a(j.a("containerStart", String.valueOf(this.j)), j.a("containerOnCreate", String.valueOf(this.i))));
        String a3 = com.taobao.themis.kernel.logger.b.a(a2);
        String str = com.taobao.themis.kernel.logger.b.a(a2) + this.d;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "url", startParams.getUrl());
        TMSEmbedSolutionType tMSEmbedSolutionType = this.g;
        TMSSolutionType tMSSolutionType = null;
        jSONObject3.put((JSONObject) "solution", tMSEmbedSolutionType != null ? tMSEmbedSolutionType.name() : null);
        t tVar = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_EMBED, "ON_LAUNCH_START", a3, str, jSONObject2);
        a2.a(new a());
        this.b.a(new b(a2));
        if (z) {
            this.c.bindInstance(a2);
            WidgetStartParams widgetStartParams2 = (WidgetStartParams) startParams;
            a2.a(widgetStartParams2.getSpmOri());
            a2.a((Class<Class>) WidgetStartParams.class, (Class) startParams);
            a2.a((Class<Class>) com.taobao.themis.external.embed.a.class, (Class) new com.taobao.themis.external.embed.a(widgetStartParams2));
        }
        f a4 = this.b.a();
        if (a4 != null) {
            a4.a(new tob(a4));
        }
        qot qotVar2 = this.b;
        TMSEmbedSolutionType tMSEmbedSolutionType2 = this.g;
        if (tMSEmbedSolutionType2 != null) {
            tMSSolutionType = tMSEmbedSolutionType2.convert();
        }
        qotVar2.a(tMSSolutionType, new c(a2, startParams));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"com/taobao/themis/external/embed/TMSEmbed$init$5", "Lcom/taobao/themis/kernel/extension/instance/IPopPageExtension;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "getInstance", "()Lcom/taobao/themis/kernel/TMSInstance;", "onPop", "", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements swd {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f b;

        public b(f fVar) {
            TMSEmbed.this = r1;
            this.b = fVar;
        }

        @Override // tb.sud
        public void a(f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
                return;
            }
            q.d(instance, "instance");
            swd.a.a(this, instance);
        }

        @Override // tb.sud
        public void bQ_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfab7697", new Object[]{this});
            } else {
                swd.a.b(this);
            }
        }

        @Override // tb.swd
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            String a2 = com.taobao.themis.kernel.logger.b.a(this.b);
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_EMBED, "ON_POP", a2, com.taobao.themis.kernel.logger.b.a(this.b) + TMSEmbed.b(TMSEmbed.this), new JSONObject());
            a.C0936a d = TMSEmbed.d(TMSEmbed.this);
            if (d == null) {
                return;
            }
            d.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/taobao/themis/external/embed/TMSEmbed$init$7", "Lcom/taobao/themis/kernel/TMSInstance$IRenderListener;", "onLaunchSuccess", "", "onRenderError", "error", "Lcom/taobao/themis/kernel/TMSError;", "onRenderReady", ljl.RENDER_SUCCESS_TIME, "themis_interface_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements f.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ f b;
        public final /* synthetic */ StartParams c;

        public c(f fVar, StartParams startParams) {
            TMSEmbed.this = r1;
            this.b = fVar;
            this.c = startParams;
        }

        @Override // com.taobao.themis.kernel.f.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            String a2 = com.taobao.themis.kernel.logger.b.a(this.b);
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_EMBED, "ON_LAUNCH_FINISH", a2, com.taobao.themis.kernel.logger.b.a(this.b) + TMSEmbed.b(TMSEmbed.this), new JSONObject());
            a.C0936a d = TMSEmbed.d(TMSEmbed.this);
            if (d == null) {
                return;
            }
            d.e();
        }

        @Override // com.taobao.themis.kernel.f.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            String a2 = com.taobao.themis.kernel.logger.b.a(this.b);
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_EMBED, "ON_RENDER_START", a2, com.taobao.themis.kernel.logger.b.a(this.b) + TMSEmbed.b(TMSEmbed.this), new JSONObject());
            a.C0936a d = TMSEmbed.d(TMSEmbed.this);
            if (d == null) {
                return;
            }
            d.c();
        }

        @Override // com.taobao.themis.kernel.f.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            String a2 = com.taobao.themis.kernel.logger.b.a(this.b);
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_EMBED, "ON_RENDER_SUCCESS", a2, com.taobao.themis.kernel.logger.b.a(this.b) + TMSEmbed.b(TMSEmbed.this), new JSONObject());
            a.C0936a d = TMSEmbed.d(TMSEmbed.this);
            if (d == null) {
                return;
            }
            d.a();
        }

        @Override // com.taobao.themis.kernel.f.c
        public void a(e error) {
            Boolean bool;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0cb15ce", new Object[]{this, error});
                return;
            }
            q.d(error, "error");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "errorCode", error.d);
            jSONObject3.put((JSONObject) "errorMsg", error.e);
            t tVar = t.INSTANCE;
            jSONObject.put((JSONObject) "onRenderErrorParam", (String) jSONObject2);
            t tVar2 = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.c(com.taobao.themis.kernel.logger.a.MODULE_EMBED, "ON_RENDER_ERROR", com.taobao.themis.kernel.logger.b.a(this.b), com.taobao.themis.kernel.logger.b.a(this.b) + TMSEmbed.b(TMSEmbed.this), jSONObject);
            a.C0936a d = TMSEmbed.d(TMSEmbed.this);
            if (d != null) {
                String str = error.d;
                q.b(str, "error.errorCode");
                String str2 = error.e;
                q.b(str2, "error.errorMsg");
                d.a(str, str2);
            }
            a.C0936a d2 = TMSEmbed.d(TMSEmbed.this);
            if (d2 != null) {
                boolean o = TMSEmbed.a(TMSEmbed.this).o();
                String str3 = error.d;
                q.b(str3, "error.errorCode");
                String str4 = error.e;
                q.b(str4, "error.errorMsg");
                bool = Boolean.valueOf(d2.a(o, str3, str4));
            } else {
                bool = null;
            }
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = jSONObject5;
            jSONObject6.put((JSONObject) "downgradeIntercept", (String) bool);
            jSONObject6.put((JSONObject) "canAutoDowngrade", (String) Boolean.valueOf(TMSEmbed.a(TMSEmbed.this).o()));
            t tVar3 = t.INSTANCE;
            jSONObject4.put((JSONObject) "onDowngradeParam", (String) jSONObject5);
            t tVar4 = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.c(com.taobao.themis.kernel.logger.a.MODULE_EMBED, "ON_DOWNGRADE", com.taobao.themis.kernel.logger.b.a(this.b), com.taobao.themis.kernel.logger.b.a(this.b) + TMSEmbed.b(TMSEmbed.this), jSONObject4);
            if (!q.a((Object) bool, (Object) false) || !TMSEmbed.a(TMSEmbed.this).o()) {
                return;
            }
            TMSEmbed.this.a(this.c, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
        }
    }

    public final <T extends hij> T a(Class<T> clz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("271b62a8", new Object[]{this, clz});
        }
        q.d(clz, "clz");
        return (T) this.b.a(clz);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.n();
        }
    }

    public final View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    public static /* synthetic */ void a(TMSEmbed tMSEmbed, StartParams startParams, TMSEmbedSolutionType tMSEmbedSolutionType, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a202d5", new Object[]{tMSEmbed, startParams, tMSEmbedSolutionType, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            tMSEmbedSolutionType = null;
        }
        tMSEmbed.a(startParams, tMSEmbedSolutionType);
    }

    public final void a(StartParams startParams, TMSEmbedSolutionType tMSEmbedSolutionType) {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac1a4b8", new Object[]{this, startParams, tMSEmbedSolutionType});
            return;
        }
        q.d(startParams, "startParams");
        f a2 = this.b.a();
        q.a(a2);
        String a3 = com.taobao.themis.kernel.logger.b.a(a2);
        StringBuilder sb = new StringBuilder();
        f a4 = this.b.a();
        q.a(a4);
        sb.append(com.taobao.themis.kernel.logger.b.a(a4));
        sb.append(this.d);
        String sb2 = sb.toString();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "url", startParams.getUrl());
        if (tMSEmbedSolutionType == null || (name = tMSEmbedSolutionType.name()) == null) {
            TMSEmbedSolutionType tMSEmbedSolutionType2 = this.g;
            name = tMSEmbedSolutionType2 != null ? tMSEmbedSolutionType2.name() : null;
        }
        if (name == null) {
            name = "";
        }
        jSONObject4.put((JSONObject) "solution", name);
        t tVar = t.INSTANCE;
        jSONObject2.put((JSONObject) "onReloadParam", (String) jSONObject3);
        t tVar2 = t.INSTANCE;
        com.taobao.themis.kernel.logger.a.c(com.taobao.themis.kernel.logger.a.MODULE_EMBED, "ON_RELOAD", a3, sb2, jSONObject);
        if (tMSEmbedSolutionType != null && tMSEmbedSolutionType != this.g) {
            this.b.b();
            this.c.removeAllViews();
            FrameLayout frameLayout = this.e;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                frameLayout.removeAllViews();
                this.c.addView(this.e);
            }
            this.b = new qot(this.f, this.e, this.c);
            this.g = tMSEmbedSolutionType;
            a(startParams);
            a();
            return;
        }
        qot qotVar = this.b;
        String url = startParams.getUrl();
        q.a((Object) url);
        qotVar.a(url);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.b();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.h();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b.m();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.b.l();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.b.k();
        }
    }

    public final void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.b.a(i, i2, intent);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.b.p();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.b.q();
        }
    }

    public static /* synthetic */ void a(TMSEmbed tMSEmbed, String str, JSON json, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c5b4a6", new Object[]{tMSEmbed, str, json, str2, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        tMSEmbed.a(str, json, str2);
    }

    public final void a(String eventName, JSON json, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88833d07", new Object[]{this, eventName, json, str});
            return;
        }
        q.d(eventName, "eventName");
        this.b.a(eventName, json, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/external/embed/TMSEmbed$EmbedRootView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "bindInstance", "", "instance", "getInstance", "themis_interface_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static class EmbedRootView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private f mInstance;

        static {
            kge.a(-901879553);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmbedRootView(Context context) {
            super(context);
            q.d(context, "context");
        }

        public final void bindInstance(f instance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("610a95be", new Object[]{this, instance});
                return;
            }
            q.d(instance, "instance");
            this.mInstance = instance;
        }

        public final f getInstance() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("ec12e349", new Object[]{this}) : this.mInstance;
        }
    }
}
