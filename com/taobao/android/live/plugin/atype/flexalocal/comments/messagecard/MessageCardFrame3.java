package com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.core.c;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.MessageCardInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.hkm;
import tb.kge;
import tb.phg;
import tb.phl;
import tb.plx;

/* loaded from: classes5.dex */
public class MessageCardFrame3 extends BaseFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MessageCardFrame3";
    private static final String TYPE_ITEM = "item";
    private static final String TYPE_NORMAL = "normal";
    private boolean isCleanUp;
    private boolean isOpenStatus;
    private Runnable mCloseContainerDelayRunnable;
    private String mCurCardItemBusinessInfo;
    private String mCurType;
    private AliUrlImageView mMessageCardView;
    private c mMessageListener;
    private View mMsgCardCloseArrowView;
    private View mMsgCardCloseContainer;
    private View mMsgCardCloseExtendContainer;
    private ViewGroup mMsgCardContainer;
    private View mMsgCardOpenContainer;
    private MessageCardScrollView mScrollImg;

    static {
        kge.a(1750023990);
    }

    public static /* synthetic */ Object ipc$super(MessageCardFrame3 messageCardFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : TAG;
    }

    public static /* synthetic */ boolean access$000(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef353134", new Object[]{messageCardFrame3})).booleanValue() : messageCardFrame3.isOpenStatus;
    }

    public static /* synthetic */ void access$100(MessageCardFrame3 messageCardFrame3, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0b148f", new Object[]{messageCardFrame3, str, str2, str3});
        } else {
            messageCardFrame3.displayMessageCardView(str, str2, str3);
        }
    }

    public static /* synthetic */ boolean access$1000(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6184963", new Object[]{messageCardFrame3})).booleanValue() : messageCardFrame3.isCleanUp;
    }

    public static /* synthetic */ void access$200(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc1b1b2", new Object[]{messageCardFrame3});
        } else {
            messageCardFrame3.showMessageCardView();
        }
    }

    public static /* synthetic */ String access$300(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fc6bc70d", new Object[]{messageCardFrame3}) : messageCardFrame3.mCurType;
    }

    public static /* synthetic */ void access$400(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904e3234", new Object[]{messageCardFrame3});
        } else {
            messageCardFrame3.hideMessageCardView();
        }
    }

    public static /* synthetic */ View access$500(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c2793777", new Object[]{messageCardFrame3}) : messageCardFrame3.mMsgCardCloseArrowView;
    }

    public static /* synthetic */ View access$600(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("75f24978", new Object[]{messageCardFrame3}) : messageCardFrame3.mMsgCardCloseContainer;
    }

    public static /* synthetic */ View access$700(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("296b5b79", new Object[]{messageCardFrame3}) : messageCardFrame3.mMsgCardCloseExtendContainer;
    }

    public static /* synthetic */ View access$800(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("dce46d7a", new Object[]{messageCardFrame3}) : messageCardFrame3.mMsgCardOpenContainer;
    }

    public static /* synthetic */ MessageCardScrollView access$900(MessageCardFrame3 messageCardFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MessageCardScrollView) ipChange.ipc$dispatch("ecf2d9ca", new Object[]{messageCardFrame3}) : messageCardFrame3.mScrollImg;
    }

    public MessageCardFrame3(Context context, a aVar) {
        super(context, aVar);
        this.isOpenStatus = false;
        this.isCleanUp = false;
        this.mMessageListener = new c() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i != 1064) {
                } else {
                    try {
                        MessageCardInfo messageCardInfo = (MessageCardInfo) JSONObject.parseObject((String) obj, MessageCardInfo.class);
                        if (messageCardInfo == null || TextUtils.isEmpty(messageCardInfo.action)) {
                            return;
                        }
                        String str = messageCardInfo.action;
                        if (!str.equals("set")) {
                            if (!str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_clear)) {
                                return;
                            }
                            MessageCardFrame3.this.hide();
                            return;
                        }
                        String str2 = messageCardInfo.infoCardType != null ? messageCardInfo.infoCardType : "normal";
                        String str3 = messageCardInfo.infoCardUrlV2 != null ? messageCardInfo.infoCardUrlV2 : messageCardInfo.infoCardUrl;
                        if (MessageCardFrame3.access$000(MessageCardFrame3.this)) {
                            MessageCardFrame3.access$100(MessageCardFrame3.this, str2, str3, messageCardInfo.infoCardItemBusinessInfo);
                            return;
                        }
                        MessageCardFrame3.access$100(MessageCardFrame3.this, str2, str3, messageCardInfo.infoCardItemBusinessInfo);
                        MessageCardFrame3.access$200(MessageCardFrame3.this);
                    } catch (Exception e) {
                        plx.b(MessageCardFrame3.TAG, "onMessageReceived: " + e.getMessage());
                    }
                }
            }
        };
        this.mCloseContainerDelayRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (MessageCardFrame3.this.mContainer == null || !MessageCardFrame3.access$000(MessageCardFrame3.this) || MessageCardFrame3.access$1000(MessageCardFrame3.this)) {
                } else {
                    MessageCardFrame3.access$400(MessageCardFrame3.this);
                }
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_frame_message_card3_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        setupView();
        e.c("MessageCardFrame3: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
    }

    private void setupView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423b649", new Object[]{this});
            return;
        }
        this.mContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) && view.getParent() != null) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                }
                return false;
            }
        });
        this.mMessageCardView = (AliUrlImageView) this.mContainer.findViewById(R.id.taolive_frame_message_pic);
        this.mScrollImg = (MessageCardScrollView) this.mContainer.findViewById(R.id.view_message_card_open_scroll_img);
        this.mMessageCardView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                phl a2 = phg.a();
                a aVar = MessageCardFrame3.this.mFrameContext;
                a2.a(aVar, "gonggao_click", "type=" + MessageCardFrame3.access$300(MessageCardFrame3.this));
            }
        });
        ((TUrlImageView) this.mContainer.findViewById(R.id.view_msgcard_arrow_open)).setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01gCPrqp1otfHR2u0ul_!!6000000005283-2-tps-23-21.png");
        ((TUrlImageView) this.mContainer.findViewById(R.id.view_msgcard_arrow_close)).setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01upt5VA2191xVGpHd6_!!6000000006941-2-tps-21-21.png");
        this.mMsgCardCloseArrowView = this.mContainer.findViewById(R.id.view_msgcard_arrow_bg);
        this.mMsgCardOpenContainer = this.mContainer.findViewById(R.id.view_messsage_card_open_container);
        this.mMsgCardCloseContainer = this.mContainer.findViewById(R.id.view_messsage_card_close_container);
        this.mMsgCardContainer = (ViewGroup) this.mContainer.findViewById(R.id.view_message_card_container);
        this.mMsgCardCloseArrowView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                MessageCardFrame3.access$400(MessageCardFrame3.this);
                phl a2 = phg.a();
                a aVar = MessageCardFrame3.this.mFrameContext;
                a2.a(aVar, "gonggao_close", "type=" + MessageCardFrame3.access$300(MessageCardFrame3.this));
            }
        });
        this.mMsgCardCloseExtendContainer = this.mContainer.findViewById(R.id.view_msgcard_arrow_extend_bg);
        this.mMsgCardCloseExtendContainer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    MessageCardFrame3.access$200(MessageCardFrame3.this);
                }
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        VideoInfo.InfoCard infoCard;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1064;
            }
        });
        hide();
        VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
        if (videoInfo != null && videoInfo.infoCard != null && (infoCard = videoInfo.infoCard) != null) {
            displayMessageCardView(infoCard.infoCardType != null ? infoCard.infoCardType : "normal", infoCard.infoCardUrlV2 != null ? infoCard.infoCardUrlV2 : infoCard.infoCardUrl, infoCard.infoCardItemBusinessInfo);
        }
        this.isCleanUp = false;
        MessageCardScrollView messageCardScrollView = this.mScrollImg;
        if (messageCardScrollView == null) {
            return;
        }
        messageCardScrollView.scrollTo(0, 0);
    }

    private void displayMessageCardView(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("761da87f", new Object[]{this, str, str2, str3});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("type", str);
            phg.a().a(this.mFrameContext, "gonggao_show", hashMap);
            show();
            this.mMsgCardContainer.setVisibility(0);
            this.mMsgCardOpenContainer.setVisibility(0);
            this.mScrollImg.setVisibility(0);
            this.mMsgCardCloseContainer.setVisibility(8);
            this.mMsgCardCloseExtendContainer.setVisibility(8);
            this.isOpenStatus = true;
            this.mMessageCardView.setImageUrl(str2);
            this.mCurType = str;
            this.mCurCardItemBusinessInfo = str3;
            this.mContainer.removeCallbacks(this.mCloseContainerDelayRunnable);
            this.mContainer.postDelayed(this.mCloseContainerDelayRunnable, 10000L);
        }
    }

    private void showMessageCardView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a81bf46", new Object[]{this});
            return;
        }
        this.mMsgCardContainer.setVisibility(0);
        this.mMsgCardOpenContainer.setVisibility(0);
        this.mScrollImg.setVisibility(0);
        this.mMsgCardCloseContainer.setVisibility(0);
        this.mMsgCardCloseExtendContainer.setVisibility(4);
        this.isOpenStatus = true;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.0f, 1.0f, 1, 0.12f, 1, 0.12f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setRepeatCount(0);
        this.mMsgCardOpenContainer.clearAnimation();
        this.mMsgCardOpenContainer.setAnimation(scaleAnimation);
        scaleAnimation.start();
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                MessageCardFrame3.access$500(MessageCardFrame3.this).setVisibility(0);
                MessageCardFrame3.access$600(MessageCardFrame3.this).setVisibility(4);
            }
        });
    }

    private void hideMessageCardView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf244e1", new Object[]{this});
            return;
        }
        this.isOpenStatus = false;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.1f, 1.0f, 0.0f, 1, 0.12f, 1, 0.12f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setRepeatCount(0);
        this.mMsgCardOpenContainer.clearAnimation();
        this.mMsgCardOpenContainer.setAnimation(scaleAnimation);
        scaleAnimation.start();
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard.MessageCardFrame3.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                } else {
                    MessageCardFrame3.access$600(MessageCardFrame3.this).setVisibility(0);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                MessageCardFrame3.access$500(MessageCardFrame3.this).setVisibility(8);
                MessageCardFrame3.access$700(MessageCardFrame3.this).setVisibility(0);
                MessageCardFrame3.access$800(MessageCardFrame3.this).setVisibility(8);
                MessageCardFrame3.access$900(MessageCardFrame3.this).setVisibility(8);
            }
        });
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.isCleanUp = true;
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        if (this.mContainer == null) {
            return;
        }
        this.mContainer.removeCallbacks(this.mCloseContainerDelayRunnable);
    }
}
