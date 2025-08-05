package com.taobao.avplayer.interactivelifecycle.frontcover.model;

import android.text.TextUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.IDWObject;
import com.taobao.avplayer.core.model.DWResponse;
import org.json.JSONObject;
import tb.kco;
import tb.kge;

/* loaded from: classes6.dex */
public class DWFrontCoverBean implements IDWObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mCoverPicUrl;
    private JSONObject mData;
    private long mPlayTimes;
    private ImageView.ScaleType mScaleType;
    private String mVideoDuration;

    static {
        kge.a(889680439);
        kge.a(-996138287);
    }

    public DWFrontCoverBean(DWResponse dWResponse) {
        this.mData = dWResponse.data;
        JSONObject jSONObject = this.mData;
        if (jSONObject == null) {
            return;
        }
        Object opt = jSONObject.opt("extendsParam");
        if (opt != null) {
            Object opt2 = ((JSONObject) opt).opt("videoPlayTimes");
            String obj = opt2 == null ? "0" : opt2.toString();
            if (!TextUtils.isEmpty(obj) && TextUtils.isDigitsOnly(obj)) {
                this.mPlayTimes = Long.parseLong(obj);
            }
        }
        Object opt3 = this.mData.opt("coverUrl");
        this.mCoverPicUrl = opt3 == null ? null : String.valueOf(opt3);
        Object opt4 = this.mData.opt("duration");
        this.mVideoDuration = opt4 == null ? null : String.valueOf(opt4);
        if (!TextUtils.isEmpty(this.mVideoDuration) && TextUtils.isDigitsOnly(this.mVideoDuration)) {
            this.mVideoDuration = kco.b(Integer.parseInt(this.mVideoDuration));
        } else {
            this.mVideoDuration = null;
        }
    }

    public DWFrontCoverBean(Long l, String str, String str2) {
        this.mPlayTimes = l.longValue();
        this.mVideoDuration = str;
        this.mCoverPicUrl = str2;
    }

    public long getPlayTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b19d2437", new Object[]{this})).longValue() : this.mPlayTimes;
    }

    public String getVideoDuration() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7860ed20", new Object[]{this}) : this.mVideoDuration;
    }

    public String getCoverPicUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb681d3", new Object[]{this}) : this.mCoverPicUrl;
    }

    public ImageView.ScaleType getScaleType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView.ScaleType) ipChange.ipc$dispatch("16d492db", new Object[]{this}) : this.mScaleType;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else {
            this.mScaleType = scaleType;
        }
    }
}
