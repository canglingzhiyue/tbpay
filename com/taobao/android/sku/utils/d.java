package com.taobao.android.sku.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f15204a;
        public String b;

        static {
            kge.a(447530757);
        }

        public a(String str, String str2) {
            this.f15204a = str;
            this.b = str2;
        }
    }

    static {
        kge.a(1824655080);
    }

    public static a a(Context context, String str, String str2, Map<String, List<String>> map, Map<String, List<String>> map2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b703ae13", new Object[]{context, str, str2, map, map2}) : new a(str, str2);
    }

    public static a a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3539c9f6", new Object[]{context, str, str2, map}) : new a(str, str2);
    }
}
