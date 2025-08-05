package com.taobao.android.sku.utils;

import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_HINT_COLOR = -16777216;
    public static final int INPUT_TYPE_NORMAL = 0;
    public static final int INPUT_TYPE_NUMBER = 1;
    public static final int INPUT_TYPE_PASSWORD = 3;
    public static final int INPUT_TYPE_PHONE = 2;

    static {
        kge.a(373088084);
    }

    public static void a(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c6920c", new Object[]{editText, new Integer(i)});
        } else if (editText == null) {
        } else {
            if (i == 0) {
                editText.setInputType(1);
            } else if (i == 1) {
                editText.setInputType(2);
            } else if (i == 2) {
                editText.setInputType(3);
            } else if (i == 3) {
                editText.setInputType(128);
            } else {
                editText.setInputType(1);
            }
        }
    }

    public static void b(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5af5a4d", new Object[]{editText, new Integer(i)});
        } else if (editText == null) {
        } else {
            if (i <= 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Integer.MAX_VALUE)});
            } else {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            }
        }
    }

    public static void a(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a41dde1", new Object[]{editText, str});
        } else if (editText == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            editText.setHint(str);
        }
    }

    public static void c(EditText editText, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca98228e", new Object[]{editText, new Integer(i)});
        } else if (editText == null) {
        } else {
            editText.setHintTextColor(i);
        }
    }

    public static void b(EditText editText, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c7fc0", new Object[]{editText, str});
        } else if (editText == null) {
        } else {
            editText.setText(str);
        }
    }
}
