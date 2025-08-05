package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import java.util.Map;

/* loaded from: classes6.dex */
public class mqp extends tef {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f31202a;

    static {
        kge.a(1345592717);
    }

    public static /* synthetic */ Object ipc$super(mqp mqpVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1507519932:
                super.a(objArr[0]);
                return null;
            case -262755451:
                super.b(objArr[0]);
                return null;
            case 266696897:
                super.a(objArr[0], (Map) objArr[1]);
                return null;
            case 982009030:
                super.c(objArr[0]);
                return null;
            case 1115859567:
                return super.a((Activity) objArr[0]);
            case 1707848462:
                super.a(objArr[0], (String) objArr[1]);
                return null;
            case 2110740476:
                return super.d(objArr[0]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public mqp(a aVar) {
        this.f31202a = aVar;
    }

    private Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f31202a.getNode();
    }

    @Override // tb.tef
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
        } else if (oeb.a("enableLiveAppearTrack", true)) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(a(), str);
        } else {
            super.a(obj, str);
        }
    }

    @Override // tb.tef
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (oeb.a("enableLiveAppearTrack", true)) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(a(), (String) null);
        } else {
            super.a(obj);
        }
    }

    @Override // tb.tef
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else if (oeb.a("enableLiveAppearTrack", true)) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().d(a(), null);
        } else {
            super.b(obj);
        }
    }

    @Override // tb.tef
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        } else if (oeb.a("enableLiveAppearTrack", true)) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(a());
        } else {
            super.c(obj);
        }
    }

    @Override // tb.tef
    public void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
        } else if (oeb.a("enableLiveAppearTrack", true)) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(a(), map);
        } else {
            super.a(obj, map);
        }
    }

    @Override // tb.tef
    public Map<String, String> d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7dcf57fc", new Object[]{this, obj});
        }
        if (oeb.a("enableGetLiveProperties", true)) {
            return com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().g(a());
        }
        return super.d(obj);
    }

    @Override // tb.tef
    public Map<String, String> a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4282aa6f", new Object[]{this, activity});
        }
        if (oeb.a("enableGetAllLiveProperties", true)) {
            return com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(activity);
        }
        return super.a(activity);
    }
}
