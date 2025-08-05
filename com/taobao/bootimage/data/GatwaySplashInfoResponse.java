package com.taobao.bootimage.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kel;
import tb.kge;

/* loaded from: classes6.dex */
public class GatwaySplashInfoResponse implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<BootImageInfo> mColdStartSplashData;
    private JSONObject mData;
    private int mHotStartTimes = -1;
    private List<BootImageInfo> mSplashData;
    private JSONArray mSplashJsonData;

    static {
        kge.a(-229076681);
        kge.a(1028243835);
    }

    public GatwaySplashInfoResponse(JSONObject jSONObject) {
        parse(jSONObject);
    }

    public GatwaySplashInfoResponse() {
    }

    public void parse(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293bdc44", new Object[]{this, jSONObject});
            return;
        }
        this.mData = jSONObject;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("containers");
        if (optJSONObject5 == null || (optJSONObject = optJSONObject5.optJSONObject("splash_home_base")) == null || (optJSONObject2 = optJSONObject.optJSONObject("base")) == null) {
            return;
        }
        parseStartCount(optJSONObject2);
        JSONArray optJSONArray = optJSONObject2.optJSONArray("sections");
        if (optJSONArray == null) {
            return;
        }
        if (this.mSplashData == null) {
            this.mSplashData = new ArrayList();
        }
        this.mSplashData.clear();
        for (int i = 0; i < optJSONArray.length(); i++) {
            Object opt = optJSONArray.opt(i);
            if (!(opt instanceof JSONObject) || (optJSONObject3 = ((JSONObject) opt).optJSONObject("bizData")) == null || (optJSONObject4 = optJSONObject3.optJSONObject("taobao-splash")) == null) {
                return;
            }
            this.mSplashJsonData = optJSONObject4.optJSONArray("data");
            List<BootImageInfo> parseArray = com.alibaba.fastjson.JSONObject.parseArray(this.mSplashJsonData.toString(), BootImageInfo.class);
            for (BootImageInfo bootImageInfo : parseArray) {
                bootImageInfo.sceneType = "Market";
            }
            if (parseArray != null && parseArray.size() > 0) {
                this.mSplashData.addAll(parseArray);
            }
            if (kel.c) {
                this.mColdStartSplashData = new ArrayList();
                for (BootImageInfo bootImageInfo2 : this.mSplashData) {
                    if (BootImageInfo.BIZ_TYPE_COLD_START_AD.equals(bootImageInfo2.bizType) && bootImageInfo2.coldStart) {
                        this.mColdStartSplashData.add(bootImageInfo2);
                    }
                }
            }
        }
    }

    public List<BootImageInfo> getColdStartData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("39ca20ae", new Object[]{this}) : this.mColdStartSplashData;
    }

    public List<BootImageInfo> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dbd142c0", new Object[]{this}) : this.mSplashData;
    }

    private void parseStartCount(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d056b7", new Object[]{this, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("ext");
        if (optJSONObject == null) {
            this.mHotStartTimes = -1;
        } else {
            this.mHotStartTimes = optJSONObject.optInt("hotStartTimes", -1);
        }
    }

    public int getHotStartTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50327f75", new Object[]{this})).intValue() : this.mHotStartTimes;
    }
}
