package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.card.cards.web.a;
import java.util.List;

/* loaded from: classes5.dex */
public class rfd extends ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33102a;
    private final WVUCWebView b;
    private final a c;

    static {
        kge.a(-947544868);
    }

    public static /* synthetic */ Object ipc$super(rfd rfdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public rfd(WVUCWebView wVUCWebView, a aVar) {
        this.b = wVUCWebView;
        this.c = aVar;
    }

    @Override // tb.ptk, tb.spx
    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if (spyVar.c.equals("registerfilter")) {
            List c = c(spyVar);
            if (c == null) {
                return;
            }
            a(c);
        } else if (this.b == null) {
        } else {
            if (this.i == 2) {
                try {
                    this.c.a_("videomsg", (JSONObject) spyVar.a());
                } catch (Exception e) {
                    spz.a("WebCardH5MessageHandler", "", e);
                }
            } else if (this.i == 3 || this.i == 4) {
            } else {
                if (this.f.size() < 200) {
                    this.f.add(spyVar);
                } else {
                    spz.c("WebCardH5MessageHandler", "pendingMsg reach 200");
                }
            }
        }
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue() : (!spyVar.c.equals("registerfilter") || b(spyVar.d)) && this.j.contains(spyVar.c) && (spyVar.d.equals(this.g) || "VSMSG_syncPageMap".equals(spyVar.c) || "VSMSG_syncProcessMap".equals(spyVar.c));
    }

    private void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (!this.j.isEmpty()) {
        } else {
            this.j.addAll(list);
            c();
            b();
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.i != 2 || this.f.isEmpty()) {
            return false;
        }
        for (spy spyVar : this.f) {
            if (this.j.contains(spyVar.c) && b(spyVar.d)) {
                try {
                    this.c.a_("videomsg", (JSONObject) spyVar.a());
                } catch (Exception e) {
                    spz.a("WebCardH5MessageHandler", "", e);
                }
            }
        }
        this.f.clear();
        return true;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f33102a || this.j.isEmpty()) {
        } else {
            this.i = 2;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f33102a = z;
        c();
    }
}
