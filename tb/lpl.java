package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import java.util.HashMap;
import tb.lpm;
import tb.lpw;

/* loaded from: classes7.dex */
public class lpl implements lph {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30799a;
    private lpm b;
    private HashMap<String, lpm> c = new HashMap<>(4);
    private String d;

    static {
        kge.a(1149545773);
        kge.a(2068339335);
    }

    @Override // tb.lph
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        }
    }

    public lpl(ljs ljsVar, String str) {
        this.f30799a = ljsVar;
        this.d = str;
    }

    @Override // tb.lph
    public void a(BaseSectionModel<?> baseSectionModel, View view, lpm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a11676c", new Object[]{this, baseSectionModel, view, aVar});
            return;
        }
        BaseSectionModel<?> a2 = a(baseSectionModel);
        if (a2 == null) {
            ldf.d("FeedbackOverlayPresenter", "itemData == null");
            return;
        }
        this.b = a(b(baseSectionModel));
        lpm lpmVar = this.b;
        if (lpmVar == null) {
            ldf.d("FeedbackOverlayPresenter", "mOverlayViewController == null");
            return;
        }
        lpmVar.a(view, baseSectionModel, a2, aVar, null, null);
        ldf.d("FeedbackOverlayPresenter", "execute new feedback overlay process");
    }

    @Override // tb.lph
    public void a(BaseSectionModel<?> baseSectionModel, View view, BaseSectionModel<?> baseSectionModel2, lpm.a aVar, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e4a29e", new Object[]{this, baseSectionModel, view, baseSectionModel2, aVar, view2});
            return;
        }
        this.b = a("dx_view");
        if (this.b == null) {
            ldf.d("FeedbackOverlayPresenter", "mOverlayViewController == null");
            return;
        }
        lpw.a aVar2 = new lpw.a();
        aVar2.f30808a = true;
        this.b.a(view, baseSectionModel, baseSectionModel2, aVar, view2, aVar2);
        ldf.d("FeedbackOverlayPresenter", "showOverlayWithOverlayData");
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
    }

    private BaseSectionModel<?> a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("cc5d9d2e", new Object[]{this, baseSectionModel});
        }
        BaseSubSectionModel mo1098getSubSection = baseSectionModel.mo1098getSubSection();
        if (mo1098getSubSection == null) {
            ldf.d("FeedbackOverlayPresenter", "subsection == null");
            return null;
        }
        return mo1098getSubSection.mo1101getOverlay();
    }

    private String b(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ad380f", new Object[]{this, baseSectionModel});
        }
        JSONObject ext = baseSectionModel.getExt();
        return (ext == null || !ext.getBooleanValue("dxOverlayEnable")) ? "native_view" : "dx_view";
    }

    private lpm a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpm) ipChange.ipc$dispatch("7c7217cb", new Object[]{this, str});
        }
        lpm lpmVar = this.c.get(str);
        if (lpmVar != null) {
            return lpmVar;
        }
        lpm b = b(str);
        this.c.put(str, b);
        return b;
    }

    private lpm b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpm) ipChange.ipc$dispatch("7d1ec36a", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 1751194061) {
            if (hashCode == 2082906992 && str.equals("dx_view")) {
                c = 0;
            }
        } else if (str.equals("native_view")) {
            c = 1;
        }
        if (c == 0) {
            return new lpn(this.f30799a);
        }
        if (c == 1) {
            return new lpx(this.f30799a);
        }
        return null;
    }
}
