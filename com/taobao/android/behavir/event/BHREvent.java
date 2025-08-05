package com.taobao.android.behavir.event;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavix.j;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.taolive.room.utils.aw;
import java.util.Map;
import tb.drp;
import tb.dsp;
import tb.kge;

/* loaded from: classes4.dex */
public class BHREvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionArgs;
    public JSONObject actionArgsJSON;
    public long actionDuration;
    public String actionName;
    public String actionType;
    public Map<String, Object> bizArgKVMapObject;
    public String bizArgs;
    public Map<String, String> bizArgsMap;
    public String bizId;
    public boolean cacheAbleOnInit;
    public long createTime;
    public int destroy;
    public String fromScene;
    private boolean isExcludeToHistoryEventList;
    public int isFirstEnter;
    public String itemId;
    private dsp mMatchModel;
    public String periodSessionId;
    public String reserve1;
    public String reserve2;
    public String scene;
    public long seqId;
    public String sessionId;
    public String toScene;
    public long updateTime;
    public String userId;

    static {
        kge.a(589674754);
    }

    public BHREvent(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, false);
    }

    private BHREvent(String str, String str2, String str3, String str4, boolean z) {
        this.seqId = -1L;
        this.sessionId = "";
        this.bizId = "";
        this.scene = "";
        this.createTime = 0L;
        this.updateTime = 0L;
        this.userId = "";
        this.actionType = "";
        this.actionName = "";
        this.actionDuration = 0L;
        this.fromScene = "";
        this.toScene = "";
        this.reserve1 = null;
        this.reserve2 = null;
        this.periodSessionId = null;
        this.bizArgsMap = null;
        this.bizArgs = null;
        this.itemId = null;
        this.isFirstEnter = 0;
        this.destroy = 0;
        this.bizArgKVMapObject = null;
        this.mMatchModel = null;
        this.isExcludeToHistoryEventList = false;
        this.scene = str;
        this.actionName = str2;
        this.actionType = str4;
        this.sessionId = Utils.a(str3);
        this.cacheAbleOnInit = z;
        this.createTime = System.currentTimeMillis();
    }

    public BHREvent() {
        this.seqId = -1L;
        this.sessionId = "";
        this.bizId = "";
        this.scene = "";
        this.createTime = 0L;
        this.updateTime = 0L;
        this.userId = "";
        this.actionType = "";
        this.actionName = "";
        this.actionDuration = 0L;
        this.fromScene = "";
        this.toScene = "";
        this.reserve1 = null;
        this.reserve2 = null;
        this.periodSessionId = null;
        this.bizArgsMap = null;
        this.bizArgs = null;
        this.itemId = null;
        this.isFirstEnter = 0;
        this.destroy = 0;
        this.bizArgKVMapObject = null;
        this.mMatchModel = null;
        this.isExcludeToHistoryEventList = false;
    }

    public BHREvent(drp drpVar) {
        this.seqId = -1L;
        this.sessionId = "";
        this.bizId = "";
        this.scene = "";
        this.createTime = 0L;
        this.updateTime = 0L;
        this.userId = "";
        this.actionType = "";
        this.actionName = "";
        this.actionDuration = 0L;
        this.fromScene = "";
        this.toScene = "";
        this.reserve1 = null;
        this.reserve2 = null;
        this.periodSessionId = null;
        this.bizArgsMap = null;
        this.bizArgs = null;
        this.itemId = null;
        this.isFirstEnter = 0;
        this.destroy = 0;
        this.bizArgKVMapObject = null;
        this.mMatchModel = null;
        this.isExcludeToHistoryEventList = false;
        assign(drpVar);
    }

    private void assign(drp drpVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b20984", new Object[]{this, drpVar});
            return;
        }
        this.seqId = drpVar.f26928a;
        this.sessionId = drpVar.b;
        this.bizId = drpVar.c;
        this.scene = drpVar.d;
        this.createTime = drpVar.e;
        this.updateTime = drpVar.f;
        this.userId = drpVar.g;
        this.actionType = drpVar.h;
        this.actionName = drpVar.i;
        this.actionArgs = drpVar.k;
        this.actionDuration = drpVar.j;
        this.fromScene = drpVar.m;
        this.toScene = drpVar.n;
        this.reserve1 = drpVar.o;
        this.reserve2 = drpVar.p;
        this.periodSessionId = drpVar.q;
        this.bizArgs = drpVar.l;
        this.bizArgsMap = j.b(j.a(drpVar.l).split(","));
        this.bizArgKVMapObject = drpVar.v;
        this.actionArgsJSON = drpVar.r;
        this.isFirstEnter = drpVar.s ? 1 : 0;
        this.sessionId = drpVar.b;
        if (drpVar.r == null || !drpVar.r.getBooleanValue("destroy")) {
            i = 0;
        }
        this.destroy = i;
        this.itemId = getItemId(this.bizArgsMap);
        addBrMark();
    }

    public JSONObject toJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f8765c9", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject(32);
        jSONObject.put("seqId", (Object) Long.valueOf(this.seqId));
        jSONObject.put("sessionId", (Object) this.sessionId);
        jSONObject.put("bizId", (Object) this.bizId);
        jSONObject.put("scene", (Object) this.scene);
        jSONObject.put("createTime", (Object) Long.valueOf(this.createTime));
        jSONObject.put(StWindow.UPDATE_TIME, (Object) Long.valueOf(this.updateTime));
        jSONObject.put("userId", (Object) this.userId);
        jSONObject.put("actionType", (Object) this.actionType);
        jSONObject.put("actionName", (Object) this.actionName);
        jSONObject.put("actionDuration", (Object) Long.valueOf(this.actionDuration));
        jSONObject.put(e.ACTION_ARGS, (Object) this.actionArgs);
        jSONObject.put("fromScene", (Object) this.fromScene);
        jSONObject.put("toScene", (Object) this.toScene);
        jSONObject.put("actionArgsJSON", (Object) this.actionArgsJSON);
        jSONObject.put("destroy", (Object) Integer.valueOf(this.destroy));
        jSONObject.put(aw.PARAM_IS_FIRST_ENTER, (Object) Integer.valueOf(this.isFirstEnter));
        jSONObject.put("cacheAbleOnInit", (Object) Boolean.valueOf(this.cacheAbleOnInit));
        Map<String, Object> map = this.bizArgKVMapObject;
        if (map != null && !map.isEmpty()) {
            jSONObject.put("bizArgsMap", (Object) this.bizArgKVMapObject);
        } else {
            jSONObject.put("bizArgsMap", (Object) this.bizArgsMap);
        }
        return jSONObject;
    }

    private String getItemId(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c56dd8c6", new Object[]{this, map}) : map != null ? map.get("item_id") : "";
    }

    public void addBrMark() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e413cc5", new Object[]{this});
            return;
        }
        Map map = this.bizArgKVMapObject;
        if (map == null) {
            map = this.bizArgsMap;
        }
        if (map == null) {
            return;
        }
        map.put("br_destroy", String.valueOf(this.destroy != 0));
        if (this.isFirstEnter != 0) {
            z = true;
        }
        map.put("br_isFirstEnter", String.valueOf(z));
        map.put("br_fromScene", this.fromScene);
        map.put("br_toScene", this.toScene);
        if (this instanceof BHRScrollEvent) {
            if (getScrollDuration(this.actionArgsJSON) == 0) {
                map.put("br_scrollType", "scrollStart");
            } else {
                map.put("br_scrollType", "scrollEnd");
            }
        }
        map.put("br_editionCode", com.taobao.android.behavir.util.c.a());
    }

    private long getScrollDuration(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e4a2926", new Object[]{this, jSONObject})).longValue();
        }
        if (jSONObject != null) {
            return jSONObject.getLongValue("scrollDuration");
        }
        return 0L;
    }

    public dsp getMatchModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsp) ipChange.ipc$dispatch("aebc95e4", new Object[]{this});
        }
        if (this.mMatchModel == null) {
            this.mMatchModel = genMatchModel();
        }
        return this.mMatchModel;
    }

    public dsp genMatchModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dsp) ipChange.ipc$dispatch("879a362a", new Object[]{this});
        }
        dsp dspVar = new dsp();
        dspVar.f26946a = this.scene;
        dspVar.c = this.actionName;
        dspVar.b = this.actionType;
        dspVar.g = this.bizArgKVMapObject;
        return dspVar;
    }

    public static BHREvent buildInternalEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHREvent) ipChange.ipc$dispatch("7623363", new Object[]{str, str2, str3}) : buildInternalEvent(str, str2, str3, false);
    }

    public static BHREvent buildInternalEvent(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHREvent) ipChange.ipc$dispatch("37b9cccf", new Object[]{str, str2, str3, new Boolean(z)}) : new BHREvent(str, str2, str3, "internal", z);
    }

    public boolean isExcludeToHistoryEventList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8eb7db3a", new Object[]{this})).booleanValue() : this.isExcludeToHistoryEventList;
    }

    public void setExcludeToHistoryEventList(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4557b96", new Object[]{this, new Boolean(z)});
        } else {
            this.isExcludeToHistoryEventList = z;
        }
    }

    public boolean isInitEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfa5ddeb", new Object[]{this})).booleanValue() : "sdkInit".equals(this.actionName) && "internal".equals(this.actionType);
    }

    public boolean isColdStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4992905f", new Object[]{this})).booleanValue() : "internal".equals(this.actionType) && "coldStart".equals(this.actionName);
    }
}
