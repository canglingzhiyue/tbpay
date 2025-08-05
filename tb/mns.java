package tb;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.d;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes7.dex */
public class mns {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Queue<mns> k = new LinkedList();

    /* renamed from: a  reason: collision with root package name */
    public int f31143a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public View f;
    public int g;
    public int h;
    public int i;
    public int j;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (k.size() >= 100) {
        } else {
            this.f = null;
            k.add(this);
        }
    }

    public static mns a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mns) ipChange.ipc$dispatch("ea31b7ac", new Object[]{view, view2});
        }
        mns poll = k.poll();
        if (poll == null) {
            poll = new mns();
        }
        int[] b = mnh.b(view, view2);
        int max = Math.max(0, b[0]);
        int min = Math.min(mnh.screenWidth, b[0] + view.getWidth());
        int max2 = Math.max(0, b[1]);
        int min2 = Math.min(mnh.screenHeight, b[1] + view.getHeight());
        poll.e = view instanceof TextView;
        poll.c = max;
        poll.d = min;
        poll.f31143a = max2;
        poll.b = min2;
        poll.g = 10;
        poll.h = 10;
        poll.i = 10;
        poll.j = 10;
        if (d.ah) {
            poll.f = view;
        }
        return poll;
    }

    public static mns b(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mns) ipChange.ipc$dispatch("dbdb5dcb", new Object[]{view, view2});
        }
        mns poll = k.poll();
        if (poll == null) {
            poll = new mns();
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return poll;
        }
        View view3 = (View) parent;
        int[] b = mnh.b(view3, view2);
        int max = Math.max(0, b[1]);
        int min = Math.min(mnh.screenHeight, b[1] + view3.getHeight());
        int max2 = Math.max(0, b[0]);
        int min2 = Math.min(mnh.screenWidth, b[0] + view3.getWidth());
        int[] b2 = mnh.b(view, view2);
        int max3 = Math.max(0, b2[0]);
        int min3 = Math.min(mnh.screenWidth, b2[0] + view.getWidth());
        int max4 = Math.max(0, b2[1]);
        int min4 = Math.min(mnh.screenHeight, b2[1] + view.getHeight());
        poll.e = view instanceof TextView;
        poll.c = Math.max(max3, max2);
        poll.d = Math.min(min3, min2);
        poll.f31143a = Math.max(max4, max);
        poll.b = Math.min(min4, min);
        poll.g = 10;
        poll.h = 10;
        poll.i = 10;
        poll.j = 10;
        if (min3 - max3 <= 0 || min4 - max4 <= 0) {
            poll.c = 0;
            poll.d = 0;
            poll.f31143a = 0;
            poll.b = 0;
            poll.g = 0;
            poll.h = 0;
            poll.i = 0;
            poll.j = 0;
        }
        if (d.ah) {
            poll.f = view;
        }
        return poll;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ViewInfo{top=" + this.f31143a + ", bottom=" + this.b + ", left=" + this.c + ", right=" + this.d + '}';
    }
}
