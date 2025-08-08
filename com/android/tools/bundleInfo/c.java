package com.android.tools.bundleInfo;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.cjd;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6423a;
    private SharedPreferences b;
    private SharedPreferences c;
    private boolean d;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f6424a = new c();

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ff9f21d7", new Object[0]) : f6424a;
        }
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ff9f21d7", new Object[0]) : a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        d.a().a(context);
        this.f6423a = context;
        if (this.d) {
            return;
        }
        try {
            String str = this.f6423a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            this.b = this.f6423a.getSharedPreferences("dynamicdeploy_features", 0);
            Context context2 = this.f6423a;
            this.c = context2.getSharedPreferences("dynamicdeploy_features_bak-" + str, 0);
            if (!StringUtils.isEmpty(cjd.a()) && context.getPackageName().equals(cjd.a())) {
                c(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = true;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        for (Map.Entry<String, ?> entry : this.c.getAll().entrySet()) {
            SharedPreferences.Editor edit = this.b.edit();
            edit.putString("deploy_feature_version_" + str + "_" + entry.getKey(), (String) entry.getValue()).commit();
        }
        this.c.edit().clear().commit();
    }

    public void a(String str, String str2, boolean z, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89efee7", new Object[]{this, str, str2, new Boolean(z), set});
            return;
        }
        c();
        SharedPreferences.Editor edit = this.b.edit();
        SharedPreferences.Editor putStringSet = edit.putStringSet("deploy_features_" + str, set);
        SharedPreferences.Editor putString = putStringSet.putString("deploy_version_" + str, str2);
        putString.putBoolean("deploy_beta_" + str, z).commit();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c();
        this.b.edit().clear().commit();
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.c.edit().putString(str, str2).commit();
        }
    }

    public boolean a(Application application) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c56f7b", new Object[]{this, application})).booleanValue();
        }
        try {
            str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            str = "1.0.0";
        }
        SharedPreferences sharedPreferences = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append("deploy_version_");
        sb.append(str);
        return !sharedPreferences.contains(sb.toString()) && d.a().b().size() > 0;
    }

    public Set<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bf40e8a1", new Object[]{this, str});
        }
        c();
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getStringSet("deploy_features_" + str, new HashSet());
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        c();
        SharedPreferences sharedPreferences = this.b;
        return sharedPreferences.getString("deploy_version_" + str, "");
    }

    private void c() throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.d) {
            throw new IllegalArgumentException("DynamicFeatureManager is not inited");
        }
    }
}
