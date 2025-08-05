package com.alibaba.poplayer.track.module;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class OnePopModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public OnePopLoseReasonCode T;
    public String Y;
    public String c = null;

    /* renamed from: a  reason: collision with root package name */
    public String f3203a = null;
    public String b = null;
    public String ay = null;
    public String au = null;
    public String av = null;
    public String aw = null;
    public String d = null;
    public String e = null;
    public String ax = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public String i = null;
    public String j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public String n = "false";
    public String o = "false";
    public String p = "false";
    public String q = "false";
    public String r = "false";
    public String s = "false";
    public long t = 0;
    public String u = null;
    public String v = null;
    public String w = null;
    public String x = null;
    public String y = null;
    public String z = null;
    public String A = null;
    public String B = null;
    public String C = null;
    public String D = null;
    public String E = null;
    public String F = null;
    public String G = null;
    public String H = null;
    public String I = null;
    public String J = null;
    public String K = null;
    public String L = null;
    public String M = null;
    public String N = null;
    public String O = null;
    public String P = null;
    public String Q = "0";
    private int as = 0;
    private String at = null;
    public String R = "false";
    public String S = null;
    public String U = null;
    public String V = null;
    public String W = null;
    public String X = null;
    public String Z = null;
    public String aa = null;
    public String ab = null;
    public long ac = 0;
    public long ad = 0;
    public long ae = 0;
    public long af = 0;
    public long ag = 0;
    public long ah = 0;
    public long ai = 0;
    public boolean aj = true;
    public long ak = 0;
    public long al = 0;
    public long am = 0;
    public boolean an = false;
    public JSONObject ao = null;
    public String ap = null;
    public String aq = null;
    public final JSONObject ar = new JSONObject();

    /* loaded from: classes3.dex */
    public enum OnePopLoseReasonCode {
        UCPFilter("UCP检查未通过"),
        ConfigCheckFail("配置检查未通过"),
        LMLifeCycleEnqueue("在队列中持续等待弹出"),
        LMLifeCycleDrop("配置为不入队被丢弃"),
        LMLifeCycleForceDrop("被强制弹出且优先级更高的其他pop移除"),
        LMLifeCycleCheckFail("配置二次检查未通过"),
        CrowdPreCheckCancel("人群预判过程中被页面切换等原因被取消"),
        CrowdPreCheckFail("人群预判失败则关闭"),
        CrowdPreCheckNoPop("人群预判结果为不弹出"),
        MtopPreCheckCancel("Mtop预判过程中被页面切换等原因被取消"),
        MtopPreCheckFail("Mtop预判失败则关闭"),
        MtopPreCheckNoPop("Mtop预判结果为不弹出"),
        OnViewPageSwitchClose("页面切换被关闭"),
        OnViewCustomFilter("pop加载容器自定义过滤"),
        OnViewErrorClose("pop加载容器抛错关闭"),
        OnViewJSClose("页面调用Close接口关闭"),
        other("其他原因");
        
        private String description;

        OnePopLoseReasonCode(String str) {
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }
    }

    static {
        kge.a(1712291240);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[Catch: Throwable -> 0x0105, TryCatch #0 {Throwable -> 0x0105, blocks: (B:6:0x001b, B:8:0x0020, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:18:0x003a, B:20:0x0046, B:22:0x004c, B:24:0x0052, B:26:0x005a, B:27:0x0062, B:29:0x0080, B:31:0x0088, B:32:0x008c, B:35:0x0093, B:37:0x00a3, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:47:0x00bd, B:49:0x00c1, B:51:0x00c5, B:54:0x00ce, B:55:0x00d0, B:57:0x00d4, B:59:0x00dd, B:61:0x00f9, B:9:0x0025), top: B:66:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4 A[Catch: Throwable -> 0x0105, TryCatch #0 {Throwable -> 0x0105, blocks: (B:6:0x001b, B:8:0x0020, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:18:0x003a, B:20:0x0046, B:22:0x004c, B:24:0x0052, B:26:0x005a, B:27:0x0062, B:29:0x0080, B:31:0x0088, B:32:0x008c, B:35:0x0093, B:37:0x00a3, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:47:0x00bd, B:49:0x00c1, B:51:0x00c5, B:54:0x00ce, B:55:0x00d0, B:57:0x00d4, B:59:0x00dd, B:61:0x00f9, B:9:0x0025), top: B:66:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9 A[Catch: Throwable -> 0x0105, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0105, blocks: (B:6:0x001b, B:8:0x0020, B:12:0x002e, B:14:0x0032, B:16:0x0036, B:18:0x003a, B:20:0x0046, B:22:0x004c, B:24:0x0052, B:26:0x005a, B:27:0x0062, B:29:0x0080, B:31:0x0088, B:32:0x008c, B:35:0x0093, B:37:0x00a3, B:40:0x00ac, B:42:0x00b0, B:44:0x00b4, B:47:0x00bd, B:49:0x00c1, B:51:0x00c5, B:54:0x00ce, B:55:0x00d0, B:57:0x00d4, B:59:0x00dd, B:61:0x00f9, B:9:0x0025), top: B:66:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.poplayer.trigger.BaseConfigItem r6, com.alibaba.poplayer.trigger.Event r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.poplayer.track.module.OnePopModule.a(com.alibaba.poplayer.trigger.BaseConfigItem, com.alibaba.poplayer.trigger.Event, java.lang.String):void");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || str.startsWith("poplayer")) {
        } else {
            this.as++;
            this.at = str;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.as;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.at;
    }
}
