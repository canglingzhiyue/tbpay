package com.taobao.umipublish.extension.windvane.abilities.hander;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfoV2;
import com.taobao.android.litecreator.util.m;
import com.taobao.umipublish.extension.windvane.abilities.IntermediateData;
import tb.ios;
import tb.kge;
import tb.tem;

/* loaded from: classes9.dex */
public class UploadFileHandler extends BaseHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1427495176);
    }

    public UploadFileHandler(JSONObject jSONObject, JSONObject jSONObject2, IntermediateData intermediateData) {
        super(jSONObject, jSONObject2, intermediateData);
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("path", (Object) this.d.mPublishVideo.path);
        jSONObject2.put("type", (Object) "video");
        jSONObject2.put("bizCode", (Object) this.c.getString(ios.URL_KEY_VIDEO_BIZ_CODE));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", (Object) "cover");
        jSONObject3.put("path", (Object) this.d.mPublishCover.path);
        jSONObject3.put("bizCode", (Object) this.c.getString(ios.URL_KEY_PHOTO_UPLOAD_CODE));
        jSONObject3.put("width", (Object) this.d.mPublishCover.width);
        jSONObject3.put("height", (Object) this.d.mPublishCover.height);
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject2);
        jSONArray.add(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("uploadList", (Object) jSONArray);
        return jSONObject4;
    }

    @Override // com.taobao.umipublish.extension.windvane.abilities.AbilityChain.InputAndOutputHandler
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("fileList");
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (StringUtils.equals(jSONObject2.getString("type"), "video")) {
                this.d.mPublishVideo.fileId = m.a(jSONObject2, "fileId", "");
                this.d.mPublishVideo.path = m.a(jSONObject2, "path", "");
                this.d.mPublishVideo.mediaType = "video";
                this.d.mPublishVideo.statInfo = tem.a(this.b);
                a(this.d.mPublishVideo.statInfo, this.d);
            } else if (StringUtils.equals(jSONObject2.getString("type"), "cover")) {
                this.d.mPublishCover.path = m.a(jSONObject2, "path", "");
                this.d.mPublishCover.width = Integer.valueOf(m.a(jSONObject2, "width", 0));
                this.d.mPublishCover.height = Integer.valueOf(m.a(jSONObject2, "height", 0));
                this.d.mPublishCover.url = m.a(jSONObject2, "url", "");
                this.d.mPublishCover.mediaType = "cover";
            }
        }
    }

    private static void a(MediaStatInfoV2 mediaStatInfoV2, IntermediateData intermediateData) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d6c2ca", new Object[]{mediaStatInfoV2, intermediateData});
        } else if (intermediateData.mTemplateClipsCount <= 0) {
        } else {
            StringBuilder sb = new StringBuilder();
            while (i < intermediateData.mTemplateClipsCount) {
                sb.append(i != 0 ? "," : "");
                sb.append(intermediateData.mMainClipSource);
                i++;
            }
            mediaStatInfoV2.main_clip_source = sb.toString();
        }
    }
}
