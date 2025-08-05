package com.alibaba.android.ultron.trade.event;

import android.util.Pair;
import com.alibaba.android.ultron.trade.event.model.OpenPopupWindowEventModel;
import com.alibaba.android.ultron.vfw.popupwindow.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.bmz;
import tb.bne;
import tb.bnf;
import tb.kge;

/* loaded from: classes2.dex */
public class k extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-944056960);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("128a37ca", new Object[]{kVar})).booleanValue() : kVar.f();
    }

    public k() {
        a();
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(final bmz bmzVar) {
        OpenPopupWindowEventModel openPopupWindowEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b == null || b.getFields() == null) {
            return;
        }
        a aVar = null;
        try {
            openPopupWindowEventModel = (OpenPopupWindowEventModel) JSON.parseObject(b.getFields().toJSONString(), OpenPopupWindowEventModel.class);
        } catch (Exception unused) {
            openPopupWindowEventModel = null;
        }
        List<IDMComponent> components = b.getComponents();
        bne bneVar = new bne(components);
        bneVar.b();
        bmzVar.a((bnf) bneVar);
        b.a aVar2 = new b.a() { // from class: com.alibaba.android.ultron.trade.event.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.popupwindow.b.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                bmzVar.g();
                if (!k.a(k.this)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", (Object) "H5Back");
                k kVar = k.this;
                kVar.a(kVar.b(), jSONObject);
                k.this.f.w().b(k.this.h);
            }
        };
        if (this.f instanceof com.alibaba.android.ultron.trade.presenter.b) {
            aVar = ((com.alibaba.android.ultron.trade.presenter.b) this.f).a(b);
        }
        if (aVar != null && aVar.a()) {
            this.f.y().a(components, openPopupWindowEventModel, aVar2, aVar.b());
        } else {
            this.f.y().a(components, openPopupWindowEventModel, aVar2);
        }
        this.f.y().a(new Pair<>(this.h, b));
        this.f.F().b(bmzVar);
    }

    private boolean f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        JSONObject c = c();
        if (c != null && (jSONObject = c.getJSONObject("options")) != null) {
            return Boolean.valueOf(jSONObject.getString(j.KEY_NEED_CALL_ADJUST_WHEN_CLOSE)).booleanValue();
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f2666a;
        private int b;

        static {
            kge.a(-1003868726);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2666a;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }
    }
}
