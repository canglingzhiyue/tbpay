package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aa;

/* loaded from: classes8.dex */
public class pbc implements cha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(257006922);
        kge.a(1767684483);
    }

    @Override // tb.cha
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String T = aa.T();
        return TextUtils.isEmpty(T) ? "https://h5.m.taobao.com/taolive/main.html" : T;
    }
}
