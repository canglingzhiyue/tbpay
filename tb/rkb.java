package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.wireless.link.pop.PopMessageData;

/* loaded from: classes9.dex */
public class rkb extends rkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static rkb f33200a;

        static {
            kge.a(-953452591);
            f33200a = new rkb();
        }

        public static /* synthetic */ rkb a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (rkb) ipChange.ipc$dispatch("f0a14f5", new Object[0]) : f33200a;
        }
    }

    static {
        kge.a(-866284802);
    }

    public static rkb a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rkb) ipChange.ipc$dispatch("f0a14f5", new Object[0]) : a.a();
    }

    private rkb() {
    }

    @Override // tb.rkc
    public void a(final Context context, final PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25949ec", new Object[]{this, context, popMessageData});
        } else {
            b.h().a(context).a(popMessageData.picUrl).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.rkb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    com.taobao.wireless.link.controller.a.a().i = succPhenixEvent.getDrawable();
                    if (com.taobao.wireless.link.controller.a.a().i != null && rkj.d(context)) {
                        rkg.a("link_tag", "PopMessageReceiver === onData == 下载图片成功，在桌面，开始绘制弹窗pop");
                        com.taobao.wireless.link.pop.a.c(context, popMessageData);
                        rkk.a(context).a("msg_last_show_time", Long.valueOf(rkj.a()));
                    }
                    return false;
                }
            }).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "1111").fetch();
        }
    }
}
