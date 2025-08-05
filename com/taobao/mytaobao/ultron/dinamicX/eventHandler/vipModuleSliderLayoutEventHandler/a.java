package com.taobao.mytaobao.ultron.dinamicX.eventHandler.vipModuleSliderLayoutEventHandler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.mytaobao.basement.monitor.b;
import com.taobao.mytaobao.ut.c;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.mtz;
import tb.mwv;

/* loaded from: classes7.dex */
public class a extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_MTBVIPSLIDERLAYOUTHANDLER = -7015569066931863254L;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, VipModulePageUTBean> f18496a = new ConcurrentHashMap();
    private DMComponent b;
    private JSONObject c;

    static {
        kge.a(75169454);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        b.a().a("DXMtbVipSliderLayoutEventHandler");
        if (objArr == null || objArr.length <= 0 || dXRuntimeContext == null) {
            return;
        }
        String str = (String) objArr[0];
        DXSliderLayout dXSliderLayout = (DXSliderLayout) dXRuntimeContext.d();
        if ("onAppear".equals(str)) {
            dXSliderLayout.startTimer();
        } else if ("onDisAppear".equals(str)) {
            dXSliderLayout.stopTimer();
        } else if (!"onPageChange".equals(str) || !(dXEvent instanceof DXPageChangeEvent)) {
        } else {
            int i = ((DXPageChangeEvent) dXEvent).pageIndex;
            synchronized (this.f18496a) {
                VipModulePageUTBean vipModulePageUTBean = this.f18496a.get(Integer.valueOf(i));
                if (vipModulePageUTBean != null && !vipModulePageUTBean.hasExposure) {
                    TBS.Ext.commitEvent(vipModulePageUTBean.page, 2201, vipModulePageUTBean.arg1, null, null, c.a(vipModulePageUTBean.args));
                    a(vipModulePageUTBean);
                }
            }
        }
    }

    private void a(VipModulePageUTBean vipModulePageUTBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae398d0d", new Object[]{this, vipModulePageUTBean});
        } else {
            vipModulePageUTBean.hasExposure = true;
        }
    }

    public void a(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9411d260", new Object[]{this, dMComponent});
            return;
        }
        b(dMComponent);
        c(dMComponent);
    }

    private void b(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fee97f", new Object[]{this, dMComponent});
            return;
        }
        this.b = dMComponent;
        this.c = new JSONObject();
        this.c.putAll(this.b.getFields());
        synchronized (this.f18496a) {
            this.f18496a.clear();
        }
    }

    private void c(final DMComponent dMComponent) {
        VipModulePageUTBean vipModulePageUTBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adec009e", new Object[]{this, dMComponent});
            return;
        }
        JSONObject events = dMComponent.getEvents();
        if (events == null) {
            return;
        }
        int i = -1;
        final HashMap hashMap = new HashMap();
        while (true) {
            i++;
            String concat = "openVipCenterLoop_".concat(String.valueOf(i));
            if (events.containsKey(concat)) {
                JSONArray a2 = mwv.a(events, concat);
                if (a2 != null) {
                    Iterator<Object> it = a2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof JSONObject) {
                                JSONObject jSONObject = (JSONObject) next;
                                if ("userTrack".equals(jSONObject.getString("tag")) && (vipModulePageUTBean = (VipModulePageUTBean) JSONObject.toJavaObject(jSONObject.getJSONObject("fields"), VipModulePageUTBean.class)) != null) {
                                    a(vipModulePageUTBean, i);
                                    b(vipModulePageUTBean.m1193clone(), i);
                                    a(vipModulePageUTBean.m1193clone(), a2, hashMap);
                                    break;
                                }
                            }
                        }
                    }
                }
            } else {
                mtz.a(new Runnable() { // from class: com.taobao.mytaobao.ultron.dinamicX.eventHandler.vipModuleSliderLayoutEventHandler.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        for (Map.Entry entry : hashMap.entrySet()) {
                            JSONArray jSONArray = (JSONArray) entry.getKey();
                            JSONObject jSONObject2 = (JSONObject) entry.getValue();
                            if (jSONArray != null && jSONObject2 != null) {
                                jSONArray.add(jSONObject2);
                            }
                        }
                        JSONObject data = dMComponent.getData();
                        if (data == null) {
                            return;
                        }
                        dMComponent.writeBackDataAndReloadEvent(data, true);
                    }
                });
                return;
            }
        }
    }

    private void a(VipModulePageUTBean vipModulePageUTBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f88796", new Object[]{this, vipModulePageUTBean, new Integer(i)});
            return;
        }
        JSONObject jSONObject = vipModulePageUTBean.args;
        if (jSONObject == null) {
            return;
        }
        jSONObject.put("spm", (Object) "a2113w.27227112.6391534620.1");
        jSONObject.put("scm", (Object) "20140623.1.2.33");
        jSONObject.put("index", (Object) String.valueOf(i));
    }

    private void b(VipModulePageUTBean vipModulePageUTBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59739d35", new Object[]{this, vipModulePageUTBean, new Integer(i)});
            return;
        }
        vipModulePageUTBean.arg1 = "mytao_membercenter_exp";
        this.f18496a.put(Integer.valueOf(i), vipModulePageUTBean);
    }

    private void a(VipModulePageUTBean vipModulePageUTBean, JSONArray jSONArray, Map<JSONArray, JSONObject> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6a98b0", new Object[]{this, vipModulePageUTBean, jSONArray, map});
            return;
        }
        vipModulePageUTBean.arg1 = "mytao_membercenter_click";
        JSONObject jSONObject = (JSONObject) JSONObject.toJSON(vipModulePageUTBean);
        if (jSONObject == null) {
            return;
        }
        jSONObject.remove(VipModulePageUTBean.K_HAS_EXPOSURE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tag", "userTrack");
        jSONObject2.put("type", "userTrack");
        jSONObject2.put("fields", (Object) jSONObject);
        map.put(jSONArray, jSONObject2);
    }
}
