package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public class ejj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AliSDetailComponentViewAppearTagger";

    static {
        kge.a(-564674922);
        emu.a("com.taobao.android.detail.core.standard.componentlifecycle.AliSDetailComponentViewAppearTagger");
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null) {
            arc.a().c(TAG, "tagViewAppear", "view is null");
        } else {
            view.setTag(R.id.standard_detail_component_lifecycle_tag_is_appear, true);
        }
    }

    public static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
        } else if (view == null) {
            arc.a().c(TAG, "tagViewAppear", "view is null");
        } else {
            view.setTag(R.id.standard_detail_component_lifecycle_tag_is_appear, false);
        }
    }

    public static boolean c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d05012c", new Object[]{view})).booleanValue();
        }
        if (view == null) {
            arc.a().c(TAG, "isViewTaggedAppear", "view is null");
            return false;
        }
        try {
            Object tag = view.getTag(R.id.standard_detail_component_lifecycle_tag_is_appear);
            if (!(tag instanceof Boolean)) {
                return false;
            }
            return ((Boolean) tag).booleanValue();
        } catch (Exception e) {
            ard a2 = arc.a();
            a2.c(TAG, "isViewTaggedAppear", "get tag exception:" + e.getMessage());
            return false;
        }
    }
}
