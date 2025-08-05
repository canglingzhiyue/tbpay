package tb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.base.widget.RoundRectCardRoot;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import com.taobao.android.detail2.core.optimize.prerender.b;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fhp extends fho {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEWHOLDER_KEY = "superItem";
    public static fma d;

    public fhp(View view, ViewGroup viewGroup, fmd fmdVar, b bVar, b.C0469b c0469b) {
        super(view, viewGroup, fmdVar, bVar, c0469b);
    }

    static {
        kge.a(-1612883619);
        d = new fma() { // from class: tb.fhp.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fma
            public /* synthetic */ RecyclerView.ViewHolder b(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("64003461", new Object[]{this, viewGroup, fmdVar, bVar}) : a(viewGroup, fmdVar, bVar);
            }

            public d a(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (d) ipChange.ipc$dispatch("36c29940", new Object[]{this, viewGroup, fmdVar, bVar});
                }
                ctu.a("SuperItemViewHolder_inflate");
                b.C0469b b = com.taobao.android.detail2.core.optimize.prerender.b.a().b();
                if (b == null || b.a() == null || !bVar.h().r().e(bVar.h().k().W)) {
                    fjt.a(fjt.TAG_RENDER, "SuperItemViewHolder create");
                    RoundRectCardRoot roundRectCardRoot = (RoundRectCardRoot) LayoutInflater.from(bVar.g()).inflate(R.layout.detail_half_screen_layout, viewGroup, false).findViewById(R.id.half_screen_round_root);
                    fhp fhpVar = new fhp(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_card_layout, (ViewGroup) roundRectCardRoot, true), roundRectCardRoot, fmdVar, bVar, null);
                    ctu.a();
                    return fhpVar;
                }
                fjt.a(fjt.TAG_RENDER, "SuperItemViewHolder async create");
                synchronized (b.a()) {
                    try {
                        if (b.b() == null) {
                            b.a().wait(1000L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        fjt.a(fjt.TAG_RENDER, "主线程被中断");
                    }
                }
                b.a(bVar.g());
                fjt.a(fjt.TAG_RENDER, "SuperItemViewHolder 更新上下文");
                fhp fhpVar2 = new fhp(b.b(), (ViewGroup) b.b(), fmdVar, bVar, b);
                ctu.a();
                return fhpVar2;
            }
        };
    }

    @Override // tb.fho
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.b.setImageDrawable(fme.a(this.j));
        }
    }
}
