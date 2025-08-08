package com.taobao.android.searchbaseframe.business.weex.multiplelist;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.track.d;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.xsl.h;
import com.taobao.android.searchbaseframe.xsl.i;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class XslMUSLayout extends FrameLayout implements XslModule.c, com.taobao.android.searchbaseframe.xsl.refact.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_COMBO_LOAD_MORE = "comboloadmore";
    private int currentIndex;
    private p instance;
    private boolean nestedMod;
    private int nodeId;
    private XslModule recommendModule;
    private a scrollAction;
    private List<ScrollRangeEventItem> scrollRangeEventItems;
    private h stats;
    private boolean sticky;
    private XslMUSComponent target;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14952a;
        public int b;
        public int c;

        static {
            kge.a(-29299478);
        }

        public a(int i, int i2, int i3) {
            this.f14952a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    static {
        kge.a(-1323482152);
        kge.a(-1923205815);
        kge.a(-1226211266);
    }

    public static /* synthetic */ Object ipc$super(XslMUSLayout xslMUSLayout, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$000(XslMUSLayout xslMUSLayout, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ec2609c", new Object[]{xslMUSLayout, str})).booleanValue() : xslMUSLayout.hasEvent(str);
    }

    public static /* synthetic */ JSONObject access$100(XslMUSLayout xslMUSLayout, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f186e3d9", new Object[]{xslMUSLayout, new Integer(i), new Integer(i2), str}) : xslMUSLayout.assembleExposeData(i, i2, str);
    }

    public static /* synthetic */ void access$200(XslMUSLayout xslMUSLayout, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342c1e96", new Object[]{xslMUSLayout, str, jSONObject});
        } else {
            xslMUSLayout.fireWithoutCheck(str, jSONObject);
        }
    }

    public static /* synthetic */ a access$300(XslMUSLayout xslMUSLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("921e101f", new Object[]{xslMUSLayout}) : xslMUSLayout.scrollAction;
    }

    public static /* synthetic */ a access$302(XslMUSLayout xslMUSLayout, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3ec16b23", new Object[]{xslMUSLayout, aVar});
        }
        xslMUSLayout.scrollAction = aVar;
        return aVar;
    }

    public static /* synthetic */ XslModule access$400(XslMUSLayout xslMUSLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (XslModule) ipChange.ipc$dispatch("539d7e3d", new Object[]{xslMUSLayout}) : xslMUSLayout.recommendModule;
    }

    public static /* synthetic */ void access$500(XslMUSLayout xslMUSLayout, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238fd873", new Object[]{xslMUSLayout, str, jSONObject});
        } else {
            xslMUSLayout.fire(str, jSONObject);
        }
    }

    public XslMUSLayout(Context context) {
        super(context);
        this.sticky = false;
        this.currentIndex = 0;
        if (context instanceof i) {
            this.stats = ((i) context).a();
        }
    }

    private void updateProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927e1745", new Object[]{this});
            return;
        }
        setAreaPadding((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_AREA_PADDING), true);
        setRequestParams((JSONObject) this.target.getAttribute("requestParams"), true);
        setPreventRequest((Boolean) this.target.getAttribute(XslMUSComponent.KEY_PREVENT_REQUEST), true);
        setApi((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_REQUEST_API), true);
        setAtmosphere((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_ATMOSPHERE), true);
        setScrollRangeEventItems((String) this.target.getAttribute(XslMUSComponent.KEY_EVENT_LISTENER), true);
        setPreloadKey((String) this.target.getAttribute(XslMUSComponent.KEY_PRELOAD_KEY), true);
        setStickyStart((String) this.target.getAttribute(XslMUSComponent.KEY_STICKY_START), true);
        setSectionStart((String) this.target.getAttribute(XslMUSComponent.KEY_SECTION_START), true);
        setDegradedConfig((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_DEGRADED_CONFIG), true);
        setExtraStatus((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_EXTRA_STATUS), true);
        setDisableDrag((Boolean) this.target.getAttribute(XslMUSComponent.KEY_DISABLE_DRAG), true);
        setItemBackground((JSONObject) this.target.getAttribute(XslMUSComponent.KEY_LIST_ITEM_BACKGROUND), true);
        updateStickyTransparent(this.target);
        updateListTopRadius(this.target);
        updateDisableLoading(this.target);
        this.recommendModule.a((Integer) this.target.getAttribute(XslMUSComponent.KEY_CELL_COLOR));
    }

    public void setPreloadKey(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6ae9cb", new Object[]{this, str, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) && z) {
        } else {
            this.recommendModule.c(str);
        }
    }

    public boolean isNestedMod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59dbb48c", new Object[]{this})).booleanValue() : this.nestedMod;
    }

    public void setNestedMod(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17e3c84", new Object[]{this, new Boolean(z)});
        } else {
            this.nestedMod = z;
        }
    }

    public void setScrollRangeEventItems(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94de1f4f", new Object[]{this, str, new Boolean(z)});
        } else if (!StringUtils.isEmpty(str) || !z) {
            if (str == null) {
                this.scrollRangeEventItems = null;
                return;
            }
            this.scrollRangeEventItems = JSONArray.parseArray(str, ScrollRangeEventItem.class);
            for (ScrollRangeEventItem scrollRangeEventItem : this.scrollRangeEventItems) {
                for (int i = 0; i < scrollRangeEventItem.params.size(); i++) {
                    scrollRangeEventItem.pxParams.add(Integer.valueOf((int) com.taobao.android.weex_framework.util.i.a(scrollRangeEventItem.params.get(i))));
                }
            }
        }
    }

    public void setAtmosphere(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82360cf", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null && z) {
        } else {
            if (jSONObject == null) {
                this.recommendModule.a("", "");
                this.recommendModule.e(true);
                this.recommendModule.d((String) null);
                return;
            }
            String string = jSONObject.getString("type");
            String string2 = jSONObject.getString("url");
            this.recommendModule.d(jSONObject.getString("listBgColor"));
            Boolean bool = jSONObject.getBoolean("animate");
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            if (string == null || string2 == null) {
                return;
            }
            this.recommendModule.a(string, string2);
            this.recommendModule.e(z2);
        }
    }

    public void setApi(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1254903", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null && z) {
        } else {
            if (jSONObject == null) {
                this.recommendModule.a("", "", "");
            } else {
                this.recommendModule.a(jSONObject.getString("api"), jSONObject.getString("version"), jSONObject.getString("alias"));
            }
        }
    }

    public void setPreventRequest(Boolean bool, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cf3c7", new Object[]{this, bool, new Boolean(z)});
        } else if (z && bool == null) {
        } else {
            XslModule xslModule = this.recommendModule;
            if (bool == null || !bool.booleanValue()) {
                z2 = false;
            }
            xslModule.b(z2);
        }
    }

    public void setRequestParams(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4ae1e", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (!z || jSONObject != null) {
            boolean booleanValue = jSONObject.getBooleanValue("isFlatParams");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (jSONObject == null) {
                this.recommendModule.a(new HashMap());
                this.recommendModule.b(new HashMap());
                return;
            }
            for (String str : jSONObject.keySet()) {
                if (!StringUtils.equals("isFlatParams", str)) {
                    if ("params".equals(str)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                        for (String str2 : jSONObject2.keySet()) {
                            if (booleanValue) {
                                hashMap.put(str2, jSONObject2.get(str2) + "");
                            } else {
                                hashMap2.put(str2, jSONObject2.get(str2) + "");
                            }
                        }
                    } else {
                        hashMap.put(str, jSONObject.get(str) + "");
                    }
                }
            }
            this.recommendModule.d(booleanValue);
            this.recommendModule.a(hashMap);
            this.recommendModule.b(hashMap2);
        }
    }

    public void setAreaPadding(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b01c2d", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (z && jSONObject == null) {
        } else {
            if (jSONObject == null) {
                this.recommendModule.d(0);
                this.recommendModule.e(0);
                this.recommendModule.f(0);
                this.recommendModule.g(0);
                this.recommendModule.h(0);
                this.recommendModule.i(0);
                this.recommendModule.j(0);
                this.recommendModule.k(0);
                this.recommendModule.l(0);
                this.recommendModule.m(0);
                return;
            }
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
                this.recommendModule.p(getPaddingValue(jSONObject5, "itemMargin", -1));
                this.recommendModule.n(getPaddingValue(jSONObject5, "itemSpacing", -1));
                this.recommendModule.j(getPaddingValue(jSONObject5, "topPadding"));
                this.recommendModule.k(getPaddingValue(jSONObject5, "bottomPadding"));
                Integer integer = jSONObject5.getInteger(Constants.Name.COLUMN_COUNT);
                if (integer != null) {
                    this.recommendModule.o(integer.intValue());
                }
                JSONObject jSONObject6 = jSONObject.getJSONObject("listFooter");
                this.recommendModule.l(getPaddingValue(jSONObject6, "topPadding"));
                this.recommendModule.m(getPaddingValue(jSONObject6, "bottomPadding"));
            } catch (Exception e) {
                g.c("XSearchList", "set padding format error", e);
            }
        }
    }

    public void setDisableDrag(Boolean bool, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5544a8", new Object[]{this, bool, new Boolean(z)});
        } else if (bool == null && z) {
        } else {
            XslModule xslModule = this.recommendModule;
            if (bool == null || !bool.booleanValue()) {
                z2 = false;
            }
            xslModule.f(z2);
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
        return StringUtils.isEmpty(string) ? i : (int) com.taobao.android.weex_framework.util.i.a(string);
    }

    public void setDegradedConfig(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f10483d", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject != null || !z) {
            if (jSONObject == null) {
                this.recommendModule.c(new HashMap());
                return;
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (entry.getValue() instanceof String) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
            this.recommendModule.c(hashMap);
        }
    }

    public void setExtraStatus(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7146f0b", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null && z) {
        } else {
            if (jSONObject == null) {
                this.recommendModule.b((JSONObject) null);
            } else {
                this.recommendModule.b(jSONObject);
            }
        }
    }

    public void setStickyStart(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5964c", new Object[]{this, str, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) && z) {
        } else {
            if (StringUtils.isEmpty(str)) {
                this.recommendModule.a(0);
            } else {
                this.recommendModule.a((int) com.taobao.android.weex_framework.util.i.a(str));
            }
        }
    }

    public void updateStickyTransparent(UINode uINode) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bef1201", new Object[]{this, uINode});
            return;
        }
        Boolean bool = (Boolean) uINode.getAttribute(XslMUSComponent.KEY_STICKY_TRANSPARENT);
        XslModule xslModule = this.recommendModule;
        if (bool != null && !bool.booleanValue()) {
            z = false;
        }
        xslModule.c(z);
    }

    public void updateDisableLoading(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bfc50a4", new Object[]{this, uINode});
        } else {
            this.recommendModule.h(StringUtils.equals((String) uINode.getAttribute(XslMUSComponent.KEY_DISABLE_LOADING), "true"));
        }
    }

    public void updateListTopRadius(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623a62e1", new Object[]{this, uINode});
            return;
        }
        JSONObject jSONObject = (JSONObject) uINode.getAttribute(XslMUSComponent.KEY_LIST_CLIP);
        if (jSONObject == null) {
            this.recommendModule.b(0);
            return;
        }
        try {
            this.recommendModule.b((int) com.taobao.android.weex_framework.util.i.a(jSONObject.getString("topRadius")));
        } catch (Exception unused) {
            this.recommendModule.b(0);
        }
    }

    public void setSectionStart(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5b9184", new Object[]{this, str, new Boolean(z)});
        } else if (StringUtils.isEmpty(str) && z) {
        } else {
            if (StringUtils.isEmpty(str)) {
                this.recommendModule.c(0);
            } else {
                this.recommendModule.c((int) com.taobao.android.weex_framework.util.i.a(str));
            }
        }
    }

    public void setItemBackground(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864a8c0e", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null && z) {
        } else {
            this.recommendModule.a(jSONObject);
        }
    }

    public void mount(XslMUSComponent xslMUSComponent, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e5dfdb", new Object[]{this, xslMUSComponent, pVar});
            return;
        }
        this.target = xslMUSComponent;
        this.instance = pVar;
        this.nodeId = xslMUSComponent.getNodeId();
        if (this.recommendModule == null) {
            this.recommendModule = new XslModule((Activity) getContext());
            this.recommendModule.i(isNestedMod());
            this.recommendModule.a(pVar);
            this.recommendModule.a("mus_xsearchlist");
            this.recommendModule.b(pVar.getMonitorInfo().e());
            this.recommendModule.getCore().b().c("XSPerfTimestamp", "XslComponentCreate: %d", Long.valueOf(System.currentTimeMillis()));
            this.recommendModule.a((XslModule.c) this);
            this.recommendModule.a((com.taobao.android.searchbaseframe.xsl.refact.a) this);
            this.recommendModule.a(xslMUSComponent.hasEvent(XslMUSComponent.EVENT_PULL_DOWN_REFRESH));
            this.recommendModule.g(xslMUSComponent.hasEvent(XslMUSComponent.EVENT_SECTION_STICKY_CHANGE));
            this.recommendModule.a(new com.taobao.android.searchbaseframe.xsl.module.a() { // from class: com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.xsl.module.a
                public void a(int i, int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9d025a92", new Object[]{this, new Integer(i), new Integer(i2), str});
                        return;
                    }
                    if (XslMUSLayout.access$000(XslMUSLayout.this, XslMUSComponent.EVENT_ITEM_APPEAR)) {
                        XslMUSLayout xslMUSLayout = XslMUSLayout.this;
                        XslMUSLayout.access$200(xslMUSLayout, XslMUSComponent.EVENT_ITEM_APPEAR, XslMUSLayout.access$100(xslMUSLayout, i, i2, str));
                    }
                    if (XslMUSLayout.access$300(XslMUSLayout.this) == null || XslMUSLayout.access$300(XslMUSLayout.this).b <= 0 || XslMUSLayout.access$300(XslMUSLayout.this).f14952a != i) {
                        return;
                    }
                    XslMUSLayout.access$400(XslMUSLayout.this).a("list", XslMUSLayout.access$300(XslMUSLayout.this).b, false, XslMUSLayout.access$300(XslMUSLayout.this).c);
                    XslMUSLayout.access$302(XslMUSLayout.this, null);
                }

                @Override // com.taobao.android.searchbaseframe.xsl.module.a
                public void b(int i, int i2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2132a793", new Object[]{this, new Integer(i), new Integer(i2), str});
                    } else if (!XslMUSLayout.access$000(XslMUSLayout.this, XslMUSComponent.EVENT_ITEM_DISAPPEAR)) {
                    } else {
                        XslMUSLayout xslMUSLayout = XslMUSLayout.this;
                        XslMUSLayout.access$200(xslMUSLayout, XslMUSComponent.EVENT_ITEM_DISAPPEAR, XslMUSLayout.access$100(xslMUSLayout, i, i2, str));
                    }
                }

                @Override // com.taobao.android.searchbaseframe.xsl.module.a
                public void a(int i, int i2, int i3, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9d1624e9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Long(j)});
                    } else if (!XslMUSLayout.access$000(XslMUSLayout.this, XslMUSLayout.EVENT_COMBO_LOAD_MORE)) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("index", (Object) String.valueOf(i3));
                        jSONObject.put("tabIndex", (Object) String.valueOf(i2));
                        jSONObject.put("id", (Object) Long.valueOf(j));
                        jSONObject.put("speedRatio", (Object) String.valueOf(i2));
                        jSONObject.put("speed", (Object) Float.valueOf(i / ((Activity) XslMUSLayout.this.getContext()).getWindow().getDecorView().getMeasuredHeight()));
                        XslMUSLayout.access$200(XslMUSLayout.this, XslMUSLayout.EVENT_COMBO_LOAD_MORE, jSONObject);
                    }
                }
            });
            this.recommendModule.a(new com.taobao.android.searchbaseframe.xsl.module.b() { // from class: com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.xsl.module.b
                public void a(int i, int i2, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("26197cfc", new Object[]{this, new Integer(i), new Integer(i2), new Long(j)});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tabIndex", (Object) String.valueOf(i));
                    jSONObject.put("index", (Object) String.valueOf(i2));
                    jSONObject.put("id", (Object) Long.valueOf(j));
                    XslMUSLayout.access$200(XslMUSLayout.this, XslMUSComponent.EVENT_SECTION_STICKY_CHANGE, jSONObject);
                }
            });
            this.recommendModule.a(new XslModule.e() { // from class: com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout.3
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
                    XslMUSLayout.access$500(XslMUSLayout.this, "beforetabrequest", jSONObject);
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
                    XslMUSLayout.access$500(XslMUSLayout.this, "paging", jSONObject);
                }
            });
            updateProperty();
            addView(this.recommendModule.f(), -1, -1);
            this.recommendModule.h();
        }
        if (this.stats == null) {
            return;
        }
        this.stats.b((int) ((MUSDKInstance) pVar).getMonitor().b().get(MUSMonitor.KEY_PAGE_WLM_DOWNLOAD).c());
    }

    public void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.target = null;
        this.nodeId = -1;
        this.currentIndex = 0;
        this.instance = null;
        this.scrollRangeEventItems = null;
        this.recommendModule.k();
        this.recommendModule = null;
        removeAllViews();
    }

    private JSONObject assembleExposeData(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d84551", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) String.valueOf(i2));
        jSONObject.put("tabIndex", (Object) String.valueOf(i));
        jSONObject.put("group", (Object) str);
        return jSONObject;
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

    public void setRequestParams(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8e281d", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        XslDatasource q = this.recommendModule.q(i);
        setRequestParams(JSONObject.parseObject(str2), q);
        setRequestApi(JSONObject.parseObject(str), q);
        this.recommendModule.a(null, null, null, null, i);
    }

    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.j();
    }

    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.i();
    }

    public void insertListItems(JSONObject jSONObject, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a539640", new Object[]{this, jSONObject, new Integer(i), new Integer(i2)});
        } else {
            this.recommendModule.a(i, i2, jSONObject);
        }
    }

    public void updateListItems(JSONObject jSONObject, int i, int i2, int i3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a24a73", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject);
        jSONObject2.put("result", (Object) jSONArray);
        this.recommendModule.a(i, i2, jSONObject2, i3, z, z2);
    }

    public void appendListItems(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb6caa2", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(jSONObject);
        jSONObject2.put("result", (Object) jSONArray);
        this.recommendModule.b(i, jSONObject2);
    }

    public void setData(JSONObject jSONObject, int i, JSONArray jSONArray, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f268e50e", new Object[]{this, jSONObject, new Integer(i), jSONArray, new Integer(i2), new Integer(i3)});
            return;
        }
        this.scrollAction = new a(i, i2, i3);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add(jSONObject);
        jSONObject2.put("result", (Object) jSONArray2);
        this.recommendModule.g();
        if (jSONArray == null || jSONArray.isEmpty()) {
            this.recommendModule.a(i, jSONObject2);
        } else {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < jSONArray.size(); i4++) {
                hashSet.add(jSONArray.getString(i4));
            }
            this.recommendModule.a(i, jSONObject2, hashSet);
        }
        h hVar = this.stats;
        if (hVar == null) {
            return;
        }
        hVar.f(System.currentTimeMillis());
    }

    public void switchTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210663ed", new Object[]{this, new Integer(i)});
        } else {
            this.recommendModule.s(i);
        }
    }

    public void switchTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc6cc87", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.recommendModule.a(i, z);
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onDataLoaded(com.taobao.android.searchbaseframe.datasource.a<?, ?, ?> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839fd827", new Object[]{this, aVar});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        if (xslModule.l() != null) {
            XslDatasource xslDatasource = (XslDatasource) aVar;
            int currentTabIndex = xslDatasource.getCurrentTabIndex();
            if (!this.recommendModule.d()) {
                XslSearchResult xslSearchResult = (XslSearchResult) xslDatasource.getLastSearchResult();
                JSONObject jSONObject = new JSONObject();
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
        if (this.stats == null) {
            return;
        }
        d firstRequestPerf = aVar.getFirstRequestPerf();
        this.stats.a(firstRequestPerf.d);
        this.stats.c((int) firstRequestPerf.j);
        this.stats.g(System.currentTimeMillis());
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
        JSONObject jSONObject = new JSONObject();
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
        if (this.stats == null) {
            return;
        }
        d firstRequestPerf = aVar.getFirstRequestPerf();
        if (firstRequestPerf != null) {
            this.stats.a(firstRequestPerf.d);
            this.stats.c((int) firstRequestPerf.j);
        }
        this.stats.g(System.currentTimeMillis());
    }

    private void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
            return;
        }
        p pVar = this.instance;
        if (pVar == null) {
            return;
        }
        pVar.fireEventOnNode(this.nodeId, str, jSONObject);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onPageScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6d86c1", new Object[]{this, new Integer(i)});
        } else if (this.recommendModule != null) {
            try {
                if (this.target.hasEvent("scroll")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tabIndex", (Object) String.valueOf(this.currentIndex));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", (Object) "0");
                    jSONObject2.put("y", (Object) String.valueOf(i));
                    jSONObject.put(Constants.Name.CONTENT_OFFSET, (Object) jSONObject2);
                    fireEvent("scroll", jSONObject);
                }
            } catch (Exception unused) {
            }
            List<ScrollRangeEventItem> list = this.scrollRangeEventItems;
            if (list == null) {
                return;
            }
            for (ScrollRangeEventItem scrollRangeEventItem : list) {
                int i2 = 0;
                while (true) {
                    if (i2 >= scrollRangeEventItem.pxParams.size()) {
                        break;
                    } else if (i < scrollRangeEventItem.pxParams.get(i2).intValue()) {
                        if (scrollRangeEventItem.currentPosition != i2) {
                            scrollRangeEventItem.currentPosition = i2;
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", (Object) scrollRangeEventItem.type);
                            jSONObject3.put("range", (Object) Integer.valueOf(scrollRangeEventItem.currentPosition));
                            fire("triggercallback", jSONObject3);
                        }
                    } else if (i2 == scrollRangeEventItem.pxParams.size() - 1) {
                        int i3 = i2 + 1;
                        if (scrollRangeEventItem.currentPosition != i3) {
                            scrollRangeEventItem.currentPosition = i3;
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("type", (Object) scrollRangeEventItem.type);
                            jSONObject4.put("range", (Object) Integer.valueOf(scrollRangeEventItem.currentPosition));
                            fire("triggercallback", jSONObject4);
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    public void endRefresh(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b040e9dc", new Object[]{this, new Integer(i)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.t(i);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onPageScrollStateChange(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e481c", new Object[]{this, new Boolean(z), new Integer(i)});
        } else if ((!z || !this.target.hasEvent("scrollstart")) && (z || !this.target.hasEvent("scrollend"))) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabIndex", (Object) String.valueOf(this.currentIndex));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", (Object) "0");
            jSONObject2.put("y", (Object) String.valueOf(i));
            jSONObject.put(Constants.Name.CONTENT_OFFSET, (Object) jSONObject2);
            if (z) {
                fireEvent("scrollstart", jSONObject);
            } else {
                fireEvent("scrollend", jSONObject);
            }
        }
    }

    private void fire(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca91b89", new Object[]{this, str, jSONObject});
            return;
        }
        XslMUSComponent xslMUSComponent = this.target;
        if (xslMUSComponent == null || !xslMUSComponent.hasEvent(str)) {
            return;
        }
        fireWithoutCheck(str, jSONObject);
    }

    private void fireWithoutCheck(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9b6f49", new Object[]{this, str, jSONObject});
        } else {
            fireEvent(str, jSONObject);
        }
    }

    private boolean hasEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d65e2b5", new Object[]{this, str})).booleanValue();
        }
        XslMUSComponent xslMUSComponent = this.target;
        return xslMUSComponent != null && xslMUSComponent.hasEvent(str);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onTabChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62d6597e", new Object[]{this, new Integer(i)});
            return;
        }
        this.currentIndex = i;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) Integer.valueOf(i));
        fire("tabchanged", jSONObject);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslModule.c
    public void onDynamicError(String str, Object obj, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2afb49", new Object[]{this, str, obj, str2, str3});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", (Object) ("" + str2 + str3));
        fire("error", jSONObject);
        k.f("[XS.xsl]", "Error: card error, code: %s, msg: %s", str2, str3);
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

    public void jumpTo(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9943b198", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.a(str, i, z, i2);
    }

    public void jumpToTop(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48495dc2", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        XslModule xslModule = this.recommendModule;
        if (xslModule == null) {
            return;
        }
        xslModule.a(z, i);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.a
    public void onPullRefreshTrigger(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9733bb", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tabIndex", (Object) String.valueOf(i));
        fireEvent(XslMUSComponent.EVENT_PULL_DOWN_REFRESH, jSONObject);
    }
}
