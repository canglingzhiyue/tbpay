package com.taobao.homepage.view.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.error.AbsErrorFilter;
import com.taobao.uikit.extend.component.error.DefaultErrorFilter;
import com.taobao.uikit.extend.component.error.Error;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.extend.utils.NetUtil;
import java.net.URLEncoder;
import tb.arz;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class CustomErrorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String[] DEFAULT_DIMENSION_SET;
    private static final String[] DEFAULT_MEASURE_SET;
    private static final String MODULE_NAME = "TBErrorView";
    private static final String MONITOR_POINT = "show_error";
    private static boolean isMonitorRegistered;
    private static boolean isNetworkDiagnosisEnable;
    private boolean hasReported;
    private Error mError;
    private AbsErrorFilter mErrorFilter;
    private TextView mErrorInfoTextView;
    private int mIconRes;
    private String mIconString;
    private TUrlImageView mIconView;
    private boolean mIsNotShowNetworkDiagnosisView;
    private Button mLeftButton;
    private TextView mNetworkDiagnosisTextView;
    private Button mRightButton;
    private Status mStatus;
    private String mSubTitle;
    private TextView mSubTitleView;
    private String mTitle;
    private TextView mTitleView;

    /* renamed from: com.taobao.homepage.view.widgets.CustomErrorView$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17333a = new int[ButtonType.values().length];

        static {
            try {
                f17333a[ButtonType.BUTTON_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17333a[ButtonType.BUTTON_POSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17333a[ButtonType.BUTTON_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17333a[ButtonType.BUTTON_NAGTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum ButtonType {
        BUTTON_LEFT,
        BUTTON_RIGHT,
        BUTTON_POSITIVE,
        BUTTON_NAGTIVE
    }

    /* loaded from: classes7.dex */
    public enum Status {
        STATUS_ERROR,
        STATUS_EMPTY
    }

    public static /* synthetic */ Object ipc$super(CustomErrorView customErrorView, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Error access$200(CustomErrorView customErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("30e51f7f", new Object[]{customErrorView}) : customErrorView.mError;
    }

    public static /* synthetic */ String access$300(CustomErrorView customErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da03a5b7", new Object[]{customErrorView}) : customErrorView.mTitle;
    }

    public static /* synthetic */ String access$400(CustomErrorView customErrorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4749ed6", new Object[]{customErrorView}) : customErrorView.mSubTitle;
    }

    public CustomErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.mIconRes = -1;
        this.mStatus = Status.STATUS_ERROR;
        this.hasReported = false;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TBErrorView, i, 0)) != null) {
            this.mIconString = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorIcon);
            this.mTitle = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorTitle);
            this.mSubTitle = obtainStyledAttributes.getString(R.styleable.TBErrorView_uik_errorSubTitle);
            obtainStyledAttributes.recycle();
        }
        this.mErrorFilter = new DefaultErrorFilter(getContext(), getResources().getString(R.string.uik_default_rule));
        initErrorView(LayoutInflater.from(getContext()).inflate(R.layout.uik_error, (ViewGroup) this, true));
    }

    public CustomErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomErrorView(Context context) {
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
        this.mLeftButton = (Button) findViewById(R.id.uik_errorButtonPos);
        this.mRightButton = (Button) findViewById(R.id.uik_errorButtonNag);
        this.mErrorInfoTextView = (TextView) findViewById(R.id.uik_mapping_code);
        this.mRightButton.setOnClickListener(new b(this, null));
        this.mNetworkDiagnosisTextView = (TextView) findViewById(R.id.uik_network_diagnosis);
        this.mNetworkDiagnosisTextView.getPaint().setFlags(8);
        this.mNetworkDiagnosisTextView.getPaint().setAntiAlias(true);
        this.mNetworkDiagnosisTextView.setOnClickListener(new a(this, null));
    }

    private void updateErrorView() {
        Error error;
        Error error2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2d88b", new Object[]{this});
            return;
        }
        if (this.mStatus == Status.STATUS_ERROR) {
            if (this.mIconRes < 0) {
                if (!StringUtils.isEmpty(this.mIconString)) {
                    this.mIconView.setPlaceHoldForeground(null);
                    this.mIconView.setImageUrl(this.mIconString);
                } else {
                    this.mIconRes = R.drawable.uik_sys_error_icon;
                    this.mIconView.setPlaceHoldForeground(ContextCompat.getDrawable(getContext(), this.mIconRes));
                    this.mIconView.setImageUrl(null);
                }
            } else {
                this.mIconView.setPlaceHoldForeground(ContextCompat.getDrawable(getContext(), this.mIconRes));
                this.mIconView.setImageUrl(null);
            }
        } else if (this.mStatus == Status.STATUS_EMPTY) {
            if (this.mIconRes < 0) {
                if (!StringUtils.isEmpty(this.mIconString)) {
                    this.mIconView.setPlaceHoldForeground(null);
                    this.mIconView.setImageUrl(this.mIconString);
                } else {
                    this.mIconRes = R.drawable.uik_sys_error_icon;
                    this.mIconView.setPlaceHoldForeground(ContextCompat.getDrawable(getContext(), this.mIconRes));
                    this.mIconView.setImageUrl(null);
                }
            } else {
                this.mIconView.setPlaceHoldForeground(ContextCompat.getDrawable(getContext(), this.mIconRes));
                this.mIconView.setImageUrl(null);
            }
        }
        if (StringUtils.isEmpty(this.mTitle)) {
            if (this.mStatus == Status.STATUS_EMPTY) {
                this.mTitle = getContext().getString(R.string.uik_default_empty_title);
            } else {
                this.mTitle = getContext().getString(R.string.uik_default_error_title);
            }
        }
        this.mTitleView.setText(this.mTitle);
        if (StringUtils.isEmpty(this.mSubTitle)) {
            if (this.mStatus == Status.STATUS_EMPTY) {
                this.mSubTitle = getContext().getString(R.string.uik_default_empty_subtitle);
            } else {
                Error error3 = this.mError;
                if (error3 != null && !StringUtils.isEmpty(error3.errorMsg)) {
                    this.mSubTitle = this.mError.errorMsg;
                } else {
                    this.mSubTitle = getContext().getString(R.string.uik_default_error_subtitle);
                }
            }
        }
        this.mSubTitleView.setText(this.mSubTitle);
        if (this.mStatus == Status.STATUS_ERROR && (error2 = this.mError) != null) {
            if (!StringUtils.isEmpty(error2.errorCode) || !StringUtils.isEmpty(this.mError.mappingCode)) {
                this.mErrorInfoTextView.setVisibility(0);
                this.mErrorInfoTextView.setText(StringUtils.isEmpty(this.mError.mappingCode) ? this.mError.errorCode : this.mError.mappingCode);
            } else {
                this.mErrorInfoTextView.setVisibility(4);
            }
        } else if (this.mStatus == Status.STATUS_EMPTY) {
            this.mRightButton.setVisibility(8);
            this.mErrorInfoTextView.setVisibility(4);
        }
        if (!this.mIsNotShowNetworkDiagnosisView && isNetworkDiagnosisEnable && (((error = this.mError) != null && this.mErrorFilter.isNetworkError(error.errorCode)) || !NetUtil.isNetworkConnected(getContext()))) {
            this.mNetworkDiagnosisTextView.setVisibility(0);
        }
        invalidate();
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

    public void setTitle(CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909cf0b3", new Object[]{this, charSequence, new Boolean(z)});
        } else if (charSequence == null) {
        } else {
            this.mTitle = charSequence.toString();
            if (z && !this.mTitle.isEmpty()) {
                filterTitle();
            }
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

    public void setSubTitle(CharSequence charSequence, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9c43cf", new Object[]{this, charSequence, new Boolean(z)});
        } else if (charSequence == null) {
        } else {
            this.mSubTitle = charSequence.toString();
            if (z && !this.mSubTitle.isEmpty()) {
                filterTitle();
            }
            updateErrorView();
        }
    }

    public void setButton(ButtonType buttonType, CharSequence charSequence, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2876e11f", new Object[]{this, buttonType, charSequence, onClickListener});
            return;
        }
        Button button = null;
        int i2 = AnonymousClass1.f17333a[buttonType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            button = this.mLeftButton;
        }
        if (button == null) {
            return;
        }
        button.setText(charSequence);
        button.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public void setButtonVisibility(ButtonType buttonType, int i) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd62353f", new Object[]{this, buttonType, new Integer(i)});
            return;
        }
        int i2 = AnonymousClass1.f17333a[buttonType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            Button button2 = this.mLeftButton;
            if (button2 == null) {
                return;
            }
            button2.setVisibility(i);
        } else if ((i2 != 3 && i2 != 4) || (button = this.mRightButton) == null) {
        } else {
            button.setVisibility(i);
        }
    }

    private void filterSubTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e9d017", new Object[]{this});
        } else if (!NetUtil.isNetworkConnected(getContext())) {
            this.mSubTitle = getContext().getString(R.string.uik_network_error_subtitle);
        } else if (this.mStatus == Status.STATUS_EMPTY && StringUtils.isEmpty(this.mSubTitle)) {
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
            this.mTitle = getContext().getString(R.string.uik_network_error_title);
        } else if (this.mStatus == Status.STATUS_EMPTY && StringUtils.isEmpty(this.mTitle)) {
            this.mTitle = getContext().getString(R.string.uik_default_empty_title);
        } else if (this.mError == null || this.mStatus != Status.STATUS_ERROR) {
        } else {
            this.mTitle = this.mErrorFilter.filterTitle(this.mError, this.mTitle);
        }
    }

    /* loaded from: classes7.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-432670193);
            kge.a(-1201612728);
        }

        private b() {
        }

        public /* synthetic */ b(CustomErrorView customErrorView, AnonymousClass1 anonymousClass1) {
            this();
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
            if (CustomErrorView.access$200(CustomErrorView.this) != null && !StringUtils.isEmpty(CustomErrorView.access$200(CustomErrorView.this).errorCode)) {
                str = CustomErrorView.access$200(CustomErrorView.this).errorCode;
            }
            String name = CustomErrorView.this.getContext().getClass().getName();
            try {
                Object[] objArr = new Object[4];
                objArr[0] = CustomErrorView.access$300(CustomErrorView.this) + "," + CustomErrorView.access$400(CustomErrorView.this);
                objArr[1] = str;
                objArr[2] = name;
                objArr[3] = CustomErrorView.access$200(CustomErrorView.this) != null ? URLEncoder.encode(CustomErrorView.access$200(CustomErrorView.this).toJSON(), "UTF-8") : "empty";
                format = String.format("https://market.m.taobao.com/markets/client/feedback_detail?wh_weex=true&seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", objArr);
            } catch (Exception unused) {
                format = String.format("https://market.m.taobao.com/markets/client/feedback_detail?wh_weex=true&seCate=BUG&cont=%1s&errCode=%2s&fromPage=%3s&error=%4s", CustomErrorView.access$300(CustomErrorView.this) + "," + CustomErrorView.access$400(CustomErrorView.this), str, name, "empty");
            }
            Nav.from(CustomErrorView.this.getContext()).toUri(format);
        }
    }

    /* loaded from: classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(623963518);
            kge.a(-1201612728);
        }

        private a() {
        }

        public /* synthetic */ a(CustomErrorView customErrorView, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                Nav.from(CustomErrorView.this.getContext()).toUri("http://m.taobao.com/go/networkDiagnosis");
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
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
        doReport(this.mTitle, this.mSubTitle, getContext() != null ? getContext().getClass().getName() : "null", this.mError);
        this.hasReported = true;
    }

    public static void doReport(String str, String str2, String str3, Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bd90c3", new Object[]{str, str2, str3, error});
            return;
        }
        String str4 = "null";
        String str5 = (error == null || StringUtils.isEmpty(error.url)) ? str4 : error.url;
        String str6 = (error == null || StringUtils.isEmpty(error.apiName)) ? str4 : error.apiName;
        String str7 = (error == null || StringUtils.isEmpty(error.errorCode)) ? str4 : error.errorCode;
        String str8 = (error == null || StringUtils.isEmpty(error.mappingCode)) ? str4 : error.mappingCode;
        String valueOf = error != null ? String.valueOf(error.responseCode) : "0";
        if (!isMonitorRegistered) {
            isMonitorRegistered = true;
            DimensionSet create = DimensionSet.create();
            for (String str9 : DEFAULT_DIMENSION_SET) {
                create.addDimension(str9);
            }
            MeasureSet create2 = MeasureSet.create();
            for (String str10 : DEFAULT_MEASURE_SET) {
                create2.addMeasure(str10);
            }
            AppMonitor.register(MODULE_NAME, MONITOR_POINT, create2, create);
        }
        DimensionValueSet create3 = DimensionValueSet.create();
        create3.setValue("pageName", StringUtils.isEmpty(str3) ? str4 : str3);
        create3.setValue("pageURL", str5);
        create3.setValue("title", StringUtils.isEmpty(str) ? str4 : str);
        if (!StringUtils.isEmpty(str2)) {
            str4 = str2;
        }
        create3.setValue("subtitle", str4);
        create3.setValue("code", str7);
        create3.setValue(arz.KEY_MAPPING_CODE, str8);
        create3.setValue(ZimMessageChannel.K_RPC_RES_CODE, valueOf);
        create3.setValue("apiName", str6);
        MeasureValueSet create4 = MeasureValueSet.create();
        create4.setValue("value", mto.a.GEO_NOT_SUPPORT);
        AppMonitor.Stat.commit(MODULE_NAME, MONITOR_POINT, create3, create4);
    }

    static {
        kge.a(893259680);
        isMonitorRegistered = false;
        isNetworkDiagnosisEnable = false;
        DEFAULT_DIMENSION_SET = new String[]{"pageName", "url", "title", "subtitle", "code", arz.KEY_MAPPING_CODE, ZimMessageChannel.K_RPC_RES_CODE, "apiName"};
        DEFAULT_MEASURE_SET = new String[]{"value"};
    }
}
