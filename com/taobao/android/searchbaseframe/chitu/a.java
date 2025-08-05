package com.taobao.android.searchbaseframe.chitu;

import android.os.Parcel;
import android.text.TextUtils;
import anet.channel.request.BodyEntry;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.http.HttpNetwork;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.lib.RequestInfoBean;
import com.taobao.android.searchbaseframe.util.r;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.imn;
import tb.imo;
import tb.itt;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERVERS = "servers";
    public static final String SERVER_REWRITE = "serverRewrite";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14956a;
    public static Map<String, RequestInfoBean> c;
    public String b;
    private imn d;

    static {
        kge.a(-1610539726);
        f14956a = false;
        c = new HashMap();
    }

    public a(imn imnVar) {
        this.d = imnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "chitu"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.searchbaseframe.chitu.a.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L1a
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r8
            r2 = 1
            r0[r2] = r9
            r9 = 2
            r0[r9] = r10
            java.lang.String r9 = "d7b3cea7"
            r1.ipc$dispatch(r9, r0)
            return
        L1a:
            if (r9 != 0) goto L1d
            return
        L1d:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L24
            return
        L24:
            tb.imn r1 = r8.d
            com.taobao.android.searchbaseframe.chitu.d r1 = r1.l()
            boolean r1 = r1.a()
            if (r1 != 0) goto L31
            return
        L31:
            tb.imn r1 = r8.d
            com.taobao.android.searchbaseframe.util.h r1 = r1.j()
            android.content.SharedPreferences r1 = r1.a()
            r2 = 0
            java.lang.String r4 = "serverRewrite"
            java.lang.String r5 = ""
            java.lang.String r1 = r1.getString(r4, r5)     // Catch: org.json.JSONException -> L51
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L51
            if (r4 != 0) goto L5d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L51
            r4.<init>(r1)     // Catch: org.json.JSONException -> L51
            goto L5e
        L51:
            tb.imn r1 = r8.d
            com.taobao.android.searchbaseframe.util.k r1 = r1.b()
            java.lang.String r4 = "serverRewrite json格式异常"
            r1.f(r0, r4)
        L5d:
            r4 = r2
        L5e:
            boolean r1 = com.taobao.android.searchbaseframe.chitu.a.f14956a
            if (r1 != 0) goto L6a
            java.lang.String r1 = "debug"
            java.lang.String r5 = "true"
            r9.put(r1, r5)
        L6a:
            if (r4 == 0) goto Lea
            java.lang.String r1 = "groupAlias"
            java.lang.String r1 = r4.optString(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r6 = "chituGroupAlias"
            if (r5 != 0) goto L7d
            r9.put(r6, r1)
        L7d:
            tb.imn r5 = r8.d
            com.taobao.android.searchbaseframe.chitu.lib.a r5 = r5.n()
            java.lang.String r5 = r5.c
            java.lang.String r7 = "chituBiz"
            r9.put(r7, r5)
            java.lang.String r5 = "servers"
            org.json.JSONObject r4 = r4.optJSONObject(r5)
            java.util.Map r5 = r8.a(r9)
            if (r5 == 0) goto L9a
            r5.put(r6, r1)
        L9a:
            if (r4 == 0) goto Lde
            org.json.JSONObject r10 = r4.optJSONObject(r10)
            if (r10 == 0) goto Lde
            java.lang.String r1 = "reqs"
            org.json.JSONArray r10 = r10.optJSONArray(r1)
            if (r10 == 0) goto Lde
        Lab:
            int r1 = r10.length()
            if (r3 >= r1) goto Lde
            org.json.JSONObject r1 = r10.getJSONObject(r3)     // Catch: org.json.JSONException -> Lb6
            goto Lc4
        Lb6:
            r1 = move-exception
            tb.imn r4 = r8.d
            com.taobao.android.searchbaseframe.util.k r4 = r4.b()
            java.lang.String r6 = "reqs json格式异常"
            r4.b(r0, r6, r1)
            r1 = r2
        Lc4:
            if (r1 == 0) goto Ldb
            java.lang.String r4 = "key"
            java.lang.String r4 = r1.optString(r4)
            java.lang.String r6 = "val"
            java.lang.String r1 = r1.optString(r6)
            r9.put(r4, r1)
            if (r5 == 0) goto Ldb
            r5.put(r4, r1)
        Ldb:
            int r3 = r3 + 1
            goto Lab
        Lde:
            if (r5 == 0) goto Lea
            java.lang.String r10 = com.alibaba.fastjson.JSON.toJSONString(r5)
            java.lang.String r0 = "params"
            r9.put(r0, r10)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.chitu.a.a(java.util.Map, java.lang.String):void");
    }

    private Map<String, Object> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        String str = map.get("params");
        if (!TextUtils.isEmpty(str)) {
            return JSON.parseObject(str);
        }
        return null;
    }

    public String a(String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && this.d.l().a()) {
            try {
                String string = this.d.j().a().getString("serverRewrite", "");
                if (!TextUtils.isEmpty(string) && (optJSONObject = new JSONObject(string).optJSONObject(SERVERS)) != null && (optJSONObject2 = optJSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject2.optString("server");
                    if (!TextUtils.isEmpty(optString)) {
                        return optString;
                    }
                }
            } catch (JSONException unused) {
                this.d.b().f("chitu", "获取改写host失败");
            }
        }
        return "";
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (!this.d.l().a()) {
            return str;
        }
        String a2 = a(str2);
        if (TextUtils.isEmpty(a2)) {
            return str;
        }
        Map<String, String> a3 = r.a(str);
        a(a3, str2);
        return r.a(a2, a3);
    }

    public void a(final String str, final byte[] bArr, final String str2, final boolean z) {
        String str3;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9b1931", new Object[]{this, str, bArr, str2, new Boolean(z)});
        } else if (!this.d.l().a() || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || bArr == null) {
        } else {
            try {
                str3 = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                str3 = "";
            }
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject = new JSONObject();
            }
            final JSONObject jSONObject2 = jSONObject;
            c.put(str2, new RequestInfoBean(str, str3));
            HttpNetwork httpNetwork = new HttpNetwork(imo.c());
            RequestImpl requestImpl = new RequestImpl(this.b);
            if (this.d.a().d() != -1) {
                requestImpl.setBizId(this.d.a().d());
            }
            requestImpl.setConnectTimeout(20000);
            requestImpl.setReadTimeout(20000);
            requestImpl.setRetryTime(0);
            requestImpl.setMethod("post");
            requestImpl.setBodyEntry(new BodyEntry() { // from class: com.taobao.android.searchbaseframe.chitu.ChiTuRewriteUtils$1
                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // anet.channel.request.BodyEntry
                public String getContentType() {
                    return "application/json";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
                }

                @Override // anet.channel.request.BodyEntry
                public int writeTo(OutputStream outputStream) throws IOException {
                    a aVar = a.this;
                    a.$ipChange.a().b();
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str);
                    hashMap.put("result", jSONObject2);
                    hashMap.put("alias", str2);
                    hashMap.put("mtop", z ? "true" : "false");
                    outputStream.write(new JSONObject(hashMap).toString().getBytes("UTF-8"));
                    outputStream.close();
                    return bArr.length;
                }
            });
            httpNetwork.asyncSend(requestImpl, null, null, null);
        }
    }

    public void a(itt ittVar, byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33566e0", new Object[]{this, ittVar, bArr, str});
        } else if (!this.d.l().a() || !c.a(this.d)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject((Map) ittVar.c);
                a(r.a("http://mtop.taobao.com/" + ((itt.a) ittVar.b).f29314a + "/" + ((itt.a) ittVar.b).b, "data", jSONObject.toString()), bArr, str, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
