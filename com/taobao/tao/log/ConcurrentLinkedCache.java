package com.taobao.tao.log;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.kge;

/* loaded from: classes.dex */
public class ConcurrentLinkedCache<E> extends ConcurrentLinkedQueue<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1532690567);
    }

    public Iterator<E> getIteratorAndClear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("c64e6596", new Object[]{this});
        }
        synchronized (this) {
            try {
                try {
                    if (!isEmpty()) {
                        ArrayList arrayList = new ArrayList(this);
                        clear();
                        return arrayList.iterator();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return new Iterator<E>() { // from class: com.taobao.tao.log.ConcurrentLinkedCache.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
                        }
                        return false;
                    }

                    @Override // java.util.Iterator
                    public E next() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (E) ipChange2.ipc$dispatch("b9bf2c78", new Object[]{this});
                        }
                        return null;
                    }
                };
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
