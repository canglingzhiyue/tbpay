package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.activity.base.BaseActivity;
import com.taobao.android.detail.core.detail.controller.callback.e;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.basic.i;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes4.dex */
public class een implements e.c, j<i> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LocalRefreshDataSubscriber";
    public String UNKNOW_ERR = b.a(R.string.taodetail_server_busy);

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27238a;
    private dya b;
    private String c;

    static {
        kge.a(-1107596464);
        kge.a(-1453870097);
        kge.a(559299252);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ com.taobao.android.trade.event.i handleEvent(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, iVar}) : a(iVar);
    }

    public een(DetailCoreActivity detailCoreActivity) {
        this.f27238a = detailCoreActivity;
        emu.a("com.taobao.android.detail.core.event.subscriber.basic.LocalRefreshDataSubscriber");
    }

    public com.taobao.android.trade.event.i a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("7ea6cd26", new Object[]{this, iVar});
        }
        this.b = this.f27238a.y();
        if (StringUtils.isEmpty(iVar.b) && !StringUtils.isEmpty(iVar.f9704a)) {
            this.c = iVar.f9704a;
            a(this.b, iVar.f9704a);
        }
        return a.SUCCESS;
    }

    private boolean a(dya dyaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57707ba", new Object[]{this, dyaVar, str})).booleanValue();
        }
        com.taobao.android.detail.core.utils.i.a("MDS", eeq.TAG);
        try {
            if (this.f27238a.o() != null) {
                this.f27238a.o().setVisibility(0);
            }
            e eVar = new e(this.f27238a, epo.f(), this);
            com.taobao.android.detail.core.utils.i.a("MDS", "start refresh");
            if (dyaVar != null) {
                dyaVar.a((f) null);
            }
            eVar.a(str, (Map<String, String>) null);
            return true;
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(TAG, eeq.TAG, e);
            if (this.f27238a.o() != null) {
                this.f27238a.o().setVisibility(8);
            }
            return false;
        }
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public boolean a(MtopResponse mtopResponse, BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db408649", new Object[]{this, mtopResponse, baseActivity})).booleanValue();
        }
        if (mtopResponse == null) {
            epo.a(this.UNKNOW_ERR);
            return true;
        } else if (mtopResponse.isApiSuccess()) {
            return false;
        } else {
            if (mtopResponse.isSessionInvalid()) {
                return true;
            }
            if (mtopResponse.isNetworkError() && !NetworkUtils.a(epo.a())) {
                com.taobao.android.detail.core.detail.kit.view.widget.base.a aVar = new com.taobao.android.detail.core.detail.kit.view.widget.base.a(baseActivity, baseActivity);
                aVar.a((String) null);
                aVar.a();
                return true;
            }
            epo.a(b.a(R.string.taodetail_server_busy));
            return true;
        }
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
    public void a(enh enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e72cc599", new Object[]{this, enhVar});
        } else if (enhVar == null || enhVar.b == null) {
        } else {
            com.taobao.android.detail.core.utils.i.a("MDS", "RefreshDetailSubscriber refresh");
            dya dyaVar = this.b;
            if (dyaVar == null) {
                return;
            }
            dyaVar.a(enhVar.b, false);
        }
    }

    @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse, this.f27238a);
        }
    }
}
