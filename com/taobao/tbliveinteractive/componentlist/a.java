package com.taobao.tbliveinteractive.componentlist;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(677531501);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11634b1", new Object[]{this, str, str2, str3, str4, new Integer(i), new Long(j)});
            return;
        }
        MtopMediaplatformDetailComponentlistRequestNew mtopMediaplatformDetailComponentlistRequestNew = new MtopMediaplatformDetailComponentlistRequestNew();
        if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            mtopMediaplatformDetailComponentlistRequestNew.setContentId(Long.parseLong(str));
            mtopMediaplatformDetailComponentlistRequestNew.setChannel(str2);
            mtopMediaplatformDetailComponentlistRequestNew.entryLiveSource = str3;
            mtopMediaplatformDetailComponentlistRequestNew.liveSource = str4;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("roomType", (Object) Integer.valueOf(i));
            jSONObject.put("newRoomType", (Object) Long.valueOf(j));
            mtopMediaplatformDetailComponentlistRequestNew.features = jSONObject.toJSONString();
        }
        a(0, mtopMediaplatformDetailComponentlistRequestNew, MtopMediaplatformDetailComponentlistResponse.class);
    }
}
