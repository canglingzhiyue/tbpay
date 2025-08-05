package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class icf {
    public static final String BROADCAST_CANCEL_ACTION = "action.cancel";
    public static final String BROADCAST_COMPLETE_ACTION = "action.complete";
    public static final String BROADCAST_FAIL_ACTION = "action.fail";
    public static final int DEFAULT_ALPHA = 243;
    public static final int EVENT_ID = 19999;
    public static final String KEY_ALBUM = "ALBUM";
    public static final String KEY_BUCKET_ID = "BUCKET_ID";
    public static final String KEY_EDIT_PICTURE = "EDIT_PICTURE";
    public static final String KEY_FROM_CAMERA = "FROM_CAMERA";
    public static final String KEY_FROM_CAMERA_PREVIEW = "FROM_CAMERA_PREVIEW";
    public static final String KEY_IMAGE_PATH = "IMAGE_PATH";
    public static final String KEY_IMAGE_PATHS = "IMAGE_PATHS";
    public static final String KEY_IMAGE_RESULT = "IMAGE_RESULT";
    public static final String KEY_MEDIA_IMAGE = "MEDIA_IMAGE";
    public static final String KEY_PREVIEW_ALL = "PREVIEW_ALL";
    public static final String KEY_PREVIEW_CHECKED = "PREVIEW_CHECKED";
    public static final String KEY_PREVIEW_EDITED = "PREVIEW_EDITED";
    public static final String KEY_PREVIEW_POSITION = "PREVIEW_POSITION";
    public static final String KEY_RUNTIME_BITMAP = "RUNTIME_BITMAP";
    public static final String MULTIPLE_ARG1 = "Page_ISDK_Publish_Img-MultiImg";
    public static final String PAGE_NAME = "Page_ISDK_Publish_Img";
    public static final String SINGLE_ARG1 = "Page_ISDK_Publish_Img-SingleImg";

    static {
        kge.a(-2114207113);
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ALBUM_ALBUM_PAGE_NAME = "Page_TaoAlbumAlbum_Pi";
        public static final String ALBUM_ALBUM_SPM = "a2116i.11566232";
        public static final String ALBUM_PAGE_NAME = "Page_TaoAlbum_Pi";
        public static final String ALBUM_SPM = "a2116i.11566223";
        public static final String CONTROL_ALBUM = "Album";
        public static final String CONTROL_CLIP = "Clip";
        public static final String CONTROL_DETECT_POST_SUCCESS = "DetectPoseSuccess";
        public static final String CONTROL_EDIT = "Edit";
        public static final String CONTROL_FILTER = "Filter";
        public static final String CONTROL_GRAFFITI = "Graffiti";
        public static final String CONTROL_MOSAIC = "Mosaic";
        public static final String CONTROL_NAME_CANCEL = "Cancel";
        public static final String CONTROL_NAME_OK = "OK";
        public static final String CONTROL_PHOTO = "Photo";
        public static final String CONTROL_POSTURE = "Posture";
        public static final String CONTROL_STICKER = "Sticker";
        public static final String EDIT_PAGE_NAME = "Page_TaoAlbumEdit_Pi";
        public static final String EDIT_SPM = "a2116i.11566228";
        public static final String KEY_BIZ_ID = "bizid";
        public static final String KEY_OPTION = "option";
        public static final String KEY_SCORE = "score";
        public static final String KEY_SPM_CNT = "spm-cnt";
        public static final String PAGE_NAME = "Page_Pic_Publish";
        public static final String PREVIEW_PAGE_NAME = "Page_TaoAlbumPreview_Pi";
        public static final String PREVIEW_SPM = "a2116i.11566225";
        public static final String SPM_CNT = "a21xm.9439189.0.0";

        /* renamed from: a  reason: collision with root package name */
        public static boolean f28903a;
        public static boolean b;
        public static boolean c;
        public static boolean d;

        static {
            kge.a(1605473635);
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            f28903a = false;
            b = false;
            c = false;
            d = false;
        }

        public static String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
            }
            StringBuilder sb = new StringBuilder();
            if (f28903a) {
                sb.append("&graffiti");
            }
            if (b) {
                sb.append("&cut");
            }
            if (c) {
                sb.append("&filter");
            }
            if (d) {
                sb.append("&sticker");
            }
            String sb2 = sb.toString();
            return !TextUtils.isEmpty(sb2) ? sb2.substring(1) : sb2;
        }
    }
}
