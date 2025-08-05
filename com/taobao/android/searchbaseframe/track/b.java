package com.taobao.android.searchbaseframe.track;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f15008a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        kge.a(284127620);
    }

    public static b a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1f99c805", new Object[]{str, str2, str3, str4});
        }
        b bVar = new b();
        bVar.f15008a = false;
        bVar.b = str;
        bVar.c = str2;
        bVar.d = str3;
        bVar.e = str4;
        return bVar;
    }

    public static b a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d39f1399", new Object[]{str, str2});
        }
        b bVar = new b();
        bVar.f15008a = true;
        bVar.b = str;
        bVar.c = str2;
        bVar.d = null;
        bVar.e = null;
        return bVar;
    }
}
