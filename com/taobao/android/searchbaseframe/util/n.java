package com.taobao.android.searchbaseframe.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f15020a;

    /* loaded from: classes6.dex */
    public interface a {
        void a(Context context, String str);
    }

    static {
        kge.a(-1182078244);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            f15020a.a(context, str);
        }
    }
}
