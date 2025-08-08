package com.taobao.wireless.link.assistant.display;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.rju;
import tb.rjx;
import tb.rki;
import tb.rkj;

/* loaded from: classes9.dex */
public class AssistantView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TUrlImageView mIvCat;
    private static TextView mTvBubbleText;
    public static int viewHeight;
    public static int viewWidth;
    public long downTime;
    private Context mContext;
    private WindowManager.LayoutParams mParams;
    private final int mScreenWidth;
    private final int mStatusBarHeight;
    private WindowManager windowManager;
    private float xDownInScreen;
    private float xInScreen;
    private float xInView;
    private float yDownInScreen;
    private float yInScreen;
    private float yInView;

    static {
        kge.a(-1310036498);
    }

    public static /* synthetic */ Object ipc$super(AssistantView assistantView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AssistantView(final Context context) {
        super(context);
        this.downTime = 0L;
        this.mContext = context;
        this.windowManager = (WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        LayoutInflater.from(context).inflate(R.layout.float_window_assistant, this);
        View findViewById = findViewById(R.id.small_window_layout);
        mTvBubbleText = (TextView) findViewById(R.id.tv_bubble);
        mIvCat = (TUrlImageView) findViewById(R.id.iv_cat);
        viewWidth = findViewById.getLayoutParams().width;
        viewHeight = findViewById.getLayoutParams().height;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.mScreenWidth = displayMetrics.widthPixels;
        this.mStatusBarHeight = rkj.f(this.mContext);
        ((TUrlImageView) findViewById(R.id.iv_delete_assistant)).setOnClickListener(new View.OnClickListener() { // from class: com.taobao.wireless.link.assistant.display.AssistantView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                rju.a().a(context, false);
                rki.a(rki.ARG1_ASSISTANT_USER_CLOSE, "", "", null);
            }
        });
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.xInView = motionEvent.getX();
            this.yInView = motionEvent.getY();
            this.xDownInScreen = motionEvent.getRawX();
            this.yDownInScreen = motionEvent.getRawY() - this.mStatusBarHeight;
            this.xInScreen = motionEvent.getRawX();
            this.yInScreen = motionEvent.getRawY() - this.mStatusBarHeight;
            this.downTime = motionEvent.getDownTime();
        } else if (action == 1) {
            if (motionEvent.getEventTime() - this.downTime > 1000) {
                this.downTime = 0L;
                rjx.b(this.mContext);
            } else if (Math.abs(this.xDownInScreen - this.xInScreen) < 5.0f || Math.abs(this.yDownInScreen - this.yInScreen) < 5.0f) {
                rjx.a(this.mContext);
            }
            this.xInScreen += this.mScreenWidth;
            updateViewPosition();
        } else if (action == 2) {
            this.xInScreen = motionEvent.getRawX();
            this.yInScreen = motionEvent.getRawY() - this.mStatusBarHeight;
            updateViewPosition();
        }
        return true;
    }

    public static void updateAssistantView(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2221b56", new Object[]{new Integer(i), str, str2});
        } else if (i == 0) {
            if (!StringUtils.isEmpty(str)) {
                mTvBubbleText.setVisibility(0);
                mTvBubbleText.setText(str);
            }
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            mIvCat.setStrategyConfig(ImageStrategyConfig.a("1111", "1111").a());
            TUrlImageView tUrlImageView = mIvCat;
            tUrlImageView.setImageUrl(str2 + "?getAvatar=1");
        } else {
            mTvBubbleText.setVisibility(8);
            mIvCat.setStrategyConfig(ImageStrategyConfig.a("1111", "1111").a());
            mIvCat.setImageUrl(str2);
        }
    }

    public void setParams(WindowManager.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee037bb1", new Object[]{this, layoutParams});
        } else {
            this.mParams = layoutParams;
        }
    }

    private void updateViewPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f517eb5e", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams layoutParams = this.mParams;
        layoutParams.x = (int) (this.xInScreen - this.xInView);
        layoutParams.y = (int) (this.yInScreen - this.yInView);
        this.windowManager.updateViewLayout(this, layoutParams);
    }
}
