package com.taobao.android.weex_uikit.widget.overlay;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.a;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.ui.i;
import com.taobao.android.weex_uikit.util.b;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSOverlay extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "mus-overlay";
    private final String EVENT_CLOSE;
    private final String KEY_ANIMATION;
    private final String KEY_ANIMATION_TYPE;
    private final String KEY_DISPLAY_MODE;
    private final String KEY_EXIT_ANIMATION;
    private final String KEY_MASK;
    private final String KEY_MASK_ANIMATION;
    private final String KEY_MASK_COLOR;
    private final String KEY_NODE_REF;
    private final String KEY_POSITION;
    private final String KEY_PULL_TO_CLOSE;
    private final String KEY_SHOW;
    private final String KEY_TYPE;
    private final String KEY_Z_INDEX;
    private final i mNodeTree;
    private final UINodeGroup mRootNode;

    static {
        kge.a(-1709145097);
    }

    public static /* synthetic */ Object ipc$super(MUSOverlay mUSOverlay, String str, Object... objArr) {
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
        return false;
    }

    public MUSOverlay(int i, MUSDKInstance mUSDKInstance) {
        super(i);
        this.KEY_TYPE = "type";
        this.KEY_NODE_REF = "nodeRef";
        this.KEY_POSITION = "position";
        this.KEY_ANIMATION = "animation";
        this.KEY_EXIT_ANIMATION = "exitAnimation";
        this.KEY_ANIMATION_TYPE = "animationType";
        this.KEY_MASK_ANIMATION = "maskAnimation";
        this.KEY_MASK = "mask";
        this.KEY_MASK_COLOR = "maskColor";
        this.KEY_SHOW = "show";
        this.KEY_Z_INDEX = a.ATOM_EXT_zIndex;
        this.KEY_PULL_TO_CLOSE = "pullToClose";
        this.EVENT_CLOSE = "close";
        this.KEY_DISPLAY_MODE = "displayMode";
        this.mRootNode = new OverlayRootNode(i, this);
        this.mRootNode.setParentNode(this);
        this.mNodeTree = new i();
        this.mNodeTree.a(this.mRootNode);
        this.mNodeTree.a(false);
        setInstance(mUSDKInstance);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, com.taobao.android.weex_framework.ui.INode
    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
            return;
        }
        super.setInstance(mUSDKInstance);
        this.mRootNode.setInstance(mUSDKInstance);
        this.mNodeTree.b(mUSDKInstance.isPreciseExpose());
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onUpdateLayout(i, i2, i3, i4);
        getNodeInfo().a(0, 0, 0, 0);
        this.mRootNode.updateLayout(0, 0, i3 - i, i4 - i2);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : new MUSOverlayView(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    @Override // com.taobao.android.weex_uikit.ui.aa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMount(com.taobao.android.weex_framework.MUSDKInstance r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.overlay.MUSOverlay.onMount(com.taobao.android.weex_framework.MUSDKInstance, java.lang.Object):void");
    }

    public i getChildNodeTree() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("52e7e0b2", new Object[]{this}) : this.mNodeTree;
    }

    private int parseMaskColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c805a1e8", new Object[]{this, str})).intValue();
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return -2009976270;
            }
            return b.a(str);
        } catch (Exception unused) {
            g.f("mus-overlay", String.format("value [\"%s\"] not support for property \"maskColor\"", str));
            return -2009976270;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            ((MUSOverlayView) obj).unmount();
        }
    }

    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else if (!hasEvent("close")) {
        } else {
            getInstance().fireEventOnNode(getNodeId(), "close", null);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e1c906", new Object[]{this, list});
        } else {
            this.mRootNode.collectBatchTasks(list);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        return findNodeById == null ? this.mRootNode.findNodeById(i) : findNodeById;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
        } else {
            this.mRootNode.addChild(uINode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue() : this.mRootNode.indexOf(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)}) : this.mRootNode.getChildAt(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue() : this.mRootNode.getChildCount();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else {
            this.mRootNode.addChild(i, uINode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else {
            this.mRootNode.removeChildAt(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mRootNode.moveNode(i, i2);
        }
    }

    @MUSNodeProp(name = "type")
    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            setAttribute("type", str);
        }
    }

    @MUSNodeProp(name = "type", refresh = true)
    public void setTypeRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc3e1d0", new Object[]{this, str});
        } else {
            ((MUSOverlayView) getMountContent()).setType(str);
        }
    }

    @MUSNodeProp(name = "nodeRef")
    public void setNodeRef(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4affc83a", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            setAttribute("nodeRef", null);
        } else {
            setAttribute("nodeRef", jSONObject.getInteger("ref"));
        }
    }

    @MUSNodeProp(name = "nodeRef", refresh = true)
    public void setNodeRefRefresh(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176ada4", new Object[]{this, num});
        } else {
            ((MUSOverlayView) getMountContent()).setNodeRef(Integer.valueOf(num != null ? num.intValue() : -1));
        }
    }

    @MUSNodeProp(name = "position")
    public void setPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974e8ffc", new Object[]{this, str});
        } else {
            setAttribute("position", str);
        }
    }

    @MUSNodeProp(name = "position", refresh = true)
    public void setPositionRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d516a341", new Object[]{this, str});
        } else {
            ((MUSOverlayView) getMountContent()).setPosition(str);
        }
    }

    @MUSNodeProp(name = "animation")
    public void setAnimation(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963fbfe4", new Object[]{this, bool});
        } else {
            setAttribute("animation", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "animation", refresh = true)
    public void setAnimationRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475d8b94", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setMusAnimation(z);
        }
    }

    @MUSNodeProp(name = "exitAnimation")
    public void setExitAnimation(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b177422", new Object[]{this, bool});
        } else {
            setAttribute("exitAnimation", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "exitAnimation", refresh = true)
    public void setExitAnimationRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8c1216", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setMusExitAnimation(z);
        }
    }

    @MUSNodeProp(defaultBoolean = false, name = "pullToClose")
    public void setPullToClose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454e877", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("pullToClose", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "animationType")
    public void setAnimationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9b3d2d", new Object[]{this, str});
        } else {
            setAttribute("animationType", str);
        }
    }

    @MUSNodeProp(name = "animationType", refresh = true)
    public void setAnimationTypeRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b6ecf0", new Object[]{this, str});
            return;
        }
        MUSOverlayView mUSOverlayView = (MUSOverlayView) getMountContent();
        if (str == null) {
            str = "opacity";
        }
        mUSOverlayView.setAnimationType(str);
    }

    @MUSNodeProp(name = "maskAnimation")
    public void setMaskAnimation(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64009f0", new Object[]{this, bool});
        } else {
            setAttribute("maskAnimation", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "maskAnimation", refresh = true)
    public void setMaskAnimationRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47271108", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setMaskAnimation(z);
        }
    }

    @MUSNodeProp(name = "mask")
    public void setMask(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dad4538", new Object[]{this, bool});
        } else {
            setAttribute("mask", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "mask", refresh = true)
    public void setMaskRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eae12c0", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setMask(z);
        }
    }

    @MUSNodeProp(name = "maskColor")
    public void setMaskColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a638a66", new Object[]{this, str});
        } else {
            setAttribute("maskColor", str);
        }
    }

    @MUSNodeProp(name = "maskColor", refresh = true)
    public void setMaskColorRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c90fd97", new Object[]{this, str});
        } else {
            ((MUSOverlayView) getMountContent()).setMaskColor(parseMaskColor(str));
        }
    }

    @MUSNodeProp(name = "show")
    public void setShow(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d66e07", new Object[]{this, bool});
        } else {
            setAttribute("show", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = false, name = "show", refresh = true)
    public void setShowRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c65551", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setShow(z);
        }
    }

    @MUSNodeProp(name = a.ATOM_EXT_zIndex)
    public void setZIndex(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3d8dd6", new Object[]{this, num});
        } else {
            setAttribute(a.ATOM_EXT_zIndex, num);
        }
    }

    @MUSNodeProp(name = a.ATOM_EXT_zIndex, refresh = true)
    public void setZIndexRefresh(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29be8f6f", new Object[]{this, num});
        } else {
            ((MUSOverlayView) getMountContent()).setZIndex(num);
        }
    }

    @MUSNodeProp(name = "displayMode")
    public void setDisplayMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8150614", new Object[]{this, str});
        } else {
            setAttribute("displayMode", str);
        }
    }

    public void childrenChanged() {
        MUSOverlayView mUSOverlayView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacf51bc", new Object[]{this});
        } else if (((Integer) getAttribute("nodeRef")) == null || (mUSOverlayView = (MUSOverlayView) getMountContent()) == null) {
        } else {
            mUSOverlayView.updateLocation();
        }
    }
}
