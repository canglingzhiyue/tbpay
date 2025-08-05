package com.taobao.tao.export.flickbtn;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.c;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes8.dex */
public class FlickingShareButton extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean dxMode;
    private ValueAnimator flickAnim;
    private boolean flickAnimEnable;
    private TUrlImageView ivCustom;
    private c loadImgTask;
    public final b presenter;
    private TIconFontTextView tvNormal;

    static {
        kge.a(-1489222217);
    }

    public static /* synthetic */ Object ipc$super(FlickingShareButton flickingShareButton, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode != 1774009266) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.performClick());
        }
    }

    public static /* synthetic */ TUrlImageView access$000(FlickingShareButton flickingShareButton) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("6c3aa98d", new Object[]{flickingShareButton}) : flickingShareButton.ivCustom;
    }

    public static /* synthetic */ void access$100(FlickingShareButton flickingShareButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeaf32d0", new Object[]{flickingShareButton});
        } else {
            flickingShareButton.performAnimation();
        }
    }

    public static /* synthetic */ void access$200(FlickingShareButton flickingShareButton, TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00f63f7", new Object[]{flickingShareButton, tUrlImageView});
        } else {
            flickingShareButton.performAppearAnimation(tUrlImageView);
        }
    }

    public static /* synthetic */ void access$300(FlickingShareButton flickingShareButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101acc52", new Object[]{flickingShareButton});
        } else {
            flickingShareButton.performFlickingAnimation();
        }
    }

    public FlickingShareButton(Context context) {
        super(context);
        this.presenter = new b(this);
        this.flickAnimEnable = true;
        this.dxMode = false;
        init(context);
    }

    public FlickingShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.presenter = new b(this);
        this.flickAnimEnable = true;
        this.dxMode = false;
        init(context);
    }

    public FlickingShareButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.presenter = new b(this);
        this.flickAnimEnable = true;
        this.dxMode = false;
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.alishare_share_entrance, this);
        this.tvNormal = (TIconFontTextView) inflate.findViewById(R.id.tvNormal);
        this.ivCustom = (TUrlImageView) inflate.findViewById(R.id.ivCustom);
    }

    public void setIconSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c57c4c3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float min = Math.min(i, i2);
        if (min <= 0.0f) {
            min = 0.048f * getContext().getResources().getDisplayMetrics().widthPixels;
        }
        this.tvNormal.setTextSize(0, min);
    }

    public void setIconColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8584034", new Object[]{this, new Integer(i)});
        } else {
            this.tvNormal.setTextColor(i);
        }
    }

    public void setIconFont(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836545fb", new Object[]{this, str});
        } else {
            this.tvNormal.setText(str);
        }
    }

    public void setFlickAnimEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c7d4b0", new Object[]{this, new Boolean(z)});
        } else {
            this.flickAnimEnable = z;
        }
    }

    public void considerPostRequestData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6357a7", new Object[]{this});
        } else if (!this.presenter.d()) {
        } else {
            postDelayed(new Runnable() { // from class: com.taobao.tao.export.flickbtn.FlickingShareButton.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FlickingShareButton.this.presenter.e();
                    }
                }
            }, 1000L);
        }
    }

    public void setCustomImageAndPlayAnim(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af97a25", new Object[]{this, str});
        } else if (!this.flickAnimEnable) {
        } else {
            this.loadImgTask = com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.tao.export.flickbtn.FlickingShareButton.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() == null) {
                        return false;
                    }
                    FlickingShareButton.access$000(FlickingShareButton.this).setImageDrawable(succPhenixEvent.getDrawable());
                    FlickingShareButton.access$100(FlickingShareButton.this);
                    return false;
                }
            }).fetch();
        }
    }

    private void performAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdad4c2a", new Object[]{this});
            return;
        }
        generateFlickAnim();
        this.tvNormal.animate().scaleX(0.0f).scaleY(0.0f).setDuration(500L).withEndAction(new Runnable() { // from class: com.taobao.tao.export.flickbtn.FlickingShareButton.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FlickingShareButton flickingShareButton = FlickingShareButton.this;
                FlickingShareButton.access$200(flickingShareButton, FlickingShareButton.access$000(flickingShareButton));
            }
        }).start();
    }

    private void performAppearAnimation(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25b9fbb", new Object[]{this, tUrlImageView});
        } else {
            tUrlImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(500L).withEndAction(new Runnable() { // from class: com.taobao.tao.export.flickbtn.FlickingShareButton.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FlickingShareButton.access$300(FlickingShareButton.this);
                    }
                }
            }).start();
        }
    }

    private void performFlickingAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6844a73", new Object[]{this});
        } else if (this.flickAnim == null || !ViewCompat.isAttachedToWindow(this)) {
        } else {
            this.flickAnim.start();
        }
    }

    private void generateFlickAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ef6bce", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.flickAnim;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.flickAnim.cancel();
        }
        this.flickAnim = ValueAnimator.ofFloat(1.0f, 0.8f).setDuration(750L);
        this.flickAnim.setRepeatCount(-1);
        this.flickAnim.setRepeatMode(2);
        this.flickAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.export.flickbtn.FlickingShareButton.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                FlickingShareButton.access$000(FlickingShareButton.this).setScaleX(floatValue);
                FlickingShareButton.access$000(FlickingShareButton.this).setScaleY(floatValue);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.dxMode) {
            this.presenter.e();
        }
        ValueAnimator valueAnimator = this.flickAnim;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.removeAllUpdateListeners();
        this.flickAnim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.export.flickbtn.FlickingShareButton.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                    return;
                }
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                FlickingShareButton.access$000(FlickingShareButton.this).setScaleX(floatValue);
                FlickingShareButton.access$000(FlickingShareButton.this).setScaleY(floatValue);
            }
        });
        this.flickAnim.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.tvNormal.animate().cancel();
        this.ivCustom.animate().cancel();
        c cVar = this.loadImgTask;
        if (cVar != null) {
            cVar.b();
        }
        if (this.ivCustom.getDrawable() != null) {
            this.tvNormal.setScaleX(0.0f);
            this.tvNormal.setScaleY(0.0f);
            this.ivCustom.setScaleX(1.0f);
            this.ivCustom.setScaleY(1.0f);
        }
        ValueAnimator valueAnimator = this.flickAnim;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.removeAllUpdateListeners();
        this.flickAnim.cancel();
    }

    @Override // android.view.View
    public boolean performClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69bd3bb2", new Object[]{this})).booleanValue();
        }
        this.presenter.a();
        this.presenter.b();
        return super.performClick();
    }
}
