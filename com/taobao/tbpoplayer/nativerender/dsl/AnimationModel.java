package com.taobao.tbpoplayer.nativerender.dsl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx_v4.animation.util.b;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class AnimationModel implements INativeModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int costTimes = 0;
    public int curLoopTimes = 0;
    @JSONField(name = "endBehavior")
    public String endBehavior;
    @JSONField(name = e.RECORD_EXECUTE)
    public List<Execute> execute;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "listenTimes")
    public long listenTimes;
    @JSONField(name = "loop")
    public Boolean loop;
    @JSONField(name = "loopTimes")
    public Long loopTimes;
    @JSONField(name = "pivotX")
    public String pivotX;
    @JSONField(name = "pivotY")
    public String pivotY;
    @JSONField(name = "preCondition")
    public ConditionModel preCondition;
    @JSONField(name = "preDelay")
    public long preDelay;
    @JSONField(name = JarvisConstant.KEY_JARVIS_TRIGGER)
    public JSONObject trigger;

    static {
        kge.a(700997643);
        kge.a(310138031);
    }

    @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
    public boolean isValid() {
        List<Execute> list;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : (this.trigger == null || (list = this.execute) == null || list.isEmpty()) ? false : true;
    }

    /* loaded from: classes8.dex */
    public static class Execute implements INativeModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = "duration")
        public long duration;
        @JSONField(name = "object")
        public String object;
        @JSONField(name = TimeCalculator.TIMELINE_TAG)
        public List<TimeLineNode> timeline;
        @JSONField(name = "timelineMode")
        public String timelineMode;

        static {
            kge.a(-1701510212);
            kge.a(310138031);
        }

        @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
        public boolean isValid() {
            List<TimeLineNode> list;
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.object) && (list = this.timeline) != null && !list.isEmpty();
        }
    }

    /* loaded from: classes8.dex */
    public static class TimeLineNode implements INativeModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        @JSONField(name = b.EASING)
        public String easing;
        @JSONField(name = "extra")
        public JSONObject extra;
        @JSONField(name = "fraction")
        public Float fraction;
        @JSONField(name = "value")
        public String value;

        static {
            kge.a(-891954660);
            kge.a(310138031);
        }

        @Override // com.taobao.tbpoplayer.nativerender.dsl.INativeModel
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.value) && this.fraction != null;
        }
    }
}
