package com.taobao.android.launch.turbo.profile;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class k implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f13019a;

    static {
        kge.a(-412742536);
        kge.a(1107759672);
    }

    public k(Context context) {
        this.f13019a = context.getSharedPreferences("turbo-boot-profile", 0);
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f13019a.getString("version", null);
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f13019a.getInt("code", -1);
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else {
            this.f13019a.edit().putString("version", str).putInt("code", i).commit();
        }
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f13019a.edit().putInt("profile_length", i).commit();
        }
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.f13019a.edit().putLong("odex_origin_size", j).commit();
        }
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            this.f13019a.edit().putLong("odex_latest_size", j).commit();
        }
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f13019a.edit().putInt("phase", i).commit();
        }
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f13019a.getInt("phase", 0);
    }

    @Override // com.taobao.android.launch.turbo.profile.j
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f13019a.edit().clear().commit();
        }
    }
}
