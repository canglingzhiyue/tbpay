package com.taobao.android.weex_uikit.widget.a;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.media.MediaConstant;
import com.taobao.weex.common.Constants;
import tb.kge;

/* loaded from: classes6.dex */
public class A extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View.OnClickListener hrefListener;

    static {
        kge.a(400540608);
    }

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
        return 3;
    }

    public A(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        m mVar = new m();
        b.a(this, mUSDKInstance, obj, mVar);
        if (!mVar.a()) {
            return;
        }
        this.hrefListener = (View.OnClickListener) mVar.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            b.a(this, mUSDKInstance, obj, this.hrefListener);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        char c = 65535;
        if (str.hashCode() == 3211051 && str.equals(Constants.Name.HREF)) {
            c = 0;
        }
        if (c != 0) {
            return false;
        }
        setRef(uINode, mUSValue);
        return true;
    }

    public void setRef(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9daf15d", new Object[]{this, uINode, mUSValue});
        } else {
            b.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        char c = 65535;
        if (str.hashCode() == 0 && str.equals("")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        refreshRef(uINode, obj, obj2);
    }

    public void refreshRef(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdff61", new Object[]{this, uINode, obj, obj2});
            return;
        }
        m mVar = new m();
        b.a(uINode, obj, (String) obj2, this.hrefListener, mVar);
        if (!mVar.a()) {
            return;
        }
        this.hrefListener = (View.OnClickListener) mVar.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.LAYOUT;
    }

    /* loaded from: classes6.dex */
    public static class a extends com.taobao.android.weex_uikit.ui.b<A> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1226883538);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }

        @Override // com.taobao.android.weex_framework.ui.l
        public /* synthetic */ INode a(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (INode) ipChange.ipc$dispatch("91d13828", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2}) : b(mUSDKInstance, i, mUSProps, mUSProps2);
        }

        public A b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (A) ipChange.ipc$dispatch("ef9a5473", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            A a2 = new A(i);
            a2.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                a2.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                a2.updateAttrs(mUSProps2);
            }
            return a2;
        }
    }
}
