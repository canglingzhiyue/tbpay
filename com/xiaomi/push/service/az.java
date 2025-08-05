package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.ih;
import com.xiaomi.push.ii;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class az {

    /* renamed from: a  reason: collision with root package name */
    private static volatile az f24656a;

    /* renamed from: a  reason: collision with other field name */
    protected SharedPreferences f942a;

    /* renamed from: a  reason: collision with other field name */
    private HashSet<a> f943a = new HashSet<>();
    protected SharedPreferences b;

    /* loaded from: classes9.dex */
    public static abstract class a implements Runnable {
        private String mDescription;
        private int mId;

        public a(int i, String str) {
            this.mId = i;
            this.mDescription = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.mId == ((a) obj).mId;
        }

        public int hashCode() {
            return this.mId;
        }

        protected abstract void onCallback();

        @Override // java.lang.Runnable
        public final void run() {
            onCallback();
        }
    }

    private az(Context context) {
        this.f942a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    public static az a(Context context) {
        if (f24656a == null) {
            synchronized (az.class) {
                if (f24656a == null) {
                    f24656a = new az(context);
                }
            }
        }
        return f24656a;
    }

    private String a(int i) {
        return "oc_" + i;
    }

    private String a(ii iiVar) {
        return "oc_version_" + iiVar.a();
    }

    private void a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        if (pair.second instanceof Integer) {
            editor.putInt(str, ((Integer) pair.second).intValue());
        } else if (pair.second instanceof Long) {
            editor.putLong(str, ((Long) pair.second).longValue());
        } else if (!(pair.second instanceof String)) {
            if (!(pair.second instanceof Boolean)) {
                return;
            }
            editor.putBoolean(str, ((Boolean) pair.second).booleanValue());
        } else {
            String str2 = (String) pair.second;
            if (str.equals(a(ih.AppIsInstalledList.a()))) {
                editor.putString(str, com.xiaomi.push.bj.a(str2));
            } else {
                editor.putString(str, str2);
            }
        }
    }

    public int a(int i, int i2) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getInt(a2, 0) : this.f942a.contains(a2) ? this.f942a.getInt(a2, 0) : i2;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a(i + " oc int error " + e);
            return i2;
        }
    }

    public int a(ii iiVar, int i) {
        try {
            return this.f942a.getInt(a(iiVar), i);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a(iiVar + " version error " + e);
            return i;
        }
    }

    public long a(int i, long j) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getLong(a2, 0L) : this.f942a.contains(a2) ? this.f942a.getLong(a2, 0L) : j;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a(i + " oc long error " + e);
            return j;
        }
    }

    public String a(int i, String str) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getString(a2, null) : this.f942a.contains(a2) ? this.f942a.getString(a2, null) : str;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a(i + " oc string error " + e);
            return str;
        }
    }

    public synchronized void a() {
        this.f943a.clear();
    }

    public synchronized void a(a aVar) {
        if (!this.f943a.contains(aVar)) {
            this.f943a.add(aVar);
        }
    }

    public void a(List<Pair<Integer, Object>> list) {
        if (com.xiaomi.push.ac.a(list)) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        for (Pair<Integer, Object> pair : list) {
            if (pair.first != null) {
                String a2 = a(((Integer) pair.first).intValue());
                if (pair.second == null) {
                    edit.remove(a2);
                } else {
                    a(edit, pair, a2);
                }
            }
        }
        edit.apply();
    }

    public void a(List<Pair<ii, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (com.xiaomi.push.ac.a(list) || com.xiaomi.push.ac.a(list2)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor edit = this.f942a.edit();
        edit.clear();
        for (Pair<ii, Integer> pair : list) {
            if (pair.first != null && pair.second != null) {
                edit.putInt(a((ii) pair.first), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            if (pair2.first != null && pair2.second != null) {
                a(edit, pair2, a(((Integer) pair2.first).intValue()));
            }
        }
        edit.apply();
    }

    public boolean a(int i, boolean z) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getBoolean(a2, false) : this.f942a.contains(a2) ? this.f942a.getBoolean(a2, false) : z;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a(i + " oc boolean error " + e);
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        com.xiaomi.channel.commonutils.logger.b.c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f943a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }
}
