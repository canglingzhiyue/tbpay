package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import java.util.List;
import tb.eyx;
import tb.eyy;
import tb.ezc;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(287726629);
    }

    public static /* synthetic */ void a(SkuCore.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86432bf6", new Object[]{aVar});
        } else {
            b(aVar);
        }
    }

    public static void a(final Context context, final eyx eyxVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d909e64", new Object[]{context, eyxVar, jSONObject});
            return;
        }
        SkuCore skuCore = (SkuCore) eyxVar.a().a(SkuCore.class);
        if (skuCore == null) {
            return;
        }
        SkuCore.b skuItem = skuCore.getSkuItem();
        SkuCore.a aVar = null;
        final String b = skuItem != null ? skuItem.b() : null;
        final SkuCore.a d = skuItem != null ? skuItem.d() : null;
        if (skuItem != null) {
            aVar = skuItem.e();
        }
        final SkuCore.a aVar2 = aVar;
        final MessageQueue myQueue = Looper.myQueue();
        bf.mExecutor.execute(new Runnable() { // from class: com.taobao.android.detail.ttdetail.utils.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                k.a(SkuCore.a.this);
                k.a(aVar2);
                if (StringUtils.isEmpty(b) || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                final JSONObject a2 = com.taobao.android.sku.utils.g.a(JSON.toJSONString(jSONObject2, SerializerFeature.DisableCircularReferenceDetect));
                myQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.detail.ttdetail.utils.k.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return ((Boolean) ipChange3.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                        }
                        com.taobao.android.sku.weex.c.a(context, b, eyxVar.e().a(), a2);
                        return false;
                    }
                });
            }
        });
    }

    public static void b(final Context context, final eyx eyxVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20bc51a5", new Object[]{context, eyxVar, jSONObject});
            return;
        }
        SkuCore skuCore = (SkuCore) eyxVar.a().a(SkuCore.class);
        if (skuCore == null) {
            return;
        }
        final String f = skuCore.getSkuItem().f();
        final MessageQueue myQueue = Looper.myQueue();
        bf.mExecutor.execute(new Runnable() { // from class: com.taobao.android.detail.ttdetail.utils.k.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (StringUtils.isEmpty(f) || (jSONObject2 = jSONObject) == null) {
                } else {
                    final JSONObject a2 = com.taobao.android.sku.utils.g.a(JSON.toJSONString(jSONObject2, SerializerFeature.DisableCircularReferenceDetect));
                    myQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.detail.ttdetail.utils.k.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.os.MessageQueue.IdleHandler
                        public boolean queueIdle() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                            }
                            com.taobao.android.sku.weex.c.a(context, f, eyxVar.e().a(), a2);
                            return false;
                        }
                    });
                }
            }
        });
    }

    private static void b(SkuCore.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b8cc77", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            odg.j().a(new SimpleEntry<>(aVar.a(), aVar.b()));
        }
    }

    public static String a(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        String[] split2 = str2.split(":");
        if (split2.length != 2 || StringUtils.isEmpty(split2[0])) {
            return null;
        }
        if (StringUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : str.split(";")) {
            if (!StringUtils.isEmpty(str3)) {
                String[] split3 = str3.split(":");
                if (split3.length == 2 && StringUtils.equals(split3[0], split2[0])) {
                    str3 = str2;
                }
                sb.append(";");
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static String a(List<? extends com.taobao.android.detail.ttdetail.component.module.h> list, int i) {
        eyy h;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d92c6d16", new Object[]{list, new Integer(i)});
        }
        if (list != null && !list.isEmpty() && i >= 0 && i < list.size() && (h = ((ezc) list.get(i).getComponentData()).h()) != null && (d = h.d()) != null) {
            return d.getString("skuText");
        }
        return null;
    }

    public static String a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1abe71b", new Object[]{intent});
        }
        if (intent != null && (data = intent.getData()) != null) {
            return data.getQueryParameter("skuId");
        }
        return null;
    }

    public static boolean a(SkuCore skuCore) {
        SkuCore.b skuItem;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4aff0c97", new Object[]{skuCore})).booleanValue() : (skuCore == null || (skuItem = skuCore.getSkuItem()) == null || StringUtils.isEmpty(skuItem.a())) ? false : true;
    }

    public static boolean a(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76609dbd", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isShowSku();
        }
        return true;
    }

    public static boolean b(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87166a7e", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isNewbuyShowSku();
        }
        return true;
    }

    public static boolean e(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b937d0c1", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isSkuSilentAction();
        }
        return false;
    }

    public static boolean c(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97cc373f", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isDonateItem();
        }
        return false;
    }

    public static boolean d(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8820400", new Object[]{feature})).booleanValue();
        }
        if (feature != null) {
            return feature.isDetail3SkuPriceLinkage();
        }
        return false;
    }
}
