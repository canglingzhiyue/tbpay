package com.squareup.wire;

import com.squareup.wire.ExtendableMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class d<T extends ExtendableMessage<?>> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f8128a;
    private int b;

    public <E> d(c<T, E> cVar, E e) {
        this.f8128a = new Object[2];
        Object[] objArr = this.f8128a;
        objArr[0] = cVar;
        objArr[1] = e;
        this.b = 1;
    }

    public d(d<T> dVar) {
        this.f8128a = (Object[]) dVar.f8128a.clone();
        this.b = dVar.b;
    }

    private <E> void a(c<T, E> cVar, E e, int i) {
        Object[] objArr = this.f8128a;
        if (objArr.length < (this.b + 1) * 2) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        int i2 = this.b;
        if (i < i2) {
            System.arraycopy(this.f8128a, i2 + i, objArr, i2 + i + 2, i2 - i);
            System.arraycopy(this.f8128a, i, objArr, i + 1, this.b);
        } else {
            System.arraycopy(this.f8128a, i2, objArr, i2 + 1, i2);
        }
        this.b++;
        this.f8128a = objArr;
        Object[] objArr3 = this.f8128a;
        objArr3[i] = cVar;
        objArr3[this.b + i] = e;
    }

    public int a() {
        return this.b;
    }

    public c<T, ?> a(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException("" + i);
        }
        return (c) this.f8128a[i];
    }

    public <E> E a(c<T, E> cVar) {
        int binarySearch = Arrays.binarySearch(this.f8128a, 0, this.b, cVar);
        if (binarySearch < 0) {
            return null;
        }
        return (E) this.f8128a[this.b + binarySearch];
    }

    public <E> void a(c<T, E> cVar, E e) {
        int binarySearch = Arrays.binarySearch(this.f8128a, 0, this.b, cVar);
        if (binarySearch >= 0) {
            this.f8128a[this.b + binarySearch] = e;
        } else {
            a(cVar, e, -(binarySearch + 1));
        }
    }

    public Object b(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            throw new IndexOutOfBoundsException("" + i);
        }
        return this.f8128a[i2 + i];
    }

    public List<c<T, ?>> b() {
        ArrayList arrayList = new ArrayList(this.b);
        for (int i = 0; i < this.b; i++) {
            arrayList.add((c) this.f8128a[i]);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b != dVar.b) {
            return false;
        }
        for (int i = 0; i < this.b * 2; i++) {
            if (!this.f8128a[i].equals(dVar.f8128a[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.b * 2; i2++) {
            i = (i * 37) + this.f8128a[i2].hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BLOCK_START_STR);
        String str = "";
        int i = 0;
        while (i < this.b) {
            sb.append(str);
            sb.append(((c) this.f8128a[i]).e());
            sb.append("=");
            sb.append(this.f8128a[this.b + i]);
            i++;
            str = ", ";
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }
}
