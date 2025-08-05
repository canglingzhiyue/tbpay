package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.model.viewmodel.main.c;
import com.taobao.android.detail.wrapper.ext.request.o2o.QueryO2OData;
import com.taobao.android.trade.boost.request.mtop.a;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class fbq extends eap<fcb> implements a<QueryO2OData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(973107165);
        kge.a(1595456606);
    }

    public static /* synthetic */ Object ipc$super(fbq fbqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((QueryO2OData) obj);
        }
    }

    public fbq(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.DinamicO2OViewHolder");
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (this.b instanceof ViewGroup) {
            ((ViewGroup) this.b).removeAllViews();
            this.b.setVisibility(8);
        }
        this.h = 3;
    }

    @Override // tb.eap
    public boolean a(fcb fcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e843e177", new Object[]{this, fcbVar})).booleanValue();
        }
        if (this.c != 0) {
            if (((fcb) this.c).f27779a != null) {
                return true;
            }
            ((fcb) this.c).a(this.f9568a, this);
        }
        return false;
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            k();
        }
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else {
            k();
        }
    }

    public void a(QueryO2OData queryO2OData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e373d251", new Object[]{this, queryO2OData});
        } else if (queryO2OData == null || queryO2OData.model == null) {
            k();
        } else {
            a(queryO2OData.model);
            try {
                if (queryO2OData.model.size() <= 0) {
                    return;
                }
                if (((fcb) this.c).component != null) {
                    ((fcb) this.c).component.mapping.put("data", (Object) queryO2OData.model);
                    if (((fcb) this.c).e != null) {
                        for (Map.Entry<String, Object> entry : ((fcb) this.c).e.entrySet()) {
                            entry.setValue(epz.a(((fcb) this.c).mNodeBundle.a(), entry.getValue()));
                        }
                        ((fcb) this.c).component.mapping.put("event", (Object) ((fcb) this.c).e);
                    }
                } else if (((fcb) this.c).dmComponent != null && ((fcb) this.c).i != null) {
                    ((fcb) this.c).i.put("data", (Object) queryO2OData.model);
                    if (((fcb) this.c).e != null) {
                        for (Map.Entry<String, Object> entry2 : ((fcb) this.c).e.entrySet()) {
                            entry2.setValue(epz.a(((fcb) this.c).mNodeBundle.a(), entry2.getValue()));
                        }
                        ((fcb) this.c).i.put("event", (Object) ((fcb) this.c).e);
                    }
                }
                b((fbq) ((c) this.c));
            } catch (Exception unused) {
            }
        }
    }
}
