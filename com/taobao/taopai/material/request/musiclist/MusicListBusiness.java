package com.taobao.taopai.material.request.musiclist;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
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
import tb.qbs;

/* loaded from: classes8.dex */
public class MusicListBusiness extends BaseMaterialBusiness<MusicListBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MusicList";
    private a mListener;
    public b mParams;
    private RemoteBusiness mRemoteBusiness;

    static {
        kge.a(906972309);
    }

    public static /* synthetic */ Object ipc$super(MusicListBusiness musicListBusiness, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -743105213:
                super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                return null;
            case -662674828:
                super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                return null;
            case 1887430145:
                super.cancel();
                return null;
            case 2057952281:
                super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getUtRequestKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a583454", new Object[]{this}) : "music_list";
    }

    public MusicListBusiness(b bVar, a aVar) {
        super(bVar, aVar);
        this.mParams = bVar;
        this.mListener = aVar;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this});
        }
        return qbs.b() + "music_list_" + this.mParams.e() + "_" + this.mParams.i() + "_" + this.mParams.h();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    /* renamed from: parseCacheData */
    public MusicListBean mo1426parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MusicListBean) ipChange.ipc$dispatch("3ad840a5", new Object[]{this, str}) : (MusicListBean) JSON.parseObject(str, MusicListBean.class);
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
        this.mRemoteBusiness = RemoteBusiness.build((IMTOPDataObject) getRequest());
        this.mRemoteBusiness.mo1312setConnectionTimeoutMilliSecond(this.mParams.f());
        this.mRemoteBusiness.mo1326setSocketTimeoutMilliSecond(this.mParams.f());
        this.mRemoteBusiness.registeListener((IRemoteListener) this);
        this.mRemoteBusiness.startRequest(MusicListResponse.class);
    }

    public MusicListRequest getRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicListRequest) ipChange.ipc$dispatch("9c30b837", new Object[]{this});
        }
        MusicListRequest musicListRequest = new MusicListRequest();
        musicListRequest.setBizLine(this.mParams.b());
        musicListRequest.setBizScene(this.mParams.e());
        musicListRequest.setClientVer(this.mParams.d());
        musicListRequest.setPage(this.mParams.h());
        musicListRequest.setPageSize(this.mParams.g());
        musicListRequest.setCategory(this.mParams.i());
        return musicListRequest;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        super.cancel();
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
        if (this.mListener == null) {
            return;
        }
        if (mtopResponse == null) {
            if (this.mIsReturnData) {
                return;
            }
            this.mListener.a("success_response_null", "");
        } else if (baseOutDo instanceof MusicListResponse) {
            MusicListResponse musicListResponse = (MusicListResponse) baseOutDo;
            if (musicListResponse.mo2429getData() != null) {
                if (!this.mIsReturnData) {
                    this.mListener.a(musicListResponse.mo2429getData());
                }
                if (TextUtils.isEmpty(getCacheFilePath())) {
                    return;
                }
                saveCache(musicListResponse.mo2429getData());
            } else if (this.mIsReturnData) {
            } else {
                this.mListener.a(mtopResponse.getRetCode(), "getData is null");
            }
        } else if (this.mIsReturnData) {
        } else {
            a aVar = this.mListener;
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
        if (this.mIsReturnData) {
            return;
        }
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
        if (this.mIsReturnData) {
            return;
        }
        c.a(this.mListener, mtopResponse, "error_response_null");
    }
}
