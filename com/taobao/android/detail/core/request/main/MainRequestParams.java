package com.taobao.android.detail.core.request.main;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import com.taobao.android.detail.core.request.b;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.eqg;
import tb.kge;
import tb.noa;

/* loaded from: classes4.dex */
public class MainRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_EXPARAMS = "exParams";
    private static final String K_ITEM_ID = "itemNumId";
    public Map<String, String> mExParams;
    public String mItemNumId;

    static {
        kge.a(1409476875);
        kge.a(-1214933880);
    }

    public MainRequestParams(String str, HashMap<String, String> hashMap) {
        this.mItemNumId = str;
        this.mExParams = hashMap;
        emu.a("com.taobao.android.detail.core.request.main.MainRequestParams");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(b.f9819a, b.b);
        String str = this.mItemNumId;
        if (str != null) {
            hashMap.put("itemNumId", str);
        }
        if (!eqg.a(this.mExParams)) {
            try {
                this.mExParams.put(noa.KEY_LOC_TYPE, JSON.parseObject(String.valueOf(this.mExParams.get("params"))).getString(noa.KEY_LOC_TYPE));
            } catch (Throwable unused) {
            }
            try {
                this.mExParams.put("pvStr", JSONObject.parseObject(String.valueOf(this.mExParams.get("params"))).getString("pvStr"));
            } catch (Throwable unused2) {
            }
            hashMap.put("exParams", JSONObject.toJSONString(this.mExParams));
        }
        return hashMap;
    }
}
