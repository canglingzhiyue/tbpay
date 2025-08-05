package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kgt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_ABSORBED = "absorbed";
    public static final String EVENT_ABSORBING = "absorbing";
    public static final String EVENT_DRAG = "drag";
    public static final String EVENT_HIT_WALL = "hitWall";
    public static final String EVENT_HOVER = "hover";
    public static final String FLOAT_EVENT_TYPE_EVENT = "FloatWindow.Event";
    public static final String FLOAT_EVENT_TYPE_GESTURE = "FloatWindow.Gesture";
    public static final String FLOAT_SOURCE_TYPE = "FloatWindow";

    static {
        kge.a(882657100);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : (i == 0 || i == 1 || i == 3 || i == 2) ? FLOAT_EVENT_TYPE_GESTURE : FLOAT_EVENT_TYPE_EVENT;
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)}) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : EVENT_HIT_WALL : EVENT_ABSORBED : EVENT_ABSORBING : EVENT_DRAG : EVENT_HOVER;
    }
}
