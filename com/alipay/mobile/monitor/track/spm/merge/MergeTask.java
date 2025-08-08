package com.alipay.mobile.monitor.track.spm.merge;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmUtils;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.MergeTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class MergeTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f5767a = Constant.UCID;
    private Behavor.Builder b;
    private int c;
    private int d;
    private String e;

    public MergeTask(MergeTracker mergeTracker) {
        merge(mergeTracker);
    }

    public MergeTask merge(MergeTracker mergeTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MergeTask) ipChange.ipc$dispatch("1bb0a4ed", new Object[]{this, mergeTracker});
        }
        if (mergeTracker == null) {
            return this;
        }
        String str = this.e;
        if (str != null && !str.equals(mergeTracker.getBehavorId())) {
            return this;
        }
        this.e = mergeTracker.getBehavorId();
        Behavor.Builder behavorBuilder = mergeTracker.getBehavorBuilder();
        if (behavorBuilder != null) {
            behavorBuilder.addExtParam("logtime", a());
        }
        if (this.b == null) {
            b(behavorBuilder.build());
        } else {
            a(behavorBuilder.build());
        }
        return this;
    }

    public Behavor.Builder getBehavorBuider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Behavor.Builder) ipChange.ipc$dispatch("9642ac2d", new Object[]{this}) : this.b;
    }

    public boolean needCommit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cdb5b78", new Object[]{this})).booleanValue() : this.c >= MergeUtil.getMergedMaxSize() || this.d >= MergeUtil.getMergedMaxCount();
    }

    private void a(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104c0a3f", new Object[]{this, behavor});
            return;
        }
        String str = this.b.build().getExtParams().get(MergeUtil.KEY_EXPOSED);
        if (StringUtils.isEmpty(str)) {
            b(behavor);
            return;
        }
        Map<String, String> extParams = behavor.getExtParams();
        if (extParams == null) {
            return;
        }
        String a2 = a(extParams.get(MergeUtil.KEY_RID));
        String a3 = a(extParams);
        StringBuilder sb = new StringBuilder("");
        if (str.contains(a2)) {
            String[] split = str.split("__");
            if (split != null && split.length > 0) {
                int i = 0;
                while (true) {
                    if (i >= split.length) {
                        break;
                    } else if (split[i].contains(a2)) {
                        split[i] = split[i] + a3;
                        break;
                    } else {
                        i++;
                    }
                }
                for (String str2 : split) {
                    sb.append(str2);
                    sb.append("__");
                }
            }
        } else {
            sb.append(str);
            sb.append(a2);
            sb.append(a3);
            sb.append("__");
        }
        String sb2 = sb.toString();
        this.b.addExtParam(MergeUtil.KEY_EXPOSED, sb2);
        if (extParams.containsKey(MergeUtil.getMergeBlackList())) {
            this.b.addExtParam(MergeUtil.getMergeBlackList(), extParams.get(MergeUtil.getMergeBlackList()));
        }
        this.c = sb2.getBytes().length;
        this.d++;
    }

    private void b(Behavor behavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2101d700", new Object[]{this, behavor});
            return;
        }
        if (this.b == null) {
            this.b = new Behavor.Builder(Constant.UCID);
            this.b.setSeedID(behavor.getSeedID());
            this.b.setBehaviourPro(behavor.getBehaviourPro()).setPageId(behavor.getPageId()).setLoggerLevel(behavor.getLoggerLevel());
            this.b.setParam1(behavor.getParam1());
            this.b.setParam2(behavor.getParam2());
            this.b.setParam3(behavor.getParam3());
        }
        Map<String, String> extParams = behavor.getExtParams();
        StringBuilder sb = new StringBuilder("");
        if (extParams != null) {
            sb.append(a(extParams.get(MergeUtil.KEY_RID)));
            sb.append(a(extParams));
        }
        sb.append("__");
        String sb2 = sb.toString();
        this.b.addExtParam(MergeUtil.KEY_EXPOSED, sb2);
        if (extParams.containsKey(MergeUtil.getMergeBlackList())) {
            this.b.addExtParam(MergeUtil.getMergeBlackList(), extParams.get(MergeUtil.getMergeBlackList()));
        }
        this.c = sb2.getBytes().length;
        this.d++;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("rid|");
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        sb.append(":");
        return sb.toString();
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (String str : map.keySet()) {
            if (MergeUtil.KEY_EXPOSED.equals(str)) {
                if (SpmUtils.isDebug) {
                    throw new IllegalArgumentException("\"exposed\"是保留字段，扩展参数中key不能使用\"exposed\"");
                }
            } else if (!MergeUtil.KEY_RID.equals(str) && !MergeUtil.getMergeBlackList().equals(str)) {
                sb.append(str);
                sb.append("|");
                sb.append(map.get(str));
                sb.append(";");
            }
        }
        sb.append("&");
        return sb.toString();
    }

    public String getBehavorId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab786e17", new Object[]{this}) : this.e;
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(System.currentTimeMillis()));
    }
}
