package com.taobao.android.live.plugin.atype.flexalocal.traffic.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.utils.b;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveCustomToast extends PopupWindow implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    private static final String TAG = "TrafficCardPopupWindow";
    private static final int TIME_LONG = 3500;
    private static final int TIME_SHORT = 2000;
    private Context mContext;
    private TUrlImageView mImageView1;
    private TUrlImageView mImageView2;
    private LinearLayout mLinearLayout1;
    private LinearLayout mLinearLayout2;
    private Handler mMainHandler;
    private View mRootView;
    private int mToastHideDuration;
    private TextView mTv1;
    private TextView mTv2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Duration {
    }

    static {
        kge.a(2011555341);
        kge.a(591983227);
    }

    public static /* synthetic */ Object ipc$super(LiveCustomToast liveCustomToast, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a setGravity(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b1eec3b1", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)}) : this;
    }

    public static /* synthetic */ Context access$000(LiveCustomToast liveCustomToast) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9a3567f1", new Object[]{liveCustomToast}) : liveCustomToast.mContext;
    }

    public LiveCustomToast(Context context) {
        super(context);
        this.mToastHideDuration = 2000;
        this.mContext = context;
        this.mMainHandler = new Handler(Looper.getMainLooper());
        setupConfig();
    }

    private void setupConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfe7526", new Object[]{this});
            return;
        }
        setClippingEnabled(true);
        setOutsideTouchable(false);
        this.mRootView = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_toast_traffic_card_flexalocal, (ViewGroup) null);
        setupData();
        setContentView(this.mRootView);
    }

    private void setupData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977f60ce", new Object[]{this});
            return;
        }
        this.mTv1 = (TextView) this.mRootView.findViewById(R.id.taolive_toast_tv1);
        this.mTv2 = (TextView) this.mRootView.findViewById(R.id.taolive_toast_tv2);
        this.mImageView1 = (TUrlImageView) this.mRootView.findViewById(R.id.taolive_toast_image1);
        this.mImageView2 = (TUrlImageView) this.mRootView.findViewById(R.id.taolive_toast_image2);
        this.mLinearLayout1 = (LinearLayout) this.mRootView.findViewById(R.id.taolive_toast_ll1);
        this.mLinearLayout2 = (LinearLayout) this.mRootView.findViewById(R.id.taolive_toast_ll2);
        this.mRootView.setBackgroundDrawable(this.mContext.getResources().getDrawable(R.drawable.taolive_toast_bg_flexalocal));
    }

    private void showAtTopCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58d8761", new Object[]{this});
            return;
        }
        q.b(TAG, "start showAtTopCenter:" + this.mContext);
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            q.b(TAG, "showAtTopCenter mContext not Activity");
        } else if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            q.b(TAG, "showAtTopCenter mContext Activity Destroyed");
        } else {
            setFocusable(true);
            setBackgroundDrawable(new BitmapDrawable());
            setOutsideTouchable(true);
            this.mRootView.measure(0, 0);
            Context context2 = this.mContext;
            if (context2 instanceof Activity) {
                showAtLocation(((Activity) context2).getWindow().getDecorView(), 17, 0, 0);
            }
            this.mMainHandler.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.traffic.ui.LiveCustomToast.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!(LiveCustomToast.access$000(LiveCustomToast.this) instanceof Activity) || ((Activity) LiveCustomToast.access$000(LiveCustomToast.this)).isDestroyed()) {
                    } else {
                        try {
                            LiveCustomToast.this.dismiss();
                            q.b(LiveCustomToast.TAG, "dismiss showAtTopCenter");
                        } catch (Exception e) {
                            q.b(LiveCustomToast.TAG, "catch exception:" + e.getCause());
                        }
                    }
                }
            }, this.mToastHideDuration);
            q.b(TAG, "real showAtTopCenter");
        }
    }

    public a setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e306da1b", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            this.mToastHideDuration = 3500;
        } else if (i == 0) {
            this.mToastHideDuration = 2000;
        } else {
            this.mToastHideDuration = i;
        }
        return this;
    }

    public a setTopIconRes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dd0f0ed9", new Object[]{this, new Integer(i)});
        }
        TUrlImageView tUrlImageView = this.mImageView1;
        if (tUrlImageView != null) {
            tUrlImageView.setBackgroundResource(i);
            this.mImageView1.setVisibility(0);
        }
        return this;
    }

    public a setTopIconRes(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5d195b9c", new Object[]{this, str});
        }
        TUrlImageView tUrlImageView = this.mImageView1;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
            this.mImageView1.setVisibility(0);
        }
        return this;
    }

    public a setTopText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("101083b6", new Object[]{this, charSequence});
        }
        TextView textView = this.mTv1;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return this;
    }

    public a setBottomText(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5ac39a5c", new Object[]{this, charSequence});
        }
        TextView textView = this.mTv2;
        if (textView != null) {
            textView.setText(charSequence);
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mLinearLayout2.setVisibility(8);
            LinearLayout linearLayout = this.mLinearLayout1;
            if (linearLayout != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.bottomMargin = b.a(this.mContext, 18.0f);
                this.mLinearLayout1.setLayoutParams(layoutParams);
            }
        }
        return this;
    }

    public a setBottomIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4a42376a", new Object[]{this, str});
        }
        TUrlImageView tUrlImageView = this.mImageView2;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
            this.mImageView2.setVisibility(0);
        }
        return this;
    }

    public a setTopClickCallback(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2693c269", new Object[]{this, onClickListener});
        }
        TextView textView = this.mTv1;
        if (textView != null && onClickListener != null) {
            textView.setOnClickListener(onClickListener);
        }
        return this;
    }

    public a setBottomClickCallback(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6a0f0a0f", new Object[]{this, onClickListener});
        }
        TextView textView = this.mTv2;
        if (textView != null && onClickListener != null) {
            textView.setOnClickListener(onClickListener);
        }
        return this;
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            showAtTopCenter();
        }
    }
}
