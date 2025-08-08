package com.taobao.android.address.wrapper.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.idst.nls.nlsclientsdk.requests.NlsSpeechClient;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorder;
import com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerWithRecorderCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.e;
import com.taobao.runtimepermission.f;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.dof;
import tb.riy;

/* loaded from: classes4.dex */
public class RealtimeSpeechView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPEECH_PAGE = "PageAddressVoiceInput";
    private static final String TAG = "RealtimeSpeechView";
    private String accessToken;
    private long accessTokenExpireTime;
    private String appKey;
    private NlsSpeechClient client;
    private String finalResult;
    private boolean hasRetryAccessToken;
    private String jsParams;
    private int lastVolume;
    private final long lastVolumeDuration;
    private long lastVolumeTime;
    private SharedPreferences mAddressSP;
    private TUrlImageView mCloseButton;
    private Button mConfirmBtn;
    private View mConfirmLL;
    private View mImvBlurBackground;
    private boolean mIsRecordButtonClickable;
    private boolean mIsRecordButtonReleased;
    private boolean mIsShown;
    private RelativeLayout mRealtimeSpeechLayer;
    private View mRecordBar;
    private TUrlImageView mRecordButton;
    private TextView mResultMessageHint;
    private TextView mResultMessageTitle;
    private View mRootView;
    private RealtimeSpeechVolumeView mVolumeView;
    private View.OnClickListener onRecordButtonClickListener;
    private a realTimeSpeechListener;
    private SpeechRecognizerWithRecorder speechRecognizerWithRecorder;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(String str);
    }

    public static /* synthetic */ Object ipc$super(RealtimeSpeechView realtimeSpeechView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812eafd3", new Object[]{realtimeSpeechView});
        } else {
            realtimeSpeechView.onConfirmButtonClick();
        }
    }

    public static /* synthetic */ View access$100(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("e4f52a96", new Object[]{realtimeSpeechView}) : realtimeSpeechView.mImvBlurBackground;
    }

    public static /* synthetic */ TextView access$1000(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("832736", new Object[]{realtimeSpeechView}) : realtimeSpeechView.mResultMessageTitle;
    }

    public static /* synthetic */ void access$1100(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255db443", new Object[]{realtimeSpeechView});
        } else {
            realtimeSpeechView.reset();
        }
    }

    public static /* synthetic */ boolean access$1200(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16af43c8", new Object[]{realtimeSpeechView})).booleanValue() : realtimeSpeechView.hasRetryAccessToken;
    }

    public static /* synthetic */ boolean access$1202(RealtimeSpeechView realtimeSpeechView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f815e052", new Object[]{realtimeSpeechView, new Boolean(z)})).booleanValue();
        }
        realtimeSpeechView.hasRetryAccessToken = z;
        return z;
    }

    public static /* synthetic */ TextView access$1300(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("b1853cb9", new Object[]{realtimeSpeechView}) : realtimeSpeechView.mResultMessageHint;
    }

    public static /* synthetic */ void access$1400(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95262c6", new Object[]{realtimeSpeechView});
        } else {
            realtimeSpeechView.release();
        }
    }

    public static /* synthetic */ a access$1500(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("bd3abf6e", new Object[]{realtimeSpeechView}) : realtimeSpeechView.realTimeSpeechListener;
    }

    public static /* synthetic */ long access$1600(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbf581bc", new Object[]{realtimeSpeechView})).longValue() : realtimeSpeechView.lastVolumeTime;
    }

    public static /* synthetic */ long access$1602(RealtimeSpeechView realtimeSpeechView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db9726ae", new Object[]{realtimeSpeechView, new Long(j)})).longValue();
        }
        realtimeSpeechView.lastVolumeTime = j;
        return j;
    }

    public static /* synthetic */ int access$1700(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cd47113c", new Object[]{realtimeSpeechView})).intValue() : realtimeSpeechView.lastVolume;
    }

    public static /* synthetic */ int access$1702(RealtimeSpeechView realtimeSpeechView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1477838b", new Object[]{realtimeSpeechView, new Integer(i)})).intValue();
        }
        realtimeSpeechView.lastVolume = i;
        return i;
    }

    public static /* synthetic */ boolean access$1800(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("be98a0ce", new Object[]{realtimeSpeechView})).booleanValue() : realtimeSpeechView.mIsRecordButtonReleased;
    }

    public static /* synthetic */ RelativeLayout access$200(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("72478925", new Object[]{realtimeSpeechView}) : realtimeSpeechView.mRealtimeSpeechLayer;
    }

    public static /* synthetic */ View access$300(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c2034d18", new Object[]{realtimeSpeechView}) : realtimeSpeechView.mRecordBar;
    }

    public static /* synthetic */ boolean access$402(RealtimeSpeechView realtimeSpeechView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c105789f", new Object[]{realtimeSpeechView, new Boolean(z)})).booleanValue();
        }
        realtimeSpeechView.mIsShown = z;
        return z;
    }

    public static /* synthetic */ SharedPreferences access$500(RealtimeSpeechView realtimeSpeechView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("521ad82c", new Object[]{realtimeSpeechView}) : realtimeSpeechView.mAddressSP;
    }

    public static /* synthetic */ String access$602(RealtimeSpeechView realtimeSpeechView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1247dddb", new Object[]{realtimeSpeechView, str});
        }
        realtimeSpeechView.accessToken = str;
        return str;
    }

    public static /* synthetic */ long access$702(RealtimeSpeechView realtimeSpeechView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ba65e5c", new Object[]{realtimeSpeechView, new Long(j)})).longValue();
        }
        realtimeSpeechView.accessTokenExpireTime = j;
        return j;
    }

    public static /* synthetic */ String access$802(RealtimeSpeechView realtimeSpeechView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6516cf99", new Object[]{realtimeSpeechView, str});
        }
        realtimeSpeechView.appKey = str;
        return str;
    }

    public static /* synthetic */ void access$900(RealtimeSpeechView realtimeSpeechView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48b2327", new Object[]{realtimeSpeechView, new Integer(i)});
        } else {
            realtimeSpeechView.traceSpeechFail(i);
        }
    }

    public RealtimeSpeechView(Context context, String str) {
        super(context);
        this.appKey = "";
        this.accessToken = "";
        this.accessTokenExpireTime = 0L;
        this.mIsRecordButtonClickable = true;
        this.onRecordButtonClickListener = new View.OnClickListener() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    RealtimeSpeechView.this.onButtonDown();
                }
            }
        };
        this.lastVolume = 0;
        this.lastVolumeTime = 0L;
        this.lastVolumeDuration = 250L;
        this.hasRetryAccessToken = false;
        this.jsParams = str;
        createView(context);
        this.hasRetryAccessToken = false;
        this.mAddressSP = context.getSharedPreferences("globalAddress", 0);
        initSpeechSdk();
    }

    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.mRootView = LayoutInflater.from(context).inflate(R.layout.aliuser_realtime_speech, (ViewGroup) null, false);
        addView(this.mRootView);
        findAllViews();
        return this.mRootView;
    }

    private View findView(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("86c73ae0", new Object[]{this, new Integer(i)}) : this.mRootView.findViewById(i);
    }

    private void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.mResultMessageTitle = (TextView) findView(R.id.result_message_title);
        this.mResultMessageHint = (TextView) findView(R.id.result_message_hint);
        this.mImvBlurBackground = findView(R.id.imv_blur_background);
        this.mImvBlurBackground.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                RealtimeSpeechView.this.onCancel();
                dof.a(RealtimeSpeechView.SPEECH_PAGE, "clickCloseBtn", "", null);
            }
        });
        this.mRealtimeSpeechLayer = (RelativeLayout) findView(R.id.ll_realtime_speech_layer);
        this.mCloseButton = (TUrlImageView) findView(R.id.v_close_button);
        this.mCloseButton.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01NmOQEc1UCnz10fJJN_!!6000000002482-2-tps-48-49.png");
        this.mCloseButton.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    RealtimeSpeechView.this.onCancel();
                }
            }
        });
        this.mRecordBar = findView(R.id.record_btn);
        this.mRecordBar.setOnClickListener(this.onRecordButtonClickListener);
        this.mRecordBar.setContentDescription("语音搜索");
        this.mRecordButton = (TUrlImageView) findView(R.id.layer_record_button);
        this.mRecordButton.setOnClickListener(this.onRecordButtonClickListener);
        this.mRecordButton.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01P78gKQ1ZHS4eJDtFO_!!6000000003169-2-tps-126-126.png");
        this.mVolumeView = (RealtimeSpeechVolumeView) findView(R.id.volume_view);
        this.mVolumeView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    RealtimeSpeechView.this.onStopButtonClick();
                }
            }
        });
        this.mConfirmLL = findView(R.id.confirm_btn_ll);
        this.mConfirmBtn = (Button) findView(R.id.aliuser_address_btn);
        this.mConfirmBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    RealtimeSpeechView.access$000(RealtimeSpeechView.this);
                }
            }
        });
    }

    private void onConfirmButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1628dc", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.speechRecognizerWithRecorder;
        if (speechRecognizerWithRecorder == null) {
            return;
        }
        speechRecognizerWithRecorder.stop();
    }

    public void showResultMessage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a08e48", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            String charSequence = this.mResultMessageHint.getText().toString();
            if (charSequence.length() > str.length()) {
                this.mResultMessageHint.setTextColor(Color.parseColor("#333333"));
                this.mResultMessageHint.setText(str);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#333333"));
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(Color.parseColor("#4d333333"));
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, charSequence.length(), 17);
            spannableStringBuilder.setSpan(foregroundColorSpan2, charSequence.length(), str.length(), 17);
            this.mResultMessageHint.setText(spannableStringBuilder);
        }
    }

    public void showErrorTips(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9da09fe", new Object[]{this, str, str2});
            return;
        }
        this.mResultMessageHint.setTextColor(Color.parseColor("#FD6C2A"));
        this.mResultMessageHint.setText(str);
        this.mConfirmLL.setVisibility(8);
        this.mVolumeView.setVisibility(8);
        this.mRecordButton.setVisibility(0);
    }

    public void showLayerWithAnimation() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3903c0f1", new Object[]{this});
        } else if (this.mRealtimeSpeechLayer == null || (view = this.mImvBlurBackground) == null || this.mIsShown) {
        } else {
            view.setVisibility(0);
            this.mIsShown = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mRealtimeSpeechLayer, "translationY", this.mRealtimeSpeechLayer.getLayoutParams().height, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    public void hideLayerWithAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4f9176", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.mRealtimeSpeechLayer;
        if (relativeLayout == null || this.mImvBlurBackground == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mRealtimeSpeechLayer, "translationY", 0.0f, relativeLayout.getLayoutParams().height);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                RealtimeSpeechView.access$100(RealtimeSpeechView.this).setVisibility(8);
                RealtimeSpeechView.access$200(RealtimeSpeechView.this).setVisibility(8);
                RealtimeSpeechView.access$300(RealtimeSpeechView.this).setVisibility(0);
                RealtimeSpeechView.access$402(RealtimeSpeechView.this, false);
            }
        });
        ofFloat.start();
    }

    public void onRecordStarted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5327b22", new Object[]{this, str});
            return;
        }
        dof.a(SPEECH_PAGE, "voice_commit", "", null);
        this.mRecordButton.setVisibility(8);
        this.mVolumeView.setVisibility(0);
        this.mConfirmLL.setVisibility(0);
        resetLayer();
    }

    public void resetLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6eed4c9", new Object[]{this});
            return;
        }
        this.mResultMessageHint.setTextColor(Color.parseColor("#333333"));
        this.mResultMessageHint.setText("请对我说出你的地址···");
        this.mRealtimeSpeechLayer.setVisibility(0);
        this.mImvBlurBackground.setVisibility(0);
        this.mRecordBar.setVisibility(8);
    }

    public void handleVoiceVolume(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3ece38", new Object[]{this, new Integer(i)});
            return;
        }
        RealtimeSpeechVolumeView realtimeSpeechVolumeView = this.mVolumeView;
        if (realtimeSpeechVolumeView == null) {
            return;
        }
        realtimeSpeechVolumeView.recordVolumn(i);
    }

    public void initSpeechSdk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6873454f", new Object[]{this});
            return;
        }
        showLayerWithAnimation();
        boolean isAccessTokenValid = isAccessTokenValid();
        if (!isAccessTokenValid) {
            String string = this.mAddressSP.getString("speech_accesstoken", "");
            if (!StringUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    this.accessToken = jSONObject.optJSONObject("accessToken").optString("token");
                    this.accessTokenExpireTime = jSONObject.optJSONObject("accessToken").optLong("expireTime");
                    this.appKey = jSONObject.optJSONObject("appKeys").optString("default");
                } catch (Throwable unused) {
                }
                isAccessTokenValid = isAccessTokenValid();
            }
            if (!isAccessTokenValid) {
                e.a(getContext(), new IRemoteBaseListener() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        if (mtopResponse != null && mtopResponse.isApiSuccess()) {
                            try {
                                String optString = mtopResponse.getDataJsonObject().optString("returnValue");
                                if (!StringUtils.isEmpty(optString)) {
                                    try {
                                        RealtimeSpeechView.access$500(RealtimeSpeechView.this).edit().putString("speech_accesstoken", optString).apply();
                                        JSONObject jSONObject2 = new JSONObject(optString);
                                        RealtimeSpeechView.access$602(RealtimeSpeechView.this, jSONObject2.optJSONObject("accessToken").optString("token"));
                                        RealtimeSpeechView.access$702(RealtimeSpeechView.this, jSONObject2.optJSONObject("accessToken").optLong("expireTime"));
                                        RealtimeSpeechView.access$802(RealtimeSpeechView.this, jSONObject2.optJSONObject("appKeys").optString("default"));
                                        RealtimeSpeechView.this.startVaRec();
                                        return;
                                    } catch (Throwable unused2) {
                                    }
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        RealtimeSpeechView realtimeSpeechView = RealtimeSpeechView.this;
                        realtimeSpeechView.showErrorTips("语音录制失败，请点击麦克风重试(" + i + riy.BRACKET_END_STR, "");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        RealtimeSpeechView realtimeSpeechView = RealtimeSpeechView.this;
                        realtimeSpeechView.showErrorTips("语音录制失败，请点击麦克风重试(" + i + riy.BRACKET_END_STR, "");
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        } else {
                            onError(i, mtopResponse, obj);
                        }
                    }
                });
            }
        }
        if (!isAccessTokenValid) {
            return;
        }
        startVaRec();
    }

    private boolean isAccessTokenValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("61e48f5c", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.accessToken) && !StringUtils.isEmpty(this.appKey) && this.accessTokenExpireTime >= System.currentTimeMillis() / 1000;
    }

    /* renamed from: com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass8 implements SpeechRecognizerWithRecorderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public class AnonymousClass2 implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f9004a;

            public AnonymousClass2(String str) {
                this.f9004a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                final String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!this.f9004a.equals("")) {
                    com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(this.f9004a);
                    if (parseObject.containsKey("payload")) {
                        str = parseObject.getJSONObject("payload").getString("result");
                        RealtimeSpeechView.access$1000(RealtimeSpeechView.this).setVisibility(4);
                        RealtimeSpeechView.this.showResultMessage(str, null);
                        RealtimeSpeechView.access$1300(RealtimeSpeechView.this).postDelayed(new Runnable() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.8.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (StringUtils.isEmpty(str)) {
                                    RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                                    RealtimeSpeechView.this.showErrorTips("未能识别，请点击麦克风重试", "");
                                    RealtimeSpeechView.access$900(RealtimeSpeechView.this, 11);
                                } else {
                                    dof.a(RealtimeSpeechView.SPEECH_PAGE, "voice_success", "", null);
                                    RealtimeSpeechView.this.hideLayerWithAnimation();
                                    RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                                    RealtimeSpeechView.access$1300(RealtimeSpeechView.this).postDelayed(new Runnable() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.8.2.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            RealtimeSpeechView.access$1400(RealtimeSpeechView.this);
                                            if (RealtimeSpeechView.access$1500(RealtimeSpeechView.this) == null) {
                                                return;
                                            }
                                            RealtimeSpeechView.access$1500(RealtimeSpeechView.this).a(str);
                                        }
                                    }, 300L);
                                }
                            }
                        }, 500L);
                    }
                }
                str = null;
                RealtimeSpeechView.access$1000(RealtimeSpeechView.this).setVisibility(4);
                RealtimeSpeechView.this.showResultMessage(str, null);
                RealtimeSpeechView.access$1300(RealtimeSpeechView.this).postDelayed(new Runnable() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.8.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (StringUtils.isEmpty(str)) {
                            RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                            RealtimeSpeechView.this.showErrorTips("未能识别，请点击麦克风重试", "");
                            RealtimeSpeechView.access$900(RealtimeSpeechView.this, 11);
                        } else {
                            dof.a(RealtimeSpeechView.SPEECH_PAGE, "voice_success", "", null);
                            RealtimeSpeechView.this.hideLayerWithAnimation();
                            RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                            RealtimeSpeechView.access$1300(RealtimeSpeechView.this).postDelayed(new Runnable() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.8.2.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    RealtimeSpeechView.access$1400(RealtimeSpeechView.this);
                                    if (RealtimeSpeechView.access$1500(RealtimeSpeechView.this) == null) {
                                        return;
                                    }
                                    RealtimeSpeechView.access$1500(RealtimeSpeechView.this).a(str);
                                }
                            }, 300L);
                        }
                    }
                }, 500L);
            }
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onChannelClosed(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5c4a3e2", new Object[]{this, str, new Integer(i)});
            }
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
        public void onVoiceData(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdc515b8", new Object[]{this, bArr, new Integer(i)});
            }
        }

        public AnonymousClass8() {
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onTaskFailed(String str, final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dea2f011", new Object[]{this, str, new Integer(i)});
                return;
            }
            Log.e(RealtimeSpeechView.TAG, "============ onTaskFailed: code & msg: " + i + str);
            RealtimeSpeechView.access$900(RealtimeSpeechView.this, i);
            RealtimeSpeechView.access$1300(RealtimeSpeechView.this).post(new Runnable() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.8.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    RealtimeSpeechView.access$1000(RealtimeSpeechView.this).setVisibility(4);
                    RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                    int i2 = i;
                    if (i2 == 1002) {
                        RealtimeSpeechView.access$900(RealtimeSpeechView.this, 1002);
                        if (RealtimeSpeechView.access$1200(RealtimeSpeechView.this)) {
                            RealtimeSpeechView.this.showErrorTips("语音录制失败，请点击麦克风重试", "");
                            return;
                        }
                        RealtimeSpeechView.access$602(RealtimeSpeechView.this, "");
                        RealtimeSpeechView.access$500(RealtimeSpeechView.this).edit().remove("speech_accesstoken").apply();
                        RealtimeSpeechView.this.initSpeechSdk();
                        RealtimeSpeechView.access$1202(RealtimeSpeechView.this, true);
                    } else if (i2 == 40010007 || i2 == 41010105) {
                        RealtimeSpeechView.this.showErrorTips("未能识别，请点击麦克风重试", "");
                    } else if (i2 >= 14000 && i2 <= 14002) {
                        RealtimeSpeechView.this.showErrorTips("网络连接失败", "");
                    } else {
                        int i3 = i;
                        if (i3 == 14022 || i3 == 422) {
                            RealtimeSpeechView.this.showErrorTips("语音录制失败，请点击麦克风重试", "");
                        } else {
                            RealtimeSpeechView.this.showErrorTips("语音录制失败，请点击麦克风重试", "");
                        }
                    }
                }
            });
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onRecognizedStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35a57473", new Object[]{this});
            } else {
                Log.e(RealtimeSpeechView.TAG, "va recognize started!");
            }
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onRecognizedCompleted(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37f88dc", new Object[]{this, str, new Integer(i)});
                return;
            }
            Log.e(RealtimeSpeechView.TAG, "============== onRecognizedCompleted !" + str);
            RealtimeSpeechView.access$1300(RealtimeSpeechView.this).post(new AnonymousClass2(str));
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.requests.recognizer.SpeechRecognizerCallback
        public void onRecognizedResultChanged(final String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a218b750", new Object[]{this, str, new Integer(i)});
                return;
            }
            Log.e(RealtimeSpeechView.TAG, "============== onRecognizedResultChanged !" + str);
            RealtimeSpeechView.access$1300(RealtimeSpeechView.this).post(new Runnable() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.8.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        r5 = this;
                        com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.AnonymousClass3.$ipChange
                        boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                        r2 = 0
                        if (r1 == 0) goto L12
                        r1 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r1[r2] = r5
                        java.lang.String r2 = "5c510192"
                        r0.ipc$dispatch(r2, r1)
                        return
                    L12:
                        java.lang.String r0 = r2
                        java.lang.String r1 = ""
                        boolean r0 = r0.equals(r1)
                        r1 = 0
                        if (r0 != 0) goto L36
                        java.lang.String r0 = r2
                        com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSONObject.parseObject(r0)
                        java.lang.String r3 = "payload"
                        boolean r4 = r0.containsKey(r3)
                        if (r4 == 0) goto L36
                        com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r3)
                        java.lang.String r3 = "result"
                        java.lang.String r0 = r0.getString(r3)
                        goto L37
                    L36:
                        r0 = r1
                    L37:
                        boolean r3 = android.text.StringUtils.isEmpty(r0)
                        if (r3 != 0) goto L56
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8 r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                        android.widget.TextView r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1000(r3)
                        java.lang.String r4 = "你正在说"
                        r3.setText(r4)
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8 r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                        android.widget.TextView r3 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1000(r3)
                        r3.setVisibility(r2)
                    L56:
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8 r2 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView r2 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                        r2.showResultMessage(r0, r1)
                        boolean r1 = android.text.StringUtils.isEmpty(r0)
                        if (r1 != 0) goto L8e
                        int r1 = r0.length()
                        r2 = 50
                        if (r1 < r2) goto L8e
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8 r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                        r1.cancelRecorder()
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8 r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1400(r1)
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8 r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$a r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1500(r1)
                        if (r1 == 0) goto L8e
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$8 r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.this
                        com.taobao.android.address.wrapper.widget.RealtimeSpeechView$a r1 = com.taobao.android.address.wrapper.widget.RealtimeSpeechView.access$1500(r1)
                        r1.a(r0)
                    L8e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.AnonymousClass8.AnonymousClass3.run():void");
                }
            });
        }

        @Override // com.alibaba.idst.nls.nlsclientsdk.util.RecorderCallback
        public void onVoiceVolume(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b78c1fef", new Object[]{this, new Integer(i)});
            } else if (System.currentTimeMillis() - RealtimeSpeechView.access$1600(RealtimeSpeechView.this) <= 250 && i - RealtimeSpeechView.access$1700(RealtimeSpeechView.this) <= 5) {
            } else {
                RealtimeSpeechView.access$1602(RealtimeSpeechView.this, System.currentTimeMillis());
                RealtimeSpeechView.access$1702(RealtimeSpeechView.this, i);
                RealtimeSpeechView.this.handleVoiceVolume(i);
            }
        }
    }

    public void startVaRec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425f61aa", new Object[]{this});
            return;
        }
        this.client = NlsSpeechClient.getInstance(NlsSpeechClient.DEFAULT_SERVER_ADDR, this.accessToken);
        this.speechRecognizerWithRecorder = this.client.createRecognizerWithRecorder(new AnonymousClass8());
        this.speechRecognizerWithRecorder.setAppKey(this.appKey);
        this.speechRecognizerWithRecorder.setSampleRate(16000);
        this.speechRecognizerWithRecorder.enableIntermediateResult(true);
        this.speechRecognizerWithRecorder.setFormat("opu");
        this.speechRecognizerWithRecorder.enableVoiceDetection(true);
        if (StringUtils.isEmpty(this.jsParams)) {
            this.speechRecognizerWithRecorder.setMaxEndSilence(0);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(this.jsParams);
                this.speechRecognizerWithRecorder.setMaxStartSilence(jSONObject.optInt("voiceMaxStartSilence", 0));
                this.speechRecognizerWithRecorder.setMaxEndSilence(jSONObject.optInt("voiceMaxEndSilence", 0));
            } catch (Throwable unused) {
                this.speechRecognizerWithRecorder.setMaxEndSilence(0);
            }
        }
        this.speechRecognizerWithRecorder.setInverseTextNormalization(true);
        this.speechRecognizerWithRecorder.start();
        onRecordStarted("");
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.mIsRecordButtonClickable = true;
        }
    }

    public void onCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379d4540", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.speechRecognizerWithRecorder;
        if (speechRecognizerWithRecorder != null) {
            speechRecognizerWithRecorder.cancel();
            showResultMessage("语音搜索已取消", null);
        }
        hideLayerWithAnimation();
        if (this.realTimeSpeechListener == null) {
            return;
        }
        release();
        this.realTimeSpeechListener.a();
    }

    public void cancelRecorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933539df", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.speechRecognizerWithRecorder;
        if (speechRecognizerWithRecorder == null) {
            return;
        }
        speechRecognizerWithRecorder.cancel();
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.speechRecognizerWithRecorder = null;
        }
    }

    private void traceSpeechFail(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7350d437", new Object[]{this, new Integer(i)});
            return;
        }
        dof.a(SPEECH_PAGE, "voice_failure", i + "", null);
    }

    public void onStopButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e570fa3c", new Object[]{this});
            return;
        }
        SpeechRecognizerWithRecorder speechRecognizerWithRecorder = this.speechRecognizerWithRecorder;
        if (speechRecognizerWithRecorder == null) {
            return;
        }
        speechRecognizerWithRecorder.stop();
    }

    public boolean onButtonDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95ce693e", new Object[]{this})).booleanValue();
        }
        if (!this.mIsRecordButtonClickable) {
            AdapterForTLog.logd(TAG, "语音识别进行中，禁用点击");
            return true;
        }
        dof.a(SPEECH_PAGE, "clickRecordBtn", "", null);
        final Activity activity = (Activity) getContext();
        this.mIsRecordButtonClickable = false;
        this.mIsRecordButtonReleased = false;
        f.a(activity, new String[]{"android.permission.RECORD_AUDIO"}).a("当您使用语音输入时需要系统授权录音权限").a(new Runnable() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (RealtimeSpeechView.access$1800(RealtimeSpeechView.this)) {
                    RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                    Toast.makeText(activity, "授权成功，请重新按住按钮说话", 0).show();
                } else {
                    RealtimeSpeechView.this.showLayerWithAnimation();
                    try {
                        RealtimeSpeechView.this.initSpeechSdk();
                    } catch (Throwable unused) {
                        Toast.makeText(RealtimeSpeechView.this.getContext().getApplicationContext(), "语音功能初始化失败", 0).show();
                    }
                }
            }
        }).b(new Runnable() { // from class: com.taobao.android.address.wrapper.widget.RealtimeSpeechView.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                RealtimeSpeechView.access$900(RealtimeSpeechView.this, 403);
                RealtimeSpeechView.access$1100(RealtimeSpeechView.this);
                Toast.makeText(activity, "没有录音权限，请先授权", 0).show();
            }
        }).a();
        return false;
    }

    public void setRealTimeSpeechListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5453be9", new Object[]{this, aVar});
        } else {
            this.realTimeSpeechListener = aVar;
        }
    }
}
