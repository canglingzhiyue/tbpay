package com.taobao.android.opencart.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hvf;

/* loaded from: classes6.dex */
public class CartRefreshCheckBroadcast extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f14484a = new AtomicBoolean();

    public static /* synthetic */ Object ipc$super(CartRefreshCheckBroadcast cartRefreshCheckBroadcast, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(CartRefreshCheckBroadcast cartRefreshCheckBroadcast, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327f0a0a", new Object[]{cartRefreshCheckBroadcast, mtopResponse});
        } else {
            cartRefreshCheckBroadcast.a(mtopResponse);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || (action = intent.getAction()) == null) {
        } else {
            hvf.c("CartRefreshCheckBroadcast", "onReceive intent=" + intent.getExtras());
            if (!"cartRefreshData".equals(action)) {
                return;
            }
            Bundle extras = intent.getExtras();
            a(context, extras);
            b(context, extras);
            String stringExtra = intent.getStringExtra("stringifyAddCartResult");
            if (StringUtils.isEmpty(stringExtra)) {
                a(context, extras, null);
                return;
            }
            try {
                JSONObject parseObject = JSONObject.parseObject(stringExtra);
                a(context, extras, parseObject);
                JSONArray jSONArray = parseObject.getJSONArray("cartIds");
                if (!parseObject.getBooleanValue("rememberCheck")) {
                    return;
                }
                HashSet hashSet = new HashSet();
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        hashSet.add(String.valueOf(it.next()));
                    }
                } else {
                    hashSet.add(parseObject.getString("cartId"));
                }
                CheckHoldManager.a().a(3, hashSet, null, true);
            } catch (Exception e) {
                hvf.c("CartRefreshCheckBroadcast", "parse stringifyAddCartResult error msg=" + e.getMessage());
            }
        }
    }

    private void b(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9edd7e75", new Object[]{this, context, bundle});
            return;
        }
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                hashMap.put(str, bundle.get(str));
            }
        }
        a.a(context, hashMap);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f14484a.getAndSet(true)) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("cartRefreshData");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(context).registerReceiver(new CartRefreshCheckBroadcast(), intentFilter);
        }
    }

    private void a(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f53e474", new Object[]{this, context, bundle});
            return;
        }
        Intent intent = new Intent("openCartUpdate");
        if (bundle == null || bundle.getBoolean("itemCountChanged", true)) {
            z = true;
        }
        intent.putExtra("itemCountChanged", z);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    private void a(final Context context, Bundle bundle, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cbb4fc", new Object[]{this, context, bundle, jSONObject});
        } else if (bundle != null && bundle.containsKey("stringifyAddCartResult") && StringUtils.isEmpty(String.valueOf(bundle.get("stringifyAddCartResult")))) {
        } else {
            if (bundle == null || bundle.getBoolean("itemCountChanged", true)) {
                z = true;
            }
            if (!z) {
                return;
            }
            final Intent intent = new Intent("OpenCartItemCountChange");
            if (jSONObject != null) {
                Integer integer = jSONObject.getInteger("taoItemCount");
                if (integer != null) {
                    i = integer.intValue();
                }
                i = -1;
            } else {
                if (bundle != null) {
                    i = bundle.getInt("itemCount", -1);
                }
                i = -1;
            }
            if (i != -1) {
                intent.putExtra("itemCount", i);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                return;
            }
            a(new IRemoteBaseListener() { // from class: com.taobao.android.opencart.broadcast.CartRefreshCheckBroadcast.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        CartRefreshCheckBroadcast.a(CartRefreshCheckBroadcast.this, mtopResponse);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                    } else {
                        JSONObject jSONObject2 = null;
                        try {
                            jSONObject2 = ((JSONObject) JSONObject.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0])).getJSONObject("data");
                        } catch (Exception e) {
                            hvf.c("CartRefreshCheckBroadcast", "response parse error=" + e.getMessage());
                        }
                        if (jSONObject2 == null || !jSONObject2.containsKey("count")) {
                            return;
                        }
                        intent.putExtra("itemCount", jSONObject2.getIntValue("count"));
                        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        CartRefreshCheckBroadcast.a(CartRefreshCheckBroadcast.this, mtopResponse);
                    }
                }
            });
        }
    }

    private void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        String str = "";
        String retCode = mtopResponse != null ? mtopResponse.getRetCode() : str;
        if (mtopResponse != null) {
            str = mtopResponse.getRetMsg();
        }
        hvf.c("CartRefreshCheckBroadcast", "sendItemCountMtopRequery onError code=" + retCode + ",msg=" + str);
    }

    private void a(IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2600e", new Object[]{this, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.trade.queryBagCount");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cartFrom", (Object) QueryParamsManager.DEFAULT_CART_FROM);
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1328setUnitStrategy("UNIT_TRADE");
        build.registerListener((IRemoteListener) iRemoteBaseListener);
        build.startRequest();
    }
}
