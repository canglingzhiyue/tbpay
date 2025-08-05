package com.taobao.share.picturepassword;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f19637a;
    private Context b;
    private SharedPreferences c;
    private SharedPreferences.Editor d;

    static {
        kge.a(697123198);
    }

    private a(Context context) {
        this.b = context;
        this.c = this.b.getSharedPreferences("clip_share_album_sp", 0);
        this.d = this.c.edit();
    }

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2744a57d", new Object[]{context});
        }
        if (f19637a == null) {
            f19637a = new a(context);
        }
        return f19637a;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        this.d.putString(str, str2);
        this.d.apply();
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2}) : this.c.getString(str, str2);
    }
}
