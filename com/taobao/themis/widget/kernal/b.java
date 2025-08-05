package com.taobao.themis.widget.kernal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.widget.group.c;
import com.taobao.themis.widget.platformview.IntegrationVideoPlatformView;
import com.taobao.weex.common.Constants;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.t;
import kotlin.text.n;
import tb.jua;
import tb.jud;
import tb.juh;
import tb.kge;
import tb.ljl;
import tb.qpt;
import tb.qpu;
import tb.qqo;
import tb.ruk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \\2\u00020\u0001:\u0003\\]^B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J.\u0010+\u001a\u00060\nR\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102J:\u00103\u001a\u00060\nR\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u00104\u001a\u00020#2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010.\u001a\u00020!2\u0006\u00109\u001a\u00020\u0005J\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\tJ\u000e\u0010>\u001a\u00020;2\u0006\u0010=\u001a\u00020\tJ\b\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u0004\u0018\u00010\tJ\u0006\u0010B\u001a\u000206JL\u0010C\u001a\u00020;2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tJ\b\u0010D\u001a\u00020;H\u0002J\b\u0010E\u001a\u00020;H\u0002J\u0006\u0010\u001c\u001a\u00020;J\u0006\u0010F\u001a\u00020;J\u0006\u0010G\u001a\u00020;J\u0012\u0010H\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#H\u0016J&\u0010J\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010\tH\u0016J&\u0010N\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010O\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#H\u0016J.\u0010P\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#2\u0006\u0010Q\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010R\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#2\u0006\u0010Q\u001a\u00020\u0010H\u0016J.\u0010S\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#2\u0006\u0010T\u001a\u00020\u00102\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010U\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#2\u0006\u0010T\u001a\u00020\u0010H\u0016J&\u0010V\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010#2\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010\tH\u0016J6\u0010W\u001a\u00020;2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u0012\u0010X\u001a\u00020;2\n\u0010I\u001a\u00060\nR\u00020\u0000J\u000e\u0010Y\u001a\u00020;2\u0006\u00105\u001a\u000206J\u000e\u0010Z\u001a\u00020;2\u0006\u0010[\u001a\u00020*R2\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nR\u00020\u00000\bj\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u00060\nR\u00020\u0000`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/taobao/themis/widget/kernal/TMSWidgetEngine;", "Lcom/taobao/android/weex/WeexInstanceListener;", "context", "Landroid/content/Context;", "engineRenderListener", "Lcom/taobao/themis/widget/group/TMSWidgetGroupInstance$RenderListener;", "(Landroid/content/Context;Lcom/taobao/themis/widget/group/TMSWidgetGroupInstance$RenderListener;)V", "appInstanceMap", "Ljava/util/HashMap;", "", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine$WidgetRenderInstance;", "Lkotlin/collections/HashMap;", "getContext", "()Landroid/content/Context;", "debugServerUrl", "enableLayoutNG", "", "hasInit", "hasMNN", "getHasMNN", "()Z", "setHasMNN", "(Z)V", "hasWasm", "getHasWasm", "setHasWasm", "initListener", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine$InitListener;", FactoryType.TYPE_INVALID, "isIniting", "mAPIConfig", "mEventConfig", "mFrameworkInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "mWidgetMainInstance", "Lcom/taobao/android/weex/WeexInstance;", "mainContextDestroyed", "mockApiExtUrl", "mockApiFmUrl", "mockJsFmUrl", "taskQueue", "Ljava/util/LinkedList;", "Ljava/lang/Runnable;", "createInstance", "activity", "Landroid/app/Activity;", "childInstance", "childPage", "Lcom/taobao/themis/kernel/page/ITMSPage;", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "createInstanceWithParent", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID, "", RVConstants.EXTRA_START_PARAMS, "Lcom/taobao/themis/external/embed/WidgetStartParams;", "renderListener", "destroy", "", "dispatchAppear", "viewId", "dispatchDisappear", "generateNavigator", "", "getFrameworkVersion", "getInstanceCount", "init", "initConfig", "initMainInstance", "onActivityPause", "onActivityResume", "onDestroyed", "instance", "onEngineException", "type", "Lcom/taobao/android/weex/WeexErrorType;", "errorMsg", "onExecuteFailed", "onExecuteSuccess", "onInitFailed", "isCache", "onInitSuccess", "onRenderFailed", "isRefresh", ljl.RENDER_SUCCESS_TIME, "onScriptException", "reInitWithReplaceFramework", "removeInstance", "removeInstanceWithNodeId", "runAfterInit", "r", "Companion", "InitListener", "WidgetRenderInstance", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class b implements com.taobao.android.weex.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "TMSWidgetEngine";

    /* renamed from: a  reason: collision with root package name */
    private WeexInstance f22932a;
    private final com.taobao.themis.kernel.f b;
    private final HashMap<String, c> c;
    private boolean d;
    private boolean e;
    private LinkedList<Runnable> f;
    private String g;
    private String h;
    private boolean i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private InterfaceC0985b n;
    private String o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final Context s;
    private final c.a t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/widget/kernal/TMSWidgetEngine$InitListener;", "", "onInitFail", "", "onInitFinish", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.widget.kernal.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC0985b {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public f(String str, String str2, String str3, String str4) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                b.a(b.this, true, null, this.b, this.c, this.d, this.e, 2, null);
            }
        }
    }

    static {
        kge.a(-1530081721);
        kge.a(1947023493);
        Companion = new a(null);
    }

    @Override // com.taobao.android.weex.h
    public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onExecuteSuccess(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onInitSuccess(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex.h
    public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    public b(Context context, c.a aVar) {
        q.d(context, "context");
        this.s = context;
        this.t = aVar;
        this.b = new com.taobao.themis.kernel.f();
        this.c = new HashMap<>();
        this.f = new LinkedList<>();
    }

    public static final /* synthetic */ void a(b bVar, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1552ff6e", new Object[]{bVar, weexInstance});
        } else {
            bVar.f22932a = weexInstance;
        }
    }

    public static final /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41156884", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.m = z;
        }
    }

    public static final /* synthetic */ void b(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb59385", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.d = z;
        }
    }

    public static final /* synthetic */ void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73b88ab", new Object[]{bVar});
        } else {
            bVar.k();
        }
    }

    public final Context i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c0133768", new Object[]{this}) : this.s;
    }

    public /* synthetic */ b(Context context, c.a aVar, int i, o oVar) {
        this(context, (i & 2) != 0 ? null : aVar);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.q;
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.r;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/widget/kernal/TMSWidgetEngine$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-425669425);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void a(b bVar, boolean z, InterfaceC0985b interfaceC0985b, String str, String str2, String str3, String str4, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c5c301", new Object[]{bVar, new Boolean(z), interfaceC0985b, str, str2, str3, str4, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            interfaceC0985b = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        bVar.a(z, interfaceC0985b, str, str2, str3, str4);
    }

    public final void a(boolean z, InterfaceC0985b interfaceC0985b, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c5aa76", new Object[]{this, new Boolean(z), interfaceC0985b, str, str2, str3, str4});
        } else if (this.d || this.e) {
        } else {
            MUSEngine.registerPlatformView("widget-video", IntegrationVideoPlatformView.class);
            this.e = true;
            this.m = z;
            this.j = str;
            this.k = str2;
            this.l = str3;
            this.o = str4;
            this.n = interfaceC0985b;
            j();
            com.taobao.themis.kernel.f fVar = this.b;
            fVar.a(new WidgetFrameworkSolution(fVar));
            this.b.a(new e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/taobao/themis/widget/kernal/TMSWidgetEngine$init$1", "Lcom/taobao/themis/kernel/TMSInstance$ILaunchListener;", "beforeLaunch", "", "onAppInfoSuccess", "onLaunchSuccess", ljl.RENDER_SUCCESS_TIME, "onResourceSuccess", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements f.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.f.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.f.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            }
        }

        @Override // com.taobao.themis.kernel.f.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            }
        }

        public e() {
        }

        @Override // com.taobao.themis.kernel.f.a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                b.f(b.this);
            }
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        TMSMetaInfoWrapper w = this.b.w();
        if (w == null) {
            return null;
        }
        return w.b();
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            this.g = JSON.parse(com.taobao.themis.utils.g.a("widget_api.json", this.s)).toString();
            this.h = JSON.parse(com.taobao.themis.utils.g.a("widget_event.json", this.s)).toString();
        } catch (Exception e2) {
            TMSLogger.b(TAG, "", e2);
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        TMSLogger.d(TAG, "reInit");
        g();
        IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
        if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) == null) {
            return;
        }
        executor.execute(new f(str, str2, str3, str4));
    }

    private final void k() {
        byte[] a2;
        com.taobao.themis.open.resource.c c2;
        byte[] a3;
        com.taobao.themis.open.resource.c c3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.d) {
        } else {
            String str = this.j;
            byte[] bArr = null;
            if (!(str == null || n.a((CharSequence) str))) {
                a2 = com.taobao.themis.widget.b.INSTANCE.a(this.j);
            } else {
                com.taobao.themis.open.extension.e eVar = (com.taobao.themis.open.extension.e) this.b.b(com.taobao.themis.open.extension.e.class);
                a2 = (eVar == null || (c2 = eVar.c("weex-vue.min.v20.wlm")) == null) ? null : c2.a();
            }
            String str2 = this.k;
            if (!(str2 == null || n.a((CharSequence) str2))) {
                a3 = com.taobao.themis.widget.b.INSTANCE.a(this.k);
            } else {
                com.taobao.themis.open.extension.e eVar2 = (com.taobao.themis.open.extension.e) this.b.b(com.taobao.themis.open.extension.e.class);
                a3 = (eVar2 == null || (c3 = eVar2.c("tb-widget.min.v20.wlm")) == null) ? null : c3.a();
            }
            String str3 = this.l;
            if (str3 == null || n.a((CharSequence) str3)) {
                z = true;
            }
            if (!z) {
                bArr = com.taobao.themis.widget.b.INSTANCE.a(this.l);
            }
            if (a2 == null || a3 == null) {
                c.a aVar = this.t;
                if (aVar == null) {
                    return;
                }
                aVar.a("TMS_ERROR_ENGINE_FAIL", "framework is empty");
                return;
            }
            com.taobao.themis.kernel.utils.a.a(new TMSWidgetEngine$initMainInstance$1(this, a2, a3, bArr));
        }
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c.size();
    }

    private final byte[] l() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bae6704a", new Object[]{this});
        }
        new JSONObject().put((JSONObject) "userAgent", com.taobao.themis.kernel.utils.a.a());
        String str = (com.taobao.themis.utils.g.a("widget_qjs.js", this.s) + ";var navigator=" + jSONObject.toJSONString() + ";var __navigator=" + jSONObject.toJSONString() + ";") + "var __publicObject=['atob', 'btoa', 'navigator']";
        Charset charset = kotlin.text.d.UTF_8;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charset);
        q.b(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (Map.Entry<String, c> entry : this.c.entrySet()) {
            entry.getValue().b();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (Map.Entry<String, c> entry : this.c.entrySet()) {
            entry.getValue().c();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.d = false;
        this.e = false;
        WeexInstance weexInstance = this.f22932a;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
        this.f.clear();
        for (Map.Entry<String, c> entry : this.c.entrySet()) {
            entry.getValue().a();
        }
        this.c.clear();
    }

    public final c a(Activity activity, WeexInstance parent, int i, WidgetStartParams startParams, com.taobao.themis.kernel.f childInstance, c.a renderListener) {
        String viewId;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("af1e817c", new Object[]{this, activity, parent, new Integer(i), startParams, childInstance, renderListener});
        }
        q.d(activity, "activity");
        q.d(parent, "parent");
        q.d(startParams, "startParams");
        q.d(childInstance, "childInstance");
        q.d(renderListener, "renderListener");
        c cVar = new c(this, activity, childInstance, null, Integer.valueOf(i), parent, new d(renderListener), 4, null);
        TMSLogger.a("TMSWidget", startParams.getViewId() + " createInstance");
        String viewId2 = startParams.getViewId();
        if (viewId2 != null && !n.a((CharSequence) viewId2)) {
            z = false;
        }
        if (z) {
            viewId = String.valueOf(i);
        } else {
            viewId = startParams.getViewId();
            q.a((Object) viewId);
        }
        this.c.put(viewId, cVar);
        return cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/taobao/themis/widget/kernal/TMSWidgetEngine$createInstanceWithParent$embedInstance$1", "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "onJSError", "", "errorCode", "", "errorMessage", "onRenderError", "onRenderReady", ljl.RENDER_SUCCESS_TIME, "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements qqo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c.a f22937a;

        @Override // tb.qqo
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        @Override // tb.qqo
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            }
        }

        public d(c.a aVar) {
            this.f22937a = aVar;
        }

        @Override // tb.qqo
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.f22937a.a();
            }
        }

        @Override // tb.qqo
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            c.a aVar = this.f22937a;
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            aVar.a(str, str2);
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        String str = null;
        c cVar = null;
        for (Map.Entry<String, c> entry : this.c.entrySet()) {
            Integer f2 = entry.getValue().f();
            if (f2 != null && f2.intValue() == i) {
                cVar = entry.getValue();
                str = entry.getKey();
            }
        }
        if (str == null) {
            return;
        }
        HashMap<String, c> hashMap = this.c;
        if (hashMap == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        x.i(hashMap).remove(str);
        if (cVar != null) {
            cVar.a();
        }
        if (!this.p || !this.c.isEmpty()) {
            return;
        }
        g();
    }

    public final void a(c instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e057e131", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        String str = null;
        for (Map.Entry<String, c> entry : this.c.entrySet()) {
            if (q.a(entry.getValue(), instance)) {
                str = entry.getKey();
            }
        }
        if (str == null) {
            return;
        }
        HashMap<String, c> hashMap = this.c;
        if (hashMap == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        x.i(hashMap).remove(str);
        instance.a();
        if (!this.p || !this.c.isEmpty()) {
            return;
        }
        g();
    }

    public final c a(Activity activity, com.taobao.themis.kernel.f childInstance, ITMSPage iTMSPage, qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ef087df4", new Object[]{this, activity, childInstance, iTMSPage, qqoVar});
        }
        q.d(activity, "activity");
        q.d(childInstance, "childInstance");
        c cVar = new c(this, activity, childInstance, iTMSPage, null, null, qqoVar, 24, null);
        String str = childInstance.c;
        q.b(str, "childInstance.mInstanceId");
        this.c.put(str, cVar);
        return cVar;
    }

    public final void a(String viewId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, viewId});
            return;
        }
        q.d(viewId, "viewId");
        c cVar = this.c.get(viewId);
        if (cVar != null) {
            cVar.d();
            return;
        }
        TMSLogger.a("TMSWidget", viewId + " has not CreateInstance");
    }

    public final void b(String viewId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, viewId});
            return;
        }
        q.d(viewId, "viewId");
        c cVar = this.c.get(viewId);
        if (cVar != null) {
            cVar.a(false);
            return;
        }
        TMSLogger.a("TMSWidget", viewId + " has not CreateInstance");
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.p = true;
        if (!this.c.isEmpty()) {
            return;
        }
        g();
    }

    public final void a(Runnable r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, r});
            return;
        }
        q.d(r, "r");
        if (this.d) {
            r.run();
        } else {
            this.f.add(r);
        }
    }

    @Override // com.taobao.android.weex.h
    public void onDestroyed(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        } else {
            this.i = true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020\u0014H\u0002J\u0006\u0010)\u001a\u00020'J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020'H\u0002J\u001a\u0010,\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010\u0001J\u0010\u00100\u001a\u00020'2\u0006\u0010-\u001a\u00020.H\u0002J\u0006\u00101\u001a\u00020'J\u0006\u00102\u001a\u00020'J\u0006\u00103\u001a\u00020'J\u000e\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020\u0014J\u0012\u00106\u001a\u00020'2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001dJ$\u00108\u001a\u00020'2\b\u00109\u001a\u0004\u0018\u00010.2\b\u0010:\u001a\u0004\u0018\u00010.2\b\u0010;\u001a\u0004\u0018\u00010.J\u0018\u0010<\u001a\u00020'2\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010>J\b\u0010?\u001a\u00020'H\u0002J\b\u0010@\u001a\u00020'H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/taobao/themis/widget/kernal/TMSWidgetEngine$WidgetRenderInstance;", "", "activity", "Landroid/app/Activity;", "tmsInstance", "Lcom/taobao/themis/kernel/TMSInstance;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID, "", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "Lcom/taobao/android/weex/WeexInstance;", "renderListener", "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "(Lcom/taobao/themis/widget/kernal/TMSWidgetEngine;Landroid/app/Activity;Lcom/taobao/themis/kernel/TMSInstance;Lcom/taobao/themis/kernel/page/ITMSPage;Ljava/lang/Integer;Lcom/taobao/android/weex/WeexInstance;Lcom/taobao/themis/kernel/runtime/TMSRenderListener;)V", "getActivity", "()Landroid/app/Activity;", "appJS", "", "hasDetach", "", "hasRendered", "isAppear", "mDestroyed", "mRenderMode", "Lcom/taobao/android/weex/config/WeexUnicornConfig$RenderMode;", "mRenderView", "Landroid/view/View;", "mRootView", "Landroid/view/ViewGroup;", "getNodeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRenderListener", "()Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "waitLazyInit", "weexInstanceRef", "Ljava/lang/ref/WeakReference;", Constants.Event.SLOT_LIFECYCLE.ATTACH, "", "checkLazyInitWhenRender", "destroy", "detach", "doRender", "fireConfigEvent", "event", "", "data", "fireLifeCycleEvent", "onActivityPause", "onActivityResume", "onAppear", "onDisappear", "recycle", "render", "rootView", "reportExceptionInfo", "groupCode", "errorCode", "errorMsg", "reportMonitor", "onSuccess", "Lkotlin/Function0;", "reportUnicornPixelCount", "reportWeexMonitor", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f22933a;
        private WeakReference<WeexInstance> b;
        private boolean c;
        private byte[] d;
        private boolean e;
        private View f;
        private ViewGroup g;
        private boolean h;
        private WeexUnicornConfig.RenderMode i;
        private boolean j;
        private final Activity k;
        private final com.taobao.themis.kernel.f l;
        private final ITMSPage m;
        private final Integer n;
        private final WeexInstance o;
        private final qqo p;
        private boolean q;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* loaded from: classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    com.taobao.themis.kernel.utils.a.a(new TMSWidgetEngine$WidgetRenderInstance$doRender$1$1(this));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.widget.kernal.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class RunnableC0986b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ String b;

            public RunnableC0986b(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c.a(c.this, com.taobao.themis.widget.b.INSTANCE.a(this.b));
                c.b(c.this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.widget.kernal.b$c$c  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static final class RunnableC0987c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ ruk b;

            public RunnableC0987c(ruk rukVar) {
                this.b = rukVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WeexInstance weexInstance;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    WeakReference h = c.h(c.this);
                    if (h != null && (weexInstance = (WeexInstance) h.get()) != null) {
                        q.b(weexInstance, "weexInstanceRef?.get() ?: return@Runnable");
                        Object extend = weexInstance.getExtend(juh.class);
                        q.b(extend, "instance.getExtend(WeexI…ceUnicornExt::class.java)");
                        HashMap<String, String> f = ((juh) extend).f();
                        q.b(f, "instance.getExtend(WeexI…ass.java).firstScreenInfo");
                        String str = f.get("end_time_stamp_opt");
                        c.d(c.this).k().a("widgetFirstScreen", str == null ? "" : str);
                        c.d(c.this).k().a("widgetOnDestroy");
                        String it = c.d(c.this).k().c("instanceCreate");
                        if (it != null && !TextUtils.isEmpty(str)) {
                            qpu k = c.d(c.this).k();
                            q.a((Object) str);
                            long parseLong = Long.parseLong(str);
                            q.b(it, "it");
                            k.a("widgetActualInteraction", String.valueOf(parseLong - Long.parseLong(it)));
                        }
                        c.l(c.this);
                        c.m(c.this);
                        ruk rukVar = this.b;
                        if (rukVar == null) {
                            return;
                        }
                        rukVar.mo2427invoke();
                    }
                } catch (Throwable th) {
                    TMSLogger.a(b.TAG, th);
                }
            }
        }

        static {
            kge.a(-1066167796);
        }

        public c(b bVar, Activity activity, com.taobao.themis.kernel.f tmsInstance, ITMSPage iTMSPage, Integer num, WeexInstance weexInstance, qqo qqoVar) {
            q.d(activity, "activity");
            q.d(tmsInstance, "tmsInstance");
            this.f22933a = bVar;
            this.k = activity;
            this.l = tmsInstance;
            this.m = iTMSPage;
            this.n = num;
            this.o = weexInstance;
            this.p = qqoVar;
            this.i = WeexUnicornConfig.RenderMode.texture;
        }

        public static final /* synthetic */ void a(c cVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("776b4001", new Object[]{cVar, view});
            } else {
                cVar.f = view;
            }
        }

        public static final /* synthetic */ void a(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8e380bb", new Object[]{cVar, str});
            } else {
                cVar.a(str);
            }
        }

        public static final /* synthetic */ void a(c cVar, WeakReference weakReference) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42059b0d", new Object[]{cVar, weakReference});
            } else {
                cVar.b = weakReference;
            }
        }

        public static final /* synthetic */ void a(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2aa4f7c3", new Object[]{cVar, new Boolean(z)});
            } else {
                cVar.j = z;
            }
        }

        public static final /* synthetic */ void a(c cVar, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29facdb8", new Object[]{cVar, bArr});
            } else {
                cVar.d = bArr;
            }
        }

        public static final /* synthetic */ void b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7bd1650", new Object[]{cVar});
            } else {
                cVar.h();
            }
        }

        public static final /* synthetic */ void b(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe66684", new Object[]{cVar, new Boolean(z)});
            } else {
                cVar.c = z;
            }
        }

        public static final /* synthetic */ void c(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f527d545", new Object[]{cVar, new Boolean(z)});
            } else {
                cVar.h = z;
            }
        }

        public static final /* synthetic */ com.taobao.themis.kernel.f d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.themis.kernel.f) ipChange.ipc$dispatch("9c72ee4d", new Object[]{cVar}) : cVar.l;
        }

        public static final /* synthetic */ void d(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da694406", new Object[]{cVar, new Boolean(z)});
            } else {
                cVar.q = z;
            }
        }

        public static final /* synthetic */ WeakReference h(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("66712ed8", new Object[]{cVar}) : cVar.b;
        }

        public static final /* synthetic */ void l(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31b12986", new Object[]{cVar});
            } else {
                cVar.l();
            }
        }

        public static final /* synthetic */ void m(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39165ea5", new Object[]{cVar});
            } else {
                cVar.m();
            }
        }

        public final Activity e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("28c80bbc", new Object[]{this}) : this.k;
        }

        public /* synthetic */ c(b bVar, Activity activity, com.taobao.themis.kernel.f fVar, ITMSPage iTMSPage, Integer num, WeexInstance weexInstance, qqo qqoVar, int i, o oVar) {
            this(bVar, activity, fVar, (i & 4) != 0 ? null : iTMSPage, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : weexInstance, qqoVar);
        }

        public final Integer f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("78dabfd4", new Object[]{this}) : this.n;
        }

        public final qqo g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (qqo) ipChange.ipc$dispatch("3d3398e9", new Object[]{this}) : this.p;
        }

        public final void a() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.e) {
            } else {
                this.e = true;
                a(this, (ruk) null, 1, (Object) null);
                this.l.r();
                WeakReference<WeexInstance> weakReference = this.b;
                if (weakReference == null || (weexInstance = weakReference.get()) == null) {
                    return;
                }
                weexInstance.destroy();
            }
        }

        public final void b() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.l.y();
            WeakReference<WeexInstance> weakReference = this.b;
            if (weakReference != null && (weexInstance = weakReference.get()) != null) {
                weexInstance.onActivityPause();
            }
            a("onAppHide");
        }

        public final void c() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.l.z();
            WeakReference<WeexInstance> weakReference = this.b;
            if (weakReference != null && (weexInstance = weakReference.get()) != null) {
                weexInstance.onActivityResume();
            }
            a("onAppShow");
        }

        public static /* synthetic */ void a(c cVar, ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd9e07af", new Object[]{cVar, viewGroup, new Integer(i), obj});
                return;
            }
            if ((i & 1) != 0) {
                viewGroup = null;
            }
            cVar.a(viewGroup);
        }

        public final void a(ViewGroup viewGroup) {
            Executor executor;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
                return;
            }
            this.g = viewGroup;
            String a2 = com.taobao.themis.utils.o.a(this.l.g(), "jsbundle");
            String str = a2;
            if (str != null && !n.a((CharSequence) str)) {
                z = false;
            }
            if (z) {
                h();
                return;
            }
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService == null || (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) == null) {
                return;
            }
            executor.execute(new RunnableC0986b(a2));
        }

        private final void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            } else {
                this.f22933a.a(new a());
            }
        }

        private final boolean k() {
            WidgetStartParams widgetStartParams;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
            }
            if (!com.taobao.themis.kernel.utils.n.bO() || (widgetStartParams = (WidgetStartParams) this.l.a(WidgetStartParams.class)) == null) {
                return false;
            }
            q.b(widgetStartParams, "tmsInstance.getData(Widg…ass.java) ?: return false");
            return widgetStartParams.getLazyInit() && !widgetStartParams.getHasAttached() && !this.l.e("hasViewAppear");
        }

        public final void d() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (this.c) {
            } else {
                if (this.q) {
                    WeakReference<WeexInstance> weakReference = this.b;
                    if (weakReference != null && (weexInstance = weakReference.get()) != null) {
                        weexInstance.execute(this.d, "https://taobao.widget.com/widget.worker.v20.wlm");
                    }
                    this.d = null;
                    this.j = true;
                    a("onAppShow");
                    this.q = false;
                }
                this.c = true;
                a("onAppear");
                j();
            }
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (!this.c) {
            } else {
                this.c = false;
                a("onDisappear");
                if (!z) {
                    return;
                }
                i();
            }
        }

        private final void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            } else {
                com.taobao.themis.kernel.utils.a.a(new TMSWidgetEngine$WidgetRenderInstance$detach$1(this));
            }
        }

        private final void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            } else {
                com.taobao.themis.kernel.utils.a.a(new TMSWidgetEngine$WidgetRenderInstance$attach$1(this));
            }
        }

        public final void a(String str, Object obj) {
            String a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                return;
            }
            WeakReference<WeexInstance> weakReference = this.b;
            WeexInstance weexInstance = null;
            if ((weakReference != null ? weakReference.get() : null) == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "data", (String) obj);
            jSONObject2.put((JSONObject) "name", str);
            WeakReference<WeexInstance> weakReference2 = this.b;
            if (weakReference2 != null) {
                weexInstance = weakReference2.get();
            }
            q.a(weexInstance);
            ((jud) weexInstance.getExtend(jud.class)).fireGlobalEvent("widget_native_config_event", jSONObject);
            ITMSPage iTMSPage = this.m;
            if (iTMSPage == null || (a2 = com.taobao.themis.kernel.logger.b.a(iTMSPage)) == null) {
                a2 = com.taobao.themis.kernel.logger.b.a(this.l);
            }
            String a3 = com.taobao.themis.kernel.logger.a.a(a2);
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = jSONObject3;
            jSONObject4.put((JSONObject) "name", str);
            jSONObject4.put((JSONObject) "params", (String) obj);
            t tVar = t.INSTANCE;
            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_NATIVE_EVENT, com.taobao.themis.kernel.logger.a.EVEN_ON_NEVENT_FIRE, a2, a3, jSONObject3);
        }

        private final void a(String str) {
            String a2;
            WeexInstance weexInstance;
            jud judVar;
            WeexInstance weexInstance2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (!this.j) {
            } else {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((JSONObject) "data", str);
                WeakReference<WeexInstance> weakReference = this.b;
                jSONObject2.put((JSONObject) "insId", (String) ((weakReference == null || (weexInstance2 = weakReference.get()) == null) ? null : Integer.valueOf(weexInstance2.getInstanceId())));
                WeakReference<WeexInstance> weakReference2 = this.b;
                if (weakReference2 != null && (weexInstance = weakReference2.get()) != null && (judVar = (jud) weexInstance.getExtend(jud.class)) != null) {
                    judVar.fireGlobalEvent("widget_lifecycle_event", jSONObject);
                }
                ITMSPage iTMSPage = this.m;
                if (iTMSPage == null || (a2 = com.taobao.themis.kernel.logger.b.a(iTMSPage)) == null) {
                    a2 = com.taobao.themis.kernel.logger.b.a(this.l);
                }
                String a3 = com.taobao.themis.kernel.logger.a.a(a2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put((JSONObject) "name", str);
                t tVar = t.INSTANCE;
                com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_NATIVE_EVENT, com.taobao.themis.kernel.logger.a.EVEN_ON_NEVENT_FIRE, a2, a3, jSONObject3);
            }
        }

        public static /* synthetic */ void a(c cVar, ruk rukVar, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1ef7466", new Object[]{cVar, rukVar, new Integer(i), obj});
                return;
            }
            if ((i & 1) != 0) {
                rukVar = null;
            }
            cVar.a(rukVar);
        }

        public final void a(ruk<t> rukVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
            } else {
                this.f22933a.a(new RunnableC0987c(rukVar));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[Catch: Throwable -> 0x010d, TRY_LEAVE, TryCatch #0 {Throwable -> 0x010d, blocks: (B:15:0x0034, B:17:0x003d, B:22:0x0047, B:28:0x004f, B:33:0x0073, B:35:0x0080, B:37:0x00ae, B:39:0x00be, B:42:0x00d4, B:46:0x00fb), top: B:51:0x0034 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void l() {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.widget.kernal.b.c.l():void");
        }

        private final void m() {
            WeexInstance weexInstance;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6158674", new Object[]{this});
                return;
            }
            WeakReference<WeexInstance> weakReference = this.b;
            if (weakReference == null || (weexInstance = weakReference.get()) == null) {
                return;
            }
            q.b(weexInstance, "weexInstanceRef?.get() ?: return");
            String it = this.l.k().c("packageStepStart");
            if (it != null) {
                q.b(it, "it");
                ((jua) weexInstance.getExtend(jua.class)).a("wxStartDownLoadBundle", Long.parseLong(it));
            }
            String it2 = this.l.k().c("packageStepFinish");
            if (it2 == null) {
                return;
            }
            q.b(it2, "it");
            ((jua) weexInstance.getExtend(jua.class)).a("wxEndDownLoadBundle", Long.parseLong(it2));
        }
    }
}
