package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes4.dex */
public class ebs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-379514506);
    }

    public static ebv a(List<ebv> list, int i) {
        ebv ebvVar;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("65ea3223", new Object[]{list, new Integer(i)});
        } else if (i < 0 || i > list.size() - 1) {
            ebv ebvVar2 = new ebv();
            ebv ebvVar3 = new ebv();
            if (i < 0) {
                ebvVar = list.get(0);
            } else if (list == null || list.size() <= 0) {
                i = 0;
                ebvVar2.f27179a = ebvVar3.f27179a + (ebvVar3.a() * i);
                ebvVar2.b = ebvVar3.b;
                ebvVar2.c = ebvVar3.c + (ebvVar3.a() * i);
                ebvVar2.d = ebvVar3.d;
                ebvVar2.e = ebvVar3.e + (ebvVar3.a() * i);
                ebvVar2.f = ebvVar3.f;
                ebvVar2.g = ebvVar3.g + (i * ebvVar3.a());
                ebvVar2.h = ebvVar3.h;
                return ebvVar2;
            } else {
                i = (i - list.size()) + 1;
                ebvVar = list.get(list.size() - 1);
            }
            ebvVar3 = ebvVar;
            ebvVar2.f27179a = ebvVar3.f27179a + (ebvVar3.a() * i);
            ebvVar2.b = ebvVar3.b;
            ebvVar2.c = ebvVar3.c + (ebvVar3.a() * i);
            ebvVar2.d = ebvVar3.d;
            ebvVar2.e = ebvVar3.e + (ebvVar3.a() * i);
            ebvVar2.f = ebvVar3.f;
            ebvVar2.g = ebvVar3.g + (i * ebvVar3.a());
            ebvVar2.h = ebvVar3.h;
            return ebvVar2;
        } else {
            obj = list.get(i);
        }
        return (ebv) obj;
    }
}
