package com.alibaba.ut.abtest.internal.bucketing.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.alibaba.ut.abtest.internal.util.g;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.djy;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4187a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private String g;
    private Expression h;
    private final List<ExperimentTrack> i = new ArrayList();
    private final Map<String, String> j = new HashMap();

    static {
        kge.a(22565349);
    }

    public b(ExperimentV5 experimentV5, a aVar) {
        this.d = 0L;
        this.f4187a = experimentV5.getKey();
        this.b = experimentV5.getId();
        this.c = experimentV5.getReleaseId();
        this.g = experimentV5.getCondition();
        this.e = experimentV5.getBeginTime();
        this.f = experimentV5.getEndTime();
        if (aVar != null && aVar.c().size() == 1 && aVar.c().get(0) != null && aVar.c().get(0).getGroups().size() == 1) {
            this.d = aVar.c().get(0).getGroups().get(0).getId();
        }
        if (experimentV5.getTracks() != null) {
            this.i.addAll(experimentV5.getTracks());
        }
        for (String str : experimentV5.getSwitchSet()) {
            if (!StringUtils.isEmpty(str)) {
                a(str, a(aVar, str));
            }
        }
    }

    private String a(a aVar, String str) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("accacf7e", new Object[]{this, aVar, str}) : (aVar == null || (a2 = aVar.a()) == null) ? "null" : a2.get(str);
    }

    public b(String str) {
        this.d = 0L;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        this.b = parseObject.getLong("id").longValue();
        this.c = parseObject.getLong("releaseId").longValue();
        this.d = parseObject.getLong("groupId").longValue();
        this.e = a(parseObject.getLong("beginTime"), 0L);
        this.f = a(parseObject.getLong("endTime"), 0L);
        this.g = parseObject.getString("condition");
        JSONArray jSONArray = parseObject.getJSONArray(ExperimentDO.COLUMN_TRACKS);
        if (jSONArray != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    this.i.add(new ExperimentTrack((JSONObject) next));
                }
            }
        }
        for (Map.Entry<String, Object> entry : parseObject.getJSONObject(djy.SERIALIZE_EXP_VARIATIONS).entrySet()) {
            this.j.put(entry.getKey(), a(entry.getValue()));
        }
    }

    private long a(Long l, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7c0436f1", new Object[]{this, l, new Long(j)})).longValue() : l == null ? j : l.longValue();
    }

    private String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        return StringUtils.equals("true", obj2) ? "true" : StringUtils.equals("false", obj2) ? "false" : obj2;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f4187a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f4187a = str;
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.b;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.d;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.j.put(str, str2);
        }
    }

    public List<ExperimentTrack> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[]{this}) : this.i;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) Long.valueOf(this.b));
        jSONObject.put("releaseId", (Object) Long.valueOf(this.c));
        jSONObject.put("groupId", (Object) Long.valueOf(this.d));
        jSONObject.put("condition", (Object) this.g);
        jSONObject.put("beginTime", (Object) Long.valueOf(this.e));
        jSONObject.put("endTime", (Object) Long.valueOf(this.f));
        JSONArray jSONArray = new JSONArray();
        for (ExperimentTrack experimentTrack : this.i) {
            jSONArray.add(experimentTrack.toJsonString());
        }
        if (this.i.size() > 0) {
            jSONObject.put(ExperimentDO.COLUMN_TRACKS, (Object) jSONArray);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : this.j.entrySet()) {
            jSONObject2.put(entry.getKey(), (Object) entry.getValue());
        }
        jSONObject.put(djy.SERIALIZE_EXP_VARIATIONS, (Object) jSONObject2);
        return jSONObject.toJSONString().replace("\"", "'");
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.j.containsKey(str);
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : this.j.get(str);
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : new HashMap(this.j);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.j.size() > 0;
    }

    public Expression i() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Expression) ipChange.ipc$dispatch("6c862876", new Object[]{this});
        }
        if (this.h == null && (str = this.g) != null) {
            this.h = (Expression) g.a(str, (Class<Object>) Expression.class);
        }
        return this.h;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.g;
    }

    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.e;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : this.f;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : (this.e == 0 || this.f == 0) ? false : true;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.d != 0;
    }
}
