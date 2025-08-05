package tb;

import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class jbg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f29445a;

    /* loaded from: classes.dex */
    public interface a {
        HandlerThread a(String str);

        HandlerThread highHandlerThread(String str);
    }

    public static HandlerThread a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("578e15aa", new Object[]{str});
        }
        if (f29445a != null) {
            return f29445a.a(str);
        }
        return new HandlerThread(str);
    }

    public static HandlerThread b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("9158b789", new Object[]{str});
        }
        if (f29445a != null) {
            return f29445a.highHandlerThread(str);
        }
        return new HandlerThread(str);
    }
}
