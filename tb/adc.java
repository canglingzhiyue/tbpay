package tb;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.vfw.viewholder.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class adc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RecyclerView b;
    private bey c = new bey() { // from class: tb.adc.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bey
        public void a(List<IDMComponent> list, final h hVar, final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a187007", new Object[]{this, list, hVar, new Integer(i)});
                return;
            }
            IDMComponent iDMComponent = list.get(i);
            if (iDMComponent == null) {
                return;
            }
            if (iDMComponent.getStatus() == 2) {
                hVar.itemView.post(new Runnable() { // from class: tb.adc.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            adc.a(adc.this).put(Integer.valueOf(i), Integer.valueOf(hVar.itemView.getMeasuredHeight()));
                        }
                    }
                });
            } else {
                adc.a(adc.this).put(Integer.valueOf(i), 0);
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Integer> f25261a = new HashMap();

    static {
        kge.a(-1590886247);
    }

    public static /* synthetic */ Map a(adc adcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6ebc026d", new Object[]{adcVar}) : adcVar.f25261a;
    }

    public adc(RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    public bey a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bey) ipChange.ipc$dispatch("f02bb48", new Object[]{this}) : this.c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : a(((LinearLayoutManager) this.b.getLayoutManager()).findFirstVisibleItemPosition());
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (i < 0) {
            return 0;
        }
        Map<Integer, Integer> map = this.f25261a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += map.get(Integer.valueOf(i3)) != null ? map.get(Integer.valueOf(i3)).intValue() : 0;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (i == findFirstVisibleItemPosition && findViewByPosition != null) {
            i2 -= (int) findViewByPosition.getY();
        }
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : ((LinearLayoutManager) this.b.getLayoutManager()).findFirstVisibleItemPosition() > 0 || a(0) > 0;
    }
}
