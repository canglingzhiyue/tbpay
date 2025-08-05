package com.alibaba.android.ultron.trade.dinamicX.constructor;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.constructor.DTextViewConstructor;
import java.util.ArrayList;
import java.util.Map;
import tb.fpd;
import tb.kge;

/* loaded from: classes2.dex */
public class TradePriceViewConstructor extends DTextViewConstructor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String D_DECIMAL_SCALE = "dDecimalScale";
    private static final String D_PRICE = "dPrice";
    private static final String D_RICH_TEXT = "dRichText";
    private static final String D_SYMBOL_SCALE = "dSymbolScale";
    private static final String D_TEXT = "dText";
    private static final float PRICE_DECIMAL_PROPORTION = 0.625f;
    private static final float PRICE_INTEGER_PROPORTION = 1.0f;
    private static final float PRICE_SYMBOL_PROPORTION = 0.625f;
    public static final String VIEW_TAG = "TradePriceView";

    static {
        kge.a(930315866);
    }

    public static /* synthetic */ Object ipc$super(TradePriceViewConstructor tradePriceViewConstructor, String str, Object... objArr) {
        if (str.hashCode() == 333836301) {
            super.setAttributes((View) objArr[0], (Map) objArr[1], (ArrayList) objArr[2], (fpd) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor
    public void setText(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9914798", new Object[]{this, textView, str});
        }
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet}) : new TextView(context, attributeSet);
    }

    private void setTextInternal(TextView textView, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd1435", new Object[]{this, textView, charSequence});
        } else if (textView == null || charSequence == null) {
        } else {
            textView.setText(charSequence);
        }
    }

    @Override // com.taobao.android.dinamic.constructor.DTextViewConstructor, com.taobao.android.dinamic.dinamic.h
    public void setAttributes(View view, Map<String, Object> map, ArrayList<String> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e5f00d", new Object[]{this, view, map, arrayList, fpdVar});
            return;
        }
        super.setAttributes(view, map, arrayList, fpdVar);
        TextView textView = null;
        if (view instanceof TextView) {
            textView = (TextView) view;
        }
        TextView textView2 = textView;
        if (arrayList.contains(D_RICH_TEXT)) {
            Object obj = map.get(D_RICH_TEXT);
            if (obj instanceof CharSequence) {
                setTextInternal(textView2, (CharSequence) obj);
            } else {
                setTextInternal(textView2, "");
            }
        } else if (arrayList.contains(D_PRICE) || arrayList.contains(D_SYMBOL_SCALE) || arrayList.contains(D_DECIMAL_SCALE)) {
            setPrice(textView2, map.get(D_PRICE), getScale(map.get(D_SYMBOL_SCALE), 0.625f), 1.0f, getScale(map.get(D_DECIMAL_SCALE), 0.625f));
        } else if (!arrayList.contains(D_TEXT)) {
        } else {
            Object obj2 = map.get(D_TEXT);
            if (obj2 != null) {
                setTextInternal(textView2, obj2.toString());
            } else {
                setTextInternal(textView2, "");
            }
        }
    }

    private float getScale(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a578559", new Object[]{this, obj, new Float(f)})).floatValue();
        }
        if (obj != null && !TextUtils.isEmpty(obj.toString())) {
            try {
                return Float.valueOf(obj.toString()).floatValue();
            } catch (Throwable unused) {
            }
        }
        return f;
    }

    private void setPrice(TextView textView, Object obj, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ac812e", new Object[]{this, textView, obj, new Float(f), new Float(f2), new Float(f3)});
        } else if (textView == null) {
        } else {
            if (obj != null) {
                String obj2 = obj.toString();
                int indexOf = obj2.indexOf(46);
                SpannableString spannableString = new SpannableString(obj2);
                int numberStartIndex = getNumberStartIndex(obj2);
                try {
                    spannableString.setSpan(new RelativeSizeSpan(f), 0, numberStartIndex, 33);
                    int length = obj2.length();
                    if (indexOf < 0) {
                        spannableString.setSpan(new RelativeSizeSpan(f2), numberStartIndex, length, 33);
                    } else {
                        spannableString.setSpan(new RelativeSizeSpan(f2), numberStartIndex, indexOf, 33);
                        spannableString.setSpan(new RelativeSizeSpan(f3), indexOf, length, 33);
                    }
                    setTextInternal(textView, spannableString);
                    return;
                } catch (Throwable unused) {
                    setTextInternal(textView, obj2);
                    return;
                }
            }
            setTextInternal(textView, "");
        }
    }

    private int getNumberStartIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7fcd673", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                return i;
            }
        }
        return 0;
    }
}
