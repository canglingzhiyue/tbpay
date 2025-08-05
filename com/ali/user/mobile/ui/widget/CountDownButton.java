package com.ali.user.mobile.ui.widget;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class CountDownButton extends AppCompatButton {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCountDowning;
    public CountListener mCountListener;
    public int mGetCodeTitleRes;
    public int mTickTitleRes;
    private TimeCountDown mTimeCountDown;
    private boolean needBackground;

    /* loaded from: classes2.dex */
    public interface CountListener {
        void onTick(long j);
    }

    static {
        kge.a(1175560363);
    }

    public static /* synthetic */ boolean access$000(CountDownButton countDownButton) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff1f0323", new Object[]{countDownButton})).booleanValue() : countDownButton.needBackground;
    }

    public static /* synthetic */ boolean access$102(CountDownButton countDownButton, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("288bcbdc", new Object[]{countDownButton, new Boolean(z)})).booleanValue();
        }
        countDownButton.isCountDowning = z;
        return z;
    }

    public CountDownButton(Context context) {
        super(context);
        this.needBackground = true;
        this.isCountDowning = false;
    }

    public CountDownButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.needBackground = true;
        this.isCountDowning = false;
    }

    public void setNeedBackground(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933a4387", new Object[]{this, new Boolean(z)});
        } else {
            this.needBackground = z;
        }
    }

    public void startCountDown(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99f7c416", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        this.mTimeCountDown = new TimeCountDown(j, j2);
        this.mTimeCountDown.start();
        this.isCountDowning = true;
    }

    public void setTickListener(CountListener countListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c689bd", new Object[]{this, countListener});
        } else {
            this.mCountListener = countListener;
        }
    }

    public void cancelCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f295fe", new Object[]{this});
            return;
        }
        TimeCountDown timeCountDown = this.mTimeCountDown;
        if (timeCountDown != null) {
            timeCountDown.cancel();
        }
        this.isCountDowning = false;
    }

    /* loaded from: classes2.dex */
    public class TimeCountDown extends CountDownTimer {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1196715605);
        }

        public TimeCountDown(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
                return;
            }
            long j2 = (j / 1000) + 1;
            if (CountDownButton.this.mTickTitleRes != 0) {
                CountDownButton countDownButton = CountDownButton.this;
                countDownButton.setText(countDownButton.getResources().getString(CountDownButton.this.mTickTitleRes, String.valueOf(j2)));
            } else {
                CountDownButton countDownButton2 = CountDownButton.this;
                countDownButton2.setText(String.valueOf(j2) + CountDownButton.this.getContext().getString(R.string.aliuser_signup_verification_reGetCode));
            }
            CountDownButton.this.setEnabled(false);
            if (CountDownButton.this.mCountListener == null) {
                return;
            }
            CountDownButton.this.mCountListener.onTick(j);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            if (CountDownButton.this.mGetCodeTitleRes != 0) {
                CountDownButton countDownButton = CountDownButton.this;
                countDownButton.setText(countDownButton.getContext().getString(CountDownButton.this.mGetCodeTitleRes));
                if (CountDownButton.access$000(CountDownButton.this)) {
                    CountDownButton countDownButton2 = CountDownButton.this;
                    countDownButton2.setBackgroundDrawable(countDownButton2.getResources().getDrawable(R.drawable.aliuser_btn_background_orange_round));
                }
            } else {
                CountDownButton countDownButton3 = CountDownButton.this;
                countDownButton3.setText(countDownButton3.getContext().getString(R.string.aliuser_signup_verification_getCode));
            }
            CountDownButton.this.setEnabled(true);
            CountDownButton.access$102(CountDownButton.this, false);
        }
    }

    public void setGetCodeTitle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aadf3a85", new Object[]{this, new Integer(i)});
        } else {
            this.mGetCodeTitleRes = i;
        }
    }

    public void setTickTitleRes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46a9255", new Object[]{this, new Integer(i)});
        } else {
            this.mTickTitleRes = i;
        }
    }

    public boolean isCountDowning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89aa4146", new Object[]{this})).booleanValue() : this.isCountDowning;
    }
}
