package com.taobao.android.detail.ttdetail.performance;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.a;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements a.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<Integer, ConcurrentLinkedQueue<View>> f10776a = new ConcurrentHashMap<>(30);
    private a b;

    static {
        kge.a(-1507042425);
        kge.a(-1028206263);
    }

    public b(Context context) {
        this.b = new a(context);
    }

    public void a(ArrayList<Integer> arrayList, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619a0481", new Object[]{this, arrayList, viewGroup});
            return;
        }
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next != null) {
                this.b.a(next.intValue(), viewGroup, this);
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.performance.a.d
    public void a(View view, int i, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a88ee18", new Object[]{this, view, new Integer(i), viewGroup});
        } else if (view == null) {
        } else {
            ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.f10776a.get(Integer.valueOf(i));
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                this.f10776a.put(Integer.valueOf(i), concurrentLinkedQueue);
            }
            if (concurrentLinkedQueue.contains(view)) {
                return;
            }
            concurrentLinkedQueue.add(view);
        }
    }

    public View a(Context context, int i, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d7c2f1a4", new Object[]{this, context, new Integer(i), viewGroup});
        }
        ConcurrentLinkedQueue<View> concurrentLinkedQueue = this.f10776a.get(Integer.valueOf(i));
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.size() <= 0) {
            return null;
        }
        View poll = concurrentLinkedQueue.poll();
        if (poll != null) {
            i.a("AsyncViewPreLoader", "getAsyncCacheView resId = " + context.getResources().getResourceEntryName(i));
            a(poll, context);
        }
        return poll;
    }

    private void a(View view, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597e739e", new Object[]{this, view, context});
        } else if (view != null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(viewGroup.getChildAt(i), context);
                }
            } else if (view.getContext() instanceof e) {
                ((e) view.getContext()).a(context);
            }
        }
    }
}
