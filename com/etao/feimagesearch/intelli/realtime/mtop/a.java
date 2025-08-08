package com.etao.feimagesearch.intelli.realtime.mtop;

import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.intelli.realtime.a;
import com.etao.feimagesearch.intelli.realtime.mtop.a;
import com.etao.feimagesearch.mnn.realtime.l;
import com.etao.feimagesearch.util.d;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.w;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.com;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static final C0228a Companion;
    public static final String TAG = "realtime_CloudMsgFetcher";

    static {
        kge.a(2126181741);
        Companion = new C0228a(null);
    }

    /* renamed from: com.etao.feimagesearch.intelli.realtime.mtop.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0228a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.etao.feimagesearch.intelli.realtime.mtop.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0229a {
            void a(int i, String str);

            void a(JSONObject jSONObject);
        }

        static {
            kge.a(-1606632331);
        }

        private C0228a() {
        }

        public /* synthetic */ C0228a(o oVar) {
            this();
        }

        public final void a(HashMap<Integer, a.c> modelMap, final InterfaceC0229a resultCallback, String mssid, String extraInfo) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("270dd181", new Object[]{this, modelMap, resultCallback, mssid, extraInfo});
                return;
            }
            q.c(modelMap, "modelMap");
            q.c(resultCallback, "resultCallback");
            q.c(mssid, "mssid");
            q.c(extraInfo, "extraInfo");
            cot.c(a.TAG, "begin request cloud msg--");
            ArrayList arrayList = new ArrayList();
            Iterator<a.c> it = modelMap.values().iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                l a2 = it.next().a();
                Bitmap i = a2.i();
                if (i != null) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = hashMap;
                    hashMap2.put("imageId", String.valueOf(a2.f()));
                    Bitmap b = d.b(i, 640);
                    w wVar = w.INSTANCE;
                    Object[] objArr = new Object[2];
                    Float f = null;
                    objArr[0] = b != null ? Float.valueOf(b.getWidth()) : null;
                    if (b != null) {
                        f = Float.valueOf(b.getHeight());
                    }
                    objArr[1] = f;
                    String format = String.format("0,%f,0,%f", Arrays.copyOf(objArr, objArr.length));
                    q.b(format, "java.lang.String.format(format, *args)");
                    hashMap2.put("region", format);
                    String a3 = d.a(b, Bitmap.CompressFormat.JPEG, 70);
                    if (a3 == null) {
                        a3 = str;
                    }
                    hashMap2.put("imageBase64", a3);
                    arrayList.add(hashMap);
                }
            }
            HashMap hashMap3 = new HashMap(10);
            HashMap hashMap4 = hashMap3;
            if (arrayList.size() > 0) {
                str = JSON.toJSONString(arrayList);
            }
            q.a((Object) str, "if (imageInfoArray.size …g(imageInfoArray) else \"\"");
            hashMap4.put("imageInfos", str);
            hashMap4.put("mssid", mssid);
            if (!StringUtils.isEmpty(extraInfo) && extraInfo.length() < b.aP()) {
                hashMap4.put("plt_search_extraInfo", extraInfo);
            }
            hashMap4.put("source", "realtime_search_card");
            String h = com.h();
            q.a((Object) h, "GlobalAdapter.getSVersion()");
            hashMap4.put("sversion", h);
            String a4 = com.a(com.b());
            q.a((Object) a4, "GlobalAdapter.getUtdid(GlobalAdapter.getCtx())");
            hashMap4.put("utd_id", a4);
            hashMap4.put("debug", String.valueOf(com.a()));
            hashMap4.put("api", "mtop.relationrecommend.PailitaoRecommend.recommend");
            HashMap hashMap5 = new HashMap(2);
            String jSONString = JSON.toJSONString(hashMap3);
            q.a((Object) jSONString, "JSON.toJSONString(params)");
            hashMap5.put("params", jSONString);
            hashMap5.put("appId", "32969");
            com.etao.feimagesearch.util.w.a("mtop.relationrecommend.PailitaoRecommend.recommend", "1.0", hashMap5, new IRemoteBaseListener() { // from class: com.etao.feimagesearch.intelli.realtime.mtop.CloudMsgFetcher$Companion$fetchCloudMsg$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    cot.c(a.TAG, "onSuccess: " + i2);
                    if (mtopResponse == null) {
                        return;
                    }
                    try {
                        byte[] bytedata = mtopResponse.getBytedata();
                        q.a((Object) bytedata, "mtopResponse.bytedata");
                        Charset forName = Charset.forName("utf-8");
                        q.b(forName, "Charset.forName(charsetName)");
                        JSONObject parseObject = JSON.parseObject(new String(bytedata, forName));
                        if (parseObject != null) {
                            Object obj2 = parseObject.get("data");
                            if (obj2 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                            }
                            JSONObject jSONObject = (JSONObject) obj2;
                            JSONArray jSONArray = (JSONArray) jSONObject.get("result");
                            if (jSONArray != null && jSONArray.size() > 0 && (jSONArray.get(0) instanceof String)) {
                                Object obj3 = jSONArray.get(0);
                                if (obj3 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                                }
                                if (q.a((Object) "ok", (Object) ((String) obj3))) {
                                    a.C0228a.InterfaceC0229a.this.a(jSONObject);
                                    return;
                                } else {
                                    a.C0228a.InterfaceC0229a.this.a(10004, "onError: result[0] is not ok");
                                    return;
                                }
                            }
                            a.C0228a.InterfaceC0229a.this.a(10003, "onError: result length or result[0] illegal");
                            return;
                        }
                        a.C0228a.InterfaceC0229a.this.a(10002, "onError: content is not json object");
                    } catch (UnsupportedEncodingException e) {
                        a.C0228a.InterfaceC0229a interfaceC0229a = a.C0228a.InterfaceC0229a.this;
                        interfaceC0229a.a(10001, "onError: parse failed " + e.getMessage());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("onError: ");
                    sb.append(i2);
                    sb.append(' ');
                    String str2 = null;
                    sb.append(mtopResponse != null ? mtopResponse.getRetMsg() : null);
                    cot.b(a.TAG, sb.toString());
                    a.C0228a.InterfaceC0229a interfaceC0229a = a.C0228a.InterfaceC0229a.this;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onError: ");
                    if (mtopResponse != null) {
                        str2 = mtopResponse.getRetMsg();
                    }
                    sb2.append(str2);
                    interfaceC0229a.a(i2, sb2.toString());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("onSystemError: ");
                    sb.append(i2);
                    sb.append(' ');
                    String str2 = null;
                    sb.append(mtopResponse != null ? mtopResponse.getRetMsg() : null);
                    cot.b(a.TAG, sb.toString());
                    a.C0228a.InterfaceC0229a interfaceC0229a = a.C0228a.InterfaceC0229a.this;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onSystemError: ");
                    if (mtopResponse != null) {
                        str2 = mtopResponse.getRetMsg();
                    }
                    sb2.append(str2);
                    interfaceC0229a.a(i2, sb2.toString());
                }
            }, false, true);
        }
    }
}
