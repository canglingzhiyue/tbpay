package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.text.SpannableString;
import mtopsdk.common.util.StringUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class PriceView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-51025184);
    }

    public static /* synthetic */ Object ipc$super(PriceView priceView, String str, Object... objArr) {
        if (str.hashCode() == 358241672) {
            super.setText((CharSequence) objArr[0], (TextView.BufferType) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PriceView(Context context) {
        super(context);
    }

    public PriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155a5588", new Object[]{this, charSequence, bufferType});
        } else if (StringUtils.isEmpty(charSequence)) {
            super.setText((CharSequence) null, bufferType);
        } else {
            String charSequence2 = charSequence.toString();
            int numberStartIndex = getNumberStartIndex(charSequence2);
            if (numberStartIndex > 0 && charSequence2.charAt(numberStartIndex - 1) != ' ') {
                StringBuilder sb = new StringBuilder(charSequence2);
                sb.insert(numberStartIndex, ' ');
                charSequence2 = sb.toString();
                numberStartIndex++;
            }
            try {
                float textSize = getTextSize();
                int indexOf = charSequence2.indexOf(".");
                SpannableString spannableString = new SpannableString(charSequence2);
                int i = (int) ((3.0f * textSize) / 4.0f);
                spannableString.setSpan(new AbsoluteSizeSpan(i), 0, numberStartIndex, 33);
                if (indexOf > 0) {
                    spannableString.setSpan(new AbsoluteSizeSpan((int) textSize), numberStartIndex, indexOf, 33);
                    spannableString.setSpan(new AbsoluteSizeSpan(i), indexOf, charSequence2.length(), 33);
                } else {
                    spannableString.setSpan(new AbsoluteSizeSpan((int) textSize), numberStartIndex, charSequence2.length(), 33);
                }
                super.setText(spannableString, bufferType);
            } catch (Throwable unused) {
                super.setText(charSequence2, bufferType);
            }
        }
    }

    private int getNumberStartIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7fcd673", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
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
