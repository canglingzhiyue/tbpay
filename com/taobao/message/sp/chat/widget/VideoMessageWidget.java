package com.taobao.message.sp.chat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.URLUtil;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.uikit.media.image.ImageInfo;
import com.taobao.message.uikit.util.UiUtils;
import com.taobao.message.uikit.view.RoundRectRelativeLayout;
import com.taobao.message.uikit.widget.SectorProgressWheel;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import tb.kge;

/* loaded from: classes7.dex */
public class VideoMessageWidget extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView durationTv;
    private View goodsIconImageView;
    private RoundRectRelativeLayout itemView;
    private String localUrl = null;
    private ImageView playButton;
    private TUrlImageView previewIv;
    private SectorProgressWheel sectorProgressWheel;
    private SimpleDateFormat simpleDateFormat;
    private TextView sizeTv;

    static {
        kge.a(-1476875429);
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        this.itemView = (RoundRectRelativeLayout) LayoutInflater.from(context).inflate(R.layout.mp_chat_item_msg_video, (ViewGroup) null, false);
        this.itemView.recoverRadius();
        this.previewIv = (TUrlImageView) this.itemView.findViewById(R.id.iv_video_img);
        this.durationTv = (TextView) this.itemView.findViewById(R.id.tv_video_time);
        this.sizeTv = (TextView) this.itemView.findViewById(R.id.tv_video_size);
        this.sectorProgressWheel = (SectorProgressWheel) this.itemView.findViewById(R.id.pb_video_upload);
        this.playButton = (ImageView) this.itemView.findViewById(R.id.iv_video_play);
        this.goodsIconImageView = this.itemView.findViewById(R.id.iv_content_goods_icon);
        this.previewIv.enableSizeInLayoutParams(true);
        return this.itemView;
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public void bindData(JSONObject jSONObject, final EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
        } else if (jSONObject == null) {
        } else {
            if (this.simpleDateFormat == null) {
                this.simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.message.sp.chat.widget.VideoMessageWidget.1
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
            this.durationTv.setText(this.simpleDateFormat.format(new Date(jSONObject.getIntValue("duration") * 1000)));
            this.previewIv.setSkipAutoSize(true);
            int i = R.drawable.alimp_chatfrom_pic_bubble;
            this.previewIv.setErrorImageResId(R.drawable.alimp_chatfrom_pic_bubble);
            int intValue = jSONObject.getIntValue("uploadProgress");
            if (jSONObject.getBooleanValue("uploading") && intValue >= 0 && intValue < 100) {
                this.playButton.setVisibility(8);
                this.sectorProgressWheel.setVisibility(0);
                this.sectorProgressWheel.setProgress(intValue);
            } else {
                this.sectorProgressWheel.setVisibility(8);
                this.playButton.setVisibility(0);
            }
            if (jSONObject.getBooleanValue("hasGoods")) {
                this.goodsIconImageView.setVisibility(0);
            } else {
                this.goodsIconImageView.setVisibility(8);
            }
            String string = jSONObject.getString("previewUrl");
            if (TextUtils.isEmpty(this.localUrl) && !TextUtils.isEmpty(string) && !URLUtil.isNetUrl(string) && new File(string).exists()) {
                this.localUrl = string;
            }
            ImageInfo imageInfo = new ImageInfo();
            imageInfo.origPath = string;
            imageInfo.origWidth = jSONObject.getIntValue("width");
            imageInfo.origHeight = jSONObject.getIntValue("height");
            if (!TextUtils.isEmpty(this.localUrl)) {
                ImageMessageWidget.decideImageSize(this.previewIv, imageInfo);
                UiUtils.setImageUrl(this.previewIv, this.localUrl);
                return;
            }
            this.previewIv.setPlaceHoldImageResId(i);
            ImageMessageWidget.decideImageSize(this.previewIv, imageInfo);
            UiUtils.setImageUrl(this.previewIv, imageInfo.origPath);
        }
    }
}
