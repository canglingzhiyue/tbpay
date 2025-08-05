package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.d;

/* loaded from: classes9.dex */
public class rol extends rod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String f;
    public final String g;

    public static /* synthetic */ Object ipc$super(rol rolVar, String str, Object... objArr) {
        if (str.hashCode() == 1814730534) {
            return new Boolean(super.equals(objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public rol(String str, int i, String str2, String str3) {
        super(str, i, null, 0, false);
        this.f = str2;
        this.g = str3;
    }

    @Override // tb.rod
    public rop a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rop) ipChange.ipc$dispatch("b29646c1", new Object[]{this, dVar}) : new roj(dVar, this);
    }

    @Override // tb.rod
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rol) || !super.equals(obj)) {
            return false;
        }
        rol rolVar = (rol) obj;
        String str = this.f;
        if (str == null ? rolVar.f != null : !str.equals(rolVar.f)) {
            return false;
        }
        String str2 = this.g;
        return str2 != null ? str2.equals(rolVar.g) : rolVar.g == null;
    }
}
