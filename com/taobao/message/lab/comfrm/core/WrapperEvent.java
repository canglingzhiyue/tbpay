package com.taobao.message.lab.comfrm.core;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class WrapperEvent extends Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONArray auraEventHandler;
    public ViewObject viewObject;

    static {
        kge.a(-1080301051);
    }

    public WrapperEvent(String str) {
        super(str);
    }

    public ViewObject getViewObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewObject) ipChange.ipc$dispatch("87ef67f0", new Object[]{this}) : this.viewObject;
    }

    public JSONArray getAuraEventHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("c9bed06e", new Object[]{this}) : this.auraEventHandler;
    }

    /* loaded from: classes7.dex */
    public static class Build {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WrapperEvent event;

        static {
            kge.a(457891567);
        }

        public Build(String str) {
            this.event = new WrapperEvent(str);
        }

        public Build viewObject(ViewObject viewObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("b01ed236", new Object[]{this, viewObject});
            }
            this.event.viewObject = viewObject;
            return this;
        }

        public Build auraEventHandler(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("de3679a4", new Object[]{this, jSONArray});
            }
            this.event.auraEventHandler = jSONArray;
            return this;
        }

        public Build data(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("cfba63af", new Object[]{this, obj});
            }
            this.event.data = obj;
            return this;
        }

        public Build context(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Build) ipChange.ipc$dispatch("713c3771", new Object[]{this, map});
            }
            this.event.context = map;
            return this;
        }

        public WrapperEvent build() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WrapperEvent) ipChange.ipc$dispatch("a22c18c1", new Object[]{this}) : this.event;
        }
    }
}
