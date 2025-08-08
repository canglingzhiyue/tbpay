package com.taobao.ask.utils;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import tb.esr;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, BitmapDrawable bitmapDrawable);
    }

    static {
        kge.a(182962012);
    }

    public static final void a(Context context, String str, int i, int i2, final a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c8a37e", new Object[]{context, str, new Integer(i), new Integer(i2), aVar});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (str.endsWith(".gif") || str.endsWith(".apng") || str.endsWith("apng.png") || str.endsWith("9.png")) {
                z = false;
            }
            if (z) {
                str = a(str, i, i2);
            }
            PhenixCreator a2 = b.h().a(context).a((String) null, str);
            a2.addLoaderExtra(esr.BUNDLE_BIZ_CODE, "87").memOnly(false).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.ask.utils.e.2
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
                    if (a.this != null) {
                        failPhenixEvent.getResultCode();
                    }
                    failPhenixEvent.getTicket().a(true);
                    return false;
                }
            }).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.ask.utils.e.1
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
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                        a aVar2 = a.this;
                        if (aVar2 != null) {
                            if (drawable instanceof com.taobao.phenix.animate.b) {
                                aVar2.a(succPhenixEvent.getUrl(), new com.taobao.android.layoutmanager.adapter.impl.b((com.taobao.phenix.animate.b) drawable));
                            } else {
                                aVar2.a(succPhenixEvent.getUrl(), drawable);
                            }
                        }
                        succPhenixEvent.getTicket().a(true);
                    }
                    return true;
                }
            });
            a2.fetch();
        }
    }

    private static String a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a4672ce", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        ImageStrategyConfig.a a2 = ImageStrategyConfig.a("guangguang", "87");
        a2.a(TaobaoImageUrlStrategy.ImageQuality.q90);
        a2.g(true);
        return ImageStrategyDecider.decideUrl(str, Integer.valueOf(i), Integer.valueOf(i2), a2.a());
    }
}
