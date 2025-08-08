package com.alipay.android.msp.utils.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import anet.channel.util.HttpConstant;
import com.alipay.android.app.cctemplate.utils.MD5;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.callback.ImageLoadCallback;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBTools;
import com.taobao.share.ui.engine.friend.a;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.ils;
import tb.kgt;

/* loaded from: classes3.dex */
public class ImageLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DATA_URL_HEAD = "data:";
    private static final HashMap<String, Integer> Images;
    private static final String LOCAL_IMAGE_HEAD = "local:";
    private static final String NET_IMAGE_HEAD = "net:";
    private static final Pattern PATTERN_BIZ_TYPE;
    private static final String TAG = "ImageLoader";
    private static ImageLoader instance;

    /* renamed from: com.alipay.android.msp.utils.ui.ImageLoader$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$ClipsType = new int[ClipsType.values().length];
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$LoadAction;

        static {
            try {
                $SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$ClipsType[ClipsType.Corner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$ClipsType[ClipsType.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$LoadAction = new int[LoadAction.values().length];
            try {
                $SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$LoadAction[LoadAction.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$LoadAction[LoadAction.Background.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum ClipsType {
        None,
        Round,
        Corner
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface ILoadImageCallback<T> {
        void complete(T t);
    }

    /* loaded from: classes3.dex */
    public enum LoadAction {
        Image,
        Background
    }

    public static /* synthetic */ void access$200(ImageLoader imageLoader, View view, LoadAction loadAction, Drawable drawable, ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2af12b16", new Object[]{imageLoader, view, loadAction, drawable, imageLoadCallback});
        } else {
            imageLoader.setDrawable(view, loadAction, drawable, imageLoadCallback);
        }
    }

    public static /* synthetic */ Bitmap access$300(ImageLoader imageLoader, ClipsInfo clipsInfo, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("12f371bf", new Object[]{imageLoader, clipsInfo, bitmap}) : imageLoader.getDrawable(clipsInfo, bitmap);
    }

    public static /* synthetic */ Pattern access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pattern) ipChange.ipc$dispatch("2aa19b44", new Object[0]) : PATTERN_BIZ_TYPE;
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Images = hashMap;
        hashMap.put("white_content", Integer.valueOf(R.drawable.mini_bg_white));
        Images.put("gray_content", Integer.valueOf(R.drawable.mini_bg_gray));
        Images.put("header_line", Integer.valueOf(R.drawable.mini_header_line));
        Images.put("title", Integer.valueOf(R.drawable.mini_logo));
        Images.put("logo_orange", Integer.valueOf(R.drawable.mini_logo));
        Images.put("small_logo", Integer.valueOf(R.drawable.mini_small_logo));
        Images.put("footer_line", Integer.valueOf(R.drawable.mini_footer_line));
        Images.put("middle_line", Integer.valueOf(R.drawable.mini_footer_line));
        Images.put("sure", Integer.valueOf(R.drawable.mini_icon_sure));
        Images.put("page_title", Integer.valueOf(R.drawable.mini_card_title_bg));
        Images.put("vertical_line", Integer.valueOf(R.drawable.mini_vertical_line));
        Images.put("result_ok", Integer.valueOf(R.drawable.mini_icon_ok));
        Images.put("normal", Integer.valueOf(R.drawable.mini_btn_confirm_bg));
        Images.put(kgt.EVENT_HOVER, Integer.valueOf(R.drawable.mini_btn_confirm_hover));
        Images.put("normal_second", Integer.valueOf(R.drawable.mini_btn_disable));
        Images.put("hover_second", Integer.valueOf(R.drawable.mini_btn_push));
        Images.put("disable_second", Integer.valueOf(R.drawable.mini_btn_disable));
        Images.put("disable_gray", Integer.valueOf(R.drawable.mini_btn_disable));
        Images.put("disable_blue", Integer.valueOf(R.drawable.mini_btn_confirm_bg));
        Images.put("sms_normal", Integer.valueOf(R.drawable.mini_btn_disable));
        Images.put("sms_hover", Integer.valueOf(R.drawable.mini_btn_push));
        Images.put("disable", Integer.valueOf(R.drawable.mini_btn_disable));
        Images.put("login_disable", Integer.valueOf(R.drawable.mini_btn_confirm_bg));
        Images.put("finger_print_info", Integer.valueOf(R.drawable.mini_btn_confirm_bg));
        Images.put("goto", Integer.valueOf(R.drawable.mini_arrow));
        Images.put("back", Integer.valueOf(R.drawable.mini_back));
        Images.put("mini_fullscreen_switch", Integer.valueOf(R.drawable.mini_fullscreen_switch_selector));
        Images.put("inputGroup", Integer.valueOf(R.drawable.mini_input_bg));
        Images.put("help", Integer.valueOf(R.drawable.mini_help_icon));
        Images.put("help2", Integer.valueOf(R.drawable.mini_help_icon));
        Images.put("three_point", Integer.valueOf(R.drawable.alipay_msp_mini_three_point));
        Images.put("setpwd_logo", Integer.valueOf(R.drawable.mini_setpwd_logo));
        Images.put("insurance", Integer.valueOf(R.drawable.mini_insurance));
        Images.put("default_head", Integer.valueOf(R.drawable.mini_default_head));
        Images.put("bindcard", Integer.valueOf(R.drawable.mini_bindcard));
        Images.put("small_close", Integer.valueOf(R.drawable.mini_small_close));
        Images.put("alipay_icon", Integer.valueOf(R.drawable.alipay_icon));
        Images.put("alipay_head_img", Integer.valueOf(R.drawable.mini_default_head));
        Images.put("pwd_tips", Integer.valueOf(R.drawable.mini_pwd_tips));
        Images.put("check_channal", Integer.valueOf(R.drawable.mini_check_channal));
        Images.put("uncheck_channal", Integer.valueOf(R.drawable.mini_uncheck_channal));
        Images.put("black_back", Integer.valueOf(R.drawable.mini_black_back));
        Images.put("finger", Integer.valueOf(R.drawable.alipay_msp_mini_finger));
        Images.put(MspFlybirdDefine.FLYBIRD_SETTING_BRACELET, Integer.valueOf(R.drawable.mini_bracelet));
        PATTERN_BIZ_TYPE = Pattern.compile("([?&])biztype=([^&]*)(&|$)");
    }

    public static ImageLoader getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader) ipChange.ipc$dispatch("4778b9f6", new Object[0]);
        }
        if (instance == null) {
            synchronized (ImageLoader.class) {
                if (instance == null) {
                    instance = new ImageLoader();
                }
            }
        }
        return instance;
    }

    public static void loadImage(View view, String str, String str2, String str3, LoadAction loadAction, ClipsInfo clipsInfo, Context context, ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4dcb30", new Object[]{view, str, str2, str3, loadAction, clipsInfo, context, imageLoadCallback});
            return;
        }
        boolean z2 = !StringUtils.isEmpty(str2);
        boolean z3 = !StringUtils.isEmpty(str3);
        if (z2 && !z3) {
            if (loadAction == LoadAction.Background) {
                z = true;
            }
            loadImage(view, str, str2, z, clipsInfo, context, imageLoadCallback);
            return;
        }
        if (z2 || !z3) {
            if (!z2) {
                getInstance().loadImage(view, str, loadAction, clipsInfo, context, imageLoadCallback);
                return;
            } else if (!getInstance().isLocalImage(str)) {
                getInstance().loadLocalImage(view, str2, loadAction, clipsInfo, context, null);
            }
        }
        loadImage(view, str, str3, loadAction, clipsInfo, context, imageLoadCallback);
    }

    public static void loadImage(final View view, final String str, final String str2, final LoadAction loadAction, final ClipsInfo clipsInfo, final Context context, final ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc60fe6", new Object[]{view, str, str2, loadAction, clipsInfo, context, imageLoadCallback});
        } else {
            getInstance().loadImage(view, str, loadAction, clipsInfo, context, new ImageLoadCallback() { // from class: com.alipay.android.msp.utils.ui.ImageLoader.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.core.callback.ImageLoadCallback
                public void onLoadSuccess(int i, int i2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a1462621", new Object[]{this, new Integer(i), new Integer(i2), obj});
                        return;
                    }
                    ImageLoadCallback imageLoadCallback2 = ImageLoadCallback.this;
                    if (imageLoadCallback2 != null) {
                        imageLoadCallback2.onLoadSuccess(i, i2, obj);
                    }
                    LogUtil.record(2, "ImageLoader::loadImage", "load url success " + str);
                }

                @Override // com.alipay.android.msp.core.callback.ImageLoadCallback
                public void onLoadFailure(int i, int i2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i), new Integer(i2), obj});
                        return;
                    }
                    ImageLoader.getInstance().loadLocalImage(view, str2, loadAction, clipsInfo, context, null);
                    ImageLoadCallback imageLoadCallback2 = ImageLoadCallback.this;
                    if (imageLoadCallback2 != null) {
                        imageLoadCallback2.onLoadFailure(i, i2, obj);
                    }
                    LogUtil.record(2, "ImageLoader::loadImage", "load url failed " + str);
                }
            });
        }
    }

    public static void loadImage(View view, String str, String str2, boolean z, ClipsInfo clipsInfo, Context context, ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154c758a", new Object[]{view, str, str2, new Boolean(z), clipsInfo, context, imageLoadCallback});
            return;
        }
        LoadAction loadAction = z ? LoadAction.Background : LoadAction.Image;
        if (!getInstance().isLocalImage(str)) {
            getInstance().loadLocalImage(view, str2, loadAction, clipsInfo, context, null);
        }
        getInstance().loadImage(view, str, loadAction, clipsInfo, context, imageLoadCallback);
    }

    public static void loadImage(View view, String str, boolean z, ClipsInfo clipsInfo, Context context, ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e93c14", new Object[]{view, str, new Boolean(z), clipsInfo, context, imageLoadCallback});
        } else {
            getInstance().loadImage(view, str, z ? LoadAction.Background : LoadAction.Image, clipsInfo, context, imageLoadCallback);
        }
    }

    public void loadImage(View view, String str, LoadAction loadAction, ClipsInfo clipsInfo, Context context, ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50b361c", new Object[]{this, view, str, loadAction, clipsInfo, context, imageLoadCallback});
        } else if (view == null || StringUtils.isEmpty(str)) {
        } else {
            try {
                if (isLocalImage(str)) {
                    loadLocalImage(view, str, loadAction, clipsInfo, context, imageLoadCallback);
                } else {
                    loadNetImage(view, str, loadAction, clipsInfo, context, imageLoadCallback);
                }
            } catch (Exception e) {
                if (imageLoadCallback != null) {
                    imageLoadCallback.onLoadFailure(0, 0, null);
                }
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public static void loadImage(View view, String str, boolean z, boolean z2, ClipsInfo clipsInfo, Context context, ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8082c0", new Object[]{view, str, new Boolean(z), new Boolean(z2), clipsInfo, context, imageLoadCallback});
            return;
        }
        if (z2 && view != null) {
            try {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                ((ImageView) view).setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        getInstance().loadImage(view, str, z ? LoadAction.Background : LoadAction.Image, clipsInfo, context, imageLoadCallback);
    }

    public void loadLocalImage(View view, String str, LoadAction loadAction, ClipsInfo clipsInfo, Context context, ImageLoadCallback imageLoadCallback) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c125fd1b", new Object[]{this, view, str, loadAction, clipsInfo, context, imageLoadCallback});
        } else if (view == null || str == null || StringUtils.isEmpty(str)) {
        } else {
            if (str.startsWith(DATA_URL_HEAD)) {
                drawable = getBase64Drawable(str, context);
            } else {
                drawable = getDrawable(clipsInfo, context, str);
            }
            setDrawable(view, loadAction, drawable, imageLoadCallback);
        }
    }

    private Drawable getBase64Drawable(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("ee2f0946", new Object[]{this, str, context});
        }
        try {
            byte[] decode = Base64.decode(str.substring(str.indexOf(44) + 1), 2);
            return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "Base64ImgErr", th);
            return null;
        }
    }

    private void loadNetImage(final View view, String str, final LoadAction loadAction, ClipsInfo clipsInfo, final Context context, final ImageLoadCallback imageLoadCallback) throws UnsupportedEncodingException {
        String str2 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a4164d", new Object[]{this, view, str2, loadAction, clipsInfo, context, imageLoadCallback});
            return;
        }
        if (str2 == null) {
            str2 = "";
        } else if (!str2.startsWith("http")) {
            str2 = NetImageFormatter.analysisNetUrl(str);
        }
        final ClipsInfo clipsInfo2 = clipsInfo == null ? new ClipsInfo() : clipsInfo;
        if (clipsInfo2.getWh() == null) {
            clipsInfo2.setWh(new int[]{view.getMeasuredHeight(), view.getMeasuredWidth()});
        }
        final NetImageUrl format = NetImageFormatter.format(str2, ClipsInfo.access$000(clipsInfo2));
        NetImageAsyncTask netImageAsyncTask = new NetImageAsyncTask();
        NetImageAsyncTask.access$102(netImageAsyncTask, clipsInfo2);
        netImageAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, format.getNetUrl(), context, new ILoadImageCallback<Bitmap>() { // from class: com.alipay.android.msp.utils.ui.ImageLoader.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.utils.ui.ImageLoader.ILoadImageCallback
            public void complete(Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("847a90ee", new Object[]{this, bitmap});
                } else if (bitmap == null) {
                    if (format.getLocalUrl() == null) {
                        ImageLoadCallback imageLoadCallback2 = imageLoadCallback;
                        if (imageLoadCallback2 == null) {
                            return;
                        }
                        imageLoadCallback2.onLoadFailure(0, 0, null);
                        return;
                    }
                    ImageLoader.this.loadLocalImage(view, format.getLocalUrl(), loadAction, clipsInfo2, context, imageLoadCallback);
                } else {
                    ImageLoader.access$200(ImageLoader.this, view, loadAction, new BitmapDrawable(context.getResources(), bitmap), imageLoadCallback);
                }
            }
        });
    }

    private void setDrawable(View view, LoadAction loadAction, Drawable drawable, ImageLoadCallback imageLoadCallback) {
        int intrinsicWidth;
        int intrinsicHeight;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9563e2ca", new Object[]{this, view, loadAction, drawable, imageLoadCallback});
        } else if (view == null || drawable == null) {
        } else {
            int i = AnonymousClass3.$SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$LoadAction[loadAction.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    view.setBackgroundDrawable(drawable);
                } else {
                    view.setBackgroundDrawable(drawable);
                }
            } else if (view instanceof ImageView) {
                ((ImageView) view).setImageDrawable(drawable);
            } else {
                view.setBackgroundDrawable(drawable);
            }
            if (imageLoadCallback == null) {
                return;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                intrinsicWidth = bitmapDrawable.getBitmap().getWidth();
                intrinsicHeight = bitmapDrawable.getBitmap().getHeight();
            } else {
                intrinsicWidth = (int) (drawable.getIntrinsicWidth() * FBTools.getDp(view.getContext()));
                intrinsicHeight = (int) (drawable.getIntrinsicHeight() * FBTools.getDp(view.getContext()));
            }
            imageLoadCallback.onLoadSuccess(intrinsicWidth, intrinsicHeight, drawable);
        }
    }

    private Drawable getDrawable(ClipsInfo clipsInfo, Context context, String str) {
        int imageResId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("e1934a54", new Object[]{this, clipsInfo, context, str});
        }
        if (StringUtils.isEmpty(str) || (imageResId = getImageResId(str)) == 0) {
            return null;
        }
        Drawable drawable = context.getResources().getDrawable(imageResId);
        return !StringUtils.equals(drawable.getClass().getSimpleName(), BitmapDrawable.class.getSimpleName()) ? drawable : new BitmapDrawable(context.getResources(), getDrawable(clipsInfo, BitmapFactory.decodeResource(context.getResources(), imageResId)));
    }

    public int getImageResId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b7ca73a", new Object[]{this, str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        String substring = str.substring(str.lastIndexOf(":") + 1);
        try {
            if (substring.contains("/")) {
                int indexOf = substring.indexOf("/");
                String substring2 = substring.substring(0, indexOf);
                substring = substring.substring(indexOf + 1);
                if (!StringUtils.isEmpty(substring2)) {
                    return ResUtils.getResourceId(substring, a.CONTACTS_INFO_NOT_EMPTY_STATUS, substring2);
                }
            }
            if (Images.containsKey(substring)) {
                return Images.get(substring).intValue();
            }
            return ResUtils.getResourceId(substring, a.CONTACTS_INFO_NOT_EMPTY_STATUS, null);
        } catch (Exception unused) {
            return R.drawable.alipay_icon;
        }
    }

    private Bitmap getDrawable(ClipsInfo clipsInfo, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3825a20", new Object[]{this, clipsInfo, bitmap});
        }
        if (clipsInfo == null) {
            return bitmap;
        }
        ClipsType clipsType = clipsInfo.getClipsType();
        int[] wh = clipsInfo.getWh();
        if (clipsType == null || clipsType == ClipsType.None || wh == null || wh.length != 2) {
            return bitmap;
        }
        if (wh[0] <= 0) {
            wh[0] = 64;
        }
        if (wh[1] <= 0) {
            wh[1] = 64;
        }
        int i = AnonymousClass3.$SwitchMap$com$alipay$android$msp$utils$ui$ImageLoader$ClipsType[clipsType.ordinal()];
        if (i == 1) {
            return ClipsInfo.toCornerBitmap(bitmap, clipsInfo.getCorner(), wh[0], wh[1]);
        }
        return i != 2 ? bitmap : ClipsInfo.toRoundBitmap(bitmap, wh[0], wh[1]);
    }

    public void loadDefaultLocalImage(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a43700", new Object[]{this, view});
        } else if (!(view instanceof ImageView)) {
        } else {
            ImageView imageView = (ImageView) view;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setImageResource(R.drawable.alipay_icon);
        }
    }

    private boolean isLocalImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("546e448f", new Object[]{this, str})).booleanValue();
        }
        Context context = MspContextUtil.getContext();
        return !StringUtils.isEmpty(str) && (str.startsWith("local:") || str.startsWith("com.alipay.android.app") || ((DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_DATA_URL_TB, false, context) ^ true) && str.startsWith(DATA_URL_HEAD)));
    }

    /* loaded from: classes3.dex */
    public static class ClipsInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ClipsType clipsType;
        private int corner;
        private int[] wh;

        public static /* synthetic */ int[] access$000(ClipsInfo clipsInfo) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("3fcabed4", new Object[]{clipsInfo}) : clipsInfo.wh;
        }

        public int[] getWh() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("88e5d4d6", new Object[]{this}) : this.wh;
        }

        public void setWh(int[] iArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ea39a68", new Object[]{this, iArr});
            } else {
                this.wh = iArr;
            }
        }

        public ClipsType getClipsType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ClipsType) ipChange.ipc$dispatch("c44fc759", new Object[]{this}) : this.clipsType;
        }

        public void setClipsType(ClipsType clipsType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5caab59", new Object[]{this, clipsType});
            } else {
                this.clipsType = clipsType;
            }
        }

        public int getCorner() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("603c7c45", new Object[]{this})).intValue() : this.corner;
        }

        public void setCorner(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3db8f465", new Object[]{this, new Integer(i)});
            } else {
                this.corner = i;
            }
        }

        public static Bitmap toRoundBitmap(Bitmap bitmap, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("e21b7ee3", new Object[]{bitmap, new Integer(i), new Integer(i2)});
            }
            int width = bitmap.getWidth() == 0 ? 1 : bitmap.getWidth();
            int height = bitmap.getHeight() == 0 ? 1 : bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(i / width, i2 / height);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            Bitmap createBitmap2 = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap2);
            Paint paint = new Paint();
            Rect rect = new Rect((createBitmap.getWidth() - i) / 2, (createBitmap.getHeight() - i2) / 2, (createBitmap.getWidth() + i) / 2, (createBitmap.getHeight() + i2) / 2);
            Rect rect2 = new Rect(0, 0, i, i2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            int i3 = i / 2;
            int i4 = i2 / 2;
            int i5 = i3 > i4 ? i4 : i3;
            canvas.drawColor(0, PorterDuff.Mode.SRC_IN);
            canvas.drawCircle(i3, i4, i5, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(createBitmap, rect, rect2, paint);
            return createBitmap2;
        }

        public static Bitmap toCornerBitmap(Bitmap bitmap, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("20a58199", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3)});
            }
            int width = bitmap.getWidth() == 0 ? 1 : bitmap.getWidth();
            int height = bitmap.getHeight() == 0 ? 1 : bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.postScale(i2 / width, i3 / height);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            Bitmap createBitmap2 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Rect rect = new Rect(0, 0, i2, i3);
            float f = i;
            canvas.drawRoundRect(new RectF(rect), f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(createBitmap, rect, rect, paint);
            return createBitmap2;
        }
    }

    /* loaded from: classes3.dex */
    public class NetImageAsyncTask extends AsyncTask<Object, Void, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ClipsInfo cInfo = null;
        private ILoadImageCallback<Bitmap> callback;

        public static /* synthetic */ Object ipc$super(NetImageAsyncTask netImageAsyncTask, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2026216808) {
                super.onPreExecute();
                return null;
            } else if (hashCode == -1325021319) {
                super.onPostExecute((NetImageAsyncTask) objArr[0]);
                return null;
            } else if (hashCode != 566591929) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onCancelled();
                return null;
            }
        }

        public NetImageAsyncTask() {
        }

        public static /* synthetic */ ClipsInfo access$102(NetImageAsyncTask netImageAsyncTask, ClipsInfo clipsInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClipsInfo) ipChange.ipc$dispatch("9334603", new Object[]{netImageAsyncTask, clipsInfo});
            }
            netImageAsyncTask.cInfo = clipsInfo;
            return clipsInfo;
        }

        private String getImageCachePath(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("df2522c1", new Object[]{this, context});
            }
            if (context == null) {
                return null;
            }
            return context.getFilesDir().getPath() + "/img/";
        }

        private String getImageFileName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("326397c3", new Object[]{this, str});
            }
            if (str == null || StringUtils.isEmpty(str)) {
                return null;
            }
            return MD5.encryptMd5_32(str) + ".png";
        }

        private File getImageCacheDir(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("78a5d3ac", new Object[]{this, str});
            }
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }

        private boolean saveImageToCache(Bitmap bitmap, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e61b486c", new Object[]{this, bitmap, str})).booleanValue();
            }
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    File file = new File(str);
                    file.createNewFile();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        try {
                            fileOutputStream2.close();
                            return true;
                        } catch (IOException e) {
                            LogUtil.printExceptionStackTrace(e);
                            return true;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        LogUtil.printExceptionStackTrace(e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                LogUtil.printExceptionStackTrace(e3);
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                LogUtil.printExceptionStackTrace(e4);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private Bitmap getCacheImage(String str, String str2) {
            File[] listFiles;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("11d9dae8", new Object[]{this, str, str2});
            }
            File imageCacheDir = getImageCacheDir(str);
            if (imageCacheDir == null || (listFiles = imageCacheDir.listFiles()) == null) {
                return null;
            }
            for (File file : listFiles) {
                if (str2.equals(file.getName())) {
                    return BitmapFactory.decodeFile(str + str2);
                }
            }
            return null;
        }

        private Bitmap getNetImage(String str) {
            InputStream inputStream;
            Throwable th;
            HttpURLConnection httpURLConnection;
            Bitmap bitmap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("83b72a3", new Object[]{this, str});
            }
            InputStream inputStream2 = null;
            Bitmap bitmap2 = null;
            inputStream2 = null;
            inputStream2 = null;
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    try {
                        httpURLConnection.setConnectTimeout(30000);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            bitmap2 = BitmapFactory.decodeStream(inputStream);
                            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "ImageLoader.getNetImage", "ImageLoader Cache-Control ".concat(String.valueOf(httpURLConnection.getHeaderField(HttpConstant.CACHE_CONTROL))));
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    LogUtil.printExceptionStackTrace(e);
                                    return bitmap2;
                                }
                            }
                            if (httpURLConnection == null) {
                                return bitmap2;
                            }
                            httpURLConnection.disconnect();
                            return bitmap2;
                        } catch (Exception e2) {
                            e = e2;
                            bitmap = bitmap2;
                            inputStream2 = inputStream;
                            LogUtil.printExceptionStackTrace(e);
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e3) {
                                    LogUtil.printExceptionStackTrace(e3);
                                    return bitmap;
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return bitmap;
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e4) {
                                    LogUtil.printExceptionStackTrace(e4);
                                    throw th;
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        inputStream = inputStream2;
                        th = th3;
                    }
                } catch (Exception e5) {
                    e = e5;
                    bitmap = null;
                }
            } catch (Exception e6) {
                e = e6;
                httpURLConnection = null;
                bitmap = null;
            } catch (Throwable th4) {
                inputStream = null;
                th = th4;
                httpURLConnection = null;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[RETURN] */
        @Override // android.os.AsyncTask
        /* renamed from: doInBackground */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.graphics.Bitmap mo551doInBackground(java.lang.Object... r7) {
            /*
                r6 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.utils.ui.ImageLoader.NetImageAsyncTask.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L18
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r1[r2] = r6
                r1[r4] = r7
                java.lang.String r7 = "a591d80a"
                java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                return r7
            L18:
                r0 = 0
                if (r7 == 0) goto L87
                int r1 = r7.length
                r5 = 3
                if (r1 >= r5) goto L20
                goto L87
            L20:
                r1 = r7[r2]
                java.lang.String r1 = (java.lang.String) r1
                r2 = r7[r4]
                android.content.Context r2 = (android.content.Context) r2
                r7 = r7[r3]
                com.alipay.android.msp.utils.ui.ImageLoader$ILoadImageCallback r7 = (com.alipay.android.msp.utils.ui.ImageLoader.ILoadImageCallback) r7
                r6.callback = r7
                java.lang.String r7 = r6.getImageCachePath(r2)     // Catch: java.lang.Exception -> L5a
                java.lang.String r2 = r6.getImageFileName(r1)     // Catch: java.lang.Exception -> L5a
                android.graphics.Bitmap r3 = r6.getCacheImage(r7, r2)     // Catch: java.lang.Exception -> L5a
                if (r3 != 0) goto L58
                android.graphics.Bitmap r1 = r6.getNetImage(r1)     // Catch: java.lang.Exception -> L55
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L53
                r3.<init>()     // Catch: java.lang.Exception -> L53
                r3.append(r7)     // Catch: java.lang.Exception -> L53
                r3.append(r2)     // Catch: java.lang.Exception -> L53
                java.lang.String r7 = r3.toString()     // Catch: java.lang.Exception -> L53
                r6.saveImageToCache(r1, r7)     // Catch: java.lang.Exception -> L53
                goto L7b
            L53:
                r7 = move-exception
                goto L5c
            L55:
                r7 = move-exception
                r1 = r3
                goto L5c
            L58:
                r1 = r3
                goto L7b
            L5a:
                r7 = move-exception
                r1 = r0
            L5c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "ImgAsynctask - doInBackground Msg["
                r2.<init>(r3)
                java.lang.String r7 = r7.getMessage()
                r2.append(r7)
                java.lang.String r7 = "]"
                r2.append(r7)
                java.lang.String r7 = r2.toString()
                java.lang.String r2 = "phonecashiermsp"
                java.lang.String r3 = "ImageLoader.doInBackground"
                com.alipay.android.msp.utils.LogUtil.record(r4, r2, r3, r7)
            L7b:
                if (r1 == 0) goto L86
                com.alipay.android.msp.utils.ui.ImageLoader r7 = com.alipay.android.msp.utils.ui.ImageLoader.this
                com.alipay.android.msp.utils.ui.ImageLoader$ClipsInfo r0 = r6.cInfo
                android.graphics.Bitmap r7 = com.alipay.android.msp.utils.ui.ImageLoader.access$300(r7, r0, r1)
                return r7
            L86:
                return r0
            L87:
                r6.cancel(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.utils.ui.ImageLoader.NetImageAsyncTask.mo551doInBackground(java.lang.Object[]):android.graphics.Bitmap");
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21c581b9", new Object[]{this});
            } else {
                super.onCancelled();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("873a6298", new Object[]{this});
            } else {
                super.onPreExecute();
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
                return;
            }
            super.onPostExecute((NetImageAsyncTask) bitmap);
            ILoadImageCallback<Bitmap> iLoadImageCallback = this.callback;
            if (iLoadImageCallback == null) {
                return;
            }
            iLoadImageCallback.complete(bitmap);
        }
    }

    /* loaded from: classes3.dex */
    public static class NetImageUrl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String localUrl;
        private String netUrl;

        public NetImageUrl(String str, String str2) {
            this.netUrl = str;
            this.localUrl = str2;
        }

        public String getNetUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f659ee71", new Object[]{this}) : this.netUrl;
        }

        public String getLocalUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d83b8fbf", new Object[]{this}) : this.localUrl;
        }
    }

    /* loaded from: classes3.dex */
    public static class NetImageFormatter {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String DEFAULT_PLACEHOLDER_WIDTH = "[pixelWidth]";
        public static final String IMG_FLEX_WIDTH_HEIGHT = "_[pixelWidth]x[pixelWidth]";
        public static final String IMG_PLACEHOLDER_WIDTH = "_[pixelWidth]x";
        public static final String IMG_TAOBAO_HEAD_WIDTH_HEIGHT = "&width=[imgWidth]&height=[imgHeight]&type=sns";
        public static final String IMG_TAOBAO_ORDER_WIDTH_HEIGHT = "_[imgWidth]x[imgHeight].jpg";

        public static String analysisNetUrl(String str) throws UnsupportedEncodingException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c1883de1", new Object[]{str}) : URLDecoder.decode(str.substring(4), "UTF-8");
        }

        public static NetImageUrl format(String str, int[] iArr) {
            String str2;
            String replace;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetImageUrl) ipChange.ipc$dispatch("cab2c64d", new Object[]{str, iArr});
            }
            String str3 = null;
            if (str == null || "".equals(str)) {
                return null;
            }
            String str4 = ils.ARCH_BIT64;
            if (iArr == null || iArr.length != 2) {
                str2 = str4;
            } else {
                str2 = iArr[0] > 0 ? Integer.toString(iArr[0]) : str4;
                if (iArr[1] > 0) {
                    str4 = Integer.toString(iArr[1]);
                }
            }
            if (str.contains("[pixelWidth]") || str.contains(IMG_PLACEHOLDER_WIDTH) || str.contains(IMG_FLEX_WIDTH_HEIGHT)) {
                replace = str.replace("[pixelWidth]", str2);
            } else {
                replace = (str.contains(IMG_TAOBAO_ORDER_WIDTH_HEIGHT) || str.contains(IMG_TAOBAO_HEAD_WIDTH_HEIGHT)) ? str.replace("[imgWidth]", str2).replace("[imgHeight]", str4) : str;
            }
            Matcher matcher = ImageLoader.access$400().matcher(str);
            if (matcher.find()) {
                str3 = matcher.group(2);
            }
            return new NetImageUrl(replace, str3);
        }
    }
}
