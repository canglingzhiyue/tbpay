package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.dxng.kmp_api_exporter.j;
import com.taobao.dxng.kmp_api_exporter.k;
import com.taobao.dxng.kmp_api_exporter.l;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005J \u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ \u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\rJ\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\nJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/utils/orange/TaoLiveOrange;", "", "<init>", "()V", "getString", "", "group", "key", "defaultS", "getInt", "", "defValue", "getBool", "", "TBLIVE_ORANGE_GROUP", "defVal", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class tre {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tre INSTANCE;

    static {
        kge.a(-2043596619);
        INSTANCE = new tre();
    }

    private tre() {
    }

    public final String a(String group, String key, String defaultS) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, group, key, defaultS});
        }
        q.d(group, "group");
        q.d(key, "key");
        q.d(defaultS, "defaultS");
        j.a aVar = j.Companion;
        k kVar = new k();
        kVar.a(group);
        kVar.b(key);
        String a2 = l.a(aVar, kVar);
        if (a2.length() != 0) {
            z = false;
        }
        if (z) {
            a2 = defaultS;
        }
        return a2;
    }

    public final int a(String group, String key, int i) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4dba94fa", new Object[]{this, group, key, new Integer(i)})).intValue();
        }
        q.d(group, "group");
        q.d(key, "key");
        j.a aVar = j.Companion;
        k kVar = new k();
        kVar.a(group);
        kVar.b(key);
        String a2 = l.a(aVar, kVar);
        try {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(Integer.valueOf(Integer.parseInt(a2)));
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        if (Result.m2374exceptionOrNullimpl(m2371constructorimpl) != null) {
            m2371constructorimpl = Integer.valueOf(i);
        }
        return ((Number) m2371constructorimpl).intValue();
    }

    public final boolean a(String group, String key, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{this, group, key, new Boolean(z)})).booleanValue();
        }
        q.d(group, "group");
        q.d(key, "key");
        j.a aVar = j.Companion;
        k kVar = new k();
        kVar.a(group);
        kVar.b(key);
        String a2 = l.a(aVar, kVar);
        if (a2.length() == 0) {
            return z;
        }
        int hashCode = a2.hashCode();
        if (hashCode != 48) {
            if (hashCode != 49) {
                if (hashCode != 3569038) {
                    if (hashCode != 97196323 || a2.equals("false")) {
                        return false;
                    }
                } else if (a2.equals("true")) {
                    return true;
                }
            } else if (a2.equals("1")) {
                return true;
            }
        } else if (!a2.equals("0")) {
        }
        return false;
    }

    public static /* synthetic */ String a(tre treVar, String str, String str2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95bed846", new Object[]{treVar, str, str2, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return treVar.a(str, str2);
    }

    public final String a(String key, String defVal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, key, defVal});
        }
        q.d(key, "key");
        q.d(defVal, "defVal");
        return a("tblive", key, defVal);
    }

    public final int a(String key, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{this, key, new Integer(i)})).intValue();
        }
        q.d(key, "key");
        return a("tblive", key, i);
    }

    public final boolean a(String key, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, key, new Boolean(z)})).booleanValue();
        }
        q.d(key, "key");
        return a("tblive", key, z);
    }
}
