package com.taobao.search.musie.component.tbscroll;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.ui.i;
import com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode;
import com.taobao.android.weex_uikit.widget.scroller.c;
import com.taobao.search.musie.component.tbscroll.BounceScrollView;
import com.taobao.weex.common.Constants;
import java.util.List;
import tb.ivx;
import tb.kge;

/* loaded from: classes7.dex */
public class TbScroller extends UINode implements c, BounceScrollView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_BOUNCE_BACK = "bounceback";
    private static final String EVENT_STATE_CHANGE = "statechanged";
    private static final String LOG_TAG = "EleScroller";
    private static final String PROP_HEAD_INVOKE_DISTANCE = "headInvokeDistance";
    private static final String PROP_HEAD_MAX_DISTANCE = "headMaxDistance";
    private static final String PROP_INVOKE_DISTANCE = "invokeDistance";
    private static final String PROP_MAX_DISTANCE = "maxDistance";
    private static final String PROP_SHOW_SCROLLBAR = "showScrollbar";
    private static final String PROP_SYNC_KEY = "syncKey";
    private ScrollerRootNode contentNode;
    private i contentNodeTree;
    private ScrollerRootNode footNode;
    private i footNodeTree;
    private int lastScrollDistance;
    private String lastSyncKey;
    private final a scrollOffsetManager;
    private Runnable scrollToDelayTask;

    static {
        kge.a(-1588535218);
        kge.a(-1341537095);
        kge.a(-369927150);
        kge.a(1024030747);
    }

    public static /* synthetic */ Object ipc$super(TbScroller tbScroller, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -2062288793) {
            if (hashCode == -2024255335) {
                super.onUpdateLayout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            } else if (hashCode != -1705119336) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.setInstance((MUSDKInstance) objArr[0]);
                return null;
            }
        }
        return super.findNodeById(((Number) objArr[0]).intValue());
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public TbScroller(int i) {
        super(i);
        this.scrollOffsetManager = new a();
        this.contentNode = new ScrollerRootNode(i);
        this.contentNode.setParentNode(this);
        this.contentNode.setVertical(false);
        this.contentNodeTree = new i();
        this.contentNodeTree.a(this.contentNode);
        this.contentNodeTree.a(false);
        this.footNode = new ScrollerRootNode(i);
        this.footNode.setParentNode(this);
        this.footNode.setVertical(false);
        this.footNodeTree = new i();
        this.footNodeTree.a(this.footNode);
        this.footNodeTree.a(false);
    }

    @MUSNodeProp(name = PROP_MAX_DISTANCE)
    public void setMaxDistance(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597326b", new Object[]{this, mUSValue});
        } else {
            setAttribute(PROP_MAX_DISTANCE, Integer.valueOf((int) com.taobao.android.weex_framework.util.i.a(mUSValue)));
        }
    }

    @MUSNodeProp(name = PROP_MAX_DISTANCE, refresh = true)
    public void refreshMaxDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef4527e", new Object[]{this, new Integer(i)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView == null) {
            return;
        }
        bounceScrollView.setMaxDistance(i);
    }

    @MUSNodeProp(name = PROP_HEAD_MAX_DISTANCE)
    public void setHeadMaxDistance(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c451516b", new Object[]{this, mUSValue});
        } else {
            setAttribute(PROP_HEAD_MAX_DISTANCE, Integer.valueOf((int) com.taobao.android.weex_framework.util.i.a(mUSValue)));
        }
    }

    @MUSNodeProp(name = PROP_HEAD_MAX_DISTANCE, refresh = true)
    public void refreshHeadMaxDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42aefe", new Object[]{this, new Integer(i)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView == null) {
            return;
        }
        bounceScrollView.setHeadMaxDistance(i);
    }

    @MUSNodeProp(name = PROP_SYNC_KEY)
    public void setSyncKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a65f813", new Object[]{this, str});
        } else {
            setAttribute(PROP_SYNC_KEY, str);
        }
    }

    @MUSNodeProp(name = PROP_SYNC_KEY, refresh = true)
    public void refreshSyncKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ca003a", new Object[]{this, str});
        } else if (TextUtils.equals(str, this.lastSyncKey)) {
        } else {
            BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
            unregisterSyncKey(this.lastSyncKey, bounceScrollView);
            registerSyncKey(str, bounceScrollView);
        }
    }

    private int getMaxDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5813e33d", new Object[]{this})).intValue() : getValue(PROP_MAX_DISTANCE);
    }

    private int getHeadMaxDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58925c3d", new Object[]{this})).intValue() : getValue(PROP_HEAD_MAX_DISTANCE);
    }

    @MUSNodeProp(name = PROP_INVOKE_DISTANCE)
    public void setInvokeDistance(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633fe843", new Object[]{this, mUSValue});
        } else {
            setAttribute(PROP_INVOKE_DISTANCE, Integer.valueOf((int) com.taobao.android.weex_framework.util.i.a(mUSValue)));
        }
    }

    @MUSNodeProp(name = PROP_HEAD_INVOKE_DISTANCE)
    public void setHeadInvokeDistance(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805d6943", new Object[]{this, mUSValue});
        } else {
            setAttribute(PROP_HEAD_INVOKE_DISTANCE, Integer.valueOf((int) com.taobao.android.weex_framework.util.i.a(mUSValue)));
        }
    }

    @MUSNodeProp(name = PROP_INVOKE_DISTANCE, refresh = true)
    public void refreshInvokeDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11246c14", new Object[]{this, new Integer(i)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView == null) {
            return;
        }
        bounceScrollView.setInvokeDistance(i);
    }

    @MUSNodeProp(name = PROP_HEAD_INVOKE_DISTANCE, refresh = true)
    public void refreshHeadInvokeDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9122bf94", new Object[]{this, new Integer(i)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView == null) {
            return;
        }
        bounceScrollView.setHeadInvokeDistance(i);
    }

    @MUSNodeProp(defaultBoolean = true, name = "showScrollbar")
    public void setShowScrollBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8721146", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("showScrollbar", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "showScrollbar", refresh = true)
    public void refreshShowScrollBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10619b7f", new Object[]{this, new Boolean(z)});
        } else {
            ((BounceScrollView) getMountContent()).setShowScrollBar(z);
        }
    }

    private boolean isShowScrollBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9df4638a", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) getAttribute("showScrollbar");
        return bool == null || bool.booleanValue();
    }

    private int getInvokeDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9bc5147d", new Object[]{this})).intValue() : getValue(PROP_INVOKE_DISTANCE);
    }

    private int getHeadInvokeDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1987fb7d", new Object[]{this})).intValue() : getValue(PROP_HEAD_INVOKE_DISTANCE);
    }

    private int getValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2cd23ff", new Object[]{this, str})).intValue();
        }
        Integer num = (Integer) getAttribute(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) obj;
        bounceScrollView.setInitScrollX(this.lastScrollDistance);
        bounceScrollView.setInstance(mUSDKInstance);
        bounceScrollView.setContent(this.contentNodeTree);
        bounceScrollView.setFoot(this.footNodeTree);
        bounceScrollView.setStateChangeListener(this);
        bounceScrollView.setMaxDistance(getMaxDistance());
        bounceScrollView.setInvokeDistance(getInvokeDistance());
        bounceScrollView.setScrollChangeListener(this);
        bounceScrollView.setShowScrollBar(isShowScrollBar());
        bounceScrollView.setHeadMaxDistance(getHeadMaxDistance());
        bounceScrollView.setHeadInvokeDistance(getHeadInvokeDistance());
        Runnable runnable = this.scrollToDelayTask;
        if (runnable != null) {
            runnable.run();
            this.scrollToDelayTask = null;
        }
        bounceScrollView.scrollTo(0, 0);
        registerSyncKey((String) getAttribute(PROP_SYNC_KEY), bounceScrollView);
    }

    private void registerSyncKey(String str, BounceScrollView bounceScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d8c14f", new Object[]{this, str, bounceScrollView});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.lastSyncKey = str;
            this.scrollOffsetManager.a(str, bounceScrollView);
        }
    }

    private void unregisterSyncKey(String str, BounceScrollView bounceScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e630a1a8", new Object[]{this, str, bounceScrollView});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.lastSyncKey = null;
            this.scrollOffsetManager.b(str, bounceScrollView);
        }
    }

    @MUSMethod(uiThread = true)
    public void scrollTo(final int i, final float f, final boolean z, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c4fbb", new Object[]{this, new Integer(i), new Float(f), new Boolean(z), new Integer(i2)});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) getMountContent();
        if (bounceScrollView == null) {
            this.scrollToDelayTask = new o() { // from class: com.taobao.search.musie.component.tbscroll.TbScroller.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        TbScroller.this.scrollTo(i, f, z, i2);
                    }
                }
            };
        } else if (i < 0 || i >= this.contentNode.getChildCount()) {
            g.f(LOG_TAG, "position is beyond the bounds;child count is " + this.contentNode.getChildCount() + " but position is " + i);
        } else {
            float round = Math.round(com.taobao.android.weex_framework.util.i.a(f));
            UINode childAt = this.contentNode.getChildAt(i);
            if (childAt == null) {
                return;
            }
            Rect h = childAt.getNodeInfo().h();
            int scrollX = bounceScrollView.getScrollX();
            int i3 = (int) (h.left + round);
            if (scrollX == i3) {
                return;
            }
            bounceScrollView.scrollTo(false, scrollX, i3, z, i2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        BounceScrollView bounceScrollView = (BounceScrollView) obj;
        this.lastScrollDistance = bounceScrollView.getScrollX();
        bounceScrollView.unmount();
        unregisterSyncKey((String) getAttribute(PROP_SYNC_KEY), bounceScrollView);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, com.taobao.android.weex_framework.ui.INode
    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
            return;
        }
        super.setInstance(mUSDKInstance);
        this.contentNode.setInstance(mUSDKInstance);
        this.footNode.setInstance(mUSDKInstance);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onUpdateLayout(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.contentNode.updateLayout(0, 0, i5, i6);
        this.footNode.updateLayout(0, 0, i5, i6);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e1c906", new Object[]{this, list});
            return;
        }
        this.contentNode.collectBatchTasks(list);
        this.footNode.collectBatchTasks(list);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new BounceScrollView(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
        } else if (uINode instanceof TbScrollerFoot) {
            if (this.footNode.getChildCount() != 0) {
                throw new RuntimeException("only one scroller-foot is supported");
            }
            this.footNode.addChild(uINode);
        } else {
            this.contentNode.addChild(uINode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        if (uINode instanceof TbScrollerFoot) {
            return this.contentNode.getChildCount();
        }
        return this.contentNode.indexOf(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        if (i == this.contentNode.getChildCount()) {
            return this.footNode.getChildAt(0);
        }
        return this.contentNode.getChildAt(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue() : this.contentNode.getChildCount() + this.footNode.getChildCount();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else if (uINode instanceof TbScrollerFoot) {
            if (this.footNode.getChildCount() != 0) {
                throw new RuntimeException("only one scroller-foot is supported");
            }
            this.footNode.addChild(uINode);
        } else {
            this.contentNode.addChild(i, uINode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else if (i == this.contentNode.getChildCount()) {
            this.footNode.removeChildAt(0);
        } else {
            this.contentNode.removeChildAt(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i >= this.contentNode.getChildCount() || i2 >= this.contentNode.getChildCount()) {
            throw new RuntimeException("scroller-foot must be the last child");
        } else {
            this.contentNode.moveNode(i, i2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        if (findNodeById == null) {
            findNodeById = this.contentNode.findNodeById(i);
        }
        return findNodeById == null ? this.footNode.findNodeById(i) : findNodeById;
    }

    @Override // com.taobao.search.musie.component.tbscroll.BounceScrollView.a
    public void onStateChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6afc5a", new Object[]{this, new Integer(i)});
        } else if (getInstance() == null || getInstance().isDestroyed() || !hasEvent(EVENT_STATE_CHANGE)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", (Object) String.valueOf(i));
            getInstance().fireEventOnNode(getNodeId(), EVENT_STATE_CHANGE, jSONObject);
        }
    }

    @Override // com.taobao.search.musie.component.tbscroll.BounceScrollView.a
    public void onBounceBack(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32959746", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (getInstance() == null || getInstance().isDestroyed() || !hasEvent(EVENT_BOUNCE_BACK)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("state", (Object) String.valueOf(i));
            jSONObject.put("position", (Object) (z ? ivx.IMAGE_TYPE_HEAD : "foot"));
            getInstance().fireEventOnNode(getNodeId(), EVENT_BOUNCE_BACK, jSONObject);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.c
    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea33e4f", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getInstance() == null || getInstance().isDestroyed() || !hasEvent("scroll")) {
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", (Object) Integer.valueOf((int) com.taobao.android.weex_framework.util.i.a(getInstance().getUIContext(), i)));
            jSONObject2.put("y", (Object) Integer.valueOf((int) com.taobao.android.weex_framework.util.i.a(getInstance().getUIContext(), i2)));
            jSONObject.put(Constants.Name.CONTENT_OFFSET, (Object) jSONObject2);
            getInstance().fireEventOnNode(getNodeId(), "scroll", jSONObject);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.c
    public void onRealTimeScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        String str = (String) getAttribute(PROP_SYNC_KEY);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.scrollOffsetManager.a(str, (BounceScrollView) view, i);
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.c
    public void onScrollStart(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b975f5", new Object[]{this, view});
        } else if (getInstance() == null || getInstance().isDestroyed() || !hasEvent("scrollstart")) {
        } else {
            getInstance().fireEventOnNode(getNodeId(), "scrollstart", null);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.c
    public void onScrollEnd(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a368b45c", new Object[]{this, view});
        } else if (getInstance() == null || getInstance().isDestroyed() || !hasEvent("scrollend")) {
        } else {
            getInstance().fireEventOnNode(getNodeId(), "scrollend", null);
        }
    }
}
