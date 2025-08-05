package com.taobao.android.detail.datasdk.factory.manager;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class AbsFactoryManager<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NORM_PRIORITY = 5;

    /* renamed from: a  reason: collision with root package name */
    public FactoryComparator f9954a = new FactoryComparator();

    static {
        kge.a(1480827940);
    }

    public <E> void a(E e, int i, ArrayList<Pair<Integer, E>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4b7dcb", new Object[]{this, e, new Integer(i), arrayList});
        } else if (e == null || arrayList == null) {
        } else {
            if (i > 10) {
                i = 10;
            } else if (i <= 0) {
                i = 1;
            }
            Iterator<Pair<Integer, E>> it = arrayList.iterator();
            while (it.hasNext()) {
                if (e.equals(it.next().second)) {
                    return;
                }
            }
            arrayList.add(Pair.create(Integer.valueOf(i), e));
            Collections.sort(arrayList, this.f9954a);
        }
    }

    /* loaded from: classes4.dex */
    public static class FactoryComparator implements Serializable, Comparator<Pair<Integer, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1070955296);
            kge.a(-2099169482);
            kge.a(1028243835);
        }

        private FactoryComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Pair<Integer, ?> pair, Pair<Integer, ?> pair2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d8bc39f", new Object[]{this, pair, pair2})).intValue() : ((Integer) pair.first).intValue() - ((Integer) pair2.first).intValue();
        }
    }
}
