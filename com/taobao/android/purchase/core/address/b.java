package com.taobao.android.purchase.core.address;

import mtopsdk.common.util.StringUtils;
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
        if (!StringUtils.isEmpty(newErrorDialogStructure.title)) {
            iffVar.a(newErrorDialogStructure.title);
        }
        if (!StringUtils.isEmpty(newErrorDialogStructure.subTitle)) {
            iffVar.b(newErrorDialogStructure.subTitle);
        }
        if (!StringUtils.isEmpty(newErrorDialogStructure.msg)) {
            iffVar.c(newErrorDialogStructure.msg);
        }
        if (!StringUtils.isEmpty(newErrorDialogStructure.image)) {
            iffVar.d(newErrorDialogStructure.image);
        }
        if (!StringUtils.isEmpty(newErrorDialogStructure.titleBgColor)) {
            iffVar.h(newErrorDialogStructure.titleBgColor);
        }
        if (newErrorDialogStructure.left != null) {
            if (!StringUtils.isEmpty(newErrorDialogStructure.left.text)) {
                iffVar.f(newErrorDialogStructure.left.text);
            }
            if (!StringUtils.isEmpty(newErrorDialogStructure.left.bgColor)) {
                iffVar.i(newErrorDialogStructure.left.bgColor);
            }
        }
        if (newErrorDialogStructure.right != null) {
            if (!StringUtils.isEmpty(newErrorDialogStructure.right.text)) {
                iffVar.g(newErrorDialogStructure.right.text);
            }
            if (!StringUtils.isEmpty(newErrorDialogStructure.right.bgColor)) {
                iffVar.j(newErrorDialogStructure.right.bgColor);
            }
        }
        return true;
    }
}
