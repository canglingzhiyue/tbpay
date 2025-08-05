package com.taobao.taolive.room.openarchitecture.opendetail;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.q;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tb.hin;
import tb.kge;

/* loaded from: classes8.dex */
public class TaoliveOpenDetailCardView extends FrameLayout implements TBLOpenPlatformView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private Handler handler;
    private TUrlImageView icon;
    private final HashMap<String, String> mConfigParams;
    private String mJumpUrl;
    private Runnable mPlayComplete;
    private int mPlayTime;
    private TBLOpenPlatformView mTBLOpenPlatformView;
    private Object proxy;
    private Method proxyMethod;
    private TextView statusTv;
    private HashMap<String, String> trackParams;

    public static /* synthetic */ Object ipc$super(TaoliveOpenDetailCardView taoliveOpenDetailCardView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ String access$000(TaoliveOpenDetailCardView taoliveOpenDetailCardView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cadad912", new Object[]{taoliveOpenDetailCardView}) : taoliveOpenDetailCardView.mJumpUrl;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : TAG;
    }

    public static /* synthetic */ void access$200(TaoliveOpenDetailCardView taoliveOpenDetailCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3aa68c", new Object[]{taoliveOpenDetailCardView});
        } else {
            taoliveOpenDetailCardView.trackOnClick();
        }
    }

    static {
        kge.a(1008648412);
        kge.a(-2091817362);
        TAG = TaoliveOpenDetailCardView.class.getSimpleName();
    }

    public TaoliveOpenDetailCardView(Context context) {
        super(context);
        this.mConfigParams = new HashMap<>();
        this.mPlayTime = 300;
        this.mPlayComplete = new Runnable() { // from class: com.taobao.taolive.room.openarchitecture.opendetail.TaoliveOpenDetailCardView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TaoliveOpenDetailCardView.this.a("videoPlayer", "TBL100008", null);
                }
            }
        };
        init(context);
    }

    public TaoliveOpenDetailCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mConfigParams = new HashMap<>();
        this.mPlayTime = 300;
        this.mPlayComplete = new Runnable() { // from class: com.taobao.taolive.room.openarchitecture.opendetail.TaoliveOpenDetailCardView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TaoliveOpenDetailCardView.this.a("videoPlayer", "TBL100008", null);
                }
            }
        };
        init(context);
    }

    public TaoliveOpenDetailCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mConfigParams = new HashMap<>();
        this.mPlayTime = 300;
        this.mPlayComplete = new Runnable() { // from class: com.taobao.taolive.room.openarchitecture.opendetail.TaoliveOpenDetailCardView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TaoliveOpenDetailCardView.this.a("videoPlayer", "TBL100008", null);
                }
            }
        };
        init(context);
    }

    private void init(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        initView(context);
        initOpenPlatform();
        initMediaConfig();
        setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.room.openarchitecture.opendetail.TaoliveOpenDetailCardView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (!v.f(TaoliveOpenDetailCardView.access$000(TaoliveOpenDetailCardView.this))) {
                    s.a(context, TaoliveOpenDetailCardView.access$000(TaoliveOpenDetailCardView.this));
                    TaoliveOpenDetailCardView.this.stop();
                } else {
                    ab.a(TaoliveOpenDetailCardView.access$100(), "onClick : mJumpUrl is null or empty");
                }
                TaoliveOpenDetailCardView.access$200(TaoliveOpenDetailCardView.this);
            }
        });
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        try {
            this.mTBLOpenPlatformView = new TBLOpenPlatformView(context);
            addView(this.mTBLOpenPlatformView, new FrameLayout.LayoutParams(-1, -1));
            LinearLayout linearLayout = new LinearLayout(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hin.a(context, 27.0f));
            layoutParams.gravity = 81;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
            gradientDrawable.setColors(new int[]{context.getResources().getColor(R.color.taolive_updatable_favor_count_text_color), context.getResources().getColor(R.color.taolive_open_detail_card_bottom_bg)});
            linearLayout.setBackground(gradientDrawable);
            this.icon = new TUrlImageView(context);
            this.icon.setVisibility(8);
            this.icon.setSkipAutoSize(true);
            this.icon.setImageUrl(aa.cT());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(hin.a(context, 9.0f), hin.a(context, 9.0f));
            layoutParams2.rightMargin = hin.a(context, 6.0f);
            linearLayout.addView(this.icon, layoutParams2);
            this.statusTv = new TextView(context);
            this.statusTv.setTextColor(context.getResources().getColor(R.color.white));
            this.statusTv.setTextSize(2, 12.0f);
            linearLayout.addView(this.statusTv, -2, -2);
            addView(linearLayout, layoutParams);
        } catch (Exception e) {
            e.printStackTrace();
            ab.a(TAG, e.getMessage());
        }
    }

    private void initOpenPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25336014", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setOpenPlatformViewEvent(this);
        this.mTBLOpenPlatformView.setEnableCoverFade(true);
        this.mTBLOpenPlatformView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mTBLOpenPlatformView.setSubBusinessType("detail_mini_card");
        this.mTBLOpenPlatformView.setVideoLoop(false);
        this.mTBLOpenPlatformView.setEnableConsumePlayer(false);
    }

    private void initMediaConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d7e69d", new Object[]{this});
            return;
        }
        this.mConfigParams.put(MusLiveVideo.ATTR_MUTE, "true");
        this.mConfigParams.put("forceAutoPlay", "true");
    }

    public void bindData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde2ba22", new Object[]{this, jSONObject});
        } else if (this.mTBLOpenPlatformView == null) {
        } else {
            if (jSONObject.containsKey(aw.PARAM_COVER_IMG)) {
                this.mTBLOpenPlatformView.setImageUrl(jSONObject.getString(aw.PARAM_COVER_IMG));
            }
            String string = jSONObject.getString("product_type");
            jSONObject.put("playParams", (Object) generatePlayParams(jSONObject));
            jSONObject.putAll(this.mConfigParams);
            this.mTBLOpenPlatformView.setData(jSONObject);
            updateBottomView(string);
            this.mPlayTime = v.a(jSONObject.getString("playTime"), 300);
            this.mJumpUrl = jSONObject.getString("jumpUrl");
            if (jSONObject.containsKey(JTrackParams.TRACK_PARAMS)) {
                this.trackParams = q.a(jSONObject.getJSONObject(JTrackParams.TRACK_PARAMS));
            }
            Handler handler = this.handler;
            if (handler == null) {
                return;
            }
            handler.removeCallbacks(null);
            this.handler.postDelayed(this.mPlayComplete, TimeUnit.SECONDS.toMillis(this.mPlayTime));
        }
    }

    private JSONObject generatePlayParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6c072a9a", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.containsKey("liveUrlList")) {
            jSONObject2.put("liveUrlList", (Object) jSONObject.getJSONArray("liveUrlList"));
        }
        if (jSONObject.containsKey("feedId")) {
            jSONObject2.put("feedId", (Object) jSONObject.getString("feedId"));
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("queryParams", (Object) jSONObject2);
        if (jSONObject.containsKey("roomStatus")) {
            jSONObject3.put("roomStatus", (Object) jSONObject.getString("roomStatus"));
        }
        if (jSONObject.containsKey("product_type")) {
            jSONObject3.put("isTimeMove", (Object) (RecModel.MEDIA_TYPE_TIMEMOVE.equals(jSONObject.getString("product_type")) ? "true" : "false"));
        }
        if (jSONObject.containsKey("videoInfoType")) {
            jSONObject3.put("videoInfoType", (Object) jSONObject.getString("videoInfoType"));
        }
        if (jSONObject.containsKey("spfPlayVideo")) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("spfPlayVideo", (Object) jSONObject.getJSONObject("spfPlayVideo"));
            if (jSONObject.containsKey("videoInfoType") && "video".equals(jSONObject.getString("videoInfoType"))) {
                jSONObject3.put("videoInfo", (Object) jSONObject4);
            } else {
                jSONObject3.put("componentTimeMovingDTO", (Object) jSONObject4);
            }
        }
        return jSONObject3;
    }

    public void setMediaConfig(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793366c8", new Object[]{this, hashMap});
        } else {
            this.mConfigParams.putAll(hashMap);
        }
    }

    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.playVideo();
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.stopVideo();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.destroy();
        }
        this.proxy = null;
        this.proxyMethod = null;
        this.mConfigParams.clear();
        removeAllViews();
        Handler handler = this.handler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(this.mPlayComplete);
    }

    public void setProxy(Object obj, Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f08537", new Object[]{this, obj, method});
            return;
        }
        this.proxy = obj;
        this.proxyMethod = method;
    }

    private void updateBottomView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ad21aea", new Object[]{this, str});
        } else if (str == null) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2076614626) {
                if (hashCode == 3322092 && str.equals("live")) {
                    c = 1;
                }
            } else if (str.equals(RecModel.MEDIA_TYPE_TIMEMOVE)) {
                c = 0;
            }
            if (c == 0) {
                this.statusTv.setText(R.string.taolive_status_living_time_move);
                this.icon.setVisibility(0);
                return;
            }
            this.statusTv.setText(R.string.taolive_status_living);
            this.icon.setVisibility(0);
        }
    }

    @Override // com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView.a
    public void a(String str, String str2, String str3) {
        if (this.proxy != null && this.proxyMethod != null) {
            try {
                if ("TBL100005".equals(str2)) {
                    this.proxyMethod.invoke(this.proxy, str, "TBL100006", str3);
                    return;
                }
                this.proxyMethod.invoke(this.proxy, str, str2, str3);
            } catch (IllegalAccessException e) {
                ab.a(TAG, e.getMessage());
            } catch (InvocationTargetException e2) {
                ab.a(TAG, e2.getMessage());
            }
        }
        String str4 = TAG;
        ab.d(str4, "onEvent: type= " + str + " eventCode= " + str2 + " extra=" + str3);
    }

    private void trackOnClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f240ca5", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.mConfigParams.containsKey("item_id")) {
            hashMap.put("item_id", this.mConfigParams.get("item_id"));
        }
        if (this.mConfigParams.containsKey("seller_id")) {
            hashMap.put("seller_id", this.mConfigParams.get("seller_id"));
        }
        if (this.mConfigParams.containsKey("shop_id")) {
            hashMap.put("shop_id", this.mConfigParams.get("shop_id"));
        }
        if (this.mConfigParams.containsKey(b.PROPERTY_VIDEO_ID)) {
            hashMap.put(b.PROPERTY_VIDEO_ID, this.mConfigParams.get(b.PROPERTY_VIDEO_ID));
        }
        hashMap.put("detailVersion", "detailV3");
        HashMap<String, String> hashMap2 = this.trackParams;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Page_Detail", "Button_FloatingVideo");
        uTControlHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }
}
