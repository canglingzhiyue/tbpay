package com.taobao.android.behavix.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f9212a;
    private SharedPreferences b;

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "behavix_local";
    }

    static {
        kge.a(8580812);
        f9212a = new a();
    }

    private SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{this, context});
        }
        if (this.b == null) {
            this.b = context.getSharedPreferences(b(), 0);
        }
        return this.b;
    }

    public static a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("82de78b1", new Object[0]) : f9212a;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        SharedPreferences.Editor edit = a(com.taobao.android.behavix.d.b()).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2}) : a(com.taobao.android.behavix.d.b()).getString(str, str2);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : b(str, "");
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = a(com.taobao.android.behavix.d.b()).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    public long b(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d253fa5", new Object[]{this, str, new Long(j)})).longValue() : a(com.taobao.android.behavix.d.b()).getLong(str, j);
    }
}
