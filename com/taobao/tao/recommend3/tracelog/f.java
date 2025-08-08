package com.taobao.tao.recommend3.tracelog;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.orf;
import tb.org;
import tb.orh;
import tb.ori;
import tb.ork;
import tb.orp;
import tb.xkv;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f20954a;
    private Map<String, org> b = new HashMap();
    private Map<String, org> c = new HashMap();
    private Map<String, org> d = new HashMap();

    static {
        kge.a(-787468910);
    }

    public f(String str) {
        try {
            this.f20954a = str;
            if (!n.n().p()) {
                TLog.loge("home", "GlobalTrace", "线下度量开关关闭  不使用部分性能工具");
                ork.a(this);
            }
            orf.a(this);
            orh.a(this);
            xkv.a(this);
            orp.a(this);
            ori.a(this);
        } catch (Throwable th) {
            TLog.loge("home", "GlobalTrace", "init TraceInterceptorFactory error", th);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f20954a;
    }

    public void a(String str, org orgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385f9b3e", new Object[]{this, str, orgVar});
        } else if (StringUtils.isEmpty(str) || orgVar == null) {
            TLog.loge("home", "GlobalTrace", "register failed, empty key or value");
        } else {
            Map<String, org> a2 = a(orgVar.a());
            if (a2.containsKey(str)) {
                TLog.loge("home", "GlobalTrace", "register failed, duplicate register, key = " + str);
                return;
            }
            a2.put(str, orgVar);
        }
    }

    public Map<String, org> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35efba90", new Object[]{this, new Integer(i)});
        }
        if (i == 2) {
            return this.d;
        }
        if (i == 3) {
            return this.b;
        }
        return this.c;
    }
}
