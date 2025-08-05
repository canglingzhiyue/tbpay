package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* loaded from: classes4.dex */
public class efk implements efh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f27272a;
    private String b;

    static {
        kge.a(-557682505);
        kge.a(1880844890);
    }

    public efk(Context context, String str) {
        this.f27272a = context;
        this.b = str;
        emu.a("com.taobao.android.detail.core.event.subscriber.title.OpenUrlAction");
    }

    @Override // tb.efh
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            Nav.from(this.f27272a).toUri(this.b);
        }
    }
}
