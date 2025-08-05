package com.taobao.social.sdk.net;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.model.CountAndStatusRequest;
import com.taobao.social.sdk.model.LikeAddRequest;
import com.taobao.social.sdk.model.LikeRemoveRequest;
import com.taobao.social.sdk.model.ReportRequest;
import com.taobao.social.sdk.net.ISocialService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TBSoundPlayer;
import com.taobao.vividsocial.utils.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.oci;
import tb.ocj;
import tb.ock;
import tb.ocl;

/* loaded from: classes8.dex */
public class SocialServiceImpl implements ISocialService, IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static WeakReference<Activity> currentActivity;
    private b mService = new b();

    static {
        kge.a(98741938);
        kge.a(-1935023371);
        kge.a(-525336021);
        currentActivity = new WeakReference<>(null);
    }

    public static final void updateCurrentActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98bb378", new Object[]{activity});
        } else if (activity == null) {
        } else {
            currentActivity = new WeakReference<>(activity);
        }
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int doLike(long j, long j2, String str, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cdd31ad", new Object[]{this, new Long(j), new Long(j2), str, iSocialBusinessListener})).intValue();
        }
        TBSoundPlayer.getInstance().playScene(5);
        LikeAddRequest likeAddRequest = new LikeAddRequest();
        likeAddRequest.setNamespace(j);
        likeAddRequest.setTargetId(j2);
        likeAddRequest.setOrigin(str);
        RemoteBusiness registeListener = createRemoteBusiness(likeAddRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_LIKE.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int doLike(ocj ocjVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52693edd", new Object[]{this, ocjVar, iSocialBusinessListener})).intValue();
        }
        if (ocjVar == null) {
            throw new NullPointerException("add like failure,LikeParams is null");
        }
        TBSoundPlayer.getInstance().playScene(5);
        LikeAddRequest likeAddRequest = new LikeAddRequest();
        likeAddRequest.setNamespace(ocjVar.namespace);
        if (ocjVar.targetId > 0) {
            likeAddRequest.setTargetId(ocjVar.targetId);
        }
        if (ocjVar.targetOwnerId > 0) {
            likeAddRequest.setTargetOwnerId(ocjVar.targetOwnerId);
        }
        if (!TextUtils.isEmpty(ocjVar.origin)) {
            likeAddRequest.setOrigin(ocjVar.origin);
            if (!TextUtils.isEmpty(ocjVar.targetCover)) {
                likeAddRequest.setTargetCover(ocjVar.targetCover);
            }
            if (!TextUtils.isEmpty(ocjVar.targetUrl)) {
                likeAddRequest.setTargetUrl(ocjVar.targetUrl);
            }
            if (!TextUtils.isEmpty(ocjVar.targetTitle)) {
                likeAddRequest.setTargetTitle(ocjVar.targetTitle);
            }
            RemoteBusiness registeListener = createRemoteBusiness(likeAddRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
            registeListener.mo1335useWua();
            registeListener.startRequest(ISocialService.SocialAction.QUERY_LIKE.getIntCode(), BaseOutDo.class);
            return getBusinessId(registeListener);
        }
        throw new IllegalArgumentException("add like failure,origin is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int doLike(ock ockVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bbd941e", new Object[]{this, ockVar, iSocialBusinessListener})).intValue();
        }
        if (ockVar == null) {
            throw new NullPointerException("add like failure,LikeParams is null");
        }
        TBSoundPlayer.getInstance().playScene(5);
        LikeAddRequest likeAddRequest = new LikeAddRequest();
        likeAddRequest.setNamespace(ockVar.namespace);
        likeAddRequest.setTargetId(ockVar.targetId);
        if (!TextUtils.isEmpty(ockVar.targetOwnerId)) {
            likeAddRequest.setTargetOwnerId(ockVar.targetOwnerId);
        }
        if (!TextUtils.isEmpty(ockVar.origin)) {
            likeAddRequest.setOrigin(ockVar.origin);
            if (!TextUtils.isEmpty(ockVar.targetCover)) {
                likeAddRequest.setTargetCover(ockVar.targetCover);
            }
            if (!TextUtils.isEmpty(ockVar.targetUrl)) {
                likeAddRequest.setTargetUrl(ockVar.targetUrl);
            }
            if (!TextUtils.isEmpty(ockVar.targetTitle)) {
                likeAddRequest.setTargetTitle(ockVar.targetTitle);
            }
            RemoteBusiness registeListener = createRemoteBusiness(likeAddRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
            registeListener.mo1335useWua();
            registeListener.startRequest(ISocialService.SocialAction.QUERY_LIKE.getIntCode(), BaseOutDo.class);
            return getBusinessId(registeListener);
        }
        throw new IllegalArgumentException("add like failure,origin is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int doLike(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b7baf04", new Object[]{this, map, iSocialBusinessListener})).intValue();
        }
        if (map == null) {
            throw new NullPointerException("add like failure,LikeParams is null");
        }
        TBSoundPlayer.getInstance().playScene(5);
        LikeAddRequest likeAddRequest = new LikeAddRequest();
        likeAddRequest.dataParams = map;
        RemoteBusiness registeListener = createRemoteBusiness(likeAddRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_LIKE.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int getCountAndStatus(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("132f3f12", new Object[]{this, map, iSocialBusinessListener})).intValue();
        }
        if (map == null) {
            throw new NullPointerException("getCountAndStatus failure,getCountAndStatus param is null");
        }
        CountAndStatusRequest countAndStatusRequest = new CountAndStatusRequest();
        countAndStatusRequest.dataParams = map;
        RemoteBusiness registeListener = createRemoteBusiness(countAndStatusRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.startRequest(ISocialService.SocialAction.QUERY_COUNT_STATUS.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int getCountAndStatus(oci ociVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23312d4e", new Object[]{this, ociVar, iSocialBusinessListener})).intValue();
        }
        if (ociVar == null) {
            throw new NullPointerException("getCountAndStatus failure,getCountAndStatus param is null");
        }
        CountAndStatusRequest countAndStatusRequest = new CountAndStatusRequest();
        if (ociVar.targetIds != null) {
            countAndStatusRequest.setTargetIds(ociVar.targetIds);
            countAndStatusRequest.setBrowseNamespace(ociVar.browseNamespace);
            countAndStatusRequest.setCommentNamespace(ociVar.commentNamespace);
            countAndStatusRequest.setLikeNamespace(ociVar.likeNamespace);
            countAndStatusRequest.setDislikeNamespace(ociVar.dislikeNamespace);
            countAndStatusRequest.setIsLikeCount(ociVar.isLikeCount);
            countAndStatusRequest.setIsDisLikeCount(ociVar.isDisLikeCount);
            countAndStatusRequest.setIsLikeStatus(ociVar.isLikeStatus);
            countAndStatusRequest.setIsDisLikeStatus(ociVar.isDisLikeStatus);
            RemoteBusiness registeListener = createRemoteBusiness(countAndStatusRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
            registeListener.startRequest(ISocialService.SocialAction.QUERY_COUNT_STATUS.getIntCode(), BaseOutDo.class);
            return getBusinessId(registeListener);
        }
        throw new NullPointerException("getCountAndStatus failure,targetIds is null");
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int removeLike(long j, long j2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28919a1e", new Object[]{this, new Long(j), new Long(j2), iSocialBusinessListener})).intValue();
        }
        LikeRemoveRequest likeRemoveRequest = new LikeRemoveRequest();
        likeRemoveRequest.setNamespace(j);
        likeRemoveRequest.setTargetId(j2);
        RemoteBusiness registeListener = createRemoteBusiness(likeRemoveRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REMOVE_LIKE.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int removeLike(String str, String str2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7f87d8a", new Object[]{this, str, str2, iSocialBusinessListener})).intValue();
        }
        LikeRemoveRequest likeRemoveRequest = new LikeRemoveRequest();
        likeRemoveRequest.setNamespace(str);
        likeRemoveRequest.setTargetId(str2);
        RemoteBusiness registeListener = createRemoteBusiness(likeRemoveRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REMOVE_LIKE.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int removeLike(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84ec6fbd", new Object[]{this, map, iSocialBusinessListener})).intValue();
        }
        if (map == null) {
            throw new NullPointerException("report failure,ReportParams is null");
        }
        LikeRemoveRequest likeRemoveRequest = new LikeRemoveRequest();
        likeRemoveRequest.dataParams = map;
        RemoteBusiness registeListener = createRemoteBusiness(likeRemoveRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REMOVE_LIKE.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int report(long j, long j2, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6513d45", new Object[]{this, new Long(j), new Long(j2), iSocialBusinessListener})).intValue();
        }
        ReportRequest reportRequest = new ReportRequest();
        reportRequest.setNamespace(j);
        reportRequest.setTargetId(j2);
        RemoteBusiness registeListener = createRemoteBusiness(reportRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REPORT_NEW.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int report(long j, long j2, long j3, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45d5df57", new Object[]{this, new Long(j), new Long(j2), new Long(j3), iSocialBusinessListener})).intValue();
        }
        ReportRequest reportRequest = new ReportRequest();
        reportRequest.setNamespace(j);
        reportRequest.setTargetId(j2);
        reportRequest.setTargetOwnerId(j3);
        RemoteBusiness registeListener = createRemoteBusiness(reportRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REPORT.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int report(ocl oclVar, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a77a00ad", new Object[]{this, oclVar, iSocialBusinessListener})).intValue();
        }
        if (oclVar == null) {
            throw new NullPointerException("report failure,ReportParams is null");
        }
        ReportRequest reportRequest = new ReportRequest();
        reportRequest.setNamespace(oclVar.namespace);
        if (oclVar.targetId != 0) {
            reportRequest.setTargetId(oclVar.targetId);
        }
        if (oclVar.targetOwnerId != 0) {
            reportRequest.setTargetOwnerId(oclVar.targetOwnerId);
        }
        if (oclVar.targetParentId != 0) {
            reportRequest.setTargetParentId(oclVar.targetParentId);
        }
        if (!TextUtils.isEmpty(oclVar.content)) {
            reportRequest.setContent(oclVar.content);
        }
        if (!TextUtils.isEmpty(oclVar.videoUrls)) {
            reportRequest.setPicUrls(oclVar.videoUrls);
        }
        if (!TextUtils.isEmpty(oclVar.videoUrls)) {
            reportRequest.setVideoUrls(oclVar.videoUrls);
        }
        if (!TextUtils.isEmpty(oclVar.expandAttribute)) {
            reportRequest.setExpandAttribute(oclVar.expandAttribute);
        }
        RemoteBusiness registeListener = createRemoteBusiness(reportRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REPORT.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.social.sdk.net.ISocialService
    public int report(Map map, ISocialBusinessListener iSocialBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15b763f6", new Object[]{this, map, iSocialBusinessListener})).intValue();
        }
        if (map == null) {
            throw new NullPointerException("report failure,ReportParams is null");
        }
        ReportRequest reportRequest = new ReportRequest();
        reportRequest.dataParams = map;
        RemoteBusiness registeListener = createRemoteBusiness(reportRequest, iSocialBusinessListener, null).registeListener((IRemoteListener) this);
        registeListener.mo1335useWua();
        registeListener.startRequest(ISocialService.SocialAction.QUERY_REPORT.getIntCode(), BaseOutDo.class);
        return getBusinessId(registeListener);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            notifyListener(obj, false, mtopResponse, null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (i == ISocialService.SocialAction.QUERY_LIKE.getIntCode()) {
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        } else if (i == ISocialService.SocialAction.QUERY_REPORT.getIntCode()) {
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        } else if (i == ISocialService.SocialAction.QUERY_REMOVE_LIKE.getIntCode()) {
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        } else if (i == ISocialService.SocialAction.QUERY_COUNT_STATUS.getIntCode()) {
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        } else if (i != ISocialService.SocialAction.QUERY_REPORT_NEW.getIntCode()) {
        } else {
            if (mtopResponse != null) {
                String optString = mtopResponse.getDataJsonObject().optString("result");
                if (!TextUtils.isEmpty(optString)) {
                    j.a(currentActivity.get(), optString);
                } else {
                    j.a(currentActivity.get(), "举报成功");
                }
            } else {
                j.a(currentActivity.get(), "举报成功");
            }
            notifyListener(obj, true, mtopResponse, baseOutDo, null, null);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (i == ISocialService.SocialAction.QUERY_REPORT_NEW.getIntCode()) {
            j.a(currentActivity.get(), mtopResponse.getRetMsg());
            notifyListener(obj, false, mtopResponse, null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        } else {
            notifyListener(obj, false, mtopResponse, null, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    private int getBusinessId(RemoteBusiness remoteBusiness) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e4ed30b", new Object[]{this, remoteBusiness})).intValue() : this.mService.getBusinessId(remoteBusiness);
    }

    private RemoteBusiness createRemoteBusiness(MtopRequest mtopRequest, ISocialBusinessListener<?> iSocialBusinessListener, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RemoteBusiness) ipChange.ipc$dispatch("50dcf7fe", new Object[]{this, mtopRequest, iSocialBusinessListener, hashMap}) : this.mService.createRemoteBusiness(mtopRequest, iSocialBusinessListener, hashMap);
    }

    private <T> void notifyListener(Object obj, boolean z, MtopResponse mtopResponse, T t, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f70fc9", new Object[]{this, obj, new Boolean(z), mtopResponse, t, str, str2});
        } else {
            this.mService.notifyListener(obj, z, mtopResponse, t, str, str2);
        }
    }
}
