package com.taobao.informationflowdataservice.dataservice.bizcode.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import tb.kge;

/* loaded from: classes7.dex */
public class FixedSizeList<T> extends ArrayList<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mFixedCapacity;

    static {
        kge.a(1266339983);
    }

    public static /* synthetic */ Object ipc$super(FixedSizeList fixedSizeList, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1530880303:
                return new Boolean(super.addAll(((Number) objArr[0]).intValue(), (Collection) objArr[1]));
            case -475350822:
                return super.remove(((Number) objArr[0]).intValue());
            case 117664640:
                super.removeRange(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 195222152:
                return new Boolean(super.add(objArr[0]));
            case 497758839:
                super.add(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 1730268220:
                return new Boolean(super.addAll((Collection) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public FixedSizeList(int i) {
        super(i);
        this.mFixedCapacity = 0;
        this.mFixedCapacity = i;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, t})).booleanValue();
        }
        checkCapacity((FixedSizeList<T>) t);
        return super.add(t);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dab3277", new Object[]{this, new Integer(i), t});
            return;
        }
        checkCapacity((FixedSizeList<T>) t);
        super.add(i, t);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, collection})).booleanValue();
        }
        checkCapacity((Collection) collection);
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4c09ed1", new Object[]{this, new Integer(i), collection})).booleanValue();
        }
        checkCapacity((Collection) collection);
        return super.addAll(i, collection);
    }

    private void checkCapacity(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac76105", new Object[]{this, t});
        } else if (size() + 1 <= this.mFixedCapacity) {
        } else {
            super.remove(0);
        }
    }

    private void checkCapacity(Collection<? extends T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abef825a", new Object[]{this, collection});
        } else if (collection == null || size() + collection.size() <= this.mFixedCapacity) {
        } else {
            super.removeRange(0, (size() + collection.size()) - this.mFixedCapacity);
        }
    }
}
