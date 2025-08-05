package com.alipay.zoloz.toyger.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.biometrics.ui.widget.AlgorithmInfoPattern;
import com.alipay.biometrics.ui.widget.CircleForegroud;
import com.alipay.mobile.security.bio.config.bean.Coll;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.faceauth.circle.protocol.DeviceSetting;
import com.alipay.zoloz.hardware.camera.preview.CameraTextureRender;
import com.alipay.zoloz.hardware.camera.utils.DisplayUtil;
import com.alipay.zoloz.toyger.interfaces.DialogCallback;
import com.alipay.zoloz.toyger.workspace.FaceRemoteConfig;
import com.alipay.zoloz.toyger.workspace.ToygerCaptureFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class ToygerCirclePattern extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ToygerCaptureFragment captureFragment;
    private FrameLayout circleFrameLayout;
    public boolean isGarfieldFaceless;
    public boolean isNewGarfieldModel;
    private AlgorithmInfoPattern mAlgorithmInfoPattern;
    private int mAnimateValue;
    private ImageView mBottomImage;
    public TextView mBottomLeftTip;
    public TextView mBottomRightTip;
    private TextView mBottomTextView;
    public TextView mBrandTip;
    public CameraSurfaceViewWrapper mCameraSurfaceViewWrapper;
    private CircleForegroud mCircleOverlay;
    public CircleUploadPattern mCircleUploadPattern;
    public ViewStub mCircleUploadPatternViewStub;
    private DialogCallback mDialogCallback;
    private TextView mFaceTopTip;
    private ImageView mGuassianBackground;
    private ImageView mImgBack;
    public boolean mIsShowProcess;
    public Handler mMainHandler;
    private ImageView mMask;
    private RoundProgressBar mOuterBakRoundProgressBar;
    private RelativeLayout mPageBackgroundLayout;
    public View mParentView;
    private RoundProgressBar mRoundProgressBar;
    private RoundProgressBar mRoundProgressBarInner;
    private TextView mTopTipView;
    private ToygerTitleBar mToygerTitleBar;
    private TextView mTxtOtherIdentify;
    public ValueAnimator mValueAnimator;

    /* loaded from: classes3.dex */
    public interface UIProcessEndCallback {
        void onEnd();
    }

    public static /* synthetic */ Object ipc$super(ToygerCirclePattern toygerCirclePattern, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void setMaskViewsetVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59419a3b", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ int access$000(ToygerCirclePattern toygerCirclePattern) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25964ec5", new Object[]{toygerCirclePattern})).intValue() : toygerCirclePattern.mAnimateValue;
    }

    public static /* synthetic */ int access$002(ToygerCirclePattern toygerCirclePattern, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a70e2ca2", new Object[]{toygerCirclePattern, new Integer(i)})).intValue();
        }
        toygerCirclePattern.mAnimateValue = i;
        return i;
    }

    public static /* synthetic */ RoundProgressBar access$100(ToygerCirclePattern toygerCirclePattern) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoundProgressBar) ipChange.ipc$dispatch("60684fd6", new Object[]{toygerCirclePattern}) : toygerCirclePattern.mRoundProgressBar;
    }

    public ToygerCirclePattern(Context context) {
        super(context);
        initViews();
    }

    public ToygerCirclePattern(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViews();
    }

    public ToygerCirclePattern(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initViews();
    }

    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.toyger_circle_pattern, (ViewGroup) this, true);
        this.mParentView = inflate;
        this.circleFrameLayout = (FrameLayout) findViewById(R.id.face_eye_circle_framelayout);
        this.mPageBackgroundLayout = (RelativeLayout) findViewById(R.id.toyger_circle_detecting_page);
        this.mCircleOverlay = (CircleForegroud) findViewById(R.id.toyger_circle_overlay);
        this.mBottomTextView = (TextView) findViewById(R.id.face_eye_circle_bottom_tip);
        this.mCircleUploadPatternViewStub = (ViewStub) inflate.findViewById(R.id.face_eye_upload_info_stub);
        this.mFaceTopTip = (TextView) findViewById(R.id.face_eye_top_tip);
        this.mToygerTitleBar = (ToygerTitleBar) inflate.findViewById(R.id.face_eye_circle_titlebar);
        this.mAlgorithmInfoPattern = (AlgorithmInfoPattern) inflate.findViewById(R.id.face_circle_algothm_info);
        this.mRoundProgressBarInner = (RoundProgressBar) findViewById(R.id.toyger_circle_round_inner);
        this.mTopTipView = (TextView) findViewById(R.id.face_eye_circle_top_tip);
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mRoundProgressBar = (RoundProgressBar) findViewById(R.id.toyger_circle_round_processbar);
        this.mOuterBakRoundProgressBar = (RoundProgressBar) inflate.findViewById(R.id.toyger_circle_round_outer_bak);
        this.mGuassianBackground = (ImageView) inflate.findViewById(R.id.face_eye_circle_guassian_background);
        this.mBottomImage = (ImageView) inflate.findViewById(R.id.face_eye_circle_bottom_image);
        this.mBottomLeftTip = (TextView) inflate.findViewById(R.id.face_eye_circle_bottom_left_protocol);
        this.mBottomLeftTip.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.zoloz.toyger.widget.ToygerCirclePattern.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                }
            }
        });
        this.mTxtOtherIdentify = (TextView) inflate.findViewById(R.id.face_eye_other_verify);
        this.mBottomRightTip = (TextView) inflate.findViewById(R.id.face_eye_circle_bottom_right);
        this.mBottomRightTip.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.zoloz.toyger.widget.ToygerCirclePattern.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    BioLog.i("mBottomRightTip");
                }
            }
        });
        this.mBrandTip = (TextView) inflate.findViewById(R.id.tv_brand);
        CameraTextureRender.ANIMRATION = 1.0f;
    }

    public void init(FaceRemoteConfig faceRemoteConfig) {
        Coll coll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36fe1312", new Object[]{this, faceRemoteConfig});
            return;
        }
        DeviceSetting[] deviceSettingArr = null;
        if (faceRemoteConfig != null) {
            deviceSettingArr = faceRemoteConfig.getDeviceSettings();
            coll = faceRemoteConfig.getColl();
        } else {
            coll = null;
        }
        this.mCameraSurfaceViewWrapper = CameraSurfaceViewWrapper.newInstance(deviceSettingArr, coll);
        this.mCameraSurfaceViewWrapper.initViews(this);
        CameraSurfaceViewWrapper cameraSurfaceViewWrapper = this.mCameraSurfaceViewWrapper;
        if (cameraSurfaceViewWrapper == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = cameraSurfaceViewWrapper.getLayoutParams();
        if (this.isGarfieldFaceless && layoutParams != null) {
            if (coll != null && "sys".equals(coll.getPreviewStyle())) {
                layoutParams.height = 1;
                layoutParams.width = 1;
            } else {
                CameraTextureRender.ANIMRATION = 0.77f;
                layoutParams.height = DisplayUtil.dip2px(getContext(), 194.8052f);
                layoutParams.width = DisplayUtil.dip2px(getContext(), 194.8052f);
            }
            this.mCameraSurfaceViewWrapper.setLayoutParams(layoutParams);
            setToCenter();
        }
        if (!this.isGarfieldFaceless) {
            if (faceRemoteConfig == null || faceRemoteConfig.getFaceTips() == null || StringUtil.isNullorEmpty(faceRemoteConfig.getFaceTips().getBrandTip())) {
                return;
            }
            this.mBrandTip.setText(faceRemoteConfig.getFaceTips().getBrandTip());
            return;
        }
        this.mBrandTip.setText("");
    }

    public void hiddenViewForGarfieldAndSetBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1623e48e", new Object[]{this, new Integer(i)});
            return;
        }
        this.isNewGarfieldModel = true;
        setVisibility(0);
        this.mRoundProgressBar.needHidden = true;
        this.mRoundProgressBarInner.needHidden = true;
        this.mOuterBakRoundProgressBar.needHidden = true;
        this.mToygerTitleBar.needHidden = true;
        this.mPageBackgroundLayout.setBackgroundColor(0);
        this.circleFrameLayout.setBackgroundColor(0);
        for (int i2 = 0; i2 < this.mPageBackgroundLayout.getChildCount(); i2++) {
            View childAt = this.mPageBackgroundLayout.getChildAt(i2);
            int id = childAt.getId();
            if (id != R.id.face_eye_circle_framelayout && id != R.id.face_eye_upload_info_stub) {
                childAt.setVisibility(4);
            }
        }
        for (int i3 = 0; i3 < this.circleFrameLayout.getChildCount(); i3++) {
            View childAt2 = this.circleFrameLayout.getChildAt(i3);
            if (childAt2.getId() == R.id.toyger_circle_surfaceview_gl) {
                childAt2.setBackgroundColor(i);
            } else {
                childAt2.setVisibility(4);
            }
        }
    }

    public void hideCameraInGarfield() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a371555", new Object[]{this});
        } else if (!this.isGarfieldFaceless) {
        } else {
            CameraTextureRender.ANIMRATION = -1.0f;
        }
    }

    public CircleUploadPattern getCircleUploadPattern() {
        ViewStub viewStub;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CircleUploadPattern) ipChange.ipc$dispatch("90145b4c", new Object[]{this});
        }
        if (this.mCircleUploadPattern == null && (viewStub = this.mCircleUploadPatternViewStub) != null) {
            viewStub.inflate();
            this.mCircleUploadPattern = (CircleUploadPattern) this.mParentView.findViewById(R.id.toyger_circle_pattern_upload_info);
            if (this.isNewGarfieldModel) {
                this.mCircleUploadPattern.needHidden = true;
            }
            this.mCircleUploadPattern.setCallback(this.mDialogCallback);
        }
        return this.mCircleUploadPattern;
    }

    public CameraSurfaceViewWrapper getCameraSurfaceViewWrapper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CameraSurfaceViewWrapper) ipChange.ipc$dispatch("d5b42338", new Object[]{this}) : this.mCameraSurfaceViewWrapper;
    }

    public TextView getFaceTopTip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("305b7434", new Object[]{this}) : this.mFaceTopTip;
    }

    public void onPreviewChanged(double d, double d2) {
        CameraSurfaceViewWrapper cameraSurfaceViewWrapper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54d5fd2", new Object[]{this, new Double(d), new Double(d2)});
        } else if (this.isGarfieldFaceless || (cameraSurfaceViewWrapper = this.mCameraSurfaceViewWrapper) == null || !cameraSurfaceViewWrapper.invalidateView()) {
        } else {
            if (d < d2) {
                FrameLayout.LayoutParams layoutParams = this.mCameraSurfaceViewWrapper.getLayoutParams();
                if (layoutParams == null) {
                    return;
                }
                BioLog.i("setPreviewChanged parent : W:" + layoutParams.width + " H:" + layoutParams.height);
                BioLog.i("setPreviewChanged preview: w:" + d + " h:" + d2);
                int i = (int) ((((double) layoutParams.width) / d) * d2);
                layoutParams.height = i;
                this.mCameraSurfaceViewWrapper.setLayoutParams(layoutParams);
                this.mCameraSurfaceViewWrapper.setBackgroundColor(0);
                ((FrameLayout.LayoutParams) this.mGuassianBackground.getLayoutParams()).height = i;
                this.mGuassianBackground.setLayoutParams(layoutParams);
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = this.mCameraSurfaceViewWrapper.getLayoutParams();
            if (layoutParams2 == null) {
                return;
            }
            BioLog.i("setPreviewChanged parent : W:" + layoutParams2.width + " H:" + layoutParams2.height);
            BioLog.i("setPreviewChanged preview: w:" + d + " h:" + d2);
            int i2 = (int) ((((double) layoutParams2.height) / d2) * d);
            layoutParams2.width = i2;
            this.mCameraSurfaceViewWrapper.setLayoutParams(layoutParams2);
            this.mCameraSurfaceViewWrapper.setBackgroundColor(0);
            ((FrameLayout.LayoutParams) this.mGuassianBackground.getLayoutParams()).width = i2;
            this.mGuassianBackground.setLayoutParams(layoutParams2);
        }
    }

    private void setToCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee5f8b9", new Object[]{this});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.circleFrameLayout.getLayoutParams();
        layoutParams.addRule(13, -1);
        this.circleFrameLayout.setLayoutParams(layoutParams);
    }

    public void showProcessBar(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf7f12b8", new Object[]{this, new Float(f)});
        } else {
            showAnimator((int) (f * 3600.0f), 500, false);
        }
    }

    public void showProcessBar(float f, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec13e4e9", new Object[]{this, new Float(f), new Integer(i), new Boolean(z)});
            return;
        }
        this.mIsShowProcess = !z;
        showAnimator((int) (f * 3600.0f), i, false);
    }

    public ToygerTitleBar getTitleBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerTitleBar) ipChange.ipc$dispatch("4fbf85c2", new Object[]{this}) : this.mToygerTitleBar;
    }

    public ImageView getBackButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("542c045a", new Object[]{this}) : this.mImgBack;
    }

    public TextView getTopTip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f133e3f7", new Object[]{this}) : this.mTopTipView;
    }

    public void setTopTipViewsetVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f73655", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.isNewGarfieldModel) {
            i = 8;
        }
        this.mTopTipView.setVisibility(i);
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        CircleUploadPattern circleUploadPattern = this.mCircleUploadPattern;
        if (circleUploadPattern == null) {
            return;
        }
        circleUploadPattern.stopProcess();
    }

    public void setDialogCallback(DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f2429e", new Object[]{this, dialogCallback});
        } else {
            this.mDialogCallback = dialogCallback;
        }
    }

    public void setCameraVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab38b1c2", new Object[]{this, new Boolean(z)});
            return;
        }
        CameraSurfaceViewWrapper cameraSurfaceViewWrapper = this.mCameraSurfaceViewWrapper;
        if (cameraSurfaceViewWrapper == null) {
            return;
        }
        if (z) {
            cameraSurfaceViewWrapper.setVisibility(0);
        } else {
            cameraSurfaceViewWrapper.setVisibility(8);
        }
    }

    private void showAnimator(final int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4faf09", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.mIsShowProcess) {
        } else {
            this.mIsShowProcess = true;
            long j = i2;
            this.mMainHandler.postDelayed(new Runnable() { // from class: com.alipay.zoloz.toyger.widget.ToygerCirclePattern.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ToygerCirclePattern.this.mIsShowProcess = false;
                    }
                }
            }, j);
            int progress = this.mRoundProgressBar.getProgress();
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.mValueAnimator = ValueAnimator.ofInt(progress, i);
            this.mValueAnimator.setDuration(j);
            if (z) {
                this.mValueAnimator.setInterpolator(new LinearInterpolator());
            } else {
                this.mValueAnimator.setInterpolator(new AccelerateInterpolator());
            }
            this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.zoloz.toyger.widget.ToygerCirclePattern.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    ToygerCirclePattern toygerCirclePattern = ToygerCirclePattern.this;
                    ToygerCirclePattern.access$002(toygerCirclePattern, Integer.parseInt(ToygerCirclePattern.this.mValueAnimator.getAnimatedValue() + ""));
                    ToygerCirclePattern.access$100(ToygerCirclePattern.this).setProgress(ToygerCirclePattern.access$000(ToygerCirclePattern.this));
                    if (i != ToygerCirclePattern.access$000(ToygerCirclePattern.this)) {
                        return;
                    }
                    ToygerCirclePattern toygerCirclePattern2 = ToygerCirclePattern.this;
                    toygerCirclePattern2.mIsShowProcess = false;
                    toygerCirclePattern2.mValueAnimator.cancel();
                    ToygerCirclePattern.this.mValueAnimator = null;
                }
            });
            this.mValueAnimator.start();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    private String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2}) : StringUtil.isNullorEmpty(str) ? str2 : str;
    }

    public RoundProgressBar getRoundProgressBarInner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoundProgressBar) ipChange.ipc$dispatch("e5b1f812", new Object[]{this}) : this.mRoundProgressBarInner;
    }

    public RoundProgressBar getRoundProgressBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoundProgressBar) ipChange.ipc$dispatch("b8dd9578", new Object[]{this}) : this.mRoundProgressBar;
    }

    public RoundProgressBar getOuterBakRoundProgressBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RoundProgressBar) ipChange.ipc$dispatch("2c9ec8a9", new Object[]{this}) : this.mOuterBakRoundProgressBar;
    }

    public ImageView getGuassianBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("fb6bb022", new Object[]{this}) : this.mGuassianBackground;
    }

    public ImageView getBottomImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("f4ccfa6f", new Object[]{this}) : this.mBottomImage;
    }

    public TextView getBottomTextView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5891132e", new Object[]{this}) : this.mBottomTextView;
    }

    public AlgorithmInfoPattern getAlgorithmInfoPattern() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AlgorithmInfoPattern) ipChange.ipc$dispatch("14982035", new Object[]{this}) : this.mAlgorithmInfoPattern;
    }

    public ToygerCaptureFragment getGarfieldCaptureFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerCaptureFragment) ipChange.ipc$dispatch("8da87b65", new Object[]{this}) : this.captureFragment;
    }

    public void setGarfieldCaptureFragment(ToygerCaptureFragment toygerCaptureFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3195d0d7", new Object[]{this, toygerCaptureFragment});
        } else {
            this.captureFragment = toygerCaptureFragment;
        }
    }

    public TextView getOtherIdentifyTxt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("17252b05", new Object[]{this}) : this.mTxtOtherIdentify;
    }

    public void changePageColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6b998", new Object[]{this, new Integer(i)});
            return;
        }
        RelativeLayout relativeLayout = this.mPageBackgroundLayout;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(i);
        }
        CircleForegroud circleForegroud = this.mCircleOverlay;
        if (circleForegroud == null) {
            return;
        }
        circleForegroud.setFloodColor(i);
    }

    public void onProcessReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2fe4a6", new Object[]{this});
            return;
        }
        ToygerCaptureFragment toygerCaptureFragment = this.captureFragment;
        if (toygerCaptureFragment == null) {
            return;
        }
        toygerCaptureFragment.onProcessReset();
    }

    public void onProcessing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6999d9", new Object[]{this});
            return;
        }
        ToygerCaptureFragment toygerCaptureFragment = this.captureFragment;
        if (toygerCaptureFragment == null) {
            return;
        }
        toygerCaptureFragment.onProcess();
    }

    public void onProcessDone(UIProcessEndCallback uIProcessEndCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaab33", new Object[]{this, uIProcessEndCallback});
            return;
        }
        ToygerCaptureFragment toygerCaptureFragment = this.captureFragment;
        if (toygerCaptureFragment == null) {
            return;
        }
        toygerCaptureFragment.onProcessDone(uIProcessEndCallback);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mCircleUploadPattern = null;
        this.mCircleUploadPatternViewStub = null;
        this.mMainHandler = null;
        this.mParentView = null;
        this.captureFragment = null;
        CameraSurfaceViewWrapper.release();
    }
}
