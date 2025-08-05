package com.alipay.zoloz.toyger.util;

import android.content.res.Resources;
import com.alipay.mobile.security.bio.config.bean.FaceTips;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.zoloz.toyger.workspace.FaceRemoteConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class PoseUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f6300a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "";
    private String m = "";
    private String n = "";

    private void a(Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a42f3f9", new Object[]{this, resources});
        } else if (resources == null) {
        } else {
            this.f6300a = resources.getString(R.string.topText);
            this.b = resources.getString(R.string.topText_no_face);
            this.c = resources.getString(R.string.topText_distance_too_far);
            this.d = resources.getString(R.string.topText_distance_too_close);
            this.e = resources.getString(R.string.topText_face_not_in_center);
            this.f = resources.getString(R.string.topText_bad_pitch);
            this.g = resources.getString(R.string.topText_bad_yaw);
            this.h = resources.getString(R.string.topText_is_moving);
            this.i = resources.getString(R.string.topText_bad_brightness);
            this.j = resources.getString(R.string.topText_bad_quality);
            this.k = resources.getString(R.string.topText_bad_eye_openness);
            this.l = resources.getString(R.string.topText_blink_openness);
            this.m = resources.getString(R.string.topText_stack_time);
            this.n = resources.getString(R.string.topText_is_blur);
        }
    }

    private void a(FaceRemoteConfig faceRemoteConfig) {
        FaceTips faceTips;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa168763", new Object[]{this, faceRemoteConfig});
        } else if (faceRemoteConfig == null || (faceTips = faceRemoteConfig.getFaceTips()) == null) {
        } else {
            if (!StringUtil.isNullorEmpty(faceTips.topText)) {
                this.f6300a = faceTips.topText;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_noface)) {
                this.b = faceTips.topText_noface;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_light)) {
                this.i = faceTips.topText_light;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_rectwidth)) {
                this.c = faceTips.topText_rectwidth;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_integrity)) {
                this.e = faceTips.topText_integrity;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_pitch)) {
                this.f = faceTips.topText_pitch;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_yaw)) {
                this.g = faceTips.topText_yaw;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_blur)) {
                this.n = faceTips.topText_blur;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_quality)) {
                this.j = faceTips.topText_quality;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_blink)) {
                this.l = faceTips.topText_blink;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_stay)) {
                this.h = faceTips.topText_stay;
            }
            if (!StringUtil.isNullorEmpty(faceTips.topText_max_rectwidth)) {
                this.d = faceTips.topText_max_rectwidth;
            }
            if (StringUtil.isNullorEmpty(faceTips.topText_openness)) {
                return;
            }
            this.k = faceTips.topText_openness;
        }
    }

    private void a(FaceRemoteConfig faceRemoteConfig, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de24399e", new Object[]{this, faceRemoteConfig, resources});
            return;
        }
        a(resources);
        a(faceRemoteConfig);
    }

    public PoseUtil(FaceRemoteConfig faceRemoteConfig, Resources resources) {
        a(faceRemoteConfig, resources);
    }

    public String getTopText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5367168d", new Object[]{this}) : this.f6300a;
    }

    public String getTopText_no_face() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c42a0b31", new Object[]{this}) : this.b;
    }

    public String getTopText_bad_quality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b46b47", new Object[]{this}) : this.j;
    }

    public String getTopText_blink_openness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1df37182", new Object[]{this}) : this.l;
    }

    public String getTopText_bad_brightness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a5ffd43b", new Object[]{this}) : this.i;
    }

    public String getTopText_distance_too_far() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e19b2c4", new Object[]{this}) : this.c;
    }

    public String getTopText_face_not_in_center() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6374c65", new Object[]{this}) : this.e;
    }

    public String getTopText_bad_pitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("30c222e6", new Object[]{this}) : this.f;
    }

    public String getTopText_blur() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b18a25f", new Object[]{this}) : this.n;
    }

    public String getTopText_is_moving() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1597f889", new Object[]{this}) : this.h;
    }

    public String getTopText_distance_too_close() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0150e03", new Object[]{this}) : this.d;
    }

    public String getTopText_bad_yaw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("45049e57", new Object[]{this}) : this.g;
    }

    public String getTopText_bad_eye_openness() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7544d49d", new Object[]{this}) : this.k;
    }

    public String getTopText_stack_time() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60fe9702", new Object[]{this}) : this.m;
    }
}
