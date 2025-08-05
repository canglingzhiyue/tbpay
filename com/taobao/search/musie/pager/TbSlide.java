package com.taobao.search.musie.pager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.search.musie.pager.TbSlideDelegateNode;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class TbSlide extends UINode implements p.b, TbSlideDelegateNode.a, a, b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TbSlideItem currentSelectedNode;
    private final TbSlideDelegateNode delegateNode;

    static {
        kge.a(2111245595);
        kge.a(-1567909089);
        kge.a(-105711164);
        kge.a(-660321761);
        kge.a(1810451999);
        kge.a(265870560);
    }

    private final String getState(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e63d9ae", new Object[]{this, new Boolean(z)}) : z ? "1" : "0";
    }

    public static /* synthetic */ Object ipc$super(TbSlide tbSlide, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2062288793:
                return super.findNodeById(((Number) objArr[0]).intValue());
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 908957670:
                super.onBindInstance((UINode) objArr[0], (MUSDKInstance) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean viewSupportRenderNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c229a54d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public TbSlide(int i) {
        super(i);
        this.delegateNode = new TbSlideDelegateNode(getNodeId(), this, this);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new TbSlideLayout(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onBindInstance(UINode uINode, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d97e6", new Object[]{this, uINode, mUSDKInstance});
            return;
        }
        super.onBindInstance(uINode, mUSDKInstance);
        this.delegateNode.setInstance(mUSDKInstance);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> runnableList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, runnableList});
            return;
        }
        q.c(runnableList, "runnableList");
        this.delegateNode.collectBatchTasks(runnableList);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        TbSlideDelegateNode tbSlideDelegateNode = this.delegateNode;
        if (uINode == null) {
            q.a();
        }
        tbSlideDelegateNode.addChild(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
            return;
        }
        TbSlideDelegateNode tbSlideDelegateNode = this.delegateNode;
        if (uINode == null) {
            q.a();
        }
        tbSlideDelegateNode.addChild(i, uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue() : this.delegateNode.indexOf(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        UINode childAt = this.delegateNode.getChildAt(i);
        q.a((Object) childAt, "delegateNode.getChildAt(index)");
        return childAt;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else {
            this.delegateNode.removeChildAt(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.delegateNode.moveNode(i, i2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue() : this.delegateNode.getChildCount();
    }

    @MUSNodeProp(name = "maxDistance")
    public final void setMaxDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fd3308", new Object[]{this, str});
        } else {
            setAttribute("maxDistance", str);
        }
    }

    @MUSNodeProp(name = "invokeDistance")
    public final void setInvokeDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d186e0", new Object[]{this, str});
        } else {
            setAttribute("invokeDistance", str);
        }
    }

    @MUSNodeProp(name = "maxDistance", refresh = true)
    public final void refreshMaxDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e42cfaf", new Object[]{this, str});
        } else {
            updateMaxDistance(str);
        }
    }

    @MUSNodeProp(name = "invokeDistance", refresh = true)
    public final void refreshInvokeDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea254d9", new Object[]{this, str});
        } else {
            updateInvokeDistance(str);
        }
    }

    @MUSNodeProp(name = "itemMargin")
    public final void setItemMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea3e6f4", new Object[]{this, str});
        } else {
            setAttribute("itemMargin", str);
        }
    }

    @MUSNodeProp(name = "itemSpacing")
    public final void setItemSpacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423ff", new Object[]{this, str});
        } else {
            setAttribute("itemSpacing", str);
        }
    }

    @MUSNodeProp(name = "itemMargin", refresh = true)
    public final void refreshItemMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1174996d", new Object[]{this, str});
        } else {
            updateItemMargin(str);
        }
    }

    @MUSNodeProp(name = "itemSpacing", refresh = true)
    public final void refreshItemSpacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9c0a6", new Object[]{this, str});
        } else {
            updateItemSpacing(str);
        }
    }

    @MUSNodeProp(name = "autoplay")
    public final void setAutoPlay(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f415c1", new Object[]{this, bool});
            return;
        }
        if (bool == null) {
            bool = false;
        }
        setAttribute("autoplay", bool);
    }

    @MUSNodeProp(name = "autoplay", refresh = true)
    public final void refreshAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e8a46f", new Object[]{this, new Boolean(z)});
        } else {
            updateCurrentPlayState();
        }
    }

    @MUSNodeProp(name = "autoscroll")
    public final void setAutoScroll(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a061f648", new Object[]{this, bool});
            return;
        }
        if (bool == null) {
            bool = false;
        }
        setAttribute("autoscroll", bool);
    }

    private final boolean isAutoScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3f26fb1", new Object[]{this})).booleanValue() : q.a(getAttribute("autoscroll"), (Object) true);
    }

    private final boolean isAutoPlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("382b6ad8", new Object[]{this})).booleanValue() : q.a(getAttribute("autoplay"), (Object) true);
    }

    private final void updateMaxDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b861f81", new Object[]{this, str});
        } else {
            ((TbSlideLayout) getMountContent()).updateMaxDistance(sizeToPixel(str));
        }
    }

    private final void updateInvokeDistance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac81bc7", new Object[]{this, str});
        } else {
            ((TbSlideLayout) getMountContent()).updateInvokeDistance(sizeToPixel(str));
        }
    }

    private final void updateItemMargin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357f075b", new Object[]{this, str});
        } else {
            ((TbSlideLayout) getMountContent()).updateItemMargin(sizeToPixel(str));
        }
    }

    private final void updateItemSpacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fd1078", new Object[]{this, str});
        } else {
            ((TbSlideLayout) getMountContent()).updateItemSpacing(sizeToPixel(str));
        }
    }

    private final int sizeToPixel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca1da48e", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            str = "0";
        }
        return (int) i.a(str);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        if (findNodeById != null) {
            return findNodeById;
        }
        UINode findNodeById2 = this.delegateNode.findNodeById(i);
        q.a((Object) findNodeById2, "delegateNode.findNodeById(nodeId)");
        return findNodeById2;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.musie.pager.TbSlideLayout");
        }
        TbSlideLayout tbSlideLayout = (TbSlideLayout) obj;
        tbSlideLayout.mount(this);
        tbSlideLayout.refresh(this.delegateNode.getNodeTreeList(), this.delegateNode.getFooterNode());
        updateMaxDistance((String) getAttribute("maxDistance"));
        updateInvokeDistance((String) getAttribute("invokeDistance"));
        updateItemMargin((String) getAttribute("itemMargin"));
        updateItemSpacing((String) getAttribute("itemSpacing"));
        registerNativeStateListener("videostatus", this);
        this.currentSelectedNode = this.delegateNode.getChildNode(0);
        updateCurrentPlayState();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.musie.pager.TbSlideLayout");
        }
        ((TbSlideLayout) obj).unmount();
        TbSlideItem tbSlideItem = this.currentSelectedNode;
        if (tbSlideItem != null) {
            tbSlideItem.setCanPlay(false);
        }
        this.currentSelectedNode = null;
        unregisterNativeStateListener("videostatus", this);
    }

    @Override // com.taobao.search.musie.pager.b
    public void onItemSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb34d2f", new Object[]{this, new Integer(i)});
            return;
        }
        if (hasEvent("itemselected")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "index", String.valueOf(i));
            fireEvent("itemselected", jSONObject);
        }
        TbSlideItem childNode = this.delegateNode.getChildNode(i);
        if (q.a(this.currentSelectedNode, childNode)) {
            return;
        }
        TbSlideItem tbSlideItem = this.currentSelectedNode;
        if (tbSlideItem != null) {
            tbSlideItem.setCanPlay(false);
        }
        this.currentSelectedNode = childNode;
        updateCurrentPlayState();
    }

    @Override // com.taobao.search.musie.pager.TbSlideDelegateNode.a
    public void onChildrenChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defaf7d5", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) getMountContent();
        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (!(adapter instanceof g)) {
            adapter = null;
        }
        g gVar = (g) adapter;
        if (gVar == null) {
            return;
        }
        gVar.a(this.delegateNode.getNodeTreeList());
    }

    public void onStateChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6b3c2b", new Object[]{this, new Boolean(z)});
        } else if (!hasEvent("statechange")) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "state", getState(z));
            fireEvent("statechange", jSONObject);
        }
    }

    public void onBounceBack(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4051f", new Object[]{this, new Boolean(z)});
        } else if (!hasEvent("bounceback")) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "state", getState(z));
            fireEvent("bounceback", jSONObject);
        }
    }

    private final void updateCurrentPlayState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2439534", new Object[]{this});
        } else if (isAutoPlay()) {
            TbSlideItem tbSlideItem = this.currentSelectedNode;
            if (tbSlideItem == null) {
                return;
            }
            tbSlideItem.setCanPlay(true);
        } else {
            TbSlideItem tbSlideItem2 = this.currentSelectedNode;
            if (tbSlideItem2 == null) {
                return;
            }
            tbSlideItem2.setCanPlay(TextUtils.equals(getNativeState("videostatus"), "play"));
        }
    }

    @Override // com.taobao.android.weex_framework.p.b
    public void onNativeStateChange(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63f0e06", new Object[]{this, str, str2});
        } else if (!TextUtils.equals(str, "videostatus")) {
        } else {
            updateCurrentPlayState();
        }
    }

    @Override // com.taobao.search.musie.pager.a
    public void onVideoPlayFinish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e00559", new Object[]{this, new Integer(i)});
            return;
        }
        TbSlideLayout tbSlideLayout = (TbSlideLayout) getMountContent();
        if (tbSlideLayout == null || tbSlideLayout.isTouching() || !isAutoScroll()) {
            return;
        }
        onItemSelected(i);
        tbSlideLayout.scrollToPosition(i);
    }
}
