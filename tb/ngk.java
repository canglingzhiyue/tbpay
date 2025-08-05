package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public abstract class ngk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1914206674);
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void a(int i, int i2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1e1b48", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
        }
    }

    public void a(ngf ngfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce765a78", new Object[]{this, ngfVar, new Integer(i)});
        }
    }

    public void a(ngf ngfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a67af5", new Object[]{this, ngfVar, str});
        }
    }

    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }
}
