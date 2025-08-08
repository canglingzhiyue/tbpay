package com.taobao.android.tschedule.task;

import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.c;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.i;
import com.taobao.android.tschedule.parser.ExprParserParams;
import com.taobao.android.tschedule.parser.a;
import com.taobao.android.tschedule.taskcontext.TaskContext;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.jkq;
import tb.jlb;
import tb.jld;
import tb.jle;
import tb.jlf;
import tb.jmc;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class ScheduleTask<T extends TaskContext> implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.ScheduleTask";
    public JSONObject originConfig;
    public ScheduleProtocolCallback taskCallback;
    public T taskContext;
    public String taskKey;
    public int runTimes = 0;
    private Set<String> strKey = new HashSet();
    private Set<String> encodeKey = new HashSet();

    /* renamed from: com.taobao.android.tschedule.task.ScheduleTask$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15683a = new int[THREAD_TYPE.values().length];

        static {
            try {
                f15683a[THREAD_TYPE.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15683a[THREAD_TYPE.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15683a[THREAD_TYPE.CURRENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public enum THREAD_TYPE {
        MAIN("main"),
        BACKGROUND("background"),
        CURRENT("current");
        
        String name;

        THREAD_TYPE(String str) {
            this.name = str;
        }

        public static THREAD_TYPE getType(String str) {
            THREAD_TYPE[] values;
            if (StringUtils.isEmpty(str)) {
                return BACKGROUND;
            }
            for (THREAD_TYPE thread_type : values()) {
                if (StringUtils.equals(str, thread_type.name)) {
                    return thread_type;
                }
            }
            return BACKGROUND;
        }
    }

    static {
        kge.a(1700392047);
        kge.a(1028243835);
    }

    public abstract boolean cancel();

    public abstract boolean isFinished();

    public abstract void realExecute(String str, Object... objArr);

    public abstract boolean validate(String str, Object... objArr);

    public ScheduleTask(String str, T t) {
        this.taskKey = str;
        this.taskContext = t;
    }

    public ScheduleTask(String str, T t, ScheduleProtocolCallback scheduleProtocolCallback) {
        this.taskKey = str;
        this.taskContext = t;
        this.taskCallback = scheduleProtocolCallback;
    }

    public final void execute(final String str, final Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e992d2b", new Object[]{this, str, objArr});
        } else if (!validate(str, new Object[0])) {
            StringBuilder sb = new StringBuilder();
            sb.append("task valid failed, type=");
            T t = this.taskContext;
            sb.append(t == null ? "null" : t.type);
            jkq.a(TAG, sb.toString());
        } else if (this.taskContext.runTimes >= 0 && this.runTimes >= this.taskContext.runTimes) {
            jkq.a(TAG, "beyond runTimes limit, limit=" + this.taskContext.runTimes + ", currentTimes=" + this.runTimes);
            c.a(this.taskKey, this);
        } else {
            this.runTimes++;
            Runnable runnable = new Runnable() { // from class: com.taobao.android.tschedule.task.ScheduleTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        jkq.a(ScheduleTask.TAG, "start task, type=" + ScheduleTask.this.taskContext.type + ScheduleTask.this.taskContext.version);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        ScheduleTask.this.realExecute(str, objArr);
                        jkq.a(ScheduleTask.TAG, "end task, type=" + ScheduleTask.this.taskContext.type + ScheduleTask.this.taskContext.version + str + ", executeTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
                    } catch (Throwable th) {
                        jkq.a(ScheduleTask.TAG, "execute ScheduleTask error, type=" + ScheduleTask.this.taskContext.type, th);
                        jmc.a("downgrade", ScheduleTask.this.taskContext.bizCode, ScheduleTask.this.taskContext.version, "TSchedule", ScheduleTask.this.taskContext.type, null, "EXCEPTION", th.getMessage());
                    }
                }
            };
            int i = AnonymousClass2.f15683a[workThread().ordinal()];
            if (i == 1) {
                jkq.a(TAG, "post to mainThread, type=" + this.taskContext.type);
                i.b().b(runnable);
            } else if (i == 2) {
                jkq.a(TAG, "post to asyncThread, type=" + this.taskContext.type);
                i.b().a(runnable);
            } else if (i != 3) {
            } else {
                jkq.a(TAG, "run in currentThread, type=" + this.taskContext.type);
                runnable.run();
            }
        }
    }

    public THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this}) : THREAD_TYPE.BACKGROUND;
    }

    public JSONObject parseTaskParams(String str, JSONObject jSONObject, List<String> list, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e991760f", new Object[]{this, str, jSONObject, list, intent}) : prepareParams(new a(new ExprParserParams(str, list, intent), e.h()), jSONObject);
    }

    public JSONObject parseTaskParams(String str, JSONObject jSONObject, List<String> list, Intent intent, List<TimeContent> list2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("432a4100", new Object[]{this, str, jSONObject, list, intent, list2}) : prepareParams(new a(new ExprParserParams(str, list, intent, list2), e.h()), jSONObject);
    }

    public JSONObject parseKangarooTaskParams(String str, JSONObject jSONObject, List<String> list, Intent intent, List<TimeContent> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("82acd000", new Object[]{this, str, jSONObject, list, intent, list2});
        }
        if (jSONObject != null && jSONObject.get("url") != null) {
            a aVar = new a(new ExprParserParams(str, list, intent, list2), e.h());
            Object obj = jSONObject.get("url");
            Object a2 = aVar.a(obj);
            jkq.a(TAG, "parseKangarooTaskParams url = " + a2);
            if (a2 instanceof String) {
                jSONObject.put("url", a2);
                JSONObject parseTaskParams = parseTaskParams((String) a2, jSONObject, list, intent, list2);
                jSONObject.put("url", obj);
                return parseTaskParams;
            }
        }
        return parseTaskParams(str, jSONObject, list, intent, list2);
    }

    public void prepareTaskParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617bceb7", new Object[]{this, jSONObject});
        } else {
            parseExpr(jSONObject);
        }
    }

    public Map<String, String> parseTaskHeaders(String str, Map<String, String> map, List<String> list, Intent intent) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("90f936e9", new Object[]{this, str, map, list, intent});
        }
        a aVar = new a(new ExprParserParams(str, list, intent), e.h());
        if (map != null) {
            i = map.size();
        }
        if (i <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value != null && key != null) {
                Object a2 = aVar.a(parserSingleExpr(key, value));
                if (a2 instanceof String) {
                    hashMap.put(key, (String) a2);
                }
            }
        }
        return hashMap;
    }

    private JSONObject prepareParams(a aVar, JSONObject jSONObject) {
        Object a2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("706f31ab", new Object[]{this, aVar, jSONObject});
        }
        if (jSONObject != null) {
            i = jSONObject.size();
        }
        if (i <= 0) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject(i);
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && key != null) {
                if (value instanceof JSONObject) {
                    a2 = prepareParams(aVar, (JSONObject) value);
                } else if (value instanceof JSONArray) {
                    a2 = prepareArrayParams(aVar, key, (JSONArray) value);
                } else {
                    a2 = aVar.a(value);
                }
                if (a2 != null) {
                    if ((a2 instanceof JSONObject) && ((value instanceof jlf) || (value instanceof jld) || (value instanceof jle) || (value instanceof jlb))) {
                        jSONObject2.putAll((JSONObject) a2);
                    } else if (this.strKey.contains(key)) {
                        jSONObject2.put(key, (Object) JSON.toJSONString(a2));
                    } else if (this.encodeKey.contains(key)) {
                        String obj = a2.toString();
                        try {
                            jSONObject2.put(key, (Object) Uri.encode(obj));
                        } catch (Throwable th) {
                            jkq.a(TAG, "encode result error, result=" + obj, th);
                        }
                    } else {
                        jSONObject2.put(key, a2);
                    }
                }
            }
        }
        return jSONObject2;
    }

    private JSONArray prepareArrayParams(a aVar, String str, JSONArray jSONArray) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b0212472", new Object[]{this, aVar, str, jSONArray});
        }
        int size = jSONArray == null ? 0 : jSONArray.size();
        if (size <= 0) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray(size);
        for (int i = 0; i < size; i++) {
            Object obj = jSONArray.get(i);
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    a2 = prepareParams(aVar, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    a2 = prepareArrayParams(aVar, str + i, (JSONArray) obj);
                } else {
                    a2 = aVar.a(obj);
                }
                if (a2 != null) {
                    jSONArray2.add(a2);
                }
            }
        }
        return jSONArray2;
    }

    private void parseExpr(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96555901", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject != null) {
            i = jSONObject.size();
        }
        if (i <= 0) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && key != null) {
                if (value instanceof JSONObject) {
                    parseExpr((JSONObject) value);
                } else if (value instanceof JSONArray) {
                    parseArrayExpr(key, (JSONArray) value);
                } else {
                    jSONObject.put(key, parserSingleExpr(key, value));
                }
                if (key.startsWith("@")) {
                    arrayList.add(key);
                }
            }
        }
        for (String str : arrayList) {
            Object remove = jSONObject.remove(str);
            if (!StringUtils.isEmpty(str) && remove != null) {
                if (str.startsWith(a.STR_PREFIX)) {
                    String substring = str.substring(5);
                    this.strKey.add(substring);
                    jSONObject.put(substring, remove);
                } else if (str.startsWith(a.ENCODE_PREFIX)) {
                    String substring2 = str.substring(8);
                    this.encodeKey.add(substring2);
                    jSONObject.put(substring2, remove);
                }
            }
        }
    }

    private void parseArrayExpr(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68602ff4", new Object[]{this, str, jSONArray});
            return;
        }
        int size = jSONArray == null ? 0 : jSONArray.size();
        if (size <= 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            Object obj = jSONArray.get(i);
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    parseExpr((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    parseArrayExpr(str + i, (JSONArray) obj);
                } else {
                    jSONArray.set(i, parserSingleExpr(str + i, obj));
                }
            }
        }
    }

    private Object parserSingleExpr(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("55230249", new Object[]{this, str, obj});
        }
        String obj2 = obj.toString();
        Object a2 = obj2.startsWith("@") ? a.a(obj2) : null;
        return a2 == null ? obj : a2;
    }
}
