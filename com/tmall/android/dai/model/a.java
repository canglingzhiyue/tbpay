package com.tmall.android.dai.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.phenix.request.ImageStatistics;
import com.tmall.android.dai.internal.config.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23718a;
    public boolean b;
    public String c;
    public String d;
    public JSONObject e;
    public String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private List<c> l;
    private Config.ModelResource m;
    private String n;
    private String o;
    private String q;
    public boolean f = false;
    private b p = null;

    static {
        kge.a(1357404283);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.i;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.h;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.j;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.k;
    }

    public List<c> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.l;
    }

    public void a(c... cVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa41964f", new Object[]{this, cVarArr});
        } else if (cVarArr != null && cVarArr.length != 0) {
            if (this.l == null) {
                this.l = new ArrayList();
            }
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    this.l.add(cVar);
                }
            }
        }
    }

    public Config.ModelResource f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Config.ModelResource) ipChange.ipc$dispatch("133e3170", new Object[]{this}) : this.m;
    }

    public void a(Config.ModelResource modelResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d62d98f", new Object[]{this, modelResource});
        } else {
            this.m = modelResource;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.o;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.q;
    }

    public b i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("456f6ddd", new Object[]{this}) : this.p;
    }

    public Map<String, Object> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db121866", new Object[]{this});
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(ImageStatistics.KEY_SCHEDULE_TIME, Long.valueOf(this.p.f23719a));
            hashMap.put("prepareTime", Long.valueOf(this.p.b));
            hashMap.put(Constants.Monitor.EXECUTE_TIME, Long.valueOf(this.p.c));
            hashMap.put("postProcessTime", Long.valueOf(this.p.d));
            hashMap.put("totalRunTime", Long.valueOf(this.p.e));
            hashMap.put("errorCode", Integer.valueOf(this.p.f));
            hashMap.put("success", Boolean.valueOf(this.p.g));
            if (this.p.h != null) {
                hashMap.put("vmErrorMsg", this.p.h);
            }
            if (this.p.k != null) {
                hashMap.put("input", this.p.k);
            }
            if (this.p.l != null) {
                hashMap.put(NetConfig.OUPUT_KEY, this.p.l);
            }
            if (this.p.i != null) {
                hashMap.put("errorMsg", this.p.i);
            }
            hashMap.put(com.tmall.android.dai.e.MODEL_STATUS_KEY_LAST_RUN_TIME, this.p.j);
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this}) : this.n;
    }
}
