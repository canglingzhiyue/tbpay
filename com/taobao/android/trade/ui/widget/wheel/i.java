package com.taobao.android.trade.ui.widget.wheel;

import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<View> f15650a;
    private List<View> b;
    private WheelView c;

    static {
        kge.a(-1129397798);
    }

    public i(WheelView wheelView) {
        this.c = wheelView;
    }

    public int a(LinearLayout linearLayout, int i, d dVar) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18c51a4", new Object[]{this, linearLayout, new Integer(i), dVar})).intValue();
        }
        int i3 = i;
        while (i2 < linearLayout.getChildCount()) {
            if (!dVar.a(i3)) {
                a(linearLayout.getChildAt(i2), i3);
                linearLayout.removeViewAt(i2);
                if (i2 == 0) {
                    i++;
                }
            } else {
                i2++;
            }
            i3++;
        }
        return i;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : a(this.f15650a);
    }

    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : a(this.b);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<View> list = this.f15650a;
        if (list != null) {
            list.clear();
        }
        List<View> list2 = this.b;
        if (list2 == null) {
            return;
        }
        list2.clear();
    }

    private List<View> a(View view, List<View> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f2fbd48c", new Object[]{this, view, list});
        }
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(view);
        return list;
    }

    private void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        int a2 = this.c.getViewAdapter().a();
        if ((i < 0 || i >= a2) && !this.c.isCyclic()) {
            this.b = a(view, this.b);
        } else {
            this.f15650a = a(view, this.f15650a);
        }
    }

    private View a(List<View> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("62277d5b", new Object[]{this, list});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        View view = list.get(0);
        list.remove(0);
        return view;
    }
}
