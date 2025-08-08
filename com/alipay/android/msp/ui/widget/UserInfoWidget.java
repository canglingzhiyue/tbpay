package com.alipay.android.msp.ui.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.core.callback.ImageLoadCallback;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.android.msp.utils.ui.ImageLoader;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class UserInfoWidget extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int USER_LOGO_WIDTH = 70;
    public final int HEIGHT_THRESHOLD_DISPLAY_ALL;
    public final int HEIGHT_THRESHOLD_DISPLAY_NONE;
    public final int HEIGHT_THRESHOLD_DISPLAY_ONLY_USERNAME;
    private final Context mContext;
    private String mName;
    private LinearLayout mRootView;
    private String pC;
    private ImageView pD;
    private ViewGroup pE;
    private TextView pF;
    private TextView pG;
    private final float pH;

    public static /* synthetic */ Object ipc$super(UserInfoWidget userInfoWidget, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ImageView access$000(UserInfoWidget userInfoWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("1037a88f", new Object[]{userInfoWidget}) : userInfoWidget.pD;
    }

    public UserInfoWidget(Context context) {
        super(context);
        this.mContext = context;
        this.pH = UIUtil.getDp(getContext());
        try {
            LayoutInflater.from(context).inflate(R.layout.flybird_user_info, this);
            this.mRootView = (LinearLayout) findViewById(R.id.flybird_user_root);
            this.pD = (ImageView) findViewById(R.id.flybird_user_logo);
            this.pD.setVisibility(0);
            this.pE = (ViewGroup) findViewById(R.id.flybird_username);
            this.pF = (TextView) findViewById(R.id.flybird_username_prefix);
            this.pG = (TextView) findViewById(R.id.flybird_username_suffix);
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "ui", ErrorCode.UI_USER_INFO_WIDGET_INIT_EXCEPTION, th);
        }
        this.HEIGHT_THRESHOLD_DISPLAY_ALL = Integer.MAX_VALUE;
        float f = this.pH;
        this.HEIGHT_THRESHOLD_DISPLAY_ONLY_USERNAME = (int) (134.0f * f);
        this.HEIGHT_THRESHOLD_DISPLAY_NONE = (int) (f * 46.0f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int abs = Math.abs(i4 - i2);
        ViewGroup.LayoutParams layoutParams = this.pD.getLayoutParams();
        if (abs > this.HEIGHT_THRESHOLD_DISPLAY_ONLY_USERNAME) {
            this.mRootView.setOrientation(1);
            int i5 = (int) (this.pH * 52.0f);
            layoutParams.width = i5;
            layoutParams.height = i5;
            this.pD.setVisibility(0);
            this.pE.setVisibility(0);
        } else if (abs > this.HEIGHT_THRESHOLD_DISPLAY_NONE) {
            this.mRootView.setOrientation(0);
            int i6 = (int) (this.pH * 20.0f);
            layoutParams.width = i6;
            layoutParams.height = i6;
            this.pD.setVisibility(0);
            this.pE.setVisibility(0);
        } else {
            this.pD.setVisibility(8);
            this.pE.setVisibility(8);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void updateInfo(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f499a432", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.equals(str, this.mName)) {
                this.mName = str;
                this.pE.setVisibility(0);
                String str4 = "";
                int indexOf = this.mName.indexOf("@");
                if (indexOf != -1) {
                    str4 = this.mName.substring(0, indexOf);
                    str3 = this.mName.substring(indexOf);
                } else {
                    str3 = this.mName;
                }
                this.pF.setText(str4);
                this.pG.setText(str3);
            }
            if (StringUtils.equals(str2, this.pC)) {
                return;
            }
            if (StringUtils.isEmpty(str2)) {
                this.pD.setScaleType(ImageView.ScaleType.FIT_XY);
                this.pD.setImageResource(R.drawable.alipay_msp_logo_large);
                return;
            }
            this.pC = str2;
            int i = (int) (this.pH * 70.0f);
            ImageLoader.ClipsInfo clipsInfo = new ImageLoader.ClipsInfo();
            clipsInfo.setWh(new int[]{i, i});
            clipsInfo.setCorner((int) (this.pH * 8.0f));
            clipsInfo.setClipsType(ImageLoader.ClipsType.Corner);
            ImageLoader.getInstance().loadImage(this.pD, this.pC, ImageLoader.LoadAction.Image, clipsInfo, this.mContext, new ImageLoadCallback() { // from class: com.alipay.android.msp.ui.widget.UserInfoWidget.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.core.callback.ImageLoadCallback
                public void onLoadSuccess(int i2, int i3, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a1462621", new Object[]{this, new Integer(i2), new Integer(i3), obj});
                    }
                }

                @Override // com.alipay.android.msp.core.callback.ImageLoadCallback
                public void onLoadFailure(int i2, int i3, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i2), new Integer(i3), obj});
                        return;
                    }
                    UserInfoWidget.access$000(UserInfoWidget.this).setScaleType(ImageView.ScaleType.FIT_XY);
                    UserInfoWidget.access$000(UserInfoWidget.this).setImageResource(R.drawable.alipay_msp_logo_large);
                }
            });
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "ui", ErrorCode.UI_USER_INFO_WIDGET_UPDATE_EXCEPTION, th);
        }
    }
}
