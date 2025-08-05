package com.taobao.umipublish.extension.windvane.abilities;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.umipublish.extension.windvane.abilities.bean.MediaBean;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class IntermediateData implements Serializable {
    public JSONObject mPublishRequestParams;
    public int mTemplateClipsCount;
    public final JSONArray mDownloadedMediaList = new JSONArray();
    public JSONObject mTemplateInfo = new JSONObject();
    public final MediaBean mPublishVideo = new MediaBean();
    public final MediaBean mPublishCover = new MediaBean();
    public String mMainClipSource = "0";

    static {
        kge.a(-646823423);
        kge.a(1028243835);
    }
}
