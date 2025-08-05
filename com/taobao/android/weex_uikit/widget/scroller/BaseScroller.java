package com.taobao.android.weex_uikit.widget.scroller;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.ui.i;
import com.taobao.android.weex_uikit.widget.scroller.a;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseScroller extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public i nodeTree;
    public ScrollerRootNode rootNode;
    public int scrollDistance;
    public c scrollListener;
    public a.C0624a scrollToDelayTask;

    @Override // com.taobao.android.weex_uikit.ui.aa
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public int poolSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bdc9c37", new Object[]{this})).intValue();
        }
        return 10;
    }

    public static /* synthetic */ MUSValue access$000(BaseScroller baseScroller, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("59c4fae9", new Object[]{baseScroller, mUSValueArr, new Integer(i)}) : baseScroller.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(BaseScroller baseScroller, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("f7011248", new Object[]{baseScroller, mUSValueArr, new Integer(i)}) : baseScroller.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$200(BaseScroller baseScroller, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("943d29a7", new Object[]{baseScroller, mUSValueArr, new Integer(i)}) : baseScroller.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$300(BaseScroller baseScroller, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("31794106", new Object[]{baseScroller, mUSValueArr, new Integer(i)}) : baseScroller.getArgument(mUSValueArr, i);
    }

    static {
        kge.a(-1597579667);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put(Constants.Name.SCROLL_DIRECTION, "vertical");
        ATTR_DEF_MAP.put(Constants.Name.SHOW_SCROLLBAR, true);
        ATTR_DEF_MAP.put(Constants.Name.SCROLLABLE, true);
    }

    public BaseScroller(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("acae82d0", new Object[]{this, str}) : ATTR_DEF_MAP.get(str);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        m mVar = new m();
        com.taobao.android.weex_uikit.widget.scroller.a.a(uINode, mVar);
        if (!mVar.a()) {
            return;
        }
        this.scrollListener = (c) mVar.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : com.taobao.android.weex_uikit.widget.scroller.a.a(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onBindInstance(UINode uINode, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362d97e6", new Object[]{this, uINode, mUSDKInstance});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.a(uINode, mUSDKInstance, this.rootNode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.a(this, i, i2, i3, i4, this.rootNode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void postCollectBatchTask(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27c658d", new Object[]{this, list});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.a(this, list, this.rootNode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        m mVar = new m();
        m mVar2 = new m();
        com.taobao.android.weex_uikit.widget.scroller.a.a(this, mUSDKInstance, (ScrollerContainer) obj, this.scrollToDelayTask, this.rootNode, this.nodeTree, this.scrollDistance, this.scrollListener, mVar, mVar2);
        if (mVar.a()) {
            this.scrollToDelayTask = (a.C0624a) mVar.b();
        }
        if (!mVar2.a()) {
            return;
        }
        this.scrollDistance = ((Integer) mVar2.b()).intValue();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        m mVar = new m();
        m mVar2 = new m();
        com.taobao.android.weex_uikit.widget.scroller.a.a(this, mUSDKInstance, (ScrollerContainer) obj, mVar, mVar2);
        if (mVar.a()) {
            this.scrollDistance = ((Integer) mVar.b()).intValue();
        }
        if (!mVar2.a()) {
            return;
        }
        this.scrollToDelayTask = (a.C0624a) mVar2.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d011af1", new Object[]{this, uINode, str, mUSValueArr});
            return;
        }
        char c = 65535;
        if (str.hashCode() == -402165208 && str.equals("scrollTo")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        scrollTo(uINode, mUSValueArr);
    }

    public void scrollTo(final UINode uINode, final MUSValue[] mUSValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba879fa9", new Object[]{this, uINode, mUSValueArr});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_uikit.widget.scroller.BaseScroller.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    m mVar = new m();
                    com.taobao.android.weex_uikit.widget.scroller.a.a(uINode, ((Integer) k.a(BaseScroller.this.getInstance(), null, Integer.TYPE, BaseScroller.access$000(BaseScroller.this, mUSValueArr, 0))).intValue(), ((Float) k.a(BaseScroller.this.getInstance(), null, Float.TYPE, BaseScroller.access$100(BaseScroller.this, mUSValueArr, 1))).floatValue(), ((Boolean) k.a(BaseScroller.this.getInstance(), null, Boolean.TYPE, BaseScroller.access$200(BaseScroller.this, mUSValueArr, 2))).booleanValue(), ((Integer) k.a(BaseScroller.this.getInstance(), null, Integer.TYPE, BaseScroller.access$300(BaseScroller.this, mUSValueArr, 3))).intValue(), mVar, BaseScroller.this.rootNode);
                    if (!mVar.a()) {
                        return;
                    }
                    BaseScroller.this.scrollToDelayTask = (a.C0624a) mVar.b();
                }
            });
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -223520855) {
            if (hashCode != 66669991) {
                if (hashCode == 1614714674 && str.equals(Constants.Name.SCROLL_DIRECTION)) {
                    c = 0;
                }
            } else if (str.equals(Constants.Name.SCROLLABLE)) {
                c = 2;
            }
        } else if (str.equals(Constants.Name.SHOW_SCROLLBAR)) {
            c = 1;
        }
        if (c == 0) {
            setScrollDirection(uINode, mUSValue);
            return true;
        } else if (c == 1) {
            setShowScrollBar(uINode, mUSValue);
            return true;
        } else if (c != 2) {
            return false;
        } else {
            setScrollable(uINode, mUSValue);
            return true;
        }
    }

    public void setScrollDirection(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a237b89e", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setShowScrollBar(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b8a0a7", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.scroller.a.a(uINode, z);
    }

    public void setScrollable(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1265185", new Object[]{this, uINode, mUSValue});
            return;
        }
        if (!MUSValue.isNill(mUSValue)) {
            z = ((Boolean) k.a(getInstance(), null, Boolean.TYPE, mUSValue)).booleanValue();
        }
        com.taobao.android.weex_uikit.widget.scroller.a.b(uINode, z);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -223520855) {
            if (hashCode != 66669991) {
                if (hashCode == 1614714674 && str.equals(Constants.Name.SCROLL_DIRECTION)) {
                    c = 0;
                }
            } else if (str.equals(Constants.Name.SCROLLABLE)) {
                c = 2;
            }
        } else if (str.equals(Constants.Name.SHOW_SCROLLBAR)) {
            c = 1;
        }
        if (c == 0) {
            refreshScrollDirection(uINode, obj, obj2);
        } else if (c == 1) {
            refreshShowScrollBar(uINode, obj, obj2);
        } else if (c != 2) {
        } else {
            refreshScrollable(uINode, obj, obj2);
        }
    }

    public void refreshScrollDirection(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e996a22", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.a(uINode, (ScrollerContainer) obj, (String) obj2, this.nodeTree, this.rootNode);
        }
    }

    public void refreshShowScrollBar(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1db56b", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.a(uINode, (ScrollerContainer) obj, ((Boolean) obj2).booleanValue());
        }
    }

    public void refreshScrollable(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7499d77", new Object[]{this, uINode, obj, obj2});
        } else {
            com.taobao.android.weex_uikit.widget.scroller.a.b(uINode, (ScrollerContainer) obj, ((Boolean) obj2).booleanValue());
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    /* loaded from: classes6.dex */
    public static class a extends com.taobao.android.weex_uikit.ui.b<BaseScroller> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(934422789);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "[\"scrollTo\"]";
        }

        @Override // com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public BaseScroller b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseScroller) ipChange.ipc$dispatch("151b8166", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            BaseScroller baseScroller = new BaseScroller(i);
            baseScroller.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                baseScroller.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                baseScroller.updateAttrs(mUSProps2);
            }
            return baseScroller;
        }
    }
}
