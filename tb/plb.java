package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes8.dex */
public class plb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(844682053);
    }

    public static AccountInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountInfo) ipChange.ipc$dispatch("7cfdceb3", new Object[0]);
        }
        VideoInfo u = poy.u(n.a());
        if (u == null) {
            return null;
        }
        return u.broadCaster;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        VideoInfo u = poy.u(n.a());
        return u != null ? u.topic : "";
    }
}
