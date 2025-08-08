package com.taobao.android.detail.mainpic.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.eut;

/* loaded from: classes4.dex */
public class LocatorsModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_LOCATOR_INDEX = -1;

    /* renamed from: a  reason: collision with root package name */
    public List<LocatorItemModel> f10195a = new ArrayList();
    public String b = "";
    public String c = "";
    public String d = "#ffffff";
    public String e = "#000000";

    /* loaded from: classes4.dex */
    public static class LocatorItemModel implements Serializable {
        public JSONArray event;
        public String icon;
        public String locator;
        public boolean show;
        public String text;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.c = this.b;
        this.b = str;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        for (LocatorItemModel locatorItemModel : this.f10195a) {
            if (locatorItemModel.show) {
                if (StringUtils.equals(locatorItemModel.locator, this.b)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        for (LocatorItemModel locatorItemModel : this.f10195a) {
            if (locatorItemModel.show) {
                if (StringUtils.equals(locatorItemModel.locator, this.c)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public List<LocatorItemModel> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.f10195a;
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    LocatorItemModel locatorItemModel = new LocatorItemModel();
                    locatorItemModel.icon = jSONObject.getString("iconfont");
                    locatorItemModel.text = jSONObject.getString("text");
                    locatorItemModel.locator = jSONObject.getString("locator");
                    locatorItemModel.event = jSONObject.getJSONArray("event");
                    locatorItemModel.show = eut.a(jSONObject);
                    this.f10195a.add(locatorItemModel);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
