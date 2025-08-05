package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.data_highway.jni.a;

/* loaded from: classes7.dex */
public class ktl implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(567827997);
        kge.a(-912931338);
    }

    @Override // com.taobao.android.data_highway.jni.a
    public void a(int i, String str, int i2, String str2, String str3, String str4, int i3, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4679bb", new Object[]{this, new Integer(i), str, new Integer(i2), str2, str3, str4, new Integer(i3), str5, str6});
        } else {
            ktn.a(i, str, str2, str3, i2, str4, i3, str5, str6);
        }
    }
}
