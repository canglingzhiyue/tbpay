package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.lpm;
import tb.lpw;

/* loaded from: classes7.dex */
public class xkq implements lph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f34356a;
    private lpm b;

    static {
        kge.a(2122125069);
        kge.a(2068339335);
    }

    @Override // tb.lph
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.lph
    public void a(BaseSectionModel<?> baseSectionModel, View view, BaseSectionModel<?> baseSectionModel2, lpm.a aVar, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e4a29e", new Object[]{this, baseSectionModel, view, baseSectionModel2, aVar, view2});
        }
    }

    @Override // tb.lph
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "";
    }

    public xkq(ljs ljsVar) {
        this.f34356a = ljsVar;
    }

    @Override // tb.lph
    public void a(BaseSectionModel<?> baseSectionModel, View view, lpm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a11676c", new Object[]{this, baseSectionModel, view, aVar});
            return;
        }
        BaseSectionModel<?> windvaneOverlay = baseSectionModel.mo1098getSubSection().getWindvaneOverlay();
        if (windvaneOverlay == null) {
            ldf.d("WindVoneOverLayPresenter", "itemData == null");
            return;
        }
        this.b = c();
        if (this.b == null) {
            ldf.d("WindVoneOverLayPresenter", "mOverlayViewController == null");
            return;
        }
        lpw.a aVar2 = new lpw.a();
        aVar2.b = true;
        aVar2.c = 250;
        aVar2.e = "windvane";
        this.b.a(view, baseSectionModel, windvaneOverlay, aVar, null, aVar2);
        ldf.d("WindVoneOverLayPresenter", "execute new feedback overlay process");
    }

    @Override // tb.lph
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.b = c();
        lpm lpmVar = this.b;
        if (lpmVar == null) {
            ldf.d("WindVoneOverLayPresenter", "mOverlayViewController == null");
        } else {
            lpmVar.a("windvane", view);
        }
    }

    private lpm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpm) ipChange.ipc$dispatch("1e6ab993", new Object[]{this});
        }
        if (this.b == null) {
            this.b = d();
        }
        return this.b;
    }

    private lpm d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lpm) ipChange.ipc$dispatch("261c5ef2", new Object[]{this}) : new lpn(this.f34356a);
    }
}
