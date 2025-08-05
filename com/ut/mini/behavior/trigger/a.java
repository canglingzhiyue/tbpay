package com.ut.mini.behavior.trigger;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.config.b;
import com.ut.mini.behavior.data.DataType;
import com.ut.mini.behavior.expression.d;
import com.ut.mini.h;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object f24097a;
    private TriggerConfig b;

    /* renamed from: com.ut.mini.behavior.trigger.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1050a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f24098a;

        static {
            kge.a(1094116337);
            f24098a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("73ac2f9a", new Object[0]) : f24098a;
        }
    }

    static {
        kge.a(1040529182);
    }

    private a() {
        this.f24097a = new Object();
    }

    public static a getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ffbd2db0", new Object[0]) : C1050a.a();
    }

    public void init(TriggerConfig triggerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4ed54a", new Object[]{this, triggerConfig});
            return;
        }
        synchronized (this.f24097a) {
            this.b = triggerConfig;
        }
    }

    public boolean triggerEvent(Scene scene, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40bcf6ff", new Object[]{this, scene, map})).booleanValue();
        }
        synchronized (this.f24097a) {
            if (this.b != null && b.enableSample(this.b.enableSample)) {
                if (scene != null && scene.event != null && DataType.Event.getValue().equals(scene.event.type)) {
                    return d.getInstance().evaluateData(scene.event.data, map);
                }
                return false;
            }
            return false;
        }
    }

    public boolean triggerEvent(Scene scene, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7259a329", new Object[]{this, scene, hVar})).booleanValue();
        }
        synchronized (this.f24097a) {
            if (this.b != null && b.enableSample(this.b.enableSample)) {
                if (scene != null && scene.event != null && DataType.Begin.getValue().equals(scene.event.type)) {
                    return d.getInstance().evaluateData(scene.event.data, hVar);
                }
                return false;
            }
            return false;
        }
    }

    public List<Scene> getSceneList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7f935cc", new Object[]{this});
        }
        synchronized (this.f24097a) {
            if (this.b != null && b.enableSample(this.b.enableSample)) {
                return this.b.sceneList;
            }
            return null;
        }
    }
}
