package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public abstract class hh {

    /* renamed from: a  reason: collision with other field name */
    public static final DateFormat f467a;
    private static long b;
    private static String c;

    /* renamed from: a  reason: collision with other field name */
    public long f469a;

    /* renamed from: a  reason: collision with other field name */
    private hl f470a;

    /* renamed from: a  reason: collision with other field name */
    private List<he> f471a;

    /* renamed from: a  reason: collision with other field name */
    private final Map<String, Object> f472a;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    /* renamed from: a  reason: collision with root package name */
    protected static final String f24522a = Locale.getDefault().getLanguage().toLowerCase();

    /* renamed from: b  reason: collision with other field name */
    private static String f468b = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f467a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC));
        c = hs.a(5) + "-";
        b = 0L;
    }

    public hh() {
        this.d = f468b;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f471a = new CopyOnWriteArrayList();
        this.f472a = new HashMap();
        this.f470a = null;
    }

    public hh(Bundle bundle) {
        this.d = f468b;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.f471a = new CopyOnWriteArrayList();
        this.f472a = new HashMap();
        this.f470a = null;
        this.f = bundle.getString("ext_to");
        this.g = bundle.getString("ext_from");
        this.h = bundle.getString("ext_chid");
        this.e = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f471a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                he a2 = he.a((Bundle) parcelable);
                if (a2 != null) {
                    this.f471a.add(a2);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.f470a = new hl(bundle2);
        }
    }

    public static synchronized String i() {
        String sb;
        synchronized (hh.class) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c);
            long j = b;
            b = 1 + j;
            sb2.append(Long.toString(j));
            sb = sb2.toString();
        }
        return sb;
    }

    public static String q() {
        return f24522a;
    }

    /* renamed from: a */
    public Bundle mo2009a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.d)) {
            bundle.putString("ext_ns", this.d);
        }
        if (!TextUtils.isEmpty(this.g)) {
            bundle.putString("ext_from", this.g);
        }
        if (!TextUtils.isEmpty(this.f)) {
            bundle.putString("ext_to", this.f);
        }
        if (!TextUtils.isEmpty(this.e)) {
            bundle.putString("ext_pkt_id", this.e);
        }
        if (!TextUtils.isEmpty(this.h)) {
            bundle.putString("ext_chid", this.h);
        }
        hl hlVar = this.f470a;
        if (hlVar != null) {
            bundle.putBundle("ext_ERROR", hlVar.a());
        }
        List<he> list = this.f471a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            for (he heVar : this.f471a) {
                Bundle a2 = heVar.a();
                if (a2 != null) {
                    bundleArr[i] = a2;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public he a(String str) {
        return a(str, null);
    }

    public he a(String str, String str2) {
        for (he heVar : this.f471a) {
            if (str2 == null || str2.equals(heVar.b())) {
                if (str.equals(heVar.m2002a())) {
                    return heVar;
                }
            }
        }
        return null;
    }

    public hl a() {
        return this.f470a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized Object m2006a(String str) {
        if (this.f472a == null) {
            return null;
        }
        return this.f472a.get(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public abstract String m2007a();

    /* renamed from: a  reason: collision with other method in class */
    public synchronized Collection<he> m2008a() {
        if (this.f471a == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.f471a));
    }

    public void a(he heVar) {
        this.f471a.add(heVar);
    }

    public void a(hl hlVar) {
        this.f470a = hlVar;
    }

    public synchronized Collection<String> b() {
        if (this.f472a == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.f472a.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            hh hhVar = (hh) obj;
            hl hlVar = this.f470a;
            if (hlVar == null ? hhVar.f470a != null : !hlVar.equals(hhVar.f470a)) {
                return false;
            }
            String str = this.g;
            if (str == null ? hhVar.g != null : !str.equals(hhVar.g)) {
                return false;
            }
            if (!this.f471a.equals(hhVar.f471a)) {
                return false;
            }
            String str2 = this.e;
            if (str2 == null ? hhVar.e != null : !str2.equals(hhVar.e)) {
                return false;
            }
            String str3 = this.h;
            if (str3 == null ? hhVar.h != null : !str3.equals(hhVar.h)) {
                return false;
            }
            Map<String, Object> map = this.f472a;
            if (map == null ? hhVar.f472a != null : !map.equals(hhVar.f472a)) {
                return false;
            }
            String str4 = this.f;
            if (str4 == null ? hhVar.f != null : !str4.equals(hhVar.f)) {
                return false;
            }
            String str5 = this.d;
            if (str5 == null ? hhVar.d == null : str5.equals(hhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        int hashCode5 = (((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f471a.hashCode()) * 31) + this.f472a.hashCode()) * 31;
        hl hlVar = this.f470a;
        if (hlVar != null) {
            i = hlVar.hashCode();
        }
        return hashCode5 + i;
    }

    public String j() {
        if ("ID_NOT_AVAILABLE".equals(this.e)) {
            return null;
        }
        if (this.e == null) {
            this.e = i();
        }
        return this.e;
    }

    public String k() {
        return this.h;
    }

    public void k(String str) {
        this.e = str;
    }

    public String l() {
        return this.f;
    }

    public void l(String str) {
        this.h = str;
    }

    public String m() {
        return this.g;
    }

    public void m(String str) {
        this.f = str;
    }

    public String n() {
        return this.i;
    }

    public void n(String str) {
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(8:36|37|38|40|41|(4:42|43|45|46)|47|48) */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.lang.String o() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hh.o():java.lang.String");
    }

    public void o(String str) {
        this.i = str;
    }

    public String p() {
        return this.d;
    }
}
