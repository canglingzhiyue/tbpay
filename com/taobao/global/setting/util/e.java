package com.taobao.global.setting.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile e b;

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f17219a;

    public static e a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d78ca2d5", new Object[]{context});
        }
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null!");
        }
        if (b == null) {
            synchronized (e.class) {
                if (b != null) {
                    return b;
                }
                b = new e();
                b.f17219a = g.a(context.getApplicationContext(), context.getPackageName() + "_mytaobao_preferences");
            }
        }
        return b;
    }

    public SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[]{this}) : this.f17219a;
    }

    public boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f17219a;
        if (sharedPreferences == null) {
            return false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, z);
        return edit.commit();
    }

    public boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f17219a;
        return sharedPreferences != null ? sharedPreferences.getBoolean(str, z) : z;
    }

    public int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, str, new Integer(i)})).intValue();
        }
        SharedPreferences sharedPreferences = this.f17219a;
        return sharedPreferences != null ? sharedPreferences.getInt(str, i) : i;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.f17219a;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains(str);
    }
}
