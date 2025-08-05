package com.taobao.android.home.component.constructor;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.DinamicAttr;
import com.taobao.android.dinamic.dinamic.h;
import com.taobao.android.home.component.view.HVideoView;
import tb.kge;

/* loaded from: classes.dex */
public class HVideoViewConstructor extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2104824514);
    }

    @Override // com.taobao.android.dinamic.dinamic.h
    public View initializeView(String str, Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a3fe4ae", new Object[]{this, str, context, attributeSet});
        }
        HVideoView hVideoView = new HVideoView(context, attributeSet);
        hVideoView.setNeedAutoPlay(true);
        return hVideoView;
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.VIDEOVIEW_VIDEO_URL})
    public void setVideoUrl(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8932ebb", new Object[]{this, hVideoView, str});
        } else {
            hVideoView.setVideoUrl(str);
        }
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.VIDEOVIEW_COVER_URL})
    public void setCoverImage(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55bbc84b", new Object[]{this, hVideoView, str});
        } else {
            hVideoView.setCoverImage(str);
        }
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.VIDEOVIEW_DURATION_TEXT})
    public void setDurationTime(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55aece", new Object[]{this, hVideoView, str});
        } else {
            hVideoView.setDurationTime(str);
        }
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.VIDEOVIEW_ICON_URL})
    public void setPlayButtonImage(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38aa2c1e", new Object[]{this, hVideoView, str});
        } else {
            hVideoView.setPlayButtonImage(str);
        }
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.VIDEOVIEW_ICON_OFFSETY})
    public void setIconOffsetY(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44e0a26", new Object[]{this, hVideoView, str});
        } else {
            hVideoView.setIconOffsetY(str);
        }
    }

    @DinamicAttr(attrSet = {"hScaleType"})
    public void setScaleType(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3811704f", new Object[]{this, hVideoView, str});
        } else if (TextUtils.isEmpty(str)) {
            hVideoView.setScaleType(0);
            hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue == 0) {
                hVideoView.setScaleType(3);
                hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_XY);
            } else if (intValue == 1) {
                hVideoView.setScaleType(0);
                hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (intValue != 2) {
            } else {
                hVideoView.setScaleType(1);
                hVideoView.setCoverScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
    }

    @DinamicAttr(attrSet = {com.taobao.infoflow.taobao.render.dinamicx.dx3.view.video.HVideoView.VIDEOVIEW_VIDEO_CAN_PLAY})
    public void canPlay(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53f44ccd", new Object[]{this, hVideoView, str});
        } else if (hVideoView == null) {
        } else {
            if (str == null || Boolean.parseBoolean(str)) {
                hVideoView.canPlay(true);
            } else {
                hVideoView.canPlay(false);
            }
        }
    }
}
