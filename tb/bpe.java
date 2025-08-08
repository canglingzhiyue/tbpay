package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class bpe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_DXROOT_VIEW = "DXRootView";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26034a;

    static {
        kge.a(-829518739);
        f26034a = false;
    }

    public static DXRootView a(View view) {
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("fd04df2d", new Object[]{view});
        }
        if (view instanceof DXRootView) {
            dXRootView = (DXRootView) view;
        } else {
            dXRootView = (DXRootView) view.findViewWithTag(TAG_DXROOT_VIEW);
        }
        return (dXRootView != null || !(view instanceof ViewGroup)) ? dXRootView : a((ViewGroup) view);
    }

    private static DXRootView a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("6bee2750", new Object[]{viewGroup});
        }
        DXRootView dXRootView = null;
        int childCount = viewGroup.getChildCount();
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof DXRootView) {
                dXRootView = (DXRootView) childAt;
                break;
            }
            if (childAt instanceof ViewGroup) {
                arrayList.add((ViewGroup) childAt);
            }
            i++;
        }
        if (dXRootView == null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (dXRootView = a((ViewGroup) it.next())) == null) {
            }
        }
        return dXRootView;
    }

    public static View a(View view, DXTemplateItem dXTemplateItem) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a1d7df15", new Object[]{view, dXTemplateItem});
        }
        if (!f26034a) {
            return view;
        }
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        String str3 = "";
        if (dXTemplateItem != null) {
            str3 = dXTemplateItem.f11925a;
            str = String.valueOf(dXTemplateItem.b);
        } else {
            str = str3;
        }
        TextView textView = new TextView(view.getContext());
        String str4 = "d: " + str3 + " : " + str;
        if (dXTemplateItem != null) {
            if (dXTemplateItem.e || dXTemplateItem.b < 0) {
                str2 = str4 + "预置";
            } else {
                str2 = str4 + "非预置";
            }
            str4 = str2 + " Butter:" + dXTemplateItem.i();
        }
        textView.setText(str4);
        textView.setTextColor(858993459);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 48));
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        view.setTag(TAG_DXROOT_VIEW);
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.addView(view);
        frameLayout2.addView(textView);
        return frameLayout;
    }

    public static boolean a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{dXTemplateItem})).booleanValue();
        }
        if (dXTemplateItem == null) {
            return false;
        }
        if (dXTemplateItem.d() == 30000) {
            return true;
        }
        if (dXTemplateItem.d() == 20000) {
            return false;
        }
        if (!StringUtils.isEmpty(dXTemplateItem.c) && dXTemplateItem.c.endsWith(".zip")) {
            return true;
        }
        return StringUtils.isEmpty(dXTemplateItem.c) && dXTemplateItem.b >= 0;
    }
}
