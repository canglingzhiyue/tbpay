package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.basic.GetCommonTrackArgsEvent;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.c;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class eek implements j<enp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27234a;

    static {
        kge.a(-124201922);
        kge.a(-1453870097);
    }

    public static /* synthetic */ DetailCoreActivity a(eek eekVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("7ab627f8", new Object[]{eekVar}) : eekVar.f27234a;
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(enp enpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, enpVar}) : a(enpVar);
    }

    public eek(DetailCoreActivity detailCoreActivity) {
        this.f27234a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.basic.ExposureTrackSubscriber");
    }

    public i a(final enp enpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("ce836abe", new Object[]{this, enpVar});
        }
        if (enpVar.f27473a == null || enpVar.f27473a.isEmpty()) {
            return a.SUCCESS;
        }
        f.a(this.f27234a, new GetCommonTrackArgsEvent(), new c<com.taobao.android.detail.core.event.basic.f>() { // from class: tb.eek.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.event.c
            public void onEventException(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                }
            }

            @Override // com.taobao.android.trade.event.c
            public void a(com.taobao.android.detail.core.event.basic.f fVar, j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e6473e04", new Object[]{this, fVar, jVar});
                } else if (!fVar.a()) {
                } else {
                    HashMap hashMap = new HashMap(enpVar.f27473a);
                    if (fVar.f9701a != null) {
                        hashMap.putAll(fVar.f9701a);
                    }
                    String str = (String) hashMap.get("trackPage");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    eps.a(eek.a(eek.this), "Page_Detail", 2201, str, null, null, ect.a(hashMap));
                }
            }
        });
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
