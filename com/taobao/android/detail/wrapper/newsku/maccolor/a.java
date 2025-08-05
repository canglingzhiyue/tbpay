package com.taobao.android.detail.wrapper.newsku.maccolor;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.utils.f;
import java.util.Map;
import tb.kge;
import tb.rgu;
import tb.rgw;
import tb.rgy;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VESSEL_METHOD_CLOSE_PAGE = "close_page";
    public static final String VESSEL_METHOD_CLOSE_PAGE_ANDROID = "close_page_android";
    public static final String VESSEL_METHOD_MAP_KEY = "method";
    public static final String VESSEL_METHOD_NAME_GET_DETAIL_MAC_DATA = "get_detail_mac_data";
    public static final String VESSEL_METHOD_NAME_SET_DETAIL_MAC_VID = "set_detail_mac_vid";

    /* renamed from: a  reason: collision with root package name */
    private Context f11424a;
    private JSONObject b;

    /* renamed from: com.taobao.android.detail.wrapper.newsku.maccolor.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0452a {
        void a(String str);
    }

    static {
        kge.a(761245654);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ecd9c8", new Object[]{aVar});
        } else {
            aVar.b();
        }
    }

    public static /* synthetic */ void a(a aVar, InterfaceC0452a interfaceC0452a, Map map, com.taobao.vessel.base.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4044920", new Object[]{aVar, interfaceC0452a, map, aVar2});
        } else {
            aVar.a(interfaceC0452a, map, aVar2);
        }
    }

    public a(Context context) {
        this.f11424a = context;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public void a(String str, InterfaceC0452a interfaceC0452a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda724e1", new Object[]{this, str, interfaceC0452a});
            return;
        }
        SkuScreenVesselFragment newInstance = SkuScreenVesselFragment.newInstance();
        if (newInstance == null) {
            return;
        }
        newInstance.loadUrl(str);
        newInstance.setOnLoadListener(a(interfaceC0452a));
        newInstance.setVesselCallback(b(interfaceC0452a));
        newInstance.show(((FragmentActivity) this.f11424a).getSupportFragmentManager(), "SkuFullScreenVesselFragment");
    }

    private rgu a(InterfaceC0452a interfaceC0452a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rgu) ipChange.ipc$dispatch("1f528b5b", new Object[]{this, interfaceC0452a}) : new rgu() { // from class: com.taobao.android.detail.wrapper.newsku.maccolor.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                }
            }

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                }
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                } else {
                    onDowngrade(null, null);
                }
            }

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                    return;
                }
                f.a("MacColorSelectVesselHodler", "发生降级，关闭DetailFullScreenVesselFragment");
                a.a(a.this);
            }
        };
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SkuScreenVesselFragment c = c();
        if (c == null) {
            return;
        }
        c.dismiss();
    }

    private rgw b(final InterfaceC0452a interfaceC0452a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rgw) ipChange.ipc$dispatch("fb14075a", new Object[]{this, interfaceC0452a}) : new rgw() { // from class: com.taobao.android.detail.wrapper.newsku.maccolor.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgw
            public void a(Map<String, Object> map, com.taobao.vessel.base.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                } else {
                    a.a(a.this, interfaceC0452a, map, aVar);
                }
            }
        };
    }

    private void a(InterfaceC0452a interfaceC0452a, Map<String, Object> map, com.taobao.vessel.base.a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ac5bc0", new Object[]{this, interfaceC0452a, map, aVar});
        } else if (map == null || !map.containsKey("method") || (obj = map.get("method")) == null || !(obj instanceof String)) {
        } else {
            String str = (String) obj;
            char c = 65535;
            switch (str.hashCode()) {
                case -2061682570:
                    if (str.equals("close_page")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1054326874:
                    if (str.equals(VESSEL_METHOD_CLOSE_PAGE_ANDROID)) {
                        c = 3;
                        break;
                    }
                    break;
                case -574727713:
                    if (str.equals(VESSEL_METHOD_NAME_GET_DETAIL_MAC_DATA)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1732795568:
                    if (str.equals(VESSEL_METHOD_NAME_SET_DETAIL_MAC_VID)) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a(aVar);
            } else if (c == 1) {
                interfaceC0452a.a((String) map.get("value"));
            } else if (c != 2 && c != 3) {
            } else {
                b();
            }
        }
    }

    private void a(com.taobao.vessel.base.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8004a26e", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            aVar.invoke(a());
        }
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.b;
        return jSONObject2 != null ? jSONObject2.getJSONObject("macSKUInfos") : jSONObject;
    }

    private SkuScreenVesselFragment c() {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuScreenVesselFragment) ipChange.ipc$dispatch("b568d69c", new Object[]{this});
        }
        Context context = this.f11424a;
        if (context != null && (context instanceof FragmentActivity) && (findFragmentByTag = ((FragmentActivity) context).getSupportFragmentManager().findFragmentByTag("SkuFullScreenVesselFragment")) != null && (findFragmentByTag instanceof SkuScreenVesselFragment)) {
            return (SkuScreenVesselFragment) findFragmentByTag;
        }
        return null;
    }
}
