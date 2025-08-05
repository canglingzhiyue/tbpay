package com.taobao.taopai.material.request.materialcategory;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai.material.MaterialRequestStrategy;
import com.taobao.taopai.material.bean.CategoryListResponseData;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import com.taobao.taopai.material.request.base.c;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.izj;
import tb.kge;
import tb.qbs;

/* loaded from: classes8.dex */
public class MaterialCategoryBusiness extends BaseMaterialBusiness<CategoryListResponseData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MaterialCategoryBusiness";
    private b mListener;
    private a mParams;
    private RemoteBusiness mRemoteBusiness;

    static {
        kge.a(-1901477971);
    }

    public static /* synthetic */ Object ipc$super(MaterialCategoryBusiness materialCategoryBusiness, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a583454", new Object[]{this}) : "category";
    }

    public MaterialCategoryBusiness(a aVar, b bVar) {
        super(aVar, bVar);
        this.mParams = aVar;
        this.mListener = bVar;
        this.mRequestStrategy = MaterialRequestStrategy.ONLY;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(qbs.b());
        sb.append("material_category_");
        sb.append(this.mParams.h());
        sb.append("_");
        sb.append(this.mParams.g());
        sb.append("_");
        sb.append(izj.a() ? "1" : "0");
        return sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    /* renamed from: parseCacheData */
    public CategoryListResponseData mo1426parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CategoryListResponseData) ipChange.ipc$dispatch("36f667d7", new Object[]{this, str}) : (CategoryListResponseData) JSON.parseObject(str, CategoryListResponseData.class);
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void handleCacheLoaded(CategoryListResponseData categoryListResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80f2391", new Object[]{this, categoryListResponseData});
            return;
        }
        b bVar = this.mListener;
        if (bVar == null) {
            return;
        }
        bVar.a(categoryListResponseData.getModel());
    }

    @Override // com.taobao.taopai.material.request.base.b
    public void requestNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c8e15", new Object[]{this});
            return;
        }
        CategoryListRequest categoryListRequest = new CategoryListRequest();
        categoryListRequest.setBizLine(this.mParams.b());
        categoryListRequest.setTemplateId(this.mParams.h());
        categoryListRequest.setMaterialType(this.mParams.g());
        this.mRemoteBusiness = RemoteBusiness.build((IMTOPDataObject) categoryListRequest);
        this.mRemoteBusiness.registeListener((IRemoteListener) this);
        this.mRemoteBusiness.mo1305reqMethod(MethodEnum.POST);
        this.mRemoteBusiness.startRequest(CategoryListResponse.class);
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
        if (this.mListener == null) {
            return;
        }
        if (mtopResponse == null) {
            if (this.mIsReturnData) {
                return;
            }
            this.mListener.a("success_response_null", "");
            return;
        }
        if (baseOutDo instanceof CategoryListResponse) {
            CategoryListResponse categoryListResponse = (CategoryListResponse) baseOutDo;
            if (categoryListResponse.mo2429getData() != null) {
                saveCache(categoryListResponse.mo2429getData());
                if (this.mIsReturnData) {
                    return;
                }
                this.mListener.a(categoryListResponse.mo2429getData().getModel());
                return;
            }
        }
        if (this.mIsReturnData) {
            return;
        }
        b bVar = this.mListener;
        String retCode = mtopResponse.getRetCode();
        bVar.a(retCode, "success data == null," + mtopResponse.toString());
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
