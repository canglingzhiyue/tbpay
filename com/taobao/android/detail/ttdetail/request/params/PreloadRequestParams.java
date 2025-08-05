package com.taobao.android.detail.ttdetail.request.params;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.preload.c;
import com.taobao.android.detail.ttdetail.utils.x;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class PreloadRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_COMMON_PARAMS = "commonParams";
    private static final String K_ITEM_PARAMS = "itemParams";
    private List<c> mItemList;
    private String mToken;

    static {
        kge.a(1723418114);
        kge.a(395113271);
    }

    public PreloadRequestParams(String str, List<c> list) {
        this.mToken = str;
        this.mItemList = list;
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (c cVar : this.mItemList) {
            if (cVar != null && cVar.f10790a != null && !hashMap.containsKey(cVar.b)) {
                hashMap.put(cVar.b, cVar.f10790a.toJSONString());
            }
        }
        return JSON.toJSONString(buildParams(hashMap));
    }

    public String getDetailToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5d35747", new Object[]{this}) : this.mToken;
    }

    private Map<String, String> buildParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("acc73ebf", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("detail_v", "3.3.2");
        hashMap.put(K_ITEM_PARAMS, JSONObject.toJSONString(map));
        hashMap.put(K_COMMON_PARAMS, JSONObject.toJSONString(x.a()));
        return hashMap;
    }

    public boolean isNavPreload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc9b48bb", new Object[]{this})).booleanValue();
        }
        for (c cVar : this.mItemList) {
            if (cVar != null) {
                return TextUtils.equals("nav", cVar.c);
            }
        }
        return true;
    }

    public boolean isContainItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("401ab552", new Object[]{this, str})).booleanValue();
        }
        for (c cVar : this.mItemList) {
            if (TextUtils.equals(str, cVar.b)) {
                return true;
            }
        }
        return false;
    }

    public List<c> getItemList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c2c777b9", new Object[]{this}) : this.mItemList;
    }
}
