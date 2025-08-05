package com.taobao.taolive.sdk.business;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1986481831);
    }

    public static Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[0]);
        }
        HashSet hashSet = new HashSet();
        hashSet.add("mtop.tblive.live.detail.query");
        hashSet.add("mtop.tblive.recommend.updown.lives");
        return hashSet;
    }
}
