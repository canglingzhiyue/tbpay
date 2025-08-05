package com.alibaba.android.ultron.trade.event;

import android.text.TextUtils;
import com.alibaba.android.ultron.trade.event.model.AdjustWithPopupWindowEventModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.bmz;
import tb.bna;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ADJUSt_BEFORE_POPUP = "needCallAdjustBeforePopup";
    public static final String KEY_IGNORE_CURRENT_POPUP = "ignoreCurrentPopup";
    public static final String KEY_STATUS = "status";
    public static final String KEY_STATUS_ADJUST = "AutoJumpRequest";
    public static final String KEY_STATUS_H5_BACK = "H5Back";

    static {
        kge.a(1776886924);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a() {
        this.j = 100;
        a();
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        AdjustWithPopupWindowEventModel adjustWithPopupWindowEventModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        com.taobao.android.ultron.common.model.b b = b();
        if (b == null || b.getFields() == null) {
            return;
        }
        try {
            adjustWithPopupWindowEventModel = (AdjustWithPopupWindowEventModel) JSON.parseObject(b.getFields().toJSONString(), AdjustWithPopupWindowEventModel.class);
        } catch (Exception unused) {
            UnifyLog.d("AutoJumpOpenUrlSubscriber", "onHandleEvent JSON.parseObject failed");
            adjustWithPopupWindowEventModel = null;
        }
        if (adjustWithPopupWindowEventModel == null) {
            return;
        }
        if (!f()) {
            a(bmzVar, b);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) "AutoJumpRequest");
        a(b(), jSONObject);
        bna F = this.f.F();
        if (F == null) {
            return;
        }
        if (F.b() == null) {
            this.f.F().b(F.a());
        }
        F.b().c(this.h.getKey());
        F.a(this.h.getKey(), new bna.a() { // from class: com.alibaba.android.ultron.trade.event.a.1
        });
        this.f.w().b(this.h);
    }

    private boolean f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        JSONObject c = c();
        if (c == null || (jSONObject = c.getJSONObject("options")) == null) {
            return true;
        }
        String string = jSONObject.getString(KEY_ADJUSt_BEFORE_POPUP);
        if (!TextUtils.isEmpty(string)) {
            return Boolean.parseBoolean(string);
        }
        return true;
    }

    public void a(bmz bmzVar, com.taobao.android.ultron.common.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b54c38", new Object[]{this, bmzVar, bVar});
            return;
        }
        if (bVar.getFields() != null) {
            bVar.getFields().put("from", "AdjustAndOpenPopupWindowSubscriber");
        }
        bna F = this.f.F();
        F.a(F.a().a("openPopupWindow").a(bVar).a(bmzVar.c()));
    }
}
