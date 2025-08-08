package com.android.taobao.safeclean;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import mtopsdk.common.util.StringUtils;
import android.util.SparseBooleanArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f6400a;
    public SparseBooleanArray b;
    private String c;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final g f6401a;

        static {
            kge.a(1146507070);
            f6401a = new g();
        }

        public static /* synthetic */ g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a9a570bc", new Object[0]) : f6401a;
        }
    }

    static {
        kge.a(-1416668302);
    }

    private g() {
        this.f6400a = null;
        this.c = "";
        this.b = new SparseBooleanArray();
        this.f6400a = m.f6406a.getSharedPreferences(String.format("simple_clean_%s", f()), 0);
        String c = c();
        if (!StringUtils.isEmpty(c)) {
            for (String str : Arrays.asList(c.split(","))) {
                this.b.put(Integer.parseInt(str), true);
            }
        }
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("a9a570bc", new Object[0]) : a.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f6400a.edit().putString(str, "").apply();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.b.get(i)) {
        } else {
            this.b.put(i, true);
            this.f6400a.edit().putString("remote_clean_data_ids", g()).apply();
        }
    }

    private String g() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        SparseBooleanArray clone = this.b.clone();
        StringBuilder sb = new StringBuilder();
        while (i < clone.size()) {
            sb.append(clone.keyAt(i));
            i++;
            if (i < clone.size()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f6400a.edit().putString(str, str2).apply();
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f6400a.edit().putString("remote_clean_version", str).apply();
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f6400a.getString("remote_clean_version", "");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f6400a.getString("remote_clean_data_ids", "");
    }

    public SparseBooleanArray d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseBooleanArray) ipChange.ipc$dispatch("6b3951de", new Object[]{this}) : this.b;
    }

    public Boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("844098e9", new Object[]{this}) : Boolean.valueOf(this.f6400a.getBoolean("safe_clean_enabled", true));
    }

    public void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else {
            this.f6400a.edit().putBoolean("safe_clean_enabled", bool.booleanValue()).apply();
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : this.f6400a.getString(str, "");
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.c)) {
            return this.c;
        }
        try {
            this.c = m.f6406a.getPackageManager().getPackageInfo(m.f6406a.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return this.c;
    }
}
