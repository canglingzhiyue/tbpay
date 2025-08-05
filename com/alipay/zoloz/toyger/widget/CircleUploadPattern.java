package com.alipay.zoloz.toyger.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.faceauth.model.DetectTimerTask;
import com.alipay.zoloz.toyger.interfaces.DialogCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class CircleUploadPattern extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int COUNT_TIME_OUT = 15;
    private DialogCallback mCallback;
    public Context mContext;
    private TextView mCountTv;
    public ImageView mFacePreView;
    private Handler mHandler;
    private boolean mIsShowProcess;
    private Handler mMainHandler;
    public TextView mProcessTextView;
    private DetectTimerTask mTimerTask;
    public UploadProgressBar mUploadProgressBar;
    public ValueAnimator mValueAnimator;
    public boolean needHidden;
    private int processsAngle;
    public RelativeLayout rootView;

    public static /* synthetic */ Object ipc$super(CircleUploadPattern circleUploadPattern, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public void stopProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee01be14", new Object[]{this});
        }
    }

    public static /* synthetic */ DetectTimerTask access$000(CircleUploadPattern circleUploadPattern) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetectTimerTask) ipChange.ipc$dispatch("8b22273e", new Object[]{circleUploadPattern}) : circleUploadPattern.mTimerTask;
    }

    public static /* synthetic */ DialogCallback access$100(CircleUploadPattern circleUploadPattern) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogCallback) ipChange.ipc$dispatch("6e5e79a2", new Object[]{circleUploadPattern}) : circleUploadPattern.mCallback;
    }

    public static /* synthetic */ TextView access$200(CircleUploadPattern circleUploadPattern) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("59c4b53", new Object[]{circleUploadPattern}) : circleUploadPattern.mCountTv;
    }

    public static /* synthetic */ Handler access$300(CircleUploadPattern circleUploadPattern) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a4f0ce26", new Object[]{circleUploadPattern}) : circleUploadPattern.mHandler;
    }

    public static /* synthetic */ void access$400(CircleUploadPattern circleUploadPattern) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e92961", new Object[]{circleUploadPattern});
        } else {
            circleUploadPattern.intervalAction();
        }
    }

    public static /* synthetic */ boolean access$502(CircleUploadPattern circleUploadPattern, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("691aaf34", new Object[]{circleUploadPattern, new Boolean(z)})).booleanValue();
        }
        circleUploadPattern.mIsShowProcess = z;
        return z;
    }

    public static /* synthetic */ int access$600(CircleUploadPattern circleUploadPattern) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5554c2d6", new Object[]{circleUploadPattern})).intValue() : circleUploadPattern.processsAngle;
    }

    public static /* synthetic */ int access$602(CircleUploadPattern circleUploadPattern, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f1e3ab1", new Object[]{circleUploadPattern, new Integer(i)})).intValue();
        }
        circleUploadPattern.processsAngle = i;
        return i;
    }

    public CircleUploadPattern(Context context) {
        super(context);
        this.processsAngle = 180;
        this.mValueAnimator = null;
        this.mHandler = new Handler();
        this.needHidden = false;
        this.mContext = context;
        initViews();
    }

    public CircleUploadPattern(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.processsAngle = 180;
        this.mValueAnimator = null;
        this.mHandler = new Handler();
        this.needHidden = false;
        this.mContext = context;
        initViews();
    }

    public CircleUploadPattern(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.processsAngle = 180;
        this.mValueAnimator = null;
        this.mHandler = new Handler();
        this.needHidden = false;
        this.mContext = context;
        initViews();
    }

    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toyger_loading_pattern, (ViewGroup) this, true);
        this.rootView = (RelativeLayout) inflate.findViewById(R.id.face_eye_loading_page);
        this.mFacePreView = (ImageView) inflate.findViewById(R.id.simple_face_preview);
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mUploadProgressBar = (UploadProgressBar) inflate.findViewById(R.id.zoloz_back_progress);
        this.mProcessTextView = (TextView) inflate.findViewById(R.id.simple_process_text);
    }

    public void startProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33d85b4", new Object[]{this});
            return;
        }
        try {
            this.mProcessTextView.setText(this.mContext.getResources().getString(R.string.zface_processing));
        } catch (Throwable th) {
            BioLog.e("error when startProcess" + th);
        }
        intervalAction();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.needHidden && i == 0) {
            i = 4;
        }
        super.setVisibility(i);
    }

    private void startTimerTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fee0af", new Object[]{this});
            return;
        }
        if (this.mTimerTask != null) {
            stopTimerTask();
        }
        this.mTimerTask = new DetectTimerTask(15000);
        this.mTimerTask.setTimerTaskListener(new DetectTimerTask.TimerListener() { // from class: com.alipay.zoloz.toyger.widget.CircleUploadPattern.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.security.faceauth.model.DetectTimerTask.TimerListener
            public void countdown(final int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e055fcb", new Object[]{this, new Integer(i)});
                } else {
                    CircleUploadPattern.access$300(CircleUploadPattern.this).post(new Runnable() { // from class: com.alipay.zoloz.toyger.widget.CircleUploadPattern.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (CircleUploadPattern.access$000(CircleUploadPattern.this) != null && CircleUploadPattern.access$000(CircleUploadPattern.this).isTimeOut()) {
                                if (CircleUploadPattern.access$100(CircleUploadPattern.this) == null) {
                                    return;
                                }
                                CircleUploadPattern.access$100(CircleUploadPattern.this).onTimeOut();
                            } else if (CircleUploadPattern.access$200(CircleUploadPattern.this) == null) {
                            } else {
                                TextView access$200 = CircleUploadPattern.access$200(CircleUploadPattern.this);
                                access$200.setText((i / 1000) + CircleUploadPattern.this.mContext.getString(R.string.second));
                            }
                        }
                    });
                }
            }
        });
        this.mTimerTask.start();
    }

    public void stopTimerTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c96810f", new Object[]{this});
            return;
        }
        DetectTimerTask detectTimerTask = this.mTimerTask;
        if (detectTimerTask == null) {
            return;
        }
        detectTimerTask.setTimerTaskListener(null);
        this.mTimerTask.stop();
        this.mTimerTask = null;
    }

    public void setCallback(DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c223786", new Object[]{this, dialogCallback});
        } else {
            this.mCallback = dialogCallback;
        }
    }

    private void intervalAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17914662", new Object[]{this});
            return;
        }
        this.mMainHandler.postDelayed(new Runnable() { // from class: com.alipay.zoloz.toyger.widget.CircleUploadPattern.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (CircleUploadPattern.this.mContext == null) {
                } else {
                    CircleUploadPattern.access$400(CircleUploadPattern.this);
                    CircleUploadPattern.access$502(CircleUploadPattern.this, false);
                }
            }
        }, 1000L);
        if (this.mIsShowProcess) {
            return;
        }
        this.mIsShowProcess = true;
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.mValueAnimator = ValueAnimator.ofInt(0, 30);
        this.mValueAnimator.setDuration(1000L);
        this.mValueAnimator.setInterpolator(new LinearInterpolator());
        this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.zoloz.toyger.widget.CircleUploadPattern.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                int parseInt = Integer.parseInt(CircleUploadPattern.this.mValueAnimator.getAnimatedValue() + "");
                CircleUploadPattern circleUploadPattern = CircleUploadPattern.this;
                CircleUploadPattern.access$602(circleUploadPattern, CircleUploadPattern.access$600(circleUploadPattern) + 4);
                CircleUploadPattern.this.mUploadProgressBar.setProgressAngle(CircleUploadPattern.access$600(CircleUploadPattern.this));
                if (30 != parseInt) {
                    return;
                }
                CircleUploadPattern.this.mValueAnimator.cancel();
                CircleUploadPattern.this.mValueAnimator = null;
            }
        });
        this.mValueAnimator.start();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.rootView.setBackgroundColor(i);
        }
    }

    private String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2}) : StringUtil.isNullorEmpty(str) ? str2 : str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        startProcess();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        stopProcess();
        stopTimerTask();
        this.mContext = null;
    }
}
