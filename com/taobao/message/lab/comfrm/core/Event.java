package com.taobao.message.lab.comfrm.core;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class Event implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> context;
    public Object data;
    public String name;

    static {
        kge.a(-745466852);
        kge.a(1028243835);
    }

    public Event() {
    }

    public Event(String str) {
        this.name = str;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public Map<String, Object> getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ab803b5", new Object[]{this});
        }
        if (this.context == null) {
            this.context = new HashMap();
        }
        return this.context;
    }

    /* loaded from: classes7.dex */
    public static class Build {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Event event;

        static {
            kge.a(703060934);
        }

        public Build(String str) {
            this.event = new Event(str);
        }

        public Build data(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("785af612", new Object[]{this, obj});
            }
            this.event.data = obj;
            return this;
        }

        public Build context(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("7086f890", new Object[]{this, map});
            }
            this.event.context = map;
            return this;
        }

        public Event build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Event) ipChange.ipc$dispatch("c9183014", new Object[]{this}) : this.event;
        }
    }

    public JSONObject toJSON() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b0ef9c0a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) this.name);
        jSONObject.put("data", this.data);
        jSONObject.put("context", (Object) this.context);
        return jSONObject;
    }
}
