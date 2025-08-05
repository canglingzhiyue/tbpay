package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.ui.component.VideoFrame;

/* loaded from: classes8.dex */
public class lre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f30854a;
    private final VideoFrame b;
    private final Context c;
    private lmy d;

    static {
        kge.a(635512448);
    }

    public lre(a aVar, Context context, VideoFrame videoFrame) {
        this.f30854a = aVar;
        this.b = videoFrame;
        this.c = context;
        b();
    }

    public lmy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lmy) ipChange.ipc$dispatch("f076506", new Object[]{this}) : this.d;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (a(this.f30854a)) {
            this.d = new luc(this.f30854a, this.c, this.b);
        } else {
            this.d = new lrd(this.f30854a, this.c, this.b);
        }
    }

    private boolean a(a aVar) {
        ATaoLiveOpenEntity o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18197561", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar != null && (o = aVar.o()) != null && o.abilityCompontent != null) {
            return o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_SpecialSmallWindow);
        }
        return false;
    }
}
