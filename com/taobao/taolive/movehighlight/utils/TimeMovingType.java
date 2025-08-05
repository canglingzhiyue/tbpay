package com.taobao.taolive.movehighlight.utils;

import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes8.dex */
public enum TimeMovingType {
    CONSTENTBASED("0"),
    ITEMBASED("1");
    
    public String code;

    TimeMovingType(String str) {
        this.code = str;
    }

    public static boolean checkContentTimeMove(VideoInfo videoInfo) {
        return (videoInfo == null || videoInfo.timeMovingPlayInfo == null || !CONSTENTBASED.code.equals(videoInfo.timeMovingPlayInfo.timeMovingType)) ? false : true;
    }
}
