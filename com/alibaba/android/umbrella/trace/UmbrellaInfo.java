package com.alibaba.android.umbrella.trace;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class UmbrellaInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> args;
    @JSONField(name = TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName)
    public String childBizName;
    public String featureType;
    public String invokePage;
    public String invokePageUrl;
    @JSONField(name = "bizName")
    public String mainBizName;
    public String samplingRate;
    @JSONField(name = "serviceId")
    public String tagId;
    @JSONField(name = "version")
    public String tagVersion;
    public String umbVersion;

    private UmbrellaInfo() {
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this}) : JSON.toJSONString(this);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f2835a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private Map<String, String> j;

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f2835a = str;
            this.b = str2;
            this.e = str3;
            this.c = str4;
            this.d = str5;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c9ef1c80", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("90fb0381", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c263f1ab", new Object[]{this, map});
            }
            if (map == null) {
                return this;
            }
            if (this.j == null) {
                this.j = new HashMap();
            }
            this.j.putAll(map);
            return this;
        }

        public UmbrellaInfo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UmbrellaInfo) ipChange.ipc$dispatch("d5721653", new Object[]{this});
            }
            UmbrellaInfo umbrellaInfo = new UmbrellaInfo();
            umbrellaInfo.tagId = this.f2835a;
            umbrellaInfo.tagVersion = this.b;
            umbrellaInfo.mainBizName = this.c;
            umbrellaInfo.childBizName = this.d;
            umbrellaInfo.featureType = this.e;
            umbrellaInfo.samplingRate = this.f;
            umbrellaInfo.invokePage = this.g;
            umbrellaInfo.invokePageUrl = this.h;
            umbrellaInfo.args = this.j;
            umbrellaInfo.umbVersion = this.i;
            return umbrellaInfo;
        }
    }
}
