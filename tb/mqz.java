package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.trade.event.f;

/* loaded from: classes4.dex */
public class mqz implements efh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f31213a;

    static {
        kge.a(1866867025);
        kge.a(1880844890);
    }

    public mqz(Context context) {
        this.f31213a = context;
        emu.a("com.taobao.android.detail.core.event.subscriber.title.ShareAction");
    }

    @Override // tb.efh
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f.a(this.f31213a, new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT));
        }
    }
}
