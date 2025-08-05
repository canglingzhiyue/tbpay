package com.taobao.android.live.plugin.atype.flexalocal.rank;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aj;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.Map;
import tb.ddv;
import tb.hkm;
import tb.kge;
import tb.phg;
import tb.plx;
import tb.pqj;
import tb.xkw;

/* loaded from: classes6.dex */
public class RankFrame extends BaseFrame implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Rank";
    private com.taobao.taolive.sdk.business.b baseDetailBusiness;
    private boolean mFirstExp;
    private long mLastClickRankTs;
    private final d.a mMessageListener;
    private boolean mRankEnabled;
    private View mRankLayout;

    static {
        kge.a(1233595914);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(RankFrame rankFrame, String str, Object... objArr) {
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

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "FavorAnimView2";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-rank";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        }
    }

    public static /* synthetic */ long access$000(RankFrame rankFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5d539bd0", new Object[]{rankFrame})).longValue() : rankFrame.mLastClickRankTs;
    }

    public static /* synthetic */ long access$002(RankFrame rankFrame, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bee1179a", new Object[]{rankFrame, new Long(j)})).longValue();
        }
        rankFrame.mLastClickRankTs = j;
        return j;
    }

    public static /* synthetic */ void access$100(RankFrame rankFrame, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342e0373", new Object[]{rankFrame, jSONObject});
        } else {
            rankFrame.openRankPanel(jSONObject);
        }
    }

    public static /* synthetic */ void access$200(RankFrame rankFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ab025e", new Object[]{rankFrame});
        } else {
            rankFrame.startRankRequest();
        }
    }

    public static /* synthetic */ void access$300(RankFrame rankFrame, RankMTopResponseData rankMTopResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2c352c", new Object[]{rankFrame, rankMTopResponseData});
        } else {
            rankFrame.refreshRankUI(rankMTopResponseData);
        }
    }

    public static /* synthetic */ boolean access$400(RankFrame rankFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea0268e4", new Object[]{rankFrame})).booleanValue() : rankFrame.mRankEnabled;
    }

    public RankFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mFirstExp = true;
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.RankFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i != 3000 || !(obj instanceof String)) {
                } else {
                    RankMTopResponseData rankMTopResponseData = (RankMTopResponseData) pqj.a((String) obj, RankMTopResponseData.class);
                    plx.a(RankFrame.TAG, "refreshRankUI from pm, rankEnabled:" + RankFrame.access$400(RankFrame.this));
                    if (rankMTopResponseData == null) {
                        plx.b(RankFrame.TAG, "refreshRankUI msgData null");
                    } else if (!RankFrame.access$400(RankFrame.this)) {
                    } else {
                        RankFrame.access$300(RankFrame.this, rankMTopResponseData);
                    }
                }
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_frame_rank_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mRankLayout = view;
        this.mRankLayout.setVisibility(8);
        e.c("RankFrame: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
        if (!e.c() || !com.taobao.taolive.room.utils.d.a()) {
            return;
        }
        Context context = this.mContext;
        Toast.makeText(context, "RankFrame: remote = " + hkm.a(), 1).show();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        try {
            boolean z2 = tBLiveDataModel.mVideoInfo.admireInfo != null && tBLiveDataModel.mVideoInfo.admireInfo.contributionEnabled;
            boolean a2 = com.taobao.taolive.sdk.goodlist.d.a(tBLiveDataModel.mVideoInfo.itemTransferInfo);
            boolean z3 = TextUtils.equals(tBLiveDataModel.mVideoInfo.roomStatus, "1") && tBLiveDataModel.mVideoInfo.status != 1 && !tBLiveDataModel.mIsDiantaoTimeShift;
            if ((z2 || a2) && !isLandscape() && z3) {
                z = true;
            }
            this.mRankEnabled = z;
        } catch (Exception e) {
            e.printStackTrace();
            q.b(TAG, e.getMessage());
        }
        plx.b(TAG, "startRankRequest, rankEnabled:" + this.mRankEnabled);
        if (!this.mRankEnabled) {
            return;
        }
        startRankRequest();
        this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.RankFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
            public boolean filter(int i) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 3000;
            }
        });
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[0];
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
        View view = this.mRankLayout;
        if (view != null) {
            view.setVisibility(8);
        }
        this.mRankEnabled = false;
        this.mFirstExp = true;
        this.mLastClickRankTs = 0L;
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
        com.taobao.taolive.sdk.business.b bVar = this.baseDetailBusiness;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    private void refreshRankUI(final RankMTopResponseData rankMTopResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c0cd69", new Object[]{this, rankMTopResponseData});
            return;
        }
        inflateViewOnNeed();
        if (rankMTopResponseData.rankUsers != null && rankMTopResponseData.rankUsers.size() > 0 && this.mRankLayout != null) {
            if (this.mFirstExp) {
                phg.a().a(this.mFrameContext, "OnlineRank", new HashMap<>());
            }
            this.mFirstExp = false;
            this.mRankLayout.setVisibility(0);
            this.mRankLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.RankFrame.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - RankFrame.access$000(RankFrame.this) < 2000) {
                        q.d(RankFrame.TAG, "duplicate click");
                        return;
                    }
                    RankFrame.access$002(RankFrame.this, currentTimeMillis);
                    RankFrame.access$100(RankFrame.this, rankMTopResponseData.jumpInfo);
                    RankFrame.access$200(RankFrame.this);
                }
            });
            FrameLayout frameLayout = (FrameLayout) this.mRankLayout.findViewById(R.id.layout_rank_num);
            int a2 = com.taobao.taolive.room.utils.d.a(this.mContext, 23.0f);
            FrameLayout frameLayout2 = (FrameLayout) this.mRankLayout.findViewById(R.id.layout_rank_user3);
            AliUrlImageView aliUrlImageView = (AliUrlImageView) this.mRankLayout.findViewById(R.id.iv_rank_user3);
            int i = a2 / 2;
            aliUrlImageView.setRoundeCornerView(a2, a2, i, 0, 0);
            FrameLayout frameLayout3 = (FrameLayout) this.mRankLayout.findViewById(R.id.layout_rank_user2);
            AliUrlImageView aliUrlImageView2 = (AliUrlImageView) this.mRankLayout.findViewById(R.id.iv_rank_user2);
            aliUrlImageView2.setRoundeCornerView(a2, a2, i, 0, 0);
            FrameLayout frameLayout4 = (FrameLayout) this.mRankLayout.findViewById(R.id.layout_rank_user1);
            AliUrlImageView aliUrlImageView3 = (AliUrlImageView) this.mRankLayout.findViewById(R.id.iv_rank_user1);
            aliUrlImageView3.setRoundeCornerView(a2, a2, i, 0, 0);
            if (rankMTopResponseData.rankUsers.size() == 1) {
                frameLayout2.setVisibility(8);
                frameLayout3.setVisibility(8);
                frameLayout4.setVisibility(0);
                aliUrlImageView3.setPlaceHolder(R.drawable.taolive_rank_default_avatar_flexalocal);
                aliUrlImageView3.setImageUrl(rankMTopResponseData.rankUsers.get(0).headImg);
                frameLayout.setVisibility(0);
                return;
            } else if (rankMTopResponseData.rankUsers.size() == 2) {
                frameLayout2.setVisibility(8);
                frameLayout3.setVisibility(0);
                frameLayout4.setVisibility(0);
                aliUrlImageView3.setPlaceHolder(R.drawable.taolive_rank_default_avatar_flexalocal);
                aliUrlImageView3.setImageUrl(rankMTopResponseData.rankUsers.get(0).headImg);
                aliUrlImageView2.setPlaceHolder(R.drawable.taolive_rank_default_avatar_flexalocal);
                aliUrlImageView2.setImageUrl(rankMTopResponseData.rankUsers.get(1).headImg);
                frameLayout.setVisibility(8);
                return;
            } else if (rankMTopResponseData.rankUsers.size() < 3) {
                return;
            } else {
                frameLayout2.setVisibility(0);
                frameLayout3.setVisibility(0);
                frameLayout4.setVisibility(0);
                aliUrlImageView3.setPlaceHolder(R.drawable.taolive_rank_default_avatar_flexalocal);
                aliUrlImageView3.setImageUrl(rankMTopResponseData.rankUsers.get(0).headImg);
                aliUrlImageView2.setPlaceHolder(R.drawable.taolive_rank_default_avatar_flexalocal);
                aliUrlImageView2.setImageUrl(rankMTopResponseData.rankUsers.get(1).headImg);
                aliUrlImageView.setPlaceHolder(R.drawable.taolive_rank_default_avatar_flexalocal);
                aliUrlImageView.setImageUrl(rankMTopResponseData.rankUsers.get(2).headImg);
                frameLayout.setVisibility(8);
                return;
            }
        }
        View view = this.mRankLayout;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private void openRankPanel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d7fdfb", new Object[]{this, jSONObject});
            return;
        }
        q.a(TAG, "open rank page");
        if (phg.d().b() == 1) {
            aj.a(this.mContext, "打开贡献榜");
        }
        this.mFrameContext.e().a(xkw.EVENT_HANDLE_JUMP_INFO, jSONObject, observeUniqueIdentification());
        phg.a().a(this.mFrameContext, "OnlineRank", (Map<String, String>) new HashMap());
    }

    private void startRankRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ae4308", new Object[]{this});
            return;
        }
        RankMTopRequest rankMTopRequest = new RankMTopRequest();
        rankMTopRequest.liveId = this.mLiveDataModel.mVideoInfo.liveId;
        this.baseDetailBusiness = new com.taobao.taolive.sdk.business.b(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.rank.RankFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (!(netBaseOutDo instanceof RankMTopResponse)) {
                    plx.b(RankFrame.TAG, "netBaseOutDo not RankMTopResponse");
                } else {
                    RankMTopResponse rankMTopResponse = (RankMTopResponse) netBaseOutDo;
                    if (rankMTopResponse.data != null) {
                        plx.b(RankFrame.TAG, "refreshRankUI from network");
                        RankFrame.access$300(RankFrame.this, rankMTopResponse.data);
                        return;
                    }
                    plx.b(RankFrame.TAG, "response.data null");
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                plx.b(RankFrame.TAG, "onError, i:" + i + ", netResponse:" + netResponse + ", o:" + obj);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                plx.b(RankFrame.TAG, "onSystemError, i:" + i + ", netResponse:" + netResponse + ", o:" + obj);
            }
        });
        this.baseDetailBusiness.a(1, rankMTopRequest, RankMTopResponse.class);
    }
}
