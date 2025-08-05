package com.taobao.android.order.core.dinamicX.parser;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import tb.fuf;
import tb.hzq;
import tb.hzy;
import tb.iaa;
import tb.kge;

/* loaded from: classes6.dex */
public class TDApplyRichCssParser extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ID = 3445701180796083611L;
    public static final String PARSER_TAG = "tdApplyRichCss";

    /* loaded from: classes6.dex */
    public static class CSS implements Serializable {
        public String bgColor;
        public boolean bold;
        public String color;
        public String fontColor;
        public int fontSize;
        public int iconHeight;
        public boolean strikeThrough;

        static {
            kge.a(-1686683891);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes6.dex */
    public static class RichText implements Serializable {
        public CSS css;
        public String richStr;

        static {
            kge.a(1368435039);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-1051200818);
    }

    public static /* synthetic */ Object ipc$super(TDApplyRichCssParser tDApplyRichCssParser, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        hzy.a("TDApplyRichCssParser", "evalWithArgs", "----");
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception unused) {
            iaa.a(dXRuntimeContext.m(), "TDApplyRichCssParser", PARSER_TAG, "解析异常", null);
            return null;
        }
    }

    private Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) throws Exception {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ebd01cf8", new Object[]{this, objArr, dXRuntimeContext});
        }
        List<RichText> list = null;
        String a2 = hzq.a(objArr, 2, new Class[]{String.class, null});
        if (!TextUtils.isEmpty(a2)) {
            throw new RuntimeException(a2);
        }
        String str = (String) objArr[0];
        Object obj = objArr[1];
        String str2 = "";
        if (str == null) {
            return str2;
        }
        if (obj != null) {
            str2 = obj.toString();
        }
        try {
            list = JSONArray.parseArray(str2, RichText.class);
        } catch (Throwable th) {
            iaa.a(dXRuntimeContext.m(), "TDApplyRichCssParser", PARSER_TAG, th.toString(), null);
        }
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        for (RichText richText : list) {
            if (richText != null && !TextUtils.isEmpty(richText.richStr) && (indexOf = str.indexOf(richText.richStr)) >= 0) {
                int length = richText.richStr.length() + indexOf;
                if (richText.css != null && richText.css.strikeThrough) {
                    spannableString.setSpan(new StrikethroughSpan(), indexOf, length, 33);
                }
                if (richText.css != null && richText.css.bold) {
                    spannableString.setSpan(new StyleSpan(1), indexOf, length, 33);
                }
                if (richText.css != null && !TextUtils.isEmpty(richText.css.color)) {
                    try {
                        spannableString.setSpan(new ForegroundColorSpan(a(richText.css.color, -16777216)), indexOf, length, 33);
                    } catch (Exception unused) {
                    }
                }
                if (richText.css != null && richText.css.fontSize > 0) {
                    spannableString.setSpan(new AbsoluteSizeSpan(richText.css.fontSize, true), indexOf, length, 33);
                }
            }
        }
        return spannableString;
    }

    private static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
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
}
