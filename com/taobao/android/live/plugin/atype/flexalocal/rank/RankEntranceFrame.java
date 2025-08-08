package com.taobao.android.live.plugin.atype.flexalocal.rank;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.giftwish.GiftWishFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.q;
import tb.ddv;
import tb.ddw;
import tb.hkk;
import tb.hkm;
import tb.kge;
import tb.phg;
import tb.phj;
import tb.phq;
import tb.pqj;
import tb.xkw;

/* loaded from: classes6.dex */
public class RankEntranceFrame extends BaseFrame implements com.taobao.taolive.sdk.core.c, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_TEMPLATE_DEFAULT = "taolive_rank_entrance";
    public static final String RANK_ENTRANCE_TAG = "RankEntranceFrame";
    public static final String TAG = "RankEntranceFrame";
    private final boolean enableShowRankLiveEntrance;
    private GiftWishFrame giftWishFrame;
    private boolean isShowRank;
    private FrameLayout rankRootView;

    static {
        kge.a(627443700);
        kge.a(191318335);
        kge.a(947087257);
    }

    public static /* synthetic */ Object ipc$super(RankEntranceFrame rankEntranceFrame, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "FavorAnimView2";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "RankEntranceFrame";
    }

    public static /* synthetic */ void access$000(RankEntranceFrame rankEntranceFrame, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed5d5f33", new Object[]{rankEntranceFrame, dXRootView});
        } else {
            rankEntranceFrame.replaceViewInLayout(dXRootView);
        }
    }

    public static /* synthetic */ void access$100(RankEntranceFrame rankEntranceFrame, DXRootView dXRootView, JSONArray jSONArray, phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb5c55a", new Object[]{rankEntranceFrame, dXRootView, jSONArray, phjVar});
        } else {
            rankEntranceFrame.renderRankDxView(dXRootView, jSONArray, phjVar);
        }
    }

    public RankEntranceFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.isShowRank = false;
        this.enableShowRankLiveEntrance = hkk.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            return;
        }
        c.f14001a = tBLiveDataModel.mVideoInfo.liveId;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_rank_live_entrance_dx_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        if (view instanceof LinearLayout) {
            this.rankRootView = (FrameLayout) view.findViewById(R.id.talive_rank_banner_rootView);
        }
        if (this.giftWishFrame == null) {
            this.giftWishFrame = new GiftWishFrame(this.mContext, this.mFrameContext);
            this.giftWishFrame.createView((ViewStub) findViewById(R.id.taolive_gift_banner_layout));
            addComponent(this.giftWishFrame);
        }
        e.c("RankEntranceFrame: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
        if (!a.a().booleanValue() || !this.enableShowRankLiveEntrance) {
            return;
        }
        this.mFrameContext.f().registerMessageListener(this, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.RankEntranceFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : 880000249 == i;
            }
        });
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
        this.isShowRank = false;
        ddw.a().a(this);
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
        if (a.a().booleanValue()) {
            this.mFrameContext.f().unRegisterMessageListener(this);
        }
        super.onDestroy();
        release();
    }

    @Override // tb.ddv
    public void onEvent(String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (xkw.EVENT_RANK_LIVE_ENTRANCE_DATA.equals(str)) {
            if (!this.enableShowRankLiveEntrance) {
                return;
            }
            q.b("RankEntranceFrame", "onEvent: " + obj);
            if (!(obj instanceof JSONObject)) {
                return;
            }
            final JSONArray jSONArray = ((JSONObject) obj).getJSONArray(b.KEY_BANNER_DATA);
            if (jSONArray == null || jSONArray.isEmpty()) {
                q.b("RankEntranceFrame", "onEvent: renderDX error: rankLiveEntranceArrayObj is empty!");
                return;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            if (jSONObject == null) {
                q.b("RankEntranceFrame", "onEvent: renderDX error: rankLiveEntranceObj is null!");
                return;
            }
            String string = jSONObject.getString("templateName");
            if (StringUtils.isEmpty(string)) {
                q.b("RankEntranceFrame", "onEvent: renderDX error: templateName is null!");
                return;
            }
            if (this.isShowRank) {
                if (!(this.rankRootView.findViewById(R.id.rank_entrance_view) instanceof DXRootView)) {
                    return;
                }
                if (((DXRootView) this.rankRootView.findViewById(R.id.rank_entrance_view)).getData() != null && ((DXRootView) this.rankRootView.findViewById(R.id.rank_entrance_view)).getData().equals(jSONObject)) {
                    return;
                }
            }
            this.isShowRank = true;
            q.b("RankEntranceFrame", "onEvent: renderDX" + obj);
            final phj g = phg.g();
            if (g == null) {
                q.b("RankEntranceFrame", "onEvent: dxRenderEngine is null!");
            } else {
                g.a(this.mContext, string, new phj.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.-$$Lambda$RankEntranceFrame$M56fEb4SVeHSZFY8F1e4-z8zNPc
                    @Override // tb.phj.a
                    public final void onCreateView(DXRootView dXRootView) {
                        RankEntranceFrame.this.lambda$onEvent$23$RankEntranceFrame(jSONArray, g, dXRootView);
                    }
                });
            }
        } else if (b.EVENT_REFRESH_DX.equals(str) && (obj instanceof JSONArray)) {
            if (this.rankRootView == null) {
                return;
            }
            final phj g2 = phg.g();
            g2.a(this.mContext, DX_TEMPLATE_DEFAULT, new phj.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.-$$Lambda$RankEntranceFrame$GvIALDZN2YLKYYM9PSA7cskf0bI
                @Override // tb.phj.a
                public final void onCreateView(DXRootView dXRootView) {
                    RankEntranceFrame.this.lambda$onEvent$24$RankEntranceFrame(obj, g2, dXRootView);
                }
            });
        } else if (!b.EVENT_BANNER_PRERENDER.equals(str) || !(obj instanceof JSONObject)) {
        } else {
            String string2 = ((JSONObject) obj).getString("url");
            if (!(this.mFrameContext instanceof phq)) {
                return;
            }
            ((phq) this.mFrameContext).p().b(string2);
        }
    }

    public /* synthetic */ void lambda$onEvent$23$RankEntranceFrame(JSONArray jSONArray, phj phjVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830e0df5", new Object[]{this, jSONArray, phjVar, dXRootView});
        } else {
            renderRankDxView(dXRootView, jSONArray, phjVar);
        }
    }

    public /* synthetic */ void lambda$onEvent$24$RankEntranceFrame(Object obj, phj phjVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a425d06a", new Object[]{this, obj, phjVar, dXRootView});
            return;
        }
        replaceViewInLayout(dXRootView);
        renderRankDxView(dXRootView, (JSONArray) obj, phjVar);
    }

    private void renderRankDxView(DXRootView dXRootView, JSONArray jSONArray, phj phjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c42db49", new Object[]{this, dXRootView, jSONArray, phjVar});
        } else if (dXRootView == null) {
            q.b("RankEntranceFrame", "onEvent: rankEntranceView is null!");
        } else {
            dXRootView.setId(R.id.rank_entrance_view);
            FrameLayout frameLayout = this.rankRootView;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b.KEY_BANNER_DATA, (Object) jSONArray);
            phjVar.a(dXRootView, jSONObject);
            this.rankRootView.addView(dXRootView);
            this.rankRootView.setPadding(0, 0, com.taobao.taolive.sdk.utils.b.a(this.mContext, 7.0f), com.taobao.taolive.sdk.utils.b.a(this.mContext, 8.0f));
            ddw.a().a(xkw.EVENT_RANK_LIVE_HIDE_GROWTH_FRAME, null, observeUniqueIdentification());
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{xkw.EVENT_RANK_LIVE_ENTRANCE_DATA, b.EVENT_REFRESH_DX, b.EVENT_BANNER_PRERENDER};
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

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.rankRootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        ddw.a().b(this);
        c.f14001a = "";
    }

    @Override // com.taobao.taolive.sdk.core.c
    public void onMessageReceived(int i, Object obj) {
        final JSONArray jSONArray;
        final phj g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
        } else if (!(obj instanceof String) || (jSONArray = pqj.b((String) obj).getJSONArray(b.KEY_BANNER_DATA)) == null || jSONArray.isEmpty() || (g = phg.g()) == null) {
        } else {
            g.a(this.mContext, DX_TEMPLATE_DEFAULT, new phj.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.RankEntranceFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.phj.a
                public void onCreateView(DXRootView dXRootView) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                        return;
                    }
                    RankEntranceFrame.access$000(RankEntranceFrame.this, dXRootView);
                    RankEntranceFrame.access$100(RankEntranceFrame.this, dXRootView, jSONArray, g);
                }
            });
        }
    }

    private void replaceViewInLayout(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbae2250", new Object[]{this, dXRootView});
            return;
        }
        FrameLayout frameLayout = this.rankRootView;
        if (frameLayout != null && (frameLayout.findViewById(R.id.rank_entrance_view) instanceof DXRootView)) {
            DXRootView dXRootView2 = (DXRootView) this.rankRootView.findViewById(R.id.rank_entrance_view);
            i = this.rankRootView.indexOfChild(dXRootView2);
            this.rankRootView.removeView(dXRootView2);
        }
        FrameLayout frameLayout2 = this.rankRootView;
        if (frameLayout2 == null) {
            return;
        }
        frameLayout2.addView(dXRootView, i);
    }
}
