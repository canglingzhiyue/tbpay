package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.fuw;
import tb.kge;

/* loaded from: classes.dex */
public class i implements bf.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<WeakReference<bf.a>> f11874a = new ArrayList();

    static {
        kge.a(-685149769);
        kge.a(151788738);
    }

    @Override // com.taobao.android.dinamicx.bf.a
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            return;
        }
        if (DinamicXEngine.j()) {
            fuw.d("DXApmEventListener", "onEvent: " + i);
        }
        Iterator<WeakReference<bf.a>> it = this.f11874a.iterator();
        while (it.hasNext()) {
            WeakReference<bf.a> next = it.next();
            if (next == null) {
                it.remove();
            } else {
                bf.a aVar = next.get();
                if (aVar == null) {
                    it.remove();
                } else {
                    aVar.onEvent(i);
                }
            }
        }
    }

    public void a(bf.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e67c83", new Object[]{this, aVar});
            return;
        }
        Iterator<WeakReference<bf.a>> it = this.f11874a.iterator();
        while (it.hasNext()) {
            WeakReference<bf.a> next = it.next();
            if (next == null) {
                it.remove();
            } else {
                bf.a aVar2 = next.get();
                if (aVar2 == null) {
                    it.remove();
                } else if (aVar2 == aVar) {
                    return;
                }
            }
        }
        this.f11874a.add(new WeakReference<>(aVar));
    }
}
