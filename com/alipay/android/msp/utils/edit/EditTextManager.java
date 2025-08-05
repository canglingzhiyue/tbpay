package com.alipay.android.msp.utils.edit;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class EditTextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static EditTextUtil mEditTextUtils;

    public static String getEditTextContent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5eeb2bb0", new Object[]{new Integer(i)});
        }
        EditTextUtil editTextUtil = mEditTextUtils;
        return editTextUtil != null ? editTextUtil.getText(i) : "";
    }

    public static EditTextUtil getEditTextUtils() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditTextUtil) ipChange.ipc$dispatch("d5198936", new Object[0]);
        }
        if (mEditTextUtils == null) {
            mEditTextUtils = new EditTextUtil();
        }
        return mEditTextUtils;
    }
}
