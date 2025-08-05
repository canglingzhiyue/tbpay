package com.taobao.uikit.extend.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoExceptionReporter;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.r;
import com.taobao.android.autosize.l;
import com.taobao.android.nav.Nav;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uikit.extend.component.error.AbsErrorFilter;
import com.taobao.uikit.extend.component.error.DefaultErrorFilter;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.extend.utils.NetUtil;
import java.net.URLEncoder;
import org.json.JSONObject;
import tb.arz;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class TBErrorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String[] DEFAULT_DIMENSION_SET;
    private static final String[] DEFAULT_MEASURE_SET;
    private static final String MODULE_NAME = "TBErrorView";
    private static final String MONITOR_POINT = "show_error";
    private static boolean isMonitorRegistered;
    private static boolean isNetworkDiagnosisEnable;
    private boolean hasReported;
    private boolean isInRefreshingState;
    private TUrlImageView mBackgroundView;
    private LinearLayout mCenterLayout;
    private TUrlImageView mCustomIconView;
    private Error mError;
    private AbsErrorFilter mErrorFilter;
    private TextView mErrorInfoTextView;
    private TextView mErrorWaterMarkTextView;
    private Button mFeedbackButton;
    private int mIconRes;
    private String mIconString;
    private TUrlImageView mIconView;
    private boolean mIsNotShowNetworkDiagnosisView;
    private Button mNetworkDiagnosisButton;
    private Button mRefreshButton;
    private Status mStatus;
    private String mSubTitle;
    private TextView mSubTitleView;
    private String mTitle;
    private TextView mTitleView;
    private String mTopic;
    private RefreshRestoreRunnable refreshRestoreRunnable;

    /* loaded from: classes9.dex */
    public enum ButtonType {
        BUTTON_FEEDBACK,
        BUTTON_REFRESH,
        BUTTON_LEFT,
        BUTTON_RIGHT,
        BUTTON_POSITIVE,
        BUTTON_NAGTIVE
    }

    /* loaded from: classes9.dex */
    public enum Status {
        STATUS_ERROR,
        STATUS_EMPTY
    }

    public static /* synthetic */ Object ipc$super(TBErrorView tBErrorView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    private void throwIllegal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7ac237", new Object[]{this});
        }
    }

    @Deprecated
    public void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        }
    }

    @Deprecated
    public void setIconfont(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c0aad2", new Object[]{this, new Integer(i)});
        }
    }

    @Deprecated
    public void setIconfont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8fa9db", new Object[]{this, str});
        }
    }

    public static /* synthetic */ void access$100(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f12cff1", new Object[]{tBErrorView});
        } else {
            tBErrorView.updateUIForRefreshState();
        }
    }

    public static /* synthetic */ boolean access$1002(TBErrorView tBErrorView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("135321f7", new Object[]{tBErrorView, new Boolean(z)})).booleanValue();
        }
        tBErrorView.isInRefreshingState = z;
        return z;
    }

    public static /* synthetic */ RefreshRestoreRunnable access$1102(TBErrorView tBErrorView, RefreshRestoreRunnable refreshRestoreRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshRestoreRunnable) ipChange.ipc$dispatch("a7d575d6", new Object[]{tBErrorView, refreshRestoreRunnable});
        }
        tBErrorView.refreshRestoreRunnable = refreshRestoreRunnable;
        return refreshRestoreRunnable;
    }

    public static /* synthetic */ Error access$200(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("f7538707", new Object[]{tBErrorView}) : tBErrorView.mError;
    }

    public static /* synthetic */ String access$300(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39ec4b51", new Object[]{tBErrorView}) : tBErrorView.mTitle;
    }

    public static /* synthetic */ String access$400(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d17fe92", new Object[]{tBErrorView}) : tBErrorView.mSubTitle;
    }

    public static /* synthetic */ TextView access$500(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("25dc3be1", new Object[]{tBErrorView}) : tBErrorView.mTitleView;
    }

    public static /* synthetic */ TextView access$600(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("3edd8d80", new Object[]{tBErrorView}) : tBErrorView.mSubTitleView;
    }

    public static /* synthetic */ Button access$700(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("efa412df", new Object[]{tBErrorView}) : tBErrorView.mNetworkDiagnosisButton;
    }

    public static /* synthetic */ Button access$800(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("31bb403e", new Object[]{tBErrorView}) : tBErrorView.mFeedbackButton;
    }

    public static /* synthetic */ Button access$900(TBErrorView tBErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("73d26d9d", new Object[]{tBErrorView}) : tBErrorView.mRefreshButton;
    }

    public TBErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.mIconRes = -1;
        this.mStatus = Status.STATUS_ERROR;
        this.hasReported = false;
        this.isInRefreshingState = false;
        this.refreshRestoreRunnable = null;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TBErrorView, i, 0)) != null) {
            this.mIconString = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorIcon);
            this.mTitle = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorTitle);
            this.mSubTitle = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorSubTitle);
            obtainStyledAttributes.recycle();
        }
        int i2 = R.layout.uik_error_new;
        this.mErrorFilter = new DefaultErrorFilter(getContext(), getResources().getString(R.string.uik_default_rule_v2));
        initErrorView(LayoutInflater.from(getContext()).inflate(i2, (ViewGroup) this, true));
    }

    public TBErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBErrorView(Context context) {
        this(context, null, 0);
    }

    private void initErrorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6b296ae", new Object[]{this, view});
            return;
        }
        this.mIconView = (TUrlImageView) view.findViewById(R.id.uik_error_icon);
        this.mTitleView = (TextView) view.findViewById(R.id.uik_error_title);
        this.mSubTitleView = (TextView) view.findViewById(R.id.uik_error_subTitle);
        this.mRefreshButton = (Button) findViewById(R.id.uik_errorButtonPos);
        this.mFeedbackButton = (Button) findViewById(R.id.uik_errorButtonNag);
        this.mErrorInfoTextView = (TextView) findViewById(R.id.uik_mapping_code);
        this.mErrorWaterMarkTextView = (TextView) findViewById(R.id.uik_water_mark);
        this.mFeedbackButton.setOnClickListener(new GoToReportListener());
        this.mNetworkDiagnosisButton = (Button) findViewById(R.id.uik_network_diagnosis);
        this.mNetworkDiagnosisButton.setOnClickListener(new GoToNetworkDiagnosisListener());
        this.mBackgroundView = (TUrlImageView) findViewById(R.id.uik_error_bg);
        this.mCustomIconView = (TUrlImageView) findViewById(R.id.uik_error_icon_custom);
        this.mCenterLayout = (LinearLayout) findViewById(R.id.layout_center);
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (!l.d(getContext()) && !l.b(getContext())) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mCenterLayout.getLayoutParams();
        layoutParams.width = dipToPx(375.0f);
        layoutParams.height = -2;
        this.mCenterLayout.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:8|(2:10|(20:12|13|14|15|(1:17)|18|(2:20|(1:30)(2:26|(1:28)(1:29)))|31|(2:33|(1:35)(1:36))|37|(2:39|(1:41)(2:42|(1:47)(1:46)))|48|(2:85|(1:87))(2:52|(3:80|(1:82)(1:84)|83)(1:56))|57|58|(1:60)|62|(2:70|(2:72|(1:74)))|77|78)(1:88))(1:90)|89|15|(0)|18|(0)|31|(0)|37|(0)|48|(1:50)|85|(0)|57|58|(0)|62|(5:64|66|68|70|(0))|77|78) */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9 A[Catch: Throwable -> 0x01fe, TRY_LEAVE, TryCatch #0 {Throwable -> 0x01fe, blocks: (B:79:0x01df, B:81:0x01e9), top: B:100:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateErrorView() {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.component.TBErrorView.updateErrorView():void");
    }

    public void setNotShowNetworkDiagnosisView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa0dc77", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsNotShowNetworkDiagnosisView = z;
        }
    }

    public void setIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b5841", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIconRes = i;
        this.mIconString = null;
        filterIcon();
        updateErrorView();
    }

    public void setIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
            return;
        }
        this.mIconString = str;
        this.mIconRes = -1;
        filterIcon();
        updateErrorView();
    }

    public void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
        } else if (charSequence == null) {
        } else {
            this.mTitle = charSequence.toString();
            filterTitle();
            updateErrorView();
        }
    }

    public void setSubTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a280e3a5", new Object[]{this, charSequence});
        } else if (charSequence == null) {
        } else {
            this.mSubTitle = charSequence.toString();
            filterSubTitle();
            updateErrorView();
        }
    }

    public void setButton(ButtonType buttonType, CharSequence charSequence, final View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe261e63", new Object[]{this, buttonType, charSequence, onClickListener});
            return;
        }
        Button button = null;
        int i2 = AnonymousClass2.$SwitchMap$com$taobao$uikit$extend$component$TBErrorView$ButtonType[buttonType.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            button = this.mRefreshButton;
        }
        if (button == null) {
            return;
        }
        button.setText(charSequence);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.extend.component.TBErrorView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBErrorView.access$100(TBErrorView.this);
                onClickListener.onClick(view);
            }
        });
        if (onClickListener == null) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public void setButtonVisibility(ButtonType buttonType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297c95f", new Object[]{this, buttonType, new Integer(i)});
            return;
        }
        switch (buttonType) {
            case BUTTON_REFRESH:
            case BUTTON_LEFT:
            case BUTTON_POSITIVE:
                Button button = this.mRefreshButton;
                if (button == null) {
                    return;
                }
                button.setVisibility(i);
                return;
            case BUTTON_FEEDBACK:
            case BUTTON_RIGHT:
            case BUTTON_NAGTIVE:
                if (this.mFeedbackButton == null) {
                    return;
                }
                if (i == 0 && this.mNetworkDiagnosisButton.getVisibility() == 0) {
                    return;
                }
                this.mFeedbackButton.setVisibility(i);
                return;
            default:
                return;
        }
    }

    public void setStatus(Status status) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f9f0c", new Object[]{this, status});
        } else if (status == null) {
        } else {
            this.mStatus = status;
            if (this.mStatus == Status.STATUS_EMPTY) {
                if (this.mIconRes < 0) {
                    this.mIconRes = getDefaultIconRes();
                }
                if (this.mSubTitle == null) {
                    this.mSubTitle = getContext().getString(R.string.uik_default_empty_subtitle);
                }
                if (this.mTitle == null) {
                    this.mTitle = getContext().getString(R.string.uik_default_empty_title);
                }
            }
            filterIcon();
            filterTitle();
            filterSubTitle();
            updateErrorView();
            if (NetUtil.isNetworkConnected(getContext()) || (button = this.mFeedbackButton) == null) {
                return;
            }
            button.setVisibility(8);
        }
    }

    public void setError(Error error) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4369955a", new Object[]{this, error});
        } else if (error == null) {
        } else {
            this.mError = error;
            filterIcon();
            filterTitle();
            filterSubTitle();
            updateErrorView();
            if (!NetUtil.isNetworkConnected(getContext()) && (button = this.mFeedbackButton) != null) {
                button.setVisibility(8);
            }
            if (!this.hasReported) {
                try {
                    report();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            try {
                TLog.loge(MODULE_NAME, "EVSHOW", this.mError.errorMsg + " -> " + getContext().getClass().getCanonicalName());
            } catch (Throwable unused) {
            }
        }
    }

    public void setTopic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mTopic = str;
        }
    }

    private void updateUIForRefreshState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef40689", new Object[]{this});
            return;
        }
        CharSequence text = this.mTitleView.getText();
        CharSequence text2 = this.mSubTitleView.getText();
        this.mTitleView.setText(getContext().getString(R.string.uik_error_view_refreshing_title));
        if (this.mNetworkDiagnosisButton.getVisibility() == 0) {
            this.mNetworkDiagnosisButton.setAlpha(0.3f);
            this.mNetworkDiagnosisButton.setEnabled(false);
        } else {
            this.mSubTitleView.setText(getContext().getString(R.string.uik_error_view_refreshing_subtitle));
        }
        if (this.mFeedbackButton.getVisibility() == 0) {
            this.mFeedbackButton.setAlpha(0.3f);
            this.mFeedbackButton.setEnabled(false);
        }
        if (this.mRefreshButton.getVisibility() == 0) {
            this.mRefreshButton.setAlpha(0.3f);
            this.mFeedbackButton.setEnabled(false);
        }
        this.isInRefreshingState = true;
        this.refreshRestoreRunnable = new RefreshRestoreRunnable(text, text2);
        postDelayed(this.refreshRestoreRunnable, 2000L);
    }

    private void filterIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ee1418", new Object[]{this});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mIconRes = getErrorIcon();
        } else if (this.mStatus == Status.STATUS_EMPTY && this.mIconRes < 0) {
            this.mIconRes = getDefaultIconRes();
        } else if (this.mError == null || this.mStatus != Status.STATUS_ERROR) {
        } else {
            this.mIconRes = this.mErrorFilter.filterIcon(this.mError);
        }
    }

    private void filterSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e9d017", new Object[]{this});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mSubTitle = getContext().getString(getNetworkErrorSubTitle());
        } else if (this.mStatus == Status.STATUS_EMPTY && TextUtils.isEmpty(this.mSubTitle)) {
            this.mSubTitle = getContext().getString(R.string.uik_default_empty_subtitle);
        } else if (this.mError == null || this.mStatus != Status.STATUS_ERROR) {
        } else {
            this.mSubTitle = this.mErrorFilter.filterSubTitle(this.mError, this.mSubTitle);
        }
    }

    private void filterTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b7647", new Object[]{this});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mTitle = getContext().getString(getNetworkErrorTitle());
        } else if (this.mStatus == Status.STATUS_EMPTY && TextUtils.isEmpty(this.mTitle)) {
            this.mTitle = getContext().getString(R.string.uik_default_empty_title);
        } else if (this.mError == null || this.mStatus != Status.STATUS_ERROR) {
        } else {
            this.mTitle = this.mErrorFilter.filterTitle(this.mError, this.mTitle);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mStatus != Status.STATUS_ERROR || this.mError != null) {
            return;
        }
        throwIllegal();
    }

    private int dipToPx(float f) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbbdcbbe", new Object[]{this, new Float(f)})).intValue();
        }
        float f2 = getContext().getResources().getDisplayMetrics().density * f;
        if (f < 0.0f) {
            i = -1;
        }
        return (int) (f2 + (i * 0.5f));
    }

    /* loaded from: classes9.dex */
    public class GoToReportListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-835287209);
            kge.a(-1201612728);
        }

        private GoToReportListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String format;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String str = "";
            if (TBErrorView.access$200(TBErrorView.this) != null && !TextUtils.isEmpty(TBErrorView.access$200(TBErrorView.this).errorCode)) {
                str = TBErrorView.access$200(TBErrorView.this).errorCode;
            }
            String name = TBErrorView.this.getContext().getClass().getName();
            try {
                Object[] objArr = new Object[4];
                objArr[0] = TBErrorView.access$300(TBErrorView.this) + "," + TBErrorView.access$400(TBErrorView.this);
                objArr[1] = str;
                objArr[2] = name;
                objArr[3] = TBErrorView.access$200(TBErrorView.this) != null ? URLEncoder.encode(TBErrorView.access$200(TBErrorView.this).toJSON(), "UTF-8") : "empty";
                format = String.format("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html?seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", objArr);
            } catch (Exception unused) {
                format = String.format("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html?seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", TBErrorView.access$300(TBErrorView.this) + "," + TBErrorView.access$400(TBErrorView.this), str, name, "empty");
            }
            Nav.from(TBErrorView.this.getContext()).toUri(format);
        }
    }

    /* loaded from: classes9.dex */
    public class GoToNetworkDiagnosisListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String URI = "http://m.taobao.com/go/networkDiagnosis?nav_jump_mode=std_mega_pop&diagnosis_page_mode=half";
        private final String mUri;

        static {
            kge.a(-470318906);
            kge.a(-1201612728);
        }

        public GoToNetworkDiagnosisListener() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cornerRadius", String.valueOf(8.0f));
                str = URLEncoder.encode(jSONObject.toString(), "UTF-8");
            } catch (Exception unused) {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.mUri = URI;
                return;
            }
            this.mUri = "http://m.taobao.com/go/networkDiagnosis?nav_jump_mode=std_mega_pop&diagnosis_page_mode=half&stdpop_config%3D" + str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Nav.from(TBErrorView.this.getContext()).toUri(this.mUri);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        RefreshRestoreRunnable refreshRestoreRunnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        if (i != 0 && this.isInRefreshingState && (refreshRestoreRunnable = this.refreshRestoreRunnable) != null) {
            removeCallbacks(refreshRestoreRunnable);
            this.refreshRestoreRunnable.run();
        }
        super.setVisibility(i);
        if (i != 0 || this.hasReported) {
            return;
        }
        try {
            report();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void report() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
            return;
        }
        doReport(getContext(), this.mTitle, this.mSubTitle, this.mTopic, this.mError, "1");
        this.hasReported = true;
    }

    public static void doReport(String str, String str2, String str3, Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bd90c3", new Object[]{str, str2, str3, error});
        } else {
            doReport(str, str2, str3, (String) null, error, (String) null);
        }
    }

    public static void doReport(Context context, String str, String str2, String str3, Error error, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3dd711", new Object[]{context, str, str2, str3, error, str4});
            return;
        }
        String name = context != null ? context.getClass().getName() : "null";
        d a2 = c.a();
        if (a2 != null) {
            String a3 = a2.a("currActivityName", (String) null);
            String a4 = a2.a("currFragmentName", (String) null);
            if (a3 != null) {
                name = a3;
            }
            if (a4 != null) {
                name = name + "_" + a4;
            }
        }
        doReport(str, str2, name, str3, error, str4);
    }

    public static void doReport(String str, String str2, String str3, String str4, Error error, String str5) {
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c17e843", new Object[]{str, str2, str3, str4, error, str5});
            return;
        }
        String str7 = TextUtils.isEmpty(str3) ? "null" : str3;
        String str8 = (error == null || TextUtils.isEmpty(error.url)) ? "null" : error.url;
        String str9 = TextUtils.isEmpty(str) ? "null" : str;
        String str10 = TextUtils.isEmpty(str2) ? "null" : str2;
        String str11 = (error == null || TextUtils.isEmpty(error.apiName)) ? "null" : error.apiName;
        String str12 = (error == null || TextUtils.isEmpty(error.errorCode)) ? "null" : error.errorCode;
        String str13 = (error == null || TextUtils.isEmpty(error.mappingCode)) ? "null" : error.mappingCode;
        String valueOf = error != null ? String.valueOf(error.responseCode) : "0";
        String str14 = (error == null || TextUtils.isEmpty(error.errorMsg)) ? "null" : error.errorMsg;
        if (!isMonitorRegistered) {
            isMonitorRegistered = true;
            DimensionSet create = DimensionSet.create();
            String[] strArr = DEFAULT_DIMENSION_SET;
            str6 = "null";
            int i = 0;
            for (int length = strArr.length; i < length; length = length) {
                create.addDimension(strArr[i]);
                i++;
            }
            MeasureSet create2 = MeasureSet.create();
            String[] strArr2 = DEFAULT_MEASURE_SET;
            int i2 = 0;
            for (int length2 = strArr2.length; i2 < length2; length2 = length2) {
                create2.addMeasure(strArr2[i2]);
                i2++;
            }
            AppMonitor.register(MODULE_NAME, MONITOR_POINT, create2, create);
        } else {
            str6 = "null";
        }
        DimensionValueSet create3 = DimensionValueSet.create();
        create3.setValue("pageName", str7);
        create3.setValue("pageURL", str8);
        create3.setValue("title", str9);
        create3.setValue("subtitle", str10);
        create3.setValue("code", str12);
        create3.setValue(arz.KEY_MAPPING_CODE, str13);
        create3.setValue(ZimMessageChannel.K_RPC_RES_CODE, valueOf);
        create3.setValue("apiName", str11);
        create3.setValue("topic", TextUtils.isEmpty(str4) ? str6 : str4);
        create3.setValue("errorPageType", TextUtils.isEmpty(str5) ? str6 : str5);
        create3.setValue("message", str14);
        MeasureValueSet create4 = MeasureValueSet.create();
        create4.setValue("value", mto.a.GEO_NOT_SUPPORT);
        AppMonitor.Stat.commit(MODULE_NAME, MONITOR_POINT, create3, create4);
        r rVar = FalcoGlobalTracer.get();
        if (rVar == null) {
            return;
        }
        String str15 = (error == null || error.errorMsg == null) ? str6 : error.errorMsg;
        rVar.a("ErrorView", "ShowErrorView").c().a("show errorview:pageName=" + str7 + ",pageURL=" + str8 + ",content=" + str9 + "_" + str10 + "," + ag.ARG_ERROR_CODE + str12 + ",errorMsg=" + str15 + ",mappingCode=" + str13 + ",responseCode=" + valueOf);
        FalcoExceptionReporter o = rVar.o();
        if (o == null) {
            return;
        }
        o.a(str12).b(str15).c(str8).a(1).a();
    }

    private int getDefaultIconRes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("704f6f56", new Object[]{this})).intValue() : R.drawable.uik_sys_error_icon_v2;
    }

    private int getErrorIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c2246e5", new Object[]{this})).intValue() : R.drawable.uik_error_icon_v2;
    }

    private int getDefaultErrorTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a33c095", new Object[]{this})).intValue() : R.string.uik_default_error_title_v2;
    }

    private int getDefaultErrorSubTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59aea3cf", new Object[]{this})).intValue() : R.string.uik_default_error_subtitle_v2;
    }

    private int getNetworkErrorTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("38c161c2", new Object[]{this})).intValue() : R.string.uik_network_error_title_v2;
    }

    private int getNetworkErrorSubTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d45d782", new Object[]{this})).intValue() : R.string.uik_network_error_subtitle_v2;
    }

    public static void setNetworkDiagnosisEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabd2965", new Object[]{new Boolean(z)});
        } else {
            isNetworkDiagnosisEnable = z;
        }
    }

    static {
        kge.a(318256984);
        isMonitorRegistered = false;
        isNetworkDiagnosisEnable = false;
        DEFAULT_DIMENSION_SET = new String[]{"pageName", "url", "title", "subtitle", "code", arz.KEY_MAPPING_CODE, ZimMessageChannel.K_RPC_RES_CODE, "apiName", "topic", "errorPageType", "message"};
        DEFAULT_MEASURE_SET = new String[]{"value"};
    }

    /* loaded from: classes9.dex */
    public final class RefreshRestoreRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final CharSequence originSubtitle;
        private final CharSequence originTitle;

        static {
            kge.a(1781567068);
            kge.a(-1390502639);
        }

        public RefreshRestoreRunnable(CharSequence charSequence, CharSequence charSequence2) {
            this.originTitle = charSequence;
            this.originSubtitle = charSequence2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBErrorView.access$500(TBErrorView.this).setText(this.originTitle);
            TBErrorView.access$600(TBErrorView.this).setText(this.originSubtitle);
            if (TBErrorView.access$700(TBErrorView.this).getVisibility() == 0) {
                TBErrorView.access$700(TBErrorView.this).setAlpha(1.0f);
                TBErrorView.access$700(TBErrorView.this).setEnabled(true);
            }
            if (TBErrorView.access$800(TBErrorView.this).getVisibility() == 0) {
                TBErrorView.access$800(TBErrorView.this).setAlpha(1.0f);
                TBErrorView.access$800(TBErrorView.this).setEnabled(true);
            }
            if (TBErrorView.access$900(TBErrorView.this).getVisibility() == 0) {
                TBErrorView.access$900(TBErrorView.this).setAlpha(1.0f);
                TBErrorView.access$800(TBErrorView.this).setEnabled(true);
            }
            TBErrorView.access$1002(TBErrorView.this, false);
            TBErrorView.access$1102(TBErrorView.this, null);
        }
    }
}
