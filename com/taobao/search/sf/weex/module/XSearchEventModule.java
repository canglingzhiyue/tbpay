package com.taobao.search.sf.weex.module;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.weex.weex.b;
import com.taobao.search.sf.j;
import com.taobao.search.sf.o;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXRenderStrategy;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;
import tb.gse;
import tb.jyx;
import tb.kge;
import tb.nur;

/* loaded from: classes8.dex */
public class XSearchEventModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "xsearchEvent";
    private static final String TAG = "XSearchEventModule";
    private a bizImpl = new a();

    static {
        kge.a(1803208995);
    }

    @JSMethod(uiThread = true)
    public void search(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626126a1", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.a(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void refreshList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3a5cd0", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.b(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod
    public void refreshAuction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24174d61", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.c(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void searchOption(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d5792c", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.b(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod
    public void searchOptionWithCallback(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b069281", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else {
            this.bizImpl.a(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject, b.a(jSCallback), b.a(jSCallback2));
        }
    }

    @JSMethod
    public void tagSearch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86792a7", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.d(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void utClickLog(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686053ce", new Object[]{this, jSONObject});
        } else {
            a.a(jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void updateStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2b3a517", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.e(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void goToSrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b286da9b", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.f(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod
    public void openTaobaoExperience(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f8f4e7", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.g(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void jumpToTab(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd53f3d", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.h(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod
    public void commitAppmonitorAvailableJSError(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904dd6e3", new Object[]{this, jSONObject});
        } else if (this.mWXSDKInstance == null) {
        } else {
            o.a(j.f19452a).a().a(jSONObject.getString("tItemType"), jSONObject.getString(jyx.DIMENSION_JSVERSION), l.getInstance().getCurrentPageName(), 2.0d, jSONObject.getString("errorMsg"), this.mWXSDKInstance.L() == WXRenderStrategy.DATA_RENDER_BINARY);
        }
    }

    @JSMethod
    public void jumpToTimeline(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c25adf", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.i(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void reorderList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe1f2b0", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            k.a(TAG, "options参数为空");
        } else if (!jSONObject.containsKey("pageName") || !jSONObject.containsKey("contentList")) {
        } else {
            String string = jSONObject.getString("pageName");
            JSONArray jSONArray = jSONObject.getJSONArray("contentList");
            if (jSONArray == null || jSONArray.size() == 0) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("args", jSONArray.toString());
            com.taobao.android.jarviswe.a.a().a(string, "reorderList", hashMap, new gse() { // from class: com.taobao.search.sf.weex.module.XSearchEventModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gse
                public void errorReport(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
                    }
                }

                @Override // tb.gse
                public void notify(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12981c64", new Object[]{this, str, str2});
                    } else if (XSearchEventModule.this.mWXSDKInstance == null) {
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("contentList", str2);
                        XSearchEventModule.this.mWXSDKInstance.a("jarvis_reorderList", (Map<String, Object>) hashMap2);
                    }
                }
            });
        }
    }

    @JSMethod
    public void operateSearchList(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c2da7f", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.j(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod
    public void prepareCompassRequest(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f998ffc5", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.l(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = false)
    public void updateVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af89c224", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!StringUtils.isEmpty(key) && value != null) {
                    nur.a(this.mWXSDKInstance.O(), key, value.toString());
                }
            }
        }
    }

    @JSMethod(uiThread = false)
    public JSONObject getVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45e5111", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "keys");
            for (int i = 0; i < a2.size(); i++) {
                String string = a2.getString(i);
                jSONObject2.put(string, (Object) nur.a(this.mWXSDKInstance.O(), string));
            }
        }
        return jSONObject2;
    }

    @JSMethod(uiThread = false)
    public void removeVcStorage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b18329f", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "keys");
            for (int i = 0; i < a2.size(); i++) {
                nur.b(this.mWXSDKInstance.O(), a2.getString(i));
            }
        }
    }

    @JSMethod
    public void removeDynamicCard(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f9495e", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.k(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod
    public void removeSelf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f16677", new Object[]{this});
        } else {
            this.bizImpl.a(this.mWXSDKInstance);
        }
    }

    @JSMethod
    public void setParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.a(this.mWXSDKInstance, jSONObject);
        }
    }

    @JSMethod
    public void addParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54883a22", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.b(this.mWXSDKInstance, jSONObject);
        }
    }

    @JSMethod
    public void clearParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc56a8f6", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.d(this.mWXSDKInstance, jSONObject);
        }
    }

    @JSMethod
    public void removeParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b886ca5f", new Object[]{this, jSONObject});
        } else {
            this.bizImpl.c(this.mWXSDKInstance, jSONObject);
        }
    }

    @JSMethod(uiThread = false)
    public Map<String, String> getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this}) : this.bizImpl.b(this.mWXSDKInstance);
    }
}
