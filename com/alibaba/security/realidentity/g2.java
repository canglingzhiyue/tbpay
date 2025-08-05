package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class g2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3421a = a(n.g);
    public static final String b = "3.3.0";

    public static String a(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str != null && (indexOf = str.indexOf("-")) != -1) {
            String substring = str.substring(0, indexOf);
            if (!substring.isEmpty()) {
                return substring;
            }
        }
        return str;
    }
}
