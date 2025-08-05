package tb;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class omp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, Drawable> f32179a = new ConcurrentHashMap();

    private static Drawable c(Resources resources, int i, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("5ec530ea", new Object[]{resources, new Integer(i), theme});
        }
        Drawable drawable = ResourcesCompat.getDrawable(resources, i, null);
        if (drawable != null) {
            f32179a.put(Integer.valueOf(i), drawable);
        }
        return drawable;
    }

    public static void a(Resources resources, int i, Resources.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e571492", new Object[]{resources, new Integer(i), theme});
            return;
        }
        try {
            c(resources, i, theme);
        } catch (Resources.NotFoundException e) {
            omr.a("preload_drawable", "failed" + e);
        }
    }

    public static Drawable b(Resources resources, int i, Resources.Theme theme) throws Resources.NotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7db8f669", new Object[]{resources, new Integer(i), theme});
        }
        if (f32179a.containsKey(Integer.valueOf(i))) {
            return f32179a.get(Integer.valueOf(i));
        }
        return c(resources, i, theme);
    }
}
