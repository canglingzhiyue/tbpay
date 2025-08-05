package com.taobao.message.lab.comfrm.render;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Render;
import com.taobao.message.lab.comfrm.inner2.Plugin;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class WidgetRenderImpl implements Render<View>, ViewQueryService, ViewService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SNAPSHOT_TAG = "snapshot";
    public static volatile boolean useNewPostAction;
    private EventDispatcher actionDispatcher;
    private Context context;
    private Event firstPaddingOnAppear;
    private String identifier;
    private boolean isDispose;
    private String lastName;
    private String mClassNamespace;
    private RenderConfig mRenderConfig;
    private Map<String, Object> mRenderContext;
    private boolean mUseRemote;
    private Plugin plugin;
    private ViewObject viewObject;
    private WidgetInstance widgetInstance;
    private FrameLayout wrapperLayout;
    private boolean isReAppear = false;
    private Map<Integer, WidgetInstance> id2widgetInstance = new HashMap();
    private final RenderRuntimeInfo renderRuntimeInfo = new RenderRuntimeInfo();

    /* loaded from: classes7.dex */
    public static class RenderConfig {
        public boolean ap2dp;
        public String dxEngineBizType;
        public int matchParentPaddingTop;
        public String reUseKey;

        static {
            kge.a(-134001285);
        }
    }

    static {
        kge.a(-696545567);
        kge.a(1651697441);
        kge.a(609993545);
        kge.a(1449137337);
        useNewPostAction = false;
    }

    public WidgetRenderImpl(String str, Context context, String str2) {
        this.identifier = str;
        this.context = context;
        this.mClassNamespace = str2;
        this.wrapperLayout = new FrameLayout(context);
    }

    public void setUseRemote(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4262fa2", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseRemote = z;
        }
    }

    public void setRenderConfig(RenderConfig renderConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e835cd5", new Object[]{this, renderConfig});
        } else {
            this.mRenderConfig = renderConfig;
        }
    }

    public void setRenderContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659d34c7", new Object[]{this, map});
        } else {
            this.mRenderContext = map;
        }
    }

    public static boolean isSnapshot(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a7647d8", new Object[]{viewGroup})).booleanValue() : "snapshot".equals(viewGroup.getTag());
    }

    public void setPlugin(Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7032fc31", new Object[]{this, plugin});
        } else {
            this.plugin = plugin;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner.Render
    public void render(ViewObject viewObject, EventDispatcher eventDispatcher) {
        Event event;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff22d76e", new Object[]{this, viewObject, eventDispatcher});
        } else if (this.isDispose) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            WidgetInstance widgetInstance = this.widgetInstance;
            Plugin plugin = this.plugin;
            if (plugin != null) {
                plugin.onRenderBefore(viewObject);
            }
            renderImpl(viewObject, eventDispatcher);
            if (widgetInstance == null && this.widgetInstance != null && (event = this.firstPaddingOnAppear) != null) {
                postEventImpl(event);
                this.firstPaddingOnAppear = null;
            }
            Plugin plugin2 = this.plugin;
            if (plugin2 != null) {
                plugin2.onRenderAfter(viewObject, this.wrapperLayout);
            }
            if (ApplicationUtil.isDebug()) {
                if (this.renderRuntimeInfo.renderCount < 10) {
                    this.renderRuntimeInfo.first10RenderTimes[this.renderRuntimeInfo.renderCount] = SystemClock.uptimeMillis() - uptimeMillis;
                }
                this.renderRuntimeInfo.renderCount++;
                Plugin plugin3 = this.plugin;
                if (plugin3 == null) {
                    return;
                }
                plugin3.onRenderRuntimeChanged(this.renderRuntimeInfo);
                return;
            }
            Plugin plugin4 = this.plugin;
            if (plugin4 == null) {
                return;
            }
            plugin4.onRenderRuntimeChanged(this.renderRuntimeInfo);
        }
    }

    private void renderImpl(ViewObject viewObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e464942e", new Object[]{this, viewObject, eventDispatcher});
            return;
        }
        if (viewObject.isSnapshot) {
            this.wrapperLayout.setTag("snapshot");
        } else if (this.wrapperLayout.getTag() != null) {
            this.wrapperLayout.setTag(null);
        }
        this.viewObject = viewObject;
        this.actionDispatcher = eventDispatcher;
        String str = viewObject.info.renderTemplate.name;
        if (this.widgetInstance == null) {
            this.widgetInstance = createView(viewObject.info.renderTemplate);
            this.lastName = viewObject.info.renderTemplate.name;
            if (this.widgetInstance != null) {
                this.wrapperLayout.removeAllViews();
                this.wrapperLayout.addView(this.widgetInstance.getView());
            }
        } else if (!this.lastName.equals(str)) {
            if (ApplicationUtil.isDebug()) {
                throw new RuntimeException("not support: replace root view.");
            }
            return;
        }
        WidgetInstance widgetInstance = this.widgetInstance;
        if (widgetInstance == null) {
            throw new RuntimeException("err|widgetInstance|null");
        }
        widgetInstance.bindViewObject(viewObject, eventDispatcher);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.message.lab.comfrm.inner.Render
    /* renamed from: getView */
    public View mo1139getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.wrapperLayout;
    }

    @Override // com.taobao.message.lab.comfrm.render.ViewService
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.context;
    }

    @Override // com.taobao.message.lab.comfrm.render.ViewService
    public boolean isSnapshot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b06ca99", new Object[]{this})).booleanValue() : isSnapshot(this.wrapperLayout);
    }

    private String getPoolKey(RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73e58a0a", new Object[]{this, renderTemplate});
        }
        if (renderTemplate.renderType.equalsIgnoreCase("dinamicX")) {
            return "__dinamicX";
        }
        if (!renderTemplate.renderType.equalsIgnoreCase("native")) {
            return null;
        }
        return renderTemplate.name;
    }

    @Override // com.taobao.message.lab.comfrm.render.ViewService
    public WidgetInstance createView(RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInstance) ipChange.ipc$dispatch("79b4dd53", new Object[]{this, renderTemplate});
        }
        String poolKey = getPoolKey(renderTemplate);
        WidgetInstance widgetInstance = (WidgetInstance) com.taobao.message.lab.comfrm.inner2.ClassPool.instance().getInstance(poolKey, WidgetInstance.class, this.identifier, this.mUseRemote, this.mClassNamespace);
        Map<String, Object> map = this.mRenderContext;
        if (map != null) {
            widgetInstance.setRenderContext(map);
        }
        RenderConfig renderConfig = this.mRenderConfig;
        if (renderConfig != null) {
            widgetInstance.setRenderConfig(renderConfig);
        }
        if (widgetInstance != null) {
            widgetInstance.setClassNamespace(this.mClassNamespace);
            TraceUtil.beginSection("CREATE-" + renderTemplate.name);
            View createView = widgetInstance.createView(getContext(), renderTemplate);
            TraceUtil.endTrace();
            widgetInstance.injectView(createView, this);
            this.id2widgetInstance.put(Integer.valueOf(widgetInstance.getId()), widgetInstance);
            if (this.id2widgetInstance.size() > 100) {
                Logger.e("WidgetRenderImpl", "id2widgetInstance|size|" + this.id2widgetInstance.size());
                AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "WidgetRenderCacheWidgetException", poolKey + "=" + this.id2widgetInstance.size(), 1.0d);
            }
            return widgetInstance;
        } else if (!ApplicationUtil.isDebug()) {
            return null;
        } else {
            throw new IllegalArgumentException("not find:" + poolKey);
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.ViewService
    public void dryRun(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a91d278", new Object[]{this, viewObject});
            return;
        }
        RenderTemplate renderTemplate = viewObject.info.renderTemplate;
        String poolKey = getPoolKey(renderTemplate);
        WidgetInstance widgetInstance = (WidgetInstance) com.taobao.message.lab.comfrm.inner2.ClassPool.instance().getInstance(poolKey, WidgetInstance.class, this.identifier, this.mUseRemote, this.mClassNamespace);
        if (widgetInstance != null) {
            widgetInstance.injectView(null, this);
            TraceUtil.beginSection("DRY-RUN-", renderTemplate.name);
            widgetInstance.dryRun(getContext(), viewObject);
            TraceUtil.endTrace();
        } else if (!ApplicationUtil.isDebug()) {
        } else {
            throw new IllegalArgumentException("not find:" + poolKey);
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.ViewService
    public void removeView(WidgetInstance widgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b152ec91", new Object[]{this, widgetInstance});
        } else {
            this.id2widgetInstance.remove(widgetInstance);
        }
    }

    public final void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        if (this.widgetInstance == null && "onAppear".equals(event.getName())) {
            this.firstPaddingOnAppear = event;
        }
        postEventImpl(event);
    }

    private void postEventImpl(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350271b4", new Object[]{this, event});
            return;
        }
        if (useNewPostAction) {
            WidgetInstance widgetInstance = this.widgetInstance;
            if (widgetInstance != null) {
                widgetInstance.postEvent(event);
            }
        } else {
            for (WidgetInstance widgetInstance2 : this.id2widgetInstance.values()) {
                widgetInstance2.postEvent(event);
            }
        }
        if (this.widgetInstance == null || !"onAppear".equals(event.getName())) {
            return;
        }
        if (this.isReAppear) {
            postEventImpl(new Event.Build("onReAppear").build());
        }
        this.isReAppear = true;
    }

    @Override // com.taobao.message.lab.comfrm.render.ViewQueryService
    public View getView(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c9ef8723", new Object[]{this, new Integer(i)}) : this.id2widgetInstance.get(Integer.valueOf(i)).getView();
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        for (WidgetInstance widgetInstance : this.id2widgetInstance.values()) {
            widgetInstance.dispose();
        }
        this.isDispose = true;
    }
}
