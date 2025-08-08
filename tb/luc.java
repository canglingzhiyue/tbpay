package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.playcontrol.c;
import com.taobao.taolive.sdk.playcontrol.d;
import com.taobao.taolive.sdk.ui.component.VideoFrame;
import com.taobao.taolive.sdk.utils.m;
import com.taobao.taolive.sdk.utils.o;

/* loaded from: classes8.dex */
public class luc extends lrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d.a d;

    static {
        kge.a(-630185400);
    }

    public static /* synthetic */ Object ipc$super(luc lucVar, String str, Object... objArr) {
        if (str.hashCode() == -940402974) {
            super.a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public luc(a aVar, Context context, VideoFrame videoFrame) {
        super(aVar, context, videoFrame);
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d();
        c.a(this.f30851a, this.d);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.d != null) {
        } else {
            this.d = new d.a() { // from class: tb.luc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.playcontrol.d.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        luc.this.b();
                    }
                }
            };
        }
    }

    @Override // tb.lrd, tb.lmy
    public void a(String str, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f296e2", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (z3 || f()) {
            b(str, z, z2, e());
        } else {
            super.a(str, z, z2, false);
        }
    }

    @Override // tb.lrd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!c.j(this.f30851a)) {
        } else {
            m.a("Tab2HalfScreenSmallWindowImpl", "destroySmallWindow");
            c.l(this.f30851a);
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : o.N();
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (!o.R()) {
            return false;
        }
        String g = g();
        m.a("Tab2HalfScreenSmallWindowImpl", "insideDetailFlag:" + g);
        return !StringUtils.isEmpty(g);
    }

    private String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        if (this.f30851a == null) {
            return null;
        }
        String N = this.f30851a.N();
        this.f30851a.d((String) null);
        return N;
    }
}
