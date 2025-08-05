package com.taobao.android.weex_uikit.widget.richtext;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LineHeightSpan;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_uikit.widget.text.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.jxf;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Integer f16200a;
    public String b;
    public Float c;
    public Integer d;
    public Integer e;
    public Integer f;
    public List<a> g;
    public RichText h;
    private int i = 0;
    private CharSequence j;
    private String k;
    private b l;
    private CharSequence m;

    static {
        kge.a(1314397839);
        kge.a(1041908589);
    }

    public abstract void a(SpannableString spannableString, int i);

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public a(RichText richText) {
        this.h = richText;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18cba0b", new Object[]{this, aVar});
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList(3);
        }
        this.g.add(aVar);
        aVar.a((b) this);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.j = null;
        List<a> list = this.g;
        if (list == null) {
            return;
        }
        list.clear();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f16200a = Integer.valueOf(i);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.c = Float.valueOf(f);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.d = Integer.valueOf(i);
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.e = Integer.valueOf(i);
        }
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18d2e6a", new Object[]{this, bVar});
        } else {
            this.l = bVar;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.i;
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.b
    public Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("9a45f411", new Object[]{this});
        }
        Integer num = this.f16200a;
        if (num != null) {
            return num;
        }
        b bVar = this.l;
        if (bVar == null) {
            return null;
        }
        return bVar.c();
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.b
    public String d() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        String str = this.k;
        return (str == null && (bVar = this.l) != null) ? bVar.d() : str;
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.b
    public Integer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2ea92693", new Object[]{this});
        }
        Integer num = this.f;
        if (num != null) {
            return num;
        }
        b bVar = this.l;
        if (bVar == null) {
            return null;
        }
        return bVar.e();
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.b
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = this.b;
        if (str != null) {
            return str;
        }
        b bVar = this.l;
        if (bVar == null) {
            return null;
        }
        return bVar.f();
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.b
    public Float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("ae3e91b7", new Object[]{this});
        }
        Float f = this.c;
        if (f != null) {
            return f;
        }
        b bVar = this.l;
        if (bVar == null) {
            return null;
        }
        return bVar.g();
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.b
    public Integer h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d3df256", new Object[]{this});
        }
        Integer num = this.d;
        if (num != null) {
            return num;
        }
        b bVar = this.l;
        if (bVar == null) {
            return null;
        }
        return bVar.h();
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.b
    public Integer i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("576f8b97", new Object[]{this});
        }
        Integer num = this.e;
        if (num != null) {
            return num;
        }
        b bVar = this.l;
        if (bVar == null) {
            return null;
        }
        return bVar.i();
    }

    public CharSequence j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("4e0e88a9", new Object[]{this}) : this.j;
    }

    public boolean a(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf0a3e3", new Object[]{this, str, mUSValue})).booleanValue();
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -515807685) {
            if (hashCode != 365601008) {
                if (hashCode == 863270933 && str.equals("wordBreak")) {
                    c = 1;
                }
            } else if (str.equals("fontSize")) {
                c = 0;
            }
        } else if (str.equals("lineHeight")) {
            c = 2;
        }
        if (c == 0) {
            a(i.a(mUSValue, this.h.getInstance().getRpxPerRem()));
            return true;
        }
        String str2 = null;
        if (c == 1) {
            if (mUSValue != null) {
                str2 = mUSValue.convertToString();
            }
            a(str2);
            return true;
        } else if (c != 2) {
            return false;
        } else {
            if (mUSValue == null) {
                this.f = null;
                return true;
            }
            if (mUSValue.isInt() || mUSValue.isFloat()) {
                this.f = Integer.valueOf(Math.round(-mUSValue.convertToFloat()));
            } else if (mUSValue.isString()) {
                String stringValue = mUSValue.getStringValue();
                if (stringValue.length() > 0 && (stringValue.charAt(stringValue.length() - 1) == 'x' || stringValue.charAt(stringValue.length() - 1) == 'm')) {
                    this.f = Integer.valueOf(Math.round(i.a(stringValue, this.h.getInstance().getRpxPerRem())));
                } else {
                    this.f = Integer.valueOf(Math.round(-Float.parseFloat(stringValue)));
                }
            }
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(JSONObject jSONObject) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                    String key = entry.getKey();
                    switch (key.hashCode()) {
                        case -1550943582:
                            if (key.equals("fontStyle")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1224696685:
                            if (key.equals("fontFamily")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -734428249:
                            if (key.equals("fontWeight")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -515807685:
                            if (key.equals("lineHeight")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 94842723:
                            if (key.equals("color")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 365601008:
                            if (key.equals("fontSize")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 863270933:
                            if (key.equals("wordBreak")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1287124693:
                            if (key.equals("backgroundColor")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            a(com.taobao.android.weex_uikit.util.b.a(entry.getValue().toString()));
                            continue;
                        case 1:
                            b(entry.getValue().toString());
                            continue;
                        case 2:
                            a(i.a(entry.getValue().toString(), this.h.getInstance().getRpxPerRem()));
                            continue;
                        case 3:
                            b(k.a(entry.getValue().toString()));
                            continue;
                        case 4:
                            c(k.b(entry.getValue().toString()));
                            continue;
                        case 5:
                            d(com.taobao.android.weex_uikit.util.b.a(entry.getValue().toString()));
                            continue;
                        case 6:
                            a(String.valueOf(entry.getValue()));
                            continue;
                        case 7:
                            Object value = entry.getValue();
                            if ((value instanceof Float) || (value instanceof Integer)) {
                                this.f = Integer.valueOf(Math.round(-jSONObject.getFloatValue("lineHeight")));
                                continue;
                            } else if (value instanceof String) {
                                String str = (String) value;
                                if (str.length() > 0 && (str.charAt(str.length() - 1) == 'x' || str.charAt(str.length() - 1) == 'm')) {
                                    this.f = Integer.valueOf(Math.round(i.a(str, this.h.getInstance().getRpxPerRem())));
                                    break;
                                } else {
                                    this.f = Integer.valueOf(Math.round(-Float.parseFloat(str)));
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        default:
                            a(entry.getKey(), entry.getValue().toString());
                            continue;
                    }
                }
            }
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey())) {
                    b(entry.getKey(), entry.getValue().toString());
                }
            }
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        char c = 65535;
        if (str.hashCode() == 111972721 && str.equals("value")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        this.j = str2;
    }

    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
        } else {
            this.m = charSequence;
        }
    }

    public CharSequence k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("3edf9008", new Object[]{this}) : this.m;
    }

    public void b(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cdf7d8d", new Object[]{this, charSequence});
        } else {
            this.j = charSequence;
        }
    }

    public CharSequence m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("20819ec6", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(j())) {
            sb.append(j());
        }
        List<a> list = this.g;
        if (list != null) {
            for (a aVar : list) {
                sb.append(aVar.m());
            }
        }
        this.m = sb.toString();
        return this.m;
    }

    public void b(SpannableString spannableString, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe11af8", new Object[]{this, spannableString, new Integer(i)});
        } else if (this.g != null) {
            if (j() != null) {
                i2 = j().length();
            }
            for (a aVar : this.g) {
                aVar.a(spannableString, i + i2);
                CharSequence charSequence = aVar.m;
                if (charSequence != null) {
                    i += charSequence.length();
                }
            }
        }
    }

    public void a(SpannableString spannableString, int i, int i2) {
        float a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589ae38a", new Object[]{this, spannableString, new Integer(i), new Integer(i2)});
            return;
        }
        if (c() != null) {
            spannableString.setSpan(new ForegroundColorSpan(c().intValue()), i, i2, 33);
        }
        if (g() != null) {
            a2 = g().floatValue();
            spannableString.setSpan(new AbsoluteSizeSpan(Math.round(a2)), i, i2, 33);
        } else {
            a2 = i.a(32);
        }
        if (b() != 0) {
            spannableString.setSpan(new BackgroundColorSpan(b()), i, i2, 33);
        }
        Integer e = e();
        if (e != null) {
            final int intValue = e.intValue() > 0 ? e.intValue() : Math.round(a2 * (-e.intValue()));
            spannableString.setSpan(new LineHeightSpan() { // from class: com.taobao.android.weex_uikit.widget.richtext.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.text.style.LineHeightSpan
                public void chooseHeight(CharSequence charSequence, int i3, int i4, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("646418b3", new Object[]{this, charSequence, new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), fontMetricsInt});
                        return;
                    }
                    int i7 = (intValue - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2;
                    fontMetricsInt.top -= i7;
                    fontMetricsInt.bottom += i7;
                    fontMetricsInt.ascent -= i7;
                    fontMetricsInt.descent += i7;
                }
            }, i, i2, 33);
        }
        Integer h = h();
        Integer i3 = i();
        String f = f();
        if (h != null || i3 != null || f != null) {
            int i4 = -1;
            int intValue2 = h == null ? -1 : h.intValue();
            if (i3 != null) {
                i4 = i3.intValue();
            }
            spannableString.setSpan(new jxf(intValue2, i4, f), i, i2, 33);
        }
        if (f == null) {
            return;
        }
        this.h.addFontFamily(f);
    }
}
