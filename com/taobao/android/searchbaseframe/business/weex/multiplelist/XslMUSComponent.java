package com.taobao.android.searchbaseframe.business.weex.multiplelist;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import java.util.Locale;
import tb.kge;

/* loaded from: classes6.dex */
public class XslMUSComponent extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_NAME = "xsearchlist";
    public static final String EVENT_DATA_LOADED = "dataloaded";
    public static final String EVENT_DATA_RENDERED = "datarendered";
    public static final String EVENT_ITEM_APPEAR = "itemappear";
    public static final String EVENT_ITEM_DISAPPEAR = "itemdisappear";
    public static final String EVENT_PULL_DOWN_REFRESH = "pulldownrefresh";
    public static final String EVENT_SCROLL = "scroll";
    public static final String EVENT_SCROLL_END = "scrollend";
    public static final String EVENT_SCROLL_START = "scrollstart";
    public static final String EVENT_SECTION_STICKY_CHANGE = "sectionstickychange";
    public static final String KEY_AREA_PADDING = "areaPadding";
    public static final String KEY_ATMOSPHERE = "atmosphere";
    public static final String KEY_CELL_COLOR = "cellColor";
    public static final String KEY_DEGRADED_CONFIG = "degradedConfig";
    public static final String KEY_DISABLE_DRAG = "disableDrag";
    public static final String KEY_DISABLE_LOADING = "disableLoading";
    public static final String KEY_EVENT_LISTENER = "eventListeners";
    public static final String KEY_EXTRA_STATUS = "extraStatus";
    public static final String KEY_LIST_CLIP = "listClip";
    public static final String KEY_LIST_ITEM_BACKGROUND = "itemBackground";
    public static String KEY_META_SEARCH = null;
    public static final String KEY_PRELOAD_KEY = "preloadKey";
    public static final String KEY_PREVENT_REQUEST = "preventRequest";
    public static final String KEY_REQUEST_API = "requestApi";
    public static final String KEY_REQUEST_PARAMS = "requestParams";
    public static final String KEY_SECTION_START = "sectionStart";
    public static final String KEY_STICKY_START = "stickyStart";
    public static final String KEY_STICKY_TRANSPARENT = "stickyTransparent";
    public static String PAGE_PERF_STATICS_CALLBACK;
    public static String PAGE_SCROLL_LISTENER;
    public static String TAG_XSL_NESTED_MOD;
    private b data;

    public static /* synthetic */ Object ipc$super(XslMUSComponent xslMUSComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2024255335:
                super.onUpdateLayout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case -142946533:
                return new Boolean(super.onUpdateAttr((String) objArr[0], (MUSValue) objArr[1]));
            case 474982114:
                super.onActivityResume();
                return null;
            case 545542899:
                return new Boolean(super.onUpdateStyle((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(-82383473);
        PAGE_SCROLL_LISTENER = "pageScrollListener";
        KEY_META_SEARCH = "metaSearch";
        PAGE_PERF_STATICS_CALLBACK = "pagePerfStaticsCallback";
        TAG_XSL_NESTED_MOD = "xsl_nested_mod";
    }

    public XslMUSComponent(int i) {
        super(i);
        k.d("[XS.xsl]", "Created", new Object[0]);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onUpdateLayout(i, i2, i3, i4);
        k.d("[XS.xsl]", "Layout done: [left, top, right, bottom] = [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    /* renamed from: onCreateMountContent */
    public Object mo1225onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        XslMUSLayout xslMUSLayout = new XslMUSLayout(context);
        if ("true".equals(getInstance().getTag(TAG_XSL_NESTED_MOD))) {
            xslMUSLayout.setNestedMod(true);
        }
        return xslMUSLayout;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) obj;
        xslMUSLayout.mount(this, mUSDKInstance);
        b bVar = this.data;
        if (bVar == null) {
            return;
        }
        xslMUSLayout.setData(bVar.f14954a, this.data.b, this.data.c, this.data.d, this.data.e);
        this.data = null;
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        this.data = null;
        ((XslMUSLayout) obj).unmount();
        k.d("[XS.xsl]", "Destroyed", new Object[0]);
    }

    @MUSNodeProp(name = "requestParams")
    public void setRequestParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebbb604", new Object[]{this, str});
            return;
        }
        try {
            setAttribute("requestParams", (JSONObject) JSONObject.parse(str));
        } catch (Exception unused) {
            setAttribute("requestParams", null);
        }
    }

    @MUSNodeProp(name = KEY_DISABLE_LOADING)
    public void setDisableLoading(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d50447", new Object[]{this, str});
        } else {
            setAttribute(KEY_DISABLE_LOADING, str);
        }
    }

    @MUSNodeProp(name = KEY_DISABLE_LOADING, refresh = true)
    public void refreshDisableLoading(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a5d240", new Object[]{this, str});
        } else {
            ((XslMUSLayout) getMountContent()).updateDisableLoading(this);
        }
    }

    @MUSNodeProp(name = KEY_STICKY_TRANSPARENT)
    public void setStickyTransparent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16beeb8", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            setAttribute(KEY_STICKY_TRANSPARENT, true);
        } else {
            try {
                setAttribute(KEY_STICKY_TRANSPARENT, Boolean.valueOf(Boolean.parseBoolean(str)));
            } catch (Exception unused) {
                setAttribute(KEY_STICKY_TRANSPARENT, true);
            }
        }
    }

    @MUSNodeProp(name = KEY_CELL_COLOR)
    public void setCellColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba02e30", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            setAttribute(KEY_CELL_COLOR, null);
        } else {
            try {
                setAttribute(KEY_CELL_COLOR, Integer.valueOf(Color.parseColor(str)));
            } catch (Exception unused) {
                setAttribute(KEY_CELL_COLOR, null);
            }
        }
    }

    @MUSNodeProp(name = KEY_STICKY_TRANSPARENT, refresh = true)
    public void refreshStickyTransparent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9d41df", new Object[]{this, new Boolean(z)});
        } else {
            ((XslMUSLayout) getMountContent()).updateStickyTransparent(this);
        }
    }

    @MUSNodeProp(name = KEY_LIST_CLIP)
    public void setListClip(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408635b9", new Object[]{this, jSONObject});
        } else {
            setAttribute(KEY_LIST_CLIP, jSONObject);
        }
    }

    @MUSNodeProp(name = KEY_LIST_CLIP, refresh = true)
    public void refreshListClip(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7bb0fe0", new Object[]{this, jSONObject});
        } else {
            ((XslMUSLayout) getMountContent()).updateListTopRadius(this);
        }
    }

    @MUSNodeProp(name = "requestParams", refresh = true)
    public void refreshRequestParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4aad9af", new Object[]{this, jSONObject});
        } else {
            ((XslMUSLayout) getMountContent()).setRequestParams(jSONObject, false);
        }
    }

    @MUSNodeProp(name = KEY_PREVENT_REQUEST)
    public void setPreventRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df17d034", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute(KEY_PREVENT_REQUEST, Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = KEY_PREVENT_REQUEST, refresh = true)
    public void refreshPreventRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5198d1b", new Object[]{this, new Boolean(z)});
        } else {
            ((XslMUSLayout) getMountContent()).setPreventRequest(Boolean.valueOf(z), false);
        }
    }

    @MUSNodeProp(name = KEY_AREA_PADDING)
    public void setAreaPadding(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37818787", new Object[]{this, jSONObject});
        } else {
            setAttribute(KEY_AREA_PADDING, jSONObject);
        }
    }

    @MUSNodeProp(name = KEY_AREA_PADDING, refresh = true)
    public void refreshAreaPadding(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f82800", new Object[]{this, jSONObject});
        } else {
            ((XslMUSLayout) getMountContent()).setAreaPadding(jSONObject, false);
        }
    }

    @MUSNodeProp(name = KEY_STICKY_START)
    public void setStickyStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea4cd88", new Object[]{this, str});
        } else {
            setAttribute(KEY_STICKY_START, str);
        }
    }

    @MUSNodeProp(name = KEY_SECTION_START)
    public void setSectionStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1768b50", new Object[]{this, str});
        } else {
            setAttribute(KEY_SECTION_START, str);
        }
    }

    @MUSNodeProp(name = KEY_SECTION_START, refresh = true)
    public void refreshSectionStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e48389", new Object[]{this, str});
        } else {
            ((XslMUSLayout) getMountContent()).setSectionStart(str, false);
        }
    }

    @MUSNodeProp(name = KEY_STICKY_START, refresh = true)
    public void refreshStickyStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ea6a2f", new Object[]{this, str});
        } else {
            ((XslMUSLayout) getMountContent()).setStickyStart(str, false);
        }
    }

    @MUSNodeProp(name = KEY_ATMOSPHERE)
    public void setAtmosphere(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155feab5", new Object[]{this, str});
            return;
        }
        try {
            setAttribute(KEY_ATMOSPHERE, JSON.parseObject(str));
        } catch (Exception unused) {
            setAttribute(KEY_ATMOSPHERE, "");
        }
    }

    @MUSNodeProp(name = KEY_ATMOSPHERE, refresh = true)
    public void refreshAtmosphere(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4989130c", new Object[]{this, jSONObject});
        } else {
            ((XslMUSLayout) getMountContent()).setAtmosphere(jSONObject, false);
        }
    }

    @MUSNodeProp(name = KEY_EVENT_LISTENER)
    public void setEventListeners(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e69d18", new Object[]{this, str});
        } else {
            setAttribute(KEY_EVENT_LISTENER, str);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f77acf1b", new Object[]{this, str, mUSValue})).booleanValue();
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = mUSValue == null ? null : mUSValue.convertToString();
        k.d("[XS.xsl]", "Attribute set, key: \"%s\", value: %s", objArr);
        return super.onUpdateAttr(str, mUSValue);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateStyle(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208452f3", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = mUSValue == null ? null : mUSValue.convertToString();
        k.d("[XS.xsl]", "Attribute set, key: \"%s\", value: %s", objArr);
        return super.onUpdateStyle(uINode, str, mUSValue);
    }

    @MUSNodeProp(name = KEY_EVENT_LISTENER, refresh = true)
    public void refreshEventListeners(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b76b11", new Object[]{this, str});
        } else {
            ((XslMUSLayout) getMountContent()).setScrollRangeEventItems(str, false);
        }
    }

    @MUSNodeProp(name = KEY_REQUEST_API)
    public void setRequestApi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122f99de", new Object[]{this, str});
            return;
        }
        try {
            setAttribute(KEY_REQUEST_API, JSON.parseObject(str));
        } catch (Exception unused) {
            setAttribute(KEY_REQUEST_API, "");
        }
    }

    @MUSNodeProp(name = KEY_REQUEST_API, refresh = true)
    public void refreshRequestApi(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be20cc3", new Object[]{this, jSONObject});
        } else {
            ((XslMUSLayout) getMountContent()).setApi(jSONObject, false);
        }
    }

    @MUSNodeProp(name = KEY_EXTRA_STATUS)
    public void setExtraStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab4cf0f1", new Object[]{this, str});
            return;
        }
        try {
            setAttribute(KEY_EXTRA_STATUS, JSON.parseObject(str));
        } catch (Exception unused) {
            setAttribute(KEY_EXTRA_STATUS, "");
        }
    }

    @MUSNodeProp(name = KEY_EXTRA_STATUS, refresh = true)
    public void refreshExtraStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76f0162", new Object[]{this, jSONObject});
        } else {
            ((XslMUSLayout) getMountContent()).setExtraStatus(jSONObject, false);
        }
    }

    @MUSNodeProp(name = KEY_PRELOAD_KEY)
    public void setPreloadKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1878e29", new Object[]{this, str});
        } else {
            setAttribute(KEY_PRELOAD_KEY, str);
        }
    }

    @MUSNodeProp(name = KEY_PRELOAD_KEY, refresh = true)
    public void refreshPreloadKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245840a2", new Object[]{this, str});
        } else {
            ((XslMUSLayout) getMountContent()).setPreloadKey(str, false);
        }
    }

    @MUSNodeProp(name = KEY_DEGRADED_CONFIG)
    public void setDegradedConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d639977", new Object[]{this, jSONObject});
        } else {
            setAttribute(KEY_DEGRADED_CONFIG, jSONObject);
        }
    }

    @MUSNodeProp(name = KEY_DEGRADED_CONFIG, refresh = true)
    public void refreshDegradedConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1ffa5e", new Object[]{this, jSONObject});
        } else {
            ((XslMUSLayout) getMountContent()).setDegradedConfig(jSONObject, false);
        }
    }

    @MUSNodeProp(name = KEY_DISABLE_DRAG)
    public void setDisableDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9a70f3", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute(KEY_DISABLE_DRAG, Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = KEY_DISABLE_DRAG, refresh = true)
    public void refreshDisableDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a029356c", new Object[]{this, new Boolean(z)});
        } else {
            ((XslMUSLayout) getMountContent()).setDisableDrag(Boolean.valueOf(z), false);
        }
    }

    @MUSNodeProp(name = KEY_LIST_ITEM_BACKGROUND)
    public void setItemBackground(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d91786", new Object[]{this, jSONObject});
        } else {
            setAttribute(KEY_LIST_ITEM_BACKGROUND, jSONObject);
        }
    }

    @MUSNodeProp(name = KEY_LIST_ITEM_BACKGROUND, refresh = true)
    public void refreshItemBackground(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b295786d", new Object[]{this, jSONObject});
            return;
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.setItemBackground(jSONObject, false);
    }

    @MUSMethod(uiThread = true)
    public void switchTo(int i, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b140240", new Object[]{this, new Integer(i), bool});
            return;
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        if (bool == null) {
            xslMUSLayout.switchTo(i);
        } else {
            xslMUSLayout.switchTo(i, bool.booleanValue());
        }
    }

    @MUSMethod(uiThread = true)
    public void setData(JSONObject jSONObject, int i, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeefd82e", new Object[]{this, jSONObject, new Integer(i), jSONArray});
            return;
        }
        if (k.b()) {
            k.a("[XS.xsl]", String.format(Locale.ENGLISH, "JS setData for tab: %d, config: %s, result: \n\t", Integer.valueOf(i), jSONArray), jSONObject);
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            this.data = new b(jSONObject, i, jSONArray);
        } else {
            xslMUSLayout.setData(jSONObject, i, jSONArray, 0, 0);
        }
    }

    @MUSMethod(uiThread = true)
    public void setDataWithIndex(JSONObject jSONObject, int i, JSONArray jSONArray, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94183aeb", new Object[]{this, jSONObject, new Integer(i), jSONArray, new Integer(i2), str});
            return;
        }
        if (k.b()) {
            k.a("[XS.xsl]", String.format(Locale.ENGLISH, "JS setDataWithIndex for tab: %d, config: %s,index: %d result: \n\t", Integer.valueOf(i), jSONArray, Integer.valueOf(i2)), jSONObject);
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            this.data = new b(jSONObject, i, jSONArray, i2, (int) i.a(str));
        } else {
            xslMUSLayout.setData(jSONObject, i, jSONArray, i2, (int) i.a(str));
        }
    }

    @MUSMethod(uiThread = true)
    public void appendListItems(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb6caa2", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        if (k.b()) {
            k.a("[XS.xsl]", String.format(Locale.ENGLISH, "JS appendListItems for tab: %d, result:\n\t", Integer.valueOf(i)), jSONObject);
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.appendListItems(jSONObject, i);
    }

    @MUSMethod(uiThread = true)
    public void updateListItems(JSONObject jSONObject, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49d50b3", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.updateListItems(jSONObject, i, i2, i3, false, true);
    }

    @MUSMethod
    public void updateData(JSONObject jSONObject, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef270bcd", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.updateListItems(jSONObject, i, i2, i3, true, false);
    }

    @MUSMethod
    public void updateData2(JSONObject jSONObject, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13a71239", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.updateListItems(jSONObject, i, i2, i3, true, true);
    }

    @MUSMethod(uiThread = true)
    public void jumpToTop(Boolean bool, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68cdabe4", new Object[]{this, bool, str});
            return;
        }
        k.d("[XS.xsl]", "JS jumpToTop", new Object[0]);
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.jumpToTop(bool.booleanValue(), (int) i.a(str));
    }

    @MUSMethod(uiThread = true)
    public void jumpTo(String str, int i, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d7c784", new Object[]{this, str, new Integer(i), bool});
            return;
        }
        k.d("[XS.xsl]", "JS jumpTo section: %s, index: %d", str, Integer.valueOf(i));
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.jumpTo(str, i, bool.booleanValue(), 0);
    }

    @MUSMethod(uiThread = true)
    public void jumpToWithOffset(String str, int i, Boolean bool, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0e0ea7", new Object[]{this, str, new Integer(i), bool, str2});
            return;
        }
        k.d("[XS.xsl]", "JS jumpTo section: %s, index: %d", str, Integer.valueOf(i));
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        if (bool == null || !bool.booleanValue()) {
            z = false;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "0";
        }
        try {
            xslMUSLayout.jumpTo(str, i, z, (int) i.a(str2));
        } catch (Exception unused) {
            xslMUSLayout.jumpTo(str, i, z, 0);
        }
    }

    @MUSMethod(uiThread = true)
    public void insertListItems(JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a539640", new Object[]{this, jSONObject, new Integer(i), new Integer(i2)});
            return;
        }
        if (k.b()) {
            k.d("[XS.xsl]", String.format(Locale.ENGLISH, "JS insertListItems for tab: %d, position: %d, result:\n\t", Integer.valueOf(i), Integer.valueOf(i2)), jSONObject);
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.insertListItems(jSONObject, i, i2);
    }

    @MUSMethod(uiThread = true)
    public void setRequestParams(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8e281d", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        k.d("[XS.xsl]", "JS setRequestParams for tab: %d, api: %s, params: %s", Integer.valueOf(i), str, str2);
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.setRequestParams(i, str, str2);
    }

    @MUSMethod(uiThread = true)
    public void endRefresh(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b040e9dc", new Object[]{this, new Integer(i)});
            return;
        }
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.endRefresh(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.onActivityResume();
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        XslMUSLayout xslMUSLayout = (XslMUSLayout) getMountContent();
        if (xslMUSLayout == null) {
            return;
        }
        xslMUSLayout.onActivityPause();
    }
}
