package com.taobao.android.searchbaseframe.datasource.impl.bean;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class ResultLayoutInfoBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<String> foldHeaders = new ArrayList();
    public final List<String> bottomFoldHeaders = new ArrayList();
    public final List<String> halfStickyHeaders = new ArrayList();
    public final List<String> stickyHeaders = new ArrayList();
    public final List<String> listHeaders = new ArrayList();
    public final List<String> sceneHeaders = new ArrayList();
    public final List<String> listFooters = new ArrayList();

    static {
        kge.a(-928184815);
        kge.a(1028243835);
    }

    public static ResultLayoutInfoBean parse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultLayoutInfoBean) ipChange.ipc$dispatch("bb705f5e", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ResultLayoutInfoBean resultLayoutInfoBean = new ResultLayoutInfoBean();
        fillArray(jSONObject.getJSONArray("foldHeader"), resultLayoutInfoBean.foldHeaders);
        fillArray(jSONObject.getJSONArray("bottomFoldHeader"), resultLayoutInfoBean.bottomFoldHeaders);
        fillArray(jSONObject.getJSONArray("halfStickyHeader"), resultLayoutInfoBean.halfStickyHeaders);
        fillArray(jSONObject.getJSONArray("stickyHeader"), resultLayoutInfoBean.stickyHeaders);
        fillArray(jSONObject.getJSONArray("listHeader"), resultLayoutInfoBean.listHeaders);
        fillArray(jSONObject.getJSONArray("listFooter"), resultLayoutInfoBean.listFooters);
        fillArray(jSONObject.getJSONArray("sceneHeader"), resultLayoutInfoBean.sceneHeaders);
        return resultLayoutInfoBean;
    }

    private static void fillArray(JSONArray jSONArray, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19955836", new Object[]{jSONArray, list});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string)) {
                    list.add(string);
                }
            }
        }
    }

    public static ResultLayoutInfoBean createDefualt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ResultLayoutInfoBean) ipChange.ipc$dispatch("2b164e90", new Object[0]) : new ResultLayoutInfoBean();
    }
}
