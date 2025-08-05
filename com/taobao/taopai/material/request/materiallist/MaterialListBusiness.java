package com.taobao.taopai.material.request.materiallist;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taopai.material.MaterialRequestStrategy;
import com.taobao.taopai.material.bean.MaterialDetail;
import com.taobao.taopai.material.bean.MaterialListBean;
import com.taobao.taopai.material.request.base.BaseMaterialBusiness;
import com.taobao.taopai.material.request.base.c;
import java.util.ArrayList;
import java.util.Iterator;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.izj;
import tb.kge;
import tb.qbs;

/* loaded from: classes8.dex */
public class MaterialListBusiness extends BaseMaterialBusiness<MaterialListBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MaterialistBusiness";
    private a mListener;
    private b mParams;
    private RemoteBusiness mRemoteBusiness;

    static {
        kge.a(-179276115);
    }

    public static /* synthetic */ Object ipc$super(MaterialListBusiness materialListBusiness, String str, Object... objArr) {
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a583454", new Object[]{this}) : "list";
    }

    public MaterialListBusiness(b bVar, a aVar) {
        super(bVar, aVar);
        this.mParams = bVar;
        this.mListener = aVar;
        this.mRequestStrategy = MaterialRequestStrategy.ONLY;
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public String getCacheFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d638f6c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mParams.k());
        sb.append("_");
        sb.append(this.mParams.j());
        sb.append("_");
        sb.append(this.mParams.l());
        sb.append("_");
        sb.append(this.mParams.h());
        sb.append("_");
        sb.append(this.mParams.i());
        sb.append("_");
        sb.append(TextUtils.isEmpty(this.mParams.g()) ? "" : Integer.valueOf(this.mParams.g().hashCode()));
        sb.append("_");
        sb.append(izj.a() ? "1" : "0");
        return qbs.b() + "material_list_" + sb.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    /* renamed from: parseCacheData */
    public MaterialListBean mo1426parseCacheData(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaterialListBean) ipChange.ipc$dispatch("35777549", new Object[]{this, str}) : (MaterialListBean) JSON.parseObject(str, MaterialListBean.class);
    }

    @Override // com.taobao.taopai.material.request.base.BaseMaterialBusiness
    public void handleCacheLoaded(MaterialListBean materialListBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5981983", new Object[]{this, materialListBean});
        } else if (this.mListener == null) {
        } else {
            filterCloudMaterial(materialListBean);
            this.mListener.a(materialListBean);
        }
    }

    @Override // com.taobao.taopai.material.request.base.b
    public void requestNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1c8e15", new Object[]{this});
            return;
        }
        MaterialListRequest materialListRequest = new MaterialListRequest();
        materialListRequest.setBizLine(this.mParams.b());
        materialListRequest.setCategoryId(this.mParams.l());
        materialListRequest.setPageSize(this.mParams.i());
        materialListRequest.setCurrentPage(this.mParams.h());
        materialListRequest.setTemplateId(this.mParams.k());
        materialListRequest.setMaterialType(this.mParams.j());
        materialListRequest.setVersion(this.mParams.m());
        materialListRequest.setFrontIdsStr(this.mParams.g());
        this.mRemoteBusiness = RemoteBusiness.build((IMTOPDataObject) materialListRequest);
        this.mRemoteBusiness.registeListener((IRemoteListener) this);
        this.mRemoteBusiness.mo1305reqMethod(MethodEnum.GET);
        this.mRemoteBusiness.startRequest(MaterialListResponse.class);
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
        if (baseOutDo instanceof MaterialListResponse) {
            MaterialListResponse materialListResponse = (MaterialListResponse) baseOutDo;
            if (materialListResponse.mo2429getData() != null) {
                if (materialListResponse.mo2429getData().getCurrentPage() == -1) {
                    if (this.mIsReturnData) {
                        return;
                    }
                    a aVar = this.mListener;
                    String retCode = mtopResponse.getRetCode();
                    aVar.a(retCode, "success data is empty," + mtopResponse.toString());
                    return;
                }
                saveCache(materialListResponse.mo2429getData());
                if (this.mIsReturnData) {
                    return;
                }
                filterCloudMaterial(materialListResponse.mo2429getData());
                this.mListener.a(materialListResponse.mo2429getData());
                return;
            }
        }
        if (this.mIsReturnData) {
            return;
        }
        a aVar2 = this.mListener;
        String retCode2 = mtopResponse.getRetCode();
        aVar2.a(retCode2, "success data == null," + mtopResponse.toString());
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

    private void filterCloudMaterial(MaterialListBean materialListBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4ffac8", new Object[]{this, materialListBean});
        } else if (materialListBean == null || materialListBean.getModel() == null) {
        } else {
            ArrayList<MaterialDetail> arrayList = new ArrayList<>();
            Iterator<MaterialDetail> it = materialListBean.getModel().iterator();
            int i = -100;
            while (it.hasNext()) {
                MaterialDetail next = it.next();
                if (next.getExtend() == null || !next.getExtend().contains("cloud")) {
                    arrayList.add(next);
                } else {
                    if (i == -100) {
                        i = com.taobao.taopai.material.config.b.a().a((int) this.mParams.k(), this.mParams.j());
                    }
                    if (i == 0) {
                        arrayList.add(next);
                    }
                }
            }
            materialListBean.setModel(arrayList);
        }
    }
}
