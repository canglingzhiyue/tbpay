package com.taobao.message.lab.comfrm.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class Action implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, Object> context;
    public Object data;
    public String name;

    static {
        kge.a(-1766257420);
        kge.a(1028243835);
    }

    public Action() {
    }

    public Action(String str) {
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
        private final Action action;

        static {
            kge.a(1601688222);
        }

        public Build(String str) {
            this.action = new Action(str);
        }

        public Build data(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("d3264420", new Object[]{this, obj});
            }
            this.action.data = obj;
            return this;
        }

        public Build context(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("e07a9162", new Object[]{this, map});
            }
            this.action.context = map;
            return this;
        }

        public Action build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Action) ipChange.ipc$dispatch("66b9dff2", new Object[]{this}) : this.action;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Action|" + toJSON();
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

    public static Action fromJSONString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("212f09d1", new Object[]{str});
        }
        JSONObject parseObject = JSON.parseObject(str);
        Action action = new Action();
        action.name = parseObject.getString("name");
        action.data = parseObject.getJSONObject("data");
        action.context = parseObject.getJSONObject("context");
        return action;
    }
}
