package com.taobao.tao.detail.biz.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class DetailSwitcherAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Switcher f19907a;

    /* loaded from: classes8.dex */
    public interface Switcher extends Serializable {
        String getConfig(String str, String str2);
    }

    static {
        kge.a(-558739197);
        tpc.a("com.taobao.tao.detail.biz.adapter.DetailSwitcherAdapter");
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        Switcher switcher = f19907a;
        return switcher == null ? str2 : switcher.getConfig(str, str2);
    }
}
