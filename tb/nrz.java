package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nrz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f31707a;
    private String b;

    static {
        kge.a(-1351415425);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof nrz) {
                nrz nrzVar = (nrz) obj;
                if (!q.a((Object) this.f31707a, (Object) nrzVar.f31707a) || !q.a((Object) this.b, (Object) nrzVar.b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f31707a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ShopSearchHistoryEntity(id=" + this.f31707a + ", content=" + this.b + riy.BRACKET_END_STR;
    }

    public nrz(String id, String content) {
        q.c(id, "id");
        q.c(content, "content");
        this.f31707a = id;
        this.b = content;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f31707a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }
}
