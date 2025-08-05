package com.taobao.login4android.qrcode.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ali.user.mobile.utils.ImageUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class QrCodeView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mMaskBg;
    private ImageView mOpIcon;
    private TextView mOpText;
    private ImageView mSuccessIcon;
    private View refreshLL;

    static {
        kge.a(-1264782918);
    }

    public static /* synthetic */ Object ipc$super(QrCodeView qrCodeView, String str, Object... objArr) {
        if (str.hashCode() == -436676516) {
            super.onFinishInflate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public QrCodeView(Context context) {
        super(context);
    }

    public QrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QrCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f8d85c", new Object[]{this});
            return;
        }
        super.onFinishInflate();
        this.mOpIcon = (ImageView) findViewById(R.id.passport_ott_op_icon);
        this.mOpText = (TextView) findViewById(R.id.passport_ott_op_text);
        this.mMaskBg = findViewById(R.id.passport_ott_mask);
        this.refreshLL = findViewById(R.id.aliuser_qr_refresh);
        this.mSuccessIcon = (ImageView) findViewById(R.id.aliuser_success_icon);
    }

    public void setIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b5841", new Object[]{this, new Integer(i)});
            return;
        }
        ImageView imageView = this.mOpIcon;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    public void setIconColorFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f7859c", new Object[]{this, new Integer(i)});
            return;
        }
        ImageView imageView = this.mOpIcon;
        if (imageView == null) {
            return;
        }
        imageView.setColorFilter(getResources().getColor(i));
    }

    public void setText(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b13a00d", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mOpText;
        if (textView == null) {
            return;
        }
        textView.setText(i);
    }

    public void setQrCodeBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abd97e8", new Object[]{this, bitmap});
        } else {
            setBackground(new BitmapDrawable(bitmap));
        }
    }

    public void setQrCodeBitmapDrawable(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37869b9", new Object[]{this, bitmapDrawable});
        } else if (bitmapDrawable == null) {
        } else {
            setBackgroundDrawable(bitmapDrawable);
        }
    }

    public void startAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579958c9", new Object[]{this});
            return;
        }
        ImageView imageView = this.mOpIcon;
        if (imageView == null) {
            return;
        }
        imageView.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.passport_ott_rotate_inverse));
    }

    public void showPrompt(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00ea10c", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.mOpIcon;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.clearAnimation();
                this.mOpIcon.setVisibility(8);
            }
        }
        TextView textView = this.mOpText;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 8);
        }
        View view = this.mMaskBg;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        View view2 = this.refreshLL;
        if (view2 != null) {
            if (!z) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        ImageView imageView2 = this.mSuccessIcon;
        if (imageView2 == null || z) {
            return;
        }
        imageView2.setVisibility(8);
    }

    public void setTextVisible(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a74079", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mOpText;
        if (textView == null) {
            return;
        }
        textView.setVisibility(i);
    }

    public void setSuccessVisible(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a64a0b", new Object[]{this, new Integer(i)});
            return;
        }
        ImageView imageView = this.mSuccessIcon;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
        if (i != 0) {
            return;
        }
        ImageUtil.updateImage(this.mSuccessIcon, "https://gw.alicdn.com/imgextra/i1/O1CN01O57OMM1KUX8sYwjCx_!!6000000001167-2-tps-216-216.png");
    }
}
