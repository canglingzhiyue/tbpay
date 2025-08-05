package tb;

import android.app.Activity;
import android.app.TabActivity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.intercept.ui.TFrameLayoutEx2;
import com.taobao.android.tracker.util.c;
import com.taobao.android.tracker.util.f;
import com.ut.mini.exposure.TrackerFrameLayout;

/* loaded from: classes6.dex */
public class jjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jjb f29578a;

    static {
        kge.a(1699946910);
    }

    public void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
        } else if (!b(activity)) {
        } else {
            try {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                if (viewGroup == null || viewGroup.getChildCount() <= 0) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                if (childAt != null && (childAt instanceof TrackerFrameLayout)) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    if (a(viewGroup2)) {
                        return;
                    }
                    a(viewGroup2, activity, str);
                } else if (!a(viewGroup)) {
                    a(viewGroup, activity, str);
                } else {
                    f.a("no attachTrackerFrameLayout " + activity.toString());
                }
            } catch (Exception e) {
                f.b(e.toString());
            }
        }
    }

    private void a(ViewGroup viewGroup, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5acd9e43", new Object[]{this, viewGroup, activity, str});
            return;
        }
        TFrameLayoutEx2 tFrameLayoutEx2 = new TFrameLayoutEx2(activity);
        tFrameLayoutEx2.setUrl(str);
        tFrameLayoutEx2.setListener(this.f29578a);
        while (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeViewAt(0);
            tFrameLayoutEx2.addView(childAt, childAt.getLayoutParams());
        }
        viewGroup.addView(tFrameLayoutEx2, new ViewGroup.LayoutParams(-1, -1));
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (!b(activity)) {
        } else {
            try {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                if (viewGroup == null || viewGroup.getChildCount() <= 0) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                if (childAt != null && (childAt instanceof TFrameLayoutEx2)) {
                    viewGroup.removeViewAt(0);
                    c.a("container remove child0");
                } else if (childAt == null || !(childAt instanceof TrackerFrameLayout) || ((TrackerFrameLayout) childAt).getChildCount() <= 0) {
                } else {
                    ((TrackerFrameLayout) childAt).removeViewAt(0);
                    c.a("TrackerFrameLayout remove child1");
                }
            } catch (Exception e) {
                f.b(e.toString());
            }
        }
    }

    public void a(jjb jjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef79e876", new Object[]{this, jjbVar});
        } else {
            this.f29578a = jjbVar;
        }
    }

    private boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{this, activity})).booleanValue() : activity == null || !(activity instanceof TabActivity);
    }

    private boolean a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a1860ab", new Object[]{this, viewGroup})).booleanValue() : viewGroup.getChildCount() > 0 && (viewGroup.getChildAt(0) instanceof TFrameLayoutEx2);
    }
}
