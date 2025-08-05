package tb;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hyc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PRICE_INTEGER_SIZE_15 = 15;
    public static final int PRICE_INTEGER_SIZE_16 = 16;
    public static final int PRICE_MONEY_SYMBOL_SIZE = 12;
    public static final int PRICE_PRICE_DECIMAL_SIZE = 12;

    static {
        kge.a(83911422);
    }

    public static void a(TextView textView, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c92fdee", new Object[]{textView, str, new Boolean(z)});
        } else {
            a(textView, str, z, 16);
        }
    }

    public static void a(TextView textView, String str, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15cd32d5", new Object[]{textView, str, new Boolean(z), new Integer(i)});
        } else if (textView == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            if (!z) {
                textView.setText(str);
            } else if (TextUtils.isEmpty(str)) {
            } else {
                int indexOf = str.indexOf(46);
                SpannableString spannableString = new SpannableString(str);
                int a2 = a(str);
                try {
                    spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, a2, 33);
                    int length = str.length();
                    if (indexOf < 0) {
                        spannableString.setSpan(new AbsoluteSizeSpan(i, true), a2, length, 33);
                    } else {
                        spannableString.setSpan(new AbsoluteSizeSpan(i, true), a2, indexOf, 33);
                        spannableString.setSpan(new AbsoluteSizeSpan(12, true), indexOf, length, 33);
                    }
                    textView.setText(spannableString);
                } catch (Exception unused) {
                    textView.setText(str);
                }
            }
        }
    }

    private static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
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
