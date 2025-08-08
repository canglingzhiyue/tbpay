package com.taobao.message.sp.chat.widget;

import android.app.Application;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.HttpUtil;
import com.taobao.message.kit.util.URLUtil;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.uikit.media.image.ImageInfo;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.message.uikit.util.UiUtils;
import com.taobao.message.uikit.view.RoundRectRelativeLayout;
import com.taobao.message.uikit.widget.DigitalProgressWheel;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.File;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;
import tb.kin;

/* loaded from: classes7.dex */
public class ImageMessageWidget extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DigitalProgressWheel digitalProgressWheel;
    private View goodsIconImageView;
    private TUrlImageView imageView;
    private RoundRectRelativeLayout itemView;
    private String localUrl = null;

    static {
        kge.a(730792571);
    }

    private static int constrain(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa791b58", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : i < i2 ? i2 : i > i3 ? i3 : i;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        this.itemView = (RoundRectRelativeLayout) LayoutInflater.from(context).inflate(R.layout.mp_chat_item_msg_image, (ViewGroup) null, false);
        this.itemView.recoverRadius();
        this.imageView = (TUrlImageView) this.itemView.findViewById(R.id.iv_content_image);
        this.goodsIconImageView = this.itemView.findViewById(R.id.iv_content_goods_icon);
        this.digitalProgressWheel = (DigitalProgressWheel) this.itemView.findViewById(R.id.pb_image_upload);
        this.imageView.enableSizeInLayoutParams(true);
        return this.itemView;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(JSONObject jSONObject, final EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
        } else if (jSONObject == null) {
        } else {
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.message.sp.chat.widget.ImageMessageWidget.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        eventDispatcher.dispatch(new Event.Build("click").context(new HashMap()).build());
                    }
                }
            });
            boolean booleanValue = jSONObject.getBooleanValue("hasGoods");
            boolean booleanValue2 = jSONObject.getBooleanValue("hasCustomParams");
            if (booleanValue) {
                this.goodsIconImageView.setVisibility(0);
            } else {
                this.goodsIconImageView.setVisibility(8);
            }
            int intValue = jSONObject.getIntValue("uploadProgress");
            if (intValue > 0 && intValue < 100) {
                this.digitalProgressWheel.setVisibility(0);
                this.digitalProgressWheel.setProgress(intValue);
            } else {
                this.digitalProgressWheel.setVisibility(8);
            }
            String string = jSONObject.getString("previewUrl");
            String string2 = jSONObject.getString("mimeType");
            if (HttpUtil.isAnimationPic(string) || kin.GIF_MODE.equalsIgnoreCase(string2) || "apng".equalsIgnoreCase(string2)) {
                this.imageView.setSkipAutoSize(true);
                string = jSONObject.getString("imageUrl");
            }
            this.imageView.setErrorImageResId(R.drawable.alimp_chatfrom_pic_bubble);
            ImageInfo imageInfo = new ImageInfo();
            if (!StringUtils.isEmpty(string) && !URLUtil.isNetUrl(string) && new File(string).exists()) {
                this.localUrl = string;
            }
            imageInfo.origPath = string;
            imageInfo.origWidth = jSONObject.getIntValue("width");
            imageInfo.origHeight = jSONObject.getIntValue("height");
            if (!StringUtils.isEmpty(this.localUrl)) {
                decideImageSize(this.imageView, imageInfo);
                UiUtils.setImageUrl(this.imageView, this.localUrl);
                UiUtils.fetchAndSetA11yOCR(this.imageView, this.localUrl);
            } else if (URLUtil.isNetUrl(string)) {
                if (booleanValue2) {
                    this.imageView.setMinimumWidth(imageInfo.origWidth);
                    this.imageView.setMinimumHeight(imageInfo.origHeight);
                    ViewGroup.LayoutParams layoutParams = this.imageView.getLayoutParams();
                    layoutParams.width = imageInfo.origWidth;
                    layoutParams.height = imageInfo.origHeight;
                    this.imageView.setLayoutParams(layoutParams);
                } else {
                    decideImageSize(this.imageView, imageInfo);
                }
                String str = imageInfo.origPath;
                if (HttpUtil.isAnimationPic(string) && !HttpUtil.isAnimationPic(str)) {
                    str = string;
                }
                UiUtils.setImageUrl(this.imageView, str);
                UiUtils.fetchAndSetA11yOCR(this.imageView, str);
            } else {
                this.imageView.setPlaceHoldImageResId(R.drawable.alimp_chatfrom_pic_bubble);
                decideImageSize(this.imageView, imageInfo.origWidth, imageInfo.origHeight, null, null);
                UiUtils.setImageUrl(this.imageView, null);
            }
        }
    }

    private static boolean isNewTypePicUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("202380ea", new Object[]{str})).booleanValue() : Pattern.compile("-(\\d+)-(\\d+)\\.").matcher(str).find();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.message.uikit.media.image.ImageInfo getImageInfoFromUrl(java.lang.String r12, int... r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.sp.chat.widget.ImageMessageWidget.getImageInfoFromUrl(java.lang.String, int[]):com.taobao.message.uikit.media.image.ImageInfo");
    }

    public static void decideImageSize(View view, ImageInfo imageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ff2f64", new Object[]{view, imageInfo});
            return;
        }
        if (imageInfo.origWidth <= 0 || imageInfo.origHeight <= 0) {
            imageInfo.copy(getImageInfoFromUrl(imageInfo.origPath, new int[0]));
        }
        imageInfo.copy(decideImageSize(view, imageInfo.origWidth, imageInfo.origHeight, imageInfo.origPath, imageInfo.other));
    }

    public static ImageInfo decideImageSize(View view, int i, int i2, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ImageInfo) ipChange.ipc$dispatch("fdc0c438", new Object[]{view, new Integer(i), new Integer(i2), str, str2});
        }
        if (str == null || !str.contains(kin.GIF_MODE)) {
            z = false;
        }
        return decideImageSize(view, i, i2, str, str2, z ? 119.0f : 189.0f, 106.5f);
    }

    public static ImageInfo decideImageSize(View view, int i, int i2, String str, String str2, float f, float f2) {
        int constrain;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageInfo) ipChange.ipc$dispatch("133ec2f8", new Object[]{view, new Integer(i), new Integer(i2), str, str2, new Float(f), new Float(f2)});
        }
        Application application = ApplicationUtil.getApplication();
        if (i <= 0 || i2 <= 0) {
            i = DisplayUtil.dip2px(application, 100.0f);
            i2 = i;
        }
        int dip2px = DisplayUtil.dip2px(application, f);
        int dip2px2 = DisplayUtil.dip2px(application, f2);
        float f3 = i2 / i;
        if (f3 > 1.0f) {
            i4 = constrain(i2, dip2px2, dip2px);
            int i6 = (int) ((1.0f / f3) * i4);
            int constrain2 = constrain(i6, dip2px2, dip2px);
            i3 = i4;
            i5 = i6;
            constrain = constrain2;
        } else {
            constrain = constrain(i, dip2px2, dip2px);
            int i7 = (int) (f3 * constrain);
            int constrain3 = constrain(i7, dip2px2, dip2px);
            i3 = i7;
            i4 = constrain3;
            i5 = constrain;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = constrain;
        view.setLayoutParams(layoutParams);
        if (!StringUtils.isEmpty(str)) {
            if ("1".equals(str2)) {
                str = str + "&thumb_width=" + i5 + "&thumb_height=" + i3;
            } else {
                if (!StringUtils.isEmpty(str)) {
                    Matcher matcher = Pattern.compile("(&\\d+x\\d+$)").matcher(str);
                    if (matcher.find()) {
                        str = matcher.replaceFirst("");
                    }
                }
                str = ImageStrategyDecider.decideUrl(str, Integer.valueOf(i5), Integer.valueOf(i3), ImageStrategyConfig.a("default", 72).a());
            }
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.origPath = str;
        imageInfo.origWidth = i5;
        imageInfo.origHeight = i3;
        imageInfo.other = "" + str2;
        return imageInfo;
    }
}
