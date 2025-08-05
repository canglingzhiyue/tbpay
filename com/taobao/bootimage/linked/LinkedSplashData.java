package com.taobao.bootimage.linked;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.Serializable;
import java.util.Arrays;
import tb.kej;
import tb.kge;

/* loaded from: classes6.dex */
public class LinkedSplashData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LinkedSplashData";
    public static final String TYPE_FEEDS = "feeds";
    private JSONObject bizData;
    private final BootImageData data;
    private FeedsData feedsData;
    private i splashJson;
    private final JSONObject subSection;
    private final String traceId;

    static {
        kge.a(-614026041);
        kge.a(1028243835);
    }

    public LinkedSplashData(JSONObject jSONObject, String str, BootImageData bootImageData) {
        this.subSection = jSONObject;
        this.traceId = str;
        this.data = bootImageData;
        if (jSONObject != null) {
            try {
                this.splashJson = new i(jSONObject.getJSONObject(PopStrategy.IDENTIFIER_SPLASH));
                this.feedsData = new FeedsData(jSONObject.getJSONObject("feeds"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public String getTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this}) : this.traceId;
    }

    public BootImageData getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BootImageData) ipChange.ipc$dispatch("ab399fd1", new Object[]{this}) : this.data;
    }

    public JSONObject getSplashObj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8cf4bd01", new Object[]{this}) : this.subSection.getJSONObject(PopStrategy.IDENTIFIER_SPLASH);
    }

    public i getSplashJson() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("11251d11", new Object[]{this}) : this.splashJson;
    }

    public JSONObject getBizData() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f2bc674e", new Object[]{this});
        }
        if (this.bizData == null) {
            try {
                if (this.subSection != null && (jSONObject = this.subSection.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) != null) {
                    this.bizData = jSONObject.getJSONObject("bizData");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.bizData;
    }

    public String getLinkedDataType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("537820a6", new Object[]{this});
        }
        for (String str : Arrays.asList(com.taobao.mmad.data.b.TYPE_BANNER, "popView", "searchText", "feeds")) {
            if (this.subSection.getJSONObject(str) != null) {
                return str;
            }
        }
        return null;
    }

    public JSONObject getLinkedData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a0e524a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return this.subSection.getJSONObject(str);
        } catch (Throwable th) {
            kej.a(TAG, "getLinkedData" + str, th);
            return null;
        }
    }

    public JSONObject getSubSection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("73677aa2", new Object[]{this}) : this.subSection;
    }

    public FeedsData getFeedsData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FeedsData) ipChange.ipc$dispatch("2f673dbf", new Object[]{this}) : this.feedsData;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LinkedSplashData{type = " + getLinkedDataType() + ", traceId='" + this.traceId + "', data=" + this.data + ", splashJson=" + this.splashJson + ", feedsData=" + this.feedsData + '}';
    }
}
