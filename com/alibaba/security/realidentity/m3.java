package com.alibaba.security.realidentity;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class m3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String e = "libstreaming-encode-";
    public static final String f = "encodeName";
    public static final String g = "colorFormat";

    /* renamed from: a  reason: collision with root package name */
    public final Context f3470a;
    public final SharedPreferences b;
    public String c;
    public int d;

    public m3(Context context) {
        this.f3470a = context;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.b = defaultSharedPreferences;
        this.c = defaultSharedPreferences.getString("libstreaming-encode-encodeName", "");
        this.d = this.b.getInt("libstreaming-encode-colorFormat", -1);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        b(str);
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString("libstreaming-encode-encodeName", str);
        edit.apply();
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b(i);
        SharedPreferences.Editor edit = this.b.edit();
        edit.putInt("libstreaming-encode-colorFormat", i);
        edit.apply();
    }
}
