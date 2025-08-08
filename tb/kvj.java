package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.home.component.utils.e;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.taobao.R;

/* loaded from: classes.dex */
public class kvj extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ROVERLAY = 6136827152325085276L;
    public static final String TAG = "rOverlay";

    /* renamed from: a  reason: collision with root package name */
    private String f30339a;
    private osa b = ool.b;
    private orv c = ool.c;

    static {
        kge.a(1751074534);
    }

    public static /* synthetic */ Object ipc$super(kvj kvjVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        try {
            ksp.a("DXROverlayEvent", "handleEvent");
            SectionModel sectionModel = new SectionModel(dXRuntimeContext.e());
            DXRootView s = dXRuntimeContext.s();
            if (!sectionModel.isEmpty() && s != null) {
                a(s, sectionModel, objArr, dXRuntimeContext.D());
                e.e("DXROverlayEvent", "old overlay chain has passed");
            }
        } catch (Throwable th) {
            e.a("DXROverlayEvent", "rOverlayError", th);
        }
    }

    private void a(View view, SectionModel sectionModel, Object[] objArr, DinamicXEngine dinamicXEngine) {
        orx orxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9b2c3f", new Object[]{this, view, sectionModel, objArr, dinamicXEngine});
            return;
        }
        View a2 = a(view);
        if (a2.getTag(R.id.tag_recommend_datasource) == null) {
            Object tag = a2.getTag(R.id.tag_recommend_containerId);
            String obj = tag == null ? null : tag.toString();
            String substring = !StringUtils.isEmpty(obj) ? obj.substring(obj.lastIndexOf(95) + 1) : null;
            if (StringUtils.isEmpty(substring)) {
                return;
            }
            a(sectionModel, view, null, null, substring, dinamicXEngine, obj);
        } else if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) objArr[0];
            if (jSONObject.getJSONObject("content") == null) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            boolean z = !StringUtils.isEmpty(jSONObject2.getString("deleteId"));
            if (z) {
                orxVar = new orx(this.b, sectionModel, jSONObject);
                this.b.a();
            } else {
                orxVar = null;
            }
            this.b.a(z);
            this.b.a(view.getContext(), a(view), orxVar, StringUtils.isEmpty(jSONObject2.getString("similarUrl")) ^ true ? new orw(this.b, jSONObject) : null, sectionModel);
        }
    }

    private void a(SectionModel sectionModel, View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str, DinamicXEngine dinamicXEngine, String str2) {
        View.OnClickListener onClickListener3;
        View.OnClickListener onClickListener4;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f294d2", new Object[]{this, sectionModel, view, onClickListener, onClickListener2, str, dinamicXEngine, str2});
            return;
        }
        String str3 = this.f30339a;
        if (str3 != null && !StringUtils.equals(str3, str)) {
            this.c.a();
            this.c = new orv();
            this.f30339a = str;
        } else if (this.f30339a == null) {
            this.f30339a = str;
        }
        this.c.a(dinamicXEngine, str2);
        if (sectionModel.getJSONObject("subSection") != null && sectionModel.getJSONObject("subSection").getJSONObject("overlay") != null && sectionModel.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item") != null) {
            JSONObject jSONObject = sectionModel.getJSONObject("subSection").getJSONObject("overlay").getJSONObject("item");
            JSONObject jSONObject2 = sectionModel.getJSONObject("subSection").getJSONObject("overlay");
            if (jSONObject.getJSONObject("0") != null) {
                e.e("rOverlay", "homeRecmdProcess overlay hasDelete");
                onClickListener3 = new orz(this.c, sectionModel, jSONObject2);
            } else {
                onClickListener3 = onClickListener;
            }
            if (jSONObject.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR) == null) {
                z = false;
            }
            if (z) {
                e.e("rOverlay", "homeRecmdProcess overlay hasSimilar");
                onClickListener4 = new ort(this.c, sectionModel, jSONObject2);
            } else {
                onClickListener4 = onClickListener2;
            }
            this.c.a(view.getContext(), a(view), onClickListener3, onClickListener4, sectionModel);
        } else {
            e.e("rOverlay", "homeRecmdProcess overlay default");
            this.c.a(view.getContext(), a(view), null, null, sectionModel);
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
