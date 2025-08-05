package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.util.b;
import com.taobao.monitor.procedure.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class mnl implements mnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final View f31137a;
    private View b;
    private View c;
    private final HashSet<Drawable> d = new HashSet<>();
    private boolean e = false;
    private boolean f = false;

    public mnl(View view, View view2) {
        this.f31137a = view;
        this.b = view2;
    }

    private float a(View view, List<mns> list, View view2) {
        View view3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91301087", new Object[]{this, view, list, view2})).floatValue();
        }
        float f = 0.0f;
        if (!mnt.a(view, view2)) {
            return 0.0f;
        }
        if (view.getHeight() < mnh.screenHeight / 20) {
            return 1.0f;
        }
        if (view instanceof ViewStub) {
            return 0.0f;
        }
        if (mnt.b(view, view2)) {
            this.b = view;
            this.f = true;
            return 0.0f;
        }
        Object tag = view.getTag(v.APM_VIEW_TOKEN);
        if (tag instanceof String) {
            if (v.APM_VIEW_VALID.equals(tag)) {
                return 1.0f;
            }
            if (v.APM_VIEW_IGNORE.equals(tag) || v.APM_VIEW_INVALID.equals(tag)) {
                return 0.0f;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (mnt.a(viewGroup)) {
                return mnt.b(viewGroup) ? 1.0f : 0.0f;
            }
            View[] a2 = mnh.a(viewGroup);
            int length = a2.length;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < length && (view3 = a2[i3]) != null; i3++) {
                i++;
                ArrayList arrayList = new ArrayList();
                if (a(view3, arrayList, view2) > 0.8f) {
                    i2++;
                    list.add(mns.a(view3, view2));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((mns) it.next()).a();
                    }
                } else {
                    list.addAll(arrayList);
                }
            }
            if (view.getHeight() < mnh.screenHeight / 8 && (((viewGroup instanceof LinearLayout) || (viewGroup instanceof RelativeLayout)) && i == i2 && i != 0)) {
                return 1.0f;
            }
            float a3 = new mno(b.a(30)).a(viewGroup, list, view2);
            if (a3 <= 0.8f) {
                return a3;
            }
            return 1.0f;
        }
        boolean[] zArr = new boolean[1];
        if (mnt.a(view, true, this.d, zArr)) {
            f = 1.0f;
        }
        this.e = zArr[0];
        return f;
    }

    @Override // tb.mnm
    public mnj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mnj) ipChange.ipc$dispatch("f07db55", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        float a2 = a(this.f31137a, arrayList, this.b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((mns) it.next()).a();
        }
        this.d.clear();
        return new mnj(mnl.class, a2, this.e, this.c, this.f ? this.b : null);
    }
}
