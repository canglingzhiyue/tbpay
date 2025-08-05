package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mkb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VERSION = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f31062a;
    public String b;
    private int c = 0;

    /* loaded from: classes7.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f31063a;
        public int b;

        static {
            kge.a(1468978491);
        }
    }

    static {
        kge.a(689923460);
    }

    public a a(mkc mkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4da568d2", new Object[]{this, mkcVar});
        }
        return null;
    }

    public mkb(String str, String str2) {
        this.f31062a = "";
        this.b = "";
        this.b = str;
        this.f31062a = str2;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        this.c = i;
        return true;
    }
}
