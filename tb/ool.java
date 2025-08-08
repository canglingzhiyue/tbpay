package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.android.home.component.utils.e;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.taobao.R;

/* loaded from: classes.dex */
public class ool extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static osa b;
    public static orv c;

    /* renamed from: a  reason: collision with root package name */
    public String f32228a;

    public static /* synthetic */ Object ipc$super(ool oolVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1839022779);
        b = new osa();
        c = new orv();
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
            return;
        }
        ksp.a("ROverlayEventHandler", "handleEvent");
        if (!(obj2 instanceof JSONObject)) {
            return;
        }
        a(view, new SectionModel((JSONObject) obj2), obj);
        e.e("ROverlayEventHandler", "old overlay chain has passed");
    }

    private void a(View view, SectionModel sectionModel, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2a8f5f", new Object[]{this, view, sectionModel, obj});
            return;
        }
        View a2 = a(view);
        com.taobao.tao.linklog.a.a("eventProcess", "ROverlayEventHandler", "homepage overlay");
        Object tag = a2.getTag(R.id.tag_recommend_containerId);
        String obj2 = tag == null ? null : tag.toString();
        String substring = !StringUtils.isEmpty(obj2) ? obj2.substring(obj2.lastIndexOf(95) + 1) : null;
        if (StringUtils.isEmpty(substring)) {
            com.taobao.tao.linklog.a.a("eventProcess", "ROverlayEventHandler", "Overlay params error");
        } else {
            a(view, sectionModel, (View.OnClickListener) null, (View.OnClickListener) null, substring);
        }
    }

    private void a(View view, SectionModel sectionModel, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str) {
        View.OnClickListener onClickListener3;
        ort ortVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc74386d", new Object[]{this, view, sectionModel, onClickListener, onClickListener2, str});
            return;
        }
        String str2 = this.f32228a;
        if (str2 != null && !StringUtils.equals(str2, str)) {
            c.a();
            c = new orv();
            this.f32228a = str;
        } else if (this.f32228a == null) {
            this.f32228a = str;
        }
        c.b();
        if (sectionModel.getJSONObject("subSection") != null && sectionModel.getJSONObject("subSection").getJSONObject("overlay") != null && sectionModel.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item") != null) {
            JSONObject jSONObject = sectionModel.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item");
            JSONObject jSONObject2 = sectionModel.getJSONObject("subSection").getJSONObject("overlay");
            if (jSONObject.getJSONObject("0") != null) {
                com.taobao.tao.linklog.a.a("eventProcess", "ROverlayEventHandler", "homeRecmdProcess overlay hasDelete");
                onClickListener3 = new orz(c, sectionModel, jSONObject2);
            } else {
                onClickListener3 = onClickListener;
            }
            if (jSONObject.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR) == null) {
                z = false;
            }
            if (z) {
                com.taobao.tao.linklog.a.a("eventProcess", "ROverlayEventHandler", "homeRecmdProcess overlay hasSimilar");
                ortVar = new ort(c, sectionModel, jSONObject2);
            } else {
                ortVar = onClickListener2;
            }
            c.a(view.getContext(), a(view), onClickListener3, ortVar, sectionModel);
        } else {
            com.taobao.tao.linklog.a.a("eventProcess", "ROverlayEventHandler", "homeRecmdProcess overlay default");
            c.a(view.getContext(), a(view), null, null, sectionModel);
        }
        nlr.a(sectionModel);
    }

    private View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        while (view != null && !(view.getParent() instanceof RecyclerView)) {
            view = (View) view.getParent();
        }
        return view;
    }
}
