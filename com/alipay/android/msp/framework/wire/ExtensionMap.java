package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.ExtendableMessage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import tb.riy;

/* loaded from: classes3.dex */
public final class ExtensionMap<T extends ExtendableMessage<?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object[] f4892a;
    private int b;

    public <E> ExtensionMap(Extension<T, E> extension, E e) {
        this.f4892a = new Object[2];
        Object[] objArr = this.f4892a;
        objArr[0] = extension;
        objArr[1] = e;
        this.b = 1;
    }

    public ExtensionMap(ExtensionMap<T> extensionMap) {
        this.f4892a = (Object[]) extensionMap.f4892a.clone();
        this.b = extensionMap.b;
    }

    public final int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : this.b;
    }

    public final Extension<T, ?> getExtension(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("c4620302", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        return (Extension) this.f4892a[i];
    }

    public final Object getExtensionValue(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4fd55ebe", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= (i2 = this.b)) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        return this.f4892a[i2 + i];
    }

    public final List<Extension<T, ?>> getExtensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ead48a96", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.b);
        for (int i = 0; i < this.b; i++) {
            arrayList.add((Extension) this.f4892a[i]);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final <E> E get(Extension<T, E> extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("50379710", new Object[]{this, extension});
        }
        int binarySearch = Arrays.binarySearch(this.f4892a, 0, this.b, extension);
        if (binarySearch >= 0) {
            return (E) this.f4892a[this.b + binarySearch];
        }
        return null;
    }

    public final <E> void put(Extension<T, E> extension, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d24a9de5", new Object[]{this, extension, e});
            return;
        }
        int binarySearch = Arrays.binarySearch(this.f4892a, 0, this.b, extension);
        if (binarySearch >= 0) {
            this.f4892a[this.b + binarySearch] = e;
            return;
        }
        int i = -(binarySearch + 1);
        Object[] objArr = this.f4892a;
        if (objArr.length < (this.b + 1) * 2) {
            Object[] objArr2 = new Object[objArr.length * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        int i2 = this.b;
        if (i < i2) {
            System.arraycopy(this.f4892a, i2 + i, objArr, i2 + i + 2, i2 - i);
            System.arraycopy(this.f4892a, i, objArr, i + 1, this.b);
        } else {
            System.arraycopy(this.f4892a, i2, objArr, i2 + 1, i2);
        }
        this.b++;
        this.f4892a = objArr;
        Object[] objArr3 = this.f4892a;
        objArr3[i] = extension;
        objArr3[this.b + i] = e;
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof ExtensionMap)) {
            return false;
        }
        ExtensionMap extensionMap = (ExtensionMap) obj;
        if (this.b != extensionMap.b) {
            return false;
        }
        for (int i = 0; i < this.b * 2; i++) {
            if (!this.f4892a[i].equals(extensionMap.f4892a[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b * 2; i2++) {
            i = (i * 37) + this.f4892a[i2].hashCode();
        }
        return i;
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BLOCK_START_STR);
        String str = "";
        while (i < this.b) {
            sb.append(str);
            sb.append(((Extension) this.f4892a[i]).getTag());
            sb.append("=");
            sb.append(this.f4892a[this.b + i]);
            i++;
            str = ", ";
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }
}
