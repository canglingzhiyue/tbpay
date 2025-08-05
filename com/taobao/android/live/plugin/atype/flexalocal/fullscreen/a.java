package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f13744a;
    private static Boolean b;

    static {
        kge.a(1176328610);
        f13744a = null;
        b = null;
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (f13744a == null) {
            f13744a = Boolean.valueOf(Boolean.parseBoolean(pmd.a().d().a("tblive", "enableGoodsListAsync", "true")));
        }
        return f13744a.booleanValue();
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(Boolean.parseBoolean(pmd.a().d().a("tblive", "enablePKLinkAsync", "true")));
        }
        return b.booleanValue();
    }
}
