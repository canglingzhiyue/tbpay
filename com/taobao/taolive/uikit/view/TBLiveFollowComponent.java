package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.mtop.c;
import com.ut.mini.l;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.nmf;
import tb.prc;

/* loaded from: classes8.dex */
public class TBLiveFollowComponent extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Object data;
    private c followBusiness;
    private int followColor;
    private Object followData;
    private LinearLayout followLayout;
    private TextView followTextView;
    private int isFollowed;
    private Context mContext;
    private double radius;
    private int strokeColor;
    private double strokeWidth;
    private int unFollowColor;

    static {
        kge.a(-2084471671);
    }

    public static /* synthetic */ int access$002(TBLiveFollowComponent tBLiveFollowComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84acab97", new Object[]{tBLiveFollowComponent, new Integer(i)})).intValue();
        }
        tBLiveFollowComponent.isFollowed = i;
        return i;
    }

    public TBLiveFollowComponent(Context context) {
        super(context);
        this.isFollowed = 0;
        this.mContext = context;
        init();
    }

    public TBLiveFollowComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isFollowed = 0;
        this.mContext = context;
        init();
    }

    public TBLiveFollowComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isFollowed = 0;
        this.mContext = context;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        LayoutInflater.from(this.mContext).inflate(R.layout.tbliveuikit_follow_layout, this);
        this.followLayout = (LinearLayout) findViewById(R.id.taolive_follow_bg);
        this.followTextView = (TextView) findViewById(R.id.taolive_follow_title);
        this.followTextView.setTextSize(11.0f);
    }

    public void setIsFollowed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f997ab80", new Object[]{this, new Integer(i)});
        } else {
            this.isFollowed = i;
        }
    }

    public double getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9580ffd", new Object[]{this})).doubleValue() : this.radius;
    }

    public void setRadius(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fc583", new Object[]{this, new Double(d)});
        } else {
            this.radius = d;
        }
    }

    public int getStrokeColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0d444cf", new Object[]{this})).intValue() : this.strokeColor;
    }

    public void setStrokeColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db15eb3", new Object[]{this, new Integer(i)});
        } else {
            this.strokeColor = i;
        }
    }

    public double getStrokeWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37af59ad", new Object[]{this})).doubleValue() : this.strokeWidth;
    }

    public void setStrokeWidth(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6238d36b", new Object[]{this, new Double(d)});
        } else {
            this.strokeWidth = d;
        }
    }

    public int getUnFollowColor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87a5d11d", new Object[]{this})).intValue() : this.unFollowColor;
    }

    public void setUnFollowColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4404925", new Object[]{this, new Integer(i)});
        } else {
            this.unFollowColor = i;
        }
    }

    public void setFollowText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3131511", new Object[]{this, str});
            return;
        }
        TextView textView = this.followTextView;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    public void setFollowColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581f60ec", new Object[]{this, new Integer(i)});
        } else {
            this.followColor = i;
        }
    }

    public void setFollowData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d586d9e0", new Object[]{this, obj});
        } else {
            this.data = obj;
        }
    }

    public void addFollow(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239b0bcd", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            CT ct = CT.Button;
            TBS.Adv.ctrlClicked(ct, "follow", "accountId=" + str, "type=" + str2);
            if (this.followBusiness == null) {
                this.followBusiness = new c(new IRemoteBaseListener() { // from class: com.taobao.taolive.uikit.view.TBLiveFollowComponent.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        TBLiveFollowComponent.access$002(TBLiveFollowComponent.this, 1);
                        TBLiveFollowComponent.this.update();
                    }
                });
            }
            this.followBusiness.a(str, str2, getCurrentPageName());
        }
    }

    private static String getCurrentPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[0]);
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        if (currentPageName == null || currentPageName.startsWith("Page_")) {
            return currentPageName;
        }
        return "Page_" + currentPageName;
    }

    public void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else if (this.isFollowed == 1) {
            this.followTextView.setTextColor(this.followColor);
            this.followTextView.setText(nmf.TEXT_FOLLOW_DEFAULT);
            this.followLayout.setBackgroundColor(0);
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, 0});
            gradientDrawable.setCornerRadius(prc.a(this.mContext, (float) this.radius));
            gradientDrawable.setStroke((int) this.strokeWidth, this.unFollowColor);
            this.followLayout.setBackground(gradientDrawable);
            this.followTextView.setTextColor(this.unFollowColor);
            this.followTextView.setText(nmf.TEXT_UNFOLLOW_DEFAULT);
        }
    }
}
