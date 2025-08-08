package tb;

import android.content.Context;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes4.dex */
public class efo implements j<edn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27280a;

    static {
        kge.a(1926543736);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(edn ednVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, ednVar}) : a(ednVar);
    }

    public efo(DetailCoreActivity detailCoreActivity) {
        this.f27280a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.track.TBTrackActivityRenderedSubscriber");
    }

    public i a(edn ednVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("d9f9a586", new Object[]{this, ednVar});
        }
        DetailCoreActivity detailCoreActivity = this.f27280a;
        if (detailCoreActivity == null || detailCoreActivity.Y()) {
            return a.SUCCESS;
        }
        c cVar = this.f27280a.y().t;
        String u = cVar.u();
        DetailCoreActivity detailCoreActivity2 = this.f27280a;
        if (StringUtils.isEmpty(u)) {
            u = "";
        }
        a(detailCoreActivity2, "", u, cVar.k(), eqb.m(cVar.f10055a).price.priceText, cVar.l(), cVar.i());
        return a.SUCCESS;
    }

    private void a(final Context context, String str, String str2, final String str3, final String str4, String str5, final String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65e059c", new Object[]{this, context, str, str2, str3, str4, str5, str6});
        } else if (StringUtils.isEmpty(str2) && StringUtils.isEmpty(str3) && StringUtils.isEmpty(str4) && StringUtils.isEmpty(str5) && StringUtils.isEmpty(str6)) {
        } else {
            final String a2 = a(str);
            final String a3 = a(str2);
            final String a4 = a(str5);
            AsyncTask.execute(new Runnable() { // from class: tb.efo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        new ebz(context).a(a2, a3, dyw.a(str3, "UTF-8"), str4, a4, str6);
                    }
                }
            });
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : StringUtils.isEmpty(str) ? "" : str;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
