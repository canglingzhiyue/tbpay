package com.android.dingtalk.share.ddsharemodule.message;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import java.io.ByteArrayOutputStream;
import tb.kge;

/* loaded from: classes3.dex */
public class DDImageMessage extends BaseMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_IMAGE_DATA_LENGTH = 10485760;
    private static final int MAX_IMAGE_THUMB_DATA_LENGTH = 32768;
    private static final int MAX_IMAGE_URL_LENGTH = 10240;
    private static final String TAG = "DDImageMessage";
    public byte[] mImageData;
    public String mImagePath;
    public Uri mImageUri;
    public String mImageUrl;

    static {
        kge.a(1634074463);
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public int getSupportVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6cc357f9", new Object[]{this})).intValue() : ShareConstant.DINGDING_SDK_SHARE_VERSION_V1;
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 3;
    }

    public DDImageMessage() {
    }

    public DDImageMessage(byte[] bArr) {
        this.mImageData = bArr;
    }

    public DDImageMessage(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream);
            this.mImageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
        } else if (bundle == null) {
        } else {
            bundle.putByteArray(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_DATA, this.mImageData);
            bundle.putString(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_PATH, this.mImagePath);
            bundle.putString(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_URL, this.mImageUrl);
            bundle.putParcelable(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_URI, this.mImageUri);
        }
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
        } else if (bundle == null) {
        } else {
            this.mImageData = bundle.getByteArray(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_DATA);
            this.mImagePath = bundle.getString(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_PATH);
            this.mImageUrl = bundle.getString(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_URL);
            this.mImageUri = (Uri) bundle.getParcelable(ShareConstant.EXTRA_IMAGE_OBJECT_IMAGE_URI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkArgs() {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.android.dingtalk.share.ddsharemodule.message.DDImageMessage.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            java.lang.String r2 = "30f26010"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            byte[] r0 = r8.mImageData
            java.lang.String r1 = "DDImageMessage"
            if (r0 == 0) goto L22
            int r0 = r0.length
            if (r0 != 0) goto L3a
        L22:
            java.lang.String r0 = r8.mImagePath
            if (r0 == 0) goto L2c
            int r0 = r0.length()
            if (r0 != 0) goto L3a
        L2c:
            java.lang.String r0 = r8.mImageUrl
            if (r0 == 0) goto L36
            int r0 = r0.length()
            if (r0 != 0) goto L3a
        L36:
            android.net.Uri r0 = r8.mImageUri
            if (r0 == 0) goto L91
        L3a:
            byte[] r0 = r8.mImageData
            r4 = 10485760(0xa00000, float:1.469368E-38)
            if (r0 == 0) goto L49
            int r0 = r0.length
            if (r0 <= r4) goto L49
            java.lang.String r0 = "checkArgs fail, content is too large"
            android.util.Log.e(r1, r0)
            return r3
        L49:
            java.lang.String r0 = r8.mImagePath
            r5 = 10240(0x2800, float:1.4349E-41)
            if (r0 == 0) goto L5b
            int r0 = r0.length()
            if (r0 <= r5) goto L5b
            java.lang.String r0 = "checkArgs fail, path is invalid"
            android.util.Log.e(r1, r0)
            return r3
        L5b:
            java.lang.String r0 = r8.mImagePath
            if (r0 == 0) goto L80
            int r6 = r0.length()
            if (r6 == 0) goto L77
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            boolean r0 = r6.exists()
            if (r0 != 0) goto L71
            goto L77
        L71:
            long r6 = r6.length()
            int r0 = (int) r6
            goto L78
        L77:
            r0 = 0
        L78:
            if (r0 <= r4) goto L80
            java.lang.String r0 = "checkArgs fail, image content is too large"
            android.util.Log.e(r1, r0)
            return r3
        L80:
            java.lang.String r0 = r8.mImageUrl
            if (r0 == 0) goto L90
            int r0 = r0.length()
            if (r0 <= r5) goto L90
            java.lang.String r0 = "checkArgs fail, url is invalid"
            android.util.Log.e(r1, r0)
            return r3
        L90:
            return r2
        L91:
            java.lang.String r0 = "checkArgs fail, all arguments are null"
            android.util.Log.e(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dingtalk.share.ddsharemodule.message.DDImageMessage.checkArgs():boolean");
    }

    @Override // com.android.dingtalk.share.ddsharemodule.message.BaseMediaObject, com.android.dingtalk.share.ddsharemodule.message.DDMediaMessage.IMediaObject
    public void attachContext(Context context) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
        } else if (context == null || (uri = this.mImageUri) == null) {
        } else {
            try {
                context.grantUriPermission(ShareConstant.DD_APP_PACKAGE, uri, 1);
                context.grantUriPermission(ShareConstant.ALI_DD_APP_PACKAGE, this.mImageUri, 1);
            } catch (Throwable th) {
                Log.e(TAG, "attachContext: ", th);
            }
        }
    }
}
