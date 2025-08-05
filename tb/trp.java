package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/taobao/themis/utils/version/Version;", "", "major", "", "minor", "patch", CartRecommendRefreshScene.build, "(IIII)V", "getBuild", "()I", "getMajor", "getMinor", "getPatch", "compareTo", "other", "component1", "component2", "component3", "component4", "copy", eau.PARSER_TAG, "", "", "hashCode", "toString", "", "Companion", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class trp implements Comparable<trp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final int f34295a;
    private final int b;
    private final int c;
    private final int d;

    static {
        kge.a(-875771955);
        kge.a(415966670);
        Companion = new a(null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof trp) {
                trp trpVar = (trp) obj;
                if (this.f34295a != trpVar.f34295a || this.b != trpVar.b || this.c != trpVar.c || this.d != trpVar.d) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (((((this.f34295a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Version(major=" + this.f34295a + ", minor=" + this.b + ", patch=" + this.c + ", build=" + this.d + riy.BRACKET_END_STR;
    }

    public trp(int i, int i2, int i3, int i4) {
        this.f34295a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(trp trpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, trpVar})).intValue() : a(trpVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/utils/version/Version$Companion;", "", "()V", "fromString", "Lcom/taobao/themis/utils/version/Version;", "versionString", "", "themis_utils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-59566379);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final trp a(String versionString) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (trp) ipChange.ipc$dispatch("7c75c2a2", new Object[]{this, versionString});
            }
            q.d(versionString, "versionString");
            List<String> b = n.b((CharSequence) versionString, new String[]{"."}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(p.a((Iterable) b, 10));
            for (String str : b) {
                Integer d = n.d(str);
                arrayList.add(Integer.valueOf(d != null ? d.intValue() : 0));
            }
            ArrayList arrayList2 = arrayList;
            Integer num = (Integer) p.a((List<? extends Object>) arrayList2, 0);
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) p.a((List<? extends Object>) arrayList2, 1);
            int intValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = (Integer) p.a((List<? extends Object>) arrayList2, 2);
            int intValue3 = num3 != null ? num3.intValue() : 0;
            Integer num4 = (Integer) p.a((List<? extends Object>) arrayList2, 3);
            if (num4 != null) {
                i = num4.intValue();
            }
            return new trp(intValue, intValue2, intValue3, i);
        }
    }

    public int a(trp other) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10177d9", new Object[]{this, other})).intValue();
        }
        q.d(other, "other");
        int i = this.f34295a;
        int i2 = other.f34295a;
        if (i != i2) {
            return i - i2;
        }
        int i3 = this.b;
        int i4 = other.b;
        if (i3 != i4) {
            return i3 - i4;
        }
        int i5 = this.c;
        int i6 = other.c;
        return i5 != i6 ? i5 - i6 : this.d - other.d;
    }
}
