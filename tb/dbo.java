package tb;

import java.util.Objects;

/* loaded from: classes4.dex */
public class dbo {

    /* renamed from: a  reason: collision with root package name */
    public String f26664a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-1833965427);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dbo.class == obj.getClass()) {
            dbo dboVar = (dbo) obj;
            if (Objects.equals(this.f26664a, dboVar.f26664a) && Objects.equals(this.b, dboVar.b) && Objects.equals(this.c, dboVar.c) && Objects.equals(this.d, dboVar.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f26664a, this.b, this.c, this.d);
    }

    public String toString() {
        return "TargetInfo{name='" + this.f26664a + "', packageName='" + this.b + "', authorities='" + this.c + "', action='" + this.d + "'}";
    }
}
