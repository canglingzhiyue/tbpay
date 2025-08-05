package com.taobao.themis.widget.group;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.e;
import com.taobao.android.weex.h;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.utils.o;
import com.taobao.themis.widget.kernal.b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.i;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.juh;
import tb.jui;
import tb.jvs;
import tb.kge;
import tb.ljl;
import tb.qot;
import tb.trk;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001;B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192&\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001c2\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0011J\u0006\u0010!\u001a\u00020\u0017J\u0006\u0010\"\u001a\u00020\u0017J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010%\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010)\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010*\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u0011H\u0016J.\u0010+\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010,\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010-\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010,\u001a\u00020\fH\u0016J.\u0010.\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010/\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u00100\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010/\u001a\u00020\fH\u0016J&\u00101\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u00102\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u000104J\u000e\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020:R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006<"}, d2 = {"Lcom/taobao/themis/widget/group/TMSWidgetGroupInstance;", "Lcom/taobao/android/weex/WeexInstanceListener;", "activity", "Landroid/app/Activity;", "url", "", "renderListener", "Lcom/taobao/themis/widget/group/TMSWidgetGroupInstance$RenderListener;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/taobao/themis/widget/group/TMSWidgetGroupInstance$RenderListener;)V", "getActivity", "()Landroid/app/Activity;", "enableLayoutNG", "", "hasDestroy", "mEmbedManager", "Lcom/taobao/themis/widget/kernal/TMSWidgetEngine;", "mPIInstance", "Lcom/taobao/android/weex/WeexInstance;", "mRootView", "Lcom/taobao/themis/widget/group/WeexRootView;", "getUrl", "()Ljava/lang/String;", "createInstance", "", com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID, "", "attributes", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "destroy", "getView", "Landroid/view/View;", "getWeexInstance", "onActivityPause", "onActivityResume", "onDestroyed", "instance", "onEngineException", "type", "Lcom/taobao/android/weex/WeexErrorType;", "errorMsg", "onExecuteFailed", "onExecuteSuccess", "onInitFailed", "isCache", "onInitSuccess", "onRenderFailed", "isRefresh", ljl.RENDER_SUCCESS_TIME, "onScriptException", "render", "initData", "Lcom/taobao/android/weex/WeexValue;", "setGestureListener", "gestureListener", "Lcom/taobao/android/weex_framework/listeners/IWeexGestureEventListener;", "setScrollListener", "scrollListener", "Lcom/taobao/android/weex_framework/listeners/IWeexScrollListener;", "RenderListener", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class c implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeexInstance f22928a;
    private final com.taobao.themis.widget.kernal.b b;
    private boolean c;
    private final WeexRootView d;
    private final boolean e;
    private final Activity f;
    private final String g;
    private final a h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/taobao/themis/widget/group/TMSWidgetGroupInstance$RenderListener;", "", "onRenderError", "", "errorCode", "", "errorMsg", ljl.RENDER_SUCCESS_TIME, "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void a(String str, String str2);
    }

    static {
        kge.a(-669609061);
        kge.a(1947023493);
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

    public c(Activity activity, String url, a renderListener) {
        q.d(activity, "activity");
        q.d(url, "url");
        q.d(renderListener, "renderListener");
        this.f = activity;
        this.g = url;
        this.h = renderListener;
        this.b = new com.taobao.themis.widget.kernal.b(this.f, this.h);
        this.d = new WeexRootView(this.f);
        this.e = q.a((Object) o.a(this.g, "wx_use_layoutng"), (Object) "true");
        com.taobao.themis.container.utils.b.a(this.f.getApplicationContext());
        com.taobao.android.weex.config.b bVar = new com.taobao.android.weex.config.b();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.a(WeexUnicornConfig.RenderMode.texture);
        HashMap<String, String> c = weexUnicornConfig.c();
        q.b(c, "this.engineParams");
        c.put("wx_use_layoutng", String.valueOf(this.e));
        bVar.a(weexUnicornConfig);
        WeexInstance a2 = e.a(this.f, this.g, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, bVar);
        q.b(a2, "WeexFactory.createInstan… instanceConfig\n        )");
        this.f22928a = a2;
        com.taobao.themis.widget.kernal.b.a(this.b, this.e, null, o.a(this.g, "jsfm"), o.a(this.g, "apifm"), null, null, 50, null);
    }

    public static final /* synthetic */ boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a02e1fd", new Object[]{cVar})).booleanValue() : cVar.c;
    }

    public static final /* synthetic */ WeexInstance b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("e8d1ea7a", new Object[]{cVar}) : cVar.f22928a;
    }

    public static final /* synthetic */ com.taobao.themis.widget.kernal.b c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.widget.kernal.b) ipChange.ipc$dispatch("b7921263", new Object[]{cVar}) : cVar.b;
    }

    public final Activity f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2aa15edb", new Object[]{this}) : this.f;
    }

    public final WeexInstance a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("a4315c0c", new Object[]{this}) : this.f22928a;
    }

    public final View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.d;
    }

    public final void a(jvs scrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02abcd1", new Object[]{this, scrollListener});
            return;
        }
        q.d(scrollListener, "scrollListener");
        this.d.setCustomScrollListener(scrollListener);
    }

    public final void a(WeexValue weexValue) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b510c124", new Object[]{this, weexValue});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            this.f22928a.setTag("tmsWidget", true);
            this.f22928a.setTag("tmsEmbedManager", this.b);
            this.f22928a.registerModule("widget-event", WidgetBridgeModule.class);
            this.f22928a.initWithURL(this.g);
            this.d.addView(this.f22928a.getRootView());
            ((juh) this.f22928a.getExtend(juh.class)).a(this.d.getGestureListener());
            ((juh) this.f22928a.getExtend(juh.class)).a(this.d.getScrollListener());
            Object extend = this.f22928a.getExtend(jui.class);
            q.b(extend, "mPIInstance.getExtend(We…nceWidgetExt::class.java)");
            ((jui) extend).a(new b(weexValue));
            this.f22928a.render(weexValue);
            this.f22928a.addInstanceListener(this);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        TMSLogger.b("", "", m2374exceptionOrNullimpl);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u0001`\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/taobao/themis/widget/group/TMSWidgetGroupInstance$render$1$1", "Lcom/taobao/android/weex/ext/WeexInstanceWidgetExt$ICreateWidgetComponentListener;", "createWidgetComponent", "", com.taobao.tao.flexbox.layoutmanager.container.b.KEY_NODE_ID, "", "attributes", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "destroyWidgetComponent", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements jui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ WeexValue b;

        public b(WeexValue weexValue) {
            this.b = weexValue;
        }

        @Override // tb.jui.a
        public void a(final int i, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e17cea38", new Object[]{this, new Integer(i), hashMap});
            } else if (c.a(c.this)) {
            } else {
                c cVar = c.this;
                cVar.a(cVar.f(), i, hashMap, new a() { // from class: com.taobao.themis.widget.group.c.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.themis.widget.group.c.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        }
                    }

                    @Override // com.taobao.themis.widget.group.c.a
                    public void a(String errorCode, String errorMsg) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                            return;
                        }
                        q.d(errorCode, "errorCode");
                        q.d(errorMsg, "errorMsg");
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = jSONObject;
                        jSONObject2.put((JSONObject) "errorCode", errorCode);
                        jSONObject2.put((JSONObject) "errorMsg", errorMsg);
                        c.b(c.this).dispatchNodeEvent(i, "rendererror", WeexValueImpl.ofJSON(jSONObject));
                        c.b(c.this).dispatchNodeEvent(i, "onRenderError", WeexValueImpl.ofJSON(jSONObject));
                    }
                });
            }
        }

        @Override // tb.jui.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                c.c(c.this).a(i);
            }
        }
    }

    public final void a(Activity activity, int i, HashMap<String, String> hashMap, a renderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc62b0fe", new Object[]{this, activity, new Integer(i), hashMap, renderListener});
            return;
        }
        q.d(activity, "activity");
        q.d(renderListener, "renderListener");
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(hashMap != null ? hashMap : ai.a());
        try {
            WidgetStartParams build = ((WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class)).build();
            qot qotVar = new qot(activity, null, null, 6, null);
            Uri build2 = Uri.parse(build.getWidgetUrl()).buildUpon().appendQueryParameter(com.taobao.themis.kernel.i.IS_CLUSTER_WIDGET, "true").build();
            JSONObject jSONObject2 = new JSONObject();
            String sceneParamValue = build.getSceneParamValue("sceneId");
            if (sceneParamValue != null) {
                jSONObject2.put((JSONObject) "sceneId", sceneParamValue);
            }
            String sceneParamValue2 = build.getSceneParamValue("sellerId");
            if (sceneParamValue2 != null) {
                jSONObject2.put((JSONObject) "sellerId", sceneParamValue2);
            }
            String uri = build2.toString();
            q.b(uri, "uri.toString()");
            qotVar.a(uri, jSONObject2);
            trk.a.a(qotVar, (TMSSolutionType) null, (f.c) null, 3, (Object) null);
            qotVar.n();
            f a2 = qotVar.a();
            q.a(a2);
            a2.a(build.getSpmOri());
            a2.a((Class<Class>) WidgetStartParams.class, (Class) build);
            a2.a(new com.taobao.themis.widget.group.a(a2));
            a2.a(new com.taobao.themis.widget.kernal.h(a2));
            a2.a((Class<Class>) a.class, (Class) renderListener);
            a2.a((Class<Class>) b.c.class, (Class) this.b.a(activity, this.f22928a, i, build, a2, renderListener));
        } catch (Throwable th) {
            TMSLogger.a("TMSWidgetGroupInstance", th);
            renderListener.a("TMS_ERR_PARAM_INVALID", "WidgetStartParams parse fail!");
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f22928a.onActivityPause();
        this.b.e();
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f22928a.onActivityResume();
        this.b.f();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f22928a.destroy();
        this.b.g();
    }

    @Override // com.taobao.android.weex.h
    public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            return;
        }
        a aVar = this.h;
        if (str == null) {
            str = "";
        }
        aVar.a("TMS_ERR_MAIN_BUNDLE_FAIL", str);
    }

    @Override // com.taobao.android.weex.h
    public void onDestroyed(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        } else {
            this.c = true;
        }
    }
}
