package com.taobao.android.meta.data;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class CellList extends ArrayList<BaseCellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int indexCount;

    static {
        kge.a(-1475524722);
    }

    public static /* synthetic */ Object ipc$super(CellList cellList, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1738987735:
                return new Integer(super.lastIndexOf(objArr[0]));
            case -1530880303:
                return new Boolean(super.addAll(((Number) objArr[0]).intValue(), (Collection) objArr[1]));
            case -1335065210:
                return new Boolean(super.contains(objArr[0]));
            case -1272099756:
                super.clear();
                return null;
            case -475350822:
                return super.remove(((Number) objArr[0]).intValue());
            case -332530133:
                return new Boolean(super.remove(objArr[0]));
            case 195222152:
                return new Boolean(super.add((CellList) objArr[0]));
            case 845773819:
                return new Integer(super.size());
            case 1580890655:
                return new Integer(super.indexOf(objArr[0]));
            case 1730268220:
                return new Boolean(super.addAll((Collection) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public /* bridge */ boolean contains(BaseCellBean baseCellBean) {
        return super.contains((Object) baseCellBean);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof BaseCellBean)) {
            return false;
        }
        return contains((BaseCellBean) obj);
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : super.size();
    }

    public /* bridge */ int indexOf(BaseCellBean baseCellBean) {
        return super.indexOf((Object) baseCellBean);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof BaseCellBean)) {
            return -1;
        }
        return indexOf((BaseCellBean) obj);
    }

    public /* bridge */ int lastIndexOf(BaseCellBean baseCellBean) {
        return super.lastIndexOf((Object) baseCellBean);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof BaseCellBean)) {
            return -1;
        }
        return lastIndexOf((BaseCellBean) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final BaseCellBean remove(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseCellBean) ipChange.ipc$dispatch("1e4bd7d0", new Object[]{this, new Integer(i)}) : removeAt(i);
    }

    public /* bridge */ boolean remove(BaseCellBean baseCellBean) {
        return super.remove((Object) baseCellBean);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof BaseCellBean)) {
            return false;
        }
        return remove((BaseCellBean) obj);
    }

    public BaseCellBean removeAt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseCellBean) ipChange.ipc$dispatch("9c66eb63", new Object[]{this, new Integer(i)}) : (BaseCellBean) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : getSize();
    }

    public final int getIndexCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("18da464d", new Object[]{this})).intValue() : this.indexCount;
    }

    public final void setIndexCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3945915d", new Object[]{this, new Integer(i)});
        } else {
            this.indexCount = i;
        }
    }

    public CellList(int i) {
        super(i);
    }

    public CellList() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        super.clear();
        this.indexCount = 0;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(BaseCellBean element) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7624f7e", new Object[]{this, element})).booleanValue();
        }
        q.c(element, "element");
        int i = this.indexCount;
        this.indexCount = i + 1;
        element.comboRealIndex = i;
        return super.add((CellList) element);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends BaseCellBean> elements) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6721cc3c", new Object[]{this, elements})).booleanValue();
        }
        q.c(elements, "elements");
        for (BaseCellBean baseCellBean : elements) {
            int i = this.indexCount;
            this.indexCount = i + 1;
            baseCellBean.comboRealIndex = i;
        }
        return super.addAll(elements);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends BaseCellBean> elements) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4c09ed1", new Object[]{this, new Integer(i), elements})).booleanValue();
        }
        q.c(elements, "elements");
        for (BaseCellBean baseCellBean : elements) {
            int i2 = this.indexCount;
            this.indexCount = i2 + 1;
            baseCellBean.comboRealIndex = i2;
        }
        return super.addAll(i, elements);
    }
}
