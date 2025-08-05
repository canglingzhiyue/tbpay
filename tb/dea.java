package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;

/* loaded from: classes4.dex */
public abstract class dea implements ded {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ddy f26715a;
    public ddy b;
    private Context c;

    static {
        kge.a(2092237858);
        kge.a(231991577);
    }

    @Override // tb.ded
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.ded
    public long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue();
        }
        return 0L;
    }

    @Override // tb.ded
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public dea(Context context) {
        this.c = context;
    }

    @Override // tb.ded
    public void a(ddy ddyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f2bc3f", new Object[]{this, ddyVar});
        } else {
            this.f26715a = ddyVar;
        }
    }

    @Override // tb.ded
    public void b(ddy ddyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d375c2c0", new Object[]{this, ddyVar});
        } else {
            this.b = ddyVar;
        }
    }

    @Override // tb.ded
    public final ded a(BaseFrame baseFrame, String str, ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ded) ipChange.ipc$dispatch("859edb4b", new Object[]{this, baseFrame, str, viewStub}) : a(baseFrame, str, viewStub, (dec) null);
    }

    @Override // tb.ded
    public ded a(BaseFrame baseFrame, String str, ViewStub viewStub, dec decVar) {
        BaseFrame a2;
        boolean createView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("23a9d45d", new Object[]{this, baseFrame, str, viewStub, decVar});
        }
        if (!TextUtils.isEmpty(str) && (a2 = this.f26715a.a(str)) != null) {
            if (decVar != null) {
                decVar.a(a2);
            }
            if (a2.lazyInflate()) {
                createView = a2.keepViewStubWithoutInflate(viewStub);
            } else {
                createView = a2.createView(viewStub);
            }
            if (createView) {
                baseFrame.addComponent(a2);
            }
            if (decVar != null) {
                decVar.b(a2);
            }
        }
        return this;
    }

    @Override // tb.ded
    public ded a(BaseFrame baseFrame, String str, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ded) ipChange.ipc$dispatch("e3d648fd", new Object[]{this, baseFrame, str, view}) : a(baseFrame, str, view, (dec) null);
    }

    @Override // tb.ded
    public ded a(BaseFrame baseFrame, String str, View view, dec decVar) {
        BaseFrame a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ded) ipChange.ipc$dispatch("95b9700f", new Object[]{this, baseFrame, str, view, decVar});
        }
        if (!TextUtils.isEmpty(str) && (a2 = this.b.a(str)) != null) {
            if (decVar != null) {
                decVar.a(a2);
            }
            if (view != null && view.getParent() != null) {
                if (view instanceof ViewStub) {
                    a2.onCreateView((ViewStub) view);
                } else if (view instanceof ViewGroup) {
                    a2.onCreateView2((ViewGroup) view);
                }
                baseFrame.addComponent(a2);
                if (decVar != null) {
                    decVar.b(a2);
                }
            } else {
                pqi a3 = pqi.a();
                a3.a("installTBOldFrame", view + "view or view.getParent() is null", str);
            }
        }
        return this;
    }

    @Override // tb.ded
    public ddy d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddy) ipChange.ipc$dispatch("26189062", new Object[]{this}) : this.b;
    }

    @Override // tb.ded
    public ddy e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddy) ipChange.ipc$dispatch("2dca35c1", new Object[]{this}) : this.f26715a;
    }
}
