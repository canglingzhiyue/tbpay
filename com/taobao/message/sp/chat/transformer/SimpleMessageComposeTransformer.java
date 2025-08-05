package com.taobao.message.sp.chat.transformer;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chatv2.aura.messageflow.MessageComposeViewObject;
import com.taobao.message.chatv2.viewcenter.ViewCenterProps;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.datasdk.facade.model.ResultChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.inner2.DiffResult;
import com.taobao.message.lab.comfrm.inner2.DiffTransfomer;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.support.TransformerItemAware;
import com.taobao.message.lab.comfrm.support.UserIdentifier;
import com.taobao.message.sp.framework.model.SimpleMessage;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMessageComposeTransformer implements DiffTransfomer, TransformerItemAware, UserIdentifier {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "MessageDiffComposeTansformer";
    private static final String UNI_KEY = "VC_UNI_ID";
    private String mIdentifier;
    private TransformerItem mItem;

    static {
        kge.a(-347386106);
        kge.a(-2124616881);
        kge.a(451726918);
        kge.a(-1301282844);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.DiffTransfomer
    public DiffResult transform(Action action, SharedState sharedState, Diff diff) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiffResult) ipChange.ipc$dispatch("8370bb6b", new Object[]{this, action, sharedState, diff});
        }
        JSONArray jSONArray = (JSONArray) sharedState.getRuntimeData("messageViewObjects", JSONArray.class, new JSONArray());
        SimpleMessageListData simpleMessageListData = (SimpleMessageListData) sharedState.getOriginData(SimpleMessageListData.SOURCE_NAME_MESSAGE, SimpleMessageListData.class, null);
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(action.getName(), StdActions.UPDATE_ORIGINAL_DATA)) {
            Map<String, Map<String, Object>> map = (Map) sharedState.getRuntimeData("messageViewDataMap", Map.class, new HashMap());
            Map<String, Map<String, Object>> map2 = (Map) sharedState.getRuntimeData("messageViewUpdateDataMap", Map.class, new HashMap());
            boolean z = !"0".equals(sharedState.getProp("oldToNew", String.class, null));
            JSONArray jSONArray2 = new JSONArray();
            if (simpleMessageListData != null && simpleMessageListData.list != null) {
                boolean z2 = !z || SimpleMessageListData.REASON_SEND.equals(simpleMessageListData.reason) || SimpleMessageListData.REASON_ARRIVE.equals(simpleMessageListData.reason);
                if (z2) {
                    jSONArray2.addAll(jSONArray);
                }
                int size = z2 ? jSONArray.size() : 0;
                for (ResultData<SimpleMessage> resultData : simpleMessageListData.list) {
                    JSONObject composeVO = composeVO(resultData, sharedState, map, map2);
                    if (!containerUniKey(composeVO.getJSONObject("data").getString(UNI_KEY), jSONArray)) {
                        ResultData resultData2 = new ResultData(composeVO, new HashMap());
                        jSONArray2.add(resultData2.getMainData());
                        arrayList.add(new ResultChange(0, resultData2, Integer.valueOf(size)));
                        size++;
                    }
                }
                if (!z2) {
                    jSONArray2.addAll(jSONArray);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("messageViewObjects", jSONArray2);
            SharedState updateRuntimeData = sharedState.updateRuntimeData(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("messageViewObjects", new DeltaItem(1, arrayList));
            return new DiffResult(updateRuntimeData, diff.updateRuntimeDiff(hashMap2));
        }
        return new DiffResult(sharedState, diff);
    }

    private boolean containerUniKey(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31185aed", new Object[]{this, str, jSONArray})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                if (TextUtils.equals(str, jSONArray.getJSONObject(i).getJSONObject("data").getString(UNI_KEY))) {
                    return true;
                }
            }
        }
        return false;
    }

    private JSONObject composeVO(ResultData<SimpleMessage> resultData, SharedState sharedState, Map<String, Map<String, Object>> map, Map<String, Map<String, Object>> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("86cbfbd", new Object[]{this, resultData, sharedState, map, map2});
        }
        MessageComposeViewObject messageComposeViewObject = new MessageComposeViewObject();
        LayoutInfo layoutInfo = (LayoutInfo) ValueUtil.getValue(resultData.getSubData(), "layoutInfo", LayoutInfo.class, null);
        if (layoutInfo != null) {
            messageComposeViewObject.info = layoutInfo;
        } else {
            messageComposeViewObject.info = new LayoutInfo();
            messageComposeViewObject.info.layoutId = "222004";
            messageComposeViewObject.info.version = "0";
            messageComposeViewObject.info.renderTemplate = new RenderTemplate();
            messageComposeViewObject.info.renderTemplate.name = "__dinamicX";
            messageComposeViewObject.info.renderTemplate.renderType = "dinamicX";
            messageComposeViewObject.info.renderTemplate.renderData = JSONObject.parseObject("{\n        \"name\": \"alimp_degrade_card\",\n        \"version\": \"1666957108905\",\n        \"url\": \"https://dinamicx.alibabausercontent.com/pub/alimp_degrade_card/1666957108905/alimp_degrade_card.zip\"\n      }");
        }
        messageComposeViewObject.data = new HashMap(resultData.getMainData().getOriginalData());
        messageComposeViewObject.data.put("message", resultData.getMainData());
        ViewCenterProps viewCenterProps = new ViewCenterProps();
        viewCenterProps.bizType = (String) sharedState.getProp("bizType", String.class, "-1");
        viewCenterProps.identifier = this.mIdentifier;
        viewCenterProps.targetId = (String) sharedState.getProp("targetId", String.class, null);
        viewCenterProps.targetType = (String) sharedState.getProp(DinamicxNativeConfig.TARGETTYPE, String.class, null);
        viewCenterProps.tag = (String) sharedState.getProp("tag", String.class, null);
        String str = (String) sharedState.getProp("accountId", String.class, null);
        viewCenterProps.userId = TextUtils.isEmpty(str) ? 0L : Long.parseLong(str);
        viewCenterProps.ccode = (String) sharedState.getProp("ccode", String.class, null);
        viewCenterProps.spm = (String) sharedState.getProp("spm", String.class, null);
        viewCenterProps.instance = this.mItem.instance;
        messageComposeViewObject.data.put("props", viewCenterProps);
        messageComposeViewObject.data.put("reuseId", messageComposeViewObject.info.layoutId);
        Map<String, Object> map3 = messageComposeViewObject.data;
        map3.put(UNI_KEY, viewCenterProps.tag + "_" + resultData.getMainData().getCode().getClientId());
        messageComposeViewObject.identifier = this.mIdentifier;
        if (map != null && map.containsKey(resultData.getMainData().getCode().getClientId())) {
            messageComposeViewObject.data.putAll(map.get(resultData.getMainData().getCode().getClientId()));
        }
        if (map2 != null && map2.containsKey(resultData.getMainData().getCode().getClientId())) {
            messageComposeViewObject.data.putAll(map2.get(resultData.getMainData().getCode().getClientId()));
        }
        return JSON.parseObject(JSON.toJSONString(messageComposeViewObject, SerializerFeature.WriteNonStringKeyAsString, SerializerFeature.DisableCircularReferenceDetect));
    }

    @Override // com.taobao.message.lab.comfrm.support.UserIdentifier
    public void identifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee19127a", new Object[]{this, str});
        } else {
            this.mIdentifier = str;
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.TransformerItemAware
    public void setTransformerItem(TransformerItem transformerItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9981bef0", new Object[]{this, transformerItem});
        } else {
            this.mItem = transformerItem;
        }
    }
}
