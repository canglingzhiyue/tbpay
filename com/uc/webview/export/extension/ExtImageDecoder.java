package com.uc.webview.export.extension;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;
import com.uc.webview.base.Log;
import com.uc.webview.export.WebView;

/* loaded from: classes9.dex */
public class ExtImageDecoder {
    private static final String TAG = "ExtImageDecoder";

    /* loaded from: classes9.dex */
    public interface ErrorCode {
        public static final int FILE_NOT_FOUND = 1;
        public static final int METHOD_NOT_FOUND = 2;
        public static final int NOT_SUPPORTED = 3;
        public static final int REPEAT_SET = 4;
        public static final int SUCCESS = 0;
    }

    /* loaded from: classes9.dex */
    public static class ExtImageDecoderParam {
        public String format = "";
        public String version = "";
        public String decoderPath = "";
        public String[] dependedPath = null;
        public String filenameExtension = "";
        public int headerLength = 0;
        public boolean progressiveDecode = true;
        public String mime = "";
        public int sniffOffset = 0;

        public boolean isValid() {
            return !StringUtils.isEmpty(this.format) && !StringUtils.isEmpty(this.mime) && !StringUtils.isEmpty(this.filenameExtension);
        }

        public String toString() {
            return "format=" + this.format + ", mime=" + this.mime + ", decoderPath=" + this.decoderPath;
        }
    }

    /* loaded from: classes9.dex */
    public interface ImageDecoderListener extends IExtender {
        void onDecode(String str, String str2, int i);

        void onInit(int i);
    }

    public static void requestExtImageDecoderResult() {
        if (WebView.getCoreType() != 3) {
            return;
        }
        try {
            Sdk2CoreHost.impl().requestExtImageDecoderResult();
        } catch (Exception e) {
            Log.e(TAG, "requestExtImageDecoderResult error", e);
        }
    }

    public static void setExtImageDecoder(ExtImageDecoderParam extImageDecoderParam, final ImageDecoderListener imageDecoderListener) {
        if (extImageDecoderParam == null || !extImageDecoderParam.isValid()) {
            Log.e(TAG, "setExtImageDecoder error, params invalid");
        } else if (WebView.getCoreType() != 3) {
            imageDecoderListener.onInit(3);
            Log.i(TAG, "setExtImageDecoder error, not u4 core, result=3");
        } else {
            String str = TAG;
            Log.i(str, "setExtImageDecoder, params:" + extImageDecoderParam.toString());
            try {
                Sdk2CoreHost.impl().setExtImageDecoder(extImageDecoderParam, new ValueCallback<Integer>() { // from class: com.uc.webview.export.extension.ExtImageDecoder.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Integer num) {
                        Integer num2 = num;
                        Log.i(ExtImageDecoder.TAG, "onInit, result=".concat(String.valueOf(num2)));
                        ImageDecoderListener imageDecoderListener2 = ImageDecoderListener.this;
                        if (imageDecoderListener2 != null) {
                            imageDecoderListener2.onInit(num2.intValue());
                        }
                    }
                }, new ValueCallback<Bundle>() { // from class: com.uc.webview.export.extension.ExtImageDecoder.2
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(Bundle bundle) {
                        Bundle bundle2 = bundle;
                        String string = bundle2.getString("url");
                        String string2 = bundle2.getString("format");
                        int i = bundle2.getInt("result");
                        ImageDecoderListener imageDecoderListener2 = ImageDecoderListener.this;
                        if (imageDecoderListener2 != null) {
                            imageDecoderListener2.onDecode(string, string2, i);
                        }
                    }
                });
            } catch (Exception e) {
                Log.e(TAG, "setExtImageDecoder error", e);
            }
        }
    }
}
