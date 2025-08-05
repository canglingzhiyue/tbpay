package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.d;

/* loaded from: classes9.dex */
public abstract class rod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f33257a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;

    public abstract rop a(d dVar);

    public rod(String str, int i, String str2, int i2, boolean z) {
        this.f33257a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = z;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rod)) {
            return false;
        }
        rod rodVar = (rod) obj;
        if (this.b != rodVar.b || this.d != rodVar.d || this.e != rodVar.e) {
            return false;
        }
        String str = this.f33257a;
        if (str == null ? rodVar.f33257a != null : !str.equals(rodVar.f33257a)) {
            return false;
        }
        String str2 = this.c;
        return str2 == null ? rodVar.c == null : str2.equals(rodVar.c);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConnectionTarget{address='" + this.f33257a + "', port=" + this.b + ", proxyIp='" + this.c + "', proxyPort=" + this.d + ", isLongLived=" + this.e + '}';
    }
}
