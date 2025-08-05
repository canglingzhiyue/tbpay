package com.alibaba.ability.impl.barcode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.alm;
import tb.aln;
import tb.als;
import tb.aly$a;
import tb.bfy;
import tb.kge;

/* loaded from: classes2.dex */
public final class BarCodeAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_DECODE_QR = "decodeQR";
    public static final aly$a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final bfy f1869a;

    static {
        kge.a(-287903070);
        Companion = new aly$a(null);
        f1869a = new bfy("QR-DECODE", 3);
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, final aln callback) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        if (api.hashCode() == 570808463 && api.equals(API_DECODE_QR)) {
            final String a2 = e.a(params, "imageData", "");
            String str = a2;
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (z) {
                callback.a(a$a.Companion.b("imageData 为空"));
                return null;
            }
            bfy.a(f1869a, new Runnable() { // from class: tb.aly$b
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z2 = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String str2 = a2;
                    Charset forName = Charset.forName("utf-8");
                    q.b(forName, "Charset.forName(charsetName)");
                    if (str2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes = str2.getBytes(forName);
                    q.b(bytes, "(this as java.lang.String).getBytes(charset)");
                    byte[] byteArray = Base64.decode(bytes, 2);
                    q.b(byteArray, "byteArray");
                    if (byteArray.length == 0) {
                        callback.a(a$a.Companion.b("byteArray 为空"));
                        return;
                    }
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    if (decodeByteArray == null) {
                        callback.a(a$a.Companion.b("bitmap 为空"));
                        return;
                    }
                    MaResult[] a3 = oyt.a(decodeByteArray);
                    JSONArray jSONArray = new JSONArray();
                    if (a3 != null) {
                        if (!(a3.length == 0)) {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        for (MaResult it : a3) {
                            q.b(it, "it");
                            if (it.getType() == MaType.QR) {
                                String text = it.getText();
                                if (text == null) {
                                    text = "unknown";
                                }
                                jSONArray.add(new JSONObject(ai.a(j.a("code", text))));
                            }
                        }
                    }
                    if (jSONArray.isEmpty()) {
                        e.a(new Runnable() { // from class: tb.aly$b.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public final void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    callback.a(new ErrorResult("DecodeError", "没有可用识别结果", (Map) null, 4, (o) null));
                                }
                            }
                        }, 0L, 2, null);
                        return;
                    }
                    final JSONObject jSONObject = new JSONObject(ai.a(j.a("result", jSONArray)));
                    e.a(new Runnable() { // from class: tb.aly$b.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                callback.a((ExecuteResult) new FinishResult(jSONObject, "onSuccess"));
                            }
                        }
                    }, 0L, 2, null);
                }
            }, 0L, null, 6, null);
            return null;
        }
        return a$a.Companion.a("能力没找到");
    }
}
