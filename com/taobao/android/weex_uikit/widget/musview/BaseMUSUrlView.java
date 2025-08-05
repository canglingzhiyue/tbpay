package com.taobao.android.weex_uikit.widget.musview;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.ui.b;
import com.taobao.android.weex_uikit.widget.musview.a;
import com.taobao.media.MediaConstant;
import com.taobao.search.musie.weex.MusWeex;
import tb.kge;

/* loaded from: classes6.dex */
public class BaseMUSUrlView extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a.C0623a measureResult;

    static {
        kge.a(1717262444);
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

    public BaseMUSUrlView(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : com.taobao.android.weex_uikit.widget.musview.a.a(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        m mVar = new m();
        com.taobao.android.weex_uikit.widget.musview.a.a(uINode, mVar);
        if (!mVar.a()) {
            return;
        }
        this.measureResult = (a.C0623a) mVar.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.a(this, i, i2, i3, i4, iArr, this.measureResult);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.a(this, mUSDKInstance, (MUSUrlHost) obj, this.measureResult);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.a(this, mUSDKInstance, (MUSUrlHost) obj);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1479592563:
                if (str.equals("bundleUrl")) {
                    c = 1;
                    break;
                }
                break;
            case 100589:
                if (str.equals("env")) {
                    c = 3;
                    break;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    c = 2;
                    break;
                }
                break;
            case 249939108:
                if (str.equals(MusWeex.ATTR_SCRIPT_URL)) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            setScriptUrl(uINode, mUSValue);
            return true;
        } else if (c == 1) {
            setBundleUrl(uINode, mUSValue);
            return true;
        } else if (c == 2) {
            setData(uINode, mUSValue);
            return true;
        } else if (c != 3) {
            return false;
        } else {
            setEnv(uINode, mUSValue);
            return true;
        }
    }

    public void setScriptUrl(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9648ec", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setBundleUrl(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e24823", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.b(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setData(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e0762", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.a(uINode, (JSONObject) k.a(getInstance(), null, JSONObject.class, mUSValue));
        }
    }

    public void setEnv(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b722a43", new Object[]{this, uINode, mUSValue});
        } else {
            com.taobao.android.weex_uikit.widget.musview.a.b(uINode, (JSONObject) k.a(getInstance(), null, JSONObject.class, mUSValue));
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
        } else {
            str.getClass();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    /* loaded from: classes6.dex */
    public static class a extends b<BaseMUSUrlView> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1900295770);
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

        public BaseMUSUrlView b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseMUSUrlView) ipChange.ipc$dispatch("68db6257", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            BaseMUSUrlView baseMUSUrlView = new BaseMUSUrlView(i);
            baseMUSUrlView.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                baseMUSUrlView.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                baseMUSUrlView.updateAttrs(mUSProps2);
            }
            return baseMUSUrlView;
        }
    }
}
