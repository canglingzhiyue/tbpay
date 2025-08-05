package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;

/* loaded from: classes4.dex */
public class dee implements ded {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ded f26716a;

    static {
        kge.a(-782547489);
        kge.a(231991577);
    }

    public dee(Context context) {
        this(context, false, false);
    }

    public dee(Context context, boolean z, boolean z2) {
        String str;
        boolean aH = u.aH();
        q.b("FrameInstaller", "enableComponentDelayLoad = " + aH + " " + z);
        if (aH) {
            this.f26716a = new deg(context, z, z2);
        } else {
            this.f26716a = new def(context);
        }
        if (b.d(context)) {
            if (aH || z) {
                str = "延迟加载组件方式 " + aH + " " + z;
            } else {
                str = "普通加载组件方式";
            }
            Toast.makeText(context, str, 0).show();
        }
    }

    @Override // tb.ded
    public void a(ddy ddyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f2bc3f", new Object[]{this, ddyVar});
            return;
        }
        ded dedVar = this.f26716a;
        if (dedVar == null) {
            return;
        }
        dedVar.a(ddyVar);
    }

    @Override // tb.ded
    public void b(ddy ddyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d375c2c0", new Object[]{this, ddyVar});
            return;
        }
        ded dedVar = this.f26716a;
        if (dedVar == null) {
            return;
        }
        dedVar.b(ddyVar);
    }

    @Override // tb.ded
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ded dedVar = this.f26716a;
        if (dedVar == null) {
            return;
        }
        dedVar.a();
    }

    @Override // tb.ded
    public ded a(BaseFrame baseFrame, String str, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("859edb4b", new Object[]{this, baseFrame, str, viewStub});
        }
        ded dedVar = this.f26716a;
        return dedVar != null ? dedVar.a(baseFrame, str, viewStub) : this;
    }

    @Override // tb.ded
    public ded a(BaseFrame baseFrame, String str, ViewStub viewStub, dec decVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("23a9d45d", new Object[]{this, baseFrame, str, viewStub, decVar});
        }
        ded dedVar = this.f26716a;
        return dedVar != null ? dedVar.a(baseFrame, str, viewStub, decVar) : this;
    }

    @Override // tb.ded
    public ded a(BaseFrame baseFrame, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("e3d648fd", new Object[]{this, baseFrame, str, view});
        }
        ded dedVar = this.f26716a;
        return dedVar != null ? dedVar.a(baseFrame, str, view) : this;
    }

    @Override // tb.ded
    public ded a(BaseFrame baseFrame, String str, View view, dec decVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("95b9700f", new Object[]{this, baseFrame, str, view, decVar});
        }
        ded dedVar = this.f26716a;
        return dedVar != null ? dedVar.a(baseFrame, str, view, decVar) : this;
    }

    @Override // tb.ded
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ded dedVar = this.f26716a;
        if (dedVar == null) {
            return;
        }
        dedVar.b();
    }

    @Override // tb.ded
    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        ded dedVar = this.f26716a;
        if (dedVar == null) {
            return 0L;
        }
        return dedVar.b(str);
    }

    @Override // tb.ded
    public ddy e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ddy) ipChange.ipc$dispatch("2dca35c1", new Object[]{this});
        }
        ded dedVar = this.f26716a;
        if (dedVar == null) {
            return null;
        }
        return dedVar.e();
    }

    @Override // tb.ded
    public ddy d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ddy) ipChange.ipc$dispatch("26189062", new Object[]{this});
        }
        ded dedVar = this.f26716a;
        if (dedVar == null) {
            return null;
        }
        return dedVar.d();
    }
}
