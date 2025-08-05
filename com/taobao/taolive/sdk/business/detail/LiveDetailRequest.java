package com.taobao.taolive.sdk.business.detail;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveDetailRequest implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String creatorId;
    public String entryLiveSource;
    public String extendJson;
    public String holdItemIds;
    public String itemHoldType;
    public String keyPointId;
    public String liveId;
    public String liveSource;
    public String outParam;
    public String productType;
    public String sjsdItemId;
    public JSONObject tcpContext;
    public String timeMovingItemId;
    public String transParams;
    public String type;
    private String API_NAME = "mtop.mediaplatform.live.livedetail";
    private String VERSION = "4.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String ignoreH265 = "false";
    public String useLiveFandom = "false";
    public String forceFandom = "false";
    public String appVersion = "20220712";

    static {
        kge.a(-516181286);
        kge.a(-540945145);
    }

    public void setAPI_NAME(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85191523", new Object[]{this, str});
        } else {
            this.API_NAME = str;
        }
    }

    public void setVERSION(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62958027", new Object[]{this, str});
        } else {
            this.VERSION = str;
        }
    }
}
