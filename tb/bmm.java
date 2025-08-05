package tb;

import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import com.alibaba.android.ultron.trade.utils.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bmm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_HINT_COLOR = -16777216;
    public static final int INPUT_TYPE_NORMAL = 0;
    public static final int INPUT_TYPE_NUMBER = 1;
    public static final int INPUT_TYPE_PASSWORD = 3;
    public static final int INPUT_TYPE_PHONE = 2;

    static {
        kge.a(1921434374);
    }

    public static void a(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a41dde1", new Object[]{editText, str});
        } else if (editText == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                editText.setInputType(1);
                return;
            }
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                editText.setInputType(1);
            } else if (intValue == 1) {
                editText.setInputType(2);
            } else if (intValue == 2) {
                editText.setInputType(3);
            } else if (intValue == 3) {
                editText.setInputType(128);
            } else {
                editText.setInputType(1);
            }
        }
    }

    public static void b(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c7fc0", new Object[]{editText, str});
        } else if (editText == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
                return;
            }
            Integer valueOf = Integer.valueOf(str);
            if (valueOf.intValue() <= 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(valueOf.intValue())});
            }
        }
    }

    public static void c(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd7219f", new Object[]{editText, str});
        } else if (editText == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            editText.setHint(str);
        }
    }

    public static void d(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1c37e", new Object[]{editText, str});
        } else if (editText == null) {
        } else {
            editText.setHintTextColor(b.a(str, -16777216));
        }
    }

    public static void e(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416c655d", new Object[]{editText, str});
        } else if (editText == null) {
        } else {
            editText.setText(str);
        }
    }
}
