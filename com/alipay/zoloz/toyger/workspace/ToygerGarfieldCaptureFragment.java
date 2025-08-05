package com.alipay.zoloz.toyger.workspace;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.zoloz.hardware.camera.preview.CameraTextureRender;
import com.alipay.zoloz.hardware.camera.utils.DisplayUtil;
import com.alipay.zoloz.toyger.bean.GuidType;
import com.alipay.zoloz.toyger.extservice.record.ToygerRecordService;
import com.alipay.zoloz.toyger.widget.CameraSurfaceViewWrapper;
import com.alipay.zoloz.toyger.widget.GarfieldPhoneUpDown;
import com.alipay.zoloz.toyger.widget.GarfieldUploadProgressBar;
import com.alipay.zoloz.toyger.widget.ToygerCirclePattern;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class ToygerGarfieldCaptureFragment extends ToygerCaptureFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ToygerGarfieldCaptureFragment";
    private Button backButton;
    public RelativeLayout garfieldCorner;
    public ImageView garfieldFace;
    public RelativeLayout garfieldProgress;
    public RelativeLayout garfieldProgressDoneCover;
    public TextView garfieldSceneText;
    public GarfieldPhoneUpDown garfield_phone_updown;
    public CameraSurfaceViewWrapper mCameraSurfaceViewWrapper;
    public ValueAnimator mShowFaceValueAnimator;
    public GarfieldUploadProgressBar mUploadProgressBar;
    private String sceneText;
    private TextView verifyText;
    public ValueAnimator mValueAnimator = null;
    private AtomicBoolean mIsShowProcess = new AtomicBoolean(false);
    private AtomicBoolean mIsProgressBarNeedStop = new AtomicBoolean(false);
    public boolean isPhoneUpDownAnimBegin = false;
    public boolean isShowFaceAnimBegin = false;
    public float originalFaceAlpha = 0.9f;
    public final float originalCameraScale = 0.77f;
    private boolean mEnableAnim = true;
    public int currentProcess = 0;

    public static /* synthetic */ Object ipc$super(ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Button access$000(ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("bbd4330f", new Object[]{toygerGarfieldCaptureFragment}) : toygerGarfieldCaptureFragment.backButton;
    }

    public static /* synthetic */ String access$100(ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b88b5f26", new Object[]{toygerGarfieldCaptureFragment}) : toygerGarfieldCaptureFragment.sceneText;
    }

    public static /* synthetic */ AtomicBoolean access$200(ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("7bdbfb99", new Object[]{toygerGarfieldCaptureFragment}) : toygerGarfieldCaptureFragment.mIsProgressBarNeedStop;
    }

    public static /* synthetic */ AtomicBoolean access$300(ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("378529b8", new Object[]{toygerGarfieldCaptureFragment}) : toygerGarfieldCaptureFragment.mIsShowProcess;
    }

    public static /* synthetic */ void access$400(ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d068ff57", new Object[]{toygerGarfieldCaptureFragment});
        } else {
            toygerGarfieldCaptureFragment.startCornerBreathAnimation();
        }
    }

    public static /* synthetic */ void access$500(ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b3b436", new Object[]{toygerGarfieldCaptureFragment});
        } else {
            toygerGarfieldCaptureFragment.intervalAction();
        }
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerCaptureFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        BioLog.i("Fragment onCreate");
        if (this.mToygerCallback == null || this.mToygerCallback.getRemoteConfig() == null) {
            return;
        }
        if (this.mToygerCallback.getRemoteConfig().getFaceTips() != null) {
            this.sceneText = this.mToygerCallback.getRemoteConfig().getFaceTips().sceneText;
        }
        if (this.mToygerCallback.getRemoteConfig().getColl() == null) {
            return;
        }
        this.mEnableAnim = this.mToygerCallback.getRemoteConfig().getColl().getFocusAni();
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerCaptureFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        BioLog.i("Fragment onCreateView");
        try {
            if (this.mContentView != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.mContentView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.mContentView);
                }
            } else {
                initView(layoutInflater, viewGroup);
            }
        } catch (Throwable th) {
            BioLog.e(Log.getStackTraceString(th));
            this.mToygerCallback.finishActivity(false);
            this.mToygerCallback.sendResponse(205, ZcodeConstants.ZCODE_SYSTEM_EXC);
        }
        return this.mContentView;
    }

    private void initView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39352c05", new Object[]{this, layoutInflater, viewGroup});
            return;
        }
        recordExtDetectionStart(this.mToygerCallback.getRemoteConfig().getAlgorithm(), true);
        this.mContentView = layoutInflater.inflate(R.layout.toyger_garfield_pattern_component, viewGroup, false);
        this.mToygerCirclePattern = (ToygerCirclePattern) this.mContentView.findViewById(R.id.toyger_circle_pattern_component);
        float backgroundAlpha = this.mToygerCallback.getRemoteConfig().getColl().getBackgroundAlpha();
        String replace = this.mToygerCallback.getRemoteConfig().getColl().getBackgroundColor().replace("#", "");
        int parseLong = (int) Long.parseLong(Integer.toHexString((int) (backgroundAlpha * 255.0f)) + replace, 16);
        this.mContentView.setBackgroundColor(parseLong);
        TextView textView = (TextView) this.mContentView.findViewById(R.id.face_eye_other_verify_garfield);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        float f = getResources().getDisplayMetrics().density;
        layoutParams.width = (int) (150.0f * f);
        layoutParams.height = (int) (f * 39.0f);
        layoutParams.setMargins(0, 0, 0, (int) (getResources().getDisplayMetrics().heightPixels * 0.0967d));
        textView.setLayoutParams(layoutParams);
        this.verifyText = (TextView) this.mContentView.findViewById(R.id.face_eye_other_verify_garfield);
        this.backButton = (Button) this.mContentView.findViewById(R.id.back_button_garfield);
        boolean equals = "sys".equals(this.mToygerCallback.getRemoteConfig().getColl().getPreviewStyle());
        boolean z = Build.VERSION.SDK_INT >= 33;
        this.mToygerCirclePattern.isGarfieldFaceless = true;
        this.mToygerCirclePattern.setGarfieldCaptureFragment(this);
        if (z && !equals) {
            this.mToygerCirclePattern.hiddenViewForGarfieldAndSetBackgroundColor(parseLong);
        } else {
            this.mToygerCirclePattern.setVisibility(4);
        }
        this.mToygerCirclePattern.init(this.mToygerCallback.getRemoteConfig());
        this.mToygerWorkspace = new ToygerWorkspace(this.mBioServiceManager, this.mToygerCallback, this.mToygerCirclePattern);
        this.garfieldSceneText = (TextView) this.mContentView.findViewById(R.id.garfield_scene_text);
        this.mCameraSurfaceViewWrapper = this.mToygerCirclePattern.getCameraSurfaceViewWrapper();
        if (this.mToygerWorkspace.getGuidType() == GuidType.SHOWFACE) {
            ((RelativeLayout) this.mContentView.findViewById(R.id.toyger_roundrect_background)).getBackground().setAlpha((int) (this.originalFaceAlpha * 255.0f));
            String showFaceText = this.mToygerCallback.getRemoteConfig().getFaceTips().getShowFaceText();
            if (!showFaceText.isEmpty()) {
                this.garfieldSceneText.setText(showFaceText);
                this.sceneText = showFaceText;
            }
        } else {
            this.mToygerCirclePattern.hideCameraInGarfield();
        }
        this.garfieldCorner = (RelativeLayout) this.mContentView.findViewById(R.id.garfield_corner);
        this.garfieldProgress = (RelativeLayout) this.mContentView.findViewById(R.id.zoloz_progress_container);
        this.garfieldProgressDoneCover = (RelativeLayout) this.mContentView.findViewById(R.id.zoloz_progress_done_container);
        this.garfieldFace = (ImageView) this.mContentView.findViewById(R.id.garfield_face);
        this.mUploadProgressBar = (GarfieldUploadProgressBar) this.mContentView.findViewById(R.id.zoloz_back_progress);
        this.garfield_phone_updown = (GarfieldPhoneUpDown) this.mContentView.findViewById(R.id.toyger_phone_updown);
        if (!TextUtils.isEmpty(this.sceneText)) {
            this.garfieldSceneText.setText(this.sceneText);
        } else {
            this.sceneText = this.garfieldSceneText.getText().toString();
        }
        startCornerBreathAnimation();
        if (!this.mToygerWorkspace.isIfaaMode()) {
            initCommon();
            return;
        }
        ((RelativeLayout) this.mContentView.findViewById(R.id.toyger_roundrect_background)).setVisibility(0);
        this.mToygerWorkspace.init();
    }

    private void startCornerBreathAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("712572b4", new Object[]{this});
        } else if (!this.mEnableAnim) {
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ToygerGarfieldCaptureFragment.this.garfieldCorner.startAnimation(AnimationUtils.loadAnimation(ToygerGarfieldCaptureFragment.this.getActivity(), R.anim.anim_corner_breath));
                    }
                }
            });
        }
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerCaptureFragment
    public void onCameraPermission(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6cdc3a", new Object[]{this, new Boolean(z)});
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) ToygerGarfieldCaptureFragment.this.mContentView.findViewById(R.id.toyger_roundrect_background);
                    if (z) {
                        relativeLayout.setVisibility(0);
                    } else {
                        relativeLayout.setVisibility(8);
                    }
                }
            });
        }
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerCaptureFragment
    public void onProcessReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2fe4a6", new Object[]{this});
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ToygerGarfieldCaptureFragment.access$000(ToygerGarfieldCaptureFragment.this).setVisibility(8);
                    ToygerGarfieldCaptureFragment.this.garfieldFace.setVisibility(0);
                    ToygerGarfieldCaptureFragment.this.garfieldProgress.setVisibility(8);
                    if (ToygerGarfieldCaptureFragment.this.mToygerWorkspace.getGuidType() == GuidType.PHONEUPDOWN) {
                        ToygerGarfieldCaptureFragment.this.garfield_phone_updown.setVisibility(8);
                    }
                    ToygerGarfieldCaptureFragment toygerGarfieldCaptureFragment = ToygerGarfieldCaptureFragment.this;
                    toygerGarfieldCaptureFragment.isPhoneUpDownAnimBegin = false;
                    toygerGarfieldCaptureFragment.isShowFaceAnimBegin = false;
                    if (toygerGarfieldCaptureFragment.mToygerWorkspace.getGuidType() == GuidType.SHOWFACE) {
                        if (ToygerGarfieldCaptureFragment.this.mCameraSurfaceViewWrapper != null) {
                            ToygerGarfieldCaptureFragment.this.mCameraSurfaceViewWrapper.setVisibility(0);
                        }
                        CameraTextureRender.ANIMRATION = 0.77f;
                        RelativeLayout relativeLayout = (RelativeLayout) ToygerGarfieldCaptureFragment.this.mContentView.findViewById(R.id.toyger_roundrect_background);
                        relativeLayout.setScaleX(1.0f);
                        relativeLayout.setScaleY(1.0f);
                        relativeLayout.getBackground().setAlpha((int) (ToygerGarfieldCaptureFragment.this.originalFaceAlpha * 255.0f));
                    }
                    ToygerGarfieldCaptureFragment.this.garfieldSceneText.setText(ToygerGarfieldCaptureFragment.access$100(ToygerGarfieldCaptureFragment.this));
                    ToygerGarfieldCaptureFragment.access$200(ToygerGarfieldCaptureFragment.this).set(true);
                    ToygerGarfieldCaptureFragment.access$300(ToygerGarfieldCaptureFragment.this).set(false);
                    ToygerGarfieldCaptureFragment.this.mUploadProgressBar.setRoundProgressColor(Color.parseColor("#FFFFFF"));
                    ToygerGarfieldCaptureFragment.this.garfieldCorner.clearAnimation();
                    ToygerGarfieldCaptureFragment.this.garfieldProgress.clearAnimation();
                    ToygerGarfieldCaptureFragment.access$400(ToygerGarfieldCaptureFragment.this);
                }
            });
        }
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerCaptureFragment
    public void onProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288e5c17", new Object[]{this});
        } else {
            startEyeToCenterAnimation();
        }
    }

    private void startEyeToCenterAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1272e0c", new Object[]{this});
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (ToygerGarfieldCaptureFragment.this.mToygerWorkspace.getGuidType() == GuidType.SHOWFACE) {
                        final RelativeLayout relativeLayout = (RelativeLayout) ToygerGarfieldCaptureFragment.this.mContentView.findViewById(R.id.toyger_roundrect_background);
                        final float scaleX = relativeLayout.getScaleX();
                        relativeLayout.getAlpha();
                        float f = CameraTextureRender.ANIMRATION;
                        if (ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator != null) {
                            ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator.end();
                            ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator.cancel();
                        }
                        ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator.setDuration(300L);
                        ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator.setInterpolator(new LinearInterpolator());
                        ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                                } else if (ToygerGarfieldCaptureFragment.this.getActivity() == null || ToygerGarfieldCaptureFragment.this.getActivity().isFinishing()) {
                                    if (ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator != null) {
                                        ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator.cancel();
                                    }
                                    BioLog.i(ToygerGarfieldCaptureFragment.TAG, "startEyeToCenterAnimation AnimatorUpdateListener: STOP!");
                                } else {
                                    float animatedFraction = valueAnimator.getAnimatedFraction();
                                    String str = ToygerGarfieldCaptureFragment.TAG;
                                    BioLog.i(str, "AnimatorUpdateListener-shrink:" + animatedFraction);
                                    if (1.0f == animatedFraction) {
                                        valueAnimator.cancel();
                                        relativeLayout.setScaleX(1.0f);
                                        relativeLayout.setScaleY(1.0f);
                                        return;
                                    }
                                    float f2 = scaleX;
                                    float f3 = f2 + ((1.0f - f2) * animatedFraction);
                                    relativeLayout.setScaleX(f3);
                                    relativeLayout.setScaleY(f3);
                                    if (animatedFraction <= 0.0f || ToygerGarfieldCaptureFragment.this.mCameraSurfaceViewWrapper == null) {
                                        return;
                                    }
                                    ToygerGarfieldCaptureFragment.this.mCameraSurfaceViewWrapper.setVisibility(4);
                                }
                            }
                        });
                        relativeLayout.getBackground().setAlpha(255);
                        ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator.start();
                        ToygerGarfieldCaptureFragment.this.garfieldSceneText.setText(R.string.garfieldProcessingText);
                    }
                    if (ToygerGarfieldCaptureFragment.this.isPhoneUpDownAnimBegin) {
                        ToygerGarfieldCaptureFragment.this.garfieldFace.clearAnimation();
                        ToygerGarfieldCaptureFragment.this.garfieldFace.setVisibility(8);
                        if (ToygerGarfieldCaptureFragment.this.mToygerWorkspace.getGuidType() == GuidType.PHONEUPDOWN) {
                            ToygerGarfieldCaptureFragment.this.garfield_phone_updown.setVisibility(8);
                        }
                        ToygerGarfieldCaptureFragment.this.garfieldSceneText.setText(R.string.garfieldProcessingText);
                        ToygerGarfieldCaptureFragment.this.garfieldProgress.setVisibility(0);
                        ToygerGarfieldCaptureFragment.this.mUploadProgressBar.setRoundProgressColor(Color.parseColor("#108ee9"));
                    } else {
                        ToygerGarfieldCaptureFragment.this.garfieldCorner.startAnimation(AnimationUtils.loadAnimation(ToygerGarfieldCaptureFragment.this.getActivity(), R.anim.anim_corner_gone));
                        final Animation loadAnimation = AnimationUtils.loadAnimation(ToygerGarfieldCaptureFragment.this.getActivity(), R.anim.anim_progress_scale_to_normal);
                        loadAnimation.setFillAfter(true);
                        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.4.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationStart(Animation animation) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                                } else {
                                    ToygerGarfieldCaptureFragment.this.garfieldFace.setVisibility(0);
                                }
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationEnd(Animation animation) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                                } else if (ToygerGarfieldCaptureFragment.this.garfieldFace == null) {
                                } else {
                                    ToygerGarfieldCaptureFragment.this.garfieldFace.clearAnimation();
                                    ToygerGarfieldCaptureFragment.this.garfieldFace.setVisibility(8);
                                    if (ToygerGarfieldCaptureFragment.this.mToygerWorkspace.getGuidType() == GuidType.PHONEUPDOWN) {
                                        ToygerGarfieldCaptureFragment.this.garfield_phone_updown.setVisibility(8);
                                    }
                                    ToygerGarfieldCaptureFragment.this.garfieldSceneText.setText(R.string.garfieldProcessingText);
                                    ToygerGarfieldCaptureFragment.this.garfieldProgress.setVisibility(0);
                                    ToygerGarfieldCaptureFragment.this.mUploadProgressBar.setRoundProgressColor(Color.parseColor("#108ee9"));
                                }
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public void onAnimationRepeat(Animation animation) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                                } else if (ToygerGarfieldCaptureFragment.this.getActivity() != null && !ToygerGarfieldCaptureFragment.this.getActivity().isFinishing()) {
                                } else {
                                    loadAnimation.cancel();
                                    BioLog.i(ToygerGarfieldCaptureFragment.TAG, "startEyeToCenterAnimation progressScaleToNormalAnim: STOP!");
                                }
                            }
                        });
                        ToygerGarfieldCaptureFragment.this.garfieldFace.clearAnimation();
                        ToygerGarfieldCaptureFragment.this.garfieldFace.startAnimation(loadAnimation);
                    }
                    ToygerGarfieldCaptureFragment.access$500(ToygerGarfieldCaptureFragment.this);
                }
            });
        }
    }

    public Button getBackButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("a611ecea", new Object[]{this}) : this.backButton;
    }

    public TextView getVerifyText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("6370eb37", new Object[]{this}) : this.verifyText;
    }

    public void startBackgroundAnim(final float f, final float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921ab68", new Object[]{this, new Float(f), new Float(f2)});
        } else if (this.isShowFaceAnimBegin) {
        } else {
            ToygerRecordService toygerRecordService = (ToygerRecordService) this.mBioServiceManager.getBioService(ToygerRecordService.class);
            if (toygerRecordService != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("degreeFaceAlpha", "" + f2);
                toygerRecordService.write(ToygerRecordService.SHOW_FACE_ALPHA_END, hashMap);
            }
            this.garfieldFace.clearAnimation();
            this.garfieldFace.setVisibility(8);
            this.originalFaceAlpha = f;
            final RelativeLayout relativeLayout = (RelativeLayout) this.mContentView.findViewById(R.id.toyger_roundrect_background);
            final float f3 = CameraTextureRender.ANIMRATION;
            ValueAnimator valueAnimator = this.mShowFaceValueAnimator;
            if (valueAnimator != null) {
                valueAnimator.end();
                this.mShowFaceValueAnimator.cancel();
            }
            this.mShowFaceValueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.mShowFaceValueAnimator.setDuration(300L);
            this.mShowFaceValueAnimator.setInterpolator(new LinearInterpolator());
            this.mShowFaceValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (ToygerGarfieldCaptureFragment.this.getActivity() == null || ToygerGarfieldCaptureFragment.this.getActivity().isFinishing()) {
                        if (ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator != null) {
                            ToygerGarfieldCaptureFragment.this.mShowFaceValueAnimator.cancel();
                        }
                        BioLog.i(ToygerGarfieldCaptureFragment.TAG, "startBackgroundAnim AnimatorUpdateListener: STOP!");
                    } else {
                        float animatedFraction = valueAnimator2.getAnimatedFraction();
                        if (1.0f == animatedFraction) {
                            valueAnimator2.cancel();
                            CameraTextureRender.ANIMRATION = 1.0f;
                            relativeLayout.setScaleX(r3);
                            relativeLayout.setScaleY(r3);
                            relativeLayout.getBackground().setAlpha((int) (f2 * 255.0f));
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ToygerGarfieldCaptureFragment.access$000(ToygerGarfieldCaptureFragment.this).getLayoutParams();
                            if (ToygerGarfieldCaptureFragment.this.getContext() == null) {
                                return;
                            }
                            layoutParams.setMargins(0, DisplayUtil.dip2px(ToygerGarfieldCaptureFragment.this.getContext(), 13.3f) + DisplayUtil.dip2px(ToygerGarfieldCaptureFragment.this.getContext(), (r3 - 1.0f) * 75.0f), 0, 0);
                            ToygerGarfieldCaptureFragment.access$000(ToygerGarfieldCaptureFragment.this).setLayoutParams(layoutParams);
                            return;
                        }
                        float f4 = f3;
                        CameraTextureRender.ANIMRATION = (f4 + ((1.0f - f4) * animatedFraction)) - 0.01f;
                        float f5 = ((r3 - 1.0f) * animatedFraction) + 1.0f;
                        relativeLayout.setScaleX(f5);
                        relativeLayout.setScaleY(f5);
                        float f6 = f;
                        relativeLayout.getBackground().setAlpha((int) ((f6 + ((f2 - f6) * animatedFraction)) * 255.0f));
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) ToygerGarfieldCaptureFragment.access$000(ToygerGarfieldCaptureFragment.this).getLayoutParams();
                        if (ToygerGarfieldCaptureFragment.this.getContext() == null) {
                            return;
                        }
                        layoutParams2.setMargins(0, DisplayUtil.dip2px(ToygerGarfieldCaptureFragment.this.getContext(), 13.3f) + DisplayUtil.dip2px(ToygerGarfieldCaptureFragment.this.getContext(), (f5 - 1.0f) * 75.0f), 0, 0);
                        ToygerGarfieldCaptureFragment.access$000(ToygerGarfieldCaptureFragment.this).setLayoutParams(layoutParams2);
                    }
                }
            });
            this.mShowFaceValueAnimator.start();
            this.isShowFaceAnimBegin = true;
        }
    }

    public void startPhoneUpDownAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ea7461", new Object[]{this});
        } else if (this.isPhoneUpDownAnimBegin) {
        } else {
            this.garfieldCorner.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.anim_corner_gone));
            final Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.anim_progress_scale_to_normal);
            loadAnimation.setFillAfter(true);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    } else if (ToygerGarfieldCaptureFragment.this.garfield_phone_updown == null || ToygerGarfieldCaptureFragment.this.garfieldFace.getVisibility() != 0) {
                    } else {
                        ToygerGarfieldCaptureFragment.this.garfieldFace.clearAnimation();
                        ToygerGarfieldCaptureFragment.this.garfieldFace.setVisibility(8);
                        ToygerGarfieldCaptureFragment.this.garfield_phone_updown.resetAnim();
                        ToygerGarfieldCaptureFragment.this.garfield_phone_updown.setVisibility(0);
                        String animationText = ToygerGarfieldCaptureFragment.this.mToygerCallback.getRemoteConfig().getFaceTips().getAnimationText();
                        if (animationText == "") {
                            ToygerGarfieldCaptureFragment.this.garfieldSceneText.setText(R.string.garfieldPhoneUpDownText);
                        } else {
                            ToygerGarfieldCaptureFragment.this.garfieldSceneText.setText(animationText);
                        }
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    } else if (ToygerGarfieldCaptureFragment.this.getActivity() != null && !ToygerGarfieldCaptureFragment.this.getActivity().isFinishing()) {
                    } else {
                        loadAnimation.cancel();
                        BioLog.i(ToygerGarfieldCaptureFragment.TAG, "startPhoneUpDownAnim progressScaleToNormalAnim: STOP!");
                    }
                }
            });
            this.garfieldFace.clearAnimation();
            this.garfieldFace.startAnimation(loadAnimation);
            this.isPhoneUpDownAnimBegin = true;
        }
    }

    private void intervalAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17914662", new Object[]{this});
        } else if (this.mIsShowProcess.getAndSet(true)) {
        } else {
            this.mIsProgressBarNeedStop.set(false);
            this.currentProcess = 0;
            ValueAnimator valueAnimator = this.mValueAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.mValueAnimator = ValueAnimator.ofInt(this.currentProcess, 360);
            this.mValueAnimator.setDuration(1000L);
            this.mValueAnimator.setInterpolator(new LinearInterpolator());
            this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    } else if (ToygerGarfieldCaptureFragment.access$200(ToygerGarfieldCaptureFragment.this).get() || ToygerGarfieldCaptureFragment.this.getActivity() == null || ToygerGarfieldCaptureFragment.this.getActivity().isFinishing()) {
                        ToygerGarfieldCaptureFragment.this.mValueAnimator.cancel();
                        ToygerGarfieldCaptureFragment.this.mValueAnimator = null;
                        BioLog.i(ToygerGarfieldCaptureFragment.TAG, "AnimatorUpdateListener: STOP!");
                    } else {
                        ToygerGarfieldCaptureFragment.this.currentProcess += 5;
                        if (ToygerGarfieldCaptureFragment.this.currentProcess > 360) {
                            ToygerGarfieldCaptureFragment.this.currentProcess %= 360;
                        }
                        ToygerGarfieldCaptureFragment.this.mUploadProgressBar.setProgressAngle(ToygerGarfieldCaptureFragment.this.currentProcess);
                    }
                }
            });
            this.mValueAnimator.setRepeatCount(-1);
            this.mValueAnimator.start();
        }
    }

    @Override // com.alipay.zoloz.toyger.workspace.ToygerCaptureFragment
    public void onProcessDone(final ToygerCirclePattern.UIProcessEndCallback uIProcessEndCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eaab33", new Object[]{this, uIProcessEndCallback});
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Animation loadAnimation = AnimationUtils.loadAnimation(ToygerGarfieldCaptureFragment.this.getActivity(), R.anim.anim_progress_cover);
                    loadAnimation.setInterpolator(new AccelerateInterpolator());
                    loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.zoloz.toyger.workspace.ToygerGarfieldCaptureFragment.8.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                                return;
                            }
                            ToygerGarfieldCaptureFragment.this.garfieldFace.setVisibility(8);
                            ToygerGarfieldCaptureFragment.this.garfieldCorner.setVisibility(8);
                            ToygerGarfieldCaptureFragment.this.garfield_phone_updown.clearAnimation();
                            ToygerGarfieldCaptureFragment.this.garfield_phone_updown.setVisibility(8);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                                return;
                            }
                            BioLog.i("加菲结束动画展示完成");
                            if (uIProcessEndCallback == null) {
                                return;
                            }
                            uIProcessEndCallback.onEnd();
                        }
                    });
                    ToygerGarfieldCaptureFragment.this.garfieldProgressDoneCover.setVisibility(0);
                    ToygerGarfieldCaptureFragment.this.garfieldProgressDoneCover.startAnimation(loadAnimation);
                }
            });
        }
    }
}
