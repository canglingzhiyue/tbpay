package com.alibaba.android.aura.taobao.adapter.extension.event.locator;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.aura.taobao.adapter.extension.event.locator.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.aqs;
import tb.arc;
import tb.ard;
import tb.arv;
import tb.bar;
import tb.bau;
import tb.bay;
import tb.bbi;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.event.locator")
/* loaded from: classes2.dex */
public final class AURALocatorEvent extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<AURARenderComponent> f2194a;
    private RecyclerView b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Position {
        public static final String BOTTOM = "bottom";
        public static final String CENTER = "center";
        public static final String TOP = "top";
    }

    static {
        kge.a(-1888903237);
    }

    public static /* synthetic */ Object ipc$super(AURALocatorEvent aURALocatorEvent, String str, Object... objArr) {
        if (str.hashCode() == 563256106) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "locator";
    }

    @Override // tb.arv, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        this.f2194a = (List) aURAGlobalData.get("render_view_item_models", List.class);
        this.b = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            arc.a().b("AURALocatorEvent fun:innerHandleEvent case: eventFields 为空");
            return;
        }
        String a2 = StringUtils.isEmpty(c.getString("target")) ? a(eventModel.e(), 1) : c.getString("target");
        if (StringUtils.isEmpty(a2)) {
            arc.a().b("AURALocatorEvent fun:innerHandleEvent case: target 为空");
        } else if (this.b == null || bau.a(this.f2194a)) {
            arc.a().b("AURALocatorEvent fun:innerHandleEvent case: recycleView 为空");
        } else {
            a(this.f2194a, this.b, a2, c.getString("position"), c.getString("offset"), c.getString("smooth"));
            AURARenderComponent a3 = a(this.f2194a, a2);
            if (a3 == null) {
                return;
            }
            JSONObject jSONObject = c.getJSONObject(com.taobao.android.weex_framework.util.a.ATOM_EXT_blink);
            if (bau.a(jSONObject)) {
                return;
            }
            a(new a.C0069a(jSONObject, a3));
        }
    }

    private AURARenderComponent a(List<AURARenderComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("a43af0e", new Object[]{this, list, str});
        }
        for (AURARenderComponent aURARenderComponent : list) {
            if (str.equals(aURARenderComponent.key)) {
                return aURARenderComponent;
            }
        }
        return null;
    }

    private void a(a.C0069a c0069a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581d264f", new Object[]{this, c0069a});
            return;
        }
        AURAGlobalData d = d();
        if (d == null) {
            return;
        }
        d.update(com.alibaba.android.aura.taobao.adapter.extension.event.locator.a.GLOBAL_DATA_BLINK_DATA, c0069a);
    }

    private String a(Object[] objArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc783d86", new Object[]{this, objArr, new Integer(i)});
        }
        if (objArr == null || objArr.length <= i) {
            return null;
        }
        Object obj = objArr[i];
        if (!(obj instanceof JSONObject)) {
            arc.a().a("args is null");
            return null;
        }
        return ((JSONObject) obj).getString("target");
    }

    private void a(List<AURARenderComponent> list, RecyclerView recyclerView, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c73deaf", new Object[]{this, list, recyclerView, str, str2, str3, str4});
            return;
        }
        int b = b(list, str);
        if (b == -1) {
            ard a2 = arc.a();
            a2.a("AURALocatorEvent fun:smoothScrollToPositionIfNeed case: Can not found " + str);
        } else if (!a(list.get(b))) {
            arc.a().a("AURALocatorEvent fun:smoothScrollToPositionIfNeed case:  not support scroll!");
        } else {
            if (bar.a("disableScrollSmooth", true) && !Boolean.parseBoolean(str4) && !a(recyclerView, b)) {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).scrollToPositionWithOffset(b, 0);
            }
            a aVar = new a(b().e(), str2, str3);
            aVar.setTargetPosition(b);
            recyclerView.getLayoutManager().startSmoothScroll(aVar);
        }
    }

    private boolean a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85acc031", new Object[]{this, recyclerView, new Integer(i)})).booleanValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        return i >= linearLayoutManager.findFirstVisibleItemPosition() && i <= linearLayoutManager.findLastVisibleItemPosition();
    }

    /* loaded from: classes2.dex */
    public static class a extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2195a;
        private final int b;

        static {
            kge.a(-995660506);
        }

        public a(Context context, String str, String str2) {
            super(context);
            this.f2195a = str;
            this.b = bay.a(bbi.a(str2, 58));
        }

        @Override // android.support.v7.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            int i6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
            }
            if ("top".equalsIgnoreCase(this.f2195a)) {
                i6 = (i3 - i) + this.b;
            } else if ("bottom".equalsIgnoreCase(this.f2195a)) {
                i6 = (i4 - i2) - this.b;
            } else {
                i6 = (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
            if (i6 != 0) {
                return i6;
            }
            return 1;
        }
    }

    private int b(List<AURARenderComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56f0617", new Object[]{this, list, str})).intValue();
        }
        for (int i = 0; i < list.size(); i++) {
            AURARenderComponent aURARenderComponent = list.get(i);
            if (aURARenderComponent != null && str.equals(aURARenderComponent.key)) {
                return i;
            }
        }
        return -1;
    }

    private boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null) {
            return false;
        }
        while (aURARenderComponent != null) {
            if (aURARenderComponent.data != null && aURARenderComponent.data.layout != null && "sticky".equals(aURARenderComponent.data.layout.type)) {
                return false;
            }
            aURARenderComponent = aURARenderComponent.parent;
        }
        return true;
    }
}
