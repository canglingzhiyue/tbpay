package com.taobao.message.lab.comfrm.inner2;

import android.view.ViewGroup;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.EventManager;
import com.taobao.message.lab.comfrm.inner2.SourceManager;
import com.taobao.message.lab.comfrm.inner2.StateManager;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.inner2.event.EventHandleRuntime;
import com.taobao.message.lab.comfrm.render.RenderRuntimeInfo;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface Plugin {
    void onAwaitFinished(boolean z);

    void onBuildViewObjectEnd(ViewObject viewObject);

    void onBuildViewObjectStart(LayoutInfo layoutInfo);

    void onBuildViewObjectStart(LayoutInfo layoutInfo, SharedState sharedState);

    void onContainerBasicInfo(String str, String str2, String str3);

    void onContainerConfigInfo(ConfigInfo configInfo);

    void onContainerDisposeFinished();

    @Deprecated
    void onContainerStartEnd(ConfigInfo configInfo);

    @Deprecated
    void onContainerStartStart(String str, String str2, String str3);

    void onEventHandelerExecuted(EventManager.EventRuntimeInfo eventRuntimeInfo, Action action, EventHandleRuntime eventHandleRuntime, EventManager.TraceSpan traceSpan);

    void onEventHandleAwaitDependenceEnd(Action action, EventHandler eventHandler, String str, boolean z);

    void onEventHandleAwaitDependenceStart(Action action, EventHandler eventHandler, String str);

    void onEventReceived(Event event);

    void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy);

    void onJSTransformerStart(Action action, TransformerItem transformerItem);

    void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup);

    void onRenderBefore(ViewObject viewObject);

    void onRenderRuntimeChanged(RenderRuntimeInfo renderRuntimeInfo);

    void onSourceEnd(SourceItem sourceItem, Action action);

    void onSourceRuntimeChanged(Map<String, SourceManager.SourceRuntimeInfo> map);

    void onSourceStart(SourceItem sourceItem, Command command);

    void onSourceTimeout(List<String> list);

    void onStateRuntimeChanged(StateManager.StateRuntimeInfo stateRuntimeInfo, StateManager.StateTraceSpan stateTraceSpan);

    void onTransformerEnd(Action action, TransformerItem transformerItem, String str, Dependecy dependecy);

    void onTransformerStart(Action action, TransformerItem transformerItem, String str);
}
