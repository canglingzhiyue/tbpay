package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.d;

/* loaded from: classes9.dex */
public class rok extends rod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean f;
    public final String g;

    public static /* synthetic */ Object ipc$super(rok rokVar, String str, Object... objArr) {
        if (str.hashCode() == 1814730534) {
            return new Boolean(super.equals(objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public rok(String str, int i, boolean z, boolean z2, String str2) {
        super(str, i, null, 0, z);
        this.f = z2;
        this.g = TextUtils.isEmpty(str2) ? "tcp" : str2;
    }

    @Override // tb.rod
    public rop a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rop) ipChange.ipc$dispatch("b29646c1", new Object[]{this, dVar});
        }
        if (this.e) {
            return new roh(dVar, this);
        }
        return new roh(dVar, this);
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
        if (!(obj instanceof rok) || !super.equals(obj)) {
            return false;
        }
        rok rokVar = (rok) obj;
        return this.f == rokVar.f && this.g.equalsIgnoreCase(rokVar.g);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "xquic".equalsIgnoreCase(this.g);
    }
}
