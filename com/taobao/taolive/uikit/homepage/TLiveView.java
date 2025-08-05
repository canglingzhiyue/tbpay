package com.taobao.taolive.uikit.homepage;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.k;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.kge;
import tb.pqu;
import tb.pqy;
import tb.prc;
import tb.prd;
import tb.pro;

/* loaded from: classes8.dex */
public class TLiveView extends TUrlImageView implements Application.ActivityLifecycleCallbacks, a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mDuration;
    private boolean mIsAttachedToWindow;
    private String mLiveId;
    private String mLiveUrl;
    public RecyclerView.OnScrollListener mOnScrollListener;
    public RecyclerView mParentRecycler;
    private JSONObject mPlayerData;
    private final BroadcastReceiver mReceiver;
    private String mSubBusinessType;

    static {
        kge.a(-1073454523);
        kge.a(-681693059);
        kge.a(-1894394539);
    }

    public static /* synthetic */ Object ipc$super(TLiveView tLiveView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    public static /* synthetic */ boolean access$000(TLiveView tLiveView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a20e73c9", new Object[]{tLiveView})).booleanValue() : tLiveView.mIsAttachedToWindow;
    }

    public static /* synthetic */ void access$100(TLiveView tLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe70e24", new Object[]{tLiveView});
        } else {
            tLiveView.playVideoIfNecessary();
        }
    }

    public static /* synthetic */ void access$200(TLiveView tLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfa883", new Object[]{tLiveView});
        } else {
            tLiveView.stopVideo();
        }
    }

    public TLiveView(Context context) {
        this(context, null);
    }

    public TLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSubBusinessType = "HomePageLive";
        this.mReceiver = new BroadcastReceiver() { // from class: com.taobao.taolive.uikit.homepage.TLiveView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    TLiveView.access$200(TLiveView.this);
                } else if (!"android.intent.action.USER_PRESENT".equals(action) || !TLiveView.this.isShown()) {
                } else {
                    TLiveView.access$100(TLiveView.this);
                }
            }
        };
        this.mIsAttachedToWindow = false;
        this.mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.taolive.uikit.homepage.TLiveView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 806944192) {
                    super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                    return null;
                } else if (hashCode != 2142696127) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i2)});
                    return;
                }
                super.onScrollStateChanged(recyclerView, i2);
                if (i2 != 0 || !TLiveView.access$000(TLiveView.this)) {
                    return;
                }
                TLiveView.access$100(TLiveView.this);
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                } else {
                    super.onScrolled(recyclerView, i2, i3);
                }
            }
        };
        try {
            ((Application) getContext().getApplicationContext()).registerActivityLifecycleCallbacks(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            playVideoIfNecessary();
        } else {
            stopVideo();
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        getContext().registerReceiver(this.mReceiver, intentFilter);
        ViewParent parent = getParent();
        while (!(parent instanceof RecyclerView) && (parent = parent.getParent()) != null) {
        }
        if (parent != null) {
            this.mParentRecycler = (RecyclerView) parent;
            this.mParentRecycler.addOnScrollListener(this.mOnScrollListener);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        getContext().unregisterReceiver(this.mReceiver);
        RecyclerView recyclerView = this.mParentRecycler;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.mOnScrollListener);
        }
        this.mParentRecycler = null;
        stopVideo();
    }

    public void setLiveUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd3e9f2", new Object[]{this, str});
            return;
        }
        this.mLiveUrl = str;
        new pqy(new pqu() { // from class: com.taobao.taolive.uikit.homepage.TLiveView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pqu
            public void handleMessage(Message message) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                }
            }
        }).postDelayed(new Runnable() { // from class: com.taobao.taolive.uikit.homepage.TLiveView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TLiveView.access$100(TLiveView.this);
                }
            }
        }, 1000L);
    }

    public void setDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.mDuration = i;
        }
    }

    public void setLiveId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.mLiveId = str;
        }
    }

    public void setSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
        } else {
            this.mSubBusinessType = str;
        }
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
        } else {
            this.mPlayerData = jSONObject;
        }
    }

    private void playVideoIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d85192", new Object[]{this});
        } else if (TextUtils.isEmpty(this.mLiveUrl) || prc.d(getContext())) {
        } else {
            MediaLiveInfo mediaLiveInfo = null;
            try {
                if (this.mPlayerData != null) {
                    MediaLiveInfo mediaLiveInfo2 = new MediaLiveInfo();
                    mediaLiveInfo2.h265 = pro.d(this.mPlayerData.getString("h265"));
                    mediaLiveInfo2.mediaConfig = "";
                    mediaLiveInfo2.rateAdapte = false;
                    mediaLiveInfo2.liveUrlList = new ArrayList<>();
                    QualityLiveItem qualityLiveItem = new QualityLiveItem();
                    qualityLiveItem.definition = MediaConstant.DEFINITION_MD;
                    qualityLiveItem.flvUrl = this.mLiveUrl;
                    qualityLiveItem.name = "高清";
                    qualityLiveItem.wholeH265FlvUrl = this.mPlayerData.getString("wholeH265FlvUrl");
                    mediaLiveInfo2.liveUrlList.add(qualityLiveItem);
                    mediaLiveInfo = mediaLiveInfo2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            b bVar = new b(this, this.mLiveUrl, mediaLiveInfo);
            int i = this.mDuration;
            if (i <= 0) {
                i = 10;
            }
            bVar.b = i;
            bVar.d = new Rect();
            bVar.e = this.mLiveId;
            bVar.g = this.mSubBusinessType;
            getGlobalVisibleRect(bVar.d);
            c.a(getContext()).a(bVar, getContext());
        }
    }

    private void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            c.a(getContext()).b();
        }
    }

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoRequestAccept() {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49416702", new Object[]{this});
            return;
        }
        k a2 = c.a(getContext()).a();
        if (a2 == null || a2.q() == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) a2.q().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(a2.q());
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (layoutParams2 != null) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams != null) {
            layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
            layoutParams.setMargins(getLeft(), getTop(), 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
        }
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        if (viewGroup2 == null) {
            return;
        }
        try {
            viewGroup2.addView(a2.q(), ((ViewGroup) getParent()).indexOfChild(this), layoutParams);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        String str = "onVideoStart ==== this = " + this;
        prd.a(this, 90L);
    }

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        String str = "onVideoStop ==== this = " + this;
        prd.b(this, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (getContext() != activity && (!"MainActivity3".equals(activity.getLocalClassName()) || getContext() != getContext().getApplicationContext())) {
        } else {
            if (!c.d()) {
                c.a(getContext()).c();
            }
            try {
                ((Application) getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            } catch (Throwable unused) {
            }
        }
    }
}
