package com.taobao.mmad.data;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.home.component.utils.h;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.HashMap;
import java.util.List;
import tb.iwf;
import tb.kge;
import tb.stv;
import tb.tiq;
import tb.tjc;
import tb.tjj;
import tb.tjk;
import tb.tjo;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f18110a;
    private JSONObject b;
    private JSONObject c;
    private JSONObject d;
    private JSONObject e;
    private JSONObject f;
    private JSONObject g;
    private tiq h;
    private c i;
    private b j = new b();
    private BaseMmAdModel k;
    private JSONObject l;

    static {
        kge.a(-1430527848);
    }

    public a(tiq tiqVar) {
        this.h = tiqVar;
        this.i = new c(tiqVar);
    }

    private void a(List<JSONObject> list) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject3 = list.get(i);
                    if (jSONObject3 == null) {
                        stv.a("DataEngine", "dataJson in for-each null");
                    } else {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("subSection");
                        if (jSONObject4 != null && (jSONObject = jSONObject4.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) != null && (jSONObject2 = jSONObject.getJSONObject("bizData")) != null && i > 0 && jSONObject2.containsKey("launchCnt")) {
                            AppMonitor.Alarm.commitFail("Page_Topshow", "ad_choose", "101", "adMustShowNotInFirst");
                            stv.a("DataEngine", "launchCnt checkIsLaunchCntDataFirst alarm appMonitor " + i);
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                stv.a("DataEngine", "checkIsLaunchCntDataFirst error", th);
            }
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return true;
        }
        if (!jSONObject.containsKey("launchCnt")) {
            stv.a("DataEngine", "launchCnt isLaunchCntLegal: ");
            return true;
        }
        int c = tjc.c();
        String string = jSONObject.getString("launchCnt");
        stv.a("DataEngine", " launchCnt contain json launchCountStr =" + string + ", applaunchCount=" + c);
        if (TextUtils.isEmpty(string)) {
            stv.a("DataEngine", " launchCnt parse: launchCountStr is null");
            return false;
        } else if (!string.contains(String.valueOf(c))) {
            stv.a("DataEngine", " launchCnt launchCount check fail launchCountData=" + string + ",applaunchCount=" + c);
            return false;
        } else {
            stv.a("DataEngine", "parse: launchCnt bizData contain launchCnt.");
            return true;
        }
    }

    public void a(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a074ca", new Object[]{this, list, new Integer(i)});
        } else if (list == null) {
        } else {
            a(list);
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            stv.a("DataEngine", "parse start data size=" + size);
            while (true) {
                if (i2 >= size) {
                    break;
                }
                JSONObject jSONObject = list.get(i2);
                if (jSONObject == null) {
                    stv.a("DataEngine", "dataJson in for-each null");
                } else {
                    this.b = null;
                    JSONObject jSONObject2 = jSONObject.getJSONObject("subSection");
                    if (jSONObject2 != null) {
                        this.c = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH);
                        if (this.c != null) {
                            this.l = jSONObject2.getJSONObject("feeds");
                            iwf.a(this.l);
                            this.f = this.c.getJSONObject(h.TRACK_EXPOSURE_PARAM);
                            this.d = this.c.getJSONObject("bizData");
                            JSONObject jSONObject3 = this.d;
                            if (jSONObject3 != null) {
                                if (!a(jSONObject3)) {
                                    j();
                                } else {
                                    sb.append(this.d.getString("creativeId"));
                                    if (list.indexOf(jSONObject) != size - 1) {
                                        sb.append(",");
                                    }
                                }
                            }
                            JSONObject jSONObject4 = this.c.getJSONObject("subSection");
                            if (jSONObject4 != null && jSONObject4.getJSONObject("interactExpo") != null) {
                                this.g = jSONObject4.getJSONObject("interactExpo").getJSONObject(h.TRACK_EXPOSURE_PARAM);
                            }
                            JSONObject jSONObject5 = this.c.getJSONObject("item");
                            if (jSONObject5 == null) {
                                j();
                            } else {
                                String str = "0";
                                JSONObject jSONObject6 = jSONObject5.getJSONObject(str);
                                if (jSONObject6 == null) {
                                    j();
                                } else {
                                    this.e = jSONObject6.getJSONObject("clickParam");
                                    this.b = jSONObject6.getJSONObject("content");
                                    JSONObject jSONObject7 = this.b;
                                    if (jSONObject7 == null) {
                                        stv.a("DataEngine", "content null");
                                        j();
                                    } else {
                                        boolean equals = jSONObject7.containsKey("verifyData") ? "true".equals(this.b.getString("verifyData")) : true;
                                        boolean f = tjc.f();
                                        stv.a("DataEngine", "parse: CheckDXBeforeShow=" + f);
                                        if (tjj.a(this.h) && f && equals) {
                                            this.h.g().b().e();
                                            DXTemplateItem c = tjk.c(this.c);
                                            if (c == null) {
                                                stv.a("DataEngine", "parse: CheckDXBeforeShow templateItem is null");
                                                j();
                                            } else if (this.h.g().b().a(c) == null) {
                                                stv.a("DataEngine", "parse: CheckDXBeforeShow fetchTemplate is null");
                                                j();
                                            }
                                        }
                                        this.b.put(h.TRACK_EXPOSURE_PARAM, (Object) this.f);
                                        this.b.put("targetUrl", jSONObject6.get("targetUrl"));
                                        this.f18110a = jSONObject;
                                        this.k = this.j.a(this.b);
                                        BaseMmAdModel baseMmAdModel = this.k;
                                        if (baseMmAdModel == null) {
                                            stv.a("DataEngine", "parse: adModel is null");
                                            j();
                                        } else {
                                            baseMmAdModel.setDataType(this.j.b(jSONObject2));
                                            this.k.setTargetUrl(jSONObject6.getString("targetUrl"));
                                            if (equals && !this.i.a(this, i)) {
                                                stv.a("DataEngine", "verifyResult failed");
                                                j();
                                            } else {
                                                boolean a2 = this.h.a().a(jSONObject, i);
                                                stv.a("DataEngine", "shouldShow=" + a2);
                                                HashMap hashMap = new HashMap();
                                                if (a2) {
                                                    str = "1";
                                                }
                                                hashMap.put("shouldShow", str);
                                                tjo.a(tjo.ARG1_SHOULD_SHOW_RESULT, this.k, hashMap);
                                                if (a2) {
                                                    this.k.sceneType = tiq.BIZ_CODE;
                                                    stv.a("DataEngine", "parse end ShouldShow success. " + i2);
                                                    break;
                                                }
                                                j();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("createid_ids", sb.toString());
            BaseMmAdModel baseMmAdModel2 = this.k;
            hashMap2.put("selected_id", baseMmAdModel2 == null ? "" : baseMmAdModel2.getCreativeId());
            tjo.a(tjo.ARG1_CHOOSE_RESULT, this.k, hashMap2);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.f18110a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.k = null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.i.a().a();
        }
    }

    public BaseMmAdModel b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseMmAdModel) ipChange.ipc$dispatch("72076373", new Object[]{this}) : this.k;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.c;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.d;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this}) : this.b;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.e;
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this}) : this.g;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.l;
    }
}
