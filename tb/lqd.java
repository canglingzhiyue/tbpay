package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import tb.lpm;
import tb.lpw;

/* loaded from: classes7.dex */
public class lqd implements lph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30821a;
    private lpm b;
    private String c;

    static {
        kge.a(1348128967);
        kge.a(2068339335);
    }

    @Override // tb.lph
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    public static /* synthetic */ void a(lqd lqdVar, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, lpm.a aVar, View view2, lpw.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88059df", new Object[]{lqdVar, view, baseSectionModel, baseSectionModel2, aVar, view2, aVar2});
        } else {
            lqdVar.a(view, baseSectionModel, baseSectionModel2, aVar, view2, aVar2);
        }
    }

    public lqd(ljs ljsVar, String str) {
        this.f30821a = ljsVar;
        this.c = str;
    }

    @Override // tb.lph
    public void a(BaseSectionModel<?> baseSectionModel, View view, lpm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a11676c", new Object[]{this, baseSectionModel, view, aVar});
            return;
        }
        BaseSubSectionModel mo1098getSubSection = baseSectionModel.mo1098getSubSection();
        if (mo1098getSubSection == null) {
            ldf.d("GuideOverlayPresenter", "subsection == null");
            return;
        }
        JSONObject ext = baseSectionModel.getExt();
        BaseSectionModel guide = mo1098getSubSection.getGuide();
        if (!a(guide, ext)) {
            return;
        }
        a(baseSectionModel, guide, view, aVar, (View) null, (lpw.a) null);
    }

    @Override // tb.lph
    public void a(BaseSectionModel<?> baseSectionModel, View view, BaseSectionModel<?> baseSectionModel2, lpm.a aVar, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e4a29e", new Object[]{this, baseSectionModel, view, baseSectionModel2, aVar, view2});
            return;
        }
        lpw.a aVar2 = new lpw.a();
        aVar2.f30808a = true;
        a(baseSectionModel, baseSectionModel2, view, aVar, view2, aVar2);
    }

    @Override // tb.lph
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lpm lpmVar = this.b;
        if (lpmVar == null) {
            return;
        }
        lpmVar.a();
    }

    @Override // tb.lph
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    private boolean a(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22760344", new Object[]{this, baseSectionModel, jSONObject})).booleanValue() : baseSectionModel != null && baseSectionModel.containsKey("template") && jSONObject.getBooleanValue("dxOverlayGuideEnable");
    }

    private void a(final BaseSectionModel<?> baseSectionModel, final BaseSectionModel<?> baseSectionModel2, final View view, final lpm.a aVar, final View view2, final lpw.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("215d40ae", new Object[]{this, baseSectionModel, baseSectionModel2, view, aVar, view2, aVar2});
        } else {
            view.post(new Runnable() { // from class: tb.lqd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lqd.a(lqd.this, view, baseSectionModel, baseSectionModel2, aVar, view2, aVar2);
                    }
                }
            });
        }
    }

    private void a(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, lpm.a aVar, View view2, lpw.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545b178e", new Object[]{this, view, baseSectionModel, baseSectionModel2, aVar, view2, aVar2});
            return;
        }
        view.requestLayout();
        c().a(view, baseSectionModel, baseSectionModel2, aVar, view2, aVar2);
        ldf.d("GuideOverlayPresenter", "execute new guide overlay process");
    }

    private lpm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpm) ipChange.ipc$dispatch("1e6ab993", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new lpn(this.f30821a);
        }
        return this.b;
    }
}
