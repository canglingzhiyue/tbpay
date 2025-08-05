package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bca;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class i extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(814715713);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(i iVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e54c6a8", new Object[]{iVar, new Boolean(z)});
        } else {
            iVar.a(z);
        }
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        if (!"true".equals((String) bmzVar.b("isChecked")) && a(this.h)) {
            z = false;
        }
        a(z);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.h.getKey());
        this.d.a("operateItems", arrayList);
        this.f25791a.a(this.h, this.d, true, new jnv() { // from class: com.alibaba.android.icart.core.event.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z2, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z2), map});
                } else {
                    i.a(i.this, !z);
                }
            }
        }, null);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject fields = this.h.getFields();
        fields.put("isChecked", (Object) (z + ""));
        this.b.o().b(z);
        this.f25791a.x().b(4);
    }

    private boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue();
        }
        if (iDMComponent == null || iDMComponent.getFields() == null) {
            return false;
        }
        JSONObject fields = iDMComponent.getFields();
        return fields.containsKey("isChecked") && "true".equals(fields.getString("isChecked"));
    }
}
