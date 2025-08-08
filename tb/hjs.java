package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.goodlist.n;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class hjs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNDER_TAKE_EXPLOSION_CARD = "itemCard";
    public static final String UNDER_TAKE_GOODS_LIST = "itemList";
    public static final String UNDER_TAKE_INSIDE_DETAIL = "insideDetail";
    public static final String UNDER_TAKE_ITEM_GROUP_LIST = "itemGroupList";

    static {
        kge.a(-1305633387);
    }

    public static long a(EnterGoodsData enterGoodsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f099715a", new Object[]{enterGoodsData})).longValue();
        }
        if (enterGoodsData == null || StringUtils.isEmpty(enterGoodsData.holdItemIds)) {
            return -1L;
        }
        String[] split = enterGoodsData.holdItemIds.split(Character.toString(','));
        if (split.length != 0) {
            return l.a(split[0], -1L);
        }
        return -1L;
    }

    public static boolean a(a aVar, Activity activity, VideoInfo videoInfo, EnterGoodsData enterGoodsData) {
        LiveItem liveItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f6e4080", new Object[]{aVar, activity, videoInfo, enterGoodsData})).booleanValue();
        }
        if (videoInfo != null && enterGoodsData != null && StringUtils.equals("insideDetail", enterGoodsData.itemHoldType) && enterGoodsData.curItemList != null && !enterGoodsData.curItemList.isEmpty() && !StringUtils.isEmpty(enterGoodsData.holdItemIds)) {
            String[] split = enterGoodsData.holdItemIds.split(Character.toString(','));
            if (split == null || split.length == 0 || StringUtils.isEmpty(split[0])) {
                his.b("GoodsUnderTakeHelper", "checkInsideDetailTakeItemId | id parse failed. holdItemIds=" + enterGoodsData.holdItemIds);
            } else {
                Iterator<LiveItem> it = enterGoodsData.curItemList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        liveItem = null;
                        break;
                    }
                    LiveItem next = it.next();
                    if (StringUtils.equals(Long.toString(next.itemId), split[0])) {
                        liveItem = next;
                        break;
                    }
                }
                if (liveItem == null) {
                    his.b("GoodsUnderTakeHelper", "checkInsideDetailTakeItemId | target item find failed.  holdItemIds=" + enterGoodsData.holdItemIds);
                    return false;
                }
                if (liveItem.itemConfigInfo == null) {
                    liveItem.itemConfigInfo = videoInfo.itemConfigInfo;
                    if (liveItem.itemConfigInfo == null) {
                        liveItem.itemConfigInfo = new JSONObject();
                    }
                    liveItem.itemConfigInfo = (JSONObject) liveItem.itemConfigInfo.clone();
                    liveItem.itemConfigInfo.put("itemSourceType", (Object) "hold");
                }
                if (!(n.a(activity, liveItem) && n.d())) {
                    if (enterGoodsData != null) {
                        enterGoodsData.itemHoldType = UNDER_TAKE_GOODS_LIST;
                    }
                    videoInfo.itemHoldType = UNDER_TAKE_GOODS_LIST;
                    return false;
                }
                if (StringUtils.isEmpty(liveItem.cpsClickPos)) {
                    liveItem.cpsClickPos = "insidedetail";
                }
                his.a("GoodsUnderTakeHelper", "checkInsideDetailTakeItemId | inside take , goodIndex=" + liveItem.goodsIndex + "  itemId=" + liveItem.itemId);
                com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(aVar, activity, liveItem, "detail", (Map<String, String>) null);
                return true;
            }
        }
        return false;
    }

    public static void a(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75608515", new Object[]{cVar, new Long(j)});
        } else if (0 >= j) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("bizTopItemId", String.valueOf(j));
            hashMap.put("from", "additionitem");
            ddw.a().a(xkw.EVENT_SHOW_GOODSPACKAGE, hashMap, cVar == null ? null : cVar.D());
        }
    }

    public static boolean a(c cVar, String str) {
        b a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5eb679d", new Object[]{cVar, str})).booleanValue() : !StringUtils.isEmpty(str) && (a2 = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().a(cVar, str)) != null && a2.c() != null && !a2.c().isEmpty();
    }
}
