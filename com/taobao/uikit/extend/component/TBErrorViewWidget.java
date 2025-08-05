package com.taobao.uikit.extend.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.autosize.h;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.error.AbsErrorFilter;
import com.taobao.uikit.extend.component.error.DefaultErrorFilter;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.material.TBCircularProgressDrawable;
import com.taobao.uikit.extend.utils.NetUtil;
import java.net.URLEncoder;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class TBErrorViewWidget extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BIT_ENABLE_ALL = 7;
    public static final int BIT_ENABLE_FEEDBACK = 2;
    public static final int BIT_ENABLE_NETWORK_DIAGNOSIS = 1;
    public static final int BIT_ENABLE_NONE = 0;
    public static final int BIT_ENABLE_REFRESH = 4;
    private int mBitEnableButtons;
    private TBCircularProgressDrawable mCircularDrawable;
    private String mCustomTitle;
    private Error mError;
    private AbsErrorFilter mErrorFilter;
    private Button mFeedbackButton;
    private boolean mHasReported;
    private boolean mIsInRefreshingState;
    private boolean mNeedRefreshProgress;
    private Button mNetworkCheckButton;
    private LinearLayout mRefreshButton;
    private ImageView mRefreshCircularView;
    private RefreshRestoreRunnable mRefreshRestoreRunnable;
    private String mRefreshText;
    private TextView mRefreshTitleView;
    private String mRefreshingText;
    private Status mStatus;
    private TextView mTitleView;
    private String mTopic;

    /* renamed from: com.taobao.uikit.extend.component.TBErrorViewWidget$2  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$autosize$WindowType = new int[WindowType.values().length];

        static {
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$autosize$WindowType[WindowType.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public enum Status {
        STATUS_NETWORK_ERROR,
        STATUS_SYSTEM_ERROR,
        STATUS_QPS_LIMIT,
        STATUS_CUSTOM
    }

    static {
        kge.a(960732092);
    }

    public static /* synthetic */ Object ipc$super(TBErrorViewWidget tBErrorViewWidget, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$001(TBErrorViewWidget tBErrorViewWidget, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50202c96", new Object[]{tBErrorViewWidget, new Integer(i)});
        } else {
            super.setVisibility(i);
        }
    }

    public static /* synthetic */ LinearLayout access$1000(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("5633bff6", new Object[]{tBErrorViewWidget}) : tBErrorViewWidget.mRefreshButton;
    }

    public static /* synthetic */ boolean access$1102(TBErrorViewWidget tBErrorViewWidget, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36c8ad9c", new Object[]{tBErrorViewWidget, new Boolean(z)})).booleanValue();
        }
        tBErrorViewWidget.mIsInRefreshingState = z;
        return z;
    }

    public static /* synthetic */ RefreshRestoreRunnable access$1202(TBErrorViewWidget tBErrorViewWidget, RefreshRestoreRunnable refreshRestoreRunnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RefreshRestoreRunnable) ipChange.ipc$dispatch("a5cb597b", new Object[]{tBErrorViewWidget, refreshRestoreRunnable});
        }
        tBErrorViewWidget.mRefreshRestoreRunnable = refreshRestoreRunnable;
        return refreshRestoreRunnable;
    }

    public static /* synthetic */ Error access$300(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("ac662c42", new Object[]{tBErrorViewWidget}) : tBErrorViewWidget.mError;
    }

    public static /* synthetic */ TextView access$400(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("fc79e8de", new Object[]{tBErrorViewWidget}) : tBErrorViewWidget.mTitleView;
    }

    public static /* synthetic */ void access$500(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622f29c9", new Object[]{tBErrorViewWidget});
        } else {
            tBErrorViewWidget.updateUIForRefreshState();
        }
    }

    public static /* synthetic */ String access$600(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f7af478", new Object[]{tBErrorViewWidget}) : tBErrorViewWidget.mRefreshText;
    }

    public static /* synthetic */ TBCircularProgressDrawable access$700(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBCircularProgressDrawable) ipChange.ipc$dispatch("33b5334d", new Object[]{tBErrorViewWidget}) : tBErrorViewWidget.mCircularDrawable;
    }

    public static /* synthetic */ ImageView access$800(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("a913026a", new Object[]{tBErrorViewWidget}) : tBErrorViewWidget.mRefreshCircularView;
    }

    public static /* synthetic */ TextView access$900(TBErrorViewWidget tBErrorViewWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("6476c0b9", new Object[]{tBErrorViewWidget}) : tBErrorViewWidget.mRefreshTitleView;
    }

    public TBErrorViewWidget(Context context) {
        this(context, null, 0);
    }

    public TBErrorViewWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBErrorViewWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBitEnableButtons = 6;
        this.mCustomTitle = null;
        this.mNeedRefreshProgress = true;
        this.mRefreshText = null;
        this.mRefreshingText = null;
        this.mHasReported = false;
        this.mError = null;
        this.mTopic = null;
        this.mErrorFilter = null;
        this.mStatus = Status.STATUS_SYSTEM_ERROR;
        this.mIsInRefreshingState = false;
        this.mRefreshRestoreRunnable = null;
        this.mCircularDrawable = new TBCircularProgressDrawable(-1, 3.0f, true);
        this.mErrorFilter = new DefaultErrorFilter(getContext(), getResources().getString(R.string.uik_default_rule_v2));
        initErrorViewWidget(LayoutInflater.from(getContext()).inflate(R.layout.uik_error_view_widget, (ViewGroup) this, true));
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

    public void setError(Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4369955a", new Object[]{this, error});
        } else if (error == null) {
        } else {
            this.mError = error;
            updateInternalStatus(this.mStatus);
            updateErrorViewWidget();
            reportIfNotYet();
        }
    }

    public void setStatus(Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dee4f0", new Object[]{this, status});
        } else if (status == null) {
        } else {
            updateInternalStatus(status);
            updateErrorViewWidget();
        }
    }

    public void setCustomTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4faa076", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mCustomTitle = str;
            updateInternalStatus(this.mStatus);
            updateErrorViewWidget();
        }
    }

    public void setCustomEnableButtons(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc129d71", new Object[]{this, new Integer(i)});
            return;
        }
        this.mBitEnableButtons = i & 7;
        updateInternalStatus(this.mStatus);
        updateErrorViewWidget();
    }

    public void setRefreshButton(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40036347", new Object[]{this, onClickListener});
        } else {
            setRefreshButtonWithProgress(null, null, onClickListener);
        }
    }

    public void setRefreshButtonWithProgress(String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d66420", new Object[]{this, str, str2, onClickListener});
        } else {
            setCustomRefreshButton(true, str, str2, onClickListener);
        }
    }

    public void setRefreshButtonWithoutProgress(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5dfc45e", new Object[]{this, str, onClickListener});
        } else {
            setCustomRefreshButton(false, str, null, onClickListener);
        }
    }

    @Override // android.view.View
    public void setVisibility(final int i) {
        RefreshRestoreRunnable refreshRestoreRunnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        if (i != 0 && this.mIsInRefreshingState && (refreshRestoreRunnable = this.mRefreshRestoreRunnable) != null) {
            removeCallbacks(refreshRestoreRunnable);
            this.mRefreshRestoreRunnable.run();
        }
        if (i == 0) {
            setAlpha(0.0f);
            super.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
            reportIfNotYet();
            return;
        }
        setAlpha(1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.uikit.extend.component.TBErrorViewWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    TBErrorViewWidget.access$001(TBErrorViewWidget.this, i);
                }
            }
        });
        ofFloat2.start();
    }

    public static int getSuggestedWidth(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5053ca5", new Object[]{activity})).intValue();
        }
        WindowType b = h.a().b(activity);
        int a2 = h.a().a((Context) activity);
        int dp2px = a2 - dp2px(activity, 5.0f);
        int i = AnonymousClass2.$SwitchMap$com$taobao$android$autosize$WindowType[b.ordinal()];
        if (i == 1) {
            dp2px = 1000;
        } else if (i == 2) {
            dp2px = 1346;
        }
        return dp2px > 0 ? dp2px : a2;
    }

    public static int dp2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f)})).intValue() : (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    private void initErrorViewWidget(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9dec18a", new Object[]{this, view});
            return;
        }
        this.mTitleView = (TextView) view.findViewById(R.id.uik_error_widget_title);
        this.mNetworkCheckButton = (Button) view.findViewById(R.id.uik_error_widget_button_check);
        this.mFeedbackButton = (Button) view.findViewById(R.id.uik_error_widget_button_feedback);
        this.mRefreshButton = (LinearLayout) view.findViewById(R.id.uik_error_widget_button_refresh);
        this.mRefreshCircularView = (ImageView) view.findViewById(R.id.uik_error_widget_refresh_circular);
        this.mRefreshTitleView = (TextView) view.findViewById(R.id.uik_error_widget_refresh_text);
        this.mRefreshCircularView.setImageDrawable(this.mCircularDrawable);
        this.mNetworkCheckButton.setOnClickListener(new GoToNetworkDiagnosisListener());
        this.mFeedbackButton.setOnClickListener(new GoToReportListener());
        this.mRefreshButton.setOnClickListener(new GoToRefreshListener(null));
    }

    private String getRefreshText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cff0bcc7", new Object[]{this});
        }
        return !TextUtils.isEmpty(this.mRefreshText) ? this.mRefreshText : getContext().getString(R.string.uik_error_view_widget_refresh);
    }

    private void setCustomRefreshButton(boolean z, String str, String str2, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc69e12", new Object[]{this, new Boolean(z), str, str2, onClickListener});
            return;
        }
        this.mNeedRefreshProgress = z;
        this.mRefreshText = str;
        this.mRefreshingText = str2;
        if (onClickListener != null) {
            this.mRefreshButton.setOnClickListener(new GoToRefreshListener(onClickListener));
        }
        this.mRefreshTitleView.setText(getRefreshText());
    }

    private void updateInternalStatus(Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f753d034", new Object[]{this, status});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mStatus = Status.STATUS_NETWORK_ERROR;
        } else {
            this.mStatus = status;
            Error error = this.mError;
            if (error == null || error.errorCode == null) {
                return;
            }
            int filterIcon = this.mErrorFilter.filterIcon(this.mError);
            if (filterIcon == R.drawable.uik_error_icon_v2) {
                this.mStatus = Status.STATUS_NETWORK_ERROR;
            } else if (filterIcon == R.drawable.uik_limit_error_icon_v2) {
                this.mStatus = Status.STATUS_QPS_LIMIT;
            } else if (filterIcon != R.drawable.uik_sys_error_icon_v2) {
            } else {
                this.mStatus = Status.STATUS_SYSTEM_ERROR;
            }
        }
    }

    private void updateErrorViewWidget() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c48739ef", new Object[]{this});
        } else if (this.mStatus == Status.STATUS_CUSTOM) {
            String string = getContext().getString(R.string.uik_default_error_title_v2);
            if (!TextUtils.isEmpty(this.mCustomTitle)) {
                string = this.mCustomTitle;
            }
            this.mTitleView.setText(string);
            int i = this.mBitEnableButtons;
            if (i == 7) {
                updateButtonsVisibility(true, false, true);
            } else if (i == 0) {
                updateButtonsVisibility(false, false, false);
            } else {
                boolean z2 = (i & 1) > 0;
                boolean z3 = (this.mBitEnableButtons & 2) > 0;
                if ((this.mBitEnableButtons & 4) > 0) {
                    z = true;
                }
                updateButtonsVisibility(z2, z3, z);
            }
        } else if (this.mStatus == Status.STATUS_SYSTEM_ERROR) {
            this.mTitleView.setText(getContext().getString(R.string.uik_default_error_title_v2));
            updateButtonsVisibility(false, true, true);
        } else if (this.mStatus == Status.STATUS_NETWORK_ERROR) {
            this.mTitleView.setText(getContext().getString(R.string.uik_network_error_title_v2));
            updateButtonsVisibility(true, false, true);
        } else {
            this.mTitleView.setText(getContext().getString(R.string.uik_default_error_widget_title_qps));
            updateButtonsVisibility(false, false, true);
        }
    }

    private void updateButtonsVisibility(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        boolean z4 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae58b83", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        int i = 8;
        if (z) {
            this.mNetworkCheckButton.setVisibility(0);
        } else {
            this.mNetworkCheckButton.setVisibility(8);
        }
        if (z2) {
            this.mFeedbackButton.setVisibility(0);
        } else {
            this.mFeedbackButton.setVisibility(8);
        }
        if (z || z2 || z3) {
            z4 = false;
        }
        this.mRefreshCircularView.setVisibility(8);
        this.mRefreshTitleView.setText(getRefreshText());
        if (z3) {
            this.mRefreshButton.setVisibility(0);
            return;
        }
        LinearLayout linearLayout = this.mRefreshButton;
        if (z4) {
            i = 4;
        }
        linearLayout.setVisibility(i);
    }

    private void updateUIForRefreshState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef40689", new Object[]{this});
        } else if (!this.mNeedRefreshProgress) {
        } else {
            String string = getContext().getString(R.string.uik_error_view_widget_refreshing);
            if (!TextUtils.isEmpty(this.mRefreshingText)) {
                string = this.mRefreshingText;
            }
            this.mRefreshCircularView.setVisibility(0);
            this.mRefreshTitleView.setText(string);
            this.mRefreshButton.setEnabled(false);
            this.mIsInRefreshingState = true;
            this.mRefreshRestoreRunnable = new RefreshRestoreRunnable();
            postDelayed(this.mRefreshRestoreRunnable, 2000L);
            this.mCircularDrawable.start();
        }
    }

    private void reportIfNotYet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcab16d", new Object[]{this});
        } else if (this.mHasReported) {
        } else {
            this.mHasReported = true;
            TBErrorView.doReport(getContext(), this.mStatus.toString(), this.mTitleView.getText().toString(), this.mTopic, this.mError, "2");
        }
    }

    /* loaded from: classes9.dex */
    public final class GoToReportListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1761632371);
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
            if (TBErrorViewWidget.access$300(TBErrorViewWidget.this) != null && !TextUtils.isEmpty(TBErrorViewWidget.access$300(TBErrorViewWidget.this).errorCode)) {
                str = TBErrorViewWidget.access$300(TBErrorViewWidget.this).errorCode;
            }
            String name = TBErrorViewWidget.this.getContext().getClass().getName();
            try {
                Object[] objArr = new Object[4];
                objArr[0] = TBErrorViewWidget.access$400(TBErrorViewWidget.this).getText().toString();
                objArr[1] = str;
                objArr[2] = name;
                objArr[3] = TBErrorViewWidget.access$300(TBErrorViewWidget.this) != null ? URLEncoder.encode(TBErrorViewWidget.access$300(TBErrorViewWidget.this).toJSON(), "UTF-8") : "empty";
                format = String.format("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html?seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", objArr);
            } catch (Exception unused) {
                format = String.format("https://market.m.taobao.com/app/motu/emas-mpop-tucaobar/web/index.html?seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", TBErrorViewWidget.access$400(TBErrorViewWidget.this).getText().toString(), str, name, "empty");
            }
            Nav.from(TBErrorViewWidget.this.getContext()).toUri(format);
        }
    }

    /* loaded from: classes9.dex */
    public class GoToNetworkDiagnosisListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String URI = "http://m.taobao.com/go/networkDiagnosis?nav_jump_mode=std_mega_pop&diagnosis_page_mode=half";
        private final String mUri;

        static {
            kge.a(2081007330);
            kge.a(-1201612728);
        }

        public GoToNetworkDiagnosisListener() {
            String str;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cornerRadius", 8.0d);
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
                Nav.from(TBErrorViewWidget.this.getContext()).toUri(this.mUri);
            }
        }
    }

    /* loaded from: classes9.dex */
    public final class GoToRefreshListener implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final View.OnClickListener mActual;

        static {
            kge.a(1513236388);
            kge.a(-1201612728);
        }

        public GoToRefreshListener(View.OnClickListener onClickListener) {
            this.mActual = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBErrorViewWidget.access$500(TBErrorViewWidget.this);
            View.OnClickListener onClickListener = this.mActual;
            if (onClickListener == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }

    /* loaded from: classes9.dex */
    public final class RefreshRestoreRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1810921848);
            kge.a(-1390502639);
        }

        private RefreshRestoreRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String string = TBErrorViewWidget.this.getContext().getString(R.string.uik_error_view_widget_refresh);
            if (!TextUtils.isEmpty(TBErrorViewWidget.access$600(TBErrorViewWidget.this))) {
                string = TBErrorViewWidget.access$600(TBErrorViewWidget.this);
            }
            TBErrorViewWidget.access$700(TBErrorViewWidget.this).stop();
            TBErrorViewWidget.access$800(TBErrorViewWidget.this).setVisibility(8);
            TBErrorViewWidget.access$900(TBErrorViewWidget.this).setText(string);
            TBErrorViewWidget.access$1000(TBErrorViewWidget.this).setEnabled(true);
            TBErrorViewWidget.access$1102(TBErrorViewWidget.this, false);
            TBErrorViewWidget.access$1202(TBErrorViewWidget.this, null);
        }
    }
}
