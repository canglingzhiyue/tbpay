package com.taobao.android.detail.wrapper.ext.uikit;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.RoundCornerImageView;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.datasdk.protocol.image.a;
import com.taobao.android.trade.event.f;
import com.taobao.phenix.request.d;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import tb.emu;
import tb.enz;
import tb.epj;
import tb.epl;
import tb.epm;
import tb.epo;
import tb.eqb;
import tb.fpz;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class SkuBar extends LinearLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int ANIMATION_TIME;
    private final int COMMENT_MAX_LINE;
    private final int COMMENT_WIDTH_DP;
    private final int TRANSLATION_Y;
    private RoundCornerImageView avatar;
    private final int mAvatarHeight;
    private final int mAvatarWidth;
    private TextView mComment;
    private TextView mCommentCount;
    private Context mContext;
    private TextView mPropName;
    private RateNode.a mPropRate;
    private TextView mRightArrow;
    private LinearLayout mRootView;
    private Animator mRunningAnim;
    private com.taobao.android.detail.datasdk.model.datamodel.node.b nodeBundle;

    static {
        kge.a(-348954952);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(SkuBar skuBar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(SkuBar skuBar, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8985ae", new Object[]{skuBar, new Double(d), new Double(d2)});
        } else {
            skuBar.refreshPicSize(d, d2);
        }
    }

    public static /* synthetic */ void access$100(SkuBar skuBar, RateNode.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd83b86", new Object[]{skuBar, aVar});
        } else {
            skuBar.bindData(aVar);
        }
    }

    public SkuBar(Context context) {
        super(context);
        this.COMMENT_MAX_LINE = 2;
        this.COMMENT_WIDTH_DP = 150;
        this.TRANSLATION_Y = 350;
        this.ANIMATION_TIME = 200;
        this.mAvatarWidth = epo.b(32);
        this.mAvatarHeight = epo.b(32);
        this.mContext = context;
        initViews();
    }

    public SkuBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.COMMENT_MAX_LINE = 2;
        this.COMMENT_WIDTH_DP = 150;
        this.TRANSLATION_Y = 350;
        this.ANIMATION_TIME = 200;
        this.mAvatarWidth = epo.b(32);
        this.mAvatarHeight = epo.b(32);
        this.mContext = context;
        initViews();
    }

    public SkuBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.COMMENT_MAX_LINE = 2;
        this.COMMENT_WIDTH_DP = 150;
        this.TRANSLATION_Y = 350;
        this.ANIMATION_TIME = 200;
        this.mAvatarWidth = epo.b(32);
        this.mAvatarHeight = epo.b(32);
        this.mContext = context;
        initViews();
    }

    private void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.uikit.SkuBar");
        this.mRootView = (LinearLayout) LayoutInflater.from(this.mContext).inflate(R.layout.x_detail_main_gallery_sku_bar, this);
        this.avatar = (RoundCornerImageView) this.mRootView.findViewById(R.id.avatar);
        this.mComment = (TextView) this.mRootView.findViewById(R.id.comment);
        this.mCommentCount = (TextView) this.mRootView.findViewById(R.id.commentCount);
        this.mPropName = (TextView) this.mRootView.findViewById(R.id.propName);
        LinearLayout linearLayout = this.mRootView;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setOnClickListener(this);
    }

    public void setComment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c676e6e", new Object[]{this, str});
            return;
        }
        TextView textView = this.mComment;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    public void setCommentCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c05c83", new Object[]{this, str});
        } else if (str == null || str == null) {
        } else {
            this.mCommentCount.setText(str);
        }
    }

    public void setPropName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ab55a1", new Object[]{this, str});
            return;
        }
        TextView textView = this.mPropName;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    public void setAvatarUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef86a5", new Object[]{this, str});
            return;
        }
        loadImage(this.avatar, str, new epm(this.mAvatarWidth, this.mAvatarHeight), new com.taobao.android.detail.datasdk.protocol.image.b() { // from class: com.taobao.android.detail.wrapper.ext.uikit.SkuBar.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.datasdk.protocol.image.b
            public void onFailure(a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("15b99301", new Object[]{this, aVar});
                }
            }

            @Override // com.taobao.android.detail.datasdk.protocol.image.b
            public void onSuccess(a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a8e27a", new Object[]{this, aVar});
                } else if (aVar == null || aVar.b == null) {
                } else {
                    double intrinsicHeight = aVar.b.getIntrinsicHeight();
                    double intrinsicWidth = aVar.b.getIntrinsicWidth();
                    if (!c.c()) {
                        return;
                    }
                    SkuBar.access$000(SkuBar.this, intrinsicWidth, intrinsicHeight);
                }
            }
        }, new epl.a().b(R.drawable.detail_img_load_fail).c(ImageView.ScaleType.CENTER_CROP).a());
    }

    private void refreshPicSize(double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05ea3d7", new Object[]{this, new Double(d), new Double(d2)});
            return;
        }
        RoundCornerImageView roundCornerImageView = this.avatar;
        if (roundCornerImageView == null || d2 <= mto.a.GEO_NOT_SUPPORT || d <= mto.a.GEO_NOT_SUPPORT) {
            return;
        }
        roundCornerImageView.setLayoutParams(new LinearLayout.LayoutParams(this.mAvatarWidth, this.mAvatarHeight));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.avatar.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(this.mAvatarWidth, this.mAvatarHeight);
        } else {
            layoutParams.width = this.mAvatarWidth;
            layoutParams.height = this.mAvatarHeight;
        }
        layoutParams.leftMargin = epo.b(10);
        this.avatar.setLayoutParams(layoutParams);
    }

    private void loadImage(DetailImageView detailImageView, String str, epm epmVar, com.taobao.android.detail.datasdk.protocol.image.b bVar, epl eplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0fad452", new Object[]{this, detailImageView, str, epmVar, bVar, eplVar});
        } else if (detailImageView == null || StringUtils.isEmpty(str)) {
        } else {
            epl eplVar2 = null;
            if (eplVar != null) {
                eplVar2 = new epl.a().b(eplVar.a()).b(eplVar.e()).a(eplVar.c()).a(eplVar.d()).c(eplVar.b()).c(epmVar.f27510a).d(epmVar.b).a();
            }
            com.taobao.android.detail.datasdk.protocol.adapter.core.c b = epj.b();
            if (b == null) {
                return;
            }
            b.a(str, detailImageView, eplVar2, bVar);
        }
    }

    public void show(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6b9630", new Object[]{this, animatorListener});
            return;
        }
        float translationY = getTranslationY();
        cancelAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", translationY, -50.0f);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.setDuration(200L);
        this.mRunningAnim = ofFloat;
        ofFloat.start();
    }

    public void hide(Animator.AnimatorListener animatorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72d69a8b", new Object[]{this, animatorListener});
            return;
        }
        float translationY = getTranslationY();
        cancelAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", translationY, 350.0f);
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        this.mRunningAnim = ofFloat;
        ofFloat.setDuration(200L);
        ofFloat.start();
    }

    public void cancelAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5115b1", new Object[]{this});
            return;
        }
        RoundCornerImageView roundCornerImageView = this.avatar;
        if (roundCornerImageView == null) {
            return;
        }
        roundCornerImageView.clearAnimation();
    }

    public void updateData(final RateNode.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ac02bb", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (getTranslationY() > 0.0f) {
                show(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.wrapper.ext.uikit.SkuBar.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        }
                    }

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
                        } else {
                            SkuBar.access$100(SkuBar.this, aVar);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        } else {
                            SkuBar.this.hide(null);
                        }
                    }
                });
            } else {
                hide(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.wrapper.ext.uikit.SkuBar.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        }
                    }

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
                            return;
                        }
                        SkuBar.access$100(SkuBar.this, aVar);
                        SkuBar.this.show(null);
                    }
                });
            }
        }
    }

    private void bindData(RateNode.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d585c6c7", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            setPropRate(aVar);
            if (!StringUtils.isEmpty(aVar.c)) {
                this.mComment.setVisibility(0);
                setComment(aVar.c);
            } else {
                this.mComment.setVisibility(4);
            }
            if (!StringUtils.isEmpty(aVar.d)) {
                this.mCommentCount.setVisibility(0);
                this.mCommentCount.setText(aVar.d);
            } else {
                this.mCommentCount.setVisibility(4);
            }
            if (!StringUtils.isEmpty(aVar.f9994a)) {
                this.mPropName.setVisibility(0);
                this.mPropName.setText(aVar.f9994a);
            } else {
                this.mPropName.setVisibility(4);
            }
            if (!StringUtils.isEmpty(aVar.b)) {
                setAvatarUrl(aVar.b);
            } else {
                setAvatarUrl(d.a(R.drawable.taodetail_avatar_new));
            }
        }
    }

    public RateNode.a getPropRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RateNode.a) ipChange.ipc$dispatch("4ae8eaa5", new Object[]{this}) : this.mPropRate;
    }

    public void setPropRate(RateNode.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48234929", new Object[]{this, aVar});
        } else {
            this.mPropRate = aVar;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        UT_SkubarClick();
        enz enzVar = new enz();
        try {
            enzVar.d = Long.parseLong(this.mPropRate.f);
            enzVar.c = this.mPropRate.g;
            enzVar.f = 3;
        } catch (Exception e) {
            e.printStackTrace();
        }
        f.a(fpz.c(this.mContext), enzVar);
    }

    public void UT_SkubarClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a3c319", new Object[]{this});
        } else if (this.nodeBundle == null) {
        } else {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("Page_Detail_Button-SKUComments");
            uTCustomHitBuilder.setEventPage("Page_Detail");
            uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_EVENT_ID, "2101");
            String str = eqb.c(this.nodeBundle).itemId;
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            uTCustomHitBuilder.setProperty("item_id", str);
            String str2 = eqb.d(this.nodeBundle).userId;
            if (StringUtils.isEmpty(str2)) {
                str2 = "";
            }
            uTCustomHitBuilder.setProperty("seller_id", str2);
            uTCustomHitBuilder.setProperty("args", "a2141.7631564.SKUComments");
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        }
    }

    public void setNodeBundle(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52e6f07", new Object[]{this, bVar});
        } else {
            this.nodeBundle = bVar;
        }
    }
}
