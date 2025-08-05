package com.android.dingtalk.share.ddsharemodule.message;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.ShareConstant;
import java.io.ByteArrayOutputStream;
import tb.kge;

/* loaded from: classes3.dex */
public class DDMediaMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_CONTENT_LENGTH = 1024;
    private static final int MAX_THUMB_DATA_LENGTH = 32768;
    private static final int MAX_TITLE_LENGTH = 512;
    private static final String TAG = "DDMediaMessage";
    public String mContent;
    public IMediaObject mMediaObject;
    public int mSDKVersion;
    public byte[] mThumbData;
    public String mThumbUrl;
    public String mTitle;
    public String mUrl;

    /* loaded from: classes3.dex */
    public interface IMediaObject {
        public static final int TYPE_IMAGE = 3;
        public static final int TYPE_TEXT = 2;
        public static final int TYPE_WEBPAGE = 1;
        public static final int TYPE_ZHIFUBAO = 0;

        void attachContext(Context context);

        boolean checkArgs();

        int getSupportVersion();

        void serialize(Bundle bundle);

        int type();

        void unserialize(Bundle bundle);
    }

    static {
        kge.a(1055358134);
    }

    public DDMediaMessage() {
        this(null);
    }

    public DDMediaMessage(IMediaObject iMediaObject) {
        this.mMediaObject = iMediaObject;
    }

    public final int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        IMediaObject iMediaObject = this.mMediaObject;
        if (iMediaObject != null) {
            return iMediaObject.type();
        }
        return 0;
    }

    public final void setThumbImage(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55002dc0", new Object[]{this, bitmap});
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream);
            this.mThumbData = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final boolean checkArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30f26010", new Object[]{this})).booleanValue();
        }
        byte[] bArr = this.mThumbData;
        if (bArr != null && bArr.length > 32768) {
            Log.e(TAG, "checkArgs fail, thumbData is invalid");
            return false;
        }
        String str = this.mTitle;
        if (str != null && str.length() > 512) {
            Log.e(TAG, "checkArgs fail, title is invalid");
            return false;
        }
        String str2 = this.mContent;
        if (str2 != null && str2.length() > 1024) {
            Log.e(TAG, "checkArgs fail, content is invalid");
            return false;
        }
        IMediaObject iMediaObject = this.mMediaObject;
        if (iMediaObject == null) {
            Log.e(TAG, "checkArgs fail, mediaObject is null");
            return false;
        }
        return iMediaObject.checkArgs();
    }

    public final int getSupportVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cc357f9", new Object[]{this})).intValue();
        }
        IMediaObject iMediaObject = this.mMediaObject;
        if (iMediaObject != null) {
            return iMediaObject.getSupportVersion();
        }
        return Integer.MAX_VALUE;
    }

    public final void attachContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ff7db7", new Object[]{this, context});
            return;
        }
        IMediaObject iMediaObject = this.mMediaObject;
        if (iMediaObject == null) {
            return;
        }
        iMediaObject.attachContext(context);
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(49888653);
        }

        public static Bundle toBundle(DDMediaMessage dDMediaMessage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65502feb", new Object[]{dDMediaMessage});
            }
            Bundle bundle = new Bundle();
            bundle.putInt(ShareConstant.EXTRA_AP_OBJECT_SDK_VERSION, dDMediaMessage.mSDKVersion);
            bundle.putString(ShareConstant.EXTRA_AP_OBJECT_TITLE, dDMediaMessage.mTitle);
            bundle.putString(ShareConstant.EXTRA_AP_OBJECT_DESCRIPTION, dDMediaMessage.mContent);
            bundle.putByteArray(ShareConstant.EXTRA_AP_OBJECT_THUMB_DATA, dDMediaMessage.mThumbData);
            bundle.putString(ShareConstant.EXTRA_AP_OBJECT_THUMB_URL, dDMediaMessage.mThumbUrl);
            if (dDMediaMessage != null && dDMediaMessage.mMediaObject != null) {
                bundle.putString(ShareConstant.EXTRA_AP_OBJECT_IDENTIFIER, dDMediaMessage.mMediaObject.getClass().getName());
                dDMediaMessage.mMediaObject.serialize(bundle);
            }
            return bundle;
        }

        public static DDMediaMessage fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            DDMediaMessage dDMediaMessage = new DDMediaMessage();
            dDMediaMessage.mSDKVersion = bundle.getInt(ShareConstant.EXTRA_AP_OBJECT_SDK_VERSION);
            dDMediaMessage.mTitle = bundle.getString(ShareConstant.EXTRA_AP_OBJECT_TITLE);
            dDMediaMessage.mContent = bundle.getString(ShareConstant.EXTRA_AP_OBJECT_DESCRIPTION);
            dDMediaMessage.mThumbData = bundle.getByteArray(ShareConstant.EXTRA_AP_OBJECT_THUMB_DATA);
            dDMediaMessage.mThumbUrl = bundle.getString(ShareConstant.EXTRA_AP_OBJECT_THUMB_URL);
            String string = bundle.getString(ShareConstant.EXTRA_AP_OBJECT_IDENTIFIER);
            if (string != null && string.length() > 0) {
                try {
                    dDMediaMessage.mMediaObject = (IMediaObject) Class.forName(string).newInstance();
                    dDMediaMessage.mMediaObject.unserialize(bundle);
                    return dDMediaMessage;
                } catch (Exception e) {
                    e.printStackTrace();
                    Log.e(DDMediaMessage.TAG, "get media object from bundle failed: unknown ident " + string);
                }
            }
            return dDMediaMessage;
        }
    }
}
