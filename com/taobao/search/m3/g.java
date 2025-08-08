package com.taobao.search.m3;

import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.flash.FlashSaleView;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import com.uc.crashsdk.export.LogType;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import org.json.JSONObject;
import tb.iyx;
import tb.kge;
import tb.nne;
import tb.noa;
import tb.nog;
import tb.nss;

/* loaded from: classes7.dex */
public final class g extends nss<M3CellBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(182898010);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.nss
    public void a(JSONObject beanObject, M3CellBean bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb106cda", new Object[]{this, beanObject, bean, baseSearchResult});
            return;
        }
        q.c(beanObject, "beanObject");
        q.c(bean, "bean");
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_auction_m3";
    }

    @Override // tb.nss
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.nss
    public /* synthetic */ void b(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb5005f", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
        } else {
            a(jSONObject, m3CellBean, baseSearchResult);
        }
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public M3CellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M3CellBean) ipChange.ipc$dispatch("fb688b8c", new Object[]{this}) : new M3CellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<M3CellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : M3CellBean.class;
    }

    public void a(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean bean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e774c8c", new Object[]{this, jSONObject, bean, baseSearchResult});
            return;
        }
        q.c(bean, "bean");
        if (jSONObject == null) {
            return;
        }
        bean.setEtype(jSONObject.getString("etype"));
        c(jSONObject, bean, baseSearchResult);
        k(jSONObject, bean);
        f(jSONObject, bean, baseSearchResult);
        j(jSONObject, bean);
        l(jSONObject, bean);
        i(jSONObject, bean);
        h(jSONObject, bean);
        e(jSONObject, bean, baseSearchResult);
        g(jSONObject, bean);
        d(jSONObject, bean);
        d(jSONObject, bean, baseSearchResult);
        boolean z = baseSearchResult instanceof CommonSearchResult;
        BaseSearchResult baseSearchResult2 = null;
        a(jSONObject, bean, (CommonSearchResult) (!z ? null : baseSearchResult));
        b(jSONObject, bean, (CommonSearchResult) (!z ? null : baseSearchResult));
        if (z) {
            baseSearchResult2 = baseSearchResult;
        }
        c(jSONObject, bean, (CommonSearchResult) baseSearchResult2);
        e(jSONObject, bean);
        b2(jSONObject, bean, baseSearchResult);
        b(jSONObject, bean);
        a(jSONObject, bean);
        a(bean.getAuctionBean(), jSONObject);
        a(bean, bean.getAuctionBean(), jSONObject);
        bean.setOriginData(jSONObject);
        a(bean.getAuctionBean(), baseSearchResult);
        bean.getAuctionBean().itemId = bean.itemId;
        bean.getAuctionBean().mOutterBean = bean;
        bean.setUtLogMap(bean.getUtLogMap());
    }

    private final void a(M3CellBean m3CellBean, AuctionBaseBean auctionBaseBean, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee92d6b", new Object[]{this, m3CellBean, auctionBaseBean, jSONObject});
            return;
        }
        m3CellBean.setVideoForcePlay(jSONObject.getBooleanValue("videoForcePlay"));
        m3CellBean.setVideoAutoPlay(jSONObject.getBooleanValue(iyx.PARAM_VIDEO_AUTO_PLAY));
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("video");
        if (jSONObject2 != null) {
            auctionBaseBean.videoUrl = jSONObject2.getString("videoUrl");
            auctionBaseBean.showVideoIcon = jSONObject2.getBooleanValue("showIcon");
            auctionBaseBean.videoId = jSONObject2.getString("videoId");
            auctionBaseBean.delayTime = (int) jSONObject2.getLongValue("delayTime");
            auctionBaseBean.hideCountDown = jSONObject2.getBooleanValue("hideCountDown");
        }
        com.alibaba.fastjson.JSONObject jSONObject3 = jSONObject.getJSONObject("wfVideo");
        if (jSONObject3 == null) {
            jSONObject3 = jSONObject.getJSONObject("video");
        }
        if (jSONObject3 != null) {
            auctionBaseBean.wfVideoUrl = jSONObject3.getString("videoUrl");
            auctionBaseBean.wfShowVideoIcon = jSONObject3.getBooleanValue("showIcon");
            auctionBaseBean.wfVideoId = jSONObject3.getString("videoId");
            auctionBaseBean.wfDelayTime = (int) jSONObject3.getLongValue("delayTime");
            auctionBaseBean.wfHideCountDown = jSONObject3.getBooleanValue("hideCountDown");
        }
        if (StringUtils.isEmpty(auctionBaseBean.videoCover)) {
            auctionBaseBean.videoCover = m3CellBean.getPicPath();
        }
        if (!StringUtils.isEmpty(auctionBaseBean.wfVideoCover)) {
            return;
        }
        auctionBaseBean.wfVideoCover = !StringUtils.isEmpty(m3CellBean.getUprightImage()) ? m3CellBean.getUprightImage() : m3CellBean.getPicPath();
    }

    private final void a(AuctionBaseBean auctionBaseBean, com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b308c747", new Object[]{this, auctionBaseBean, jSONObject});
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("jarvisData");
        if (jSONObject2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (String key : jSONObject2.keySet()) {
            String string = jSONObject2.getString(key);
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(string)) {
                q.a((Object) key, "key");
                hashMap.put(key, string);
            }
        }
        auctionBaseBean.clickTrace = jSONObject.getString(nog.CLICK_TRACE);
        hashMap.put(nog.CLICK_TRACE, auctionBaseBean.clickTrace);
        auctionBaseBean.jarvisData = hashMap;
    }

    private final void a(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        com.alibaba.fastjson.JSONObject jSONObject2;
        int intValue;
        int intValue2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c06f36c", new Object[]{this, jSONObject, m3CellBean});
        } else if (m3CellBean.getP4pIcon() == null) {
            m3CellBean.setNewDate(jSONObject.getString("newDate"));
            if (!StringUtils.isEmpty(m3CellBean.getNewDate())) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("leftSuperScriptInfo");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    com.alibaba.fastjson.JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("fieldTemplate");
                    if (string != null) {
                        String string2 = jSONObject3.getString("imageUrl");
                        int intValue3 = jSONObject3.getIntValue("width");
                        int intValue4 = jSONObject3.getIntValue("height");
                        String string3 = jSONObject3.getString("text");
                        int hashCode = string.hashCode();
                        if (hashCode != 75165) {
                            if (hashCode == 1417350021) {
                                if (string.equals("liveIcon") && !StringUtils.isEmpty(string2) && intValue3 > 0 && intValue4 > 0) {
                                    m3CellBean.setLeftScriptInfo(new com.taobao.search.m3.image.c(string3, 1, string2, intValue3, intValue4, jSONObject3.getString("needHiddenLiveNumber"), 0, 0, 0, 0));
                                    return;
                                }
                            } else if (hashCode == 1525159562 && string.equals("3DIcon") && !StringUtils.isEmpty(string2) && intValue3 > 0 && intValue4 > 0) {
                                m3CellBean.setLeftScriptInfo(new com.taobao.search.m3.image.c(null, 2, string2, intValue3, intValue4, null, jSONObject3.getIntValue("listLeft"), jSONObject3.getIntValue("listTop"), jSONObject3.getIntValue("wfLeft"), jSONObject3.getIntValue("wfTop")));
                                return;
                            }
                        } else if (string.equals("LBS") && !StringUtils.isEmpty(string3)) {
                            m3CellBean.setLeftScriptInfo(new com.taobao.search.m3.image.c(string3, 3, null, 0, 0, jSONObject3.getString("needHiddenLiveNumber"), 0, 0, 0, 0));
                            return;
                        }
                    }
                }
            }
            com.alibaba.fastjson.JSONObject jSONObject4 = jSONObject.getJSONObject("liveInfo");
            if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("liveStageImgInfo")) == null) {
                return;
            }
            String string4 = jSONObject2.getString("url");
            if (StringUtils.isEmpty(string4) || (intValue = jSONObject2.getIntValue("width")) <= 0 || (intValue2 = jSONObject2.getIntValue("height")) <= 0) {
                return;
            }
            m3CellBean.setLeftScriptInfo(new com.taobao.search.m3.image.c(jSONObject2.getString("liveViewNum"), 1, string4, intValue, intValue2, null, 0, 0, 0, 0));
        }
    }

    private final void b(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        List<String> b;
        com.taobao.search.m3.image.i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f32a6ad", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        String string = jSONObject.getString(nog.PRD_ICON_LIST);
        if (string == null || (b = n.b((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            return;
        }
        for (String str : b) {
            if (q.a((Object) str, (Object) "p4p")) {
                com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("p4pIcon");
                if (jSONObject2 != null) {
                    iVar = new com.taobao.search.m3.image.i(jSONObject2.getString("img"), jSONObject2.getIntValue("width"), jSONObject2.getIntValue("height"));
                } else {
                    iVar = new com.taobao.search.m3.image.i("", 0, 0);
                }
                m3CellBean.setP4pIcon(iVar);
                return;
            }
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private final void b2(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        com.taobao.search.m3.more.pk.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab401eb", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
        } else if (jSONObject.getBooleanValue("canPk")) {
            if (baseSearchResult != null) {
                com.alibaba.fastjson.JSONObject jSONObject2 = ((CommonSearchResult) baseSearchResult).pageInfo;
                String string = jSONObject2 != null ? jSONObject2.getString("pkGroup") : null;
                if (StringUtils.isEmpty(string)) {
                    return;
                }
                com.alibaba.fastjson.JSONObject jSONObject3 = jSONObject.getJSONObject("pkInfo");
                if (jSONObject3 != null) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = jSONObject3.getJSONArray("extraParamKeys");
                    if (jSONArray != null) {
                        int size = jSONObject3.size();
                        for (int i = 0; i < size; i++) {
                            String string2 = jSONArray.getString(i);
                            if (!StringUtils.isEmpty(string2)) {
                                arrayList.add(string2);
                            }
                        }
                    }
                    aVar = new com.taobao.search.m3.more.pk.a(jSONObject3.getString("buttonDefaultText"), jSONObject3.getString("buttonSelectedText"), arrayList, false, "pk_" + string);
                } else {
                    aVar = new com.taobao.search.m3.more.pk.a(null, null, null, false, "pk_" + string);
                }
                m3CellBean.setPkInfo(aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        }
    }

    private final void c(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean, CommonSearchResult commonSearchResult) {
        com.alibaba.fastjson.JSONObject jSONObject2;
        com.alibaba.fastjson.JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3cb140b", new Object[]{this, jSONObject, m3CellBean, commonSearchResult});
            return;
        }
        if (commonSearchResult != null && (jSONObject2 = commonSearchResult.pageData) != null && (jSONObject3 = jSONObject2.getJSONObject("switchers")) != null) {
            z = jSONObject3.getBooleanValue("isJiaGouClick");
        }
        m3CellBean.setJiaGouUt(z);
        m3CellBean.setJiaGouSupport(jSONObject.getBoolean("isJiaGou"));
        com.alibaba.fastjson.JSONObject jSONObject4 = jSONObject.getJSONObject("jiaGouConfig");
        if (jSONObject4 == null) {
            return;
        }
        m3CellBean.setJiaGouInfo(new com.taobao.search.m3.more.a(jSONObject4.getIntValue("width"), jSONObject4.getIntValue("height"), jSONObject4.getIntValue("iconHeight"), jSONObject4.getString("url")));
    }

    private final void b(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean, CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1bcf4a", new Object[]{this, jSONObject, m3CellBean, commonSearchResult});
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject(noa.VALUE_MODULE_DYNAMIC_CARD);
        if (jSONObject2 == null) {
            return;
        }
        DynamicCardBean dynamicCardBean = new DynamicCardBean();
        dynamicCardBean.mOriginData = jSONObject2;
        dynamicCardBean.mDynamicCellBean = com.taobao.search.sf.j.f19452a.f().a(jSONObject2, commonSearchResult, commonSearchResult != null ? commonSearchResult.pageInfo : null);
        m3CellBean.setDynamicCardBean(dynamicCardBean);
    }

    private final void e(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b5c070", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        m3CellBean.getAuctionBean().p4pContentUrl = jSONObject.getString(nog.P4P_CONTENT_URL);
        m3CellBean.setFinalTargetUrl(jSONObject.getString("finalTargetUrl"));
        m3CellBean.setX_qzt_ad(jSONObject.getIntValue("x_qzt_ad"));
        m3CellBean.getAuctionBean().p4pPid = jSONObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        m3CellBean.setClickUrl(jSONObject.getString(nog.PRD_P4P_URL));
        m3CellBean.setUseAuctionURL(jSONObject.getBooleanValue("useAuctionURL"));
        m3CellBean.setAuctionURL(jSONObject.getString("auctionURL"));
        m3CellBean.getAuctionBean().o2oShopId = android.taobao.util.j.a(jSONObject.getString(nog.PRD_O2O_SHOP_ID));
        m3CellBean.getAuctionBean().skuId = jSONObject.getString("skuId");
        m3CellBean.getAuctionBean().locType = jSONObject.getString(noa.KEY_LOC_TYPE);
        m3CellBean.getAuctionBean().ifsUrl = jSONObject.getString("ifsUrl");
    }

    private final void c(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        com.alibaba.fastjson.JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f0b74a", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
            return;
        }
        m3CellBean.setUtLogMap(jSONObject.getJSONObject("utLogMap"));
        boolean z = baseSearchResult instanceof CommonSearchResult;
        com.alibaba.fastjson.JSONObject jSONObject3 = null;
        CommonSearchResult commonSearchResult = (CommonSearchResult) (!z ? null : baseSearchResult);
        if (commonSearchResult != null && (jSONObject2 = commonSearchResult.pageData) != null) {
            m3CellBean.setClickBackParams(jSONObject2.getJSONObject("clickBackParams"));
        }
        m3CellBean.setBackCardRqParams(jSONObject.getJSONObject("backCardRqParams"));
        m3CellBean.setPrefetchImgRatio(jSONObject.getString("prefetchImgRatio"));
        m3CellBean.setExtraParams(jSONObject.getJSONArray("extraParams"));
        m3CellBean.setSkuSourceType(jSONObject.getString("skuSourceType"));
        if (!z) {
            baseSearchResult = null;
        }
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) baseSearchResult;
        if (commonSearchResult2 != null) {
            jSONObject3 = commonSearchResult2.copyPageInfo;
        }
        m3CellBean.setPageInfo(jSONObject3);
    }

    private final void a(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean, CommonSearchResult commonSearchResult) {
        String string;
        com.alibaba.fastjson.JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        int i = 4;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706c8a89", new Object[]{this, jSONObject, m3CellBean, commonSearchResult});
        } else if (commonSearchResult == null) {
        } else {
            m3CellBean.setPltSimilarUrl(jSONObject.getString("pltSimilarUrl"));
            m3CellBean.setSimilarSameUrl(jSONObject.getString("similarSameUrl"));
            com.alibaba.fastjson.JSONObject jSONObject3 = commonSearchResult.pageData;
            if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("feedback")) != null) {
                f(jSONObject2, m3CellBean);
                return;
            }
            com.alibaba.fastjson.JSONObject jSONObject4 = jSONObject.getJSONObject("feedback");
            if (jSONObject4 == null) {
                return;
            }
            com.alibaba.fastjson.JSONObject jSONObject5 = jSONObject4.getJSONObject("commonParams");
            if (jSONObject5 != null && (string = jSONObject5.getString("hasFeedback")) != null) {
                int hashCode = string.hashCode();
                if (hashCode != 96673) {
                    if (hashCode != 267100476) {
                        if (hashCode == 2123857115 && string.equals("onlyLongPress")) {
                            i = 2;
                        }
                    } else if (string.equals("onlyClick")) {
                        i = 3;
                    }
                } else if (string.equals("all")) {
                    i = 1;
                }
            }
            m3CellBean.setFeedbackType(i);
            m3CellBean.setFeedback(new com.taobao.search.m3.feedback.a(jSONObject4, false, null));
        }
    }

    private final void f(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe173b1", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("commonParams");
        int i = 4;
        if (jSONObject2 != null && (string = jSONObject2.getString("hasFeedback")) != null) {
            int hashCode = string.hashCode();
            if (hashCode != 96673) {
                if (hashCode != 267100476) {
                    if (hashCode == 2123857115 && string.equals("onlyLongPress")) {
                        i = 2;
                    }
                } else if (string.equals("onlyClick")) {
                    i = 3;
                }
            } else if (string.equals("all")) {
                i = 1;
            }
        }
        m3CellBean.setFeedbackType(i);
        com.alibaba.fastjson.JSONObject jSONObject3 = new com.alibaba.fastjson.JSONObject();
        jSONObject3.putAll(jSONObject);
        Object remove = jSONObject3.remove("main");
        Object remove2 = jSONObject3.remove("p4p");
        if (m3CellBean.isP4p) {
            jSONObject3.put((com.alibaba.fastjson.JSONObject) com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS, (String) remove2);
        } else {
            jSONObject3.put((com.alibaba.fastjson.JSONObject) com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS, (String) remove);
        }
        m3CellBean.setFeedback(new com.taobao.search.m3.feedback.a(jSONObject3, false, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f6, code lost:
        if (r11.equals("bottom") != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(com.alibaba.fastjson.JSONObject r11, com.taobao.search.m3.M3CellBean r12, com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.m3.g.d(com.alibaba.fastjson.JSONObject, com.taobao.search.m3.M3CellBean, com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult):void");
    }

    private final com.taobao.search.m3.singlerow.c a(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.m3.singlerow.c) ipChange.ipc$dispatch("7c22dcac", new Object[]{this, jSONObject});
        }
        String text = jSONObject.getString("text");
        if (StringUtils.isEmpty(text)) {
            return null;
        }
        String string = jSONObject.getString("url");
        Integer integer = jSONObject.getInteger("borderRadius");
        int intValue = integer != null ? integer.intValue() : -1;
        String string2 = jSONObject.getString("rightIcon");
        q.a((Object) text, "text");
        return new com.taobao.search.m3.singlerow.c(string, intValue, string2, text, a(jSONObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR)), jSONObject.getString("icon"), a(jSONObject.getString("textColor")));
    }

    private final com.taobao.search.m3.composite.c b(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.m3.composite.c) ipChange.ipc$dispatch("b0cc4dd8", new Object[]{this, jSONObject});
        }
        String text = jSONObject.getString("text");
        if (StringUtils.isEmpty(text)) {
            return null;
        }
        Integer a2 = a(jSONObject.getString("textColor"));
        String string = jSONObject.getString("icon");
        q.a((Object) text, "text");
        return new com.taobao.search.m3.composite.c(a2, string, text);
    }

    private final com.taobao.search.m3.comment.a c(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.m3.comment.a) ipChange.ipc$dispatch("3d7c1843", new Object[]{this, jSONObject});
        }
        String text = jSONObject.getString("text");
        if (StringUtils.isEmpty(text)) {
            return null;
        }
        String string = jSONObject.getString("numComment");
        q.a((Object) text, "text");
        return new com.taobao.search.m3.comment.a(string, text, a(jSONObject.getString("textColor")), a(jSONObject.getString("numColor")), jSONObject.getString("showMinComment"));
    }

    private final void d(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158a0d2f", new Object[]{this, jSONObject, m3CellBean});
        } else if (m3CellBean.getInteractiveInfo() == null) {
            JSONArray jSONArray = jSONObject.getJSONArray("bottomTagInfo");
            if (jSONArray != null) {
                int size = jSONArray.size();
                if (size == 0) {
                    return;
                }
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    q.a((Object) jSONObject2, "it.getJSONObject(index)");
                    com.taobao.search.m3.interactive.c e = e(jSONObject2);
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || !(!arrayList.isEmpty())) {
                return;
            }
            m3CellBean.setBottomTagInfo(new com.taobao.search.m3.interactive.b(arrayList, false, true));
        }
    }

    private final com.taobao.search.m3.interactive.c e(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.m3.interactive.c) ipChange.ipc$dispatch("3c4d9ea0", new Object[]{this, jSONObject});
        }
        String showText = jSONObject.getString("showText");
        String searchText = jSONObject.getString("searchText");
        String string = jSONObject.getString("trace");
        if (StringUtils.isEmpty(showText) || StringUtils.isEmpty(searchText)) {
            return null;
        }
        Integer a2 = a(jSONObject.getString("tagColor"));
        q.a((Object) searchText, "searchText");
        String string2 = jSONObject.getString("tag");
        q.a((Object) showText, "showText");
        return new com.taobao.search.m3.interactive.c(null, null, a2, searchText, null, string2, null, showText, null, string, null);
    }

    private final com.taobao.search.m3.interactive.c d(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.m3.interactive.c) ipChange.ipc$dispatch("7541b79f", new Object[]{this, jSONObject});
        }
        String query = jSONObject.getString("query");
        if (StringUtils.isEmpty(query)) {
            return null;
        }
        String text = jSONObject.getString("text");
        if (StringUtils.isEmpty(text)) {
            return null;
        }
        String string = jSONObject.getString("tag_pic");
        String string2 = jSONObject.getString("rightIcon");
        Integer a2 = a(jSONObject.getString("typeColor"));
        q.a((Object) query, "query");
        Integer a3 = a(jSONObject.getString("textColor"));
        String string3 = jSONObject.getString("type");
        Integer a4 = a(jSONObject.getString(com.taobao.tao.infoflow.multitab.e.KEY_BG_COLOR));
        q.a((Object) text, "text");
        return new com.taobao.search.m3.interactive.c(string, string2, a2, query, a3, string3, a4, text, jSONObject.getString("key"), jSONObject.getString("tagTrace"), jSONObject.getJSONObject("params"));
    }

    private final com.taobao.search.m3.property.b a(com.alibaba.fastjson.JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.m3.property.b) ipChange.ipc$dispatch("c16e66a0", new Object[]{this, jSONObject, new Boolean(z)});
        }
        String string = jSONObject.getString("propertyName");
        if (string == null) {
            string = "";
        }
        String value = jSONObject.getString("propertyValueName");
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        q.a((Object) value, "value");
        if (z || !q.a((Object) jSONObject.getString("textType"), (Object) com.taobao.search.mmd.datasource.bean.f.TEMPLATE_SINGLE_ROW)) {
            z2 = false;
        }
        return new com.taobao.search.m3.property.b(string, value, z, z2);
    }

    private final void g(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        String string;
        com.taobao.search.m3.property.b a2;
        com.taobao.search.m3.composite.c b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0d26f2", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        m3CellBean.setUspBottom(q.a((Object) jSONObject.getString("uspPos"), (Object) "bottom"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(3);
        ArrayList arrayList4 = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("structuredUSPInfo");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && (string = jSONObject2.getString("fieldTemplate")) != null) {
                    switch (string.hashCode()) {
                        case -1804585442:
                            if (string.equals("priceproperty") && (a2 = a(jSONObject2, true)) != null) {
                                arrayList3.add(a2);
                                continue;
                            }
                            break;
                        case -1494550414:
                            if (string.equals(com.taobao.search.mmd.datasource.bean.f.TEMPLATE_SINGLE_ROW)) {
                                com.taobao.search.m3.singlerow.c a3 = a(jSONObject2);
                                if (a3 != null) {
                                    arrayList4.add(a3);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case -1399754105:
                            if (string.equals("composite")) {
                                if (arrayList2.size() < 2 && (b = b(jSONObject2)) != null) {
                                    arrayList2.add(b);
                                    break;
                                }
                            } else {
                                continue;
                            }
                            break;
                        case -993141291:
                            if (string.equals("property")) {
                                com.taobao.search.m3.property.b a4 = a(jSONObject2, false);
                                if (a4 != null) {
                                    arrayList3.add(a4);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 273184065:
                            if (string.equals("discount")) {
                                c(jSONObject2, m3CellBean);
                                break;
                            } else {
                                continue;
                            }
                        case 803370328:
                            if (string.equals("interactiveTag")) {
                                com.taobao.search.m3.interactive.c d = d(jSONObject2);
                                if (d != null) {
                                    arrayList.add(d);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        case 2103533612:
                            if (string.equals("commentText")) {
                                m3CellBean.setCommentInfo(c(jSONObject2));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            m3CellBean.setSingleRowInfo(new com.taobao.search.m3.singlerow.b(arrayList4));
        }
        if (!arrayList.isEmpty()) {
            m3CellBean.setInteractiveInfo(new com.taobao.search.m3.interactive.b(arrayList, false, false, 6, null));
        }
        if (!arrayList2.isEmpty()) {
            m3CellBean.setCompositeInfo(new com.taobao.search.m3.composite.b(arrayList2));
        }
        if (!arrayList3.isEmpty()) {
            m3CellBean.setPropertyInfo(new com.taobao.search.m3.property.a(arrayList3, null));
        }
        if (m3CellBean.getPropertyInfo() != null || m3CellBean.getCompositeInfo() != null || m3CellBean.getInteractiveInfo() != null || m3CellBean.getSingleRowInfo() != null || m3CellBean.getCommentInfo() != null) {
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        Integer a5 = a(jSONObject.getString("summaryTipsColor"));
        JSONArray jSONArray2 = jSONObject.getJSONArray("summaryTips");
        if (jSONArray2 != null) {
            int size2 = jSONArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String text = jSONArray2.getString(i2);
                if (!StringUtils.isEmpty(text)) {
                    q.a((Object) text, "text");
                    arrayList5.add(new com.taobao.search.m3.property.b("", text, false, false));
                }
            }
        }
        if (!(!arrayList5.isEmpty())) {
            return;
        }
        m3CellBean.setSummaryTips(new com.taobao.search.m3.property.a(arrayList5, a5));
    }

    private final Integer a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("eb7402d9", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (str == null) {
            q.a();
        }
        if (str.length() == 4) {
            String substring = str.substring(1);
            q.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return Integer.valueOf(com.taobao.android.searchbaseframe.util.g.a('#' + substring + substring, 0));
        }
        return Integer.valueOf(com.taobao.android.searchbaseframe.util.g.a(str, 0));
    }

    private final void h(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a238da33", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        m3CellBean.getAuctionBean().userId = jSONObject.getString("userId");
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("structuredShopInfo");
        if (jSONObject2 != null) {
            if (!jSONObject2.getBooleanValue("pbshowshopinfo")) {
                return;
            }
            String string = jSONObject2.getString("url");
            JSONArray jSONArray = jSONObject2.getJSONArray("infoList");
            if (jSONArray == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(jSONArray.size());
            StringBuilder sb = new StringBuilder();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                com.alibaba.fastjson.JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    String string2 = jSONObject3.getString("text");
                    if (!StringUtils.isEmpty(string2)) {
                        if (sb.length() > 0) {
                            sb.append(" ");
                        }
                        sb.append(string2);
                    }
                    Integer a2 = a(jSONObject3.getString("color"));
                    String string3 = jSONObject3.getString("hiddenType");
                    q.a((Object) string3, "item.getString(\"hiddenType\")");
                    arrayList.add(new com.taobao.search.m3.shoinfo.c(a2, string2, string3, jSONObject3.getIntValue("iconWidth"), jSONObject3.getIntValue("iconHeight"), jSONObject3.getString("icon")));
                }
            }
            String sb2 = sb.toString();
            q.a((Object) sb2, "desc.toString()");
            m3CellBean.setShopInfo(new com.taobao.search.m3.shoinfo.b(string, a(jSONObject2.getString("guideColor")), arrayList, true, sb2));
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject4 = jSONObject.getJSONObject("shopInfo");
        if (jSONObject4 == null || !jSONObject4.getBooleanValue("pbshowshopinfo")) {
            return;
        }
        String string4 = jSONObject4.getString("url");
        JSONArray jSONArray2 = jSONObject4.getJSONArray("shopInfoList");
        if (jSONArray2 == null || jSONArray2.size() == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(jSONArray2.size());
        String string5 = jSONArray2.getString(0);
        if (StringUtils.isEmpty(string5)) {
            return;
        }
        Integer a3 = a(jSONObject4.getString("shopInfoColor"));
        arrayList2.add(new com.taobao.search.m3.shoinfo.c(a3, string5, Constants.Name.SUFFIX, 0, 0, null));
        if (jSONArray2.size() > 1) {
            String string6 = jSONArray2.getString(1);
            if (!StringUtils.isEmpty(string6)) {
                arrayList2.add(new com.taobao.search.m3.shoinfo.c(a3, string6, "all", 0, 0, null));
            }
        }
        m3CellBean.setShopInfo(new com.taobao.search.m3.shoinfo.b(string4, null, arrayList2, false, ""));
    }

    private final void i(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        String str;
        String str2;
        com.taobao.search.m3.price.d dVar;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num;
        Integer num2;
        Integer num3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85648d74", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        String str7 = null;
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject(nog.PRICE_BLOCK);
        if (jSONObject2 != null) {
            String string = jSONObject2.getString("price");
            str = jSONObject2.getString(nog.PRICE_PREFIX);
            str2 = string;
        } else {
            str = str7;
            str2 = str;
        }
        String string2 = jSONObject.getString("location");
        String string3 = jSONObject.getString("commentCount");
        String string4 = jSONObject.getString("daySold");
        if (StringUtils.isEmpty(string4)) {
            string4 = jSONObject.getString(nog.PRD_REALSALES);
            if (StringUtils.isEmpty(string4)) {
                Integer integer = jSONObject.getInteger(nog.PRD_SELLED);
                int intValue = integer != null ? integer.intValue() : -1;
                if (intValue < 0) {
                    string4 = null;
                } else if (intValue >= 10000) {
                    DecimalFormat decimalFormat = new DecimalFormat("0.0");
                    string4 = decimalFormat.format(Float.valueOf(intValue / 10000.0f)) + "万人付款";
                } else {
                    string4 = intValue + com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16682);
                }
            }
        }
        String str8 = string4;
        Integer num4 = null;
        Boolean bool = null;
        com.taobao.search.m3.price.d dVar2 = null;
        com.alibaba.fastjson.JSONObject jSONObject3 = jSONObject.getJSONObject("priceShowWithIcon");
        if (jSONObject3 != null) {
            String string5 = jSONObject3.getString("priceBottomText");
            Integer a2 = a(jSONObject3.getString("priceBottomColor"));
            int intValue2 = jSONObject3.getIntValue("iconWidth");
            int intValue3 = jSONObject3.getIntValue("iconHeight");
            String iconUrl = jSONObject3.getString("iconUrl");
            if (intValue2 > 0 && intValue3 > 0 && !StringUtils.isEmpty(iconUrl)) {
                q.a((Object) iconUrl, "iconUrl");
                dVar2 = new com.taobao.search.m3.price.d(intValue2, intValue3, iconUrl);
            }
            String string6 = jSONObject3.getString(nog.PRICE_SUFFIX);
            Integer a3 = a(jSONObject3.getString("suffixColor"));
            String string7 = jSONObject3.getString("subText");
            Integer a4 = a(jSONObject3.getString("subTextColor"));
            if (jSONObject3.getBooleanValue("showOriginPrice")) {
                String string8 = jSONObject3.getString("originPrice");
                if (!StringUtils.isEmpty(string8)) {
                    str7 = string8;
                }
                bool = Boolean.valueOf(!jSONObject3.getBooleanValue("hiddenPriceUnderline"));
            }
            str5 = str7;
            str6 = string5;
            num3 = a2;
            num2 = a4;
            str4 = string7;
            num = a3;
            str3 = string6;
            dVar = dVar2;
        } else {
            dVar = dVar2;
            str3 = str7;
            str4 = str3;
            str5 = str4;
            str6 = str5;
            num = num4;
            num2 = num;
            num3 = num2;
        }
        String title = m3CellBean.getTitle();
        String str9 = "";
        if (title == null) {
            title = str9;
        }
        String str10 = str2 == null ? str9 : str2;
        if (str8 != null) {
            str9 = str8;
        }
        m3CellBean.setPriceInfo(new com.taobao.search.m3.price.e(dVar, str, str2, str3, num, str4, num2, str5, q.a((Object) bool, (Object) true), str8, string3, string2, title + ' ' + str10 + ' ' + str9, str6, num3));
    }

    private final void e(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        boolean z;
        String string;
        String str;
        String str2;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf6a2208", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
        } else if (baseSearchResult != null) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) baseSearchResult;
            com.alibaba.fastjson.JSONObject jSONObject2 = commonSearchResult.pageData;
            List list = null;
            com.alibaba.fastjson.JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("dynamicData") : null;
            HashMap<String, SearchDomBean> hashMap = commonSearchResult.domIcons;
            com.taobao.search.m3.icons.c cVar = null;
            if (jSONObject3 == null || (string2 = jSONObject3.getString("p4pIconPosition")) == null) {
                z = false;
            } else {
                z = q.a((Object) string2, (Object) "leftBottom") || q.a((Object) string2, (Object) "rightBottom");
                if (z) {
                    m3CellBean.setP4pIconBottomLeft(q.a((Object) string2, (Object) "leftBottom"));
                    m3CellBean.setP4pIconUrl(jSONObject3.getString("p4pIconUrl"));
                    m3CellBean.setP4pIconWidth(jSONObject3.getIntValue("p4pIconWidth"));
                    m3CellBean.setP4pIconHeight(jSONObject3.getIntValue("p4pIconHeight"));
                }
            }
            JSONArray jSONArray = jSONObject.getJSONArray(com.taobao.taolive.room.ui.fanslevel.a.ICON_RENDER);
            if (jSONArray == null) {
                return;
            }
            int size = jSONArray.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                com.alibaba.fastjson.JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                String string3 = jSONObject4.getString("type");
                if (string3 != null && q.a((Object) jSONObject4.getString("group"), (Object) "2") && (string = jSONObject4.getString("domClass")) != null) {
                    com.alibaba.fastjson.JSONObject jSONObject5 = jSONObject4.getJSONObject("iconStyle");
                    SearchDomBean b = nne.b(jSONObject5 != null ? jSONObject5.getJSONObject("light") : null);
                    if (b != null || (hashMap != null && (b = hashMap.get(string)) != null)) {
                        SearchDomBean searchDomBean = b;
                        String string4 = jSONObject4.getString("text");
                        if (string4 == null) {
                            str = null;
                        } else if (string4 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        } else {
                            str = n.b((CharSequence) string4).toString();
                        }
                        String string5 = jSONObject4.getString("prefix");
                        if (string5 == null) {
                            str2 = null;
                        } else if (string5 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        } else {
                            str2 = n.b((CharSequence) string5).toString();
                        }
                        com.taobao.search.m3.icons.c cVar2 = new com.taobao.search.m3.icons.c(searchDomBean, string3, str, str2, string);
                        if (q.a((Object) string, (Object) "guanggao")) {
                            if (z) {
                                m3CellBean.setMoveP4pIconBottom(true);
                            } else {
                                cVar = cVar2;
                            }
                        }
                        if (cVar2.a()) {
                            arrayList.add(cVar2);
                        }
                    }
                }
            }
            ArrayList arrayList2 = arrayList;
            if (cVar != null) {
                list = p.a(cVar);
            }
            m3CellBean.setIconInfo(new com.taobao.search.m3.icons.b(arrayList2, list));
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        }
    }

    private final String a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc861514", new Object[]{this, charSequence});
        }
        if (charSequence == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(charSequence.length() << 1);
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt >= 55296 && charAt < 56320) {
                sb.append(charAt);
            } else {
                sb.append(charAt);
                sb.append("\u200b");
            }
        }
        return sb.toString();
    }

    private final void f(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean, BaseSearchResult baseSearchResult) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ba6d767", new Object[]{this, jSONObject, m3CellBean, baseSearchResult});
        } else if (baseSearchResult != null) {
            CommonSearchResult commonSearchResult = (CommonSearchResult) baseSearchResult;
            String string2 = jSONObject.getString("title");
            if (string2 != null) {
                m3CellBean.setTitle(a((CharSequence) android.taobao.util.j.a(string2)));
            }
            HashMap<String, SearchDomBean> hashMap = commonSearchResult.domIcons;
            JSONArray jSONArray = jSONObject.getJSONArray(com.taobao.taolive.room.ui.fanslevel.a.ICON_RENDER);
            if (jSONArray != null) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (q.a((Object) jSONObject2.getString("group"), (Object) "1") && (string = jSONObject2.getString("domClass")) != null) {
                        com.alibaba.fastjson.JSONObject jSONObject3 = jSONObject2.getJSONObject("iconStyle");
                        SearchDomBean b = nne.b(jSONObject3 != null ? jSONObject3.getJSONObject("light") : null);
                        if (b != null || (hashMap != null && (b = hashMap.get(string)) != null)) {
                            if (m3CellBean.getTitleIcon() == null) {
                                m3CellBean.setTitleIcon(b);
                            }
                            if (m3CellBean.getTitleIcons() == null) {
                                m3CellBean.setTitleIcons(new ArrayList());
                            }
                            List<SearchDomBean> titleIcons = m3CellBean.getTitleIcons();
                            if (titleIcons == null) {
                                q.a();
                            }
                            titleIcons.add(b);
                        }
                    }
                }
            }
            Boolean bool = jSONObject.getBoolean("listTwoLineTitle");
            if (bool == null || bool.booleanValue()) {
                m3CellBean.setListTitleLines(2);
            } else {
                m3CellBean.setListTitleLines(1);
            }
            if (jSONObject.getBooleanValue("wfTwoLineTitle")) {
                m3CellBean.setWfTitleLines(2);
            } else {
                m3CellBean.setWfTitleLines(1);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        }
    }

    private final void j(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689040b5", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("benefits");
        if (jSONArray2 == null) {
            return;
        }
        int size = jSONArray2.size();
        for (int i = 0; i < size; i++) {
            com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
            if (jSONObject2 != null && q.a((Object) jSONObject2.getString("type"), (Object) "flashSaleInfo") && (jSONArray = jSONObject2.getJSONArray("texList")) != null) {
                ArrayList arrayList = new ArrayList();
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(FlashSaleView.Companion.a());
                int size2 = jSONArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String string = jSONArray.getString(i2);
                    if (string != null) {
                        arrayList.add(new com.taobao.search.m3.flash.c(string, (int) textPaint.measureText(string)));
                    }
                }
                m3CellBean.setFlashSaleInfo(new com.taobao.search.m3.flash.b(arrayList, jSONObject2.getLongValue("onlineEndTime"), jSONObject2.getString("soldOutTxt"), a(jSONObject2.getString("txtColor")), jSONObject2.getString("iconUrl"), a(jSONObject2.getString("countDownBgColor"))));
                return;
            }
        }
    }

    private final void k(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbbf3f6", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("imageInfo");
        if (jSONArray != null && jSONArray.size() > 0) {
            com.alibaba.fastjson.JSONObject jSONObject2 = jSONArray.getJSONObject(0);
            m3CellBean.setPicPath(jSONObject2.getString("imageUrl"));
            m3CellBean.setUprightImage(jSONObject2.getString("uprightImgImage"));
            m3CellBean.setWfRatioOrigin(jSONObject2.getString("uprightImgAspectRatio"));
            m3CellBean.setWfRatio(com.taobao.android.searchbaseframe.util.g.a(m3CellBean.getWfRatioOrigin(), 1.0f));
            if (StringUtils.isEmpty(m3CellBean.getUprightImage())) {
                m3CellBean.setUprightImage(m3CellBean.getPicPath());
            }
            if (!StringUtils.isEmpty(m3CellBean.getUprightImage()) && StringUtils.isEmpty(m3CellBean.getWfRatioOrigin())) {
                m3CellBean.setWfRatioOrigin(String.valueOf(m3CellBean.getWfRatio()));
            }
        }
        if (StringUtils.isEmpty(m3CellBean.getPicPath())) {
            m3CellBean.setPicPath(jSONObject.getString(nog.PRD_PICURL));
        }
        if (StringUtils.isEmpty(m3CellBean.getUprightImage())) {
            m3CellBean.setUprightImage(jSONObject.getString(nog.PRD_WF_PICURL));
            String string = jSONObject.getString("uprightImgAspectRatio");
            if (string != null) {
                m3CellBean.setWfRatioOrigin(string);
                m3CellBean.setWfRatio(com.taobao.android.searchbaseframe.util.g.a(string, 1.0f));
            }
        }
        if (!StringUtils.isEmpty(m3CellBean.getWfRatioOrigin()) || StringUtils.isEmpty(m3CellBean.getUprightImage())) {
            return;
        }
        m3CellBean.setWfRatio(0.6666667f);
        m3CellBean.setWfRatioOrigin(String.valueOf(m3CellBean.getWfRatio()));
    }

    private final void c(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        HashSet hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325e59ee", new Object[]{this, jSONObject, m3CellBean});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("text");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            int intValue = jSONObject.getIntValue("iconWidth");
            int intValue2 = jSONObject.getIntValue("iconHeight");
            String string2 = jSONObject.getString("prizeIds");
            if (string2 != null) {
                hashSet = new HashSet();
                for (String str : n.b((CharSequence) string2, new String[]{","}, false, 0, 6, (Object) null)) {
                    hashSet.add(str);
                }
            } else {
                hashSet = null;
            }
            m3CellBean.setDiscountInfo(new com.taobao.search.m3.discount.a(intValue, intValue2, jSONObject.getString("icon"), string, a(jSONObject.getString("textColor")), hashSet, jSONObject.getString("receivedText"), jSONObject.getString("receivedDefaultText"), null, false, LogType.UNEXP_OTHER, null));
        }
    }

    private final void l(com.alibaba.fastjson.JSONObject jSONObject, M3CellBean m3CellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee7a737", new Object[]{this, jSONObject, m3CellBean});
            return;
        }
        com.alibaba.fastjson.JSONObject jSONObject2 = jSONObject.getJSONObject("discountInfo");
        if (jSONObject2 == null) {
            return;
        }
        c(jSONObject2, m3CellBean);
    }
}
