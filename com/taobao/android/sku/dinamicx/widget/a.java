package com.taobao.android.sku.dinamicx.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.sku.utils.o;
import com.taobao.android.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import tb.fxa;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_WIDGET_ID;

    /* renamed from: a  reason: collision with root package name */
    private static final long f15164a;
    private static final long b;
    private static final long c;
    private JSONArray d = new JSONArray();
    private int e;

    /* renamed from: com.taobao.android.sku.dinamicx.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0580a {

        /* renamed from: a  reason: collision with root package name */
        public int f15165a;
        public int b;
        public int c = 33;
        public List<Object> d = new ArrayList();

        static {
            kge.a(-1155694442);
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(-1516833800);
        DX_WIDGET_ID = fxa.a("skuRichTextView");
        f15164a = fxa.a("textColor");
        b = fxa.a("richText");
        c = fxa.a("htmlText");
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof a)) {
            return;
        }
        a aVar = (a) dXWidgetNode;
        this.e = aVar.e;
        this.d = (JSONArray) aVar.d.clone();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (f15164a != j) {
            return;
        }
        this.e = i;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (c != j) {
            return;
        }
        CharSequence charSequence = null;
        try {
            charSequence = a(str);
        } catch (Throwable th) {
            o.b(th.toString());
        }
        setText(charSequence);
    }

    private CharSequence a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("2d0b4348", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null && uRLSpanArr.length > 0) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (uRLSpan == null) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                } else {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    final String url = uRLSpan.getURL();
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new URLSpan(url) { // from class: com.taobao.android.sku.dinamicx.widget.RichTextView$1
                        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                        public void onClick(View view) {
                            AliNavServiceInterface a2 = t.a();
                            if (a2 == null || url == null) {
                                return;
                            }
                            a2.a(view.getContext()).a(url);
                        }
                    }, spanStart, spanEnd, spanFlags);
                }
            }
        }
        return spannableStringBuilder;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
            return;
        }
        super.onSetObjAttribute(j, obj);
        if (b != j) {
            return;
        }
        if (obj instanceof JSONArray) {
            this.d = (JSONArray) obj;
        } else {
            this.d = b(obj.toString());
        }
        setText(a(this.d));
    }

    private JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{this, str});
        }
        JSONArray jSONArray = new JSONArray();
        try {
            return JSONObject.parseArray(str);
        } catch (Throwable th) {
            o.b(th.toString());
            return jSONArray;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        View onCreateView = super.onCreateView(context);
        if (onCreateView instanceof TextView) {
            ((TextView) onCreateView).setMovementMethod(LinkMovementMethod.getInstance());
        }
        return onCreateView;
    }

    private SpannableString a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("54fb1008", new Object[]{this, jSONArray});
        }
        String str = "";
        if (jSONArray != null) {
            ArrayList<C0580a> arrayList = new ArrayList();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString("text");
                    if (!StringUtils.isEmpty(string)) {
                        str = str + string;
                        C0580a a2 = a(jSONObject, str, string);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                        C0580a a3 = a(jSONObject, str, string, a2);
                        if (a3 != null) {
                            arrayList.add(a3);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                SpannableString spannableString = new SpannableString(str);
                for (C0580a c0580a : arrayList) {
                    for (Object obj : c0580a.d) {
                        spannableString.setSpan(obj, c0580a.f15165a, c0580a.b, c0580a.c);
                    }
                }
                return spannableString;
            }
        }
        return new SpannableString(str);
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject}) : jSONObject.getJSONObject("style");
    }

    private Object b(JSONObject jSONObject) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c59f1eb", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (a2 = a(jSONObject.getString("color"), 1193046)) != 1193046) {
            return new ForegroundColorSpan(a2);
        }
        return null;
    }

    private Object c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("75ae472c", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            return new RelativeSizeSpan(Float.parseFloat(jSONObject.getString("size")));
        } catch (Throwable unused) {
            return null;
        }
    }

    private Object d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9f029c6d", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString("bold"))) {
            return null;
        }
        return new StyleSpan(1);
    }

    private Object e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c856f1ae", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString("italic"))) {
            return null;
        }
        return new StyleSpan(2);
    }

    private Object f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f1ab46ef", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || !Boolean.parseBoolean(jSONObject.getString("strikeThrough"))) {
            return null;
        }
        return new StrikethroughSpan();
    }

    private JSONObject g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97d7ca62", new Object[]{this, jSONObject}) : jSONObject.getJSONObject("event");
    }

    private Object a(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f202d417", new Object[]{this, jSONObject, new Integer(i)});
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("openUrl");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        return new b(string, i);
    }

    private C0580a a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0580a) ipChange.ipc$dispatch("71e31ab5", new Object[]{this, jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject a2 = a(jSONObject);
        C0580a c0580a = new C0580a();
        c0580a.f15165a = str.indexOf(str2);
        c0580a.b = c0580a.f15165a + str2.length();
        Object c2 = c(a2);
        if (c2 != null) {
            c0580a.d.add(c2);
        }
        Object b2 = b(a2);
        if (b2 != null) {
            c0580a.d.add(b2);
        }
        Object d = d(a2);
        if (d != null) {
            c0580a.d.add(d);
        }
        Object e = e(a2);
        if (e != null) {
            c0580a.d.add(e);
        }
        Object f = f(a2);
        if (f != null) {
            c0580a.d.add(f);
        }
        if (c0580a.d.size() <= 0) {
            return null;
        }
        return c0580a;
    }

    private C0580a a(JSONObject jSONObject, String str, String str2, C0580a c0580a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0580a) ipChange.ipc$dispatch("1a82825a", new Object[]{this, jSONObject, str, str2, c0580a});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject g = g(jSONObject);
        C0580a c0580a2 = new C0580a();
        c0580a2.f15165a = str.indexOf(str2);
        c0580a2.b = c0580a2.f15165a + str2.length();
        ForegroundColorSpan a2 = a(c0580a);
        int i = this.e;
        if (a2 != null) {
            i = a2.getForegroundColor();
        }
        Object a3 = a(g, i);
        if (a3 != null) {
            c0580a2.d.add(a3);
        }
        if (c0580a2.d.size() <= 0) {
            return null;
        }
        return c0580a2;
    }

    private int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (str == null || str.length() <= 0) {
            return i;
        }
        String lowerCase = str.toLowerCase(Locale.SIMPLIFIED_CHINESE);
        StringBuilder sb = new StringBuilder("#");
        for (int i2 = 1; i2 < 9 && i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f')) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        return (sb2.length() == 7 || sb2.length() == 9) ? Color.parseColor(sb2) : i;
    }

    private ForegroundColorSpan a(C0580a c0580a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ForegroundColorSpan) ipChange.ipc$dispatch("ebfdd078", new Object[]{this, c0580a});
        }
        if (c0580a != null && c0580a.d != null && c0580a.d.size() > 0) {
            for (Object obj : c0580a.d) {
                if (obj instanceof ForegroundColorSpan) {
                    return (ForegroundColorSpan) obj;
                }
            }
        }
        return null;
    }

    /* loaded from: classes6.dex */
    public static class b extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f15166a;
        private int b;

        static {
            kge.a(1006453901);
        }

        public b(String str, int i) {
            this.f15166a = str;
            this.b = i;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                return;
            }
            textPaint.setColor(this.b);
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            try {
                t.a().a(view.getContext()).a(this.f15166a);
            } catch (Throwable th) {
                o.b(th.toString());
            }
        }
    }
}
