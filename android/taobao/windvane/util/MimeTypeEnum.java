package android.taobao.windvane.util;

import com.alipay.zoloz.toyger.blob.BlobManager;
import com.taobao.tao.util.Constants;
import tb.kin;

/* loaded from: classes2.dex */
public enum MimeTypeEnum {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG(com.taobao.android.litecreator.comprehension.f.FILE_TYPE_IMAGE_JPG, "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    SVG("svg", "image/svg+xml"),
    PNG("png", Constants.SHARETYPE_WITH_QRCODE),
    WEBP(BlobManager.UPLOAD_IMAGE_TYPE_WEBP, "image/webp"),
    GIF(kin.GIF_MODE, "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");
    
    private String mimeType;
    private String suffix;

    MimeTypeEnum(String str, String str2) {
        this.suffix = str;
        this.mimeType = str2;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setSuffix(String str) {
        this.suffix = str;
    }
}
