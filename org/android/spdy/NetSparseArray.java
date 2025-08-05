package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class NetSparseArray<E> implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public NetSparseArray() {
        this(10);
    }

    public NetSparseArray(int i) {
        this.mGarbage = false;
        this.mKeys = new int[i];
        this.mValues = new Object[i];
        this.mSize = 0;
    }

    public E get(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (E) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)}) : get(i, null);
    }

    public E get(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("f316bf50", new Object[]{this, new Integer(i), e});
        }
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        if (binarySearch >= 0) {
            Object[] objArr = this.mValues;
            if (objArr[binarySearch] != DELETED) {
                return (E) objArr[binarySearch];
            }
        }
        return e;
    }

    public void delete(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4ccc91", new Object[]{this, new Integer(i)});
            return;
        }
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        if (binarySearch < 0) {
            return;
        }
        Object[] objArr = this.mValues;
        Object obj = objArr[binarySearch];
        Object obj2 = DELETED;
        if (obj == obj2) {
            return;
        }
        objArr[binarySearch] = obj2;
        this.mGarbage = true;
    }

    public void remove(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebab3958", new Object[]{this, new Integer(i)});
        } else {
            delete(i);
        }
    }

    public void removeAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0bdde5", new Object[]{this, new Integer(i)});
            return;
        }
        Object[] objArr = this.mValues;
        Object obj = objArr[i];
        Object obj2 = DELETED;
        if (obj == obj2) {
            return;
        }
        objArr[i] = obj2;
        this.mGarbage = true;
    }

    private void gc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54bc363", new Object[]{this});
            return;
        }
        int i = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    public void put(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b51c49", new Object[]{this, new Integer(i), e});
            return;
        }
        int binarySearch = binarySearch(this.mKeys, 0, this.mSize, i);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e;
            return;
        }
        int i2 = ~binarySearch;
        if (i2 < this.mSize) {
            Object[] objArr = this.mValues;
            if (objArr[i2] == DELETED) {
                this.mKeys[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            gc();
            i2 = ~binarySearch(this.mKeys, 0, this.mSize, i);
        }
        int i3 = this.mSize;
        int[] iArr = this.mKeys;
        if (i3 >= iArr.length) {
            int i4 = i3 + 20;
            int[] iArr2 = new int[i4];
            Object[] objArr2 = new Object[i4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr2;
            this.mValues = objArr2;
        }
        int i5 = this.mSize;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.mKeys;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i2, objArr4, i6, this.mSize - i2);
        }
        this.mKeys[i2] = i;
        this.mValues[i2] = e;
        this.mSize++;
    }

    public void toArray(E[] eArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2278f8ec", new Object[]{this, eArr});
            return;
        }
        for (int i = 0; i < eArr.length; i++) {
            eArr[i] = this.mValues[i];
        }
    }

    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public int keyAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea22fb9d", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i];
    }

    public E valueAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("935101da", new Object[]{this, new Integer(i)});
        }
        if (this.mGarbage) {
            gc();
        }
        return (E) this.mValues[i];
    }

    public void setValueAt(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7f4b36", new Object[]{this, new Integer(i), e});
            return;
        }
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i] = e;
    }

    public int indexOfKey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c9555b9", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.mGarbage) {
            gc();
        }
        return binarySearch(this.mKeys, 0, this.mSize, i);
    }

    public int indexOfValue(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fe1733e", new Object[]{this, e})).intValue();
        }
        if (this.mGarbage) {
            gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int i = this.mSize;
        Object[] objArr = this.mValues;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public void append(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6523a3de", new Object[]{this, new Integer(i), e});
            return;
        }
        int i2 = this.mSize;
        if (i2 != 0 && i <= this.mKeys[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.mGarbage && this.mSize >= this.mKeys.length) {
            gc();
        }
        int i3 = this.mSize;
        int[] iArr = this.mKeys;
        if (i3 >= iArr.length) {
            int i4 = i3 + 1;
            int[] iArr2 = new int[i4];
            Object[] objArr = new Object[i4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr2;
            this.mValues = objArr;
        }
        this.mKeys[i3] = i;
        this.mValues[i3] = e;
        this.mSize = i3 + 1;
    }

    private static int binarySearch(int[] iArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43b945b8", new Object[]{iArr, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i4 = i2 + i;
        int i5 = i - 1;
        int i6 = i4;
        while (i6 - i5 > 1) {
            int i7 = (i6 + i5) / 2;
            if (iArr[i7] < i3) {
                i5 = i7;
            } else {
                i6 = i7;
            }
        }
        return i6 == i4 ? ~i4 : iArr[i6] == i3 ? i6 : ~i6;
    }
}
