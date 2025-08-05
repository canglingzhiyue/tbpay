package com.taobao.android.detail.ttdetail.data.converter;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emh;
import tb.eyd;
import tb.eyf;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static String f10610a;
    private static String b;
    private static String c;
    private static final JSONObject d;
    private static final JSONObject e;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f10610a;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : c;
    }

    static {
        kge.a(49199755);
        f10610a = "type";
        b = "fields";
        c = "events";
        d = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$1
            {
                put("native$headerbgimage", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$1.1
                    {
                        put("name", eyd.NAME);
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
        e = new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$2
            {
                put("native$headervideo", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$2.1
                    {
                        put("name", eyf.NAME);
                        put("type", "native");
                        put("version", "0");
                        put("url", "");
                    }
                });
            }
        };
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1fd178c", new Object[]{jSONObject, jSONObject2, jSONObject3})).booleanValue();
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("item");
        if (jSONObject4 == null || jSONObject4.isEmpty()) {
            return false;
        }
        JSONArray jSONArray = jSONObject4.getJSONArray("images");
        JSONArray jSONArray2 = jSONObject4.getJSONArray("videos");
        if ((jSONArray == null || jSONArray.isEmpty()) && (jSONArray2 == null || jSONArray2.isEmpty())) {
            return false;
        }
        jSONObject2.putAll(d);
        jSONObject2.putAll(e);
        JSONObject jSONObject5 = new JSONObject();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            JSONObject jSONObject6 = new JSONObject();
            JSONArray jSONArray5 = new JSONArray();
            int size = jSONArray2.size();
            while (i < size) {
                int i2 = size;
                JSONObject jSONObject7 = new JSONObject();
                final JSONObject jSONObject8 = jSONArray2.getJSONObject(i);
                jSONObject7.put("content", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$3
                    {
                        put(b.a(), "native$headervideo");
                        put(b.b(), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$3.1
                            {
                                put("thumbnailUrl", (Object) JSONObject.this.getString("videoThumbnailURL"));
                                put("videoId", (Object) JSONObject.this.getString("videoId"));
                                put("videoUrl", (Object) JSONObject.this.getString("url"));
                            }
                        });
                        put(b.c(), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$3.2
                            {
                                put("itemClick", (Object) new JSONArray() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.3.2.1
                                    {
                                        add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.3.2.1.1
                                            {
                                                put("type", "openLightOff");
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
                jSONObject7.put("dimension", (Object) jSONObject8.getString("spatialVideoDimension"));
                jSONObject7.put("enableLightOff", (Object) "true");
                jSONArray5.add(jSONObject7);
                i++;
                size = i2;
                jSONArray2 = jSONArray2;
            }
            jSONArray3.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$4
                {
                    put("id", "video");
                    put("name", "视频");
                }
            });
            jSONObject6.put("items", (Object) jSONArray5);
            jSONObject6.put("locatorId", (Object) "video");
            jSONArray4.add(jSONObject6);
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            JSONObject jSONObject9 = new JSONObject();
            JSONArray jSONArray6 = new JSONArray();
            int size2 = jSONArray.size();
            int i3 = 0;
            while (i3 < size2) {
                JSONObject jSONObject10 = new JSONObject();
                final String string = jSONArray.getString(i3);
                jSONObject10.put("content", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$5
                    {
                        put(b.a(), "native$headerbgimage");
                        put(b.b(), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$5.1
                            {
                                put("url", (Object) string);
                            }
                        });
                        put(b.c(), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$5.2
                            {
                                put("itemClick", (Object) new JSONArray() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.5.2.1
                                    {
                                        add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter.5.2.1.1
                                            {
                                                put("type", "openLightOff");
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
                jSONObject10.put("dimension", (Object) emh.sDefaultDimension);
                jSONObject10.put("enableLightOff", (Object) "true");
                jSONArray6.add(jSONObject10);
                i3++;
                jSONArray = jSONArray;
            }
            jSONArray3.add(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.data.converter.TinyShopDetailHeaderPicConverter$6
                {
                    put("id", "image");
                    put("name", "图集");
                }
            });
            jSONObject9.put("items", (Object) jSONArray6);
            jSONObject9.put("locatorId", (Object) "image");
            jSONArray4.add(jSONObject9);
        }
        if (jSONArray4.isEmpty()) {
            return false;
        }
        jSONObject5.put("locators", (Object) jSONArray3);
        jSONObject5.put("groups", (Object) jSONArray4);
        jSONObject3.put("headerPic", (Object) jSONObject5);
        return true;
    }
}
