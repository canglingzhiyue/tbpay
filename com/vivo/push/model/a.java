package com.vivo.push.model;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private String f24211a;
    private String b;

    public a(String str, String str2) {
        this.f24211a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f24211a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f24211a;
        if (str == null) {
            if (aVar.f24211a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f24211a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f24211a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "ConfigItem{mKey='" + this.f24211a + "', mValue='" + this.b + "'}";
    }
}
