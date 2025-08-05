package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.basic.GetCommonTrackArgsEvent;
import com.taobao.android.detail.core.event.basic.b;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.c;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class eej extends eei<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27232a;

    static {
        kge.a(1344814078);
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.event.subscriber.basic.DisappearTrackSubscriber";
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((b) event);
    }

    public eej(DetailCoreActivity detailCoreActivity) {
        this.f27232a = detailCoreActivity;
    }

    public i a(final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f510049f", new Object[]{this, bVar});
        }
        if (bVar.f9696a == null || bVar.f9696a.isEmpty()) {
            return a.SUCCESS;
        }
        f.a(this.f27232a, new GetCommonTrackArgsEvent(), new c<com.taobao.android.detail.core.event.basic.f>() { // from class: tb.eej.1
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
                    HashMap hashMap = new HashMap(bVar.f9696a);
                    if (fVar.f9701a != null) {
                        hashMap.putAll(fVar.f9701a);
                    }
                    String str = (String) hashMap.get("trackPage");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    eps.b("Page_Detail", 2201, str, null, null, ect.a(hashMap));
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
