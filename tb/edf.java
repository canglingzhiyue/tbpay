package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class edf extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f27207a;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27208a;
        public String b;
        public String c;
        public String d;
        public String e;
        public boolean f;

        static {
            kge.a(-138180639);
        }
    }

    static {
        kge.a(-1714123870);
    }

    public edf() {
        emu.a("com.taobao.android.detail.core.event.bottom.UpdateRemindEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27207a;
    }
}
