package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Object> f24949a;

    public v(int i) {
        this.f24949a = new ArrayList<>(i);
    }

    public int a() {
        return this.f24949a.size();
    }

    public void a(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length <= 0) {
                return;
            }
            ArrayList<Object> arrayList = this.f24949a;
            arrayList.ensureCapacity(arrayList.size() + objArr.length);
            Collections.addAll(this.f24949a, objArr);
        } else if (obj instanceof Collection) {
            this.f24949a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f24949a.add(obj2);
            }
        } else if (!(obj instanceof Iterator)) {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        } else {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f24949a.add(it.next());
            }
        }
    }

    public Object[] a(Object[] objArr) {
        return this.f24949a.toArray(objArr);
    }

    public void b(Object obj) {
        this.f24949a.add(obj);
    }
}
