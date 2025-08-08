package tb;

import android.graphics.Typeface;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.homepage.dinamic3.b;
import com.taobao.tab2interact.core.utils.e;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class xmy extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PRICE_TEXT_STYLE_ALI_STYLE = "alistyle";
    public static final String PRICE_TEXT_STYLE_BOLD = "bold";
    public static final String PRICE_TEXT_STYLE_BOLD_ITALIC = "bold_italic";
    public static final String PRICE_TEXT_STYLE_ITALIC = "italic";
    public static final String PRICE_TEXT_STYLE_NORMAL = "normal";
    public static final long R_PRICE_TEXT = 2082245569794182932L;
    public static final long R_PRICE_TEXT_ALIGNMENT = -543018877117248068L;
    public static final long R_PRICE_TEXT_COLOR = 3235869418129297432L;
    public static final long R_PRICE_TEXT_SIZE = -3926857452327547469L;
    public static final long R_PRICE_TEXT_STYLE = 3238159488123598378L;
    public static final long R_PRICE_VIEW = -7577370574697348630L;
    private static Typeface d;

    /* renamed from: a  reason: collision with root package name */
    private String f34393a;
    private String b;
    private int c = gbg.a(DinamicXEngine.i(), 16.0f);
    private b e;

    static {
        kge.a(2029306274);
    }

    public static /* synthetic */ Object ipc$super(xmy xmyVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 28626114:
                super.onEndParser();
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
            return;
        }
        super.onEndParser();
        setText(a());
    }

    private SpannableString a() {
        int i;
        StyleSpan styleSpan;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("eabbd830", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.b)) {
            return null;
        }
        JSONObject parseObject = JSON.parseObject(this.b);
        String string = parseObject.getString(com.taobao.android.weex_framework.util.a.ATOM_symbol);
        if (string == null) {
            string = "";
        }
        String string2 = parseObject.getString("yuan");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parseObject.getString("separator");
        if (string3 == null) {
            string3 = "";
        }
        String string4 = parseObject.getString("cent");
        if (string4 == null) {
            string4 = "";
        }
        String string5 = parseObject.getString(nog.PRICE_UNIT);
        if (string5 == null) {
            string5 = "";
        }
        SpannableString spannableString = new SpannableString(string + string2 + string3 + string4 + string5);
        int i2 = (int) (((double) this.c) * 0.625d);
        if ("alistyle".equals(this.f34393a)) {
            int i3 = this.c;
            i = (int) (i3 * 0.762f);
            i2 = (int) (i3 * 0.571f);
        } else {
            i = i2;
        }
        int length = string.length();
        if (length != 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(i2), 0, length, 33);
        }
        int length2 = string2.length() + string3.length();
        int i4 = length + length2;
        if (length2 != 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(this.c), length, i4, 33);
        }
        int length3 = string4.length() + string5.length();
        int i5 = i4 + length3;
        if (length3 != 0) {
            spannableString.setSpan(new AbsoluteSizeSpan(i), i4, i5, 33);
        }
        if ("normal".equals(this.f34393a)) {
            styleSpan = new StyleSpan(0);
        } else if ("bold".equals(this.f34393a)) {
            styleSpan = new StyleSpan(1);
        } else if ("italic".equals(this.f34393a)) {
            styleSpan = new StyleSpan(2);
        } else if ("bold_italic".equals(this.f34393a)) {
            styleSpan = new StyleSpan(3);
        } else {
            styleSpan = new StyleSpan(0);
        }
        spannableString.setSpan(styleSpan, length, i5, 33);
        if ("alistyle".equals(this.f34393a)) {
            b();
            Typeface typeface = d;
            if (typeface != null) {
                if (this.e == null) {
                    this.e = new b(typeface);
                }
                spannableString.setSpan(this.e, length, i5, 33);
            }
            if (length != 0) {
                spannableString.setSpan(new com.taobao.homepage.dinamic3.a(0.3f), 0, length, 33);
            }
        }
        return spannableString;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (d != null) {
        } else {
            d = Typeface.createFromAsset(Globals.getApplication().getAssets(), e.ALI_SANS_TYPEFACE_ASSET_PATH);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (3238159488123598378L == j) {
            this.f34393a = str;
        } else if (2082245569794182932L == j) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-3926857452327547469L == j) {
            this.c = i;
            setTextSize(this.c);
        } else if (-543018877117248068L == j) {
            setTextGravity(i);
        } else if (3235869418129297432L == j) {
            setTextColor(i);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof xmy)) {
            return;
        }
        xmy xmyVar = (xmy) dXWidgetNode;
        this.f34393a = xmyVar.f34393a;
        this.b = xmyVar.b;
        this.c = xmyVar.c;
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1130834311);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new xmy();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new xmy();
    }
}
