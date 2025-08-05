package com.taobao.oversea.baobao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.q;
import android.util.Log;
import anet.channel.util.Utils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.orange.OrangeConfig;
import com.taobao.oversea.baobao.BaoBaoDo;
import com.taobao.oversea.baobao.view.MSProgress;
import com.taobao.oversea.baobao.view.WXProgress;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.taolive.room.utils.aw;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.aem;
import tb.pro;

/* loaded from: classes7.dex */
public class BaobaoManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CART_ITEMCOUNTCHANGED_ACTION = "openCartItemCountChanged";
    private static final String CART_UPDATE_ACTION = "openCartUpdate";
    private static final String ORANGE_BAOBAO_GROUP = "tmgbaobao";

    /* renamed from: a  reason: collision with root package name */
    public static String f18619a = "";
    public static boolean b = false;
    private static BaobaoManager d = null;
    private static volatile boolean e = false;
    private final String c = "BaobaoManager";
    private HashMap<String, Object> f = new HashMap<>();

    public static /* synthetic */ void a(BaobaoManager baobaoManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3caef54", new Object[]{baobaoManager});
        } else {
            baobaoManager.k();
        }
    }

    public static /* synthetic */ HashMap b(BaobaoManager baobaoManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("5e717b96", new Object[]{baobaoManager}) : baobaoManager.f;
    }

    public static BaobaoManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaobaoManager) ipChange.ipc$dispatch("d691154", new Object[0]);
        }
        if (d == null) {
            d = new BaobaoManager();
        }
        return d;
    }

    public boolean b() throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!d()) {
            return false;
        }
        if (e) {
            return true;
        }
        WXSDKEngine.registerComponent("tmgbaobaoprogress", WXProgress.class);
        MUSEngine.registerUINode("tmgbaobaoprogress", MSProgress.class);
        q.a("TMGBaobaoBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) TMGBaobaoBridge.class);
        aem.a().a(new e());
        a(Globals.getApplication());
        k();
        b = Utils.isHarmonyOS();
        e = true;
        return true;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.oversea.baobao.BaobaoManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent == null || pro.e(intent.getAction())) {
                } else {
                    try {
                        String action = intent.getAction();
                        if (!BaobaoManager.CART_UPDATE_ACTION.equals(action) && !BaobaoManager.CART_ITEMCOUNTCHANGED_ACTION.equals(action)) {
                            return;
                        }
                        BaobaoManager.this.a(false);
                    } catch (Exception e2) {
                        Log.e("BaobaoManager", "mReceiver exp. Action: " + intent.getAction(), e2);
                    }
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CART_UPDATE_ACTION);
        intentFilter.addAction(CART_ITEMCOUNTCHANGED_ACTION);
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
        Globals.getApplication().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.oversea.baobao.BaobaoManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (!"EDITON_SWITCHER_EDITTION_CODE_CHANGED".equals(intent.getAction())) {
                } else {
                    BaobaoManager.a(BaobaoManager.this);
                }
            }
        }, new IntentFilter("EDITON_SWITCHER_EDITTION_CODE_CHANGED"));
        LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.oversea.baobao.BaobaoManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent == null || pro.e(intent.getAction())) {
                } else {
                    try {
                        LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                        if (valueOf == LoginAction.NOTIFY_LOGIN_SUCCESS) {
                            BaobaoManager.this.a(false);
                        } else if (valueOf != LoginAction.NOTIFY_LOGOUT) {
                        } else {
                            BaobaoManager.a(BaobaoManager.this);
                        }
                    } catch (Exception e2) {
                        Log.e("BaobaoManager", "mReceiver exp. Action: " + intent.getAction(), e2);
                    }
                }
            }
        });
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_BAOBAO_GROUP}, new com.taobao.orange.d() { // from class: com.taobao.oversea.baobao.b$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else {
                    OrangeConfig.getInstance().getConfigs("tmgbaobao");
                }
            }
        }, true);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(z, false);
        }
    }

    public void a(boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!Login.checkSessionValid()) {
        } else {
            if (!z && !d.a().b()) {
                return;
            }
            new a().a(new IRemoteListener() { // from class: com.taobao.oversea.baobao.BaobaoManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        if (baseOutDo == null) {
                            return;
                        }
                        BaoBaoDo.BaobaoResult baobaoResult = (BaoBaoDo.BaobaoResult) baseOutDo.mo2429getData();
                        if (Boolean.valueOf(baobaoResult.callCartSuccess).booleanValue()) {
                            BaobaoManager.b(BaobaoManager.this).put("totalPrice", String.valueOf(baobaoResult.totalPrice));
                            BaobaoManager.b(BaobaoManager.this).put("totalQuantity", String.valueOf(baobaoResult.totalQuantity));
                            hashMap.put("totalPrice", String.valueOf(baobaoResult.totalPrice));
                            hashMap.put("totalQuantity", String.valueOf(baobaoResult.totalQuantity));
                            hashMap.put("itemPic", baobaoResult.itemPic);
                            hashMap.put("itemPrice", baobaoResult.itemPrice);
                            hashMap.put("itemTitle", baobaoResult.itemTitle);
                            hashMap.put("itemCurrency", baobaoResult.itemCurrency);
                            hashMap.put("itemUrl", baobaoResult.itemUrl);
                            hashMap.put(aw.PARAM_PVID, baobaoResult.pvid);
                            hashMap.put("recommend", baobaoResult.recommend);
                            hashMap.put("backgroundPic", baobaoResult.backgroundPic);
                            hashMap.put("firstPagePvid", baobaoResult.firstPagePvid);
                            hashMap.put("jumpUrl", baobaoResult.jumpUrl);
                            hashMap.put("utLogMap", JSON.toJSONString(baobaoResult.utLogMap));
                            hashMap.put("utParam", JSON.toJSONString(baobaoResult.utLogMap));
                            hashMap.put("isSceneCartReload", String.valueOf(z2));
                            d.a().a(hashMap);
                            return;
                        }
                        BaobaoManager.this.c();
                    } catch (Exception e2) {
                        String str = "requestSinge success error" + e2.toString();
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    String str = "requestSinge onError " + mtopResponse.toString();
                }
            });
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            new a().b(new IRemoteListener() { // from class: com.taobao.oversea.baobao.BaobaoManager.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject dataJsonObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        if (Objects.isNull(mtopResponse) || !mtopResponse.isApiSuccess() || Objects.isNull(mtopResponse.getDataJsonObject()) || (dataJsonObject = mtopResponse.getDataJsonObject()) == null) {
                            return;
                        }
                        int i2 = dataJsonObject.getInt("itemNum");
                        long j = dataJsonObject.getLong("totalFee");
                        BaobaoManager.b(BaobaoManager.this).put("totalPrice", String.valueOf(j));
                        BaobaoManager.b(BaobaoManager.this).put("totalQuantity", String.valueOf(i2));
                        HashMap hashMap = new HashMap();
                        hashMap.put("totalPrice", String.valueOf(j));
                        hashMap.put("totalQuantity", String.valueOf(i2));
                        d.a().a(hashMap);
                    } catch (Exception e2) {
                        String str = "requestCompensate exception " + e2.toString();
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    String str = "requestCompensate onError " + mtopResponse.toString();
                }
            });
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : Boolean.valueOf(OrangeConfig.getInstance().getConfig(ORANGE_BAOBAO_GROUP, "mainSwitch", "true")).booleanValue();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : Boolean.valueOf(OrangeConfig.getInstance().getConfig(ORANGE_BAOBAO_GROUP, "refreshSwitch", "true")).booleanValue();
    }

    public long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[]{this})).longValue() : Long.valueOf(OrangeConfig.getInstance().getConfig(ORANGE_BAOBAO_GROUP, "refreshInterval", "0")).longValue();
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        String str = b.b(Globals.getApplication()).countryCode;
        return (!j().containsKey(str) && !pro.e(f18619a)) ? f18619a : str;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        String str = j().get(g());
        return str == null ? "" : str;
    }

    private Map<String, String> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db121866", new Object[]{this});
        }
        try {
            Map<String, String> map = (Map) JSON.parseObject(OrangeConfig.getInstance().getConfig(ORANGE_BAOBAO_GROUP, "sceneCartType", "{\"HK\":\"overseaCart_1518018\",\"MO\":\"overseaCart_2283970\",\"MY\":\"overseaCart_1518082\",\"SG\":\"overseaCart_1517698\",\"TW\":\"overseaCart_1727874\",\"KR\":\"overseaCart_2283842\",\"JP\":\"overseaCart_3322946\",\"TH\":\"overseaCart_3322818\",\"VN\":\"overseaCart_3322882\",\"KH\":\"overseaCart_3323010\",\"AU\":\"overseaCart_3330498\",\"CA\":\"overseaCart_3370626\"}"), new TypeReference<Map<String, String>>() { // from class: com.taobao.oversea.baobao.b$2
            }, new Feature[0]);
            return map == null ? new HashMap() : map;
        } catch (Exception unused) {
            return new HashMap();
        }
    }

    public HashMap<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("100921d3", new Object[]{this});
        }
        a(true);
        return this.f;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.f.put("totalPrice", "0");
        this.f.put("totalQuantity", "0");
    }
}
