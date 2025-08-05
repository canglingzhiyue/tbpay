package com.taobao.android.live.plugin.atype.flexalocal.notice;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.taobao.R;
import com.taobao.taolive.room.ui.view.MarqueeTextView;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.a;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.hkm;
import tb.kge;
import tb.plx;
import tb.ply;
import tb.pqj;

/* loaded from: classes6.dex */
public class NoticeFrame3 extends BaseFrame implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_HIDE_NOTICE = 1000;
    private static final String TAG = "NoticeFrame3";
    private f mHandler;
    private d.a mMessageListener;
    private MarqueeTextView mNoticeContent;
    private Queue<String> mNoticeQueue;
    private View.OnLayoutChangeListener mOnLayoutChangeListener;

    static {
        kge.a(1102422825);
        kge.a(-1905361424);
    }

    public static /* synthetic */ Object ipc$super(NoticeFrame3 noticeFrame3, String str, Object... objArr) {
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

    public static /* synthetic */ MarqueeTextView access$000(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MarqueeTextView) ipChange.ipc$dispatch("90e2ba0d", new Object[]{noticeFrame3}) : noticeFrame3.mNoticeContent;
    }

    public static /* synthetic */ void access$100(NoticeFrame3 noticeFrame3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566f398a", new Object[]{noticeFrame3, str});
        } else {
            noticeFrame3.handleNotice(str);
        }
    }

    public static /* synthetic */ f access$200(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("719c8f4f", new Object[]{noticeFrame3}) : noticeFrame3.mHandler;
    }

    public static /* synthetic */ Queue access$300(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("9a17961e", new Object[]{noticeFrame3}) : noticeFrame3.mNoticeQueue;
    }

    public static /* synthetic */ void access$400(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82807dd", new Object[]{noticeFrame3});
        } else {
            noticeFrame3.showNextNoticeOrHide();
        }
    }

    public static /* synthetic */ void access$500(NoticeFrame3 noticeFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f353c", new Object[]{noticeFrame3});
        } else {
            noticeFrame3.startMarquee();
        }
    }

    public NoticeFrame3(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mHandler = new f(this);
        this.mNoticeQueue = new ConcurrentLinkedQueue();
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                    return;
                }
                int i9 = i3 - i;
                if (i9 <= i7 - i5) {
                    return;
                }
                NoticeFrame3.access$000(NoticeFrame3.this).setParentWidth(i9 - com.taobao.taolive.room.utils.d.a(NoticeFrame3.this.mContext, 38.0f));
            }
        };
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (NoticeFrame3.this.mFrameContext != null && NoticeFrame3.this.mFrameContext.m()) {
                    plx.b(NoticeFrame3.TAG, "live home mix, not notice");
                } else if (i != 1023) {
                    if (i != 1004 || NoticeFrame3.this.mContainer == null) {
                        return;
                    }
                    NoticeFrame3.this.mContainer.setVisibility(8);
                } else if (obj == null || !ply.ae()) {
                } else {
                    try {
                        JSONObject b = pqj.b(new String(((TLiveMsg) obj).data));
                        if (b == null) {
                            return;
                        }
                        NoticeFrame3.access$100(NoticeFrame3.this, b.getString("notice"));
                    } catch (Exception unused) {
                        plx.b(NoticeFrame3.TAG, "parser notice error");
                    }
                }
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_frame_notice3_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mNoticeContent = (MarqueeTextView) view.findViewById(R.id.taolive_notice_content);
        ((TUrlImageView) view.findViewById(R.id.taolive_notice_icon)).setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01F2ae8P1N1cvUmFUNc_!!6000000001510-2-tps-45-45.png");
        TUrlImageView tUrlImageView = (TUrlImageView) this.mContainer.findViewById(R.id.taolive_notice_close);
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01hgTgYf1omKwWlZta2_!!6000000005267-2-tps-45-45.png");
        tUrlImageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (NoticeFrame3.access$200(NoticeFrame3.this) != null) {
                    NoticeFrame3.access$200(NoticeFrame3.this).removeMessages(1000);
                    NoticeFrame3.access$200(NoticeFrame3.this).sendEmptyMessage(1000);
                }
                NoticeFrame3.access$000(NoticeFrame3.this).stopScroll();
            }
        });
        e.c("NoticeFrame3: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what != 1000) {
        } else {
            hideNotice();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        this.mContainer.setVisibility(8);
        this.mContainer.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1023 || i == 1004;
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
        if (this.mContainer != null) {
            this.mContainer.removeOnLayoutChangeListener(this.mOnLayoutChangeListener);
        }
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        MarqueeTextView marqueeTextView = this.mNoticeContent;
        if (marqueeTextView != null) {
            marqueeTextView.clearAnimation();
            this.mNoticeContent.stopScroll();
        }
        f fVar = this.mHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        this.mNoticeQueue.clear();
    }

    private void handleNotice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d3d5b1", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.mNoticeQueue.isEmpty()) {
                this.mNoticeQueue.add(str);
                showNotice();
                return;
            }
            this.mNoticeQueue.add(str);
        }
    }

    private void hideNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808e7e41", new Object[]{this});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        this.mContainer.clearAnimation();
        this.mContainer.setAnimation(translateAnimation);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3.5
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
                NoticeFrame3.access$300(NoticeFrame3.this).poll();
                NoticeFrame3.access$400(NoticeFrame3.this);
            }
        });
        translateAnimation.start();
    }

    private void showNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1349ce3c", new Object[]{this});
            return;
        }
        stopMarquee();
        this.mNoticeContent.setText(this.mNoticeQueue.peek());
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        this.mContainer.clearAnimation();
        this.mContainer.setAnimation(translateAnimation);
        this.mContainer.setVisibility(0);
        translateAnimation.start();
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3.6
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
                } else {
                    NoticeFrame3.access$500(NoticeFrame3.this);
                }
            }
        });
    }

    private void startMarquee() {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c873de7", new Object[]{this});
        } else if (!this.mNoticeContent.outOfBounds() && (fVar = this.mHandler) != null) {
            fVar.removeMessages(1000);
            this.mHandler.sendEmptyMessageDelayed(1000, ply.ag());
        } else {
            this.mNoticeContent.setMarqueeRepeatLimit(ply.ah());
            this.mNoticeContent.startScroll();
            this.mNoticeContent.setOnMarqueeCompleteListener(new MarqueeTextView.b() { // from class: com.taobao.android.live.plugin.atype.flexalocal.notice.NoticeFrame3.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.room.ui.view.MarqueeTextView.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (NoticeFrame3.access$200(NoticeFrame3.this) == null) {
                    } else {
                        NoticeFrame3.access$200(NoticeFrame3.this).removeMessages(1000);
                        NoticeFrame3.access$200(NoticeFrame3.this).sendEmptyMessageDelayed(1000, 0L);
                    }
                }
            });
        }
    }

    private void stopMarquee() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974b7647", new Object[]{this});
            return;
        }
        f fVar = this.mHandler;
        if (fVar != null) {
            fVar.removeMessages(1000);
        }
        this.mNoticeContent.stopScroll();
    }

    private void showNextNoticeOrHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c0cc74", new Object[]{this});
        } else if (!this.mNoticeQueue.isEmpty()) {
            showNotice();
        } else {
            this.mContainer.setVisibility(8);
        }
    }
}
