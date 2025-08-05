package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.pop.PopMessageData;

/* loaded from: classes9.dex */
public abstract class rkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-746435554);
    }

    public abstract void a(Context context, PopMessageData popMessageData);

    public static rkc a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rkc) ipChange.ipc$dispatch("e666fe81", new Object[]{new Integer(i)});
        }
        if (1 == i) {
            return rkd.a();
        }
        return rkb.a();
    }
}
