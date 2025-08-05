package com.taobao.message.lab.comfrm.render;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.core.WrapperEvent;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class WidgetInstance<T extends Serializable> implements WidgetInterface<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WidgetInstance";
    public String classNamespace;
    private EventDispatcher eventDispatcher;
    private int id;
    private boolean isDispose;
    private WidgetRenderImpl.RenderConfig renderConfig;
    private Map<String, Object> renderContext;
    @Deprecated
    private Map<String, WidgetInstance> subWidgetInstanceMap = new HashMap(2);
    private View view;
    private ViewObject viewObject;
    private ViewService viewService;

    static {
        kge.a(1129696608);
        kge.a(1134382542);
    }

    public abstract void bindData(T t, EventDispatcher eventDispatcher);

    public abstract View createView(Context context, RenderTemplate renderTemplate);

    public void onDryRun(Context context, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76212876", new Object[]{this, context, t});
        }
    }

    public final void injectView(View view, ViewService viewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52b941b", new Object[]{this, view, viewService});
            return;
        }
        this.view = view;
        this.viewService = viewService;
        this.id = hashCode();
    }

    public void setClassNamespace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7581096", new Object[]{this, str});
        } else {
            this.classNamespace = str;
        }
    }

    public void setRenderContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659d34c7", new Object[]{this, map});
        } else {
            this.renderContext = map;
        }
    }

    public Map<String, Object> getRenderContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4f58573f", new Object[]{this}) : this.renderContext;
    }

    public void setRenderConfig(WidgetRenderImpl.RenderConfig renderConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e835cd5", new Object[]{this, renderConfig});
        } else {
            this.renderConfig = renderConfig;
        }
    }

    public WidgetRenderImpl.RenderConfig getRenderConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetRenderImpl.RenderConfig) ipChange.ipc$dispatch("e26145d5", new Object[]{this}) : this.renderConfig;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInterface
    public final int getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.id;
    }

    public final void dryRun(Context context, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6aa85e", new Object[]{this, context, viewObject});
            return;
        }
        this.viewObject = viewObject;
        onDryRun(context, viewObject.data);
    }

    public boolean isSnapshot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9b06ca99", new Object[]{this})).booleanValue() : this.viewService.isSnapshot();
    }

    public final void dryRunSlotWidget(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb01dbf3", new Object[]{this, str});
        } else if (this.viewObject.children.get(str) == null) {
        } else {
            this.viewService.dryRun((ViewObject) this.viewObject.children.get(str));
        }
    }

    public final void dryRunSlotWidget(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9fc936", new Object[]{this, viewObject});
        } else if (viewObject == null) {
        } else {
            this.viewService.dryRun(viewObject);
        }
    }

    public final void bindViewObject(ViewObject viewObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1701e043", new Object[]{this, viewObject, eventDispatcher});
            return;
        }
        if (ComponentFrmModule.ENABLE_DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append(getId());
            sb.append("|bindViewObject|");
            sb.append(JSON.toJSONString(viewObject));
            sb.append("|old|");
            ViewObject viewObject2 = this.viewObject;
            if (viewObject2 != null) {
                sb.append(JSON.toJSONString(viewObject2));
            }
            Logger.d(TAG, sb.toString());
        }
        this.viewObject = viewObject;
        this.eventDispatcher = eventDispatcher;
        TraceUtil.beginSection("bindData_", (viewObject.info.renderTemplate == null || viewObject.info.renderTemplate.renderData == null) ? "" : (String) viewObject.info.renderTemplate.renderData.get("name"));
        bindData(viewObject.data, new EventDispatcherWrapper(this.id, viewObject, eventDispatcher));
        TraceUtil.endTrace();
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInterface
    public final View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.view;
    }

    public final WidgetInstance createSubView(RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetInstance) ipChange.ipc$dispatch("6944cfab", new Object[]{this, renderTemplate}) : this.viewService.createView(renderTemplate);
    }

    public final void bindSubViewData(WidgetInstance widgetInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c886eff2", new Object[]{this, widgetInstance, str});
        } else if (widgetInstance == null) {
        } else {
            widgetInstance.bindViewObject((ViewObject) this.viewObject.children.get(str), this.eventDispatcher);
            if (this.viewObject.info.style == null) {
                return;
            }
            if ("gone".equals(ValueUtil.getString(this.viewObject.info.style, "visibility", "visible"))) {
                this.view.setVisibility(8);
            } else {
                this.view.setVisibility(0);
            }
        }
    }

    public final WidgetInstance createSlotWidgetIfNotExist(String str) {
        RenderTemplate subViewTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInstance) ipChange.ipc$dispatch("64f9dbe1", new Object[]{this, str});
        }
        WidgetInstance widgetInstance = this.subWidgetInstanceMap.get(str);
        if (widgetInstance != null || (subViewTemplate = getSubViewTemplate(str)) == null) {
            return widgetInstance;
        }
        WidgetInstance createSubView = createSubView(subViewTemplate);
        this.subWidgetInstanceMap.put(str, createSubView);
        return createSubView;
    }

    public final RenderTemplate getSubViewTemplate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderTemplate) ipChange.ipc$dispatch("e76330b4", new Object[]{this, str});
        }
        if (this.viewObject.children.get(str) == null) {
            return null;
        }
        return ((ViewObject) this.viewObject.children.get(str)).info.renderTemplate;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (!this.isDispose) {
            for (WidgetInstance widgetInstance : this.subWidgetInstanceMap.values()) {
                widgetInstance.dispose();
            }
            ViewService viewService = this.viewService;
            if (viewService != null) {
                viewService.removeView(this);
            }
            this.isDispose = true;
        }
    }

    public void onRefresh(T t, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87d3b43", new Object[]{this, t, eventDispatcher});
        } else {
            bindData(t, eventDispatcher);
        }
    }

    public final void refreshView(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec92417b", new Object[]{this, t});
            return;
        }
        ViewObject viewObject = this.viewObject;
        if (viewObject == null) {
            return;
        }
        if (viewObject.diff != null) {
            this.viewObject = new ViewObject(this.viewObject);
            this.viewObject.diff = null;
        }
        if (t instanceof Map) {
            if (this.viewObject.data != null) {
                ((Map) this.viewObject.data).putAll((Map) t);
            } else {
                this.viewObject.data = t;
            }
        } else {
            this.viewObject.data = t;
        }
        TraceUtil.beginSection("refreshView", this.viewObject.info.renderTemplate.name);
        onRefresh(this.viewObject.data, new EventDispatcherWrapper(this.id, this.viewObject, this.eventDispatcher));
        TraceUtil.endTrace();
    }

    public final void refreshView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979ad0a7", new Object[]{this});
            return;
        }
        ViewObject viewObject = this.viewObject;
        if (viewObject != null) {
            if (viewObject.diff != null) {
                this.viewObject = new ViewObject(this.viewObject);
                this.viewObject.diff = null;
            }
            onRefresh(this.viewObject.data, new EventDispatcherWrapper(this.id, this.viewObject, this.eventDispatcher));
        }
        for (WidgetInstance widgetInstance : this.subWidgetInstanceMap.values()) {
            widgetInstance.refreshView();
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInterface
    public void postEvent(Event event) {
        EventDispatcher eventDispatcher;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        ViewObject viewObject = this.viewObject;
        if (viewObject != null && (eventDispatcher = this.eventDispatcher) != null) {
            new EventDispatcherWrapper(this.id, viewObject, eventDispatcher).dispatch(event);
        }
        if (!WidgetRenderImpl.useNewPostAction) {
            return;
        }
        for (WidgetInstance widgetInstance : this.subWidgetInstanceMap.values()) {
            widgetInstance.postEvent(event);
        }
    }

    public RenderResult getRenderResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RenderResult) ipChange.ipc$dispatch("26051047", new Object[]{this}) : new RenderResult();
    }

    public final ViewObject getViewObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewObject) ipChange.ipc$dispatch("87ef67f0", new Object[]{this}) : this.viewObject;
    }

    /* loaded from: classes7.dex */
    public static class EventDispatcherWrapper implements EventDispatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final EventDispatcher eventDispatcher;
        private final int id;
        private final ViewObject viewObject;

        static {
            kge.a(860388438);
            kge.a(-1479043101);
        }

        public EventDispatcherWrapper(int i, ViewObject viewObject, EventDispatcher eventDispatcher) {
            this.id = i;
            this.viewObject = viewObject;
            this.eventDispatcher = eventDispatcher;
        }

        @Override // com.taobao.message.lab.comfrm.core.EventDispatcher
        public void dispatch(Event event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e55a714", new Object[]{this, event});
                return;
            }
            boolean z = event instanceof WrapperEvent;
            if (z && ((WrapperEvent) event).getViewObject() != null) {
                this.eventDispatcher.dispatch(event);
                return;
            }
            HashMap hashMap = new HashMap();
            if (event.getContext() != null) {
                hashMap.putAll(event.getContext());
            }
            hashMap.put("id", Integer.valueOf(this.id));
            hashMap.put("event", event);
            this.eventDispatcher.dispatch(new WrapperEvent.Build(event.getName()).viewObject(this.viewObject).data(event.getData()).auraEventHandler(z ? ((WrapperEvent) event).getAuraEventHandler() : null).context(hashMap).build());
        }
    }
}
