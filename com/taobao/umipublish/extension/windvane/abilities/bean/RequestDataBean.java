package com.taobao.umipublish.extension.windvane.abilities.bean;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class RequestDataBean implements Serializable {
    public JSONObject richTitle;
    public Integer downloadEnable = 1;
    public JSONObject headLine = new JSONObject();
    public String publishType = "video";
    public String shortTitle = "";
    public String title = "";
    public JSONArray item = new JSONArray();
    public List<MediaBean> media = new ArrayList();
    public JSONArray pois = new JSONArray();
    public JSONArray shops = new JSONArray();
    public JSONArray topics = new JSONArray();

    static {
        kge.a(446304328);
        kge.a(1028243835);
    }
}
