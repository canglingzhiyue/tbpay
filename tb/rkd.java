package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.pop.PopMessageData;

/* loaded from: classes9.dex */
public class rkd extends rkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static rkd f33201a;

        static {
            kge.a(1664441815);
            f33201a = new rkd();
        }

        public static /* synthetic */ rkd a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rkd) ipChange.ipc$dispatch("f0a1533", new Object[0]) : f33201a;
        }
    }

    static {
        kge.a(202390788);
    }

    public static rkd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rkd) ipChange.ipc$dispatch("f0a1533", new Object[0]) : a.a();
    }

    private rkd() {
    }

    @Override // tb.rkc
    public void a(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25949ec", new Object[]{this, context, popMessageData});
            return;
        }
        rkg.a("link_tag", "TablePushClient === execute == 开始展示桌面push");
        com.taobao.wireless.link.pop.a.d(context, popMessageData);
        rkk.a(context).a("msg_last_show_time", Long.valueOf(rkj.a()));
    }
}
