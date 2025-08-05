package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.layer.h5.a;
import com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView;
import com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class qdj extends pgm<Object> implements a.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f32904a;
    private final com.taobao.tab2interact.core.layer.h5.a b;

    /* loaded from: classes8.dex */
    public static final class a extends ShortVideoTabMessageObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1721649783) {
                super.f((String) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver
        public void f(String tabId) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("669e4a77", new Object[]{this, tabId});
                return;
            }
            q.d(tabId, "tabId");
            super.f(tabId);
            if (!skq.d()) {
                return;
            }
            qdj.a(qdj.this, tabId);
        }
    }

    static {
        kge.a(-579082489);
        kge.a(-638741581);
    }

    public static /* synthetic */ Object ipc$super(qdj qdjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2012643660) {
            super.c((String) objArr[0]);
            return null;
        } else if (hashCode != -227024002) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.c((String) objArr[0], (String) objArr[1]);
            return null;
        }
    }

    @Override // tb.pbu
    public Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("50c537a7", new Object[]{this});
        }
        return null;
    }

    public static final /* synthetic */ void a(qdj qdjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762d464b", new Object[]{qdjVar, str});
        } else {
            qdjVar.g(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdj(sus messageCenter, com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager, est tabBaseInfoManager, com.taobao.tab2interact.core.layer.h5.a h5InteractLayer) {
        super(messageCenter, baseInfoManager, tabBaseInfoManager);
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        q.d(tabBaseInfoManager, "tabBaseInfoManager");
        q.d(h5InteractLayer, "h5InteractLayer");
        this.b = h5InteractLayer;
        this.f32904a = new a();
        this.b.a(this);
    }

    @Override // tb.pbu, tb.suv
    public void c(String tabId, String tabType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, tabId, tabType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabType, "tabType");
        super.c(tabId, tabType);
        if (!a(tabId)) {
            return;
        }
        h(tabId);
    }

    @Override // tb.pbu, tb.suv
    public void c(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, tabId});
            return;
        }
        q.d(tabId, "tabId");
        super.c(tabId);
        if (!a(tabId)) {
            return;
        }
        i(tabId);
    }

    private final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        List<String> j = skq.j();
        if (j == null || !j.contains(str)) {
            return;
        }
        this.b.z();
    }

    @Override // com.taobao.tab2interact.core.layer.h5.a.e
    public void a(H5InteractLayerWebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a4ed01", new Object[]{this, webView});
            return;
        }
        q.d(webView, "webView");
        webView.setTag(R.id.h5_interact_layer_short_video_tab_base_info_manager_tag, h());
    }

    private final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(suz.FIRST_FRAME_RENDER_FINISH_NAME);
        sva.INSTANCE.a(f(), g(), str, arrayList, this.f32904a, h());
    }

    private final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            sva.INSTANCE.a(f(), g(), str, this.f32904a, h());
        }
    }
}
