package com.taobao.android.searchbaseframe.net;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f14992a;
    private Map<String, List<String>> b;
    private boolean c = true;
    private NetError d = null;
    private RequestStats e;
    private JSONObject f;

    static {
        kge.a(-91965990);
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.f14992a;
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else {
            this.f14992a = bArr;
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this}) : this.f;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !this.c;
    }

    public NetError c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetError) ipChange.ipc$dispatch("de6cb850", new Object[]{this}) : this.d;
    }

    public void a(NetError netError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f84b9ce", new Object[]{this, netError});
            return;
        }
        this.c = false;
        this.d = netError;
    }

    public RequestStats d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestStats) ipChange.ipc$dispatch("93c0dd0c", new Object[]{this}) : this.e;
    }

    public void a(RequestStats requestStats) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13775249", new Object[]{this, requestStats});
        } else {
            this.e = requestStats;
        }
    }

    public static JSONObject a(e eVar) throws ResultException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("18e7f12", new Object[]{eVar});
        }
        if (eVar.b()) {
            throw new ResultException(new ResultError(eVar.c()));
        }
        if (eVar.g() != null) {
            return eVar.g();
        }
        byte[] a2 = eVar.a();
        if (a2 == null || a2.length == 0) {
            throw new ResultException(new ResultError(5));
        }
        try {
            String str = new String(a2, "UTF-8");
            if (StringUtils.isEmpty(str)) {
                throw new ResultException(new ResultError(5));
            }
            try {
                return JSON.parseObject(str);
            } catch (JSONException e) {
                e.printStackTrace();
                throw new ResultException(new ResultError(7, e));
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            throw new ResultException(new ResultError(6, e2));
        }
    }

    public Map<String, List<String>> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.b;
    }

    public void a(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public String f() {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        Map<String, List<String>> e = e();
        return (e == null || (list = e.get("eagleeye-traceid")) == null || list.isEmpty()) ? "" : list.get(0);
    }
}
