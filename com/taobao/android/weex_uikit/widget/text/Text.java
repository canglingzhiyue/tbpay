package com.taobao.android.weex_uikit.widget.text;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_framework.widget.a;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.media.MediaConstant;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class Text extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Object> ATTR_DEF_MAP;
    public a.b fontListener;
    public h textHelper;

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

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean shouldClip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29c16ae", new Object[]{this})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-1859611428);
        HashMap hashMap = new HashMap();
        ATTR_DEF_MAP = hashMap;
        hashMap.put("wordBreak", 1);
        ATTR_DEF_MAP.put("lineHeight", Float.valueOf(Float.MAX_VALUE));
        ATTR_DEF_MAP.put("textAlign", "left");
        ATTR_DEF_MAP.put(MUSConstants.ELLIPSIS_POSITION, "end");
        ATTR_DEF_MAP.put("fontSize", Integer.valueOf(j.DEFAULT_FONT_SIZE));
        ATTR_DEF_MAP.put("color", -16777216);
        ATTR_DEF_MAP.put("textOverflow", "clip");
        ATTR_DEF_MAP.put("fontStyle", Integer.valueOf(j.f16225a));
        ATTR_DEF_MAP.put("fontWeight", 0);
    }

    public Text(int i) {
        super(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public Object getDefaultAttribute(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("acae82d0", new Object[]{this, str}) : ATTR_DEF_MAP.get(str);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context}) : j.a(context);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onNodeCreate(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78938224", new Object[]{this, uINode});
            return;
        }
        m mVar = new m();
        m mVar2 = new m();
        j.a(uINode, mVar, mVar2);
        if (mVar.a()) {
            this.textHelper = (h) mVar.b();
        }
        if (!mVar2.a()) {
            return;
        }
        this.fontListener = (a.b) mVar2.b();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMeasure(int i, int i2, int i3, int i4, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab21ed4", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr});
        } else {
            j.a(this, i, i2, i3, i4, iArr, this.textHelper);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            j.a(this, i, i2, i3, i4, this.textHelper);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
        } else {
            j.a(this, mUSDKInstance, (g) obj, this.textHelper);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            j.a(this, mUSDKInstance, (g) obj);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
        } else {
            j.a(uINode, (g) obj, str, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        if (r9.equals("fontWeight") != false) goto L11;
     */
    @Override // com.taobao.android.weex_uikit.ui.UINode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode r8, java.lang.String r9, com.taobao.android.weex_framework.MUSValue r10) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.text.Text.onUpdateAttr(com.taobao.android.weex_uikit.ui.UINode, java.lang.String, com.taobao.android.weex_framework.MUSValue):boolean");
    }

    public void setFontStyle(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d49cae", new Object[]{this, uINode, mUSValue});
        } else {
            j.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setWordBreak(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("514fae9b", new Object[]{this, uINode, mUSValue});
        } else {
            j.b(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setFontFamily(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ccc419", new Object[]{this, uINode, mUSValue});
        } else {
            j.a(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue), this.fontListener);
        }
    }

    public void setFontWeight(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71edb85", new Object[]{this, uINode, mUSValue});
        } else {
            j.c(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setColor(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379fec0d", new Object[]{this, uINode, mUSValue});
        } else {
            j.d(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setFontSize(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4429d1dc", new Object[]{this, uINode, mUSValue});
        } else {
            j.e(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setTextDecoration(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8c1f2f", new Object[]{this, uINode, mUSValue});
        } else {
            j.f(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setTextOverflow(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d7b45d", new Object[]{this, uINode, mUSValue});
        } else {
            j.g(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setEllipsisPosition(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39804af2", new Object[]{this, uINode, mUSValue});
        } else {
            j.h(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setWhiteSpace(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8018f", new Object[]{this, uINode, mUSValue});
        } else {
            j.i(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setLines(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf233f1", new Object[]{this, uINode, mUSValue});
        } else {
            j.a(uINode, MUSValue.isNill(mUSValue) ? Integer.MAX_VALUE : ((Integer) com.taobao.android.weex_framework.util.k.a(getInstance(), null, Integer.TYPE, mUSValue)).intValue());
        }
    }

    public void setLineHeight(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a7e771", new Object[]{this, uINode, mUSValue});
        } else {
            j.a(uINode, mUSValue);
        }
    }

    public void setTextAlign(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb01a38", new Object[]{this, uINode, mUSValue});
        } else {
            j.j(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
        }
    }

    public void setText(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab58733f", new Object[]{this, uINode, mUSValue});
        } else {
            j.k(uINode, MUSValue.isNill(mUSValue) ? "" : (String) com.taobao.android.weex_framework.util.k.a(getInstance(), null, String.class, mUSValue));
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
        if (str.hashCode() == 111972721 && str.equals("value")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        refreshText(uINode, obj, obj2);
    }

    public void refreshText(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8445271", new Object[]{this, uINode, obj, obj2});
        } else {
            j.a(uINode, (g) obj, (CharSequence) obj2, this.textHelper);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.DRAWABLE;
    }

    /* loaded from: classes6.dex */
    public static class a extends com.taobao.android.weex_uikit.ui.b<Text> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1840683210);
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

        public Text b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Text) ipChange.ipc$dispatch("7881ccd7", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            Text text = new Text(i);
            text.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                text.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                text.updateAttrs(mUSProps2);
            }
            return text;
        }
    }
}
