package com.taobao.tao.powermsg.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.c;
import com.taobao.tao.messagekit.base.monitor.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COL_BIZ = "bizCode";
    public static final String COL_BTAG = "bizTag";
    public static final String COL_CODE = "code";
    public static final String COL_EXT1 = "ext1";
    public static final String COL_EXT2 = "ext2";
    public static final String COL_ID = "id";
    public static final String COL_KEY = "key";
    public static final String COL_MARK = "mark";
    public static final String COL_M_TIME = "mtopTime";
    public static final String COL_PULL_MODE = "mode";
    public static final String COL_SOURCE = "source";
    public static final String COL_S_TIME = "serverTime";
    public static final String COL_TASK = "taskId";
    public static final String COL_TIME = "time";
    public static final String COL_TOPIC = "topic";
    public static final String COL_TYPE = "type";

    /* renamed from: a  reason: collision with root package name */
    public String f20859a;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int g;
    public String h;
    public int i;
    public long l;
    public int m;
    public long j = System.currentTimeMillis();
    public long k = c.a();
    public long n = System.nanoTime();

    static {
        kge.a(754581147);
        kge.a(699322642);
    }

    public a(String str, int i, int i2, String str2, String str3, int i3, int i4) {
        this.f20859a = str;
        this.g = i;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = i3;
        this.i = i4;
    }

    @Override // tb.olw
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 2;
    }

    @Override // com.taobao.tao.messagekit.base.monitor.b
    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.n;
    }

    @Override // com.taobao.tao.messagekit.base.monitor.b
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.e;
    }

    @Override // com.taobao.tao.messagekit.base.monitor.b
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f20859a;
    }

    @Override // com.taobao.tao.messagekit.base.monitor.b
    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.f20859a);
        jSONObject.put("bizCode", (Object) Integer.valueOf(this.b));
        jSONObject.put("topic", (Object) this.c);
        jSONObject.put(COL_BTAG, (Object) this.d);
        jSONObject.put("code", (Object) Integer.valueOf(this.e));
        jSONObject.put("source", (Object) Integer.valueOf(this.f));
        jSONObject.put("type", (Object) Integer.valueOf(this.g));
        jSONObject.put(COL_TASK, (Object) this.h);
        jSONObject.put("mode", (Object) Integer.valueOf(this.i));
        jSONObject.put("time", (Object) Long.valueOf(this.j));
        jSONObject.put("mtopTime", (Object) Long.valueOf(this.k));
        jSONObject.put(COL_MARK, (Object) Integer.valueOf(this.m));
        jSONObject.put(COL_S_TIME, (Object) Long.valueOf(this.l));
        jSONObject.put("key", (Object) Long.valueOf(this.n));
        jSONObject.put("platform", (Object) 1);
        return jSONObject;
    }
}
