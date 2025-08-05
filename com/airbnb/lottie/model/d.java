package com.airbnb.lottie.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class d {
    public static final d COMPOSITION = new d("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f1770a;
    private e b;

    private d(d dVar) {
        this.f1770a = new ArrayList(dVar.f1770a);
        this.b = dVar.b;
    }

    public d(String... strArr) {
        this.f1770a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f1770a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean b(String str) {
        return "__container".equals(str);
    }

    public d a(e eVar) {
        d dVar = new d(this);
        dVar.b = eVar;
        return dVar;
    }

    public d a(String str) {
        d dVar = new d(this);
        dVar.f1770a.add(str);
        return dVar;
    }

    public e a() {
        return this.b;
    }

    public boolean a(String str, int i) {
        if (b(str)) {
            return true;
        }
        if (i >= this.f1770a.size()) {
            return false;
        }
        return this.f1770a.get(i).equals(str) || this.f1770a.get(i).equals("**") || this.f1770a.get(i).equals("*");
    }

    public int b(String str, int i) {
        if (b(str)) {
            return 0;
        }
        if (!this.f1770a.get(i).equals("**")) {
            return 1;
        }
        return (i != this.f1770a.size() - 1 && this.f1770a.get(i + 1).equals(str)) ? 2 : 0;
    }

    public boolean c(String str, int i) {
        if (i >= this.f1770a.size()) {
            return false;
        }
        boolean z = i == this.f1770a.size() - 1;
        String str2 = this.f1770a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f1770a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f1770a.get(i + 1).equals(str)) {
            return i == this.f1770a.size() + (-2) || (i == this.f1770a.size() + (-3) && b());
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 >= this.f1770a.size() - 1) {
                return this.f1770a.get(i2).equals(str);
            }
            return false;
        }
    }

    public boolean d(String str, int i) {
        return "__container".equals(str) || i < this.f1770a.size() - 1 || this.f1770a.get(i).equals("**");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (!this.f1770a.equals(dVar.f1770a)) {
                return false;
            }
            e eVar = this.b;
            if (eVar != null) {
                return eVar.equals(dVar.b);
            }
            if (dVar.b == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f1770a.hashCode() * 31;
        e eVar = this.b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f1770a);
        sb.append(",resolved=");
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }
}
