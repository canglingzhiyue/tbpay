package com.taobao.android.detail.ttdetail.request.params;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.component.c;
import com.taobao.android.detail.ttdetail.utils.aa;
import com.taobao.android.detail.ttdetail.utils.ao;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.n;
import com.taobao.android.detail.ttdetail.utils.x;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.noa;
import tb.odg;

/* loaded from: classes5.dex */
public class MainRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COUNTRY_CODE = "countryCode";
    public static final String CPU_CORE = "cpuCore";
    public static final String CPU_MAX_HZ = "cpuMaxHz";
    private static final String FATIGUE = "fatigue";
    public static final String INDUSTRY = "industry";
    private static final String INDUSTRY_MAIN_PIC_DEGRADE = "industryMainPicDegrade";
    private static final String K_EXPARAMS = "exParams";
    private static final String K_ITEM_ID = "itemNumId";
    private static final String K_SERVER_DETECTED_ITEM_ID = "item_id";
    private static final String LATITUDE = "latitude";
    private static final String LIVE_SHOW_AUTO_PLAY = "liveAutoPlay";
    private static final String LONGITUDE = "longitude";
    private static final int MAX_REQUEST_PARAMS_LENGTH = 6000;
    public static final String NICK = "nick";
    public static final String OPEN_FROM = "openFrom";
    private static final String PRELOAD_V = "preload_v";
    public static final String UTDID = "utdid";
    private static final String VALUE_FALSE = "false";
    private Map<String, String> mExParams;
    private a mQueryParams;

    static {
        kge.a(2061069030);
        kge.a(395113271);
    }

    public MainRequestParams(Intent intent) {
        this(new a(intent));
    }

    public MainRequestParams(a aVar) {
        this.mQueryParams = aVar;
        this.mExParams = buildExParams();
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        removeUselessExParams();
        return JSON.toJSONString(buildParams());
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.mQueryParams.h();
    }

    public void removeUselessExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2fb8bc", new Object[]{this});
        } else {
            this.mExParams.remove(com.taobao.android.detail.ttdetail.constant.a.KEY_NAV);
        }
    }

    public Map<String, String> buildParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dac8310", new Object[]{this});
        }
        String itemId = getItemId();
        String str = this.mExParams.get(DetailCoreActivity.DETAIL_ITEM_ID);
        if (str != null) {
            itemId = str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("detail_v", "3.3.2");
        if (itemId != null) {
            hashMap.put("itemNumId", itemId);
        }
        if (this.mExParams.isEmpty()) {
            return hashMap;
        }
        try {
            this.mExParams.put(noa.KEY_LOC_TYPE, JSON.parseObject(String.valueOf(this.mExParams.get("params"))).getString(noa.KEY_LOC_TYPE));
        } catch (Exception unused) {
        }
        try {
            this.mExParams.put("pvStr", JSON.parseObject(String.valueOf(this.mExParams.get("params"))).getString("pvStr"));
        } catch (Exception unused2) {
        }
        this.mExParams.put("item_id", itemId);
        if (j.am()) {
            c.ComponentFatigueContainer.a(true);
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = c.ComponentFatigueContainer.a(getDetailToken());
            if (!StringUtils.isEmpty(a2)) {
                this.mExParams.put("fatigue", a2);
            }
            av.a(getDetailToken(), c.GENERATE_FATIGUE_PARAMS_COST, System.currentTimeMillis() - currentTimeMillis);
        } else {
            c.ComponentFatigueContainer.a(false);
        }
        hashMap.put("exParams", JSON.toJSONString(this.mExParams));
        return hashMap;
    }

    private Map<String, String> buildExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f49e9f63", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.mQueryParams.a());
        hashMap.put("item_id", getItemId());
        Application a2 = f.a();
        appendCommonParams(a2, hashMap);
        appendBizParams(a2, hashMap);
        return hashMap;
    }

    public Map<String, String> getExParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5151964b", new Object[]{this}) : this.mExParams;
    }

    public String getDetailToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5d35747", new Object[]{this}) : this.mQueryParams.f();
    }

    public void updateRefreshParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88f7726", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.mExParams.putAll(map);
        }
    }

    private void appendBizParams(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e2ac43", new Object[]{this, context, map});
            return;
        }
        map.put(LIVE_SHOW_AUTO_PLAY, String.valueOf(n.b(context)));
        map.put(INDUSTRY_MAIN_PIC_DEGRADE, "false");
        map.put(PRELOAD_V, "industry");
    }

    private void appendCommonParams(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9435934f", new Object[]{this, context, map});
            return;
        }
        map.put("openFrom", odg.s().b());
        map.put("utdid", UTDevice.getUtdid(context));
        String b = ao.b();
        if (!StringUtils.isEmpty(b)) {
            map.put("nick", b);
        }
        setCpuInfo(map);
        setupPositionInfo(context, map);
        map.putAll(x.a());
    }

    private void setCpuInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77863ea", new Object[]{this, map});
            return;
        }
        aa.a a2 = aa.a();
        map.put(CPU_CORE, a2.f10956a);
        map.put(CPU_MAX_HZ, a2.b);
    }

    private void setupPositionInfo(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f575ad8", new Object[]{this, context, map});
            return;
        }
        map.put("longitude", odg.e().b(context));
        map.put("latitude", odg.e().c(context));
        String a2 = odg.e().a(context);
        if (a2 == null) {
            return;
        }
        map.put(COUNTRY_CODE, a2);
    }
}
