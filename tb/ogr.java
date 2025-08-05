package tb;

import android.graphics.Typeface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public class ogr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Typeface f32043a;
    private static WeakHashMap<View, Void> b;

    static {
        kge.a(-1561132747);
        b = new WeakHashMap<>();
    }

    public static Typeface a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("2a2452e0", new Object[]{view});
        }
        if (f32043a == null) {
            try {
                f32043a = a.a().t().a(view.getContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        b.put(view, null);
        return f32043a;
    }

    public static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
            return;
        }
        b.remove(view);
        if (b.size() != 0) {
            return;
        }
        f32043a = null;
    }
}
