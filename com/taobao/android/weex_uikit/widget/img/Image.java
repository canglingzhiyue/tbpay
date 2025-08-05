package com.taobao.android.weex_uikit.widget.img;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.media.MediaConstant;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class Image extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public com.taobao.android.weex_uikit.widget.img.a mountState;
    public p.b stateListener;

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
        return 30;
    }

    static {
        kge.a(2041746396);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put("quality", "auto");
    }

    public Image(int i) {
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
        b.a(uINode, mVar);
        if (!mVar.a()) {
            return;
        }
        this.mountState = (com.taobao.android.weex_uikit.widget.img.a) mVar.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        m mVar = new m();
        b.a(this, mUSDKInstance, obj, mVar, this.mountState);
        if (!mVar.a()) {
            return;
        }
        this.stateListener = (p.b) mVar.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else {
            b.a(this, i, i2, i3, i4, iArr, this.mountState);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            b.a(this, mUSDKInstance, obj, this.stateListener, this.mountState);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : b.a(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1489619886:
                if (str.equals("objectFit")) {
                    c = 3;
                    break;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c = 4;
                    break;
                }
                break;
            case 96681:
                if (str.equals(MUSConstants.ALT)) {
                    c = 1;
                    break;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    c = 0;
                    break;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    c = 5;
                    break;
                }
                break;
            case 651215103:
                if (str.equals("quality")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            setSrc(uINode, mUSValue);
            return true;
        } else if (c == 1) {
            setAlt(uINode, mUSValue);
            return true;
        } else if (c == 2) {
            setQuality(uINode, mUSValue);
            return true;
        } else if (c == 3) {
            setObjectFit(uINode, mUSValue);
            return true;
        } else if (c == 4) {
            setFilter(uINode, mUSValue);
            return true;
        } else if (c != 5) {
            return false;
        } else {
            setPlaceHolder(uINode, mUSValue);
            return true;
        }
    }

    public void setSrc(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4157e12c", new Object[]{this, uINode, mUSValue});
        } else {
            b.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue), this.mountState);
        }
    }

    public void setAlt(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a12507", new Object[]{this, uINode, mUSValue});
        } else {
            b.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setQuality(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7944c971", new Object[]{this, uINode, mUSValue});
        } else {
            b.b(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setObjectFit(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5fda8fe", new Object[]{this, uINode, mUSValue});
        } else {
            b.c(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setFilter(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e627d4", new Object[]{this, uINode, mUSValue});
        } else {
            b.d(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setPlaceHolder(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6600b65d", new Object[]{this, uINode, mUSValue});
        } else {
            b.e(uINode, MUSValue.isNill(mUSValue) ? "" : (String) k.a(getInstance(), null, String.class, mUSValue));
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
        switch (str.hashCode()) {
            case -1489619886:
                if (str.equals("objectFit")) {
                    c = 4;
                    break;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c = 5;
                    break;
                }
                break;
            case 96681:
                if (str.equals(MUSConstants.ALT)) {
                    c = 0;
                    break;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    c = 2;
                    break;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    c = 3;
                    break;
                }
                break;
            case 651215103:
                if (str.equals("quality")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            refreshAlt(uINode, obj, obj2);
        } else if (c == 1) {
            refreshQuality(uINode, obj, obj2);
        } else if (c == 2) {
            refreshSrc(uINode, obj, obj2);
        } else if (c == 3) {
            refreshPlaceHolder(uINode, obj, obj2);
        } else if (c == 4) {
            refreshObjectFit(uINode, obj, obj2);
        } else if (c != 5) {
        } else {
            refreshFilter(uINode, obj, obj2);
        }
    }

    public void refreshAlt(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adf7d0b", new Object[]{this, uINode, obj, obj2});
        } else {
            b.a(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshQuality(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcc86f5", new Object[]{this, uINode, obj, obj2});
        } else {
            b.b(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshSrc(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df32e30", new Object[]{this, uINode, obj, obj2});
        } else {
            b.c(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshPlaceHolder(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c881bb61", new Object[]{this, uINode, obj, obj2});
        } else {
            b.d(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshObjectFit(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b614942", new Object[]{this, uINode, obj, obj2});
        } else {
            b.e(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    public void refreshFilter(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d693e46", new Object[]{this, uINode, obj, obj2});
        } else {
            b.f(uINode, (UIImageDrawable) obj, (String) obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.DRAWABLE;
    }

    /* loaded from: classes6.dex */
    public static class a extends com.taobao.android.weex_uikit.ui.b<Image> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(500828214);
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

        public Image b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Image) ipChange.ipc$dispatch("a137add7", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Image image = new Image(i);
            image.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                image.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                image.updateAttrs(mUSProps2);
            }
            return image;
        }
    }
}
