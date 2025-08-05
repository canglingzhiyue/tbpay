package com.taobao.avplayer.core.protocol;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.avplayer.interactivelifecycle.hiv.request.ContentDetailData;
import com.taobao.taobaoavsdk.AVSDKLog;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2088887479);
    }

    public static DWInteractiveVideoObject a(DWResponse dWResponse) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWInteractiveVideoObject) ipChange.ipc$dispatch("19b06e98", new Object[]{dWResponse});
        }
        if (dWResponse != null && dWResponse.data != null && dWResponse.data.length() > 0) {
            return new DWInteractiveVideoObject(dWResponse.data);
        }
        return null;
    }

    public static ContentDetailData b(DWResponse dWResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentDetailData) ipChange.ipc$dispatch("990fa018", new Object[]{dWResponse});
        }
        if (dWResponse == null || dWResponse.data == null || dWResponse.data.length() <= 0) {
            return null;
        }
        try {
            return (ContentDetailData) JSON.parseObject(dWResponse.data.toString(), ContentDetailData.class);
        } catch (Throwable th) {
            AVSDKLog.e("HIV", th.toString());
            return null;
        }
    }
}
