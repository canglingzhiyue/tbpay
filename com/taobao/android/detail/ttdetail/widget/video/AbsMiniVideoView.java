package com.taobao.android.detail.ttdetail.widget.video;

import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.miniLive.sdk.d;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.ezg;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class AbsMiniVideoView<T extends ezg> extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float RADIUS;
    public Context mContext;
    public eyx mDetailContext;
    public b mOnMiniVideoListener;
    public JSONObject mTrackParams;
    public float mWindowWithRatio;

    static {
        kge.a(-1740551165);
    }

    public static /* synthetic */ Object ipc$super(AbsMiniVideoView absMiniVideoView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void attachVideoLastFrame(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba09c3b2", new Object[]{this, str});
        }
    }

    public abstract void detachVideoView();

    public Rect getContentScreenRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("f682b1e3", new Object[]{this});
        }
        return null;
    }

    public Map<String, String> getVideoInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dece48cf", new Object[]{this});
        }
        return null;
    }

    public abstract boolean pause();

    public abstract boolean play(String str);

    public abstract void setVideoData(List<T> list);

    public static /* synthetic */ float access$000(AbsMiniVideoView absMiniVideoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("47602fb3", new Object[]{absMiniVideoView})).floatValue() : absMiniVideoView.RADIUS;
    }

    public AbsMiniVideoView(Context context) {
        super(context);
        this.RADIUS = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        this.mWindowWithRatio = -1.0f;
        this.mContext = context;
        initView();
    }

    public AbsMiniVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RADIUS = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        this.mWindowWithRatio = -1.0f;
        this.mContext = context;
        initView();
    }

    public AbsMiniVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.RADIUS = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        this.mWindowWithRatio = -1.0f;
        this.mContext = context;
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            setClipToOutline(true);
            setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AbsMiniVideoView.access$000(AbsMiniVideoView.this));
                    }
                }
            });
        }
    }

    public void setWindowRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b862fb80", new Object[]{this, new Float(f)});
        } else {
            this.mWindowWithRatio = f;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!e.b() && this.mWindowWithRatio != -1.0f) {
            a2 = (int) Math.ceil((View.MeasureSpec.getSize(i) + f.a(y.a(this), 18.0f)) / this.mWindowWithRatio);
        } else {
            a2 = f.a(y.a(this), 90.0f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(a2, Integer.MIN_VALUE), i2);
    }

    public void setOnMiniVideoListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe038cd", new Object[]{this, bVar});
        } else {
            this.mOnMiniVideoListener = bVar;
        }
    }

    public void bindDetailContext(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a3cc94", new Object[]{this, eyxVar});
        } else {
            this.mDetailContext = eyxVar;
        }
    }

    public JSONObject getTrackParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f9fb2ba2", new Object[]{this}) : this.mTrackParams;
    }

    public void closeGlobalLiveVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f26a40", new Object[]{this});
        } else if (!j.K()) {
        } else {
            Intent intent = new Intent();
            intent.setAction(d.TAOLIVE_SHOW_MINILIVE_ACTION);
            intent.putExtra("actionType", "hideAllMiniLive");
            LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
        }
    }
}
