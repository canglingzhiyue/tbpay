package com.taobao.android.weex_uikit.widget.richtext;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.text.Text;
import com.taobao.android.weex_uikit.widget.text.j;
import com.taobao.media.MediaConstant;
import java.util.ArrayList;
import java.util.List;
import tb.jxa;
import tb.jxc;
import tb.jxd;
import tb.jxe;
import tb.kge;

/* loaded from: classes6.dex */
public class RichText extends Text {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_RELEASE_SPAN = "releaseImageSpan";
    private static final String IMAGE = "image";
    private static final String KEY_ATTR = "attr";
    private static final String KEY_CHILDREN = "children";
    private static final String KEY_STYLE = "style";
    private static final String KEY_TYPE = "type";
    private static final String LINK = "a";
    private static final String SPAN = "span";
    private List<ClickableSpan> clickableSpans;
    private List<jxe> imageSpans;
    private c rootText;

    static {
        kge.a(-1936682372);
    }

    public static /* synthetic */ Object ipc$super(RichText richText, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 545542899:
                return new Boolean(super.onUpdateStyle((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            case 1084303291:
                super.onUpdateExtra((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
                return null;
            case 2146603619:
                return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void addFontFamily(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c808fa5", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, com.taobao.android.weex_uikit.ui.UINode
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public RichText(int i) {
        super(i);
        this.imageSpans = new ArrayList(3);
        this.clickableSpans = new ArrayList(3);
        this.rootText = new c(this);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateStyle(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208452f3", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        try {
            if (!this.rootText.a(str, mUSValue)) {
                return super.onUpdateStyle(this, str, mUSValue);
            }
            return true;
        } catch (Exception e) {
            com.taobao.android.weex_framework.monitor.b.a();
            StringBuilder sb = new StringBuilder();
            sb.append("onUpdateStyle Error:class:");
            sb.append(getClass().getSimpleName());
            sb.append(", prop: ");
            sb.append(str);
            sb.append(", value: ");
            sb.append(mUSValue == null ? "" : mUSValue.toShortString());
            g.c("RichText", sb.toString(), e);
            return true;
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (StringUtils.equals(str, "value")) {
            setValue((JSONArray) mUSValue.getValue());
            return true;
        }
        return super.onUpdateAttr(uINode, str, mUSValue);
    }

    private void setValue(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06ea85e", new Object[]{this, jSONArray});
            return;
        }
        setExtra(EXTRA_RELEASE_SPAN, new ArrayList(this.imageSpans));
        this.imageSpans.clear();
        this.clickableSpans.clear();
        setAttribute("value", "");
        if (jSONArray == null) {
            setExtra("ariaLabel", null);
            g.c("[RichText] content is invalid or null");
            return;
        }
        this.rootText.a();
        traverseContent(this.rootText, jSONArray);
        SpannableString spannableString = new SpannableString(this.rootText.m());
        this.rootText.a(spannableString, 0);
        setAttribute("value", spannableString);
        setExtra("ariaLabel", spannableString.toString());
        setAttribute(j.ATTR_IMAGE_SPAN, this.imageSpans.toArray(new ImageSpan[this.imageSpans.size()]));
        setAttribute(j.ATTR_CLICK_SPAN, this.clickableSpans.toArray(new ClickableSpan[this.clickableSpans.size()]));
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text
    public void refreshText(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8445271", new Object[]{this, uINode, obj, obj2});
        } else {
            onMount(getInstance(), obj);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        mountImageSpans(mUSDKInstance);
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        unmountImageSpans(mUSDKInstance, this.imageSpans);
    }

    public void addImageSpan(jxe jxeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273a7d64", new Object[]{this, jxeVar});
        } else {
            this.imageSpans.add(jxeVar);
        }
    }

    public void addClickSpan(ClickableSpan clickableSpan) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527e8fbb", new Object[]{this, clickableSpan});
        } else {
            this.clickableSpans.add(clickableSpan);
        }
    }

    private void mountImageSpans(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf858be8", new Object[]{this, mUSDKInstance});
        } else if (mUSDKInstance.getImageAdapter() != null) {
            for (jxe jxeVar : this.imageSpans) {
                String f = jxeVar.f();
                if (!StringUtils.isEmpty(f)) {
                    mUSDKInstance.getImageAdapter().a(mUSDKInstance.getUIContext(), f, jxeVar, MUSImageQuality.AUTO);
                }
            }
        }
    }

    private void unmountImageSpans(MUSDKInstance mUSDKInstance, List<jxe> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39c8f2", new Object[]{this, mUSDKInstance, list});
        } else if (mUSDKInstance.getImageAdapter() != null) {
            for (jxe jxeVar : list) {
                Drawable e = jxeVar.e();
                if (e != null) {
                    mUSDKInstance.getImageAdapter().a(e, jxeVar);
                }
                mUSDKInstance.getImageAdapter().a(jxeVar.f(), jxeVar);
            }
        }
    }

    private void traverseContent(com.taobao.android.weex_uikit.widget.richtext.a aVar, JSONArray jSONArray) {
        com.taobao.android.weex_uikit.widget.richtext.a createChild;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a63cad", new Object[]{this, aVar, jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && (createChild = createChild(jSONObject)) != null) {
                    aVar.a(createChild);
                    createChild.a(jSONObject.getJSONObject("style"));
                    createChild.b(jSONObject.getJSONObject("attr"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("children");
                    if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                        if (createChild.l()) {
                            traverseContent(createChild, jSONArray2);
                        } else {
                            g.c("[RichText] tag " + createChild.getClass().getSimpleName() + " can not have children");
                        }
                    }
                }
            }
        }
    }

    private com.taobao.android.weex_uikit.widget.richtext.a createChild(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_uikit.widget.richtext.a) ipChange.ipc$dispatch("99a9202c", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("type");
        char c = 65535;
        int hashCode = string.hashCode();
        if (hashCode != 97) {
            if (hashCode != 3536714) {
                if (hashCode == 100313435 && string.equals("image")) {
                    c = 2;
                }
            } else if (string.equals("span")) {
                c = 1;
            }
        } else if (string.equals("a")) {
            c = 0;
        }
        if (c == 0) {
            return new jxa(this);
        }
        if (c == 1) {
            return new jxd(this);
        }
        if (c == 2) {
            return new jxc(this);
        }
        return null;
    }

    @Override // com.taobao.android.weex_uikit.widget.text.Text, com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateExtra(UINode uINode, Object obj, String str, Object obj2) {
        List<jxe> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a127bb", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onUpdateExtra(uINode, obj, str, obj2);
        if (!StringUtils.equals(str, EXTRA_RELEASE_SPAN) || getInstance() == null || (list = (List) obj2) == null) {
            return;
        }
        unmountImageSpans(getInstance(), list);
        list.clear();
    }

    /* loaded from: classes6.dex */
    public static final class a extends com.taobao.android.weex_uikit.ui.b<RichText> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1611094634);
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

        public RichText b(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RichText) ipChange.ipc$dispatch("aed00b37", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            RichText richText = new RichText(i);
            richText.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                richText.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                richText.updateAttrs(mUSProps2);
            }
            return richText;
        }
    }
}
