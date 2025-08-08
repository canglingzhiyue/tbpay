package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class prp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(393817772);
    }

    public static View a(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f4ba2", new Object[]{str, view});
        }
        if (StringUtils.isEmpty(str) || view == null) {
            return null;
        }
        if (str.equals(view.getTag())) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        return a(str, (ViewGroup) view);
    }

    private static View a(String str, ViewGroup viewGroup) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7794073", new Object[]{str, viewGroup});
        }
        if (!StringUtils.isEmpty(str) && viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (str.equals(childAt.getTag())) {
                    return childAt;
                }
                if ((childAt instanceof ViewGroup) && (a2 = a(str, (ViewGroup) childAt)) != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
