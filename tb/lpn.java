package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import tb.lpm;
import tb.lpw;

/* loaded from: classes7.dex */
public class lpn implements lpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30800a;
    private transient WeakReference<lpw> b;

    static {
        kge.a(-1903113385);
        kge.a(-1972890888);
    }

    public lpn(ljs ljsVar) {
        this.f30800a = ljsVar;
    }

    @Override // tb.lpm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WeakReference<lpw> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.b.get().a();
        this.b = null;
    }

    @Override // tb.lpm
    public void a(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, lpm.a aVar, View view2, lpw.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545b178e", new Object[]{this, view, baseSectionModel, baseSectionModel2, aVar, view2, aVar2});
            return;
        }
        if (aVar2 == null || !aVar2.b) {
            a();
        }
        lpw b = b();
        ViewGroup viewGroup = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
        if (b == null || viewGroup == null) {
            return;
        }
        b.a(aVar);
        b.a(view.getContext(), viewGroup, baseSectionModel, baseSectionModel2, view2, aVar2);
        a(baseSectionModel2);
    }

    @Override // tb.lpm
    public void a(String str, View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
            return;
        }
        View view2 = null;
        ViewGroup viewGroup = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
        if (viewGroup == null) {
            return;
        }
        while (true) {
            if (i >= viewGroup.getChildCount()) {
                break;
            } else if (StringUtils.equals(String.valueOf(viewGroup.getChildAt(i).getTag(R.id.overlay_overlay_view_tag)), str)) {
                view2 = viewGroup.getChildAt(i);
                break;
            } else {
                i++;
            }
        }
        if (view2 == null) {
            return;
        }
        viewGroup.removeView(view2);
    }

    private lpw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lpw) ipChange.ipc$dispatch("16b9156a", new Object[]{this});
        }
        this.b = new WeakReference<>(new lpw(this.f30800a));
        return this.b.get();
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getBooleanValue("isTracked")) {
        } else {
            ldl.a("Page_Home", 19999, "del_flipAdRender", "overlay", "overlayDxAppearExpose", null);
        }
    }
}
