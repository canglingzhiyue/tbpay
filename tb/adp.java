package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class adp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLASS_2008 = 2008;
    public static final int CLASS_2009 = 2009;
    public static final int CLASS_2010 = 2010;
    public static final int CLASS_2011 = 2011;
    public static final int CLASS_2012 = 2012;
    public static final int CLASS_2013 = 2013;
    public static final int CLASS_2014 = 2014;
    public static final int CLASS_UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Integer f25271a;

    static {
        kge.a(-1287707388);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (f25271a == null) {
            synchronized (adp.class) {
                if (f25271a == null) {
                    f25271a = Integer.valueOf(b(context));
                }
            }
        }
        return f25271a.intValue();
    }

    private static void a(ArrayList<Integer> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1640bd01", new Object[]{arrayList, new Integer(i)});
        } else if (i == -1) {
        } else {
            arrayList.add(Integer.valueOf(i));
        }
    }

    private static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        ArrayList arrayList = new ArrayList();
        a(arrayList, a());
        a(arrayList, b());
        a(arrayList, c(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = (arrayList.size() / 2) - 1;
        return ((Integer) arrayList.get(size)).intValue() + ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2);
    }

    private static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        int a2 = adn.a();
        if (a2 <= 0) {
            return -1;
        }
        if (a2 == 1) {
            return 2008;
        }
        return a2 <= 3 ? 2011 : 2012;
    }

    private static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        long b = adn.b();
        if (b == -1) {
            return -1;
        }
        if (b <= 528000) {
            return 2008;
        }
        if (b <= 620000) {
            return 2009;
        }
        if (b <= 1020000) {
            return 2010;
        }
        if (b <= 1220000) {
            return 2011;
        }
        if (b <= 1520000) {
            return 2012;
        }
        return b <= 2020000 ? 2013 : 2014;
    }

    private static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{context})).intValue();
        }
        long a2 = adn.a(context);
        if (a2 <= 0) {
            return -1;
        }
        if (a2 <= 201326592) {
            return 2008;
        }
        if (a2 <= 304087040) {
            return 2009;
        }
        if (a2 <= 536870912) {
            return 2010;
        }
        if (a2 <= 1073741824) {
            return 2011;
        }
        if (a2 <= 1610612736) {
            return 2012;
        }
        return a2 <= 2147483648L ? 2013 : 2014;
    }
}
