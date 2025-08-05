package tb;

import android.app.ActivityManager;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.h;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.message.datasdk.facade.message.MessageType;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.goodlist.BottomMode;
import com.taobao.taolive.sdk.goodlist.a;
import com.taobao.taolive.sdk.goodlist.d;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.GoodMsgNew;
import com.taobao.taolive.sdk.utils.l;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import tb.fpd;

/* loaded from: classes6.dex */
public class hiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f28693a;
    private static int b;

    static {
        kge.a(1025369936);
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue() : i == 4 || i == 5 || i == 6 || i == 7;
    }

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue() : i == 2 || i == 1 || i == 8;
    }

    public static boolean a(Context context, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f10ee7f", new Object[]{context, liveItem})).booleanValue();
        }
        if (liveItem == null || liveItem.liveItemStatusData == null) {
            return false;
        }
        boolean booleanValue = liveItem.liveItemStatusData.getBooleanValue("isGray");
        if (booleanValue) {
            hix.a(context, "商品已下架，看看其它商品吧");
        }
        return booleanValue;
    }

    public static void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{new Integer(i)});
        } else {
            b = i;
        }
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        return pmd.a().w() != null ? pmd.a().w().a() : System.currentTimeMillis();
    }

    public static boolean a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1232887", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null) {
            return false;
        }
        if (liveItem.itemExtData != null && liveItem.itemExtData.containsKey("enableSku")) {
            return l.d(liveItem.itemExtData.getString("enableSku"));
        }
        if (liveItem.extendVal == null) {
            return false;
        }
        return liveItem.extendVal.enableSKU;
    }

    public static boolean b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34ae4648", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.extendVal == null || !TextUtils.equals("liveshop", liveItem.extendVal.itemShopType)) ? false : true;
    }

    public static boolean a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ead9f969", new Object[]{videoInfo})).booleanValue() : (videoInfo == null || videoInfo.itemConfigInfo == null || videoInfo.itemConfigInfo.getJSONObject("itemAlgoRecommendCardParam") == null || !videoInfo.itemConfigInfo.getJSONObject("itemAlgoRecommendCardParam").getBooleanValue("enableShowRecCardIdle") || !hir.aa()) ? false : true;
    }

    public static boolean a(LiveItem liveItem, String str, String str2) {
        JSONArray c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3f3981b", new Object[]{liveItem, str, str2})).booleanValue();
        }
        if (liveItem == null) {
            return false;
        }
        if ("全部".equals(str)) {
            return true;
        }
        if (TextUtils.isEmpty(liveItem.extendVal.itemCategoryIdList) || (c = pqj.c(liveItem.extendVal.itemCategoryIdList)) == null) {
            return false;
        }
        for (int i = 0; i < c.size(); i++) {
            if (TextUtils.equals(c.getString(i), str2)) {
                return true;
            }
        }
        return false;
    }

    public static void l(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81d6fce", new Object[]{liveItem});
        } else if (!n(liveItem) || liveItem.nativeConfigInfos == null) {
        } else {
            f28693a = liveItem.nativeConfigInfos.getIntValue("algoItemIndex");
        }
    }

    public static boolean a(String str, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd50f6d1", new Object[]{str, liveItem})).booleanValue();
        }
        if (liveItem == null || TextUtils.isEmpty(liveItem.liveId) || TextUtils.isEmpty(str) || !hir.k() || TextUtils.equals(str, liveItem.liveId)) {
            return true;
        }
        his.b("GoodUtils", "liveIdCheck | currLiveId=" + str + " itemLiveId=" + liveItem.liveId + "    itemId=" + liveItem.itemId);
        pqi.a().c("good_liveId_check");
        return false;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : "全部".equals(str) && "0".equals(str2);
    }

    public static String g(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f066cb7", new Object[]{liveItem});
        }
        if (liveItem != null && liveItem.extendVal != null) {
            return liveItem.extendVal.scene;
        }
        return null;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : "preHeat".equals(str);
    }

    public static boolean c(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78396409", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem == null || liveItem.liveItemStatusData == null) {
            return false;
        }
        return liveItem.liveItemStatusData.getBooleanValue("isGray") || liveItem.liveItemStatusData.getBooleanValue("isDownShelf");
    }

    public static boolean d(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bbc481ca", new Object[]{liveItem})).booleanValue() : liveItem != null && liveItem.extendVal != null && TextUtils.equals("secKill", liveItem.extendVal.itemBizType) && d.a();
    }

    public static boolean e(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff4f9f8b", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.extendVal == null || !TextUtils.equals("preHeat", liveItem.extendVal.itemBizType)) ? false : true;
    }

    public static boolean a(a aVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbfce2a7", new Object[]{aVar})).booleanValue() : (aVar == null || aVar.b == null || (jSONObject = aVar.b.getJSONObject("extendVal")) == null || !TextUtils.equals("preHeat", jSONObject.getString("itemBizType"))) ? false : true;
    }

    public static boolean m(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ba88d93", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.nativeConfigInfos == null || liveItem.nativeConfigInfos.getIntValue("algoItemIndex") - f28693a <= b) ? false : true;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        f28693a = 0;
        b = 0;
    }

    public static boolean h(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9f0f8ce", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.liveItemStatusData == null || !liveItem.liveItemStatusData.getBooleanValue("isSpeaking")) ? false : true;
    }

    public static boolean n(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f33ab54", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.itemExtData == null || !"algo".equals(liveItem.itemExtData.getString("smallCardItemType"))) ? false : true;
    }

    public static boolean i(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7c168f", new Object[]{liveItem})).booleanValue() : (liveItem == null || liveItem.extendVal == null || liveItem.personalityData == null || liveItem.personalityData.getJSONArray("itemGifts") == null || liveItem.personalityData.getJSONArray("itemGifts").isEmpty()) ? false : true;
    }

    public static String j(LiveItem liveItem) {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("445061d4", new Object[]{liveItem});
        }
        if (liveItem == null) {
            return "-1";
        }
        if (d(liveItem)) {
            String str = liveItem.itemPrice;
            return (liveItem.extendVal == null || liveItem.extendVal.secKillInfo == null || (b2 = pqj.b(liveItem.extendVal.secKillInfo)) == null) ? str : b2.getString("price");
        } else if (liveItem.personalityData != null && !TextUtils.isEmpty(liveItem.personalityData.getString("promotionPrice"))) {
            return liveItem.personalityData.getString("promotionPrice");
        } else {
            if (liveItem.personalityData != null && !TextUtils.isEmpty(liveItem.personalityData.getString("singlePromotionPrice"))) {
                return liveItem.personalityData.getString("singlePromotionPrice");
            }
            return liveItem.itemPrice;
        }
    }

    public static String f(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d2987058", new Object[]{liveItem}) : (liveItem == null || liveItem.personalityData == null) ? "" : !TextUtils.isEmpty(liveItem.personalityData.getString("promotionPrice")) ? liveItem.personalityData.getString("promotionPriceDesc") : liveItem.personalityData.getString("itemPriceDesc");
    }

    public static void a(LiveItem liveItem, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faac2cea", new Object[]{liveItem, cVar});
        } else if (liveItem == null || cVar == null) {
        } else {
            ddw.a().a("com.taobao.taolive.room.goodlist.all.refresh.item.inner", liveItem, c.a(cVar));
        }
    }

    public static e b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("46fea39", new Object[]{aVar});
        }
        e eVar = new e();
        eVar.f13845a = aVar.f21830a;
        eVar.b = aVar.c;
        eVar.c = aVar.d;
        eVar.f = aVar.e;
        eVar.a(aVar);
        eVar.g = aVar.i;
        return eVar;
    }

    public static JSONObject a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aab96da0", new Object[]{new Boolean(z), str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("searchKeyWord", (Object) str);
        jSONObject.put("search_entry", (Object) (z ? "bag_default" : "bag_more"));
        jSONObject.put("blankMode", (Object) Boolean.valueOf(z));
        jSONObject.put("refer", (Object) "search");
        if (TextUtils.isEmpty(str2)) {
            str2 = hir.T();
        }
        jSONObject.put("jumpUrl", (Object) String.format(str2, str));
        return jSONObject;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (phg.d() != null) {
            return phg.d().a();
        }
        return false;
    }

    public static String a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e9fa33a", new Object[]{new Long(j), str});
        }
        return new SimpleDateFormat("MM.dd HH:mm" + str).format(new Date(j));
    }

    public static pmt a(VideoInfo videoInfo, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmt) ipChange.ipc$dispatch("8c195c83", new Object[]{videoInfo, cVar});
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = null;
        if (videoInfo == null) {
            return null;
        }
        pmt pmtVar = new pmt();
        pmtVar.f32764a = videoInfo.broadCaster != null ? videoInfo.broadCaster.accountId : "";
        pmtVar.c = videoInfo.liveId;
        if (videoInfo.broadCaster != null) {
            pmtVar.b = videoInfo.broadCaster.type;
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
            com.taobao.taolive.sdk.goodlist.e i = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i();
            if (cVar != null) {
                aVar = cVar.C();
            }
            i.a(aVar, pmtVar);
        }
        his.a("GoodUtils", "accountId:" + pmtVar.b + " liveId:" + pmtVar.c);
        return pmtVar;
    }

    public static void a(c cVar, pmv pmvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b19e90", new Object[]{cVar, pmvVar, str});
        } else if (cVar == null || cVar.l.b == null) {
        } else {
            pmt a2 = a(cVar.l.b, cVar);
            if (a2 != null) {
                a2.p = str;
                pmd.a().B().a(a2, pmvVar);
                his.a("GoodUtils", "start follow");
                return;
            }
            his.a("GoodUtils", "followParams is null");
        }
    }

    public static boolean a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18197561", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || aVar.o() == null) {
            return false;
        }
        return TextUtils.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString(), aVar.o().bizCode) || TextUtils.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), aVar.o().bizCode);
    }

    public static String a(LiveItem liveItem, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e8577c5", new Object[]{liveItem, new Boolean(z), str});
        }
        if (liveItem == null || liveItem.nativeConfigInfos == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String string = liveItem.nativeConfigInfos.getString("goodsDisplayStyle");
        if (!TextUtils.isEmpty(string)) {
            sb.append(string);
        }
        if (!z) {
            sb.append("_itm");
            return sb.toString();
        }
        sb.append(TextUtils.equals(BottomMode.ADDCART.getValue(), str) ? "_cart" : "_buy");
        return sb.toString();
    }

    public static UltronInstanceViewModel a(ViewModelStoreOwner viewModelStoreOwner) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronInstanceViewModel) ipChange.ipc$dispatch("35e95c06", new Object[]{viewModelStoreOwner}) : (UltronInstanceViewModel) new ViewModelProvider(viewModelStoreOwner, new h()).get(UltronInstanceViewModel.class);
    }

    public static String a(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && runningTasks.get(0) != null && runningTasks.get(0).topActivity != null) {
                    return String.valueOf(runningTasks.get(0).topActivity);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void a(final Context context, final AliUrlImageView aliUrlImageView, final float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360485ee", new Object[]{context, aliUrlImageView, new Float(f)});
        } else if (context == null || aliUrlImageView == null) {
        } else {
            aliUrlImageView.setImageLoadListener(new com.alilive.adapter.uikit.c() { // from class: tb.hiq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alilive.adapter.uikit.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }

                @Override // com.alilive.adapter.uikit.c
                public void a(Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        return;
                    }
                    aliUrlImageView.getLayoutParams().width = (hin.a(context, f) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight();
                    aliUrlImageView.requestLayout();
                }
            });
        }
    }

    public static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{iDMComponent})).booleanValue() : TextUtils.equals("dinamicx", iDMComponent.getContainerType());
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e389e4", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            Object a2 = fnk.a(str, "", new fpd.a().b(jSONObject).a());
            if (a2 instanceof String) {
                return fqr.a((String) a2);
            }
        }
        return i;
    }

    public static int a(JSONObject jSONObject, c cVar, String str, int i) {
        IDMComponent b2;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7327235d", new Object[]{jSONObject, cVar, str, new Integer(i)})).intValue();
        }
        if (jSONObject != null && cVar != null && !TextUtils.isEmpty(str) && cVar.B() != null && cVar.B().x() != null && (b2 = cVar.B().x().b(str)) != null && b2.getFields() != null) {
            String string = b2.getFields().getString("height");
            if (!TextUtils.isEmpty(string) && (a2 = a(jSONObject, string, -1)) > 0) {
                return a2;
            }
        }
        return i;
    }

    public static int a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("902c6382", new Object[]{cVar})).intValue();
        }
        if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(cVar)) {
            return MessageType.WEEX_CARD_CENTER;
        }
        return 116;
    }

    public static void a(c cVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4626b36a", new Object[]{cVar, liveItem});
        } else if (cVar == null || liveItem == null || liveItem.nativeConfigInfos == null) {
        } else {
            liveItem.nativeConfigInfos.remove("entry_clkPos");
            if (TextUtils.isEmpty(cVar.L.c)) {
                return;
            }
            liveItem.nativeConfigInfos.put("entry_clkPos", (Object) cVar.L.c);
        }
    }

    public static boolean a(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4bc344c", new Object[]{extraGoodsTabItem, extraGoodsTabItem2})).booleanValue() : extraGoodsTabItem != null && extraGoodsTabItem2 != null && TextUtils.equals(extraGoodsTabItem.bizType, extraGoodsTabItem2.bizType) && TextUtils.equals(extraGoodsTabItem.type, extraGoodsTabItem2.type);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : new File("/data/local/tmp/", str).exists();
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15e917", new Object[]{aVar, new Boolean(z)});
        } else if (aVar == null) {
            his.b("GoodUtils", "postInteractiveMsg | context is null.");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("type", "pop");
            hashMap.put("from", "goods");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("show", Boolean.toString(z));
            hashMap.put("extra", hashMap2);
            aVar.a(hashMap, null);
        }
    }

    public static void a(GoodMsgNew goodMsgNew, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2a2801", new Object[]{goodMsgNew, liveItem});
        } else if (goodMsgNew == null || goodMsgNew.liveItemDO == null || liveItem == null || goodMsgNew.liveItemDO.itemExtData == null) {
        } else {
            if (liveItem.itemExtData == null) {
                liveItem.itemExtData = new JSONObject();
            }
            liveItem.itemExtData.put("isMainSubItemReplace", (Object) goodMsgNew.liveItemDO.itemExtData.getString("isMainSubItemReplace"));
        }
    }

    public static boolean k(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94925211", new Object[]{liveItem})).booleanValue();
        }
        if (liveItem != null && liveItem.itemExtData != null) {
            return l.a(liveItem.itemExtData.getString("isMainSubItemReplace"), false);
        }
        return false;
    }
}
