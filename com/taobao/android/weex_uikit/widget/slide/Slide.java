package com.taobao.android.weex_uikit.widget.slide;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.slide.BaseSlide;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class Slide extends BaseSlide {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1127687072);
    }

    public static /* synthetic */ Object ipc$super(Slide slide, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2062288793:
                return super.findNodeById(((Number) objArr[0]).intValue());
            case -1680040905:
                return new Integer(super.poolSize());
            case -1460428041:
                return super.getNodeType();
            case -1300470387:
                super.postCollectBatchTask((List) objArr[0]);
                return null;
            case -379972208:
                return new Boolean(super.isGenerated());
            case 1023482609:
                super.onDispatchMethod((UINode) objArr[0], (String) objArr[1], (MUSValue[]) objArr[2]);
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

    @Override // com.taobao.android.weex_uikit.widget.slide.BaseSlide, com.taobao.android.weex_uikit.ui.aa
    public /* bridge */ /* synthetic */ UINodeType getNodeType() {
        return super.getNodeType();
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.BaseSlide, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ boolean isGenerated() {
        return super.isGenerated();
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.BaseSlide, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ void onDispatchMethod(UINode uINode, String str, MUSValue[] mUSValueArr) {
        super.onDispatchMethod(uINode, str, mUSValueArr);
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.BaseSlide, com.taobao.android.weex_uikit.ui.aa
    public /* bridge */ /* synthetic */ int poolSize() {
        return super.poolSize();
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.BaseSlide, com.taobao.android.weex_uikit.ui.UINode
    public /* bridge */ /* synthetic */ void postCollectBatchTask(List list) {
        super.postCollectBatchTask(list);
    }

    public Slide(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
        } else {
            this.delegateNode.addChild(uINode);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue() : this.delegateNode.indexOf(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)}) : this.delegateNode.getChildAt(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue() : this.delegateNode.getChildCount();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else {
            this.delegateNode.addChild(i, uINode);
        }
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
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        return findNodeById == null ? this.delegateNode.findNodeById(i) : findNodeById;
    }

    /* loaded from: classes6.dex */
    public static class a extends BaseSlide.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(522192178);
        }

        @Override // com.taobao.android.weex_uikit.widget.slide.BaseSlide.a, com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        @Override // com.taobao.android.weex_uikit.widget.slide.BaseSlide.a
        public BaseSlide b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseSlide) ipChange.ipc$dispatch("e377ed84", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Slide slide = new Slide(i);
            slide.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                slide.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                slide.updateAttrs(mUSProps2);
            }
            return slide;
        }
    }
}
