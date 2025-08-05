package com.taobao.message.lab.comfrm.support.list;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.dycontainer.BaseWVApiPlugin;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.ISnapshotCustom;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ClipSectionFunction implements ISnapshotCustom {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1896016338);
        kge.a(-55867235);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.ISnapshotCustom
    public ViewObject snapshot(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewObject) ipChange.ipc$dispatch("3b05803", new Object[]{this, viewObject}) : sectionOptimizeClip(viewObject, new int[]{20});
    }

    private ViewObject sectionOptimizeClip(ViewObject viewObject, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("38f9d43", new Object[]{this, viewObject, iArr});
        }
        if (viewObject == null) {
            return null;
        }
        if (viewObject.info != null && viewObject.info.renderTemplate != null && "native".equals(viewObject.info.renderTemplate.renderType) && AbsListWidgetInstance.SLOT_SECTION.equals(viewObject.info.renderTemplate.name)) {
            ViewObject viewObject2 = new ViewObject(viewObject);
            viewObject2.children = new HashMap();
            if (viewObject.children != null) {
                viewObject2.children.putAll(viewObject.children);
                List list = (List) viewObject.children.get("content");
                if (iArr[0] <= 0) {
                    viewObject2.children.put("content", new ArrayList());
                } else if (list.size() > iArr[0]) {
                    viewObject2.children.put("content", list.subList(0, iArr[0]));
                    iArr[0] = 0;
                } else {
                    iArr[0] = iArr[0] - list.size();
                }
            }
            return viewObject2;
        } else if (viewObject.info != null && viewObject.info.renderTemplate != null && "native".equals(viewObject.info.renderTemplate.renderType) && "widget.message.common.operationArea".equals(viewObject.info.renderTemplate.name)) {
            try {
                return markSnapshotInHeaderTop(viewObject);
            } catch (Exception unused) {
                return viewObject;
            }
        } else {
            HashMap hashMap = new HashMap();
            if (viewObject.children != null) {
                for (Map.Entry<String, Object> entry : viewObject.children.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof List) {
                        ArrayList arrayList = new ArrayList();
                        boolean z = false;
                        for (Object obj : (List) value) {
                            if (obj instanceof ViewObject) {
                                ViewObject sectionOptimizeClip = sectionOptimizeClip((ViewObject) obj, iArr);
                                if (sectionOptimizeClip != obj) {
                                    z = true;
                                }
                                arrayList.add(sectionOptimizeClip);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        if (z) {
                            hashMap.put(key, arrayList);
                        }
                    } else if (value instanceof ViewObject) {
                        ViewObject sectionOptimizeClip2 = sectionOptimizeClip((ViewObject) value, iArr);
                        if (sectionOptimizeClip2 != value) {
                            hashMap.put(key, sectionOptimizeClip2);
                        }
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return viewObject;
            }
            ViewObject viewObject3 = new ViewObject(viewObject);
            viewObject3.children = new HashMap();
            if (viewObject.children != null) {
                viewObject3.children.putAll(viewObject.children);
                viewObject3.children.putAll(hashMap);
            }
            return viewObject3;
        }
    }

    private ViewObject markSnapshotInHeaderTop(ViewObject viewObject) {
        JSONObject parseObject;
        JSONObject jSONObject;
        JSONArray jSONArray;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("4409c415", new Object[]{this, viewObject});
        }
        if ("1".equals(ValueUtil.getValue("degradeMarkSnapshotInHeaderTop", "0"))) {
            return viewObject;
        }
        if (viewObject == null) {
            return null;
        }
        if (!(viewObject.data instanceof JSONObject) || (jSONObject = (parseObject = JSON.parseObject(JSON.toJSONString(viewObject.data))).getJSONObject("operationArea")) == null || (jSONArray = jSONObject.getJSONArray("subContainerList")) == null || jSONArray.size() <= 0) {
            return viewObject;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            if (jSONArray.get(0) instanceof JSONObject) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.get(BaseWVApiPlugin.RESOURCE_LIST_KEY) != null && (jSONObject2.get(BaseWVApiPlugin.RESOURCE_LIST_KEY) instanceof JSONArray)) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray(BaseWVApiPlugin.RESOURCE_LIST_KEY);
                    if (jSONArray2.size() > 0) {
                        for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                            if (jSONArray2.get(i2) instanceof JSONObject) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                                if (jSONObject3.get("resData") != null && (jSONObject3.get("resData") instanceof JSONObject)) {
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("resData");
                                    if (ApplicationUtil.isDebug() && jSONObject4.containsKey("isSnapshot") && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
                                        defaultUncaughtExceptionHandler.uncaughtException(VExecutors.currentThread(), new IllegalArgumentException("投放key冲突，isSnapshot"));
                                    }
                                    jSONObject4.put("isSnapshot", (Object) "1");
                                }
                            }
                        }
                    }
                }
            }
        }
        ViewObject viewObject2 = new ViewObject(viewObject);
        viewObject2.data = parseObject;
        return viewObject2;
    }
}
