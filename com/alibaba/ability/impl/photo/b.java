package com.alibaba.ability.impl.photo;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bfy;
import tb.kge;

/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CAPTURE = "takeFromScreen";
    public static final String API_FROM_CAMERA = "takeFromCamera";
    public static final String API_FROM_LIB = "takeFromPhotoLibrary";
    public static final String API_SAVE_TO_ALBUM = "saveToAlbum";
    public static final String BIZ_NAME = "bizName";
    public static final int CODE_FROM_ALBUM = 1002;
    public static final int CODE_FROM_CAPTURE = 1003;
    public static final int CODE_TAKE_PHOTO = 1001;
    public static final String ERROR_CODE_CAPTURE_ERROR = "SCREEN_CAPTURE_ERROR";
    public static final String ERROR_CODE_NO_PERMISSION = "NO_PERMISSION";
    public static final String ERROR_CODE_SELECT_ERROR = "SELECT_ERROR";
    public static final String ERROR_CODE_TAKE_PHOTO_ERROR = "TAKE_PHOTO_ERROR";
    public static final String ERROR_CODE_USER_CANCELED = "USER_CANCELED";
    public static final String IMG_MAX_SIZE = "imageMaxSize";
    public static final String IMG_UPLOAD_BIZ_CODE = "imgUploadBizCode";
    public static final String IMG_UPLOAD_BIZ_LINE = "imgUploadBizLine";
    public static final int MAX_IMAGE_SIZE = 10485760;
    public static final int MAX_VIDEO_SIZE = 83888680;
    public static final String MAX_V_SIZE = "maxVideoSize";
    public static final String NEED_THUMB_BASE64 = "needThumbBase64";
    public static final String NEED_UPLOAD = "needUpload";
    public static final String TAG_IMG = "ImageAbility";
    public static final String VIDEO_UPLOAD_BIZ_CODE = "videoUploadBizCode";

    /* renamed from: a  reason: collision with root package name */
    private static final bfy f1946a;

    static {
        kge.a(1569047966);
        f1946a = new bfy("IMAGE-SAVE", 3);
    }

    public static final bfy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("f02bf09", new Object[0]) : f1946a;
    }
}
