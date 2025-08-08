package com.alipay.android.msp.framework.drm;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.util.Pair;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.riy;

/* loaded from: classes3.dex */
public abstract class ChangeMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f4694a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final ArrayList<Pair<String, String>> c = new ArrayList<>();
    public SharedPreferences e = null;
    public JSONArray d = new JSONArray();

    public void newContext(final String str, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575fd688", new Object[]{this, str, context});
            return;
        }
        try {
            if (this.b.get() == 0) {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.drm.ChangeMonitor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ChangeMonitor.this.e = context.getSharedPreferences(str, 0);
                        String str2 = null;
                        if (ChangeMonitor.this.e != null) {
                            str2 = ChangeMonitor.this.e.getString("content", "{}");
                        }
                        if (StringUtils.isEmpty(str2) || ChangeMonitor.this.b.get() == 0) {
                            return;
                        }
                        ChangeMonitor.this.f4694a = JSON.parseObject(str2);
                    }
                });
            }
            this.b.getAndIncrement();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public synchronized void hitKey(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7261ffb", new Object[]{this, str, obj, new Boolean(z)});
        } else if (this.b.get() <= 0 || this.f4694a == null) {
        } else {
            String obj2 = obj == null ? "null" : obj.toString();
            if (!z && obj2.startsWith(riy.BLOCK_START_STR) && obj2.endsWith(riy.BLOCK_END_STR)) {
                obj2 = String.valueOf(obj2.hashCode());
            }
            if (this.f4694a.containsKey(str)) {
                if (!StringUtils.equals(obj2, this.f4694a.getString(str))) {
                    a(str, obj2, true);
                }
            } else if (obj == null) {
                a(str, obj2, false);
            } else {
                a(str, obj2, true);
            }
        }
    }

    public void hitKey(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e774d1f9", new Object[]{this, str, obj});
        } else {
            hitKey(str, obj, false);
        }
    }

    private synchronized void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (!StringUtils.isEmpty(str) && this.f4694a != null) {
            this.f4694a.put(str, (Object) str2);
            if (z) {
                this.c.add(new Pair<>(str, str2));
            }
        }
    }

    public synchronized Pair<Boolean, JSONArray> exit() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4c2261ca", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        if (this.b.get() <= 0 || this.f4694a == null) {
            if (this.b.get() > 0) {
                this.b.decrementAndGet();
            }
            return new Pair<>(Boolean.FALSE, jSONArray);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.size());
        LogUtil.record(2, "mMspSwitchChange long", sb.toString());
        int size = this.c.size();
        for (int i = size - 1; i >= 0 && i > size - 11; i--) {
            JSONObject jSONObject = new JSONObject();
            Pair<String, String> pair = this.c.get(i);
            if (pair != null) {
                jSONObject.put(pair.first, (Object) pair.second);
                jSONArray.add(jSONObject);
            }
        }
        if (jSONArray.size() > 0) {
            z = true;
        }
        if (jSONArray.size() < 10) {
            for (int size2 = this.d.size() - 1; size2 >= 0 && jSONArray.size() < 10; size2--) {
                JSONObject jSONObject2 = new JSONObject();
                Pair pair2 = (Pair) this.d.getObject(size2, Pair.class);
                if (pair2 != null) {
                    jSONObject2.put(String.valueOf(pair2.first), pair2.second);
                    jSONArray.add(jSONObject2);
                }
            }
        }
        if (this.b.get() > 0 && this.b.decrementAndGet() <= 0) {
            this.d.addAll(this.c);
            this.c.clear();
        }
        this.e.edit().putString("content", this.f4694a.toJSONString()).apply();
        this.e.edit().putString("content_change", this.d.toJSONString()).apply();
        return new Pair<>(Boolean.valueOf(z), jSONArray);
    }
}
