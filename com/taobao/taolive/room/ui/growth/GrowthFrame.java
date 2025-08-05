package com.taobao.taolive.room.ui.growth;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.concurrent.TimeUnit;
import tb.aem;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.pqj;
import tb.tki;
import tb.xkw;

/* loaded from: classes8.dex */
public class GrowthFrame extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ORANGE_TAOLIVE_GROUP = "tblive";
    private static final String ORANGE_WATCH_DURATION_TRIGGER_SUBSCRIBE = "watchDurationTriggerSubscribe";
    private static final String TAG = "SubscribeFrame";
    private FrameLayout container;
    private final Handler mHandler;
    private final e mSubscribeSuccessListener;
    private Runnable queryGrowthRunnable;

    static {
        kge.a(218480953);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(GrowthFrame growthFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "GrowthFrame";
    }

    public static /* synthetic */ Runnable access$100(GrowthFrame growthFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("ecaac124", new Object[]{growthFrame}) : growthFrame.queryGrowthRunnable;
    }

    public static /* synthetic */ int access$200(GrowthFrame growthFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a6ae6d02", new Object[]{growthFrame})).intValue() : growthFrame.getWatchDurationTriggerSubscribe();
    }

    public static /* synthetic */ Handler access$300(GrowthFrame growthFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("95339858", new Object[]{growthFrame}) : growthFrame.mHandler;
    }

    public static /* synthetic */ FrameLayout access$400(GrowthFrame growthFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("c55f966c", new Object[]{growthFrame}) : growthFrame.container;
    }

    public static /* synthetic */ e access$600(GrowthFrame growthFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("331bcca4", new Object[]{growthFrame}) : growthFrame.mSubscribeSuccessListener;
    }

    public static /* synthetic */ String access$700(GrowthFrame growthFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1503f5a", new Object[]{growthFrame, jSONObject}) : growthFrame.getTrackArg1(jSONObject);
    }

    public GrowthFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mHandler = new Handler();
        this.queryGrowthRunnable = null;
        this.mSubscribeSuccessListener = new e();
        aem.a().a(this.mSubscribeSuccessListener);
    }

    private int getWatchDurationTriggerSubscribe() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("607dd159", new Object[]{this})).intValue() : v.a(pmd.a().d().a("tblive", ORANGE_WATCH_DURATION_TRIGGER_SUBSCRIBE, "10"), 10);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        String str = tBLiveDataModel.mInitParams.get("id");
        if (tBLiveDataModel.mVideoInfo != null && tBLiveDataModel.mVideoInfo.isOfficialType()) {
            str = tBLiveDataModel.mVideoInfo.liveId;
        }
        String str2 = str;
        String str3 = tBLiveDataModel.mInitParams.get("livesource");
        String str4 = tBLiveDataModel.mVideoInfo.broadCaster.accountId;
        int watchDurationTriggerSubscribe = getWatchDurationTriggerSubscribe();
        Runnable runnable = this.queryGrowthRunnable;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
        }
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (watchDurationTriggerSubscribe == -1) {
            return;
        }
        this.queryGrowthRunnable = new a(str2, str3, str4, this.mFrameContext);
        new Thread(new Runnable() { // from class: com.taobao.taolive.room.ui.growth.GrowthFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    GrowthFrame.access$300(GrowthFrame.this).postDelayed(GrowthFrame.access$100(GrowthFrame.this), TimeUnit.SECONDS.toMillis(GrowthFrame.access$200(GrowthFrame.this)));
                }
            }
        }, "queryGrowthThread").start();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_subscribe_next_live_dx;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        if (!(view instanceof FrameLayout)) {
            return;
        }
        this.container = (FrameLayout) view;
    }

    /* loaded from: classes8.dex */
    public final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final String c;
        private final String d;
        private final com.taobao.alilive.aliliveframework.frame.a e;
        private final d f;

        static {
            kge.a(1448815707);
            kge.a(-1390502639);
        }

        public static /* synthetic */ void a(a aVar, String str, Context context, FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29adff7e", new Object[]{aVar, str, context, frameLayout});
            } else {
                aVar.a(str, context, frameLayout);
            }
        }

        private void a(String str, Context context, FrameLayout frameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f572259", new Object[]{this, str, context, frameLayout});
                return;
            }
            JSONObject b = pqj.b(str);
            JSONObject jSONObject = b.getJSONObject(c.KEY_DATA_SOURCE);
            b.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) this.b);
            b.put("accountId", (Object) this.d);
            if (frameLayout == null || jSONObject == null || jSONObject.getBoolean("showPanel") == null || !jSONObject.getBoolean("showPanel").booleanValue()) {
                return;
            }
            if (frameLayout.getChildAt(0) != null && (frameLayout.getChildAt(0) instanceof DXRootView)) {
                com.taobao.taolive.room.dx.b.c().a((DXRootView) frameLayout.getChildAt(0), b);
            } else {
                DXRootView a2 = com.taobao.taolive.room.dx.b.c().a(context, b.getString("templateName"));
                com.taobao.taolive.room.dx.b.c().a(a2, b);
                frameLayout.addView(a2);
                GrowthFrame.access$600(GrowthFrame.this).a(a2);
                frameLayout.setPadding(0, 0, 0, com.taobao.taolive.sdk.utils.b.a(context, 8.0f));
            }
            com.taobao.taolive.room.ui.growth.a.a(this.e, GrowthFrame.access$700(GrowthFrame.this, jSONObject));
            GrowthFrame.access$600(GrowthFrame.this).a(this.e, b);
        }

        private a(String str, String str2, String str3, com.taobao.alilive.aliliveframework.frame.a aVar) {
            this.f = new d() { // from class: com.taobao.taolive.room.ui.growth.GrowthFrame.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    try {
                        FrameLayout access$400 = GrowthFrame.access$400(GrowthFrame.this);
                        Context context = access$400.getContext();
                        if (context == null) {
                            return;
                        }
                        a.a(a.this, netResponse.getDataJsonObject().toString(), context, access$400);
                    } catch (Throwable th) {
                        Log.e(GrowthFrame.TAG, th.toString());
                    }
                }
            };
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new com.taobao.taolive.room.business.growth.a(this.f).a(this.b, this.c);
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        ddw.a().a(this);
        if (this.mContainer == null || this.mContainer.getVisibility() != 8) {
            return;
        }
        this.mContainer.setVisibility(0);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_RANK_LIVE_HIDE_GROWTH_FRAME.equals(str) && this.mContainer != null) {
            this.mContainer.setVisibility(8);
        } else if (!xkw.EVENT_RANK_LIVE_QUERY_GROWTH_DATA.equals(str)) {
        } else {
            this.mHandler.post(this.queryGrowthRunnable);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_RANK_LIVE_HIDE_GROWTH_FRAME, xkw.EVENT_RANK_LIVE_QUERY_GROWTH_DATA};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (this.mFrameContext != null) {
            return this.mFrameContext.G();
        }
        return null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        release();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        aem.a().b(this.mSubscribeSuccessListener);
        release();
    }

    public void release() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        aem.a().b(this.mSubscribeSuccessListener);
        if (!tki.a() || (runnable = this.queryGrowthRunnable) == null) {
            return;
        }
        this.mHandler.removeCallbacks(runnable);
    }

    private String getTrackArg1(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e57dba47", new Object[]{this, jSONObject}) : (!jSONObject.containsKey("jumpParam") || !(jSONObject.get("jumpParam") instanceof JSONObject) || !jSONObject.getJSONObject("jumpParam").getBoolean("isSubscription").booleanValue()) ? "Show-appointment-module" : "Page_TaobaoLiveWatch_Show-small_card_subscribe";
    }
}
