package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public final class ipy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INIT = 100;
    public static final int SUBSCRIBED = 11;
    public static final int SUBSCRIBED_FAIL = 101;
    public static final int SUBSCRIBING = 10;
    public static final int UN_SUBSCRIBED = 102;
    public static final int UN_SUBSCRIBED_FAIL = 103;
    public static final int UN_SUBSCRIBING = 12;

    static {
        kge.a(1862855146);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 10:
                return "SUBSCRIBING";
            case 11:
                return "SUBSCRIBED";
            case 12:
                return "UN_SUBSCRIBING";
            default:
                switch (i) {
                    case 100:
                        return "INIT";
                    case 101:
                        return "SUBSCRIBED_FAIL";
                    case 102:
                        return "UN_SUBSCRIBED";
                    case 103:
                        return "UN_SUBSCRIBED_FAIL";
                    default:
                        return "ERROR";
                }
        }
    }
}
