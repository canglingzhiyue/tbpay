package com.taobao.tab2interact.pageadapter.guangguang;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.tab2interact.core.a;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ah;
import com.taobao.tao.flexbox.layoutmanager.core.s;
import com.taobao.tao.flexbox.layoutmanager.event.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.est;
import tb.kge;
import tb.oeb;
import tb.ogl;
import tb.pfq;
import tb.piq;
import tb.qdj;
import tb.skq;
import tb.sus;

/* loaded from: classes8.dex */
public class GGInteractContainerComponent extends Component<View, ogl> implements ah, s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FLUID_BIZ_NAME_SEPARATOR = "_";
    private static final String FLUID_BIZ_TYPE = "ggtab3";
    private static final int LEVEL_INTERACT_CONTAINER_VIEW = 100;
    private static final String PAGE_QUERY_CHANGE_ARGS_QUERY = "query";
    private static final String TAB_APPEAR_DISAPPEAR_ARGS_TRIGGER_TYPE_NAVIGATION = "navigation";
    private static final String TAB_APPEAR_DISAPPEAR_ARGS_TRIGGER_TYPE_OTHER = "other";
    private static final String TAB_APPEAR_DISAPPEAR_ARGS_TRIGGER_TYPE_TAB = "tab";
    private static final String TAB_LIFE_CYCLE_ARGS_ID = "id";
    private static final String TAB_LIFE_CYCLE_ARGS_TRIGGER_TYPE = "triggerType";
    private static final String TAB_LIFE_CYCLE_ARGS_TYPE = "type";
    private static final String TAG = "GGInteractContainerComponent";
    private a interactContainer;
    private pfq interactTabAdapterManager;

    static {
        kge.a(2100415721);
        kge.a(-64703456);
        kge.a(-1420926486);
    }

    public static /* synthetic */ Object ipc$super(GGInteractContainerComponent gGInteractContainerComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 112483626) {
            super.onCreate((aa) objArr[0]);
            return null;
        } else if (hashCode == 1375152011) {
            super.onAttach();
            return null;
        } else if (hashCode != 2127624665) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetach();
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(aa aaVar, aa aaVar2, String str, String str2, Map map, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onCreate(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b45d2a", new Object[]{this, aaVar});
            return;
        }
        super.onCreate(aaVar);
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "互动容器组件创建的时机");
        createInteractInstance();
    }

    private void createInteractInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255f8f0e", new Object[]{this});
            return;
        }
        Context N = this.node.N();
        if (N == null) {
            return;
        }
        sus susVar = new sus();
        com.taobao.tab2interact.core.data.baseinfo.a aVar = new com.taobao.tab2interact.core.data.baseinfo.a();
        this.interactContainer = new a(N, susVar, aVar);
        com.taobao.tab2interact.core.component.browser.a aVar2 = new com.taobao.tab2interact.core.component.browser.a(N, this.interactContainer.c(), susVar, aVar);
        this.interactContainer.a(aVar2);
        com.taobao.tab2interact.core.layer.h5.a aVar3 = new com.taobao.tab2interact.core.layer.h5.a(N, this.interactContainer.c(), susVar, aVar);
        this.interactContainer.a(aVar3);
        est estVar = new est();
        this.interactTabAdapterManager = new pfq(susVar, estVar);
        piq piqVar = new piq(susVar, aVar, estVar, aVar2);
        qdj qdjVar = new qdj(susVar, aVar, estVar, aVar3);
        this.interactTabAdapterManager.a(piqVar);
        this.interactTabAdapterManager.a(qdjVar);
        this.interactContainer.a();
        this.interactTabAdapterManager.a();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
            return;
        }
        super.onAttach();
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "互动容器组件attach的时机");
        attachInteractContainerView();
    }

    private void attachInteractContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d75c39f2", new Object[]{this});
            return;
        }
        TNodeView tNodeView = getTNodeView();
        if (tNodeView == null || this.interactContainer == null) {
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "将互动容器View添加到TNode根节点上，满足添加条件");
        tNodeView.addUpperView(this.interactContainer.c(), new FrameLayout.LayoutParams(-1, -1), 100, null);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "互动容器组件detach的时机");
        detachInteractContainerView();
    }

    private void detachInteractContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf88464", new Object[]{this});
            return;
        }
        TNodeView tNodeView = getTNodeView();
        if (tNodeView == null || this.interactContainer == null) {
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "将互动容器View从TNode根节点上移除，满足移除条件");
        tNodeView.removeUpperView(this.interactContainer.c());
    }

    private TNodeView getTNodeView() {
        ab k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("e1b19e09", new Object[]{this});
        }
        aa tNode = getTNode();
        if (tNode != null && (k = tNode.k()) != null) {
            return k.h();
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar != null) {
            String str = eVar.c;
            char c = 65535;
            switch (str.hashCode()) {
                case -1191392038:
                    if (str.equals("onpagequerychanged")) {
                        c = 4;
                        break;
                    }
                    break;
                case -870097139:
                    if (str.equals("ontabdisappear")) {
                        c = 2;
                        break;
                    }
                    break;
                case -32250261:
                    if (str.equals("ontabappear")) {
                        c = 1;
                        break;
                    }
                    break;
                case 26524114:
                    if (str.equals("ontabcreate")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1228998971:
                    if (str.equals("ondestroy")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1351066084:
                    if (str.equals("ontabdestroy")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                handleTabCreate(eVar.d, eVar.f20300a);
            } else if (c == 1) {
                handleTabAppear(eVar.d);
            } else if (c == 2) {
                handleTabDisappear(eVar.d);
            } else if (c == 3) {
                handleTabDestroy(eVar.d);
            } else if (c == 4) {
                handlePageQueryChange(eVar.d);
            } else if (c == 5) {
                handleDestroy();
            }
        }
        return false;
    }

    private void handleTabCreate(Map map, aa aaVar) {
        aa a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1ba2fd", new Object[]{this, map, aaVar});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab创建的消息，args=" + map);
        final String argsId = getArgsId(map);
        String argsType = getArgsType(map);
        if (this.interactContainer == null || this.interactTabAdapterManager == null || TextUtils.isEmpty(argsId) || TextUtils.isEmpty(argsType) || aaVar == null) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab创建的消息，不满足条件");
            return;
        }
        if (TextUtils.equals(argsType, "video")) {
            String str = "ggtab3_" + argsId;
            if (oeb.ai()) {
                str = FluidInstanceConfig.appendBizName("ggtab3", argsId, getEngineId());
            }
            if (!TextUtils.isEmpty(str)) {
                this.interactTabAdapterManager.a(argsId, str);
            }
        }
        if (TextUtils.equals(argsType, "live") && (a2 = getNode().ak().a(com.taobao.android.tab2liveroom.liveroom.a.class, (aa.c) new aa.c<aa>() { // from class: com.taobao.tab2interact.pageadapter.guangguang.GGInteractContainerComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean b(aa aaVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("aca84e15", new Object[]{this, aaVar2})).booleanValue();
                }
                return false;
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.aa.c
            public boolean a(aa aaVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("691d3054", new Object[]{this, aaVar2})).booleanValue() : argsId.equals(aaVar2.e("tab-id"));
            }
        }, false)) != null && (a2.I() instanceof com.taobao.android.tab2liveroom.liveroom.a)) {
            this.interactTabAdapterManager.a(argsId, (com.taobao.android.tab2liveroom.liveroom.a) a2.I());
        }
        this.interactContainer.a(argsId, argsType);
    }

    private void handleTabAppear(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158ac89c", new Object[]{this, map});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab可见的消息，args=" + map);
        if (!skq.d()) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab可见的消息，未开启Tab2全局互动");
            return;
        }
        String argsId = getArgsId(map);
        String argsTriggerType = getArgsTriggerType(map);
        if (this.interactContainer == null || TextUtils.isEmpty(argsId) || TextUtils.isEmpty(argsTriggerType)) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab可见的消息，不满足条件");
        } else if (TextUtils.equals(argsTriggerType, "tab")) {
            this.interactContainer.b(argsId, "tab");
        } else if (TextUtils.equals(argsTriggerType, "navigation")) {
            this.interactContainer.a("navigation");
            this.interactContainer.b(argsId, "navigation");
        } else if (!TextUtils.equals(argsTriggerType, "other")) {
        } else {
            this.interactContainer.a("other");
            this.interactContainer.b(argsId, "other");
        }
    }

    private void handleTabDisappear(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ebde88", new Object[]{this, map});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab不可见的消息，args=" + map);
        if (!skq.d()) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab不可见的消息，未开启Tab2全局互动");
            return;
        }
        String argsId = getArgsId(map);
        String argsTriggerType = getArgsTriggerType(map);
        if (this.interactContainer == null || TextUtils.isEmpty(argsId) || TextUtils.isEmpty(argsTriggerType)) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab不可见的消息，不满足条件");
        } else if (TextUtils.equals(argsTriggerType, "tab")) {
            this.interactContainer.c(argsId, "tab");
        } else if (TextUtils.equals(argsTriggerType, "navigation")) {
            this.interactContainer.c(argsId, "navigation");
            this.interactContainer.b("navigation");
        } else if (!TextUtils.equals(argsTriggerType, "other")) {
        } else {
            this.interactContainer.c(argsId, "other");
            this.interactContainer.b("other");
        }
    }

    private void handleTabDestroy(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ad2011", new Object[]{this, map});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab销毁的消息，args=" + map);
        String argsId = getArgsId(map);
        if (this.interactContainer == null || this.interactTabAdapterManager == null || TextUtils.isEmpty(argsId)) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理Tab销毁的消息，不满足条件");
            return;
        }
        this.interactContainer.c(argsId);
        this.interactTabAdapterManager.a(argsId);
    }

    private void handlePageQueryChange(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfc293d", new Object[]{this, map});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理页面URL参数发生改变的消息，args=" + map);
        if (map == null) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理页面URL参数发生改变的消息，args无效");
            return;
        }
        Object obj = map.get("query");
        if (!(obj instanceof Map)) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理页面URL参数发生改变的消息，query无效");
            return;
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && !TextUtils.isEmpty(key.toString())) {
                hashMap.put(key.toString(), value != null ? value.toString() : "");
            }
        }
        if (this.interactContainer == null || hashMap.isEmpty()) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理页面URL参数发生改变的消息，interactContainer或copyQuery为空");
        } else {
            this.interactContainer.a(hashMap);
        }
    }

    private void handleDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bce839", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理销毁的消息");
        a aVar = this.interactContainer;
        if (aVar == null || this.interactTabAdapterManager == null) {
            com.taobao.tab2interact.core.utils.a.b(this, TAG, "处理销毁的消息，不满足条件");
            return;
        }
        aVar.b();
        this.interactTabAdapterManager.b();
    }

    private String getArgsId(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d5458710", new Object[]{this, map}) : getArgsString(map, "id");
    }

    private String getArgsType(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b7aea4ef", new Object[]{this, map}) : getArgsString(map, "type");
    }

    private String getArgsTriggerType(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9451281", new Object[]{this, map}) : getArgsString(map, "triggerType");
    }

    private String getArgsString(Map map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba1c7b7c", new Object[]{this, map, str});
        }
        if (map != null && (obj = map.get(str)) != null) {
            return obj.toString();
        }
        return null;
    }

    private String getEngineId() {
        ab k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca44c66", new Object[]{this});
        }
        if (this.node != null && (k = this.node.k()) != null) {
            return k.U();
        }
        return null;
    }
}
