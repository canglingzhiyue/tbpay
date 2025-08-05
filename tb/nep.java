package tb;

import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.j;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class nep implements nej {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31403a;
    private final d b;
    private j c;
    private w d;

    static {
        kge.a(2010612622);
        kge.a(-610313981);
        f31403a = nep.class.getSimpleName();
    }

    public nep(d dVar, j jVar, w wVar) {
        this.b = dVar;
        this.c = jVar;
        this.d = wVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // tb.nej
    public boolean a(ArrayList<Object> arrayList) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfaf7e46", new Object[]{this, arrayList})).booleanValue();
        }
        d dVar = this.b;
        if (dVar != null && !dVar.c()) {
            w[] a2 = ner.a(arrayList);
            try {
                try {
                    if (this.c != null) {
                        this.c.a(this.b, this.d, a2);
                    }
                    if (a2 != null) {
                        int length = a2.length;
                        while (i < length) {
                            a2[i].a();
                            i++;
                        }
                    }
                    j jVar = this.c;
                    if (jVar != null) {
                        jVar.a();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        int length2 = a2.length;
                        while (i < length2) {
                            a2[i].a();
                            i++;
                        }
                    }
                    j jVar2 = this.c;
                    if (jVar2 != null) {
                        jVar2.a();
                    }
                    throw th;
                }
            } catch (Throwable unused) {
                ngr.b(f31403a, "js function call failed");
                if (a2 != null) {
                    for (w wVar : a2) {
                        wVar.a();
                    }
                }
                j jVar3 = this.c;
                if (jVar3 != null) {
                    jVar3.a();
                }
                return false;
            }
        }
        return true;
    }

    @Override // tb.nej
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        j jVar = this.c;
        if (jVar != null) {
            jVar.a();
            this.c = null;
        }
        this.d = null;
    }
}
