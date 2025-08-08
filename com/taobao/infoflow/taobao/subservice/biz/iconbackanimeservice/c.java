package com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;
import java.util.Map;
import tb.kge;
import tb.ldf;
import tb.ljs;

/* loaded from: classes7.dex */
public class c implements IDxItemClickService.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f17464a;

    static {
        kge.a(1124237889);
        kge.a(1557880302);
    }

    public c(ljs ljsVar) {
        this.f17464a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.c
    public Map<String, String> a(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("574cdb3b", new Object[]{this, baseSectionModel, baseSubItemModel});
        }
        if (!StringUtils.equals("icon_and_miniapp_nomore_2019_v1", baseSectionModel.getSectionBizCode())) {
            return null;
        }
        String itemBizCode = baseSubItemModel.getItemBizCode();
        IIconService iIconService = (IIconService) this.f17464a.a(IIconService.class);
        if (iIconService == null) {
            ldf.d("TargetUrlParamsCreatorImpl", "iconService == null");
            return null;
        }
        JSONObject popLayerData = iIconService.getPopLayerData(itemBizCode);
        if (popLayerData == null) {
            ldf.d("TargetUrlParamsCreatorImpl", "passParamsData == null");
            return null;
        } else if (!a(iIconService, itemBizCode)) {
            ldf.d("TargetUrlParamsCreatorImpl", "参数校验异常");
            iIconService.clearPopLayerData(itemBizCode);
            return null;
        } else {
            Map<String, String> a2 = a(popLayerData);
            iIconService.clearPopLayerData(itemBizCode);
            return a2;
        }
    }

    private boolean a(IIconService iIconService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33324d3", new Object[]{this, iIconService, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            ldf.d("TargetUrlParamsCreatorImpl", "itemBizCode == null");
            return false;
        } else if (iIconService.isPassPopLayerDataAvailable(str)) {
            return true;
        } else {
            ldf.d("TargetUrlParamsCreatorImpl", "参数已过期");
            return false;
        }
    }

    private Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        try {
            return (Map) JSON.parseObject(jSONObject.toJSONString(), new TypeReference<Map<String, String>>() { // from class: com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice.c.1
            }, new Feature[0]);
        } catch (Exception unused) {
            ldf.d("TargetUrlParamsCreatorImpl", "解析参数异常");
            return null;
        }
    }
}
