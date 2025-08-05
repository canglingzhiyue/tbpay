package com.taobao.android.searchbaseframe.util;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.imo;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f15015a = "search_framework";

    static {
        kge.a(-173315279);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f15015a = str;
        }
    }

    public SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[]{this}) : imo.c().getSharedPreferences(this.f15015a, 0);
    }
}
