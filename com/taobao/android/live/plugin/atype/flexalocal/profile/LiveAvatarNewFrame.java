package com.taobao.android.live.plugin.atype.flexalocal.profile;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.utils.aj;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.tbliveinteractive.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import tb.ddv;
import tb.ddw;
import tb.hkk;
import tb.jzn;
import tb.kge;
import tb.kpj;
import tb.phg;
import tb.phq;
import tb.pmd;
import tb.pmt;
import tb.pmv;
import tb.pmw;
import tb.pmx;
import tb.pmy;
import tb.pmz;
import tb.pna;
import tb.pnb;
import tb.pqe;
import tb.pqk;
import tb.sgr;
import tb.xkw;

/* loaded from: classes6.dex */
public class LiveAvatarNewFrame extends BaseFrame implements d, ddv, sgr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LIVE_AVATAR_ACCOUNT_ID = "accountId";
    public static final String LIVE_AVATAR_ENCODE_ACCOUNT_ID = "encodeAccountId";
    public static final String LIVE_AVATAR_LIVE_ID = "liveId";
    public static final String LIVE_AVATAR_SOURCE_TYPE = "sourceType";
    private static final String LIVE_AVATAR_SOURCE_TYPE_LIVE = "live";
    private static final String TAG = "LiveAvatarNewFrame";
    private pmx followChangeListener;
    private b mBusiness;
    private View mCardRootView;
    public View mCover;
    private View mCoverView;
    private LiveAvatarInfoCardResponseData mData;
    private TBLiveDataModel mDataModel;
    private String mExternalAccountId;
    private String mExternalEncodeAccountId;
    private String mExternalLiveId;
    public com.taobao.android.live.plugin.atype.flexalocal.profile.joingroup.a mJoinGroupBusiness;
    private LiveAvatarNewView mLiveAvatarNewView;
    private Handler mMainHandler;
    private boolean mNeedDegree;
    private String mSourceType;
    private ViewStub mViewStub;
    private boolean widgetInstalled;

    static {
        kge.a(-1678556124);
        kge.a(191318335);
        kge.a(-797454141);
        kge.a(1522751733);
    }

    public static /* synthetic */ Object ipc$super(LiveAvatarNewFrame liveAvatarNewFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -340027132:
                super.show();
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    public static /* synthetic */ LiveAvatarInfoCardResponseData access$000(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveAvatarInfoCardResponseData) ipChange.ipc$dispatch("f22d4543", new Object[]{liveAvatarNewFrame}) : liveAvatarNewFrame.mData;
    }

    public static /* synthetic */ LiveAvatarNewView access$100(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveAvatarNewView) ipChange.ipc$dispatch("e79a8de6", new Object[]{liveAvatarNewFrame}) : liveAvatarNewFrame.mLiveAvatarNewView;
    }

    public static /* synthetic */ String access$200(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16cc0f1c", new Object[]{liveAvatarNewFrame}) : liveAvatarNewFrame.getAccountId();
    }

    public static /* synthetic */ String access$300(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cf58cf7b", new Object[]{liveAvatarNewFrame}) : liveAvatarNewFrame.getLiveId();
    }

    public static /* synthetic */ String access$400(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87e58fda", new Object[]{liveAvatarNewFrame}) : liveAvatarNewFrame.mSourceType;
    }

    public static /* synthetic */ void access$500(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aabb47", new Object[]{liveAvatarNewFrame});
        } else {
            liveAvatarNewFrame.resetView();
        }
    }

    public static /* synthetic */ boolean access$600(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae26950c", new Object[]{liveAvatarNewFrame})).booleanValue() : liveAvatarNewFrame.widgetInstalled;
    }

    public static /* synthetic */ boolean access$602(LiveAvatarNewFrame liveAvatarNewFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("740f930e", new Object[]{liveAvatarNewFrame, new Boolean(z)})).booleanValue();
        }
        liveAvatarNewFrame.widgetInstalled = z;
        return z;
    }

    public static /* synthetic */ void access$700(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55a26ec9", new Object[]{liveAvatarNewFrame});
        } else {
            liveAvatarNewFrame.updateView();
        }
    }

    public static /* synthetic */ void access$800(LiveAvatarNewFrame liveAvatarNewFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1e488a", new Object[]{liveAvatarNewFrame});
        } else {
            liveAvatarNewFrame.showProfileTrack();
        }
    }

    private void joinGroupOrJumpGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13719a0", new Object[]{this});
            return;
        }
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData = this.mData;
        if (liveAvatarInfoCardResponseData == null || liveAvatarInfoCardResponseData.chatGroupInfo == null) {
            return;
        }
        c.c(this.mFrameContext, this.mSourceType, isFollow());
        if (StringUtils.equals(this.mData.chatGroupInfo.isInChatGroup, "true")) {
            if (StringUtils.isEmpty(this.mData.chatGroupInfo.chatGroupID)) {
                return;
            }
            Context context = this.mContext;
            s.a(context, "//tb.cn/n/im/chat?sessionid=" + this.mData.chatGroupInfo.chatGroupID);
            hide();
            return;
        }
        if (this.mJoinGroupBusiness == null) {
            this.mJoinGroupBusiness = new com.taobao.android.live.plugin.atype.flexalocal.profile.joingroup.a(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    aj.a(LiveAvatarNewFrame.this.mContext, "加群成功，空闲时多回来唠嗑吧");
                    if (LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this) == null || LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).chatGroupInfo == null) {
                        return;
                    }
                    LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).chatGroupInfo.isInChatGroup = "true";
                    try {
                        LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).chatGroupInfo.chatGroupID = netResponse.getDataJsonObject().getJSONObject("value").getString("groupId");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    if (LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this) == null) {
                        return;
                    }
                    LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this).refreshTopUi(LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this), false);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onSystemError(i, netResponse, obj);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    String str = "加群失败，请重试";
                    if (netResponse != null) {
                        str = netResponse.getRetMsg() + "," + str;
                    }
                    aj.a(LiveAvatarNewFrame.this.mContext, str);
                }
            });
        }
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData2 = this.mData;
        if (liveAvatarInfoCardResponseData2 == null || liveAvatarInfoCardResponseData2.chatGroupInfo == null) {
            return;
        }
        this.mJoinGroupBusiness.a(this.mData.chatGroupInfo.chatGroupID);
    }

    private void gotoUnFollowAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8669ec9", new Object[]{this});
            return;
        }
        pqk pqkVar = new pqk(this.mContext, R.style.TLLive_Permission_Dialog_AType);
        pqkVar.a(this.mContext.getString(R.string.taolive_personal_unfollow_dialog_title_flexalocal));
        if (this.mData.topFollow) {
            pqkVar.b(this.mContext.getString(R.string.taolive_personal_unfollow_dialog_content_flexalocal));
        }
        pqkVar.a(this.mContext.getString(R.string.taolive_personal_unfollow_pos_tv_flexalocal), new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                pmt pmtVar = new pmt();
                pmtVar.f32764a = String.valueOf(LiveAvatarNewFrame.access$200(LiveAvatarNewFrame.this));
                pmtVar.c = LiveAvatarNewFrame.access$300(LiveAvatarNewFrame.this);
                pmd.a().B().b(pmtVar, new pmv() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.pmv
                    public void a(pmz pmzVar) {
                        IpChange ipChange3 = $ipChange;
                        boolean z = true;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                            return;
                        }
                        if (LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this) != null) {
                            LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this).refreshFollowStatus(false);
                        }
                        if (hkk.a(LiveAvatarNewFrame.this.mFrameContext)) {
                            aj.a(LiveAvatarNewFrame.this.mContext, ((pnb) pmzVar).f32768a, false);
                        } else {
                            aj.a(LiveAvatarNewFrame.this.mContext, ((pnb) pmzVar).f32768a);
                        }
                        ddw.a().a(xkw.EVENT_ACTION_UNFOLLOW, String.valueOf(LiveAvatarNewFrame.access$200(LiveAvatarNewFrame.this)), LiveAvatarNewFrame.this.mFrameContext == null ? null : LiveAvatarNewFrame.this.mFrameContext.G());
                        com.taobao.alilive.aliliveframework.frame.a aVar = LiveAvatarNewFrame.this.mFrameContext;
                        String access$400 = LiveAvatarNewFrame.access$400(LiveAvatarNewFrame.this);
                        if (LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).anchorTags == null || LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).anchorTags.size() <= 0) {
                            z = false;
                        }
                        c.b(aVar, access$400, z);
                    }

                    @Override // tb.pmv
                    public void a(String str, String str2) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                        } else {
                            aj.a(LiveAvatarNewFrame.this.mContext, "取消关注失败，请重试");
                        }
                    }
                });
            }
        }).b(this.mContext.getString(R.string.taolive_personal_unfollow_nag_tv_flexalocal), new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                }
            }
        });
        pqkVar.show();
    }

    private void gotoFollowAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6272d0", new Object[]{this});
            return;
        }
        pmt buildFollowParams = buildFollowParams();
        if (buildFollowParams == null) {
            return;
        }
        buildFollowParams.p = "live";
        pmd.a().B().a(buildFollowParams, new pmv() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmv
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                }
            }

            @Override // tb.pmv
            public void a(pmz pmzVar) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                    return;
                }
                if (hkk.a(LiveAvatarNewFrame.this.mFrameContext)) {
                    aj.a(LiveAvatarNewFrame.this.mContext, ((pmy) pmzVar).f32766a, true);
                } else {
                    aj.a(LiveAvatarNewFrame.this.mContext, ((pmy) pmzVar).f32766a);
                }
                ddw.a().a(xkw.EVENT_ACTION_FOLLOW, String.valueOf(LiveAvatarNewFrame.access$200(LiveAvatarNewFrame.this)), LiveAvatarNewFrame.this.mFrameContext == null ? null : LiveAvatarNewFrame.this.mFrameContext.G());
                com.taobao.alilive.aliliveframework.frame.a aVar = LiveAvatarNewFrame.this.mFrameContext;
                String access$400 = LiveAvatarNewFrame.access$400(LiveAvatarNewFrame.this);
                if (LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).anchorTags != null && LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this).anchorTags.size() > 0) {
                    z = true;
                }
                c.a(aVar, access$400, z);
                jzn.a(LiveAvatarNewFrame.this.mFrameContext, "follow", 0L);
            }
        });
    }

    private void checkFollowFormMtop(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b753ef76", new Object[]{this, str});
            return;
        }
        pmt pmtVar = new pmt();
        pmtVar.f32764a = str;
        if (pmd.a().B() == null) {
            return;
        }
        pmd.a().B().c(pmtVar, new pmv() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmv
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                }
            }

            @Override // tb.pmv
            public void a(pmz pmzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                } else if (!(pmzVar instanceof pna)) {
                } else {
                    boolean z = ((pna) pmzVar).f32767a;
                    HashMap hashMap = new HashMap();
                    hashMap.put("accountId", str);
                    hashMap.put("accountType", null);
                    hashMap.put("followSource", null);
                    if (LiveAvatarNewFrame.this.mFrameContext == null || LiveAvatarNewFrame.this.mFrameContext.z() == null || LiveAvatarNewFrame.this.mFrameContext.z().f() == null || !(LiveAvatarNewFrame.this.mFrameContext.z().f() instanceof ATaoLiveOpenEntity)) {
                        return;
                    }
                    if (z) {
                        ((ATaoLiveOpenEntity) LiveAvatarNewFrame.this.mFrameContext.z().f()).accessListener(AccessListenerEnum.onFollowAction, hashMap);
                    } else {
                        ((ATaoLiveOpenEntity) LiveAvatarNewFrame.this.mFrameContext.z().f()).accessListener(AccessListenerEnum.onUnfollowAciton, hashMap);
                    }
                }
            }
        });
    }

    public boolean isFollow() {
        pmt buildFollowParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8867c86", new Object[]{this})).booleanValue();
        }
        if (this.mLiveDataModel != null && (buildFollowParams = buildFollowParams()) != null) {
            return pmd.a().B().a(buildFollowParams);
        }
        return false;
    }

    private pmt buildFollowParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmt) ipChange.ipc$dispatch("f9a4f5a3", new Object[]{this});
        }
        pmt pmtVar = new pmt();
        pmtVar.f32764a = getAccountId();
        pmtVar.c = getLiveId();
        if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null) {
            pmtVar.b = this.mLiveDataModel.mVideoInfo.broadCaster.type;
        }
        if (this.mLiveDataModel != null && this.mLiveDataModel.mFandomInfo != null && this.mLiveDataModel.mFandomInfo.broadCaster != null) {
            pmtVar.b = this.mLiveDataModel.mFandomInfo.broadCaster.type;
        }
        return pmtVar;
    }

    private String getLiveId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.mExternalLiveId)) {
            return this.mExternalLiveId;
        }
        if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null) {
            return this.mLiveDataModel.mVideoInfo.liveId;
        }
        return null;
    }

    public LiveAvatarNewFrame(Context context) {
        super(context);
        this.mNeedDegree = true;
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    public LiveAvatarNewFrame(Context context, boolean z) {
        super(context, z);
        this.mNeedDegree = true;
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    public LiveAvatarNewFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mNeedDegree = true;
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    public LiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
        this.mNeedDegree = true;
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    public LiveAvatarNewFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mNeedDegree = true;
        this.mMainHandler = new Handler(Looper.getMainLooper());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.mContainer = view;
        this.mCardRootView = view.findViewById(R.id.taolive_avatar_card_detail_container_new);
        this.mCoverView = view.findViewById(R.id.taolive_avatar_card_cover_new);
        if (view instanceof ViewGroup) {
            if (this.mLandscape) {
                this.mLiveAvatarNewView = new LiveAvatarNewView(this.mFrameContext, isLandscape(), this.mContext, (ViewGroup) this.mCardRootView, this.mLiveDataModel, this.mCoverView);
            } else {
                this.mLiveAvatarNewView = new LiveAvatarNewView(this.mFrameContext, isLandscape(), this.mContext, (ViewGroup) this.mCardRootView, this.mLiveDataModel, this.mCoverView);
            }
        }
        if (!y.a() || !y.e(this.mContext)) {
            return;
        }
        y.a(this);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        ddw.a().a(this);
        this.followChangeListener = new pmx() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pmx
            public void onFollowChange(pmw pmwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a82c75dd", new Object[]{this, pmwVar});
                } else if (pmwVar == null || StringUtils.isEmpty(pmwVar.f32765a) || !StringUtils.equals(pmwVar.f32765a, LiveAvatarNewFrame.access$200(LiveAvatarNewFrame.this)) || LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this) == null) {
                } else {
                    LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this).refreshFollowStatus(pmwVar.b);
                }
            }
        };
        pmd.a().B().a(this.followChangeListener);
    }

    private String getAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.mExternalAccountId)) {
            return this.mExternalAccountId;
        }
        if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null) {
            return this.mLiveDataModel.mVideoInfo.broadCaster.accountId;
        }
        if (this.mLiveDataModel != null && this.mLiveDataModel.mFandomInfo != null && this.mLiveDataModel.mFandomInfo.broadCaster != null) {
            return this.mLiveDataModel.mFandomInfo.broadCaster.accountId;
        }
        return null;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        LiveAvatarNewView liveAvatarNewView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (tBLiveDataModel != null && (liveAvatarNewView = this.mLiveAvatarNewView) != null) {
            liveAvatarNewView.onDataReceived(tBLiveDataModel);
        }
        init();
        this.mDataModel = tBLiveDataModel;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public boolean createView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f881d80", new Object[]{this, viewStub})).booleanValue();
        }
        this.mViewStub = viewStub;
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_new_avatar_card_container_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView != null && !liveAvatarNewView.isShowing()) {
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        if (this.mContainer != null) {
            this.mContainer.setVisibility(0);
        }
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView == null) {
            return;
        }
        liveAvatarNewView.show();
        showProfileTrack();
    }

    private void showProfileTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fdc1c6", new Object[]{this});
            return;
        }
        c.a(this.mFrameContext, isFollow(), this.mSourceType, this.mData.anchorTags != null && this.mData.anchorTags.size() > 0, kpj.b(this.mFrameContext, this.mLiveDataModel) && isFollow(), this.widgetInstalled);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        if (this.mContainer != null) {
            this.mContainer.setVisibility(8);
        }
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView == null) {
            return;
        }
        liveAvatarNewView.hide();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ddw.a().b(this);
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView != null) {
            liveAvatarNewView.destroy();
        }
        if (hkk.ai()) {
            View view = this.mCardRootView;
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).removeAllViews();
            }
        }
        pmd.a().B().b(this.followChangeListener);
        com.taobao.android.live.plugin.atype.flexalocal.profile.joingroup.a aVar = this.mJoinGroupBusiness;
        if (aVar != null) {
            aVar.a();
            this.mJoinGroupBusiness = null;
        }
        if (!y.a() || !y.e(this.mContext)) {
            return;
        }
        y.b(this);
    }

    private void inflateViewOnRequired() {
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac79091", new Object[]{this});
            return;
        }
        ViewStub viewStub = this.mViewStub;
        if (viewStub == null || !(viewStub.getParent() instanceof ViewGroup)) {
            return;
        }
        this.mViewStub.setLayoutResource(getLayoutResId());
        this.mContainer = this.mViewStub.inflate();
        onViewCreated(this.mContainer);
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView == null || (tBLiveDataModel = this.mDataModel) == null) {
            return;
        }
        liveAvatarNewView.onDataReceived(tBLiveDataModel);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        e p;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        inflateViewOnRequired();
        if ("com.taobao.taolive.room.avatar_card_show".equals(str)) {
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LiveAvatarNewFrame.access$500(LiveAvatarNewFrame.this);
                    }
                }
            });
            this.mExternalAccountId = null;
            this.mExternalLiveId = null;
            this.mExternalEncodeAccountId = null;
            if (hkk.aw() && this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null && !com.taobao.android.live.plugin.atype.flexalocal.officialLive.b.a().a(this.mLiveDataModel.mVideoInfo) && this.mLiveDataModel.mVideoInfo.broadCaster.profileJumpConfig != null && this.mLiveDataModel.mVideoInfo.broadCaster.profileJumpConfig.containsKey("jumpUrl") && ((phg.d().a() || (this.mFrameContext != null && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(this.mFrameContext.n.bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.mFrameContext.n.bizCode))) && (((phg.d().a() && this.mFrameContext.i().b() != VideoStatus.VIDEO_TIMESHIFT_STATUS) || (!phg.d().a() && com.taobao.taolive.sdk.playcontrol.c.i(this.mFrameContext) != VideoStatus.VIDEO_TIMESHIFT_STATUS)) && !y.b(this.mContext) && !y.c(this.mContext) && !isLandscape()))) {
                Map<String, String> map = this.mLiveDataModel.mVideoInfo.broadCaster.profileJumpConfig;
                Map<String, Object> jSONObject = new JSONObject();
                jSONObject.put("componentName", (Object) "tblive-base-openWebview");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("jumpUrl", (Object) map.get("jumpUrl"));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.putAll(map);
                jSONObject2.put("options", (Object) jSONObject3);
                jSONObject.put("data", (Object) jSONObject2);
                if (this.mFrameContext == null) {
                    this.mFrameContext = n.a();
                }
                q.b(TAG, "need jump to mix profile: " + map);
                if (!(this.mFrameContext instanceof phq) || (p = ((phq) this.mFrameContext).p()) == null) {
                    return;
                }
                p.a("TBLiveWVPlugin.Event.openComponent", jSONObject);
            } else if (obj instanceof JSONObject) {
                JSONObject jSONObject4 = (JSONObject) obj;
                if (jSONObject4.containsKey("accountId") && jSONObject4.containsKey(LIVE_AVATAR_LIVE_ID)) {
                    this.mExternalAccountId = jSONObject4.getString("accountId");
                    this.mExternalEncodeAccountId = jSONObject4.getString(LIVE_AVATAR_ENCODE_ACCOUNT_ID);
                    this.mExternalLiveId = jSONObject4.getString(LIVE_AVATAR_LIVE_ID);
                    requestWithAccountId(this.mExternalLiveId, this.mExternalAccountId, this.mExternalEncodeAccountId, jSONObject4.getString("sourceType"));
                    return;
                }
                this.mExternalAccountId = null;
                this.mExternalLiveId = null;
                this.mExternalEncodeAccountId = null;
                if (jSONObject4.containsKey("sourceType")) {
                    request(true, jSONObject4.getString("sourceType"));
                } else {
                    request(true, "live");
                }
            } else {
                request(true, "live");
            }
        } else if (xkw.EVENT_AVATAR_CARD__HIDE.equals(str)) {
            if (hkk.I() && (obj instanceof String) && StringUtils.equals("openReputationDetail", (String) obj) && this.mData.anchorTags != null && this.mData.anchorTags.size() > 0) {
                c.b(this.mFrameContext, isFollow(), this.mSourceType, this.mData.anchorTags != null && this.mData.anchorTags.size() > 0);
                for (int i = 0; i < this.mData.anchorTags.size(); i++) {
                    if (!StringUtils.isEmpty(this.mData.anchorTags.get(i).detailTitle) || !StringUtils.isEmpty(this.mData.anchorTags.get(i).detailTitle)) {
                        z = true;
                        break;
                    }
                }
                if (((!hkk.J() || !z) && hkk.J()) || isLandscape()) {
                    return;
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("anchorTags", (Object) this.mData.anchorTags);
                HashMap hashMap = new HashMap();
                hashMap.put("data", jSONObject5);
                phg.b().a("@ali/alivemodx-live-guarantee-details", hashMap);
            }
            hide();
        } else if (StringUtils.equals("com.taobao.taolive.anchor_avatar_follow_changed", str)) {
            if (!(obj instanceof String)) {
                return;
            }
            if (StringUtils.equals("true", (String) obj)) {
                gotoUnFollowAnchor();
            } else {
                gotoFollowAnchor();
            }
        } else if (StringUtils.equals("com.taobao.taolive.anchor_avatar_join_group", str)) {
            joinGroupOrJumpGroup();
        } else if (StringUtils.equals("com.taobao.taolive.room.install_widget_success", str)) {
            if (!kpj.b(this.mFrameContext, this.mLiveDataModel) || !(obj instanceof String)) {
                return;
            }
            boolean booleanValue = JSONObject.parseObject((String) obj).getBoolean("installWidgetSuccess").booleanValue();
            q.b(TAG, "installWidgetSuccess: " + booleanValue);
            if (this.mData == null) {
                return;
            }
            this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.widgetAddition = booleanValue;
            if (booleanValue) {
                this.widgetInstalled = true;
            }
            this.mLiveAvatarNewView.refreshLiveDataModel(this.mLiveDataModel);
            this.mLiveAvatarNewView.refreshTopUi(this.mData, false);
        } else if (StringUtils.equals("com.taobao.taolive.anchor_avatar_favorite_result", str)) {
            this.mLiveAvatarNewView.refreshTopFollowStatus(Boolean.parseBoolean((String) obj));
        } else if (xkw.EVENT_OPEN_WIDGET_INSTALL_GUIDE.equals(str)) {
            if (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null || this.mLiveDataModel.mVideoInfo.broadCaster == null || this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip == null) {
                return;
            }
            kpj.a(this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.widgetJumpUrl, this.mFrameContext, this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.jumpType, this.mLiveDataModel.mVideoInfo.broadCaster.widgetTip.componentData);
        } else if (xkw.EVENT_H5_CONTAINER_DESTROY.equals(str) && !phg.d().a()) {
            checkFollowFormMtop(getAccountId());
        }
    }

    private void requestWithAccountId(String str, String str2, String str3, String str4) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb180e2", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.mNeedDegree = true;
        this.mSourceType = str4;
        pqe.b = this.mSourceType;
        if (this.mBusiness == null) {
            this.mBusiness = new b(this);
        }
        long j2 = 0;
        try {
            j = Long.parseLong(str);
        } catch (Exception e) {
            e = e;
            j = 0;
        }
        try {
            j2 = Long.parseLong(str2);
        } catch (Exception e2) {
            e = e2;
            q.b(TAG, "requestWithAccountId catch exception:" + e.getMessage());
            this.mBusiness.a(j, j2, str3, this.mSourceType, isOpenRoom());
        }
        this.mBusiness.a(j, j2, str3, this.mSourceType, isOpenRoom());
    }

    private void request(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df61f448", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.mNeedDegree = z;
        this.mSourceType = str;
        pqe.b = this.mSourceType;
        if (this.mBusiness == null) {
            this.mBusiness = new b(this);
        }
        if (this.mLiveDataModel != null && this.mLiveDataModel.mVideoInfo != null && this.mLiveDataModel.mVideoInfo.broadCaster != null) {
            long b = l.b(this.mLiveDataModel.mVideoInfo.broadCaster.accountId);
            long b2 = l.b(this.mLiveDataModel.mVideoInfo.liveId);
            String str2 = this.mLiveDataModel.mVideoInfo.broadCaster.encodeAccountId;
            if (StringUtils.isEmpty(str2)) {
                str2 = String.valueOf(b);
            }
            this.mBusiness.a(b2, b, str2, this.mSourceType, isOpenRoom());
        } else if (this.mLiveDataModel == null || this.mLiveDataModel.mFandomInfo == null || this.mLiveDataModel.mFandomInfo.broadCaster == null) {
        } else {
            AccountInfo accountInfo = this.mLiveDataModel.mFandomInfo.broadCaster;
            long b3 = l.b(accountInfo.accountId);
            String str3 = accountInfo.encodeAccountId;
            if (StringUtils.isEmpty(str3)) {
                str3 = String.valueOf(b3);
            }
            this.mBusiness.a(0L, b3, str3, this.mSourceType, isOpenRoom());
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.avatar_card_show", xkw.EVENT_AVATAR_CARD__HIDE, "com.taobao.taolive.anchor_avatar_follow_changed", "com.taobao.taolive.room.install_widget_success", "com.taobao.taolive.anchor_avatar_join_group", "com.taobao.taolive.anchor_avatar_favorite_result", xkw.EVENT_OPEN_WIDGET_INSTALL_GUIDE, xkw.EVENT_H5_CONTAINER_DESTROY};
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

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        q.a(TAG, "request onSuccess");
        if (!(netBaseOutDo instanceof LiveAvatarInfoCardResponse)) {
            return;
        }
        this.mData = ((LiveAvatarInfoCardResponse) netBaseOutDo).mo1437getData();
        if (kpj.b(this.mFrameContext, this.mLiveDataModel)) {
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LiveAvatarNewFrame.access$602(LiveAvatarNewFrame.this, pmd.a().G().a("88"));
                    q.b(LiveAvatarNewFrame.TAG, "widgetInstalled: " + LiveAvatarNewFrame.access$600(LiveAvatarNewFrame.this));
                    LiveAvatarNewFrame.access$700(LiveAvatarNewFrame.this);
                }
            });
        } else {
            updateView();
        }
    }

    private void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
        } else if (this.mLiveAvatarNewView == null) {
        } else {
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LiveAvatarNewFrame.access$100(LiveAvatarNewFrame.this).updateData(LiveAvatarNewFrame.access$000(LiveAvatarNewFrame.this), LiveAvatarNewFrame.access$400(LiveAvatarNewFrame.this), LiveAvatarNewFrame.access$600(LiveAvatarNewFrame.this));
                    LiveAvatarNewFrame.this.mContainer.setVisibility(0);
                    LiveAvatarNewFrame.access$800(LiveAvatarNewFrame.this);
                }
            });
        }
    }

    private void resetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36a71b", new Object[]{this});
            return;
        }
        View view = this.mCardRootView;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view).removeAllViews();
        if (this.mLandscape) {
            this.mLiveAvatarNewView = new LiveAvatarNewView(this.mFrameContext, isLandscape(), this.mContext, (ViewGroup) this.mCardRootView, this.mLiveDataModel, this.mCoverView, true);
        } else {
            this.mLiveAvatarNewView = new LiveAvatarNewView(this.mFrameContext, isLandscape(), this.mContext, (ViewGroup) this.mCardRootView, this.mLiveDataModel, this.mCoverView);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        q.a(TAG, "request onError");
        if (hkk.K()) {
            tryUpdateViewOrJumpAccount();
            return;
        }
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView == null) {
            return;
        }
        liveAvatarNewView.updateData(this.mData, this.mSourceType, this.widgetInstalled);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        q.a(TAG, "request onSystemError");
        if (hkk.K()) {
            tryUpdateViewOrJumpAccount();
            return;
        }
        LiveAvatarNewView liveAvatarNewView = this.mLiveAvatarNewView;
        if (liveAvatarNewView == null) {
            return;
        }
        liveAvatarNewView.updateData(this.mData, this.mSourceType, this.widgetInstalled);
    }

    private void tryUpdateViewOrJumpAccount() {
        LiveAvatarNewView liveAvatarNewView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbe6e9a", new Object[]{this});
            return;
        }
        LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData = this.mData;
        if (liveAvatarInfoCardResponseData != null && (liveAvatarNewView = this.mLiveAvatarNewView) != null) {
            liveAvatarNewView.updateData(liveAvatarInfoCardResponseData, this.mSourceType, this.widgetInstalled);
            return;
        }
        if (!StringUtils.isEmpty(this.mDataModel.mVideoInfo.broadCaster.accountInfoUrl)) {
            pmd.a().r().a(this.mContext, this.mDataModel.mVideoInfo.broadCaster.accountInfoUrl, null);
        } else {
            Toast.makeText(this.mContext, "出错啦，请稍后再试～", 0).show();
        }
        hide();
    }

    private boolean isOpenRoom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c88b29a", new Object[]{this})).booleanValue() : (this.mFrameContext == null || this.mFrameContext.n == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.name().equals(this.mFrameContext.n.bizCode)) ? false : true;
    }

    @Override // tb.sgr
    public void onScreenOrientationChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else {
            hide();
        }
    }
}
