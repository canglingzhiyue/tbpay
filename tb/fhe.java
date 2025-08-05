package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.TBShareMediaInfo;
import com.ut.share.business.TBShareMediaPublisher;

/* loaded from: classes5.dex */
public class fhe implements j<fhd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f27939a;

    static {
        kge.a(905683962);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fhd fhdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fhdVar}) : a(fhdVar);
    }

    public fhe(Activity activity) {
        this.f27939a = activity;
    }

    public i a(fhd fhdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("63b6cc39", new Object[]{this, fhdVar});
        }
        if (fhdVar == null) {
            return i.FAILURE;
        }
        ShareContent a2 = new fjz().b(fhdVar.b).e(fhdVar.e).c(fhdVar.c).a(fhdVar.f27938a).d(fhdVar.d).a();
        a2.mediaPublisher = new TBShareMediaPublisher();
        a2.mediaPublisher.setAvatar(fhdVar.k);
        a2.mediaPublisher.setNick(fhdVar.j);
        a2.mediaInfo = new TBShareMediaInfo();
        a2.mediaInfo.setType(fhdVar.l);
        a2.mediaInfo.setWidth(fhdVar.m);
        a2.mediaInfo.setHeight(fhdVar.n);
        a2.templateParams = fhdVar.o;
        ShareBusiness.share(this.f27939a, a2);
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
