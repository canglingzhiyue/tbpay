package com.taobao.taolive.uikit.api;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.Pools;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.live.ubee.utils.j;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.prc;
import tb.pro;
import tb.pru;

/* loaded from: classes8.dex */
public class TBLiveMessageRealView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler handler;
    private int index;
    private JSONArray mCommentInfos;
    private Context mContext;
    private int mShowBarrageTime;
    private JSONObject mShowMaidian;
    private int maxItem;
    private LayoutTransition transition;
    public Pools.SimplePool<View> viewPool;

    static {
        kge.a(-1064077222);
    }

    public static /* synthetic */ Object ipc$super(TBLiveMessageRealView tBLiveMessageRealView, String str, Object... objArr) {
        if (str.hashCode() == -572887227) {
            super.addView((View) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int access$000(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8470c7f", new Object[]{tBLiveMessageRealView})).intValue() : tBLiveMessageRealView.maxItem;
    }

    public static /* synthetic */ Handler access$100(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("cbbb059", new Object[]{tBLiveMessageRealView}) : tBLiveMessageRealView.handler;
    }

    public static /* synthetic */ JSONObject access$200(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5fa5992e", new Object[]{tBLiveMessageRealView}) : tBLiveMessageRealView.mShowMaidian;
    }

    public static /* synthetic */ int access$300(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fa6872c2", new Object[]{tBLiveMessageRealView})).intValue() : tBLiveMessageRealView.index;
    }

    public static /* synthetic */ int access$302(TBLiveMessageRealView tBLiveMessageRealView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c808845", new Object[]{tBLiveMessageRealView, new Integer(i)})).intValue();
        }
        tBLiveMessageRealView.index = i;
        return i;
    }

    public static /* synthetic */ int access$308(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2708baca", new Object[]{tBLiveMessageRealView})).intValue();
        }
        int i = tBLiveMessageRealView.index;
        tBLiveMessageRealView.index = i + 1;
        return i;
    }

    public static /* synthetic */ JSONArray access$400(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("6c7ce8ae", new Object[]{tBLiveMessageRealView}) : tBLiveMessageRealView.mCommentInfos;
    }

    public static /* synthetic */ int access$500(TBLiveMessageRealView tBLiveMessageRealView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1bd40c44", new Object[]{tBLiveMessageRealView})).intValue() : tBLiveMessageRealView.mShowBarrageTime;
    }

    public TBLiveMessageRealView(Context context) {
        super(context);
        this.maxItem = 2;
        this.viewPool = new Pools.SimplePool<>(4);
        this.index = 0;
        this.handler = new Handler() { // from class: com.taobao.taolive.uikit.api.TBLiveMessageRealView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 673877017) {
                    super.handleMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                if (i != 0) {
                    if (i != 2 || TBLiveMessageRealView.this.getChildCount() <= 0) {
                        return;
                    }
                    TBLiveMessageRealView tBLiveMessageRealView = TBLiveMessageRealView.this;
                    tBLiveMessageRealView.removeView(tBLiveMessageRealView.getChildAt(0));
                    return;
                }
                View obtainMessageView = TBLiveMessageRealView.this.obtainMessageView();
                if (obtainMessageView != null) {
                    Map hashMap = new HashMap();
                    if (TBLiveMessageRealView.access$200(TBLiveMessageRealView.this) != null) {
                        String string = TBLiveMessageRealView.access$200(TBLiveMessageRealView.this).getString("params");
                        if (!pro.e(string)) {
                            hashMap = j.a(string);
                        }
                    }
                    pru.b("Page_TaobaoLive", "home_feed_show_realtime", hashMap);
                    TBLiveMessageRealView.this.addView(obtainMessageView);
                }
                TBLiveMessageRealView.access$308(TBLiveMessageRealView.this);
                if (TBLiveMessageRealView.access$300(TBLiveMessageRealView.this) == TBLiveMessageRealView.access$400(TBLiveMessageRealView.this).size()) {
                    TBLiveMessageRealView.access$302(TBLiveMessageRealView.this, 0);
                }
                sendEmptyMessageDelayed(0, TBLiveMessageRealView.access$500(TBLiveMessageRealView.this) > 0 ? TBLiveMessageRealView.access$500(TBLiveMessageRealView.this) : 1000L);
            }
        };
        this.mContext = context;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = prc.a(this.mContext, 4.0f);
        setLayoutParams(layoutParams);
    }

    public int getViewHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed8ac39c", new Object[]{this})).intValue() : prc.a(this.mContext, 78.0f);
    }

    public int[] getShaderParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("c74f5d9c", new Object[]{this}) : new int[]{prc.a(getContext(), 30.0f), prc.a(getContext(), 50.0f)};
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.size() <= 0) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("bizData");
            JSONArray jSONArray = jSONObject.getJSONArray("commentInfos");
            JSONObject jSONObject3 = jSONObject.getJSONObject(d.SHOW_MAIDIAN);
            if (jSONArray == null || jSONArray.size() == 0) {
                return;
            }
            this.mCommentInfos = jSONArray;
            this.mShowMaidian = jSONObject3;
            if (jSONObject2 != null) {
                if (!pro.e(jSONObject2.getString("showBarrageCount"))) {
                    this.maxItem = Integer.parseInt(jSONObject2.getString("showBarrageCount"));
                }
                if (!pro.e(jSONObject2.getString("showBarrageTime"))) {
                    this.mShowBarrageTime = Integer.parseInt(jSONObject2.getString("showBarrageTime"));
                }
            }
            this.handler.sendEmptyMessage(0);
        }
    }

    public View obtainMessageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fc150330", new Object[]{this});
        }
        try {
            View acquire = this.viewPool.acquire();
            if (acquire == null) {
                acquire = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_message_item, (ViewGroup) null);
            }
            TUrlImageView tUrlImageView = (TUrlImageView) acquire.findViewById(R.id.live_chat_icon);
            TextView textView = (TextView) acquire.findViewById(R.id.live_chat_nick);
            TextView textView2 = (TextView) acquire.findViewById(R.id.live_chat_content);
            JSONObject jSONObject = this.mCommentInfos.getJSONObject(this.index);
            if (jSONObject != null) {
                String string = jSONObject.getString("icon");
                String string2 = jSONObject.getString("content");
                String string3 = jSONObject.getString("userNick");
                if (pro.e(string)) {
                    tUrlImageView.setVisibility(8);
                    if (!pro.e(string3)) {
                        textView.setText(String.format("%s:", string3));
                        textView.setVisibility(0);
                    }
                } else {
                    textView.setVisibility(8);
                    tUrlImageView.setImageUrl(string);
                    tUrlImageView.setVisibility(0);
                }
                if (!pro.e(string2)) {
                    textView2.setText(string2);
                }
            }
            return acquire;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        setAnimateView(view);
        super.addView(view);
    }

    public void setAnimateView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0ed07", new Object[]{this, view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", prc.a(getContext(), 24.0f), 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.taolive.uikit.api.TBLiveMessageRealView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                switch (str.hashCode()) {
                    case -2145066406:
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    case -1868320925:
                        super.onAnimationCancel((Animator) objArr[0]);
                        return null;
                    case 977295137:
                        super.onAnimationStart((Animator) objArr[0]);
                        return null;
                    case 1133046404:
                        super.onAnimationRepeat((Animator) objArr[0]);
                        return null;
                    default:
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    super.onAnimationCancel(animator);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                if (TBLiveMessageRealView.this.getChildCount() != TBLiveMessageRealView.access$000(TBLiveMessageRealView.this) + 1 || TBLiveMessageRealView.access$100(TBLiveMessageRealView.this) == null) {
                    return;
                }
                TBLiveMessageRealView.access$100(TBLiveMessageRealView.this).sendEmptyMessage(2);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    super.onAnimationRepeat(animator);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else {
                    super.onAnimationStart(animator);
                }
            }
        });
        ofFloat.start();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, "alpha", childAt.getAlpha(), childAt.getAlpha() - 0.5f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt, "translationY", getTranslationY() + prc.a(getContext(), 24.0f), getTranslationY());
                ofFloat2.setDuration(500L);
                ofFloat3.setDuration(500L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat2, ofFloat3);
                animatorSet.start();
            }
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        setVisibility(8);
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        LayoutTransition layoutTransition = this.transition;
        if (layoutTransition == null || layoutTransition.isRunning()) {
            return;
        }
        this.transition = null;
    }
}
