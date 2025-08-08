package com.taobao.android.weex_uikit.widget.text;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_framework.widget.FontDO;
import com.taobao.android.weex_framework.widget.a;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.richtext.RichText;
import tb.kge;
import tb.qnt;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_CLICK_SPAN = "clickSpan";
    public static final String ATTR_IMAGE_SPAN = "imageSpan";
    public static final int DEFAULT_FONT_SIZE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f16225a;

    static {
        kge.a(-285068617);
        DEFAULT_FONT_SIZE = Math.round(com.taobao.android.weex_framework.util.i.a(32.0f));
        f16225a = f.d;
    }

    public static g a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("87e93b59", new Object[]{context}) : new g();
    }

    public static void a(final UINode uINode, m<h> mVar, m<a.b> mVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d2ad86", new Object[]{uINode, mVar, mVar2});
            return;
        }
        mVar.a(new h(uINode));
        mVar2.a(new a.b() { // from class: com.taobao.android.weex_uikit.widget.text.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.widget.a.b
            public void a(FontDO fontDO) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3bfaae90", new Object[]{this, fontDO});
                } else if (!StringUtils.equals((String) UINode.this.getAttribute("fontFamily"), fontDO.e()) || fontDO.c() == null) {
                } else {
                    UINode.this.notifyEngineRelayout();
                }
            }
        });
    }

    public static void a(UINode uINode, int i, int i2, int i3, int i4, int[] iArr, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d04ae3a", new Object[]{uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, hVar});
            return;
        }
        b(uINode);
        hVar.a(uINode instanceof RichText, i, i2, i3, i4, iArr, ((Integer) uINode.getAttribute("wordBreak")).intValue(), uINode);
    }

    public static void a(UINode uINode, int i, int i2, int i3, int i4, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceeb2688", new Object[]{uINode, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), hVar});
            return;
        }
        b(uINode);
        hVar.a(uINode instanceof RichText, i, i2, i3, i4, ((Integer) uINode.getAttribute("wordBreak")).intValue(), uINode);
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, g gVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7e7855", new Object[]{uINode, mUSDKInstance, gVar, hVar});
            return;
        }
        a(uINode);
        gVar.a((CharSequence) uINode.getAttribute("value"), (Layout) uINode.getExtra("textLayout"), f.c, hVar.b(), 0, (ClickableSpan[]) uINode.getAttribute(ATTR_CLICK_SPAN), (ImageSpan[]) uINode.getAttribute(ATTR_IMAGE_SPAN), null, null, -1, -1, 0.0f, qnt.TYPE_TEXT);
    }

    public static void a(UINode uINode, MUSDKInstance mUSDKInstance, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647ee2f3", new Object[]{uINode, mUSDKInstance, gVar});
        } else {
            gVar.a();
        }
    }

    public static void a(UINode uINode, g gVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450e8d8f", new Object[]{uINode, gVar, str, obj});
        } else if (gVar == null || !StringUtils.equals(str, "textLayout")) {
        } else {
            a(uINode);
            gVar.a((Layout) obj);
        }
    }

    public static void a(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82939aea", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("fontStyle", Integer.valueOf(k.a(str)));
        }
    }

    public static void b(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49ec9", new Object[]{uINode, str});
            return;
        }
        if (StringUtils.equals(str, com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_break_all)) {
            i = 2;
        }
        uINode.setAttribute("wordBreak", Integer.valueOf(i));
    }

    public static void a(UINode uINode, String str, a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a90cc89", new Object[]{uINode, str, bVar});
            return;
        }
        String str2 = (String) uINode.getAttribute("fontFamily");
        if (!StringUtils.isEmpty(str2)) {
            com.taobao.android.weex_framework.widget.a.a().b(str2, bVar);
        }
        if (!StringUtils.isEmpty(str)) {
            com.taobao.android.weex_framework.widget.a.a().a(str, bVar);
        }
        uINode.setAttribute("fontFamily", str);
    }

    public static void c(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f55a2a8", new Object[]{uINode, str});
        } else {
            uINode.setAttribute("fontWeight", Integer.valueOf(k.b(str)));
        }
    }

    public static void d(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdb6a687", new Object[]{uINode, str});
        } else if (StringUtils.isEmpty(str)) {
            uINode.setAttribute("color", -16777216);
        } else {
            uINode.setAttribute("color", Integer.valueOf(com.taobao.android.weex_uikit.util.b.a(str)));
        }
    }

    public static void e(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c17aa66", new Object[]{uINode, str});
        } else if (StringUtils.isEmpty(str)) {
            uINode.setAttribute("fontSize", Float.valueOf(32.0f));
        } else {
            uINode.setAttribute("fontSize", Integer.valueOf(Math.round(com.taobao.android.weex_framework.util.i.a(com.taobao.android.weex_framework.util.i.b(str, uINode.getInstance().getRpxPerRem())))));
        }
    }

    public static void f(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa78ae45", new Object[]{uINode, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        uINode.setAttribute("textDecoration", str);
    }

    public static void g(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d9b224", new Object[]{uINode, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        uINode.setAttribute("textOverflow", str);
    }

    public static void h(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73ab603", new Object[]{uINode, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "end";
        }
        uINode.setAttribute(MUSConstants.ELLIPSIS_POSITION, str);
    }

    public static void i(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759bb9e2", new Object[]{uINode, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "normal";
        }
        uINode.setAttribute("whiteSpace", str);
    }

    public static void a(UINode uINode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0011de3", new Object[]{uINode, new Integer(i)});
        } else {
            uINode.setAttribute("lines", Integer.valueOf(i));
        }
    }

    public static void a(UINode uINode, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fba3cd", new Object[]{uINode, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            uINode.setAttribute("lineHeight", Float.valueOf(Float.MAX_VALUE));
        } else if (mUSValue.isInt() || mUSValue.isFloat()) {
            uINode.setAttribute("lineHeight", Float.valueOf(-mUSValue.convertToFloat()));
        } else if (!mUSValue.isString()) {
        } else {
            String stringValue = mUSValue.getStringValue();
            if (stringValue.length() > 0 && (stringValue.charAt(stringValue.length() - 1) == 'x' || stringValue.charAt(stringValue.length() - 1) == 'm')) {
                uINode.setAttribute("lineHeight", Float.valueOf(Math.round(com.taobao.android.weex_framework.util.i.a(stringValue, uINode.getInstance().getRpxPerRem())) * 1.0f));
            } else {
                uINode.setAttribute("lineHeight", Float.valueOf(-Float.parseFloat(stringValue)));
            }
        }
    }

    public static void j(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3fcbdc1", new Object[]{uINode, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        uINode.setAttribute("textAlign", str);
    }

    public static void k(UINode uINode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725dc1a0", new Object[]{uINode, str});
            return;
        }
        uINode.setAttribute("value", str);
        uINode.setExtra("ariaLabel", str);
        uINode.setAttribute("breakValue", "");
    }

    public static void a(UINode uINode, g gVar, CharSequence charSequence, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520120fb", new Object[]{uINode, gVar, charSequence, hVar});
        } else {
            a(uINode, uINode.getInstance(), gVar, hVar);
        }
    }

    private static void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce7920", new Object[]{uINode});
            return;
        }
        Layout layout = (Layout) uINode.getExtra("textLayout");
        if (layout == null) {
            return;
        }
        String str = (String) uINode.getAttribute("textDecoration");
        if (str == null) {
            str = "";
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1171789332) {
            if (hashCode != -1026963764) {
                if (hashCode == 3387192 && str.equals("none")) {
                    c = 2;
                }
            } else if (str.equals("underline")) {
                c = 0;
            }
        } else if (str.equals("line-through")) {
            c = 1;
        }
        char c2 = c != 0 ? c != 1 ? (char) 1 : (char) 3 : (char) 2;
        layout.getPaint().setUnderlineText(c2 == 2);
        TextPaint paint = layout.getPaint();
        if (c2 == 3) {
            z = true;
        }
        paint.setStrikeThruText(z);
    }

    private static void b(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134606bf", new Object[]{uINode});
        } else if (Build.VERSION.SDK_INT < 28) {
            uINode.setExtra("fontFace", i.a().a((String) uINode.getAttribute("fontFamily"), ((Integer) uINode.getAttribute("fontStyle")).intValue(), ((Integer) uINode.getAttribute("fontWeight")).intValue()));
        } else {
            uINode.setExtra("fontFace", k.a(((Integer) uINode.getAttribute("fontStyle")).intValue(), ((Integer) uINode.getAttribute("fontWeight")).intValue(), (String) uINode.getAttribute("fontFamily")));
        }
    }
}
