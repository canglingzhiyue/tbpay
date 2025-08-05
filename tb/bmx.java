package tb;

import com.alibaba.android.ultron.trade.event.a;
import com.alibaba.android.ultron.trade.event.b;
import com.alibaba.android.ultron.trade.event.c;
import com.alibaba.android.ultron.trade.event.e;
import com.alibaba.android.ultron.trade.event.f;
import com.alibaba.android.ultron.trade.event.g;
import com.alibaba.android.ultron.trade.event.h;
import com.alibaba.android.ultron.trade.event.i;
import com.alibaba.android.ultron.trade.event.j;
import com.alibaba.android.ultron.trade.event.k;
import com.alibaba.android.ultron.trade.event.l;
import com.alibaba.android.ultron.trade.event.m;
import com.alibaba.android.ultron.trade.event.n;
import com.alibaba.android.ultron.trade.event.o;
import com.alibaba.android.ultron.trade.event.p;
import com.alibaba.android.ultron.trade.event.q;
import com.alibaba.android.ultron.trade.event.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class bmx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Class<? extends bmy>> f25990a;

    static {
        kge.a(-425882090);
        HashMap hashMap = new HashMap();
        f25990a = hashMap;
        hashMap.put("openUrl", o.class);
        f25990a.put("openUrlResult", n.class);
        f25990a.put("openPopupWindow", k.class);
        f25990a.put(ThemisConfig.SCENE_SELECT, q.class);
        f25990a.put("input", i.class);
        f25990a.put("closePopupWindow", e.class);
        f25990a.put("confirmPopupWindow", f.class);
        f25990a.put("autoJumpOpenUrl", c.class);
        f25990a.put("autoJumpOpenUrlResult", b.class);
        f25990a.put("adjustAndOpenPopupWindow", a.class);
        f25990a.put("userTrack", r.class);
        f25990a.put("openSimplePopup", m.class);
        f25990a.put("openSimpleGroupPopup", l.class);
        f25990a.put("popupSelect", p.class);
        f25990a.put("confirmSimplePopup", g.class);
        f25990a.put(axn.EVENT_TYPE, bnc.class);
        f25990a.put("postMessage", bnb.class);
        f25990a.put("hideItem", h.class);
        f25990a.put("openPop", j.class);
    }

    public static Map<String, Class<? extends bmy>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : f25990a;
    }
}
