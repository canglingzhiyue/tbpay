package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;

/* loaded from: classes6.dex */
public class jtu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f29767a;
    private final ParentRecyclerView b;
    private RecyclerView c;
    private osd d;
    private boolean e = false;
    private final String f;

    static {
        kge.a(-1460311128);
    }

    public static /* synthetic */ void a(jtu jtuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00f768d", new Object[]{jtuVar});
        } else {
            jtuVar.e();
        }
    }

    public jtu(ParentRecyclerView parentRecyclerView, String str) {
        this.b = parentRecyclerView;
        this.f29767a = this.b.getContext();
        this.f = str;
        d();
    }

    public RecyclerView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("f629a75c", new Object[]{this}) : this.c;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = osd.a(ksk.REC_ORDER_DETAIL, this.f);
        this.d.a(new osb() { // from class: tb.jtu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.osc
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    jtu.a(jtu.this);
                }
            }

            @Override // tb.osc
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    arc.a().b("IRecommendCallback error");
                }
            }
        });
        this.c = this.d.a(this.f29767a);
    }

    private void e() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null || (recyclerView = this.c) == null) {
        } else {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = gbg.c(this.f29767a);
                this.c.setLayoutParams(layoutParams);
            } else {
                this.c.setLayoutParams(new RecyclerView.LayoutParams(-1, gbg.c(this.f29767a)));
            }
            RecyclerView recyclerView2 = this.c;
            if (recyclerView2 instanceof ChildRecyclerView) {
                this.b.setNestedScrollChild((mya) recyclerView2);
                ((ChildRecyclerView) this.c).setNestedScrollParent(this.b);
            }
            this.e = true;
            this.b.resetScroll();
            this.c.getAdapter().notifyDataSetChanged();
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.d == null || this.e) {
        } else {
            this.d.c(new JSONObject(jSONObject));
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        osd osdVar = this.d;
        if (osdVar == null) {
            return;
        }
        osdVar.e();
        this.d.a((osc) null);
    }
}
