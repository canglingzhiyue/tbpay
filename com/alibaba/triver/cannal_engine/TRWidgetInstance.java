package com.alibaba.triver.cannal_engine;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.split.k;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.alibaba.triver.cannal_engine.scene.WidgetStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.ui.flat.widget.Widget;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cbs;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public class TRWidgetInstance implements ITRWidgetInstance, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int index = 0;
    private static final String widgetUrlPath = "https://m.duanqu.com?isCanal=true&_ariver_appid=";
    private volatile boolean hasAttached;
    private Activity mActivity;
    private List<b> mDestroyListeners;
    private Fragment mFragment;
    private String mGroupId;
    private String mInstanceId;
    private volatile boolean mIsDestroy;
    private ITRWidgetInstance mRenderImpl;
    private a mRenderListener;
    private WidgetRenderContainer mRootContainer;
    private String mTag;
    private c mWidgetExceptionListener;
    private d mWidgetInitListener;
    private e mWidgetJSLogListener;
    private f mWidgetMonitorListener;
    private g mWidgetRenderListener;

    /* loaded from: classes3.dex */
    public interface a {
        void a(MotionEvent motionEvent);

        void a(View view);

        void a(JSONObject jSONObject);

        void a(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map);

        void a(String str);

        void a(String str, JSONObject jSONObject);

        void a(boolean z);

        void b(String str);
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(String str, String str2);
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(boolean z);
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(String str);
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(MotionEvent motionEvent);

        void a(JSONObject jSONObject);

        void a(String str, JSONObject jSONObject);
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(View view);

        void a(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map);
    }

    public static /* synthetic */ boolean access$000(TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("23dcdb8a", new Object[]{tRWidgetInstance})).booleanValue() : tRWidgetInstance.mIsDestroy;
    }

    public static /* synthetic */ Activity access$100(TRWidgetInstance tRWidgetInstance) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2fb27123", new Object[]{tRWidgetInstance}) : tRWidgetInstance.mActivity;
    }

    public static /* synthetic */ void access$200(TRWidgetInstance tRWidgetInstance, WidgetStartParams widgetStartParams, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36253301", new Object[]{tRWidgetInstance, widgetStartParams, aVar});
        } else {
            tRWidgetInstance.doRenderInner(widgetStartParams, aVar);
        }
    }

    public static /* synthetic */ void access$300(TRWidgetInstance tRWidgetInstance, com.alibaba.triver.cannal_engine.common.a aVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6cb51", new Object[]{tRWidgetInstance, aVar, map});
        } else {
            tRWidgetInstance.dispatchRenderError(aVar, map);
        }
    }

    static {
        kge.a(1501845668);
        kge.a(1028243835);
        kge.a(-977811085);
        index = 0;
    }

    public TRWidgetInstance(FragmentActivity fragmentActivity) {
        this(fragmentActivity, "", "");
    }

    public TRWidgetInstance(FragmentActivity fragmentActivity, String str) {
        this(fragmentActivity, str, "");
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void setFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa1f379", new Object[]{this, fragment});
        } else {
            this.mFragment = fragment;
        }
    }

    public Boolean hasAttached() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("ea4f2222", new Object[]{this}) : Boolean.valueOf(this.hasAttached);
    }

    public TRWidgetInstance(FragmentActivity fragmentActivity, String str, String str2) {
        this.mTag = "TRWidget";
        this.mGroupId = "default";
        this.hasAttached = false;
        this.mIsDestroy = false;
        this.mDestroyListeners = new CopyOnWriteArrayList();
        this.mActivity = fragmentActivity;
        if (TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("widget");
            int i2 = index;
            index = i2 + 1;
            sb.append(i2);
            str2 = sb.toString();
        }
        this.mInstanceId = str2;
        if (!TextUtils.isEmpty(str)) {
            this.mGroupId = str;
        }
        com.alibaba.triver.cannal_engine.manager.h.a().a(this.mGroupId).put(this.mInstanceId, new WeakReference<>(this));
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void setRootContainer(WidgetRenderContainer widgetRenderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49eb24ae", new Object[]{this, widgetRenderContainer});
        } else {
            this.mRootContainer = widgetRenderContainer;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetRenderListener(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3ab362", new Object[]{this, gVar});
        } else {
            this.mWidgetRenderListener = gVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetJSLogListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e0b9ed", new Object[]{this, eVar});
        } else {
            this.mWidgetJSLogListener = eVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetExceptionListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec0f53b", new Object[]{this, cVar});
        } else {
            this.mWidgetExceptionListener = cVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetMonitorListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04b3c6d", new Object[]{this, fVar});
        } else {
            this.mWidgetMonitorListener = fVar;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void registerWidgetInitListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c6fec4b", new Object[]{this, dVar});
        } else {
            this.mWidgetInitListener = dVar;
        }
    }

    public void registerDestroyListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f271e02d", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.mDestroyListeners.add(bVar);
        }
    }

    public void unregisterDestroyListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaa54c6", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.mDestroyListeners.remove(bVar);
        }
    }

    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this}) : this.mInstanceId;
    }

    public String getGroupId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this}) : this.mGroupId;
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void render(WidgetStartParams widgetStartParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8d97b8", new Object[]{this, widgetStartParams});
        } else {
            render(widgetStartParams, (a) null);
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void render(final WidgetStartParams widgetStartParams, final a aVar) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc6a088", new Object[]{this, widgetStartParams, aVar});
            return;
        }
        this.mRenderListener = aVar;
        if (this.mRootContainer == null && (activity = this.mActivity) != null) {
            this.mRootContainer = new WidgetRenderContainer(activity);
        }
        final TextView textView = null;
        if (!com.alibaba.android.triver.base.api.b.a(ITriverRemoteProxy.DependenceMode.TRIVER_ONLY, this.mActivity)) {
            View inflate = View.inflate(this.mActivity, R.layout.triver_widget_loading_view, null);
            textView = (TextView) inflate.findViewById(R.id.loadingPerct);
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.appLogo);
            if (widgetStartParams.getHeight() > 300) {
                tUrlImageView.setSkipAutoSize(true);
                tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01yeqsKh1YnDpkw5F9M_!!6000000003103-1-tps-153-153.gif");
            } else {
                tUrlImageView.setVisibility(8);
            }
            this.mRootContainer.addView(inflate);
        }
        com.alibaba.android.triver.base.api.b.a(Widget.TAG, widgetUrlPath + widgetStartParams.getWidgetId(), ITriverRemoteProxy.DependenceMode.TRIVER_ONLY, this.mActivity, new ITriverRemoteProxy.a() { // from class: com.alibaba.triver.cannal_engine.TRWidgetInstance.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (TRWidgetInstance.access$000(TRWidgetInstance.this)) {
                } else {
                    if (TRWidgetInstance.access$100(TRWidgetInstance.this) != null) {
                        RVLogger.e("TRWidget", "installRemoteContextResource : " + TRWidgetInstance.access$100(TRWidgetInstance.this));
                        k.a().c(TRWidgetInstance.access$100(TRWidgetInstance.this), "triver_taobao");
                    }
                    TRWidgetInstance.access$200(TRWidgetInstance.this, widgetStartParams, aVar);
                }
            }

            @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("errorMsg", str);
                TRWidgetInstance.access$300(TRWidgetInstance.this, TRWidgetConstant.CL_REMOTE_DOWNLOAD_FAILED, hashMap);
            }
        }, new ITriverRemoteProxy.b() { // from class: com.alibaba.triver.cannal_engine.TRWidgetInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.b
            public void a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                    return;
                }
                TextView textView2 = textView;
                if (textView2 == null) {
                    return;
                }
                textView2.setText(i2 + riy.MOD);
            }
        });
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void updateSize(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1856811", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.updateSize(i2, i3);
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void updateSize(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89727d1f", new Object[]{this, jSONObject});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.updateSize(jSONObject);
    }

    @Deprecated
    public void render(WidgetStartParams widgetStartParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e626121c", new Object[]{this, widgetStartParams, new Boolean(z)});
        } else {
            render(widgetStartParams);
        }
    }

    private void doRenderInner(WidgetStartParams widgetStartParams, a aVar) {
        try {
            this.mRenderImpl = (ITRWidgetInstance) Class.forName("com.alibaba.triver.cannal_engine.TRWidgetInstanceImpl").getConstructor(FragmentActivity.class, String.class, String.class).newInstance(this.mActivity, this.mGroupId, this.mInstanceId);
        } catch (Throwable th) {
            RVLogger.e(this.mTag, th);
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorMsg", "new RenderImpl failed");
            dispatchRenderError(TRWidgetConstant.CL_REMOTE_DOWNLOAD_FAILED, hashMap);
            return;
        }
        iTRWidgetInstance.setRootContainer(this.mRootContainer);
        this.mRenderImpl.setFragment(this.mFragment);
        this.mRenderImpl.registerWidgetRenderListener(this.mWidgetRenderListener);
        this.mRenderImpl.registerWidgetInitListener(this.mWidgetInitListener);
        this.mRenderImpl.registerWidgetExceptionListener(this.mWidgetExceptionListener);
        this.mRenderImpl.registerWidgetJSLogListener(this.mWidgetJSLogListener);
        this.mRenderImpl.registerWidgetMonitorListener(this.mWidgetMonitorListener);
        this.mRenderImpl.render(widgetStartParams, aVar);
    }

    private void dispatchRenderError(com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8263a92d", new Object[]{this, aVar, map});
            return;
        }
        a aVar2 = this.mRenderListener;
        if (aVar2 != null) {
            aVar2.a(aVar, map);
        }
        g gVar = this.mWidgetRenderListener;
        if (gVar == null) {
            return;
        }
        gVar.a(aVar, map);
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public JSONObject getWidgetMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("53d65667", new Object[]{this});
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            return iTRWidgetInstance.getWidgetMonitor();
        }
        return new JSONObject();
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public h getWidgetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("dbe7b347", new Object[]{this});
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance != null) {
            return iTRWidgetInstance.getWidgetState();
        }
        return new h();
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public View getRootView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("17b33166", new Object[]{this}) : this.mRootContainer;
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public App getApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (App) ipChange.ipc$dispatch("cd179cf8", new Object[]{this});
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return null;
        }
        return iTRWidgetInstance.getApp();
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.resume();
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.pause();
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.stop();
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void onAttach(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb770c5", new Object[]{this, jSONObject});
            return;
        }
        this.hasAttached = true;
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.onAttach(jSONObject);
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void onDetach(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf8da037", new Object[]{this, jSONObject});
            return;
        }
        this.hasAttached = false;
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.onDetach(jSONObject);
    }

    public void setAttachStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0236b4", new Object[]{this, new Boolean(z)});
        } else {
            this.hasAttached = z;
        }
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void onVisibilityChanged(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i2)});
            return;
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.onVisibilityChanged(i2);
    }

    @Override // com.alibaba.triver.cannal_engine.ITRWidgetInstance
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mIsDestroy = true;
        try {
            com.alibaba.triver.cannal_engine.manager.h.a().a(this.mGroupId).remove(this.mInstanceId);
        } catch (Throwable th) {
            RVLogger.e(this.mTag, th);
        }
        try {
            for (b bVar : this.mDestroyListeners) {
                bVar.a();
            }
            this.mDestroyListeners.clear();
        } catch (Throwable th2) {
            RVLogger.e(this.mTag, th2);
        }
        ITRWidgetInstance iTRWidgetInstance = this.mRenderImpl;
        if (iTRWidgetInstance == null) {
            return;
        }
        iTRWidgetInstance.destroy();
    }

    /* loaded from: classes3.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public TRWidgetConstant.WidgetState f3638a;

        static {
            kge.a(1248309389);
        }

        public void a(TRWidgetConstant.WidgetState widgetState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("864af811", new Object[]{this, widgetState});
            } else {
                this.f3638a = widgetState;
            }
        }

        public TRWidgetConstant.WidgetState a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TRWidgetConstant.WidgetState) ipChange.ipc$dispatch("c20ba957", new Object[]{this}) : this.f3638a;
        }
    }

    /* loaded from: classes3.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f3639a;
        public int b;
        public int c;
        public int d;
        public int e;

        static {
            kge.a(-336622645);
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : g();
        }

        public i(int i, int i2) {
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.b = i;
            this.f3639a = i2;
        }

        public i(i iVar) {
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.b = iVar.b;
            this.f3639a = iVar.f3639a;
            this.c = iVar.c;
            this.d = iVar.d;
        }

        public i(int i, int i2, int i3, int i4) {
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.b = i;
            this.f3639a = i2;
            this.c = i3;
            this.d = i4;
        }

        public i(WidgetStartParams widgetStartParams) {
            this.c = 0;
            this.d = 0;
            this.e = -1;
            if (widgetStartParams == null) {
                return;
            }
            this.b = widgetStartParams.getWidth();
            this.f3639a = widgetStartParams.getHeight();
            this.c = widgetStartParams.getVisualX();
            this.d = widgetStartParams.getVisualY();
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.e = i;
            }
        }

        public int h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.e;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            int i = this.f3639a;
            return i == -1 ? i : cbs.a(this.e, i, -1);
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            int i = this.b;
            return i == -1 ? i : cbs.a(this.e, i, -1);
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f3639a;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : cbs.a(this.e, this.c, 0);
        }

        public int f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : cbs.a(this.e, this.d, 0);
        }

        public i g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("179b9856", new Object[]{this}) : new i(this);
        }
    }
}
