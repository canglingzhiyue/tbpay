package com.android.tools.bundleInfo;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.cjd;

/* loaded from: classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f6425a;
    private Context b;
    private SharedPreferences c;
    private SharedPreferences d;
    private boolean e;

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final d f6426a = new d();

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ff9f21f6", new Object[0]) : f6426a;
        }
    }

    private d() {
        this.f6425a = null;
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ff9f21f6", new Object[0]) : a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.e) {
        } else {
            this.b = context;
            try {
                this.f6425a = this.b.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                Context context2 = this.b;
                this.c = context2.getSharedPreferences("dynamicdeploy_features_" + this.f6425a, 0);
                Context context3 = this.b;
                this.d = context3.getSharedPreferences("dynamicdeploy_features_bak-" + this.f6425a, 0);
                if (!StringUtils.isEmpty(cjd.a()) && context.getPackageName().equals(cjd.a())) {
                    e(this.f6425a);
                }
                this.e = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        for (Map.Entry<String, ?> entry : this.d.getAll().entrySet()) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putString("deploy_feature_version_" + str + "_" + entry.getKey(), (String) entry.getValue()).commit();
        }
        this.d.edit().clear().commit();
    }

    public synchronized void a(String str, String str2, boolean z, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89efee7", new Object[]{this, str, str2, new Boolean(z), set});
            return;
        }
        d();
        if (!str.equals(this.f6425a)) {
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        hashSet.addAll(this.c.getStringSet("deploy_features", new HashSet()));
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(this.c.getStringSet("deploy_versions", new HashSet()));
        hashSet2.add(str2);
        SharedPreferences.Editor edit = this.c.edit();
        for (String str3 : set) {
            if (this.c.contains(str3)) {
                String string = this.c.getString(str3, "");
                b(string);
                hashSet2.remove(string);
            }
            edit.putString(str3, str2);
        }
        SharedPreferences.Editor putStringSet = edit.putBoolean("deployed_" + str2, true).putStringSet("deploy_features", hashSet).putStringSet("deploy_versions", hashSet2);
        SharedPreferences.Editor putStringSet2 = putStringSet.putStringSet("features_" + str2, set);
        putStringSet2.putBoolean("bata_" + str2, z).commit();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        d();
        String string = this.c.getString(str, "");
        return (StringUtils.isEmpty(string) || !this.c.getStringSet("deploy_versions", new HashSet()).contains(string)) ? "" : string;
    }

    public Set<String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("21880a26", new Object[]{this, str});
        }
        d();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences.contains("deployed_" + str) && d(str)) {
            SharedPreferences sharedPreferences2 = this.c;
            return sharedPreferences2.getStringSet("features_" + str, new HashSet());
        }
        return new HashSet();
    }

    public synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        d();
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences.contains("deployed_" + str)) {
            SharedPreferences.Editor edit = this.c.edit();
            SharedPreferences sharedPreferences2 = this.c;
            Set<String> stringSet = sharedPreferences2.getStringSet("features_" + str, new HashSet());
            Set<String> stringSet2 = this.c.getStringSet("deploy_features", new HashSet());
            for (String str2 : stringSet) {
                edit.remove(str2);
            }
            stringSet2.removeAll(stringSet);
            SharedPreferences.Editor putStringSet = edit.putBoolean("deployed_" + str, false).putStringSet("deploy_features", stringSet2);
            SharedPreferences.Editor remove = putStringSet.remove("features_" + str);
            remove.putBoolean("bata_" + str, false).commit();
        }
    }

    public Set<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this});
        }
        d();
        return this.c.getStringSet("deploy_versions", new HashSet());
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        d();
        return c().contains(str);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        d();
        SharedPreferences.Editor edit = this.d.edit();
        edit.putString(str + "_version", str2).commit();
    }

    public Set<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3b6c35d9", new Object[]{this});
        }
        d();
        return this.c.getStringSet("deploy_features", new HashSet());
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        d();
        SharedPreferences sharedPreferences = this.c;
        return sharedPreferences.getBoolean("deployed_" + str, false);
    }

    private void d() throws IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.e) {
            throw new IllegalArgumentException("DynamicFeatureManager2 is not inited");
        }
    }
}
