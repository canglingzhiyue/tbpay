package tb;

import com.alibaba.android.split.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes2.dex */
public class xim implements xin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(889076625);
        kge.a(2104778297);
    }

    @Override // tb.xin
    public void a(ClassLoader classLoader, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cce905e", new Object[]{this, classLoader, obj});
        }
    }

    @Override // tb.xin
    public boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        return false;
    }

    @Override // tb.xin
    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : bib.a(new File(str));
    }

    @Override // tb.xin
    public boolean a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2b494", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (str == null || str2 == null || str3 == null || str4 == null) {
            return false;
        }
        if (a(str).equals(str4)) {
            return true;
        }
        xik xikVar = new xik();
        xikVar.d = new File(str3);
        xikVar.f = str4;
        xikVar.e = a(str);
        ((xil) a.a((Class<? extends Object>) xil.class, new Object[0])).a(new File(str), new File(str2), xikVar);
        return xikVar.f34312a;
    }
}
