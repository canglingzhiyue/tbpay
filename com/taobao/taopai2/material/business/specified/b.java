package com.taobao.taopai2.material.business.specified;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.business.specified.MaterialSpecifiedModel;
import com.taobao.taopai2.material.exception.ResponseDataException;
import com.taobao.taopai2.material.request.RequestBuilder;
import com.taobao.taopai2.material.request.Response;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.rsk;
import tb.rsl;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-461270344);
    }

    public static /* synthetic */ void a(a aVar, ResponseDataException responseDataException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8c1691d", new Object[]{aVar, responseDataException});
        } else {
            b(aVar, responseDataException);
        }
    }

    public static /* synthetic */ void a(b bVar, a aVar, MaterialSpecifiedModel materialSpecifiedModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b299b17a", new Object[]{bVar, aVar, materialSpecifiedModel});
        } else {
            bVar.a(aVar, materialSpecifiedModel);
        }
    }

    public void a(String str, String str2, int i, List<Long> list, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206aa0d2", new Object[]{this, str, str2, new Integer(i), list, aVar});
            return;
        }
        SpecifiedRequestParams specifiedRequestParams = new SpecifiedRequestParams(str, str2, i, JSON.toJSONString(list));
        new RequestBuilder(specifiedRequestParams, MaterialSpecifiedModel.MaterialSpecifiedResponse.class).setTarget(specifiedRequestParams.getAPI(), "1.0").withoutECode().withoutSession().toSingle().map(new rsl<Response<MaterialSpecifiedModel>, MaterialSpecifiedModel>() { // from class: com.taobao.taopai2.material.business.specified.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public /* synthetic */ Object apply(Object obj) throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("7a74adc1", new Object[]{this, obj}) : a((Response) obj);
            }

            public MaterialSpecifiedModel a(Response<MaterialSpecifiedModel> response) throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (MaterialSpecifiedModel) ipChange2.ipc$dispatch("c7c23dd9", new Object[]{this, response}) : response.data;
            }
        }).subscribe(new rsk<MaterialSpecifiedModel>() { // from class: com.taobao.taopai2.material.business.specified.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public /* synthetic */ void accept(Object obj) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, obj});
                } else {
                    a((MaterialSpecifiedModel) obj);
                }
            }

            public void a(MaterialSpecifiedModel materialSpecifiedModel) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f925f2ad", new Object[]{this, materialSpecifiedModel});
                } else {
                    b.a(b.this, aVar, materialSpecifiedModel);
                }
            }
        }, new rsk<Throwable>() { // from class: com.taobao.taopai2.material.business.specified.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public /* synthetic */ void accept(Object obj) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b028bfab", new Object[]{this, obj});
                } else {
                    a((Throwable) obj);
                }
            }

            public void a(Throwable th) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                } else {
                    b.a(aVar, (ResponseDataException) th);
                }
            }
        });
    }

    private static void b(a aVar, ResponseDataException responseDataException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed78b7c", new Object[]{aVar, responseDataException});
            return;
        }
        aVar.a(responseDataException.getErrorCode(), responseDataException.getErrorInfo());
        String str = "specifyMaterial fail " + responseDataException.getErrorCode() + "|" + responseDataException.getErrorInfo();
    }

    private void a(a aVar, MaterialSpecifiedModel materialSpecifiedModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2008893", new Object[]{this, aVar, materialSpecifiedModel});
        } else if (materialSpecifiedModel == null) {
            aVar.a("success_response_null", "");
        } else {
            String str = "specifyMaterial success " + materialSpecifiedModel.toString();
            SpecifiedFilterResultBean specifiedFilterResultBean = new SpecifiedFilterResultBean();
            specifiedFilterResultBean.mMaterialList = materialSpecifiedModel.materialList;
            try {
                a(materialSpecifiedModel, specifiedFilterResultBean);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("SpecifiedRequester", "specifyMaterial success, parse error ");
            }
            aVar.a(specifiedFilterResultBean);
        }
    }

    private void a(MaterialSpecifiedModel materialSpecifiedModel, SpecifiedFilterResultBean specifiedFilterResultBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fceb73", new Object[]{this, materialSpecifiedModel, specifiedFilterResultBean});
        } else if (!TextUtils.isEmpty(materialSpecifiedModel.filterInfoMap)) {
            specifiedFilterResultBean.mRuleMap = new HashMap();
            JSONObject parseObject = JSONObject.parseObject(materialSpecifiedModel.filterInfoMap);
            for (String str : parseObject.getInnerMap().keySet()) {
                JSONObject jSONObject = parseObject.getJSONObject(str);
                MaterialSpecifiedRule materialSpecifiedRule = new MaterialSpecifiedRule();
                materialSpecifiedRule.mRuleCode = jSONObject.getInteger("ruleCode").intValue();
                materialSpecifiedRule.mRuleMessage = jSONObject.getString("ruleMessage");
                specifiedFilterResultBean.mRuleMap.put(str, materialSpecifiedRule);
            }
        }
    }
}
