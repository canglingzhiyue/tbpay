package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.taobao.R;

/* loaded from: classes8.dex */
public class pbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1263810083);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if ("liveFlag".equals(str)) {
            return R.drawable.tbliveuikit_status_live_dynamic;
        }
        if ("replayFlag".equals(str)) {
            return R.drawable.tbliveuikit_video_type_replay;
        }
        if ("previewFlag".equals(str) || "preliveFlag".equals(str)) {
            return R.drawable.tbliveuikit_status_prelive;
        }
        if ("liveCenterFlg".equals(str)) {
            return R.drawable.tbliveuikit_weitao_live;
        }
        if ("replayCenterFlg".equals(str)) {
            return R.drawable.tbliveuikit_weitao_playback;
        }
        if ("goodNumberBg".equals(str)) {
            return R.drawable.tbliveuikit_goodnumber_backgd;
        }
        if ("cardBottomBg".equals(str)) {
            return R.drawable.tbliveuikit_card_bottom_bg_48;
        }
        if ("cardBottomBgRightCorner".equals(str)) {
            return R.drawable.tbliveuikit_card_bottom_bg_right_corner;
        }
        if ("cardTopBg".equals(str)) {
            return R.drawable.tbliveuikit_card_top_bg_48;
        }
        if ("cardTopBgRightCorner".equals(str)) {
            return R.drawable.tbliveuikit_card_top_bg_right_corner;
        }
        if ("replayCenterFlg".equals(str)) {
            return R.drawable.tbliveuikit_home_item_replay_btn;
        }
        if ("liveCoverMask".equals(str)) {
            return R.drawable.tbliveuikit_small_img_cover_mask;
        }
        if ("goodBubbleBg".equals(str)) {
            return R.drawable.tbliveuikit_card_good_bubble_bg;
        }
        if ("taoliveDefault".equals(str)) {
            return R.drawable.tbliveuikit_default;
        }
        if (!"taoliveDefaultIcon".equals(str)) {
            return -1;
        }
        return R.drawable.tbliveuikit_default_icon;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if ("center".equals(str)) {
            return 17;
        }
        if ("left".equals(str)) {
            return 3;
        }
        return "center_horizontal".equals(str) ? 1 : 17;
    }

    public static ImageView.ScaleType c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView.ScaleType) ipChange.ipc$dispatch("5d651a3c", new Object[]{str});
        }
        if (AliSDetailScaleType.centerCrop.equals(str)) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if ("center".equals(str)) {
            return ImageView.ScaleType.CENTER;
        }
        if ("centerInside".equals(str)) {
            return ImageView.ScaleType.CENTER_INSIDE;
        }
        if (AliSDetailScaleType.fitCenter.equals(str)) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if ("fitXY".equals(str)) {
            return ImageView.ScaleType.FIT_XY;
        }
        if ("fitStart".equals(str)) {
            return ImageView.ScaleType.FIT_START;
        }
        if ("fitEnd".equals(str)) {
            return ImageView.ScaleType.FIT_END;
        }
        if ("matrix".equals(str)) {
            return ImageView.ScaleType.MATRIX;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{str})).intValue() : (!StringUtils.isEmpty(str) && !"oval".equals(str) && "roundRect".equals(str)) ? 1 : 0;
    }

    public static float a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361a", new Object[]{context, str})).floatValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return fpr.a(context, str, 0);
        }
        return 0.0f;
    }
}
