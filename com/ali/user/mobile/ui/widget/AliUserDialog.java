package com.ali.user.mobile.ui.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.utils.DeviceUtils;
import com.ali.user.mobile.utils.ScreenUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View mContentView;
    public Context mContext;
    private final String mMessage;
    private final boolean mMessageCenter;
    private final String mNegativeText;
    private final String mPositiveText;
    private final String mTitle;
    private final NegativeClickListener negativeClickListener;
    private final PositiveClickListener positiveClickListener;

    /* loaded from: classes2.dex */
    public interface NegativeClickListener {
        void onClick(View view);
    }

    /* loaded from: classes2.dex */
    public interface PositiveClickListener {
        void onClick(View view);
    }

    static {
        kge.a(2145767161);
    }

    public static /* synthetic */ Object ipc$super(AliUserDialog aliUserDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 2133689546) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onStart();
            return null;
        }
    }

    public static /* synthetic */ PositiveClickListener access$100(AliUserDialog aliUserDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PositiveClickListener) ipChange.ipc$dispatch("4f2ea949", new Object[]{aliUserDialog}) : aliUserDialog.positiveClickListener;
    }

    public static /* synthetic */ NegativeClickListener access$200(AliUserDialog aliUserDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NegativeClickListener) ipChange.ipc$dispatch("c4578924", new Object[]{aliUserDialog}) : aliUserDialog.negativeClickListener;
    }

    private AliUserDialog(Context context, String str, String str2, String str3, String str4, PositiveClickListener positiveClickListener, NegativeClickListener negativeClickListener, boolean z) {
        super(context, R.style.AliUserDialogTheme);
        this.mContext = context;
        this.mTitle = str;
        this.mMessage = str2;
        this.mPositiveText = str3;
        this.mNegativeText = str4;
        this.positiveClickListener = positiveClickListener;
        this.negativeClickListener = negativeClickListener;
        this.mMessageCenter = z;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.aliuser_dialog_layout);
        setCanceledOnTouchOutside(false);
        initView();
    }

    @Override // android.app.Dialog
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        try {
            if (DataProviderFactory.getDataProvider().isAdapterPadAndFold()) {
                DeviceUtils.adapterLoginDialogUIOnDevice(this.mContext, this, this.mContentView, 0.73f);
            } else {
                getWindow().setLayout((int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.73d), -2);
            }
        } catch (Throwable unused) {
        }
    }

    public static Builder Builder(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Builder) ipChange.ipc$dispatch("3a8f22e7", new Object[]{context}) : new Builder(context);
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mContentView = findViewById(R.id.aliuser_dialog_content);
        Button button = (Button) findViewById(R.id.aliuser_dialog_confirm);
        Button button2 = (Button) findViewById(R.id.aliuser_dialog_cancel);
        TextView textView = (TextView) findViewById(R.id.aliuser_dialog_title);
        TextView textView2 = (TextView) findViewById(R.id.aliuser_dialog_message);
        View findViewById = findViewById(R.id.aliuser_dialog_split);
        if (!TextUtils.isEmpty(this.mTitle)) {
            textView.setText(this.mTitle);
            textView.setVisibility(0);
            try {
                textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                textView.getPaint().setStrokeWidth(0.7f);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            textView.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.mMessage)) {
            textView2.setText(this.mMessage);
            textView2.setVisibility(0);
            if (!this.mMessageCenter) {
                textView2.setGravity(19);
            }
        } else {
            textView2.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.mPositiveText)) {
            button.setText(this.mPositiveText);
            button.setVisibility(0);
            button.setFocusable(false);
        } else {
            button.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.mNegativeText)) {
            button2.setText(this.mNegativeText);
            button2.setVisibility(0);
            button2.setFocusable(false);
        } else {
            button2.setVisibility(8);
        }
        if (this.positiveClickListener != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.ui.widget.AliUserDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        AliUserDialog.access$100(AliUserDialog.this).onClick(view);
                    }
                }
            });
        }
        if (this.negativeClickListener != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.ui.widget.AliUserDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        AliUserDialog.access$200(AliUserDialog.this).onClick(view);
                    }
                }
            });
        }
        if (!TextUtils.isEmpty(this.mPositiveText) && !TextUtils.isEmpty(this.mNegativeText)) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        scaleTextSize(button, button2, textView, textView2);
    }

    public AliUserDialog shown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUserDialog) ipChange.ipc$dispatch("53dd4c70", new Object[]{this});
        }
        show();
        return this;
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Context mContext;
        private String mMessage;
        private String mNegativeText;
        private NegativeClickListener mOnNegativeClickListener;
        private PositiveClickListener mPositiveClickListener;
        private String mPositiveText;
        private String mTitle;
        private boolean messageCenter;

        static {
            kge.a(527342800);
        }

        private Builder(Context context) {
            this.messageCenter = true;
            this.mContext = context;
        }

        public Builder setMessageCenter(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3fa7bc54", new Object[]{this, new Boolean(z)});
            }
            this.messageCenter = z;
            return this;
        }

        public Builder setTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("9dcaa208", new Object[]{this, str});
            }
            this.mTitle = str;
            return this;
        }

        public Builder setMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("a9a6a177", new Object[]{this, str});
            }
            this.mMessage = str;
            return this;
        }

        public Builder setOnPositiveClickListener(String str, PositiveClickListener positiveClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c6979917", new Object[]{this, str, positiveClickListener});
            }
            this.mPositiveText = str;
            this.mPositiveClickListener = positiveClickListener;
            return this;
        }

        public Builder setOnNegativeClickListener(String str, NegativeClickListener negativeClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("7d8acc8f", new Object[]{this, str, negativeClickListener});
            }
            this.mNegativeText = str;
            this.mOnNegativeClickListener = negativeClickListener;
            return this;
        }

        public AliUserDialog build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AliUserDialog) ipChange.ipc$dispatch("540a7fcd", new Object[]{this}) : new AliUserDialog(this.mContext, this.mTitle, this.mMessage, this.mPositiveText, this.mNegativeText, this.mPositiveClickListener, this.mOnNegativeClickListener, this.messageCenter);
        }
    }

    public static int getScaleSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fe22eba", new Object[]{new Integer(i)})).intValue();
        }
        if (!DataProviderFactory.getDataProvider().enableElder()) {
            return i;
        }
        if (i < 12) {
            return 15;
        }
        if (i >= 12 && i < 15) {
            return 18;
        }
        if (i >= 15 && i < 18) {
            return 21;
        }
        return (i < 18 || i >= 21) ? 30 : 24;
    }

    public static void scaleTextSize(TextView... textViewArr) {
        int pxTodip;
        int scaleSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1591374e", new Object[]{textViewArr});
        } else if (DataProviderFactory.getDataProvider().enableElder()) {
            for (TextView textView : textViewArr) {
                if (textView != null && (scaleSize = getScaleSize((pxTodip = ScreenUtil.pxTodip(DataProviderFactory.getApplicationContext(), textView.getTextSize())))) != pxTodip) {
                    textView.setTextSize(1, scaleSize);
                }
            }
        }
    }
}
