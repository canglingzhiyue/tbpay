package com.alibaba.android.ultron.event.ext;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;
import tb.bkd;
import tb.bkg;
import tb.iaa;
import tb.ibl;
import tb.kge;

/* loaded from: classes2.dex */
public class s extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_NEED_MERGE = "needMerge";
    public static final String FIELD_KEY_UPDATE_FIELDS = "updateFields";

    /* renamed from: a  reason: collision with root package name */
    private Handler f2601a = new Handler(Looper.getMainLooper());

    static {
        kge.a(-506999237);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-8746045296934679719";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (e(eVar) == null || !(e(eVar).get("updateFields") instanceof JSONObject) || eVar.d() == null || eVar.d().getFields() == null) {
            bkd.a("UpdateComponentV2Subscr", "onHandleEventChain", "");
        } else {
            if ("false".equals(e(eVar).getString(FIELD_KEY_NEED_MERGE))) {
                eVar.d().getFields().clear();
            }
            bkg.a(eVar.d().getFields(), e(eVar).getJSONObject("updateFields"));
            final ArrayList arrayList = new ArrayList(1);
            arrayList.add(eVar.d());
            if (ibl.e()) {
                eVar.h().a(arrayList);
            } else {
                this.f2601a.post(new Runnable() { // from class: com.alibaba.android.ultron.event.ext.s.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            eVar.h().a(arrayList);
                        } catch (Throwable th) {
                            iaa.a((Context) null, "UpdateComponentV2Subscr", "refreshComponents-error = " + th.getMessage(), (Map<String, String>) null);
                        }
                    }
                });
            }
        }
    }
}
