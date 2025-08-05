package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.ResultReceiver;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseDataNew;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerConfig;
import com.taobao.alilive.aliliveframework.context.atmo.bean.StickerGroup;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.input.bean.LiveExpressionTabItem;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.LiveExpressionRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.MultiSlidingTabStripAType;
import com.taobao.android.live.plugin.atype.flexalocal.input.view.PasteEditText;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.ui.input.view.SyncQuestionLayout;
import com.taobao.taolive.room.utils.r;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ffg;
import tb.fht;
import tb.hfs;
import tb.hft;
import tb.hjt;
import tb.hju;
import tb.kge;
import tb.phg;
import tb.plx;
import tb.ply;
import tb.pmd;
import tb.pnj;
import tb.xkw;

/* loaded from: classes6.dex */
public abstract class AbsInputFrame2 extends BaseFrame implements View.OnClickListener, b, e, hfs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALL_BACK_TYPE_H5 = "H5";
    public static final String CALL_BACK_TYPE_WEEX = "WEEX";
    private static final String TAG = "AbsInputFrame2";
    public hft inputQuickCommentController;
    public String mCallbackType;
    public String mCommentType;
    public int mCurrentPos;
    private TBLiveDataModel mDataModel;
    public TUrlImageView mDeleteBtn;
    private View mEditBar;
    private View mEditSend;
    public PasteEditText mEditText;
    private boolean mEnableQuickExpression;
    private View mExpressionRootView;
    public ffg mIAtmosphereManager;
    public String mInputType;
    private boolean mIsHaveQuickExpression;
    private boolean mIsShowQuestionView;
    public int mKeyboardHeight;
    public long mLastSendTime;
    public int mLimitCnt;
    private fht mListener;
    public List<LiveExpressionRecyclerView> mLiveExpressionViewList;
    public hjt mPagerAdapter;
    private HorizontalScrollView mQuickCommBubbleScroll;
    public String mQuickCommentBubbleText;
    private hju mQuickExpressionAdapter;
    private FrameLayout mQuickFrameLayout;
    private RecyclerView mQuickRecyclerView;
    public String mRepliedCommentId;
    public String mRepliedCommentNick;
    public FrameLayout mStickerLayout;
    public SyncQuestionLayout mSyncQuestionLayout;
    public TUrlImageView mTVSwitch;
    public List<LiveExpressionTabItem> mTabItemList;
    public MultiSlidingTabStripAType mTabLayout;
    public int mUnEnableDeleteLimit;
    public ViewPager mViewPager;
    private boolean misHitNewExpressionAPI;
    private ViewStub parent;

    static {
        kge.a(-6164306);
        kge.a(-1201612728);
        kge.a(-1494005888);
        kge.a(730795771);
        kge.a(-598947811);
    }

    public static /* synthetic */ Object ipc$super(AbsInputFrame2 absInputFrame2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    public abstract void onEditTextSend(String str);

    public static /* synthetic */ void access$000(AbsInputFrame2 absInputFrame2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a78119c", new Object[]{absInputFrame2, new Boolean(z)});
        } else {
            absInputFrame2.startEditSendAnim(z);
        }
    }

    public static /* synthetic */ View access$100(AbsInputFrame2 absInputFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c62de2bb", new Object[]{absInputFrame2}) : absInputFrame2.mEditSend;
    }

    public static /* synthetic */ void access$200(AbsInputFrame2 absInputFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edaa53a", new Object[]{absInputFrame2});
        } else {
            absInputFrame2.switchSticker();
        }
    }

    public static /* synthetic */ void access$300(AbsInputFrame2 absInputFrame2, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e06daac", new Object[]{absInputFrame2, list});
        } else {
            absInputFrame2.initViewPager(list);
        }
    }

    public static /* synthetic */ void access$400(AbsInputFrame2 absInputFrame2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7d1847", new Object[]{absInputFrame2, new Integer(i)});
        } else {
            absInputFrame2.refreshCurrentPage(i);
        }
    }

    public static /* synthetic */ void access$500(AbsInputFrame2 absInputFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214620bd", new Object[]{absInputFrame2});
        } else {
            absInputFrame2.trackTabChange();
        }
    }

    public AbsInputFrame2(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mKeyboardHeight = 0;
        this.mCommentType = "normal";
        this.mListener = new fht() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fht
            public void a(List<AtmosphereResListResponseDataNew.TabInfo> list) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                } else {
                    AbsInputFrame2.access$300(AbsInputFrame2.this, list);
                }
            }
        };
        this.mLimitCnt = ply.ar();
        this.mEnableQuickExpression = ply.aq();
        this.misHitNewExpressionAPI = ply.av();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public boolean createView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f881d80", new Object[]{this, viewStub})).booleanValue();
        }
        this.parent = viewStub;
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_frame_input2_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.inputQuickCommentController = new hft(this);
        this.mSyncQuestionLayout = (SyncQuestionLayout) view.findViewById(R.id.taolive_input_sync_layout);
        this.mSyncQuestionLayout.setFrameContext(this.mFrameContext);
        this.mExpressionRootView = view.findViewById(R.id.taolive_emoji_room_view);
        this.mExpressionRootView.setOnClickListener(this);
        this.mEditBar = view.findViewById(R.id.taolive_edit_bar);
        ViewCompat.setElevation(this.mEditBar, 1.0f);
        this.mEditText = (PasteEditText) view.findViewById(R.id.taolive_edit_text);
        this.mEditText.setFrameContext(this.mFrameContext);
        this.mEditSend = view.findViewById(R.id.taolive_edit_send);
        this.mEditSend.setOnClickListener(this);
        this.mEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i2), keyEvent})).booleanValue();
                }
                if (keyEvent == null || keyEvent.getAction() == 0) {
                    AbsInputFrame2 absInputFrame2 = AbsInputFrame2.this;
                    absInputFrame2.onEditTextSend(absInputFrame2.mEditText.getText().toString());
                }
                return true;
            }
        });
        this.mQuickCommBubbleScroll = (HorizontalScrollView) view.findViewById(R.id.tailive_quick_comm_bubble);
        this.mEditText.addTextChangedListener(new TextWatcher() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i2), new Integer(i3), new Integer(i4)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i2), new Integer(i3), new Integer(i4)});
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    return;
                }
                boolean isEmpty = TextUtils.isEmpty(AbsInputFrame2.this.mEditText.getText());
                if (isEmpty) {
                    AbsInputFrame2.access$000(AbsInputFrame2.this, false);
                    AbsInputFrame2.this.mDeleteBtn.setEnabled(false);
                    AbsInputFrame2.this.mDeleteBtn.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01BXKtVz1JVA06Rbtga_!!6000000001033-2-tps-72-72.png");
                } else {
                    if (AbsInputFrame2.access$100(AbsInputFrame2.this).getVisibility() != 0) {
                        AbsInputFrame2.access$100(AbsInputFrame2.this).setVisibility(0);
                        AbsInputFrame2.access$000(AbsInputFrame2.this, true);
                    }
                    AbsInputFrame2.this.mDeleteBtn.setEnabled(true);
                    AbsInputFrame2.this.mDeleteBtn.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01YVjVRB1e64EZ03QiN_!!6000000003821-2-tps-72-72.png");
                }
                if (isEmpty || AbsInputFrame2.this.mEditText.getText().length() < AbsInputFrame2.this.mLimitCnt) {
                    return;
                }
                Context context = AbsInputFrame2.this.mContext;
                Context context2 = AbsInputFrame2.this.mContext;
                int i2 = R.string.taolive_chat_too_long_flexalocal;
                com.taobao.taolive.room.utils.d.a(context, context2.getString(i2, AbsInputFrame2.this.mLimitCnt + ""), 17);
            }
        });
        this.mEditText.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (AbsInputFrame2.this.mStickerLayout.getVisibility() != 0) {
                } else {
                    AbsInputFrame2.access$200(AbsInputFrame2.this);
                }
            }
        });
        this.mStickerLayout = (FrameLayout) view.findViewById(R.id.taolive_edit_sticker_layout);
        this.mStickerLayout.setOnClickListener(this);
        this.mDeleteBtn = (TUrlImageView) view.findViewById(R.id.taolive_edit_delete);
        this.mDeleteBtn.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01BXKtVz1JVA06Rbtga_!!6000000001033-2-tps-72-72.png");
        boolean z = this.misHitNewExpressionAPI;
        if (!z) {
            initViewPager(null);
        } else if (z && this.mFrameContext != null && (this.mFrameContext.I() instanceof ffg)) {
            initViewPager(((ffg) this.mFrameContext.I()).k());
        }
        int i2 = this.mKeyboardHeight;
        if (i2 > 0) {
            setStickerHeight(i2);
        }
        this.mTVSwitch = (TUrlImageView) view.findViewById(R.id.taolive_edit_switch);
        TUrlImageView tUrlImageView = this.mTVSwitch;
        if (!u.G()) {
            i = 8;
        }
        tUrlImageView.setVisibility(i);
        this.mTVSwitch.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    AbsInputFrame2.access$200(AbsInputFrame2.this);
                }
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                AbsInputFrame2.this.hideContentViewInner();
                AbsInputFrame2.this.hideKeyBoard();
                AbsInputFrame2.this.resetInputStatus();
                if (AbsInputFrame2.this.mFrameContext == null || AbsInputFrame2.this.mFrameContext.z() == null || !AbsInputFrame2.this.mFrameContext.z().M()) {
                    return;
                }
                AbsInputFrame2.this.mFrameContext.e().a(xkw.d, "assembly", AbsInputFrame2.this.mFrameContext.G());
            }
        });
        this.mTVSwitch.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01Yssk7o1CLobjwvbKO_!!6000000000065-2-tps-72-72.png");
        initQuickView(view);
        expendTouchArea(this.mTVSwitch, com.taobao.taolive.room.utils.d.a(this.mContext, 10.0f));
        setLayoutParamsAdaptiveLandScape();
        hft hftVar = this.inputQuickCommentController;
        if (hftVar == null) {
            return;
        }
        hftVar.a(this.mQuickCommBubbleScroll);
    }

    public void resetInputStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2879fd94", new Object[]{this});
            return;
        }
        PasteEditText pasteEditText = this.mEditText;
        if (pasteEditText != null) {
            pasteEditText.resetPasteText();
        }
        if (TextUtils.isEmpty(this.mRepliedCommentId) || TextUtils.isEmpty(this.mRepliedCommentNick)) {
            return;
        }
        this.mEditText.setText("");
        this.mEditText.setSelection(0);
        this.mRepliedCommentId = null;
        this.mRepliedCommentNick = null;
        this.mUnEnableDeleteLimit = 0;
    }

    private void initQuickView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec27fba9", new Object[]{this, view});
        } else if (!this.mEnableQuickExpression) {
        } else {
            this.mQuickFrameLayout = (FrameLayout) view.findViewById(R.id.taolive_input_quick_expression_fl);
            this.mQuickRecyclerView = (RecyclerView) view.findViewById(R.id.taolive_input_quick_expression);
            this.mQuickExpressionAdapter = new hju(this.mContext, isLandscape(), this, this.mFrameContext);
            this.mQuickRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
            this.mQuickRecyclerView.setAdapter(this.mQuickExpressionAdapter);
            this.mQuickRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass9 anonymousClass9, String str, Object... objArr) {
                    if (str.hashCode() == -1263079482) {
                        super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.support.v7.widget.RecyclerView.ItemDecoration
                public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view2, recyclerView, state});
                        return;
                    }
                    super.getItemOffsets(rect, view2, recyclerView, state);
                    if (recyclerView.getChildAdapterPosition(view2) == 0) {
                        rect.left = com.taobao.taolive.room.utils.d.a(AbsInputFrame2.this.mContext, 14.0f);
                    }
                    rect.right = com.taobao.taolive.room.utils.d.a(AbsInputFrame2.this.mContext, 22.0f);
                }
            });
        }
    }

    public static void expendTouchArea(final View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67cf5e6", new Object[]{view, new Integer(i)});
        } else if (view == null) {
        } else {
            final View view2 = (View) view.getParent();
            view2.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Rect rect = new Rect();
                    view.getHitRect(rect);
                    rect.left -= i;
                    rect.top -= i;
                    rect.right += i;
                    rect.bottom += i;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
            });
        }
    }

    private void startEditSendAnim(final boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a1d6e8", new Object[]{this, new Boolean(z)});
            return;
        }
        int a2 = com.taobao.taolive.room.utils.d.a(this.mContext, 54.0f);
        if (!z) {
            i2 = com.taobao.taolive.room.utils.d.a(this.mContext, 54.0f);
            i = 0;
        } else {
            i = a2;
            i2 = 0;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) AbsInputFrame2.access$100(AbsInputFrame2.this).getLayoutParams();
                layoutParams.width = intValue;
                q.a(AbsInputFrame2.TAG, "animation width：" + intValue);
                AbsInputFrame2.access$100(AbsInputFrame2.this).setLayoutParams(layoutParams);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.2
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
                } else if (z || AbsInputFrame2.access$100(AbsInputFrame2.this) == null) {
                } else {
                    AbsInputFrame2.access$100(AbsInputFrame2.this).setVisibility(8);
                }
            }
        });
        ofInt.setDuration(100L);
        ofInt.start();
    }

    private void initViewPager(final List<AtmosphereResListResponseDataNew.TabInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79177166", new Object[]{this, list});
            return;
        }
        FrameLayout frameLayout = this.mStickerLayout;
        View view = null;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            view = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_frame_input2_sticker_flexalocal, (ViewGroup) null);
            this.mStickerLayout.addView(view);
            this.mCurrentPos = 0;
        }
        if (view == null) {
            return;
        }
        this.mDeleteBtn = (TUrlImageView) view.findViewById(R.id.taolive_edit_delete);
        this.mDeleteBtn.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01BXKtVz1JVA06Rbtga_!!6000000001033-2-tps-72-72.png");
        q.b(TAG, "fix delete button problem");
        this.mDeleteBtn.setOnClickListener(this);
        this.mTabLayout = (MultiSlidingTabStripAType) view.findViewById(R.id.taolive_emoji_tab);
        this.mViewPager = (ViewPager) view.findViewById(R.id.taolive_emoji_viewpager);
        initViewPagerData(list);
        this.mPagerAdapter = new hjt(this.mLiveExpressionViewList, this.mTabItemList, this.mContext);
        this.mTabLayout.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.AbsInputFrame2.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                if (str.hashCode() == 407727923) {
                    super.onPageSelected(((Number) objArr[0]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                super.onPageSelected(i);
                plx.a(AbsInputFrame2.TAG, "onPageSelected:" + i);
                AbsInputFrame2.this.mCurrentPos = i;
                int i2 = 0;
                while (i2 < AbsInputFrame2.this.mPagerAdapter.getCount()) {
                    TUrlImageView tUrlImageView = (TUrlImageView) AbsInputFrame2.this.mPagerAdapter.a(i2).findViewById(R.id.taolive_expression_tab_image);
                    LiveExpressionTabItem liveExpressionTabItem = AbsInputFrame2.this.mTabItemList.get(i2);
                    List list2 = list;
                    if (list2 != null && list2.size() == AbsInputFrame2.this.mPagerAdapter.getCount()) {
                        AtmosphereResListResponseDataNew.TabInfo tabInfo = (AtmosphereResListResponseDataNew.TabInfo) list.get(i2);
                        AbsInputFrame2.this.mPagerAdapter.a(i2).setSelected(i2 == i);
                        str = i2 == i ? tabInfo.tabIcon : tabInfo.unTabIcon;
                    } else if (i2 == i) {
                        AbsInputFrame2.this.mPagerAdapter.a(i2).setSelected(true);
                        str = liveExpressionTabItem.resUrl;
                    } else {
                        AbsInputFrame2.this.mPagerAdapter.a(i2).setSelected(false);
                        str = liveExpressionTabItem.unselectedResUrl;
                    }
                    tUrlImageView.setImageUrl(str);
                    i2++;
                }
                AbsInputFrame2 absInputFrame2 = AbsInputFrame2.this;
                AbsInputFrame2.access$400(absInputFrame2, absInputFrame2.mCurrentPos);
                AbsInputFrame2.access$500(AbsInputFrame2.this);
            }
        });
        this.mViewPager.setAdapter(this.mPagerAdapter);
        this.mTabLayout.setViewPager(this.mViewPager);
        this.mViewPager.setCurrentItem(0);
        this.mPagerAdapter.a(0).setSelected(true);
        if (list != null && list.size() > 1) {
            int i = 0;
            while (i < this.mPagerAdapter.getCount()) {
                TUrlImageView tUrlImageView = (TUrlImageView) this.mPagerAdapter.a(i).findViewById(R.id.taolive_expression_tab_image);
                if (list != null && list.size() == this.mPagerAdapter.getCount()) {
                    AtmosphereResListResponseDataNew.TabInfo tabInfo = list.get(i);
                    this.mPagerAdapter.a(i).setSelected(i == this.mCurrentPos);
                    if (i == this.mCurrentPos) {
                        tUrlImageView.setImageUrl(tabInfo.tabIcon);
                    } else {
                        tUrlImageView.setImageUrl(tabInfo.unTabIcon);
                    }
                }
                i++;
            }
        } else {
            ((TUrlImageView) this.mPagerAdapter.a(1).findViewById(R.id.taolive_expression_tab_image)).setImageUrl(this.mTabItemList.get(1).unselectedResUrl);
        }
        for (int i2 = 0; i2 < this.mLiveExpressionViewList.size(); i2++) {
            refreshCurrentPage(i2);
        }
    }

    private void trackTabChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2191621", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tab", this.mCurrentPos == 0 ? ChatInputConstant.PANEL_ID_EMOJI : "longword");
        phg.a().a(this.mFrameContext, "Comment_Switch_EmoticonTab", (Map<String, String>) hashMap);
    }

    private void trackExpressionItemClick(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c626f34d", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tab", this.mCurrentPos == 0 ? ChatInputConstant.PANEL_ID_EMOJI : "longword");
        hashMap.put("module_name", str);
        hashMap.put("emoticon_id", str2);
        phg.a().a(this.mFrameContext, "Comment_Emoticon", (Map<String, String>) hashMap);
    }

    private void setLayoutParamsAdaptiveLandScape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a0b1a", new Object[]{this});
        } else if (!isLandscape()) {
        } else {
            this.mStickerLayout.setPadding(com.taobao.taolive.room.utils.d.a(this.mContext, 39.0f), 0, com.taobao.taolive.room.utils.d.a(this.mContext, 30.0f), 0);
            this.mQuickFrameLayout.setPadding(com.taobao.taolive.room.utils.d.a(this.mContext, 39.0f), 0, com.taobao.taolive.room.utils.d.a(this.mContext, 30.0f), 0);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mEditBar.getLayoutParams();
            layoutParams.leftMargin = com.taobao.taolive.room.utils.d.a(this.mContext, 51.0f);
            layoutParams.rightMargin = com.taobao.taolive.room.utils.d.a(this.mContext, 30.0f);
            this.mEditBar.setLayoutParams(layoutParams);
        }
    }

    private void initViewPagerData(List<AtmosphereResListResponseDataNew.TabInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f856530", new Object[]{this, list});
            return;
        }
        if (this.mTabItemList == null) {
            this.mTabItemList = new ArrayList();
        }
        this.mTabItemList.clear();
        if (this.mLiveExpressionViewList == null) {
            this.mLiveExpressionViewList = new ArrayList();
        }
        this.mLiveExpressionViewList.clear();
        if (this.misHitNewExpressionAPI && list != null) {
            for (AtmosphereResListResponseDataNew.TabInfo tabInfo : list) {
                LiveExpressionTabItem liveExpressionTabItem = new LiveExpressionTabItem();
                liveExpressionTabItem.selectedTabIcon = tabInfo.tabIcon;
                liveExpressionTabItem.unSelectedTabIcon = tabInfo.unTabIcon;
                this.mTabItemList.add(liveExpressionTabItem);
                LiveExpressionRecyclerView liveExpressionRecyclerView = new LiveExpressionRecyclerView(this.mContext, this, this.mFrameContext);
                liveExpressionRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
                this.mLiveExpressionViewList.add(liveExpressionRecyclerView);
            }
            return;
        }
        initDefaultTabData();
    }

    private void initDefaultTabData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cd5a15", new Object[]{this});
            return;
        }
        LiveExpressionTabItem liveExpressionTabItem = new LiveExpressionTabItem();
        liveExpressionTabItem.resUrl = "https://img.alicdn.com/imgextra/i2/O1CN01vEZsnV24a081u0P5K_!!6000000007406-2-tps-60-62.png";
        liveExpressionTabItem.unselectedResUrl = "https://img.alicdn.com/imgextra/i1/O1CN01DUTjtO1w0ih0IlVLO_!!6000000006246-2-tps-60-60.png";
        LiveExpressionTabItem liveExpressionTabItem2 = new LiveExpressionTabItem();
        liveExpressionTabItem2.resUrl = "https://img.alicdn.com/imgextra/i1/O1CN01IT05n927GiISz7V7f_!!6000000007770-2-tps-60-60.png";
        liveExpressionTabItem2.unselectedResUrl = "https://img.alicdn.com/imgextra/i1/O1CN01AqBhep1k0vTiF9cXX_!!6000000004622-2-tps-60-60.png";
        this.mTabItemList.add(liveExpressionTabItem);
        this.mTabItemList.add(liveExpressionTabItem2);
        LiveExpressionRecyclerView liveExpressionRecyclerView = new LiveExpressionRecyclerView(this.mContext, this, this.mFrameContext);
        liveExpressionRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        LiveExpressionRecyclerView liveExpressionRecyclerView2 = new LiveExpressionRecyclerView(this.mContext, this, this.mFrameContext);
        liveExpressionRecyclerView2.setLayoutManager(new LinearLayoutManager(this.mContext));
        this.mLiveExpressionViewList.add(liveExpressionRecyclerView);
        this.mLiveExpressionViewList.add(liveExpressionRecyclerView2);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mDataModel = tBLiveDataModel;
    }

    private void onDataReceivedReally(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc86af5", new Object[]{this, tBLiveDataModel});
            return;
        }
        if (this.mFrameContext != null && (this.mFrameContext.I() instanceof ffg)) {
            this.mIAtmosphereManager = (ffg) this.mFrameContext.I();
            this.mIAtmosphereManager.a(this.mListener);
        }
        this.mSyncQuestionLayout.setTBLiveDataModel(tBLiveDataModel);
        if (!this.mFrameContext.b && com.taobao.taolive.room.ui.input.view.a.a(tBLiveDataModel)) {
            this.mSyncQuestionLayout.setVisibility(0);
            this.mIsShowQuestionView = true;
            return;
        }
        this.mSyncQuestionLayout.setVisibility(8);
        this.mIsShowQuestionView = false;
    }

    private void switchSticker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f4cf70", new Object[]{this});
            return;
        }
        if (this.mStickerLayout.getVisibility() == 0) {
            if (this.mEnableQuickExpression) {
                this.mQuickFrameLayout.setVisibility(8);
            }
            showKeyBoard();
            this.mStickerLayout.setVisibility(4);
            this.mTVSwitch.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01Yssk7o1CLobjwvbKO_!!6000000000065-2-tps-72-72.png");
            refreshQuickExpression();
        } else {
            if (this.mEnableQuickExpression) {
                int i = this.mKeyboardHeight;
                if (i > 0 && this.mIsHaveQuickExpression) {
                    setStickerHeight(i + com.taobao.taolive.room.utils.d.a(this.mContext, 40.0f));
                }
                this.mQuickFrameLayout.setVisibility(8);
            }
            this.mStickerLayout.setVisibility(0);
            hideKeyBoard();
            this.mTVSwitch.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01aR5U9C206S70bD7E9_!!6000000006800-2-tps-72-72.png");
            refreshCurrentPage(this.mCurrentPos);
        }
        trackSwitchClick();
    }

    private void setStickerHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db43d91a", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.mStickerLayout.getLayoutParams();
        layoutParams.height = i;
        this.mStickerLayout.setLayoutParams(layoutParams);
    }

    public void refreshQuickExpression() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80bef391", new Object[]{this});
        } else if (!this.mEnableQuickExpression) {
        } else {
            int i = this.mKeyboardHeight;
            if (i > 0) {
                setStickerHeight(i);
            }
            if (this.mIsShowQuestionView) {
                return;
            }
            ViewPager viewPager = this.mViewPager;
            if (viewPager != null) {
                viewPager.setCurrentItem(0);
            }
            List<String> arrayList = new ArrayList<>();
            ffg ffgVar = this.mIAtmosphereManager;
            if (ffgVar != null) {
                arrayList = ffgVar.j();
            }
            this.mQuickExpressionAdapter.a(arrayList, this.mQuickFrameLayout);
            if (this.mQuickFrameLayout.getVisibility() == 0) {
                this.mIsHaveQuickExpression = true;
            } else {
                this.mIsHaveQuickExpression = false;
            }
        }
    }

    private void trackSwitchClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5233070", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        FrameLayout frameLayout = this.mStickerLayout;
        hashMap.put("name", (frameLayout == null || frameLayout.getVisibility() != 0) ? "input" : "emoticon");
        phg.a().a(this.mFrameContext, "Comment_Switch_InputPanel", (Map<String, String>) hashMap);
    }

    private void refreshCurrentPage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21e99af", new Object[]{this, new Integer(i)});
        } else if (this.misHitNewExpressionAPI) {
            List<List<StickerGroup>> arrayList = new ArrayList<>();
            ffg ffgVar = this.mIAtmosphereManager;
            if (ffgVar != null) {
                arrayList = ffgVar.b();
            }
            if (arrayList == null) {
                return;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i == i2) {
                    this.mLiveExpressionViewList.get(i2).refreshData(arrayList.get(i2), false);
                }
            }
        } else if (i == 0) {
            if (this.mIAtmosphereManager == null) {
                return;
            }
            this.mLiveExpressionViewList.get(0).refreshData(this.mIAtmosphereManager.g(), false);
        } else if (this.mIAtmosphereManager != null) {
            this.mLiveExpressionViewList.get(1).refreshData(this.mIAtmosphereManager.h(), true);
        }
    }

    public void showKeyBoard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b686b", new Object[]{this});
            return;
        }
        boolean a2 = r.a(this.mEditText, 0);
        pnj m = pmd.a().m();
        m.c(TAG, "show key board:" + a2);
        this.mFrameContext.e().a(xkw.EVENT_DISABLE_UBEE, null, this.mFrameContext == null ? null : this.mFrameContext.G());
        this.mSyncQuestionLayout.show();
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.b
    public void hideKeyBoard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60342b30", new Object[]{this});
            return;
        }
        r.a(this.mEditText, (ResultReceiver) null);
        this.mInputType = null;
        this.mLimitCnt = ply.ar();
        this.mFrameContext.e().a(xkw.EVENT_ENABLE_UBEE, null, this.mFrameContext == null ? null : this.mFrameContext.G());
    }

    public void hideContentViewInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ed6b21", new Object[]{this});
            return;
        }
        SyncQuestionLayout syncQuestionLayout = this.mSyncQuestionLayout;
        if (syncQuestionLayout != null) {
            syncQuestionLayout.hide();
        }
        if (getComponentView() != null) {
            getComponentView().setVisibility(4);
            if (!this.mFrameContext.z().u()) {
                this.mFrameContext.e().a("com.taobao.taolive.room.enable_updown_switch", null, this.mFrameContext.G());
            }
        }
        FrameLayout frameLayout = this.mStickerLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        TUrlImageView tUrlImageView = this.mTVSwitch;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01Yssk7o1CLobjwvbKO_!!6000000000065-2-tps-72-72.png");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.e
    public void onOfficialStickerSelected(StickerConfig stickerConfig, Drawable drawable, StickerGroup stickerGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40226d6", new Object[]{this, stickerConfig, drawable, stickerGroup, new Boolean(z)});
            return;
        }
        String str = stickerConfig.matchKey;
        if (this.mEditText == null || TextUtils.isEmpty(str) || drawable == null || drawable.getConstantState() == null) {
            return;
        }
        if (this.mEditText.getText().length() + str.length() > this.mLimitCnt) {
            Context context = this.mContext;
            Context context2 = this.mContext;
            int i = R.string.taolive_chat_too_long_flexalocal;
            com.taobao.taolive.room.utils.d.a(context, context2.getString(i, this.mLimitCnt + ""), 17);
            return;
        }
        Drawable newDrawable = drawable.getConstantState().newDrawable();
        SpannableString spannableString = new SpannableString(str);
        int a2 = com.taobao.taolive.room.utils.d.a(this.mContext, 14.0f);
        newDrawable.setBounds(0, 0, (newDrawable.getIntrinsicWidth() * a2) / newDrawable.getIntrinsicHeight(), a2);
        spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(newDrawable), 0, str.length(), 33);
        int selectionStart = this.mEditText.getSelectionStart();
        Editable text = this.mEditText.getText();
        if (text != null) {
            text.insert(selectionStart, spannableString);
        }
        ffg ffgVar = this.mIAtmosphereManager;
        if (ffgVar != null) {
            ffgVar.b(str);
            if (this.mEnableQuickExpression) {
                this.mIAtmosphereManager.a(str, true);
            }
        }
        if (z) {
            trackQuickExpressionClick(stickerConfig);
        } else if (stickerGroup != null) {
            trackExpressionItemClick(stickerGroup.type, stickerConfig.id);
        } else {
            trackExpressionItemClick("official_sticker", stickerConfig.id);
        }
    }

    private void trackQuickExpressionClick(StickerConfig stickerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cab335", new Object[]{this, stickerConfig});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("type", TextUtils.equals("1", stickerConfig.type) ? "longword" : ChatInputConstant.PANEL_ID_EMOJI);
            hashMap.put("emoticon_id", stickerConfig.id);
            phg.a().a(this.mFrameContext, "Comment_EmoticonConvenient", (Map<String, String>) hashMap);
        } catch (Exception e) {
            q.a(TAG, "trackQuickExpressionClick catch exception:" + e.getMessage());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.e
    public void onAnchorCustomStickerSelected(StickerConfig stickerConfig, Drawable drawable, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f411f6", new Object[]{this, stickerConfig, drawable, str, new Boolean(z)});
        } else if (this.mEditText == null || TextUtils.isEmpty(stickerConfig.matchKey) || drawable == null || drawable.getConstantState() == null) {
        } else {
            if (this.mEditText.getText().length() + stickerConfig.matchKey.length() > this.mLimitCnt) {
                Context context = this.mContext;
                Context context2 = this.mContext;
                int i = R.string.taolive_chat_too_long_flexalocal;
                com.taobao.taolive.room.utils.d.a(context, context2.getString(i, this.mLimitCnt + ""), 17);
                return;
            }
            Drawable newDrawable = drawable.getConstantState().newDrawable();
            SpannableString spannableString = new SpannableString(stickerConfig.matchKey);
            int a2 = com.taobao.taolive.room.utils.d.a(this.mContext, 14.0f);
            newDrawable.setBounds(0, 0, (newDrawable.getIntrinsicWidth() * a2) / newDrawable.getIntrinsicHeight(), a2);
            spannableString.setSpan(new com.taobao.taolive.room.ui.chat.view.c(newDrawable), 0, stickerConfig.matchKey.length(), 33);
            int selectionStart = this.mEditText.getSelectionStart();
            Editable text = this.mEditText.getText();
            if (text != null) {
                text.insert(selectionStart, spannableString);
            }
            ffg ffgVar = this.mIAtmosphereManager;
            if (ffgVar != null && this.mEnableQuickExpression) {
                ffgVar.a(stickerConfig.matchKey, true);
            }
            if (z) {
                trackQuickExpressionClick(stickerConfig);
            } else {
                trackExpressionItemClick(str, stickerConfig.id);
            }
        }
    }

    @Override // tb.hfs
    public void editQuickCommonBubbleText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc2bb98", new Object[]{this, str});
        } else if (this.mEditText == null || v.f(str)) {
        } else {
            int selectionStart = this.mEditText.getSelectionStart();
            Editable text = this.mEditText.getText();
            if (text != null) {
                text.insert(selectionStart, str);
            }
            this.mCommentType = hfs.COMMENT_TYPE_CONVENIENT;
            this.mQuickCommentBubbleText = str;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_edit_send) {
            onEditTextSend(this.mEditText.getText().toString());
        } else if (view.getId() != R.id.taolive_edit_delete) {
        } else {
            this.mEditText.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    public void initOnRequired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d766955", new Object[]{this});
        } else if (this.parent.getParent() == null) {
        } else {
            this.parent.setLayoutResource(getLayoutResId());
            this.mContainer = this.parent.inflate();
            onViewCreated(this.mContainer);
            onDataReceivedReally(this.mDataModel);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.b
    public void showContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409a8c7b", new Object[]{this, new Integer(i)});
            return;
        }
        initOnRequired();
        if (this.mFrameContext != null && this.mFrameContext.o() != null) {
            this.mFrameContext.o().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
            if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(this.mFrameContext.o().bizCode) && y.a(this.mContext)) {
                i -= com.taobao.taolive.room.utils.d.a(this.mContext, 48.0f);
            }
        }
        if (i != this.mKeyboardHeight) {
            this.mKeyboardHeight = i;
            if (this.mStickerLayout != null) {
                setStickerHeight(i);
            }
        }
        if (getComponentView() != null) {
            getComponentView().setVisibility(0);
            getComponentView().bringToFront();
            this.mFrameContext.e().a("com.taobao.taolive.room.disable_updown_switch", "input", this.mFrameContext.G());
        }
        if (this.mFrameContext == null || this.mFrameContext.o() == null) {
            return;
        }
        this.mFrameContext.o().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.b
    public void hideContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3262a3", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mStickerLayout;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            return;
        }
        hideContentViewInner();
    }
}
