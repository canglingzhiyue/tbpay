package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.config.j;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.monitor.a;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.uc.webview.export.extension.ExtImageDecoder;
import com.uc.webview.export.extension.GlobalSettings;
import com.uc.webview.export.extension.SettingKeys;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ihq;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class ExtImgDecoder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ExtImgDecoder";
    private static final AtomicBoolean inited;
    private static volatile ExtImgDecoder sInstance;
    private static boolean sUcDecoderEnable;
    private Context mContext;
    private boolean mUseAlphaChannelDecoder;
    private DecoderListener heicDecodeListener = new DecoderListener("ftypheic");
    private DecoderListener mifDecodeListener = new DecoderListener("ftypmif1");

    static {
        kge.a(1774529284);
        sUcDecoderEnable = true;
        inited = new AtomicBoolean(false);
    }

    public static ExtImgDecoder getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtImgDecoder) ipChange.ipc$dispatch("d93cbaf", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (ExtImgDecoder.class) {
                if (sInstance == null) {
                    sInstance = new ExtImgDecoder();
                }
            }
        }
        return sInstance;
    }

    /* loaded from: classes2.dex */
    public class DecoderListener implements ExtImageDecoder.ImageDecoderListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String format;
        private boolean imageDecodeSuccess = false;

        static {
            kge.a(898948952);
        }

        public static /* synthetic */ boolean access$000(DecoderListener decoderListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2abfbfd2", new Object[]{decoderListener})).booleanValue() : decoderListener.imageDecodeSuccess;
        }

        public DecoderListener(String str) {
            this.format = str;
        }

        @Override // com.uc.webview.export.extension.ExtImageDecoder.ImageDecoderListener
        public void onInit(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebf9012d", new Object[]{this, new Integer(i)});
                return;
            }
            m.e(ExtImgDecoder.TAG, "DecoderListener onInit " + i);
            if (i == 0) {
                m.e(ExtImgDecoder.TAG, "ok");
                this.imageDecodeSuccess = true;
                a.commitSuccess(a.MONITOR_POINT_DECODER_INIT_TYPE, this.format);
            } else if (i == 1) {
                m.e(ExtImgDecoder.TAG, "can't load library");
                a.commitFail(a.MONITOR_POINT_DECODER_INIT_TYPE, i, "can't load library", this.format);
            } else if (i == 2) {
                m.e(ExtImgDecoder.TAG, "can't load function");
                a.commitFail(a.MONITOR_POINT_DECODER_INIT_TYPE, i, "can't load function", this.format);
            } else if (i == 3) {
                m.e(ExtImgDecoder.TAG, "uc core not support");
                a.commitFail(a.MONITOR_POINT_DECODER_INIT_TYPE, i, "uc core not support", this.format);
            } else {
                m.e(ExtImgDecoder.TAG, "unknown");
                a.commitFail(a.MONITOR_POINT_DECODER_INIT_TYPE, i, "unknown", this.format);
            }
        }

        @Override // com.uc.webview.export.extension.ExtImageDecoder.ImageDecoderListener
        public void onDecode(String str, String str2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4be3f23b", new Object[]{this, str, str2, new Integer(i)});
            } else if (i != 0) {
                m.e(ExtImgDecoder.TAG, "onDecode url = " + str + " format = " + str2 + " result = " + i);
                a.commitFail(a.MONITOR_POINT_DECODE_IMG_URL_TYPE, i, str2, str);
            } else {
                a.commitCounter(a.MONITOR_POINT_DECODE_IMG_TYPE, "success", 1.0d);
            }
        }

        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("759fd805", new Object[]{this, new Integer(i), objArr});
            }
            m.e(ExtImgDecoder.TAG, "invoke() called with: methodID = [" + i + "], params = [" + objArr + riy.ARRAY_END_STR);
            return null;
        }
    }

    public void initDecoderSwitch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ae24b9", new Object[]{this, context});
            return;
        }
        try {
            m.e(TAG, "initDocederSwitch enable:" + j.commonConfig.al);
            this.mContext = context;
            sUcDecoderEnable = isExtImgDecoderEnable();
            GlobalSettings.set(SettingKeys.ExtImgDecoderOn, sUcDecoderEnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!inited.compareAndSet(false, true)) {
        } else {
            initInternal(context);
        }
    }

    public void initInternal(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db22054", new Object[]{this, context});
            return;
        }
        try {
            m.e(TAG, "init");
            if (!isExtImgDecoderEnable()) {
                m.e(TAG, "NOT enableExtImgDecoder");
                if (!isExtImgDecoderSuccess()) {
                    return;
                }
                m.e(TAG, "Close image decoder");
                GlobalSettings.set(SettingKeys.ExtImgDecoderOn, false);
            } else if (!sUcDecoderEnable) {
                m.e(TAG, "ucDecoder not Enable, abort");
            } else if (isExtImgDecoderSuccess()) {
                m.e(TAG, "setExtImageDecoderSuccessed, abort");
            } else {
                String str = "ucheif";
                if (ABGlobal.isFeatureOpened(this.mContext, "wvEnableHeicWithTransparencyV2")) {
                    str = "ucheif_alpha";
                    this.mUseAlphaChannelDecoder = true;
                }
                m.e(TAG, "mSupportAlphaChannel " + this.mUseAlphaChannelDecoder);
                String b = ihq.b().a(str).b();
                if (TextUtils.isEmpty(b)) {
                    inited.set(false);
                    m.e(TAG, "so don't exist");
                } else if (!WVCore.getInstance().isUCSupport()) {
                    inited.set(false);
                    m.e(TAG, "uc core not ready");
                } else {
                    String[] strArr = {context.getApplicationInfo().nativeLibraryDir + "/libc++_shared.so"};
                    if (new File(b).exists()) {
                        ExtImageDecoder.ExtImageDecoderParam extImageDecoderParam = new ExtImageDecoder.ExtImageDecoderParam();
                        extImageDecoderParam.format = "ftypheic";
                        extImageDecoderParam.version = "0.1.0";
                        extImageDecoderParam.filenameExtension = "heic";
                        extImageDecoderParam.headerLength = 20;
                        extImageDecoderParam.progressiveDecode = true;
                        extImageDecoderParam.mime = "image/heic";
                        extImageDecoderParam.sniffOffset = 4;
                        extImageDecoderParam.decoderPath = b;
                        extImageDecoderParam.dependedPath = strArr;
                        ExtImageDecoder.ExtImageDecoderParam extImageDecoderParam2 = new ExtImageDecoder.ExtImageDecoderParam();
                        extImageDecoderParam2.format = "ftypmif1";
                        extImageDecoderParam2.version = "0.1.0";
                        extImageDecoderParam2.filenameExtension = "heic";
                        extImageDecoderParam2.headerLength = 20;
                        extImageDecoderParam2.progressiveDecode = true;
                        extImageDecoderParam2.mime = "image/heif";
                        extImageDecoderParam2.sniffOffset = 4;
                        extImageDecoderParam2.decoderPath = b;
                        extImageDecoderParam2.dependedPath = strArr;
                        ExtImageDecoder.setExtImageDecoder(extImageDecoderParam, this.heicDecodeListener);
                        ExtImageDecoder.setExtImageDecoder(extImageDecoderParam2, this.mifDecodeListener);
                        m.e(TAG, "setExtImageDecoder over");
                        return;
                    }
                    inited.set(false);
                    m.e(TAG, "!! error " + b);
                }
            }
        } catch (Throwable th) {
            inited.set(false);
            m.e(TAG, android.taobao.windvane.util.a.a(th));
        }
    }

    private boolean isExtImgDecoderSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7ac64f6", new Object[]{this})).booleanValue() : DecoderListener.access$000(this.heicDecodeListener) && DecoderListener.access$000(this.mifDecodeListener);
    }

    public boolean canExtImgDecoder() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e361f99d", new Object[]{this})).booleanValue();
        }
        try {
            z = isExtImgDecoderEnable();
        } catch (Throwable th) {
            th.printStackTrace();
            z = true;
        }
        return z && isExtImgDecoderSuccess();
    }

    public boolean useAlphaChannelDecoder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25034643", new Object[]{this})).booleanValue() : this.mUseAlphaChannelDecoder;
    }

    public boolean isExtImgDecoderEnable() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69a7f9a6", new Object[]{this})).booleanValue();
        }
        try {
            j.a();
            z = j.commonConfig.al;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!z) {
            m.e(TAG, "isExtImgDecoderEnable: " + z);
        }
        return z;
    }

    public boolean isExchangeImgUrlEnable() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d48b9fe7", new Object[]{this})).booleanValue();
        }
        try {
            j.a();
            z = j.commonConfig.am;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!z) {
            m.e(TAG, "enableExchangeImgUrl: " + z);
        }
        return z;
    }
}
