package com.taobao.android.pissarro;

import com.taobao.taopai.business.util.l;

/* loaded from: classes6.dex */
public interface d {
    public static final String URL_BASE_CAMERA;
    public static final String URL_CAMERA_BACK_FACING;
    public static final String URL_CAMERA_FRONT_FACING;
    public static final String COMMON_KEY = "?biz_scene=pissarro";
    public static final String URL_IMAGE_EDIT = l.q + COMMON_KEY;

    static {
        String str = l.f + COMMON_KEY + "&scene=cameraPhoto&media_type=photo&record_music_off=1&gallery_mul_select_enable=0&record_decals_off=1&pic_ratio_off=1";
        URL_BASE_CAMERA = str;
        URL_CAMERA_FRONT_FACING = str;
        URL_CAMERA_BACK_FACING = URL_BASE_CAMERA + "&back_camera=1";
    }
}
