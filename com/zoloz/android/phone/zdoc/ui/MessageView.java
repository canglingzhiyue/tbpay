package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public class MessageView extends IMessageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SHOW_POWER_BY_ZOLOZ = 1;
    public View mBottomLayout;
    private TextView mBrandTextView;
    public TextView mCaptureTips;
    public View mConfirmPhoto;
    public TextView mConfirmTextView;
    public TextView mMainTextView;
    public ImageView mPressImageView;
    public View mRetakePhoto;
    private int mShowByZoloz;
    private boolean mShowPress;
    public TextView mTipsTextView;

    /* renamed from: com.zoloz.android.phone.zdoc.ui.MessageView$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24759a = new int[UIState.values().length];

        static {
            try {
                f24759a[UIState.CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24759a[UIState.USER_CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24759a[UIState.UPLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24759a[UIState.UPLOAD_END_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24759a[UIState.UPLOAD_END_FAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-1842894650);
    }

    public View getmBottomLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f28bbab5", new Object[]{this}) : this.mBottomLayout;
    }

    public MessageView(Context context) {
        super(context);
    }

    public MessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        LayoutInflater.from(context).inflate(getLayoutId(), (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MessageView);
        this.mShowPress = obtainStyledAttributes.getBoolean(R.styleable.MessageView_z_showPress, false);
        obtainStyledAttributes.recycle();
        this.mPressImageView = (ImageView) findViewById(R.id.btn_press);
        this.mRetakePhoto = findViewById(R.id.btn_X);
        this.mConfirmPhoto = findViewById(R.id.btn_ok);
        this.mBrandTextView = (TextView) findViewById(R.id.tv_branding);
        this.mMainTextView = (TextView) findViewById(R.id.tv_main_message);
        this.mConfirmTextView = (TextView) findViewById(R.id.tv_confirm_msg);
        this.mCaptureTips = (TextView) findViewById(R.id.zdoc_capture);
        this.mTipsTextView = (TextView) findViewById(R.id.remind_text);
        this.mBottomLayout = findViewById(R.id.message_opt_layout);
    }

    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue() : R.layout.layout_message;
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void updateUI(UIState uIState, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef022a6", new Object[]{this, uIState, new Integer(i), new Integer(i2)});
            return;
        }
        BioLog.i("updateUI " + uIState.name());
        this.mShowByZoloz = i;
        if (i == 1) {
            this.mBrandTextView.setVisibility(0);
        } else {
            this.mBrandTextView.setVisibility(8);
        }
        int i3 = AnonymousClass1.f24759a[uIState.ordinal()];
        if (i3 == 1) {
            if (this.mShowPress) {
                this.mPressImageView.setVisibility(0);
            }
            this.mMainTextView.setVisibility(8);
            this.mRetakePhoto.setVisibility(8);
            this.mConfirmPhoto.setVisibility(8);
            this.mConfirmTextView.setVisibility(8);
            this.mTipsTextView.setVisibility(0);
            this.mCaptureTips.setVisibility(0);
        } else if (i3 == 2) {
            this.mMainTextView.setVisibility(8);
            this.mPressImageView.setVisibility(8);
            this.mRetakePhoto.setVisibility(0);
            this.mConfirmPhoto.setVisibility(0);
            this.mConfirmTextView.setVisibility(0);
            this.mTipsTextView.setVisibility(8);
            this.mCaptureTips.setVisibility(8);
        } else if (i3 == 3) {
            this.mMainTextView.setText(a.b(getContext()));
            this.mMainTextView.setVisibility(0);
            this.mRetakePhoto.setVisibility(8);
            this.mConfirmPhoto.setVisibility(8);
            this.mPressImageView.setVisibility(8);
            this.mConfirmTextView.setVisibility(8);
            this.mTipsTextView.setVisibility(8);
            this.mCaptureTips.setVisibility(8);
        } else if (i3 == 4) {
            this.mMainTextView.setVisibility(0);
            this.mMainTextView.setText(a.c(getContext()));
            this.mConfirmTextView.setVisibility(8);
            this.mTipsTextView.setVisibility(8);
            this.mCaptureTips.setVisibility(8);
        } else if (i3 != 5) {
        } else {
            this.mMainTextView.setVisibility(8);
            this.mConfirmTextView.setVisibility(8);
            this.mTipsTextView.setVisibility(8);
            this.mCaptureTips.setVisibility(8);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void setOnConfirmListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e2177f", new Object[]{this, onClickListener});
        } else {
            this.mConfirmPhoto.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void setUiLocation(int i, String str, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe5009b", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        updateFooterLayout(i, i3, i4, i5);
        updateTipsView(i, str, i2, i3, i4, i5);
    }

    public void updateFooterLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c287d5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mBottomLayout.getLayoutParams();
        layoutParams.height = i4;
        this.mBottomLayout.setLayoutParams(layoutParams);
    }

    public void updateTipsView(int i, String str, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0454640", new Object[]{this, new Integer(i), str, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        ((RelativeLayout.LayoutParams) this.mTipsTextView.getLayoutParams()).bottomMargin = i4;
        this.mTipsTextView.setText(a.b(getContext(), i, str, i2));
        TextView textView = this.mCaptureTips;
        if (textView != null) {
            textView.setText(a.c(getContext(), 0, str, i2));
        }
        TextView textView2 = this.mConfirmTextView;
        if (textView2 == null) {
            return;
        }
        textView2.setText(a.c(getContext(), 1, str, i2));
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void setOnTakePhotoListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8734acb4", new Object[]{this, onClickListener});
        } else {
            this.mPressImageView.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void setOnReTakePhotoListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c16dc7", new Object[]{this, onClickListener});
        } else {
            this.mRetakePhoto.setOnClickListener(onClickListener);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void updateMessage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769a131e", new Object[]{this, new Integer(i)});
        } else {
            updateUI(UIState.CAPTURE, this.mShowByZoloz, i);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void clearClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a282a16", new Object[]{this});
            return;
        }
        this.mPressImageView.setOnClickListener(null);
        this.mConfirmPhoto.setOnClickListener(null);
        this.mRetakePhoto.setOnClickListener(null);
    }

    @Override // com.zoloz.android.phone.zdoc.ui.IMessageView
    public void updateMaskAlpha(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f58ab0", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = f * 255.0f;
        this.mTipsTextView.setAlpha(f2);
        this.mBottomLayout.setAlpha(f2);
    }
}
