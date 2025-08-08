package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.mtop.LiveInfoItem;
import com.taobao.taolive.uikit.mtop.SimpleAccountInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoliveBigcardTopView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private TextView mLocNameView;
    private TUrlImageView mShopImage;
    private TextView mShopLogo;
    private TextView mShopName;
    private TUrlImageView mTaoShopImg;

    static {
        kge.a(-1230176625);
    }

    public static /* synthetic */ TUrlImageView access$000(TaoliveBigcardTopView taoliveBigcardTopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("ae243ee1", new Object[]{taoliveBigcardTopView}) : taoliveBigcardTopView.mTaoShopImg;
    }

    public TaoliveBigcardTopView(Context context) {
        super(context);
        this.mContext = context;
        init();
    }

    public TaoliveBigcardTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        init();
    }

    public TaoliveBigcardTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LayoutInflater.from(this.mContext).inflate(R.layout.tbliveuikit_big_card_top_part, this);
        this.mShopImage = (TUrlImageView) findViewById(R.id.taolive_shop_icon);
        this.mShopName = (TextView) findViewById(R.id.taolive_shop_name);
        this.mTaoShopImg = (TUrlImageView) findViewById(R.id.taolive_shop_hg_img);
        this.mLocNameView = (TextView) findViewById(R.id.taolive_shop_loc_view);
        this.mShopLogo = (TextView) findViewById(R.id.taolive_shop_logo);
    }

    public void setData(LiveInfoItem liveInfoItem) {
        SimpleAccountInfo simpleAccountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9498f6af", new Object[]{this, liveInfoItem});
        } else if (liveInfoItem == null || (simpleAccountInfo = liveInfoItem.accountDO) == null) {
        } else {
            this.mShopImage.setImageUrl(simpleAccountInfo.headImg);
            this.mShopName.setText(simpleAccountInfo.accountNick);
            this.mShopLogo.setText(simpleAccountInfo.shopLogoTxt);
            this.mShopLogo.setVisibility(8);
            if (!StringUtils.isEmpty(simpleAccountInfo.levelLogo)) {
                b.h().a(simpleAccountInfo.levelLogo).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.taolive.uikit.view.TaoliveBigcardTopView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                    }

                    public boolean a(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        if (succPhenixEvent == null || succPhenixEvent.getDrawable() == null) {
                            return false;
                        }
                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                        TaoliveBigcardTopView.access$000(TaoliveBigcardTopView.this).setImageDrawable(drawable);
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        ViewGroup.LayoutParams layoutParams = TaoliveBigcardTopView.access$000(TaoliveBigcardTopView.this).getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = (intrinsicWidth * 32) / intrinsicHeight;
                            TaoliveBigcardTopView.access$000(TaoliveBigcardTopView.this).setLayoutParams(layoutParams);
                        }
                        return true;
                    }
                }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.taolive.uikit.view.TaoliveBigcardTopView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public boolean a(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                        }
                        return false;
                    }

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                    }
                }).fetch();
            }
            String str = liveInfoItem.location;
            if ("true".equals(liveInfoItem.connectLocation) && !StringUtils.isEmpty(str)) {
                TextView textView = this.mLocNameView;
                textView.setText(" | " + this.mContext.getString(R.string.tbliveuikit_video_item_location, str));
                this.mLocNameView.setVisibility(0);
                return;
            }
            this.mLocNameView.setVisibility(8);
        }
    }
}
