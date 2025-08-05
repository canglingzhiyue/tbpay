package com.taobao.message.lab.comfrm.inner2;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
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
import com.taobao.message.lab.comfrm.util.TraceUtil;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class PluginAdapter implements Plugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1874039333);
        kge.a(-1003931948);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onAwaitFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8883884", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectEnd(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66a91f0", new Object[]{this, viewObject});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerBasicInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a38695f", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerConfigInfo(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a058ccc", new Object[]{this, configInfo});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerDisposeFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56faef6", new Object[]{this});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartEnd(ConfigInfo configInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f9b7d5", new Object[]{this, configInfo});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandelerExecuted(EventManager.EventRuntimeInfo eventRuntimeInfo, Action action, EventHandleRuntime eventHandleRuntime, EventManager.TraceSpan traceSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbfa513", new Object[]{this, eventRuntimeInfo, action, eventHandleRuntime, traceSpan});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandleAwaitDependenceEnd(Action action, EventHandler eventHandler, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6cc110f", new Object[]{this, action, eventHandler, str, new Boolean(z)});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventHandleAwaitDependenceStart(Action action, EventHandler eventHandler, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511ae6ec", new Object[]{this, action, eventHandler, str});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onEventReceived(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e5ba16", new Object[]{this, event});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerEnd(Action action, TransformerItem transformerItem, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e335a286", new Object[]{this, action, transformerItem, dependecy});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onJSTransformerStart(Action action, TransformerItem transformerItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d1a4c", new Object[]{this, action, transformerItem});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec26feb0", new Object[]{this, viewObject, viewGroup});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderRuntimeChanged(RenderRuntimeInfo renderRuntimeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8352d31e", new Object[]{this, renderRuntimeInfo});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(SourceItem sourceItem, Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693b6090", new Object[]{this, sourceItem, action});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceRuntimeChanged(Map<String, SourceManager.SourceRuntimeInfo> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88c328", new Object[]{this, map});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceTimeout(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300e271f", new Object[]{this, list});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onStateRuntimeChanged(StateManager.StateRuntimeInfo stateRuntimeInfo, StateManager.StateTraceSpan stateTraceSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fec3d2", new Object[]{this, stateRuntimeInfo, stateTraceSpan});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerEnd(Action action, TransformerItem transformerItem, String str, Dependecy dependecy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68509707", new Object[]{this, action, transformerItem, str, dependecy});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onTransformerStart(Action action, TransformerItem transformerItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae452f4d", new Object[]{this, action, transformerItem, str});
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectStart(LayoutInfo layoutInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689c1901", new Object[]{this, layoutInfo});
            return;
        }
        TraceUtil.beginSection("onBuildViewObject" + layoutInfo.renderTemplate.name);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Plugin
    public void onBuildViewObjectStart(LayoutInfo layoutInfo, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28490da5", new Object[]{this, layoutInfo, sharedState});
        } else {
            TraceUtil.endTrace();
        }
    }
}
