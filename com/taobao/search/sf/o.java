package com.taobao.search.sf;

import com.android.alibaba.ip.runtime.IpChange;
import tb.imn;
import tb.jyx;
import tb.kge;

/* loaded from: classes8.dex */
public class o extends jyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_TBSEARCH = "tbMainSearch";

    /* renamed from: a  reason: collision with root package name */
    private static volatile o f19471a;

    public static String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : BIZ_TBSEARCH;
    }

    static {
        kge.a(347247650);
        f19471a = null;
    }

    public static o a(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("43786e30", new Object[]{imnVar});
        }
        if (f19471a == null) {
            synchronized (o.class) {
                if (f19471a == null) {
                    f19471a = new o(BIZ_TBSEARCH, imnVar);
                }
            }
        }
        return f19471a;
    }

    private o(String str, imn imnVar) {
        super(str, imnVar);
    }

    @Override // tb.jyx
    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : i();
    }
}
