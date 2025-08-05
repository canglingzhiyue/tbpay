package com.taobao.android.detail.ttdetail.widget.video;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.performance.d;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.RatioFrameLayout;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ept;
import tb.kge;
import tb.lfn;
import tb.pqq;

/* loaded from: classes5.dex */
public class BizMiniVideoView extends AbsMiniVideoView<lfn> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BizMiniVideoView";
    private List<lfn> mBizVideoDataList;
    private View mCloseBtn;
    private String mCurVideoType;
    private View mCurVideoView;
    private RatioFrameLayout mLayout;
    private String mRealDimensionRatio;
    private ConstraintLayout mRootLayout;

    /* loaded from: classes5.dex */
    public interface a {
        void a(String str, String str2, String str3);
    }

    static {
        kge.a(467899650);
    }

    public static /* synthetic */ Object ipc$super(BizMiniVideoView bizMiniVideoView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(BizMiniVideoView bizMiniVideoView, View view, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df9dae3c", new Object[]{bizMiniVideoView, view, str})).booleanValue() : bizMiniVideoView.reflectInvokeLiveMethod(view, str);
    }

    public static /* synthetic */ void access$100(BizMiniVideoView bizMiniVideoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a65f260f", new Object[]{bizMiniVideoView, new Boolean(z)});
        } else {
            bizMiniVideoView.updateVideoView(z);
        }
    }

    public BizMiniVideoView(Context context) {
        super(context);
        this.mRealDimensionRatio = com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO;
        initViews();
    }

    public BizMiniVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRealDimensionRatio = com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO;
        initViews();
    }

    public BizMiniVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRealDimensionRatio = com.taobao.android.detail2.core.framework.base.media.frame.b.VALUE_THREE_FOUR_RATIO;
        initViews();
    }

    private void initViews() {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        d a2 = d.a(y.a(this));
        if (a2 != null) {
            inflate = a2.a(y.a(this), R.layout.tt_detail_biz_mini_video, this, true);
        } else {
            inflate = LayoutInflater.from(y.a(this)).inflate(R.layout.tt_detail_biz_mini_video, (ViewGroup) this, false);
        }
        addView(inflate, new FrameLayout.LayoutParams(-2, -2));
        this.mRootLayout = (ConstraintLayout) inflate.findViewById(R.id.cl_biz_root_container);
        this.mLayout = (RatioFrameLayout) inflate.findViewById(R.id.rfl_biz_constraint_container);
        this.mLayout.setWHRatio(this.mRealDimensionRatio);
        this.mCloseBtn = inflate.findViewById(R.id.biz_view_close);
        this.mCloseBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.widget.video.BizMiniVideoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (BizMiniVideoView.this.mOnMiniVideoListener == null) {
                } else {
                    BizMiniVideoView.this.mOnMiniVideoListener.a(view);
                }
            }
        });
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void setVideoData(List<lfn> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a80b87b", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            this.mBizVideoDataList = list;
            updateVideoView(true);
        }
    }

    private void updateVideoView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5115ba96", new Object[]{this, new Boolean(z)});
            return;
        }
        View nextVideoView = getNextVideoView();
        this.mCurVideoView = nextVideoView;
        if (nextVideoView != null) {
            addBizVideoView(nextVideoView);
            if (z) {
                return;
            }
            play();
        } else if (!TextUtils.isEmpty(this.mCurVideoType)) {
            updateVideoView(false);
        } else if (this.mOnMiniVideoListener == null) {
        } else {
            this.mOnMiniVideoListener.a();
        }
    }

    private void addBizVideoView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b21b3fd", new Object[]{this, view});
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.mLayout.removeAllViews();
        this.mLayout.addView(view, layoutParams);
        this.mLayout.setWHRatio(this.mRealDimensionRatio);
        this.mCloseBtn.setVisibility(0);
    }

    private View getNextVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c693be20", new Object[]{this});
        }
        List<lfn> list = this.mBizVideoDataList;
        if (list == null || list.isEmpty()) {
            this.mCurVideoType = null;
            return null;
        }
        lfn lfnVar = this.mBizVideoDataList.get(0);
        if (lfnVar != null) {
            String h = lfnVar.h();
            JSONObject i = lfnVar.i();
            this.mTrackParams = lfnVar.j();
            if (TextUtils.equals("liveVideo", h)) {
                this.mBizVideoDataList.remove(0);
                this.mCurVideoType = "liveVideo";
                return getLiveVideoView(i);
            }
        }
        this.mCurVideoType = null;
        return null;
    }

    private View getLiveVideoView(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                Class<?> cls = Class.forName("com.taobao.taolive.room.openarchitecture.opendetail.TaoliveOpenDetailCardView");
                final View view = (View) cls.getConstructor(Context.class).newInstance(this.mContext);
                Method declaredMethod = cls.getDeclaredMethod("setMediaConfig", HashMap.class);
                HashMap hashMap = new HashMap();
                if (this.mDetailContext != null) {
                    hashMap.putAll((Map) JSONObject.toJavaObject(m.a(this.mDetailContext.a()), Map.class));
                }
                hashMap.put(pqq.KEY_LIVE_SOURCE, "liveitem.streaming_floating_video");
                declaredMethod.invoke(view, hashMap);
                cls.getDeclaredMethod(ept.SUB_BIND_VIEW, JSONObject.class).invoke(view, jSONObject);
                cls.getDeclaredMethod("setProxy", Object.class, Method.class).invoke(view, new a() { // from class: com.taobao.android.detail.ttdetail.widget.video.BizMiniVideoView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.ttdetail.widget.video.BizMiniVideoView.a
                    public void a(String str, String str2, String str3) {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                            return;
                        }
                        i.a(BizMiniVideoView.TAG, "liveVideo onEvent: type=" + str + ", eventCode=" + str2 + ", extra=" + str3);
                        if (!TextUtils.isEmpty(str2) && !TextUtils.equals("TBL200001", str2) && !TextUtils.equals("TBL200002", str2) && !TextUtils.equals("TBL100006", str2) && !TextUtils.equals("TBL100007", str2) && !TextUtils.equals("TBL100008", str2)) {
                            return;
                        }
                        BizMiniVideoView.access$000(BizMiniVideoView.this, view, "destroy");
                        BizMiniVideoView.access$100(BizMiniVideoView.this, false);
                    }
                }, a.class.getDeclaredMethod("a", String.class, String.class, String.class));
                return view;
            } catch (Exception e) {
                i.a(TAG, "failed to get live videoView by reflection: " + e);
            }
        }
        return null;
    }

    private boolean play() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6fe955bf", new Object[]{this})).booleanValue() : play(null);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean play(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f858a6c9", new Object[]{this, str})).booleanValue();
        }
        closeGlobalLiveVideoView();
        if (!isLiveVideo()) {
            return false;
        }
        return reflectInvokeLiveMethod(this.mCurVideoView, "play");
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public boolean pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315dbf81", new Object[]{this})).booleanValue();
        }
        if (!isLiveVideo()) {
            return false;
        }
        return reflectInvokeLiveMethod(this.mCurVideoView, "stop");
    }

    @Override // com.taobao.android.detail.ttdetail.widget.video.AbsMiniVideoView
    public void detachVideoView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d239f174", new Object[]{this});
        } else if (!isLiveVideo()) {
        } else {
            reflectInvokeLiveMethod(this.mCurVideoView, "destroy");
        }
    }

    private boolean isLiveVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1199f2f0", new Object[]{this})).booleanValue() : TextUtils.equals("liveVideo", this.mCurVideoType);
    }

    private boolean reflectInvokeLiveMethod(View view, String str) {
        if (view != null && !TextUtils.isEmpty(str)) {
            try {
                Class.forName("com.taobao.taolive.room.openarchitecture.opendetail.TaoliveOpenDetailCardView").getDeclaredMethod(str, new Class[0]).invoke(view, new Object[0]);
                return true;
            } catch (Exception e) {
                i.a(TAG, "failed to invoke live videoView method: " + str + ", exception: " + e);
            }
        }
        return false;
    }
}
