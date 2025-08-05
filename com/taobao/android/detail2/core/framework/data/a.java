package com.taobao.android.detail2.core.framework.data;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.model.d;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements DetailDataManager.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2046958105);
        kge.a(681360126);
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public void a(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public void a(boolean z, String str, d dVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903e0c8", new Object[]{this, new Boolean(z), str, dVar, new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean a(boolean z, int i, JSONObject jSONObject, List<d> list, int i2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c830c55f", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, list, new Integer(i2), new Boolean(z2)})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean a(boolean z, String str, int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecde17e7", new Object[]{this, new Boolean(z), str, new Integer(i), dVar})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.data.DetailDataManager.a
    public boolean b(boolean z, String str, int i, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd576de8", new Object[]{this, new Boolean(z), str, new Integer(i), dVar})).booleanValue() : dVar.q();
    }
}
