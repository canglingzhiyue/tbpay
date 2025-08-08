package com.taobao.avplayer;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.aq;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import tb.kge;

/* loaded from: classes6.dex */
public class r implements aq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1642500134);
        kge.a(1326168791);
    }

    @Override // com.taobao.avplayer.aq
    public void a(String str, View view, final aq.a aVar, final aq.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af1d518", new Object[]{this, str, view, aVar, aVar2});
            return;
        }
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWImageLoaderAdapter);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        PhenixCreator a2 = com.taobao.phenix.intf.b.h().a(str);
        if (view != null) {
            a2 = a2.limitSize(view);
        }
        if (aVar != null) {
            a2 = a2.succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.avplayer.r.1
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
                    if (succPhenixEvent != null) {
                        aq.b bVar = new aq.b();
                        bVar.f16468a = succPhenixEvent.getDrawable();
                        aVar.a(bVar);
                    }
                    return true;
                }
            });
        }
        if (aVar2 != null) {
            a2 = a2.failListener(new a<FailPhenixEvent>() { // from class: com.taobao.avplayer.r.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    aVar2.a(null);
                    return true;
                }
            });
        }
        a2.fetch();
    }
}
