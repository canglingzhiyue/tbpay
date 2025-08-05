package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.tab2liveroom.liveroom.a;
import com.taobao.android.tab2liveroom.liveroom.d;
import com.taobao.taolive.room.openarchitecture.listener.impl.access.ITab2MoreLiveGuideClickListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class mqo extends ssr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31200a;
    private ITab2MoreLiveGuideClickListener b;

    static {
        kge.a(1140501275);
    }

    public static /* synthetic */ Object ipc$super(mqo mqoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ a a(mqo mqoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b4712607", new Object[]{mqoVar}) : mqoVar.f31200a;
    }

    public mqo(a aVar) {
        this.f31200a = aVar;
        a((tef) new mqp(aVar));
    }

    @Override // tb.ssr
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f();
        }
    }

    @Override // tb.ssr
    public Map dD_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("777cbcbb", new Object[]{this}) : g();
    }

    @Override // tb.ssr
    public Map<String, String> dI_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("fda5ec96", new Object[]{this}) : this.f31200a.A();
    }

    @Override // tb.ssr
    public boolean dB_() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fdf3bcc", new Object[]{this})).booleanValue();
        }
        if (this.f31200a.f() != null && this.f31200a.f().a()) {
            z = true;
        }
        ogg.c(a.TAG, "enableMoreLive:" + z);
        return z;
    }

    @Override // tb.ssr
    public Object dC_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bbf7dab", new Object[]{this});
        }
        if (!dB_()) {
            return null;
        }
        return h();
    }

    @Override // tb.ssr
    public void a(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
        } else {
            this.f31200a.a(map, map2);
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ogg.c(a.TAG, "onFloatViewShow");
        HashMap hashMap = new HashMap();
        hashMap.put("isShow", String.valueOf(true));
        this.f31200a.b("onFloatViewShow", hashMap);
    }

    private Map g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.f31200a.e();
    }

    private Object h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6adc2223", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (this.b == null) {
            this.b = new ITab2MoreLiveGuideClickListener() { // from class: tb.mqo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.openarchitecture.listener.impl.access.ITab2MoreLiveGuideClickListener
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    mqo.a(mqo.this).b("onMoreLiveClick", (Map) null);
                    ogg.c(a.TAG, "更多直播点击");
                }
            };
        }
        hashMap.put(DataReceiveMonitor.CB_LISTENER, this.b);
        return hashMap;
    }

    @Override // tb.ssr
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            d.a(this.f31200a, obj);
        }
    }

    @Override // tb.ssr
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            d.b(this.f31200a, obj);
        }
    }
}
