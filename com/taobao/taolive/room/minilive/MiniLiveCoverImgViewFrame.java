package com.taobao.taolive.room.minilive;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import tb.ddw;
import tb.kge;

/* loaded from: classes8.dex */
public class MiniLiveCoverImgViewFrame extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AliUrlImageView coverImgView;
    public String frameContextUnique;
    private boolean mHasShown;
    private ViewGroup mLayout;

    static {
        kge.a(358207277);
    }

    public static /* synthetic */ Object ipc$super(MiniLiveCoverImgViewFrame miniLiveCoverImgViewFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    public static /* synthetic */ void access$000(MiniLiveCoverImgViewFrame miniLiveCoverImgViewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21a2d9", new Object[]{miniLiveCoverImgViewFrame});
        } else {
            miniLiveCoverImgViewFrame.clearCoverImg();
        }
    }

    public MiniLiveCoverImgViewFrame(Context context, boolean z, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, null, aVar);
        if (this.mFrameContext != null) {
            this.frameContextUnique = this.mFrameContext.G();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub == null) {
        } else {
            viewStub.setLayoutResource(R.layout.taolive_minlive_error);
            this.mContainer = viewStub.inflate();
            this.mLayout = (ViewGroup) this.mContainer;
            this.coverImgView = (AliUrlImageView) this.mContainer.findViewById(R.id.taolive_minilive_error_img);
            this.coverImgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mContainer = null;
        this.mHasShown = false;
    }

    public void show(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20d609ce", new Object[]{this, str});
            return;
        }
        super.show();
        if (this.mLayout != null && this.coverImgView == null) {
            this.coverImgView = new AliUrlImageView(this.mContext);
            this.mLayout.addView(this.coverImgView, new FrameLayout.LayoutParams(-1, -1));
        }
        AliUrlImageView aliUrlImageView = this.coverImgView;
        if (aliUrlImageView == null) {
            return;
        }
        aliUrlImageView.setAlpha(1.0f);
        this.coverImgView.setVisibility(0);
        this.coverImgView.setImageUrl(str);
        ddw.a().a("com.taobao.taolive.room.minilive.coverimg.show", null, this.frameContextUnique);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        ddw.a().a("com.taobao.taolive.room.minilive.coverimg.show", null, this.frameContextUnique);
        AliUrlImageView aliUrlImageView = this.coverImgView;
        if (aliUrlImageView == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aliUrlImageView, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(500L);
        ofFloat.start();
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.taolive.room.minilive.MiniLiveCoverImgViewFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    MiniLiveCoverImgViewFrame.access$000(MiniLiveCoverImgViewFrame.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    MiniLiveCoverImgViewFrame.access$000(MiniLiveCoverImgViewFrame.this);
                }
            }
        });
    }

    private void clearCoverImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d5d7a00", new Object[]{this});
            return;
        }
        AliUrlImageView aliUrlImageView = this.coverImgView;
        if (aliUrlImageView == null) {
            return;
        }
        aliUrlImageView.setVisibility(8);
        this.coverImgView.setImageUrl(null);
        ViewGroup viewGroup = this.mLayout;
        if (viewGroup != null) {
            viewGroup.removeView(this.coverImgView);
        }
        this.coverImgView = null;
    }
}
