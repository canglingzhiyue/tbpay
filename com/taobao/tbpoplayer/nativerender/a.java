package com.taobao.tbpoplayer.nativerender;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.qnt;
import tb.qnu;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public e f22221a;
    public View b;
    public final List<com.taobao.tbpoplayer.nativerender.render.component.c> c = new CopyOnWriteArrayList();

    static {
        kge.a(-1559595648);
    }

    public static /* synthetic */ int lambda$BsuD7_NmhVuiSu5HZyDg_WfyOWU(AtomicBoolean atomicBoolean, JSONObject jSONObject, JSONObject jSONObject2) {
        return a(atomicBoolean, jSONObject, jSONObject2);
    }

    public a(e eVar) {
        this.f22221a = eVar;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.b;
    }

    public View a(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("85c77a10", new Object[]{this, stateModel, stateVersionModel});
        }
        if (stateModel != null && stateModel.isValid()) {
            d a2 = this.f22221a.a();
            a2.a((StateBaseModel) null);
            a2.a((StateModel) null);
            a2.a((StateVersionModel) null);
            this.b = null;
            StyleModel styleModel = stateModel.style;
            if (styleModel == null) {
                return null;
            }
            Context a3 = a2.a();
            try {
                int b = qnu.b(this.f22221a, styleModel.width);
                int b2 = qnu.b(this.f22221a, styleModel.height);
                a2.a(b);
                a2.b(b2);
                FrameLayout frameLayout = new FrameLayout(a3);
                frameLayout.setId(R.id.poplayer_native_state_id);
                this.b = frameLayout;
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(b, b2));
                a(stateModel, stateVersionModel, frameLayout);
                return frameLayout;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private void a(StateModel stateModel, StateVersionModel stateVersionModel, FrameLayout frameLayout) {
        com.taobao.tbpoplayer.nativerender.render.component.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f881bd1", new Object[]{this, stateModel, stateVersionModel, frameLayout});
            return;
        }
        StateModel stateModel2 = stateVersionModel != 0 ? stateVersionModel : stateModel;
        d a3 = this.f22221a.a();
        a3.a(stateModel);
        a3.a(stateVersionModel);
        a3.a((StateBaseModel) stateModel2);
        a3.b(p.a(this.f22221a, stateModel2.style.backgroundUrl, false));
        try {
            if (stateModel2.style != null && stateModel2.style.widgetAnimBackground != null && stateModel2.style.widgetAnimBackground.imgSrcList != null) {
                a3.a(JSONObject.parseArray(p.a(this.f22221a, stateModel2.style.widgetAnimBackground.imgSrcList, false), String.class));
            }
        } catch (Exception e) {
            com.alibaba.poplayer.utils.c.a("parse backgroundUrlList error :" + e);
        }
        this.f22221a.h();
        List<JSONObject> arrayList = new ArrayList(stateModel2.children);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Collections.sort(arrayList, new Comparator() { // from class: com.taobao.tbpoplayer.nativerender.-$$Lambda$a$BsuD7_NmhVuiSu5HZyDg_WfyOWU
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a.lambda$BsuD7_NmhVuiSu5HZyDg_WfyOWU(atomicBoolean, (JSONObject) obj, (JSONObject) obj2);
            }
        });
        if (!atomicBoolean.get()) {
            arrayList = stateModel2.children;
        }
        this.f22221a.a().c(qnu.a(this.f22221a, arrayList, false));
        for (JSONObject jSONObject : arrayList) {
            String string = jSONObject.getString("type");
            if (!Boolean.FALSE.equals(jSONObject.getBoolean("vConditionResult")) && !qnt.TYPE_CLOSE_BTN.equals(string) && (a2 = qnt.a(jSONObject, this.f22221a, false, false)) != null) {
                frameLayout.addView(a2.g());
                this.c.add(a2);
            }
        }
        if (frameLayout.getChildCount() != 0) {
            return;
        }
        this.f22221a.a("StateNoUiContent", "");
    }

    public static /* synthetic */ int a(AtomicBoolean atomicBoolean, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fad65bdb", new Object[]{atomicBoolean, jSONObject, jSONObject2})).intValue();
        }
        try {
            return jSONObject.getJSONObject("style").getIntValue(com.taobao.android.weex_framework.util.a.ATOM_EXT_zIndex) - jSONObject2.getJSONObject("style").getIntValue(com.taobao.android.weex_framework.util.a.ATOM_EXT_zIndex);
        } catch (Throwable unused) {
            atomicBoolean.set(false);
            return 0;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b = null;
        }
    }
}
