package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public final class tni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34229a;
    private final String b;
    private final String c;

    static {
        kge.a(-1934159218);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof tni) {
                tni tniVar = (tni) obj;
                if (!q.a((Object) this.f34229a, (Object) tniVar.f34229a) || !q.a((Object) this.b, (Object) tniVar.b) || !q.a((Object) this.c, (Object) tniVar.c)) {
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
        String str = this.f34229a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PresetBaseInfo(name=" + this.f34229a + ", appId=" + this.b + ", navigationUrl=" + this.c + riy.BRACKET_END_STR;
    }

    public tni(String name, String appId, String navigationUrl) {
        q.d(name, "name");
        q.d(appId, "appId");
        q.d(navigationUrl, "navigationUrl");
        this.f34229a = name;
        this.b = appId;
        this.c = navigationUrl;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f34229a;
    }
}
