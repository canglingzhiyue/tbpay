package com.taobao.tao.detail.uimodel;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class BuyActionVO extends com.taobao.wireless.detail.model.vo.BuyActionVO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String areaId;
    public Map<String, String> buyParams;
    public Map<String, String> cartParams;
    public int multiplyCoefficient = 1;
    public int quantity;
    public String serviceIdValues;

    static {
        kge.a(-100614979);
    }

    public BuyActionVO() {
        tpc.a("com.taobao.tao.detail.uimodel.BuyActionVO");
    }

    public String getBuyExparams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62d96330", new Object[]{this}) : getExparamsStr(this.buyParams);
    }

    @Deprecated
    public String getCartExparams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14e71caa", new Object[]{this}) : getExparamsStr(this.cartParams);
    }

    public String getExparamsStr(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3e78d84", new Object[]{this, map});
        }
        if (map == null) {
            return this.options == null ? "" : JSON.toJSONString(this.options);
        }
        HashMap hashMap = this.options == null ? new HashMap() : new HashMap(this.options);
        hashMap.putAll(map);
        return JSON.toJSONString(hashMap);
    }

    public Map<String, String> getCartParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1dd3a838", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (this.options != null) {
            try {
                for (String str : this.options.keySet()) {
                    hashMap.put(str, URLEncoder.encode(this.options.get(str), "UTF-8"));
                }
            } catch (Exception unused) {
            }
        }
        Map<String, String> map = this.cartParams;
        if (map != null) {
            try {
                for (String str2 : map.keySet()) {
                    hashMap.put(str2, URLEncoder.encode(this.cartParams.get(str2), "UTF-8"));
                }
            } catch (Exception unused2) {
            }
        }
        return hashMap;
    }
}
