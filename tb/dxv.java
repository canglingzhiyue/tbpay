package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.listview.DetailListView;

/* loaded from: classes4.dex */
public abstract class dxv implements dxw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_TAG = "AuraPageScrollManager";

    /* renamed from: a  reason: collision with root package name */
    public DetailListView.b f27077a;
    public a b = new a();

    static {
        kge.a(1370865867);
        kge.a(2107995074);
    }

    public RecyclerView.OnScrollListener a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("d711d16", new Object[]{this}) : this.b;
    }

    /* loaded from: classes4.dex */
    public class a extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f27078a = 0;

        static {
            kge.a(-1769675284);
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            }
        }

        public a() {
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            int i3 = this.f27078a + i2;
            if (dxv.this.f27077a != null) {
                dxv.this.f27077a.a(i3, this.f27078a);
            }
            this.f27078a = i3;
        }
    }
}
