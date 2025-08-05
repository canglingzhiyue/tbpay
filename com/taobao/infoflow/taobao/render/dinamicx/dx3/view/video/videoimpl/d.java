package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.videoimpl;

import com.alibaba.fastjson.JSONObject;

/* loaded from: classes7.dex */
public interface d extends b, c {
    void canPlay(boolean z);

    void registerVideoStatusListener(g gVar);

    void seekTo(int i);

    void setVideoID(String str);

    void setVideoPlayInfo(String str);

    void setVideoUrl(String str);

    void updateData(JSONObject jSONObject);
}
