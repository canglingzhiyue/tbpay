package com.taobao.android.weex_ability;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.b;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.util.o;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public final class WXUserTrackModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLICK = "click";
    private static final String CLICK_WITH_PAGENAME = "clickWithPageName";
    public static final String CUSTOM = "other";
    private static final String ENTER = "enter";
    private static final String EXPOSE = "expose";
    public static final String[] METHODS;
    public static final String NAME = "userTrack";
    private static final String UPDATE_NEXT_PROP = "updateNextProp";

    public static /* synthetic */ Object ipc$super(WXUserTrackModule wXUserTrackModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(WXUserTrackModule wXUserTrackModule, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fcca003", new Object[]{wXUserTrackModule, str, str2, str3, jSONObject});
        } else {
            wXUserTrackModule.commit(str, str2, str3, jSONObject);
        }
    }

    public static /* synthetic */ void access$100(WXUserTrackModule wXUserTrackModule, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea60aedc", new Object[]{wXUserTrackModule, str, str2, str3, str4, str5, str6, str7, jSONObject});
        } else {
            wXUserTrackModule.commitut(str, str2, str3, str4, str5, str6, str7, jSONObject);
        }
    }

    public static /* synthetic */ void access$1000(WXUserTrackModule wXUserTrackModule, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7e45a", new Object[]{wXUserTrackModule, bVar});
        } else {
            wXUserTrackModule.getPageSpmPre(bVar);
        }
    }

    public static /* synthetic */ void access$1100(WXUserTrackModule wXUserTrackModule, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39abd51", new Object[]{wXUserTrackModule, jSONObject});
        } else {
            wXUserTrackModule.updatePageProperties(jSONObject);
        }
    }

    public static /* synthetic */ void access$200(WXUserTrackModule wXUserTrackModule, String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ad8026", new Object[]{wXUserTrackModule, str, new Integer(i), str2, str3, str4, jSONObject});
        } else {
            wXUserTrackModule.commitEvent(str, i, str2, str3, str4, jSONObject);
        }
    }

    public static /* synthetic */ void access$300(WXUserTrackModule wXUserTrackModule, String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4647c885", new Object[]{wXUserTrackModule, str, new Integer(i), str2, str3, str4, jSONObject});
        } else {
            wXUserTrackModule.customAdvance(str, i, str2, str3, str4, jSONObject);
        }
    }

    public static /* synthetic */ void access$400(WXUserTrackModule wXUserTrackModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c3e46b", new Object[]{wXUserTrackModule});
        } else {
            wXUserTrackModule.pageAppear();
        }
    }

    public static /* synthetic */ void access$500(WXUserTrackModule wXUserTrackModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db0fb8a", new Object[]{wXUserTrackModule});
        } else {
            wXUserTrackModule.pageDisAppear();
        }
    }

    public static /* synthetic */ void access$600(WXUserTrackModule wXUserTrackModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f23d4433", new Object[]{wXUserTrackModule, str});
        } else {
            wXUserTrackModule.updateNextPageUtparam(str);
        }
    }

    public static /* synthetic */ void access$700(WXUserTrackModule wXUserTrackModule, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34547192", new Object[]{wXUserTrackModule, str});
        } else {
            wXUserTrackModule.updatePageUtparam(str);
        }
    }

    public static /* synthetic */ void access$800(WXUserTrackModule wXUserTrackModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47840e7", new Object[]{wXUserTrackModule});
        } else {
            wXUserTrackModule.skipPage();
        }
    }

    public static /* synthetic */ void access$900(WXUserTrackModule wXUserTrackModule, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30c06f4", new Object[]{wXUserTrackModule, bVar});
        } else {
            wXUserTrackModule.getPageSpmUrl(bVar);
        }
    }

    static {
        kge.a(-2102776613);
        METHODS = new String[]{"commit", "commitut", "commitEvent", m.CUSTOM_ADVANCE, m.PAGE_APPEAR, "pageDisAppear", "updateNextPageUtparam", m.UPDATE_PAGE_UTPARAM, m.SKIP_PAGE, m.GET_PAGE_SPM_URL, m.GET_PAGE_SPM_PRE, m.UPDATE_PAGE_PROPERTIES};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        switch (str2.hashCode()) {
            case -1354815177:
                if (str2.equals("commit")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1025553932:
                if (str2.equals("pageDisAppear")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -602290666:
                if (str2.equals("commitut")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -439577013:
                if (str2.equals(m.UPDATE_PAGE_PROPERTIES)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -114154543:
                if (str2.equals(m.CUSTOM_ADVANCE)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 768062724:
                if (str2.equals(m.PAGE_APPEAR)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 985529912:
                if (str2.equals(m.GET_PAGE_SPM_PRE)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 985534724:
                if (str2.equals(m.GET_PAGE_SPM_URL)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1421600451:
                if (str2.equals("updateNextPageUtparam")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1487963043:
                if (str2.equals("commitEvent")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1880007478:
                if (str2.equals(m.UPDATE_PAGE_UTPARAM)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2145313966:
                if (str2.equals(m.SKIP_PAGE)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                argCount(weexValueArr, 4);
                final String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
                final String stringValueOrNull2 = getArg(weexValueArr, 1).toStringValueOrNull();
                final String stringValueOrNull3 = getArg(weexValueArr, 2).toStringValueOrNull();
                final JSONObject jSONObjectOrNull = getArg(weexValueArr, 3).toJSONObjectOrNull();
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$000(WXUserTrackModule.this, stringValueOrNull, stringValueOrNull2, stringValueOrNull3, jSONObjectOrNull);
                        }
                    }
                });
                return null;
            case 1:
                argCount(weexValueArr, 8);
                final String stringValueOrNull4 = getArg(weexValueArr, 0).toStringValueOrNull();
                final String stringValueOrNull5 = getArg(weexValueArr, 1).toStringValueOrNull();
                final String stringValueOrNull6 = getArg(weexValueArr, 2).toStringValueOrNull();
                final String stringValueOrNull7 = getArg(weexValueArr, 3).toStringValueOrNull();
                final String stringValueOrNull8 = getArg(weexValueArr, 4).toStringValueOrNull();
                final String stringValueOrNull9 = getArg(weexValueArr, 5).toStringValueOrNull();
                final String stringValueOrNull10 = getArg(weexValueArr, 6).toStringValueOrNull();
                final JSONObject jSONObjectOrNull2 = getArg(weexValueArr, 7).toJSONObjectOrNull();
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$100(WXUserTrackModule.this, stringValueOrNull4, stringValueOrNull5, stringValueOrNull6, stringValueOrNull7, stringValueOrNull8, stringValueOrNull9, stringValueOrNull10, jSONObjectOrNull2);
                        }
                    }
                });
                return null;
            case 2:
                argCount(weexValueArr, 6);
                final String stringValueOrNull11 = getArg(weexValueArr, 0).toStringValueOrNull();
                final int intValue = getArg(weexValueArr, 1).toIntValue();
                final String stringValueOrNull12 = getArg(weexValueArr, 2).toStringValueOrNull();
                final String stringValueOrNull13 = getArg(weexValueArr, 3).toStringValueOrNull();
                final String stringValueOrNull14 = getArg(weexValueArr, 4).toStringValueOrNull();
                final JSONObject jSONObjectOrNull3 = getArg(weexValueArr, 5).toJSONObjectOrNull();
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$200(WXUserTrackModule.this, stringValueOrNull11, intValue, stringValueOrNull12, stringValueOrNull13, stringValueOrNull14, jSONObjectOrNull3);
                        }
                    }
                });
                return null;
            case 3:
                argCount(weexValueArr, 6);
                final String stringValueOrNull15 = getArg(weexValueArr, 0).toStringValueOrNull();
                final int intValue2 = getArg(weexValueArr, 1).toIntValue();
                final String stringValueOrNull16 = getArg(weexValueArr, 2).toStringValueOrNull();
                final String stringValueOrNull17 = getArg(weexValueArr, 3).toStringValueOrNull();
                final String stringValueOrNull18 = getArg(weexValueArr, 4).toStringValueOrNull();
                final JSONObject jSONObjectOrNull4 = getArg(weexValueArr, 5).toJSONObjectOrNull();
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$300(WXUserTrackModule.this, stringValueOrNull15, intValue2, stringValueOrNull16, stringValueOrNull17, stringValueOrNull18, jSONObjectOrNull4);
                        }
                    }
                });
                return null;
            case 4:
                argCount(weexValueArr, 0);
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$400(WXUserTrackModule.this);
                        }
                    }
                });
                return null;
            case 5:
                argCount(weexValueArr, 0);
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$500(WXUserTrackModule.this);
                        }
                    }
                });
                return null;
            case 6:
                argCount(weexValueArr, 1);
                final String stringValueOrNull19 = getArg(weexValueArr, 0).toStringValueOrNull();
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.10
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$600(WXUserTrackModule.this, stringValueOrNull19);
                        }
                    }
                });
                return null;
            case 7:
                argCount(weexValueArr, 1);
                final String stringValueOrNull20 = getArg(weexValueArr, 0).toStringValueOrNull();
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$700(WXUserTrackModule.this, stringValueOrNull20);
                        }
                    }
                });
                return null;
            case '\b':
                argCount(weexValueArr, 0);
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$800(WXUserTrackModule.this);
                        }
                    }
                });
                return null;
            case '\t':
                argCount(weexValueArr, 1);
                final b callback = getCallback(weexValueArr, 0);
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$900(WXUserTrackModule.this, callback);
                        }
                    }
                });
                return null;
            case '\n':
                argCount(weexValueArr, 1);
                final b callback2 = getCallback(weexValueArr, 0);
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$1000(WXUserTrackModule.this, callback2);
                        }
                    }
                });
                return null;
            case 11:
                argCount(weexValueArr, 1);
                final JSONObject jSONObjectOrNull5 = getArg(weexValueArr, 0).toJSONObjectOrNull();
                executeInMain(new o() { // from class: com.taobao.android.weex_ability.WXUserTrackModule.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            WXUserTrackModule.access$1100(WXUserTrackModule.this, jSONObjectOrNull5);
                        }
                    }
                });
                return null;
            default:
                return null;
        }
    }

    private void commit(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2760bcd4", new Object[]{this, str, str2, str3, jSONObject});
        } else {
            commitut(str, "-1", str2, str3, "", "", "", jSONObject);
        }
    }

    private void commitut(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13de9c6d", new Object[]{this, str, str2, str3, str4, str5, str6, str7, jSONObject});
        } else if (instanceIllegal()) {
        } else {
            Map<String, String> stringMap = toStringMap(jSONObject);
            if ("click".equals(str)) {
                click(str3, str4, stringMap);
            } else if ("expose".equals(str)) {
                expose(str3, str2, str5, str6, str7, stringMap);
            } else if ("enter".equals(str)) {
                enter(str3, str4, stringMap);
            } else if ("other".equals(str)) {
                custom(str3, str5, stringMap);
            } else if (UPDATE_NEXT_PROP.equals(str)) {
                updateNextProp(stringMap);
            } else if (!CLICK_WITH_PAGENAME.equals(str)) {
            } else {
                clickWithPageName(str3, "click", str4, toStringMap(jSONObject));
            }
        }
    }

    private void clickWithPageName(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0eb478", new Object[]{this, str, str2, str3, map});
        } else if (str != null && str2 != null && str3 != null && map != null) {
            try {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(",");
                }
                TBS.Adv.ctrlClickedOnPage(str, CT.Button, str3, sb.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void commitEvent(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d201f463", new Object[]{this, str, new Integer(i), str2, str3, str4, jSONObject});
        } else {
            custom(str, str2, toStringMap(jSONObject));
        }
    }

    private void customAdvance(String str, int i, String str2, String str3, String str4, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("214a0411", new Object[]{this, str, new Integer(i), str2, str3, str4, jSONObject});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, toStringMap(jSONObject)).build());
        }
    }

    private void pageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[]{this});
        } else if (instanceIllegal()) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getWeexInstance().getContext());
        }
    }

    private void pageDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d96b47b", new Object[]{this});
        } else if (instanceIllegal()) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getWeexInstance().getContext());
        }
    }

    private void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
        } else if (instanceIllegal()) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        }
    }

    private void updatePageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e373f147", new Object[]{this, str});
        } else if (instanceIllegal()) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(getWeexInstance().getContext(), str);
        }
    }

    private void skipPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7766235", new Object[]{this});
        } else if (instanceIllegal()) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(getWeexInstance().getContext());
        }
    }

    private boolean instanceIllegal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a441c12c", new Object[]{this})).booleanValue() : !(getWeexInstance().getContext() instanceof Activity);
    }

    private void click(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45dd6182", new Object[]{this, str, str2, map});
        } else if (StringUtils.isEmpty(str2)) {
        } else {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = !StringUtils.isEmpty(str) ? new UTHitBuilders.UTControlHitBuilder(str, str2) : new UTHitBuilders.UTControlHitBuilder(str2);
            uTControlHitBuilder.setProperties(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        }
    }

    private void enter(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d524e632", new Object[]{this, str, str2, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(getWeexInstance().getContext(), str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getWeexInstance().getContext(), map);
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(getWeexInstance().getContext(), Uri.parse(str2));
    }

    private void expose(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5beb68", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        int i2 = 2201;
        try {
            int parseInt = Integer.parseInt(str2);
            if (parseInt > 0) {
                i2 = parseInt;
            }
            i = i2;
        } catch (NumberFormatException unused) {
            i = 2201;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str3, str4, str5, map).build());
    }

    private void custom(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16246979", new Object[]{this, str, str2, map});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
        uTCustomHitBuilder.setEventPage(str);
        uTCustomHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    private void updateNextProp(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a260df", new Object[]{this, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    private void getPageSpmUrl(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f75e04f", new Object[]{this, bVar});
            return;
        }
        String pageSpmUrl = getWeexInstance().getContext() instanceof Activity ? UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl((Activity) getWeexInstance().getContext()) : "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("spmUrl", (Object) pageSpmUrl);
        bVar.a(jSONObject);
    }

    private void getPageSpmPre(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54854c9b", new Object[]{this, bVar});
            return;
        }
        String pageSpmPre = getWeexInstance().getContext() instanceof Activity ? UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre((Activity) getWeexInstance().getContext()) : "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("spmPre", (Object) pageSpmPre);
        bVar.a(jSONObject);
    }

    private void updatePageProperties(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c6afde", new Object[]{this, jSONObject});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getWeexInstance().getContext(), toStringMap(jSONObject));
        }
    }

    private Map<String, String> toStringMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("15026c6e", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }
}
