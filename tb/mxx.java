package tb;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f31316a;
    private static long b;

    static {
        kge.a(-1332273358);
        f31316a = 0L;
        b = 300L;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f31316a < b) {
            return true;
        }
        f31316a = currentTimeMillis;
        return false;
    }

    public static void a(View view, final float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c23b42d", new Object[]{view, new Float(f), new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            if (view.getBackground() == null) {
                view.setBackgroundColor(i);
            }
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: tb.mxx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                    } else {
                        outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                    }
                }
            });
            view.setClipToOutline(true);
        }
    }
}
