package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import tb.hiq;
import tb.kge;
import tb.pqj;
import tb.qna;
import tb.xjs;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f13865a;
    private boolean b;
    private ButtonStateHelper c = new ButtonStateHelper();

    static {
        kge.a(-1272159600);
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.f13865a = z;
        this.b = z2;
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem, VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50511d2d", new Object[]{this, cVar, liveItem, videoInfo, str});
        } else if (liveItem == null) {
        } else {
            d(liveItem);
            b(cVar, liveItem);
            e(liveItem);
            a(liveItem, this.f13865a);
            b(liveItem);
            ButtonStateHelper buttonStateHelper = this.c;
            boolean z2 = this.b;
            if (!com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j(cVar) || !com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i(cVar)) {
                z = false;
            }
            buttonStateHelper.a(cVar, liveItem, z2, z);
            a(cVar, liveItem);
            b(liveItem, videoInfo, str);
        }
    }

    public static void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4626b36a", new Object[]{cVar, liveItem});
        } else if (liveItem == null) {
        } else {
            liveItem.itemConfigInfo = qna.c(cVar);
            if (liveItem.nativeConfigInfos == null) {
                liveItem.nativeConfigInfos = new JSONObject();
            }
            liveItem.nativeConfigInfos.put("seckillPreheatAddCart", (Object) Boolean.valueOf(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.q()));
            String str = "1";
            liveItem.nativeConfigInfos.put("newUserAddCart", (Object) str);
            liveItem.nativeConfigInfos.put("glPerformance", (Object) (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.o() ? "true" : "false"));
            JSONObject jSONObject = liveItem.nativeConfigInfos;
            if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.y()) {
                str = "0";
            }
            jSONObject.put("supportHotItemPreheat", (Object) str);
        }
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198c541", new Object[]{this, cVar, jSONObject});
            return;
        }
        ButtonStateHelper buttonStateHelper = this.c;
        boolean z2 = this.b;
        if (!com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j(cVar) || !com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i(cVar)) {
            z = false;
        }
        buttonStateHelper.a(cVar, jSONObject, z2, z);
    }

    public static void b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae4644", new Object[]{liveItem});
        } else if (liveItem == null || liveItem.itemExtData == null) {
        } else {
            String string = liveItem.itemExtData.getString("timingUpShelfStatus");
            long longValue = liveItem.itemExtData.getLongValue("timingStarts");
            if (!StringUtils.equals("0", string) || longValue <= 0 || !StringUtils.isEmpty(liveItem.itemExtData.getString("native_timingStarts"))) {
                return;
            }
            liveItem.itemExtData.put("native_timingStarts", (Object) hiq.a(longValue, "开抢"));
        }
    }

    public static void a(LiveItem liveItem, long j) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33425ea1", new Object[]{liveItem, new Long(j)});
        } else if (liveItem == null || liveItem.itemExtData == null || (jSONArray = liveItem.itemExtData.getJSONArray("itemBenefitLabels")) == null || jSONArray.isEmpty()) {
        } else {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                if (jSONObject == null) {
                    it.remove();
                } else if (a.a(jSONObject, j)) {
                    return;
                } else {
                    it.remove();
                }
            }
        }
    }

    public static void a(LiveItem liveItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33429ab1", new Object[]{liveItem, new Boolean(z)});
        } else if (liveItem == null || liveItem.itemExtData == null) {
        } else {
            if (!z) {
                liveItem.itemExtData.remove("preSaleStatus");
            } else if (!StringUtils.equals("0", liveItem.itemExtData.getString("preSaleStatus"))) {
            } else {
                long b = l.b(liveItem.itemExtData.getString("depositBegin"));
                if (b < 0 || liveItem.itemExtData.containsKey("native_depositBegin")) {
                    return;
                }
                liveItem.itemExtData.put("native_depositBegin", (Object) hiq.a(b, "付定"));
            }
        }
    }

    private void e(LiveItem liveItem) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4f9f87", new Object[]{this, liveItem});
        } else if (liveItem == null || liveItem.extendVal == null || StringUtils.isEmpty(liveItem.extendVal.timeMovingTypeInfo) || (b = pqj.b(liveItem.extendVal.timeMovingTypeInfo)) == null || "1".equals((String) b.get(String.valueOf(liveItem.itemId)))) {
        } else {
            liveItem.extendVal.playUrl = null;
            liveItem.extendVal.timeMovingPlayInfo = null;
        }
    }

    private void b(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d4dceb", new Object[]{this, cVar, liveItem});
        } else if (liveItem == null) {
        } else {
            if (liveItem.extendVal != null && liveItem.extendVal.liveItemBizTags != null) {
                liveItem.native_vipTagsShow = (liveItem.extendVal.liveItemBizTags.contains("vipFirst") || liveItem.extendVal.liveItemBizTags.contains("vipBuyGift")) && com.taobao.android.live.plugin.atype.flexalocal.good.a.a().h(cVar) != 0;
                if (!com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i(cVar) || ((!liveItem.extendVal.liveItemBizTags.contains("vipFirst") && !liveItem.extendVal.liveItemBizTags.contains("vipBuyGift")) || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().h(cVar) == 0 || com.taobao.android.live.plugin.atype.flexalocal.good.a.a().f(cVar) || !com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j(cVar))) {
                    z = false;
                }
                liveItem.native_canShowVipEntrance = z;
                return;
            }
            liveItem.native_vipTagsShow = false;
            liveItem.native_canShowVipEntrance = false;
        }
    }

    private static void b(LiveItem liveItem, VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c5b593", new Object[]{liveItem, videoInfo, str});
        } else if (liveItem == null || videoInfo == null || !com.taobao.taolive.sdk.goodlist.d.a(videoInfo.itemTransferInfo)) {
        } else {
            if (!StringUtils.isEmpty(liveItem.extendVal.tradeParamsForPcg)) {
                liveItem.extendVal.tradeParams = liveItem.extendVal.tradeParamsForPcg;
            }
            if (!StringUtils.equals(str, Long.toString(liveItem.itemId))) {
                return;
            }
            liveItem.itemExtData.put("rec0", (Object) "true");
        }
    }

    public static void a(ItemlistV2ResponseData itemlistV2ResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77668d6", new Object[]{itemlistV2ResponseData});
        } else if (itemlistV2ResponseData != null) {
            if (itemlistV2ResponseData.itemListv1 != null) {
                for (int i = 0; i < itemlistV2ResponseData.itemListv1.size(); i++) {
                    ItemlistV2ResponseData.ItemListv1 itemListv1 = itemlistV2ResponseData.itemListv1.get(i);
                    if (itemListv1 != null) {
                        c(itemListv1.liveItemDO);
                    }
                }
            }
            if (itemlistV2ResponseData.bizTopItemList != null) {
                for (int i2 = 0; i2 < itemlistV2ResponseData.bizTopItemList.size(); i2++) {
                    c(itemlistV2ResponseData.bizTopItemList.get(i2));
                }
            }
            if (itemlistV2ResponseData.hotList == null) {
                return;
            }
            for (int i3 = 0; i3 < itemlistV2ResponseData.hotList.size(); i3++) {
                c(itemlistV2ResponseData.hotList.get(i3));
            }
        }
    }

    public static void c(LiveItem liveItem) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78396405", new Object[]{liveItem});
        } else if (liveItem != null && liveItem.itemExtData != null) {
            for (String str : liveItem.itemExtData.keySet()) {
                if (!StringUtils.isEmpty(str) && (obj = liveItem.itemExtData.get(str)) != null && !(obj instanceof JSON)) {
                    liveItem.itemExtData.put(str, (Object) obj.toString());
                }
            }
        }
    }

    public static void d(LiveItem liveItem) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbc481c6", new Object[]{liveItem});
        } else if (liveItem != null) {
            if (liveItem.native_itemBenefits == null) {
                liveItem.native_itemBenefits = new JSONArray();
            }
            liveItem.native_itemBenefits.clear();
            JSONObject jSONObject = liveItem.personalityData;
            if (jSONObject != null && jSONObject.getJSONArray(xjs.f34341a) != null && !jSONObject.getJSONArray(xjs.f34341a).isEmpty() && (a2 = qna.a(jSONObject.getJSONArray(xjs.f34341a))) != null) {
                liveItem.native_itemBenefits.addAll(a2);
            }
            if (liveItem.itemExtData == null) {
                return;
            }
            JSONArray parseArray = JSON.parseArray(liveItem.itemExtData.getString(xjs.b));
            JSONArray jSONArray = new JSONArray();
            if (parseArray == null || parseArray.size() <= 0) {
                return;
            }
            for (int i = 0; i < parseArray.size(); i++) {
                JSONObject jSONObject2 = parseArray.getJSONObject(i);
                if (jSONObject2 != null && !StringUtils.isEmpty(jSONObject2.getString("type")) && !a(liveItem.native_itemBenefits, jSONObject2)) {
                    jSONArray.add(jSONObject2);
                }
            }
            JSONArray a3 = qna.a(jSONArray);
            if (a3 != null) {
                liveItem.native_itemBenefits.addAll(a3);
            }
            Collections.sort(liveItem.native_itemBenefits, new Comparator<Object>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
                    }
                    JSONObject jSONObject3 = (JSONObject) obj;
                    JSONObject jSONObject4 = (JSONObject) obj2;
                    int i2 = Integer.MAX_VALUE;
                    int a4 = !StringUtils.isEmpty(jSONObject3.getString("orderVal")) ? l.a(jSONObject3.getString("orderVal")) : Integer.MAX_VALUE;
                    if (!StringUtils.isEmpty(jSONObject4.getString("orderVal"))) {
                        i2 = l.a(jSONObject4.getString("orderVal"));
                    }
                    return a4 - i2;
                }
            });
        }
    }

    private static boolean a(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48168764", new Object[]{jSONArray, jSONObject})).booleanValue();
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null && StringUtils.equals(jSONObject.getString("type"), jSONObject2.getString("type"))) {
                return true;
            }
        }
        return false;
    }
}
