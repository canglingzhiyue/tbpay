package com.alipay.share.sdk.openapi;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class APImageObject implements APMediaMessage.IMediaObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public byte[] imageData;
    public String imagePath;
    public String imageUrl;

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 14;
    }

    public APImageObject() {
    }

    public APImageObject(byte[] bArr) {
        this.imageData = bArr;
    }

    public APImageObject(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
            this.imageData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public void setImagePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dedef", new Object[]{this, str});
        } else {
            this.imagePath = str;
        }
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void serialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16284a0d", new Object[]{this, bundle});
            return;
        }
        bundle.putByteArray(Constant.EXTRA_IMAGE_OBJECT_IMAGE_DATA, this.imageData);
        bundle.putString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_PATH, this.imagePath);
        bundle.putString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_URL, this.imageUrl);
    }

    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    public void unserialize(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("185fb4a6", new Object[]{this, bundle});
            return;
        }
        this.imageData = bundle.getByteArray(Constant.EXTRA_IMAGE_OBJECT_IMAGE_DATA);
        this.imagePath = bundle.getString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_PATH);
        this.imageUrl = bundle.getString(Constant.EXTRA_IMAGE_OBJECT_IMAGE_URL);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    @Override // com.alipay.share.sdk.openapi.APMediaMessage.IMediaObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkArgs() {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.share.sdk.openapi.APImageObject.$ipChange
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
            byte[] r0 = r8.imageData
            java.lang.String r1 = "APSDK.ZFBImageObject"
            if (r0 == 0) goto L22
            int r0 = r0.length
            if (r0 != 0) goto L37
        L22:
            java.lang.String r0 = r8.imagePath
            if (r0 == 0) goto L2c
            int r0 = r0.length()
            if (r0 != 0) goto L37
        L2c:
            java.lang.String r0 = r8.imageUrl
            if (r0 == 0) goto L90
            int r0 = r0.length()
            if (r0 != 0) goto L37
            goto L90
        L37:
            byte[] r0 = r8.imageData
            r4 = 10485760(0xa00000, float:1.469368E-38)
            if (r0 == 0) goto L46
            int r0 = r0.length
            if (r0 <= r4) goto L46
            java.lang.String r0 = "checkArgs fail, content is too large"
            android.util.Log.e(r1, r0)
            return r3
        L46:
            java.lang.String r0 = r8.imagePath
            r5 = 10240(0x2800, float:1.4349E-41)
            if (r0 == 0) goto L58
            int r0 = r0.length()
            if (r0 <= r5) goto L58
            java.lang.String r0 = "checkArgs fail, path is invalid"
            android.util.Log.e(r1, r0)
            return r3
        L58:
            java.lang.String r0 = r8.imagePath
            if (r0 == 0) goto L7f
            if (r0 == 0) goto L76
            int r6 = r0.length()
            if (r6 == 0) goto L76
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            boolean r0 = r6.exists()
            if (r0 != 0) goto L70
            goto L76
        L70:
            long r6 = r6.length()
            int r0 = (int) r6
            goto L77
        L76:
            r0 = 0
        L77:
            if (r0 <= r4) goto L7f
            java.lang.String r0 = "checkArgs fail, image content is too large"
            android.util.Log.e(r1, r0)
            return r3
        L7f:
            java.lang.String r0 = r8.imageUrl
            if (r0 == 0) goto L8f
            int r0 = r0.length()
            if (r0 <= r5) goto L8f
            java.lang.String r0 = "checkArgs fail, url is invalid"
            android.util.Log.e(r1, r0)
            return r3
        L8f:
            return r2
        L90:
            java.lang.String r0 = "checkArgs fail, all arguments are null"
            android.util.Log.e(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.share.sdk.openapi.APImageObject.checkArgs():boolean");
    }
}
