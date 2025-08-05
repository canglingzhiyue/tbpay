package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14223a;

    static {
        kge.a(-1674264034);
        f14223a = l.class.getSimpleName();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            if (!a((CharSequence) str)) {
                return Boolean.parseBoolean(str);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static float c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea4", new Object[]{str})).floatValue();
        }
        try {
            if (!a((CharSequence) str)) {
                return Float.parseFloat(str);
            }
            return 0.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }
}
