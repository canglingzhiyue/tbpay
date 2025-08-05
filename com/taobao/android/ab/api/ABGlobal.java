package com.taobao.android.ab.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.djy;
import tb.dkf;
import tb.dkg;

/* loaded from: classes.dex */
public class ABGlobal {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final dkf f8617a = dkg.b();
    }

    public static boolean a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f3f1e42", new Object[]{context, str, str2, str3})).booleanValue() : isFeatureOpened(context, str3);
    }

    public static boolean isFeatureOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d63361a", new Object[]{context, str})).booleanValue();
        }
        Boolean a2 = a.f8617a.a(djy.a(context), str);
        return a2 != null && a2.booleanValue();
    }

    public static c a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("31668fde", new Object[]{context}) : a.f8617a.b(djy.a(context));
    }
}
