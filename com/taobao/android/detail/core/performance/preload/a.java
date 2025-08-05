package com.taobao.android.detail.core.performance.preload;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.datasdk.model.datamodel.node.DetailOptNode;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9787a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-1590801206);
        emu.a("com.taobao.android.detail.core.performance.preload.DetailCacheEntity");
    }

    public static a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ff8fc206", new Object[]{jSONObject});
        }
        a aVar = new a();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                aVar.f9787a = "";
                return aVar;
            }
            JSONArray jSONArray = jSONObject2.getJSONArray("apiStack");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("data");
                if (jSONObject3 == null) {
                    jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("value");
                }
                if (jSONObject3 == null) {
                    aVar.f9787a = "";
                    return aVar;
                }
                JSONObject jSONObject4 = jSONObject3.getJSONObject("global");
                if (jSONObject4 == null) {
                    aVar.f9787a = "";
                    return aVar;
                }
                JSONObject jSONObject5 = jSONObject4.getJSONObject("data");
                if (jSONObject5 == null) {
                    aVar.f9787a = "";
                    return aVar;
                }
                JSONObject jSONObject6 = jSONObject5.getJSONObject(DetailOptNode.TAG);
                if (jSONObject6 == null) {
                    JSONObject jSONObject7 = jSONObject5.getJSONObject("feature");
                    if (jSONObject7 != null && !jSONObject7.isEmpty()) {
                        z = jSONObject7.getBooleanValue("finalUltron");
                    }
                    aVar.f9787a = z ? c.FINAL_ULTRON : "2.0";
                    return aVar;
                }
                aVar.f9787a = jSONObject6.getString("detailVersion");
                aVar.c = jSONObject6.getString("cacheTimeToLive");
                aVar.d = jSONObject6.getString("industryFailReason");
                return aVar;
            }
            aVar.f9787a = "";
            return aVar;
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(l.a("PreloadProtocolBean"), "parserProtocolVersion error", e);
            return aVar;
        }
    }

    public static a b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c5ba4ac7", new Object[]{jSONObject});
        }
        a aVar = new a();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 == null) {
                aVar.f9787a = "";
                return aVar;
            }
            JSONObject c = c(jSONObject2);
            if (c == null) {
                aVar.f9787a = "";
                return aVar;
            }
            JSONObject jSONObject3 = c.getJSONObject("global");
            if (jSONObject3 == null) {
                aVar.f9787a = "";
                return aVar;
            }
            JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
            if (jSONObject4 == null) {
                aVar.f9787a = "";
                return aVar;
            }
            JSONObject jSONObject5 = jSONObject4.getJSONObject("feature");
            if (jSONObject5 != null && !jSONObject5.isEmpty()) {
                String str = jSONObject5.getBooleanValue("finalUltron") ? c.FINAL_ULTRON : "2.0";
                if (c.FINAL_ULTRON.equals(str)) {
                    if (jSONObject5.getBooleanValue("detail3HeadPic")) {
                        JSONObject jSONObject6 = c.getJSONObject("model");
                        if (jSONObject6 == null) {
                            aVar.f9787a = "";
                            return aVar;
                        }
                        JSONObject jSONObject7 = jSONObject6.getJSONObject("headerPic");
                        if (jSONObject7 == null) {
                            aVar.f9787a = "";
                            return aVar;
                        }
                        JSONArray jSONArray = jSONObject7.getJSONArray("groups");
                        if (jSONArray != null && !jSONArray.isEmpty()) {
                            JSONObject jSONObject8 = jSONArray.getJSONObject(0);
                            if (jSONObject8 == null) {
                                aVar.f9787a = "";
                                return aVar;
                            }
                            JSONArray jSONArray2 = jSONObject8.getJSONArray("items");
                            if (jSONArray2 == null) {
                                aVar.f9787a = "";
                                return aVar;
                            }
                            JSONObject jSONObject9 = jSONArray2.getJSONObject(0);
                            if (jSONObject9 == null) {
                                aVar.f9787a = "";
                                return aVar;
                            }
                            JSONObject jSONObject10 = jSONObject9.getJSONObject("content");
                            if (jSONObject10 == null) {
                                aVar.f9787a = "";
                                return aVar;
                            }
                            JSONObject jSONObject11 = jSONObject10.getJSONObject("fields");
                            if (jSONObject11 == null) {
                                aVar.f9787a = "";
                                return aVar;
                            }
                            String string = jSONObject11.getString("type");
                            if ("image".equals(string)) {
                                aVar.b = com.taobao.android.detail.ttdetail.utils.l.a(jSONObject11.getString("url"));
                            } else if ("video".equals(string)) {
                                aVar.b = com.taobao.android.detail.ttdetail.utils.l.a(jSONObject11.getString("thumbnailUrl"));
                            }
                        }
                        aVar.f9787a = "";
                        return aVar;
                    }
                    JSONObject jSONObject12 = c.getJSONObject("hierarchy");
                    if (jSONObject12 == null) {
                        aVar.f9787a = "";
                        return aVar;
                    }
                    JSONObject jSONObject13 = jSONObject12.getJSONObject("structure");
                    if (jSONObject13 == null) {
                        aVar.f9787a = "";
                        return aVar;
                    }
                    JSONArray jSONArray3 = jSONObject13.getJSONArray("detailInfoAura");
                    if (jSONArray3 != null && !jSONArray3.isEmpty()) {
                        JSONArray jSONArray4 = jSONObject13.getJSONArray(jSONArray3.getString(0));
                        if (jSONArray4 != null && !jSONArray4.isEmpty()) {
                            JSONArray jSONArray5 = jSONObject13.getJSONArray(jSONArray4.getString(0));
                            if (jSONArray5 != null && !jSONArray5.isEmpty()) {
                                JSONArray jSONArray6 = jSONObject13.getJSONArray(jSONArray5.getString(0));
                                if (jSONArray6 != null && !jSONArray6.isEmpty()) {
                                    JSONArray jSONArray7 = jSONObject13.getJSONArray(jSONArray6.getString(0));
                                    if (jSONArray7 != null && !jSONArray7.isEmpty()) {
                                        JSONArray jSONArray8 = jSONObject13.getJSONArray(jSONArray7.getString(0));
                                        if (jSONArray8 != null && !jSONArray8.isEmpty()) {
                                            JSONArray jSONArray9 = jSONObject13.getJSONArray(jSONArray8.getString(0));
                                            if (jSONArray9 != null && !jSONArray9.isEmpty()) {
                                                String string2 = jSONArray9.getString(0);
                                                JSONObject jSONObject14 = c.getJSONObject("data");
                                                if (jSONObject14 == null) {
                                                    aVar.f9787a = "";
                                                    return aVar;
                                                }
                                                JSONObject jSONObject15 = jSONObject14.getJSONObject(string2);
                                                if (jSONObject15 == null) {
                                                    aVar.f9787a = "";
                                                    return aVar;
                                                }
                                                JSONObject jSONObject16 = jSONObject15.getJSONObject("fields");
                                                if (jSONObject16 == null) {
                                                    return null;
                                                }
                                                if ("video".equals(jSONObject16.getString("type"))) {
                                                    aVar.b = jSONObject16.getString("thumbnailUrl");
                                                } else {
                                                    aVar.b = jSONObject16.getString("url");
                                                }
                                            }
                                            aVar.f9787a = "";
                                            return aVar;
                                        }
                                        aVar.f9787a = "";
                                        return aVar;
                                    }
                                    aVar.f9787a = "";
                                    return aVar;
                                }
                                aVar.f9787a = "";
                                return aVar;
                            }
                            aVar.f9787a = "";
                            return aVar;
                        }
                        aVar.f9787a = "";
                        return aVar;
                    }
                    aVar.f9787a = "";
                    return aVar;
                }
                JSONObject jSONObject17 = jSONObject4.getJSONObject(DetailOptNode.TAG);
                if (jSONObject17 == null) {
                    aVar.f9787a = str;
                    return aVar;
                }
                aVar.f9787a = jSONObject17.getString("detailVersion");
                aVar.c = jSONObject17.getString("cacheTimeToLive");
                aVar.d = jSONObject17.getString("industryFailReason");
                return aVar;
            }
            aVar.f9787a = "";
            return aVar;
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(l.a("PreloadProtocolBean"), "parserProtocolVersion error", e);
            return aVar;
        }
    }

    private static JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray("apiStack");
        if (jSONArray == null || (jSONObject2 = jSONArray.getJSONObject(0)) == null) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
        return jSONObject3 == null ? jSONObject2.getJSONObject("value") : jSONObject3;
    }
}
