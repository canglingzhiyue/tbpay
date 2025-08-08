package com.taobao.android.searchbaseframe.business.weex.multiplelist;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.action.GraphicPosition;
import com.taobao.weex.ui.action.GraphicSize;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXComponentProp;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.iuc;
import tb.kge;

/* loaded from: classes6.dex */
public class XslComponent extends WXVContainer<ViewGroup> implements XslModule.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_NAME = "xsearchlist";
    private static final String LOG_TAG = "XslComponent";
    private FrameLayout mRoot;
    private boolean mSticky;
    private XslModule recommendModule;
    private List<ScrollRangeEventItem> scrollRangeEventItems;

    static {
        kge.a(283122176);
        kge.a(-1923205815);
    }

    public static /* synthetic */ Object ipc$super(XslComponent xslComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2027401452:
                super.onRenderFinish(((Number) objArr[0]).intValue());
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1838781464:
                super.setDemission((GraphicSize) objArr[0], (GraphicPosition) objArr[1]);
                return null;
            case -631271867:
                super.updateAttrs((WXComponent) objArr[0]);
                return null;
            case -17468269:
                super.onActivityDestroy();
                return null;
            case 474982114:
                super.onActivityResume();
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onPageScrollStateChange(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e481c", new Object[]{this, new Boolean(z), new Integer(i)});
        }
    }

    public static void registerSCore(XslModule.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de6ef4e5", new Object[]{dVar});
        } else {
            XslModule.a(dVar);
        }
    }

    public XslComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mSticky = false;
        this.recommendModule = generalRcmdModule();
        this.recommendModule.b(wXSDKInstance.ak());
        this.recommendModule.getCore().b().c("XSPerfTimestamp", "XslComponentCreate: %d", Long.valueOf(System.currentTimeMillis()));
        this.recommendModule.a(this);
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    /* renamed from: initComponentHostView  reason: collision with other method in class */
    public ViewGroup mo1592initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("c190d02e", new Object[]{this, context});
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return null;
        }
        xslModule.a(new XslModule.e() { // from class: com.taobao.android.searchbaseframe.business.weex.multiplelist.XslComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.e
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tabIndex", (Object) Integer.valueOf(i));
                XslComponent.this.fireEvent("beforetabrequest", jSONObject);
            }

            @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.e
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tabIndex", (Object) Integer.valueOf(i));
                jSONObject.put("page", (Object) Integer.valueOf(i2));
                XslComponent.this.fireEvent("paging", jSONObject);
            }
        });
        this.mRoot = new FrameLayout(context);
        return this.mRoot;
    }

    @WXComponentProp(name = "requestParams")
    public void setRequestParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebbb604", new Object[]{this, str});
        } else if (this.recommendModule == null) {
        } else {
            setRequestParams((JSONObject) JSONObject.parse(str), this.recommendModule);
        }
    }

    @WXComponentProp(name = XslMUSComponent.KEY_PREVENT_REQUEST)
    public void setPreventRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df17d034", new Object[]{this, new Boolean(z)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.b(z);
    }

    @WXComponentProp(name = XslMUSComponent.KEY_AREA_PADDING)
    public void setAreaPadding(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37818787", new Object[]{this, jSONObject});
        } else if (this.recommendModule == null) {
        } else {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("topHeader");
                this.recommendModule.d(getPaddingValue(jSONObject2, "topPadding"));
                this.recommendModule.e(getPaddingValue(jSONObject2, "bottomPadding"));
                JSONObject jSONObject3 = jSONObject.getJSONObject("foldHeader");
                this.recommendModule.f(getPaddingValue(jSONObject3, "topPadding"));
                this.recommendModule.g(getPaddingValue(jSONObject3, "bottomPadding"));
                JSONObject jSONObject4 = jSONObject.getJSONObject("listHeader");
                this.recommendModule.h(getPaddingValue(jSONObject4, "topPadding"));
                this.recommendModule.i(getPaddingValue(jSONObject4, "bottomPadding"));
                JSONObject jSONObject5 = jSONObject.getJSONObject("listItems");
                this.recommendModule.j(getPaddingValue(jSONObject5, "topPadding"));
                this.recommendModule.k(getPaddingValue(jSONObject5, "bottomPadding"));
                this.recommendModule.p(getPaddingValue(jSONObject5, "itemMargin", -1));
                this.recommendModule.n(getPaddingValue(jSONObject5, "itemSpacing", -1));
                JSONObject jSONObject6 = jSONObject.getJSONObject("listFooter");
                this.recommendModule.l(getPaddingValue(jSONObject6, "topPadding"));
                this.recommendModule.m(getPaddingValue(jSONObject6, "bottomPadding"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private int getPaddingValue(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8430a9b0", new Object[]{this, jSONObject, str})).intValue() : getPaddingValue(jSONObject, str, 0);
    }

    private int getPaddingValue(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e500d9", new Object[]{this, jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null) {
            return i;
        }
        String string = jSONObject.getString(str);
        return StringUtils.isEmpty(string) ? i : (int) iuc.a(string);
    }

    private void setRequestParams(JSONObject jSONObject, XslModule xslModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfbe0c45", new Object[]{this, jSONObject, xslModule});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (String str : jSONObject.keySet()) {
            if ("params".equals(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                for (String str2 : jSONObject2.keySet()) {
                    hashMap2.put(str2, jSONObject2.get(str2) + "");
                }
            } else {
                hashMap.put(str, jSONObject.get(str) + "");
            }
        }
        xslModule.a(hashMap);
        xslModule.b(hashMap2);
    }

    private void setRequestParams(JSONObject jSONObject, XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2c6b4c", new Object[]{this, jSONObject, xslDatasource});
            return;
        }
        for (String str : jSONObject.keySet()) {
            if ("params".equals(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                for (String str2 : jSONObject2.keySet()) {
                    xslDatasource.addTppParam(str2, jSONObject2.get(str2) + "");
                }
            } else {
                xslDatasource.setParam(str, jSONObject.get(str) + "");
            }
        }
    }

    @WXComponentProp(name = XslMUSComponent.KEY_STICKY_START)
    public void setStickyStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea4cd88", new Object[]{this, str});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        try {
            xslModule.a((int) iuc.a(str));
        } catch (Exception e) {
            k.a(LOG_TAG, "xslComponent: " + e);
        }
    }

    @WXComponentProp(name = XslMUSComponent.KEY_ATMOSPHERE)
    public void setAtmosphere(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155feab5", new Object[]{this, str});
        } else if (this.recommendModule == null || str == null) {
        } else {
            try {
                JSONObject jSONObject = (JSONObject) JSONObject.parse(str);
                String string = jSONObject.getString("type");
                String string2 = jSONObject.getString("url");
                Boolean bool = jSONObject.getBoolean("animate");
                if (bool != null) {
                    z = bool.booleanValue();
                }
                if (string != null && string2 != null) {
                    this.recommendModule.a(string, string2);
                    this.recommendModule.e(z);
                }
            } catch (Exception e) {
                k.a(LOG_TAG, "xslComponent: " + e);
            }
        }
    }

    @WXComponentProp(name = XslMUSComponent.KEY_EVENT_LISTENER)
    public void setEventListeners(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e69d18", new Object[]{this, str});
        } else if (this.recommendModule != null && this.scrollRangeEventItems == null) {
            this.scrollRangeEventItems = JSONArray.parseArray(str, ScrollRangeEventItem.class);
            for (ScrollRangeEventItem scrollRangeEventItem : this.scrollRangeEventItems) {
                for (int i = 0; i < scrollRangeEventItem.params.size(); i++) {
                    scrollRangeEventItem.pxParams.add(Integer.valueOf((int) iuc.a(scrollRangeEventItem.params.get(i))));
                }
            }
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void setDemission(GraphicSize graphicSize, GraphicPosition graphicPosition) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92666be8", new Object[]{this, graphicSize, graphicPosition});
        } else {
            super.setDemission(graphicSize, graphicPosition);
        }
    }

    @WXComponentProp(name = XslMUSComponent.KEY_REQUEST_API)
    public void setRequestApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122f99de", new Object[]{this, str});
        } else if (this.recommendModule == null) {
        } else {
            JSONObject jSONObject = (JSONObject) JSONObject.parse(str);
            this.recommendModule.a(jSONObject.getString("api"), jSONObject.getString("version"), jSONObject.getString("alias"));
        }
    }

    private void setRequestApi(JSONObject jSONObject, XslDatasource xslDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef238826", new Object[]{this, jSONObject, xslDatasource});
            return;
        }
        String string = jSONObject.getString("api");
        String string2 = jSONObject.getString("version");
        String string3 = jSONObject.getString("alias");
        if (xslDatasource == null) {
            return;
        }
        if (StringUtils.isEmpty(string3)) {
            xslDatasource.setApi(string, string2);
        } else {
            xslDatasource.setApi(string, string2, string3);
        }
    }

    @WXComponentProp(name = XslMUSComponent.KEY_EXTRA_STATUS)
    public void setExtraStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4cf0f1", new Object[]{this, str});
        } else if (this.recommendModule == null) {
        } else {
            this.recommendModule.b(JSONObject.parseObject(str));
        }
    }

    @WXComponentProp(name = XslMUSComponent.KEY_PRELOAD_KEY)
    public void setPreloadKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1878e29", new Object[]{this, str});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.c(str);
    }

    @WXComponentProp(name = XslMUSComponent.KEY_DEGRADED_CONFIG)
    public void setDegradedConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d639977", new Object[]{this, jSONObject});
        } else if (this.recommendModule != null && jSONObject != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getValue() instanceof String) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
            this.recommendModule.c(hashMap);
        }
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void onRenderFinish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87284f14", new Object[]{this, new Integer(i)});
        } else {
            super.onRenderFinish(i);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateAttrs(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5f8e45", new Object[]{this, wXComponent});
            return;
        }
        super.updateAttrs(wXComponent);
        if (this.recommendModule == null) {
            return;
        }
        if (this.mRoot.getChildCount() == 0) {
            this.mRoot.addView(this.recommendModule.f(), -1, -1);
        }
        this.recommendModule.h();
    }

    public XslModule generalRcmdModule() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XslModule) ipChange.ipc$dispatch("606a9b8e", new Object[]{this}) : new XslModule((Activity) getContext());
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.j();
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        super.onActivityDestroy();
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.k();
        this.recommendModule = null;
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.k();
        this.recommendModule = null;
    }

    @Override // com.taobao.weex.ui.component.WXVContainer, com.taobao.weex.ui.component.WXComponent, com.taobao.weex.l
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.i();
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onTabChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d6597e", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) Integer.valueOf(i));
        fireEvent("tabchanged", jSONObject);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onDynamicError(String str, Object obj, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2afb49", new Object[]{this, str, obj, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message", "" + str2 + str3);
        fireEvent("error", hashMap);
    }

    @JSMethod(uiThread = true)
    public void switchTo(int i, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b140240", new Object[]{this, new Integer(i), bool});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        if (bool == null) {
            xslModule.s(i);
        } else {
            xslModule.a(i, bool.booleanValue());
        }
    }

    @WXComponentProp(name = XslMUSComponent.KEY_DISABLE_DRAG)
    public void setDisableDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9a70f3", new Object[]{this, new Boolean(z)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.f(z);
    }

    @JSMethod(uiThread = true)
    public void setData(JSONObject jSONObject, int i, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeefd82e", new Object[]{this, jSONObject, new Integer(i), jSONArray});
        } else if (this.recommendModule != null) {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.add(jSONObject);
            jSONObject2.put("result", (Object) jSONArray2);
            if (jSONArray == null || jSONArray.isEmpty()) {
                this.recommendModule.a(i, jSONObject2);
                return;
            }
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                hashSet.add(jSONArray.getString(i2));
            }
            this.recommendModule.a(i, jSONObject2, hashSet);
        }
    }

    @JSMethod(uiThread = true)
    public void appendListItems(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb6caa2", new Object[]{this, jSONObject, new Integer(i)});
        } else if (this.recommendModule == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(jSONObject);
            jSONObject2.put("result", (Object) jSONArray);
            this.recommendModule.b(i, jSONObject2);
        }
    }

    @JSMethod(uiThread = true)
    public void insertListItems(JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a539640", new Object[]{this, jSONObject, new Integer(i), new Integer(i2)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.a(i, i2, jSONObject);
    }

    @JSMethod(uiThread = true)
    public void setRequestParams(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8e281d", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        XslDatasource q = xslModule.q(i);
        setRequestParams(JSONObject.parseObject(str2), q);
        setRequestApi(JSONObject.parseObject(str), q);
        this.recommendModule.a(null, null, null, null, i);
    }

    @JSMethod(uiThread = true)
    public void jumpTo(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a483d29", new Object[]{this, str, new Integer(i)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.a(str, i);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onDataLoaded(com.taobao.android.searchbaseframe.datasource.a<?, ?, ?> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839fd827", new Object[]{this, aVar});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null || xslModule.l() == null) {
            return;
        }
        XslDatasource xslDatasource = (XslDatasource) aVar;
        int currentTabIndex = xslDatasource.getCurrentTabIndex();
        if (!this.recommendModule.d()) {
            XslSearchResult xslSearchResult = (XslSearchResult) xslDatasource.getLastSearchResult();
            Map<String, Object> jSONObject = new JSONObject();
            if (xslSearchResult != null) {
                if (xslSearchResult.getCurrentData() != null) {
                    jSONObject.put("data", (Object) xslSearchResult.getCurrentData());
                } else {
                    jSONObject.put("data", (Object) new JSONObject());
                    JSONArray jSONArray = new JSONArray();
                    if (xslSearchResult.getError() != null) {
                        jSONArray.add(xslSearchResult.getError().getErrorMsg());
                    }
                    jSONObject.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, (Object) jSONArray);
                }
            } else {
                jSONObject.put("data", (Object) new JSONObject());
            }
            jSONObject.put("tabIndex", (Object) Integer.valueOf(currentTabIndex));
            fireEvent(XslMUSComponent.EVENT_DATA_LOADED, jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tabIndex", (Object) Integer.valueOf(currentTabIndex));
        fireEvent(XslMUSComponent.EVENT_DATA_RENDERED, jSONObject2);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onDataLoadedMeta(com.taobao.android.searchbaseframe.datasource.a<?, ?, ?> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c882f222", new Object[]{this, aVar});
            return;
        }
        XslDatasource xslDatasource = (XslDatasource) aVar;
        int currentTabIndex = xslDatasource.getCurrentTabIndex();
        XslSearchResult xslSearchResult = (XslSearchResult) xslDatasource.getLastSearchResult();
        Map<String, Object> jSONObject = new JSONObject();
        if (xslSearchResult != null) {
            if (xslSearchResult.getCurrentData() != null) {
                jSONObject.put("data", (Object) xslSearchResult.getCurrentData());
            } else {
                jSONObject.put("data", (Object) new JSONObject());
                JSONArray jSONArray = new JSONArray();
                if (xslSearchResult.getError() != null) {
                    jSONArray.add(xslSearchResult.getError().getErrorMsg());
                }
                jSONObject.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, (Object) jSONArray);
            }
        } else {
            jSONObject.put("data", (Object) new JSONObject());
        }
        jSONObject.put("tabIndex", (Object) Integer.valueOf(currentTabIndex));
        fireEvent(XslMUSComponent.EVENT_DATA_LOADED, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tabIndex", (Object) Integer.valueOf(currentTabIndex));
        fireEvent(XslMUSComponent.EVENT_DATA_RENDERED, jSONObject2);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onPageScroll(int i) {
        List<ScrollRangeEventItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6d86c1", new Object[]{this, new Integer(i)});
        } else if (this.recommendModule != null && (list = this.scrollRangeEventItems) != null) {
            for (ScrollRangeEventItem scrollRangeEventItem : list) {
                int i2 = 0;
                while (true) {
                    if (i2 >= scrollRangeEventItem.pxParams.size()) {
                        break;
                    } else if (i < scrollRangeEventItem.pxParams.get(i2).intValue()) {
                        if (scrollRangeEventItem.currentPosition != i2) {
                            scrollRangeEventItem.currentPosition = i2;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("type", (Object) "scroll");
                            jSONObject.put("range", (Object) Integer.valueOf(scrollRangeEventItem.currentPosition));
                            fireEvent("triggercallback", jSONObject);
                        }
                    } else if (i2 == scrollRangeEventItem.pxParams.size() - 1) {
                        int i3 = i2 + 1;
                        if (scrollRangeEventItem.currentPosition != i3) {
                            scrollRangeEventItem.currentPosition = i3;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("type", (Object) "scroll");
                            jSONObject2.put("range", (Object) Integer.valueOf(scrollRangeEventItem.currentPosition));
                            fireEvent("triggercallback", jSONObject2);
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule != null) {
            return xslModule.m();
        }
        return true;
    }

    public boolean isReachBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b2447f", new Object[]{this})).booleanValue();
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule != null) {
            return xslModule.n();
        }
        return true;
    }
}
