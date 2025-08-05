package com.taobao.taopai.material.request.musiclovelist;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai.material.bean.MusicListBean;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import com.taobao.taopai.material.request.base.c;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class MusicLoveListBusiness extends BaseMaterialBusiness<MusicListBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MusicLoveList";
    private com.taobao.taopai.material.request.musiclove.a mListener;
    private a mParams;
    private RemoteBusiness mRemoteBusiness;

    static {
        kge.a(-978641639);
    }

    public static /* synthetic */ Object ipc$super(MusicLoveListBusiness musicLoveListBusiness, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -743105213) {
            super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
            return null;
        } else if (hashCode == -662674828) {
            super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
            return null;
        } else if (hashCode != 2057952281) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
            return null;
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getUtRequestKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a583454", new Object[]{this}) : "music_love_list";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    /* renamed from: parseCacheData */
    public MusicListBean mo1426parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicListBean) ipChange.ipc$dispatch("3ad840a5", new Object[]{this, str});
        }
        return null;
    }

    public MusicLoveListBusiness(a aVar, com.taobao.taopai.material.request.musiclove.a aVar2) {
        super(aVar, aVar2);
        this.mParams = aVar;
        this.mListener = aVar2;
        this.mParams.a(false);
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void handleCacheLoaded(MusicListBean musicListBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1507baa5", new Object[]{this, musicListBean});
        } else {
            this.mListener.a(musicListBean);
        }
    }

    @Override // com.taobao.taopai.material.request.base.b
    public void requestNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c8e15", new Object[]{this});
            return;
        }
        MusicLoveListRequest musicLoveListRequest = new MusicLoveListRequest();
        musicLoveListRequest.setBizLine(this.mParams.b());
        musicLoveListRequest.setBizScene(this.mParams.e());
        musicLoveListRequest.setClientVer(this.mParams.d());
        musicLoveListRequest.setPage(this.mParams.h());
        musicLoveListRequest.setPageSize(this.mParams.g());
        this.mRemoteBusiness = RemoteBusiness.build((IMTOPDataObject) musicLoveListRequest);
        this.mRemoteBusiness.registeListener((IRemoteListener) this);
        this.mRemoteBusiness.startRequest(MusicLoveListResponse.class);
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        super.onSuccess(i, mtopResponse, baseOutDo, obj);
        com.taobao.taopai.material.request.musiclove.a aVar = this.mListener;
        if (aVar == null) {
            return;
        }
        if (mtopResponse == null) {
            aVar.a("success_response_null", "");
        } else if (baseOutDo instanceof MusicLoveListResponse) {
            MusicLoveListResponse musicLoveListResponse = (MusicLoveListResponse) baseOutDo;
            if (musicLoveListResponse.mo2429getData() != null) {
                this.mListener.a(musicLoveListResponse.mo2429getData());
            } else {
                this.mListener.a(mtopResponse.getRetCode(), "getData is null");
            }
        } else {
            String retCode = mtopResponse.getRetCode();
            aVar.a(retCode, "success data == null," + mtopResponse.toString());
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        super.onSystemError(i, mtopResponse, obj);
        c.a(this.mListener, mtopResponse, "system_error_response_null");
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        super.onError(i, mtopResponse, obj);
        c.a(this.mListener, mtopResponse, "error_response_null");
    }
}
