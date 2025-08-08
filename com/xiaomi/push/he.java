package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import mtopsdk.common.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public class he implements hi {

    /* renamed from: a  reason: collision with root package name */
    private String f24518a;

    /* renamed from: a  reason: collision with other field name */
    private List<he> f461a;

    /* renamed from: a  reason: collision with other field name */
    private String[] f462a;
    private String b;

    /* renamed from: b  reason: collision with other field name */
    private String[] f463b;
    private String c;

    public he(String str, String str2, String[] strArr, String[] strArr2) {
        this.f462a = null;
        this.f463b = null;
        this.f461a = null;
        this.f24518a = str;
        this.b = str2;
        this.f462a = strArr;
        this.f463b = strArr2;
    }

    public he(String str, String str2, String[] strArr, String[] strArr2, String str3, List<he> list) {
        this.f462a = null;
        this.f463b = null;
        this.f461a = null;
        this.f24518a = str;
        this.b = str2;
        this.f462a = strArr;
        this.f463b = strArr2;
        this.c = str3;
        this.f461a = list;
    }

    public static he a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new he(string, string2, strArr, strArr2, string3, arrayList);
    }

    public static Parcelable[] a(List<he> list) {
        return a((he[]) list.toArray(new he[list.size()]));
    }

    public static Parcelable[] a(he[] heVarArr) {
        if (heVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[heVarArr.length];
        for (int i = 0; i < heVarArr.length; i++) {
            parcelableArr[i] = heVarArr[i].m2001a();
        }
        return parcelableArr;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f24518a);
        bundle.putString("ext_ns", this.b);
        bundle.putString("ext_text", this.c);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.f462a;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f462a;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.f463b[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<he> list = this.f461a;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", a(this.f461a));
        }
        return bundle;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Parcelable m2001a() {
        return a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2002a() {
        return this.f24518a;
    }

    public String a(String str) {
        if (str != null) {
            if (this.f462a == null) {
                return null;
            }
            int i = 0;
            while (true) {
                String[] strArr = this.f462a;
                if (i >= strArr.length) {
                    return null;
                }
                if (str.equals(strArr[i])) {
                    return this.f463b[i];
                }
                i++;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void a(he heVar) {
        if (this.f461a == null) {
            this.f461a = new ArrayList();
        }
        if (!this.f461a.contains(heVar)) {
            this.f461a.add(heVar);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2003a(String str) {
        if (!StringUtils.isEmpty(str)) {
            this.c = hs.a(str);
        } else {
            this.c = str;
        }
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return !StringUtils.isEmpty(this.c) ? hs.b(this.c) : this.c;
    }

    @Override // com.xiaomi.push.hi
    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.f24518a);
        if (!StringUtils.isEmpty(this.b)) {
            sb.append(" ");
            sb.append("xmlns=");
            sb.append("\"");
            sb.append(this.b);
            sb.append("\"");
        }
        String[] strArr = this.f462a;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.f462a.length; i++) {
                if (!StringUtils.isEmpty(this.f463b[i])) {
                    sb.append(" ");
                    sb.append(this.f462a[i]);
                    sb.append("=\"");
                    sb.append(hs.a(this.f463b[i]));
                    sb.append("\"");
                }
            }
        }
        if (!StringUtils.isEmpty(this.c)) {
            sb.append(">");
            sb.append(this.c);
        } else {
            List<he> list = this.f461a;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
                return sb.toString();
            }
            sb.append(">");
            for (he heVar : this.f461a) {
                sb.append(heVar.d());
            }
        }
        sb.append("</");
        sb.append(this.f24518a);
        sb.append(">");
        return sb.toString();
    }

    public String toString() {
        return d();
    }
}
