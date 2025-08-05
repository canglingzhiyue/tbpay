package com.taobao.android.purchase.core.address;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iff;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(230790769);
    }

    public static boolean a(iff iffVar, NewErrorDialogStructure newErrorDialogStructure) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae321b4f", new Object[]{iffVar, newErrorDialogStructure})).booleanValue();
        }
        if (iffVar == null || newErrorDialogStructure == null) {
            return false;
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.title)) {
            iffVar.a(newErrorDialogStructure.title);
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.subTitle)) {
            iffVar.b(newErrorDialogStructure.subTitle);
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.msg)) {
            iffVar.c(newErrorDialogStructure.msg);
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.image)) {
            iffVar.d(newErrorDialogStructure.image);
        }
        if (!TextUtils.isEmpty(newErrorDialogStructure.titleBgColor)) {
            iffVar.h(newErrorDialogStructure.titleBgColor);
        }
        if (newErrorDialogStructure.left != null) {
            if (!TextUtils.isEmpty(newErrorDialogStructure.left.text)) {
                iffVar.f(newErrorDialogStructure.left.text);
            }
            if (!TextUtils.isEmpty(newErrorDialogStructure.left.bgColor)) {
                iffVar.i(newErrorDialogStructure.left.bgColor);
            }
        }
        if (newErrorDialogStructure.right != null) {
            if (!TextUtils.isEmpty(newErrorDialogStructure.right.text)) {
                iffVar.g(newErrorDialogStructure.right.text);
            }
            if (!TextUtils.isEmpty(newErrorDialogStructure.right.bgColor)) {
                iffVar.j(newErrorDialogStructure.right.bgColor);
            }
        }
        return true;
    }
}
