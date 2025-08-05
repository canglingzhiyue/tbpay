package com.taobao.taopai.material.request.materialdetail;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import com.taobao.taopai.material.request.base.c;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialDetailBusiness extends BaseMaterialBusiness<MaterialDetail> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MaterialByIdBusiness";
    private a mListener;
    private b mParams;
    private RemoteBusiness mRemoteBusiness;

    static {
        kge.a(-61802291);
    }

    public static /* synthetic */ Object ipc$super(MaterialDetailBusiness materialDetailBusiness, String str, Object... objArr) {
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
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this}) : "";
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getUtRequestKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a583454", new Object[]{this}) : "detail_by_id";
    }

    public MaterialDetailBusiness(b bVar, a aVar) {
        super(bVar, aVar);
        this.mParams = bVar;
        this.mListener = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    /* renamed from: parseCacheData */
    public MaterialDetail mo1426parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaterialDetail) ipChange.ipc$dispatch("8866f1c6", new Object[]{this, str}) : (MaterialDetail) JSON.parseObject(str, MaterialDetail.class);
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void handleCacheLoaded(MaterialDetail materialDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d5d200", new Object[]{this, materialDetail});
            return;
        }
        a aVar = this.mListener;
        if (aVar == null) {
            return;
        }
        aVar.a(materialDetail);
    }

    @Override // com.taobao.taopai.material.request.base.b
    public void requestNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c8e15", new Object[]{this});
            return;
        }
        MaterialDetailRequest materialDetailRequest = new MaterialDetailRequest();
        materialDetailRequest.setMaterialId(this.mParams.g());
        this.mRemoteBusiness = RemoteBusiness.build((IMTOPDataObject) materialDetailRequest);
        this.mRemoteBusiness.registeListener((IRemoteListener) this);
        this.mRemoteBusiness.mo1305reqMethod(MethodEnum.GET);
        this.mRemoteBusiness.startRequest(MaterialDetailResponse.class);
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
        if (remoteBusiness != null) {
            remoteBusiness.cancelRequest();
        }
        this.mListener = null;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness, com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        super.onSuccess(i, mtopResponse, baseOutDo, obj);
        a aVar = this.mListener;
        if (aVar == null) {
            return;
        }
        if (mtopResponse == null) {
            aVar.a("success_response_null", "");
        } else if ((baseOutDo instanceof MaterialDetailResponse) && baseOutDo.mo2429getData() != null) {
            this.mListener.a(((MaterialDetailResponse) baseOutDo).mo2429getData().getModel());
        } else {
            a aVar2 = this.mListener;
            String retCode = mtopResponse.getRetCode();
            aVar2.a(retCode, "success data == null," + mtopResponse.toString());
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
