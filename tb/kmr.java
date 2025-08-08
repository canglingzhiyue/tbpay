package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.net.URL;
import tb.knb;

/* loaded from: classes7.dex */
public class kmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30170a;
    public int b;
    public String c;
    public String d;
    public kmo e;
    public kmq f;
    public String g;
    public boolean h;
    public boolean i;
    public a j = new a();
    public knb.a k;

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.e.d)) {
            return this.e.d;
        }
        try {
            return new File(new URL(this.e.f30167a).getFile()).getName();
        } catch (Throwable unused) {
            return this.e.f30167a;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = 0;
        this.c = "";
        this.f30170a = false;
        if (!z) {
            return;
        }
        this.j = new a();
    }

    public kmr b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmr) ipChange.ipc$dispatch("16b8952d", new Object[]{this});
        }
        kmr kmrVar = new kmr();
        kmrVar.e = this.e;
        kmrVar.f = this.f;
        kmrVar.g = this.g;
        kmrVar.h = this.h;
        return kmrVar;
    }

    /* loaded from: classes7.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;
        private int c;

        public a() {
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (z) {
                this.b++;
            } else {
                this.c++;
            }
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : kmr.this.f.r > this.b + this.c;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmr)) {
            return false;
        }
        kmr kmrVar = (kmr) obj;
        kmo kmoVar = this.e;
        if (kmoVar == null ? kmrVar.e != null : !kmoVar.equals(kmrVar.e)) {
            return false;
        }
        String str = this.g;
        return str == null ? kmrVar.g == null : str.equals(kmrVar.g);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        kmo kmoVar = this.e;
        int hashCode = (kmoVar != null ? kmoVar.hashCode() : 0) * 31;
        String str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "@Task{success=" + this.f30170a + ", errorCode=" + this.b + ", errorMsg='" + this.c + "', item=" + this.e + ", storeDir='" + this.g + "'}";
    }
}
