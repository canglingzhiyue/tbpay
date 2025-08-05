package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;

/* loaded from: classes7.dex */
public class lqa implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BaseSectionModel f30813a;
    private BaseSectionModel b;
    private lpy c = new lpy();
    private ljs d;

    static {
        kge.a(691417128);
        kge.a(-1201612728);
    }

    public lqa(ljs ljsVar, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        this.f30813a = baseSectionModel2;
        this.b = baseSectionModel;
        this.d = ljsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        BaseItemModel mo1097getItem = this.f30813a.mo1097getItem();
        if (mo1097getItem == null || (jSONObject = mo1097getItem.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR)) == null) {
            return;
        }
        this.c.a(this.f30813a, jSONObject);
        a();
        liw.b(this.b, jSONObject);
        ldi.a(view.getContext(), jSONObject.getString("targetUrl"));
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) this.d.a(ICardOverlayService.class);
        if (iCardOverlayService == null) {
            return;
        }
        iCardOverlayService.hideOverlay();
    }
}
