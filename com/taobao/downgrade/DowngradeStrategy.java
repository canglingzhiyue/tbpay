package com.taobao.downgrade;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class DowngradeStrategy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject param;
    private String tacticsFunction;
    private String tacticsPerformance;
    private Map<String, String> traceMap;

    private DowngradeStrategy() {
    }

    private DowngradeStrategy(a aVar) {
        this.tacticsFunction = a.a(aVar);
        this.tacticsPerformance = a.b(aVar);
        this.param = a.c(aVar);
        this.traceMap = a.d(aVar);
    }

    public Map<String, String> getTraceMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8f167c89", new Object[]{this}) : this.traceMap;
    }

    public void setTraceMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5392c725", new Object[]{this, map});
        } else {
            this.traceMap = map;
        }
    }

    public String getTacticsFunction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d85b8a1c", new Object[]{this}) : this.tacticsFunction;
    }

    public void setTacticsFunction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3d8e42", new Object[]{this, str});
        } else {
            this.tacticsFunction = str;
        }
    }

    public String getTacticsPerformance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89db5eee", new Object[]{this}) : this.tacticsPerformance;
    }

    public void setTacticsPerformance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15623a48", new Object[]{this, str});
        } else {
            this.tacticsPerformance = str;
        }
    }

    public JSONObject getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ed69b2fe", new Object[]{this}) : this.param;
    }

    public void setParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6d4cde", new Object[]{this, jSONObject});
        } else {
            this.param = jSONObject;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f17069a;
        private String b;
        private JSONObject c;
        private Map<String, String> d;

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c615bce1", new Object[]{aVar}) : aVar.f17069a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4476c0c0", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ JSONObject c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("13b4fd41", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Map d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6ad0fb17", new Object[]{aVar}) : aVar.d;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b8b97c5b", new Object[]{this, str});
            }
            this.f17069a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("371a803a", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e8471ad0", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ed4985c5", new Object[]{this, jSONObject});
            }
            this.c = jSONObject;
            return this;
        }

        public DowngradeStrategy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DowngradeStrategy) ipChange.ipc$dispatch("1d52c3c2", new Object[]{this}) : new DowngradeStrategy(this);
        }
    }
}
